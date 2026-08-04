package com.gamericefishpro.space.h2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.view.ViewParent;
import com.android.installreferrer.api.InstallReferrerClient;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f1 extends n0 implements com.gamericefishpro.space.f2.k0, com.gamericefishpro.space.f2.u, p1 {
    public static final com.gamericefishpro.space.o1.h0 f0 = new com.gamericefishpro.space.o1.h0();
    public static final t g0 = new t();
    public static final b1 h0 = new b1(0);
    public static final b1 i0 = new b1(1);
    public final f0 H;
    public f1 I;
    public f1 J;
    public boolean K;
    public boolean L;
    public Function1 M;
    public com.gamericefishpro.space.c3.c N;
    public com.gamericefishpro.space.c3.l O;
    public com.gamericefishpro.space.f2.m0 Q;
    public com.gamericefishpro.space.t.c0 R;
    public float T;
    public com.gamericefishpro.space.n1.a U;
    public t V;
    public boolean X;
    public boolean Y;
    public com.gamericefishpro.space.r1.b Z;
    public com.gamericefishpro.space.o1.q a0;
    public com.gamericefishpro.space.f2.g0 b0;
    public boolean d0;
    public n1 e0;
    public float P = 0.8f;
    public long S = 0;
    public com.gamericefishpro.space.o1.k0 W = com.gamericefishpro.space.o1.o.b;
    public final c1 c0 = new c1(this, 1);

    public f1(f0 f0Var) {
        this.H = f0Var;
        this.N = f0Var.S;
        this.O = f0Var.T;
    }

    public final long A0(f1 f1Var, long j) {
        if (f1Var == this) {
            return j;
        }
        f1 f1Var2 = this.J;
        return (f1Var2 == null || Intrinsics.a(f1Var, f1Var2)) ? H0(j) : H0(f1Var2.A0(f1Var, j));
    }

    public final long B0(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Y();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - X();
        float fMax = Math.max(0.0f, fIntBitsToFloat / 2.0f);
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat2 / 2.0f))) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
    }

    public final float C0(long j, long j2) {
        if (Y() >= Float.intBitsToFloat((int) (j2 >> 32)) && X() >= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jB0 = B0(j2);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jB0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jB0 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat3 < 0.0f ? -fIntBitsToFloat3 : fIntBitsToFloat3 - Y());
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat4 < 0.0f ? -fIntBitsToFloat4 : fIntBitsToFloat4 - X()))) & 4294967295L) | (((long) Float.floatToRawIntBits(fMax)) << 32);
        if (fIntBitsToFloat > 0.0f || fIntBitsToFloat2 > 0.0f) {
            int i = (int) (jFloatToRawIntBits >> 32);
            if (Float.intBitsToFloat(i) <= fIntBitsToFloat) {
                int i2 = (int) (jFloatToRawIntBits & 4294967295L);
                if (Float.intBitsToFloat(i2) <= fIntBitsToFloat2) {
                    float fIntBitsToFloat5 = Float.intBitsToFloat(i);
                    float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
                    return (fIntBitsToFloat6 * fIntBitsToFloat6) + (fIntBitsToFloat5 * fIntBitsToFloat5);
                }
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void D0(com.gamericefishpro.space.o1.q qVar, com.gamericefishpro.space.r1.b bVar) {
        com.gamericefishpro.space.r1.d dVar;
        Canvas canvas;
        boolean z;
        float f;
        n1 n1Var = this.e0;
        if (n1Var == null) {
            long j = this.S;
            float f2 = (int) (j >> 32);
            float f3 = (int) (j & 4294967295L);
            qVar.g(f2, f3);
            E0(qVar, bVar);
            qVar.g(-f2, -f3);
            return;
        }
        com.gamericefishpro.space.i2.g1 g1Var = (com.gamericefishpro.space.i2.g1) n1Var;
        com.gamericefishpro.space.q1.b bVar2 = g1Var.F;
        g1Var.f();
        g1Var.M = g1Var.d.a.I() > 0.0f;
        com.gamericefishpro.space.a8.c cVar = bVar2.e;
        cVar.D(qVar);
        cVar.i = bVar;
        com.gamericefishpro.space.r1.b bVar3 = g1Var.d;
        com.gamericefishpro.space.o1.q qVarJ = bVar2.x().j();
        com.gamericefishpro.space.r1.b bVar4 = (com.gamericefishpro.space.r1.b) bVar2.x().i;
        com.gamericefishpro.space.r1.d dVar2 = bVar3.a;
        if (bVar3.s) {
            return;
        }
        bVar3.a();
        if (!dVar2.J()) {
            try {
                bVar3.a.i(bVar3.b, bVar3.c, bVar3, bVar3.e);
            } catch (Throwable unused) {
            }
        }
        boolean z2 = dVar2.I() > 0.0f;
        if (z2) {
            qVarJ.o();
        }
        Canvas canvasA = com.gamericefishpro.space.o1.c.a(qVarJ);
        boolean zIsHardwareAccelerated = canvasA.isHardwareAccelerated();
        if (zIsHardwareAccelerated) {
            dVar = dVar2;
            canvas = canvasA;
        } else {
            long j2 = bVar3.t;
            float f4 = (int) (j2 >> 32);
            float f5 = (int) (j2 & 4294967295L);
            dVar = dVar2;
            long j3 = bVar3.u;
            float f6 = ((int) (j3 >> 32)) + f4;
            float f7 = f5 + ((int) (j3 & 4294967295L));
            float fA = dVar.a();
            com.gamericefishpro.space.o1.k kVarY = dVar.y();
            int iM = dVar.M();
            if (fA < 1.0f || iM != 3 || kVarY != null || dVar.w() == 1) {
                com.gamericefishpro.space.r8.m mVarF = bVar3.p;
                if (mVarF == null) {
                    mVarF = com.gamericefishpro.space.o1.o.f();
                    bVar3.p = mVarF;
                }
                mVarF.a(fA);
                mVarF.b(iM);
                mVarF.d(kVarY);
                f = f4;
                canvasA.saveLayer(f, f5, f6, f7, (Paint) mVarF.b);
            } else {
                canvasA.save();
                f = f4;
            }
            canvas = canvasA;
            canvas.translate(f, f5);
            canvas.concat(dVar.E());
        }
        boolean z3 = !zIsHardwareAccelerated && bVar3.w;
        if (z3) {
            qVarJ.k();
            com.gamericefishpro.space.o1.o oVarD = bVar3.d();
            if (oVarD instanceof com.gamericefishpro.space.o1.c0) {
                com.gamericefishpro.space.n1.c cVar2 = ((com.gamericefishpro.space.o1.c0) oVarD).f;
                qVarJ.f(cVar2.a, cVar2.b, cVar2.c, cVar2.d, 1);
            } else if (oVarD instanceof com.gamericefishpro.space.o1.d0) {
                com.gamericefishpro.space.o1.h hVarA = bVar3.m;
                if (hVarA != null) {
                    hVarA.a.rewind();
                } else {
                    hVarA = com.gamericefishpro.space.o1.j.a();
                    bVar3.m = hVarA;
                }
                com.gamericefishpro.space.o1.h.b(hVarA, ((com.gamericefishpro.space.o1.d0) oVarD).f);
                qVarJ.a(hVarA);
            } else {
                if (!(oVarD instanceof com.gamericefishpro.space.o1.b0)) {
                    throw new com.gamericefishpro.space.oh.k();
                }
                qVarJ.a(((com.gamericefishpro.space.o1.b0) oVarD).f);
            }
        }
        if (bVar4 != null) {
            com.gamericefishpro.space.b2.p pVar = bVar4.r;
            if (!pVar.a) {
                com.gamericefishpro.space.o1.z.a("Only add dependencies during a tracking");
            }
            com.gamericefishpro.space.t.i0 i0Var = (com.gamericefishpro.space.t.i0) pVar.d;
            if (i0Var != null) {
                i0Var.a(bVar3);
            } else if (((com.gamericefishpro.space.r1.b) pVar.b) != null) {
                com.gamericefishpro.space.t.i0 i0Var2 = com.gamericefishpro.space.t.q0.a;
                com.gamericefishpro.space.t.i0 i0Var3 = new com.gamericefishpro.space.t.i0();
                com.gamericefishpro.space.r1.b bVar5 = (com.gamericefishpro.space.r1.b) pVar.b;
                Intrinsics.b(bVar5);
                i0Var3.a(bVar5);
                i0Var3.a(bVar3);
                pVar.d = i0Var3;
                pVar.b = null;
            } else {
                pVar.b = bVar3;
            }
            com.gamericefishpro.space.t.i0 i0Var4 = (com.gamericefishpro.space.t.i0) pVar.e;
            if (i0Var4 != null) {
                z = !i0Var4.l(bVar3);
            } else if (((com.gamericefishpro.space.r1.b) pVar.c) != bVar3) {
                z = true;
            } else {
                pVar.c = null;
                z = false;
            }
            if (z) {
                bVar3.q++;
            }
        }
        if (com.gamericefishpro.space.o1.c.a(qVarJ).isHardwareAccelerated()) {
            dVar.B(qVarJ);
        } else {
            com.gamericefishpro.space.q1.b bVar6 = bVar3.o;
            if (bVar6 == null) {
                bVar6 = new com.gamericefishpro.space.q1.b();
                bVar3.o = bVar6;
            }
            com.gamericefishpro.space.a8.c cVar3 = bVar6.e;
            com.gamericefishpro.space.c3.c cVar4 = bVar3.b;
            com.gamericefishpro.space.c3.l lVar = bVar3.c;
            long jQ = com.gamericefishpro.space.d9.h.Q(bVar3.u);
            com.gamericefishpro.space.q1.a aVar = ((com.gamericefishpro.space.q1.b) cVar3.v).d;
            com.gamericefishpro.space.c3.c cVar5 = aVar.a;
            com.gamericefishpro.space.c3.l lVar2 = aVar.b;
            com.gamericefishpro.space.o1.q qVarJ2 = cVar3.j();
            long jO = cVar3.o();
            com.gamericefishpro.space.r1.b bVar7 = (com.gamericefishpro.space.r1.b) cVar3.i;
            cVar3.E(cVar4);
            cVar3.G(lVar);
            cVar3.D(qVarJ);
            cVar3.H(jQ);
            cVar3.i = bVar3;
            qVarJ.k();
            try {
                bVar3.c(bVar6);
                qVarJ.i();
                cVar3.E(cVar5);
                cVar3.G(lVar2);
                cVar3.D(qVarJ2);
                cVar3.H(jO);
                cVar3.i = bVar7;
            } catch (Throwable th) {
                qVarJ.i();
                cVar3.E(cVar5);
                cVar3.G(lVar2);
                cVar3.D(qVarJ2);
                cVar3.H(jO);
                cVar3.i = bVar7;
                throw th;
            }
        }
        if (z3) {
            qVarJ.i();
        }
        if (z2) {
            qVarJ.m();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        canvas.restore();
    }

    @Override // com.gamericefishpro.space.f2.u
    public final boolean E() {
        return K0().G;
    }

    public final void E0(com.gamericefishpro.space.o1.q qVar, com.gamericefishpro.space.r1.b bVar) {
        com.gamericefishpro.space.o1.q qVar2;
        com.gamericefishpro.space.r1.b bVar2;
        com.gamericefishpro.space.h1.l lVarL0 = L0(4);
        if (lVarL0 == null) {
            Z0(qVar, bVar);
            return;
        }
        f0 f0Var = this.H;
        f0Var.getClass();
        h0 sharedDrawScope = ((com.gamericefishpro.space.i2.t) i0.a(f0Var)).getSharedDrawScope();
        long jQ = com.gamericefishpro.space.d9.h.Q(this.i);
        sharedDrawScope.getClass();
        com.gamericefishpro.space.v0.e eVar = null;
        while (lVarL0 != null) {
            if (lVarL0 instanceof l) {
                qVar2 = qVar;
                bVar2 = bVar;
                sharedDrawScope.d(qVar2, jQ, this, (l) lVarL0, bVar2);
            } else {
                qVar2 = qVar;
                bVar2 = bVar;
                if ((lVarL0.i & 4) != 0 && (lVarL0 instanceof j)) {
                    int i = 0;
                    for (com.gamericefishpro.space.h1.l lVar = ((j) lVarL0).I; lVar != null; lVar = lVar.y) {
                        if ((lVar.i & 4) != 0) {
                            i++;
                            if (i == 1) {
                                lVarL0 = lVar;
                            } else {
                                if (eVar == null) {
                                    eVar = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
                                }
                                if (lVarL0 != null) {
                                    eVar.b(lVarL0);
                                    lVarL0 = null;
                                }
                                eVar.b(lVar);
                            }
                        }
                    }
                    if (i == 1) {
                    }
                }
                qVar = qVar2;
                bVar = bVar2;
            }
            lVarL0 = k.e(eVar);
            qVar = qVar2;
            bVar = bVar2;
        }
    }

    @Override // com.gamericefishpro.space.f2.u
    public final long F() {
        return this.i;
    }

    public abstract void F0();

    public final f1 G0(f1 f1Var) {
        f0 f0VarV = f1Var.H;
        f0 f0Var = this.H;
        if (f0VarV == f0Var) {
            com.gamericefishpro.space.h1.l lVarK0 = f1Var.K0();
            com.gamericefishpro.space.h1.l lVarK1 = K0();
            if (!lVarK1.d.G) {
                com.gamericefishpro.space.e2.a.b("visitLocalAncestors called on an unattached node");
            }
            for (com.gamericefishpro.space.h1.l lVar = lVarK1.d.w; lVar != null; lVar = lVar.w) {
                if ((lVar.i & 2) != 0 && lVar == lVarK0) {
                    return f1Var;
                }
            }
            return this;
        }
        while (f0VarV.J > f0Var.J) {
            f0VarV = f0VarV.v();
            Intrinsics.b(f0VarV);
        }
        f0 f0VarV2 = f0Var;
        while (f0VarV2.J > f0VarV.J) {
            f0VarV2 = f0VarV2.v();
            Intrinsics.b(f0VarV2);
        }
        while (f0VarV != f0VarV2) {
            f0VarV = f0VarV.v();
            f0VarV2 = f0VarV2.v();
            if (f0VarV == null || f0VarV2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (f0VarV2 != f0Var) {
            if (f0VarV != f1Var.H) {
                return f0VarV.Z.c;
            }
            return f1Var;
        }
        return this;
    }

    @Override // com.gamericefishpro.space.f2.u
    public final long H(long j) {
        if (!K0().G) {
            com.gamericefishpro.space.e2.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        T0();
        for (f1 f1Var = this; f1Var != null; f1Var = f1Var.J) {
            f0 f0Var = f1Var.H;
            if (f1Var == f0Var.Z.d && !f0Var.i) {
                long jB = ((com.gamericefishpro.space.i2.t) i0.a(f0Var)).getRectManager().b(f0Var);
                if (!com.gamericefishpro.space.c3.i.a(jB, 9223372034707292159L)) {
                    return com.gamericefishpro.space.a.a.A(j, jB);
                }
            }
            n1 n1Var = f1Var.e0;
            if (n1Var != null) {
                j = ((com.gamericefishpro.space.i2.g1) n1Var).c(false, j);
            }
            j = com.gamericefishpro.space.a.a.A(j, f1Var.S);
        }
        return j;
    }

    public final long H0(long j) {
        long j2 = this.S;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) - ((int) (j2 >> 32)))) << 32);
        n1 n1Var = this.e0;
        return n1Var != null ? ((com.gamericefishpro.space.i2.g1) n1Var).c(true, jFloatToRawIntBits) : jFloatToRawIntBits;
    }

    public abstract o0 I0();

    public final long J0() {
        return this.N.S(this.H.U.c());
    }

    public abstract com.gamericefishpro.space.h1.l K0();

    public final com.gamericefishpro.space.h1.l L0(int i) {
        boolean zG = g1.g(i);
        com.gamericefishpro.space.h1.l lVarK0 = K0();
        if (!zG && (lVarK0 = lVarK0.w) == null) {
            return null;
        }
        for (com.gamericefishpro.space.h1.l lVarM0 = M0(zG); lVarM0 != null && (lVarM0.v & i) != 0; lVarM0 = lVarM0.y) {
            if ((lVarM0.i & i) != 0) {
                return lVarM0;
            }
            if (lVarM0 == lVarK0) {
                return null;
            }
        }
        return null;
    }

    public final com.gamericefishpro.space.h1.l M0(boolean z) {
        com.gamericefishpro.space.h1.l lVarK0;
        a1 a1Var = this.H.Z;
        if (a1Var.d == this) {
            return a1Var.f;
        }
        if (!z) {
            f1 f1Var = this.J;
            if (f1Var != null) {
                return f1Var.K0();
            }
            return null;
        }
        f1 f1Var2 = this.J;
        if (f1Var2 == null || (lVarK0 = f1Var2.K0()) == null) {
            return null;
        }
        return lVarK0.y;
    }

    public final void N0(com.gamericefishpro.space.h1.l lVar, b1 b1Var, long j, o oVar, int i, boolean z) {
        if (lVar == null) {
            Q0(b1Var, j, oVar, i, z);
            return;
        }
        int i2 = oVar.i;
        com.gamericefishpro.space.t.d0 d0Var = oVar.d;
        oVar.c(i2 + 1, d0Var.b);
        oVar.i++;
        d0Var.a(lVar);
        oVar.e.a(k.a(-1.0f, z, false));
        N0(k.d(lVar, b1Var.b()), b1Var, j, oVar, i, z);
        oVar.i = i2;
    }

    public final void O0(com.gamericefishpro.space.h1.l lVar, b1 b1Var, long j, o oVar, int i, boolean z, float f) {
        if (lVar == null) {
            Q0(b1Var, j, oVar, i, z);
            return;
        }
        int i2 = oVar.i;
        com.gamericefishpro.space.t.d0 d0Var = oVar.d;
        oVar.c(i2 + 1, d0Var.b);
        oVar.i++;
        d0Var.a(lVar);
        oVar.e.a(k.a(f, z, false));
        Y0(k.d(lVar, b1Var.b()), b1Var, j, oVar, i, z, f, true);
        oVar.i = i2;
    }

    public final void P0(b1 b1Var, long j, o oVar, int i, boolean z) {
        boolean z2;
        boolean z3;
        com.gamericefishpro.space.h1.l lVarL0 = L0(b1Var.b());
        if (!h1(j)) {
            if (i == 1) {
                float fC0 = C0(j, J0());
                if ((Float.floatToRawIntBits(fC0) & Integer.MAX_VALUE) < 2139095040) {
                    if (oVar.i != com.gamericefishpro.space.ph.x.e(oVar)) {
                        if (k.g(oVar.b(), k.a(fC0, false, false)) <= 0) {
                            return;
                        }
                    }
                    O0(lVarL0, b1Var, j, oVar, i, false, fC0);
                    return;
                }
                return;
            }
            return;
        }
        if (lVarL0 == null) {
            Q0(b1Var, j, oVar, i, z);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < Y() && fIntBitsToFloat2 < X()) {
            N0(lVarL0, b1Var, j, oVar, i, z);
            return;
        }
        float fC1 = i == 1 ? C0(j, J0()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(fC1) & Integer.MAX_VALUE) < 2139095040) {
            if (oVar.i != com.gamericefishpro.space.ph.x.e(oVar)) {
                z2 = z;
                if (k.g(oVar.b(), k.a(fC1, z2, false)) > 0) {
                }
                Y0(lVarL0, b1Var, j, oVar, i, z2, fC1, z3);
            }
            z2 = z;
            z3 = true;
            Y0(lVarL0, b1Var, j, oVar, i, z2, fC1, z3);
        }
        z2 = z;
        z3 = false;
        Y0(lVarL0, b1Var, j, oVar, i, z2, fC1, z3);
    }

    public void Q0(b1 b1Var, long j, o oVar, int i, boolean z) {
        f1 f1Var = this.I;
        if (f1Var != null) {
            f1Var.P0(b1Var, f1Var.H0(j), oVar, i, z);
        }
    }

    public final void R0() {
        n1 n1Var = this.e0;
        if (n1Var != null) {
            n1Var.invalidate();
            return;
        }
        f1 f1Var = this.J;
        if (f1Var != null) {
            f1Var.R0();
        }
    }

    public final boolean S0() {
        if (this.e0 != null && this.P <= 0.0f) {
            return true;
        }
        f1 f1Var = this.J;
        if (f1Var != null) {
            return f1Var.S0();
        }
        return false;
    }

    public final void T0() {
        this.H.a0.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r7v7, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public final void U0() {
        com.gamericefishpro.space.h1.l lVarK0;
        boolean zG = g1.g(128);
        com.gamericefishpro.space.h1.l lVarM0 = M0(zG);
        if (lVarM0 == null || (lVarM0.d.v & 128) == 0) {
            return;
        }
        com.gamericefishpro.space.f1.g gVarE = com.gamericefishpro.space.f1.v.e();
        Function1 function1E = gVarE != null ? gVarE.e() : null;
        com.gamericefishpro.space.f1.g gVarH = com.gamericefishpro.space.f1.v.h(gVarE);
        try {
            if (!zG) {
                lVarK0 = K0().w;
                if (lVarK0 == null) {
                }
                Unit unit = Unit.a;
                com.gamericefishpro.space.f1.v.k(gVarE, gVarH, function1E);
            }
            lVarK0 = K0();
            for (com.gamericefishpro.space.h1.l lVarM1 = M0(zG); lVarM1 != null && (lVarM1.v & 128) != 0; lVarM1 = lVarM1.y) {
                if ((lVarM1.i & 128) != 0) {
                    ?? E = lVarM1;
                    ?? eVar = 0;
                    while (E != 0) {
                        if (E instanceof u) {
                            ((u) E).l(this.i);
                        } else if ((E.i & 128) != 0 && (E instanceof j)) {
                            com.gamericefishpro.space.h1.l lVar = ((j) E).I;
                            int i = 0;
                            E = E;
                            eVar = eVar;
                            while (lVar != null) {
                                if ((lVar.i & 128) != 0) {
                                    i++;
                                    if (i == 1) {
                                        eVar = eVar;
                                        E = lVar;
                                    } else {
                                        if (eVar == 0) {
                                            eVar = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
                                        }
                                        if (E != 0) {
                                            eVar.b(E);
                                            E = 0;
                                        }
                                        eVar.b(lVar);
                                    }
                                }
                                lVar = lVar.y;
                                E = E;
                                eVar = eVar;
                            }
                            if (i == 1) {
                            }
                        }
                        E = k.e(eVar);
                    }
                }
                if (lVarM1 == lVarK0) {
                    break;
                }
            }
            Unit unit2 = Unit.a;
            com.gamericefishpro.space.f1.v.k(gVarE, gVarH, function1E);
        } catch (Throwable th) {
            com.gamericefishpro.space.f1.v.k(gVarE, gVarH, function1E);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void V0() {
        boolean zG = g1.g(4194304);
        com.gamericefishpro.space.h1.l lVarK0 = K0();
        if (!zG && (lVarK0 = lVarK0.w) == null) {
            return;
        }
        for (com.gamericefishpro.space.h1.l lVarM0 = M0(zG); lVarM0 != null && (lVarM0.v & 4194304) != 0; lVarM0 = lVarM0.y) {
            if ((lVarM0.i & 4194304) != 0) {
                ?? E = lVarM0;
                ?? eVar = 0;
                while (E != 0) {
                    if (E instanceof u) {
                        ((u) E).z(this);
                    } else if ((E.i & 4194304) != 0 && (E instanceof j)) {
                        com.gamericefishpro.space.h1.l lVar = ((j) E).I;
                        int i = 0;
                        E = E;
                        eVar = eVar;
                        while (lVar != null) {
                            if ((lVar.i & 4194304) != 0) {
                                i++;
                                if (i == 1) {
                                    eVar = eVar;
                                    E = lVar;
                                } else {
                                    if (eVar == 0) {
                                        eVar = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
                                    }
                                    if (E != 0) {
                                        eVar.b(E);
                                        E = 0;
                                    }
                                    eVar.b(lVar);
                                }
                            }
                            lVar = lVar.y;
                            E = E;
                            eVar = eVar;
                        }
                        if (i == 1) {
                        }
                    }
                    E = k.e(eVar);
                }
            }
            if (lVarM0 == lVarK0) {
                return;
            }
        }
    }

    public final void W0() {
        this.K = true;
        this.c0.invoke();
        c1();
        if (com.gamericefishpro.space.c3.i.a(this.S, 0L)) {
            return;
        }
        this.H.N();
    }

    public final void X0() {
        boolean zG = g1.g(1048576);
        com.gamericefishpro.space.h1.l lVarM0 = M0(zG);
        if (lVarM0 == null || (lVarM0.d.v & 1048576) == 0) {
            return;
        }
        com.gamericefishpro.space.h1.l lVarK0 = K0();
        if (!zG && (lVarK0 = lVarK0.w) == null) {
            return;
        }
        for (com.gamericefishpro.space.h1.l lVarM1 = M0(zG); lVarM1 != null && (lVarM1.v & 1048576) != 0; lVarM1 = lVarM1.y) {
            if ((lVarM1.i & 1048576) != 0) {
                com.gamericefishpro.space.h1.l lVarE = lVarM1;
                com.gamericefishpro.space.v0.e eVar = null;
                while (lVarE != null) {
                    if ((lVarE.i & 1048576) != 0 && (lVarE instanceof j)) {
                        int i = 0;
                        for (com.gamericefishpro.space.h1.l lVar = ((j) lVarE).I; lVar != null; lVar = lVar.y) {
                            if ((lVar.i & 1048576) != 0) {
                                i++;
                                if (i == 1) {
                                    lVarE = lVar;
                                } else {
                                    if (eVar == null) {
                                        eVar = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
                                    }
                                    if (lVarE != null) {
                                        eVar.b(lVarE);
                                        lVarE = null;
                                    }
                                    eVar.b(lVar);
                                }
                            }
                        }
                        if (i == 1) {
                        }
                    }
                    lVarE = k.e(eVar);
                }
            }
            if (lVarM1 == lVarK0) {
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0192 A[PHI: r5
      0x0192: PHI (r5v3 ??) = (r5v1 ??), (r5v1 ??), (r5v5 ??) binds: [B:52:0x015e, B:54:0x0162, B:68:0x018c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r4v18, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r4v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v8 */
    public final void Y0(com.gamericefishpro.space.h1.l lVar, b1 b1Var, long j, o oVar, int i, boolean z, float f, boolean z2) {
        ?? E;
        if (lVar == null) {
            Q0(b1Var, j, oVar, i, z);
            return;
        }
        int i2 = i;
        if (i2 == 3 || i2 == 4) {
            ?? r4 = lVar;
            ?? eVar = 0;
            while (r4 != 0) {
                if (r4 instanceof t1) {
                    ((t1) r4).getClass();
                    int i3 = a2.b;
                    long j2 = a2.a;
                    int i4 = (int) (j >> 32);
                    float fIntBitsToFloat = Float.intBitsToFloat(i4);
                    f0 f0Var = this.H;
                    com.gamericefishpro.space.c3.l lVar2 = f0Var.T;
                    int i5 = a2.b;
                    long j3 = Long.MIN_VALUE & j2;
                    if (fIntBitsToFloat < (-((j3 == 0 || lVar2 == com.gamericefishpro.space.c3.l.d) ? b1.a(0, j2) : b1.a(2, j2)))) {
                        break;
                    }
                    if (Float.intBitsToFloat(i4) >= Y() + ((j3 == 0 || f0Var.T == com.gamericefishpro.space.c3.l.d) ? b1.a(2, j2) : b1.a(0, j2))) {
                        break;
                    }
                    int i6 = (int) (j & 4294967295L);
                    if (Float.intBitsToFloat(i6) < (-b1.a(1, j2))) {
                        break;
                    }
                    if (Float.intBitsToFloat(i6) >= b1.a(3, j2) + X()) {
                        break;
                    }
                    d1 d1Var = new d1(this, lVar, b1Var, j, oVar, i2, z, f, z2);
                    com.gamericefishpro.space.t.y yVar = oVar.e;
                    com.gamericefishpro.space.t.d0 d0Var = oVar.d;
                    if (oVar.i == com.gamericefishpro.space.ph.x.e(oVar)) {
                        int i7 = oVar.i;
                        oVar.c(i7 + 1, d0Var.b);
                        oVar.i++;
                        d0Var.a(lVar);
                        yVar.a(k.a(0.0f, z, true));
                        d1Var.invoke();
                        oVar.i = i7;
                        return;
                    }
                    long jB = oVar.b();
                    int i8 = oVar.i;
                    if (!k.m(jB)) {
                        if (k.i(jB) > 0.0f) {
                            int i9 = oVar.i;
                            oVar.c(i9 + 1, d0Var.b);
                            oVar.i++;
                            d0Var.a(lVar);
                            yVar.a(k.a(0.0f, z, true));
                            d1Var.invoke();
                            oVar.i = i9;
                            return;
                        }
                        return;
                    }
                    int iE = com.gamericefishpro.space.ph.x.e(oVar);
                    oVar.i = iE;
                    oVar.c(iE + 1, d0Var.b);
                    oVar.i++;
                    d0Var.a(lVar);
                    yVar.a(k.a(0.0f, z, true));
                    d1Var.invoke();
                    oVar.i = iE;
                    if (k.i(oVar.b()) < 0.0f) {
                        oVar.c(i8 + 1, oVar.i + 1);
                    }
                    oVar.i = i8;
                    return;
                }
                if ((r4.i & 16) == 0 || !(r4 instanceof j)) {
                    E = r4;
                    eVar = eVar;
                    E = k.e(eVar);
                } else {
                    com.gamericefishpro.space.h1.l lVar3 = ((j) r4).I;
                    int i10 = 0;
                    while (lVar3 != null) {
                        if ((lVar3.i & 16) != 0) {
                            i10++;
                            if (i10 == 1) {
                                E = r4;
                                eVar = eVar;
                                eVar = eVar;
                                E = lVar3;
                            } else {
                                if (eVar == 0) {
                                    eVar = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
                                }
                                if (E != 0) {
                                    eVar.b(E);
                                    E = 0;
                                }
                                eVar.b(lVar3);
                            }
                        } else {
                            E = r4;
                            eVar = eVar;
                        }
                        lVar3 = lVar3.y;
                        E = E;
                        eVar = eVar;
                    }
                    if (i10 == 1) {
                        E = r4;
                        eVar = eVar;
                    } else {
                        E = r4;
                        eVar = eVar;
                        E = k.e(eVar);
                    }
                }
                i2 = i;
                r4 = E;
                eVar = eVar;
            }
        }
        if (z2) {
            O0(lVar, b1Var, j, oVar, i, z, f);
            return;
        }
        switch (b1Var.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ?? eVar2 = 0;
                ?? E2 = lVar;
                while (E2 != 0) {
                    if (E2 instanceof t1) {
                        ((t1) E2).f0();
                    } else if ((E2.i & 16) != 0 && (E2 instanceof j)) {
                        com.gamericefishpro.space.h1.l lVar4 = ((j) E2).I;
                        int i11 = 0;
                        while (lVar4 != null) {
                            if ((lVar4.i & 16) != 0) {
                                i11++;
                                if (i11 == 1) {
                                    E2 = E2;
                                    eVar2 = eVar2;
                                    eVar2 = eVar2;
                                    E2 = lVar4;
                                } else {
                                    if (eVar2 == 0) {
                                        eVar2 = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
                                    }
                                    if (E2 != 0) {
                                        eVar2.b(E2);
                                        E2 = 0;
                                    }
                                    eVar2.b(lVar4);
                                }
                            } else {
                                E2 = E2;
                                eVar2 = eVar2;
                            }
                            lVar4 = lVar4.y;
                            E2 = E2;
                            eVar2 = eVar2;
                        }
                        if (i11 == 1) {
                            E2 = E2;
                            eVar2 = eVar2;
                        } else {
                            E2 = E2;
                            eVar2 = eVar2;
                        }
                    }
                    E2 = k.e(eVar2);
                }
                break;
        }
        Y0(k.d(lVar, b1Var.b()), b1Var, j, oVar, i, z, f, false);
    }

    public abstract void Z0(com.gamericefishpro.space.o1.q qVar, com.gamericefishpro.space.r1.b bVar);

    public final void a1(long j, float f, Function1 function1) {
        f1(function1, false);
        boolean zA = com.gamericefishpro.space.c3.i.a(this.S, j);
        f0 f0Var = this.H;
        if (!zA) {
            ((com.gamericefishpro.space.i2.t) i0.a(f0Var)).M(-4.0f);
            this.S = j;
            f0Var.a0.p.k0();
            n1 n1Var = this.e0;
            if (n1Var != null) {
                ((com.gamericefishpro.space.i2.g1) n1Var).d(j);
            } else {
                f1 f1Var = this.J;
                if (f1Var != null) {
                    f1Var.R0();
                }
            }
            f0Var.N();
            n0.w0(this);
            o1 o1Var = f0Var.H;
            if (o1Var != null) {
                ((com.gamericefishpro.space.i2.t) o1Var).z(f0Var);
            }
        }
        this.T = f;
        if (this == f0Var.Z.d) {
            ((com.gamericefishpro.space.i2.t) i0.a(f0Var)).getRectManager().e(f0Var, false);
        }
        if (this.D) {
            return;
        }
        k0(s0());
    }

    @Override // com.gamericefishpro.space.c3.c
    public final float b() {
        return this.H.S.b();
    }

    public final void b1(com.gamericefishpro.space.n1.a aVar, boolean z, boolean z2) {
        n1 n1Var = this.e0;
        if (n1Var != null) {
            if (this.L) {
                if (z2) {
                    long jJ0 = J0();
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jJ0 >> 32)) / 2.0f;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jJ0 & 4294967295L)) / 2.0f;
                    long j = this.i;
                    aVar.a(-fIntBitsToFloat, -fIntBitsToFloat2, ((int) (j >> 32)) + fIntBitsToFloat, ((int) (j & 4294967295L)) + fIntBitsToFloat2);
                } else if (z) {
                    long j2 = this.i;
                    aVar.a(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
                }
                if (aVar.b()) {
                    return;
                }
            }
            com.gamericefishpro.space.i2.g1 g1Var = (com.gamericefishpro.space.i2.g1) n1Var;
            float[] fArrB = g1Var.b();
            if (!g1Var.L) {
                if (fArrB == null) {
                    aVar.a = 0.0f;
                    aVar.b = 0.0f;
                    aVar.c = 0.0f;
                    aVar.d = 0.0f;
                } else {
                    com.gamericefishpro.space.o1.o.r(fArrB, aVar);
                }
            }
        }
        long j3 = this.S;
        float f = (int) (j3 >> 32);
        aVar.a += f;
        aVar.c += f;
        float f2 = (int) (j3 & 4294967295L);
        aVar.b += f2;
        aVar.d += f2;
    }

    public final void c1() {
        if (this.e0 != null) {
            f1(null, false);
            this.H.U(false);
        }
    }

    @Override // com.gamericefishpro.space.f2.u
    public final long d(long j) {
        if (!K0().G) {
            com.gamericefishpro.space.e2.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((com.gamericefishpro.space.i2.t) i0.a(this.H)).t(H(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [com.gamericefishpro.space.v0.e] */
    public final void d1(com.gamericefishpro.space.f2.m0 m0Var) {
        f1 f1Var;
        com.gamericefishpro.space.f2.m0 m0Var2 = this.Q;
        if (m0Var != m0Var2) {
            this.Q = m0Var;
            f0 f0Var = this.H;
            int i = 0;
            if (m0Var2 == null || m0Var.e() != m0Var2.e() || m0Var.c() != m0Var2.c()) {
                int iE = m0Var.e();
                int iC = m0Var.c();
                n1 n1Var = this.e0;
                if (n1Var != null) {
                    ((com.gamericefishpro.space.i2.g1) n1Var).e((((long) iE) << 32) | (((long) iC) & 4294967295L));
                } else if (f0Var.I() && (f1Var = this.J) != null) {
                    f1Var.R0();
                }
                c0((((long) iC) & 4294967295L) | (((long) iE) << 32));
                if (this.M != null) {
                    g1(false);
                }
                boolean zG = g1.g(4);
                com.gamericefishpro.space.h1.l lVarK0 = K0();
                if (zG || (lVarK0 = lVarK0.w) != null) {
                    for (com.gamericefishpro.space.h1.l lVarM0 = M0(zG); lVarM0 != null && (lVarM0.v & 4) != 0; lVarM0 = lVarM0.y) {
                        if ((lVarM0.i & 4) != 0) {
                            ?? E = lVarM0;
                            ?? eVar = 0;
                            while (E != 0) {
                                if (E instanceof l) {
                                    ((l) E).e0();
                                } else if ((E.i & 4) != 0 && (E instanceof j)) {
                                    com.gamericefishpro.space.h1.l lVar = ((j) E).I;
                                    int i2 = 0;
                                    E = E;
                                    eVar = eVar;
                                    while (lVar != null) {
                                        if ((lVar.i & 4) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                eVar = eVar;
                                                E = lVar;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
                                                }
                                                if (E != 0) {
                                                    eVar.b(E);
                                                    E = 0;
                                                }
                                                eVar.b(lVar);
                                            }
                                        }
                                        lVar = lVar.y;
                                        E = E;
                                        eVar = eVar;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                E = k.e(eVar);
                            }
                        }
                        if (lVarM0 == lVarK0) {
                            break;
                        }
                    }
                }
                o1 o1Var = f0Var.H;
                if (o1Var != null) {
                    ((com.gamericefishpro.space.i2.t) o1Var).z(f0Var);
                }
            }
            com.gamericefishpro.space.t.c0 c0Var = this.R;
            if ((c0Var == null || c0Var.e == 0) && m0Var.a().isEmpty()) {
                return;
            }
            com.gamericefishpro.space.t.c0 c0Var2 = this.R;
            Map mapA = m0Var.a();
            if (c0Var2 != null && c0Var2.e == mapA.size()) {
                Object[] objArr = c0Var2.b;
                int[] iArr = c0Var2.c;
                long[] jArr = c0Var2.a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i3 = 0;
                loop0: while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = i; i5 < i4; i5++) {
                            if ((255 & j) < 128) {
                                int i6 = (i3 << 3) + i5;
                                Object obj = objArr[i6];
                                int i7 = iArr[i6];
                                Integer num = (Integer) mapA.get((com.gamericefishpro.space.f2.a) obj);
                                if (num == null || num.intValue() != i7) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            return;
                        }
                    }
                    if (i3 == length) {
                        return;
                    }
                    i3++;
                    i = 0;
                }
            }
            f0Var.a0.p.P.f();
            com.gamericefishpro.space.t.c0 c0Var3 = this.R;
            if (c0Var3 == null) {
                com.gamericefishpro.space.t.c0 c0Var4 = com.gamericefishpro.space.t.m0.a;
                c0Var3 = new com.gamericefishpro.space.t.c0();
                this.R = c0Var3;
            }
            c0Var3.a();
            for (Map.Entry entry : m0Var.a().entrySet()) {
                c0Var3.g(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    public final com.gamericefishpro.space.n1.c e1() {
        if (K0().G) {
            com.gamericefishpro.space.f2.u uVarH = com.gamericefishpro.space.f2.x.h(this);
            com.gamericefishpro.space.n1.a aVar = this.U;
            if (aVar == null) {
                aVar = new com.gamericefishpro.space.n1.a();
                this.U = aVar;
            }
            long jB0 = B0(J0());
            int i = (int) (jB0 >> 32);
            aVar.a = -Float.intBitsToFloat(i);
            int i2 = (int) (jB0 & 4294967295L);
            aVar.b = -Float.intBitsToFloat(i2);
            aVar.c = Float.intBitsToFloat(i) + Y();
            aVar.d = Float.intBitsToFloat(i2) + X();
            f1 f1Var = this;
            while (f1Var != uVarH) {
                f1Var.b1(aVar, false, true);
                if (!aVar.b()) {
                    f1Var = f1Var.J;
                    Intrinsics.b(f1Var);
                }
            }
            return new com.gamericefishpro.space.n1.c(aVar.a, aVar.b, aVar.c, aVar.d);
        }
        return com.gamericefishpro.space.n1.c.e;
    }

    public final void f1(Function1 function1, boolean z) {
        o1 o1Var;
        com.gamericefishpro.space.v0.e eVar;
        Reference referencePoll;
        com.gamericefishpro.space.f2.g0 g0Var;
        com.gamericefishpro.space.v0.e eVar2;
        Reference referencePoll2;
        Object obj;
        f0 f0Var = this.H;
        boolean z2 = (!z && this.M == function1 && Intrinsics.a(this.N, f0Var.S) && this.O == f0Var.T) ? false : true;
        this.N = f0Var.S;
        this.O = f0Var.T;
        boolean zH = f0Var.H();
        c1 c1Var = this.c0;
        if (!zH || function1 == null) {
            this.M = null;
            n1 n1Var = this.e0;
            if (n1Var != null) {
                com.gamericefishpro.space.i2.g1 g1Var = (com.gamericefishpro.space.i2.g1) n1Var;
                com.gamericefishpro.space.i2.t tVar = g1Var.i;
                if (!com.gamericefishpro.space.o1.o.p(g1Var.b())) {
                    f0Var.N();
                }
                g1Var.v = null;
                g1Var.w = null;
                g1Var.z = true;
                if (g1Var.C) {
                    g1Var.C = false;
                    tVar.x(g1Var, false);
                }
                com.gamericefishpro.space.o1.v vVar = g1Var.e;
                if (vVar != null) {
                    vVar.a(g1Var.d);
                    com.gamericefishpro.space.u6.c cVar = tVar.O0;
                    do {
                        ReferenceQueue referenceQueue = (ReferenceQueue) cVar.e;
                        eVar = (com.gamericefishpro.space.v0.e) cVar.d;
                        referencePoll = referenceQueue.poll();
                        if (referencePoll != null) {
                            eVar.k(referencePoll);
                        }
                    } while (referencePoll != null);
                    eVar.b(new WeakReference(g1Var, (ReferenceQueue) cVar.e));
                    tVar.W.j(g1Var);
                }
                f0Var.d0 = true;
                c1Var.invoke();
                if (K0().G && f0Var.I() && (o1Var = f0Var.H) != null) {
                    ((com.gamericefishpro.space.i2.t) o1Var).z(f0Var);
                }
            }
            this.e0 = null;
            this.d0 = false;
            return;
        }
        this.M = function1;
        if (this.e0 != null) {
            if (z2) {
                g1(true);
                return;
            }
            return;
        }
        o1 o1VarA = i0.a(f0Var);
        com.gamericefishpro.space.f2.g0 g0Var2 = this.b0;
        if (g0Var2 == null) {
            com.gamericefishpro.space.f2.g0 g0Var3 = new com.gamericefishpro.space.f2.g0(1, this, new c1(this, 0));
            this.b0 = g0Var3;
            g0Var = g0Var3;
        } else {
            g0Var = g0Var2;
        }
        com.gamericefishpro.space.i2.t tVar2 = (com.gamericefishpro.space.i2.t) o1VarA;
        com.gamericefishpro.space.u6.c cVar2 = tVar2.O0;
        do {
            ReferenceQueue referenceQueue2 = (ReferenceQueue) cVar2.e;
            eVar2 = (com.gamericefishpro.space.v0.e) cVar2.d;
            referencePoll2 = referenceQueue2.poll();
            if (referencePoll2 != null) {
                eVar2.k(referencePoll2);
            }
        } while (referencePoll2 != null);
        do {
            int i = eVar2.i;
            if (i == 0) {
                obj = null;
                break;
            }
            obj = ((Reference) eVar2.l(i - 1)).get();
        } while (obj == null);
        n1 g1Var2 = (n1) obj;
        if (g1Var2 != null) {
            com.gamericefishpro.space.i2.g1 g1Var3 = (com.gamericefishpro.space.i2.g1) g1Var2;
            com.gamericefishpro.space.o1.v vVar2 = g1Var3.e;
            if (vVar2 == null) {
                throw com.gamericefishpro.space.m5.a.e("currently reuse is only supported when we manage the layer lifecycle");
            }
            if (!g1Var3.d.s) {
                com.gamericefishpro.space.e2.a.a("layer should have been released before reuse");
            }
            g1Var3.d = vVar2.b();
            g1Var3.z = false;
            g1Var3.v = g0Var;
            g1Var3.w = c1Var;
            g1Var3.J = false;
            g1Var3.K = false;
            g1Var3.L = true;
            com.gamericefishpro.space.o1.o.s(g1Var3.A);
            float[] fArr = g1Var3.B;
            if (fArr != null) {
                com.gamericefishpro.space.o1.o.s(fArr);
            }
            g1Var3.H = com.gamericefishpro.space.o1.n0.b;
            g1Var3.M = false;
            long j = Integer.MAX_VALUE;
            g1Var3.y = (j & 4294967295L) | (j << 32);
            g1Var3.I = null;
            g1Var3.G = 0;
        } else {
            g1Var2 = new com.gamericefishpro.space.i2.g1(tVar2.getGraphicsContext().b(), tVar2.getGraphicsContext(), tVar2, g0Var, c1Var);
        }
        com.gamericefishpro.space.i2.g1 g1Var4 = (com.gamericefishpro.space.i2.g1) g1Var2;
        g1Var4.e(this.i);
        g1Var4.d(this.S);
        this.e0 = g1Var2;
        g1(true);
        f0Var.d0 = true;
        c1Var.invoke();
    }

    @Override // com.gamericefishpro.space.c3.c
    public final float g() {
        return this.H.S.g();
    }

    public final void g1(boolean z) {
        char c;
        com.gamericefishpro.space.i2.t tVar;
        boolean z2;
        com.gamericefishpro.space.i2.t tVar2;
        o1 o1Var;
        Function0 function0;
        Function0 function1;
        n1 n1Var = this.e0;
        if (n1Var == null) {
            if (this.M == null) {
                return;
            }
            com.gamericefishpro.space.e2.a.b("null layer with a non-null layerBlock");
            return;
        }
        Function1 function2 = this.M;
        if (function2 == null) {
            throw com.gamericefishpro.space.m5.a.e("updateLayerParameters requires a non-null layerBlock");
        }
        com.gamericefishpro.space.o1.h0 h0Var = f0;
        h0Var.a();
        f0 f0Var = this.H;
        h0Var.F = f0Var.S;
        h0Var.G = f0Var.T;
        h0Var.E = com.gamericefishpro.space.d9.h.Q(this.i);
        ((com.gamericefishpro.space.i2.t) i0.a(f0Var)).getSnapshotObserver().a.c(this, d.w, new com.gamericefishpro.space.b2.b(3, function2, this));
        t tVar3 = this.V;
        if (tVar3 == null) {
            tVar3 = new t();
            this.V = tVar3;
        }
        t tVar4 = g0;
        tVar4.getClass();
        tVar4.a = tVar3.a;
        tVar4.b = tVar3.b;
        tVar4.c = tVar3.c;
        tVar4.d = tVar3.d;
        float f = h0Var.e;
        tVar3.a = f;
        tVar3.b = h0Var.i;
        tVar3.c = h0Var.A;
        long j = h0Var.B;
        tVar3.d = j;
        com.gamericefishpro.space.i2.g1 g1Var = (com.gamericefishpro.space.i2.g1) n1Var;
        com.gamericefishpro.space.i2.t tVar5 = g1Var.i;
        int i = h0Var.d | g1Var.G;
        g1Var.E = h0Var.G;
        g1Var.D = h0Var.F;
        int i2 = i & 4096;
        if (i2 != 0) {
            g1Var.H = j;
        }
        if ((i & 1) != 0) {
            com.gamericefishpro.space.r1.d dVar = g1Var.d.a;
            if (dVar.d() != f) {
                dVar.o(f);
            }
        }
        if ((i & 2) != 0) {
            com.gamericefishpro.space.r1.b bVar = g1Var.d;
            float f2 = h0Var.i;
            com.gamericefishpro.space.r1.d dVar2 = bVar.a;
            if (dVar2.K() != f2) {
                dVar2.D(f2);
            }
        }
        if ((i & 4) != 0) {
            com.gamericefishpro.space.r1.b bVar2 = g1Var.d;
            float f3 = h0Var.v;
            com.gamericefishpro.space.r1.d dVar3 = bVar2.a;
            if (dVar3.a() != f3) {
                dVar3.c(f3);
            }
        }
        if ((i & 8) != 0) {
            com.gamericefishpro.space.r1.d dVar4 = g1Var.d.a;
            if (dVar4.t() != 0.0f) {
                dVar4.u();
            }
        }
        if ((i & 16) != 0) {
            com.gamericefishpro.space.r1.d dVar5 = g1Var.d.a;
            if (dVar5.f() != 0.0f) {
                dVar5.h();
            }
        }
        if ((i & 32) != 0) {
            com.gamericefishpro.space.r1.b bVar3 = g1Var.d;
            float f4 = h0Var.w;
            com.gamericefishpro.space.r1.d dVar6 = bVar3.a;
            if (dVar6.I() != f4) {
                dVar6.e(f4);
                bVar3.g = true;
                bVar3.a();
            }
            if (h0Var.w > 0.0f && !g1Var.M && (function1 = g1Var.w) != null) {
                function1.invoke();
            }
        }
        if ((i & 64) != 0) {
            com.gamericefishpro.space.r1.b bVar4 = g1Var.d;
            long j2 = h0Var.y;
            com.gamericefishpro.space.r1.d dVar7 = bVar4.a;
            if (!com.gamericefishpro.space.o1.s.d(j2, dVar7.O())) {
                dVar7.l(j2);
            }
        }
        if ((i & 128) != 0) {
            com.gamericefishpro.space.r1.b bVar5 = g1Var.d;
            long j3 = h0Var.z;
            com.gamericefishpro.space.r1.d dVar8 = bVar5.a;
            if (!com.gamericefishpro.space.o1.s.d(j3, dVar8.k())) {
                dVar8.C(j3);
            }
        }
        if ((i & 1024) != 0) {
            com.gamericefishpro.space.r1.d dVar9 = g1Var.d.a;
            if (dVar9.L() != 0.0f) {
                dVar9.A();
            }
        }
        if ((i & 256) != 0) {
            com.gamericefishpro.space.r1.d dVar10 = g1Var.d.a;
            if (dVar10.x() != 0.0f) {
                dVar10.b();
            }
        }
        if ((i & 512) != 0) {
            com.gamericefishpro.space.r1.d dVar11 = g1Var.d.a;
            if (dVar11.G() != 0.0f) {
                dVar11.j();
            }
        }
        if ((i & 2048) != 0) {
            com.gamericefishpro.space.r1.b bVar6 = g1Var.d;
            float f5 = h0Var.A;
            com.gamericefishpro.space.r1.d dVar12 = bVar6.a;
            if (dVar12.q() != f5) {
                dVar12.H(f5);
            }
        }
        if (i2 != 0) {
            c = ' ';
            if (com.gamericefishpro.space.o1.n0.a(g1Var.H, com.gamericefishpro.space.o1.n0.b)) {
                com.gamericefishpro.space.r1.b bVar7 = g1Var.d;
                if (!com.gamericefishpro.space.n1.b.b(bVar7.v, 9205357640488583168L)) {
                    bVar7.v = 9205357640488583168L;
                    bVar7.a.N(9205357640488583168L);
                }
            } else {
                com.gamericefishpro.space.r1.b bVar8 = g1Var.d;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(com.gamericefishpro.space.o1.n0.b(g1Var.H) * ((int) (g1Var.y >> 32)))) << 32) | (((long) Float.floatToRawIntBits(com.gamericefishpro.space.o1.n0.c(g1Var.H) * ((int) (g1Var.y & 4294967295L)))) & 4294967295L);
                if (!com.gamericefishpro.space.n1.b.b(bVar8.v, jFloatToRawIntBits)) {
                    bVar8.v = jFloatToRawIntBits;
                    bVar8.a.N(jFloatToRawIntBits);
                }
            }
        } else {
            c = ' ';
        }
        if ((i & 16384) != 0) {
            com.gamericefishpro.space.r1.b bVar9 = g1Var.d;
            boolean z3 = h0Var.D;
            if (bVar9.w != z3) {
                bVar9.w = z3;
                bVar9.g = true;
                bVar9.a();
            }
        }
        if ((131072 & i) != 0) {
            com.gamericefishpro.space.r1.b bVar10 = g1Var.d;
            com.gamericefishpro.space.o1.n nVar = h0Var.H;
            com.gamericefishpro.space.r1.d dVar13 = bVar10.a;
            if (!Intrinsics.a(dVar13.g(), nVar)) {
                dVar13.s(nVar);
            }
        }
        if ((262144 & i) != 0) {
            com.gamericefishpro.space.r1.d dVar14 = g1Var.d.a;
            if (!Intrinsics.a(dVar14.y(), null)) {
                dVar14.n();
            }
        }
        if ((524288 & i) != 0) {
            com.gamericefishpro.space.r1.b bVar11 = g1Var.d;
            int i3 = h0Var.I;
            com.gamericefishpro.space.r1.d dVar15 = bVar11.a;
            if (dVar15.M() != i3) {
                dVar15.p(i3);
            }
        }
        if ((32768 & i) != 0) {
            com.gamericefishpro.space.r1.d dVar16 = g1Var.d.a;
            if (dVar16.w() != 0) {
                dVar16.z(0);
            }
        }
        if ((i & 7963) != 0) {
            g1Var.J = true;
            g1Var.K = true;
        }
        if (Intrinsics.a(g1Var.I, h0Var.J)) {
            tVar = tVar5;
            z2 = false;
        } else {
            com.gamericefishpro.space.o1.o oVar = h0Var.J;
            g1Var.I = oVar;
            if (oVar == null) {
                tVar = tVar5;
            } else {
                com.gamericefishpro.space.r1.b bVar12 = g1Var.d;
                if (oVar instanceof com.gamericefishpro.space.o1.c0) {
                    com.gamericefishpro.space.n1.c cVar = ((com.gamericefishpro.space.o1.c0) oVar).f;
                    float f6 = cVar.a;
                    float f7 = cVar.b;
                    tVar = tVar5;
                    bVar12.f((((long) Float.floatToRawIntBits(f6)) << c) | (((long) Float.floatToRawIntBits(f7)) & 4294967295L), (((long) Float.floatToRawIntBits(cVar.c - f6)) << c) | (((long) Float.floatToRawIntBits(cVar.d - f7)) & 4294967295L), 0.0f);
                } else {
                    tVar = tVar5;
                    if (oVar instanceof com.gamericefishpro.space.o1.b0) {
                        com.gamericefishpro.space.o1.h hVar = ((com.gamericefishpro.space.o1.b0) oVar).f;
                        bVar12.k = null;
                        bVar12.i = 9205357640488583168L;
                        bVar12.h = 0L;
                        bVar12.j = 0.0f;
                        bVar12.g = true;
                        bVar12.n = false;
                        bVar12.l = hVar;
                        bVar12.a();
                    } else {
                        if (!(oVar instanceof com.gamericefishpro.space.o1.d0)) {
                            throw new com.gamericefishpro.space.oh.k();
                        }
                        com.gamericefishpro.space.o1.d0 d0Var = (com.gamericefishpro.space.o1.d0) oVar;
                        com.gamericefishpro.space.o1.h hVar2 = d0Var.g;
                        if (hVar2 != null) {
                            bVar12.k = null;
                            bVar12.i = 9205357640488583168L;
                            bVar12.h = 0L;
                            bVar12.j = 0.0f;
                            bVar12.g = true;
                            bVar12.n = false;
                            bVar12.l = hVar2;
                            bVar12.a();
                        } else {
                            com.gamericefishpro.space.n1.d dVar17 = d0Var.f;
                            bVar12.f((((long) Float.floatToRawIntBits(dVar17.a)) << c) | (((long) Float.floatToRawIntBits(dVar17.b)) & 4294967295L), (((long) Float.floatToRawIntBits(dVar17.b())) << c) | (((long) Float.floatToRawIntBits(dVar17.a())) & 4294967295L), Float.intBitsToFloat((int) (dVar17.h >> c)));
                        }
                    }
                }
                if ((oVar instanceof com.gamericefishpro.space.o1.b0) && Build.VERSION.SDK_INT < 33 && (function0 = g1Var.w) != null) {
                    function0.invoke();
                }
            }
            z2 = true;
        }
        g1Var.G = h0Var.d;
        if (i != 0 || z2) {
            ViewParent parent = tVar.getParent();
            if (parent != null) {
                tVar2 = tVar;
                parent.onDescendantInvalidated(tVar2, tVar2);
            } else {
                tVar2 = tVar;
            }
            if (tVar2.E) {
                tVar2.M(0.0f);
            }
        }
        boolean z4 = this.L;
        this.L = h0Var.D;
        this.P = h0Var.v;
        boolean z5 = tVar4.a == tVar3.a && tVar4.b == tVar3.b && tVar4.c == tVar3.c && com.gamericefishpro.space.o1.n0.a(tVar4.d, tVar3.d);
        if (z && ((!z5 || z4 != this.L) && (o1Var = f0Var.H) != null)) {
            ((com.gamericefishpro.space.i2.t) o1Var).z(f0Var);
        }
        if (z5) {
            return;
        }
        j0 j0Var = f0Var.a0;
        if (j0Var.l > 0) {
            if (j0Var.k || j0Var.j) {
                f0Var.U(false);
            }
            j0Var.p.k0();
        }
        f0Var.N();
        com.gamericefishpro.space.i2.t tVar6 = (com.gamericefishpro.space.i2.t) i0.a(f0Var);
        com.gamericefishpro.space.p2.b rectManager = tVar6.getRectManager();
        if (this == f0Var.Z.d) {
            rectManager.e(f0Var, false);
        } else {
            rectManager.getClass();
            if (f0Var.I()) {
                long jF = com.gamericefishpro.space.p2.b.f(f0Var);
                if (com.gamericefishpro.space.c3.i.a(jF, 9223372034707292159L)) {
                    rectManager.c(f0Var);
                } else {
                    f0Var.y = jF;
                    f0Var.z = false;
                    com.gamericefishpro.space.v0.e eVarZ = f0Var.z();
                    Object[] objArr = eVarZ.d;
                    int i4 = eVarZ.i;
                    for (int i5 = 0; i5 < i4; i5++) {
                        rectManager.e((f0) objArr[i5], false);
                    }
                    rectManager.d(f0Var);
                }
            }
        }
        if (f0Var.j0 > 0) {
            com.gamericefishpro.space.u6.l lVar = tVar6.q0.e;
            lVar.getClass();
            if (f0Var.j0 > 0) {
                ((com.gamericefishpro.space.v0.e) lVar.d).b(f0Var);
                f0Var.i0 = true;
            }
            tVar6.G(null);
        }
    }

    @Override // com.gamericefishpro.space.f2.p
    public final com.gamericefishpro.space.c3.l getLayoutDirection() {
        return this.H.T;
    }

    @Override // com.gamericefishpro.space.f2.u
    public final long h(long j) {
        long jH = H(j);
        com.gamericefishpro.space.i2.t tVar = (com.gamericefishpro.space.i2.t) i0.a(this.H);
        tVar.D();
        return com.gamericefishpro.space.o1.o.q(tVar.t0, jH);
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0180  */
    public final boolean h1(long j) {
        boolean z;
        boolean z2;
        boolean zN;
        if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        n1 n1Var = this.e0;
        if (n1Var == null || !this.L) {
            return true;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        com.gamericefishpro.space.r1.b bVar = ((com.gamericefishpro.space.i2.g1) n1Var).d;
        if (bVar.w) {
            com.gamericefishpro.space.o1.o oVarD = bVar.d();
            if (oVarD instanceof com.gamericefishpro.space.o1.c0) {
                com.gamericefishpro.space.n1.c cVar = ((com.gamericefishpro.space.o1.c0) oVarD).f;
                if (cVar.a > fIntBitsToFloat || fIntBitsToFloat >= cVar.c || cVar.b > fIntBitsToFloat2 || fIntBitsToFloat2 >= cVar.d) {
                    z = false;
                    z2 = true;
                }
                z = false;
                z2 = true;
            } else if (oVarD instanceof com.gamericefishpro.space.o1.d0) {
                com.gamericefishpro.space.n1.d dVar = ((com.gamericefishpro.space.o1.d0) oVarD).f;
                float f = dVar.a;
                long j2 = dVar.f;
                long j3 = dVar.h;
                long j4 = dVar.g;
                z = false;
                float f2 = dVar.d;
                z2 = true;
                float f3 = dVar.b;
                float f4 = dVar.c;
                long j5 = dVar.e;
                if (fIntBitsToFloat >= f && fIntBitsToFloat < f4 && fIntBitsToFloat2 >= f3 && fIntBitsToFloat2 < f2) {
                    int i = (int) (j5 >> 32);
                    float fIntBitsToFloat3 = Float.intBitsToFloat(i);
                    int i2 = (int) (j2 >> 32);
                    if (Float.intBitsToFloat(i2) + fIntBitsToFloat3 <= dVar.b()) {
                        int i3 = (int) (j3 >> 32);
                        float fIntBitsToFloat4 = Float.intBitsToFloat(i3);
                        int i4 = (int) (j4 >> 32);
                        if (Float.intBitsToFloat(i4) + fIntBitsToFloat4 <= dVar.b()) {
                            int i5 = (int) (j5 & 4294967295L);
                            int i6 = (int) (j3 & 4294967295L);
                            if (Float.intBitsToFloat(i6) + Float.intBitsToFloat(i5) <= dVar.a()) {
                                int i7 = (int) (j2 & 4294967295L);
                                int i8 = (int) (j4 & 4294967295L);
                                if (Float.intBitsToFloat(i8) + Float.intBitsToFloat(i7) <= dVar.a()) {
                                    float fIntBitsToFloat5 = Float.intBitsToFloat(i) + f;
                                    float fIntBitsToFloat6 = Float.intBitsToFloat(i5) + f3;
                                    float fIntBitsToFloat7 = f4 - Float.intBitsToFloat(i2);
                                    float fIntBitsToFloat8 = Float.intBitsToFloat(i7) + f3;
                                    float fIntBitsToFloat9 = f4 - Float.intBitsToFloat(i4);
                                    float fIntBitsToFloat10 = f2 - Float.intBitsToFloat(i8);
                                    float fIntBitsToFloat11 = f2 - Float.intBitsToFloat(i6);
                                    float fIntBitsToFloat12 = Float.intBitsToFloat(i3) + f;
                                    if (fIntBitsToFloat < fIntBitsToFloat5 && fIntBitsToFloat2 < fIntBitsToFloat6) {
                                        zN = com.gamericefishpro.space.i2.f0.n(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat5, fIntBitsToFloat6, dVar.e);
                                    } else if (fIntBitsToFloat < fIntBitsToFloat12 && fIntBitsToFloat2 > fIntBitsToFloat11) {
                                        zN = com.gamericefishpro.space.i2.f0.n(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat12, fIntBitsToFloat11, dVar.h);
                                    } else if (fIntBitsToFloat <= fIntBitsToFloat7 || fIntBitsToFloat2 >= fIntBitsToFloat8) {
                                        zN = (fIntBitsToFloat <= fIntBitsToFloat9 || fIntBitsToFloat2 <= fIntBitsToFloat10) ? z2 : com.gamericefishpro.space.i2.f0.n(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat9, fIntBitsToFloat10, dVar.g);
                                    } else {
                                        zN = com.gamericefishpro.space.i2.f0.n(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat7, fIntBitsToFloat8, dVar.f);
                                    }
                                } else {
                                    com.gamericefishpro.space.o1.h hVarA = com.gamericefishpro.space.o1.j.a();
                                    com.gamericefishpro.space.o1.h.b(hVarA, dVar);
                                    zN = com.gamericefishpro.space.i2.f0.m(fIntBitsToFloat, fIntBitsToFloat2, hVarA);
                                }
                            } else {
                                com.gamericefishpro.space.o1.h hVarA2 = com.gamericefishpro.space.o1.j.a();
                                com.gamericefishpro.space.o1.h.b(hVarA2, dVar);
                                zN = com.gamericefishpro.space.i2.f0.m(fIntBitsToFloat, fIntBitsToFloat2, hVarA2);
                            }
                        } else {
                            com.gamericefishpro.space.o1.h hVarA3 = com.gamericefishpro.space.o1.j.a();
                            com.gamericefishpro.space.o1.h.b(hVarA3, dVar);
                            zN = com.gamericefishpro.space.i2.f0.m(fIntBitsToFloat, fIntBitsToFloat2, hVarA3);
                        }
                    } else {
                        com.gamericefishpro.space.o1.h hVarA4 = com.gamericefishpro.space.o1.j.a();
                        com.gamericefishpro.space.o1.h.b(hVarA4, dVar);
                        zN = com.gamericefishpro.space.i2.f0.m(fIntBitsToFloat, fIntBitsToFloat2, hVarA4);
                    }
                }
            } else {
                z = false;
                z2 = true;
                if (!(oVarD instanceof com.gamericefishpro.space.o1.b0)) {
                    throw new com.gamericefishpro.space.oh.k();
                }
                zN = com.gamericefishpro.space.i2.f0.m(fIntBitsToFloat, fIntBitsToFloat2, ((com.gamericefishpro.space.o1.b0) oVarD).f);
            }
            zN = z;
        } else {
            z = false;
            z2 = true;
        }
        return zN ? z2 : z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    @Override // com.gamericefishpro.space.f2.u0, com.gamericefishpro.space.f2.k0
    public final Object i() {
        f0 f0Var = this.H;
        if (!f0Var.Z.d(64)) {
            return null;
        }
        K0();
        com.gamericefishpro.space.ei.a0 a0Var = new com.gamericefishpro.space.ei.a0();
        for (com.gamericefishpro.space.h1.l lVar = f0Var.Z.e; lVar != null; lVar = lVar.w) {
            if ((lVar.i & 64) != 0) {
                ?? E = lVar;
                ?? eVar = 0;
                while (E != 0) {
                    if (E instanceof r1) {
                        a0Var.d = ((r1) E).d0(a0Var.d);
                    } else if ((E.i & 64) != 0 && (E instanceof j)) {
                        com.gamericefishpro.space.h1.l lVar2 = ((j) E).I;
                        int i = 0;
                        E = E;
                        eVar = eVar;
                        while (lVar2 != null) {
                            if ((lVar2.i & 64) != 0) {
                                i++;
                                if (i == 1) {
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
                            }
                            lVar2 = lVar2.y;
                            E = E;
                            eVar = eVar;
                        }
                        if (i == 1) {
                        }
                    }
                    E = k.e(eVar);
                }
            }
        }
        return a0Var.d;
    }

    @Override // com.gamericefishpro.space.f2.u
    public final long k(com.gamericefishpro.space.f2.u uVar, long j) {
        f1 f1Var;
        boolean z = uVar instanceof com.gamericefishpro.space.f2.j0;
        if (z) {
            com.gamericefishpro.space.f2.j0 j0Var = (com.gamericefishpro.space.f2.j0) uVar;
            j0Var.d.H.T0();
            return j0Var.k(this, j ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        com.gamericefishpro.space.f2.j0 j0Var2 = z ? (com.gamericefishpro.space.f2.j0) uVar : null;
        if (j0Var2 == null || (f1Var = j0Var2.d.H) == null) {
            Intrinsics.c(uVar, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
            f1Var = (f1) uVar;
        }
        f1Var.T0();
        f1 f1VarG0 = G0(f1Var);
        while (f1Var != f1VarG0) {
            n1 n1Var = f1Var.e0;
            if (n1Var != null) {
                j = ((com.gamericefishpro.space.i2.g1) n1Var).c(false, j);
            }
            j = com.gamericefishpro.space.a.a.A(j, f1Var.S);
            f1Var = f1Var.J;
            Intrinsics.b(f1Var);
        }
        return A0(f1VarG0, j);
    }

    @Override // com.gamericefishpro.space.f2.u
    public final com.gamericefishpro.space.f2.u l() {
        boolean z = K0().G;
        f0 f0Var = this.H;
        if (!z) {
            StringBuilder sb = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (f0 f0VarV = f0Var; f0VarV != null; f0VarV = f0VarV.v()) {
                sb.append('\n');
                Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
                sb.append("|");
                sb.append(f0VarV);
                sb.append(" isAttached=");
                sb.append(f0VarV.H());
                sb.append(" modifier=");
                sb.append(f0VarV.e0);
                sb.append(" tail=");
                sb.append(K0());
            }
            com.gamericefishpro.space.e2.a.b(sb.toString());
        }
        T0();
        return f0Var.Z.d.J;
    }

    @Override // com.gamericefishpro.space.f2.u
    public final long o(com.gamericefishpro.space.f2.u uVar, long j) {
        return k(uVar, j);
    }

    @Override // com.gamericefishpro.space.h2.n0
    public final n0 o0() {
        return this.I;
    }

    @Override // com.gamericefishpro.space.h2.n0
    public final boolean q0() {
        return this.Q != null;
    }

    @Override // com.gamericefishpro.space.h2.n0
    public final f0 r0() {
        return this.H;
    }

    @Override // com.gamericefishpro.space.h2.n0
    public final com.gamericefishpro.space.f2.m0 s0() {
        com.gamericefishpro.space.f2.m0 m0Var = this.Q;
        if (m0Var != null) {
            return m0Var;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    @Override // com.gamericefishpro.space.h2.p1
    public final boolean t() {
        return (this.e0 == null || this.K || !this.H.H()) ? false : true;
    }

    @Override // com.gamericefishpro.space.h2.n0
    public final n0 t0() {
        return this.J;
    }

    @Override // com.gamericefishpro.space.h2.n0
    public final long u0() {
        return this.S;
    }

    @Override // com.gamericefishpro.space.h2.n0
    public final void y0() {
        a0(this.S, this.T, this.M);
    }

    @Override // com.gamericefishpro.space.f2.u
    public final com.gamericefishpro.space.n1.c z(com.gamericefishpro.space.f2.u uVar, boolean z) {
        f1 f1Var;
        if (!K0().G) {
            com.gamericefishpro.space.e2.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!uVar.E()) {
            com.gamericefishpro.space.e2.a.b("LayoutCoordinates " + uVar + " is not attached!");
        }
        com.gamericefishpro.space.f2.j0 j0Var = uVar instanceof com.gamericefishpro.space.f2.j0 ? (com.gamericefishpro.space.f2.j0) uVar : null;
        if (j0Var == null || (f1Var = j0Var.d.H) == null) {
            f1Var = (f1) uVar;
        }
        f1Var.T0();
        f1 f1VarG0 = G0(f1Var);
        com.gamericefishpro.space.n1.a aVar = this.U;
        if (aVar == null) {
            aVar = new com.gamericefishpro.space.n1.a();
            this.U = aVar;
        }
        aVar.a = 0.0f;
        aVar.b = 0.0f;
        aVar.c = (int) (uVar.F() >> 32);
        aVar.d = (int) (uVar.F() & 4294967295L);
        while (f1Var != f1VarG0) {
            f1Var.b1(aVar, z, false);
            if (aVar.b()) {
                return com.gamericefishpro.space.n1.c.e;
            }
            f1Var = f1Var.J;
            Intrinsics.b(f1Var);
        }
        z0(f1VarG0, aVar, z);
        return new com.gamericefishpro.space.n1.c(aVar.a, aVar.b, aVar.c, aVar.d);
    }

    public final void z0(f1 f1Var, com.gamericefishpro.space.n1.a aVar, boolean z) {
        if (f1Var == this) {
            return;
        }
        f1 f1Var2 = this.J;
        if (f1Var2 != null) {
            f1Var2.z0(f1Var, aVar, z);
        }
        long j = this.S;
        float f = (int) (j >> 32);
        aVar.a -= f;
        aVar.c -= f;
        float f2 = (int) (j & 4294967295L);
        aVar.b -= f2;
        aVar.d -= f2;
        n1 n1Var = this.e0;
        if (n1Var != null) {
            com.gamericefishpro.space.i2.g1 g1Var = (com.gamericefishpro.space.i2.g1) n1Var;
            float[] fArrA = g1Var.a();
            if (!g1Var.L) {
                if (fArrA == null) {
                    aVar.a = 0.0f;
                    aVar.b = 0.0f;
                    aVar.c = 0.0f;
                    aVar.d = 0.0f;
                } else {
                    com.gamericefishpro.space.o1.o.r(fArrA, aVar);
                }
            }
            if (this.L && z) {
                long j2 = this.i;
                aVar.a(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
            }
        }
    }

    @Override // com.gamericefishpro.space.h2.n0
    public final com.gamericefishpro.space.f2.u p0() {
        return this;
    }
}
