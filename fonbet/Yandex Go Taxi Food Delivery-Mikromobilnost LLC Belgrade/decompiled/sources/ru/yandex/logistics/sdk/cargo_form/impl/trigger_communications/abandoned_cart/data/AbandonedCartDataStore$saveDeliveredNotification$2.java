package ru.yandex.logistics.sdk.cargo_form.impl.trigger_communications.abandoned_cart.data;

import com.squareup.moshi.JsonAdapter;
import defpackage.ez40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.logistics.sdk.cargo_form.impl.trigger_communications.abandoned_cart.data.model.AbandonedCartDeliveredNotificationDto;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lez40;", "preferences", "Lzy11;", "<anonymous>", "(Lez40;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.trigger_communications.abandoned_cart.data.AbandonedCartDataStore$saveDeliveredNotification$2", f = "AbandonedCartDataStore.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class AbandonedCartDataStore$saveDeliveredNotification$2 extends SuspendLambda implements wls {
    final /* synthetic */ AbandonedCartDeliveredNotificationDto $notification;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbandonedCartDataStore$saveDeliveredNotification$2(a aVar, AbandonedCartDeliveredNotificationDto abandonedCartDeliveredNotificationDto, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$notification = abandonedCartDeliveredNotificationDto;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AbandonedCartDataStore$saveDeliveredNotification$2 abandonedCartDataStore$saveDeliveredNotification$2 = new AbandonedCartDataStore$saveDeliveredNotification$2(this.this$0, this.$notification, continuation);
        abandonedCartDataStore$saveDeliveredNotification$2.L$0 = obj;
        return abandonedCartDataStore$saveDeliveredNotification$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        AbandonedCartDataStore$saveDeliveredNotification$2 abandonedCartDataStore$saveDeliveredNotification$2 = (AbandonedCartDataStore$saveDeliveredNotification$2) create((ez40) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        abandonedCartDataStore$saveDeliveredNotification$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ez40 ez40Var = (ez40) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ez40Var.g(a.e, ((JsonAdapter) this.this$0.c.getValue()).toJson(this.$notification));
        return zy11.a;
    }
}
