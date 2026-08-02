package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ListConverter;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class Wo implements ListConverter {
    public final Xo a = new Xo();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final U6[] fromModel(List<Yo> list) {
        U6[] u6Arr = new U6[list.size()];
        Iterator<Yo> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            u6Arr[i] = this.a.fromModel(it.next());
            i++;
        }
        return u6Arr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final List<Yo> a(U6[] u6Arr) {
        throw new UnsupportedOperationException();
    }
}
