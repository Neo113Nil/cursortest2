package com.gamericefishpro.space.z;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends com.gamericefishpro.space.vh.i implements Function2 {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ i i;
    public final /* synthetic */ u1 v;
    public final /* synthetic */ c w;
    public final /* synthetic */ long y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, u1 u1Var, c cVar, long j, com.gamericefishpro.space.th.a aVar) {
        super(2, aVar);
        this.i = iVar;
        this.v = u1Var;
        this.w = cVar;
        this.y = j;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        h hVar = new h(this.i, this.v, this.w, this.y, aVar);
        hVar.e = obj;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((com.gamericefishpro.space.pi.x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        i iVar = this.i;
        com.gamericefishpro.space.h0.l lVar = iVar.L;
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i = this.d;
        try {
            try {
                if (i == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    com.gamericefishpro.space.pi.d1 d1VarN = com.gamericefishpro.space.pi.a0.n(((com.gamericefishpro.space.pi.x) this.e).l());
                    iVar.O = true;
                    q1 q1Var = iVar.I;
                    com.gamericefishpro.space.y.r0 r0Var = com.gamericefishpro.space.y.r0.d;
                    g gVar = new g(this.v, iVar, this.w, this.y, d1VarN, null);
                    this.d = 1;
                    if (q1Var.f(r0Var, gVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                }
                lVar.b();
                iVar.O = false;
                lVar.a(null);
                iVar.M = false;
                return Unit.a;
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th) {
            iVar.O = false;
            lVar.a(null);
            iVar.M = false;
            throw th;
        }
    }
}
