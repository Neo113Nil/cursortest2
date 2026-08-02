package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.jo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0384jo implements InterfaceC0369j9 {
    public final Wl a;

    public C0384jo() {
        this(new Wl());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C0439ll> fromModel(@NonNull C0355io c0355io) {
        C9 c9 = new C9();
        c9.a = 1;
        c9.b = new B9();
        C0439ll fromModel = this.a.fromModel(c0355io.a);
        c9.b.a = (C0802y9) fromModel.a;
        P3 p3 = new P3(P3.b(fromModel));
        fromModel.b.getBytesTruncated();
        return Collections.singletonList(new C0439ll(c9, p3));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0384jo(Wl wl) {
        this.a = wl;
    }

    @NonNull
    public final C0355io a(@NonNull List<C0439ll> list) {
        throw new UnsupportedOperationException();
    }
}
