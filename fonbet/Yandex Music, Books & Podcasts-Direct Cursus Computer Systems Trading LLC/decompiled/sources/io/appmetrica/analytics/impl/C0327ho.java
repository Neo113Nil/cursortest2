package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.ho, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0327ho implements InterfaceC0369j9 {
    public final C0206di a;
    public final Ji b;

    public C0327ho() {
        this(new C0206di(), new Ji());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C0439ll> fromModel(@NonNull C0298go c0298go) {
        C0439ll c0439ll;
        C9 c9 = new C9();
        c9.a = 3;
        c9.d = new A9();
        C0439ll fromModel = this.a.fromModel(c0298go.a);
        c9.d.a = (C0716v9) fromModel.a;
        C0120aj c0120aj = c0298go.b;
        if (c0120aj != null) {
            c0439ll = this.b.fromModel(c0120aj);
            c9.d.b = (C0774x9) c0439ll.a;
        } else {
            c0439ll = null;
        }
        return Collections.singletonList(new C0439ll(c9, new P3(P3.b(fromModel, c0439ll))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0327ho(C0206di c0206di, Ji ji) {
        this.a = c0206di;
        this.b = ji;
    }

    @NonNull
    public final C0298go a(@NonNull List<C0439ll> list) {
        throw new UnsupportedOperationException();
    }
}
