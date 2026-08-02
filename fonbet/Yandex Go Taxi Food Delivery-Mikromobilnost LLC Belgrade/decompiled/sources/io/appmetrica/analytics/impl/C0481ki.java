package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.Collection;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.ki, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0481ki implements Converter {
    public final C0290e0 a;
    public final C0510li b;

    public C0481ki() {
        this(new C0290e0(), new C0510li(30));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0802vl fromModel(C0539mi c0539mi) {
        int i;
        A9 a9 = new A9();
        C0802vl fromModel = this.a.fromModel(c0539mi.a);
        a9.a = (C0646q9) fromModel.a;
        C0490kr a = this.b.a(c0539mi.b);
        if (Or.a((Collection) a.a)) {
            i = 0;
        } else {
            a9.b = new C0646q9[((List) a.a).size()];
            i = 0;
            for (int i2 = 0; i2 < ((List) a.a).size(); i2++) {
                C0802vl fromModel2 = this.a.fromModel((C0319f0) ((List) a.a).get(i2));
                a9.b[i2] = (C0646q9) fromModel2.a;
                i += fromModel2.b.getBytesTruncated();
            }
        }
        return new C0802vl(a9, new S3(S3.b(fromModel, a, new S3(i))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0481ki(C0290e0 c0290e0, C0510li c0510li) {
        this.a = c0290e0;
        this.b = c0510li;
    }

    public final C0539mi a(C0802vl c0802vl) {
        throw new UnsupportedOperationException();
    }
}
