package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.s0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0984s0 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final S0 fromModel(C0981r0 c0981r0) {
        S0 s0 = new S0();
        s0.a = c0981r0.a;
        s0.c = c0981r0.b;
        s0.d = c0981r0.c;
        s0.e = c0981r0.d;
        s0.f = c0981r0.e;
        s0.g = c0981r0.f;
        s0.h = c0981r0.g;
        s0.b = c0981r0.h;
        return s0;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0981r0 toModel(S0 s0) {
        return new C0981r0(s0.a, s0.c, s0.d, s0.e, s0.f, s0.g, s0.h, s0.b);
    }
}
