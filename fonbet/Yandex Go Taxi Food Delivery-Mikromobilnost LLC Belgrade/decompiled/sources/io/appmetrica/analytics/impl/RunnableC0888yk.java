package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.yk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC0888yk implements Runnable {
    public final /* synthetic */ Tk a;

    public RunnableC0888yk(Tk tk) {
        this.a = tk;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Tk tk = this.a;
        Tk.a(tk.a, tk.d, tk.e).pauseSession();
    }
}
