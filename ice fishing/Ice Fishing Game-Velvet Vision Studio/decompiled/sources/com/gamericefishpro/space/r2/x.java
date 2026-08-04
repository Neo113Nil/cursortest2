package com.gamericefishpro.space.r2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements com.gamericefishpro.space.e1.j {
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ Function1 e;

    public x(Function2 function2, Function1 function1) {
        this.d = function2;
        this.e = function1;
    }

    @Override // com.gamericefishpro.space.e1.j
    public final Object b(Object obj) {
        return this.e.invoke(obj);
    }

    @Override // com.gamericefishpro.space.e1.j
    public final Object c(com.gamericefishpro.space.e1.b bVar, Object obj) {
        return this.d.invoke(bVar, obj);
    }
}
