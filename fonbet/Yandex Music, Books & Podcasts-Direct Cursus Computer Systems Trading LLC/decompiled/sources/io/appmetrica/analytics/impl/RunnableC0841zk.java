package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.zk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC0841zk implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ byte[] b;
    public final /* synthetic */ Jk c;

    public RunnableC0841zk(Jk jk, String str, byte[] bArr) {
        this.c = jk;
        this.a = str;
        this.b = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Jk jk = this.c;
        Jk.a(jk.a, jk.d, jk.e).setSessionExtra(this.a, this.b);
    }
}
