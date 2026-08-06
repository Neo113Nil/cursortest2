package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* renamed from: io.appmetrica.analytics.impl.y1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0886y1 extends IAppMetricaService.Stub {

    /* renamed from: a, reason: collision with root package name */
    public final A1 f7223a;

    public BinderC0886y1(A1 a12) {
        this.f7223a = a12;
    }

    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void pauseUserSession(Bundle bundle) {
        ((B1) this.f7223a).pauseUserSession(bundle);
    }

    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void reportData(int i2, Bundle bundle) {
        ((B1) this.f7223a).reportData(i2, bundle);
    }

    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void resumeUserSession(Bundle bundle) {
        ((B1) this.f7223a).resumeUserSession(bundle);
    }
}
