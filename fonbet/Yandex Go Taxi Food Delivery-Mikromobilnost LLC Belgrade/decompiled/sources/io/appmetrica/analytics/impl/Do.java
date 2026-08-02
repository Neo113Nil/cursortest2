package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;

/* loaded from: classes4.dex */
public final class Do extends ECommerceEvent {
    public final C0687rm a;
    public final InterfaceC0617p9 b;

    public Do(ECommerceScreen eCommerceScreen) {
        this(new C0687rm(eCommerceScreen), new Eo());
    }

    public final InterfaceC0617p9 a() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        return "shown screen info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.InterfaceC0886yi
    public final List<C0802vl> toProto() {
        return (List) this.b.fromModel(this);
    }

    public final String toString() {
        return "ShownScreenInfoEvent{screen=" + this.a + ", converter=" + this.b + '}';
    }

    public Do(C0687rm c0687rm, InterfaceC0617p9 interfaceC0617p9) {
        this.a = c0687rm;
        this.b = interfaceC0617p9;
    }
}
