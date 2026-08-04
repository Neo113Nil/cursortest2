package com.gamericefishpro.space.q1;

import com.gamericefishpro.space.c3.l;
import com.gamericefishpro.space.h2.h0;
import com.gamericefishpro.space.o1.h;
import com.gamericefishpro.space.o1.k;
import com.gamericefishpro.space.o1.o;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public interface d extends com.gamericefishpro.space.c3.c {
    static void A(d dVar, com.gamericefishpro.space.o1.f fVar, long j, long j2, float f, k kVar, int i, int i2) {
        dVar.m(fVar, 0L, j, (i2 & 16) != 0 ? j : j2, (i2 & 32) != 0 ? 1.0f : f, kVar, (i2 & 512) != 0 ? 1 : i);
    }

    static void I(h0 h0Var, long j, float f) {
        long jQ = h0Var.d.Q();
        b bVar = h0Var.d;
        bVar.d.c.l(f, jQ, b.a(bVar, j, f.b, 3));
    }

    static void M(h0 h0Var, o oVar, long j, long j2, long j3, c cVar, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j4 = j;
        h0Var.e(oVar, j4, (i & 4) != 0 ? l0(h0Var.d.c(), j4) : j2, j3, 1.0f, (i & 32) != 0 ? f.b : cVar);
    }

    static /* synthetic */ void j0(d dVar, h hVar, o oVar, float f, g gVar, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        c cVar = gVar;
        if ((i & 8) != 0) {
            cVar = f.b;
        }
        dVar.s(hVar, oVar, f2, cVar, (i & 32) != 0 ? 3 : 0);
    }

    static long l0(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    static /* synthetic */ void n0(d dVar, o oVar, long j, long j2, float f, c cVar, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = l0(dVar.c(), j3);
        }
        dVar.T(oVar, j3, j2, (i & 8) != 0 ? 1.0f : f, (i & 16) != 0 ? f.b : cVar);
    }

    static /* synthetic */ void w(d dVar, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = l0(dVar.c(), 0L);
        }
        dVar.W(j, 0L, j2, f.b, (i & 64) != 0 ? 3 : 0);
    }

    void O(h hVar, long j, c cVar);

    default long Q() {
        return com.gamericefishpro.space.wa.b.v(x().o());
    }

    void T(o oVar, long j, long j2, float f, c cVar);

    void W(long j, long j2, long j3, c cVar, int i);

    default long c() {
        return x().o();
    }

    l getLayoutDirection();

    void m(com.gamericefishpro.space.o1.f fVar, long j, long j2, long j3, float f, k kVar, int i);

    void s(h hVar, o oVar, float f, c cVar, int i);

    com.gamericefishpro.space.a8.c x();
}
