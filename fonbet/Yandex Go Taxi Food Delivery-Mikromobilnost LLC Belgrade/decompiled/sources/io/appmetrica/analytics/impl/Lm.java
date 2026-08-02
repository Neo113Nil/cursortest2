package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;

/* loaded from: classes4.dex */
public final class Lm implements InterfaceC0591oc {
    public final /* synthetic */ ECommerceEvent a;

    public Lm(ECommerceEvent eCommerceEvent) {
        this.a = eCommerceEvent;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0591oc
    public final void a(InterfaceC0620pc interfaceC0620pc) {
        interfaceC0620pc.reportECommerce(this.a);
    }
}
