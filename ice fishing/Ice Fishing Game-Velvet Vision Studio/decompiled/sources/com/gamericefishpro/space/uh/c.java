package com.gamericefishpro.space.uh;

import com.gamericefishpro.space.ei.e0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends com.gamericefishpro.space.vh.c {
    public int d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ com.gamericefishpro.space.th.a i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.gamericefishpro.space.th.a aVar, CoroutineContext coroutineContext, Function2 function2, com.gamericefishpro.space.th.a aVar2) {
        super(aVar, coroutineContext);
        this.e = function2;
        this.i = aVar2;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.d = 2;
            com.gamericefishpro.space.wa.b.P(obj);
            return obj;
        }
        this.d = 1;
        com.gamericefishpro.space.wa.b.P(obj);
        Function2 function2 = this.e;
        Intrinsics.c(function2, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        e0.c(2, function2);
        return function2.invoke(this.i, this);
    }
}
