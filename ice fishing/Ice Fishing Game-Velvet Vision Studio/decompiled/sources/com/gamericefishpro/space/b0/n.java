package com.gamericefishpro.space.b0;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.ei.y;
import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.si.p;
import com.gamericefishpro.space.si.t;
import com.gamericefishpro.space.si.x;
import com.gamericefishpro.space.t0.v0;
import com.gamericefishpro.space.w.o1;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements com.gamericefishpro.space.si.f {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object i;

    public /* synthetic */ n(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.i = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007d  */
    /* JADX WARN: Code duplicated, block: B:54:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:74:0x013d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0140  */
    /* JADX WARN: Code duplicated, block: B:83:0x015d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Type inference failed for: r2v32, types: [com.gamericefishpro.space.vh.i, kotlin.jvm.functions.Function2] */
    @Override // com.gamericefishpro.space.si.f
    public final Object d(Object obj, com.gamericefishpro.space.th.a aVar) {
        float f;
        com.gamericefishpro.space.si.c cVar;
        p pVar;
        Object obj2;
        Object obj3;
        n nVar;
        t tVar;
        n nVar2;
        x xVar;
        Object obj4;
        com.gamericefishpro.space.si.f fVar;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                h hVar = (h) obj;
                ArrayList arrayList = (ArrayList) this.e;
                if (hVar instanceof k) {
                    arrayList.add(hVar);
                } else if (hVar instanceof l) {
                    arrayList.remove(((l) hVar).a);
                } else if (hVar instanceof j) {
                    arrayList.remove(((j) hVar).a);
                }
                ((v0) this.i).setValue(Boolean.valueOf(!arrayList.isEmpty()));
                return Unit.a;
            case 1:
                h hVar2 = (h) obj;
                com.gamericefishpro.space.p0.a aVar2 = (com.gamericefishpro.space.p0.a) this.e;
                if (!(hVar2 instanceof m)) {
                    com.gamericefishpro.space.pi.x xVar2 = (com.gamericefishpro.space.pi.x) this.i;
                    com.gamericefishpro.space.b2.p pVar2 = aVar2.M;
                    if (pVar2 == null) {
                        boolean z = aVar2.I;
                        com.gamericefishpro.space.q0.g gVar = aVar2.L;
                        pVar2 = new com.gamericefishpro.space.b2.p();
                        pVar2.a = z;
                        pVar2.b = gVar;
                        pVar2.c = com.gamericefishpro.space.w.c.a(0.0f);
                        pVar2.d = new ArrayList();
                        com.gamericefishpro.space.h2.k.j(aVar2);
                        aVar2.M = pVar2;
                    }
                    ArrayList arrayList2 = (ArrayList) pVar2.d;
                    if (hVar2 instanceof f) {
                        arrayList2.add(hVar2);
                    } else if (hVar2 instanceof g) {
                        arrayList2.remove(((g) hVar2).a);
                    } else if (hVar2 instanceof d) {
                        arrayList2.add(hVar2);
                    } else if (hVar2 instanceof e) {
                        arrayList2.remove(((e) hVar2).a);
                    } else if (hVar2 instanceof b) {
                        arrayList2.add(hVar2);
                    } else if (hVar2 instanceof c) {
                        arrayList2.remove(((c) hVar2).a);
                    } else if (hVar2 instanceof a) {
                        arrayList2.remove(((a) hVar2).a);
                    }
                    h hVar3 = (h) CollectionsKt.C(arrayList2);
                    if (!Intrinsics.a((h) pVar2.e, hVar3)) {
                        com.gamericefishpro.space.th.a aVar3 = null;
                        if (hVar3 != null) {
                            ((com.gamericefishpro.space.q0.g) pVar2.b).invoke();
                            boolean z2 = hVar3 instanceof f;
                            if (z2) {
                                f = 0.08f;
                            } else if (hVar3 instanceof d) {
                                f = 0.1f;
                            } else {
                                f = hVar3 instanceof b ? 0.16f : 0.0f;
                            }
                            o1 o1Var = com.gamericefishpro.space.p0.f.a;
                            if (!z2 && ((hVar3 instanceof d) || (hVar3 instanceof b))) {
                                o1Var = new o1(45, 0, com.gamericefishpro.space.w.t.b);
                            }
                            a0.u(xVar2, null, new com.gamericefishpro.space.g5.x(pVar2, f, o1Var, (com.gamericefishpro.space.th.a) null), 3);
                        } else {
                            h hVar4 = (h) pVar2.e;
                            o1 o1Var2 = com.gamericefishpro.space.p0.f.a;
                            if (!(hVar4 instanceof f) && !(hVar4 instanceof d) && (hVar4 instanceof b)) {
                                o1Var2 = new o1(150, 0, com.gamericefishpro.space.w.t.b);
                            }
                            a0.u(xVar2, null, new o(pVar2, o1Var2, aVar3, 18), 3);
                        }
                        pVar2.e = hVar3;
                    }
                } else if (aVar2.P) {
                    aVar2.A0((m) hVar2);
                } else {
                    aVar2.Q.a(hVar2);
                }
                return Unit.a;
            case 2:
                h hVar5 = (h) obj;
                y yVar = (y) this.e;
                if (hVar5 instanceof k) {
                    yVar.d++;
                } else if ((hVar5 instanceof l) || (hVar5 instanceof j)) {
                    yVar.d--;
                }
                boolean z3 = yVar.d > 0;
                com.gamericefishpro.space.q0.v0 v0Var = (com.gamericefishpro.space.q0.v0) this.i;
                if (v0Var.K != z3) {
                    v0Var.K = z3;
                    com.gamericefishpro.space.h2.k.k(v0Var);
                }
                return Unit.a;
            case 3:
                com.gamericefishpro.space.ei.a0 a0Var = (com.gamericefishpro.space.ei.a0) this.e;
                if (aVar instanceof com.gamericefishpro.space.si.c) {
                    cVar = (com.gamericefishpro.space.si.c) aVar;
                    int i = cVar.i;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        cVar.i = i - Integer.MIN_VALUE;
                    } else {
                        cVar = new com.gamericefishpro.space.si.c(this, aVar);
                    }
                } else {
                    cVar = new com.gamericefishpro.space.si.c(this, aVar);
                }
                Object obj5 = cVar.d;
                com.gamericefishpro.space.uh.a aVar4 = com.gamericefishpro.space.uh.a.d;
                int i2 = cVar.i;
                if (i2 == 0) {
                    com.gamericefishpro.space.wa.b.P(obj5);
                    Object obj6 = a0Var.d;
                    if (obj6 == com.gamericefishpro.space.ti.c.b || !Intrinsics.a(obj6, obj)) {
                        a0Var.d = obj;
                        com.gamericefishpro.space.si.f fVar2 = (com.gamericefishpro.space.si.f) this.i;
                        cVar.i = 1;
                        if (fVar2.d(obj, cVar) == aVar4) {
                            return aVar4;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj5);
                }
                return Unit.a;
            case 4:
                if (aVar instanceof p) {
                    pVar = (p) aVar;
                    int i3 = pVar.i;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        pVar.i = i3 - Integer.MIN_VALUE;
                    } else {
                        pVar = new p(this, aVar);
                    }
                } else {
                    pVar = new p(this, aVar);
                }
                Object obj7 = pVar.e;
                com.gamericefishpro.space.uh.a aVar5 = com.gamericefishpro.space.uh.a.d;
                int i4 = pVar.i;
                boolean z4 = true;
                if (i4 != 0) {
                    if (i4 == 1) {
                        Object obj8 = pVar.w;
                        n nVar3 = pVar.d;
                        com.gamericefishpro.space.wa.b.P(obj7);
                        obj3 = obj8;
                        nVar = nVar3;
                        obj2 = obj7;
                    } else {
                        if (i4 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        nVar = pVar.d;
                        com.gamericefishpro.space.wa.b.P(obj7);
                    }
                    if (z4) {
                        return Unit.a;
                    }
                    throw new com.gamericefishpro.space.ti.a(nVar);
                }
                com.gamericefishpro.space.wa.b.P(obj7);
                com.gamericefishpro.space.c7.f fVar3 = (com.gamericefishpro.space.c7.f) this.e;
                pVar.d = this;
                pVar.w = obj;
                pVar.i = 1;
                Object objInvoke = fVar3.invoke(obj, pVar);
                if (objInvoke == aVar5) {
                    return aVar5;
                }
                obj2 = objInvoke;
                obj3 = obj;
                nVar = this;
                if (((Boolean) obj2).booleanValue()) {
                    com.gamericefishpro.space.si.f fVar4 = (com.gamericefishpro.space.si.f) nVar.i;
                    pVar.d = nVar;
                    pVar.w = null;
                    pVar.i = 2;
                    if (fVar4.d(obj3, pVar) == aVar5) {
                        return aVar5;
                    }
                } else {
                    z4 = false;
                }
                if (z4) {
                    return Unit.a;
                }
                throw new com.gamericefishpro.space.ti.a(nVar);
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                if (aVar instanceof t) {
                    tVar = (t) aVar;
                    int i5 = tVar.i;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        tVar.i = i5 - Integer.MIN_VALUE;
                    } else {
                        tVar = new t(this, aVar);
                    }
                } else {
                    tVar = new t(this, aVar);
                }
                Object objInvoke2 = tVar.e;
                com.gamericefishpro.space.uh.a aVar6 = com.gamericefishpro.space.uh.a.d;
                int i6 = tVar.i;
                if (i6 == 0) {
                    com.gamericefishpro.space.wa.b.P(objInvoke2);
                    Function2 function2 = (Function2) this.e;
                    tVar.d = this;
                    tVar.w = obj;
                    tVar.i = 1;
                    objInvoke2 = function2.invoke(obj, tVar);
                    if (objInvoke2 == aVar6) {
                        return aVar6;
                    }
                    nVar2 = this;
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = tVar.w;
                    nVar2 = tVar.d;
                    com.gamericefishpro.space.wa.b.P(objInvoke2);
                }
                if (!((Boolean) objInvoke2).booleanValue()) {
                    return Unit.a;
                }
                ((com.gamericefishpro.space.ei.a0) nVar2.i).d = obj;
                throw new com.gamericefishpro.space.ti.a(nVar2);
            default:
                if (aVar instanceof x) {
                    xVar = (x) aVar;
                    int i7 = xVar.e;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        xVar.e = i7 - Integer.MIN_VALUE;
                    } else {
                        xVar = new x(this, aVar);
                    }
                } else {
                    xVar = new x(this, aVar);
                }
                Object obj9 = xVar.d;
                com.gamericefishpro.space.uh.a aVar7 = com.gamericefishpro.space.uh.a.d;
                int i8 = xVar.e;
                if (i8 != 0) {
                    if (i8 == 1) {
                        fVar = xVar.w;
                        obj4 = xVar.v;
                        com.gamericefishpro.space.wa.b.P(obj9);
                    } else {
                        if (i8 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.gamericefishpro.space.wa.b.P(obj9);
                    }
                    return Unit.a;
                }
                com.gamericefishpro.space.wa.b.P(obj9);
                com.gamericefishpro.space.si.f fVar5 = (com.gamericefishpro.space.si.f) this.e;
                ?? r2 = (com.gamericefishpro.space.vh.i) this.i;
                xVar.v = obj;
                xVar.w = fVar5;
                xVar.e = 1;
                if (r2.invoke(obj, xVar) == aVar7) {
                    return aVar7;
                }
                obj4 = obj;
                fVar = fVar5;
                xVar.v = null;
                xVar.w = null;
                xVar.e = 2;
                if (fVar.d(obj4, xVar) == aVar7) {
                    return aVar7;
                }
                return Unit.a;
        }
    }

    public n(com.gamericefishpro.space.si.d dVar, com.gamericefishpro.space.ei.a0 a0Var, com.gamericefishpro.space.si.f fVar) {
        this.d = 3;
        this.e = a0Var;
        this.i = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n(com.gamericefishpro.space.si.f fVar, Function2 function2) {
        this.d = 6;
        this.e = fVar;
        this.i = (com.gamericefishpro.space.vh.i) function2;
    }
}
