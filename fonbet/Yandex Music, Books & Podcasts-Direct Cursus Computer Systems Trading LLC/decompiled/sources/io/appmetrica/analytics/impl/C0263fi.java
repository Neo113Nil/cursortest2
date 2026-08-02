package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.fi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0263fi implements Converter {
    public final Ab a;

    public C0263fi() {
        this(new Ab(20, 100));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0439ll fromModel(@NonNull List<String> list) {
        Rq a = this.a.a((List<Object>) list);
        List list2 = (List) a.a;
        C0745w9[] c0745w9Arr = new C0745w9[0];
        if (list2 != null) {
            c0745w9Arr = new C0745w9[list2.size()];
            for (int i = 0; i < list2.size(); i++) {
                C0745w9 c0745w9 = new C0745w9();
                c0745w9Arr[i] = c0745w9;
                c0745w9.a = StringUtils.getUTF8Bytes((String) list2.get(i));
            }
        }
        a.b.getBytesTruncated();
        return new C0439ll(c0745w9Arr, a.b);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0263fi(@NonNull Ab ab) {
        this.a = ab;
    }

    @NonNull
    public final List<String> a(@NonNull C0439ll c0439ll) {
        throw new UnsupportedOperationException();
    }
}
