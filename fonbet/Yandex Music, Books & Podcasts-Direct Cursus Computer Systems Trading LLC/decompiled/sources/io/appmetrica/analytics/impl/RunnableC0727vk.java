package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.vk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC0727vk implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Jk b;

    public RunnableC0727vk(Jk jk, boolean z) {
        this.b = jk;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Jk jk = this.b;
        Jk.a(jk.a, jk.d, jk.e).setDataSendingEnabled(this.a);
    }
}
