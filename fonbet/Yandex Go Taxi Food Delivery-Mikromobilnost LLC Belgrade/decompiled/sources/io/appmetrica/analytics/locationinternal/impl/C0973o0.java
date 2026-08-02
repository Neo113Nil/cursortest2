package io.appmetrica.analytics.locationinternal.impl;

import defpackage.bsq0;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import io.appmetrica.analytics.locationinternal.internal.config.LocationConfig;
import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.o0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0973o0 implements J0, LocationControllerObserver {
    public final IHandlerExecutor a;
    public final N b;
    public final g2 c;
    public final C0976p0 d;
    public final C0976p0 e;

    public C0973o0(ServiceContext serviceContext, String str) {
        this.a = serviceContext.getExecutorProvider().getModuleExecutor();
        C0948g c0948g = new C0948g(serviceContext.getServiceStorageProvider().getDbStorage(), serviceContext.getServiceStorageProvider().modulePreferences(str), "l_dat", "loc_id");
        C0948g c0948g2 = new C0948g(serviceContext.getServiceStorageProvider().getDbStorage(), serviceContext.getServiceStorageProvider().modulePreferences(str), "lbs_dat", "lbs_id");
        ModulePreferences modulePreferences = serviceContext.getServiceStorageProvider().modulePreferences(str);
        C0942e0 c0942e0 = new C0942e0(serviceContext.getContext());
        ChargeTypeProvider chargeTypeProvider = serviceContext.getChargeTypeProvider();
        SystemTimeProvider systemTimeProvider = new SystemTimeProvider();
        N n = new N(c0948g, c0948g2);
        this.b = n;
        g2 g2Var = new g2(serviceContext, modulePreferences, c0948g, c0948g2);
        this.c = g2Var;
        C1006z1 c1006z1 = new C1006z1(c0948g, c0942e0, chargeTypeProvider, serviceContext.getApplicationStateProvider(), systemTimeProvider);
        C1005z0 c1005z0 = new C1005z0(c0948g2, c0942e0, chargeTypeProvider, serviceContext.getApplicationStateProvider(), systemTimeProvider);
        this.d = new C0976p0(c1006z1, g2Var, n, "location");
        this.e = new C0976p0(c1005z0, g2Var, n, "lbs");
    }

    public static final void a(C0973o0 c0973o0, C0933c c0933c) {
        g2 g2Var = c0973o0.c;
        g2Var.o = c0933c;
        g2Var.b();
        c0973o0.b.c = c0933c.a;
    }

    public final C0976p0 b() {
        return this.e;
    }

    public final C0976p0 c() {
        return this.d;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final void startLocationTracking() {
        this.c.l.d();
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final void stopLocationTracking() {
        this.c.l.e();
    }

    @Override // io.appmetrica.analytics.locationinternal.impl.J0
    public final void a(C0933c c0933c) {
        this.a.execute(new bsq0(12, this, c0933c));
    }

    public final void a(ModuleRemoteConfig<LocationConfig> moduleRemoteConfig) {
        this.a.execute(new bsq0(13, this, moduleRemoteConfig));
    }

    public static final void a(C0973o0 c0973o0, ModuleRemoteConfig moduleRemoteConfig) {
        c0973o0.c.n = moduleRemoteConfig;
    }
}
