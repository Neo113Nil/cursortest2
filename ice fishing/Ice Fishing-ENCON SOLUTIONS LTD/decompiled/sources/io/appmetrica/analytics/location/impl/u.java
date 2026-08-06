package io.appmetrica.analytics.location.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor;

/* loaded from: classes.dex */
public class u implements LastKnownLocationExtractor {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7343a;

    /* renamed from: b, reason: collision with root package name */
    public final PermissionResolutionStrategy f7344b;

    /* renamed from: c, reason: collision with root package name */
    public final LocationListener f7345c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7346d;

    public u(Context context, PermissionResolutionStrategy permissionResolutionStrategy, LocationListener locationListener, String str) {
        this.f7343a = context;
        this.f7344b = permissionResolutionStrategy;
        this.f7345c = locationListener;
        this.f7346d = str;
    }

    public final Context a() {
        return this.f7343a;
    }

    public final LocationListener b() {
        return this.f7345c;
    }

    public final PermissionResolutionStrategy c() {
        return this.f7344b;
    }

    public final String d() {
        return this.f7346d;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor
    @SuppressLint({"MissingPermission"})
    public final void updateLastKnownLocation() {
        if (this.f7344b.hasNecessaryPermissions(this.f7343a)) {
            Location location = (Location) SystemServiceUtils.accessSystemServiceByNameSafely(this.f7343a, "location", "getting last known location for provider " + this.f7346d, "location manager", new E0.a(2, this));
            if (location != null) {
                this.f7345c.onLocationChanged(location);
            }
        }
    }

    public static final Location a(u uVar, LocationManager locationManager) {
        return locationManager.getLastKnownLocation(uVar.f7346d);
    }
}
