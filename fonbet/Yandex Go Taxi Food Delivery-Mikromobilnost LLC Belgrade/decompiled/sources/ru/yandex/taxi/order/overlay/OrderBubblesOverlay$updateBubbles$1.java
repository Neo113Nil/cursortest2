package ru.yandex.taxi.order.overlay;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tl6;
import defpackage.tls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.order.overlay.OrderBubblesOverlay$updateBubbles$1", f = "OrderBubblesOverlay.kt", l = {102}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class OrderBubblesOverlay$updateBubbles$1 extends SuspendLambda implements tls {
    final /* synthetic */ List<tl6> $bubbles;
    int label;
    final /* synthetic */ OrderBubblesOverlay this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderBubblesOverlay$updateBubbles$1(OrderBubblesOverlay orderBubblesOverlay, List list, Continuation continuation) {
        super(1, continuation);
        this.this$0 = orderBubblesOverlay;
        this.$bubbles = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new OrderBubblesOverlay$updateBubbles$1(this.this$0, this.$bubbles, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((OrderBubblesOverlay$updateBubbles$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object appendFreshPlacemarks;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            this.this$0.removeOutdatedPlacemarks(this.$bubbles);
            OrderBubblesOverlay orderBubblesOverlay = this.this$0;
            List<tl6> list = this.$bubbles;
            this.label = 1;
            appendFreshPlacemarks = orderBubblesOverlay.appendFreshPlacemarks(list, this);
            if (appendFreshPlacemarks == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
