package com.gamericefishpro.space.h2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements com.gamericefishpro.space.q1.d {
    public final com.gamericefishpro.space.q1.b d = new com.gamericefishpro.space.q1.b();
    public l e;

    @Override // com.gamericefishpro.space.c3.c
    public final float D(long j) {
        return this.d.D(j);
    }

    @Override // com.gamericefishpro.space.c3.c
    public final int J(float f) {
        return this.d.J(f);
    }

    @Override // com.gamericefishpro.space.q1.d
    public final void O(com.gamericefishpro.space.o1.h hVar, long j, com.gamericefishpro.space.q1.c cVar) {
        this.d.O(hVar, j, cVar);
    }

    @Override // com.gamericefishpro.space.q1.d
    public final long Q() {
        return this.d.Q();
    }

    @Override // com.gamericefishpro.space.c3.c
    public final long S(long j) {
        return this.d.S(j);
    }

    @Override // com.gamericefishpro.space.q1.d
    public final void T(com.gamericefishpro.space.o1.o oVar, long j, long j2, float f, com.gamericefishpro.space.q1.c cVar) {
        this.d.T(oVar, j, j2, f, cVar);
    }

    @Override // com.gamericefishpro.space.c3.c
    public final float V(long j) {
        return this.d.V(j);
    }

    @Override // com.gamericefishpro.space.q1.d
    public final void W(long j, long j2, long j3, com.gamericefishpro.space.q1.c cVar, int i) {
        this.d.W(j, j2, j3, cVar, i);
    }

    public final void a() {
        com.gamericefishpro.space.q1.b bVar = this.d;
        com.gamericefishpro.space.o1.q qVarJ = bVar.e.j();
        i iVar = this.e;
        if (iVar == null) {
            throw com.gamericefishpro.space.m5.a.e("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        com.gamericefishpro.space.h1.l lVar = (com.gamericefishpro.space.h1.l) iVar;
        com.gamericefishpro.space.h1.l lVarE = lVar.d.y;
        if (lVarE != null && (lVarE.v & 4) != 0) {
            while (true) {
                if (lVarE != null) {
                    int i = lVarE.i;
                    if ((i & 2) == 0) {
                        if ((i & 4) != 0) {
                            break;
                        } else {
                            lVarE = lVarE.y;
                        }
                    }
                }
                lVarE = null;
                break;
            }
        } else {
            lVarE = null;
            break;
        }
        if (lVarE == null) {
            f1 f1VarQ = k.q(iVar, 4);
            if (f1VarQ.K0() == lVar.d) {
                f1VarQ = f1VarQ.I;
                Intrinsics.b(f1VarQ);
            }
            f1VarQ.Z0(qVarJ, (com.gamericefishpro.space.r1.b) bVar.e.i);
            return;
        }
        com.gamericefishpro.space.v0.e eVar = null;
        while (lVarE != null) {
            if (lVarE instanceof l) {
                l lVar2 = (l) lVarE;
                com.gamericefishpro.space.r1.b bVar2 = (com.gamericefishpro.space.r1.b) bVar.e.i;
                f1 f1VarQ2 = k.q(lVar2, 4);
                long jQ = com.gamericefishpro.space.d9.h.Q(f1VarQ2.i);
                f0 f0Var = f1VarQ2.H;
                f0Var.getClass();
                ((com.gamericefishpro.space.i2.t) i0.a(f0Var)).getSharedDrawScope().d(qVarJ, jQ, f1VarQ2, lVar2, bVar2);
            } else if ((lVarE.i & 4) != 0 && (lVarE instanceof j)) {
                int i2 = 0;
                for (com.gamericefishpro.space.h1.l lVar3 = ((j) lVarE).I; lVar3 != null; lVar3 = lVar3.y) {
                    if ((lVar3.i & 4) != 0) {
                        i2++;
                        if (i2 == 1) {
                            lVarE = lVar3;
                        } else {
                            if (eVar == null) {
                                eVar = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
                            }
                            if (lVarE != null) {
                                eVar.b(lVarE);
                                lVarE = null;
                            }
                            eVar.b(lVar3);
                        }
                    }
                }
                if (i2 == 1) {
                }
            }
            lVarE = k.e(eVar);
        }
    }

    @Override // com.gamericefishpro.space.c3.c
    public final float b() {
        return this.d.b();
    }

    @Override // com.gamericefishpro.space.c3.c
    public final long b0(float f) {
        return this.d.b0(f);
    }

    @Override // com.gamericefishpro.space.q1.d
    public final long c() {
        return this.d.c();
    }

    public final void d(com.gamericefishpro.space.o1.q qVar, long j, f1 f1Var, l lVar, com.gamericefishpro.space.r1.b bVar) {
        l lVar2 = this.e;
        this.e = lVar;
        com.gamericefishpro.space.c3.l lVar3 = f1Var.H.T;
        com.gamericefishpro.space.q1.b bVar2 = this.d;
        com.gamericefishpro.space.a8.c cVar = bVar2.e;
        com.gamericefishpro.space.q1.a aVar = ((com.gamericefishpro.space.q1.b) cVar.v).d;
        com.gamericefishpro.space.c3.c cVar2 = aVar.a;
        com.gamericefishpro.space.c3.l lVar4 = aVar.b;
        com.gamericefishpro.space.o1.q qVarJ = cVar.j();
        com.gamericefishpro.space.a8.c cVar3 = bVar2.e;
        long jO = cVar3.o();
        com.gamericefishpro.space.r1.b bVar3 = (com.gamericefishpro.space.r1.b) cVar3.i;
        cVar3.E(f1Var);
        cVar3.G(lVar3);
        cVar3.D(qVar);
        cVar3.H(j);
        cVar3.i = bVar;
        qVar.k();
        try {
            lVar.f(this);
            qVar.i();
            cVar3.E(cVar2);
            cVar3.G(lVar4);
            cVar3.D(qVarJ);
            cVar3.H(jO);
            cVar3.i = bVar3;
            this.e = lVar2;
        } catch (Throwable th) {
            qVar.i();
            cVar3.E(cVar2);
            cVar3.G(lVar4);
            cVar3.D(qVarJ);
            cVar3.H(jO);
            cVar3.i = bVar3;
            throw th;
        }
    }

    public final void e(com.gamericefishpro.space.o1.o oVar, long j, long j2, long j3, float f, com.gamericefishpro.space.q1.c cVar) {
        com.gamericefishpro.space.q1.b bVar = this.d;
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        bVar.d.c.b(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), bVar.d(oVar, cVar, f, null, 3, 1));
    }

    @Override // com.gamericefishpro.space.c3.c
    public final float g() {
        return this.d.g();
    }

    @Override // com.gamericefishpro.space.c3.c
    public final float g0(int i) {
        return this.d.g0(i);
    }

    @Override // com.gamericefishpro.space.q1.d
    public final com.gamericefishpro.space.c3.l getLayoutDirection() {
        return this.d.d.b;
    }

    @Override // com.gamericefishpro.space.c3.c
    public final float i0(float f) {
        return f / this.d.b();
    }

    @Override // com.gamericefishpro.space.q1.d
    public final void m(com.gamericefishpro.space.o1.f fVar, long j, long j2, long j3, float f, com.gamericefishpro.space.o1.k kVar, int i) {
        this.d.m(fVar, j, j2, j3, f, kVar, i);
    }

    @Override // com.gamericefishpro.space.c3.c
    public final long q(float f) {
        return this.d.q(f);
    }

    @Override // com.gamericefishpro.space.c3.c
    public final float r(float f) {
        return this.d.b() * f;
    }

    @Override // com.gamericefishpro.space.q1.d
    public final void s(com.gamericefishpro.space.o1.h hVar, com.gamericefishpro.space.o1.o oVar, float f, com.gamericefishpro.space.q1.c cVar, int i) {
        this.d.s(hVar, oVar, f, cVar, i);
    }

    @Override // com.gamericefishpro.space.q1.d
    public final com.gamericefishpro.space.a8.c x() {
        return this.d.e;
    }
}
