package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* loaded from: classes4.dex */
public final class Kk implements Runnable {
    public final /* synthetic */ AdRevenue a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Tk c;

    public Kk(Tk tk, AdRevenue adRevenue, boolean z) {
        this.c = tk;
        this.a = adRevenue;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Tk tk = this.c;
        Tk.a(tk.a, tk.d, tk.e).reportAdRevenue(this.a, this.b);
    }
}
