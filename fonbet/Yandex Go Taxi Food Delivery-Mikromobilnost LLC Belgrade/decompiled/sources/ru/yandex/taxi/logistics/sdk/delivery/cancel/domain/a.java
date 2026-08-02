package ru.yandex.taxi.logistics.sdk.delivery.cancel.domain;

import defpackage.jl40;
import defpackage.kv7;
import defpackage.lth;
import defpackage.lv7;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.vsh;
import defpackage.xsh;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ String b;

    public a(vpr vprVar, String str) {
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
        CancelDeliveryOnBackendImpl$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1 cancelDeliveryOnBackendImpl$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1;
        int i;
        Object obj2;
        if (continuation instanceof CancelDeliveryOnBackendImpl$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1) {
            cancelDeliveryOnBackendImpl$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1 = (CancelDeliveryOnBackendImpl$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = cancelDeliveryOnBackendImpl$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cancelDeliveryOnBackendImpl$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = cancelDeliveryOnBackendImpl$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cancelDeliveryOnBackendImpl$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    lth lthVar = (lth) obj;
                    boolean z = lthVar instanceof xsh;
                    String str = this.b;
                    if (z && jl40.l(((xsh) lthVar).b, str)) {
                        obj2 = lv7.a;
                    } else {
                        if (lthVar instanceof vsh) {
                            vsh vshVar = (vsh) lthVar;
                            if (jl40.l(vshVar.b, str)) {
                                obj2 = new kv7(vshVar.d);
                            }
                        }
                        obj2 = null;
                    }
                    if (obj2 != null) {
                        cancelDeliveryOnBackendImpl$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.L$0 = null;
                        cancelDeliveryOnBackendImpl$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.L$1 = null;
                        cancelDeliveryOnBackendImpl$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.L$2 = null;
                        cancelDeliveryOnBackendImpl$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.L$3 = null;
                        cancelDeliveryOnBackendImpl$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.L$4 = null;
                        cancelDeliveryOnBackendImpl$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.I$0 = 0;
                        cancelDeliveryOnBackendImpl$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(obj2, cancelDeliveryOnBackendImpl$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
        cancelDeliveryOnBackendImpl$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1 = new CancelDeliveryOnBackendImpl$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj32 = cancelDeliveryOnBackendImpl$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cancelDeliveryOnBackendImpl$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
