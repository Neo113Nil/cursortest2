package com.gamericefishpro.space.l4;

import java.io.FileOutputStream;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends com.gamericefishpro.space.vh.c {
    public FileOutputStream d;
    public FileOutputStream e;
    public /* synthetic */ Object i;
    public final /* synthetic */ m0 v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(m0 m0Var, com.gamericefishpro.space.vh.c cVar) {
        super(cVar);
        this.v = m0Var;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.b(null, this);
    }
}
