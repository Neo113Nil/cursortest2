package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.a4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0179a4 extends ECommerceEvent {
    public static final int d = 4;
    public static final int e = 5;
    public final int a;
    public final C0266d4 b;
    public final InterfaceC0617p9 c;

    public C0179a4(int i, ECommerceCartItem eCommerceCartItem) {
        this(i, new C0266d4(eCommerceCartItem), new C0208b4());
    }

    public final InterfaceC0617p9 a() {
        return this.c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        int i = this.a;
        return i != 4 ? i != 5 ? "unknown cart action info" : "remove cart item info" : "add cart item info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.InterfaceC0886yi
    public final List<C0802vl> toProto() {
        return (List) this.c.fromModel(this);
    }

    public final String toString() {
        return "CartActionInfoEvent{eventType=" + this.a + ", cartItem=" + this.b + ", converter=" + this.c + '}';
    }

    public C0179a4(int i, C0266d4 c0266d4, InterfaceC0617p9 interfaceC0617p9) {
        this.a = i;
        this.b = c0266d4;
        this.c = interfaceC0617p9;
    }
}
