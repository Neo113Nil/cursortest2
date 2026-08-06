package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import io.appmetrica.analytics.ecommerce.ECommerceReferrer;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.dl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0363dl extends ECommerceEvent {

    /* renamed from: a, reason: collision with root package name */
    public final Hf f5821a;

    /* renamed from: b, reason: collision with root package name */
    public final C0875xg f5822b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0298b8 f5823c;

    public C0363dl(ECommerceProduct eCommerceProduct, ECommerceReferrer eCommerceReferrer) {
        this(new Hf(eCommerceProduct), eCommerceReferrer == null ? null : new C0875xg(eCommerceReferrer), new C0388el());
    }

    public final InterfaceC0298b8 a() {
        return this.f5823c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        return "shown product details info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Kf
    public final List<Di> toProto() {
        return (List) this.f5823c.fromModel(this);
    }

    public final String toString() {
        return "ShownProductDetailInfoEvent{product=" + this.f5821a + ", referrer=" + this.f5822b + ", converter=" + this.f5823c + '}';
    }

    public C0363dl(Hf hf, C0875xg c0875xg, InterfaceC0298b8 interfaceC0298b8) {
        this.f5821a = hf;
        this.f5822b = c0875xg;
        this.f5823c = interfaceC0298b8;
    }
}
