package com.gamericefishpro.space.h2;

import android.graphics.Paint;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends f1 {
    public static final com.gamericefishpro.space.r8.m l0;
    public final z1 j0;
    public p k0;

    static {
        com.gamericefishpro.space.r8.m mVarF = com.gamericefishpro.space.o1.o.f();
        mVarF.c(com.gamericefishpro.space.o1.s.d);
        ((Paint) mVarF.b).setStrokeWidth(1.0f);
        mVarF.e(1);
        l0 = mVarF;
    }

    public q(f0 f0Var) {
        super(f0Var);
        z1 z1Var = new z1();
        z1Var.v = 0;
        this.j0 = z1Var;
        z1Var.A = this;
        this.k0 = f0Var.B != null ? new p(this) : null;
    }

    @Override // com.gamericefishpro.space.h2.f1
    public final void F0() {
        if (this.k0 == null) {
            this.k0 = new p(this);
        }
    }

    @Override // com.gamericefishpro.space.h2.f1
    public final o0 I0() {
        return this.k0;
    }

    @Override // com.gamericefishpro.space.h2.f1
    public final com.gamericefishpro.space.h1.l K0() {
        return this.j0;
    }

    @Override // com.gamericefishpro.space.f2.k0
    public final int L(int i) {
        com.gamericefishpro.space.u6.c cVarU = this.H.u();
        com.gamericefishpro.space.f2.l0 l0VarI = cVarU.i();
        f0 f0Var = (f0) cVarU.d;
        return l0VarI.d(f0Var.Z.d, f0Var.m(), i);
    }

    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0051  */
    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:30:0x006f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0088  */
    /* JADX WARN: Code duplicated, block: B:87:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v5 */
    @Override // com.gamericefishpro.space.h2.f1
    public final void Q0(b1 b1Var, long j, o oVar, int i, boolean z) {
        boolean z2;
        int i2;
        boolean z3;
        boolean z4;
        Object[] objArr;
        int i3;
        f0 f0Var;
        f0 f0Var2;
        long jB;
        long j2 = j;
        o oVar2 = oVar;
        int i4 = b1Var.a;
        f0 f0Var3 = this.H;
        switch (i4) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                z2 = true;
                break;
            default:
                com.gamericefishpro.space.o2.l lVarX = f0Var3.x();
                z2 = !(lVarX != null && lVarX.v);
                break;
        }
        if (z2) {
            if (h1(j2)) {
                i2 = i;
                z3 = z;
                z4 = true;
            } else {
                i2 = i;
                if (i2 == 1 && (Float.floatToRawIntBits(C0(j2, J0())) & Integer.MAX_VALUE) < 2139095040) {
                    z4 = true;
                    z3 = false;
                }
            }
            if (z4) {
                int i5 = oVar2.i;
                com.gamericefishpro.space.v0.e eVarY = f0Var3.y();
                objArr = eVarY.d;
                i3 = eVarY.i - 1;
                while (i3 >= 0) {
                    f0Var = (f0) objArr[i3];
                    if (f0Var.I()) {
                        switch (b1Var.a) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                f0Var.A(j2, oVar2, i2, z3);
                                f0Var2 = f0Var;
                                break;
                            default:
                                a1 a1Var = f0Var.Z;
                                a1Var.d.P0(f1.i0, a1Var.d.H0(j2), oVar2, 1, z3);
                                oVar2 = oVar;
                                f0Var2 = f0Var;
                                break;
                        }
                        jB = oVar2.b();
                        if (k.i(jB) < 0.0f && k.n(jB) && !k.m(jB)) {
                            f1 f1Var = f0Var2.Z.d;
                            f1Var.getClass();
                            com.gamericefishpro.space.h1.l lVarM0 = f1Var.M0(g1.g(16));
                            if (lVarM0 != null && lVarM0.G) {
                                if (!lVarM0.d.G) {
                                    com.gamericefishpro.space.e2.a.b("visitLocalDescendants called on an unattached node");
                                }
                                com.gamericefishpro.space.h1.l lVar = lVarM0.d;
                                if ((lVar.v & 16) != 0) {
                                    while (true) {
                                        if (lVar != null) {
                                            if ((lVar.i & 16) != 0) {
                                                ?? E = lVar;
                                                ?? eVar = 0;
                                                while (E != 0) {
                                                    if (E instanceof t1) {
                                                        if (((t1) E).R()) {
                                                            oVar2.i = oVar2.d.b - 1;
                                                            break;
                                                        }
                                                    } else if ((E.i & 16) != 0 && (E instanceof j)) {
                                                        com.gamericefishpro.space.h1.l lVar2 = ((j) E).I;
                                                        int i6 = 0;
                                                        while (lVar2 != null) {
                                                            if ((lVar2.i & 16) != 0) {
                                                                i6++;
                                                                if (i6 == 1) {
                                                                    E = E;
                                                                    eVar = eVar;
                                                                    eVar = eVar;
                                                                    E = lVar2;
                                                                } else {
                                                                    if (eVar == 0) {
                                                                        eVar = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
                                                                    }
                                                                    if (E != 0) {
                                                                        eVar.b(E);
                                                                        E = 0;
                                                                    }
                                                                    eVar.b(lVar2);
                                                                }
                                                            } else {
                                                                E = E;
                                                                eVar = eVar;
                                                            }
                                                            lVar2 = lVar2.y;
                                                            E = E;
                                                            eVar = eVar;
                                                        }
                                                        if (i6 == 1) {
                                                            E = E;
                                                            eVar = eVar;
                                                        } else {
                                                            E = E;
                                                            eVar = eVar;
                                                        }
                                                    }
                                                    E = k.e(eVar);
                                                }
                                            }
                                            lVar = lVar.y;
                                        }
                                    }
                                }
                            }
                            oVar2.i = i5;
                        }
                    }
                    i3--;
                    j2 = j;
                    i2 = i;
                }
                oVar2.i = i5;
            }
        }
        i2 = i;
        z3 = z;
        z4 = false;
        if (z4) {
            int i7 = oVar2.i;
            com.gamericefishpro.space.v0.e eVarY2 = f0Var3.y();
            objArr = eVarY2.d;
            i3 = eVarY2.i - 1;
            while (i3 >= 0) {
                f0Var = (f0) objArr[i3];
                if (f0Var.I()) {
                    switch (b1Var.a) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            f0Var.A(j2, oVar2, i2, z3);
                            f0Var2 = f0Var;
                            break;
                        default:
                            a1 a1Var2 = f0Var.Z;
                            a1Var2.d.P0(f1.i0, a1Var2.d.H0(j2), oVar2, 1, z3);
                            oVar2 = oVar;
                            f0Var2 = f0Var;
                            break;
                    }
                    jB = oVar2.b();
                    if (k.i(jB) < 0.0f) {
                        continue;
                    }
                }
                i3--;
                j2 = j;
                i2 = i;
            }
            oVar2.i = i7;
        }
    }

    @Override // com.gamericefishpro.space.f2.k0
    public final int R(int i) {
        com.gamericefishpro.space.u6.c cVarU = this.H.u();
        com.gamericefishpro.space.f2.l0 l0VarI = cVarU.i();
        f0 f0Var = (f0) cVarU.d;
        return l0VarI.c(f0Var.Z.d, f0Var.m(), i);
    }

    @Override // com.gamericefishpro.space.f2.k0
    public final int U(int i) {
        com.gamericefishpro.space.u6.c cVarU = this.H.u();
        com.gamericefishpro.space.f2.l0 l0VarI = cVarU.i();
        f0 f0Var = (f0) cVarU.d;
        return l0VarI.e(f0Var.Z.d, f0Var.m(), i);
    }

    @Override // com.gamericefishpro.space.h2.f1
    public final void Z0(com.gamericefishpro.space.o1.q qVar, com.gamericefishpro.space.r1.b bVar) {
        f0 f0Var = this.H;
        o1 o1VarA = i0.a(f0Var);
        com.gamericefishpro.space.v0.e eVarY = f0Var.y();
        Object[] objArr = eVarY.d;
        int i = eVarY.i;
        for (int i2 = 0; i2 < i; i2++) {
            f0 f0Var2 = (f0) objArr[i2];
            if (f0Var2.I()) {
                f0Var2.i(qVar, bVar);
            }
        }
        if (((com.gamericefishpro.space.i2.t) o1VarA).getShowLayoutBounds()) {
            long j = this.i;
            qVar.e(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, l0);
        }
    }

    @Override // com.gamericefishpro.space.f2.u0
    public final void a0(long j, float f, Function1 function1) {
        a1(j, f, function1);
        if (this.C) {
            return;
        }
        this.H.a0.p.o0();
    }

    @Override // com.gamericefishpro.space.f2.k0
    public final com.gamericefishpro.space.f2.u0 e(long j) {
        d0(j);
        f0 f0Var = this.H;
        com.gamericefishpro.space.v0.e eVarZ = f0Var.z();
        Object[] objArr = eVarZ.d;
        int i = eVarZ.i;
        for (int i2 = 0; i2 < i; i2++) {
            ((f0) objArr[i2]).a0.p.E = d0.i;
        }
        d1(f0Var.Q.a(this, f0Var.m(), j));
        U0();
        return this;
    }

    @Override // com.gamericefishpro.space.f2.k0
    public final int f(int i) {
        com.gamericefishpro.space.u6.c cVarU = this.H.u();
        com.gamericefishpro.space.f2.l0 l0VarI = cVarU.i();
        f0 f0Var = (f0) cVarU.d;
        return l0VarI.i(f0Var.Z.d, f0Var.m(), i);
    }

    @Override // com.gamericefishpro.space.h2.n0
    public final int f0(com.gamericefishpro.space.f2.a aVar) {
        p pVar = this.k0;
        if (pVar != null) {
            return pVar.f0(aVar);
        }
        v0 v0Var = this.H.a0.p;
        g0 g0Var = v0Var.P;
        if (v0Var.y.d == b0.d) {
            g0Var.d = true;
            if (g0Var.b) {
                v0Var.N = true;
                v0Var.O = true;
            }
        } else {
            g0Var.e = true;
        }
        q qVarV = v0Var.v();
        boolean z = qVarV.D;
        qVarV.D = true;
        v0Var.C();
        qVarV.D = z;
        Integer num = (Integer) g0Var.g.get(aVar);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }
}
