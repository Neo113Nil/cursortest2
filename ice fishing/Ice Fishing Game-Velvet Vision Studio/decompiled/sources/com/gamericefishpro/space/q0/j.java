package com.gamericefishpro.space.q0;

import com.gamericefishpro.space.d0.g1;
import com.gamericefishpro.space.t0.p1;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static final com.gamericefishpro.space.h1.m a = g1.f(com.gamericefishpro.space.h1.j.a, com.gamericefishpro.space.s0.g.a);

    /* JADX WARN: Code duplicated, block: B:78:0x011d  */
    public static final void a(com.gamericefishpro.space.t1.b bVar, String str, com.gamericefishpro.space.h1.m mVar, long j, com.gamericefishpro.space.t0.r rVar, int i) {
        com.gamericefishpro.space.t1.b bVar2;
        int i2;
        com.gamericefishpro.space.h1.m mVar2;
        rVar.b0(-2142239481);
        if ((i & 6) == 0) {
            bVar2 = bVar;
            i2 = (rVar.h(bVar2) ? 4 : 2) | i;
        } else {
            bVar2 = bVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= rVar.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= rVar.f(mVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= rVar.e(j) ? 2048 : 1024;
        }
        if (rVar.S(i2 & 1, (i2 & 1171) != 1170)) {
            rVar.X();
            if ((i & 1) != 0 && !rVar.B()) {
                rVar.V();
            }
            rVar.q();
            boolean z = (((i2 & 7168) ^ 3072) > 2048 && rVar.e(j)) || (i2 & 3072) == 2048;
            Object objP = rVar.P();
            com.gamericefishpro.space.t0.f fVar = com.gamericefishpro.space.t0.n.a;
            if (z || objP == fVar) {
                objP = com.gamericefishpro.space.o1.s.d(j, com.gamericefishpro.space.o1.s.g) ? null : new com.gamericefishpro.space.o1.k(5, j);
                rVar.k0(objP);
            }
            com.gamericefishpro.space.o1.k kVar = (com.gamericefishpro.space.o1.k) objP;
            com.gamericefishpro.space.h1.m mVar3 = com.gamericefishpro.space.h1.j.a;
            if (str != null) {
                rVar.a0(-536990979);
                boolean z2 = (i2 & 112) == 32;
                Object objP2 = rVar.P();
                if (z2 || objP2 == fVar) {
                    objP2 = new com.gamericefishpro.space.i5.f(str, 1);
                    rVar.k0(objP2);
                }
                AtomicInteger atomicInteger = com.gamericefishpro.space.o2.m.a;
                com.gamericefishpro.space.o2.b bVar3 = new com.gamericefishpro.space.o2.b((Function1) objP2, false);
                rVar.p(false);
                mVar2 = bVar3;
            } else {
                rVar.a0(-536832197);
                rVar.p(false);
                mVar2 = mVar3;
            }
            if (com.gamericefishpro.space.n1.e.a(bVar2.d(), 9205357640488583168L)) {
                mVar3 = a;
            } else {
                long jD = bVar2.d();
                if (Float.isInfinite(Float.intBitsToFloat((int) (jD >> 32))) && Float.isInfinite(Float.intBitsToFloat((int) (jD & 4294967295L)))) {
                    mVar3 = a;
                }
            }
            com.gamericefishpro.space.d0.r.a(com.gamericefishpro.space.l1.h.e(mVar.c(mVar3), bVar2, com.gamericefishpro.space.f2.h.b, 0.0f, kVar, 22).c(mVar2), rVar, 0);
        } else {
            rVar.V();
        }
        p1 p1VarT = rVar.t();
        if (p1VarT != null) {
            p1VarT.d = new i(bVar, str, mVar, j, i, 1);
        }
    }

    public static final void b(com.gamericefishpro.space.u1.f fVar, String str, com.gamericefishpro.space.h1.m mVar, long j, com.gamericefishpro.space.t0.r rVar, int i) {
        int i2;
        rVar.b0(-126890956);
        if ((i & 6) == 0) {
            i2 = (rVar.f(fVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= rVar.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= rVar.f(mVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= rVar.e(j) ? 2048 : 1024;
        }
        if (rVar.S(i2 & 1, (i2 & 1171) != 1170)) {
            rVar.X();
            if ((i & 1) != 0 && !rVar.B()) {
                rVar.V();
            }
            rVar.q();
            a(com.gamericefishpro.space.u1.b.d(fVar, rVar), str, mVar, j, rVar, (i2 & 112) | 8 | (i2 & 896) | (i2 & 7168));
        } else {
            rVar.V();
        }
        p1 p1VarT = rVar.t();
        if (p1VarT != null) {
            p1VarT.d = new i(fVar, str, mVar, j, i, 0);
        }
    }
}
