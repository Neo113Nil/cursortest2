package com.squareup.cash.maps.viewmodels;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class SearchLocation extends MarkerLocation {
    public final double lat;
    public final double lng;

    public SearchLocation(double d, double d2) {
        super(Double.valueOf(d), Double.valueOf(d2), null, "");
        this.lat = d;
        this.lng = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchLocation)) {
            return false;
        }
        SearchLocation searchLocation = (SearchLocation) obj;
        return Double.compare(this.lat, searchLocation.lat) == 0 && Double.compare(this.lng, searchLocation.lng) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.lng) + (Double.hashCode(this.lat) * 31);
    }

    public final String toString() {
        return NavAction$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m("SearchLocation(lat=", ", lng=", this.lat), this.lng, ")");
    }
}
