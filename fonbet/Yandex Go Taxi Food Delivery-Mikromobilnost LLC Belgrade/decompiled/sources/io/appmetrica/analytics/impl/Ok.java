package io.appmetrica.analytics.impl;

/* loaded from: classes4.dex */
public final class Ok implements Runnable {
    public final /* synthetic */ Tk a;

    public Ok(Tk tk) {
        this.a = tk;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Tk tk = this.a;
        Tk.a(tk.a, tk.d, tk.e).sendEventsBuffer();
    }
}
