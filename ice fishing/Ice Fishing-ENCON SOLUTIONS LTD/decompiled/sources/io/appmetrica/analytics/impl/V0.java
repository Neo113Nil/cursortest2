package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;

/* loaded from: classes.dex */
public final class V0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Revenue f5190a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0756t1 f5191b;

    public V0(C0756t1 c0756t1, Revenue revenue) {
        this.f5191b = c0756t1;
        this.f5190a = revenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0756t1.a(this.f5191b).reportRevenue(this.f5190a);
    }
}
