package com.gamericefishpro.space.y;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends com.gamericefishpro.space.vh.i implements Function2 {
    public int d;
    public final /* synthetic */ com.gamericefishpro.space.b0.i e;
    public final /* synthetic */ com.gamericefishpro.space.b0.k i;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ z w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.gamericefishpro.space.b0.i iVar, com.gamericefishpro.space.b0.k kVar, boolean z, z zVar, com.gamericefishpro.space.th.a aVar) {
        super(2, aVar);
        this.e = iVar;
        this.i = kVar;
        this.v = z;
        this.w = zVar;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        return new f(this.e, this.i, this.v, this.w, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((com.gamericefishpro.space.pi.x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r7.e.a(r4, r7) == r0) goto L15;
     */
    @Override // com.gamericefishpro.space.vh.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i = this.d;
        com.gamericefishpro.space.b0.k kVar = this.i;
        if (i == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            long j = a0.a;
            this.d = 1;
            if (com.gamericefishpro.space.pi.a0.i(j, this) != aVar) {
            }
            return aVar;
        }
        if (i == 1) {
            com.gamericefishpro.space.wa.b.P(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(obj);
        }
        boolean z = this.v;
        z zVar = this.w;
        if (z) {
            zVar.V = kVar;
        } else {
            zVar.R = kVar;
        }
        return Unit.a;
        this.d = 2;
    }
}
