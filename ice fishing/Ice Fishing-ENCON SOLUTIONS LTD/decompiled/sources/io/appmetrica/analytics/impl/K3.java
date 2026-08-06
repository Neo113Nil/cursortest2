package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleRegistry;
import io.appmetrica.analytics.modulesapi.internal.client.ClientStorageProvider;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientActivator;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientExecutorProvider;
import io.appmetrica.analytics.modulesapi.internal.client.ProcessDetector;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext;
import io.appmetrica.analytics.modulesapi.internal.common.InternalClientModuleFacade;

/* loaded from: classes.dex */
public final class K3 implements H5 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4615a;

    /* renamed from: b, reason: collision with root package name */
    public final K5 f4616b = new K5(new C0476i5());

    /* renamed from: c, reason: collision with root package name */
    public final C0346d4 f4617c = new C0346d4(C0294b4.l().b(getContext()));

    /* renamed from: d, reason: collision with root package name */
    public final C0275ab f4618d = new C0275ab();

    /* renamed from: e, reason: collision with root package name */
    public final C0625o f4619e = C0294b4.l().a();

    /* renamed from: f, reason: collision with root package name */
    public final I3 f4620f = new I3();

    /* renamed from: g, reason: collision with root package name */
    public final Qc f4621g = new Qc();

    /* renamed from: h, reason: collision with root package name */
    public final J3 f4622h = new J3();

    public K3(Context context) {
        this.f4615a = context;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final ActivityLifecycleRegistry getActivityLifecycleRegistry() {
        return this.f4619e;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final ModuleClientActivator getClientActivator() {
        return this.f4620f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final ModuleClientExecutorProvider getClientExecutorProvider() {
        return this.f4621g;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final ClientStorageProvider getClientStorageProvider() {
        return this.f4617c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final Context getContext() {
        return this.f4615a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final InternalClientModuleFacade getInternalClientModuleFacade() {
        return this.f4618d;
    }

    @Override // io.appmetrica.analytics.impl.H5, io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final J5 getModuleAdRevenueContext() {
        return this.f4616b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final ProcessDetector getProcessDetector() {
        return this.f4622h;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final ModuleAdRevenueContext getModuleAdRevenueContext() {
        return this.f4616b;
    }
}
