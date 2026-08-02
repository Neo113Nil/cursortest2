package com.squareup.cash.investing.presenters.categories;

import com.squareup.cash.data.contacts.RealContactRepository$contacts$$inlined$map$1;
import com.squareup.cash.investing.presenters.InvestingPortfolioPresenter$models$lambda$6$$inlined$map$1$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes7.dex */
public final class InvestingFilterCategoriesPresenter$models$lambda$0$$inlined$map$1 implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RealContactRepository$contacts$$inlined$map$1 $this_unsafeTransform$inlined;

    public /* synthetic */ InvestingFilterCategoriesPresenter$models$lambda$0$$inlined$map$1(RealContactRepository$contacts$$inlined$map$1 realContactRepository$contacts$$inlined$map$1, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = realContactRepository$contacts$$inlined$map$1;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        RealContactRepository$contacts$$inlined$map$1 realContactRepository$contacts$$inlined$map$1 = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = realContactRepository$contacts$$inlined$map$1.collect(new InvestingPortfolioPresenter$models$lambda$6$$inlined$map$1$2(flowCollector, 7), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect2 = realContactRepository$contacts$$inlined$map$1.collect(new InvestingPortfolioPresenter$models$lambda$6$$inlined$map$1$2(flowCollector, 8), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
