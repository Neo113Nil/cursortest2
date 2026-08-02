package ru.yandex.taxi.delivery.extracted_delivery_form.interactors;

import defpackage.ivi;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tei;
import defpackage.vpn;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.delivery.extracted_delivery_form.ui.point.DeliveryPointFocusHolder$FocusTarget;
import ru.yandex.taxi.delivery.extracted_delivery_form.ui.unitedsummary.states.DeliveryShowNotificationState;
import ru.yandex.taxi.delivery.extracted_form_common_data.extra.DeliveryBubblePosition;
import ru.yandex.taxi.delivery.extracted_form_common_data.extra.DeliveryFormStepType;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Livi;", "focusState", "", "", "effects", "Lru/yandex/taxi/delivery/extracted_delivery_form/ui/unitedsummary/states/DeliveryShowNotificationState;", "<anonymous>", "(Livi;Ljava/util/List;)Lru/yandex/taxi/delivery/extracted_delivery_form/ui/unitedsummary/states/DeliveryShowNotificationState;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.delivery.extracted_delivery_form.interactors.DeliveryNotificationInteractor$observeNotificationState$2", f = "DeliveryNotificationInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryNotificationInteractor$observeNotificationState$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryNotificationInteractor$observeNotificationState$2(f fVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = fVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        DeliveryNotificationInteractor$observeNotificationState$2 deliveryNotificationInteractor$observeNotificationState$2 = new DeliveryNotificationInteractor$observeNotificationState$2(this.this$0, (Continuation) obj3);
        deliveryNotificationInteractor$observeNotificationState$2.L$0 = (ivi) obj;
        deliveryNotificationInteractor$observeNotificationState$2.L$1 = (List) obj2;
        return deliveryNotificationInteractor$observeNotificationState$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        ivi iviVar = (ivi) this.L$0;
        List list = (List) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        f fVar = this.this$0;
        DeliveryPointFocusHolder$FocusTarget deliveryPointFocusHolder$FocusTarget = iviVar.b;
        boolean z = iviVar.c;
        int i = iviVar.a;
        fVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof vpn) {
                arrayList.add(obj2);
            }
        }
        vpn vpnVar = (vpn) kotlin.collections.a.R(arrayList);
        DeliveryFormStepType a = fVar.c.a(i).a();
        DeliveryPointFocusHolder$FocusTarget deliveryPointFocusHolder$FocusTarget2 = DeliveryPointFocusHolder$FocusTarget.Apartment;
        if ((deliveryPointFocusHolder$FocusTarget != deliveryPointFocusHolder$FocusTarget2 && deliveryPointFocusHolder$FocusTarget != DeliveryPointFocusHolder$FocusTarget.Floor && deliveryPointFocusHolder$FocusTarget != DeliveryPointFocusHolder$FocusTarget.DoorPhone) || !fVar.f || vpnVar == null || !z) {
            return new DeliveryShowNotificationState(((deliveryPointFocusHolder$FocusTarget == deliveryPointFocusHolder$FocusTarget2 || deliveryPointFocusHolder$FocusTarget == DeliveryPointFocusHolder$FocusTarget.Floor || deliveryPointFocusHolder$FocusTarget == DeliveryPointFocusHolder$FocusTarget.DoorPhone) && fVar.f) ? DeliveryShowNotificationState.ShowState.NOT_SHOWN : DeliveryShowNotificationState.ShowState.SHOWN, null, i, a, fVar.a.b.b, DeliveryBubblePosition.CENTER, false, 66);
        }
        DeliveryBubblePosition deliveryBubblePosition = DeliveryBubblePosition.CENTER;
        int i2 = tei.a[deliveryPointFocusHolder$FocusTarget.ordinal()];
        if (i2 == 1) {
            deliveryBubblePosition = DeliveryBubblePosition.OFFSET_START;
        } else if (i2 == 2) {
            deliveryBubblePosition = DeliveryBubblePosition.OFFSET_END;
        }
        return new DeliveryShowNotificationState(DeliveryShowNotificationState.ShowState.NEED_SHOW, (a != DeliveryFormStepType.SOURCE ? (str = vpnVar.b) != null : (str = vpnVar.a) != null) ? str : "", i, a, deliveryPointFocusHolder$FocusTarget, deliveryBubblePosition, false, 64);
    }
}
