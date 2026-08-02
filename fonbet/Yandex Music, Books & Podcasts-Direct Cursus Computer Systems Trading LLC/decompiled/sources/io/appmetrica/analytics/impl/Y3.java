package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* loaded from: classes5.dex */
public final class Y3 implements Converter {
    public final C0206di a;
    public final C0513o8 b;
    public final Th c;
    public final Ji d;

    public Y3() {
        this(new C0206di(), new C0513o8(), new Th(), new Ji());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0439ll fromModel(@NonNull Z3 z3) {
        C0439ll c0439ll;
        C0456m9 c0456m9 = new C0456m9();
        C0439ll fromModel = this.a.fromModel(z3.a);
        c0456m9.a = (C0716v9) fromModel.a;
        c0456m9.c = this.b.fromModel(z3.b);
        C0439ll fromModel2 = this.c.fromModel(z3.c);
        c0456m9.d = (C0687u9) fromModel2.a;
        C0120aj c0120aj = z3.d;
        if (c0120aj != null) {
            c0439ll = this.d.fromModel(c0120aj);
            c0456m9.b = (C0774x9) c0439ll.a;
        } else {
            c0439ll = null;
        }
        return new C0439ll(c0456m9, new P3(P3.b(fromModel, fromModel2, c0439ll)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public Y3(C0206di c0206di, C0513o8 c0513o8, Th th, Ji ji) {
        this.a = c0206di;
        this.b = c0513o8;
        this.c = th;
        this.d = ji;
    }

    @NonNull
    public final Z3 a(@NonNull C0439ll c0439ll) {
        throw new UnsupportedOperationException();
    }
}
