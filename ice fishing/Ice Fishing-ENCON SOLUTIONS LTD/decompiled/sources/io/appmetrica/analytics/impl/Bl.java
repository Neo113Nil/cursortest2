package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ListConverter;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class Bl implements ListConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Cl f4224a = new Cl();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Z5[] fromModel(List<Dl> list) {
        Z5[] z5Arr = new Z5[list.size()];
        Iterator<Dl> it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            z5Arr[i2] = this.f4224a.fromModel(it.next());
            i2++;
        }
        return z5Arr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final List<Dl> a(Z5[] z5Arr) {
        throw new UnsupportedOperationException();
    }
}
