package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* renamed from: io.appmetrica.analytics.impl.n1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC0477n1 implements Runnable {
    public final /* synthetic */ AdRevenue a;
    public final /* synthetic */ J1 b;

    public RunnableC0477n1(J1 j1, AdRevenue adRevenue) {
        this.b = j1;
        this.a = adRevenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        J1.a(this.b).reportAdRevenue(this.a);
    }
}
