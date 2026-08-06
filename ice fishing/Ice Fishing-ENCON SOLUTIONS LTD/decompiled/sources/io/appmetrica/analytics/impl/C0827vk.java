package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleConfig;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext;

/* renamed from: io.appmetrica.analytics.impl.vk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0827vk implements ServiceModuleReporterComponentContext {

    /* renamed from: a, reason: collision with root package name */
    public final C0284ak f7073a;

    /* renamed from: b, reason: collision with root package name */
    public final Zj f7074b;

    /* JADX WARN: Multi-variable type inference failed */
    public C0827vk(X4 x4, C0630o4 c0630o4) {
        this.f7073a = new C0284ak(x4, null, 2, 0 == true ? 1 : 0);
        this.f7074b = new Zj(c0630o4);
    }

    public final Zj a() {
        return this.f7074b;
    }

    public final C0284ak b() {
        return this.f7073a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext
    public final ServiceComponentModuleConfig getConfig() {
        return this.f7074b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext
    public final ServiceComponentModuleReporter getReporter() {
        return this.f7073a;
    }
}
