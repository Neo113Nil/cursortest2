package com.gamericefishpro.space.l4;

import java.io.FileInputStream;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends com.gamericefishpro.space.vh.c {
    public Object d;
    public FileInputStream e;
    public /* synthetic */ Object i;
    public final /* synthetic */ f0 v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(f0 f0Var, com.gamericefishpro.space.vh.c cVar) {
        super(cVar);
        this.v = f0Var;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.w |= Integer.MIN_VALUE;
        return f0.a(this.v, this);
    }
}
