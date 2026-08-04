package com.gamericefishpro.space.r2;

import com.gamericefishpro.space.t0.y0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements b {
    public final com.gamericefishpro.space.b3.o a;
    public final long b;
    public final com.gamericefishpro.space.u2.k c;
    public final com.gamericefishpro.space.u2.i d;
    public final com.gamericefishpro.space.u2.j e;
    public final com.gamericefishpro.space.u2.b f;
    public final String g;
    public final long h;
    public final com.gamericefishpro.space.b3.a i;
    public final com.gamericefishpro.space.b3.p j;
    public final com.gamericefishpro.space.x2.b k;
    public final long l;
    public final com.gamericefishpro.space.b3.l m;
    public final com.gamericefishpro.space.o1.j0 n;
    public final com.gamericefishpro.space.q1.c o;

    public b0(long j, long j2, com.gamericefishpro.space.u2.k kVar, com.gamericefishpro.space.u2.i iVar, com.gamericefishpro.space.u2.j jVar, com.gamericefishpro.space.u2.b bVar, String str, long j3, com.gamericefishpro.space.b3.a aVar, com.gamericefishpro.space.b3.p pVar, com.gamericefishpro.space.x2.b bVar2, long j4, com.gamericefishpro.space.b3.l lVar, com.gamericefishpro.space.o1.j0 j0Var) {
        this(j != 16 ? new com.gamericefishpro.space.b3.c(j) : com.gamericefishpro.space.b3.n.a, j2, kVar, iVar, jVar, bVar, str, j3, aVar, pVar, bVar2, j4, lVar, j0Var, (com.gamericefishpro.space.q1.c) null);
    }

    public final boolean a(b0 b0Var) {
        if (this == b0Var) {
            return true;
        }
        return com.gamericefishpro.space.c3.n.a(this.b, b0Var.b) && Intrinsics.a(this.c, b0Var.c) && Intrinsics.a(this.d, b0Var.d) && Intrinsics.a(this.e, b0Var.e) && Intrinsics.a(this.f, b0Var.f) && Intrinsics.a(this.g, b0Var.g) && com.gamericefishpro.space.c3.n.a(this.h, b0Var.h) && Intrinsics.a(this.i, b0Var.i) && Intrinsics.a(this.j, b0Var.j) && Intrinsics.a(this.k, b0Var.k) && com.gamericefishpro.space.o1.s.d(this.l, b0Var.l);
    }

    public final boolean b(b0 b0Var) {
        return Intrinsics.a(this.a, b0Var.a) && Intrinsics.a(this.m, b0Var.m) && Intrinsics.a(this.n, b0Var.n) && Intrinsics.a(this.o, b0Var.o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return a(b0Var) && b(b0Var);
    }

    public final int hashCode() {
        com.gamericefishpro.space.b3.o oVar = this.a;
        long jB = oVar.b();
        int i = com.gamericefishpro.space.o1.s.h;
        com.gamericefishpro.space.oh.w wVar = com.gamericefishpro.space.oh.x.d;
        int iHashCode = Long.hashCode(jB) * 31;
        com.gamericefishpro.space.o1.o oVarC = oVar.c();
        int iHashCode2 = (Float.hashCode(oVar.a()) + ((iHashCode + (oVarC != null ? oVarC.hashCode() : 0)) * 31)) * 31;
        com.gamericefishpro.space.c3.o[] oVarArr = com.gamericefishpro.space.c3.n.b;
        int iB = y0.b(iHashCode2, 31, this.b);
        com.gamericefishpro.space.u2.k kVar = this.c;
        int i2 = (iB + (kVar != null ? kVar.d : 0)) * 31;
        com.gamericefishpro.space.u2.i iVar = this.d;
        int iHashCode3 = (i2 + (iVar != null ? Integer.hashCode(iVar.a) : 0)) * 31;
        com.gamericefishpro.space.u2.j jVar = this.e;
        int iHashCode4 = (iHashCode3 + (jVar != null ? Integer.hashCode(jVar.a) : 0)) * 31;
        com.gamericefishpro.space.u2.b bVar = this.f;
        int iHashCode5 = (iHashCode4 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        String str = this.g;
        int iB2 = y0.b((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, this.h);
        com.gamericefishpro.space.b3.a aVar = this.i;
        int iHashCode6 = (iB2 + (aVar != null ? Float.hashCode(aVar.a) : 0)) * 31;
        com.gamericefishpro.space.b3.p pVar = this.j;
        int iHashCode7 = (iHashCode6 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        com.gamericefishpro.space.x2.b bVar2 = this.k;
        int iB3 = y0.b((iHashCode7 + (bVar2 != null ? bVar2.d.hashCode() : 0)) * 31, 31, this.l);
        com.gamericefishpro.space.b3.l lVar = this.m;
        int i3 = (iB3 + (lVar != null ? lVar.a : 0)) * 31;
        com.gamericefishpro.space.o1.j0 j0Var = this.n;
        int iHashCode8 = (i3 + (j0Var != null ? j0Var.hashCode() : 0)) * 961;
        com.gamericefishpro.space.q1.c cVar = this.o;
        return iHashCode8 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        com.gamericefishpro.space.b3.o oVar = this.a;
        sb.append((Object) com.gamericefishpro.space.o1.s.j(oVar.b()));
        sb.append(", brush=");
        sb.append(oVar.c());
        sb.append(", alpha=");
        sb.append(oVar.a());
        sb.append(", fontSize=");
        sb.append((Object) com.gamericefishpro.space.c3.n.d(this.b));
        sb.append(", fontWeight=");
        sb.append(this.c);
        sb.append(", fontStyle=");
        sb.append(this.d);
        sb.append(", fontSynthesis=");
        sb.append(this.e);
        sb.append(", fontFamily=");
        sb.append(this.f);
        sb.append(", fontFeatureSettings=");
        sb.append(this.g);
        sb.append(", letterSpacing=");
        sb.append((Object) com.gamericefishpro.space.c3.n.d(this.h));
        sb.append(", baselineShift=");
        sb.append(this.i);
        sb.append(", textGeometricTransform=");
        sb.append(this.j);
        sb.append(", localeList=");
        sb.append(this.k);
        sb.append(", background=");
        y0.l(this.l, sb, ", textDecoration=");
        sb.append(this.m);
        sb.append(", shadow=");
        sb.append(this.n);
        sb.append(", platformStyle=null, drawStyle=");
        sb.append(this.o);
        sb.append(')');
        return sb.toString();
    }

    public b0(com.gamericefishpro.space.b3.o oVar, long j, com.gamericefishpro.space.u2.k kVar, com.gamericefishpro.space.u2.i iVar, com.gamericefishpro.space.u2.j jVar, com.gamericefishpro.space.u2.b bVar, String str, long j2, com.gamericefishpro.space.b3.a aVar, com.gamericefishpro.space.b3.p pVar, com.gamericefishpro.space.x2.b bVar2, long j3, com.gamericefishpro.space.b3.l lVar, com.gamericefishpro.space.o1.j0 j0Var, com.gamericefishpro.space.q1.c cVar) {
        this.a = oVar;
        this.b = j;
        this.c = kVar;
        this.d = iVar;
        this.e = jVar;
        this.f = bVar;
        this.g = str;
        this.h = j2;
        this.i = aVar;
        this.j = pVar;
        this.k = bVar2;
        this.l = j3;
        this.m = lVar;
        this.n = j0Var;
        this.o = cVar;
    }

    public b0(long j, long j2, com.gamericefishpro.space.u2.k kVar, com.gamericefishpro.space.u2.i iVar, com.gamericefishpro.space.u2.j jVar, com.gamericefishpro.space.u2.b bVar, String str, long j3, com.gamericefishpro.space.b3.a aVar, com.gamericefishpro.space.b3.p pVar, com.gamericefishpro.space.x2.b bVar2, long j4, com.gamericefishpro.space.b3.l lVar, com.gamericefishpro.space.o1.j0 j0Var, int i) {
        this((i & 1) != 0 ? com.gamericefishpro.space.o1.s.g : j, (i & 2) != 0 ? com.gamericefishpro.space.c3.n.c : j2, (i & 4) != 0 ? null : kVar, (i & 8) != 0 ? null : iVar, (i & 16) != 0 ? null : jVar, (i & 32) != 0 ? null : bVar, (i & 64) != 0 ? null : str, (i & 128) != 0 ? com.gamericefishpro.space.c3.n.c : j3, (i & 256) != 0 ? null : aVar, (i & 512) != 0 ? null : pVar, (i & 1024) != 0 ? null : bVar2, (i & 2048) != 0 ? com.gamericefishpro.space.o1.s.g : j4, (i & 4096) != 0 ? null : lVar, (i & 8192) != 0 ? null : j0Var);
    }
}
