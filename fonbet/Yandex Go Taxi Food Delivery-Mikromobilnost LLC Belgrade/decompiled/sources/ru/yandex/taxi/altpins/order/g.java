package ru.yandex.taxi.altpins.order;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes5.dex */
public final class g implements vpr {
    public final /* synthetic */ vpr a;

    public g(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AltpinOrdersDeactivateProcessorImpl$handleActiveOrders$lambda$0$$inlined$filter$1$2$1 altpinOrdersDeactivateProcessorImpl$handleActiveOrders$lambda$0$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof AltpinOrdersDeactivateProcessorImpl$handleActiveOrders$lambda$0$$inlined$filter$1$2$1) {
            altpinOrdersDeactivateProcessorImpl$handleActiveOrders$lambda$0$$inlined$filter$1$2$1 = (AltpinOrdersDeactivateProcessorImpl$handleActiveOrders$lambda$0$$inlined$filter$1$2$1) continuation;
            int i2 = altpinOrdersDeactivateProcessorImpl$handleActiveOrders$lambda$0$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                altpinOrdersDeactivateProcessorImpl$handleActiveOrders$lambda$0$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = altpinOrdersDeactivateProcessorImpl$handleActiveOrders$lambda$0$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = altpinOrdersDeactivateProcessorImpl$handleActiveOrders$lambda$0$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    vpr vprVar = this.a;
                    TaxiOrder taxiOrder = (TaxiOrder) obj;
                    OrderStatusInfo.AlternativeDestination alternativeDestination = taxiOrder.V().j0;
                    int i3 = alternativeDestination != null ? alternativeDestination.e : 0;
                    if ((alternativeDestination != null ? alternativeDestination.f : null) != null && taxiOrder.h.b == DriveState.COMPLETE && i3 > 0) {
                        altpinOrdersDeactivateProcessorImpl$handleActiveOrders$lambda$0$$inlined$filter$1$2$1.L$0 = null;
                        altpinOrdersDeactivateProcessorImpl$handleActiveOrders$lambda$0$$inlined$filter$1$2$1.L$1 = null;
                        altpinOrdersDeactivateProcessorImpl$handleActiveOrders$lambda$0$$inlined$filter$1$2$1.L$2 = null;
                        altpinOrdersDeactivateProcessorImpl$handleActiveOrders$lambda$0$$inlined$filter$1$2$1.L$3 = null;
                        altpinOrdersDeactivateProcessorImpl$handleActiveOrders$lambda$0$$inlined$filter$1$2$1.label = 1;
                        if (vprVar.emit(obj, altpinOrdersDeactivateProcessorImpl$handleActiveOrders$lambda$0$$inlined$filter$1$2$1) == coroutineSingletons) {
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
        altpinOrdersDeactivateProcessorImpl$handleActiveOrders$lambda$0$$inlined$filter$1$2$1 = new AltpinOrdersDeactivateProcessorImpl$handleActiveOrders$lambda$0$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = altpinOrdersDeactivateProcessorImpl$handleActiveOrders$lambda$0$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = altpinOrdersDeactivateProcessorImpl$handleActiveOrders$lambda$0$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
