package com.gamericefishpro.space.z4;

import com.gamericefishpro.space.i9.d5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class v0 implements u0 {
    public static v0 a;

    @Override // com.gamericefishpro.space.z4.u0
    public s0 a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return com.gamericefishpro.space.a.a.l(modelClass);
    }

    @Override // com.gamericefishpro.space.z4.u0
    public s0 b(Class modelClass, com.gamericefishpro.space.c5.f extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return a(modelClass);
    }

    @Override // com.gamericefishpro.space.z4.u0
    public final s0 c(com.gamericefishpro.space.ei.g modelClass, com.gamericefishpro.space.c5.f extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return b(d5.C(modelClass), extras);
    }
}
