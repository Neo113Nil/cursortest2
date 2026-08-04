package com.gamericefishpro.space.z;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends com.gamericefishpro.space.h1.l implements com.gamericefishpro.space.h2.h, com.gamericefishpro.space.h2.u {
    public v0 H;
    public final q1 I;
    public boolean J;
    public final f1 K;
    public boolean M;
    public boolean O;
    public final com.gamericefishpro.space.h0.l L = new com.gamericefishpro.space.h0.l(1);
    public long N = 0;

    public i(v0 v0Var, q1 q1Var, boolean z, f1 f1Var) {
        this.H = v0Var;
        this.I = q1Var;
        this.J = z;
        this.K = f1Var;
    }

    public static final float A0(i iVar, c cVar, long j) {
        com.gamericefishpro.space.n1.c cVar2;
        int iCompare;
        if (com.gamericefishpro.space.c3.k.a(iVar.N, 0L)) {
            return 0.0f;
        }
        com.gamericefishpro.space.v0.e eVar = iVar.L.a;
        int i = eVar.i - 1;
        Object[] objArr = eVar.d;
        if (i < objArr.length) {
            cVar2 = null;
            while (i >= 0) {
                com.gamericefishpro.space.n1.c cVar3 = (com.gamericefishpro.space.n1.c) ((f) objArr[i]).a.invoke();
                if (cVar3 != null) {
                    long jB = cVar3.b();
                    long jQ = com.gamericefishpro.space.d9.h.Q(iVar.N);
                    int iOrdinal = iVar.H.ordinal();
                    if (iOrdinal == 0) {
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jB & 4294967295L)), Float.intBitsToFloat((int) (jQ & 4294967295L)));
                    } else {
                        if (iOrdinal != 1) {
                            throw new com.gamericefishpro.space.oh.k();
                        }
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jB >> 32)), Float.intBitsToFloat((int) (jQ >> 32)));
                    }
                    if (iCompare > 0) {
                        if (cVar2 != null) {
                            break;
                        }
                        cVar2 = cVar3;
                        break;
                    }
                    cVar2 = cVar3;
                }
                i--;
            }
        } else {
            cVar2 = null;
        }
        if (cVar2 == null) {
            com.gamericefishpro.space.n1.c cVar4 = iVar.M ? (com.gamericefishpro.space.n1.c) iVar.K.invoke() : null;
            if (cVar4 == null) {
                return 0.0f;
            }
            cVar2 = cVar4;
        }
        long jQ2 = com.gamericefishpro.space.d9.h.Q(iVar.N);
        int iOrdinal2 = iVar.H.ordinal();
        if (iOrdinal2 == 0) {
            float f = cVar2.b;
            return cVar.a(f - ((int) (j & 4294967295L)), cVar2.d - f, Float.intBitsToFloat((int) (jQ2 & 4294967295L)));
        }
        if (iOrdinal2 != 1) {
            throw new com.gamericefishpro.space.oh.k();
        }
        float f2 = cVar2.a;
        return cVar.a(f2 - ((int) (j >> 32)), cVar2.c - f2, Float.intBitsToFloat((int) (jQ2 >> 32)));
    }

    public static boolean B0(i iVar, com.gamericefishpro.space.n1.c cVar, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = iVar.N;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long jD0 = iVar.D0(cVar, j3, j2);
        return Math.abs(Float.intBitsToFloat((int) (jD0 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jD0 & 4294967295L))) <= 0.5f;
    }

    public final void C0(long j) {
        com.gamericefishpro.space.t0.a0 a0Var = e.a;
        c cVar = (c) com.gamericefishpro.space.h2.k.h(this, a0Var);
        if (this.O) {
            com.gamericefishpro.space.c0.a.c("launchAnimation called when previous animation was running");
        }
        ((c) com.gamericefishpro.space.h2.k.h(this, a0Var)).getClass();
        c.a.getClass();
        u1 u1Var = new u1(b.b);
        com.gamericefishpro.space.pi.x xVarO0 = o0();
        com.gamericefishpro.space.pi.y yVar = com.gamericefishpro.space.pi.y.d;
        com.gamericefishpro.space.pi.a0.u(xVarO0, null, new h(this, u1Var, cVar, j, null), 1);
    }

    public final long D0(com.gamericefishpro.space.n1.c cVar, long j, long j2) {
        long jFloatToRawIntBits;
        long jFloatToRawIntBits2;
        long jQ = com.gamericefishpro.space.d9.h.Q(j);
        int iOrdinal = this.H.ordinal();
        if (iOrdinal == 0) {
            c cVar2 = (c) com.gamericefishpro.space.h2.k.h(this, e.a);
            float f = cVar.b;
            float fA = cVar2.a(f - ((int) (j2 & 4294967295L)), cVar.d - f, Float.intBitsToFloat((int) (jQ & 4294967295L)));
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fA);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        } else {
            if (iOrdinal != 1) {
                throw new com.gamericefishpro.space.oh.k();
            }
            c cVar3 = (c) com.gamericefishpro.space.h2.k.h(this, e.a);
            float f2 = cVar.a;
            jFloatToRawIntBits = ((long) Float.floatToRawIntBits(cVar3.a(f2 - ((int) (j2 >> 32)), cVar.c - f2, Float.intBitsToFloat((int) (jQ >> 32))))) << 32;
            jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(0.0f)) & 4294967295L;
        }
        return jFloatToRawIntBits | jFloatToRawIntBits2;
    }

    @Override // com.gamericefishpro.space.h2.u
    public final void l(long j) {
        int iD;
        long j2;
        long j3;
        long j4;
        long j5 = this.N;
        this.N = j;
        int iOrdinal = this.H.ordinal();
        if (iOrdinal == 0) {
            iD = Intrinsics.d((int) (j & 4294967295L), (int) (j5 & 4294967295L));
        } else {
            if (iOrdinal != 1) {
                throw new com.gamericefishpro.space.oh.k();
            }
            iD = Intrinsics.d((int) (j >> 32), (int) (j5 >> 32));
        }
        if (iD >= 0) {
            return;
        }
        if (this.J) {
            j2 = 0;
        } else {
            if (this.H == v0.d) {
                j3 = ((long) 0) << 32;
                j4 = ((int) (j5 & 4294967295L)) - ((int) (j & 4294967295L));
            } else {
                j3 = ((long) (((int) (j5 >> 32)) - ((int) (j >> 32)))) << 32;
                j4 = 0;
            }
            j2 = j3 | (j4 & 4294967295L);
        }
        long j6 = j2;
        com.gamericefishpro.space.n1.c cVar = (com.gamericefishpro.space.n1.c) this.K.invoke();
        if (cVar == null || this.O || this.M || !B0(this, cVar, j5, 0L, 2) || B0(this, cVar, 0L, j6, 1)) {
            return;
        }
        this.M = true;
        C0(j6);
    }

    @Override // com.gamericefishpro.space.h1.l
    public final boolean p0() {
        return false;
    }
}
