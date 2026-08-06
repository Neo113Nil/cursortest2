package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* loaded from: classes.dex */
public final class Ei extends AbstractCallableC0876xh {

    /* renamed from: e, reason: collision with root package name */
    public final Bf f4361e;

    public Ei(C0652p0 c0652p0, Zk zk, Bf bf) {
        super(c0652p0, zk);
        this.f4361e = bf;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC0876xh
    public final void a(IAppMetricaService iAppMetricaService) {
        Bundle bundle = new Bundle();
        Bf bf = this.f4361e;
        synchronized (bf) {
            bundle.putParcelable("PROCESS_CFG_OBJ", bf);
        }
        iAppMetricaService.resumeUserSession(bundle);
    }
}
