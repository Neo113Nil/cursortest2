package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.h3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0448h3 extends ECommerceEvent {

    /* renamed from: d, reason: collision with root package name */
    public static final int f6112d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final int f6113e = 5;

    /* renamed from: a, reason: collision with root package name */
    public final int f6114a;

    /* renamed from: b, reason: collision with root package name */
    public final C0525k3 f6115b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0298b8 f6116c;

    public C0448h3(int i2, ECommerceCartItem eCommerceCartItem) {
        this(i2, new C0525k3(eCommerceCartItem), new C0474i3());
    }

    public final InterfaceC0298b8 a() {
        return this.f6116c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        int i2 = this.f6114a;
        return i2 != 4 ? i2 != 5 ? "unknown cart action info" : "remove cart item info" : "add cart item info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Kf
    public final List<Di> toProto() {
        return (List) this.f6116c.fromModel(this);
    }

    public final String toString() {
        return "CartActionInfoEvent{eventType=" + this.f6114a + ", cartItem=" + this.f6115b + ", converter=" + this.f6116c + '}';
    }

    public C0448h3(int i2, C0525k3 c0525k3, InterfaceC0298b8 interfaceC0298b8) {
        this.f6114a = i2;
        this.f6115b = c0525k3;
        this.f6116c = interfaceC0298b8;
    }
}
