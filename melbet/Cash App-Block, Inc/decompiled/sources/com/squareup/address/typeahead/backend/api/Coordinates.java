package com.squareup.address.typeahead.backend.api;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;

/* loaded from: classes5.dex */
public final class Coordinates {
    public final double latitude;
    public final double longitude;

    public Coordinates(double d, double d2) {
        this.latitude = d;
        this.longitude = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Coordinates)) {
            return false;
        }
        Coordinates coordinates = (Coordinates) obj;
        return Double.compare(this.latitude, coordinates.latitude) == 0 && Double.compare(this.longitude, coordinates.longitude) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.longitude) + (Double.hashCode(this.latitude) * 31);
    }

    public final String toString() {
        return NavAction$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m("Coordinates(latitude=", ", longitude=", this.latitude), this.longitude, ")");
    }
}
