package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* loaded from: classes.dex */
public final class If implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0713ra f4543a;

    public If() {
        this(new C0713ra(20, 100));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Di fromModel(List<String> list) {
        Mn a2 = this.f4543a.a((List<Object>) list);
        List list2 = (List) a2.f4785a;
        C0634o8[] c0634o8Arr = new C0634o8[0];
        if (list2 != null) {
            c0634o8Arr = new C0634o8[list2.size()];
            for (int i2 = 0; i2 < list2.size(); i2++) {
                C0634o8 c0634o8 = new C0634o8();
                c0634o8Arr[i2] = c0634o8;
                c0634o8.f6667a = StringUtils.getUTF8Bytes((String) list2.get(i2));
            }
        }
        a2.f4786b.getBytesTruncated();
        return new Di(c0634o8Arr, a2.f4786b);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public If(C0713ra c0713ra) {
        this.f4543a = c0713ra;
    }

    public final List<String> a(Di di) {
        throw new UnsupportedOperationException();
    }
}
