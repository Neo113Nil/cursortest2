package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Looper;
import h1.C0239i;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.locationapi.internal.LocationReceiver;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class r extends u implements LocationReceiver {

    /* renamed from: e, reason: collision with root package name */
    public final Looper f7336e;

    /* renamed from: f, reason: collision with root package name */
    public final long f7337f;

    public r(Context context, Looper looper, PermissionResolutionStrategy permissionResolutionStrategy, LocationListener locationListener) {
        super(context, permissionResolutionStrategy, locationListener, "passive");
        this.f7336e = looper;
        this.f7337f = TimeUnit.SECONDS.toMillis(1L);
    }

    public static final C0239i a(r rVar, LocationManager locationManager) {
        locationManager.requestLocationUpdates(rVar.f7346d, rVar.f7337f, 0.0f, rVar.f7345c, rVar.f7336e);
        return C0239i.f3393a;
    }

    public static final C0239i b(r rVar, LocationManager locationManager) {
        locationManager.removeUpdates(rVar.f7345c);
        return C0239i.f3393a;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiver
    public final void startLocationUpdates() {
        if (this.f7344b.hasNecessaryPermissions(this.f7343a)) {
            SystemServiceUtils.accessSystemServiceByNameSafely(this.f7343a, "location", C1.a.k(new StringBuilder("request location updates for "), this.f7346d, " provider"), "location manager", new M0.a(this, 1));
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiver
    public final void stopLocationUpdates() {
        SystemServiceUtils.accessSystemServiceByNameSafely(this.f7343a, "location", "stop location updates for passive provider", "location manager", new M0.a(this, 0));
    }
}
