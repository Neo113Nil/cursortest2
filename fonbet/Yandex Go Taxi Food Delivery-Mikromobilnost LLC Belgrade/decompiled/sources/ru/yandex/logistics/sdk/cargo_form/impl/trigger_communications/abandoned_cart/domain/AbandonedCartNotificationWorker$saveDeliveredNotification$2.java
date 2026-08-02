package ru.yandex.logistics.sdk.cargo_form.impl.trigger_communications.abandoned_cart.domain;

import defpackage.jgz;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.vng;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.yandex.logistics.sdk.cargo_form.impl.trigger_communications.abandoned_cart.data.model.AbandonedCartDeliveredNotificationDto;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.trigger_communications.abandoned_cart.domain.AbandonedCartNotificationWorker$saveDeliveredNotification$2", f = "AbandonedCartNotificationWorker.kt", l = {MSException.ERROR_INVALID_PARAMETER}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class AbandonedCartNotificationWorker$saveDeliveredNotification$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $notificationId;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AbandonedCartNotificationWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbandonedCartNotificationWorker$saveDeliveredNotification$2(AbandonedCartNotificationWorker abandonedCartNotificationWorker, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = abandonedCartNotificationWorker;
        this.$notificationId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AbandonedCartNotificationWorker$saveDeliveredNotification$2(this.this$0, this.$notificationId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AbandonedCartNotificationWorker$saveDeliveredNotification$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                ru.yandex.logistics.sdk.cargo_form.impl.trigger_communications.abandoned_cart.data.a aVar = new ru.yandex.logistics.sdk.cargo_form.impl.trigger_communications.abandoned_cart.data.a(this.this$0.getApplicationContext());
                AbandonedCartDeliveredNotificationDto abandonedCartDeliveredNotificationDto = new AbandonedCartDeliveredNotificationDto(this.$notificationId, vng.I());
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (aVar.b(abandonedCartDeliveredNotificationDto, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
        } catch (Exception e) {
            jgz jgzVar = jgz.a;
            jgz.b("Failed to save delivered notification", e);
        }
        return zy11.a;
    }
}
