package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes9.dex */
public final class Sa implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Mp fromModel(Ra ra) {
        Mp mp = new Mp();
        if (ra != null) {
            mp.a = ra.a;
        }
        return mp;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new Ra(((Mp) obj).a);
    }

    public final Ra a(Mp mp) {
        return new Ra(mp.a);
    }
}
