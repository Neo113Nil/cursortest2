package io.appmetrica.analytics.push.location;

import android.location.Location;

/* loaded from: classes4.dex */
public class DetailedLocation {
    private final Location a;
    private final LocationStatus b;

    public DetailedLocation(Location location, LocationStatus locationStatus) {
        this.a = location;
        this.b = locationStatus;
    }

    public Location getLocation() {
        return this.a;
    }

    public LocationStatus getLocationStatus() {
        return this.b;
    }
}
