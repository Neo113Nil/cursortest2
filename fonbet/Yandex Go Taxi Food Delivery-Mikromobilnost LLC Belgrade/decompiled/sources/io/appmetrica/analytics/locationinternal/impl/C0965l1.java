package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.l1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0965l1 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final R0 fromModel(C0962k1 c0962k1) {
        R0 r0 = new R0();
        r0.a = c0962k1.a;
        r0.b = c0962k1.b;
        r0.c = c0962k1.c;
        r0.d = c0962k1.d;
        return r0;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0962k1 toModel(R0 r0) {
        return new C0962k1(r0.a, r0.b, r0.c, r0.d);
    }
}
