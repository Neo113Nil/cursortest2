package ru.yandex.taxi.delivery.ui.recycler;

import defpackage.bwh;
import defpackage.d1x;
import defpackage.gvi;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qwh;
import defpackage.qz10;
import defpackage.rju;
import defpackage.w511;
import defpackage.wls;
import defpackage.wwb;
import defpackage.zo31;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.delivery.extracted_delivery_form.ui.point.DeliveryPointFocusHolder$FocusTarget;
import ru.yandex.taxi.delivery.extracted_delivery_form.ui.unitedsummary.states.DeliveryShowNotificationState;
import ru.yandex.taxi.delivery.extracted_form_common_data.extra.DeliveryFormStepType;
import ru.yandex.taxi.design.bubble.BubbleTextComponent;
import ru.yandex.taxi.design.bubble.decorator.HintBubbleDecorator$Position;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/yandex/taxi/delivery/extracted_delivery_form/ui/unitedsummary/states/DeliveryShowNotificationState;", ClidProvider.STATE, "Lzy11;", "<anonymous>", "(Lru/yandex/taxi/delivery/extracted_delivery_form/ui/unitedsummary/states/DeliveryShowNotificationState;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.delivery.ui.recycler.DeliveryAddressExtendedViewHolder$subscribeNotificationState$job$1", f = "DeliveryAddressExtendedViewHolder.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryAddressExtendedViewHolder$subscribeNotificationState$job$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryAddressExtendedViewHolder$subscribeNotificationState$job$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DeliveryAddressExtendedViewHolder$subscribeNotificationState$job$1 deliveryAddressExtendedViewHolder$subscribeNotificationState$job$1 = new DeliveryAddressExtendedViewHolder$subscribeNotificationState$job$1(this.this$0, continuation);
        deliveryAddressExtendedViewHolder$subscribeNotificationState$job$1.L$0 = obj;
        return deliveryAddressExtendedViewHolder$subscribeNotificationState$job$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DeliveryAddressExtendedViewHolder$subscribeNotificationState$job$1 deliveryAddressExtendedViewHolder$subscribeNotificationState$job$1 = (DeliveryAddressExtendedViewHolder$subscribeNotificationState$job$1) create((DeliveryShowNotificationState) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        deliveryAddressExtendedViewHolder$subscribeNotificationState$job$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        HintBubbleDecorator$Position hintBubbleDecorator$Position;
        DeliveryShowNotificationState deliveryShowNotificationState = (DeliveryShowNotificationState) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        int i = deliveryShowNotificationState.c;
        DeliveryPointFocusHolder$FocusTarget deliveryPointFocusHolder$FocusTarget = deliveryShowNotificationState.e;
        DeliveryFormStepType deliveryFormStepType = deliveryShowNotificationState.d;
        if (i != this.this$0.F()) {
            this.this$0.d0();
        } else {
            int i2 = bwh.a[deliveryShowNotificationState.a.ordinal()];
            if (i2 == 1) {
                this.this$0.S.a("DeliveryDetailsBubble.Shown", deliveryFormStepType, deliveryPointFocusHolder$FocusTarget, new qz10(12));
                a aVar = this.this$0;
                String str = deliveryShowNotificationState.b;
                int i3 = gvi.a[deliveryShowNotificationState.f.ordinal()];
                if (i3 == 1) {
                    hintBubbleDecorator$Position = HintBubbleDecorator$Position.CENTER;
                } else if (i3 == 2) {
                    hintBubbleDecorator$Position = HintBubbleDecorator$Position.OFFSET_START;
                } else if (i3 == 3) {
                    hintBubbleDecorator$Position = HintBubbleDecorator$Position.OFFSET_END;
                } else {
                    if (i3 != 4) {
                        w511.b();
                        return null;
                    }
                    hintBubbleDecorator$Position = HintBubbleDecorator$Position.TOP_LEFT;
                }
                BubbleTextComponent bubbleTextComponent = ((d1x) ((zo31) aVar.R)).j;
                bubbleTextComponent.setText(str);
                ((rju) bubbleTextComponent.getDecorator()).g(hintBubbleDecorator$Position);
                bubbleTextComponent.show(true);
            } else if (i2 == 2) {
                qwh qwhVar = this.this$0.S;
                qwhVar.getClass();
                qwhVar.a("DeliveryDetailsBubble.Closed", deliveryFormStepType, deliveryPointFocusHolder$FocusTarget, new wwb("auto", 8));
                this.this$0.d0();
            } else {
                if (i2 != 3) {
                    w511.b();
                    return null;
                }
                this.this$0.d0();
            }
        }
        return zy11.a;
    }
}
