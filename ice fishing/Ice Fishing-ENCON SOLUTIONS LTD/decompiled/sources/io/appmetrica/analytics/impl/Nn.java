package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* loaded from: classes.dex */
public final class Nn extends AbstractCallableC0876xh {

    /* renamed from: e, reason: collision with root package name */
    public final int f4839e;

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f4840f;

    public Nn(C0652p0 c0652p0, Zk zk, int i2, Bundle bundle) {
        super(c0652p0, zk);
        this.f4839e = i2;
        this.f4840f = bundle;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC0876xh
    public final void a(IAppMetricaService iAppMetricaService) {
        iAppMetricaService.reportData(this.f4839e, this.f4840f);
    }
}
