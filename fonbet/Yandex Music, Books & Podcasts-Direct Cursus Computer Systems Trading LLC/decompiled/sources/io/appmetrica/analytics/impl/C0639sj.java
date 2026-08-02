package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.IAppMetricaService;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.sj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C0639sj extends AbstractCallableC0121ak {
    public final Yj e;

    public C0639sj(@NotNull C0649t0 c0649t0, InterfaceC0183co interfaceC0183co, @NotNull Yj yj) {
        super(c0649t0, interfaceC0183co);
        this.e = yj;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC0121ak
    public final void a(@NotNull IAppMetricaService iAppMetricaService) {
        Yj yj = this.e;
        iAppMetricaService.reportData(yj.c, yj.a.d(yj.e.c()));
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC0121ak
    public final void a(Throwable th) {
    }
}
