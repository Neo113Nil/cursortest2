package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0937d implements ProtobufConverter {
    public final C0965l1 a = new C0965l1();
    public final K0 b = new K0();
    public final C0984s0 c = new C0984s0();
    public final C0956i1 d = new C0956i1();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0933c toModel(O0 o0) {
        C0965l1 c0965l1 = this.a;
        R0 r0 = o0.a;
        if (r0 == null) {
            r0 = new R0();
        }
        C0962k1 model = c0965l1.toModel(r0);
        K0 k0 = this.b;
        T0 t0 = o0.b;
        if (t0 == null) {
            t0 = new T0();
        }
        I0 model2 = k0.toModel(t0);
        C0984s0 c0984s0 = this.c;
        S0 s0 = o0.c;
        if (s0 == null) {
            s0 = new S0();
        }
        C0981r0 model3 = c0984s0.toModel(s0);
        C0956i1 c0956i1 = this.d;
        V0 v0 = o0.d;
        if (v0 == null) {
            v0 = new V0();
        }
        c0956i1.getClass();
        return new C0933c(model, model2, model3, new LocationFilter(v0.a, v0.b));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final O0 fromModel(C0933c c0933c) {
        O0 o0 = new O0();
        o0.a = this.a.fromModel(c0933c.a);
        o0.b = this.b.fromModel(c0933c.b);
        o0.c = this.c.fromModel(c0933c.c);
        o0.d = this.d.fromModel(c0933c.d);
        return o0;
    }
}
