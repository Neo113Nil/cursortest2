package io.appmetrica.analytics.impl;

/* loaded from: classes5.dex */
public final class Ik implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Jk c;

    public Ik(Jk jk, String str, String str2) {
        this.c = jk;
        this.a = str;
        this.b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Jk jk = this.c;
        Jk.a(jk.a, jk.d, jk.e).reportEvent(this.a, this.b);
    }
}
