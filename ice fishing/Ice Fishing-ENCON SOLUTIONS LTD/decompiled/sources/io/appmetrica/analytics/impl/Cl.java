package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* loaded from: classes.dex */
public final class Cl implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Z5 fromModel(Dl dl) {
        Z5 z5 = new Z5();
        z5.f5468a = (String) WrapUtils.getOrDefault(dl.f4321a, z5.f5468a);
        z5.f5469b = (String) WrapUtils.getOrDefault(dl.f4322b, z5.f5469b);
        z5.f5470c = ((Integer) WrapUtils.getOrDefault(dl.f4323c, Integer.valueOf(z5.f5470c))).intValue();
        z5.f5473f = ((Integer) WrapUtils.getOrDefault(dl.f4324d, Integer.valueOf(z5.f5473f))).intValue();
        z5.f5471d = (String) WrapUtils.getOrDefault(dl.f4325e, z5.f5471d);
        z5.f5472e = ((Boolean) WrapUtils.getOrDefault(dl.f4326f, Boolean.valueOf(z5.f5472e))).booleanValue();
        return z5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final Dl a(Z5 z5) {
        throw new UnsupportedOperationException();
    }
}
