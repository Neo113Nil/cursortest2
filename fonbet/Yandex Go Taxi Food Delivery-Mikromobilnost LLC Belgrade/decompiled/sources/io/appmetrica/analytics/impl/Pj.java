package io.appmetrica.analytics.impl;

/* loaded from: classes9.dex */
public final class Pj extends Aj {
    public Pj(S5 s5) {
        super(s5);
    }

    @Override // io.appmetrica.analytics.impl.Aj
    public final boolean a(K6 k6) {
        Wn wn;
        C0661qo c0661qo;
        boolean z;
        boolean z2;
        C0907za c0907za = this.a.n;
        C0574no c0574no = c0907za.c;
        if (c0574no.g == 0) {
            wn = c0574no.c.a();
            Wn a = c0574no.d.a();
            if ((wn == null ? -1L : wn.d) <= (a != null ? a.d : -1L)) {
                wn = a;
            }
        } else {
            wn = c0574no.f;
        }
        if (wn != null) {
            synchronized (wn) {
                z2 = wn.k;
            }
            if (z2) {
                C0603oo a2 = c0574no.a.e.a(wn.d, wn.c.a);
                long j = k6.i;
                long j2 = k6.j;
                c0574no.g = 2;
                Wn a3 = c0574no.e.a(new Xn(j, j2, a2));
                c0574no.f = a3;
                c0574no.a(a3.d);
                c0661qo = C0574no.a(c0574no.f, j);
            } else {
                c0661qo = new C0661qo();
                c0661qo.a = wn.d;
                long andIncrement = wn.g.getAndIncrement();
                C0689ro c0689ro = wn.b;
                c0689ro.a(C0689ro.g, Long.valueOf(wn.g.get()));
                c0689ro.a();
                c0661qo.b = andIncrement;
                long j3 = k6.j;
                long j4 = k6.i;
                long j5 = (j3 - wn.f) / 1000;
                C0689ro c0689ro2 = wn.b;
                long j6 = j4 - wn.e;
                wn.j = j6;
                c0689ro2.a(C0689ro.e, Long.valueOf(j6));
                c0689ro2.a();
                c0661qo.c = Math.max(j5, wn.j / 1000);
                c0661qo.d = wn.c.a;
            }
        } else {
            c0661qo = null;
        }
        if (c0661qo != null) {
            c0907za.a(k6, c0661qo);
            z = true;
        } else {
            z = false;
        }
        return !z;
    }
}
