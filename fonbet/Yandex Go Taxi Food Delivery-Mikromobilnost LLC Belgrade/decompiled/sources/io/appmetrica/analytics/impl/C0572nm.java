package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.nm, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0572nm implements Converter {
    public final C0336fh a;
    public final C0294e4 b;
    public final Rb c;
    public final Rb d;

    public C0572nm() {
        this(new C0336fh(), new C0294e4(), new Rb(100), new Rb(1000));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0802vl fromModel(C0687rm c0687rm) {
        C0802vl c0802vl;
        E9 e9 = new E9();
        C0490kr a = this.c.a(c0687rm.a);
        e9.a = StringUtils.getUTF8Bytes((String) a.a);
        List<String> list = c0687rm.b;
        C0802vl c0802vl2 = null;
        if (list != null) {
            c0802vl = this.b.fromModel(list);
            e9.b = (C0732t9) c0802vl.a;
        } else {
            c0802vl = null;
        }
        C0490kr a2 = this.d.a(c0687rm.c);
        e9.c = StringUtils.getUTF8Bytes((String) a2.a);
        Map<String, String> map = c0687rm.d;
        if (map != null) {
            c0802vl2 = this.a.fromModel(map);
            e9.d = (C0906z9) c0802vl2.a;
        }
        return new C0802vl(e9, new S3(S3.b(a, c0802vl, a2, c0802vl2)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0572nm(C0336fh c0336fh, C0294e4 c0294e4, Rb rb, Rb rb2) {
        this.a = c0336fh;
        this.b = c0294e4;
        this.c = rb;
        this.d = rb2;
    }

    public final C0687rm a(C0802vl c0802vl) {
        throw new UnsupportedOperationException();
    }
}
