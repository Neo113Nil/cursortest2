package io.appmetrica.analytics.locationinternal.impl;

import com.connectsdk.discovery.provider.ssdp.SSDPDeviceDescriptionParser;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.o0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0898o0 implements J0, LocationControllerObserver {
    public final IHandlerExecutor a;
    public final N b;
    public final C0875g2 c;
    public final C0901p0 d;
    public final C0901p0 e;

    public C0898o0(@NotNull ServiceContext serviceContext, @NotNull String str) {
        this.a = serviceContext.getExecutorProvider().getModuleExecutor();
        C0872g c0872g = new C0872g(serviceContext.getServiceStorageProvider().getDbStorage(), serviceContext.getServiceStorageProvider().modulePreferences(str), "l_dat", "loc_id");
        C0872g c0872g2 = new C0872g(serviceContext.getServiceStorageProvider().getDbStorage(), serviceContext.getServiceStorageProvider().modulePreferences(str), "lbs_dat", "lbs_id");
        ModulePreferences modulePreferences = serviceContext.getServiceStorageProvider().modulePreferences(str);
        C0865e0 c0865e0 = new C0865e0(serviceContext.getContext());
        ChargeTypeProvider chargeTypeProvider = serviceContext.getChargeTypeProvider();
        SystemTimeProvider systemTimeProvider = new SystemTimeProvider();
        N n = new N(c0872g, c0872g2);
        this.b = n;
        C0875g2 c0875g2 = new C0875g2(serviceContext, modulePreferences, c0872g, c0872g2);
        this.c = c0875g2;
        C0931z1 c0931z1 = new C0931z1(c0872g, c0865e0, chargeTypeProvider, serviceContext.getApplicationStateProvider(), systemTimeProvider);
        C0930z0 c0930z0 = new C0930z0(c0872g2, c0865e0, chargeTypeProvider, serviceContext.getApplicationStateProvider(), systemTimeProvider);
        this.d = new C0901p0(c0931z1, c0875g2, n, SSDPDeviceDescriptionParser.TAG_LOCATION);
        this.e = new C0901p0(c0930z0, c0875g2, n, "lbs");
    }

    public static final void a(C0898o0 c0898o0, C0856c c0856c) {
        C0875g2 c0875g2 = c0898o0.c;
        c0875g2.o = c0856c;
        c0875g2.b();
        c0898o0.b.c = c0856c.a;
    }

    @NotNull
    public final C0901p0 b() {
        return this.e;
    }

    @NotNull
    public final C0901p0 c() {
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
    public final void a(@NotNull C0856c c0856c) {
        this.a.execute(new com.yandex.passport.internal.interaction.c(14, this, c0856c));
    }

    public final void a(@NotNull ModuleRemoteConfig<M0> moduleRemoteConfig) {
        this.a.execute(new com.yandex.passport.internal.interaction.c(15, this, moduleRemoteConfig));
    }

    public static final void a(C0898o0 c0898o0, ModuleRemoteConfig moduleRemoteConfig) {
        c0898o0.c.n = moduleRemoteConfig;
    }
}
