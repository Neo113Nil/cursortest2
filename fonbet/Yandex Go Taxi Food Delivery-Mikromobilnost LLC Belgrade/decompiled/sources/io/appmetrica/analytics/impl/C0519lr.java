package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* renamed from: io.appmetrica.analytics.impl.lr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0519lr extends AbstractCallableC0483kk {
    public final int e;
    public final Bundle f;

    public C0519lr(C0781v0 c0781v0, InterfaceC0863xo interfaceC0863xo, int i, Bundle bundle) {
        super(c0781v0, interfaceC0863xo);
        this.e = i;
        this.f = bundle;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC0483kk
    public final void a(IAppMetricaService iAppMetricaService) {
        iAppMetricaService.reportData(this.e, this.f);
    }
}
