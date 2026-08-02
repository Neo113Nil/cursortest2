package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0860d implements ProtobufConverter {
    public final C0890l1 a = new C0890l1();
    public final K0 b = new K0();
    public final C0909s0 c = new C0909s0();
    public final C0881i1 d = new C0881i1();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0856c toModel(@NotNull P0 p0) {
        C0890l1 c0890l1 = this.a;
        S0 s0 = p0.a;
        if (s0 == null) {
            s0 = new S0();
        }
        C0887k1 model = c0890l1.toModel(s0);
        K0 k0 = this.b;
        U0 u0 = p0.b;
        if (u0 == null) {
            u0 = new U0();
        }
        I0 model2 = k0.toModel(u0);
        C0909s0 c0909s0 = this.c;
        T0 t0 = p0.c;
        if (t0 == null) {
            t0 = new T0();
        }
        C0906r0 model3 = c0909s0.toModel(t0);
        C0881i1 c0881i1 = this.d;
        W0 w0 = p0.d;
        if (w0 == null) {
            w0 = new W0();
        }
        c0881i1.getClass();
        return new C0856c(model, model2, model3, new LocationFilter(w0.a, w0.b));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final P0 fromModel(@NotNull C0856c c0856c) {
        P0 p0 = new P0();
        p0.a = this.a.fromModel(c0856c.a);
        p0.b = this.b.fromModel(c0856c.b);
        p0.c = this.c.fromModel(c0856c.c);
        p0.d = this.d.fromModel(c0856c.d);
        return p0;
    }
}
