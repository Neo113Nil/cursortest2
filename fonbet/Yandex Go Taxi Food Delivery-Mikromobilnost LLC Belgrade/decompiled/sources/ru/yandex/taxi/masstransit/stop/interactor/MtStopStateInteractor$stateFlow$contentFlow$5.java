package ru.yandex.taxi.masstransit.stop.interactor;

import defpackage.b140;
import defpackage.c140;
import defpackage.co40;
import defpackage.d140;
import defpackage.e140;
import defpackage.f140;
import defpackage.f69;
import defpackage.g140;
import defpackage.gd30;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rsn;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lrsn;", "Lg140;", "emitHolder", "Lzy11;", "<anonymous>", "(Lrsn;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.stop.interactor.MtStopStateInteractor$stateFlow$contentFlow$5", f = "MtStopStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtStopStateInteractor$stateFlow$contentFlow$5 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtStopStateInteractor$stateFlow$contentFlow$5(Continuation continuation, g gVar) {
        super(2, continuation);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MtStopStateInteractor$stateFlow$contentFlow$5 mtStopStateInteractor$stateFlow$contentFlow$5 = new MtStopStateInteractor$stateFlow$contentFlow$5(continuation, this.this$0);
        mtStopStateInteractor$stateFlow$contentFlow$5.L$0 = obj;
        return mtStopStateInteractor$stateFlow$contentFlow$5;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        MtStopStateInteractor$stateFlow$contentFlow$5 mtStopStateInteractor$stateFlow$contentFlow$5 = (MtStopStateInteractor$stateFlow$contentFlow$5) create((rsn) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        mtStopStateInteractor$stateFlow$contentFlow$5.invokeSuspend(zy11Var);
        return zy11Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ?? r8;
        Object obj2;
        f69 f69Var;
        Object obj3;
        rsn rsnVar = (rsn) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        EmptyList emptyList = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        g gVar = this.this$0;
        g140 g140Var = (g140) rsnVar.a;
        g140 g140Var2 = (g140) rsnVar.b;
        gVar.getClass();
        EmptyList emptyList2 = EmptyList.a;
        c140 c140Var = c140.a;
        e140 e140Var = e140.a;
        if (g140Var == null || (f69Var = g140Var.c) == null) {
            r8 = 0;
        } else {
            List list = f69Var.a;
            r8 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                f140 f140Var = ((gd30) it.next()).b;
                if (f140Var == null) {
                    obj3 = null;
                } else if (f140Var instanceof d140) {
                    obj3 = "route_from";
                } else if (f140Var.equals(e140Var)) {
                    obj3 = "route_to";
                } else {
                    if (!f140Var.equals(c140Var)) {
                        w511.b();
                        return null;
                    }
                    obj3 = "refresh";
                }
                if (obj3 != null) {
                    r8.add(obj3);
                }
            }
        }
        if (r8 == 0) {
            r8 = emptyList2;
        }
        f69 f69Var2 = g140Var2.c;
        if (f69Var2 != null) {
            List list2 = f69Var2.a;
            ?? arrayList = new ArrayList();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                f140 f140Var2 = ((gd30) it2.next()).b;
                if (f140Var2 == null) {
                    obj2 = null;
                } else if (f140Var2 instanceof d140) {
                    obj2 = "route_from";
                } else if (f140Var2.equals(e140Var)) {
                    obj2 = "route_to";
                } else {
                    if (!f140Var2.equals(c140Var)) {
                        w511.b();
                        return null;
                    }
                    obj2 = "refresh";
                }
                if (obj2 != null) {
                    arrayList.add(obj2);
                }
            }
            emptyList = arrayList;
        }
        if (emptyList != null) {
            emptyList2 = emptyList;
        }
        if (!r8.equals(emptyList2) && !emptyList2.isEmpty()) {
            b140 b140Var = gVar.a;
            if (!b140Var.b.equals(emptyList2)) {
                b140Var.b = emptyList2;
                co40 co40Var = b140Var.a;
                co40Var.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("button_list", emptyList2);
                co40Var.a.a("StopCard.Buttons.Shown", hashMap, 1, new HashMap());
            }
        }
        return zy11.a;
    }
}
