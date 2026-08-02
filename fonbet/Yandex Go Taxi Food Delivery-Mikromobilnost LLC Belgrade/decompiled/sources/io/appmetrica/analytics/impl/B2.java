package io.appmetrica.analytics.impl;

/* loaded from: classes4.dex */
public final class B2 implements Runnable {
    public final /* synthetic */ Ng a;
    public final /* synthetic */ C0818w8 b;

    public B2(D2 d2, C0818w8 c0818w8) {
        this.a = d2;
        this.b = c0818w8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.consume(this.b);
    }
}
