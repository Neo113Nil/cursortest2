package com.squareup.cash.offers.presenters;

import androidx.compose.runtime.MutableState;
import com.squareup.protos.cash.marketprices.service.GetInvestmentEntityHistoricalDataResponse;
import com.squareup.protos.franklin.app.GetHistoricalExchangeDataResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class OffersHomePresenter$models$browseFlowToken$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $isPresenterInitialized$delegate;
    public final /* synthetic */ MutableState $previousBrowseFlowToken$delegate;
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OffersHomePresenter$models$browseFlowToken$2$1(MutableState mutableState, MutableState mutableState2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$isPresenterInitialized$delegate = mutableState;
        this.$previousBrowseFlowToken$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                OffersHomePresenter$models$browseFlowToken$2$1 offersHomePresenter$models$browseFlowToken$2$1 = new OffersHomePresenter$models$browseFlowToken$2$1(this.$isPresenterInitialized$delegate, this.$previousBrowseFlowToken$delegate, continuation, 0);
                offersHomePresenter$models$browseFlowToken$2$1.L$0 = obj;
                return offersHomePresenter$models$browseFlowToken$2$1;
            case 1:
                OffersHomePresenter$models$browseFlowToken$2$1 offersHomePresenter$models$browseFlowToken$2$12 = new OffersHomePresenter$models$browseFlowToken$2$1(this.$isPresenterInitialized$delegate, this.$previousBrowseFlowToken$delegate, continuation, 1);
                offersHomePresenter$models$browseFlowToken$2$12.L$0 = obj;
                return offersHomePresenter$models$browseFlowToken$2$12;
            default:
                OffersHomePresenter$models$browseFlowToken$2$1 offersHomePresenter$models$browseFlowToken$2$13 = new OffersHomePresenter$models$browseFlowToken$2$1(this.$isPresenterInitialized$delegate, this.$previousBrowseFlowToken$delegate, continuation, 2);
                offersHomePresenter$models$browseFlowToken$2$13.L$0 = obj;
                return offersHomePresenter$models$browseFlowToken$2$13;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((OffersHomePresenter$models$browseFlowToken$2$1) create((String) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((OffersHomePresenter$models$browseFlowToken$2$1) create((GetInvestmentEntityHistoricalDataResponse) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((OffersHomePresenter$models$browseFlowToken$2$1) create((GetHistoricalExchangeDataResponse) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$previousBrowseFlowToken$delegate;
        MutableState mutableState2 = this.$isPresenterInitialized$delegate;
        Object obj2 = this.L$0;
        switch (i) {
            case 0:
                String str = (String) obj2;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (((Boolean) mutableState2.getValue()).booleanValue()) {
                    mutableState.setValue(str);
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                mutableState2.setValue((GetInvestmentEntityHistoricalDataResponse) obj2);
                mutableState.setValue(Boolean.TRUE);
                break;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                mutableState2.setValue(Boolean.TRUE);
                mutableState.setValue((GetHistoricalExchangeDataResponse) obj2);
                break;
        }
        return Unit.INSTANCE;
    }
}
