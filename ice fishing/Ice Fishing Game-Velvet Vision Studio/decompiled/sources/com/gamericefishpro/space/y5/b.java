package com.gamericefishpro.space.y5;

import com.gamericefishpro.space.pi.x;
import com.gamericefishpro.space.s5.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends com.gamericefishpro.space.vh.i implements Function2 {
    public int d;
    public final /* synthetic */ t e;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ Function1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(t tVar, com.gamericefishpro.space.th.a aVar, Function1 function1, boolean z, boolean z2) {
        super(2, aVar);
        this.e = tVar;
        this.i = z;
        this.v = z2;
        this.w = function1;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        boolean z = this.v;
        return new b(this.e, aVar, this.w, this.i, z);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(obj);
            return obj;
        }
        com.gamericefishpro.space.wa.b.P(obj);
        Function1 function1 = this.w;
        t tVar = this.e;
        boolean z = this.v;
        boolean z2 = this.i;
        d dVar = new d(tVar, null, function1, z, z2);
        this.d = 1;
        Object objV = tVar.v(z2, dVar, this);
        return objV == aVar ? aVar : objV;
    }
}
