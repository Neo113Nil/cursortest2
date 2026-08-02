package com.squareup.cash.maps.viewmodels;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class LocationViewModel {
    public static final LocationViewModel DEFAULT_LOCATION_VIEW_MODEL = new LocationViewModel(39.8097343d, -98.5556199d, 3.5f);
    public final double lat;
    public final double lng;
    public final float zoom;

    public LocationViewModel(double d, double d2, float f) {
        this.lat = d;
        this.lng = d2;
        this.zoom = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationViewModel)) {
            return false;
        }
        LocationViewModel locationViewModel = (LocationViewModel) obj;
        return Double.compare(this.lat, locationViewModel.lat) == 0 && Double.compare(this.lng, locationViewModel.lng) == 0 && Float.compare(this.zoom, locationViewModel.zoom) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.zoom) + Fragment$5$$ExternalSyntheticOutline0.m(this.lng, Double.hashCode(this.lat) * 31, 31);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("LocationViewModel(lat=", ", lng=", this.lat);
        m.append(this.lng);
        m.append(", zoom=");
        m.append(this.zoom);
        m.append(")");
        return m.toString();
    }
}
