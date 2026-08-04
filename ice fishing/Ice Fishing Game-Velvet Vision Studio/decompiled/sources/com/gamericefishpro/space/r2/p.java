package com.gamericefishpro.space.r2;

import com.gamericefishpro.space.t0.y0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements b {
    public final int a;
    public final int b;
    public final long c;
    public final com.gamericefishpro.space.b3.q d;
    public final r e;
    public final com.gamericefishpro.space.b3.i f;
    public final int g;
    public final int h;
    public final com.gamericefishpro.space.b3.s i;

    public p(int i, int i2, long j, com.gamericefishpro.space.b3.q qVar, r rVar, com.gamericefishpro.space.b3.i iVar, int i3, int i4, com.gamericefishpro.space.b3.s sVar) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = qVar;
        this.e = rVar;
        this.f = iVar;
        this.g = i3;
        this.h = i4;
        this.i = sVar;
        if (com.gamericefishpro.space.c3.n.a(j, com.gamericefishpro.space.c3.n.c) || com.gamericefishpro.space.c3.n.c(j) >= 0.0f) {
            return;
        }
        com.gamericefishpro.space.w2.a.b("lineHeight can't be negative (" + com.gamericefishpro.space.c3.n.c(j) + ')');
    }

    public final p a(p pVar) {
        return pVar == null ? this : q.a(this, pVar.a, pVar.b, pVar.c, pVar.d, pVar.e, pVar.f, pVar.g, pVar.h, pVar.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.a == pVar.a && this.b == pVar.b && com.gamericefishpro.space.c3.n.a(this.c, pVar.c) && Intrinsics.a(this.d, pVar.d) && Intrinsics.a(this.e, pVar.e) && Intrinsics.a(this.f, pVar.f) && this.g == pVar.g && this.h == pVar.h && Intrinsics.a(this.i, pVar.i);
    }

    public final int hashCode() {
        int iT = com.gamericefishpro.space.m5.a.t(this.b, Integer.hashCode(this.a) * 31, 31);
        com.gamericefishpro.space.c3.o[] oVarArr = com.gamericefishpro.space.c3.n.b;
        int iB = y0.b(iT, 31, this.c);
        com.gamericefishpro.space.b3.q qVar = this.d;
        int iHashCode = (iB + (qVar != null ? qVar.hashCode() : 0)) * 31;
        r rVar = this.e;
        int iHashCode2 = (iHashCode + (rVar != null ? rVar.hashCode() : 0)) * 31;
        com.gamericefishpro.space.b3.i iVar = this.f;
        int iT2 = com.gamericefishpro.space.m5.a.t(this.h, com.gamericefishpro.space.m5.a.t(this.g, (iHashCode2 + (iVar != null ? iVar.hashCode() : 0)) * 31, 31), 31);
        com.gamericefishpro.space.b3.s sVar = this.i;
        return iT2 + (sVar != null ? sVar.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) com.gamericefishpro.space.b3.k.a(this.a)) + ", textDirection=" + ((Object) com.gamericefishpro.space.b3.m.a(this.b)) + ", lineHeight=" + ((Object) com.gamericefishpro.space.c3.n.d(this.c)) + ", textIndent=" + this.d + ", platformStyle=" + this.e + ", lineHeightStyle=" + this.f + ", lineBreak=" + ((Object) com.gamericefishpro.space.b3.e.a(this.g)) + ", hyphens=" + ((Object) com.gamericefishpro.space.b3.d.a(this.h)) + ", textMotion=" + this.i + ')';
    }
}
