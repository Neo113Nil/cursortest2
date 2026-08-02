package ru.yandex.taxi.masstransit.tickets;

import com.yandex.go.masstransit.design.ui_components.IconNotificationComponent;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.tickets.MtTicketsHostBridgeImpl$showActivationSuccessNotification$1", f = "MtTicketsHostBridgeImpl.kt", l = {47}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtTicketsHostBridgeImpl$showActivationSuccessNotification$1 extends SuspendLambda implements wls {
    final /* synthetic */ IconNotificationComponent $notification;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtTicketsHostBridgeImpl$showActivationSuccessNotification$1(a aVar, IconNotificationComponent iconNotificationComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$notification = iconNotificationComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtTicketsHostBridgeImpl$showActivationSuccessNotification$1(this.this$0, this.$notification, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtTicketsHostBridgeImpl$showActivationSuccessNotification$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.e.showNotification(this.$notification);
            this.label = 1;
            if (kotlinx.coroutines.a.i(6000L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        this.this$0.e.closeNotification(this.$notification);
        return zy11.a;
    }
}
