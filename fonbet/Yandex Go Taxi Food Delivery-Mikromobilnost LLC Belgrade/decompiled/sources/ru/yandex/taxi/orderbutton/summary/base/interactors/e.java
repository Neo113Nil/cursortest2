package ru.yandex.taxi.orderbutton.summary.base.interactors;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.tariffs.model.PriceUpdate$PriceLoadingState;

/* loaded from: classes6.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;

    public e(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SummaryButtonModelInteractor$priceLoadingFlow$$inlined$map$2$2$1 summaryButtonModelInteractor$priceLoadingFlow$$inlined$map$2$2$1;
        int i;
        if (continuation instanceof SummaryButtonModelInteractor$priceLoadingFlow$$inlined$map$2$2$1) {
            summaryButtonModelInteractor$priceLoadingFlow$$inlined$map$2$2$1 = (SummaryButtonModelInteractor$priceLoadingFlow$$inlined$map$2$2$1) continuation;
            int i2 = summaryButtonModelInteractor$priceLoadingFlow$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                summaryButtonModelInteractor$priceLoadingFlow$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = summaryButtonModelInteractor$priceLoadingFlow$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = summaryButtonModelInteractor$priceLoadingFlow$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Boolean valueOf = Boolean.valueOf(((PriceUpdate$PriceLoadingState) obj) != PriceUpdate$PriceLoadingState.LOADED);
                    summaryButtonModelInteractor$priceLoadingFlow$$inlined$map$2$2$1.L$0 = null;
                    summaryButtonModelInteractor$priceLoadingFlow$$inlined$map$2$2$1.L$1 = null;
                    summaryButtonModelInteractor$priceLoadingFlow$$inlined$map$2$2$1.L$2 = null;
                    summaryButtonModelInteractor$priceLoadingFlow$$inlined$map$2$2$1.L$3 = null;
                    summaryButtonModelInteractor$priceLoadingFlow$$inlined$map$2$2$1.label = 1;
                    if (this.a.emit(valueOf, summaryButtonModelInteractor$priceLoadingFlow$$inlined$map$2$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        summaryButtonModelInteractor$priceLoadingFlow$$inlined$map$2$2$1 = new SummaryButtonModelInteractor$priceLoadingFlow$$inlined$map$2$2$1(this, continuation);
        Object obj22 = summaryButtonModelInteractor$priceLoadingFlow$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = summaryButtonModelInteractor$priceLoadingFlow$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
