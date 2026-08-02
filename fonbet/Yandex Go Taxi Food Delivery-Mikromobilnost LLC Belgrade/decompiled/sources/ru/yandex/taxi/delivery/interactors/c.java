package ru.yandex.taxi.delivery.interactors;

import defpackage.b580;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.omi;
import defpackage.vpr;
import defpackage.wjl0;
import defpackage.x8;
import defpackage.ycc;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ e c;

    public c(vpr vprVar, ArrayList arrayList, e eVar) {
        this.a = vprVar;
        this.b = arrayList;
        this.c = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DeliveryEffectsInteractorImpl$observeRequirementSelectionByRules$$inlined$map$1$2$1 deliveryEffectsInteractorImpl$observeRequirementSelectionByRules$$inlined$map$1$2$1;
        int i;
        Object obj2;
        if (continuation instanceof DeliveryEffectsInteractorImpl$observeRequirementSelectionByRules$$inlined$map$1$2$1) {
            deliveryEffectsInteractorImpl$observeRequirementSelectionByRules$$inlined$map$1$2$1 = (DeliveryEffectsInteractorImpl$observeRequirementSelectionByRules$$inlined$map$1$2$1) continuation;
            int i2 = deliveryEffectsInteractorImpl$observeRequirementSelectionByRules$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryEffectsInteractorImpl$observeRequirementSelectionByRules$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = deliveryEffectsInteractorImpl$observeRequirementSelectionByRules$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryEffectsInteractorImpl$observeRequirementSelectionByRules$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = this.b.iterator();
                    while (it.hasNext()) {
                        wjl0 wjl0Var = (wjl0) it.next();
                        e eVar = this.c;
                        Iterator it2 = ((x8) eVar.a).d.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it2.next();
                            if (jl40.l(((b580) obj2).a, wjl0Var.a.b)) {
                                break;
                            }
                        }
                        Object obj4 = wjl0Var.a.c;
                        eVar.c.getClass();
                        if (omi.a((b580) obj2, obj4)) {
                            ycc.r(wjl0Var.b, arrayList);
                        }
                    }
                    deliveryEffectsInteractorImpl$observeRequirementSelectionByRules$$inlined$map$1$2$1.L$0 = null;
                    deliveryEffectsInteractorImpl$observeRequirementSelectionByRules$$inlined$map$1$2$1.L$1 = null;
                    deliveryEffectsInteractorImpl$observeRequirementSelectionByRules$$inlined$map$1$2$1.L$2 = null;
                    deliveryEffectsInteractorImpl$observeRequirementSelectionByRules$$inlined$map$1$2$1.L$3 = null;
                    deliveryEffectsInteractorImpl$observeRequirementSelectionByRules$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(arrayList, deliveryEffectsInteractorImpl$observeRequirementSelectionByRules$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                }
                return zy11.a;
            }
        }
        deliveryEffectsInteractorImpl$observeRequirementSelectionByRules$$inlined$map$1$2$1 = new DeliveryEffectsInteractorImpl$observeRequirementSelectionByRules$$inlined$map$1$2$1(this, continuation);
        Object obj32 = deliveryEffectsInteractorImpl$observeRequirementSelectionByRules$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryEffectsInteractorImpl$observeRequirementSelectionByRules$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
