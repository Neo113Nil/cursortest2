package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.fl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0414fl extends ECommerceEvent {

    /* renamed from: a, reason: collision with root package name */
    public final C0335cj f5998a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0298b8 f5999b;

    public C0414fl(ECommerceScreen eCommerceScreen) {
        this(new C0335cj(eCommerceScreen), new C0440gl());
    }

    public final InterfaceC0298b8 a() {
        return this.f5999b;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        return "shown screen info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Kf
    public final List<Di> toProto() {
        return (List) this.f5999b.fromModel(this);
    }

    public final String toString() {
        return "ShownScreenInfoEvent{screen=" + this.f5998a + ", converter=" + this.f5999b + '}';
    }

    public C0414fl(C0335cj c0335cj, InterfaceC0298b8 interfaceC0298b8) {
        this.f5998a = c0335cj;
        this.f5999b = interfaceC0298b8;
    }
}
