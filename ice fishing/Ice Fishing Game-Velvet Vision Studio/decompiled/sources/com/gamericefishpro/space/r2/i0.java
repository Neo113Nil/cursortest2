package com.gamericefishpro.space.r2;

import com.gamericefishpro.space.t0.y0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {
    public static final i0 d = new i0((com.gamericefishpro.space.o1.j0) null, 16777215);
    public final b0 a;
    public final p b;
    public final s c;

    public i0(b0 b0Var, p pVar, s sVar) {
        this.a = b0Var;
        this.b = pVar;
        this.c = sVar;
    }

    public static i0 b(i0 i0Var, long j, long j2, com.gamericefishpro.space.u2.k kVar, long j3, int i, long j4, int i2) {
        long j5 = (i2 & 2) != 0 ? com.gamericefishpro.space.c3.n.c : j2;
        com.gamericefishpro.space.u2.k kVar2 = (i2 & 4) != 0 ? null : kVar;
        long j6 = (i2 & 128) != 0 ? com.gamericefishpro.space.c3.n.c : j3;
        long j7 = com.gamericefishpro.space.o1.s.g;
        int i3 = (32768 & i2) != 0 ? 0 : i;
        long j8 = (i2 & 131072) != 0 ? com.gamericefishpro.space.c3.n.c : j4;
        b0 b0VarA = c0.a(i0Var.a, j, null, Float.NaN, j5, kVar2, null, null, null, null, j6, null, null, null, j7, null, null, null);
        p pVarA = q.a(i0Var.b, i3, 0, j8, null, null, null, 0, 0, null);
        return (i0Var.a == b0VarA && i0Var.b == pVarA) ? i0Var : new i0(b0VarA, pVarA);
    }

    public final long a() {
        return this.a.a.b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return Intrinsics.a(this.a, i0Var.a) && Intrinsics.a(this.b, i0Var.b) && Intrinsics.a(this.c, i0Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        s sVar = this.c;
        return iHashCode + (sVar != null ? sVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) com.gamericefishpro.space.o1.s.j(a()));
        sb.append(", brush=");
        b0 b0Var = this.a;
        sb.append(b0Var.a.c());
        sb.append(", alpha=");
        sb.append(b0Var.a.a());
        sb.append(", fontSize=");
        sb.append((Object) com.gamericefishpro.space.c3.n.d(b0Var.b));
        sb.append(", fontWeight=");
        sb.append(b0Var.c);
        sb.append(", fontStyle=");
        sb.append(b0Var.d);
        sb.append(", fontSynthesis=");
        sb.append(b0Var.e);
        sb.append(", fontFamily=");
        sb.append(b0Var.f);
        sb.append(", fontFeatureSettings=");
        sb.append(b0Var.g);
        sb.append(", letterSpacing=");
        sb.append((Object) com.gamericefishpro.space.c3.n.d(b0Var.h));
        sb.append(", baselineShift=");
        sb.append(b0Var.i);
        sb.append(", textGeometricTransform=");
        sb.append(b0Var.j);
        sb.append(", localeList=");
        sb.append(b0Var.k);
        sb.append(", background=");
        y0.l(b0Var.l, sb, ", textDecoration=");
        sb.append(b0Var.m);
        sb.append(", shadow=");
        sb.append(b0Var.n);
        sb.append(", drawStyle=");
        sb.append(b0Var.o);
        sb.append(", textAlign=");
        p pVar = this.b;
        sb.append((Object) com.gamericefishpro.space.b3.k.a(pVar.a));
        sb.append(", textDirection=");
        sb.append((Object) com.gamericefishpro.space.b3.m.a(pVar.b));
        sb.append(", lineHeight=");
        sb.append((Object) com.gamericefishpro.space.c3.n.d(pVar.c));
        sb.append(", textIndent=");
        sb.append(pVar.d);
        sb.append(", platformStyle=");
        sb.append(this.c);
        sb.append(", lineHeightStyle=");
        sb.append(pVar.f);
        sb.append(", lineBreak=");
        sb.append((Object) com.gamericefishpro.space.b3.e.a(pVar.g));
        sb.append(", hyphens=");
        sb.append((Object) com.gamericefishpro.space.b3.d.a(pVar.h));
        sb.append(", textMotion=");
        sb.append(pVar.i);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public i0(b0 b0Var, p pVar) {
        b0Var.getClass();
        r rVar = pVar.e;
        this(b0Var, pVar, rVar == null ? null : new s(rVar));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public i0(com.gamericefishpro.space.o1.j0 j0Var, int i) {
        long j = com.gamericefishpro.space.o1.s.g;
        long j2 = com.gamericefishpro.space.c3.n.c;
        this(new b0(j, j2, null, null, null, null, null, j2, null, null, null, j, null, (i & 8192) != 0 ? null : j0Var), new p(0, 0, j2, null, null, null, 0, 0, null), null);
    }
}
