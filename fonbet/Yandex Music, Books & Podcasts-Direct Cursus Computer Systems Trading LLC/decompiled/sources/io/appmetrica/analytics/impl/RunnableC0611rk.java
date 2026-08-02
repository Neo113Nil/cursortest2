package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;

/* renamed from: io.appmetrica.analytics.impl.rk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC0611rk implements Runnable {
    public final /* synthetic */ Revenue a;
    public final /* synthetic */ Jk b;

    public RunnableC0611rk(Jk jk, Revenue revenue) {
        this.b = jk;
        this.a = revenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Jk jk = this.b;
        Jk.a(jk.a, jk.d, jk.e).reportRevenue(this.a);
    }
}
