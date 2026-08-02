package io.appmetrica.analytics.push.impl;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import defpackage.qke;
import io.appmetrica.analytics.push.location.DetailedLocation;
import io.appmetrica.analytics.push.location.LocationProvider;
import io.appmetrica.analytics.push.location.LocationStatus;
import io.appmetrica.analytics.push.location.LocationVerifier;
import io.appmetrica.analytics.push.logger.internal.PublicLogger;
import java.util.List;

/* loaded from: classes4.dex */
public final class X0 implements LocationProvider {
    public final Context a;

    public X0(Context context) {
        this.a = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0070, code lost:
    
        if (defpackage.qke.h(r2, "android.permission.ACCESS_COARSE_LOCATION") == 0) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003e A[ADDED_TO_REGION, SYNTHETIC] */
    @Override // io.appmetrica.analytics.push.location.LocationProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final DetailedLocation getLocation(String str, long j, LocationVerifier locationVerifier) {
        LocationManager locationManager;
        Location location;
        Context context;
        PublicLogger publicLogger = PublicLogger.INSTANCE;
        publicLogger.info("Trying get last known location", new Object[0]);
        try {
            locationManager = (LocationManager) this.a.getSystemService("location");
        } catch (Throwable th) {
            PublicLogger.INSTANCE.error(th, "Failed to get location manager", new Object[0]);
            locationManager = null;
        }
        if (locationManager == null) {
            publicLogger.info("LocationManager is null", new Object[0]);
            return new DetailedLocation(null, new LocationStatus.LocationManagerIsNull());
        }
        for (String str2 : locationManager.getProviders(true)) {
            try {
                context = this.a;
            } catch (Throwable th2) {
                PublicLogger.INSTANCE.error(th2, "Failed to get last known location", new Object[0]);
            }
            if (str2 == null) {
                List list = J1.a;
            } else if (J1.a.contains(str2)) {
                if (qke.h(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                    location = locationManager.getLastKnownLocation(str2);
                    if (location != null && locationVerifier.verifyLocation(location).isSuccess()) {
                        return new DetailedLocation(location, new LocationStatus.Success());
                    }
                }
                location = null;
                if (location != null) {
                }
            }
            if (qke.h(context, "android.permission.ACCESS_FINE_LOCATION") != 0) {
            }
            location = locationManager.getLastKnownLocation(str2);
            if (location != null) {
            }
        }
        return new DetailedLocation(null, new LocationStatus.LocationProviderReturnedNull("LastKnownLocationProvider"));
    }
}
