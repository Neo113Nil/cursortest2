package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.dq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0287dq implements ProtobufConverter {
    public final Rp a(C0259cq c0259cq) {
        Rp rp = new Rp();
        rp.a = c0259cq.a;
        return rp;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        Rp rp = new Rp();
        rp.a = ((C0259cq) obj).a;
        return rp;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new C0259cq(((Rp) obj).a);
    }

    public final C0259cq a(Rp rp) {
        return new C0259cq(rp.a);
    }
}
