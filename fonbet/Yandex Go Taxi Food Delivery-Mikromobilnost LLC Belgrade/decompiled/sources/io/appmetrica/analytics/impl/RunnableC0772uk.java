package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.uk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC0772uk implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ Throwable b;
    public final /* synthetic */ Tk c;

    public RunnableC0772uk(Tk tk, String str, Throwable th) {
        this.c = tk;
        this.a = str;
        this.b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Tk tk = this.c;
        Tk.a(tk.a, tk.d, tk.e).reportError(this.a, this.b);
    }
}
