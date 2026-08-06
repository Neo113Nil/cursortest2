package io.appmetrica.analytics.impl;

import i1.AbstractC0253j;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import java.util.List;

/* loaded from: classes.dex */
public final class Ub implements PermissionStrategy, LocationControllerObserver {

    /* renamed from: b, reason: collision with root package name */
    public static final Tb f5159b = new Tb();

    /* renamed from: c, reason: collision with root package name */
    public static final List f5160c = AbstractC0253j.B("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f5161a;

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy
    public final boolean forbidUsePermission(String str) {
        if (f5160c.contains(str)) {
            return !this.f5161a;
        }
        return false;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final void startLocationTracking() {
        this.f5161a = true;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final void stopLocationTracking() {
        this.f5161a = false;
    }

    public final String toString() {
        return "LocationFlagStrategy(enabled=" + this.f5161a + ", locationPermissions=" + f5160c + ')';
    }
}
