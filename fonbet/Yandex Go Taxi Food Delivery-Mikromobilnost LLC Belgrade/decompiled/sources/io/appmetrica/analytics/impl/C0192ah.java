package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceOrder;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.ah, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0192ah extends ECommerceEvent {
    public static final int d = 6;
    public static final int e = 7;
    public final int a;
    public final C0250ch b;
    public final InterfaceC0617p9 c;

    public C0192ah(int i, ECommerceOrder eCommerceOrder) {
        this(i, new C0250ch(eCommerceOrder), new C0221bh());
    }

    public final InterfaceC0617p9 a() {
        return this.c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        return "order info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.InterfaceC0886yi
    public final List<C0802vl> toProto() {
        return (List) this.c.fromModel(this);
    }

    public final String toString() {
        return "OrderInfoEvent{eventType=" + this.a + ", order=" + this.b + ", converter=" + this.c + '}';
    }

    public C0192ah(int i, C0250ch c0250ch, InterfaceC0617p9 interfaceC0617p9) {
        this.a = i;
        this.b = c0250ch;
        this.c = interfaceC0617p9;
    }
}
