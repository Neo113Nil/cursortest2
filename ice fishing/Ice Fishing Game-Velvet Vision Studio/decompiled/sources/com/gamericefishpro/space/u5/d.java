package com.gamericefishpro.space.u5;

import com.gamericefishpro.space.ei.a0;
import java.io.Serializable;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends com.gamericefishpro.space.vh.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ e B;
    public int C;
    public Object d;
    public Serializable e;
    public i i;
    public a0 v;
    public CoroutineContext w;
    public a0 y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, com.gamericefishpro.space.vh.c cVar) {
        super(cVar);
        this.B = eVar;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.s(false, null, this);
    }
}
