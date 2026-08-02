package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* loaded from: classes4.dex */
public final class Ck implements Runnable {
    public final /* synthetic */ AdRevenue a;
    public final /* synthetic */ Tk b;

    public Ck(Tk tk, AdRevenue adRevenue) {
        this.b = tk;
        this.a = adRevenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Tk tk = this.b;
        Tk.a(tk.a, tk.d, tk.e).reportAdRevenue(this.a);
    }
}
