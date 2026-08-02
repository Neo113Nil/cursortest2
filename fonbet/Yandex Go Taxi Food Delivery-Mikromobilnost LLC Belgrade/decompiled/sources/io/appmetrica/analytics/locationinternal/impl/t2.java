package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes9.dex */
public final class t2 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Y0 fromModel(r2 r2Var) {
        Y0 y0 = new Y0();
        y0.a = r2Var.a;
        y0.b = r2Var.b;
        return y0;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        Y0 y0 = (Y0) obj;
        return new r2(y0.a, y0.b);
    }

    public final r2 a(Y0 y0) {
        return new r2(y0.a, y0.b);
    }
}
