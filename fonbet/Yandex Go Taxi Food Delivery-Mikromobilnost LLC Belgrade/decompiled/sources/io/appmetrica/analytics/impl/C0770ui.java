package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.ui, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0770ui implements Converter {
    public final C0336fh a;
    public final C0481ki b;
    public final C0294e4 c;
    public final C0828wi d;
    public final Rb e;
    public final Rb f;

    public C0770ui() {
        this(new C0336fh(), new C0481ki(), new C0294e4(), new C0828wi(), new Rb(100), new Rb(1000));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0802vl fromModel(C0799vi c0799vi) {
        C0802vl c0802vl;
        C0802vl c0802vl2;
        C0802vl c0802vl3;
        C0802vl c0802vl4;
        B9 b9 = new B9();
        C0490kr a = this.e.a(c0799vi.a);
        b9.a = StringUtils.getUTF8Bytes((String) a.a);
        C0490kr a2 = this.f.a(c0799vi.b);
        b9.b = StringUtils.getUTF8Bytes((String) a2.a);
        List<String> list = c0799vi.c;
        C0802vl c0802vl5 = null;
        if (list != null) {
            c0802vl = this.c.fromModel(list);
            b9.c = (C0732t9) c0802vl.a;
        } else {
            c0802vl = null;
        }
        Map<String, String> map = c0799vi.d;
        if (map != null) {
            c0802vl2 = this.a.fromModel(map);
            b9.d = (C0906z9) c0802vl2.a;
        } else {
            c0802vl2 = null;
        }
        C0539mi c0539mi = c0799vi.e;
        if (c0539mi != null) {
            c0802vl3 = this.b.fromModel(c0539mi);
            b9.e = (A9) c0802vl3.a;
        } else {
            c0802vl3 = null;
        }
        C0539mi c0539mi2 = c0799vi.f;
        if (c0539mi2 != null) {
            c0802vl4 = this.b.fromModel(c0539mi2);
            b9.f = (A9) c0802vl4.a;
        } else {
            c0802vl4 = null;
        }
        List<String> list2 = c0799vi.g;
        if (list2 != null) {
            c0802vl5 = this.d.fromModel(list2);
            b9.g = (C9[]) c0802vl5.a;
        }
        return new C0802vl(b9, new S3(S3.b(a, a2, c0802vl, c0802vl2, c0802vl3, c0802vl4, c0802vl5)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0770ui(C0336fh c0336fh, C0481ki c0481ki, C0294e4 c0294e4, C0828wi c0828wi, Rb rb, Rb rb2) {
        this.a = c0336fh;
        this.b = c0481ki;
        this.c = c0294e4;
        this.d = c0828wi;
        this.e = rb;
        this.f = rb2;
    }

    public final C0799vi a(C0802vl c0802vl) {
        throw new UnsupportedOperationException();
    }
}
