package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.i1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC0407i1 implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ J1 b;

    public RunnableC0407i1(J1 j1, boolean z) {
        this.b = j1;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        F0 f0 = this.b.a;
        boolean z = this.a;
        f0.getClass();
        E0.c().setDataSendingEnabled(z);
    }
}
