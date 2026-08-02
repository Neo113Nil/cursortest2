package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes9.dex */
public final class Y implements ProtobufConverter {
    public final X1 a = new X1();
    public final C0937d b = new C0937d();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final X toModel(Q0 q0) {
        X1 x1 = this.a;
        W0 w0 = q0.b;
        if (w0 == null) {
            w0 = new W0();
        }
        V1 model = x1.toModel(w0);
        C0937d c0937d = this.b;
        O0 o0 = q0.a;
        if (o0 == null) {
            o0 = new O0();
        }
        return new X(model, c0937d.toModel(o0));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Q0 fromModel(X x) {
        Q0 q0 = new Q0();
        q0.b = this.a.fromModel(x.a);
        q0.a = this.b.fromModel(x.b);
        return q0;
    }
}
