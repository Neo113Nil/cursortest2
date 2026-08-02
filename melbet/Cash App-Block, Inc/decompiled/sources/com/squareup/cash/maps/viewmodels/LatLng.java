package com.squareup.cash.maps.viewmodels;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class LatLng {
    public final double lat;
    public final double lng;

    public LatLng(double d, double d2) {
        this.lat = d;
        this.lng = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        return Double.compare(this.lat, latLng.lat) == 0 && Double.compare(this.lng, latLng.lng) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.lng) + (Double.hashCode(this.lat) * 31);
    }

    public final String toString() {
        return NavAction$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m("LatLng(lat=", ", lng=", this.lat), this.lng, ")");
    }
}
