package com.squareup.cash.investing.presenters.stockdetails;

import com.squareup.cash.investing.backend.api.PolledData;
import com.squareup.cash.marketing.components.TooltipBoxKt$$ExternalSyntheticLambda2;
import com.squareup.cash.portfolio.graphs.GraphPresenterData;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel$AccentColorType$StaleData;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel$AccentColorType$UptoDateData;
import com.squareup.protos.cash.marketprices.service.GetInvestmentEntityHistoricalDataResponse;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import com.squareup.wire.MoshiJsonIntegration;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import net.oneformapp.schema.SchemaFactory;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class InvestingStockDetailsPresenter$graphModelForRange$1 extends SuspendLambda implements Function3 {
    public final /* synthetic */ Color $accentColor;
    public final /* synthetic */ HistoricalRange $range;
    public final /* synthetic */ List $stockActivities;
    public /* synthetic */ PolledData L$0;
    public /* synthetic */ boolean Z$0;
    public final /* synthetic */ InvestingStockDetailsPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestingStockDetailsPresenter$graphModelForRange$1(InvestingStockDetailsPresenter investingStockDetailsPresenter, List list, HistoricalRange historicalRange, Color color, Continuation continuation) {
        super(3, continuation);
        this.this$0 = investingStockDetailsPresenter;
        this.$stockActivities = list;
        this.$range = historicalRange;
        this.$accentColor = color;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        HistoricalRange historicalRange = this.$range;
        Color color = this.$accentColor;
        InvestingStockDetailsPresenter$graphModelForRange$1 investingStockDetailsPresenter$graphModelForRange$1 = new InvestingStockDetailsPresenter$graphModelForRange$1(this.this$0, this.$stockActivities, historicalRange, color, (Continuation) obj3);
        investingStockDetailsPresenter$graphModelForRange$1.L$0 = (PolledData) obj;
        investingStockDetailsPresenter$graphModelForRange$1.Z$0 = booleanValue;
        return investingStockDetailsPresenter$graphModelForRange$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PolledData polledData = this.L$0;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        GetInvestmentEntityHistoricalDataResponse getInvestmentEntityHistoricalDataResponse = (GetInvestmentEntityHistoricalDataResponse) polledData.value;
        boolean z2 = polledData.isStale;
        InvestingStockDetailsPresenter investingStockDetailsPresenter = this.this$0;
        GraphPresenterData presenterDataFor = investingStockDetailsPresenter.graphCalculator.presenterDataFor(SchemaFactory.asPortfolioModel(getInvestmentEntityHistoricalDataResponse, this.$stockActivities, new TooltipBoxKt$$ExternalSyntheticLambda2(investingStockDetailsPresenter, 21)), this.$range, z2 ? InvestingGraphContentModel$AccentColorType$StaleData.INSTANCE : new InvestingGraphContentModel$AccentColorType$UptoDateData(MoshiJsonIntegration.toModel(this.$accentColor)), z, getInvestmentEntityHistoricalDataResponse.prior_trading_day_price_cents != null ? new Float(r9.longValue()) : null);
        presenterDataFor.getClass();
        return presenterDataFor;
    }
}
