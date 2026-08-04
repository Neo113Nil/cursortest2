package com.gamericefishpro.space.f3;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends com.gamericefishpro.space.vh.i implements Function2 {
    public int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ j i;
    public final /* synthetic */ long v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(boolean z, j jVar, long j, com.gamericefishpro.space.th.a aVar) {
        super(2, aVar);
        this.e = z;
        this.i = jVar;
        this.v = j;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        return new g(this.e, this.i, this.v, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((com.gamericefishpro.space.pi.x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r11 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        if (r11 == r0) goto L18;
     */
    @Override // com.gamericefishpro.space.vh.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i = this.d;
        if (i == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            boolean z = this.e;
            j jVar = this.i;
            if (z) {
                com.gamericefishpro.space.a2.e eVar = jVar.d;
                this.d = 2;
                obj = eVar.a(this.v, 0L, this);
            } else {
                com.gamericefishpro.space.a2.e eVar2 = jVar.d;
                this.d = 1;
                obj = eVar2.a(0L, this.v, this);
            }
            return aVar;
        }
        if (i == 1) {
            com.gamericefishpro.space.wa.b.P(obj);
            ((com.gamericefishpro.space.c3.p) obj).getClass();
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(obj);
            ((com.gamericefishpro.space.c3.p) obj).getClass();
        }
        return Unit.a;
    }
}
