package com.squareup.cash.offers.backend.real;

import com.squareup.cash.money.presenters.MoneyTabPresenter$models$lambda$17$$inlined$map$1;
import com.squareup.cash.session.backend.RealUrlAuthenticator$special$$inlined$filter$1$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.ReadonlySharedFlow;

/* loaded from: classes6.dex */
public final class RealOffersAnalyticsHelper$special$$inlined$map$1 implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ReadonlySharedFlow $this_unsafeTransform$inlined;

    public /* synthetic */ RealOffersAnalyticsHelper$special$$inlined$map$1(ReadonlySharedFlow readonlySharedFlow, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = readonlySharedFlow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        int i2 = 25;
        ReadonlySharedFlow readonlySharedFlow = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = readonlySharedFlow.$$delegate_0.collect(new MoneyTabPresenter$models$lambda$17$$inlined$map$1.AnonymousClass2(flowCollector, i2), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object collect2 = readonlySharedFlow.$$delegate_0.collect(new RealUrlAuthenticator$special$$inlined$filter$1$2(flowCollector, 24), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object collect3 = readonlySharedFlow.$$delegate_0.collect(new RealUrlAuthenticator$special$$inlined$filter$1$2(flowCollector, i2), continuation);
                if (collect3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object collect4 = readonlySharedFlow.$$delegate_0.collect(new RealUrlAuthenticator$special$$inlined$filter$1$2(flowCollector, 28), continuation);
                if (collect4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect5 = readonlySharedFlow.$$delegate_0.collect(new RealUrlAuthenticator$special$$inlined$filter$1$2(flowCollector, 29), continuation);
                if (collect5 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
