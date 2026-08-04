package com.gamericefishpro.space.l4;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 {
    public final com.gamericefishpro.space.vh.i a;
    public final com.gamericefishpro.space.pi.n b;
    public final u0 c;
    public final CoroutineContext d;

    /* JADX WARN: Multi-variable type inference failed */
    public o0(Function2 transform, com.gamericefishpro.space.pi.n ack, u0 u0Var, CoroutineContext callerContext) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        Intrinsics.checkNotNullParameter(ack, "ack");
        Intrinsics.checkNotNullParameter(callerContext, "callerContext");
        this.a = (com.gamericefishpro.space.vh.i) transform;
        this.b = ack;
        this.c = u0Var;
        this.d = callerContext;
    }
}
