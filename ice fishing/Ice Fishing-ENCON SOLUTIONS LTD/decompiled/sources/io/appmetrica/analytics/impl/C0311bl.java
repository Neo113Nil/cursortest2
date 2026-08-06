package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.bl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0311bl extends ECommerceEvent {

    /* renamed from: a, reason: collision with root package name */
    public final Hf f5684a;

    /* renamed from: b, reason: collision with root package name */
    public final C0335cj f5685b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0298b8 f5686c;

    public C0311bl(ECommerceProduct eCommerceProduct, ECommerceScreen eCommerceScreen) {
        this(new Hf(eCommerceProduct), new C0335cj(eCommerceScreen), new C0337cl());
    }

    public final InterfaceC0298b8 a() {
        return this.f5686c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        return "shown product card info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Kf
    public final List<Di> toProto() {
        return (List) this.f5686c.fromModel(this);
    }

    public final String toString() {
        return "ShownProductCardInfoEvent{product=" + this.f5684a + ", screen=" + this.f5685b + ", converter=" + this.f5686c + '}';
    }

    public C0311bl(Hf hf, C0335cj c0335cj, InterfaceC0298b8 interfaceC0298b8) {
        this.f5684a = hf;
        this.f5685b = c0335cj;
        this.f5686c = interfaceC0298b8;
    }
}
