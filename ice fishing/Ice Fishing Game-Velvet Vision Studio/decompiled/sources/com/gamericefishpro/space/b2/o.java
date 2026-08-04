package com.gamericefishpro.space.b2;

import com.gamericefishpro.space.t0.y0;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class o {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final float f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final long j;
    public final long k;

    public o(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, ArrayList arrayList, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = f;
        this.g = i;
        this.h = z2;
        this.i = arrayList;
        this.j = j5;
        this.k = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return com.gamericefishpro.space.u6.f.s(this.a, oVar.a) && this.b == oVar.b && com.gamericefishpro.space.n1.b.b(this.c, oVar.c) && com.gamericefishpro.space.n1.b.b(this.d, oVar.d) && this.e == oVar.e && Float.compare(this.f, oVar.f) == 0 && this.g == oVar.g && this.h == oVar.h && this.i.equals(oVar.i) && com.gamericefishpro.space.n1.b.b(this.j, oVar.j) && com.gamericefishpro.space.n1.b.b(this.k, oVar.k);
    }

    public final int hashCode() {
        return Long.hashCode(this.k) + y0.b((this.i.hashCode() + y0.c(com.gamericefishpro.space.m5.a.t(this.g, y0.a(this.f, y0.c(y0.b(y0.b(y0.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31), 31, this.h)) * 31, 31, this.j);
    }

    public final String toString() {
        return "PointerInputEventData(id=" + ((Object) com.gamericefishpro.space.u6.f.M(this.a)) + ", uptime=" + this.b + ", positionOnScreen=" + ((Object) com.gamericefishpro.space.n1.b.g(this.c)) + ", position=" + ((Object) com.gamericefishpro.space.n1.b.g(this.d)) + ", down=" + this.e + ", pressure=" + this.f + ", type=" + ((Object) y.a(this.g)) + ", activeHover=" + this.h + ", historical=" + this.i + ", scrollDelta=" + ((Object) com.gamericefishpro.space.n1.b.g(this.j)) + ", originalEventPosition=" + ((Object) com.gamericefishpro.space.n1.b.g(this.k)) + ')';
    }
}
