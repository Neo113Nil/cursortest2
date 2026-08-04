package com.gamericefishpro.space.ti;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f extends e {
    public final com.gamericefishpro.space.si.e v;

    public f(com.gamericefishpro.space.si.e eVar, CoroutineContext coroutineContext, int i, com.gamericefishpro.space.ri.a aVar) {
        super(coroutineContext, i, aVar);
        this.v = eVar;
    }

    @Override // com.gamericefishpro.space.ti.e, com.gamericefishpro.space.si.e
    public final Object a(com.gamericefishpro.space.si.f fVar, com.gamericefishpro.space.th.a aVar) {
        if (this.e == -3) {
            CoroutineContext context = aVar.getContext();
            Boolean bool = Boolean.FALSE;
            com.gamericefishpro.space.g7.a aVar2 = new com.gamericefishpro.space.g7.a(5);
            CoroutineContext coroutineContext = this.d;
            CoroutineContext coroutineContextO = !((Boolean) coroutineContext.w(bool, aVar2)).booleanValue() ? context.o(coroutineContext) : com.gamericefishpro.space.pi.r.a(context, coroutineContext, false);
            if (Intrinsics.a(coroutineContextO, context)) {
                Object objH = h(fVar, aVar);
                return objH == com.gamericefishpro.space.uh.a.d ? objH : Unit.a;
            }
            com.gamericefishpro.space.th.b bVar = kotlin.coroutines.d.x;
            if (Intrinsics.a(coroutineContextO.j(bVar), context.j(bVar))) {
                CoroutineContext context2 = aVar.getContext();
                if (!(fVar instanceof w) && !(fVar instanceof s)) {
                    fVar = new com.gamericefishpro.space.g5.v(fVar, context2);
                }
                Object objB = c.b(coroutineContextO, fVar, com.gamericefishpro.space.ui.t.b(coroutineContextO), new com.gamericefishpro.space.b0.o(this, (com.gamericefishpro.space.th.a) null, 22), aVar);
                return objB == com.gamericefishpro.space.uh.a.d ? objB : Unit.a;
            }
        }
        Object objA = super.a(fVar, aVar);
        return objA == com.gamericefishpro.space.uh.a.d ? objA : Unit.a;
    }

    @Override // com.gamericefishpro.space.ti.e
    public final Object d(com.gamericefishpro.space.ri.q qVar, com.gamericefishpro.space.b0.o oVar) {
        Object objH = h(new w(qVar), oVar);
        return objH == com.gamericefishpro.space.uh.a.d ? objH : Unit.a;
    }

    public abstract Object h(com.gamericefishpro.space.si.f fVar, com.gamericefishpro.space.th.a aVar);

    @Override // com.gamericefishpro.space.ti.e
    public final String toString() {
        return this.v + " -> " + super.toString();
    }
}
