package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.pk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC0554pk implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ Jk b;

    public RunnableC0554pk(Jk jk, String str) {
        this.b = jk;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Jk jk = this.b;
        Jk.a(jk.a, jk.d, jk.e).setUserProfileID(this.a);
    }
}
