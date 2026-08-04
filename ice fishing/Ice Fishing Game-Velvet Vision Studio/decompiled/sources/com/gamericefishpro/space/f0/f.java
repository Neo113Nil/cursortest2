package com.gamericefishpro.space.f0;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements com.gamericefishpro.space.h0.s {
    public final Function1 a;
    public final Function1 b;
    public final com.gamericefishpro.space.b1.h c;

    public f(g gVar, Function1 function1, com.gamericefishpro.space.b1.h hVar) {
        this.a = gVar;
        this.b = function1;
        this.c = hVar;
    }

    @Override // com.gamericefishpro.space.h0.s
    public final Function1 a() {
        return this.b;
    }

    @Override // com.gamericefishpro.space.h0.s
    public final Function1 getKey() {
        return this.a;
    }
}
