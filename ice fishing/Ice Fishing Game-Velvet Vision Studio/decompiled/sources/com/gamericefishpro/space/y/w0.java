package com.gamericefishpro.space.y;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 {
    public final long a;
    public final com.gamericefishpro.space.d0.w0 b;

    public w0() {
        long jC = com.gamericefishpro.space.o1.o.c(4284900966L);
        float f = 0;
        com.gamericefishpro.space.d0.w0 w0Var = new com.gamericefishpro.space.d0.w0(f, f, f, f);
        this.a = jC;
        this.b = w0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!w0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.c(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        w0 w0Var = (w0) obj;
        return com.gamericefishpro.space.o1.s.d(this.a, w0Var.a) && Intrinsics.a(this.b, w0Var.b);
    }

    public final int hashCode() {
        int i = com.gamericefishpro.space.o1.s.h;
        com.gamericefishpro.space.oh.w wVar = com.gamericefishpro.space.oh.x.d;
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        com.gamericefishpro.space.t0.y0.l(this.a, sb, ", drawPadding=");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
