package io.appmetrica.analytics.locationinternal.impl;

import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import io.appmetrica.analytics.locationinternal.internal.config.LocationConfig;
import io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class G1 implements RemoteConfigUpdateListener, E1, LocationControllerObserver {
    public final ServiceContext a;
    public ModuleRemoteConfig b;
    public final LocationServiceApi c;
    public final C0973o0 d;
    public final A2 e;
    public final n2 f;
    public final C1002y0 g;
    public final C0976p0 h;
    public final C0931b1 i;
    public final C0928a2 j;
    public final C1 k;
    public final ArrayList l;
    public final C0953h1 m;
    public final v2 n;

    public G1(String str, ServiceContext serviceContext, ModuleRemoteConfig<LocationConfig> moduleRemoteConfig) {
        this.a = serviceContext;
        this.b = moduleRemoteConfig;
        LocationServiceApi locationServiceApi = serviceContext.getLocationServiceApi();
        this.c = locationServiceApi;
        C0973o0 c0973o0 = new C0973o0(serviceContext, str);
        this.d = c0973o0;
        A2 a2 = new A2(serviceContext);
        this.e = a2;
        n2 n2Var = new n2(serviceContext);
        this.f = n2Var;
        this.g = new C1002y0(serviceContext, a2, n2Var, c0973o0);
        this.h = c0973o0.c();
        this.i = new C0931b1(serviceContext.getChargeTypeProvider(), serviceContext.getApplicationStateProvider(), (LocationConfig) this.b.getFeaturesConfig());
        this.j = new C0928a2();
        this.k = new C1(serviceContext);
        this.l = new ArrayList();
        this.m = new C0953h1(locationServiceApi);
        this.n = new v2(serviceContext.getExecutorProvider().getModuleExecutor(), this, 0);
    }

    public final C0950g1 a(String str) {
        LocationConfig locationConfig = (LocationConfig) this.b.getFeaturesConfig();
        E0 e0 = new E0(locationConfig != null ? locationConfig.getThrottlingConfig() : null);
        this.l.add(e0);
        return new C0950g1(new C0946f0(this.e, this.f, this.a.getChargeTypeProvider(), this.a.getApplicationStateProvider(), e0), str);
    }

    @Override // io.appmetrica.analytics.locationinternal.impl.E1
    public final void b() {
        this.a.getLocationServiceApi().getSystemLocation();
    }

    public final C1 c() {
        return this.k;
    }

    public final C0928a2 d() {
        return this.j;
    }

    public final void e() {
        C0931b1 c0931b1 = this.i;
        synchronized (c0931b1) {
            c0931b1.a.registerChargeTypeListener(c0931b1);
            c0931b1.b.registerStickyObserver(c0931b1);
        }
        this.i.a(this.m);
        this.i.a(this.e);
        this.i.a(this.f);
        this.i.a(this.j);
        this.i.a(this.k);
        this.i.a(this.d);
        this.i.a(this.g);
        this.c.registerControllerObserver(this.g);
        this.c.registerControllerObserver(this.d);
        this.c.registerControllerObserver(this);
        this.d.a(this.b);
        LocationConfig locationConfig = (LocationConfig) this.b.getFeaturesConfig();
        if (locationConfig != null) {
            this.i.a(locationConfig);
        }
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener
    public final void onRemoteConfigUpdated(ModuleRemoteConfig<LocationConfig> moduleRemoteConfig) {
        this.b = moduleRemoteConfig;
        this.d.a(moduleRemoteConfig);
        LocationConfig featuresConfig = moduleRemoteConfig.getFeaturesConfig();
        if (featuresConfig != null) {
            C0931b1 c0931b1 = this.i;
            synchronized (c0931b1) {
                c0931b1.c = featuresConfig.getConditionalArgumentsList$location_yandex_release();
                c0931b1.b();
            }
            for (E0 e0 : this.l) {
                e0.b.a(featuresConfig.getThrottlingConfig());
                e0.c.getClass();
            }
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final void startLocationTracking() {
        this.n.d();
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final void stopLocationTracking() {
        this.n.e();
    }

    public final Consumer<Location> a() {
        return this.h;
    }
}
