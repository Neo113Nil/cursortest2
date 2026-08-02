package ru.yandex.taxi.order.overlay;

import com.ybsdk.widgets.common.BlendingGradientView;
import defpackage.cds0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.re2;
import defpackage.tje;
import defpackage.tl6;
import defpackage.tse;
import defpackage.vxu0;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.order.overlay.OrderBubblesOverlay$appendFreshPlacemarks$2", f = "OrderBubblesOverlay.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class OrderBubblesOverlay$appendFreshPlacemarks$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<tl6> $bubbles;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OrderBubblesOverlay this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.order.overlay.OrderBubblesOverlay$appendFreshPlacemarks$2$1", f = "OrderBubblesOverlay.kt", l = {150}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.order.overlay.OrderBubblesOverlay$appendFreshPlacemarks$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ tl6 $bubble;
        int label;
        final /* synthetic */ OrderBubblesOverlay this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OrderBubblesOverlay orderBubblesOverlay, tl6 tl6Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = orderBubblesOverlay;
            this.$bubble = tl6Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$bubble, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object attachStyledBubble;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                b.b(obj);
                OrderBubblesOverlay orderBubblesOverlay = this.this$0;
                vxu0 vxu0Var = (vxu0) this.$bubble;
                this.label = 1;
                attachStyledBubble = orderBubblesOverlay.attachStyledBubble(vxu0Var, this);
                if (attachStyledBubble == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.order.overlay.OrderBubblesOverlay$appendFreshPlacemarks$2$2", f = "OrderBubblesOverlay.kt", l = {BlendingGradientView.BASE_ALPHA}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.order.overlay.OrderBubblesOverlay$appendFreshPlacemarks$2$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ tl6 $bubble;
        int label;
        final /* synthetic */ OrderBubblesOverlay this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(OrderBubblesOverlay orderBubblesOverlay, tl6 tl6Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = orderBubblesOverlay;
            this.$bubble = tl6Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, this.$bubble, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object attachAnimatedBubble;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                b.b(obj);
                OrderBubblesOverlay orderBubblesOverlay = this.this$0;
                re2 re2Var = (re2) this.$bubble;
                this.label = 1;
                attachAnimatedBubble = orderBubblesOverlay.attachAnimatedBubble(re2Var, this);
                if (attachAnimatedBubble == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderBubblesOverlay$appendFreshPlacemarks$2(OrderBubblesOverlay orderBubblesOverlay, List list, Continuation continuation) {
        super(2, continuation);
        this.$bubbles = list;
        this.this$0 = orderBubblesOverlay;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OrderBubblesOverlay$appendFreshPlacemarks$2 orderBubblesOverlay$appendFreshPlacemarks$2 = new OrderBubblesOverlay$appendFreshPlacemarks$2(this.this$0, this.$bubbles, continuation);
        orderBubblesOverlay$appendFreshPlacemarks$2.L$0 = obj;
        return orderBubblesOverlay$appendFreshPlacemarks$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        OrderBubblesOverlay$appendFreshPlacemarks$2 orderBubblesOverlay$appendFreshPlacemarks$2 = (OrderBubblesOverlay$appendFreshPlacemarks$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        orderBubblesOverlay$appendFreshPlacemarks$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Map map;
        Map map2;
        Map map3;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        for (tl6 tl6Var : this.$bubbles) {
            if (tl6Var instanceof cds0) {
                map3 = this.this$0.simpleBubbleViewHolders;
                if (!map3.containsKey(tl6Var)) {
                    this.this$0.attachSimpleBubble((cds0) tl6Var);
                }
            }
            if (tl6Var instanceof vxu0) {
                map2 = this.this$0.styledBubbleViewHolders;
                if (!map2.containsKey(tl6Var)) {
                    tje.N(tseVar, null, null, new AnonymousClass1(this.this$0, tl6Var, null), 3);
                }
            }
            if (tl6Var instanceof re2) {
                map = this.this$0.animatedBubbleViewHolders;
                if (!map.containsKey(tl6Var)) {
                    tje.N(tseVar, null, null, new AnonymousClass2(this.this$0, tl6Var, null), 3);
                }
            }
        }
        return zy11.a;
    }
}
