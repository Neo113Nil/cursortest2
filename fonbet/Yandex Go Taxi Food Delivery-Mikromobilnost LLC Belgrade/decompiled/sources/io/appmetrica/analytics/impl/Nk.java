package io.appmetrica.analytics.impl;

/* loaded from: classes4.dex */
public final class Nk implements Runnable {
    public final /* synthetic */ C0204b0 a;
    public final /* synthetic */ Tk b;

    public Nk(Tk tk, C0204b0 c0204b0) {
        this.b = tk;
        this.a = c0204b0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Tk tk = this.b;
        Tk.a(tk.a, tk.d, tk.e).a(this.a);
    }
}
