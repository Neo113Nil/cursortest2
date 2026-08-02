package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;

/* renamed from: io.appmetrica.analytics.impl.l1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC0493l1 implements Runnable {
    public final /* synthetic */ Revenue a;
    public final /* synthetic */ J1 b;

    public RunnableC0493l1(J1 j1, Revenue revenue) {
        this.b = j1;
        this.a = revenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        J1.a(this.b).reportRevenue(this.a);
    }
}
