package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.zk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC0917zk implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ Tk b;

    public RunnableC0917zk(Tk tk, String str) {
        this.b = tk;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Tk tk = this.b;
        Tk.a(tk.a, tk.d, tk.e).setUserProfileID(this.a);
    }
}
