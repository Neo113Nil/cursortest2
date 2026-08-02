package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class y8w extends jbp {
    public final kkp l;
    public final int m;
    public final jml n;
    public final long o;
    public final long p;

    public y8w(onh onhVar, f0c f0cVar, ip3 ip3Var, ExecutorService executorService, long j, int i) {
        super(onhVar, f0cVar, ip3Var, executorService);
        this.o = j;
        this.p = -9223372036854775807L;
        this.l = new kkp(20);
        this.m = i;
        this.n = new jml();
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x01a8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0198 A[SYNTHETIC] */
    @Override // defpackage.jbp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList d(jp3 jp3Var, icc iccVar, boolean z) {
        d97 d97Var;
        nj njVar;
        int i;
        long j;
        long j2;
        o97 au1Var;
        long j3;
        y8w y8wVar = this;
        boolean z2 = z;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (d97 d97Var2 = (d97) iccVar; i2 < d97Var2.m.size(); d97Var2 = d97Var) {
            pkk b = d97Var2.b(i2);
            long Y = dvt.Y(b.b);
            long d = d97Var2.d(i2);
            long j4 = y8wVar.o;
            if (d == -9223372036854775807L || Y + d > j4) {
                long j5 = y8wVar.p;
                if (j5 != -9223372036854775807L && Y >= j4 + j5) {
                    break;
                }
                List list = b.c;
                d97Var = d97Var2;
                int i3 = 0;
                while (i3 < list.size()) {
                    int i4 = i3;
                    nj njVar2 = (nj) list.get(i3);
                    List list2 = list;
                    int i5 = 0;
                    while (i5 < njVar2.c.size()) {
                        a0o a0oVar = (a0o) njVar2.c.get(i5);
                        int i6 = i5;
                        try {
                            int i7 = njVar2.b;
                            o97 b2 = a0oVar.b();
                            if (b2 != null) {
                                njVar = njVar2;
                                au1Var = b2;
                                i = i2;
                                j2 = j5;
                            } else {
                                njVar = njVar2;
                                try {
                                    i = i2;
                                    try {
                                        tk4 tk4Var = (tk4) y8wVar.b(new x8w(jp3Var, i7, a0oVar), z2);
                                        if (tk4Var == null) {
                                            au1Var = null;
                                            j2 = j5;
                                        } else {
                                            j2 = j5;
                                            try {
                                                au1Var = new au1(tk4Var, a0oVar.c, 3);
                                            } catch (IOException e) {
                                                e = e;
                                                j = Y;
                                                if (z) {
                                                }
                                            }
                                        }
                                    } catch (IOException e2) {
                                        e = e2;
                                        j = Y;
                                        j2 = j5;
                                        if (z) {
                                            throw e;
                                        }
                                        i5 = i6 + 1;
                                        y8wVar = this;
                                        z2 = z;
                                        njVar2 = njVar;
                                        i2 = i;
                                        j5 = j2;
                                        Y = j;
                                    }
                                } catch (IOException e3) {
                                    e = e3;
                                    i = i2;
                                    j = Y;
                                    j2 = j5;
                                    if (z) {
                                    }
                                }
                            }
                        } catch (IOException e4) {
                            e = e4;
                            njVar = njVar2;
                        }
                        if (au1Var != null) {
                            long z3 = au1Var.z(d);
                            if (z3 == -1) {
                                throw new pg5("Unbounded segment index");
                            }
                            mu2 F = y8wVar.l.F(a0oVar.b);
                            int i8 = dvt.a;
                            String str = F.a;
                            whn whnVar = a0oVar.e;
                            if (whnVar != null) {
                                arrayList.add(new hbp(Y, vwb.I(a0oVar, str, whnVar, 0)));
                            }
                            whn d2 = a0oVar.d();
                            if (d2 != null) {
                                arrayList.add(new hbp(Y, vwb.I(a0oVar, str, d2, 0)));
                            }
                            long j6 = j4 - Y;
                            if (j5 != -9223372036854775807L) {
                                j = Y;
                                j3 = j6 + j2;
                            } else {
                                j = Y;
                                j3 = -9223372036854775807L;
                            }
                            long H = (z || j6 <= 0) ? au1Var.H() : au1Var.p(j6, d);
                            long H2 = (j3 == -9223372036854775807L || z || j3 >= j + d) ? (au1Var.H() + z3) - 1 : au1Var.p(j3, d);
                            long j7 = H;
                            int i9 = y8wVar.m;
                            if (i9 != -1 && i9 > 0) {
                                long H3 = (au1Var.H() + z3) - j7;
                                y8wVar.n.getClass();
                                H2 = (i9 == -1 ? j7 + H3 : Math.min(H3, i9) + j7) - 1;
                            }
                            long j8 = j7;
                            while (j8 <= H2) {
                                arrayList.add(new hbp(au1Var.c(j8) + j, vwb.I(a0oVar, str, au1Var.k(j8), 0)));
                                j8++;
                                au1Var = au1Var;
                            }
                            i5 = i6 + 1;
                            y8wVar = this;
                            z2 = z;
                            njVar2 = njVar;
                            i2 = i;
                            j5 = j2;
                            Y = j;
                        } else {
                            j = Y;
                            try {
                                throw new pg5("Missing segment index");
                            } catch (IOException e5) {
                                e = e5;
                                if (z) {
                                }
                            }
                        }
                    }
                    i3 = i4 + 1;
                    y8wVar = this;
                    z2 = z;
                    list = list2;
                }
            } else {
                d97Var = d97Var2;
            }
            i2++;
            y8wVar = this;
            z2 = z;
        }
        return arrayList;
    }
}
