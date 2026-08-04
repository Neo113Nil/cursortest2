package com.gamericefishpro.space.t0;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public interface s0 extends CoroutineContext.Element {
    Object E(Function1 function1, com.gamericefishpro.space.vh.c cVar);

    @Override // kotlin.coroutines.CoroutineContext.Element
    default kotlin.coroutines.f getKey() {
        return f.i;
    }
}
