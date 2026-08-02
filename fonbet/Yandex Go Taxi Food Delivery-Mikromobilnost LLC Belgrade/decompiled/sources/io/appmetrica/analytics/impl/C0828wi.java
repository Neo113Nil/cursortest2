package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.wi, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0828wi implements Converter {
    public final Qb a;

    public C0828wi() {
        this(new Qb(20, 100));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0802vl fromModel(List<String> list) {
        C0490kr a = this.a.a((List<Object>) list);
        List list2 = (List) a.a;
        C9[] c9Arr = new C9[0];
        if (list2 != null) {
            c9Arr = new C9[list2.size()];
            for (int i = 0; i < list2.size(); i++) {
                C9 c9 = new C9();
                c9Arr[i] = c9;
                c9.a = StringUtils.getUTF8Bytes((String) list2.get(i));
            }
        }
        a.b.getBytesTruncated();
        return new C0802vl(c9Arr, a.b);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0828wi(Qb qb) {
        this.a = qb;
    }

    public final List<String> a(C0802vl c0802vl) {
        throw new UnsupportedOperationException();
    }
}
