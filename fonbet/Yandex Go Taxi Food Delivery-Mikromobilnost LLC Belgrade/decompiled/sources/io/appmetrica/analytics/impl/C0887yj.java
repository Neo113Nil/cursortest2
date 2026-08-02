package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.IAppMetricaService;

/* renamed from: io.appmetrica.analytics.impl.yj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C0887yj extends AbstractCallableC0483kk {
    public final C0425ik e;

    public C0887yj(C0781v0 c0781v0, InterfaceC0863xo interfaceC0863xo, C0425ik c0425ik) {
        super(c0781v0, interfaceC0863xo);
        this.e = c0425ik;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC0483kk
    public final void a(IAppMetricaService iAppMetricaService) {
        C0425ik c0425ik = this.e;
        iAppMetricaService.reportData(c0425ik.c, c0425ik.a.d(c0425ik.e.c()));
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC0483kk
    public final void a(Throwable th) {
    }
}
