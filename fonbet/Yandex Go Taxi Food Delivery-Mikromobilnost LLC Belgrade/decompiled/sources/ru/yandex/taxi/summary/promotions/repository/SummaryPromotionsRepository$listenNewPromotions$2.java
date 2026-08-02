package ru.yandex.taxi.summary.promotions.repository;

import defpackage.dbl0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.tariffs.model.PriceUpdate$PriceLoadingState;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/yandex/taxi/tariffs/model/PriceUpdate$PriceLoadingState;", "priceState", "Ldbl0;", "routeStatsInfo", "Lkotlin/Pair;", "<anonymous>", "(Lru/yandex/taxi/tariffs/model/PriceUpdate$PriceLoadingState;Ldbl0;)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.promotions.repository.SummaryPromotionsRepository$listenNewPromotions$2", f = "SummaryPromotionsRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
final class SummaryPromotionsRepository$listenNewPromotions$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SummaryPromotionsRepository$listenNewPromotions$2 summaryPromotionsRepository$listenNewPromotions$2 = new SummaryPromotionsRepository$listenNewPromotions$2(3, (Continuation) obj3);
        summaryPromotionsRepository$listenNewPromotions$2.L$0 = (PriceUpdate$PriceLoadingState) obj;
        summaryPromotionsRepository$listenNewPromotions$2.L$1 = (dbl0) obj2;
        return summaryPromotionsRepository$listenNewPromotions$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState = (PriceUpdate$PriceLoadingState) this.L$0;
        dbl0 dbl0Var = (dbl0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new Pair(priceUpdate$PriceLoadingState, dbl0Var);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
