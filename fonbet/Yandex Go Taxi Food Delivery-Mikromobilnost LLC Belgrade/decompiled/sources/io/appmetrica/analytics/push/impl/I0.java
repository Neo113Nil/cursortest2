package io.appmetrica.analytics.push.impl;

import io.appmetrica.analytics.push.location.DetailedLocation;
import io.appmetrica.analytics.push.location.LocationProvider;
import io.appmetrica.analytics.push.location.LocationVerifier;

/* loaded from: classes9.dex */
public final class I0 implements LocationProvider {
    @Override // io.appmetrica.analytics.push.location.LocationProvider
    public final DetailedLocation getLocation(String str, long j, LocationVerifier locationVerifier) {
        return new M().getLocation(str, j, locationVerifier);
    }
}
