package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class cil extends aur implements pyc {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ rjc l;
    public /* synthetic */ Object m;
    public final /* synthetic */ eil n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cil(Continuation continuation, eil eilVar, int i) {
        super(3, continuation);
        this.j = i;
        this.n = eilVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        rjc rjcVar = (rjc) obj;
        Continuation continuation = (Continuation) obj3;
        switch (this.j) {
            case 0:
                cil cilVar = new cil(continuation, this.n, 0);
                cilVar.l = rjcVar;
                cilVar.m = obj2;
                return cilVar.invokeSuspend(Unit.a);
            default:
                cil cilVar2 = new cil(continuation, this.n, 1);
                cilVar2.l = rjcVar;
                cilVar2.m = obj2;
                return cilVar2.invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0195  */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        pjc ailVar;
        nm6 nm6Var;
        pjc Q;
        nm6 nm6Var2;
        eil eilVar;
        eml emlVar;
        xdr xdrVar;
        int i = this.j;
        uhl uhlVar = uhl.a;
        vhl vhlVar = vhl.a;
        switch (i) {
            case 0:
                nm6 nm6Var3 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar = this.l;
                    e6l e6lVar = (e6l) this.m;
                    if (e6lVar instanceof b6l) {
                        ailVar = new fs(15, uhlVar);
                    } else if (e6lVar instanceof c6l) {
                        ailVar = new fs(15, vhlVar);
                    } else {
                        if (!(e6lVar instanceof d6l)) {
                            b6e.s();
                            return null;
                        }
                        ailVar = new ail(0, zsd.X(this.n.c, 100L), e6lVar);
                    }
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (zsd.e0(rjcVar, ailVar, this) == nm6Var3) {
                        return nm6Var3;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            default:
                eil eilVar2 = this.n;
                l1g l1gVar = eilVar2.a;
                nm6 nm6Var4 = nm6.a;
                int i3 = this.k;
                if (i3 != 0) {
                    if (i3 == 1) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                rjc rjcVar2 = this.l;
                xhl xhlVar = (xhl) this.m;
                if (Intrinsics.d(xhlVar, vhlVar)) {
                    l1gVar.a();
                    Q = new fs(15, vml.b);
                } else {
                    if (!Intrinsics.d(xhlVar, uhlVar)) {
                        if (!(xhlVar instanceof whl)) {
                            b6e.s();
                            return null;
                        }
                        n7q n7qVar = ((whl) xhlVar).a;
                        s8i s8iVar = eilVar2.b;
                        n7qVar.getClass();
                        mwk mwkVar = (mwk) wdg.A(n7qVar, rre.k);
                        mwk b = n7qVar.b();
                        mwk E = gdg.E(n7qVar);
                        Object invoke = mwkVar != null ? s8iVar.invoke(mwkVar) : null;
                        Object invoke2 = s8iVar.invoke(b);
                        Object invoke3 = E != null ? s8iVar.invoke(E) : null;
                        LinkedHashMap linkedHashMap = l1gVar.d;
                        b.getClass();
                        List w = xz0.w(new mwk[]{mwkVar, b, E});
                        zwk zwkVar = l1gVar.e;
                        eml emlVar2 = (zwkVar == null || (xdrVar = zwkVar.e) == null) ? null : (eml) xdrVar.getValue();
                        Set keySet = linkedHashMap.keySet();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : keySet) {
                            Object obj3 = invoke3;
                            eml emlVar3 = emlVar2;
                            if (!((ArrayList) w).contains(obj2)) {
                                arrayList.add(obj2);
                            }
                            invoke3 = obj3;
                            emlVar2 = emlVar3;
                        }
                        Object obj4 = invoke3;
                        eml emlVar4 = emlVar2;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj5 : w) {
                            ArrayList arrayList3 = arrayList;
                            if (!keySet.contains(obj5)) {
                                arrayList2.add(obj5);
                            }
                            arrayList = arrayList3;
                        }
                        ArrayList arrayList4 = arrayList;
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            mwk mwkVar2 = (mwk) next;
                            kll kllVar = l1gVar.a;
                            Iterator it2 = it;
                            mm6 mm6Var = l1gVar.c;
                            if (emlVar4 == null || !Intrinsics.d(mwkVar2, b)) {
                                nm6Var2 = nm6Var4;
                                eilVar = eilVar2;
                                emlVar = null;
                            } else {
                                nm6Var2 = nm6Var4;
                                eilVar = eilVar2;
                                emlVar = emlVar4;
                            }
                            linkedHashMap.put(next, new zwk(kllVar, mwkVar2, mm6Var, emlVar));
                            it = it2;
                            nm6Var4 = nm6Var2;
                            eilVar2 = eilVar;
                        }
                        nm6 nm6Var5 = nm6Var4;
                        eil eilVar3 = eilVar2;
                        Iterator it3 = arrayList4.iterator();
                        while (it3.hasNext()) {
                            Object remove = linkedHashMap.remove(it3.next());
                            if (remove != null) {
                                ((zwk) remove).f.a();
                            }
                        }
                        l1gVar.e = (zwk) linkedHashMap.get(b);
                        nm6Var = nm6Var5;
                        Q = zsd.Q(l1gVar.b(mwkVar), l1gVar.b(b), l1gVar.b(E), new bil(invoke, eilVar3, invoke2, obj4, n7qVar, null));
                        this.l = null;
                        this.m = null;
                        this.k = 1;
                        if (zsd.e0(rjcVar2, Q, this) == nm6Var) {
                            return nm6Var;
                        }
                        return Unit.a;
                    }
                    l1gVar.a();
                    Q = new fs(15, vml.a);
                }
                nm6Var = nm6Var4;
                this.l = null;
                this.m = null;
                this.k = 1;
                if (zsd.e0(rjcVar2, Q, this) == nm6Var) {
                }
                return Unit.a;
        }
    }
}
