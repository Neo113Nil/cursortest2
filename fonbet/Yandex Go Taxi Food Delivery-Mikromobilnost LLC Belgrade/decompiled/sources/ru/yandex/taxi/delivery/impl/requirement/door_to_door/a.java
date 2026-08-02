package ru.yandex.taxi.delivery.impl.requirement.door_to_door;

import defpackage.fnx0;
import defpackage.k3i;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar, k3i k3iVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DeliveryD2dRequirementInteractorImpl$isAvailableFlow$$inlined$map$1$2$1 deliveryD2dRequirementInteractorImpl$isAvailableFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof DeliveryD2dRequirementInteractorImpl$isAvailableFlow$$inlined$map$1$2$1) {
            deliveryD2dRequirementInteractorImpl$isAvailableFlow$$inlined$map$1$2$1 = (DeliveryD2dRequirementInteractorImpl$isAvailableFlow$$inlined$map$1$2$1) continuation;
            int i2 = deliveryD2dRequirementInteractorImpl$isAvailableFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryD2dRequirementInteractorImpl$isAvailableFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = deliveryD2dRequirementInteractorImpl$isAvailableFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryD2dRequirementInteractorImpl$isAvailableFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Boolean valueOf = Boolean.valueOf(k3i.a(((fnx0) obj).c));
                    deliveryD2dRequirementInteractorImpl$isAvailableFlow$$inlined$map$1$2$1.L$0 = null;
                    deliveryD2dRequirementInteractorImpl$isAvailableFlow$$inlined$map$1$2$1.L$1 = null;
                    deliveryD2dRequirementInteractorImpl$isAvailableFlow$$inlined$map$1$2$1.L$2 = null;
                    deliveryD2dRequirementInteractorImpl$isAvailableFlow$$inlined$map$1$2$1.L$3 = null;
                    deliveryD2dRequirementInteractorImpl$isAvailableFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(valueOf, deliveryD2dRequirementInteractorImpl$isAvailableFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        deliveryD2dRequirementInteractorImpl$isAvailableFlow$$inlined$map$1$2$1 = new DeliveryD2dRequirementInteractorImpl$isAvailableFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = deliveryD2dRequirementInteractorImpl$isAvailableFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryD2dRequirementInteractorImpl$isAvailableFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
