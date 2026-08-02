package ru.yandex.taxi.logistics.sdk.tracking.impl.data;

import defpackage.ny61;
import defpackage.puh;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;

    public b(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CancelDeliveryRepository$special$$inlined$map$1$2$1 cancelDeliveryRepository$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof CancelDeliveryRepository$special$$inlined$map$1$2$1) {
            cancelDeliveryRepository$special$$inlined$map$1$2$1 = (CancelDeliveryRepository$special$$inlined$map$1$2$1) continuation;
            int i2 = cancelDeliveryRepository$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cancelDeliveryRepository$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = cancelDeliveryRepository$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cancelDeliveryRepository$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    puh puhVar = (puh) obj;
                    Boolean valueOf = Boolean.valueOf(puhVar != null ? puhVar.r : false);
                    cancelDeliveryRepository$special$$inlined$map$1$2$1.L$0 = null;
                    cancelDeliveryRepository$special$$inlined$map$1$2$1.L$1 = null;
                    cancelDeliveryRepository$special$$inlined$map$1$2$1.L$2 = null;
                    cancelDeliveryRepository$special$$inlined$map$1$2$1.L$3 = null;
                    cancelDeliveryRepository$special$$inlined$map$1$2$1.I$0 = 0;
                    cancelDeliveryRepository$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(valueOf, cancelDeliveryRepository$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        cancelDeliveryRepository$special$$inlined$map$1$2$1 = new CancelDeliveryRepository$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = cancelDeliveryRepository$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cancelDeliveryRepository$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
