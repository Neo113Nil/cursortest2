package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import java.util.List;

/* loaded from: classes5.dex */
public final class W3 extends ECommerceEvent {
    public static final int d = 4;
    public static final int e = 5;
    public final int a;

    @NonNull
    public final Z3 b;
    public final InterfaceC0369j9 c;

    public W3(int i, @NonNull ECommerceCartItem eCommerceCartItem) {
        this(i, new Z3(eCommerceCartItem), new X3());
    }

    @NonNull
    public final InterfaceC0369j9 a() {
        return this.c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    @NonNull
    public final String getPublicDescription() {
        int i = this.a;
        return i != 4 ? i != 5 ? "unknown cart action info" : "remove cart item info" : "add cart item info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.InterfaceC0321hi
    public final List<C0439ll> toProto() {
        return (List) this.c.fromModel(this);
    }

    @NonNull
    public final String toString() {
        return "CartActionInfoEvent{eventType=" + this.a + ", cartItem=" + this.b + ", converter=" + this.c + '}';
    }

    public W3(int i, @NonNull Z3 z3, @NonNull InterfaceC0369j9 interfaceC0369j9) {
        this.a = i;
        this.b = z3;
        this.c = interfaceC0369j9;
    }
}
