package com.gamericefishpro.space.g5;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.t0.b1;
import com.gamericefishpro.space.t0.n1;
import com.gamericefishpro.space.t0.v0;
import com.gamericefishpro.space.w.l1;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements com.gamericefishpro.space.si.f {
    public final /* synthetic */ int d;
    public final Object e;
    public final Object i;
    public final Object v;

    /* JADX WARN: Multi-variable type inference failed */
    public v(com.gamericefishpro.space.ei.w wVar, com.gamericefishpro.space.si.f fVar, Function2 function2) {
        this.d = 1;
        this.e = wVar;
        this.i = fVar;
        this.v = (com.gamericefishpro.space.vh.i) function2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0054  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:66:0x0131  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v15, types: [com.gamericefishpro.space.vh.i, kotlin.jvm.functions.Function2] */
    @Override // com.gamericefishpro.space.si.f
    public final Object d(Object obj, com.gamericefishpro.space.th.a aVar) {
        com.gamericefishpro.space.si.n nVar;
        v vVar;
        com.gamericefishpro.space.si.f fVar;
        com.gamericefishpro.space.u5.g gVar;
        com.gamericefishpro.space.si.f fVar2;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.d.a aVar2 = (com.gamericefishpro.space.d.a) obj;
                if (((List) ((v0) this.e).getValue()).size() > 1) {
                    ((v0) this.i).setValue(Boolean.TRUE);
                    ((b1) this.v).h(aVar2.c);
                }
                return Unit.a;
            case 1:
                if (aVar instanceof com.gamericefishpro.space.si.n) {
                    nVar = (com.gamericefishpro.space.si.n) aVar;
                    int i = nVar.w;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        nVar.w = i - Integer.MIN_VALUE;
                    } else {
                        nVar = new com.gamericefishpro.space.si.n(this, aVar);
                    }
                } else {
                    nVar = new com.gamericefishpro.space.si.n(this, aVar);
                }
                Object objInvoke = nVar.i;
                com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
                int i2 = nVar.w;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            obj = nVar.e;
                            vVar = nVar.d;
                            com.gamericefishpro.space.wa.b.P(objInvoke);
                            if (!((Boolean) objInvoke).booleanValue()) {
                                ((com.gamericefishpro.space.ei.w) vVar.e).d = true;
                                fVar = (com.gamericefishpro.space.si.f) vVar.i;
                                nVar.d = null;
                                nVar.e = null;
                                nVar.w = 3;
                                if (fVar.d(obj, nVar) == aVar3) {
                                    return aVar3;
                                }
                            }
                        } else if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                    com.gamericefishpro.space.wa.b.P(objInvoke);
                } else {
                    com.gamericefishpro.space.wa.b.P(objInvoke);
                    if (((com.gamericefishpro.space.ei.w) this.e).d) {
                        com.gamericefishpro.space.si.f fVar3 = (com.gamericefishpro.space.si.f) this.i;
                        nVar.w = 1;
                        if (fVar3.d(obj, nVar) == aVar3) {
                            return aVar3;
                        }
                    } else {
                        ?? r9 = (com.gamericefishpro.space.vh.i) this.v;
                        nVar.d = this;
                        nVar.e = obj;
                        nVar.w = 2;
                        objInvoke = r9.invoke(obj, nVar);
                        if (objInvoke == aVar3) {
                            return aVar3;
                        }
                        vVar = this;
                        if (!((Boolean) objInvoke).booleanValue()) {
                            ((com.gamericefishpro.space.ei.w) vVar.e).d = true;
                            fVar = (com.gamericefishpro.space.si.f) vVar.i;
                            nVar.d = null;
                            nVar.e = null;
                            nVar.w = 3;
                            if (fVar.d(obj, nVar) == aVar3) {
                                return aVar3;
                            }
                        }
                    }
                }
                return Unit.a;
            case 2:
                Object objB = com.gamericefishpro.space.ti.c.b((CoroutineContext) this.e, obj, this.i, (com.gamericefishpro.space.b0.o) this.v, aVar);
                return objB == com.gamericefishpro.space.uh.a.d ? objB : Unit.a;
            case 3:
                if (aVar instanceof com.gamericefishpro.space.u5.g) {
                    gVar = (com.gamericefishpro.space.u5.g) aVar;
                    int i3 = gVar.e;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        gVar.e = i3 - Integer.MIN_VALUE;
                    } else {
                        gVar = new com.gamericefishpro.space.u5.g(this, aVar);
                    }
                } else {
                    gVar = new com.gamericefishpro.space.u5.g(this, aVar);
                }
                Object obj2 = gVar.d;
                com.gamericefishpro.space.uh.a aVar4 = com.gamericefishpro.space.uh.a.d;
                int i4 = gVar.e;
                if (i4 != 0) {
                    if (i4 == 1) {
                        fVar2 = gVar.i;
                        com.gamericefishpro.space.wa.b.P(obj2);
                    } else {
                        if (i4 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.gamericefishpro.space.wa.b.P(obj2);
                    }
                    return Unit.a;
                }
                com.gamericefishpro.space.wa.b.P(obj2);
                com.gamericefishpro.space.si.f fVar4 = (com.gamericefishpro.space.si.f) this.e;
                com.gamericefishpro.space.s5.t tVar = (com.gamericefishpro.space.s5.t) this.i;
                Function1 function1 = (Function1) this.v;
                gVar.i = fVar4;
                gVar.e = 1;
                Object objH = com.gamericefishpro.space.hj.c.H(tVar, gVar, function1, true, false);
                if (objH == aVar4) {
                    return aVar4;
                }
                obj2 = objH;
                fVar2 = fVar4;
                gVar.i = null;
                gVar.e = 2;
                if (fVar2.d(obj2, gVar) == aVar4) {
                    return aVar4;
                }
                return Unit.a;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                l1 l1Var = (l1) this.v;
                ((n1) this.i).setValue(Boolean.valueOf(zBooleanValue ? ((Boolean) ((Function2) ((v0) this.e).getValue()).invoke(l1Var.a.k(), l1Var.d.getValue())).booleanValue() : false));
                return Unit.a;
        }
    }

    public v(n1 n1Var, l1 l1Var, v0 v0Var) {
        this.d = 4;
        this.i = n1Var;
        this.v = l1Var;
        this.e = v0Var;
    }

    public /* synthetic */ v(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.e = obj;
        this.i = obj2;
        this.v = obj3;
    }

    public v(com.gamericefishpro.space.si.f fVar, CoroutineContext coroutineContext) {
        this.d = 2;
        this.e = coroutineContext;
        this.i = com.gamericefishpro.space.ui.t.b(coroutineContext);
        this.v = new com.gamericefishpro.space.b0.o(fVar, (com.gamericefishpro.space.th.a) null, 23);
    }
}
