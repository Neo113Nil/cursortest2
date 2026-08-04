package com.gamericefishpro.space.y;

import com.gamericefishpro.space.h2.j1;
import com.gamericefishpro.space.h2.x1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends com.gamericefishpro.space.h1.l implements com.gamericefishpro.space.h2.l, j1, x1 {
    public long H;
    public com.gamericefishpro.space.o1.o I;
    public float J;
    public com.gamericefishpro.space.o1.k0 K;
    public long L;
    public com.gamericefishpro.space.c3.l M;
    public com.gamericefishpro.space.o1.o N;
    public com.gamericefishpro.space.o1.k0 O;
    public com.gamericefishpro.space.o1.o P;

    @Override // com.gamericefishpro.space.h2.j1
    public final void E() {
        this.L = 9205357640488583168L;
        this.M = null;
        this.N = null;
        this.O = null;
        com.gamericefishpro.space.h2.k.j(this);
    }

    @Override // com.gamericefishpro.space.h2.x1
    public final void L(com.gamericefishpro.space.o2.w wVar) {
        com.gamericefishpro.space.o2.u.b(wVar, this.K);
    }

    @Override // com.gamericefishpro.space.h2.x1
    public final boolean d() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0186  */
    /* JADX WARN: Code duplicated, block: B:42:0x018c  */
    /* JADX WARN: Code duplicated, block: B:43:0x01af  */
    /* JADX WARN: Code duplicated, block: B:45:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:47:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:49:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:50:0x0213  */
    /* JADX WARN: Code duplicated, block: B:52:0x0217  */
    /* JADX WARN: Code duplicated, block: B:53:0x0222  */
    @Override // com.gamericefishpro.space.h2.l
    public final void f(com.gamericefishpro.space.h2.h0 h0Var) {
        com.gamericefishpro.space.o1.o oVar;
        com.gamericefishpro.space.q1.f fVar;
        long j;
        char c;
        com.gamericefishpro.space.o1.o oVar2;
        com.gamericefishpro.space.o1.o oVar3;
        float f;
        com.gamericefishpro.space.o1.o oVar4;
        com.gamericefishpro.space.o1.h hVar;
        com.gamericefishpro.space.o1.d0 d0Var;
        com.gamericefishpro.space.q1.b bVar = h0Var.d;
        if (this.K == com.gamericefishpro.space.o1.o.b) {
            if (!com.gamericefishpro.space.o1.s.d(this.H, com.gamericefishpro.space.o1.s.g)) {
                com.gamericefishpro.space.q1.d.w(h0Var, this.H, 0L, 126);
            }
            com.gamericefishpro.space.o1.o oVar5 = this.I;
            if (oVar5 != null) {
                com.gamericefishpro.space.q1.d.n0(h0Var, oVar5, 0L, 0L, this.J, null, 118);
            }
        } else {
            if (com.gamericefishpro.space.n1.e.a(bVar.c(), this.L) && h0Var.getLayoutDirection() == this.M && Intrinsics.a(this.O, this.K)) {
                oVar = this.N;
                Intrinsics.b(oVar);
            } else {
                com.gamericefishpro.space.h2.k.p(this, new com.gamericefishpro.space.e.e(13, this, h0Var));
                oVar = this.P;
                this.P = null;
            }
            com.gamericefishpro.space.o1.o oVar6 = oVar;
            this.N = oVar6;
            this.L = bVar.c();
            this.M = h0Var.getLayoutDirection();
            this.O = this.K;
            Intrinsics.b(oVar6);
            boolean zD = com.gamericefishpro.space.o1.s.d(this.H, com.gamericefishpro.space.o1.s.g);
            com.gamericefishpro.space.q1.f fVar2 = com.gamericefishpro.space.q1.f.b;
            if (zD) {
                fVar = fVar2;
            } else {
                long j2 = this.H;
                if (oVar6 instanceof com.gamericefishpro.space.o1.c0) {
                    com.gamericefishpro.space.n1.c cVar = ((com.gamericefishpro.space.o1.c0) oVar6).f;
                    float f2 = cVar.a;
                    fVar = fVar2;
                    h0Var.W(j2, (((long) Float.floatToRawIntBits(cVar.b)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32), com.gamericefishpro.space.o1.o.u(cVar), fVar, 3);
                } else {
                    fVar = fVar2;
                    if (oVar6 instanceof com.gamericefishpro.space.o1.d0) {
                        com.gamericefishpro.space.o1.d0 d0Var2 = (com.gamericefishpro.space.o1.d0) oVar6;
                        com.gamericefishpro.space.o1.h hVar2 = d0Var2.g;
                        if (hVar2 != null) {
                            h0Var.O(hVar2, j2, fVar);
                        } else {
                            com.gamericefishpro.space.n1.d dVar = d0Var2.f;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.h >> 32));
                            float f3 = dVar.a;
                            j = 4294967295L;
                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(dVar.b)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
                            float fB = dVar.b();
                            float fA = dVar.a();
                            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fB);
                            c = ' ';
                            oVar2 = oVar6;
                            long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(fA)) & 4294967295L) | (jFloatToRawIntBits2 << 32);
                            long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
                            int i = (int) (jFloatToRawIntBits >> 32);
                            int i2 = (int) (jFloatToRawIntBits & 4294967295L);
                            bVar.d.c.b(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (jFloatToRawIntBits3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (jFloatToRawIntBits3 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (jFloatToRawIntBits4 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits4 & 4294967295L)), com.gamericefishpro.space.q1.b.a(bVar, j2, fVar, 3));
                        }
                    } else {
                        oVar2 = oVar6;
                        c = ' ';
                        j = 4294967295L;
                        if (!(oVar2 instanceof com.gamericefishpro.space.o1.b0)) {
                            throw new com.gamericefishpro.space.oh.k();
                        }
                        h0Var.O(((com.gamericefishpro.space.o1.b0) oVar2).f, j2, fVar);
                    }
                    oVar3 = this.I;
                    if (oVar3 != null) {
                        f = this.J;
                        if (oVar2 instanceof com.gamericefishpro.space.o1.c0) {
                            com.gamericefishpro.space.n1.c cVar2 = ((com.gamericefishpro.space.o1.c0) oVar2).f;
                            float f4 = cVar2.a;
                            h0Var.T(oVar3, (((long) Float.floatToRawIntBits(cVar2.b)) & j) | (Float.floatToRawIntBits(f4) << c), com.gamericefishpro.space.o1.o.u(cVar2), f, fVar);
                        } else {
                            if (oVar2 instanceof com.gamericefishpro.space.o1.d0) {
                                d0Var = (com.gamericefishpro.space.o1.d0) oVar2;
                                oVar4 = oVar3;
                                hVar = d0Var.g;
                                if (hVar != null) {
                                    com.gamericefishpro.space.n1.d dVar2 = d0Var.f;
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (dVar2.h >> c));
                                    float f5 = dVar2.a;
                                    h0Var.e(oVar4, (((long) Float.floatToRawIntBits(dVar2.b)) & j) | (Float.floatToRawIntBits(f5) << c), (((long) Float.floatToRawIntBits(dVar2.b())) << c) | (((long) Float.floatToRawIntBits(dVar2.a())) & j), (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << c) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & j), f, fVar);
                                }
                            } else {
                                if (oVar2 instanceof com.gamericefishpro.space.o1.b0) {
                                    throw new com.gamericefishpro.space.oh.k();
                                }
                                oVar4 = oVar3;
                                hVar = ((com.gamericefishpro.space.o1.b0) oVar2).f;
                            }
                            h0Var.s(hVar, oVar4, f, fVar, 3);
                        }
                    }
                }
            }
            oVar2 = oVar6;
            c = ' ';
            j = 4294967295L;
            oVar3 = this.I;
            if (oVar3 != null) {
                f = this.J;
                if (oVar2 instanceof com.gamericefishpro.space.o1.c0) {
                    com.gamericefishpro.space.n1.c cVar3 = ((com.gamericefishpro.space.o1.c0) oVar2).f;
                    float f6 = cVar3.a;
                    h0Var.T(oVar3, (((long) Float.floatToRawIntBits(cVar3.b)) & j) | (Float.floatToRawIntBits(f6) << c), com.gamericefishpro.space.o1.o.u(cVar3), f, fVar);
                } else {
                    if (oVar2 instanceof com.gamericefishpro.space.o1.d0) {
                        d0Var = (com.gamericefishpro.space.o1.d0) oVar2;
                        oVar4 = oVar3;
                        hVar = d0Var.g;
                        if (hVar != null) {
                            com.gamericefishpro.space.n1.d dVar3 = d0Var.f;
                            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (dVar3.h >> c));
                            float f7 = dVar3.a;
                            h0Var.e(oVar4, (((long) Float.floatToRawIntBits(dVar3.b)) & j) | (Float.floatToRawIntBits(f7) << c), (((long) Float.floatToRawIntBits(dVar3.b())) << c) | (((long) Float.floatToRawIntBits(dVar3.a())) & j), (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << c) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & j), f, fVar);
                        }
                    } else {
                        if (oVar2 instanceof com.gamericefishpro.space.o1.b0) {
                            throw new com.gamericefishpro.space.oh.k();
                        }
                        oVar4 = oVar3;
                        hVar = ((com.gamericefishpro.space.o1.b0) oVar2).f;
                    }
                    h0Var.s(hVar, oVar4, f, fVar, 3);
                }
            }
        }
        h0Var.a();
    }
}
