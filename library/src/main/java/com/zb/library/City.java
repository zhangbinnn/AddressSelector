package com.zb.library;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

@Table(database = Database.class)
public class City extends BaseModel {
    @PrimaryKey
    public int id;
    @Column
    public int province_id;
    @Column
    public String name;
}