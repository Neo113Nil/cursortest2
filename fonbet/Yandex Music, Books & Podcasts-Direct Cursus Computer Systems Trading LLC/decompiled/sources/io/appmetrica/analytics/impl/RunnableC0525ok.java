package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ok, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC0525ok implements Runnable {
    public final /* synthetic */ Jk a;

    public RunnableC0525ok(Jk jk) {
        this.a = jk;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Jk jk = this.a;
        Jk.a(jk.a, jk.d, jk.e).pauseSession();
    }
}
