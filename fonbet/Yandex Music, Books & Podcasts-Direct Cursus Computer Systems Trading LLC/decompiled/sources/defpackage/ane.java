package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ane extends f8j {
    public static final gh0 Z;
    public final i4s X;
    public zme Y;

    static {
        gh0 p = hld.p();
        int i = d85.o;
        p.e(d85.g);
        p.k(1.0f);
        p.l(1);
        Z = p;
    }

    public ane(mpf mpfVar) {
        super(mpfVar);
        i4s i4sVar = new i4s();
        i4sVar.d = 0;
        this.X = i4sVar;
        i4sVar.h = this;
        this.Y = mpfVar.h != null ? new zme(this) : null;
    }

    @Override // defpackage.twg
    public final int C0(v2e v2eVar) {
        zme zmeVar = this.Y;
        if (zmeVar != null) {
            return zmeVar.C0(v2eVar);
        }
        jfh jfhVar = this.l.G.p;
        npf npfVar = jfhVar.y;
        if (!jfhVar.m) {
            if (jfhVar.f.d == ipf.a) {
                npfVar.f = true;
                if (npfVar.b) {
                    jfhVar.w = true;
                    jfhVar.x = true;
                }
            } else {
                npfVar.g = true;
            }
        }
        jfhVar.D().h = true;
        jfhVar.r();
        jfhVar.D().h = false;
        Integer num = (Integer) npfVar.i.get(v2eVar);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.ffh
    public final int G(int i) {
        aqd t = this.l.t();
        kfh i2 = t.i();
        mpf mpfVar = (mpf) t.b;
        return i2.c((f8j) mpfVar.F.d, mpfVar.n(), i);
    }

    @Override // defpackage.ffh
    public final int J(int i) {
        aqd t = this.l.t();
        kfh i2 = t.i();
        mpf mpfVar = (mpf) t.b;
        return i2.a((f8j) mpfVar.F.d, mpfVar.n(), i);
    }

    @Override // defpackage.ffh
    public final ksk M(long j) {
        z0(j);
        mpf mpfVar = this.l;
        eqi y = mpfVar.y();
        Object[] objArr = y.a;
        int i = y.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((mpf) objArr[i2]).G.p.l = kpf.c;
        }
        t1(mpfVar.w.b(this, mpfVar.n(), j));
        n1();
        return this;
    }

    @Override // defpackage.f8j
    public final void V0() {
        if (this.Y == null) {
            this.Y = new zme(this);
        }
    }

    @Override // defpackage.f8j
    public final vwg Z0() {
        return this.Y;
    }

    @Override // defpackage.ffh
    public final int a(int i) {
        aqd t = this.l.t();
        kfh i2 = t.i();
        mpf mpfVar = (mpf) t.b;
        return i2.d((f8j) mpfVar.F.d, mpfVar.n(), i);
    }

    @Override // defpackage.f8j
    public final xci b1() {
        return this.X;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [xci] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [xci] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v10, types: [eqi] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [eqi] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // defpackage.f8j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h1(b8j b8jVar, long j, gzd gzdVar, int i, boolean z) {
        int i2;
        boolean z2;
        boolean z3;
        long j2 = j;
        mpf mpfVar = this.l;
        b8j b8jVar2 = b8jVar;
        if (b8jVar2.x(mpfVar)) {
            if (z1(j2)) {
                i2 = i;
                z2 = z;
                z3 = true;
            } else {
                i2 = i;
                if (i2 == 1 && (Float.floatToRawIntBits(S0(j2, a1())) & Integer.MAX_VALUE) < 2139095040) {
                    z3 = true;
                    z2 = false;
                }
            }
            if (z3) {
                return;
            }
            int i3 = gzdVar.c;
            eqi x = mpfVar.x();
            Object[] objArr = x.a;
            int i4 = x.c - 1;
            loop0: while (i4 >= 0) {
                mpf mpfVar2 = (mpf) objArr[i4];
                if (mpfVar2.H()) {
                    b8jVar2.w(mpfVar2, j2, gzdVar, i2, z2);
                    long a = gzdVar.a();
                    if (quj.O(a) < 0.0f && quj.X(a) && !quj.W(a)) {
                        f8j f8jVar = (f8j) mpfVar2.F.d;
                        f8jVar.getClass();
                        xci d1 = f8jVar.d1(g8j.g(16));
                        if (d1 == null || !d1.n) {
                            break;
                        }
                        if (!d1.a.n) {
                            sme.b("visitLocalDescendants called on an unattached node");
                        }
                        xci xciVar = d1.a;
                        if ((xciVar.d & 16) == 0) {
                            break;
                        }
                        while (xciVar != null) {
                            if ((xciVar.c & 16) != 0) {
                                cw7 cw7Var = xciVar;
                                ?? r6 = 0;
                                while (cw7Var != 0) {
                                    if (cw7Var instanceof ofm) {
                                        if (((ofm) cw7Var).z0()) {
                                            gzdVar.c = gzdVar.a.b - 1;
                                        }
                                    } else if ((cw7Var.c & 16) != 0 && (cw7Var instanceof cw7)) {
                                        xci xciVar2 = cw7Var.p;
                                        int i5 = 0;
                                        cw7Var = cw7Var;
                                        r6 = r6;
                                        while (xciVar2 != null) {
                                            if ((xciVar2.c & 16) != 0) {
                                                i5++;
                                                r6 = r6;
                                                if (i5 == 1) {
                                                    cw7Var = xciVar2;
                                                } else {
                                                    if (r6 == 0) {
                                                        r6 = new eqi(new xci[16]);
                                                    }
                                                    if (cw7Var != 0) {
                                                        r6.d(cw7Var);
                                                        cw7Var = 0;
                                                    }
                                                    r6.d(xciVar2);
                                                }
                                            }
                                            xciVar2 = xciVar2.f;
                                            cw7Var = cw7Var;
                                            r6 = r6;
                                        }
                                        if (i5 == 1) {
                                        }
                                    }
                                    cw7Var = bcx.p(r6);
                                }
                            }
                            xciVar = xciVar.f;
                        }
                        break loop0;
                    }
                }
                i4--;
                b8jVar2 = b8jVar;
                j2 = j;
                i2 = i;
            }
            gzdVar.c = i3;
            return;
        }
        i2 = i;
        z2 = z;
        z3 = false;
        if (z3) {
        }
    }

    @Override // defpackage.f8j, defpackage.ksk
    public final void p0(long j, float f, xod xodVar) {
        r1(j, f, null, xodVar);
        if (this.g) {
            return;
        }
        this.l.G.p.J0();
    }

    @Override // defpackage.f8j
    public final void q1(mu3 mu3Var, xod xodVar) {
        mpf mpfVar = this.l;
        uzj a = ppf.a(mpfVar);
        eqi x = mpfVar.x();
        Object[] objArr = x.a;
        int i = x.c;
        for (int i2 = 0; i2 < i; i2++) {
            mpf mpfVar2 = (mpf) objArr[i2];
            if (mpfVar2.H()) {
                mpfVar2.j(mu3Var, xodVar);
            }
        }
        if (a.getShowLayoutBounds()) {
            long j = this.c;
            mu3Var.t(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, Z);
        }
    }

    @Override // defpackage.ksk
    public final void r0(long j, float f, Function1 function1) {
        r1(j, f, function1, null);
        if (this.g) {
            return;
        }
        this.l.G.p.J0();
    }

    @Override // defpackage.ffh
    public final int z(int i) {
        aqd t = this.l.t();
        kfh i2 = t.i();
        mpf mpfVar = (mpf) t.b;
        return i2.e((f8j) mpfVar.F.d, mpfVar.n(), i);
    }
}
