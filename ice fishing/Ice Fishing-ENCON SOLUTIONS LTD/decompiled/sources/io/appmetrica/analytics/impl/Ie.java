package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.nio.charset.Charset;
import java.util.Map;

/* loaded from: classes.dex */
public final class Ie implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final T5[] fromModel(Map<String, String> map) {
        int size = map.size();
        T5[] t5Arr = new T5[size];
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            t5Arr[i3] = new T5();
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            T5 t5 = t5Arr[i2];
            String key = entry.getKey();
            Charset charset = z1.a.f8620a;
            t5.f5092a = key.getBytes(charset);
            t5Arr[i2].f5093b = entry.getValue().getBytes(charset);
            i2++;
        }
        return t5Arr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final Map<String, String> a(T5[] t5Arr) {
        throw new UnsupportedOperationException();
    }
}
