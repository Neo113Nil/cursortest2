package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes9.dex */
public final class Zp implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Qp fromModel(Yp yp) {
        Qp qp = new Qp();
        qp.a = yp.a;
        return qp;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new Yp(((Qp) obj).a);
    }

    public final Yp a(Qp qp) {
        return new Yp(qp.a);
    }
}
