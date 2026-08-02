package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import io.appmetrica.analytics.ecommerce.ECommerceReferrer;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.go, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0298go extends ECommerceEvent {

    @NonNull
    public final C0234ei a;
    public final C0120aj b;
    public final InterfaceC0369j9 c;

    public C0298go(@NonNull ECommerceProduct eCommerceProduct, ECommerceReferrer eCommerceReferrer) {
        this(new C0234ei(eCommerceProduct), eCommerceReferrer == null ? null : new C0120aj(eCommerceReferrer), new C0327ho());
    }

    @NonNull
    public final InterfaceC0369j9 a() {
        return this.c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    @NonNull
    public final String getPublicDescription() {
        return "shown product details info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.InterfaceC0321hi
    public final List<C0439ll> toProto() {
        return (List) this.c.fromModel(this);
    }

    public final String toString() {
        return "ShownProductDetailInfoEvent{product=" + this.a + ", referrer=" + this.b + ", converter=" + this.c + '}';
    }

    public C0298go(@NonNull C0234ei c0234ei, C0120aj c0120aj, @NonNull InterfaceC0369j9 interfaceC0369j9) {
        this.a = c0234ei;
        this.b = c0120aj;
        this.c = interfaceC0369j9;
    }
}
