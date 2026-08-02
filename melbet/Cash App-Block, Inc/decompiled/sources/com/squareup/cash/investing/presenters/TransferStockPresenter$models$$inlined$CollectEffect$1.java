package com.squareup.cash.investing.presenters;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.State;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.jakewharton.processphoenix.ProcessPhoenix;
import com.nimbusds.jose.util.X509CertChainUtils;
import com.nimbusds.jose.util.X509CertUtils;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.amountslider.viewmodels.AmountSelection;
import com.squareup.cash.cdf.stock.EquityType;
import com.squareup.cash.cdf.stock.OrderSide;
import com.squareup.cash.cdf.stock.StockTradeChangeOrderType;
import com.squareup.cash.cdf.stock.StockTradeExit;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.investing.analytics.InvestingAnalytics$SellAmount;
import com.squareup.cash.investing.backend.api.StockDetails;
import com.squareup.cash.investing.backend.real.analytics.RealInvestingAnalytics;
import com.squareup.cash.investing.db.Investing_settings;
import com.squareup.cash.investing.db.Investment_entity;
import com.squareup.cash.investing.db.Investment_holding;
import com.squareup.cash.investing.db.WithHoldings;
import com.squareup.cash.investing.presenters.stockdetails.InvestingStockDetailsPresenter;
import com.squareup.cash.investing.presenters.stockdetails.InvestingStockDetailsPresenter$createViewModel$2;
import com.squareup.cash.investing.presenters.stockdetails.Loaded;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.investing.viewmodels.InvestingDetailTileViewModel;
import com.squareup.cash.investing.viewmodels.TransferStockViewEvent;
import com.squareup.cash.investing.viewmodels.TransferStockViewModel;
import com.squareup.cash.investing.viewmodels.holdings.InvestingEtfHoldingsViewModel;
import com.squareup.cash.investing.viewmodels.metrics.InvestingEarningsViewModel;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoRecurringPurchaseTileViewModel;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsViewModel;
import com.squareup.cash.portfolio.graphs.GraphPresenterData;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphViewEvent;
import com.squareup.cash.screens.Back;
import com.squareup.cash.screens.blockers.AmountSheetSavedState;
import com.squareup.cash.session.backend.DbSessionManager$updateDb$2;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import com.squareup.protos.franklin.investing.resources.InvestmentEntityType;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import okhttp3.MultipartBody;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class TransferStockPresenter$models$$inlined$CollectEffect$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $amountCentsEntered$delegate$inlined;
    public final /* synthetic */ MutableState $amountSelection$delegate$inlined;
    public final /* synthetic */ Object $amountSelections$delegate$inlined;
    public final /* synthetic */ MutableState $balanceSnapshot$delegate$inlined;
    public final /* synthetic */ MutableState $dialogContent$delegate$inlined;
    public final /* synthetic */ Object $entity$inlined;
    public final /* synthetic */ Object $expanded$delegate$inlined;
    public Object $flow;
    public final /* synthetic */ MutableState $forceExpansion$delegate$inlined;
    public final /* synthetic */ Object $initiateRequestEvent$inlined;
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object $rawAmountEntered$delegate$inlined;
    public final /* synthetic */ Object $requestInFlight$delegate$inlined;
    public final /* synthetic */ MutableState $savedState$delegate$inlined;
    public final /* synthetic */ Object $settings$delegate$inlined;
    public final /* synthetic */ Object $stockDetails$delegate$inlined;
    public final /* synthetic */ boolean $submitButtonEnabled$inlined;
    public final /* synthetic */ Object $subtitle$inlined;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ MoleculePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferStockPresenter$models$$inlined$CollectEffect$1(Flow flow, Continuation continuation, boolean z, TransferStockPresenter transferStockPresenter, WithHoldings withHoldings, TransferStockViewModel.Content.Subtitle subtitle, MutableState mutableState, MutableState mutableState2, State state, State state2, MutableState mutableState3, State state3, MutableState mutableState4, MutableState mutableState5, Channel channel, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9) {
        super(2, continuation);
        this.$flow = flow;
        this.$submitButtonEnabled$inlined = z;
        this.this$0 = transferStockPresenter;
        this.$entity$inlined = withHoldings;
        this.$subtitle$inlined = subtitle;
        this.$forceExpansion$delegate$inlined = mutableState;
        this.$dialogContent$delegate$inlined = mutableState2;
        this.$expanded$delegate$inlined = state;
        this.$amountCentsEntered$delegate$inlined = state2;
        this.$amountSelection$delegate$inlined = mutableState3;
        this.$settings$delegate$inlined = state3;
        this.$balanceSnapshot$delegate$inlined = mutableState4;
        this.$savedState$delegate$inlined = mutableState5;
        this.$initiateRequestEvent$inlined = channel;
        this.$rawAmountEntered$delegate$inlined = mutableState6;
        this.$stockDetails$delegate$inlined = mutableState7;
        this.$amountSelections$delegate$inlined = mutableState8;
        this.$requestInFlight$delegate$inlined = mutableState9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$initiateRequestEvent$inlined;
        Object obj3 = this.$settings$delegate$inlined;
        Object obj4 = this.$amountCentsEntered$delegate$inlined;
        Object obj5 = this.$expanded$delegate$inlined;
        Object obj6 = this.$requestInFlight$delegate$inlined;
        Object obj7 = this.$amountSelections$delegate$inlined;
        Object obj8 = this.$stockDetails$delegate$inlined;
        Object obj9 = this.$rawAmountEntered$delegate$inlined;
        Object obj10 = this.$subtitle$inlined;
        Object obj11 = this.$entity$inlined;
        MoleculePresenter moleculePresenter = this.this$0;
        switch (i) {
            case 0:
                TransferStockPresenter$models$$inlined$CollectEffect$1 transferStockPresenter$models$$inlined$CollectEffect$1 = new TransferStockPresenter$models$$inlined$CollectEffect$1((Flow) this.$flow, continuation, this.$submitButtonEnabled$inlined, (TransferStockPresenter) moleculePresenter, (WithHoldings) obj11, (TransferStockViewModel.Content.Subtitle) obj10, this.$forceExpansion$delegate$inlined, this.$dialogContent$delegate$inlined, (State) obj5, (State) obj4, this.$amountSelection$delegate$inlined, (State) obj3, this.$balanceSnapshot$delegate$inlined, this.$savedState$delegate$inlined, (Channel) obj2, (MutableState) obj9, (MutableState) obj8, (MutableState) obj7, (MutableState) obj6);
                transferStockPresenter$models$$inlined$CollectEffect$1.L$0 = obj;
                return transferStockPresenter$models$$inlined$CollectEffect$1;
            default:
                InvestingEtfHoldingsViewModel investingEtfHoldingsViewModel = (InvestingEtfHoldingsViewModel) obj3;
                Investing_settings investing_settings = (Investing_settings) obj2;
                MutableState mutableState = this.$balanceSnapshot$delegate$inlined;
                MutableState mutableState2 = this.$savedState$delegate$inlined;
                TransferStockPresenter$models$$inlined$CollectEffect$1 transferStockPresenter$models$$inlined$CollectEffect$12 = new TransferStockPresenter$models$$inlined$CollectEffect$1((InvestingStockDetailsPresenter) moleculePresenter, (HistoricalRange) obj11, this.$submitButtonEnabled$inlined, (InvestingCryptoRecurringPurchaseTileViewModel) obj10, (InvestingCryptoNewsViewModel) obj9, (X509CertUtils) obj8, (InvestingEarningsViewModel) obj7, (X509CertChainUtils) obj6, (InvestingDetailTileViewModel) obj5, (UiCallbackModel) obj4, investingEtfHoldingsViewModel, investing_settings, this.$forceExpansion$delegate$inlined, this.$dialogContent$delegate$inlined, this.$amountSelection$delegate$inlined, mutableState, mutableState2, continuation);
                transferStockPresenter$models$$inlined$CollectEffect$12.L$0 = obj;
                return transferStockPresenter$models$$inlined$CollectEffect$12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((TransferStockPresenter$models$$inlined$CollectEffect$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((TransferStockPresenter$models$$inlined$CollectEffect$1) create((ProduceStateScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object withContext;
        int i = this.$r8$classId;
        Object obj2 = this.$initiateRequestEvent$inlined;
        Object obj3 = this.$settings$delegate$inlined;
        Object obj4 = this.$amountCentsEntered$delegate$inlined;
        Object obj5 = this.$expanded$delegate$inlined;
        Object obj6 = this.$requestInFlight$delegate$inlined;
        Object obj7 = this.$amountSelections$delegate$inlined;
        Object obj8 = this.$stockDetails$delegate$inlined;
        Object obj9 = this.$rawAmountEntered$delegate$inlined;
        Object obj10 = this.$subtitle$inlined;
        Object obj11 = this.$entity$inlined;
        MoleculePresenter moleculePresenter = this.this$0;
        switch (i) {
            case 0:
                final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = (Flow) this.$flow;
                    final TransferStockPresenter transferStockPresenter = (TransferStockPresenter) moleculePresenter;
                    final WithHoldings withHoldings = (WithHoldings) obj11;
                    final TransferStockViewModel.Content.Subtitle subtitle = (TransferStockViewModel.Content.Subtitle) obj10;
                    final State state = (State) obj5;
                    final State state2 = (State) obj4;
                    final State state3 = (State) obj3;
                    final Channel channel = (Channel) obj2;
                    final MutableState mutableState = (MutableState) obj9;
                    final MutableState mutableState2 = (MutableState) obj8;
                    final MutableState mutableState3 = (MutableState) obj7;
                    final MutableState mutableState4 = (MutableState) obj6;
                    final boolean z = this.$submitButtonEnabled$inlined;
                    final MutableState mutableState5 = this.$forceExpansion$delegate$inlined;
                    final MutableState mutableState6 = this.$dialogContent$delegate$inlined;
                    final MutableState mutableState7 = this.$amountSelection$delegate$inlined;
                    final MutableState mutableState8 = this.$balanceSnapshot$delegate$inlined;
                    final MutableState mutableState9 = this.$savedState$delegate$inlined;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.squareup.cash.investing.presenters.TransferStockPresenter$models$$inlined$CollectEffect$1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj12, Continuation continuation) {
                            InvestmentEntityType investmentEntityType;
                            InvestingAnalytics$SellAmount all;
                            MultipartBody.Companion tradeEvent$TransferAllShares;
                            MultipartBody.Companion companion;
                            WithHoldings withHoldings2 = withHoldings;
                            String str = withHoldings2.symbol;
                            TransferStockPresenter transferStockPresenter2 = transferStockPresenter;
                            BetterNavigator.ScreenNavigator screenNavigator = transferStockPresenter2.navigator;
                            RealInvestingAnalytics realInvestingAnalytics = transferStockPresenter2.investingAnalytics;
                            InvestingScreens.TransferStock transferStock = transferStockPresenter2.args;
                            TransferStockViewEvent transferStockViewEvent = (TransferStockViewEvent) obj12;
                            boolean areEqual = Intrinsics.areEqual(transferStockViewEvent, TransferStockViewEvent.Expanded.INSTANCE);
                            MutableState mutableState10 = mutableState5;
                            if (areEqual) {
                                mutableState10.setValue(Boolean.TRUE);
                            } else if (Intrinsics.areEqual(transferStockViewEvent, TransferStockViewEvent.Peeking.INSTANCE)) {
                                mutableState10.setValue(Boolean.FALSE);
                            } else {
                                boolean areEqual2 = Intrinsics.areEqual(transferStockViewEvent, TransferStockViewEvent.DialogDismissed.INSTANCE);
                                MutableState mutableState11 = mutableState6;
                                if (areEqual2) {
                                    mutableState10.setValue(Boolean.TRUE);
                                    mutableState11.setValue(null);
                                } else {
                                    boolean areEqual3 = Intrinsics.areEqual(transferStockViewEvent, TransferStockViewEvent.Submit.INSTANCE);
                                    MutableState mutableState12 = mutableState8;
                                    MutableState mutableState13 = mutableState9;
                                    MutableState mutableState14 = mutableState7;
                                    CoroutineScope coroutineScope2 = coroutineScope;
                                    if (areEqual3) {
                                        if (((Boolean) state.getValue()).booleanValue()) {
                                            companion = new TradeEvent$TransferStock(((Number) state2.getValue()).longValue());
                                        } else {
                                            AmountSelection amountSelection = (AmountSelection) mutableState14.getValue();
                                            if (amountSelection instanceof AmountSelection.TradeSome) {
                                                tradeEvent$TransferAllShares = new TradeEvent$TransferStock(((AmountSelection.TradeSome) amountSelection).amount);
                                            } else {
                                                if (!(amountSelection instanceof AmountSelection.TradeAll)) {
                                                    throw new IllegalStateException("One cannot submit a transfer from selection: " + amountSelection + ". [submitButtonEnabled should be false and is " + z + "]");
                                                }
                                                tradeEvent$TransferAllShares = new TradeEvent$TransferAllShares(((AmountSelection.TradeAll) amountSelection).shareUnits);
                                            }
                                            companion = tradeEvent$TransferAllShares;
                                        }
                                        if (companion instanceof TradeEvent$TransferStock) {
                                            TradeEvent$TransferStock tradeEvent$TransferStock = (TradeEvent$TransferStock) companion;
                                            State state4 = state3;
                                            Long minimumStocksAmount = transferStockPresenter2.getMinimumStocksAmount((Investing_settings) state4.getValue());
                                            if (tradeEvent$TransferStock.amount < (minimumStocksAmount != null ? minimumStocksAmount.longValue() : 0L)) {
                                                throw new IllegalStateException(("Invalid amount " + companion + " [settings=" + transferStockPresenter2.getMinimumStocksAmount((Investing_settings) state4.getValue()) + ", frequency=" + transferStockPresenter2.frequencyModel + "]").toString());
                                            }
                                        }
                                        JobKt.launch$default(coroutineScope2, null, null, new DbSessionManager$updateDb$2(transferStockPresenter2, withHoldings2, companion, mutableState12, mutableState13, mutableState6, channel, null, 7), 3);
                                    } else if (Intrinsics.areEqual(transferStockViewEvent, TransferStockViewEvent.ChangeOrderTypeClicked.INSTANCE)) {
                                        InvestmentEntityToken investmentEntityToken = transferStock.investmentEntityToken;
                                        OrderSide cdf = ProcessPhoenix.toCdf(transferStock.side);
                                        investmentEntityToken.getClass();
                                        str.getClass();
                                        realInvestingAnalytics.analytics.track(new StockTradeChangeOrderType(cdf, str), null);
                                        screenNavigator.goTo(new InvestingScreens.OrderTypeSelectionScreen(transferStock.side, new InvestingScreens.OrderTypeSelectionScreen.Type.Equity(transferStock.investmentEntityToken, str), transferStock.accentColor, InvestingScreens.TransferStock.copy$default(transferStock, null, (AmountSheetSavedState) mutableState13.getValue(), EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE), new InvestingScreens.StockDetails(null, transferStock.investmentEntityToken, null, new InvestingScreens.StockDetails.Origin.Tradable(false), null, false, 49)));
                                    } else if (Intrinsics.areEqual(transferStockViewEvent, TransferStockViewEvent.MoreInfoClicked.INSTANCE)) {
                                        String str2 = subtitle.informationText;
                                        str2.getClass();
                                        mutableState11.setValue(new TransferStockViewModel.Content.FullScreenContent.DialogContent(str2, transferStock.accentColor, TransferStockViewModel.Content.FullScreenContent.DialogContent.Type.OK));
                                    } else {
                                        boolean z2 = transferStockViewEvent instanceof TransferStockViewEvent.ItemSelected;
                                        MutableState mutableState15 = mutableState;
                                        if (z2) {
                                            AmountSelection amountSelection2 = ((TransferStockViewEvent.ItemSelected) transferStockViewEvent).selection;
                                            if (amountSelection2 instanceof AmountSelection.TradeSome) {
                                                AmountSelection.TradeSome tradeSome = (AmountSelection.TradeSome) amountSelection2;
                                                all = new InvestingAnalytics$SellAmount.Some(tradeSome.amount, tradeSome.buttonText);
                                            } else if (amountSelection2 instanceof AmountSelection.TradeAll) {
                                                all = new InvestingAnalytics$SellAmount.All(((AmountSelection.TradeAll) amountSelection2).amount);
                                            } else {
                                                if (!(amountSelection2 instanceof AmountSelection.TradeCustomize)) {
                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                    return null;
                                                }
                                                mutableState15.setValue("0");
                                                mutableState10.setValue(Boolean.TRUE);
                                                InvestmentEntityToken investmentEntityToken2 = transferStock.investmentEntityToken;
                                                OrderSide cdf2 = ProcessPhoenix.toCdf(transferStock.side);
                                                investmentEntityToken2.getClass();
                                                str.getClass();
                                                realInvestingAnalytics.trackAtmAmount(investmentEntityToken2, str, cdf2, null);
                                            }
                                            realInvestingAnalytics.trackAtmAmount(transferStock.investmentEntityToken, str, ProcessPhoenix.toCdf(transferStock.side), all);
                                            mutableState14.setValue(amountSelection2);
                                        } else if (Intrinsics.areEqual(transferStockViewEvent, TransferStockViewEvent.UserDismissed.INSTANCE)) {
                                            OrderSide cdf3 = ProcessPhoenix.toCdf(transferStock.side);
                                            Investment_entity investment_entity = (Investment_entity) mutableState2.getValue();
                                            EquityType equityType = (investment_entity == null || (investmentEntityType = investment_entity.f1153type) == null) ? null : MultipartBody.Part.Companion.toEquityType(investmentEntityType);
                                            str.getClass();
                                            realInvestingAnalytics.analytics.track(new StockTradeExit(cdf3, str, equityType), null);
                                            screenNavigator.goTo(Back.INSTANCE);
                                        } else if (Intrinsics.areEqual(transferStockViewEvent, TransferStockViewEvent.AgreeToSellAll.INSTANCE)) {
                                            List list = (List) mutableState3.getValue();
                                            ArrayList arrayList = new ArrayList();
                                            for (Object obj13 : list) {
                                                if (obj13 instanceof AmountSelection.TradeAll) {
                                                    arrayList.add(obj13);
                                                }
                                            }
                                            JobKt.launch$default(coroutineScope2, null, null, new DbSessionManager$updateDb$2(transferStockPresenter2, withHoldings2, ((AmountSelection.TradeAll) CollectionsKt.first((List) arrayList)).shareUnits, mutableState12, mutableState13, mutableState6, channel, null, 8), 3);
                                            mutableState4.setValue(Boolean.TRUE);
                                        } else {
                                            if (!(transferStockViewEvent instanceof TransferStockViewEvent.AmountEntered)) {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                return null;
                                            }
                                            mutableState15.setValue(((TransferStockViewEvent.AmountEntered) transferStockViewEvent).rawAmount);
                                        }
                                    }
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(flowCollector, this) == coroutineSingletons) {
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
                InvestingStockDetailsPresenter investingStockDetailsPresenter = (InvestingStockDetailsPresenter) moleculePresenter;
                ProduceStateScope produceStateScope = (ProduceStateScope) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    HistoricalRange historicalRange = (HistoricalRange) obj11;
                    GraphPresenterData graphPresenterData = (GraphPresenterData) this.$forceExpansion$delegate$inlined.getValue();
                    InvestingGraphViewEvent.ScrubPoint scrubPoint = (InvestingGraphViewEvent.ScrubPoint) this.$dialogContent$delegate$inlined.getValue();
                    InvestingGraphContentModel.Point point = scrubPoint != null ? scrubPoint.point : null;
                    Loaded loaded = (Loaded) this.$amountSelection$delegate$inlined.getValue();
                    Investment_holding investment_holding = loaded != null ? (Investment_holding) loaded.value : null;
                    StockDetails stockDetails = (StockDetails) this.$balanceSnapshot$delegate$inlined.getValue();
                    InvestingCryptoRecurringPurchaseTileViewModel investingCryptoRecurringPurchaseTileViewModel = (InvestingCryptoRecurringPurchaseTileViewModel) obj10;
                    List list = (List) this.$savedState$delegate$inlined.getValue();
                    InvestingCryptoNewsViewModel investingCryptoNewsViewModel = (InvestingCryptoNewsViewModel) obj9;
                    X509CertUtils x509CertUtils = (X509CertUtils) obj8;
                    InvestingEarningsViewModel investingEarningsViewModel = (InvestingEarningsViewModel) obj7;
                    X509CertChainUtils x509CertChainUtils = (X509CertChainUtils) obj6;
                    InvestingDetailTileViewModel investingDetailTileViewModel = (InvestingDetailTileViewModel) obj5;
                    UiCallbackModel uiCallbackModel = (UiCallbackModel) obj4;
                    InvestingEtfHoldingsViewModel investingEtfHoldingsViewModel = (InvestingEtfHoldingsViewModel) obj3;
                    Investing_settings investing_settings = (Investing_settings) obj2;
                    String str = investing_settings != null ? investing_settings.entity_details_disclosure_text : null;
                    if (!investingStockDetailsPresenter.serverDrivenDisclosuresEnabled) {
                        str = null;
                    }
                    if (str == null) {
                        str = investingStockDetailsPresenter.stringManager.get(R.string.investing_components_see_disclosures);
                    }
                    this.L$0 = null;
                    this.$flow = produceStateScope;
                    this.label = 1;
                    withContext = JobKt.withContext(investingStockDetailsPresenter.ioDispatcher, new InvestingStockDetailsPresenter$createViewModel$2(stockDetails, graphPresenterData, investingStockDetailsPresenter, historicalRange, point, list, this.$submitButtonEnabled$inlined, investment_holding, uiCallbackModel, investingDetailTileViewModel, investingCryptoNewsViewModel, investingCryptoRecurringPurchaseTileViewModel, x509CertUtils, investingEarningsViewModel, x509CertChainUtils, investingEtfHoldingsViewModel, str, null), this);
                    if (withContext == coroutineSingletons2) {
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    produceStateScope = (ProduceStateScope) this.$flow;
                    SafeTrace.throwOnFailure(obj);
                    withContext = obj;
                }
                produceStateScope.setValue(withContext);
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferStockPresenter$models$$inlined$CollectEffect$1(InvestingStockDetailsPresenter investingStockDetailsPresenter, HistoricalRange historicalRange, boolean z, InvestingCryptoRecurringPurchaseTileViewModel investingCryptoRecurringPurchaseTileViewModel, InvestingCryptoNewsViewModel investingCryptoNewsViewModel, X509CertUtils x509CertUtils, InvestingEarningsViewModel investingEarningsViewModel, X509CertChainUtils x509CertChainUtils, InvestingDetailTileViewModel investingDetailTileViewModel, UiCallbackModel uiCallbackModel, InvestingEtfHoldingsViewModel investingEtfHoldingsViewModel, Investing_settings investing_settings, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, Continuation continuation) {
        super(2, continuation);
        this.this$0 = investingStockDetailsPresenter;
        this.$entity$inlined = historicalRange;
        this.$submitButtonEnabled$inlined = z;
        this.$subtitle$inlined = investingCryptoRecurringPurchaseTileViewModel;
        this.$rawAmountEntered$delegate$inlined = investingCryptoNewsViewModel;
        this.$stockDetails$delegate$inlined = x509CertUtils;
        this.$amountSelections$delegate$inlined = investingEarningsViewModel;
        this.$requestInFlight$delegate$inlined = x509CertChainUtils;
        this.$expanded$delegate$inlined = investingDetailTileViewModel;
        this.$amountCentsEntered$delegate$inlined = uiCallbackModel;
        this.$settings$delegate$inlined = investingEtfHoldingsViewModel;
        this.$initiateRequestEvent$inlined = investing_settings;
        this.$forceExpansion$delegate$inlined = mutableState;
        this.$dialogContent$delegate$inlined = mutableState2;
        this.$amountSelection$delegate$inlined = mutableState3;
        this.$balanceSnapshot$delegate$inlined = mutableState4;
        this.$savedState$delegate$inlined = mutableState5;
    }
}
