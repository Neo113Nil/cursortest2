package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.e4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0294e4 implements Converter {
    public final Qb a;

    public C0294e4() {
        this(new Qb(20, 100));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0802vl fromModel(List<String> list) {
        C0490kr a = this.a.a((List<Object>) list);
        C0732t9 c0732t9 = new C0732t9();
        c0732t9.a = StringUtils.getUTF8Bytes((List<String>) a.a);
        T3 t3 = a.b;
        int i = ((C0411i5) t3).a;
        return new C0802vl(c0732t9, t3);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0294e4(Qb qb) {
        this.a = qb;
    }

    public final List<String> a(C0802vl c0802vl) {
        throw new UnsupportedOperationException();
    }
}
