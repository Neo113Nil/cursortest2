package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.fo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0269fo implements InterfaceC0369j9 {
    public final Wl a;
    public final C0206di b;

    public C0269fo() {
        this(new Wl(), new C0206di());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C0439ll> fromModel(@NonNull C0240eo c0240eo) {
        C9 c9 = new C9();
        c9.a = 2;
        c9.c = new C0830z9();
        C0439ll fromModel = this.a.fromModel(c0240eo.b);
        c9.c.b = (C0802y9) fromModel.a;
        C0439ll fromModel2 = this.b.fromModel(c0240eo.a);
        c9.c.a = (C0716v9) fromModel2.a;
        return Collections.singletonList(new C0439ll(c9, new P3(P3.b(fromModel, fromModel2))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0269fo(Wl wl, C0206di c0206di) {
        this.a = wl;
        this.b = c0206di;
    }

    @NonNull
    public final C0240eo a(@NonNull List<C0439ll> list) {
        throw new UnsupportedOperationException();
    }
}
