package com.squareup.cash.maps.viewmodels;

/* loaded from: classes6.dex */
public final class LatLngBounds {
    public final LatLng northeast;
    public final LatLng southwest;

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        this.northeast = latLng;
        this.southwest = latLng2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.northeast.equals(latLngBounds.northeast) && this.southwest.equals(latLngBounds.southwest);
    }

    public final int hashCode() {
        return this.southwest.hashCode() + (this.northeast.hashCode() * 31);
    }

    public final String toString() {
        return "LatLngBounds(northeast=" + this.northeast + ", southwest=" + this.southwest + ")";
    }
}
