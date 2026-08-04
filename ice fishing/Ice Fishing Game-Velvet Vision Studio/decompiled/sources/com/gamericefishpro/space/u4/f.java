package com.gamericefishpro.space.u4;

import com.gamericefishpro.space.z4.u0;
import com.gamericefishpro.space.z4.w0;
import com.gamericefishpro.space.z4.y0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements com.gamericefishpro.space.kb.a, com.gamericefishpro.space.c5.b {
    public static final /* synthetic */ f d = new f();

    public static w0 a(y0 owner, u0 factory, int i) {
        if ((i & 2) != 0) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            factory = owner instanceof com.gamericefishpro.space.z4.k ? ((com.gamericefishpro.space.z4.k) owner).d() : com.gamericefishpro.space.e5.b.a;
        }
        Intrinsics.checkNotNullParameter(owner, "owner");
        com.gamericefishpro.space.c5.c extras = owner instanceof com.gamericefishpro.space.z4.k ? ((com.gamericefishpro.space.z4.k) owner).e() : com.gamericefishpro.space.c5.a.b;
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return new w0(owner.f(), factory, extras);
    }
}
