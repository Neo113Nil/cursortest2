package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* renamed from: io.appmetrica.analytics.impl.c4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0237c4 implements Converter {
    public final C0770ui a;
    public final C0731t8 b;
    public final C0481ki c;
    public final Ri d;

    public C0237c4() {
        this(new C0770ui(), new C0731t8(), new C0481ki(), new Ri());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0802vl fromModel(C0266d4 c0266d4) {
        C0802vl c0802vl;
        C0703s9 c0703s9 = new C0703s9();
        C0802vl fromModel = this.a.fromModel(c0266d4.a);
        c0703s9.a = (B9) fromModel.a;
        c0703s9.c = this.b.fromModel(c0266d4.b);
        C0802vl fromModel2 = this.c.fromModel(c0266d4.c);
        c0703s9.d = (A9) fromModel2.a;
        C0367gj c0367gj = c0266d4.d;
        if (c0367gj != null) {
            c0802vl = this.d.fromModel(c0367gj);
            c0703s9.b = (D9) c0802vl.a;
        } else {
            c0802vl = null;
        }
        return new C0802vl(c0703s9, new S3(S3.b(fromModel, fromModel2, c0802vl)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0237c4(C0770ui c0770ui, C0731t8 c0731t8, C0481ki c0481ki, Ri ri) {
        this.a = c0770ui;
        this.b = c0731t8;
        this.c = c0481ki;
        this.d = ri;
    }

    public final C0266d4 a(C0802vl c0802vl) {
        throw new UnsupportedOperationException();
    }
}
