package ru.yandex.taxi.logistics.sdk.management.deliveries;

import defpackage.nr50;
import defpackage.ny61;
import defpackage.or50;
import defpackage.pr50;
import defpackage.uct0;
import defpackage.vct0;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DeliveriesEventsSource$getBackendDeliveriesEventsFlow$$inlined$map$1$2$1 deliveriesEventsSource$getBackendDeliveriesEventsFlow$$inlined$map$1$2$1;
        int i;
        Object uct0Var;
        if (continuation instanceof DeliveriesEventsSource$getBackendDeliveriesEventsFlow$$inlined$map$1$2$1) {
            deliveriesEventsSource$getBackendDeliveriesEventsFlow$$inlined$map$1$2$1 = (DeliveriesEventsSource$getBackendDeliveriesEventsFlow$$inlined$map$1$2$1) continuation;
            int i2 = deliveriesEventsSource$getBackendDeliveriesEventsFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveriesEventsSource$getBackendDeliveriesEventsFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = deliveriesEventsSource$getBackendDeliveriesEventsFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveriesEventsSource$getBackendDeliveriesEventsFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    pr50 pr50Var = (pr50) obj;
                    if (pr50Var instanceof or50) {
                        uct0Var = new vct0(((or50) pr50Var).a);
                    } else {
                        if (!(pr50Var instanceof nr50)) {
                            w511.b();
                            return null;
                        }
                        uct0Var = new uct0(((nr50) pr50Var).a);
                    }
                    deliveriesEventsSource$getBackendDeliveriesEventsFlow$$inlined$map$1$2$1.L$0 = null;
                    deliveriesEventsSource$getBackendDeliveriesEventsFlow$$inlined$map$1$2$1.L$1 = null;
                    deliveriesEventsSource$getBackendDeliveriesEventsFlow$$inlined$map$1$2$1.L$2 = null;
                    deliveriesEventsSource$getBackendDeliveriesEventsFlow$$inlined$map$1$2$1.L$3 = null;
                    deliveriesEventsSource$getBackendDeliveriesEventsFlow$$inlined$map$1$2$1.I$0 = 0;
                    deliveriesEventsSource$getBackendDeliveriesEventsFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(uct0Var, deliveriesEventsSource$getBackendDeliveriesEventsFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        deliveriesEventsSource$getBackendDeliveriesEventsFlow$$inlined$map$1$2$1 = new DeliveriesEventsSource$getBackendDeliveriesEventsFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = deliveriesEventsSource$getBackendDeliveriesEventsFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveriesEventsSource$getBackendDeliveriesEventsFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
