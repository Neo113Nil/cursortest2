package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.LocationListener;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper;
import io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class b implements LastKnownLocationExtractor {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7295a;

    /* renamed from: b, reason: collision with root package name */
    public final PermissionResolutionStrategy f7296b;

    /* renamed from: c, reason: collision with root package name */
    public final LocationListener f7297c;

    /* renamed from: d, reason: collision with root package name */
    public final IHandlerExecutor f7298d;

    /* renamed from: e, reason: collision with root package name */
    public final d f7299e = new d();

    public b(Context context, PermissionResolutionStrategy permissionResolutionStrategy, LocationListener locationListener, IHandlerExecutor iHandlerExecutor) {
        this.f7295a = context;
        this.f7296b = permissionResolutionStrategy;
        this.f7297c = locationListener;
        this.f7298d = iHandlerExecutor;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor
    public final void updateLastKnownLocation() {
        IGplLibraryWrapper gplLibraryWrapper;
        if (this.f7296b.hasNecessaryPermissions(this.f7295a)) {
            try {
                d dVar = this.f7299e;
                Context context = this.f7295a;
                LocationListener locationListener = this.f7297c;
                IHandlerExecutor iHandlerExecutor = this.f7298d;
                dVar.getClass();
                if (ReflectionUtils.detectClassExists("com.google.android.gms.location.LocationRequest")) {
                    try {
                        gplLibraryWrapper = new GplLibraryWrapper(context, locationListener, iHandlerExecutor.getLooper(), iHandlerExecutor, TimeUnit.SECONDS.toMillis(1L));
                    } catch (Throwable unused) {
                    }
                    gplLibraryWrapper.updateLastKnownLocation();
                }
                gplLibraryWrapper = new a();
                gplLibraryWrapper.updateLastKnownLocation();
            } catch (Throwable unused2) {
            }
        }
    }
}
