package defpackage;

/* loaded from: classes.dex */
public final class wwg implements wof {
    public final vwg a;

    public wwg(vwg vwgVar) {
        this.a = vwgVar;
    }

    @Override // defpackage.wof
    public final long A(long j) {
        return this.a.l.A(enj.h(j, a()));
    }

    @Override // defpackage.wof
    public final void E(float[] fArr) {
        this.a.l.E(fArr);
    }

    @Override // defpackage.wof
    public final long K(long j) {
        return this.a.l.K(enj.h(0L, a()));
    }

    @Override // defpackage.wof
    public final wof Q() {
        vwg Z0;
        if (!d()) {
            sme.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        f8j f8jVar = ((f8j) this.a.l.l.F.d).n;
        if (f8jVar == null || (Z0 = f8jVar.Z0()) == null) {
            return null;
        }
        return Z0.o;
    }

    @Override // defpackage.wof
    public final long S(long j) {
        return this.a.l.S(enj.h(j, a()));
    }

    public final long a() {
        vwg vwgVar = this.a;
        vwg E = p1g.E(vwgVar);
        return enj.g(b(E.o, 0L), vwgVar.l.k1(E.l, 0L));
    }

    public final long b(wof wofVar, long j) {
        boolean z = wofVar instanceof wwg;
        vwg vwgVar = this.a;
        if (!z) {
            vwg E = p1g.E(vwgVar);
            f8j f8jVar = E.l;
            long b = b(E.o, j);
            long j2 = E.m;
            long g = enj.g(b, (4294967295L & Float.floatToRawIntBits((int) (j2 & 4294967295L))) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32));
            if (!f8jVar.b1().n) {
                sme.b("LayoutCoordinate operations are only valid when isAttached is true");
            }
            f8jVar.m1();
            f8j f8jVar2 = f8jVar.n;
            if (f8jVar2 != null) {
                f8jVar = f8jVar2;
            }
            return enj.h(g, f8jVar.k1(wofVar, 0L));
        }
        vwg vwgVar2 = ((wwg) wofVar).a;
        f8j f8jVar3 = vwgVar2.l;
        f8jVar3.m1();
        vwg Z0 = vwgVar.l.W0(f8jVar3).Z0();
        if (Z0 != null) {
            long c = wpe.c(wpe.d(vwgVar2.S0(Z0, false), xv.Q(j)), vwgVar.S0(Z0, false));
            return (Float.floatToRawIntBits((int) (c >> 32)) << 32) | (Float.floatToRawIntBits((int) (c & 4294967295L)) & 4294967295L);
        }
        vwg E2 = p1g.E(vwgVar2);
        long d = wpe.d(wpe.d(vwgVar2.S0(E2, false), E2.m), xv.Q(j));
        vwg E3 = p1g.E(vwgVar);
        long c2 = wpe.c(d, wpe.d(vwgVar.S0(E3, false), E3.m));
        long floatToRawIntBits = Float.floatToRawIntBits((int) (c2 >> 32));
        long floatToRawIntBits2 = Float.floatToRawIntBits((int) (c2 & 4294967295L)) & 4294967295L;
        f8j f8jVar4 = E3.l.n;
        f8jVar4.getClass();
        f8j f8jVar5 = E2.l.n;
        f8jVar5.getClass();
        return f8jVar4.k1(f8jVar5, floatToRawIntBits2 | (floatToRawIntBits << 32));
    }

    @Override // defpackage.wof
    public final boolean d() {
        return this.a.l.b1().n;
    }

    @Override // defpackage.wof
    public final void h(wof wofVar, float[] fArr) {
        this.a.l.h(wofVar, fArr);
    }

    @Override // defpackage.wof
    public final long j() {
        vwg vwgVar = this.a;
        return (vwgVar.a << 32) | (vwgVar.b & 4294967295L);
    }

    @Override // defpackage.wof
    public final long k(long j) {
        return enj.h(this.a.l.k(j), a());
    }

    @Override // defpackage.wof
    public final long v(wof wofVar, long j) {
        return b(wofVar, j);
    }

    @Override // defpackage.wof
    public final long x(long j) {
        return enj.h(this.a.l.x(j), a());
    }

    @Override // defpackage.wof
    public final ynn y(wof wofVar, boolean z) {
        return this.a.l.y(wofVar, z);
    }
}
