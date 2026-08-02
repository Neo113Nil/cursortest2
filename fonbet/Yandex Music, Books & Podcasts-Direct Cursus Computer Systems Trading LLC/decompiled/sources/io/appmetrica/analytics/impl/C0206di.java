package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.di, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0206di implements Converter {
    public final Pg a;
    public final Th b;
    public final C0105a4 c;
    public final C0263fi d;
    public final Bb e;
    public final Bb f;

    public C0206di() {
        this(new Pg(), new Th(), new C0105a4(), new C0263fi(), new Bb(100), new Bb(1000));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0439ll fromModel(@NonNull C0234ei c0234ei) {
        C0439ll c0439ll;
        C0439ll c0439ll2;
        C0439ll c0439ll3;
        C0439ll c0439ll4;
        C0716v9 c0716v9 = new C0716v9();
        Rq a = this.e.a(c0234ei.a);
        c0716v9.a = StringUtils.getUTF8Bytes((String) a.a);
        Rq a2 = this.f.a(c0234ei.b);
        c0716v9.b = StringUtils.getUTF8Bytes((String) a2.a);
        List<String> list = c0234ei.c;
        C0439ll c0439ll5 = null;
        if (list != null) {
            c0439ll = this.c.fromModel(list);
            c0716v9.c = (C0485n9) c0439ll.a;
        } else {
            c0439ll = null;
        }
        Map<String, String> map = c0234ei.d;
        if (map != null) {
            c0439ll2 = this.a.fromModel(map);
            c0716v9.d = (C0658t9) c0439ll2.a;
        } else {
            c0439ll2 = null;
        }
        Vh vh = c0234ei.e;
        if (vh != null) {
            c0439ll3 = this.b.fromModel(vh);
            c0716v9.e = (C0687u9) c0439ll3.a;
        } else {
            c0439ll3 = null;
        }
        Vh vh2 = c0234ei.f;
        if (vh2 != null) {
            c0439ll4 = this.b.fromModel(vh2);
            c0716v9.f = (C0687u9) c0439ll4.a;
        } else {
            c0439ll4 = null;
        }
        List<String> list2 = c0234ei.g;
        if (list2 != null) {
            c0439ll5 = this.d.fromModel(list2);
            c0716v9.g = (C0745w9[]) c0439ll5.a;
        }
        return new C0439ll(c0716v9, new P3(P3.b(a, a2, c0439ll, c0439ll2, c0439ll3, c0439ll4, c0439ll5)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0206di(Pg pg, Th th, C0105a4 c0105a4, C0263fi c0263fi, Bb bb, Bb bb2) {
        this.a = pg;
        this.b = th;
        this.c = c0105a4;
        this.d = c0263fi;
        this.e = bb;
        this.f = bb2;
    }

    @NonNull
    public final C0234ei a(@NonNull C0439ll c0439ll) {
        throw new UnsupportedOperationException();
    }
}
