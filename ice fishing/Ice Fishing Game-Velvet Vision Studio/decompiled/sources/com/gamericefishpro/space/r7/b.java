package com.gamericefishpro.space.r7;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Function0 {
    public final /* synthetic */ com.gamericefishpro.space.d7.d d;
    public final /* synthetic */ Function1 e;

    public b(com.gamericefishpro.space.d7.d dVar, Function1 function1) {
        this.d = dVar;
        this.e = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        com.gamericefishpro.space.d7.d dVar = this.d;
        if (!dVar.c) {
            this.e.invoke(Integer.valueOf(dVar.a));
        }
        return Unit.a;
    }
}
