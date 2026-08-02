package ru.yandex.taxi.delivery.pin;

import defpackage.eji;
import defpackage.fji;
import defpackage.fnx0;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.tariffs.model.DeliveryPinType;

/* loaded from: classes5.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ k b;

    public c(vpr vprVar, k kVar) {
        this.a = vprVar;
        this.b = kVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00dd, code lost:
    
        if (r10.emit(r2, r0) != r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DeliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1 deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        vpr vprVar;
        fnx0 fnx0Var;
        Object d;
        fji fjiVar;
        if (continuation instanceof DeliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1) {
            deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1 = (DeliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1) continuation;
            int i2 = deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1.label;
                k kVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    fnx0 fnx0Var2 = (fnx0) obj;
                    pex0 pex0Var = fnx0Var2.c;
                    DeliveryPinType deliveryPinType = DeliveryPinType.MAP_SOURCE;
                    deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1.L$0 = null;
                    deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1.L$1 = null;
                    deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1.L$2 = null;
                    deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1.L$3 = null;
                    vpr vprVar2 = this.a;
                    deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1.L$4 = vprVar2;
                    deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1.L$5 = null;
                    deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1.L$6 = fnx0Var2;
                    deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1.label = 1;
                    obj2 = kVar.d(pex0Var, deliveryPinType, deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1);
                    if (obj2 != coroutineSingletons) {
                        vprVar = vprVar2;
                        fnx0Var = fnx0Var2;
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    fnx0Var = (fnx0) deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1.L$6;
                    vprVar = (vpr) deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1.L$4;
                    kotlin.b.b(obj2);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    fjiVar = (fji) deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1.L$7;
                    vprVar = (vpr) deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1.L$4;
                    kotlin.b.b(obj2);
                    fji fjiVar2 = (fji) obj2;
                    eji ejiVar = (fjiVar == null || fjiVar2 != null) ? new eji(fjiVar, fjiVar2) : null;
                    deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1.L$0 = null;
                    deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1.L$1 = null;
                    deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1.L$2 = null;
                    deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1.L$3 = null;
                    deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1.L$4 = null;
                    deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1.L$5 = null;
                    deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1.L$6 = null;
                    deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1.L$7 = null;
                    deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1.label = 3;
                }
                fji fjiVar3 = (fji) obj2;
                pex0 pex0Var2 = fnx0Var.c;
                DeliveryPinType deliveryPinType2 = DeliveryPinType.MAP_DESTINATION;
                deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1.L$0 = null;
                deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1.L$1 = null;
                deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1.L$2 = null;
                deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1.L$3 = null;
                deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1.L$4 = vprVar;
                deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1.L$5 = null;
                deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1.L$6 = null;
                deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1.L$7 = fjiVar3;
                deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1.label = 2;
                d = kVar.d(pex0Var2, deliveryPinType2, deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1);
                if (d != coroutineSingletons) {
                    obj2 = d;
                    fjiVar = fjiVar3;
                    fji fjiVar22 = (fji) obj2;
                    if (fjiVar == null) {
                    }
                    deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1.L$0 = null;
                    deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1.L$1 = null;
                    deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1.L$2 = null;
                    deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1.L$3 = null;
                    deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1.L$4 = null;
                    deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1.L$5 = null;
                    deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1.L$6 = null;
                    deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1.L$7 = null;
                    deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1.label = 3;
                }
                return coroutineSingletons;
            }
        }
        deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1 = new DeliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1.label;
        k kVar2 = this.b;
        if (i != 0) {
        }
        fji fjiVar32 = (fji) obj22;
        pex0 pex0Var22 = fnx0Var.c;
        DeliveryPinType deliveryPinType22 = DeliveryPinType.MAP_DESTINATION;
        deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1.L$0 = null;
        deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1.L$1 = null;
        deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1.L$2 = null;
        deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1.L$3 = null;
        deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1.L$4 = vprVar;
        deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1.L$5 = null;
        deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1.L$6 = null;
        deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1.L$7 = fjiVar32;
        deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1.label = 2;
        d = kVar2.d(pex0Var22, deliveryPinType22, deliveryPinInteractor$deliveryMapPinFlow$$inlined$map$1$2$1);
        if (d != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
