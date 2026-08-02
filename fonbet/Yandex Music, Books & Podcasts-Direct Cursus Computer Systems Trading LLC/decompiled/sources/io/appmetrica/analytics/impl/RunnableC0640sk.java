package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* renamed from: io.appmetrica.analytics.impl.sk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC0640sk implements Runnable {
    public final /* synthetic */ AdRevenue a;
    public final /* synthetic */ Jk b;

    public RunnableC0640sk(Jk jk, AdRevenue adRevenue) {
        this.b = jk;
        this.a = adRevenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Jk jk = this.b;
        Jk.a(jk.a, jk.d, jk.e).reportAdRevenue(this.a);
    }
}
