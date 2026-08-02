package com.fillr.core.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class FillrAddressComponent implements Serializable {

    @SerializedName("long_name")
    private String mLongName = null;

    @SerializedName("short_name")
    private String mShortName = null;

    @SerializedName("types")
    private List<String> mTypes = new ArrayList();

    public final String getLongName() {
        return this.mLongName;
    }

    public final List getTypes() {
        return this.mTypes;
    }
}
