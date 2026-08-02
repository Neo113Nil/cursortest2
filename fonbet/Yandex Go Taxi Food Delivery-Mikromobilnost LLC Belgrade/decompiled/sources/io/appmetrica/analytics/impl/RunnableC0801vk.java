package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.vk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC0801vk implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Throwable c;
    public final /* synthetic */ Tk d;

    public RunnableC0801vk(Tk tk, String str, String str2, Throwable th) {
        this.d = tk;
        this.a = str;
        this.b = str2;
        this.c = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Tk tk = this.d;
        Tk.a(tk.a, tk.d, tk.e).reportError(this.a, this.b, this.c);
    }
}
