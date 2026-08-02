package com.squareup.cash.maps.viewmodels;

/* loaded from: classes6.dex */
public final class MapBoundary {
    public final BoundaryLatLng northEast;
    public final BoundaryLatLng southWest;

    public MapBoundary(BoundaryLatLng boundaryLatLng, BoundaryLatLng boundaryLatLng2) {
        this.northEast = boundaryLatLng;
        this.southWest = boundaryLatLng2;
    }

    public final boolean contains(double d, double d2) {
        BoundaryLatLng boundaryLatLng = this.southWest;
        double d3 = boundaryLatLng.lat;
        BoundaryLatLng boundaryLatLng2 = this.northEast;
        if (d > boundaryLatLng2.lat || d3 > d) {
            return false;
        }
        return d2 <= boundaryLatLng2.lng && boundaryLatLng.lng <= d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapBoundary)) {
            return false;
        }
        MapBoundary mapBoundary = (MapBoundary) obj;
        return this.northEast.equals(mapBoundary.northEast) && this.southWest.equals(mapBoundary.southWest);
    }

    public final int hashCode() {
        return this.southWest.hashCode() + (this.northEast.hashCode() * 31);
    }

    public final String toString() {
        return "MapBoundary(northEast=" + this.northEast + ", southWest=" + this.southWest + ")";
    }
}
