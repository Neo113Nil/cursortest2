package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.e0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0290e0 implements Converter {
    public final C0731t8 a;
    public final Rb b;

    public C0290e0() {
        this(new C0731t8(), new Rb(20));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0802vl fromModel(C0319f0 c0319f0) {
        C0646q9 c0646q9 = new C0646q9();
        c0646q9.b = this.a.fromModel(c0319f0.a);
        C0490kr a = this.b.a(c0319f0.b);
        c0646q9.a = StringUtils.getUTF8Bytes((String) a.a);
        return new C0802vl(c0646q9, new S3(S3.b(a)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0290e0(C0731t8 c0731t8, Rb rb) {
        this.a = c0731t8;
        this.b = rb;
    }

    public final C0319f0 a(C0802vl c0802vl) {
        throw new UnsupportedOperationException();
    }
}
