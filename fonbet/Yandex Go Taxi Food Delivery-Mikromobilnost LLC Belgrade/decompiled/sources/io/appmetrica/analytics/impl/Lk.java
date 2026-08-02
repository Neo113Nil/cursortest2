package io.appmetrica.analytics.impl;

/* loaded from: classes4.dex */
public final class Lk implements Runnable {
    public final /* synthetic */ C0606or a;
    public final /* synthetic */ Tk b;

    public Lk(Tk tk, C0606or c0606or) {
        this.b = tk;
        this.a = c0606or;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Tk tk = this.b;
        Tk.a(tk.a, tk.d, tk.e).a(this.a);
    }
}
