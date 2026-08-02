package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrier;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeOffsetProvider;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.g2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0875g2 implements E1 {
    public final ServiceContext a;
    public final C0872g b;
    public final C0872g c;
    public final L1 e;
    public final ActivationBarrier f;
    public boolean k;
    public final v2 l;
    public long m;
    public volatile ModuleRemoteConfig n;
    public volatile C0856c o;
    public final SystemTimeProvider d = new SystemTimeProvider();
    public final ActivationBarrierCallback g = new com.yandex.passport.sloth.ui.c(19, this);
    public final SystemTimeOffsetProvider h = new SystemTimeOffsetProvider();
    public final long i = 5000;
    public final long j = 10000;

    public C0875g2(@NotNull ServiceContext serviceContext, @NotNull ModulePreferences modulePreferences, @NotNull C0872g c0872g, @NotNull C0872g c0872g2) {
        this.a = serviceContext;
        this.b = c0872g;
        this.c = c0872g2;
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
        C0856c c0856c = this.o;
        if (moduleRemoteConfig != null) {
            M0 m0 = (M0) moduleRemoteConfig.getFeaturesConfig();
            if (c0856c == null || m0 == null) {
                return;
            }
            L1 l1 = this.e;
            ServiceContext serviceContext = this.a;
            C0872g c0872g = this.b;
            C0872g c0872g2 = this.c;
            SdkIdentifiers identifiers = moduleRemoteConfig.getIdentifiers();
            l1.getClass();
            NetworkServiceLocator.INSTANCE.getInstance().getNetworkCore().startTask(l1.a.a(serviceContext, c0872g, c0872g2, new C0855b2(serviceContext.getContext()).load(new C0870f1(identifiers, serviceContext.getSdkEnvironmentProvider(), serviceContext.getPlatformIdentifiers(), new H0(c0856c.a, m0.c, m0.b))), this));
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

    public static final void a(C0875g2 c0875g2) {
        c0875g2.k = true;
        c0875g2.a();
    }

    public final boolean a(C0872g c0872g) {
        C0856c c0856c = this.o;
        C0887k1 c0887k1 = c0856c != null ? c0856c.a : null;
        if (c0887k1 == null) {
            return false;
        }
        if (c0872g.e.get() >= c0887k1.a) {
            return true;
        }
        return this.d.currentTimeMillis() - c0872g.f.get() > c0887k1.c;
    }

    public final void a(@NotNull ModuleRemoteConfig<M0> moduleRemoteConfig) {
        this.n = moduleRemoteConfig;
    }

    public final void a(@NotNull C0856c c0856c) {
        this.o = c0856c;
        b();
    }
}
