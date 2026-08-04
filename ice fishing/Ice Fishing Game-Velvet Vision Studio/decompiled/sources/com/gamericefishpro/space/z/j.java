package com.gamericefishpro.space.z;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends com.gamericefishpro.space.vh.i implements Function2 {
    public com.gamericefishpro.space.ei.x d;
    public com.gamericefishpro.space.w.j e;
    public int i;
    public final /* synthetic */ float v;
    public final /* synthetic */ k w;
    public final /* synthetic */ m1 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(float f, k kVar, m1 m1Var, com.gamericefishpro.space.th.a aVar) {
        super(2, aVar);
        this.v = f;
        this.w = kVar;
        this.y = m1Var;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        return new j(this.v, this.w, this.y, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((com.gamericefishpro.space.pi.x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        float f;
        com.gamericefishpro.space.w.j jVar;
        com.gamericefishpro.space.ei.x xVar;
        com.gamericefishpro.space.w.j jVar2;
        Object obj2 = com.gamericefishpro.space.uh.a.d;
        int i = this.i;
        if (i == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            f = this.v;
            if (Math.abs(f) > 1.0f) {
                com.gamericefishpro.space.ei.x xVar2 = new com.gamericefishpro.space.ei.x();
                xVar2.d = f;
                com.gamericefishpro.space.ei.x xVar3 = new com.gamericefishpro.space.ei.x();
                com.gamericefishpro.space.w.j jVarB = com.gamericefishpro.space.w.c.b(28, f);
                try {
                    k kVar = this.w;
                    com.gamericefishpro.space.w.r rVar = kVar.a;
                    com.gamericefishpro.space.g0.t tVar = new com.gamericefishpro.space.g0.t(xVar3, this.y, xVar2, kVar, 5);
                    this.d = xVar2;
                    this.e = jVarB;
                    this.i = 1;
                    jVar = jVarB;
                    try {
                        Object objC = com.gamericefishpro.space.w.c.c(jVar, new com.gamericefishpro.space.w.q(rVar, com.gamericefishpro.space.w.c.j, jVarB.e.getValue(), jVarB.i), Long.MIN_VALUE, tVar, this);
                        if (objC != obj2) {
                            objC = Unit.a;
                        }
                        if (objC == obj2) {
                            return obj2;
                        }
                        xVar = xVar2;
                        f = xVar.d;
                    } catch (CancellationException unused) {
                        xVar = xVar2;
                        jVar2 = jVar;
                        xVar.d = ((Number) ((Function1) jVar2.d.e).invoke(jVar2.i)).floatValue();
                    }
                } catch (CancellationException unused2) {
                    jVar = jVarB;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar2 = this.e;
            xVar = this.d;
            try {
                com.gamericefishpro.space.wa.b.P(obj);
            } catch (CancellationException unused3) {
                xVar.d = ((Number) ((Function1) jVar2.d.e).invoke(jVar2.i)).floatValue();
            }
            f = xVar.d;
        }
        return new Float(f);
    }
}
