package ru.yandex.taxi.logistics.sdk.pay_on_delivery;

import defpackage.eth;
import defpackage.gth;
import defpackage.jl40;
import defpackage.lth;
import defpackage.ny61;
import defpackage.shi;
import defpackage.thi;
import defpackage.uhi;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ String b;

    public b(vpr vprVar, String str) {
        this.a = vprVar;
        this.b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DeliveryPayNowTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1 deliveryPayNowTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1;
        int i;
        uhi uhiVar;
        if (continuation instanceof DeliveryPayNowTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1) {
            deliveryPayNowTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1 = (DeliveryPayNowTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = deliveryPayNowTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryPayNowTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = deliveryPayNowTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryPayNowTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    lth lthVar = (lth) obj;
                    boolean z = lthVar instanceof gth;
                    String str = this.b;
                    if (z && jl40.l(((gth) lthVar).b, str)) {
                        uhiVar = thi.a;
                    } else {
                        if (lthVar instanceof eth) {
                            eth ethVar = (eth) lthVar;
                            if (jl40.l(ethVar.b, str)) {
                                uhiVar = new shi(ethVar.d);
                            }
                        }
                        uhiVar = null;
                    }
                    if (uhiVar != null) {
                        deliveryPayNowTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.L$0 = null;
                        deliveryPayNowTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.L$1 = null;
                        deliveryPayNowTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.L$2 = null;
                        deliveryPayNowTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.L$3 = null;
                        deliveryPayNowTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.L$4 = null;
                        deliveryPayNowTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.I$0 = 0;
                        deliveryPayNowTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(uhiVar, deliveryPayNowTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
        deliveryPayNowTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1 = new DeliveryPayNowTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = deliveryPayNowTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryPayNowTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
