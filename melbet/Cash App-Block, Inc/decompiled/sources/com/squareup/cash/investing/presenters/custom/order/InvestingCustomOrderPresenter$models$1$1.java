package com.squareup.cash.investing.presenters.custom.order;

import androidx.compose.runtime.MutableState;
import com.squareup.cash.investing.viewmodels.custom.order.InvestingCustomOrderViewEvent;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class InvestingCustomOrderPresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState $range$delegate;
    public final /* synthetic */ InvestingCustomOrderPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InvestingCustomOrderPresenter$models$1$1(InvestingCustomOrderPresenter investingCustomOrderPresenter, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = investingCustomOrderPresenter;
        this.$range$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$range$delegate;
        InvestingCustomOrderPresenter investingCustomOrderPresenter = this.this$0;
        switch (i) {
            case 0:
                return new InvestingCustomOrderPresenter$models$1$1(investingCustomOrderPresenter, mutableState, continuation, 0);
            default:
                return new InvestingCustomOrderPresenter$models$1$1(investingCustomOrderPresenter, mutableState, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((InvestingCustomOrderPresenter$models$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$range$delegate;
        InvestingCustomOrderPresenter investingCustomOrderPresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                investingCustomOrderPresenter.rangeCache.set((HistoricalRange) mutableState.getValue());
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                investingCustomOrderPresenter.selectedPriceCache.set((InvestingCustomOrderViewEvent.SelectedPrice) mutableState.getValue());
                break;
        }
        return Unit.INSTANCE;
    }
}
