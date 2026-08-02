package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes9.dex */
public final class K0 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final I0 toModel(T0 t0) {
        boolean z;
        boolean z2 = t0.a;
        boolean z3 = t0.b;
        boolean z4 = true;
        if (t0.c && z2) {
            z = true;
        } else {
            z = true;
            z4 = false;
        }
        return new I0(z2, z3, z4, (t0.e && z2) ? z : false, (t0.d && z2) ? z : false);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final T0 fromModel(I0 i0) {
        T0 t0 = new T0();
        t0.a = i0.a;
        t0.b = i0.b;
        t0.c = i0.c;
        t0.d = i0.e;
        t0.e = i0.d;
        return t0;
    }
}
