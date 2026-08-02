package ru.yandex.taxi.delivery.pin;

import defpackage.fnx0;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.tariffs.model.DeliveryPinType;

/* loaded from: classes5.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ k b;

    public e(vpr vprVar, k kVar) {
        this.a = vprVar;
        this.b = kVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008a, code lost:
    
        if (r6.emit(r8, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DeliveryPinInteractor$deliveryMapSourcePinFlow$$inlined$map$1$2$1 deliveryPinInteractor$deliveryMapSourcePinFlow$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        if (continuation instanceof DeliveryPinInteractor$deliveryMapSourcePinFlow$$inlined$map$1$2$1) {
            deliveryPinInteractor$deliveryMapSourcePinFlow$$inlined$map$1$2$1 = (DeliveryPinInteractor$deliveryMapSourcePinFlow$$inlined$map$1$2$1) continuation;
            int i2 = deliveryPinInteractor$deliveryMapSourcePinFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryPinInteractor$deliveryMapSourcePinFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = deliveryPinInteractor$deliveryMapSourcePinFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryPinInteractor$deliveryMapSourcePinFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    pex0 pex0Var = ((fnx0) obj).c;
                    DeliveryPinType deliveryPinType = DeliveryPinType.MAP_SOURCE;
                    deliveryPinInteractor$deliveryMapSourcePinFlow$$inlined$map$1$2$1.L$0 = null;
                    deliveryPinInteractor$deliveryMapSourcePinFlow$$inlined$map$1$2$1.L$1 = null;
                    deliveryPinInteractor$deliveryMapSourcePinFlow$$inlined$map$1$2$1.L$2 = null;
                    deliveryPinInteractor$deliveryMapSourcePinFlow$$inlined$map$1$2$1.L$3 = null;
                    vpr vprVar2 = this.a;
                    deliveryPinInteractor$deliveryMapSourcePinFlow$$inlined$map$1$2$1.L$4 = vprVar2;
                    deliveryPinInteractor$deliveryMapSourcePinFlow$$inlined$map$1$2$1.L$5 = null;
                    deliveryPinInteractor$deliveryMapSourcePinFlow$$inlined$map$1$2$1.L$6 = null;
                    deliveryPinInteractor$deliveryMapSourcePinFlow$$inlined$map$1$2$1.label = 1;
                    obj2 = this.b.d(pex0Var, deliveryPinType, deliveryPinInteractor$deliveryMapSourcePinFlow$$inlined$map$1$2$1);
                    if (obj2 != coroutineSingletons) {
                        vprVar = vprVar2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11.a;
                }
                vprVar = (vpr) deliveryPinInteractor$deliveryMapSourcePinFlow$$inlined$map$1$2$1.L$4;
                kotlin.b.b(obj2);
                deliveryPinInteractor$deliveryMapSourcePinFlow$$inlined$map$1$2$1.L$0 = null;
                deliveryPinInteractor$deliveryMapSourcePinFlow$$inlined$map$1$2$1.L$1 = null;
                deliveryPinInteractor$deliveryMapSourcePinFlow$$inlined$map$1$2$1.L$2 = null;
                deliveryPinInteractor$deliveryMapSourcePinFlow$$inlined$map$1$2$1.L$3 = null;
                deliveryPinInteractor$deliveryMapSourcePinFlow$$inlined$map$1$2$1.L$4 = null;
                deliveryPinInteractor$deliveryMapSourcePinFlow$$inlined$map$1$2$1.L$5 = null;
                deliveryPinInteractor$deliveryMapSourcePinFlow$$inlined$map$1$2$1.L$6 = null;
                deliveryPinInteractor$deliveryMapSourcePinFlow$$inlined$map$1$2$1.label = 2;
            }
        }
        deliveryPinInteractor$deliveryMapSourcePinFlow$$inlined$map$1$2$1 = new DeliveryPinInteractor$deliveryMapSourcePinFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = deliveryPinInteractor$deliveryMapSourcePinFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryPinInteractor$deliveryMapSourcePinFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        deliveryPinInteractor$deliveryMapSourcePinFlow$$inlined$map$1$2$1.L$0 = null;
        deliveryPinInteractor$deliveryMapSourcePinFlow$$inlined$map$1$2$1.L$1 = null;
        deliveryPinInteractor$deliveryMapSourcePinFlow$$inlined$map$1$2$1.L$2 = null;
        deliveryPinInteractor$deliveryMapSourcePinFlow$$inlined$map$1$2$1.L$3 = null;
        deliveryPinInteractor$deliveryMapSourcePinFlow$$inlined$map$1$2$1.L$4 = null;
        deliveryPinInteractor$deliveryMapSourcePinFlow$$inlined$map$1$2$1.L$5 = null;
        deliveryPinInteractor$deliveryMapSourcePinFlow$$inlined$map$1$2$1.L$6 = null;
        deliveryPinInteractor$deliveryMapSourcePinFlow$$inlined$map$1$2$1.label = 2;
    }
}
