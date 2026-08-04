package com.gamericefishpro.space.o1;

import com.gamericefishpro.space.t0.y0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {
    public static final j0 d = new j0(0L, 0.0f, 7);
    public final long a;
    public final long b;
    public final float c;

    public j0(long j, long j2, float f) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return s.d(this.a, j0Var.a) && com.gamericefishpro.space.n1.b.b(this.b, j0Var.b) && this.c == j0Var.c;
    }

    public final int hashCode() {
        int i = s.h;
        com.gamericefishpro.space.oh.w wVar = com.gamericefishpro.space.oh.x.d;
        return Float.hashCode(this.c) + y0.b(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        y0.l(this.a, sb, ", offset=");
        sb.append((Object) com.gamericefishpro.space.n1.b.g(this.b));
        sb.append(", blurRadius=");
        return y0.h(sb, this.c, ')');
    }

    public /* synthetic */ j0(long j, float f, int i) {
        this((i & 1) != 0 ? o.c(4278190080L) : j, 0L, (i & 4) != 0 ? 0.0f : f);
    }
}
