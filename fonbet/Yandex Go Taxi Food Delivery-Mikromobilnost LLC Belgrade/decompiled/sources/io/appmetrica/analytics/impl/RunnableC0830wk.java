package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.wk, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC0830wk implements Runnable {
    public final /* synthetic */ Throwable a;
    public final /* synthetic */ Tk b;

    public RunnableC0830wk(Tk tk, Throwable th) {
        this.b = tk;
        this.a = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Tk tk = this.b;
        Tk.a(tk.a, tk.d, tk.e).reportUnhandledException(this.a);
    }
}
