package io.appmetrica.analytics.impl;

/* loaded from: classes5.dex */
public final class B2 implements Runnable {
    public final /* synthetic */ InterfaceC0781xg a;
    public final /* synthetic */ C0599r8 b;

    public B2(D2 d2, C0599r8 c0599r8) {
        this.a = d2;
        this.b = c0599r8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.consume(this.b);
    }
}
