package io.appmetrica.analytics.locationinternal.impl;

import defpackage.t6f0;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrier;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeOffsetProvider;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.locationinternal.internal.config.LocationConfig;
import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public final class g2 implements E1 {
    public final ServiceContext a;
    public final C0948g b;
    public final C0948g c;
    public final L1 e;
    public final ActivationBarrier f;
    public boolean k;
    public final v2 l;
    public long m;
    public volatile ModuleRemoteConfig n;
    public volatile C0933c o;
    public final SystemTimeProvider d = new SystemTimeProvider();
    public final ActivationBarrierCallback g = new t6f0(15, this);
    public final SystemTimeOffsetProvider h = new SystemTimeOffsetProvider();
    public final long i = 5000;
    public final long j = 10000;

    public g2(ServiceContext serviceContext, ModulePreferences modulePreferences, C0948g c0948g, C0948g c0948g2) {
        this.a = serviceContext;
        this.b = c0948g;
        this.c = c0948g2;
        this.e = new L1(modulePreferences);
        this.f = serviceContext.getActivationBarrier();
        this.l = new v2(serviceContext.getExecutorProvider().getModuleExecutor(), this, 0);
    }

    public final void a() {
        if (this.h.elapsedRealtimeOffset(this.m, TimeUnit.MILLISECONDS) < this.i) {
            return;
        }
        this.m = this.d.elapsedRealtime();
        ModuleRemoteConfig moduleRemoteConfig = this.n;
        C0933c c0933c = this.o;
        if (moduleRemoteConfig != null) {
            LocationConfig locationConfig = (LocationConfig) moduleRemoteConfig.getFeaturesConfig();
            if (c0933c == null || locationConfig == null) {
                return;
            }
            L1 l1 = this.e;
            ServiceContext serviceContext = this.a;
            C0948g c0948g = this.b;
            C0948g c0948g2 = this.c;
            SdkIdentifiers identifiers = moduleRemoteConfig.getIdentifiers();
            l1.getClass();
            NetworkServiceLocator.INSTANCE.getInstance().getNetworkCore().startTask(l1.a.a(serviceContext, c0948g, c0948g2, new C0932b2(serviceContext.getContext()).load(new C0947f1(identifiers, serviceContext.getSdkEnvironmentProvider(), serviceContext.getPlatformIdentifiers(), new H0(c0933c.a, locationConfig.getHosts$location_yandex_release(), locationConfig.getRetryPolicyConfig()))), this));
        }
    }

    @Override // io.appmetrica.analytics.locationinternal.impl.E1
    public final void b() {
        this.l.c();
        boolean a = a(this.b);
        boolean a2 = a(this.c);
        if (a || a2) {
            if (this.k) {
                a();
            } else {
                this.f.subscribe(this.j, this.a.getExecutorProvider().getModuleExecutor(), this.g);
            }
        }
    }

    public final void c() {
        this.l.d();
    }

    public final void d() {
        this.l.e();
    }

    public static final void a(g2 g2Var) {
        g2Var.k = true;
        g2Var.a();
    }

    public final boolean a(C0948g c0948g) {
        C0933c c0933c = this.o;
        C0962k1 c0962k1 = c0933c != null ? c0933c.a : null;
        if (c0962k1 == null) {
            return false;
        }
        if (c0948g.e.get() >= c0962k1.a) {
            return true;
        }
        return this.d.currentTimeMillis() - c0948g.f.get() > c0962k1.c;
    }

    public final void a(ModuleRemoteConfig<LocationConfig> moduleRemoteConfig) {
        this.n = moduleRemoteConfig;
    }

    public final void a(C0933c c0933c) {
        this.o = c0933c;
        b();
    }
}
