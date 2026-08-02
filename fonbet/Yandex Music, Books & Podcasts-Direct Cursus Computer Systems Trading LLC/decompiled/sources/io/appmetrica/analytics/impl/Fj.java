package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class Fj extends AbstractC0697uj {
    public Fj(@NotNull P5 p5) {
        super(p5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0697uj
    public final boolean a(@NotNull H6 h6) {
        En en;
        Vn vn;
        C0630sa c0630sa = this.a.n;
        Tn tn = c0630sa.c;
        if (tn.g == 0) {
            en = tn.d.b();
            En b = tn.e.b();
            if ((en == null ? -1L : en.d) <= (b != null ? b.d : -1L)) {
                en = b;
            }
        } else {
            en = tn.f;
        }
        if (en != null) {
            vn = new Vn();
            vn.a = en.d;
            long andIncrement = en.f.getAndIncrement();
            Wn wn = en.b;
            wn.a(Wn.g, Long.valueOf(en.f.get()));
            wn.b();
            vn.b = andIncrement;
            vn.c = en.j / 1000;
            vn.d = en.c.a;
        } else {
            long j = h6.j;
            long a = tn.b.a();
            E7 e7 = tn.a.e;
            Xn xn = Xn.BACKGROUND;
            e7.a(a, xn, j);
            vn = new Vn();
            vn.a = a;
            vn.d = xn;
            vn.b = 0L;
            vn.c = 0L;
        }
        c0630sa.a(h6, vn);
        return false;
    }
}
