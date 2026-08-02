package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.lh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0509lh implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Pp fromModel(C0480kh c0480kh) {
        Pp pp = new Pp();
        pp.a = c0480kh.a;
        pp.b = c0480kh.b;
        return pp;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        Pp pp = (Pp) obj;
        return new C0480kh(pp.a, pp.b);
    }

    public final C0480kh a(Pp pp) {
        return new C0480kh(pp.a, pp.b);
    }
}
