package com.squareup.cash.card.onboarding;

import com.squareup.cash.card.onboarding.CardModelView$cardHeat$$inlined$map$1;
import com.squareup.cash.graphics.swampgl.components.Camera$special$$inlined$map$1;
import com.squareup.cash.investing.presenters.InvestingPortfolioPresenter$models$lambda$6$$inlined$map$1$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1;

/* loaded from: classes6.dex */
public final class CardPreviewPresenter$cashtag$$inlined$map$1 implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 $this_unsafeTransform$inlined;

    public /* synthetic */ CardPreviewPresenter$cashtag$$inlined$map$1(FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 flowKt__LimitKt$drop$$inlined$unsafeFlow$1, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = flowKt__LimitKt$drop$$inlined$unsafeFlow$1;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 flowKt__LimitKt$drop$$inlined$unsafeFlow$1 = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = flowKt__LimitKt$drop$$inlined$unsafeFlow$1.collect(new CardModelView$cardHeat$$inlined$map$1.AnonymousClass2(flowCollector, 17), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object collect2 = flowKt__LimitKt$drop$$inlined$unsafeFlow$1.collect(new CardModelView$cardHeat$$inlined$map$1.AnonymousClass2(flowCollector, 19), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object collect3 = flowKt__LimitKt$drop$$inlined$unsafeFlow$1.collect(new Camera$special$$inlined$map$1.AnonymousClass2(flowCollector, 13), continuation);
                if (collect3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object collect4 = flowKt__LimitKt$drop$$inlined$unsafeFlow$1.collect(new InvestingPortfolioPresenter$models$lambda$6$$inlined$map$1$2(flowCollector, 26), continuation);
                if (collect4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object collect5 = flowKt__LimitKt$drop$$inlined$unsafeFlow$1.collect(new InvestingPortfolioPresenter$models$lambda$6$$inlined$map$1$2(flowCollector, 27), continuation);
                if (collect5 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect6 = flowKt__LimitKt$drop$$inlined$unsafeFlow$1.collect(new InvestingPortfolioPresenter$models$lambda$6$$inlined$map$1$2(flowCollector, 28), continuation);
                if (collect6 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
