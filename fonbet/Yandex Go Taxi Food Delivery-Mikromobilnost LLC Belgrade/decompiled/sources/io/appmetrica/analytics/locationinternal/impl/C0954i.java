package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.i, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0954i implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final P0 fromModel(C0951h c0951h) {
        P0 p0 = new P0();
        p0.a = c0951h.a;
        p0.b = c0951h.b;
        return p0;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        P0 p0 = (P0) obj;
        return new C0951h(p0.a, p0.b);
    }

    public final C0951h a(P0 p0) {
        return new C0951h(p0.a, p0.b);
    }
}
