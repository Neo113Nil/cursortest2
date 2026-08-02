package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import io.appmetrica.analytics.ecommerce.ECommerceReferrer;
import java.util.List;

/* loaded from: classes4.dex */
public final class Bo extends ECommerceEvent {
    public final C0799vi a;
    public final C0367gj b;
    public final InterfaceC0617p9 c;

    public Bo(ECommerceProduct eCommerceProduct, ECommerceReferrer eCommerceReferrer) {
        this(new C0799vi(eCommerceProduct), eCommerceReferrer == null ? null : new C0367gj(eCommerceReferrer), new Co());
    }

    public final InterfaceC0617p9 a() {
        return this.c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        return "shown product details info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.InterfaceC0886yi
    public final List<C0802vl> toProto() {
        return (List) this.c.fromModel(this);
    }

    public final String toString() {
        return "ShownProductDetailInfoEvent{product=" + this.a + ", referrer=" + this.b + ", converter=" + this.c + '}';
    }

    public Bo(C0799vi c0799vi, C0367gj c0367gj, InterfaceC0617p9 interfaceC0617p9) {
        this.a = c0799vi;
        this.b = c0367gj;
        this.c = interfaceC0617p9;
    }
}
