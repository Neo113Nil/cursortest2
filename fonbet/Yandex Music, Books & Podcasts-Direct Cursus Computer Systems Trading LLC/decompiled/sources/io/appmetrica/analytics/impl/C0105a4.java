package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.a4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0105a4 implements Converter {
    public final Ab a;

    public C0105a4() {
        this(new Ab(20, 100));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0439ll fromModel(@NonNull List<String> list) {
        Rq a = this.a.a((List<Object>) list);
        C0485n9 c0485n9 = new C0485n9();
        c0485n9.a = StringUtils.getUTF8Bytes((List<String>) a.a);
        Q3 q3 = a.b;
        int i = ((C0221e5) q3).a;
        return new C0439ll(c0485n9, q3);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0105a4(@NonNull Ab ab) {
        this.a = ab;
    }

    @NonNull
    public final List<String> a(@NonNull C0439ll c0439ll) {
        throw new UnsupportedOperationException();
    }
}
