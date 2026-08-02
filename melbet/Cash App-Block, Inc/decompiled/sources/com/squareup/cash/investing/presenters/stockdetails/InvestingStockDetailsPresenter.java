package com.squareup.cash.investing.presenters.stockdetails;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.collection.SparseArrayCompat;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.glance.session.SessionWorkerKt$runSession$4$1;
import androidx.room.util.DBUtil;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.molecule.PlatformKt;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.nimbusds.jose.util.X509CertChainUtils;
import com.nimbusds.jose.util.X509CertUtils;
import com.squareup.cash.R;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.backend.loader.RealActivitiesCacheManager;
import com.squareup.cash.activity.presenters.ActivityEmbeddedPresenter$Companion;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter$Factory$Impl;
import com.squareup.cash.badging.db.BadgeQueries$VersionQuery;
import com.squareup.cash.boost.db.RewardSlotQueries;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.card.onboarding.StampSheetPresenter$MetroFactory;
import com.squareup.cash.cdf.performance.PerformanceMeasureScrollPerformance;
import com.squareup.cash.cdf.stock.EquityType;
import com.squareup.cash.cdf.stock.ScreenSource;
import com.squareup.cash.cdf.stock.StockFollowFollowStock;
import com.squareup.cash.cdf.stock.StockViewViewStockDetails;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.contacts.ContactQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.db2.contacts.CustomerQueries$ForIdQuery;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$InvestingServerDrivenDisclosureText;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.formview.components.FormCashtag$8$invokeSuspend$$inlined$map$1;
import com.squareup.cash.google.pay.RealGooglePayer$$ExternalSyntheticLambda0;
import com.squareup.cash.graphics.views.AnimationsKt$takeUntil$1$1;
import com.squareup.cash.history.backend.real.RealInvestingActivitiesManager;
import com.squareup.cash.history.backend.real.RealInvestingActivitiesManager$Factory$Impl;
import com.squareup.cash.history.backend.real.RealInvestmentActivity;
import com.squareup.cash.history.presenters.RealActivityInvitePresenter;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.backend.api.StockDetails;
import com.squareup.cash.investing.backend.api.data.InvestmentEntityWithPrice;
import com.squareup.cash.investing.backend.real.RealInvestingHistoricalData;
import com.squareup.cash.investing.backend.real.RealInvestingStateManager;
import com.squareup.cash.investing.backend.real.RealInvestmentEntities;
import com.squareup.cash.investing.backend.real.analytics.RealInvestingAnalytics;
import com.squareup.cash.investing.backend.real.categories.RealCategoryBackend;
import com.squareup.cash.investing.backend.real.categories.RealCategoryBackend$$ExternalSyntheticLambda1;
import com.squareup.cash.investing.backend.real.metrics.RealInvestingMetrics;
import com.squareup.cash.investing.components.InvestingHomeView$onScrollFlow$1;
import com.squareup.cash.investing.db.Investing_settings;
import com.squareup.cash.investing.db.InvestmentEntityQueries;
import com.squareup.cash.investing.db.InvestmentHoldingQueries$$ExternalSyntheticLambda5;
import com.squareup.cash.investing.db.InvestmentHoldingQueries$forToken$2;
import com.squareup.cash.investing.db.Investment_holding;
import com.squareup.cash.investing.db.categories.CategoryQueries;
import com.squareup.cash.investing.presenters.StockMetricFactory;
import com.squareup.cash.investing.presenters.TransferStockPresenter$models$$inlined$CollectEffect$1;
import com.squareup.cash.investing.presenters.holdings.InvestingEtfHoldingsPresenter;
import com.squareup.cash.investing.presenters.holdings.InvestingEtfHoldingsPresenter$Factory$Impl;
import com.squareup.cash.investing.presenters.metrics.InvestingAnalystOpinionsPresenter;
import com.squareup.cash.investing.presenters.metrics.InvestingAnalystOpinionsPresenter$Factory$Impl;
import com.squareup.cash.investing.presenters.metrics.InvestingEarningsPresenter;
import com.squareup.cash.investing.presenters.metrics.InvestingEarningsPresenter$Factory$Impl;
import com.squareup.cash.investing.presenters.metrics.InvestingFinancialPresenter;
import com.squareup.cash.investing.presenters.metrics.InvestingFinancialPresenter$Factory$Impl;
import com.squareup.cash.investing.presenters.metrics.InvestingKeyStatsPresenter;
import com.squareup.cash.investing.presenters.metrics.InvestingKeyStatsPresenter$Factory$Impl;
import com.squareup.cash.investing.primitives.CategoryToken;
import com.squareup.cash.investing.primitives.InvestingState;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.investing.primitives.NewsKind;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.investing.viewmodels.InvestingDetailTileViewModel;
import com.squareup.cash.investing.viewmodels.InvestingStockDetailsViewEvent;
import com.squareup.cash.investing.viewmodels.InvestingStockDetailsViewModel;
import com.squareup.cash.investing.viewmodels.InvestmentEntityContentModel;
import com.squareup.cash.investing.viewmodels.holdings.InvestingEtfHoldingsViewModel;
import com.squareup.cash.investing.viewmodels.metrics.InvestingAnalystOpinionsViewModel$Loading;
import com.squareup.cash.investing.viewmodels.metrics.InvestingEarningsViewModel;
import com.squareup.cash.investing.viewmodels.metrics.InvestingFinancialViewModel$Loading;
import com.squareup.cash.investingcrypto.presenters.news.InvestingCryptoNewsPresenter$Factory$Impl;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoRecurringPurchaseTileViewModel;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsViewModel;
import com.squareup.cash.invitations.InviteContactsPresenter$filterContacts$$inlined$map$1;
import com.squareup.cash.keystore.RealKeyStoreProvider$setEntry$2;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.merchant.views.MerchantBlockingViewKt$$ExternalSyntheticLambda15;
import com.squareup.cash.moneybot.presenters.MoneybotHomePresenter;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.offers.db.OffersSheetQueries$ForSheetKeyQuery;
import com.squareup.cash.performance.ScrollPerformanceAnalyzer$Factory$Impl;
import com.squareup.cash.portfolio.graphs.GraphPresenterData;
import com.squareup.cash.portfolio.graphs.RealInvestingGraphCalculator;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel$AccentColorType$UptoDateData;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphViewEvent;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingStockDetailsHeaderViewModel;
import com.squareup.cash.recipients.data.RealCustomerStore$getCustomerForId$$inlined$map$1;
import com.squareup.cash.recurring.db.RecurringPreferenceQueries;
import com.squareup.cash.recurring.db.RecurringPreferenceQueries$$ExternalSyntheticLambda5;
import com.squareup.cash.recurring.db.RecurringPreferenceQueries$selectForStock$2;
import com.squareup.cash.recurring.db.RecurringPreferenceQueries.SelectForIdQuery;
import com.squareup.cash.resource.AndroidDateFormatManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.savings.presenters.TransferInPresenter$MetroFactory;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.util.cache.Cache;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.wallet.views.Hero3DCardViewKt$InteractiveCard$13$touchInput$1$1;
import com.squareup.cash.work.data.real.RealPayDataLoader$fetchData$1;
import com.squareup.protos.cash.activity.api.v1.ActivityScope;
import com.squareup.protos.cash.activity.api.v1.ActivityToken;
import com.squareup.protos.cash.activity.api.v1.ActivityTokenType;
import com.squareup.protos.cash.marketprices.CurrentPrice;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.SyncInvestmentCategory;
import com.squareup.protos.franklin.common.SyncInvestmentEntity;
import com.squareup.protos.franklin.common.SyncInvestmentHolding;
import com.squareup.protos.franklin.investing.InvestingService;
import com.squareup.protos.franklin.investing.UpdateInvestmentHoldingRequest;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import com.squareup.protos.franklin.investing.resources.OrderSide;
import com.squareup.wire.MoshiJsonIntegration;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.temporal.ChronoUnit;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.LongRange;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.StateFlow;
import okhttp3.MultipartBody;
import okio.ByteString;
import okio.internal.RealBufferedSource;
import okio.internal.ResourceFileSystem;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class InvestingStockDetailsPresenter implements MoleculePresenter {
    public final RealActivitiesCacheManager activitiesCacheManager;
    public final RealActivityEmbeddedPresenter$Factory$Impl activityEmbeddedPresenterFactory;
    public final Flow activityEvents;
    public final InvestingAnalystOpinionsPresenter$Factory$Impl analystOpinionsPresenter;
    public final Analytics analytics;
    public final InvestingService appService;
    public final InvestingScreens.StockDetails args;
    public final RealCategoryBackend categoryBackend;
    public final AndroidClock clock;
    public final CashAccountDatabaseImpl customerDatabase;
    public final CashAccountDatabaseImpl database;
    public final AndroidDateFormatManager dateFormatManager;
    public final InvestingEarningsPresenter$Factory$Impl earningsPresenterFactory;
    public final InvestingFinancialPresenter$Factory$Impl financialPresenter;
    public final RealInvestingGraphCalculator graphCalculator;
    public final RealInvestingHistoricalData historicalData;
    public final RealInvestingActivitiesManager$Factory$Impl investingActivitiesManagerFactory;
    public final RealInvestingAnalytics investingAnalytics;
    public final InvestingEtfHoldingsPresenter$Factory$Impl investingEtfHoldingsPresenterFactory;
    public final RealInvestingStateManager investingStateManager;
    public final InvestingStockDetailsActivityRequestHandler$Factory$Impl investingStockDetailsActivityRequestHandler;
    public final RealInvestmentActivity investmentActivity;
    public final RealInvestmentEntities investmentEntities;
    public final InvestmentEntityQueries investmentHoldingQueries;
    public final CoroutineContext ioDispatcher;
    public final InvestingKeyStatsPresenter$Factory$Impl keyStatsPresenter;
    public final LastSelectedRange lastSelectedRange;
    public final IntentLauncher launcher;
    public final MoneyFormatter moneyFormatter;
    public final LocalizedMoneyFormatter.Factory moneyFormatterFactory;
    public final BetterNavigator.ScreenNavigator navigator;
    public final InvestingCryptoNewsPresenter$Factory$Impl newsPresenterFactory;
    public final CashAccountDatabaseImpl recurringDb;
    public final boolean serverDrivenDisclosuresEnabled;
    public final SessionManager sessionManager;
    public final StockMetricFactory stockMetricFactory;
    public final AndroidStringManager stringManager;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SyncInvestmentHolding.InvestmentHoldingState.values().length];
            try {
                ResourceFileSystem.Companion companion = SyncInvestmentHolding.InvestmentHoldingState.Companion;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ResourceFileSystem.Companion companion2 = SyncInvestmentHolding.InvestmentHoldingState.Companion;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ResourceFileSystem.Companion companion3 = SyncInvestmentHolding.InvestmentHoldingState.Companion;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ResourceFileSystem.Companion companion4 = SyncInvestmentHolding.InvestmentHoldingState.Companion;
                iArr[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public InvestingStockDetailsPresenter(RealInvestmentEntities realInvestmentEntities, AndroidStringManager androidStringManager, InvestingService investingService, CashAccountDatabaseImpl cashAccountDatabaseImpl, CashAccountDatabaseImpl cashAccountDatabaseImpl2, CashAccountDatabaseImpl cashAccountDatabaseImpl3, IntentLauncher intentLauncher, AndroidClock androidClock, AndroidDateFormatManager androidDateFormatManager, RealInvestingGraphCalculator realInvestingGraphCalculator, RealInvestingHistoricalData realInvestingHistoricalData, Flow flow, Analytics analytics, RealInvestingAnalytics realInvestingAnalytics, RealInvestmentActivity realInvestmentActivity, RealCategoryBackend realCategoryBackend, InvestingCryptoNewsPresenter$Factory$Impl investingCryptoNewsPresenter$Factory$Impl, InvestingFinancialPresenter$Factory$Impl investingFinancialPresenter$Factory$Impl, InvestingKeyStatsPresenter$Factory$Impl investingKeyStatsPresenter$Factory$Impl, InvestingEarningsPresenter$Factory$Impl investingEarningsPresenter$Factory$Impl, InvestingAnalystOpinionsPresenter$Factory$Impl investingAnalystOpinionsPresenter$Factory$Impl, ScrollPerformanceAnalyzer$Factory$Impl scrollPerformanceAnalyzer$Factory$Impl, LocalizedMoneyFormatter.Factory factory, StockMetricFactory stockMetricFactory, LastSelectedRange lastSelectedRange, RealInvestingStateManager realInvestingStateManager, SessionManager sessionManager, RealActivitiesCacheManager realActivitiesCacheManager, FeatureFlagManager featureFlagManager, RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl, RealInvestingActivitiesManager$Factory$Impl realInvestingActivitiesManager$Factory$Impl, InvestingStockDetailsActivityRequestHandler$Factory$Impl investingStockDetailsActivityRequestHandler$Factory$Impl, InvestingEtfHoldingsPresenter$Factory$Impl investingEtfHoldingsPresenter$Factory$Impl, CoroutineContext coroutineContext, InvestingScreens.StockDetails stockDetails, BetterNavigator.ScreenNavigator screenNavigator) {
        stockDetails.getClass();
        this.investmentEntities = realInvestmentEntities;
        this.stringManager = androidStringManager;
        this.appService = investingService;
        this.database = cashAccountDatabaseImpl;
        this.customerDatabase = cashAccountDatabaseImpl2;
        this.recurringDb = cashAccountDatabaseImpl3;
        this.launcher = intentLauncher;
        this.clock = androidClock;
        this.dateFormatManager = androidDateFormatManager;
        this.graphCalculator = realInvestingGraphCalculator;
        this.historicalData = realInvestingHistoricalData;
        this.activityEvents = flow;
        this.analytics = analytics;
        this.investingAnalytics = realInvestingAnalytics;
        this.investmentActivity = realInvestmentActivity;
        this.categoryBackend = realCategoryBackend;
        this.newsPresenterFactory = investingCryptoNewsPresenter$Factory$Impl;
        this.financialPresenter = investingFinancialPresenter$Factory$Impl;
        this.keyStatsPresenter = investingKeyStatsPresenter$Factory$Impl;
        this.earningsPresenterFactory = investingEarningsPresenter$Factory$Impl;
        this.analystOpinionsPresenter = investingAnalystOpinionsPresenter$Factory$Impl;
        this.moneyFormatterFactory = factory;
        this.stockMetricFactory = stockMetricFactory;
        this.lastSelectedRange = lastSelectedRange;
        this.investingStateManager = realInvestingStateManager;
        this.sessionManager = sessionManager;
        this.activitiesCacheManager = realActivitiesCacheManager;
        this.activityEmbeddedPresenterFactory = realActivityEmbeddedPresenter$Factory$Impl;
        this.investingActivitiesManagerFactory = realInvestingActivitiesManager$Factory$Impl;
        this.investingStockDetailsActivityRequestHandler = investingStockDetailsActivityRequestHandler$Factory$Impl;
        this.investingEtfHoldingsPresenterFactory = investingEtfHoldingsPresenter$Factory$Impl;
        this.ioDispatcher = coroutineContext;
        this.args = stockDetails;
        this.navigator = screenNavigator;
        this.moneyFormatter = factory.create(MoneyFormatterConfig.STANDARD);
        scrollPerformanceAnalyzer$Factory$Impl.create(PerformanceMeasureScrollPerformance.Element.INVESTING_EQUITY_DETAILS);
        this.investmentHoldingQueries = cashAccountDatabaseImpl.investmentHoldingQueries;
        this.serverDrivenDisclosuresEnabled = ((FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$InvestingServerDrivenDisclosureText.INSTANCE)).enabled();
    }

    public static final Money access$currentValue(InvestingStockDetailsPresenter investingStockDetailsPresenter, CurrentPrice currentPrice, Investment_holding investment_holding) {
        double parseDouble = Double.parseDouble(investment_holding.units);
        Money money = currentPrice.current_price;
        money.getClass();
        money.amount.getClass();
        return Money.copy$default(money, Long.valueOf(MathKt__MathJVMKt.roundToLong(parseDouble * r3.longValue())), null, null, 6);
    }

    public static final Buttons access$getButtons(InvestingStockDetailsPresenter investingStockDetailsPresenter, StockDetails stockDetails, Investment_holding investment_holding) {
        String str;
        AndroidStringManager androidStringManager = investingStockDetailsPresenter.stringManager;
        InvestingScreens.StockDetails.Origin origin = investingStockDetailsPresenter.args.origin;
        if (!(origin instanceof InvestingScreens.StockDetails.Origin.Tradable)) {
            if (origin instanceof InvestingScreens.StockDetails.Origin.StockSearch) {
                return new Buttons(androidStringManager.get(R.string.investing_select_stock), null);
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        String str2 = stockDetails.entityWithPrice.getReleaseStage() == SyncInvestmentEntity.ReleaseStage.PREVIEW_FOR_IPO ? null : androidStringManager.get(R.string.investing_transfer_stock_purchase);
        SyncInvestmentHolding.InvestmentHoldingState investmentHoldingState = investment_holding != null ? investment_holding.state : null;
        int i = investmentHoldingState == null ? -1 : WhenMappings.$EnumSwitchMapping$0[investmentHoldingState.ordinal()];
        if (i != -1) {
            if (i == 1) {
                str = androidStringManager.get(R.string.investing_transfer_stock_sale);
            } else if (i == 2) {
                str = androidStringManager.get(R.string.investing_transfer_stock_unfollow);
            } else if (i != 3 && i != 4) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            return new Buttons(str2, str);
        }
        str = androidStringManager.get(R.string.investing_transfer_stock_follow);
        return new Buttons(str2, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$handleCategoryClick(InvestingStockDetailsPresenter investingStockDetailsPresenter, InvestingStockDetailsViewEvent.CategoryClick categoryClick, EquityType equityType, ContinuationImpl continuationImpl) {
        InvestingStockDetailsPresenter$handleCategoryClick$1 investingStockDetailsPresenter$handleCategoryClick$1;
        int i;
        if (continuationImpl instanceof InvestingStockDetailsPresenter$handleCategoryClick$1) {
            investingStockDetailsPresenter$handleCategoryClick$1 = (InvestingStockDetailsPresenter$handleCategoryClick$1) continuationImpl;
            int i2 = investingStockDetailsPresenter$handleCategoryClick$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                investingStockDetailsPresenter$handleCategoryClick$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = investingStockDetailsPresenter$handleCategoryClick$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = investingStockDetailsPresenter$handleCategoryClick$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealInvestingAnalytics realInvestingAnalytics = investingStockDetailsPresenter.investingAnalytics;
                    CategoryToken categoryToken = categoryClick.categoryToken;
                    ScreenSource screenSource = ScreenSource.STOCK_DETAIL;
                    investingStockDetailsPresenter$handleCategoryClick$1.L$0 = categoryClick;
                    investingStockDetailsPresenter$handleCategoryClick$1.label = 1;
                    if (realInvestingAnalytics.trackStockSelectCategory(categoryToken, screenSource, equityType, investingStockDetailsPresenter$handleCategoryClick$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    categoryClick = investingStockDetailsPresenter$handleCategoryClick$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                investingStockDetailsPresenter.navigator.goTo(new InvestingScreens.CategoryDetailScreen(categoryClick.categoryToken));
                return Unit.INSTANCE;
            }
        }
        investingStockDetailsPresenter$handleCategoryClick$1 = new InvestingStockDetailsPresenter$handleCategoryClick$1(investingStockDetailsPresenter, continuationImpl);
        Object obj2 = investingStockDetailsPresenter$handleCategoryClick$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = investingStockDetailsPresenter$handleCategoryClick$1.label;
        if (i != 0) {
        }
        investingStockDetailsPresenter.navigator.goTo(new InvestingScreens.CategoryDetailScreen(categoryClick.categoryToken));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$handleToggleFollowClick(InvestingStockDetailsPresenter investingStockDetailsPresenter, StockDetails stockDetails, SyncInvestmentHolding.InvestmentHoldingState investmentHoldingState, ContinuationImpl continuationImpl) {
        InvestingStockDetailsPresenter$handleToggleFollowClick$1 investingStockDetailsPresenter$handleToggleFollowClick$1;
        Object obj;
        int i;
        SyncInvestmentHolding.InvestmentHoldingState investmentHoldingState2;
        InvestingScreens.StockDetails stockDetails2 = investingStockDetailsPresenter.args;
        if (continuationImpl instanceof InvestingStockDetailsPresenter$handleToggleFollowClick$1) {
            investingStockDetailsPresenter$handleToggleFollowClick$1 = (InvestingStockDetailsPresenter$handleToggleFollowClick$1) continuationImpl;
            int i2 = investingStockDetailsPresenter$handleToggleFollowClick$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                investingStockDetailsPresenter$handleToggleFollowClick$1.label = i2 - PKIFailureInfo.systemUnavail;
                obj = investingStockDetailsPresenter$handleToggleFollowClick$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = investingStockDetailsPresenter$handleToggleFollowClick$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Analytics analytics = investingStockDetailsPresenter.analytics;
                    SyncInvestmentHolding.InvestmentHoldingState investmentHoldingState3 = SyncInvestmentHolding.InvestmentHoldingState.FOLLOWED;
                    analytics.track(new StockFollowFollowStock(investmentHoldingState == investmentHoldingState3 ? StockFollowFollowStock.FollowStatus.UNFOLLOW : StockFollowFollowStock.FollowStatus.FOLLOW, stockDetails.symbol, MultipartBody.Part.Companion.toEquityType(stockDetails.f1150type)), null);
                    SyncInvestmentHolding.InvestmentHoldingState investmentHoldingState4 = investmentHoldingState == investmentHoldingState3 ? SyncInvestmentHolding.InvestmentHoldingState.UNFOLLOWED : investmentHoldingState3;
                    InvestmentEntityQueries investmentEntityQueries = investingStockDetailsPresenter.investmentHoldingQueries;
                    if (investmentHoldingState == null) {
                        investmentEntityQueries.insert(stockDetails2.investmentEntityToken.value, "0.00", 0L, CurrencyCode.USD, investmentHoldingState4, null, null);
                    } else {
                        investmentEntityQueries.updateStateForToken(investmentHoldingState4, stockDetails2.investmentEntityToken.value);
                    }
                    InvestingService investingService = investingStockDetailsPresenter.appService;
                    UpdateInvestmentHoldingRequest updateInvestmentHoldingRequest = new UpdateInvestmentHoldingRequest(new RequestContext(null, null, null, null, null, null, null, null, 8191), stockDetails2.investmentEntityToken.value, investmentHoldingState == investmentHoldingState3 ? UpdateInvestmentHoldingRequest.Action.UNFOLLOW : UpdateInvestmentHoldingRequest.Action.FOLLOW, ByteString.EMPTY);
                    investingStockDetailsPresenter$handleToggleFollowClick$1.L$1 = investmentHoldingState;
                    investingStockDetailsPresenter$handleToggleFollowClick$1.label = 1;
                    obj = investingService.updateInvestmentHolding(updateInvestmentHoldingRequest, investingStockDetailsPresenter$handleToggleFollowClick$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    investmentHoldingState2 = investmentHoldingState;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    investmentHoldingState2 = investingStockDetailsPresenter$handleToggleFollowClick$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                if (((ApiResult) obj) instanceof ApiResult.Failure) {
                    InvestmentEntityQueries investmentEntityQueries2 = investingStockDetailsPresenter.investmentHoldingQueries;
                    if (investmentHoldingState2 == null) {
                        investmentHoldingState2 = SyncInvestmentHolding.InvestmentHoldingState.UNFOLLOWED;
                    }
                    investmentEntityQueries2.updateStateForToken(investmentHoldingState2, stockDetails2.investmentEntityToken.value);
                }
                return Unit.INSTANCE;
            }
        }
        investingStockDetailsPresenter$handleToggleFollowClick$1 = new InvestingStockDetailsPresenter$handleToggleFollowClick$1(investingStockDetailsPresenter, continuationImpl);
        obj = investingStockDetailsPresenter$handleToggleFollowClick$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = investingStockDetailsPresenter$handleToggleFollowClick$1.label;
        if (i != 0) {
        }
        if (((ApiResult) obj) instanceof ApiResult.Failure) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v64, types: [androidx.compose.ui.text.style.TextGeometricTransformKt, com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoViewAllNewsModel, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v65 */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        ActivitiesManager.ActivityContext activityContext;
        RealInvestingActivitiesManager realInvestingActivitiesManager;
        UiCallbackModel uiCallbackModel;
        InvestingStockDetailsPresenter investingStockDetailsPresenter;
        CashAccountDatabaseImpl cashAccountDatabaseImpl;
        GapComposer gapComposer;
        InvestmentEntityToken investmentEntityToken;
        BetterNavigator.ScreenNavigator screenNavigator;
        boolean z;
        ChronoUnit chronoUnit;
        InvestmentEntityToken investmentEntityToken2;
        GapComposer gapComposer2;
        MutableState mutableState;
        boolean z2;
        HistoricalRange historicalRange;
        InvestmentEntityToken investmentEntityToken3;
        BetterNavigator.ScreenNavigator screenNavigator2;
        BetterNavigator.ScreenNavigator screenNavigator3;
        InvestmentEntityToken investmentEntityToken4;
        InvestingScreens.StockDetails stockDetails;
        InvestingDetailTileViewModel investingDetailTileViewModel;
        Object obj;
        byte b;
        InvestingCryptoNewsViewModel investingCryptoNewsViewModel;
        byte b2;
        MutableState mutableState2;
        MutableState mutableState3;
        Object obj2;
        Object[] objArr;
        GapComposer gapComposer3;
        Object obj3;
        ?? r4;
        boolean z3;
        Money money;
        GapComposer gapComposer4;
        flow.getClass();
        GapComposer gapComposer5 = (GapComposer) composer;
        gapComposer5.startReplaceGroup(477433021);
        Object rememberedValue = gapComposer5.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Object obj4 = rememberedValue;
        if (rememberedValue == neverEqualPolicy) {
            InviteContactsPresenter$filterContacts$$inlined$map$1 inviteContactsPresenter$filterContacts$$inlined$map$1 = new InviteContactsPresenter$filterContacts$$inlined$map$1(this.activityEvents, 18);
            gapComposer5.updateRememberedValue(inviteContactsPresenter$filterContacts$$inlined$map$1);
            obj4 = inviteContactsPresenter$filterContacts$$inlined$map$1;
        }
        MutableState collectAsState = Updater.collectAsState((Flow) obj4, Boolean.TRUE, null, gapComposer5, 48, 2);
        Object rememberedValue2 = gapComposer5.rememberedValue();
        CoroutineContext coroutineContext = this.ioDispatcher;
        InvestingScreens.StockDetails stockDetails2 = this.args;
        int i2 = 0;
        Object obj5 = rememberedValue2;
        if (rememberedValue2 == neverEqualPolicy) {
            RewardSlotQueries rewardSlotQueries = this.customerDatabase.customerQueries;
            String str = stockDetails2.investmentEntityToken.value;
            rewardSlotQueries.getClass();
            FlowQuery$mapToList$$inlined$map$1 mapToOneOrNull = DBUtil.mapToOneOrNull(DBUtil.toFlow(new CustomerQueries$ForIdQuery(rewardSlotQueries, str, new ContactQueries$$ExternalSyntheticLambda1(10), (byte) 0)), coroutineContext);
            gapComposer5.updateRememberedValue(mapToOneOrNull);
            obj5 = mapToOneOrNull;
        }
        String str2 = (String) Updater.collectAsState((Flow) obj5, null, null, gapComposer5, 48, 2).getValue();
        gapComposer5.startReplaceGroup(-1896664942);
        InvestingStockDetailsViewModel investingStockDetailsViewModel = null;
        boolean z4 = false;
        boolean z5 = false;
        if (str2 == null) {
            gapComposer5.end(false);
            activityContext = null;
        } else {
            boolean changed = gapComposer5.changed(str2);
            Object rememberedValue3 = gapComposer5.rememberedValue();
            Object obj6 = rememberedValue3;
            if (changed || rememberedValue3 == neverEqualPolicy) {
                ActivitiesManager.ActivityContext activityContext2 = new ActivitiesManager.ActivityContext(new ActivityToken(ActivityTokenType.CUSTOMER_TOKEN, PlatformKt.activeAccountToken(this.sessionManager), (String) (z4 ? 1 : 0), 12), ActivityScope.MY_ACTIVITY, InvestingStockDetailsActivityRequestHandler$Factory$Impl.create$default(this.investingStockDetailsActivityRequestHandler, str2), 8);
                gapComposer5.updateRememberedValue(activityContext2);
                obj6 = activityContext2;
            }
            activityContext = (ActivitiesManager.ActivityContext) obj6;
            gapComposer5.end(false);
        }
        RealActivitiesCacheManager realActivitiesCacheManager = this.activitiesCacheManager;
        if (activityContext != null) {
            gapComposer5.startReplaceGroup(-748346224);
            boolean changed2 = gapComposer5.changed(activityContext);
            Object rememberedValue4 = gapComposer5.rememberedValue();
            if (changed2 || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = this.investingActivitiesManagerFactory.create(activityContext, RealActivitiesCacheManager.take$default(realActivitiesCacheManager, stockDetails2.investmentEntityToken));
                gapComposer5.updateRememberedValue(rememberedValue4);
            }
            gapComposer5.end(false);
            realInvestingActivitiesManager = (RealInvestingActivitiesManager) rememberedValue4;
        } else {
            gapComposer5.startReplaceGroup(-1723841376);
            gapComposer5.end(false);
            realInvestingActivitiesManager = null;
        }
        int i3 = 25;
        BetterNavigator.ScreenNavigator screenNavigator4 = this.navigator;
        if (activityContext == null || realInvestingActivitiesManager == null) {
            gapComposer5.startReplaceGroup(-1723639008);
            gapComposer5.end(false);
            uiCallbackModel = null;
        } else {
            gapComposer5.startReplaceGroup(-748340477);
            boolean changed3 = gapComposer5.changed(activityContext) | gapComposer5.changed(realInvestingActivitiesManager);
            Object rememberedValue5 = gapComposer5.rememberedValue();
            Object obj7 = rememberedValue5;
            if (changed3 || rememberedValue5 == neverEqualPolicy) {
                RealActivityEmbeddedPresenter create = this.activityEmbeddedPresenterFactory.create(screenNavigator4, ActivityEmbeddedPresenter$Companion.EmbeddedRecentsConfiguration$default(activityContext, RealActivitiesCacheManager.take$default(realActivitiesCacheManager, activityContext), null, new RealGooglePayer$$ExternalSyntheticLambda0(this, i3), 2, null, null, null, null, new InvestingStockDetailsPresenter$$ExternalSyntheticLambda1(realInvestingActivitiesManager, i2), 6088));
                gapComposer5.updateRememberedValue(create);
                obj7 = create;
            }
            UiCallbackModel models = ((RealActivityEmbeddedPresenter) obj7).models(gapComposer5, 0);
            gapComposer5.end(false);
            uiCallbackModel = models;
        }
        Object rememberedValue6 = gapComposer5.rememberedValue();
        Object obj8 = rememberedValue6;
        if (rememberedValue6 == neverEqualPolicy) {
            FlowQuery$mapToList$$inlined$map$1 mapToOneOrNull2 = DBUtil.mapToOneOrNull(DBUtil.toFlow(this.database.investingSettingsQueries.select$2()), coroutineContext);
            gapComposer5.updateRememberedValue(mapToOneOrNull2);
            obj8 = mapToOneOrNull2;
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) obj8, null, null, gapComposer5, 48, 2);
        Boolean bool = (Boolean) collectAsState.getValue();
        bool.getClass();
        boolean changed4 = gapComposer5.changed(collectAsState) | gapComposer5.changedInstance(this);
        Object rememberedValue7 = gapComposer5.rememberedValue();
        Object obj9 = rememberedValue7;
        if (changed4 || rememberedValue7 == neverEqualPolicy) {
            InvestingHomeView$onScrollFlow$1 investingHomeView$onScrollFlow$1 = new InvestingHomeView$onScrollFlow$1((Object) this, (Object) collectAsState, (Continuation) (z5 ? 1 : 0), 27);
            gapComposer5.updateRememberedValue(investingHomeView$onScrollFlow$1);
            obj9 = investingHomeView$onScrollFlow$1;
        }
        StockDetails stockDetails3 = (StockDetails) Updater.produceState(null, bool, (Function2) obj9, gapComposer5, 6).getValue();
        if (stockDetails3 == null) {
            gapComposer5.startReplaceGroup(-1723183246);
            gapComposer5.end(false);
            r4 = 0;
            z3 = false;
            gapComposer4 = gapComposer5;
        } else {
            gapComposer5.startReplaceGroup(-1723183245);
            Investing_settings investing_settings = (Investing_settings) collectAsState2.getValue();
            MutableState rememberUpdatedState = Updater.rememberUpdatedState(stockDetails3, gapComposer5);
            HistoricalRange historicalRange2 = (HistoricalRange) this.lastSelectedRange.range$delegate.getValue();
            if (historicalRange2 == null) {
                historicalRange2 = HistoricalRange.DAY;
            }
            HistoricalRange historicalRange3 = historicalRange2;
            Object rememberedValue8 = gapComposer5.rememberedValue();
            Object obj10 = rememberedValue8;
            if (rememberedValue8 == neverEqualPolicy) {
                ParcelableSnapshotMutableState mutableStateOf$default = Updater.mutableStateOf$default(null);
                gapComposer5.updateRememberedValue(mutableStateOf$default);
                obj10 = mutableStateOf$default;
            }
            MutableState mutableState4 = (MutableState) obj10;
            ColorModel.Accented model = MoshiJsonIntegration.toModel(((StockDetails) rememberUpdatedState.getValue()).entityWithPrice.getAccentColor());
            Object rememberedValue9 = gapComposer5.rememberedValue();
            int i4 = 19;
            int i5 = 4;
            if (rememberedValue9 == neverEqualPolicy) {
                String str3 = stockDetails2.investmentEntityToken.value;
                InvestmentEntityQueries investmentEntityQueries = this.investmentHoldingQueries;
                investmentEntityQueries.getClass();
                str3.getClass();
                InvestmentHoldingQueries$forToken$2 investmentHoldingQueries$forToken$2 = InvestmentHoldingQueries$forToken$2.INSTANCE;
                RealCustomerStore$getCustomerForId$$inlined$map$1 realCustomerStore$getCustomerForId$$inlined$map$1 = new RealCustomerStore$getCustomerForId$$inlined$map$1(DBUtil.mapToOneOrNull(DBUtil.toFlow(new OffersSheetQueries$ForSheetKeyQuery(investmentEntityQueries, str3, new InvestmentHoldingQueries$$ExternalSyntheticLambda5(investmentEntityQueries, i5))), coroutineContext), i4);
                gapComposer5.updateRememberedValue(realCustomerStore$getCustomerForId$$inlined$map$1);
                rememberedValue9 = realCustomerStore$getCustomerForId$$inlined$map$1;
            }
            MutableState collectAsState3 = Updater.collectAsState((Flow) rememberedValue9, null, null, gapComposer5, 48, 2);
            Object rememberedValue10 = gapComposer5.rememberedValue();
            int i6 = 20;
            int i7 = 2;
            CashAccountDatabaseImpl cashAccountDatabaseImpl2 = this.recurringDb;
            Object obj11 = rememberedValue10;
            if (rememberedValue10 == neverEqualPolicy) {
                RecurringPreferenceQueries recurringPreferenceQueries = cashAccountDatabaseImpl2.recurringPreferenceQueries;
                String str4 = stockDetails2.investmentEntityToken.value;
                recurringPreferenceQueries.getClass();
                int i8 = RecurringPreferenceQueries$selectForStock$2.$r8$clinit;
                RealCustomerStore$getCustomerForId$$inlined$map$1 realCustomerStore$getCustomerForId$$inlined$map$12 = new RealCustomerStore$getCustomerForId$$inlined$map$1(DBUtil.mapToOneOrNull(DBUtil.toFlow(recurringPreferenceQueries.new SelectForIdQuery(str4, new RecurringPreferenceQueries$$ExternalSyntheticLambda5(recurringPreferenceQueries, i7), (byte) 0)), coroutineContext), i6);
                gapComposer5.updateRememberedValue(realCustomerStore$getCustomerForId$$inlined$map$12);
                obj11 = realCustomerStore$getCustomerForId$$inlined$map$12;
            }
            MutableState collectAsState4 = Updater.collectAsState((Flow) obj11, null, null, gapComposer5, 48, 2);
            Object rememberedValue11 = gapComposer5.rememberedValue();
            Object obj12 = rememberedValue11;
            if (rememberedValue11 == neverEqualPolicy) {
                ParcelableSnapshotMutableState mutableStateOf$default2 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer5.updateRememberedValue(mutableStateOf$default2);
                obj12 = mutableStateOf$default2;
            }
            MutableState mutableState5 = (MutableState) obj12;
            StockViewViewStockDetails.InvestingScreenOrigin investingScreenOrigin = stockDetails2.screenOrigin;
            InvestmentEntityToken investmentEntityToken5 = stockDetails2.investmentEntityToken;
            Loaded loaded = (Loaded) collectAsState3.getValue();
            CurrentPrice price = ((StockDetails) rememberUpdatedState.getValue()).entityWithPrice.getPrice();
            Loaded loaded2 = (Loaded) collectAsState4.getValue();
            StockDetails stockDetails4 = (StockDetails) rememberUpdatedState.getValue();
            if (investingScreenOrigin == null || loaded == null || price == null || loaded2 == null || stockDetails4 == null) {
                investingStockDetailsPresenter = this;
                cashAccountDatabaseImpl = cashAccountDatabaseImpl2;
                gapComposer = gapComposer5;
                investmentEntityToken = investmentEntityToken5;
                screenNavigator = screenNavigator4;
                gapComposer.startReplaceGroup(1610123257);
                gapComposer.end(false);
            } else {
                gapComposer5.startReplaceGroup(1610052143);
                Object[] objArr2 = {investingScreenOrigin, loaded, price, loaded2, stockDetails4};
                screenNavigator = screenNavigator4;
                investmentEntityToken = investmentEntityToken5;
                cashAccountDatabaseImpl = cashAccountDatabaseImpl2;
                gapComposer = gapComposer5;
                Hero3DCardViewKt$InteractiveCard$13$touchInput$1$1.AnonymousClass1 anonymousClass1 = new Hero3DCardViewKt$InteractiveCard$13$touchInput$1$1.AnonymousClass1(investingScreenOrigin, loaded, price, loaded2, stockDetails4, (Continuation) null, this, mutableState5);
                investingStockDetailsPresenter = this;
                Updater.LaunchedEffect(objArr2, anonymousClass1, gapComposer);
                gapComposer.end(false);
            }
            InvestingState investingStates = investingStockDetailsPresenter.investingStateManager.investingStates(gapComposer);
            if (investingStates instanceof InvestingState.Loading) {
                z = false;
            } else {
                if (!(investingStates instanceof InvestingState.Content)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                z = ((InvestingState.Content) investingStates).brokerageAccountState instanceof InvestingState.Content.BrokerageAccountState.TransferInProgress;
            }
            MutableState rememberUpdatedState2 = Updater.rememberUpdatedState(Boolean.valueOf(z), gapComposer);
            CurrentPrice price2 = ((StockDetails) rememberUpdatedState.getValue()).entityWithPrice.getPrice();
            GapComposer gapComposer6 = gapComposer;
            Continuation continuation = null;
            RealInvestingActivitiesManager realInvestingActivitiesManager2 = realInvestingActivitiesManager;
            InvestingStockDetailsPresenter investingStockDetailsPresenter2 = investingStockDetailsPresenter;
            Updater.LaunchedEffect(gapComposer6, flow, new SessionWorkerKt$runSession$4$1(flow, (Continuation) null, investingStockDetailsPresenter2, model, rememberUpdatedState, mutableState4, investing_settings, Updater.rememberUpdatedState(Boolean.valueOf(((price2 == null || (money = price2.current_price) == null) ? null : money.amount) != null), gapComposer), rememberUpdatedState2, collectAsState3, 7));
            boolean z6 = ((StockDetails) rememberUpdatedState.getValue()).entityWithPrice instanceof InvestmentEntityWithPrice.Owned;
            boolean changed5 = gapComposer6.changed(realInvestingActivitiesManager2) | gapComposer6.changed(historicalRange3.ordinal());
            Object rememberedValue12 = gapComposer6.rememberedValue();
            if (changed5 || rememberedValue12 == neverEqualPolicy) {
                if (realInvestingActivitiesManager2 != null) {
                    int ordinal = historicalRange3.ordinal();
                    if (ordinal == 0) {
                        chronoUnit = ChronoUnit.DAYS;
                    } else if (ordinal == 1) {
                        chronoUnit = ChronoUnit.WEEKS;
                    } else if (ordinal == 2) {
                        chronoUnit = ChronoUnit.MONTHS;
                    } else if (ordinal == 3) {
                        chronoUnit = ChronoUnit.YEARS;
                    } else {
                        if (ordinal != 4) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        chronoUnit = null;
                    }
                    Flow flowOn = FlowKt.flowOn(FlowKt.distinctUntilChanged(new FormCashtag$8$invokeSuspend$$inlined$map$1(new RealActivityInvitePresenter(13, new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(realInvestingActivitiesManager2.$$delegate_0.activities(), new AnimationsKt$takeUntil$1$1.AnonymousClass1(realInvestingActivitiesManager2, chronoUnit, continuation, 29), 3), realInvestingActivitiesManager2, chronoUnit), 9)), realInvestingActivitiesManager2.computationDispatcher);
                    if (flowOn != null) {
                        rememberedValue12 = flowOn;
                        gapComposer6.updateRememberedValue(rememberedValue12);
                    }
                }
                rememberedValue12 = new AppLockMonitor$special$$inlined$map$2(EmptyList.INSTANCE, 19);
                gapComposer6.updateRememberedValue(rememberedValue12);
            }
            EmptyList emptyList = EmptyList.INSTANCE;
            MutableState collectAsState5 = Updater.collectAsState((Flow) rememberedValue12, emptyList, null, gapComposer6, 48, 2);
            boolean changed6 = gapComposer6.changed((List) collectAsState5.getValue()) | gapComposer6.changed(historicalRange3.ordinal()) | gapComposer6.changed(z6);
            Object rememberedValue13 = gapComposer6.rememberedValue();
            if (changed6 || rememberedValue13 == neverEqualPolicy) {
                Color accentColor = ((StockDetails) rememberUpdatedState.getValue()).entityWithPrice.getAccentColor();
                List list = (List) collectAsState5.getValue();
                RealInvestingHistoricalData realInvestingHistoricalData = investingStockDetailsPresenter2.historicalData;
                investmentEntityToken.getClass();
                investmentEntityToken2 = investmentEntityToken;
                gapComposer2 = gapComposer6;
                mutableState = mutableState4;
                z2 = z6;
                historicalRange = historicalRange3;
                rememberedValue13 = new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(FlowKt.channelFlow(new RealPayDataLoader$fetchData$1(z6, realInvestingHistoricalData, investmentEntityToken, historicalRange3, (Continuation) null, 8)), investingStockDetailsPresenter2.investmentActivity.isFirstDayOfTrading(), new InvestingStockDetailsPresenter$graphModelForRange$1(investingStockDetailsPresenter2, list, historicalRange3, accentColor, null), 0);
                gapComposer2.updateRememberedValue(rememberedValue13);
            } else {
                gapComposer2 = gapComposer6;
                mutableState = mutableState4;
                z2 = z6;
                investmentEntityToken2 = investmentEntityToken;
                historicalRange = historicalRange3;
            }
            ColorModel.Accented accented = model;
            GapComposer gapComposer7 = gapComposer2;
            MutableState collectAsState6 = Updater.collectAsState((Flow) rememberedValue13, new GraphPresenterData(new SparseArrayCompat((Object) null), HistoricalRange.DAY, new InvestingGraphContentModel.Loading(new InvestingGraphContentModel$AccentColorType$UptoDateData(new ColorModel.Accented(((StockDetails) rememberUpdatedState.getValue()).color)), 15), new LongRange(0L, 0L)), null, gapComposer7, 64, 2);
            Object rememberedValue14 = gapComposer7.rememberedValue();
            Object obj13 = rememberedValue14;
            if (rememberedValue14 == neverEqualPolicy) {
                investmentEntityToken2.getClass();
                RealCategoryBackend realCategoryBackend = this.categoryBackend;
                CategoryQueries categoryQueries = realCategoryBackend.entityInCategoryQueries;
                String str5 = investmentEntityToken2.value;
                UiAlias.Type.Companion companion = SyncInvestmentCategory.CategoryType.Companion;
                RealCategoryBackend$$ExternalSyntheticLambda1 realCategoryBackend$$ExternalSyntheticLambda1 = new RealCategoryBackend$$ExternalSyntheticLambda1(2);
                categoryQueries.getClass();
                str5.getClass();
                FlowQuery$mapToList$$inlined$map$1 mapToList = DBUtil.mapToList(DBUtil.toFlow(new BadgeQueries$VersionQuery(categoryQueries, str5, new MerchantBlockingViewKt$$ExternalSyntheticLambda15(17, realCategoryBackend$$ExternalSyntheticLambda1, categoryQueries), (byte) 0)), realCategoryBackend.ioDispatcher);
                gapComposer7.updateRememberedValue(mapToList);
                obj13 = mapToList;
            }
            MutableState collectAsState7 = Updater.collectAsState((Flow) obj13, emptyList, null, gapComposer7, 48, 2);
            Object rememberedValue15 = gapComposer7.rememberedValue();
            if (rememberedValue15 == neverEqualPolicy) {
                String str6 = ((StockDetails) rememberUpdatedState.getValue()).symbol;
                investmentEntityToken2.getClass();
                str6.getClass();
                DisclosurePresenter.MetroFactory metroFactory = this.financialPresenter.delegateFactory;
                AndroidStringManager androidStringManager = (AndroidStringManager) metroFactory.stringManager.lambda.invoke();
                RealInvestingMetrics realInvestingMetrics = (RealInvestingMetrics) metroFactory.analytics.getValue();
                Cache cache = (Cache) metroFactory.blockersNavigator.invoke();
                Analytics analytics = (Analytics) metroFactory.appService.getValue();
                LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) metroFactory.launcher.invoke();
                androidStringManager.getClass();
                realInvestingMetrics.getClass();
                cache.getClass();
                analytics.getClass();
                factory.getClass();
                InvestmentEntityToken investmentEntityToken6 = investmentEntityToken2;
                BetterNavigator.ScreenNavigator screenNavigator5 = screenNavigator;
                rememberedValue15 = new InvestingFinancialPresenter(androidStringManager, realInvestingMetrics, cache, analytics, factory, accented, screenNavigator5, investmentEntityToken6, str6);
                screenNavigator2 = screenNavigator5;
                investmentEntityToken3 = investmentEntityToken6;
                gapComposer7.updateRememberedValue(rememberedValue15);
            } else {
                investmentEntityToken3 = investmentEntityToken2;
                screenNavigator2 = screenNavigator;
            }
            InvestingFinancialPresenter investingFinancialPresenter = (InvestingFinancialPresenter) rememberedValue15;
            Object rememberedValue16 = gapComposer7.rememberedValue();
            int i9 = 21;
            if (rememberedValue16 == neverEqualPolicy) {
                FormCashtag$8$invokeSuspend$$inlined$map$1 formCashtag$8$invokeSuspend$$inlined$map$1 = new FormCashtag$8$invokeSuspend$$inlined$map$1(new InviteContactsPresenter$filterContacts$$inlined$map$1(flow, 19), i9);
                gapComposer7.updateRememberedValue(formCashtag$8$invokeSuspend$$inlined$map$1);
                rememberedValue16 = formCashtag$8$invokeSuspend$$inlined$map$1;
            }
            X509CertUtils models2 = investingFinancialPresenter.models((Flow) rememberedValue16, (Composer) gapComposer7, 0);
            Object rememberedValue17 = gapComposer7.rememberedValue();
            if (rememberedValue17 == neverEqualPolicy) {
                investmentEntityToken3.getClass();
                TransferInPresenter$MetroFactory transferInPresenter$MetroFactory = this.earningsPresenterFactory.delegateFactory;
                AndroidStringManager androidStringManager2 = (AndroidStringManager) transferInPresenter$MetroFactory.stringManager.lambda.invoke();
                RealInvestingMetrics realInvestingMetrics2 = (RealInvestingMetrics) transferInPresenter$MetroFactory.analytics.getValue();
                LocalizedMoneyFormatter.Factory factory2 = (LocalizedMoneyFormatter.Factory) transferInPresenter$MetroFactory.moneyFormatterFactory.invoke();
                androidStringManager2.getClass();
                realInvestingMetrics2.getClass();
                factory2.getClass();
                InvestmentEntityToken investmentEntityToken7 = investmentEntityToken3;
                BetterNavigator.ScreenNavigator screenNavigator6 = screenNavigator2;
                InvestingEarningsPresenter investingEarningsPresenter = new InvestingEarningsPresenter(androidStringManager2, realInvestingMetrics2, factory2, accented, screenNavigator6, investmentEntityToken7);
                accented = accented;
                screenNavigator2 = screenNavigator6;
                investmentEntityToken3 = investmentEntityToken7;
                rememberedValue17 = investingEarningsPresenter;
                gapComposer7.updateRememberedValue(rememberedValue17);
            }
            InvestingEarningsPresenter investingEarningsPresenter2 = (InvestingEarningsPresenter) rememberedValue17;
            Object rememberedValue18 = gapComposer7.rememberedValue();
            int i10 = 22;
            if (rememberedValue18 == neverEqualPolicy) {
                FormCashtag$8$invokeSuspend$$inlined$map$1 formCashtag$8$invokeSuspend$$inlined$map$12 = new FormCashtag$8$invokeSuspend$$inlined$map$1(new InviteContactsPresenter$filterContacts$$inlined$map$1(flow, 20), i10);
                gapComposer7.updateRememberedValue(formCashtag$8$invokeSuspend$$inlined$map$12);
                rememberedValue18 = formCashtag$8$invokeSuspend$$inlined$map$12;
            }
            InvestingEarningsViewModel models3 = investingEarningsPresenter2.models((Flow) rememberedValue18, (Composer) gapComposer7, 0);
            Object rememberedValue19 = gapComposer7.rememberedValue();
            if (rememberedValue19 == neverEqualPolicy) {
                investmentEntityToken3.getClass();
                TransferInPresenter$MetroFactory transferInPresenter$MetroFactory2 = this.keyStatsPresenter.delegateFactory;
                RealInvestingMetrics realInvestingMetrics3 = (RealInvestingMetrics) transferInPresenter$MetroFactory2.analytics.getValue();
                ErrorReporter errorReporter = (ErrorReporter) transferInPresenter$MetroFactory2.stringManager.lambda.invoke();
                SampleStrategy sampleStrategy = (SampleStrategy) transferInPresenter$MetroFactory2.moneyFormatterFactory.invoke();
                realInvestingMetrics3.getClass();
                errorReporter.getClass();
                sampleStrategy.getClass();
                rememberedValue19 = new InvestingKeyStatsPresenter(realInvestingMetrics3, errorReporter, sampleStrategy, screenNavigator2, investmentEntityToken3);
                gapComposer7.updateRememberedValue(rememberedValue19);
            }
            InvestingKeyStatsPresenter investingKeyStatsPresenter = (InvestingKeyStatsPresenter) rememberedValue19;
            Object rememberedValue20 = gapComposer7.rememberedValue();
            int i11 = 23;
            if (rememberedValue20 == neverEqualPolicy) {
                FlowKt__MergeKt$flatMapConcat$$inlined$map$1 flowKt__MergeKt$flatMapConcat$$inlined$map$1 = new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new FormCashtag$8$invokeSuspend$$inlined$map$1(new InviteContactsPresenter$filterContacts$$inlined$map$1(flow, i9), i11), new RealKeyStoreProvider$setEntry$2(this, rememberUpdatedState, (Continuation) null, 4), 3);
                gapComposer7.updateRememberedValue(flowKt__MergeKt$flatMapConcat$$inlined$map$1);
                rememberedValue20 = flowKt__MergeKt$flatMapConcat$$inlined$map$1;
            }
            InvestingDetailTileViewModel models4 = investingKeyStatsPresenter.models((Flow) rememberedValue20, (Composer) gapComposer7, 0);
            Object rememberedValue21 = gapComposer7.rememberedValue();
            if (rememberedValue21 == neverEqualPolicy) {
                investmentEntityToken3.getClass();
                StampSheetPresenter$MetroFactory stampSheetPresenter$MetroFactory = this.analystOpinionsPresenter.delegateFactory;
                AndroidStringManager androidStringManager3 = (AndroidStringManager) stampSheetPresenter$MetroFactory.ioContext.lambda.invoke();
                RealInvestingMetrics realInvestingMetrics4 = (RealInvestingMetrics) stampSheetPresenter$MetroFactory.appConfig.getValue();
                androidStringManager3.getClass();
                realInvestingMetrics4.getClass();
                rememberedValue21 = new InvestingAnalystOpinionsPresenter(androidStringManager3, realInvestingMetrics4, accented, screenNavigator2, investmentEntityToken3);
                screenNavigator3 = screenNavigator2;
                investmentEntityToken4 = investmentEntityToken3;
                gapComposer7.updateRememberedValue(rememberedValue21);
            } else {
                screenNavigator3 = screenNavigator2;
                investmentEntityToken4 = investmentEntityToken3;
            }
            InvestingAnalystOpinionsPresenter investingAnalystOpinionsPresenter = (InvestingAnalystOpinionsPresenter) rememberedValue21;
            Object rememberedValue22 = gapComposer7.rememberedValue();
            int i12 = 24;
            if (rememberedValue22 == neverEqualPolicy) {
                FormCashtag$8$invokeSuspend$$inlined$map$1 formCashtag$8$invokeSuspend$$inlined$map$13 = new FormCashtag$8$invokeSuspend$$inlined$map$1(new InviteContactsPresenter$filterContacts$$inlined$map$1(flow, i10), i12);
                gapComposer7.updateRememberedValue(formCashtag$8$invokeSuspend$$inlined$map$13);
                rememberedValue22 = formCashtag$8$invokeSuspend$$inlined$map$13;
            }
            X509CertChainUtils models5 = investingAnalystOpinionsPresenter.models((Flow) rememberedValue22, (Composer) gapComposer7, 0);
            if (stockDetails2.isDependentCustomer) {
                gapComposer7.startReplaceGroup(-1282608887);
                gapComposer7.end(false);
                stockDetails = stockDetails2;
                b = 0;
                investingDetailTileViewModel = models4;
                investingCryptoNewsViewModel = null;
            } else {
                gapComposer7.startReplaceGroup(-1282568060);
                Object rememberedValue23 = gapComposer7.rememberedValue();
                if (rememberedValue23 == neverEqualPolicy) {
                    FormCashtag$8$invokeSuspend$$inlined$map$1 formCashtag$8$invokeSuspend$$inlined$map$14 = new FormCashtag$8$invokeSuspend$$inlined$map$1(new InviteContactsPresenter$filterContacts$$inlined$map$1(flow, 23), 25);
                    gapComposer7.updateRememberedValue(formCashtag$8$invokeSuspend$$inlined$map$14);
                    rememberedValue23 = formCashtag$8$invokeSuspend$$inlined$map$14;
                }
                Flow flow2 = (Flow) rememberedValue23;
                Object rememberedValue24 = gapComposer7.rememberedValue();
                if (rememberedValue24 == neverEqualPolicy) {
                    stockDetails = stockDetails2;
                    investingDetailTileViewModel = models4;
                    MoneybotHomePresenter create2 = this.newsPresenterFactory.create(screenNavigator3, new NewsKind.Stock(investmentEntityToken4), MultipartBody.Part.Companion.toEquityType(((StockDetails) rememberUpdatedState.getValue()).f1150type), true);
                    gapComposer7.updateRememberedValue(create2);
                    obj = create2;
                } else {
                    stockDetails = stockDetails2;
                    investingDetailTileViewModel = models4;
                    obj = rememberedValue24;
                }
                b = 0;
                InvestingCryptoNewsViewModel investingCryptoNewsViewModel2 = (InvestingCryptoNewsViewModel) ((MoleculePresenter) obj).models(flow2, gapComposer7, 0);
                gapComposer7.end(false);
                investingCryptoNewsViewModel = investingCryptoNewsViewModel2;
            }
            Object rememberedValue25 = gapComposer7.rememberedValue();
            if (rememberedValue25 == neverEqualPolicy) {
                InvestingEtfHoldingsPresenter.MetroFactory metroFactory2 = this.investingEtfHoldingsPresenterFactory.delegateFactory;
                RealInvestmentEntities realInvestmentEntities = (RealInvestmentEntities) metroFactory2.investmentEntities.invoke();
                RealInvestingMetrics realInvestingMetrics5 = (RealInvestingMetrics) metroFactory2.investingMetrics.getValue();
                AndroidStringManager androidStringManager4 = (AndroidStringManager) metroFactory2.stringManager.lambda.invoke();
                StateFlow stateFlow = (StateFlow) metroFactory2.lifecycleState.invoke();
                Analytics analytics2 = (Analytics) metroFactory2.analytics.getValue();
                realInvestmentEntities.getClass();
                realInvestingMetrics5.getClass();
                androidStringManager4.getClass();
                stateFlow.getClass();
                analytics2.getClass();
                BetterNavigator.ScreenNavigator screenNavigator7 = screenNavigator3;
                b2 = b;
                mutableState2 = collectAsState3;
                InvestingEtfHoldingsPresenter investingEtfHoldingsPresenter = new InvestingEtfHoldingsPresenter(realInvestmentEntities, realInvestingMetrics5, androidStringManager4, stateFlow, analytics2, stockDetails, screenNavigator7);
                gapComposer7.updateRememberedValue(investingEtfHoldingsPresenter);
                rememberedValue25 = investingEtfHoldingsPresenter;
            } else {
                b2 = b;
                mutableState2 = collectAsState3;
            }
            InvestingEtfHoldingsPresenter investingEtfHoldingsPresenter2 = (InvestingEtfHoldingsPresenter) rememberedValue25;
            Object rememberedValue26 = gapComposer7.rememberedValue();
            if (rememberedValue26 == neverEqualPolicy) {
                FormCashtag$8$invokeSuspend$$inlined$map$1 formCashtag$8$invokeSuspend$$inlined$map$15 = new FormCashtag$8$invokeSuspend$$inlined$map$1(new InviteContactsPresenter$filterContacts$$inlined$map$1(flow, 24), 26);
                gapComposer7.updateRememberedValue(formCashtag$8$invokeSuspend$$inlined$map$15);
                rememberedValue26 = formCashtag$8$invokeSuspend$$inlined$map$15;
            }
            InvestingEtfHoldingsViewModel models6 = investingEtfHoldingsPresenter2.models((Flow) rememberedValue26, (Composer) gapComposer7, (int) b2);
            StockDetails stockDetails5 = (StockDetails) rememberUpdatedState.getValue();
            Object rememberedValue27 = gapComposer7.rememberedValue();
            if (rememberedValue27 == neverEqualPolicy) {
                RecurringPreferenceQueries recurringPreferenceQueries2 = cashAccountDatabaseImpl.recurringPreferenceQueries;
                String str7 = investmentEntityToken4.value;
                recurringPreferenceQueries2.getClass();
                int i13 = RecurringPreferenceQueries$selectForStock$2.$r8$clinit;
                mutableState3 = mutableState2;
                RealActivityInvitePresenter realActivityInvitePresenter = new RealActivityInvitePresenter(21, DBUtil.mapToOneOrNull(DBUtil.toFlow(recurringPreferenceQueries2.new SelectForIdQuery(str7, new RecurringPreferenceQueries$$ExternalSyntheticLambda5(recurringPreferenceQueries2, 2), b2)), coroutineContext), this, stockDetails5);
                gapComposer7.updateRememberedValue(realActivityInvitePresenter);
                obj2 = realActivityInvitePresenter;
            } else {
                mutableState3 = mutableState2;
                obj2 = rememberedValue27;
            }
            MutableState mutableState6 = mutableState3;
            InvestingCryptoRecurringPurchaseTileViewModel investingCryptoRecurringPurchaseTileViewModel = (InvestingCryptoRecurringPurchaseTileViewModel) Updater.collectAsState((Flow) obj2, null, null, gapComposer7, 48, 2).getValue();
            GraphPresenterData graphPresenterData = (GraphPresenterData) collectAsState6.getValue();
            InvestingGraphViewEvent.ScrubPoint scrubPoint = (InvestingGraphViewEvent.ScrubPoint) mutableState.getValue();
            InvestingCryptoNewsViewModel investingCryptoNewsViewModel3 = investingCryptoNewsViewModel;
            InvestingDetailTileViewModel investingDetailTileViewModel2 = investingDetailTileViewModel;
            HistoricalRange historicalRange4 = historicalRange;
            Object[] objArr3 = {historicalRange4, graphPresenterData, scrubPoint != null ? scrubPoint.point : null, (Loaded) mutableState6.getValue(), (StockDetails) rememberUpdatedState.getValue(), Boolean.valueOf(z2), investingCryptoRecurringPurchaseTileViewModel, (List) collectAsState7.getValue(), investingCryptoNewsViewModel3, models2, models3, models5, investingDetailTileViewModel2, uiCallbackModel, models6};
            UiCallbackModel uiCallbackModel2 = uiCallbackModel;
            boolean z7 = z2;
            boolean changedInstance = gapComposer7.changedInstance(this) | gapComposer7.changed(historicalRange4.ordinal()) | gapComposer7.changed(collectAsState6) | gapComposer7.changed(mutableState6) | gapComposer7.changed(rememberUpdatedState) | gapComposer7.changed(z7) | gapComposer7.changed(investingCryptoRecurringPurchaseTileViewModel) | gapComposer7.changed(collectAsState7) | gapComposer7.changed(investingCryptoNewsViewModel3) | gapComposer7.changedInstance(models2) | gapComposer7.changedInstance(models3) | gapComposer7.changedInstance(models5) | gapComposer7.changedInstance(investingDetailTileViewModel2) | gapComposer7.changedInstance(uiCallbackModel2) | gapComposer7.changedInstance(models6) | gapComposer7.changedInstance(investing_settings);
            Object rememberedValue28 = gapComposer7.rememberedValue();
            if (changedInstance || rememberedValue28 == neverEqualPolicy) {
                objArr = objArr3;
                TransferStockPresenter$models$$inlined$CollectEffect$1 transferStockPresenter$models$$inlined$CollectEffect$1 = new TransferStockPresenter$models$$inlined$CollectEffect$1(this, historicalRange4, z7, investingCryptoRecurringPurchaseTileViewModel, investingCryptoNewsViewModel3, models2, models3, models5, investingDetailTileViewModel2, uiCallbackModel2, models6, investing_settings, collectAsState6, mutableState, mutableState6, rememberUpdatedState, collectAsState7, null);
                GapComposer gapComposer8 = gapComposer7;
                gapComposer8.updateRememberedValue(transferStockPresenter$models$$inlined$CollectEffect$1);
                obj3 = transferStockPresenter$models$$inlined$CollectEffect$1;
                gapComposer3 = gapComposer8;
            } else {
                objArr = objArr3;
                gapComposer3 = gapComposer7;
                obj3 = rememberedValue28;
            }
            r4 = 0;
            investingStockDetailsViewModel = (InvestingStockDetailsViewModel) Updater.produceState(null, objArr, (Function2) obj3, gapComposer3).getValue();
            z3 = false;
            gapComposer3.end(false);
            gapComposer4 = gapComposer3;
        }
        if (investingStockDetailsViewModel == null) {
            InvestingStockDetailsHeaderViewModel.Subtitle subtitle = new InvestingStockDetailsHeaderViewModel.Subtitle(null, "", "", null, null, InvestingStockDetailsHeaderViewModel.Subtitle.ColorType.ACCENT_COLOR);
            ColorModel.Investing investing = ColorModel.Investing.INSTANCE;
            investingStockDetailsViewModel = new InvestingStockDetailsViewModel(new InvestmentEntityContentModel(new InvestingStockDetailsHeaderViewModel(null, "", subtitle, investing, null, true), new InvestingGraphContentModel.Loading(r4, 31), false, true, InvestingDetailTileViewModel.Loading.INSTANCE, HistoricalRange.DAY, new InvestmentEntityContentModel.InvestmentEntityButtonContainerModel(investing, r4, r4), null, new InvestingCryptoNewsViewModel(EmptyList.INSTANCE, "", r4), null, InvestingFinancialViewModel$Loading.INSTANCE, InvestingEarningsViewModel.Loading.INSTANCE, InvestingAnalystOpinionsViewModel$Loading.INSTANCE, null, false, null, null, null, "", RealBufferedSource.getSortOrder(z3, z3)));
        }
        gapComposer4.end(z3);
        return investingStockDetailsViewModel;
    }

    public final InvestingScreens screenForType(OrderSide orderSide, StockDetails stockDetails, boolean z) {
        Money money;
        InvestmentEntityWithPrice investmentEntityWithPrice = stockDetails.entityWithPrice;
        Color color = stockDetails.color;
        CurrentPrice price = investmentEntityWithPrice.getPrice();
        Long l = (price == null || (money = price.current_price) == null) ? null : money.amount;
        if (l == null) {
            a$$ExternalSyntheticBUOutline0.m$1("current_price is null");
            return null;
        }
        long longValue = l.longValue();
        if (z) {
            return InvestingScreens.StocksTransferEtaSheet.INSTANCE;
        }
        if (orderSide != OrderSide.BUY || !investmentEntityWithPrice.getDelisted()) {
            InvestingScreens.StockDetails stockDetails2 = this.args;
            return new InvestingScreens.TransferStock(stockDetails2.investmentEntityToken, orderSide, longValue, new ColorModel.Accented(color), null, stockDetails2.referrerFlowToken, 112);
        }
        String displayName = investmentEntityWithPrice.getDisplayName();
        displayName.getClass();
        Resources resources = this.stringManager.resources;
        resources.getClass();
        String format2 = new MessageFormat(resources.getString(R.string.cannot_buy_otc_stock)).format(new Object[]{displayName});
        format2.getClass();
        return new InvestingScreens.InvestingExplanatoryDialogScreen(format2, new ColorModel.Accented(color));
    }
}
