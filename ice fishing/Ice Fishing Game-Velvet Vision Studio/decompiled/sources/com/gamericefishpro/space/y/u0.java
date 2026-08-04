package com.gamericefishpro.space.y;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends com.gamericefishpro.space.vh.i implements Function2 {
    public final /* synthetic */ v0 A;
    public final /* synthetic */ com.gamericefishpro.space.db.d B;
    public final /* synthetic */ com.gamericefishpro.space.z.l C;
    public com.gamericefishpro.space.xi.a d;
    public Object e;
    public com.gamericefishpro.space.z.l i;
    public v0 v;
    public int w;
    public /* synthetic */ Object y;
    public final /* synthetic */ r0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(r0 r0Var, v0 v0Var, com.gamericefishpro.space.db.d dVar, com.gamericefishpro.space.z.l lVar, com.gamericefishpro.space.th.a aVar) {
        super(2, aVar);
        this.z = r0Var;
        this.A = v0Var;
        this.B = dVar;
        this.C = lVar;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        u0 u0Var = new u0(this.z, this.A, this.B, this.C, aVar);
        u0Var.y = obj;
        return u0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u0) create((com.gamericefishpro.space.pi.x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.gamericefishpro.space.xi.a, int] */
    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        v0 v0Var;
        com.gamericefishpro.space.z.l lVar;
        t0 t0Var;
        com.gamericefishpro.space.xi.a aVar;
        Function2 function2;
        v0 v0Var2;
        Throwable th;
        t0 t0Var2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        ?? r1 = this.w;
        try {
            try {
                if (r1 == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    CoroutineContext.Element elementJ = ((com.gamericefishpro.space.pi.x) this.y).l().j(com.gamericefishpro.space.pi.u.e);
                    Intrinsics.b(elementJ);
                    t0 t0Var3 = new t0(this.z, (com.gamericefishpro.space.pi.d1) elementJ);
                    v0Var = this.A;
                    AtomicReference atomicReference3 = v0Var.a;
                    loop2: while (true) {
                        t0 t0Var4 = (t0) atomicReference3.get();
                        if (t0Var4 != null && t0Var3.a.compareTo(t0Var4.a) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        do {
                            if (atomicReference3.compareAndSet(t0Var4, t0Var3)) {
                                if (t0Var4 != null) {
                                    t0Var4.b.c(new s0("Mutation interrupted", 1));
                                }
                                com.gamericefishpro.space.xi.c cVar = v0Var.b;
                                this.y = t0Var3;
                                this.d = cVar;
                                com.gamericefishpro.space.db.d dVar = this.B;
                                this.e = dVar;
                                com.gamericefishpro.space.z.l lVar2 = this.C;
                                this.i = lVar2;
                                this.v = v0Var;
                                this.w = 1;
                                if (cVar.c(this) != aVar2) {
                                    lVar = lVar2;
                                    t0Var = t0Var3;
                                    aVar = cVar;
                                    function2 = dVar;
                                    break loop2;
                                }
                                return aVar2;
                            }
                        } while (atomicReference3.get() == t0Var4);
                    }
                } else {
                    if (r1 != 1) {
                        if (r1 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        v0Var2 = (v0) this.e;
                        aVar = this.d;
                        t0Var2 = (t0) this.y;
                        try {
                            com.gamericefishpro.space.wa.b.P(obj);
                            atomicReference2 = v0Var2.a;
                            while (!atomicReference2.compareAndSet(t0Var2, null) && atomicReference2.get() == t0Var2) {
                            }
                            aVar.b(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            atomicReference = v0Var2.a;
                            while (!atomicReference.compareAndSet(t0Var2, null)) {
                            }
                            throw th;
                        }
                    }
                    v0 v0Var3 = this.v;
                    lVar = this.i;
                    function2 = (Function2) this.e;
                    com.gamericefishpro.space.xi.a aVar3 = this.d;
                    t0Var = (t0) this.y;
                    com.gamericefishpro.space.wa.b.P(obj);
                    v0Var = v0Var3;
                    aVar = aVar3;
                }
                this.y = t0Var;
                this.d = aVar;
                this.e = v0Var;
                this.i = null;
                this.v = null;
                this.w = 2;
                Object objInvoke = function2.invoke(lVar, this);
                if (objInvoke != aVar2) {
                    v0Var2 = v0Var;
                    obj = objInvoke;
                    t0Var2 = t0Var;
                    atomicReference2 = v0Var2.a;
                    while (!atomicReference2.compareAndSet(t0Var2, null)) {
                    }
                    aVar.b(null);
                    return obj;
                }
                return aVar2;
            } catch (Throwable th3) {
                v0Var2 = v0Var;
                th = th3;
                t0Var2 = t0Var;
                atomicReference = v0Var2.a;
                while (!atomicReference.compareAndSet(t0Var2, null) && atomicReference.get() == t0Var2) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            r1.b(null);
            throw th4;
        }
    }
}
