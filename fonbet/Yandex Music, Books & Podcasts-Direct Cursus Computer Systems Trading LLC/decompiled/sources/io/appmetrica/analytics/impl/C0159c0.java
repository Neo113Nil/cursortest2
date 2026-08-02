package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.c0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0159c0 implements Converter {
    public final C0513o8 a;
    public final Bb b;

    public C0159c0() {
        this(new C0513o8(), new Bb(20));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0439ll fromModel(@NonNull C0188d0 c0188d0) {
        C0398k9 c0398k9 = new C0398k9();
        c0398k9.b = this.a.fromModel(c0188d0.a);
        Rq a = this.b.a(c0188d0.b);
        c0398k9.a = StringUtils.getUTF8Bytes((String) a.a);
        return new C0439ll(c0398k9, new P3(P3.b(a)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0159c0(C0513o8 c0513o8, Bb bb) {
        this.a = c0513o8;
        this.b = bb;
    }

    @NonNull
    public final C0188d0 a(@NonNull C0439ll c0439ll) {
        throw new UnsupportedOperationException();
    }
}
