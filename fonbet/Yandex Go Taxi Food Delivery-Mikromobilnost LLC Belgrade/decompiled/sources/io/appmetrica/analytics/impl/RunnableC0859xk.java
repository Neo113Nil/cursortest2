package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.xk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC0859xk implements Runnable {
    public final /* synthetic */ Tk a;

    public RunnableC0859xk(Tk tk) {
        this.a = tk;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Tk tk = this.a;
        Tk.a(tk.a, tk.d, tk.e).resumeSession();
    }
}
