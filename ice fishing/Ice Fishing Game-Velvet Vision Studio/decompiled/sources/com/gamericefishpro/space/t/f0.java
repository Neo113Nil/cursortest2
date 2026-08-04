package com.gamericefishpro.space.t;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends com.gamericefishpro.space.vh.h implements Function2 {
    public final /* synthetic */ g0 A;
    public final /* synthetic */ com.gamericefishpro.space.li.e B;
    public com.gamericefishpro.space.li.e e;
    public g0 i;
    public long[] v;
    public int w;
    public int y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(g0 g0Var, com.gamericefishpro.space.li.e eVar, com.gamericefishpro.space.th.a aVar) {
        super(aVar);
        this.A = g0Var;
        this.B = eVar;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        f0 f0Var = new f0(this.A, this.B, aVar);
        f0Var.z = obj;
        return f0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f0) create((com.gamericefishpro.space.li.g) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        com.gamericefishpro.space.li.g gVar;
        g0 g0Var;
        long[] jArr;
        int i;
        com.gamericefishpro.space.li.e eVar;
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i2 = this.y;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            gVar = (com.gamericefishpro.space.li.g) this.z;
            g0Var = this.A;
            e0 e0Var = g0Var.e;
            jArr = e0Var.c;
            i = e0Var.e;
            eVar = this.B;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.w;
            jArr = this.v;
            g0Var = this.i;
            eVar = this.e;
            gVar = (com.gamericefishpro.space.li.g) this.z;
            com.gamericefishpro.space.wa.b.P(obj);
        }
        if (i == Integer.MAX_VALUE) {
            return Unit.a;
        }
        int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
        eVar.e = i;
        Object obj2 = g0Var.e.b[i];
        this.z = gVar;
        this.e = eVar;
        this.i = g0Var;
        this.v = jArr;
        this.w = i3;
        this.y = 1;
        gVar.a(obj2, this);
        return aVar;
    }
}
