package io.appmetrica.analytics.impl;

/* loaded from: classes9.dex */
public final class Qk implements Runnable {
    public final /* synthetic */ Tk a;

    public Qk(Tk tk) {
        this.a = tk;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Tk tk = this.a;
        Tk.a(tk.a, tk.d, tk.e).clearAppEnvironment();
    }
}
