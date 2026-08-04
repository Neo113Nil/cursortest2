package com.gamericefishpro.space.y;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class m {
    public final Context a;
    public final com.gamericefishpro.space.c3.c b;
    public final long c;
    public final com.gamericefishpro.space.d0.u0 d;

    public m(Context context, com.gamericefishpro.space.c3.c cVar, long j, com.gamericefishpro.space.d0.u0 u0Var) {
        this.a = context;
        this.b = cVar;
        this.c = j;
        this.d = u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!m.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.c(obj, "null cannot be cast to non-null type androidx.compose.foundation.AndroidEdgeEffectOverscrollFactory");
        m mVar = (m) obj;
        return Intrinsics.a(this.a, mVar.a) && Intrinsics.a(this.b, mVar.b) && com.gamericefishpro.space.o1.s.d(this.c, mVar.c) && Intrinsics.a(this.d, mVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i = com.gamericefishpro.space.o1.s.h;
        com.gamericefishpro.space.oh.w wVar = com.gamericefishpro.space.oh.x.d;
        return this.d.hashCode() + com.gamericefishpro.space.t0.y0.b(iHashCode, 31, this.c);
    }
}
