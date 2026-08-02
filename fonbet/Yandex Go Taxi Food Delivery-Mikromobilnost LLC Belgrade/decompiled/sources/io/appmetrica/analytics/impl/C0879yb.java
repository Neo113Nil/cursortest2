package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.yb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0879yb implements ProtobufConverter {
    public final Zg a;

    public C0879yb() {
        this(new C0575np());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0353g5 toModel(Np np) {
        C0295e5 c0295e5 = new C0295e5();
        c0295e5.d = np.d;
        c0295e5.c = np.c;
        c0295e5.b = np.b;
        c0295e5.a = np.a;
        c0295e5.e = np.e;
        c0295e5.f = this.a.a(np.f);
        return new C0353g5(c0295e5);
    }

    public C0879yb(C0575np c0575np) {
        this.a = c0575np;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Np fromModel(C0353g5 c0353g5) {
        Np np = new Np();
        np.b = c0353g5.b;
        np.a = c0353g5.a;
        np.c = c0353g5.c;
        np.d = c0353g5.d;
        np.e = c0353g5.e;
        np.f = this.a.a(c0353g5.f);
        return np;
    }
}
