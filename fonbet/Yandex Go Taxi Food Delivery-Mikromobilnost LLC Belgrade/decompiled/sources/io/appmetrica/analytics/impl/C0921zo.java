package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.zo, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0921zo extends ECommerceEvent {
    public final C0799vi a;
    public final C0687rm b;
    public final InterfaceC0617p9 c;

    public C0921zo(ECommerceProduct eCommerceProduct, ECommerceScreen eCommerceScreen) {
        this(new C0799vi(eCommerceProduct), new C0687rm(eCommerceScreen), new Ao());
    }

    public final InterfaceC0617p9 a() {
        return this.c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        return "shown product card info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.InterfaceC0886yi
    public final List<C0802vl> toProto() {
        return (List) this.c.fromModel(this);
    }

    public final String toString() {
        return "ShownProductCardInfoEvent{product=" + this.a + ", screen=" + this.b + ", converter=" + this.c + '}';
    }

    public C0921zo(C0799vi c0799vi, C0687rm c0687rm, InterfaceC0617p9 interfaceC0617p9) {
        this.a = c0799vi;
        this.b = c0687rm;
        this.c = interfaceC0617p9;
    }
}
