package com.squareup.cash.deposits.physical.viewmodels.map;

import com.squareup.cash.maps.viewmodels.MarkerLocation;
import com.squareup.protos.cash.moneymap.app.GetRetailerLocationsResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AtmMarkerLocation extends MarkerLocation {
    public final GetRetailerLocationsResponse.RetailerLocation retailerLocation;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AtmMarkerLocation(GetRetailerLocationsResponse.RetailerLocation retailerLocation) {
        super(retailerLocation.latitude, retailerLocation.longitude, r0, r1);
        retailerLocation.getClass();
        String str = retailerLocation.retailer_location_token;
        String str2 = retailerLocation.retailer_name;
        str2.getClass();
        this.retailerLocation = retailerLocation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AtmMarkerLocation) && Intrinsics.areEqual(this.retailerLocation, ((AtmMarkerLocation) obj).retailerLocation);
    }

    public final int hashCode() {
        return this.retailerLocation.hashCode();
    }

    public final String toString() {
        return "AtmMarkerLocation(retailerLocation=" + this.retailerLocation + ")";
    }
}
