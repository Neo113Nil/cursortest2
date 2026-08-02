package com.fillr.core.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes4.dex */
public class FillrAddressQueryResult implements Serializable {

    @SerializedName("place_id")
    private String placeId = null;

    @SerializedName("formatted_address")
    private String formattedAddress = null;

    @SerializedName("description")
    private String description = null;

    public final String getHumanReadableAddress() {
        String str = this.formattedAddress;
        return (str == null || str.isEmpty()) ? this.description : this.formattedAddress;
    }

    public final String getPlaceId() {
        return this.placeId;
    }
}
