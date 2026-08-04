package com.gamericefishpro.space.i2;

import android.view.ViewParent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 implements com.gamericefishpro.space.h2.n1 {
    public float[] B;
    public boolean C;
    public int G;
    public com.gamericefishpro.space.o1.o I;
    public boolean J;
    public boolean K;
    public boolean M;
    public com.gamericefishpro.space.r1.b d;
    public final com.gamericefishpro.space.o1.v e;
    public final t i;
    public Function2 v;
    public Function0 w;
    public long y;
    public boolean z;
    public final float[] A = com.gamericefishpro.space.o1.o.i();
    public com.gamericefishpro.space.c3.c D = com.gamericefishpro.space.u6.f.a();
    public com.gamericefishpro.space.c3.l E = com.gamericefishpro.space.c3.l.d;
    public final com.gamericefishpro.space.q1.b F = new com.gamericefishpro.space.q1.b();
    public long H = com.gamericefishpro.space.o1.n0.b;
    public boolean L = true;
    public final com.gamericefishpro.space.b2.d0 N = new com.gamericefishpro.space.b2.d0(11, this);

    public g1(com.gamericefishpro.space.r1.b bVar, com.gamericefishpro.space.o1.v vVar, t tVar, Function2 function2, Function0 function0) {
        this.d = bVar;
        this.e = vVar;
        this.i = tVar;
        this.v = function2;
        this.w = function0;
        long j = Integer.MAX_VALUE;
        this.y = (j & 4294967295L) | (j << 32);
    }

    public final float[] a() {
        float[] fArrI = this.B;
        if (fArrI == null) {
            fArrI = com.gamericefishpro.space.o1.o.i();
            this.B = fArrI;
        }
        if (this.K) {
            this.K = false;
            float[] fArrB = b();
            if (this.L) {
                return fArrB;
            }
            if (!f0.l(fArrB, fArrI)) {
                fArrI[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArrI[0])) {
            return null;
        }
        return fArrI;
    }

    public final float[] b() {
        boolean z = this.J;
        float[] fArr = this.A;
        if (z) {
            com.gamericefishpro.space.r1.b bVar = this.d;
            long jV = bVar.v;
            com.gamericefishpro.space.r1.d dVar = bVar.a;
            if ((9223372034707292159L & jV) == 9205357640488583168L) {
                jV = com.gamericefishpro.space.wa.b.v(com.gamericefishpro.space.d9.h.Q(this.y));
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jV >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jV & 4294967295L));
            float fT = dVar.t();
            float f = dVar.f();
            float fX = dVar.x();
            float fG = dVar.G();
            float fL = dVar.L();
            float fD = dVar.d();
            float fK = dVar.K();
            double d = ((double) fX) * 0.017453292519943295d;
            float fSin = (float) Math.sin(d);
            float fCos = (float) Math.cos(d);
            float f2 = -fSin;
            float f3 = (f * fCos) - (0.0f * fSin);
            float f4 = (0.0f * fCos) + (f * fSin);
            double d2 = ((double) fG) * 0.017453292519943295d;
            float fSin2 = (float) Math.sin(d2);
            float fCos2 = (float) Math.cos(d2);
            float f5 = -fSin2;
            float f6 = fSin * fSin2;
            float f7 = fSin * fCos2;
            float f8 = fCos * fSin2;
            float f9 = fCos * fCos2;
            float f10 = (f4 * fSin2) + (fT * fCos2);
            float f11 = (f4 * fCos2) + ((-fT) * fSin2);
            double d3 = ((double) fL) * 0.017453292519943295d;
            float fSin3 = (float) Math.sin(d3);
            float fCos3 = (float) Math.cos(d3);
            float f12 = -fSin3;
            float f13 = (fCos3 * f6) + (f12 * fCos2);
            float f14 = (f6 * fSin3) + (fCos2 * fCos3);
            float f15 = fSin3 * fCos;
            float f16 = f14 * fD;
            float f17 = f15 * fD;
            float f18 = ((fSin3 * f7) + (fCos3 * f5)) * fD;
            float f19 = f13 * fK;
            float f20 = fCos * fCos3 * fK;
            float f21 = ((fCos3 * f7) + (f12 * f5)) * fK;
            float f22 = f8 * 1.0f;
            float f23 = f2 * 1.0f;
            float f24 = f9 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f16;
                fArr[1] = f17;
                fArr[2] = f18;
                fArr[3] = 0.0f;
                fArr[4] = f19;
                fArr[5] = f20;
                fArr[6] = f21;
                fArr[7] = 0.0f;
                fArr[8] = f22;
                fArr[9] = f23;
                fArr[10] = f24;
                fArr[11] = 0.0f;
                float f25 = -fIntBitsToFloat;
                fArr[12] = ((f16 * f25) - (fIntBitsToFloat2 * f19)) + f10 + fIntBitsToFloat;
                fArr[13] = ((f17 * f25) - (fIntBitsToFloat2 * f20)) + f3 + fIntBitsToFloat2;
                fArr[14] = ((f25 * f18) - (fIntBitsToFloat2 * f21)) + f11;
                fArr[15] = 1.0f;
            }
            this.J = false;
            this.L = com.gamericefishpro.space.o1.o.p(fArr);
        }
        return fArr;
    }

    public final long c(boolean z, long j) {
        float[] fArrB;
        if (z) {
            fArrB = a();
            if (fArrB == null) {
                return 9187343241974906880L;
            }
        } else {
            fArrB = b();
        }
        return this.L ? j : com.gamericefishpro.space.o1.o.q(fArrB, j);
    }

    public final void d(long j) {
        t tVar = this.i;
        if (tVar.E) {
            tVar.M(-4.0f);
        }
        com.gamericefishpro.space.r1.b bVar = this.d;
        if (!com.gamericefishpro.space.c3.i.a(bVar.t, j)) {
            bVar.t = j;
            bVar.a.F((int) (j >> 32), (int) (j & 4294967295L), bVar.u);
        }
        ViewParent parent = tVar.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(tVar, tVar);
        }
    }

    public final void e(long j) {
        if (com.gamericefishpro.space.c3.k.a(j, this.y)) {
            return;
        }
        t tVar = this.i;
        if (tVar.E) {
            tVar.M(-4.0f);
        }
        this.y = j;
        if (this.C || this.z) {
            return;
        }
        tVar.invalidate();
        if (true != this.C) {
            this.C = true;
            tVar.x(this, true);
        }
    }

    public final void f() {
        if (this.C) {
            if (!com.gamericefishpro.space.o1.n0.a(this.H, com.gamericefishpro.space.o1.n0.b) && !com.gamericefishpro.space.c3.k.a(this.d.u, this.y)) {
                com.gamericefishpro.space.r1.b bVar = this.d;
                float fB = com.gamericefishpro.space.o1.n0.b(this.H) * ((int) (this.y >> 32));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(com.gamericefishpro.space.o1.n0.c(this.H) * ((int) (this.y & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fB) << 32);
                if (!com.gamericefishpro.space.n1.b.b(bVar.v, jFloatToRawIntBits)) {
                    bVar.v = jFloatToRawIntBits;
                    bVar.a.N(jFloatToRawIntBits);
                }
            }
            com.gamericefishpro.space.r1.b bVar2 = this.d;
            com.gamericefishpro.space.c3.c cVar = this.D;
            com.gamericefishpro.space.c3.l lVar = this.E;
            long j = this.y;
            long j2 = bVar2.u;
            com.gamericefishpro.space.r1.d dVar = bVar2.a;
            if (!com.gamericefishpro.space.c3.k.a(j2, j)) {
                bVar2.u = j;
                long j3 = bVar2.t;
                dVar.F((int) (j3 >> 32), (int) (4294967295L & j3), j);
                if (bVar2.i == 9205357640488583168L) {
                    bVar2.g = true;
                    bVar2.a();
                }
            }
            bVar2.b = cVar;
            bVar2.c = lVar;
            bVar2.d = this.N;
            dVar.i(cVar, lVar, bVar2, bVar2.e);
            if (this.C) {
                this.C = false;
                this.i.x(this, false);
            }
        }
    }

    @Override // com.gamericefishpro.space.h2.n1
    public final void invalidate() {
        if (this.C || this.z) {
            return;
        }
        t tVar = this.i;
        tVar.invalidate();
        if (true != this.C) {
            this.C = true;
            tVar.x(this, true);
        }
    }
}
