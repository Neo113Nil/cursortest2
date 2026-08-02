package io.appmetrica.analytics.impl;

import defpackage.uza;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.nio.charset.Charset;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.vh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0798vh implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final O6[] fromModel(Map<String, String> map) {
        int size = map.size();
        O6[] o6Arr = new O6[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            o6Arr[i2] = new O6();
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            O6 o6 = o6Arr[i];
            String key = entry.getKey();
            Charset charset = uza.a;
            o6.a = key.getBytes(charset);
            o6Arr[i].b = entry.getValue().getBytes(charset);
            i++;
        }
        return o6Arr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final Map<String, String> a(O6[] o6Arr) {
        throw new UnsupportedOperationException();
    }
}
