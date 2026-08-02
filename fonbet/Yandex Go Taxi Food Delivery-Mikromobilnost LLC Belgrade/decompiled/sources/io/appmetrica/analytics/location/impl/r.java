package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Looper;
import defpackage.a781;
import defpackage.oyr;
import defpackage.zy11;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.locationapi.internal.LocationReceiver;

/* loaded from: classes4.dex */
public final class r extends u implements LocationReceiver {
    public final Looper e;
    public final long f;

    public r(Context context, Looper looper, PermissionResolutionStrategy permissionResolutionStrategy, LocationListener locationListener) {
        super(context, permissionResolutionStrategy, locationListener, "passive");
        this.e = looper;
        this.f = 1000L;
    }

    public static final zy11 a(r rVar, LocationManager locationManager) {
        locationManager.requestLocationUpdates(rVar.d, rVar.f, 0.0f, rVar.c, rVar.e);
        return zy11.a;
    }

    public static final zy11 b(r rVar, LocationManager locationManager) {
        locationManager.removeUpdates(rVar.c);
        return zy11.a;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiver
    public final void startLocationUpdates() {
        if (this.b.hasNecessaryPermissions(this.a)) {
            SystemServiceUtils.accessSystemServiceByNameSafely(this.a, "location", oyr.t(new StringBuilder("request location updates for "), this.d, " provider"), "location manager", new a781(this, 1));
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiver
    public final void stopLocationUpdates() {
        SystemServiceUtils.accessSystemServiceByNameSafely(this.a, "location", "stop location updates for passive provider", "location manager", new a781(this, 0));
    }
}
