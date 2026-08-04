package com.gamericefishpro.space.u1;

import com.gamericefishpro.space.t0.y0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static int k;
    public static final com.gamericefishpro.space.n9.y l = new com.gamericefishpro.space.n9.y(28);
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final f0 f;
    public final long g;
    public final int h;
    public final boolean i;
    public final int j;

    public f(String str, float f, float f2, float f3, float f4, f0 f0Var, long j, int i, boolean z) {
        int i2;
        synchronized (l) {
            i2 = k;
            k = i2 + 1;
        }
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f0Var;
        this.g = j;
        this.h = i;
        this.i = z;
        this.j = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.a(this.a, fVar.a) && com.gamericefishpro.space.c3.f.b(this.b, fVar.b) && com.gamericefishpro.space.c3.f.b(this.c, fVar.c) && this.d == fVar.d && this.e == fVar.e && this.f.equals(fVar.f) && com.gamericefishpro.space.o1.s.d(this.g, fVar.g) && this.h == fVar.h && this.i == fVar.i;
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + y0.a(this.e, y0.a(this.d, y0.a(this.c, y0.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i = com.gamericefishpro.space.o1.s.h;
        com.gamericefishpro.space.oh.w wVar = com.gamericefishpro.space.oh.x.d;
        return Boolean.hashCode(this.i) + com.gamericefishpro.space.m5.a.t(this.h, y0.b(iHashCode, 31, this.g), 31);
    }
}
