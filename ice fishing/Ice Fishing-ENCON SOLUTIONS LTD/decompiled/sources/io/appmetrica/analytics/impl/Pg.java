package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.IAppMetricaService;

/* loaded from: classes.dex */
public class Pg extends AbstractCallableC0876xh {

    /* renamed from: e, reason: collision with root package name */
    public final C0824vh f4933e;

    public Pg(C0652p0 c0652p0, Zk zk, C0824vh c0824vh) {
        super(c0652p0, zk);
        this.f4933e = c0824vh;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC0876xh
    public final void a(Throwable th) {
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC0876xh
    public final void a(IAppMetricaService iAppMetricaService) {
        C0824vh c0824vh = this.f4933e;
        iAppMetricaService.reportData(c0824vh.f7067c, c0824vh.f7065a.d(c0824vh.f7069e.c()));
    }
}
