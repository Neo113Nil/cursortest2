package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Map;

/* loaded from: classes5.dex */
public final class Pg implements Converter {
    public final Eb a;

    public Pg() {
        this(new Eb(20480, 100, 1000));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0439ll fromModel(@NonNull Map<String, String> map) {
        Rq a = this.a.a(map);
        C0658t9 c0658t9 = new C0658t9();
        c0658t9.b = ((C0221e5) a.b).b;
        Map map2 = (Map) a.a;
        if (map2 != null) {
            c0658t9.a = new C0629s9[map2.size()];
            int i = 0;
            for (Map.Entry entry : map2.entrySet()) {
                c0658t9.a[i] = new C0629s9();
                c0658t9.a[i].a = StringUtils.getUTF8Bytes((String) entry.getKey());
                c0658t9.a[i].b = StringUtils.getUTF8Bytes((String) entry.getValue());
                i++;
            }
        }
        Q3 q3 = a.b;
        int i2 = ((C0221e5) q3).a;
        return new C0439ll(c0658t9, q3);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public Pg(@NonNull Eb eb) {
        this.a = eb;
    }

    @NonNull
    public final Map<String, String> a(@NonNull C0439ll c0439ll) {
        throw new UnsupportedOperationException();
    }
}
