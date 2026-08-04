package com.gamericefishpro.space.ti;

import com.gamericefishpro.space.i9.y3;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends com.gamericefishpro.space.vh.i implements Function2 {
    public int d;
    public final /* synthetic */ com.gamericefishpro.space.si.e[] e;
    public final /* synthetic */ int i;
    public final /* synthetic */ AtomicInteger v;
    public final /* synthetic */ com.gamericefishpro.space.ri.e w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.gamericefishpro.space.si.e[] eVarArr, int i, AtomicInteger atomicInteger, com.gamericefishpro.space.ri.e eVar, com.gamericefishpro.space.th.a aVar) {
        super(2, aVar);
        this.e = eVarArr;
        this.i = i;
        this.v = atomicInteger;
        this.w = eVar;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        return new n(this.e, this.i, this.v, this.w, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((com.gamericefishpro.space.pi.x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i = this.d;
        AtomicInteger atomicInteger = this.v;
        com.gamericefishpro.space.ri.e eVar = this.w;
        try {
            if (i == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                com.gamericefishpro.space.si.e[] eVarArr = this.e;
                int i2 = this.i;
                com.gamericefishpro.space.si.e eVar2 = eVarArr[i2];
                m mVar = new m(eVar, i2);
                this.d = 1;
                if (eVar2.a(mVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.gamericefishpro.space.wa.b.P(obj);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                y3.q(eVar);
            }
            return Unit.a;
        } catch (Throwable th) {
            if (atomicInteger.decrementAndGet() == 0) {
                y3.q(eVar);
            }
            throw th;
        }
    }
}
