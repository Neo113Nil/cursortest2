package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;

/* loaded from: classes4.dex */
public final class Ek implements Runnable {
    public final /* synthetic */ ECommerceEvent a;
    public final /* synthetic */ Tk b;

    public Ek(Tk tk, ECommerceEvent eCommerceEvent) {
        this.b = tk;
        this.a = eCommerceEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Tk tk = this.b;
        Tk.a(tk.a, tk.d, tk.e).reportECommerce(this.a);
    }
}
