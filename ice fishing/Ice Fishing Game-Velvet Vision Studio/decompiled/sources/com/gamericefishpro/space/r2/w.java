package com.gamericefishpro.space.r2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements Function1 {
    public static final w d = new w();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        if (Intrinsics.a(obj, Boolean.FALSE)) {
            return new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g);
        }
        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
        return new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj).intValue()));
    }
}
