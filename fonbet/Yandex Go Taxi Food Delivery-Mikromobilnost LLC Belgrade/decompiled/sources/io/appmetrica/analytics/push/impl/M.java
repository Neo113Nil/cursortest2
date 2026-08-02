package io.appmetrica.analytics.push.impl;

import android.location.Location;
import io.appmetrica.analytics.push.location.DetailedLocation;
import io.appmetrica.analytics.push.location.LocationProvider;
import io.appmetrica.analytics.push.location.LocationStatus;
import io.appmetrica.analytics.push.location.LocationVerifier;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class M implements LocationProvider {
    public volatile DetailedLocation a;

    @Override // io.appmetrica.analytics.push.location.LocationProvider
    public final DetailedLocation getLocation(String str, long j, LocationVerifier locationVerifier) {
        LocationProvider locationProvider = AbstractC1021d1.a;
        if (locationProvider == null) {
            return new DetailedLocation(null, new LocationStatus.CustomLocationProviderIsNull());
        }
        new n2(new L(this, locationProvider, str, j, locationVerifier), G0.b().a()).a(j, TimeUnit.SECONDS);
        DetailedLocation detailedLocation = this.a;
        if (detailedLocation == null) {
            return new DetailedLocation(null, new LocationStatus.ExpiredByTimeout());
        }
        if (!detailedLocation.getLocationStatus().isSuccess()) {
            return detailedLocation;
        }
        Location location = detailedLocation.getLocation();
        if (location == null) {
            return new DetailedLocation(null, new LocationStatus.LocationProviderReturnedNull("CustomLocationProvider"));
        }
        LocationStatus verifyLocation = locationVerifier.verifyLocation(location);
        return !verifyLocation.isSuccess() ? new DetailedLocation(null, verifyLocation) : detailedLocation;
    }
}
