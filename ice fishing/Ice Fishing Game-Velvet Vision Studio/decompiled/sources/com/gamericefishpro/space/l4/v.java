package com.gamericefishpro.space.l4;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends com.gamericefishpro.space.vh.i implements Function1 {
    public Throwable d;
    public int e;
    public final /* synthetic */ c0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(c0 c0Var, com.gamericefishpro.space.th.a aVar) {
        super(1, aVar);
        this.i = c0Var;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(com.gamericefishpro.space.th.a aVar) {
        return new v(this.i, aVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((v) create((com.gamericefishpro.space.th.a) obj)).invokeSuspend(Unit.a);
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        u0 p0Var;
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i = this.e;
        c0 c0Var = this.i;
        try {
            if (i == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                this.e = 1;
                obj = c0.e(c0Var, true, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th = this.d;
                    com.gamericefishpro.space.wa.b.P(obj);
                    p0Var = new p0(th, ((Number) obj).intValue());
                    return new Pair(p0Var, Boolean.TRUE);
                }
                com.gamericefishpro.space.wa.b.P(obj);
            }
            p0Var = (u0) obj;
        } catch (Throwable th2) {
            t0 t0VarF = c0Var.f();
            this.d = th2;
            this.e = 2;
            Integer numA = t0VarF.a();
            if (numA != aVar) {
                th = th2;
                obj = numA;
            }
            return aVar;
        }
        return new Pair(p0Var, Boolean.TRUE);
    }
}
