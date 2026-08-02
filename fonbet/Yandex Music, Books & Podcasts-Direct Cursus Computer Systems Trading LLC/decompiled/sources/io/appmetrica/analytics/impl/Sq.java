package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.internal.IAppMetricaService;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class Sq extends AbstractCallableC0121ak {
    public final int e;
    public final Bundle f;

    public Sq(@NotNull C0649t0 c0649t0, InterfaceC0183co interfaceC0183co, int i, @NotNull Bundle bundle) {
        super(c0649t0, interfaceC0183co);
        this.e = i;
        this.f = bundle;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC0121ak
    public final void a(@NotNull IAppMetricaService iAppMetricaService) {
        iAppMetricaService.reportData(this.e, this.f);
    }
}
