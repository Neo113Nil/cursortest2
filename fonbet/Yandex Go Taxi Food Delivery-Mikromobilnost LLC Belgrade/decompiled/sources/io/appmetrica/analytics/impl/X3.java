package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes9.dex */
public final class X3 implements ProtobufConverter {
    public final Kp a(V3 v3) {
        Kp kp = new Kp();
        kp.a = v3.a;
        return kp;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        Kp kp = new Kp();
        kp.a = ((V3) obj).a;
        return kp;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new V3(((Kp) obj).a);
    }

    public final V3 a(Kp kp) {
        return new V3(kp.a);
    }
}
