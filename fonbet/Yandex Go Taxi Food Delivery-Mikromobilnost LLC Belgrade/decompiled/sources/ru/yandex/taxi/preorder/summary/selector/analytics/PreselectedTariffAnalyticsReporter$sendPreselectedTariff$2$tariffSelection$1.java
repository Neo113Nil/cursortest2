package ru.yandex.taxi.preorder.summary.selector.analytics;

import defpackage.fnx0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.tariffs.model.PriceUpdate$PriceLoadingState;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/yandex/taxi/tariffs/model/PriceUpdate$PriceLoadingState;", "priceLoadingState", "Lfnx0;", "tariffSelection", "<anonymous>", "(Lru/yandex/taxi/tariffs/model/PriceUpdate$PriceLoadingState;Lfnx0;)Lfnx0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.summary.selector.analytics.PreselectedTariffAnalyticsReporter$sendPreselectedTariff$2$tariffSelection$1", f = "PreselectedTariffAnalyticsReporter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class PreselectedTariffAnalyticsReporter$sendPreselectedTariff$2$tariffSelection$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PreselectedTariffAnalyticsReporter$sendPreselectedTariff$2$tariffSelection$1 preselectedTariffAnalyticsReporter$sendPreselectedTariff$2$tariffSelection$1 = new PreselectedTariffAnalyticsReporter$sendPreselectedTariff$2$tariffSelection$1(3, (Continuation) obj3);
        preselectedTariffAnalyticsReporter$sendPreselectedTariff$2$tariffSelection$1.L$0 = (PriceUpdate$PriceLoadingState) obj;
        preselectedTariffAnalyticsReporter$sendPreselectedTariff$2$tariffSelection$1.L$1 = (fnx0) obj2;
        return preselectedTariffAnalyticsReporter$sendPreselectedTariff$2$tariffSelection$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState = (PriceUpdate$PriceLoadingState) this.L$0;
        fnx0 fnx0Var = (fnx0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (priceUpdate$PriceLoadingState == PriceUpdate$PriceLoadingState.LOADED) {
            return fnx0Var;
        }
        return null;
    }
}
