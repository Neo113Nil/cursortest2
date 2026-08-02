package com.squareup.cash.investing.presenters;

import androidx.collection.SparseArrayCompat;
import androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.paging.CachedPagingDataKt$cachedIn$4;
import androidx.paging.PageFetcher$flow$1;
import androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1;
import androidx.room.util.DBUtil;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.local.presenters.LocalCashBalancePresenter;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter$Factory$Impl;
import com.squareup.cash.businessaccount.kybrestriction.presenters.KybRestrictionBannerPresenter$AssistedInjectionFactory$Impl;
import com.squareup.cash.businessaccount.screens.KybRestrictionBannerScreen;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.cdf.sponsoredaccount.DependentBalanceType;
import com.squareup.cash.cdf.sponsoredaccount.SponsoredAccountBalanceDetailStart;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.common.moneyformatter.SignOption;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.family.activity.presenters.FamilySharedActivityCache$Factory$Impl;
import com.squareup.cash.family.familyhub.backend.api.DependentPortfolio;
import com.squareup.cash.family.familyhub.backend.api.DependentRecurringPreferenceStore;
import com.squareup.cash.family.familyhub.backend.real.RealDependentBalanceDetailLoggingManager;
import com.squareup.cash.family.familyhub.backend.real.RealDependentCustomerTokenRepository;
import com.squareup.cash.family.familyhub.backend.real.RealDependentPortfolioStore;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$InvestingServerDrivenDisclosureText;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.formview.components.FormCashtag$8$invokeSuspend$$inlined$map$1;
import com.squareup.cash.formview.presenters.FormPresenter;
import com.squareup.cash.history.backend.real.RealInvestmentActivity;
import com.squareup.cash.history.navigation.PaymentActionHandler$transform$$inlined$flatMapLatest$2;
import com.squareup.cash.history.presenters.CheckStatusPresenter;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.backend.api.PolledData;
import com.squareup.cash.investing.backend.real.RealInvestingHistoricalData;
import com.squareup.cash.investing.backend.real.RealInvestingStateManager;
import com.squareup.cash.investing.backend.real.RealInvestmentEntities;
import com.squareup.cash.investing.backend.real.families.RealDependentInvestmentEntities;
import com.squareup.cash.investing.components.InvestingHomeView$onScrollFlow$1;
import com.squareup.cash.investing.db.InvestmentHoldingQueries$$ExternalSyntheticLambda4;
import com.squareup.cash.investing.presenters.families.InvestingDependentActivityPresenter;
import com.squareup.cash.investing.presenters.families.InvestingDependentActivityPresenter$Factory$Impl;
import com.squareup.cash.investing.presenters.families.InvestingDependentAutoInvestPresenter;
import com.squareup.cash.investing.presenters.families.InvestingDependentAutoInvestPresenter$Factory$Impl;
import com.squareup.cash.investing.primitives.InvestingState;
import com.squareup.cash.investing.primitives.NewsKind;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.investing.viewmodels.InvestingHomeViewModel;
import com.squareup.cash.investing.viewmodels.families.DependentActivityViewModel;
import com.squareup.cash.investingcrypto.presenters.news.InvestingCryptoNewsPresenter$Factory$Impl;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsViewModel;
import com.squareup.cash.invitations.InviteContactsPresenter$filterContacts$$inlined$map$1;
import com.squareup.cash.invitations.InviteContactsPresenter$special$$inlined$map$1;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.merchant.views.MerchantBlockingViewKt$$ExternalSyntheticLambda15;
import com.squareup.cash.moneybot.presenters.MoneybotHomePresenter;
import com.squareup.cash.moneybot.presenters.plugins.NavigationCardPresenter;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.portfolio.graphs.GraphPresenterData;
import com.squareup.cash.portfolio.graphs.RealInvestingGraphCalculator;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel$AccentColorType$UptoDateData;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.support.presenters.SupportHomePresenter$models$lambda$5$$inlined$map$1;
import com.squareup.cash.util.cache.Cache;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.activity.api.v1.ActivityClientService;
import com.squareup.protos.cash.cashbusinessaccounts.KybEligibilityWarning;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import com.squareup.util.coroutines.StateFlowKt;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.LongRange;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.ReadonlySharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlowImpl;
import papa.PapaEvent;

/* loaded from: classes6.dex */
public final class InvestingPortfolioPresenter implements MoleculePresenter {
    public static final /* synthetic */ int $r8$clinit = 0;
    public static final long DEBOUNCE_LOADING_INDICATOR;
    public final MoneyFormatter alwaysSignedCompactMoneyFormatter;
    public final MoneyFormatter alwaysSignedMoneyFormatter;
    public final Analytics analytics;
    public final MoneyFormatter compactMoneyFormatter;
    public final CoroutineContext computationDispatcher;
    public final KeyValue currentUserPortfolioStockMetricPreference;
    public final CashAccountDatabaseImpl database;
    public final RealDependentBalanceDetailLoggingManager dependentBalanceDetailerLogger;
    public final RealDependentInvestmentEntities dependentInvestmentEntities;
    public final KeyValue dependentPortfolioStockMetricPreference;
    public final RealDependentPortfolioStore dependentPortfolioStore;
    public final LocalCashBalancePresenter discoverySectionsPresenter;
    public final RealInvestingGraphCalculator graphCalculator;
    public final RealInvestingHistoricalData historicalData;
    public final InvestingDependentActivityPresenter$Factory$Impl investingDependentActivityPresenterFactory;
    public final InvestingDependentAutoInvestPresenter$Factory$Impl investingDependentAutoInvestPresenterFactory;
    public final RealInvestingStateManager investingStateManager;
    public final RealInvestmentActivity investmentActivity;
    public final RealInvestmentEntities investmentEntities;
    public final CoroutineContext ioDispatcher;
    public final NavigationCardPresenter kybRestrictionBannerPresenter;
    public final MoneyFormatter moneyFormatter;
    public final BetterNavigator.ScreenNavigator navigator;
    public final InvestingCryptoNewsPresenter$Factory$Impl newsPresenterFactory;
    public final Cache rangeSelectionCache;
    public final InvestingScreens.InvestingHome screen;
    public final boolean serverDrivenDisclosuresEnabled;
    public final StockMetricFactory stockMetricFactory;
    public final AndroidStringManager stringManager;

    static {
        Duration.Companion companion = Duration.Companion;
        DEBOUNCE_LOADING_INDICATOR = DurationKt.toDuration(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, DurationUnit.MILLISECONDS);
    }

    public InvestingPortfolioPresenter(InvestingDiscoverySectionsPresenter$Factory$Impl investingDiscoverySectionsPresenter$Factory$Impl, InvestingCryptoNewsPresenter$Factory$Impl investingCryptoNewsPresenter$Factory$Impl, RealInvestmentEntities realInvestmentEntities, AndroidStringManager androidStringManager, KeyValue keyValue, KeyValue keyValue2, RealInvestingGraphCalculator realInvestingGraphCalculator, CashAccountDatabaseImpl cashAccountDatabaseImpl, Cache cache, RealInvestingHistoricalData realInvestingHistoricalData, RealInvestmentActivity realInvestmentActivity, Analytics analytics, KybRestrictionBannerPresenter$AssistedInjectionFactory$Impl kybRestrictionBannerPresenter$AssistedInjectionFactory$Impl, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, LocalizedMoneyFormatter.Factory factory, StockMetricFactory stockMetricFactory, RealInvestingStateManager realInvestingStateManager, FeatureFlagManager featureFlagManager, InvestingDependentActivityPresenter$Factory$Impl investingDependentActivityPresenter$Factory$Impl, InvestingDependentAutoInvestPresenter$Factory$Impl investingDependentAutoInvestPresenter$Factory$Impl, RealDependentCustomerTokenRepository realDependentCustomerTokenRepository, RealDependentBalanceDetailLoggingManager realDependentBalanceDetailLoggingManager, RealDependentPortfolioStore realDependentPortfolioStore, RealDependentInvestmentEntities realDependentInvestmentEntities, BetterNavigator.ScreenNavigator screenNavigator, InvestingScreens.InvestingHome investingHome) {
        investingHome.getClass();
        this.newsPresenterFactory = investingCryptoNewsPresenter$Factory$Impl;
        this.investmentEntities = realInvestmentEntities;
        this.stringManager = androidStringManager;
        this.currentUserPortfolioStockMetricPreference = keyValue;
        this.dependentPortfolioStockMetricPreference = keyValue2;
        this.graphCalculator = realInvestingGraphCalculator;
        this.database = cashAccountDatabaseImpl;
        this.rangeSelectionCache = cache;
        this.historicalData = realInvestingHistoricalData;
        this.investmentActivity = realInvestmentActivity;
        this.analytics = analytics;
        this.ioDispatcher = coroutineContext;
        this.computationDispatcher = coroutineContext2;
        this.stockMetricFactory = stockMetricFactory;
        this.investingStateManager = realInvestingStateManager;
        this.investingDependentActivityPresenterFactory = investingDependentActivityPresenter$Factory$Impl;
        this.investingDependentAutoInvestPresenterFactory = investingDependentAutoInvestPresenter$Factory$Impl;
        this.dependentBalanceDetailerLogger = realDependentBalanceDetailLoggingManager;
        this.dependentPortfolioStore = realDependentPortfolioStore;
        this.dependentInvestmentEntities = realDependentInvestmentEntities;
        this.navigator = screenNavigator;
        this.screen = investingHome;
        this.moneyFormatter = factory.create(MoneyFormatterConfig.STANDARD);
        MoneyFormatterConfig moneyFormatterConfig = MoneyFormatterConfig.COMPACT;
        this.compactMoneyFormatter = factory.create(moneyFormatterConfig);
        this.alwaysSignedMoneyFormatter = factory.createAlwaysSigned();
        SignOption signOption = SignOption.STANDARD;
        this.alwaysSignedCompactMoneyFormatter = factory.create(MoneyFormatterConfig.copy$default(moneyFormatterConfig, null, null, null, 23));
        this.kybRestrictionBannerPresenter = kybRestrictionBannerPresenter$AssistedInjectionFactory$Impl.create(screenNavigator, new KybRestrictionBannerScreen(new InvestingScreens.InvestingHome(null, null, 63, false), KybEligibilityWarning.RestrictedFeature.RESTRICTED_FEATURE_INVESTING));
        String str = investingHome.dependentCustomerToken;
        this.discoverySectionsPresenter = investingDiscoverySectionsPresenter$Factory$Impl.create(str);
        this.serverDrivenDisclosuresEnabled = ((FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$InvestingServerDrivenDisclosureText.INSTANCE)).enabled();
        if (isDependentPortfolio()) {
            realDependentCustomerTokenRepository._customerTokenFlow.setValue(str);
            String customerToken = realDependentBalanceDetailLoggingManager.dependentCustomerTokenRepository.getCustomerToken();
            if (customerToken != null) {
                realDependentBalanceDetailLoggingManager.analytics.track(new SponsoredAccountBalanceDetailStart(DependentBalanceType.Stock, customerToken), null);
            }
        }
    }

    public final boolean isDependentPortfolio() {
        return this.screen.dependentCustomerToken != null;
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [kotlin.jvm.functions.Function1, kotlinx.coroutines.channels.BufferOverflow] */
    /* JADX WARN: Type inference failed for: r2v64 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        boolean z;
        Object obj;
        Object investingHomeView$onScrollFlow$1;
        InvestingScreens.InvestingHome investingHome;
        String str;
        Flow flow2;
        Object obj2;
        CoroutineContext coroutineContext;
        Object obj3;
        BetterNavigator.ScreenNavigator screenNavigator;
        ?? r2;
        Object obj4;
        Object anonymousClass1;
        Channel channel;
        Channel channel2;
        RealInvestmentActivity realInvestmentActivity;
        Object obj5;
        SharedFlow sharedFlow;
        Object obj6;
        InvestingPortfolioPresenter investingPortfolioPresenter;
        Flow flow3;
        Flow flow4;
        Channel channel3;
        SharedFlow sharedFlow2;
        CoroutineContext coroutineContext2;
        Object obj7;
        BetterNavigator.ScreenNavigator screenNavigator2;
        Flow appLockMonitor$special$$inlined$map$2;
        Flow appLockMonitor$special$$inlined$map$22;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-956933682);
        int i2 = i & 14;
        List models = this.discoverySectionsPresenter.models(flow, (Composer) gapComposer, i2);
        Object rememberedValue = gapComposer.rememberedValue();
        Continuation continuation = null;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Object obj8 = rememberedValue;
        if (rememberedValue == neverEqualPolicy) {
            BufferedChannel Channel$default = PapaEvent.Channel$default(0, null, null, 7);
            gapComposer.updateRememberedValue(Channel$default);
            obj8 = Channel$default;
        }
        Channel channel4 = (Channel) obj8;
        boolean changedInstance = gapComposer.changedInstance(channel4) | gapComposer.changedInstance(models);
        Object rememberedValue2 = gapComposer.rememberedValue();
        Object obj9 = rememberedValue2;
        if (changedInstance || rememberedValue2 == neverEqualPolicy) {
            CheckStatusPresenter.AnonymousClass1 anonymousClass12 = new CheckStatusPresenter.AnonymousClass1(channel4, models, continuation, 23);
            gapComposer.updateRememberedValue(anonymousClass12);
            obj9 = anonymousClass12;
        }
        Updater.LaunchedEffect(gapComposer, models, (Function2) obj9);
        Object rememberedValue3 = gapComposer.rememberedValue();
        Object obj10 = rememberedValue3;
        if (rememberedValue3 == neverEqualPolicy) {
            CoroutineScope createCompositionCoroutineScope = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
            gapComposer.updateRememberedValue(createCompositionCoroutineScope);
            obj10 = createCompositionCoroutineScope;
        }
        CoroutineScope coroutineScope = (CoroutineScope) obj10;
        Object rememberedValue4 = gapComposer.rememberedValue();
        int i3 = 26;
        int i4 = 6;
        int i5 = 2;
        Object obj11 = rememberedValue4;
        if (rememberedValue4 == neverEqualPolicy) {
            ReadonlySharedFlow shareIn = FlowKt.shareIn(new InviteContactsPresenter$special$$inlined$map$1(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new CheckStatusPresenter.AnonymousClass1(this, continuation, i3), new InviteContactsPresenter$filterContacts$$inlined$map$1(flow, i4)), this, i5), coroutineScope, new StartedWhileSubscribed(0L, Long.MAX_VALUE), 1);
            gapComposer.updateRememberedValue(shareIn);
            obj11 = shareIn;
        }
        SharedFlow sharedFlow3 = (SharedFlow) obj11;
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (rememberedValue5 == neverEqualPolicy) {
            z = false;
            StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(new PolledData(EmptyList.INSTANCE, false));
            gapComposer.updateRememberedValue(MutableStateFlow);
            obj = MutableStateFlow;
        } else {
            z = false;
            obj = rememberedValue5;
        }
        Flow flow5 = (MutableStateFlow) obj;
        InvestingScreens.InvestingHome investingHome2 = this.screen;
        String str2 = investingHome2.dependentCustomerToken;
        if (str2 == null) {
            gapComposer.startReplaceGroup(1982790242);
            gapComposer.end(z);
            investingHome = investingHome2;
            flow2 = flow5;
            str = str2;
        } else {
            gapComposer.startReplaceGroup(1982790243);
            DependentPortfolio stockPortfolio = this.dependentPortfolioStore.stockPortfolio(str2, gapComposer);
            boolean changedInstance2 = gapComposer.changedInstance(stockPortfolio) | gapComposer.changedInstance(flow5) | gapComposer.changedInstance(this);
            Object rememberedValue6 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue6 == neverEqualPolicy) {
                investingHome = investingHome2;
                str = str2;
                investingHomeView$onScrollFlow$1 = new InvestingHomeView$onScrollFlow$1(stockPortfolio, flow5, this, null, 9);
                flow2 = flow5;
                gapComposer.updateRememberedValue(investingHomeView$onScrollFlow$1);
            } else {
                investingHome = investingHome2;
                investingHomeView$onScrollFlow$1 = rememberedValue6;
                flow2 = flow5;
                str = str2;
            }
            Updater.LaunchedEffect(gapComposer, stockPortfolio, (Function2) investingHomeView$onScrollFlow$1);
            gapComposer.end(false);
        }
        Object rememberedValue7 = gapComposer.rememberedValue();
        if (rememberedValue7 == neverEqualPolicy) {
            ReadonlySharedFlow shareIn2 = FlowKt.shareIn(this.investmentEntities.ownedStocks(), coroutineScope, new StartedWhileSubscribed(0L, Long.MAX_VALUE), 1);
            gapComposer.updateRememberedValue(shareIn2);
            obj2 = shareIn2;
        } else {
            obj2 = rememberedValue7;
        }
        Flow flow6 = (SharedFlow) obj2;
        Object rememberedValue8 = gapComposer.rememberedValue();
        int i6 = 22;
        int i7 = 18;
        if (rememberedValue8 == neverEqualPolicy) {
            FlowKt__MergeKt$flatMapConcat$$inlined$map$1 flowKt__MergeKt$flatMapConcat$$inlined$map$1 = new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new PageFetcher$flow$1.AnonymousClass1(2, null, i6), new FormCashtag$8$invokeSuspend$$inlined$map$1(new InviteContactsPresenter$filterContacts$$inlined$map$1(flow, 7), i7));
            gapComposer.updateRememberedValue(flowKt__MergeKt$flatMapConcat$$inlined$map$1);
            rememberedValue8 = flowKt__MergeKt$flatMapConcat$$inlined$map$1;
        }
        Flow flow7 = (Flow) rememberedValue8;
        Object rememberedValue9 = gapComposer.rememberedValue();
        if (rememberedValue9 == neverEqualPolicy) {
            rememberedValue9 = isDependentPortfolio() ? this.dependentPortfolioStockMetricPreference.observe() : this.currentUserPortfolioStockMetricPreference.observe();
            gapComposer.updateRememberedValue(rememberedValue9);
        }
        Flow flow8 = (Flow) rememberedValue9;
        Object rememberedValue10 = gapComposer.rememberedValue();
        CoroutineContext coroutineContext3 = this.ioDispatcher;
        Object obj12 = rememberedValue10;
        if (rememberedValue10 == neverEqualPolicy) {
            FlowQuery$mapToList$$inlined$map$1 mapToOneOrNull = DBUtil.mapToOneOrNull(DBUtil.toFlow(this.database.investingSettingsQueries.select$2()), coroutineContext3);
            gapComposer.updateRememberedValue(mapToOneOrNull);
            obj12 = mapToOneOrNull;
        }
        Flow flow9 = (Flow) obj12;
        Object rememberedValue11 = gapComposer.rememberedValue();
        BetterNavigator.ScreenNavigator screenNavigator3 = this.navigator;
        if (rememberedValue11 == neverEqualPolicy) {
            coroutineContext = coroutineContext3;
            MoneybotHomePresenter create = this.newsPresenterFactory.create(screenNavigator3, NewsKind.StocksPortfolio.INSTANCE, null, true);
            gapComposer.updateRememberedValue(create);
            obj3 = create;
        } else {
            coroutineContext = coroutineContext3;
            obj3 = rememberedValue11;
        }
        MoleculePresenter moleculePresenter = (MoleculePresenter) obj3;
        Object rememberedValue12 = gapComposer.rememberedValue();
        if (rememberedValue12 == neverEqualPolicy) {
            FormCashtag$8$invokeSuspend$$inlined$map$1 formCashtag$8$invokeSuspend$$inlined$map$1 = new FormCashtag$8$invokeSuspend$$inlined$map$1(new InviteContactsPresenter$filterContacts$$inlined$map$1(flow, 5), 17);
            gapComposer.updateRememberedValue(formCashtag$8$invokeSuspend$$inlined$map$1);
            rememberedValue12 = formCashtag$8$invokeSuspend$$inlined$map$1;
        }
        InvestingCryptoNewsViewModel investingCryptoNewsViewModel = (InvestingCryptoNewsViewModel) moleculePresenter.models((Flow) rememberedValue12, gapComposer, 0);
        Object rememberedValue13 = gapComposer.rememberedValue();
        if (rememberedValue13 == neverEqualPolicy) {
            screenNavigator = screenNavigator3;
            BufferedChannel Channel$default2 = PapaEvent.Channel$default(0, null, null, 7);
            gapComposer.updateRememberedValue(Channel$default2);
            rememberedValue13 = Channel$default2;
        } else {
            screenNavigator = screenNavigator3;
        }
        Channel channel5 = (Channel) rememberedValue13;
        boolean changedInstance3 = gapComposer.changedInstance(channel5) | gapComposer.changed(investingCryptoNewsViewModel);
        Object rememberedValue14 = gapComposer.rememberedValue();
        int i8 = 24;
        if (changedInstance3 || rememberedValue14 == neverEqualPolicy) {
            r2 = 0;
            CheckStatusPresenter.AnonymousClass1 anonymousClass13 = new CheckStatusPresenter.AnonymousClass1(channel5, investingCryptoNewsViewModel, false ? 1 : 0, i8);
            gapComposer.updateRememberedValue(anonymousClass13);
            obj4 = anonymousClass13;
        } else {
            r2 = 0;
            obj4 = rememberedValue14;
        }
        Updater.LaunchedEffect(gapComposer, investingCryptoNewsViewModel, (Function2) obj4);
        UiCallbackModel models2 = this.kybRestrictionBannerPresenter.models(gapComposer);
        Object rememberedValue15 = gapComposer.rememberedValue();
        if (rememberedValue15 == neverEqualPolicy) {
            BufferedChannel Channel$default3 = PapaEvent.Channel$default(0, r2, r2, 7);
            gapComposer.updateRememberedValue(Channel$default3);
            rememberedValue15 = Channel$default3;
        }
        Channel channel6 = (Channel) rememberedValue15;
        boolean changedInstance4 = gapComposer.changedInstance(channel6) | gapComposer.changedInstance(models2);
        Object rememberedValue16 = gapComposer.rememberedValue();
        if (changedInstance4 || rememberedValue16 == neverEqualPolicy) {
            channel = channel5;
            anonymousClass1 = new CheckStatusPresenter.AnonymousClass1(channel6, models2, null, 25);
            gapComposer.updateRememberedValue(anonymousClass1);
        } else {
            anonymousClass1 = rememberedValue16;
            channel = channel5;
        }
        Updater.LaunchedEffect(gapComposer, models2, (Function2) anonymousClass1);
        InvestingState investingStates = this.investingStateManager.investingStates(gapComposer);
        Object rememberedValue17 = gapComposer.rememberedValue();
        RealInvestmentActivity realInvestmentActivity2 = this.investmentActivity;
        if (rememberedValue17 == neverEqualPolicy) {
            channel2 = channel6;
            realInvestmentActivity = realInvestmentActivity2;
            ReadonlySharedFlow shareIn3 = FlowKt.shareIn(FlowKt.transformLatest(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(sharedFlow3, realInvestmentActivity2.isFirstDayOfTrading(), InvestingPortfolioPresenter$portfolios$3.INSTANCE, 0), new AnchoredDraggableNode$drag$2(null, this, 26)), coroutineScope, new StartedWhileSubscribed(0L, Long.MAX_VALUE), 1);
            gapComposer.updateRememberedValue(shareIn3);
            obj5 = shareIn3;
        } else {
            channel2 = channel6;
            realInvestmentActivity = realInvestmentActivity2;
            obj5 = rememberedValue17;
        }
        SharedFlow sharedFlow4 = (SharedFlow) obj5;
        Object rememberedValue18 = gapComposer.rememberedValue();
        if (rememberedValue18 == neverEqualPolicy) {
            sharedFlow = sharedFlow4;
            ReadonlySharedFlow shareIn4 = FlowKt.shareIn(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new PageFetcher$flow$1.AnonymousClass1(2, null, 21), new SupportHomePresenter$models$lambda$5$$inlined$map$1(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(sharedFlow4, flow6, InvestingPortfolioPresenter$isDataStale$3.INSTANCE, 0), 6)), coroutineScope, new StartedWhileSubscribed(0L, Long.MAX_VALUE), 1);
            gapComposer.updateRememberedValue(shareIn4);
            obj6 = shareIn4;
        } else {
            sharedFlow = sharedFlow4;
            obj6 = rememberedValue18;
        }
        SharedFlow sharedFlow5 = (SharedFlow) obj6;
        Object rememberedValue19 = gapComposer.rememberedValue();
        if (rememberedValue19 == neverEqualPolicy) {
            InvestingGraphContentModel$AccentColorType$UptoDateData investingGraphContentModel$AccentColorType$UptoDateData = new InvestingGraphContentModel$AccentColorType$UptoDateData(ColorModel.Investing.INSTANCE);
            flow3 = flow6;
            channel3 = channel4;
            investingPortfolioPresenter = this;
            SharedFlow sharedFlow6 = sharedFlow;
            flow4 = flow7;
            coroutineContext2 = coroutineContext;
            sharedFlow2 = sharedFlow5;
            Continuation continuation2 = null;
            Flow flowOn = FlowKt.flowOn(FlowKt.debounceDuration(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new CheckStatusPresenter.AnonymousClass1(investingGraphContentModel$AccentColorType$UptoDateData, continuation2, 22), new FlowUtil$createFlow$$inlined$map$1(new GraphPresenterData(new SparseArrayCompat((Object) null), HistoricalRange.DAY, new InvestingGraphContentModel.Loading(investingGraphContentModel$AccentColorType$UptoDateData, 15), new LongRange(0L, 0L)), FlowKt.transformLatest(FlowKt.combine(sharedFlow3, FlowKt.distinctUntilChanged(sharedFlow5), realInvestmentActivity.isFirstDayOfTrading(), InvestingPortfolioPresenter$graphModels$3.INSTANCE), new PaymentActionHandler$transform$$inlined$flatMapLatest$2(investingGraphContentModel$AccentColorType$UptoDateData, sharedFlow6, investingPortfolioPresenter, null, 2)), new CardModelView.AnonymousClass1.AnonymousClass4(3, continuation2, 9))), new InvestmentHoldingQueries$$ExternalSyntheticLambda4(19)), coroutineContext2);
            gapComposer.updateRememberedValue(flowOn);
            obj7 = flowOn;
        } else {
            investingPortfolioPresenter = this;
            flow3 = flow6;
            flow4 = flow7;
            channel3 = channel4;
            sharedFlow2 = sharedFlow5;
            coroutineContext2 = coroutineContext;
            obj7 = rememberedValue19;
        }
        Flow flow10 = (Flow) obj7;
        if (str != null) {
            gapComposer.startReplaceGroup(1582268357);
            Object rememberedValue20 = gapComposer.rememberedValue();
            if (rememberedValue20 == neverEqualPolicy) {
                FormPresenter.MetroFactory metroFactory = investingPortfolioPresenter.investingDependentActivityPresenterFactory.delegateFactory;
                FamilySharedActivityCache$Factory$Impl familySharedActivityCache$Factory$Impl = (FamilySharedActivityCache$Factory$Impl) metroFactory.blockersHelperFactory.invoke();
                AndroidStringManager androidStringManager = (AndroidStringManager) metroFactory.clock.lambda.invoke();
                RealDependentBalanceDetailLoggingManager realDependentBalanceDetailLoggingManager = (RealDependentBalanceDetailLoggingManager) metroFactory.formAnalytics.invoke();
                ActivityClientService activityClientService = (ActivityClientService) metroFactory.analytics.getValue();
                RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl = (RealActivityEmbeddedPresenter$Factory$Impl) metroFactory.blockerActionUriDecoder.invoke();
                familySharedActivityCache$Factory$Impl.getClass();
                androidStringManager.getClass();
                realDependentBalanceDetailLoggingManager.getClass();
                activityClientService.getClass();
                realActivityEmbeddedPresenter$Factory$Impl.getClass();
                screenNavigator2 = screenNavigator;
                rememberedValue20 = new InvestingDependentActivityPresenter(familySharedActivityCache$Factory$Impl, androidStringManager, realDependentBalanceDetailLoggingManager, activityClientService, str, screenNavigator2, realActivityEmbeddedPresenter$Factory$Impl);
                gapComposer.updateRememberedValue(rememberedValue20);
            } else {
                screenNavigator2 = screenNavigator;
            }
            InvestingDependentActivityPresenter investingDependentActivityPresenter = (InvestingDependentActivityPresenter) rememberedValue20;
            Object rememberedValue21 = gapComposer.rememberedValue();
            Object obj13 = rememberedValue21;
            if (rememberedValue21 == neverEqualPolicy) {
                CachedPagingDataKt$cachedIn$4 cachedPagingDataKt$cachedIn$4 = new CachedPagingDataKt$cachedIn$4(2, null, 10);
                gapComposer.updateRememberedValue(cachedPagingDataKt$cachedIn$4);
                obj13 = cachedPagingDataKt$cachedIn$4;
            }
            investingDependentActivityPresenter.getClass();
            gapComposer.startReplaceGroup(1863231192);
            DependentActivityViewModel dependentActivityViewModel = new DependentActivityViewModel(investingDependentActivityPresenter.activityEmbeddedPresenter.models(gapComposer, 0), investingDependentActivityPresenter.stringManager.get(R.string.dependent_recent_activity_title));
            gapComposer.end(false);
            MutableState rememberUpdatedState = Updater.rememberUpdatedState(dependentActivityViewModel, gapComposer);
            boolean changed = gapComposer.changed(rememberUpdatedState);
            Object rememberedValue22 = gapComposer.rememberedValue();
            Object obj14 = rememberedValue22;
            if (changed || rememberedValue22 == neverEqualPolicy) {
                CashMapViewKt$$ExternalSyntheticLambda2 cashMapViewKt$$ExternalSyntheticLambda2 = new CashMapViewKt$$ExternalSyntheticLambda2(4, rememberUpdatedState);
                gapComposer.updateRememberedValue(cashMapViewKt$$ExternalSyntheticLambda2);
                obj14 = cashMapViewKt$$ExternalSyntheticLambda2;
            }
            appLockMonitor$special$$inlined$map$2 = Updater.snapshotFlow((Function0) obj14);
            gapComposer.end(false);
        } else {
            screenNavigator2 = screenNavigator;
            gapComposer.startReplaceGroup(1582639334);
            gapComposer.end(false);
            appLockMonitor$special$$inlined$map$2 = new AppLockMonitor$special$$inlined$map$2(null, 19);
        }
        Flow flow11 = appLockMonitor$special$$inlined$map$2;
        if (str != null) {
            gapComposer.startReplaceGroup(-628710228);
            Object rememberedValue23 = gapComposer.rememberedValue();
            if (rememberedValue23 == neverEqualPolicy) {
                LocalPosCheckInPresenter.MetroFactory metroFactory2 = investingPortfolioPresenter.investingDependentAutoInvestPresenterFactory.delegateFactory;
                AndroidStringManager androidStringManager2 = (AndroidStringManager) metroFactory2.stringManager.lambda.invoke();
                LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) metroFactory2.permissionManager.invoke();
                DependentRecurringPreferenceStore dependentRecurringPreferenceStore = (DependentRecurringPreferenceStore) metroFactory2.launcher.invoke();
                RealInvestmentEntities realInvestmentEntities = (RealInvestmentEntities) metroFactory2.store.invoke();
                androidStringManager2.getClass();
                factory.getClass();
                dependentRecurringPreferenceStore.getClass();
                realInvestmentEntities.getClass();
                rememberedValue23 = new InvestingDependentAutoInvestPresenter(androidStringManager2, factory, dependentRecurringPreferenceStore, realInvestmentEntities, investingHome, screenNavigator2);
                gapComposer.updateRememberedValue(rememberedValue23);
            }
            MutableState rememberUpdatedState2 = Updater.rememberUpdatedState(((InvestingDependentAutoInvestPresenter) rememberedValue23).models(flow, (Composer) gapComposer, i2), gapComposer);
            boolean changed2 = gapComposer.changed(rememberUpdatedState2);
            Object rememberedValue24 = gapComposer.rememberedValue();
            Object obj15 = rememberedValue24;
            if (changed2 || rememberedValue24 == neverEqualPolicy) {
                CashMapViewKt$$ExternalSyntheticLambda2 cashMapViewKt$$ExternalSyntheticLambda22 = new CashMapViewKt$$ExternalSyntheticLambda2(3, rememberUpdatedState2);
                gapComposer.updateRememberedValue(cashMapViewKt$$ExternalSyntheticLambda22);
                obj15 = cashMapViewKt$$ExternalSyntheticLambda22;
            }
            appLockMonitor$special$$inlined$map$22 = Updater.snapshotFlow((Function0) obj15);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-628339251);
            gapComposer.end(false);
            appLockMonitor$special$$inlined$map$22 = new AppLockMonitor$special$$inlined$map$2(null, 19);
        }
        Flow flow12 = appLockMonitor$special$$inlined$map$22;
        Object rememberedValue25 = gapComposer.rememberedValue();
        Object obj16 = rememberedValue25;
        if (rememberedValue25 == neverEqualPolicy) {
            ParcelableSnapshotMutableState mutableStateOf$default = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(mutableStateOf$default);
            obj16 = mutableStateOf$default;
        }
        MutableState mutableState = (MutableState) obj16;
        Object rememberedValue26 = gapComposer.rememberedValue();
        Object obj17 = rememberedValue26;
        if (rememberedValue26 == neverEqualPolicy) {
            if (investingPortfolioPresenter.isDependentPortfolio()) {
                flow3 = flow2;
            }
            Flow flowOn2 = FlowKt.flowOn(StateFlowKt.combine(flow3, FlowKt.receiveAsFlow(channel3), sharedFlow3, flow4, StateFlowKt.doOnFirst(flow10, new InvestmentHoldingQueries$$ExternalSyntheticLambda4(18), new MerchantBlockingViewKt$$ExternalSyntheticLambda15(24, investingPortfolioPresenter, mutableState)), flow8, flow9, sharedFlow2, FlowKt.receiveAsFlow(channel), new AppLockMonitor$special$$inlined$map$2(investingStates, 19), realInvestmentActivity.countPendingStockActivity(), FlowKt.receiveAsFlow(channel2), flow11, flow12, new InvestingPortfolioPresenter$models$model$2$3(15, 4, InvestingPortfolioPresenter.class, this, "createPortfolioViewModel", "createPortfolioViewModel(Lcom/squareup/cash/investing/backend/api/PolledData;Ljava/util/List;Lcom/squareup/protos/franklin/investing/common/HistoricalRange;Lcom/squareup/cash/portfolio/graphs/viewmodels/InvestingGraphContentModel$Point;Lcom/squareup/cash/portfolio/graphs/GraphPresenterData;Lcom/squareup/cash/investing/viewmodels/PortfolioStockMetricType;Lcom/squareup/cash/investing/db/Investing_settings;ZLcom/squareup/cash/investingcrypto/viewmodels/news/InvestingCryptoNewsViewModel;Lcom/squareup/cash/investing/primitives/InvestingState;JLapp/cash/broadway/presenter/molecule/viewmodels/UiCallbackModel;Lcom/squareup/cash/investing/viewmodels/families/DependentActivityViewModel;Lcom/squareup/cash/investing/viewmodels/families/DependentAutoInvestViewModel;)Lcom/squareup/cash/investing/viewmodels/InvestingHomeViewModel$Portfolio;")), coroutineContext2);
            gapComposer.updateRememberedValue(flowOn2);
            obj17 = flowOn2;
        }
        InvestingHomeViewModel investingHomeViewModel = (InvestingHomeViewModel) Updater.collectAsState((Flow) obj17, InvestingHomeViewModel.InitialLoading.INSTANCE, null, gapComposer, 64, 2).getValue();
        gapComposer.end(false);
        return investingHomeViewModel;
    }
}
