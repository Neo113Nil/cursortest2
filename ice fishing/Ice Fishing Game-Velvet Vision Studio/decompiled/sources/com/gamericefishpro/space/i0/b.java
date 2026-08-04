package com.gamericefishpro.space.i0;

import com.gamericefishpro.space.b0.o;
import com.gamericefishpro.space.db.d;
import com.gamericefishpro.space.h2.f1;
import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.pi.x;
import com.gamericefishpro.space.vh.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object d;
    public final /* synthetic */ c e;
    public final /* synthetic */ f1 i;
    public final /* synthetic */ com.gamericefishpro.space.b2.b v;
    public final /* synthetic */ com.gamericefishpro.space.b1.b w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, f1 f1Var, com.gamericefishpro.space.b2.b bVar, com.gamericefishpro.space.b1.b bVar2, com.gamericefishpro.space.th.a aVar) {
        super(2, aVar);
        this.e = cVar;
        this.i = f1Var;
        this.v = bVar;
        this.w = bVar2;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        b bVar = new b(this.e, this.i, this.v, this.w, aVar);
        bVar.d = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        com.gamericefishpro.space.wa.b.P(obj);
        x xVar = (x) this.d;
        com.gamericefishpro.space.b2.b bVar = this.v;
        c cVar = this.e;
        a0.u(xVar, null, new d(cVar, this.i, bVar, null, 2), 3);
        return a0.u(xVar, null, new o(cVar, this.w, null, 8), 3);
    }
}
