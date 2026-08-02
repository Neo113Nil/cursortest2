package io.appmetrica.analytics.impl;

/* loaded from: classes9.dex */
public final class D0 implements Runnable {
    public final /* synthetic */ E0 a;

    public D0(E0 e0) {
        this.a = e0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        V4.l().c.a().executeDelayed(new P1(this.a.a), 5000L);
    }
}
