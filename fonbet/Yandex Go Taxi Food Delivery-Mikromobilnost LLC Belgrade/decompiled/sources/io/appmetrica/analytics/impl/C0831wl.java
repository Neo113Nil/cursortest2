package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* renamed from: io.appmetrica.analytics.impl.wl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0831wl extends AbstractCallableC0483kk {
    public final C0597oi e;

    public C0831wl(C0781v0 c0781v0, InterfaceC0863xo interfaceC0863xo, C0597oi c0597oi) {
        super(c0781v0, interfaceC0863xo);
        this.e = c0597oi;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC0483kk
    public final void a(IAppMetricaService iAppMetricaService) {
        Bundle bundle = new Bundle();
        C0597oi c0597oi = this.e;
        synchronized (c0597oi) {
            bundle.putParcelable("PROCESS_CFG_OBJ", c0597oi);
        }
        iAppMetricaService.resumeUserSession(bundle);
    }
}
