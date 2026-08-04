package com.gamericefishpro.space.z;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {
    public final j1 a;
    public h0 b;
    public k0 c;
    public j0 d;
    public i0 e;
    public com.gamericefishpro.space.d9.h f;
    public com.gamericefishpro.space.vb.c g;
    public long h = 9205357640488583168L;
    public com.gamericefishpro.space.n9.r0 i;
    public final n0 j;
    public final n0 k;
    public long l;

    public m0(j1 j1Var) {
        this.a = j1Var;
        n0 n0Var = new n0();
        n0Var.b = new ArrayList();
        this.j = n0Var;
        n0 n0Var2 = new n0();
        n0Var2.b = new ArrayList();
        this.k = n0Var2;
        this.l = 0L;
    }

    public static void c(m0 m0Var, com.gamericefishpro.space.y1.b bVar, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        j1 j1Var = m0Var.a;
        j0 j0Var = m0Var.d;
        if (j0Var == null) {
            j0Var = new j0();
            j0Var.i = null;
            j0Var.j = Long.MAX_VALUE;
            j0Var.k = false;
            m0Var.d = j0Var;
        }
        j0Var.i = bVar;
        j0Var.j = j;
        com.gamericefishpro.space.n9.r0 r0Var = m0Var.i;
        if (r0Var == null) {
            m0Var.i = new com.gamericefishpro.space.n9.r0(j1Var.J);
        } else {
            r0Var.i = j1Var.J;
            r0Var.e = j2;
        }
        j0Var.k = false;
        m0Var.f = j0Var;
    }

    public final void a() {
        h0 h0Var = this.b;
        if (h0Var == null) {
            g0 g0Var = g0.i;
            h0Var = new h0();
            h0Var.i = g0Var;
            h0Var.j = false;
            this.b = h0Var;
        }
        h0Var.i = g0.i;
        h0Var.j = false;
        this.f = h0Var;
    }

    public final void b(com.gamericefishpro.space.y1.b bVar, long j, com.gamericefishpro.space.n9.r0 r0Var) {
        i0 i0Var = this.e;
        if (i0Var == null) {
            i0Var = new i0();
            i0Var.i = null;
            i0Var.j = Long.MAX_VALUE;
            this.e = i0Var;
        }
        i0Var.i = bVar;
        i0Var.j = j;
        r0Var.e = 0L;
        this.f = i0Var;
    }

    public final com.gamericefishpro.space.vb.c d() {
        com.gamericefishpro.space.vb.c cVar = this.g;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalArgumentException("Velocity Tracker not initialized.");
    }

    public final void e(com.gamericefishpro.space.y1.b bVar, com.gamericefishpro.space.y1.a aVar, long j) {
        j1 j1Var = this.a;
        long jD = com.gamericefishpro.space.h2.k.r(j1Var).d(0L);
        if (!com.gamericefishpro.space.n1.b.b(this.h, 9205357640488583168L) && !com.gamericefishpro.space.n1.b.b(jD, this.h)) {
            this.l = com.gamericefishpro.space.n1.b.e(this.l, com.gamericefishpro.space.n1.b.d(jD, this.h));
        }
        this.h = jD;
        v0 v0Var = j1Var.J;
        Intrinsics.b(v0Var);
        int i = d0.a;
        if (Math.abs(Float.intBitsToFloat((int) (v0Var == v0.d ? j & 4294967295L : j >> 32))) > 2.0f) {
            com.gamericefishpro.space.hj.c.h(d(), bVar, j1Var.J, aVar, this.j, this.l);
            n0 n0Var = this.k;
            ArrayList arrayList = n0Var.b;
            if (arrayList.size() == 3) {
                int i2 = n0Var.a;
                n0Var.a = i2 + 1;
                arrayList.set(i2, new com.gamericefishpro.space.n1.b(j));
            } else {
                arrayList.add(new com.gamericefishpro.space.n1.b(j));
            }
            if (n0Var.a == 3) {
                n0Var.a = 0;
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                arrayList2.add(Float.valueOf(Float.intBitsToFloat((int) (((com.gamericefishpro.space.n1.b) arrayList.get(i3)).a >> 32))));
            }
            float fS = (float) CollectionsKt.s(arrayList2);
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i4 = 0; i4 < size2; i4++) {
                arrayList3.add(Float.valueOf(Float.intBitsToFloat((int) (((com.gamericefishpro.space.n1.b) arrayList.get(i4)).a & 4294967295L))));
            }
            j1Var.K0(new s(true, (((long) Float.floatToRawIntBits((float) CollectionsKt.s(arrayList3))) & 4294967295L) | (((long) Float.floatToRawIntBits(fS)) << 32)));
        }
    }

    public final void f(com.gamericefishpro.space.y1.b bVar, com.gamericefishpro.space.y1.b bVar2, com.gamericefishpro.space.y1.a aVar, long j) {
        if (this.g == null) {
            this.g = new com.gamericefishpro.space.vb.c(3);
        }
        this.l = 0L;
        com.gamericefishpro.space.vb.c cVarD = d();
        j1 j1Var = this.a;
        com.gamericefishpro.space.hj.c.h(cVarD, bVar, j1Var.J, aVar, this.j, this.l);
        long jD = com.gamericefishpro.space.n1.b.d(com.gamericefishpro.space.hj.c.J(bVar2, j1Var.J, aVar), j);
        j1Var.K.getClass();
        this.h = com.gamericefishpro.space.h2.k.r(j1Var).d(0L);
        j1Var.K0(new t(jD));
        n0 n0Var = this.k;
        n0Var.a = 0;
        n0Var.b.clear();
    }
}
