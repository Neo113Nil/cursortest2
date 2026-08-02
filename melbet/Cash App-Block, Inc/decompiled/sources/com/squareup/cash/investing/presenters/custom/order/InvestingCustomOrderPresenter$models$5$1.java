package com.squareup.cash.investing.presenters.custom.order;

import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.formview.components.FormCashtag$8$invokeSuspend$$inlined$map$1;
import com.squareup.cash.investing.backend.real.RealInvestingHistoricalData;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.offers.presenters.OffersHomePresenter$models$browseFlowToken$2$1;
import com.squareup.cash.sharesheet.RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1;
import com.squareup.cash.util.RealDrawerOpener$getDrawerScreen$$inlined$map$1;
import com.squareup.cash.work.data.real.RealPayDataLoader$fetchData$1;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class InvestingCustomOrderPresenter$models$5$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $historicalDataValue$delegate;
    public final /* synthetic */ MutableState $isGraphReady$delegate;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState $range$delegate;
    public int label;
    public final /* synthetic */ InvestingCustomOrderPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InvestingCustomOrderPresenter$models$5$1(InvestingCustomOrderPresenter investingCustomOrderPresenter, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = investingCustomOrderPresenter;
        this.$range$delegate = mutableState;
        this.$historicalDataValue$delegate = mutableState2;
        this.$isGraphReady$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new InvestingCustomOrderPresenter$models$5$1(this.this$0, this.$range$delegate, this.$historicalDataValue$delegate, this.$isGraphReady$delegate, continuation, 0);
            default:
                return new InvestingCustomOrderPresenter$models$5$1(this.this$0, this.$range$delegate, this.$historicalDataValue$delegate, this.$isGraphReady$delegate, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((InvestingCustomOrderPresenter$models$5$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$isGraphReady$delegate;
        MutableState mutableState2 = this.$historicalDataValue$delegate;
        MutableState mutableState3 = this.$range$delegate;
        InvestingCustomOrderPresenter investingCustomOrderPresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealInvestingHistoricalData realInvestingHistoricalData = investingCustomOrderPresenter.historicalData;
                    InvestingScreens.OrderTypeSelectionScreen.Type type2 = investingCustomOrderPresenter.screen.f1157type;
                    type2.getClass();
                    InvestmentEntityToken investmentEntityToken = ((InvestingScreens.OrderTypeSelectionScreen.Type.Equity) type2).entityToken;
                    HistoricalRange historicalRange = (HistoricalRange) mutableState3.getValue();
                    investmentEntityToken.getClass();
                    historicalRange.getClass();
                    FormCashtag$8$invokeSuspend$$inlined$map$1 formCashtag$8$invokeSuspend$$inlined$map$1 = new FormCashtag$8$invokeSuspend$$inlined$map$1(FlowKt.channelFlow(new RealPayDataLoader$fetchData$1(false, (Object) realInvestingHistoricalData, (Object) investmentEntityToken, (Object) historicalRange, (Continuation) null, 8)), 19);
                    OffersHomePresenter$models$browseFlowToken$2$1 offersHomePresenter$models$browseFlowToken$2$1 = new OffersHomePresenter$models$browseFlowToken$2$1(mutableState2, mutableState, null, 1);
                    this.label = 1;
                    if (FlowKt.collectLatest(formCashtag$8$invokeSuspend$$inlined$map$1, offersHomePresenter$models$browseFlowToken$2$1, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealInvestingHistoricalData realInvestingHistoricalData2 = investingCustomOrderPresenter.historicalData;
                    HistoricalRange historicalRange2 = (HistoricalRange) mutableState3.getValue();
                    historicalRange2.getClass();
                    RealDrawerOpener$getDrawerScreen$$inlined$map$1 realDrawerOpener$getDrawerScreen$$inlined$map$1 = new RealDrawerOpener$getDrawerScreen$$inlined$map$1(FlowKt.transformLatest(realInvestingHistoricalData2.profileManager.currencyCode(), new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1((Continuation) null, historicalRange2, realInvestingHistoricalData2, 14)), 10);
                    OffersHomePresenter$models$browseFlowToken$2$1 offersHomePresenter$models$browseFlowToken$2$12 = new OffersHomePresenter$models$browseFlowToken$2$1(mutableState2, mutableState, null, 2);
                    this.label = 1;
                    if (FlowKt.collectLatest(realDrawerOpener$getDrawerScreen$$inlined$map$1, offersHomePresenter$models$browseFlowToken$2$12, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
