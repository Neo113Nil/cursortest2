package io.appmetrica.analytics.impl;

/* loaded from: classes9.dex */
public final class Rk implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ Tk b;

    public Rk(Tk tk, String str) {
        this.b = tk;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Tk tk = this.b;
        Tk.a(tk.a, tk.d, tk.e).reportEvent(this.a);
    }
}
