package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.eo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0240eo extends ECommerceEvent {

    @NonNull
    public final C0234ei a;

    @NonNull
    public final C0123am b;
    public final InterfaceC0369j9 c;

    public C0240eo(@NonNull ECommerceProduct eCommerceProduct, @NonNull ECommerceScreen eCommerceScreen) {
        this(new C0234ei(eCommerceProduct), new C0123am(eCommerceScreen), new C0269fo());
    }

    @NonNull
    public final InterfaceC0369j9 a() {
        return this.c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    @NonNull
    public final String getPublicDescription() {
        return "shown product card info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.InterfaceC0321hi
    public final List<C0439ll> toProto() {
        return (List) this.c.fromModel(this);
    }

    public final String toString() {
        return "ShownProductCardInfoEvent{product=" + this.a + ", screen=" + this.b + ", converter=" + this.c + '}';
    }

    public C0240eo(@NonNull C0234ei c0234ei, @NonNull C0123am c0123am, @NonNull InterfaceC0369j9 interfaceC0369j9) {
        this.a = c0234ei;
        this.b = c0123am;
        this.c = interfaceC0369j9;
    }
}
