package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;

/* loaded from: classes4.dex */
public final class Bk implements Runnable {
    public final /* synthetic */ Revenue a;
    public final /* synthetic */ Tk b;

    public Bk(Tk tk, Revenue revenue) {
        this.b = tk;
        this.a = revenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Tk tk = this.b;
        Tk.a(tk.a, tk.d, tk.e).reportRevenue(this.a);
    }
}
