package com.gamericefishpro.space.h1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public interface m {
    boolean a(Function1 function1);

    Object b(Object obj, Function2 function2);

    default m c(m mVar) {
        return mVar == j.a ? this : new g(this, mVar);
    }
}
