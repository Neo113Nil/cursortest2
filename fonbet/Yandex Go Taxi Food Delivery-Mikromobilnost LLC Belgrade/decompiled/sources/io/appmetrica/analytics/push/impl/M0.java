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
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class M0 implements LocationProvider {
    public final Context a;
    public L0 b = null;

    public M0(Context context) {
        this.a = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0030, code lost:
    
        if (defpackage.qke.h(r1, "android.permission.ACCESS_COARSE_LOCATION") == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (defpackage.qke.h(r1, "android.permission.ACCESS_FINE_LOCATION") == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x009f, code lost:
    
        r0.info("Location permissions is not granted for %s", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00b2, code lost:
    
        return new io.appmetrica.analytics.push.location.DetailedLocation(null, new io.appmetrica.analytics.push.location.LocationStatus.PermissionIsNotGranted(r8));
     */
    @Override // io.appmetrica.analytics.push.location.LocationProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final DetailedLocation getLocation(String str, long j, LocationVerifier locationVerifier) {
        LocationManager locationManager;
        PublicLogger publicLogger = PublicLogger.INSTANCE;
        publicLogger.info("Trying request new location from %s provider", str);
        Context context = this.a;
        if (str == null) {
            List list = J1.a;
        } else if (J1.a.contains(str)) {
        }
        if (qke.h(context, "android.permission.ACCESS_FINE_LOCATION") != 0) {
        }
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
        new n2(new K0(this, locationManager, locationVerifier, str), G0.b().a()).a(j, TimeUnit.SECONDS);
        L0 l0 = this.b;
        Location location = l0 != null ? l0.c : null;
        L0 l02 = this.b;
        if (l02 != null) {
            locationManager.removeUpdates(l02);
        }
        this.b = null;
        return location != null ? new DetailedLocation(location, new LocationStatus.Success()) : new DetailedLocation(null, new LocationStatus.LocationProviderReturnedNull("ForceScanLocationProvider"));
    }
}
