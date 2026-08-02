package com.squareup.cash.maps.viewmodels;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class BoundaryLatLng {
    public final double lat;
    public final double lng;

    public BoundaryLatLng(double d, double d2) {
        this.lat = d;
        this.lng = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoundaryLatLng)) {
            return false;
        }
        BoundaryLatLng boundaryLatLng = (BoundaryLatLng) obj;
        return Double.compare(this.lat, boundaryLatLng.lat) == 0 && Double.compare(this.lng, boundaryLatLng.lng) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.lng) + (Double.hashCode(this.lat) * 31);
    }

    public final String toString() {
        return NavAction$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m("BoundaryLatLng(lat=", ", lng=", this.lat), this.lng, ")");
    }
}
