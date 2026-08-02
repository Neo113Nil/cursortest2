package ru.yandex.taxi.delivery.interactors;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class d implements tpr {
    public final /* synthetic */ kotlinx.coroutines.flow.n a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ e c;

    public d(kotlinx.coroutines.flow.n nVar, ArrayList arrayList, e eVar) {
        this.a = nVar;
        this.b = arrayList;
        this.c = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        DeliveryEffectsInteractorImpl$observeRequirementSelectionByRules$$inlined$map$1$1 deliveryEffectsInteractorImpl$observeRequirementSelectionByRules$$inlined$map$1$1;
        int i;
        if (continuation instanceof DeliveryEffectsInteractorImpl$observeRequirementSelectionByRules$$inlined$map$1$1) {
            deliveryEffectsInteractorImpl$observeRequirementSelectionByRules$$inlined$map$1$1 = (DeliveryEffectsInteractorImpl$observeRequirementSelectionByRules$$inlined$map$1$1) continuation;
            int i2 = deliveryEffectsInteractorImpl$observeRequirementSelectionByRules$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryEffectsInteractorImpl$observeRequirementSelectionByRules$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deliveryEffectsInteractorImpl$observeRequirementSelectionByRules$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryEffectsInteractorImpl$observeRequirementSelectionByRules$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = new c(vprVar, this.b, this.c);
                    deliveryEffectsInteractorImpl$observeRequirementSelectionByRules$$inlined$map$1$1.L$0 = null;
                    deliveryEffectsInteractorImpl$observeRequirementSelectionByRules$$inlined$map$1$1.L$1 = null;
                    deliveryEffectsInteractorImpl$observeRequirementSelectionByRules$$inlined$map$1$1.L$2 = null;
                    deliveryEffectsInteractorImpl$observeRequirementSelectionByRules$$inlined$map$1$1.label = 1;
                    if (this.a.collect(cVar, deliveryEffectsInteractorImpl$observeRequirementSelectionByRules$$inlined$map$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        deliveryEffectsInteractorImpl$observeRequirementSelectionByRules$$inlined$map$1$1 = new DeliveryEffectsInteractorImpl$observeRequirementSelectionByRules$$inlined$map$1$1(this, continuation);
        Object obj2 = deliveryEffectsInteractorImpl$observeRequirementSelectionByRules$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryEffectsInteractorImpl$observeRequirementSelectionByRules$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
