package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes9.dex */
public final class q2 implements ProtobufConverter {
    public final t2 a = new t2();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final p2 toModel(Z0 z0) {
        t2 t2Var = this.a;
        Y0 y0 = z0.b;
        if (y0 == null) {
            y0 = new Y0();
        }
        t2Var.getClass();
        r2 r2Var = new r2(y0.a, y0.b);
        t2 t2Var2 = this.a;
        Y0 y02 = z0.c;
        if (y02 == null) {
            y02 = new Y0();
        }
        t2Var2.getClass();
        return new p2(z0.a, r2Var, new r2(y02.a, y02.b));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Z0 fromModel(p2 p2Var) {
        Z0 z0 = new Z0();
        z0.b = this.a.fromModel(p2Var.b);
        z0.c = this.a.fromModel(p2Var.c);
        z0.a = p2Var.a;
        return z0;
    }
}
