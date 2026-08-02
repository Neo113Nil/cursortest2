package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class Wl implements Converter {
    public final Pg a;
    public final C0105a4 b;
    public final Bb c;
    public final Bb d;

    public Wl() {
        this(new Pg(), new C0105a4(), new Bb(100), new Bb(1000));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0439ll fromModel(@NonNull C0123am c0123am) {
        C0439ll c0439ll;
        C0802y9 c0802y9 = new C0802y9();
        Rq a = this.c.a(c0123am.a);
        c0802y9.a = StringUtils.getUTF8Bytes((String) a.a);
        List<String> list = c0123am.b;
        C0439ll c0439ll2 = null;
        if (list != null) {
            c0439ll = this.b.fromModel(list);
            c0802y9.b = (C0485n9) c0439ll.a;
        } else {
            c0439ll = null;
        }
        Rq a2 = this.d.a(c0123am.c);
        c0802y9.c = StringUtils.getUTF8Bytes((String) a2.a);
        Map<String, String> map = c0123am.d;
        if (map != null) {
            c0439ll2 = this.a.fromModel(map);
            c0802y9.d = (C0658t9) c0439ll2.a;
        }
        return new C0439ll(c0802y9, new P3(P3.b(a, c0439ll, a2, c0439ll2)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public Wl(Pg pg, C0105a4 c0105a4, Bb bb, Bb bb2) {
        this.a = pg;
        this.b = c0105a4;
        this.c = bb;
        this.d = bb2;
    }

    @NonNull
    public final C0123am a(@NonNull C0439ll c0439ll) {
        throw new UnsupportedOperationException();
    }
}
