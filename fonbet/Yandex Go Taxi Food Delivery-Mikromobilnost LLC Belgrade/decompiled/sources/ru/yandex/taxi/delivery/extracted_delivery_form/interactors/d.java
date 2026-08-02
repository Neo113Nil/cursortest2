package ru.yandex.taxi.delivery.extracted_delivery_form.interactors;

import defpackage.ivi;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.delivery.extracted_delivery_form.ui.point.DeliveryPointFocusHolder$FocusTarget;

/* loaded from: classes5.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;

    public d(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DeliveryNotificationInteractor$observeNotificationState$$inlined$filter$1$2$1 deliveryNotificationInteractor$observeNotificationState$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof DeliveryNotificationInteractor$observeNotificationState$$inlined$filter$1$2$1) {
            deliveryNotificationInteractor$observeNotificationState$$inlined$filter$1$2$1 = (DeliveryNotificationInteractor$observeNotificationState$$inlined$filter$1$2$1) continuation;
            int i2 = deliveryNotificationInteractor$observeNotificationState$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryNotificationInteractor$observeNotificationState$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = deliveryNotificationInteractor$observeNotificationState$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryNotificationInteractor$observeNotificationState$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (((ivi) obj).b != DeliveryPointFocusHolder$FocusTarget.None) {
                        deliveryNotificationInteractor$observeNotificationState$$inlined$filter$1$2$1.L$0 = null;
                        deliveryNotificationInteractor$observeNotificationState$$inlined$filter$1$2$1.L$1 = null;
                        deliveryNotificationInteractor$observeNotificationState$$inlined$filter$1$2$1.L$2 = null;
                        deliveryNotificationInteractor$observeNotificationState$$inlined$filter$1$2$1.L$3 = null;
                        deliveryNotificationInteractor$observeNotificationState$$inlined$filter$1$2$1.label = 1;
                        if (this.a.emit(obj, deliveryNotificationInteractor$observeNotificationState$$inlined$filter$1$2$1) == coroutineSingletons) {
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
        deliveryNotificationInteractor$observeNotificationState$$inlined$filter$1$2$1 = new DeliveryNotificationInteractor$observeNotificationState$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = deliveryNotificationInteractor$observeNotificationState$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryNotificationInteractor$observeNotificationState$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
