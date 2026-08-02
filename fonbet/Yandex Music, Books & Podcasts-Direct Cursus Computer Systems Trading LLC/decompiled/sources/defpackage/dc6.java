package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class dc6 extends xci implements qof, yr5 {
    public bxj o;
    public final iyo p;
    public boolean q;
    public sh3 r;
    public wof t;
    public boolean u;
    public boolean v;
    public boolean x;
    public final xzi s = new xzi(12);
    public long w = 0;

    public dc6(bxj bxjVar, iyo iyoVar, boolean z, sh3 sh3Var) {
        this.o = bxjVar;
        this.p = iyoVar;
        this.q = z;
        this.r = sh3Var;
    }

    public static final float S0(dc6 dc6Var, sh3 sh3Var) {
        ynn ynnVar;
        int compare;
        if (hqe.a(dc6Var.w, 0L)) {
            return 0.0f;
        }
        eqi eqiVar = (eqi) dc6Var.s.a;
        int i = eqiVar.c - 1;
        Object[] objArr = eqiVar.a;
        if (i < objArr.length) {
            ynnVar = null;
            while (true) {
                if (i < 0) {
                    break;
                }
                ynn ynnVar2 = (ynn) ((cc6) objArr[i]).a.invoke();
                if (ynnVar2 != null) {
                    long e = ynnVar2.e();
                    long Q = nt0.Q(dc6Var.w);
                    int ordinal = dc6Var.o.ordinal();
                    if (ordinal == 0) {
                        compare = Float.compare(Float.intBitsToFloat((int) (e & 4294967295L)), Float.intBitsToFloat((int) (Q & 4294967295L)));
                    } else {
                        if (ordinal != 1) {
                            b6e.s();
                            return 0.0f;
                        }
                        compare = Float.compare(Float.intBitsToFloat((int) (e >> 32)), Float.intBitsToFloat((int) (Q >> 32)));
                    }
                    if (compare <= 0) {
                        ynnVar = ynnVar2;
                    } else if (ynnVar == null) {
                        ynnVar = ynnVar2;
                    }
                }
                i--;
            }
        } else {
            ynnVar = null;
        }
        if (ynnVar == null) {
            ynn T0 = dc6Var.u ? dc6Var.T0() : null;
            if (T0 == null) {
                return 0.0f;
            }
            ynnVar = T0;
        }
        long Q2 = nt0.Q(dc6Var.w);
        int ordinal2 = dc6Var.o.ordinal();
        if (ordinal2 == 0) {
            float f = ynnVar.b;
            return sh3Var.a(f, ynnVar.d - f, Float.intBitsToFloat((int) (Q2 & 4294967295L)));
        }
        if (ordinal2 == 1) {
            float f2 = ynnVar.a;
            return sh3Var.a(f2, ynnVar.c - f2, Float.intBitsToFloat((int) (Q2 >> 32)));
        }
        b6e.s();
        return 0.0f;
    }

    @Override // defpackage.xci
    public final boolean H0() {
        return false;
    }

    public final ynn T0() {
        if (this.n) {
            f8j E = bcx.E(this);
            wof wofVar = this.t;
            if (wofVar != null) {
                if (!wofVar.d()) {
                    wofVar = null;
                }
                if (wofVar != null) {
                    return E.y(wofVar, false);
                }
            }
        }
        return null;
    }

    public final boolean U0(ynn ynnVar, long j) {
        long W0 = W0(ynnVar, j);
        return Math.abs(Float.intBitsToFloat((int) (W0 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (W0 & 4294967295L))) <= 0.5f;
    }

    public final void V0() {
        sh3 sh3Var = this.r;
        if (sh3Var == null) {
            sh3Var = (sh3) men.t(this, uh3.a);
        }
        sh3 sh3Var2 = sh3Var;
        if (this.x) {
            vme.c("launchAnimation called when previous animation was running");
        }
        sh3.a.getClass();
        x97.y(G0(), null, pm6.d, new v3(this, new wmt(rh3.b), sh3Var2, null, 26), 1);
    }

    public final long W0(ynn ynnVar, long j) {
        long Q = nt0.Q(j);
        int ordinal = this.o.ordinal();
        if (ordinal == 0) {
            sh3 sh3Var = this.r;
            if (sh3Var == null) {
                sh3Var = (sh3) men.t(this, uh3.a);
            }
            float f = ynnVar.b;
            float a = sh3Var.a(f, ynnVar.d - f, Float.intBitsToFloat((int) (Q & 4294967295L)));
            return (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(a) & 4294967295L);
        }
        if (ordinal != 1) {
            b6e.s();
            return 0L;
        }
        sh3 sh3Var2 = this.r;
        if (sh3Var2 == null) {
            sh3Var2 = (sh3) men.t(this, uh3.a);
        }
        float f2 = ynnVar.a;
        return (Float.floatToRawIntBits(sh3Var2.a(f2, ynnVar.c - f2, Float.intBitsToFloat((int) (Q >> 32)))) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L);
    }

    @Override // defpackage.qof
    public final void j(long j) {
        int e;
        ynn T0;
        long j2 = this.w;
        this.w = j;
        int ordinal = this.o.ordinal();
        if (ordinal == 0) {
            e = Intrinsics.e((int) (j & 4294967295L), (int) (4294967295L & j2));
        } else {
            if (ordinal != 1) {
                b6e.s();
                return;
            }
            e = Intrinsics.e((int) (j >> 32), (int) (j2 >> 32));
        }
        if (e >= 0 || this.x || this.u || (T0 = T0()) == null || !U0(T0, j2)) {
            return;
        }
        this.v = true;
    }
}
