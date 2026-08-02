package ru.yandex.taxi.logistics.sdk.delivery.state;

import defpackage.a7i;
import defpackage.jw40;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.x6i;
import defpackage.z6i;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class g implements vpr {
    public final /* synthetic */ vpr a;

    public g(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DeliveryStateAlertsInteractor$startSubscription$1$invokeSuspend$$inlined$mapNotNull$1$2$1 deliveryStateAlertsInteractor$startSubscription$1$invokeSuspend$$inlined$mapNotNull$1$2$1;
        int i;
        if (continuation instanceof DeliveryStateAlertsInteractor$startSubscription$1$invokeSuspend$$inlined$mapNotNull$1$2$1) {
            deliveryStateAlertsInteractor$startSubscription$1$invokeSuspend$$inlined$mapNotNull$1$2$1 = (DeliveryStateAlertsInteractor$startSubscription$1$invokeSuspend$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = deliveryStateAlertsInteractor$startSubscription$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryStateAlertsInteractor$startSubscription$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = deliveryStateAlertsInteractor$startSubscription$1$invokeSuspend$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryStateAlertsInteractor$startSubscription$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    a7i a7iVar = (a7i) obj;
                    jw40 jw40Var = a7iVar instanceof x6i ? ((x6i) a7iVar).a : a7iVar instanceof z6i ? ((z6i) a7iVar).a : null;
                    if (jw40Var != null) {
                        deliveryStateAlertsInteractor$startSubscription$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$0 = null;
                        deliveryStateAlertsInteractor$startSubscription$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$1 = null;
                        deliveryStateAlertsInteractor$startSubscription$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$2 = null;
                        deliveryStateAlertsInteractor$startSubscription$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$3 = null;
                        deliveryStateAlertsInteractor$startSubscription$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$4 = null;
                        deliveryStateAlertsInteractor$startSubscription$1$invokeSuspend$$inlined$mapNotNull$1$2$1.I$0 = 0;
                        deliveryStateAlertsInteractor$startSubscription$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(jw40Var, deliveryStateAlertsInteractor$startSubscription$1$invokeSuspend$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
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
        deliveryStateAlertsInteractor$startSubscription$1$invokeSuspend$$inlined$mapNotNull$1$2$1 = new DeliveryStateAlertsInteractor$startSubscription$1$invokeSuspend$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = deliveryStateAlertsInteractor$startSubscription$1$invokeSuspend$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryStateAlertsInteractor$startSubscription$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
