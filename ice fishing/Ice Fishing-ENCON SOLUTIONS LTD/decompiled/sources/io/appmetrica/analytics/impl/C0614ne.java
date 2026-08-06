package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceOrder;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.ne, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0614ne extends ECommerceEvent {

    /* renamed from: d, reason: collision with root package name */
    public static final int f6612d = 6;

    /* renamed from: e, reason: collision with root package name */
    public static final int f6613e = 7;

    /* renamed from: a, reason: collision with root package name */
    public final int f6614a;

    /* renamed from: b, reason: collision with root package name */
    public final C0666pe f6615b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0298b8 f6616c;

    public C0614ne(int i2, ECommerceOrder eCommerceOrder) {
        this(i2, new C0666pe(eCommerceOrder), new C0640oe());
    }

    public final InterfaceC0298b8 a() {
        return this.f6616c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        return "order info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Kf
    public final List<Di> toProto() {
        return (List) this.f6616c.fromModel(this);
    }

    public final String toString() {
        return "OrderInfoEvent{eventType=" + this.f6614a + ", order=" + this.f6615b + ", converter=" + this.f6616c + '}';
    }

    public C0614ne(int i2, C0666pe c0666pe, InterfaceC0298b8 interfaceC0298b8) {
        this.f6614a = i2;
        this.f6615b = c0666pe;
        this.f6616c = interfaceC0298b8;
    }
}
