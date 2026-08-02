package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes5.dex */
public final class Ji implements Converter {
    public final Wl a;
    public final Bb b;
    public final Bb c;

    public Ji() {
        this(new Wl(), new Bb(100), new Bb(2048));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0439ll fromModel(@NonNull C0120aj c0120aj) {
        C0439ll c0439ll;
        C0774x9 c0774x9 = new C0774x9();
        Rq a = this.b.a(c0120aj.a);
        c0774x9.a = StringUtils.getUTF8Bytes((String) a.a);
        Rq a2 = this.c.a(c0120aj.b);
        c0774x9.b = StringUtils.getUTF8Bytes((String) a2.a);
        C0123am c0123am = c0120aj.c;
        if (c0123am != null) {
            c0439ll = this.a.fromModel(c0123am);
            c0774x9.c = (C0802y9) c0439ll.a;
        } else {
            c0439ll = null;
        }
        return new C0439ll(c0774x9, new P3(P3.b(a, a2, c0439ll)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public Ji(Wl wl, Bb bb, Bb bb2) {
        this.a = wl;
        this.b = bb;
        this.c = bb2;
    }

    @NonNull
    public final C0120aj a(@NonNull C0439ll c0439ll) {
        throw new UnsupportedOperationException();
    }
}
