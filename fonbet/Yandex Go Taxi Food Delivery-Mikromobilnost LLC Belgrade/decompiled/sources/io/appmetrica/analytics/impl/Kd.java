package io.appmetrica.analytics.impl;

import defpackage.scc;
import defpackage.unr0;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import java.util.List;

/* loaded from: classes9.dex */
public final class Kd implements PermissionStrategy, LocationControllerObserver {
    public static final Jd b = new Jd();
    public static final List c = scc.g("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");
    public volatile boolean a;

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy
    public final boolean forbidUsePermission(String str) {
        if (c.contains(str)) {
            return !this.a;
        }
        return false;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final void startLocationTracking() {
        this.a = true;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final void stopLocationTracking() {
        this.a = false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocationFlagStrategy(enabled=");
        sb.append(this.a);
        sb.append(", locationPermissions=");
        return unr0.t(sb, c, ')');
    }
}
