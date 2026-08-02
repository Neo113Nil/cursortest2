package com.squareup.cash.deposits.physical.view.map;

import com.squareup.cash.maps.viewmodels.MarkerLocation;
import com.squareup.protos.cash.papermate.app.GetRetailerLocationsResponse;

/* loaded from: classes6.dex */
public final class PmdMarkerLocation extends MarkerLocation {
    public final GetRetailerLocationsResponse.RetailerLocation retailerLocation;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PmdMarkerLocation(GetRetailerLocationsResponse.RetailerLocation retailerLocation) {
        super(retailerLocation.latitude, retailerLocation.longitude, r0, r1);
        retailerLocation.getClass();
        String str = retailerLocation.retailer_location_token;
        String str2 = retailerLocation.retailer_name;
        str2.getClass();
        this.retailerLocation = retailerLocation;
    }
}
