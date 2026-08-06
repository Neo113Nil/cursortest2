package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* renamed from: io.appmetrica.analytics.impl.re, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0717re extends AbstractCallableC0876xh {

    /* renamed from: e, reason: collision with root package name */
    public final Bf f6820e;

    public C0717re(C0652p0 c0652p0, Zk zk, Bf bf) {
        super(c0652p0, zk);
        this.f6820e = bf;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC0876xh
    public final void a(IAppMetricaService iAppMetricaService) {
        Bundle bundle = new Bundle();
        Bf bf = this.f6820e;
        synchronized (bf) {
            bundle.putParcelable("PROCESS_CFG_OBJ", bf);
        }
        iAppMetricaService.pauseUserSession(bundle);
    }
}
