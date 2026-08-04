package com.gamericefishpro.space.d0;

import com.gamericefishpro.space.h2.d2;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static final j0 a = new j0();

    public static final void a(com.gamericefishpro.space.h1.m mVar, com.gamericefishpro.space.h1.e eVar, com.gamericefishpro.space.b1.h hVar, com.gamericefishpro.space.t0.r rVar, int i) {
        rVar.b0(380139498);
        int i2 = i | 432;
        if (rVar.S(i2 & 1, (i2 & 1171) != 1170)) {
            eVar = com.gamericefishpro.space.h1.b.d;
            com.gamericefishpro.space.f2.l0 l0VarD = r.d(eVar, false);
            boolean zF = rVar.f(l0VarD);
            Object objP = rVar.P();
            if (zF || objP == com.gamericefishpro.space.t0.n.a) {
                objP = new w(0, l0VarD, hVar);
                rVar.k0(objP);
            }
            com.gamericefishpro.space.f2.x.b(mVar, (Function2) objP, rVar, 6, 0);
        } else {
            rVar.V();
        }
        com.gamericefishpro.space.h1.e eVar2 = eVar;
        com.gamericefishpro.space.t0.p1 p1VarT = rVar.t();
        if (p1VarT != null) {
            p1VarT.d = new x(mVar, eVar2, hVar, i, 0);
        }
    }

    public static w0 b(float f) {
        return new w0(0, 0, 0, f);
    }

    public static final void c(com.gamericefishpro.space.h1.m mVar, com.gamericefishpro.space.t0.r rVar) {
        q qVar = q.c;
        int iHashCode = Long.hashCode(rVar.T);
        com.gamericefishpro.space.h1.m mVarF = com.gamericefishpro.space.d9.h.F(mVar, rVar);
        com.gamericefishpro.space.t0.l1 l1VarL = rVar.l();
        com.gamericefishpro.space.h2.g.a.getClass();
        com.gamericefishpro.space.h2.y yVar = com.gamericefishpro.space.h2.f.b;
        d2 d2Var = rVar.a;
        rVar.d0();
        if (rVar.S) {
            rVar.k(yVar);
        } else {
            rVar.n0();
        }
        com.gamericefishpro.space.t0.i.B(rVar, qVar, com.gamericefishpro.space.h2.f.e);
        com.gamericefishpro.space.t0.i.B(rVar, l1VarL, com.gamericefishpro.space.h2.f.d);
        com.gamericefishpro.space.t0.i.x(rVar, com.gamericefishpro.space.h2.f.g);
        com.gamericefishpro.space.t0.i.B(rVar, mVarF, com.gamericefishpro.space.h2.f.c);
        com.gamericefishpro.space.t0.i.t(rVar, Integer.valueOf(iHashCode), com.gamericefishpro.space.h2.f.f);
        rVar.p(true);
    }

    public static com.gamericefishpro.space.h1.m d() {
        return new i();
    }

    public static final a1 e(com.gamericefishpro.space.f2.k0 k0Var) {
        Object objI = k0Var.i();
        if (objI instanceof a1) {
            return (a1) objI;
        }
        return null;
    }

    public static final float f(a1 a1Var) {
        if (a1Var != null) {
            return a1Var.a;
        }
        return 0.0f;
    }

    public static final boolean g(int i, int i2, long j) {
        int iJ = com.gamericefishpro.space.c3.a.j(j);
        if (i > com.gamericefishpro.space.c3.a.h(j) || iJ > i) {
            return false;
        }
        return i2 <= com.gamericefishpro.space.c3.a.g(j) && com.gamericefishpro.space.c3.a.i(j) <= i2;
    }

    public static com.gamericefishpro.space.f2.m0 h(z0 z0Var, int i, int i2, int i3, int i4, int i5, com.gamericefishpro.space.f2.n0 n0Var, List list, com.gamericefishpro.space.f2.u0[] u0VarArr, int i6) {
        int i7;
        float f;
        int i8;
        int i9;
        int i10;
        List list2 = list;
        long j = i5;
        int[] iArr = new int[i6];
        int iMax = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int iMin = 0;
        float f2 = 0.0f;
        while (i11 < i6) {
            com.gamericefishpro.space.f2.k0 k0Var = (com.gamericefishpro.space.f2.k0) list2.get(i11);
            float f3 = f(e(k0Var));
            if (f3 > 0.0f) {
                f2 += f3;
                i12++;
                i8 = i11;
            } else {
                int i14 = i3 - i13;
                com.gamericefishpro.space.f2.u0 u0VarE = u0VarArr[i11];
                if (u0VarE == null) {
                    if (i3 == Integer.MAX_VALUE) {
                        i8 = i11;
                        i9 = i12;
                        i10 = Integer.MAX_VALUE;
                    } else {
                        i8 = i11;
                        i9 = i12;
                        i10 = i14 < 0 ? 0 : i14;
                    }
                    u0VarE = k0Var.e(z0Var.f(0, i10, i4, false));
                } else {
                    i8 = i11;
                    i9 = i12;
                }
                com.gamericefishpro.space.f2.u0 u0Var = u0VarE;
                int iJ = z0Var.j(u0Var);
                int iB = z0Var.b(u0Var);
                iArr[i8] = iJ;
                int i15 = i14 - iJ;
                if (i15 < 0) {
                    i15 = 0;
                }
                iMin = Math.min(i5, i15);
                i13 += iJ + iMin;
                iMax = Math.max(iMax, iB);
                u0VarArr[i8] = u0Var;
                i12 = i9;
            }
            i11 = i8 + 1;
            j = j;
        }
        long j2 = j;
        int i16 = i12;
        if (i16 == 0) {
            i13 -= iMin;
            i7 = 0;
        } else {
            long j3 = ((long) (i16 - 1)) * j2;
            long jRound = ((long) ((i3 != Integer.MAX_VALUE ? i3 : i) - i13)) - j3;
            if (jRound < 0) {
                jRound = 0;
            }
            float f4 = jRound / f2;
            for (int i17 = 0; i17 < i6; i17++) {
                jRound -= (long) Math.round(f(e((com.gamericefishpro.space.f2.k0) list2.get(i17))) * f4);
            }
            int i18 = iMax;
            int i19 = 0;
            int i20 = 0;
            while (i19 < i6) {
                if (u0VarArr[i19] == null) {
                    com.gamericefishpro.space.f2.k0 k0Var2 = (com.gamericefishpro.space.f2.k0) list2.get(i19);
                    a1 a1VarE = e(k0Var2);
                    float f5 = f(a1VarE);
                    if (f5 <= 0.0f) {
                        com.gamericefishpro.space.e0.a.b("All weights <= 0 should have placeables");
                    }
                    f = f4;
                    int iSignum = Long.signum(jRound);
                    jRound -= (long) iSignum;
                    int iMax2 = Math.max(0, Math.round(f5 * f) + iSignum);
                    com.gamericefishpro.space.f2.u0 u0VarE2 = k0Var2.e(z0Var.f((!(a1VarE != null ? a1VarE.b : true) || iMax2 == Integer.MAX_VALUE) ? 0 : iMax2, iMax2, i4, true));
                    int iJ2 = z0Var.j(u0VarE2);
                    int iB2 = z0Var.b(u0VarE2);
                    iArr[i19] = iJ2;
                    i20 += iJ2;
                    int iMax3 = Math.max(i18, iB2);
                    u0VarArr[i19] = u0VarE2;
                    i18 = iMax3;
                } else {
                    f = f4;
                }
                i19++;
                list2 = list;
                f4 = f;
            }
            i7 = (int) (((long) i20) + j3);
            int i21 = i3 - i13;
            if (i7 < 0) {
                i7 = 0;
            }
            if (i7 > i21) {
                i7 = i21;
            }
            iMax = i18;
        }
        int i22 = i7 + i13;
        if (i22 < 0) {
            i22 = 0;
        }
        int iMax4 = Math.max(i22, i);
        int iMax5 = Math.max(iMax, Math.max(i2, 0));
        int[] iArr2 = new int[i6];
        z0Var.g(iMax4, n0Var, iArr, iArr2);
        return z0Var.h(u0VarArr, n0Var, iArr2, iMax4, iMax5);
    }

    public static final com.gamericefishpro.space.h1.m i(com.gamericefishpro.space.h1.m mVar, float f, float f2) {
        return mVar.c(new p0(f, f2, new p(2)));
    }

    public static final com.gamericefishpro.space.h1.m j(com.gamericefishpro.space.h1.m mVar, Function1 function1) {
        return mVar.c(new d0(function1));
    }

    public static final com.gamericefishpro.space.h1.m k(com.gamericefishpro.space.h1.m mVar, u0 u0Var) {
        return mVar.c(new v0(u0Var, new p(5)));
    }

    public static final com.gamericefishpro.space.h1.m l(com.gamericefishpro.space.h1.m mVar, float f) {
        return mVar.c(new s0(f, f, f, f, new p(6)));
    }

    public static final com.gamericefishpro.space.h1.m m(com.gamericefishpro.space.h1.m mVar, float f, float f2) {
        return mVar.c(new s0(f, f2, f, f2, new p(4)));
    }

    public static com.gamericefishpro.space.h1.m n(com.gamericefishpro.space.h1.m mVar, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        if ((i & 2) != 0) {
            f2 = 0;
        }
        return m(mVar, f, f2);
    }

    public static com.gamericefishpro.space.h1.m o(com.gamericefishpro.space.h1.m mVar, float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        float f5 = f;
        if ((i & 2) != 0) {
            f2 = 0;
        }
        float f6 = f2;
        if ((i & 4) != 0) {
            f3 = 0;
        }
        float f7 = f3;
        if ((i & 8) != 0) {
            f4 = 0;
        }
        return mVar.c(new s0(f5, f6, f7, f4, new p(3)));
    }

    public static final m0 p(com.gamericefishpro.space.u3.b bVar) {
        return new m0(bVar.a, bVar.b, bVar.c, bVar.d);
    }
}
