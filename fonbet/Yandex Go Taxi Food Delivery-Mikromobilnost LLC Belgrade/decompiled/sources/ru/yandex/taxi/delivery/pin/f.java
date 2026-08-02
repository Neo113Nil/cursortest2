package ru.yandex.taxi.delivery.pin;

import defpackage.mth;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class f implements tpr {
    public final /* synthetic */ mth a;
    public final /* synthetic */ k b;

    public f(mth mthVar, k kVar) {
        this.a = mthVar;
        this.b = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        DeliveryPinInteractor$deliveryMapSourcePinFlow$$inlined$map$1$1 deliveryPinInteractor$deliveryMapSourcePinFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof DeliveryPinInteractor$deliveryMapSourcePinFlow$$inlined$map$1$1) {
            deliveryPinInteractor$deliveryMapSourcePinFlow$$inlined$map$1$1 = (DeliveryPinInteractor$deliveryMapSourcePinFlow$$inlined$map$1$1) continuation;
            int i2 = deliveryPinInteractor$deliveryMapSourcePinFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryPinInteractor$deliveryMapSourcePinFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deliveryPinInteractor$deliveryMapSourcePinFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryPinInteractor$deliveryMapSourcePinFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e eVar = new e(vprVar, this.b);
                    deliveryPinInteractor$deliveryMapSourcePinFlow$$inlined$map$1$1.L$0 = null;
                    deliveryPinInteractor$deliveryMapSourcePinFlow$$inlined$map$1$1.L$1 = null;
                    deliveryPinInteractor$deliveryMapSourcePinFlow$$inlined$map$1$1.L$2 = null;
                    deliveryPinInteractor$deliveryMapSourcePinFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(eVar, deliveryPinInteractor$deliveryMapSourcePinFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        deliveryPinInteractor$deliveryMapSourcePinFlow$$inlined$map$1$1 = new DeliveryPinInteractor$deliveryMapSourcePinFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = deliveryPinInteractor$deliveryMapSourcePinFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryPinInteractor$deliveryMapSourcePinFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
