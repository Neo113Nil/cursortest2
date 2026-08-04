package com.gamericefishpro.space.m0;

import com.gamericefishpro.space.c3.l;
import com.gamericefishpro.space.ph.g0;
import com.gamericefishpro.space.r2.a0;
import com.gamericefishpro.space.r2.i0;
import com.gamericefishpro.space.r2.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public String a;
    public i0 b;
    public com.gamericefishpro.space.u2.d c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public com.gamericefishpro.space.c3.c i;
    public com.gamericefishpro.space.r2.a j;
    public boolean k;
    public long l;
    public b m;
    public o n;
    public l o;
    public long s;
    public long h = a.a;
    public long p = com.gamericefishpro.space.c3.b.g(0, 0, 0, 0);
    public int q = -1;
    public int r = -1;

    public d(String str, i0 i0Var, com.gamericefishpro.space.u2.d dVar, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = i0Var;
        this.c = dVar;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
        long j = 0;
        this.l = (j & 4294967295L) | (j << 32);
    }

    public static long f(d dVar, long j, l lVar) {
        int i;
        i0 i0Var = dVar.b;
        b bVar = dVar.m;
        com.gamericefishpro.space.c3.c cVar = dVar.i;
        Intrinsics.b(cVar);
        com.gamericefishpro.space.u2.d dVar2 = dVar.c;
        if ((bVar == null || lVar != bVar.a || !a0.e(i0Var, lVar).equals(bVar.b) || cVar.b() != bVar.c.d || dVar2 != bVar.d) && ((bVar = b.h) == null || lVar != bVar.a || !a0.e(i0Var, lVar).equals(bVar.b) || cVar.b() != bVar.c.d || dVar2 != bVar.d)) {
            bVar = new b(lVar, a0.e(i0Var, lVar), new com.gamericefishpro.space.c3.d(cVar.b(), cVar.g()), dVar2);
            b.h = bVar;
        }
        dVar.m = bVar;
        int i2 = dVar.g;
        com.gamericefishpro.space.c3.d dVar3 = bVar.c;
        float f = bVar.g;
        float f2 = bVar.f;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            float fB = a0.a(c.a, bVar.e, com.gamericefishpro.space.c3.b.b(0, 0, 15), dVar3, bVar.d, 1).b();
            float fB2 = a0.a(c.b, bVar.e, com.gamericefishpro.space.c3.b.b(0, 0, 15), dVar3, bVar.d, 2).b() - fB;
            bVar.g = fB;
            bVar.f = fB2;
            f2 = fB2;
            f = fB;
        }
        if (i2 != 1) {
            int iRound = Math.round((f2 * (i2 - 1)) + f);
            i = iRound >= 0 ? iRound : 0;
            int iG = com.gamericefishpro.space.c3.a.g(j);
            if (i > iG) {
                i = iG;
            }
        } else {
            i = com.gamericefishpro.space.c3.a.i(j);
        }
        return com.gamericefishpro.space.c3.b.a(com.gamericefishpro.space.c3.a.j(j), com.gamericefishpro.space.c3.a.h(j), i, com.gamericefishpro.space.c3.a.g(j));
    }

    public final int a(int i, l lVar) {
        int i2 = this.q;
        int i3 = this.r;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jA = com.gamericefishpro.space.c3.b.a(0, i, 0, Integer.MAX_VALUE);
        if (this.g > 1) {
            jA = f(this, jA, lVar);
        }
        o oVarE = e(lVar);
        long jO = com.gamericefishpro.space.a.a.o(jA, this.e, this.d, oVarE.i());
        boolean z = this.e;
        int i4 = this.d;
        int i5 = this.f;
        int iM = com.gamericefishpro.space.u6.f.m(new com.gamericefishpro.space.r2.a((com.gamericefishpro.space.y2.c) oVarE, ((z || !(i4 == 2 || i4 == 4 || i4 == 5)) && i5 >= 1) ? i5 : 1, i4, jO).b());
        int i6 = com.gamericefishpro.space.c3.a.i(jA);
        if (iM < i6) {
            iM = i6;
        }
        this.q = i;
        this.r = iM;
        return iM;
    }

    public final boolean b(long j, l lVar) {
        o oVar;
        this.s = (this.s << 2) | 3;
        boolean z = true;
        long jF = this.g > 1 ? f(this, j, lVar) : j;
        com.gamericefishpro.space.r2.a aVar = this.j;
        boolean z2 = false;
        if (aVar != null && (oVar = this.n) != null && !oVar.c() && lVar == this.o && (com.gamericefishpro.space.c3.a.b(jF, this.p) || (com.gamericefishpro.space.c3.a.h(jF) == com.gamericefishpro.space.c3.a.h(this.p) && com.gamericefishpro.space.c3.a.j(jF) == com.gamericefishpro.space.c3.a.j(this.p) && com.gamericefishpro.space.c3.a.g(jF) >= aVar.b() && !aVar.d.d))) {
            if (!com.gamericefishpro.space.c3.a.b(jF, this.p)) {
                com.gamericefishpro.space.r2.a aVar2 = this.j;
                Intrinsics.b(aVar2);
                long jD = com.gamericefishpro.space.c3.b.d(jF, (((long) com.gamericefishpro.space.u6.f.m(Math.min(aVar2.a.B.c(), aVar2.c()))) << 32) | (((long) com.gamericefishpro.space.u6.f.m(aVar2.b())) & 4294967295L));
                this.l = jD;
                if (this.d == 3 || (((int) (jD >> 32)) >= aVar2.c() && ((int) (4294967295L & jD)) >= aVar2.b())) {
                    z = false;
                }
                this.k = z;
                this.p = jF;
            }
            return false;
        }
        o oVarE = e(lVar);
        long jO = com.gamericefishpro.space.a.a.o(jF, this.e, this.d, oVarE.i());
        boolean z3 = this.e;
        int i = this.d;
        int i2 = this.f;
        com.gamericefishpro.space.r2.a aVar3 = new com.gamericefishpro.space.r2.a((com.gamericefishpro.space.y2.c) oVarE, ((z3 || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i, jO);
        this.p = jF;
        long jD2 = com.gamericefishpro.space.c3.b.d(jF, (((long) com.gamericefishpro.space.u6.f.m(aVar3.b())) & 4294967295L) | (((long) com.gamericefishpro.space.u6.f.m(aVar3.c())) << 32));
        this.l = jD2;
        if (this.d != 3 && (((int) (jD2 >> 32)) < aVar3.c() || ((int) (jD2 & 4294967295L)) < aVar3.b())) {
            z2 = true;
        }
        this.k = z2;
        this.j = aVar3;
        return true;
    }

    public final void c() {
        this.j = null;
        this.n = null;
        this.o = null;
        this.q = -1;
        this.r = -1;
        this.p = com.gamericefishpro.space.c3.b.g(0, 0, 0, 0);
        long j = 0;
        this.l = (j & 4294967295L) | (j << 32);
        this.k = false;
    }

    public final void d(com.gamericefishpro.space.c3.c cVar) {
        long jA;
        com.gamericefishpro.space.c3.c cVar2 = this.i;
        if (cVar != null) {
            int i = a.b;
            jA = a.a(cVar.b(), cVar.g());
        } else {
            jA = a.a;
        }
        if (cVar2 == null) {
            this.i = cVar;
            this.h = jA;
        } else if (cVar == null || this.h != jA) {
            this.i = cVar;
            this.h = jA;
            this.s = (this.s << 2) | 1;
            c();
        }
    }

    public final o e(l lVar) {
        o cVar = this.n;
        if (cVar == null || lVar != this.o || cVar.c()) {
            this.o = lVar;
            String str = this.a;
            i0 i0VarE = a0.e(this.b, lVar);
            g0 g0Var = g0.d;
            com.gamericefishpro.space.c3.c cVar2 = this.i;
            Intrinsics.b(cVar2);
            cVar = new com.gamericefishpro.space.y2.c(str, i0VarE, g0Var, g0Var, this.c, cVar2);
        }
        this.n = cVar;
        return cVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.j != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) a.b(this.h));
        sb.append(", history=");
        sb.append(this.s);
        sb.append(", constraints=$)");
        return sb.toString();
    }
}
