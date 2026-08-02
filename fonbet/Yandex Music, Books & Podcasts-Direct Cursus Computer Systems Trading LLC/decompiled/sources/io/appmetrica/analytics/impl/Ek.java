package io.appmetrica.analytics.impl;

/* loaded from: classes5.dex */
public final class Ek implements Runnable {
    public final /* synthetic */ Jk a;

    public Ek(Jk jk) {
        this.a = jk;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Jk jk = this.a;
        Jk.a(jk.a, jk.d, jk.e).sendEventsBuffer();
    }
}
