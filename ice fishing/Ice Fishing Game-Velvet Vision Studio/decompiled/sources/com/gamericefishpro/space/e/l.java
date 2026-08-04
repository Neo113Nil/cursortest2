package com.gamericefishpro.space.e;

import com.gamericefishpro.space.ei.w;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends com.gamericefishpro.space.vh.i implements com.gamericefishpro.space.di.c {
    public final /* synthetic */ w d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(w wVar, com.gamericefishpro.space.th.a aVar) {
        super(3, aVar);
        this.d = wVar;
    }

    @Override // com.gamericefishpro.space.di.c
    public final Object a(Object obj, Object obj2, Object obj3) {
        return new l(this.d, (com.gamericefishpro.space.th.a) obj3).invokeSuspend(Unit.a);
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        com.gamericefishpro.space.wa.b.P(obj);
        this.d.d = true;
        return Unit.a;
    }
}
