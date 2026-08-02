package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.j0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0434j0 implements ProtobufConverter {
    public final C0233c0 a;
    public final C0240c7 b;

    public C0434j0() {
        this(new C0233c0(new Vq()), new C0240c7());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final N6 fromModel(C0406i0 c0406i0) {
        N6 n6 = new N6();
        n6.a = this.a.fromModel(c0406i0.a);
        String str = c0406i0.b;
        if (str != null) {
            n6.b = str;
        }
        n6.c = this.b.a(c0406i0.c);
        return n6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0434j0(C0233c0 c0233c0, C0240c7 c0240c7) {
        this.a = c0233c0;
        this.b = c0240c7;
    }

    public final C0406i0 a(N6 n6) {
        throw new UnsupportedOperationException();
    }
}
