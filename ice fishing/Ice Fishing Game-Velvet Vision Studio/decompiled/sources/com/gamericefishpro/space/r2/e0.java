package com.gamericefishpro.space.r2;

import com.gamericefishpro.space.t0.y0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {
    public final e a;
    public final i0 b;
    public final List c;
    public final int d;
    public final boolean e;
    public final int f;
    public final com.gamericefishpro.space.c3.c g;
    public final com.gamericefishpro.space.c3.l h;
    public final com.gamericefishpro.space.u2.d i;
    public final long j;

    public e0(e eVar, i0 i0Var, List list, int i, boolean z, int i2, com.gamericefishpro.space.c3.c cVar, com.gamericefishpro.space.c3.l lVar, com.gamericefishpro.space.u2.d dVar, long j) {
        this.a = eVar;
        this.b = i0Var;
        this.c = list;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = cVar;
        this.h = lVar;
        this.i = dVar;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return Intrinsics.a(this.a, e0Var.a) && Intrinsics.a(this.b, e0Var.b) && Intrinsics.a(this.c, e0Var.c) && this.d == e0Var.d && this.e == e0Var.e && this.f == e0Var.f && Intrinsics.a(this.g, e0Var.g) && this.h == e0Var.h && Intrinsics.a(this.i, e0Var.i) && com.gamericefishpro.space.c3.a.b(this.j, e0Var.j);
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + com.gamericefishpro.space.m5.a.t(this.f, y0.c((((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31) + this.d) * 31, 31, this.e), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TextLayoutInput(text=");
        sb.append((Object) this.a);
        sb.append(", style=");
        sb.append(this.b);
        sb.append(", placeholders=");
        sb.append(this.c);
        sb.append(", maxLines=");
        sb.append(this.d);
        sb.append(", softWrap=");
        sb.append(this.e);
        sb.append(", overflow=");
        int i = this.f;
        if (i == 1) {
            str = "Clip";
        } else if (i == 2) {
            str = "Ellipsis";
        } else if (i == 5) {
            str = "MiddleEllipsis";
        } else if (i == 3) {
            str = "Visible";
        } else {
            str = i == 4 ? "StartEllipsis" : "Invalid";
        }
        sb.append((Object) str);
        sb.append(", density=");
        sb.append(this.g);
        sb.append(", layoutDirection=");
        sb.append(this.h);
        sb.append(", fontFamilyResolver=");
        sb.append(this.i);
        sb.append(", constraints=");
        sb.append((Object) com.gamericefishpro.space.c3.a.k(this.j));
        sb.append(')');
        return sb.toString();
    }
}
