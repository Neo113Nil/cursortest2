package ru.yandex.logistics.sdk.cargo_form.impl.trigger_communications.abandoned_cart.data;

import defpackage.j4;
import defpackage.l4;
import defpackage.ny61;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.logistics.sdk.cargo_form.impl.trigger_communications.abandoned_cart.data.model.AbandonedCartDeliveredNotificationDto;

/* loaded from: classes5.dex */
public final class b {
    public final a a;
    public final l4 b;

    public b(a aVar, l4 l4Var) {
        this.a = aVar;
        this.b = l4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        AbandonedCartRepository$getLastDeliveredNotification$1 abandonedCartRepository$getLastDeliveredNotification$1;
        int i;
        AbandonedCartDeliveredNotificationDto abandonedCartDeliveredNotificationDto;
        if (continuationImpl instanceof AbandonedCartRepository$getLastDeliveredNotification$1) {
            abandonedCartRepository$getLastDeliveredNotification$1 = (AbandonedCartRepository$getLastDeliveredNotification$1) continuationImpl;
            int i2 = abandonedCartRepository$getLastDeliveredNotification$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                abandonedCartRepository$getLastDeliveredNotification$1.label = i2 - Integer.MIN_VALUE;
                Object obj = abandonedCartRepository$getLastDeliveredNotification$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = abandonedCartRepository$getLastDeliveredNotification$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    abandonedCartRepository$getLastDeliveredNotification$1.label = 1;
                    obj = this.a.a(abandonedCartRepository$getLastDeliveredNotification$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                abandonedCartDeliveredNotificationDto = (AbandonedCartDeliveredNotificationDto) obj;
                if (abandonedCartDeliveredNotificationDto != null) {
                    return null;
                }
                this.b.getClass();
                return new j4(abandonedCartDeliveredNotificationDto.getId(), abandonedCartDeliveredNotificationDto.getDeliveredTimeMillis());
            }
        }
        abandonedCartRepository$getLastDeliveredNotification$1 = new AbandonedCartRepository$getLastDeliveredNotification$1(this, continuationImpl);
        Object obj2 = abandonedCartRepository$getLastDeliveredNotification$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = abandonedCartRepository$getLastDeliveredNotification$1.label;
        if (i != 0) {
        }
        abandonedCartDeliveredNotificationDto = (AbandonedCartDeliveredNotificationDto) obj2;
        if (abandonedCartDeliveredNotificationDto != null) {
        }
    }
}
