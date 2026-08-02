package com.squareup.cash.investing.components;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$1;
import androidx.recyclerview.widget.FastScroller;
import androidx.room.RoomDatabase$performClear$1;
import androidx.viewbinding.ViewBindings;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.local.presenters.LocalCashBalancePresenter;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.blockers.views.FileBlockerView$6$2$1;
import com.squareup.cash.card.onboarding.CardStudioUndoDialogPresenter;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.card.onboarding.core.CardScene$applyIconToMaterial$1;
import com.squareup.cash.cdf.stock.EquityType;
import com.squareup.cash.cdf.stock.ScreenSource;
import com.squareup.cash.cdf.stock.StockToggleToggleDividendReinvestments;
import com.squareup.cash.checks.VerifyCheckDialogPresenter;
import com.squareup.cash.clientsync.models.SyncTrigger;
import com.squareup.cash.clientsync.pipeline.SyncScope;
import com.squareup.cash.clientsync.syncer.ClientSyncer$Result;
import com.squareup.cash.clientsync.syncer.RealClientSyncer;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.family.familyhub.backend.api.DependentPortfolio;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.backend.api.InvestingPerformanceSyncerKt;
import com.squareup.cash.investing.backend.api.PolledData;
import com.squareup.cash.investing.backend.api.StockDetails;
import com.squareup.cash.investing.backend.real.RealHistoricalPriceTickRefresher;
import com.squareup.cash.investing.backend.real.RealInvestmentPerformanceSyncer;
import com.squareup.cash.investing.backend.real.families.RealDependentInvestmentEntities;
import com.squareup.cash.investing.db.InvestmentEntityQueries;
import com.squareup.cash.investing.db.InvestmentEntityQueries$$ExternalSyntheticLambda7;
import com.squareup.cash.investing.db.InvestmentEntityQueries$forTokens$2;
import com.squareup.cash.investing.db.Investment_entity;
import com.squareup.cash.investing.presenters.InvestingPortfolioPresenter;
import com.squareup.cash.investing.presenters.autoinvest.CancelRecurringBitcoinPurchasePresenter;
import com.squareup.cash.investing.presenters.autoinvest.InvestingRecurringFrequencyPickerFullPresenter;
import com.squareup.cash.investing.presenters.custom.order.InvestingOrderTypeSelectionPresenter;
import com.squareup.cash.investing.presenters.families.InvestingDependentAutoInvestPresenter;
import com.squareup.cash.investing.presenters.settings.InvestingSettingsPresenter;
import com.squareup.cash.investing.presenters.stockdetails.InvestingStockDetailsPresenter;
import com.squareup.cash.investing.presenters.teengraduation.StocksTransferEtaSheetPresenter;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.investing.viewmodels.InvestingStockDetailsViewEvent;
import com.squareup.cash.investing.viewmodels.InvestingStockSelectionViewEvent;
import com.squareup.cash.investing.viewmodels.drip.DividendReinvestmentSettingViewEvent;
import com.squareup.cash.investing.viewmodels.exchange.InvestingExchangeViewModel;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.offers.db.OffersSheetQueries$ForSheetKeyQuery;
import com.squareup.cash.offers.presenters.OffersDetailsPresenterV2$models$1$1$1;
import com.squareup.cash.offers.presenters.OffersFilterGroupSheetPresenter$models$sheet$2$1$1;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.profile.presenters.ProfilePresenter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.cash.taptopay.presenters.TapToPayPresenter;
import com.squareup.cash.work.presenters.WorkHomePresenter;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.cryptoinvestflow.service.DisableRecurringCryptoBuyInitiationData;
import com.squareup.protos.cash.investcustomer.api.v1.drip.DividendSetting;
import com.squareup.protos.cash.investcustomer.api.v1.drip.InvestCustomerDripService;
import com.squareup.protos.cash.investcustomer.api.v1.drip.SetCustomerDividendSettingsRequest;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.cash.portfolios.GetPortfoliosPerformanceRequest;
import com.squareup.protos.cash.portfolios.PortfoliosService;
import com.squareup.protos.franklin.app.GetFlowRequest;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.SyncInvestmentHolding;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import com.squareup.util.compose.StateFlowKt$receiveValueAsState$1$1$1;
import com.squareup.util.coroutines.Signal;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.TickerKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import okhttp3.MultipartBody;
import okio.ByteString;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class InvestingHomeView$onScrollFlow$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InvestingHomeView$onScrollFlow$1(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$1 = obj;
        this.this$0 = obj2;
        this.L$0 = obj3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        switch (i) {
            case 0:
                InvestingHomeView$onScrollFlow$1 investingHomeView$onScrollFlow$1 = new InvestingHomeView$onScrollFlow$1((InvestingHomeView) obj2, continuation);
                investingHomeView$onScrollFlow$1.L$0 = obj;
                return investingHomeView$onScrollFlow$1;
            case 1:
                InvestingHomeView$onScrollFlow$1 investingHomeView$onScrollFlow$12 = new InvestingHomeView$onScrollFlow$1((RealHistoricalPriceTickRefresher) this.L$1, (HistoricalRange) obj2, continuation, 1);
                investingHomeView$onScrollFlow$12.L$0 = obj;
                return investingHomeView$onScrollFlow$12;
            case 2:
                return new InvestingHomeView$onScrollFlow$1((InvestmentEntityToken) this.L$1, (String) obj2, (RealInvestmentPerformanceSyncer) this.L$0, continuation, 2);
            case 3:
                return new InvestingHomeView$onScrollFlow$1((InvestingExchangeViewModel) this.L$1, (RealSheetState) obj2, (MutableState) this.L$0, continuation, 3);
            case 4:
                InvestingHomeView$onScrollFlow$1 investingHomeView$onScrollFlow$13 = new InvestingHomeView$onScrollFlow$1((Flow) this.L$1, continuation, (DisclosurePresenter) obj2, 4);
                investingHomeView$onScrollFlow$13.L$0 = obj;
                return investingHomeView$onScrollFlow$13;
            case 5:
                return new InvestingHomeView$onScrollFlow$1((MoleculePresenter) obj2, (MutableState) this.L$0, continuation, 5);
            case 6:
                return new InvestingHomeView$onScrollFlow$1((DependentPortfolio) this.L$1, (LocalCashBalancePresenter) obj2, (Ref$ObjectRef) this.L$0, continuation, 6);
            case 7:
                InvestingHomeView$onScrollFlow$1 investingHomeView$onScrollFlow$14 = new InvestingHomeView$onScrollFlow$1((Flow) this.L$1, continuation, (VerifyCheckDialogPresenter) obj2, 7);
                investingHomeView$onScrollFlow$14.L$0 = obj;
                return investingHomeView$onScrollFlow$14;
            case 8:
                InvestingHomeView$onScrollFlow$1 investingHomeView$onScrollFlow$15 = new InvestingHomeView$onScrollFlow$1((Flow) this.L$1, continuation, (ProfilePresenter) obj2, 8);
                investingHomeView$onScrollFlow$15.L$0 = obj;
                return investingHomeView$onScrollFlow$15;
            case 9:
                return new InvestingHomeView$onScrollFlow$1((DependentPortfolio) this.L$1, (MutableStateFlow) obj2, (InvestingPortfolioPresenter) this.L$0, continuation, 9);
            case 10:
                return new InvestingHomeView$onScrollFlow$1((TapToPayPresenter) this.L$1, (InvestingStockSelectionViewEvent) obj2, (MutableState) this.L$0, continuation, 10);
            case 11:
                InvestingHomeView$onScrollFlow$1 investingHomeView$onScrollFlow$16 = new InvestingHomeView$onScrollFlow$1((Flow) this.L$1, continuation, (PoolsListPresenter) obj2, 11);
                investingHomeView$onScrollFlow$16.L$0 = obj;
                return investingHomeView$onScrollFlow$16;
            case 12:
                InvestingHomeView$onScrollFlow$1 investingHomeView$onScrollFlow$17 = new InvestingHomeView$onScrollFlow$1((Flow) this.L$1, continuation, (MusicPresenter) obj2, 12);
                investingHomeView$onScrollFlow$17.L$0 = obj;
                return investingHomeView$onScrollFlow$17;
            case 13:
                InvestingHomeView$onScrollFlow$1 investingHomeView$onScrollFlow$18 = new InvestingHomeView$onScrollFlow$1((Flow) this.L$1, continuation, (LocalEditorialPresenter) obj2, 13);
                investingHomeView$onScrollFlow$18.L$0 = obj;
                return investingHomeView$onScrollFlow$18;
            case 14:
                InvestingHomeView$onScrollFlow$1 investingHomeView$onScrollFlow$19 = new InvestingHomeView$onScrollFlow$1((Flow) this.L$1, continuation, (LocalHomePresenter) obj2, 14);
                investingHomeView$onScrollFlow$19.L$0 = obj;
                return investingHomeView$onScrollFlow$19;
            case 15:
                return new InvestingHomeView$onScrollFlow$1((MoleculePresenter) obj2, (MutableState) this.L$0, continuation, 15);
            case 16:
                InvestingHomeView$onScrollFlow$1 investingHomeView$onScrollFlow$110 = new InvestingHomeView$onScrollFlow$1((Flow) this.L$1, continuation, (InvestingRecurringFrequencyPickerFullPresenter) obj2, 16);
                investingHomeView$onScrollFlow$110.L$0 = obj;
                return investingHomeView$onScrollFlow$110;
            case 17:
                InvestingHomeView$onScrollFlow$1 investingHomeView$onScrollFlow$111 = new InvestingHomeView$onScrollFlow$1((Flow) this.L$1, continuation, (MusicPresenter) obj2, 17);
                investingHomeView$onScrollFlow$111.L$0 = obj;
                return investingHomeView$onScrollFlow$111;
            case 18:
                InvestingHomeView$onScrollFlow$1 investingHomeView$onScrollFlow$112 = new InvestingHomeView$onScrollFlow$1((Flow) this.L$1, continuation, (InvestingOrderTypeSelectionPresenter) obj2, 18);
                investingHomeView$onScrollFlow$112.L$0 = obj;
                return investingHomeView$onScrollFlow$112;
            case 19:
                InvestingHomeView$onScrollFlow$1 investingHomeView$onScrollFlow$113 = new InvestingHomeView$onScrollFlow$1((Flow) this.L$1, continuation, (CardStudioUndoDialogPresenter) obj2, 19);
                investingHomeView$onScrollFlow$113.L$0 = obj;
                return investingHomeView$onScrollFlow$113;
            case 20:
                return new InvestingHomeView$onScrollFlow$1((DividendReinvestmentSettingViewEvent) this.L$1, (LocalCashBalancePresenter) obj2, (MutableState) this.L$0, continuation, 20);
            case 21:
                InvestingHomeView$onScrollFlow$1 investingHomeView$onScrollFlow$114 = new InvestingHomeView$onScrollFlow$1((Flow) this.L$1, continuation, (InvestingDependentAutoInvestPresenter) obj2, 21);
                investingHomeView$onScrollFlow$114.L$0 = obj;
                return investingHomeView$onScrollFlow$114;
            case 22:
                InvestingHomeView$onScrollFlow$1 investingHomeView$onScrollFlow$115 = new InvestingHomeView$onScrollFlow$1((InvestingDependentAutoInvestPresenter) this.L$1, (String) obj2, continuation, 22);
                investingHomeView$onScrollFlow$115.L$0 = obj;
                return investingHomeView$onScrollFlow$115;
            case 23:
                InvestingHomeView$onScrollFlow$1 investingHomeView$onScrollFlow$116 = new InvestingHomeView$onScrollFlow$1((Flow) this.L$1, continuation, (WorkHomePresenter) obj2, 23);
                investingHomeView$onScrollFlow$116.L$0 = obj;
                return investingHomeView$onScrollFlow$116;
            case 24:
                InvestingHomeView$onScrollFlow$1 investingHomeView$onScrollFlow$117 = new InvestingHomeView$onScrollFlow$1((Flow) this.L$1, continuation, (InvestingSettingsPresenter) obj2, 24);
                investingHomeView$onScrollFlow$117.L$0 = obj;
                return investingHomeView$onScrollFlow$117;
            case 25:
                return new InvestingHomeView$onScrollFlow$1((InvestingStockDetailsPresenter) this.L$1, (InvestingStockDetailsViewEvent) obj2, (MutableState) this.L$0, continuation, 25);
            case 26:
                return new InvestingHomeView$onScrollFlow$1((InvestingStockDetailsPresenter) this.L$1, (SyncInvestmentHolding.InvestmentHoldingState) obj2, (MutableState) this.L$0, continuation, 26);
            case 27:
                InvestingHomeView$onScrollFlow$1 investingHomeView$onScrollFlow$118 = new InvestingHomeView$onScrollFlow$1(this.L$1, obj2, continuation, 27);
                investingHomeView$onScrollFlow$118.L$0 = obj;
                return investingHomeView$onScrollFlow$118;
            case 28:
                InvestingHomeView$onScrollFlow$1 investingHomeView$onScrollFlow$119 = new InvestingHomeView$onScrollFlow$1((Flow) this.L$1, continuation, (StocksTransferEtaSheetPresenter) obj2, 28);
                investingHomeView$onScrollFlow$119.L$0 = obj;
                return investingHomeView$onScrollFlow$119;
            default:
                InvestingHomeView$onScrollFlow$1 investingHomeView$onScrollFlow$120 = new InvestingHomeView$onScrollFlow$1((Flow) this.L$1, continuation, (StocksTransferEtaSheetPresenter) obj2, 29);
                investingHomeView$onScrollFlow$120.L$0 = obj;
                return investingHomeView$onScrollFlow$120;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((InvestingHomeView$onScrollFlow$1) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                break;
        }
        return ((InvestingHomeView$onScrollFlow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x02a9, code lost:
    
        if (r0.set(r1, r23) == r3) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0279, code lost:
    
        if (r4 == r3) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0544, code lost:
    
        r3.add(new kotlin.Pair(r4, r8.second));
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x05c8, code lost:
    
        if (((kotlinx.coroutines.flow.Flow) r0).collect(r1, r23) == r2) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x05b6, code lost:
    
        if (r0 == r2) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x05e2, code lost:
    
        if (kotlin.Unit.INSTANCE == r2) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0696, code lost:
    
        if (((kotlinx.coroutines.flow.Flow) r1).collect(r2, r23) == r0) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x0682, code lost:
    
        if (r1 == r0) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x0796, code lost:
    
        if (r2 == r1) goto L356;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object portfoliosPerformance;
        Object awaitInternal;
        MutableState mutableState;
        Object followingStocks;
        Object ownedStocks;
        MutableState mutableState2;
        Object flow;
        StockToggleToggleDividendReinvestments.DividendReinvestmentStatus dividendReinvestmentStatus;
        Object customerDividendSettings;
        int i = this.$r8$classId;
        int i2 = 0;
        int i3 = 7;
        int i4 = 10;
        int i5 = 5;
        int i6 = 4;
        int i7 = 3;
        int i8 = 2;
        Object obj2 = this.this$0;
        int i9 = 1;
        RequestContext requestContext = null;
        Object[] objArr = 0;
        switch (i) {
            case 0:
                InvestingHomeView investingHomeView = (InvestingHomeView) obj2;
                ProducerScope producerScope = (ProducerScope) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                try {
                    if (i10 != 0) {
                        if (i10 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        throw new KotlinNothingValueException();
                    }
                    SafeTrace.throwOnFailure(obj);
                    investingHomeView.getContent$components().addOnScrollListener(new FastScroller.AnonymousClass2(producerScope, i8));
                    this.L$0 = null;
                    this.L$1 = investingHomeView;
                    this.label = 1;
                    JobKt.awaitCancellation(this);
                    return coroutineSingletons;
                } catch (Throwable th) {
                    investingHomeView.getContent$components().setOnScrollChangeListener(null);
                    throw th;
                }
            case 1:
                RealHistoricalPriceTickRefresher realHistoricalPriceTickRefresher = (RealHistoricalPriceTickRefresher) this.L$1;
                ProducerScope producerScope2 = (ProducerScope) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1 = new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(realHistoricalPriceTickRefresher.stocksActive, realHistoricalPriceTickRefresher.stocksActiveOverride, new FileBlockerView$6$2$1(i7, objArr == true ? 1 : 0, i7), i2);
                    RoomDatabase$performClear$1.AnonymousClass1 anonymousClass1 = new RoomDatabase$performClear$1.AnonymousClass1(realHistoricalPriceTickRefresher, (HistoricalRange) obj2, producerScope2, (Continuation) null);
                    this.L$0 = null;
                    this.label = 1;
                    if (FlowKt.collectLatest(flowKt__ZipKt$combine$$inlined$unsafeFlow$1, anonymousClass1, this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i11 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 2:
                String str = (String) obj2;
                RealInvestmentPerformanceSyncer realInvestmentPerformanceSyncer = (RealInvestmentPerformanceSyncer) this.L$0;
                InvestmentEntityToken investmentEntityToken = (InvestmentEntityToken) this.L$1;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                Continuation continuation = null;
                Object[] objArr2 = 0;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    GetPortfoliosPerformanceRequest getPortfoliosPerformanceRequest = Intrinsics.areEqual(investmentEntityToken, InvestingPerformanceSyncerKt.PORTFOLIO_TOKEN) ? new GetPortfoliosPerformanceRequest((String) (objArr2 == true ? 1 : 0), str, i5) : new GetPortfoliosPerformanceRequest(investmentEntityToken.value, str, i6);
                    PortfoliosService portfoliosService = realInvestmentPerformanceSyncer.service;
                    this.label = 1;
                    portfoliosPerformance = portfoliosService.getPortfoliosPerformance(getPortfoliosPerformanceRequest, this);
                    break;
                } else {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    portfoliosPerformance = obj;
                }
                ApiResult apiResult = (ApiResult) portfoliosPerformance;
                Signal signal = realInvestmentPerformanceSyncer.signOutSignal;
                CardScene$applyIconToMaterial$1 cardScene$applyIconToMaterial$1 = new CardScene$applyIconToMaterial$1(apiResult, realInvestmentPerformanceSyncer, investmentEntityToken, continuation, 3);
                this.label = 2;
                Object until = StateFlowKt.until(signal, cardScene$applyIconToMaterial$1, this);
                if (until != coroutineSingletons3) {
                    return until;
                }
                return coroutineSingletons3;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MutableState mutableState3 = (MutableState) this.L$0;
                    int i14 = ArcadeMigrationUtilsKt$investingCryptoExchangeView$1.$r8$clinit;
                    if (((Boolean) mutableState3.getValue()).booleanValue()) {
                        return Unit.INSTANCE;
                    }
                    if (((InvestingExchangeViewModel) this.L$1) instanceof InvestingExchangeViewModel.Content.FullScreenContent) {
                        this.label = 1;
                        if (((RealSheetState) obj2).expand(this) == coroutineSingletons4) {
                            return coroutineSingletons4;
                        }
                    }
                } else {
                    if (i13 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 4:
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow2 = (Flow) this.L$1;
                    InvestingHomeView$2$1 investingHomeView$2$1 = new InvestingHomeView$2$1(coroutineScope, (DisclosurePresenter) obj2, 25);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow2.collect(investingHomeView$2$1, this) == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                } else {
                    if (i15 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MutableState mutableState4 = (MutableState) this.L$0;
                    CompletableDeferredImpl sync = ((RealClientSyncer) ((DisclosurePresenter) obj2).appService).sync(SyncTrigger.BLOCKING_USER_ACTION, SyncScope.Global.INSTANCE);
                    this.L$1 = mutableState4;
                    this.label = 1;
                    awaitInternal = sync.awaitInternal(this);
                    if (awaitInternal == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                    mutableState = mutableState4;
                } else {
                    if (i16 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mutableState = (MutableState) this.L$1;
                    SafeTrace.throwOnFailure(obj);
                    awaitInternal = obj;
                }
                mutableState.setValue((ClientSyncer$Result) awaitInternal);
                return Unit.INSTANCE;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    DependentPortfolio dependentPortfolio = (DependentPortfolio) this.L$1;
                    if (dependentPortfolio instanceof DependentPortfolio.Loaded) {
                        RealDependentInvestmentEntities realDependentInvestmentEntities = (RealDependentInvestmentEntities) ((LocalCashBalancePresenter) obj2).launcher;
                        List list = ((DependentPortfolio.Loaded) dependentPortfolio).investmentHoldings;
                        this.label = 1;
                        followingStocks = realDependentInvestmentEntities.getFollowingStocks(list, this);
                        break;
                    }
                    return Unit.INSTANCE;
                }
                if (i17 != 1) {
                    if (i17 == 2) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                followingStocks = obj;
                StateFlowKt$receiveValueAsState$1$1$1 stateFlowKt$receiveValueAsState$1$1$1 = new StateFlowKt$receiveValueAsState$1$1$1(i9, (Ref$ObjectRef) this.L$0);
                this.label = 2;
                break;
            case 7:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow3 = (Flow) this.L$1;
                    InvestingHomeView$2$1 investingHomeView$2$12 = new InvestingHomeView$2$1(coroutineScope2, (VerifyCheckDialogPresenter) obj2, 26);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow3.collect(investingHomeView$2$12, this) == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                } else {
                    if (i18 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 8:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow4 = (Flow) this.L$1;
                    RepeatClicksOnLongPress$attachTo$2$1 repeatClicksOnLongPress$attachTo$2$1 = new RepeatClicksOnLongPress$attachTo$2$1(19, coroutineScope3, (ProfilePresenter) obj2);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow4.collect(repeatClicksOnLongPress$attachTo$2$1, this) == coroutineSingletons9) {
                        return coroutineSingletons9;
                    }
                } else {
                    if (i19 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 9:
                MutableStateFlow mutableStateFlow = (MutableStateFlow) obj2;
                DependentPortfolio dependentPortfolio2 = (DependentPortfolio) this.L$1;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 != 0) {
                    if (i20 != 1) {
                        if (i20 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            ownedStocks = obj;
                            InvestingHomeView$2$1 investingHomeView$2$13 = new InvestingHomeView$2$1(mutableStateFlow, 28);
                            this.label = 3;
                            break;
                        } else if (i20 != 3) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    SafeTrace.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                SafeTrace.throwOnFailure(obj);
                if (!dependentPortfolio2.equals(DependentPortfolio.Loading.INSTANCE) && !dependentPortfolio2.equals(DependentPortfolio.FailedToLoad.INSTANCE)) {
                    if (!(dependentPortfolio2 instanceof DependentPortfolio.Loaded)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    RealDependentInvestmentEntities realDependentInvestmentEntities2 = ((InvestingPortfolioPresenter) this.L$0).dependentInvestmentEntities;
                    List list2 = ((DependentPortfolio.Loaded) dependentPortfolio2).investmentHoldings;
                    this.label = 2;
                    ownedStocks = realDependentInvestmentEntities2.getOwnedStocks(list2, this);
                    break;
                } else {
                    PolledData polledData = new PolledData(EmptyList.INSTANCE, false);
                    this.label = 1;
                    StateFlowImpl stateFlowImpl = (StateFlowImpl) mutableStateFlow;
                    stateFlowImpl.getClass();
                    stateFlowImpl.updateState(null, polledData);
                    break;
                }
                return coroutineSingletons10;
            case 10:
                MutableState mutableState5 = (MutableState) this.L$0;
                TapToPayPresenter tapToPayPresenter = (TapToPayPresenter) this.L$1;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    InvestmentEntityQueries investmentEntityQueries = ((CashAccountDatabaseImpl) tapToPayPresenter.tapToPayAnalyticsHelper).investmentEntityQueries;
                    Set set = (Set) mutableState5.getValue();
                    investmentEntityQueries.getClass();
                    set.getClass();
                    InvestmentEntityQueries$forTokens$2 investmentEntityQueries$forTokens$2 = InvestmentEntityQueries$forTokens$2.INSTANCE;
                    List<Investment_entity> executeAsList = new OffersSheetQueries$ForSheetKeyQuery(investmentEntityQueries, set, new InvestmentEntityQueries$$ExternalSyntheticLambda7(investmentEntityQueries, i8)).executeAsList();
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(executeAsList, 10));
                    for (Investment_entity investment_entity : executeAsList) {
                        arrayList.add(new Pair(investment_entity.token, investment_entity.symbol));
                    }
                    Set<String> set2 = (Set) mutableState5.getValue();
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    for (String str2 : set2) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Pair pair = (Pair) it.next();
                            if (Intrinsics.areEqual(pair.first, str2)) {
                                break;
                            }
                        }
                        OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
                        return null;
                        break;
                    }
                    ((InvestingStockSelectionViewEvent.SubmitMultiSelection) ((InvestingStockSelectionViewEvent) obj2)).getClass();
                    InvestingStockSelectionViewEvent.SubmitMultiSelection submitMultiSelection = new InvestingStockSelectionViewEvent.SubmitMultiSelection(linkedHashSet);
                    this.label = 1;
                    if (TapToPayPresenter.access$submitSelection(tapToPayPresenter, submitMultiSelection, this) == coroutineSingletons11) {
                        return coroutineSingletons11;
                    }
                } else {
                    if (i21 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 11:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow5 = (Flow) this.L$1;
                    InvestingHomeView$2$1 investingHomeView$2$14 = new InvestingHomeView$2$1(coroutineScope4, (PoolsListPresenter) obj2, 29);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow5.collect(investingHomeView$2$14, this) == coroutineSingletons12) {
                        return coroutineSingletons12;
                    }
                } else {
                    if (i22 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 12:
                CoroutineScope coroutineScope5 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow6 = (Flow) this.L$1;
                    OffersDetailsPresenterV2$models$1$1$1 offersDetailsPresenterV2$models$1$1$1 = new OffersDetailsPresenterV2$models$1$1$1(coroutineScope5, (MusicPresenter) obj2, i9);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow6.collect(offersDetailsPresenterV2$models$1$1$1, this) == coroutineSingletons13) {
                        return coroutineSingletons13;
                    }
                } else {
                    if (i23 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 13:
                CoroutineScope coroutineScope6 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow7 = (Flow) this.L$1;
                    RepeatClicksOnLongPress$attachTo$2$1 repeatClicksOnLongPress$attachTo$2$12 = new RepeatClicksOnLongPress$attachTo$2$1(21, coroutineScope6, (LocalEditorialPresenter) obj2);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow7.collect(repeatClicksOnLongPress$attachTo$2$12, this) == coroutineSingletons14) {
                        return coroutineSingletons14;
                    }
                } else {
                    if (i24 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 14:
                CoroutineScope coroutineScope7 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow8 = (Flow) this.L$1;
                    OffersDetailsPresenterV2$models$1$1$1 offersDetailsPresenterV2$models$1$1$12 = new OffersDetailsPresenterV2$models$1$1$1(coroutineScope7, (LocalHomePresenter) obj2, i8);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow8.collect(offersDetailsPresenterV2$models$1$1$12, this) == coroutineSingletons15) {
                        return coroutineSingletons15;
                    }
                } else {
                    if (i25 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 15:
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    mutableState2 = (MutableState) this.L$0;
                    CancelRecurringBitcoinPurchasePresenter cancelRecurringBitcoinPurchasePresenter = (CancelRecurringBitcoinPurchasePresenter) obj2;
                    this.L$1 = mutableState2;
                    this.label = 1;
                    flow = cancelRecurringBitcoinPurchasePresenter.appService.getFlow("/2.0/cash/get-flow", null, null, new GetFlowRequest(requestContext, new GetFlowRequest.Input.InitiationData(ViewBindings.buildInitiationData(Flow$Type.DISABLE_RECURRING_CRYPTO_BUY, new DisableRecurringCryptoBuyInitiationData(null, new RecurringSchedule(cancelRecurringBitcoinPurchasePresenter.args.frequency, (List) null, (String) null, (Integer) null, 30), ByteString.EMPTY))), i5), this);
                    if (flow == coroutineSingletons16) {
                        return coroutineSingletons16;
                    }
                } else {
                    if (i26 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    MutableState mutableState6 = (MutableState) this.L$1;
                    SafeTrace.throwOnFailure(obj);
                    mutableState2 = mutableState6;
                    flow = obj;
                }
                mutableState2.setValue((ApiResult) flow);
                return Unit.INSTANCE;
            case 16:
                CoroutineScope coroutineScope8 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.label;
                if (i27 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow9 = (Flow) this.L$1;
                    RepeatClicksOnLongPress$attachTo$2$1 repeatClicksOnLongPress$attachTo$2$13 = new RepeatClicksOnLongPress$attachTo$2$1(22, coroutineScope8, (InvestingRecurringFrequencyPickerFullPresenter) obj2);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow9.collect(repeatClicksOnLongPress$attachTo$2$13, this) == coroutineSingletons17) {
                        return coroutineSingletons17;
                    }
                } else {
                    if (i27 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 17:
                CoroutineScope coroutineScope9 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.label;
                if (i28 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow10 = (Flow) this.L$1;
                    OffersDetailsPresenterV2$models$1$1$1 offersDetailsPresenterV2$models$1$1$13 = new OffersDetailsPresenterV2$models$1$1$1(coroutineScope9, (MusicPresenter) obj2, i7);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow10.collect(offersDetailsPresenterV2$models$1$1$13, this) == coroutineSingletons18) {
                        return coroutineSingletons18;
                    }
                } else {
                    if (i28 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 18:
                CoroutineScope coroutineScope10 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.label;
                if (i29 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow11 = (Flow) this.L$1;
                    OffersDetailsPresenterV2$models$1$1$1 offersDetailsPresenterV2$models$1$1$14 = new OffersDetailsPresenterV2$models$1$1$1(coroutineScope10, (InvestingOrderTypeSelectionPresenter) obj2, i6);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow11.collect(offersDetailsPresenterV2$models$1$1$14, this) == coroutineSingletons19) {
                        return coroutineSingletons19;
                    }
                } else {
                    if (i29 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 19:
                CoroutineScope coroutineScope11 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.label;
                if (i30 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow12 = (Flow) this.L$1;
                    OffersDetailsPresenterV2$models$1$1$1 offersDetailsPresenterV2$models$1$1$15 = new OffersDetailsPresenterV2$models$1$1$1(coroutineScope11, (CardStudioUndoDialogPresenter) obj2, i5);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow12.collect(offersDetailsPresenterV2$models$1$1$15, this) == coroutineSingletons20) {
                        return coroutineSingletons20;
                    }
                } else {
                    if (i30 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 20:
                MutableState mutableState7 = (MutableState) this.L$0;
                DividendReinvestmentSettingViewEvent dividendReinvestmentSettingViewEvent = (DividendReinvestmentSettingViewEvent) this.L$1;
                LocalCashBalancePresenter localCashBalancePresenter = (LocalCashBalancePresenter) obj2;
                InvestingScreens.DividendReinvestmentSettingScreen dividendReinvestmentSettingScreen = (InvestingScreens.DividendReinvestmentSettingScreen) localCashBalancePresenter.clock;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.label;
                if (i31 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    DividendReinvestmentSettingViewEvent.EntryToggled entryToggled = (DividendReinvestmentSettingViewEvent.EntryToggled) dividendReinvestmentSettingViewEvent;
                    mutableState7.setValue(Boolean.valueOf(entryToggled.check));
                    Analytics analytics = (Analytics) localCashBalancePresenter.analytics;
                    ScreenSource screenSource = dividendReinvestmentSettingScreen.screenSource;
                    boolean z = entryToggled.check;
                    if (z) {
                        dividendReinvestmentStatus = StockToggleToggleDividendReinvestments.DividendReinvestmentStatus.REINVEST;
                    } else {
                        if (z) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        dividendReinvestmentStatus = StockToggleToggleDividendReinvestments.DividendReinvestmentStatus.PAYOUT;
                    }
                    analytics.track(new StockToggleToggleDividendReinvestments(screenSource, dividendReinvestmentStatus), null);
                    InvestCustomerDripService investCustomerDripService = (InvestCustomerDripService) localCashBalancePresenter.launcher;
                    SetCustomerDividendSettingsRequest setCustomerDividendSettingsRequest = new SetCustomerDividendSettingsRequest(entryToggled.check ? DividendSetting.REINVEST : DividendSetting.PAYOUT, new RequestContext(null, null, null, null, null, null, null, null, 8191), ByteString.EMPTY);
                    this.label = 1;
                    customerDividendSettings = investCustomerDripService.setCustomerDividendSettings(setCustomerDividendSettingsRequest, this);
                    break;
                } else {
                    if (i31 != 1) {
                        if (i31 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    customerDividendSettings = obj;
                }
                ApiResult apiResult2 = (ApiResult) customerDividendSettings;
                if (apiResult2 instanceof ApiResult.Failure) {
                    mutableState7.setValue(null);
                    ((BetterNavigator.ScreenNavigator) localCashBalancePresenter.navigator).goTo(TickerKt.toMessageScreen$default((ApiResult.Failure) apiResult2, dividendReinvestmentSettingScreen, (AndroidStringManager) localCashBalancePresenter.stringManager));
                } else if (((DividendReinvestmentSettingViewEvent.EntryToggled) dividendReinvestmentSettingViewEvent).check) {
                    KeyValue keyValue = (KeyValue) localCashBalancePresenter.service;
                    Boolean bool = Boolean.TRUE;
                    this.label = 2;
                    break;
                }
                return Unit.INSTANCE;
            case 21:
                CoroutineScope coroutineScope12 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = this.label;
                if (i32 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow13 = (Flow) this.L$1;
                    OffersDetailsPresenterV2$models$1$1$1 offersDetailsPresenterV2$models$1$1$16 = new OffersDetailsPresenterV2$models$1$1$1(coroutineScope12, (InvestingDependentAutoInvestPresenter) obj2, 6);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow13.collect(offersDetailsPresenterV2$models$1$1$16, this) == coroutineSingletons22) {
                        return coroutineSingletons22;
                    }
                } else {
                    if (i32 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 22:
                ProduceStateScope produceStateScope = (ProduceStateScope) this.L$0;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i33 = this.label;
                if (i33 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow stockDetails = ((InvestingDependentAutoInvestPresenter) this.L$1).investmentEntities.stockDetails(new InvestmentEntityToken((String) obj2));
                    FlowExtKt$collectAsStateWithLifecycle$1$1$1$1 flowExtKt$collectAsStateWithLifecycle$1$1$1$1 = new FlowExtKt$collectAsStateWithLifecycle$1$1$1$1(produceStateScope, i3);
                    this.L$0 = null;
                    this.label = 1;
                    if (stockDetails.collect(flowExtKt$collectAsStateWithLifecycle$1$1$1$1, this) == coroutineSingletons23) {
                        return coroutineSingletons23;
                    }
                } else {
                    if (i33 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 23:
                CoroutineScope coroutineScope13 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = this.label;
                if (i34 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow14 = (Flow) this.L$1;
                    OffersDetailsPresenterV2$models$1$1$1 offersDetailsPresenterV2$models$1$1$17 = new OffersDetailsPresenterV2$models$1$1$1(coroutineScope13, (WorkHomePresenter) obj2, i3);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow14.collect(offersDetailsPresenterV2$models$1$1$17, this) == coroutineSingletons24) {
                        return coroutineSingletons24;
                    }
                } else {
                    if (i34 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 24:
                CoroutineScope coroutineScope14 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i35 = this.label;
                if (i35 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow15 = (Flow) this.L$1;
                    OffersFilterGroupSheetPresenter$models$sheet$2$1$1 offersFilterGroupSheetPresenter$models$sheet$2$1$1 = new OffersFilterGroupSheetPresenter$models$sheet$2$1$1(i6, coroutineScope14, (InvestingSettingsPresenter) obj2);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow15.collect(offersFilterGroupSheetPresenter$models$sheet$2$1$1, this) == coroutineSingletons25) {
                        return coroutineSingletons25;
                    }
                } else {
                    if (i35 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 25:
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i36 = this.label;
                if (i36 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    EquityType equityType = MultipartBody.Part.Companion.toEquityType(((StockDetails) ((MutableState) this.L$0).getValue()).f1150type);
                    this.label = 1;
                    if (InvestingStockDetailsPresenter.access$handleCategoryClick((InvestingStockDetailsPresenter) this.L$1, (InvestingStockDetailsViewEvent.CategoryClick) ((InvestingStockDetailsViewEvent) obj2), equityType, this) == coroutineSingletons26) {
                        return coroutineSingletons26;
                    }
                } else {
                    if (i36 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 26:
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i37 = this.label;
                if (i37 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (InvestingStockDetailsPresenter.access$handleToggleFollowClick((InvestingStockDetailsPresenter) this.L$1, (StockDetails) ((MutableState) this.L$0).getValue(), (SyncInvestmentHolding.InvestmentHoldingState) obj2, this) == coroutineSingletons27) {
                        return coroutineSingletons27;
                    }
                } else {
                    if (i37 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 27:
                ProduceStateScope produceStateScope2 = (ProduceStateScope) this.L$0;
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i38 = this.label;
                if (i38 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (((Boolean) ((MutableState) obj2).getValue()).booleanValue()) {
                        InvestingStockDetailsPresenter investingStockDetailsPresenter = (InvestingStockDetailsPresenter) this.L$1;
                        Flow stockDetails2 = investingStockDetailsPresenter.investmentEntities.stockDetails(investingStockDetailsPresenter.args.investmentEntityToken);
                        FlowExtKt$collectAsStateWithLifecycle$1$1$1$1 flowExtKt$collectAsStateWithLifecycle$1$1$1$12 = new FlowExtKt$collectAsStateWithLifecycle$1$1$1$1(produceStateScope2, 8);
                        this.L$0 = null;
                        this.label = 1;
                        if (stockDetails2.collect(flowExtKt$collectAsStateWithLifecycle$1$1$1$12, this) == coroutineSingletons28) {
                            return coroutineSingletons28;
                        }
                    }
                } else {
                    if (i38 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 28:
                CoroutineScope coroutineScope15 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i39 = this.label;
                if (i39 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow16 = (Flow) this.L$1;
                    OffersDetailsPresenterV2$models$1$1$1 offersDetailsPresenterV2$models$1$1$18 = new OffersDetailsPresenterV2$models$1$1$1(coroutineScope15, (StocksTransferEtaSheetPresenter) obj2, i4);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow16.collect(offersDetailsPresenterV2$models$1$1$18, this) == coroutineSingletons29) {
                        return coroutineSingletons29;
                    }
                } else {
                    if (i39 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            default:
                CoroutineScope coroutineScope16 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i40 = this.label;
                if (i40 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow17 = (Flow) this.L$1;
                    OffersDetailsPresenterV2$models$1$1$1 offersDetailsPresenterV2$models$1$1$19 = new OffersDetailsPresenterV2$models$1$1$1(coroutineScope16, (StocksTransferEtaSheetPresenter) obj2, 11);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow17.collect(offersDetailsPresenterV2$models$1$1$19, this) == coroutineSingletons30) {
                        return coroutineSingletons30;
                    }
                } else {
                    if (i40 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestingHomeView$onScrollFlow$1(InvestingHomeView investingHomeView, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 0;
        this.this$0 = investingHomeView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InvestingHomeView$onScrollFlow$1(MoleculePresenter moleculePresenter, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = moleculePresenter;
        this.L$0 = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InvestingHomeView$onScrollFlow$1(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$1 = obj;
        this.this$0 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InvestingHomeView$onScrollFlow$1(Flow flow, Continuation continuation, MoleculePresenter moleculePresenter, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$1 = flow;
        this.this$0 = moleculePresenter;
    }
}
