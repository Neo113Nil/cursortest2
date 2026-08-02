package defpackage;

/* loaded from: classes.dex */
public final class bd6 extends xci implements ipa, epf {
    public w4k o;
    public g40 p;
    public jd6 q;
    public float r;
    public m85 s;

    @Override // defpackage.epf
    public final int E(twg twgVar, ffh ffhVar, int i) {
        if (this.o.i() == 9205357640488583168L) {
            return ffhVar.a(i);
        }
        int a = ffhVar.a(ga6.i(T0(ia6.b(i, 0, 13))));
        return Math.max(eeh.b(nmq.b(S0(a4g.i(i, a)))), a);
    }

    @Override // defpackage.xci
    public final boolean H0() {
        return false;
    }

    @Override // defpackage.epf
    public final int M(twg twgVar, ffh ffhVar, int i) {
        if (this.o.i() == 9205357640488583168L) {
            return ffhVar.G(i);
        }
        int G = ffhVar.G(ga6.h(T0(ia6.b(0, i, 7))));
        return Math.max(eeh.b(nmq.d(S0(a4g.i(G, i)))), G);
    }

    public final long S0(long j) {
        if (nmq.e(j)) {
            return 0L;
        }
        long i = this.o.i();
        if (i == 9205357640488583168L) {
            return j;
        }
        float d = nmq.d(i);
        if (Float.isInfinite(d) || Float.isNaN(d)) {
            d = nmq.d(j);
        }
        float b = nmq.b(i);
        if (Float.isInfinite(b) || Float.isNaN(b)) {
            b = nmq.b(j);
        }
        long i2 = a4g.i(d, b);
        long f = this.q.f(i2, j);
        float a = sso.a(f);
        if (Float.isInfinite(a) || Float.isNaN(a)) {
            return j;
        }
        float b2 = sso.b(f);
        return (Float.isInfinite(b2) || Float.isNaN(b2)) ? j : pcg.O(i2, f);
    }

    public final long T0(long j) {
        float k;
        int j2;
        float c;
        boolean g = ga6.g(j);
        boolean f = ga6.f(j);
        if (!g || !f) {
            boolean z = ga6.e(j) && ga6.d(j);
            long i = this.o.i();
            if (i != 9205357640488583168L) {
                if (z && (g || f)) {
                    k = ga6.i(j);
                    j2 = ga6.h(j);
                } else {
                    float d = nmq.d(i);
                    float b = nmq.b(i);
                    if (Float.isInfinite(d) || Float.isNaN(d)) {
                        k = ga6.k(j);
                    } else {
                        xkn xknVar = zvt.b;
                        k = yhn.c(d, ga6.k(j), ga6.i(j));
                    }
                    if (!Float.isInfinite(b) && !Float.isNaN(b)) {
                        xkn xknVar2 = zvt.b;
                        c = yhn.c(b, ga6.j(j), ga6.h(j));
                        long S0 = S0(a4g.i(k, c));
                        return ga6.b(j, ia6.g(eeh.b(nmq.d(S0)), j), 0, ia6.f(eeh.b(nmq.b(S0)), j), 0, 10);
                    }
                    j2 = ga6.j(j);
                }
                c = j2;
                long S02 = S0(a4g.i(k, c));
                return ga6.b(j, ia6.g(eeh.b(nmq.d(S02)), j), 0, ia6.f(eeh.b(nmq.b(S02)), j), 0, 10);
            }
            if (z) {
                return ga6.b(j, ga6.i(j), 0, ga6.h(j), 0, 10);
            }
        }
        return j;
    }

    @Override // defpackage.epf
    public final int b(twg twgVar, ffh ffhVar, int i) {
        if (this.o.i() == 9205357640488583168L) {
            return ffhVar.J(i);
        }
        int J = ffhVar.J(ga6.h(T0(ia6.b(0, i, 7))));
        return Math.max(eeh.b(nmq.d(S0(a4g.i(J, i)))), J);
    }

    @Override // defpackage.epf
    public final lfh c(mfh mfhVar, ffh ffhVar, long j) {
        ksk M = ffhVar.M(T0(j));
        return mfh.m0(mfhVar, M.a, M.b, new ai0(M, 4));
    }

    @Override // defpackage.epf
    public final int p0(twg twgVar, ffh ffhVar, int i) {
        if (this.o.i() == 9205357640488583168L) {
            return ffhVar.z(i);
        }
        int z = ffhVar.z(ga6.i(T0(ia6.b(i, 0, 13))));
        return Math.max(eeh.b(nmq.b(S0(a4g.i(i, z)))), z);
    }

    @Override // defpackage.ipa
    public final void t0(opf opfVar) {
        ou3 ou3Var = opfVar.a;
        long S0 = S0(ou3Var.e());
        g40 g40Var = this.p;
        xkn xknVar = zvt.b;
        long p = nt0.p(eeh.b(nmq.d(S0)), eeh.b(nmq.b(S0)));
        long e = ou3Var.e();
        long a = g40Var.a(p, nt0.p(eeh.b(nmq.d(e)), eeh.b(nmq.b(e))), opfVar.getLayoutDirection());
        float f = (int) (a >> 32);
        float f2 = (int) (a & 4294967295L);
        ((xzi) ou3Var.b.b).m0(f, f2);
        this.o.g(opfVar, S0, this.r, this.s);
        ((xzi) ou3Var.b.b).m0(-f, -f2);
        opfVar.a();
    }
}
