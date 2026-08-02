package ru.yandex.taxi.logistics.sdk.delivery.edit;

import defpackage.bth;
import defpackage.cth;
import defpackage.dth;
import defpackage.jl40;
import defpackage.lth;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.x6i;
import defpackage.y6i;
import defpackage.z6i;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ String b;

    public c(vpr vprVar, String str) {
        this.a = vprVar;
        this.b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DeliveryEditTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1 deliveryEditTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1;
        int i;
        Object obj2;
        if (continuation instanceof DeliveryEditTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1) {
            deliveryEditTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1 = (DeliveryEditTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = deliveryEditTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryEditTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = deliveryEditTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryEditTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    lth lthVar = (lth) obj;
                    boolean z = lthVar instanceof cth;
                    String str = this.b;
                    if (z) {
                        cth cthVar = (cth) lthVar;
                        if (jl40.l(cthVar.b, str)) {
                            obj2 = new z6i(cthVar.d, str, cthVar.c);
                            if (obj2 != null) {
                                deliveryEditTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.L$0 = null;
                                deliveryEditTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.L$1 = null;
                                deliveryEditTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.L$2 = null;
                                deliveryEditTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.L$3 = null;
                                deliveryEditTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.L$4 = null;
                                deliveryEditTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.I$0 = 0;
                                deliveryEditTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.label = 1;
                                if (this.a.emit(obj2, deliveryEditTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                        }
                    }
                    if (lthVar instanceof bth) {
                        bth bthVar = (bth) lthVar;
                        if (jl40.l(bthVar.b, str)) {
                            obj2 = new x6i(bthVar.d, str, bthVar.c);
                            if (obj2 != null) {
                            }
                        }
                    }
                    if (lthVar instanceof dth) {
                        dth dthVar = (dth) lthVar;
                        if (jl40.l(dthVar.b, str)) {
                            obj2 = new y6i(str, dthVar.c);
                            if (obj2 != null) {
                            }
                        }
                    }
                    obj2 = null;
                    if (obj2 != null) {
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
        deliveryEditTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1 = new DeliveryEditTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj32 = deliveryEditTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryEditTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
