package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes9.dex */
public final class Ea implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ca fromModel(Da da) {
        Ca ca = new Ca();
        String str = da.a;
        if (str != null) {
            ca.a = str.getBytes();
        }
        return ca;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Da toModel(Ca ca) {
        return new Da(new String(ca.a));
    }
}
