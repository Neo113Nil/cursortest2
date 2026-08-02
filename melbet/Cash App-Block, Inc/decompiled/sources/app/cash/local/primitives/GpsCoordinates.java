package app.cash.local.primitives;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class GpsCoordinates {
    public final double latitude;
    public final double longitude;

    public GpsCoordinates(double d, double d2) {
        this.latitude = d;
        this.longitude = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GpsCoordinates)) {
            return false;
        }
        GpsCoordinates gpsCoordinates = (GpsCoordinates) obj;
        return Double.compare(this.latitude, gpsCoordinates.latitude) == 0 && Double.compare(this.longitude, gpsCoordinates.longitude) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.longitude) + (Double.hashCode(this.latitude) * 31);
    }

    public final String toString() {
        return NavAction$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m("GpsCoordinates(latitude=", ", longitude=", this.latitude), this.longitude, ")");
    }
}
