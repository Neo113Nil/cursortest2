package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;

/* renamed from: io.appmetrica.analytics.impl.wj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0852wj implements Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Revenue f7122a;

    public C0852wj(Revenue revenue) {
        this.f7122a = revenue;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(Ra ra) {
        ra.reportRevenue(this.f7122a);
    }
}
