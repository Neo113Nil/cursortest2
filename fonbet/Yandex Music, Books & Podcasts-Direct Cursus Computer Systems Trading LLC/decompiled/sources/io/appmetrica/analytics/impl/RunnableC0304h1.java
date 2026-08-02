package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.h1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC0304h1 implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ J1 b;

    public RunnableC0304h1(J1 j1, boolean z) {
        this.b = j1;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        D0 d0 = this.b.a;
        boolean z = this.a;
        d0.getClass();
        C0.c().a(z, true);
    }
}
