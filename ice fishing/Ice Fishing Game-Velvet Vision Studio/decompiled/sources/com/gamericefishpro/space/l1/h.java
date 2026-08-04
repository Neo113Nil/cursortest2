package com.gamericefishpro.space.l1;

import com.gamericefishpro.space.f2.o0;
import com.gamericefishpro.space.o1.k0;
import com.gamericefishpro.space.o1.o;
import com.gamericefishpro.space.o1.x;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static com.gamericefishpro.space.h1.m a(com.gamericefishpro.space.h1.m mVar, float f) {
        float f2 = 0;
        if (com.gamericefishpro.space.c3.f.a(f, f2) > 0) {
            com.gamericefishpro.space.c3.f.a(f, f2);
        }
        return o.m(mVar, new a(f, f, 0, true));
    }

    public static final com.gamericefishpro.space.h1.m b(com.gamericefishpro.space.h1.m mVar, k0 k0Var) {
        return o.o(mVar, 0.0f, 0.0f, k0Var, 518143);
    }

    public static final com.gamericefishpro.space.h1.m c(com.gamericefishpro.space.h1.m mVar) {
        return o.o(mVar, 0.0f, 0.0f, null, 520191);
    }

    public static final com.gamericefishpro.space.h1.m d(com.gamericefishpro.space.h1.m mVar, Function1 function1) {
        return mVar.c(new f(function1));
    }

    public static com.gamericefishpro.space.h1.m e(com.gamericefishpro.space.h1.m mVar, com.gamericefishpro.space.t1.b bVar, o0 o0Var, float f, com.gamericefishpro.space.o1.k kVar, int i) {
        com.gamericefishpro.space.h1.e eVar = com.gamericefishpro.space.h1.b.w;
        if ((i & 16) != 0) {
            f = 1.0f;
        }
        return mVar.c(new j(bVar, eVar, o0Var, f, kVar));
    }

    public static final com.gamericefishpro.space.h1.m f(com.gamericefishpro.space.h1.m mVar, float f) {
        return (f == 1.0f && f == 1.0f) ? mVar : o.o(mVar, f, f, null, 524284);
    }

    public static com.gamericefishpro.space.h1.m g(com.gamericefishpro.space.h1.m mVar, float f, k0 k0Var, long j, long j2, int i) {
        boolean z = com.gamericefishpro.space.c3.f.a(f, (float) 0) > 0;
        return (com.gamericefishpro.space.c3.f.a(f, (float) 0) > 0 || z) ? mVar.c(new m(f, k0Var, z, (i & 8) != 0 ? x.a : j, (i & 16) != 0 ? x.a : j2)) : mVar;
    }
}
