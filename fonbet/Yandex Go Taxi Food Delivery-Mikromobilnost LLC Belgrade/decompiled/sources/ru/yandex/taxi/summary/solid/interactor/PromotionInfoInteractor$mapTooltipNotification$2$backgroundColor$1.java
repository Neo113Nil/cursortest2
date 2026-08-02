package ru.yandex.taxi.summary.solid.interactor;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.r0e;
import defpackage.tse;
import defpackage.wls;
import defpackage.xng0;
import defpackage.zkv0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)I"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.solid.interactor.PromotionInfoInteractor$mapTooltipNotification$2$backgroundColor$1", f = "PromotionInfoInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class PromotionInfoInteractor$mapTooltipNotification$2$backgroundColor$1 extends SuspendLambda implements wls {
    final /* synthetic */ zkv0 $promo;
    int label;
    final /* synthetic */ p this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromotionInfoInteractor$mapTooltipNotification$2$backgroundColor$1(zkv0 zkv0Var, p pVar, Continuation continuation) {
        super(2, continuation);
        this.$promo = zkv0Var;
        this.this$0 = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PromotionInfoInteractor$mapTooltipNotification$2$backgroundColor$1(this.$promo, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PromotionInfoInteractor$mapTooltipNotification$2$backgroundColor$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        return new Integer(this.this$0.a.b(xng0.bgMinor, ((r0e) this.$promo.j).a));
    }
}
