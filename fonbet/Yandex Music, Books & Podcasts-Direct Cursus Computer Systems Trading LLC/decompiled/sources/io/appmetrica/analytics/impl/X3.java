package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public final class X3 implements InterfaceC0369j9 {
    public final Y3 a;

    public X3() {
        this(new Y3());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C0439ll> fromModel(@NonNull W3 w3) {
        C9 c9 = new C9();
        c9.e = new C0427l9();
        C0439ll fromModel = this.a.fromModel(w3.b);
        c9.e.a = (C0456m9) fromModel.a;
        c9.a = w3.a;
        return Collections.singletonList(new C0439ll(c9, new P3(P3.b(fromModel))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public X3(Y3 y3) {
        this.a = y3;
    }

    @NonNull
    public final W3 a(@NonNull List<C0439ll> list) {
        throw new UnsupportedOperationException();
    }
}
