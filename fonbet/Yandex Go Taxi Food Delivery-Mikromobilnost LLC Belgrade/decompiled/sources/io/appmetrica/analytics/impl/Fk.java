package io.appmetrica.analytics.impl;

/* loaded from: classes4.dex */
public final class Fk implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Tk b;

    public Fk(Tk tk, boolean z) {
        this.b = tk;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Tk tk = this.b;
        Tk.a(tk.a, tk.d, tk.e).setDataSendingEnabled(this.a);
    }
}
