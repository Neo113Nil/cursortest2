package defpackage;

/* loaded from: classes.dex */
public final class nvc extends ysc {
    public static final pn3 c;
    public final hi3 b;

    static {
        pn3 pn3Var = pn3.d;
        c = ovn.A("0021F904");
    }

    public nvc(ij3 ij3Var) {
        super(ij3Var);
        this.b = new hi3();
    }

    public final boolean a(long j) {
        hi3 hi3Var = this.b;
        long j2 = hi3Var.b;
        if (j2 >= j) {
            return true;
        }
        long j3 = j - j2;
        return super.e0(hi3Var, j3) == j3;
    }

    @Override // defpackage.ysc, defpackage.n3r
    public final long e0(hi3 hi3Var, long j) {
        long j2;
        long j3;
        a(j);
        hi3 hi3Var2 = this.b;
        long j4 = 0;
        if (hi3Var2.b == 0) {
            return j == 0 ? 0L : -1L;
        }
        long j5 = 0;
        while (true) {
            long j6 = -1;
            while (true) {
                pn3 pn3Var = c;
                j6 = this.b.Q(pn3Var.a[0], j6 + 1, Long.MAX_VALUE);
                if (j6 == -1) {
                    j2 = j4;
                    break;
                }
                j2 = j4;
                if (a(pn3Var.a.length) && hi3Var2.A0(j6, pn3Var)) {
                    break;
                }
                j4 = j2;
            }
            if (j6 == -1) {
                break;
            }
            long e0 = hi3Var2.e0(hi3Var, j6 + 4);
            if (e0 < j2) {
                e0 = j2;
            }
            j5 += e0;
            if (a(5L) && hi3Var2.P(4L) == 0) {
                byte P = hi3Var2.P(2L);
                zdt zdtVar = aet.b;
                if ((((P & 255) << 8) | (hi3Var2.P(1L) & 255)) < 2) {
                    hi3Var.M0(hi3Var2.P(j2));
                    hi3Var.M0(10);
                    hi3Var.M0(0);
                    hi3Var2.skip(3L);
                }
            }
            j4 = 0;
        }
        if (j5 < j) {
            long e02 = hi3Var2.e0(hi3Var, j - j5);
            j3 = 0;
            if (e02 < 0) {
                e02 = 0;
            }
            j5 += e02;
        } else {
            j3 = 0;
        }
        if (j5 == j3) {
            return -1L;
        }
        return j5;
    }
}
