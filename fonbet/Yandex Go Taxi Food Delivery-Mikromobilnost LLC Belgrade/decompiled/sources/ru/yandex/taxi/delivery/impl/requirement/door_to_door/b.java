package ru.yandex.taxi.delivery.impl.requirement.door_to_door;

import defpackage.k3i;
import defpackage.mth;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class b implements tpr {
    public final /* synthetic */ mth a;
    public final /* synthetic */ k3i b;

    public b(mth mthVar, k3i k3iVar) {
        this.a = mthVar;
        this.b = k3iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        DeliveryD2dRequirementInteractorImpl$isAvailableFlow$$inlined$map$1$1 deliveryD2dRequirementInteractorImpl$isAvailableFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof DeliveryD2dRequirementInteractorImpl$isAvailableFlow$$inlined$map$1$1) {
            deliveryD2dRequirementInteractorImpl$isAvailableFlow$$inlined$map$1$1 = (DeliveryD2dRequirementInteractorImpl$isAvailableFlow$$inlined$map$1$1) continuation;
            int i2 = deliveryD2dRequirementInteractorImpl$isAvailableFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryD2dRequirementInteractorImpl$isAvailableFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deliveryD2dRequirementInteractorImpl$isAvailableFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryD2dRequirementInteractorImpl$isAvailableFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b);
                    deliveryD2dRequirementInteractorImpl$isAvailableFlow$$inlined$map$1$1.L$0 = null;
                    deliveryD2dRequirementInteractorImpl$isAvailableFlow$$inlined$map$1$1.L$1 = null;
                    deliveryD2dRequirementInteractorImpl$isAvailableFlow$$inlined$map$1$1.L$2 = null;
                    deliveryD2dRequirementInteractorImpl$isAvailableFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, deliveryD2dRequirementInteractorImpl$isAvailableFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        deliveryD2dRequirementInteractorImpl$isAvailableFlow$$inlined$map$1$1 = new DeliveryD2dRequirementInteractorImpl$isAvailableFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = deliveryD2dRequirementInteractorImpl$isAvailableFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryD2dRequirementInteractorImpl$isAvailableFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
