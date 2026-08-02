package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes4.dex */
public final class Ri implements Converter {
    public final C0572nm a;
    public final Rb b;
    public final Rb c;

    public Ri() {
        this(new C0572nm(), new Rb(100), new Rb(2048));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0802vl fromModel(C0367gj c0367gj) {
        C0802vl c0802vl;
        D9 d9 = new D9();
        C0490kr a = this.b.a(c0367gj.a);
        d9.a = StringUtils.getUTF8Bytes((String) a.a);
        C0490kr a2 = this.c.a(c0367gj.b);
        d9.b = StringUtils.getUTF8Bytes((String) a2.a);
        C0687rm c0687rm = c0367gj.c;
        if (c0687rm != null) {
            c0802vl = this.a.fromModel(c0687rm);
            d9.c = (E9) c0802vl.a;
        } else {
            c0802vl = null;
        }
        return new C0802vl(d9, new S3(S3.b(a, a2, c0802vl)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Ri(C0572nm c0572nm, Rb rb, Rb rb2) {
        this.a = c0572nm;
        this.b = rb;
        this.c = rb2;
    }

    public final C0367gj a(C0802vl c0802vl) {
        throw new UnsupportedOperationException();
    }
}
