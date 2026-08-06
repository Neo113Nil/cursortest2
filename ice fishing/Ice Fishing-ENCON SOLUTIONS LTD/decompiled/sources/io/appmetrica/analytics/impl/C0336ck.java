package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreapi.internal.crypto.CryptoProvider;
import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrier;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionConditionService;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentLifecycle;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider;
import io.appmetrica.analytics.coreapi.internal.system.ActiveNetworkTypeProvider;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider;
import io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter;
import io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock;

/* renamed from: io.appmetrica.analytics.impl.ck, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0336ck implements ServiceContext {

    /* renamed from: a, reason: collision with root package name */
    public final ModuleServiceLifecycleController f5758a;

    /* renamed from: b, reason: collision with root package name */
    public final Sd f5759b = new Sd(getContext());

    /* renamed from: c, reason: collision with root package name */
    public final Zc f5760c = new Zc();

    /* renamed from: d, reason: collision with root package name */
    public final Ck f5761d = new Ck(getContext(), new Bk(new M1()));

    /* renamed from: e, reason: collision with root package name */
    public final C0931zk f5762e = new C0931zk(getContext(), C0610na.k().y(), C0610na.k().B().f(getContext()));

    /* renamed from: f, reason: collision with root package name */
    public final C0894y9 f5763f = new C0894y9();

    /* renamed from: g, reason: collision with root package name */
    public final C0658p6 f5764g = new C0658p6();

    public C0336ck(ModuleServiceLifecycleController moduleServiceLifecycleController) {
        this.f5758a = moduleServiceLifecycleController;
    }

    public final Sd a() {
        return this.f5759b;
    }

    public final Zc b() {
        return this.f5760c;
    }

    public final C0931zk c() {
        return this.f5762e;
    }

    public final Ck d() {
        return this.f5761d;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ActivationBarrier getActivationBarrier() {
        return C0610na.f6575I.f6577B.getActivationBarrier();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ActiveNetworkTypeProvider getActiveNetworkTypeProvider() {
        return C0610na.f6575I.G;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ApplicationStateProvider getApplicationStateProvider() {
        return C0610na.f6575I.l().f4379b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ChargeTypeProvider getChargeTypeProvider() {
        C0610na c0610na = C0610na.f6575I;
        R2 r2 = c0610na.f6587e;
        if (r2 == null) {
            synchronized (c0610na) {
                try {
                    r2 = c0610na.f6587e;
                    if (r2 == null) {
                        r2 = new R2(c0610na.f6586d.a(), c0610na.l().f4378a);
                        c0610na.f6587e = r2;
                    }
                } finally {
                }
            }
        }
        return r2;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final Context getContext() {
        return C0610na.f6575I.f6583a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final CryptoProvider getCryptoProvider() {
        return this.f5764g;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final DataSendingRestrictionController getDataSendingRestrictionController() {
        return C0610na.f6575I.h();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ExecutorProvider getExecutorProvider() {
        return this.f5763f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final FirstExecutionConditionService getFirstExecutionConditionService() {
        return C0610na.f6575I.f6577B.getFirstExecutionService();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final LocationServiceApi getLocationServiceApi() {
        return C0610na.f6575I.m();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ModuleServiceLifecycleController getModuleServiceLifecycleController() {
        return this.f5758a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ServiceNetworkContext getNetworkContext() {
        return this.f5759b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final PermissionExtractor getPermissionExtractor() {
        return C0610na.f6575I.j();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final PlatformIdentifiers getPlatformIdentifiers() {
        return C0610na.f6575I.s();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final SdkEnvironmentProvider getSdkEnvironmentProvider() {
        return C0610na.f6575I.v();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ModuleSelfReporter getSelfReporter() {
        return this.f5760c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ServiceModuleReporterComponentLifecycle getServiceModuleReporterComponentLifecycle() {
        return C0610na.f6575I.f6581F;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ServiceStorageProvider getServiceStorageProvider() {
        return this.f5762e;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ServiceWakeLock getServiceWakeLock() {
        return this.f5761d;
    }
}
