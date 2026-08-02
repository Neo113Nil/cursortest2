package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class q2 implements ProtobufConverter {
    public final t2 a = new t2();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final p2 toModel(@NotNull C0850a1 c0850a1) {
        t2 t2Var = this.a;
        Z0 z0 = c0850a1.b;
        if (z0 == null) {
            z0 = new Z0();
        }
        t2Var.getClass();
        r2 r2Var = new r2(z0.a, z0.b);
        t2 t2Var2 = this.a;
        Z0 z02 = c0850a1.c;
        if (z02 == null) {
            z02 = new Z0();
        }
        t2Var2.getClass();
        return new p2(c0850a1.a, r2Var, new r2(z02.a, z02.b));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0850a1 fromModel(@NotNull p2 p2Var) {
        C0850a1 c0850a1 = new C0850a1();
        c0850a1.b = this.a.fromModel(p2Var.b);
        c0850a1.c = this.a.fromModel(p2Var.c);
        c0850a1.a = p2Var.a;
        return c0850a1;
    }
}
