package ru.yandex.taxi.preorder.summary.solid.interactors;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.tariffs.model.PriceUpdate$PriceLoadingState;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/yandex/taxi/tariffs/model/PriceUpdate$PriceLoadingState;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.preorder.summary.solid.interactors.SelectRequiredPreselectedTariffInteractor$trySelectPreselectedTariff$2", f = "SelectRequiredPreselectedTariffInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SelectRequiredPreselectedTariffInteractor$trySelectPreselectedTariff$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SelectRequiredPreselectedTariffInteractor$trySelectPreselectedTariff$2 selectRequiredPreselectedTariffInteractor$trySelectPreselectedTariff$2 = new SelectRequiredPreselectedTariffInteractor$trySelectPreselectedTariff$2(2, continuation);
        selectRequiredPreselectedTariffInteractor$trySelectPreselectedTariff$2.L$0 = obj;
        return selectRequiredPreselectedTariffInteractor$trySelectPreselectedTariff$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SelectRequiredPreselectedTariffInteractor$trySelectPreselectedTariff$2) create((PriceUpdate$PriceLoadingState) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState = (PriceUpdate$PriceLoadingState) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.valueOf(priceUpdate$PriceLoadingState == PriceUpdate$PriceLoadingState.LOADED);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
