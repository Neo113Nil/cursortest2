package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleCounterReport;

/* renamed from: io.appmetrica.analytics.impl.ak, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0284ak implements ServiceComponentModuleReporter {

    /* renamed from: a, reason: collision with root package name */
    public final X4 f5570a;

    /* renamed from: b, reason: collision with root package name */
    public final C0775tk f5571b;

    public C0284ak(X4 x4, C0775tk c0775tk) {
        this.f5570a = x4;
        this.f5571b = c0775tk;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter
    public final void handleReport(ServiceModuleCounterReport serviceModuleCounterReport) {
        this.f5571b.getClass();
        this.f5570a.a(C0775tk.a(serviceModuleCounterReport));
    }

    public /* synthetic */ C0284ak(X4 x4, C0775tk c0775tk, int i2, kotlin.jvm.internal.e eVar) {
        this(x4, (i2 & 2) != 0 ? new C0775tk() : c0775tk);
    }
}
