package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* loaded from: classes9.dex */
public final class Xo implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final U6 fromModel(Yo yo) {
        U6 u6 = new U6();
        u6.a = (String) WrapUtils.getOrDefault(yo.a, u6.a);
        u6.b = (String) WrapUtils.getOrDefault(yo.b, u6.b);
        u6.c = ((Integer) WrapUtils.getOrDefault(yo.c, Integer.valueOf(u6.c))).intValue();
        u6.f = ((Integer) WrapUtils.getOrDefault(yo.d, Integer.valueOf(u6.f))).intValue();
        u6.d = (String) WrapUtils.getOrDefault(yo.e, u6.d);
        u6.e = ((Boolean) WrapUtils.getOrDefault(yo.f, Boolean.valueOf(u6.e))).booleanValue();
        return u6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final Yo a(U6 u6) {
        throw new UnsupportedOperationException();
    }
}
