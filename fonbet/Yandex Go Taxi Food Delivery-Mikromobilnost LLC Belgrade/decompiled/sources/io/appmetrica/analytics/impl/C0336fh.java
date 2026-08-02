package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.fh, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0336fh implements Converter {
    public final Ub a;

    public C0336fh() {
        this(new Ub(20480, 100, 1000));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0802vl fromModel(Map<String, String> map) {
        C0490kr a = this.a.a(map);
        C0906z9 c0906z9 = new C0906z9();
        c0906z9.b = ((C0411i5) a.b).b;
        Map map2 = (Map) a.a;
        if (map2 != null) {
            c0906z9.a = new C0877y9[map2.size()];
            int i = 0;
            for (Map.Entry entry : map2.entrySet()) {
                c0906z9.a[i] = new C0877y9();
                c0906z9.a[i].a = StringUtils.getUTF8Bytes((String) entry.getKey());
                c0906z9.a[i].b = StringUtils.getUTF8Bytes((String) entry.getValue());
                i++;
            }
        }
        T3 t3 = a.b;
        int i2 = ((C0411i5) t3).a;
        return new C0802vl(c0906z9, t3);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0336fh(Ub ub) {
        this.a = ub;
    }

    public final Map<String, String> a(C0802vl c0802vl) {
        throw new UnsupportedOperationException();
    }
}
