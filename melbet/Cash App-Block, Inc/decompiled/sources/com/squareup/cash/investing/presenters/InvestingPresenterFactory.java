package com.squareup.cash.investing.presenters;

import androidx.compose.runtime.internal.RememberEventDispatcher;
import app.cash.broadway.presenter.Presenter;
import app.cash.broadway.presenter.PresenterFactory;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt;
import app.cash.broadway.screen.Screen;
import app.cash.inputfieldtext.saver.RealInputFieldTextSaver;
import app.cash.local.presenters.LocalCashBalancePresenter;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import coil3.ImageLoader$Builder;
import com.squareup.cash.activity.backend.loader.RealActivitiesCacheManager;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter$Factory$Impl;
import com.squareup.cash.afterpayapplet.presenters.AfterpaySearchPresenter$MetroFactory;
import com.squareup.cash.amountslider.presenters.AmountSelectorPresenter;
import com.squareup.cash.attribution.ProductionAttributionEventEmitter;
import com.squareup.cash.bitcoin.navigation.RealBitcoinInboundNavigator$Factory$Impl;
import com.squareup.cash.blockers.presenters.BlockerImageUploader$MetroFactory;
import com.squareup.cash.blockers.presenters.PlaidLinkPresenter;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.boost.db.Reward$Adapter;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.CardStudioPresenterV2$MetroFactory;
import com.squareup.cash.card.onboarding.CardStudioUndoDialogPresenter;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.cashapplite.cashin.RealLiteCashInRepo$MetroFactory;
import com.squareup.cash.checks.CheckDepositAmountPresenter;
import com.squareup.cash.checks.VerifyCheckDialogPresenter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.clientsync.syncer.RealClientSyncer;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.backend.balance.RealCryptoBalanceRepo;
import com.squareup.cash.crypto.backend.value.RealCryptoValueRepo;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.data.profile.RealProfileNotificationsRepository;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.profile.Profile;
import com.squareup.cash.family.familyhub.backend.api.DependentRecurringPreferenceStore;
import com.squareup.cash.family.familyhub.backend.real.RealDependentCustomerTokenRepository;
import com.squareup.cash.family.familyhub.presenters.SponsorLedInvitePresenter$MetroFactory;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.history.backend.real.RealInvestingActivitiesManager$Factory$Impl;
import com.squareup.cash.history.backend.real.RealInvestmentActivity;
import com.squareup.cash.history.presenters.SkipPaymentPresenter$MetroFactory;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.backend.real.RealInvestingHistoricalData;
import com.squareup.cash.investing.backend.real.RealInvestingStateManager;
import com.squareup.cash.investing.backend.real.RealInvestingSyncer;
import com.squareup.cash.investing.backend.real.RealInvestmentEntities;
import com.squareup.cash.investing.backend.real.RealInvestmentPerformanceSyncer;
import com.squareup.cash.investing.backend.real.RecurringScheduleBuilder;
import com.squareup.cash.investing.backend.real.analytics.RealInvestingAnalytics;
import com.squareup.cash.investing.backend.real.categories.RealCategoryBackend;
import com.squareup.cash.investing.backend.real.metrics.RealInvestingMetrics;
import com.squareup.cash.investing.presenters.activity.InvestingActivityHistoryPresenter$Factory$Impl;
import com.squareup.cash.investing.presenters.autoinvest.CancelRecurringBitcoinPurchasePresenter;
import com.squareup.cash.investing.presenters.autoinvest.CancelRecurringBitcoinPurchasePresenter$Factory$Impl;
import com.squareup.cash.investing.presenters.autoinvest.CancelRecurringEquityPurchasePresenter$Factory$Impl;
import com.squareup.cash.investing.presenters.autoinvest.DependentAutoInvestInfoBottomSheetPresenter$Factory$Impl;
import com.squareup.cash.investing.presenters.autoinvest.InvestingRecurringFrequencyPickerFullPresenter;
import com.squareup.cash.investing.presenters.autoinvest.InvestingRecurringFrequencyPickerFullPresenter$Factory$Impl;
import com.squareup.cash.investing.presenters.autoinvest.InvestingRecurringPurchaseReceiptPresenter;
import com.squareup.cash.investing.presenters.autoinvest.InvestingRecurringPurchaseReceiptPresenter$Factory$Impl;
import com.squareup.cash.investing.presenters.categories.InvestingCategoryDetailPresenter$Factory$Impl;
import com.squareup.cash.investing.presenters.categories.InvestingCategoryFilterPresenter$Factory$Impl;
import com.squareup.cash.investing.presenters.categories.InvestingFilterCategoriesPresenter$Factory$Impl;
import com.squareup.cash.investing.presenters.categories.InvestingFilterSubFiltersPresenter$Factory$Impl;
import com.squareup.cash.investing.presenters.custom.order.CancelOrderPresenter$Factory$Impl;
import com.squareup.cash.investing.presenters.custom.order.InvestingCustomOrderPresenter;
import com.squareup.cash.investing.presenters.custom.order.InvestingCustomOrderPresenter$Factory$Impl;
import com.squareup.cash.investing.presenters.custom.order.InvestingCustomSharePricePresenter$Factory$Impl;
import com.squareup.cash.investing.presenters.custom.order.InvestingOrderTypeSelectionPresenter;
import com.squareup.cash.investing.presenters.custom.order.InvestingOrderTypeSelectionPresenter$Factory$Impl;
import com.squareup.cash.investing.presenters.custom.order.InvestingPeriodSelectionPresenter$Factory$Impl;
import com.squareup.cash.investing.presenters.drip.DividendReinvestmentLearnMorePresenter$Factory$Impl;
import com.squareup.cash.investing.presenters.drip.DividendReinvestmentSettingPresenter$Factory$Impl;
import com.squareup.cash.investing.presenters.drip.DividendReinvestmentWelcomePresenter$Factory$Impl;
import com.squareup.cash.investing.presenters.holdings.InvestingEtfHoldingDetailsPresenter$Factory$Impl;
import com.squareup.cash.investing.presenters.holdings.InvestingEtfHoldingsPresenter$Factory$Impl;
import com.squareup.cash.investing.presenters.keystats.InvestingKeyStatsDetailsPresenter$Factory$Impl;
import com.squareup.cash.investing.presenters.metrics.InvestingAnalystOpinionsPresenter$Factory$Impl;
import com.squareup.cash.investing.presenters.metrics.InvestingEarningsPresenter$Factory$Impl;
import com.squareup.cash.investing.presenters.metrics.InvestingFinancialPresenter$Factory$Impl;
import com.squareup.cash.investing.presenters.metrics.InvestingKeyStatsPresenter$Factory$Impl;
import com.squareup.cash.investing.presenters.navigation.RealInvestingInboundNavigator$Factory$Impl;
import com.squareup.cash.investing.presenters.search.InvestingSearchPresenter$Factory$Impl;
import com.squareup.cash.investing.presenters.settings.InvestingSettingsPresenter;
import com.squareup.cash.investing.presenters.settings.InvestingSettingsPresenter$Factory$Impl;
import com.squareup.cash.investing.presenters.stockdetails.InvestingStockDetailsActivityRequestHandler$Factory$Impl;
import com.squareup.cash.investing.presenters.stockdetails.InvestingStockDetailsPresenter;
import com.squareup.cash.investing.presenters.stockdetails.InvestingStockDetailsPresenter$Factory$Impl;
import com.squareup.cash.investing.presenters.stockdetails.LastSelectedRange;
import com.squareup.cash.investing.presenters.teengraduation.StocksTransferEtaFullScreenPresenter$Factory$Impl;
import com.squareup.cash.investing.presenters.teengraduation.StocksTransferEtaSheetPresenter;
import com.squareup.cash.investing.presenters.teengraduation.StocksTransferEtaSheetPresenter$Factory$Impl;
import com.squareup.cash.investing.primitives.CategoryToken;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.investingcrypto.presenters.news.InvestingCryptoNewsPresenter$Factory$Impl;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.navigation.CashInvestingOutboundNavigator$Factory$Impl;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.payments.backend.api.PaymentManager;
import com.squareup.cash.payments.presenters.PaymentConfigurationPresenter;
import com.squareup.cash.performance.ScrollPerformanceAnalyzer$Factory$Impl;
import com.squareup.cash.pools.presenters.PoolDetailsPresenter$MetroFactory;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.portfolio.graphs.RealInvestingGraphCalculator;
import com.squareup.cash.profile.presenters.OpenSourcePresenter$MetroFactory;
import com.squareup.cash.profile.presenters.ProfilePresenter;
import com.squareup.cash.resource.AndroidDateFormatManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.savings.presenters.TransferInPresenter$MetroFactory;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.sharesheet.ShareSheetPresenter;
import com.squareup.cash.taptopay.presenters.TapToPayPaymentRequestPresenter$MetroFactory;
import com.squareup.cash.taptopay.presenters.TapToPayPresenter;
import com.squareup.cash.tax.presenters.TaxTooltipPresenter$MetroFactory;
import com.squareup.cash.transfers.presenters.LinkedAccountsPresenter;
import com.squareup.cash.util.cache.Cache;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.work.presenters.WorkHomePresenter;
import com.squareup.cash.work.session.RealCurrentUserSetter;
import com.squareup.preferences.BooleanPreference;
import com.squareup.preferences.EnumPreference;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.investcustomer.api.v1.drip.InvestCustomerDripService;
import com.squareup.protos.cash.investflow.flows.InvestFlowService;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.investing.InvestingService;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DelegateFactory;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public final class InvestingPresenterFactory implements PresenterFactory {
    public final CancelOrderPresenter$Factory$Impl cancelOrderPresenter;
    public final CancelRecurringBitcoinPurchasePresenter$Factory$Impl cancelRecurringBitcoinPurchasePresenter;
    public final CancelRecurringEquityPurchasePresenter$Factory$Impl cancelRecurringEquityPurchasePresenter;
    public final InvestingCategoryDetailPresenter$Factory$Impl categoryDetailPresenter;
    public final InvestingCustomOrderPresenter$Factory$Impl customOrderPresenter;
    public final DependentAutoInvestInfoBottomSheetPresenter$Factory$Impl dependentAutoInvestInfoBottomSheetPresenter;
    public final DependentWelcomePresenter$Factory$Impl dependentWelcomePresenterFactory;
    public final DividendReinvestmentLearnMorePresenter$Factory$Impl dividendReinvestmentLearnMorePresenter;
    public final DividendReinvestmentSettingPresenter$Factory$Impl dividendReinvestmentSettingPresenter;
    public final DividendReinvestmentWelcomePresenter$Factory$Impl dividendReinvestmentWelcomePresenter;
    public final InvestingFilterSubFiltersPresenter$Factory$Impl filterSubFiltersPresenter;
    public final InvestingRecurringFrequencyPickerFullPresenter$Factory$Impl frequencyPickerFullScreenPresenter;
    public final InvestingCategoryFilterPresenter$Factory$Impl investingCategoryFilterPresenter;
    public final InvestingCustomSharePricePresenter$Factory$Impl investingCustomSharePricePresenter;
    public final InvestingEtfHoldingDetailsPresenter$Factory$Impl investingEtfHoldingDetailsPresenter;
    public final InvestingFilterCategoriesPresenter$Factory$Impl investingFilterCategories;
    public final InvestingHomePresenter$Factory$Impl investingHomePresenter;
    public final InvestingKeyStatsDetailsPresenter$Factory$Impl investingKeyStatsDetailsPresenter;
    public final InvestingPeriodSelectionPresenter$Factory$Impl investingPeriodSelectionPresenter;
    public final InvestingActivityHistoryPresenter$Factory$Impl investmentActivityHistoryPresenter;
    public final InvestingCryptoNewsPresenter$Factory$Impl newsPresenter;
    public final InvestingOrderTypeSelectionPresenter$Factory$Impl orderTypeSelectionPresenter;
    public final PerformancePresenter$Factory$Impl performancePresenter;
    public final InvestingRecurringPurchaseReceiptPresenter$Factory$Impl recurringPurchaseReceiptPresenter;
    public final InvestingSearchPresenter$Factory$Impl searchPresenter;
    public final SectionMoreInfoPresenter$Factory$Impl sectionMoreInfoPresenter;
    public final InvestingSettingsPresenter$Factory$Impl settingsPresenter;
    public final InvestingStockDetailsPresenter$Factory$Impl stockDetailsPresenter;
    public final StockMetricTypePickerPresenter$Factory$Impl stockMetricTypePickerPresenter;
    public final InvestingStockSelectionBlockerPresenter$Factory$Impl stockSelectionBlocker;
    public final StocksTransferEtaFullScreenPresenter$Factory$Impl stocksTransferEtaFullScreen;
    public final StocksTransferEtaSheetPresenter$Factory$Impl stocksTransferEtaSheet;
    public final TransferStockPresenter$Factory$Impl transferStockPresenter;

    public final class MetroFactory implements Factory {
        public final InstanceFactory cancelOrderPresenter;
        public final InstanceFactory cancelRecurringBitcoinPurchasePresenter;
        public final InstanceFactory cancelRecurringEquityPurchasePresenter;
        public final InstanceFactory categoryDetailPresenter;
        public final InstanceFactory customOrderPresenter;
        public final InstanceFactory dependentAutoInvestInfoBottomSheetPresenter;
        public final InstanceFactory dependentWelcomePresenterFactory;
        public final InstanceFactory dividendReinvestmentLearnMorePresenter;
        public final InstanceFactory dividendReinvestmentSettingPresenter;
        public final InstanceFactory dividendReinvestmentWelcomePresenter;
        public final InstanceFactory filterSubFiltersPresenter;
        public final InstanceFactory frequencyPickerFullScreenPresenter;
        public final InstanceFactory investingCategoryFilterPresenter;
        public final InstanceFactory investingCustomSharePricePresenter;
        public final InstanceFactory investingEtfHoldingDetailsPresenter;
        public final InstanceFactory investingFilterCategories;
        public final InstanceFactory investingHomePresenter;
        public final InstanceFactory investingKeyStatsDetailsPresenter;
        public final InstanceFactory investingPeriodSelectionPresenter;
        public final InstanceFactory investmentActivityHistoryPresenter;
        public final Provider newsPresenter;
        public final InstanceFactory orderTypeSelectionPresenter;
        public final InstanceFactory performancePresenter;
        public final InstanceFactory recurringPurchaseReceiptPresenter;
        public final Provider searchPresenter;
        public final InstanceFactory sectionMoreInfoPresenter;
        public final InstanceFactory settingsPresenter;
        public final InstanceFactory stockDetailsPresenter;
        public final InstanceFactory stockMetricTypePickerPresenter;
        public final InstanceFactory stockSelectionBlocker;
        public final InstanceFactory stocksTransferEtaFullScreen;
        public final InstanceFactory stocksTransferEtaSheet;
        public final InstanceFactory transferStockPresenter;

        public MetroFactory(InstanceFactory instanceFactory, InstanceFactory instanceFactory2, InstanceFactory instanceFactory3, InstanceFactory instanceFactory4, InstanceFactory instanceFactory5, InstanceFactory instanceFactory6, Provider provider, InstanceFactory instanceFactory7, InstanceFactory instanceFactory8, InstanceFactory instanceFactory9, InstanceFactory instanceFactory10, InstanceFactory instanceFactory11, InstanceFactory instanceFactory12, InstanceFactory instanceFactory13, InstanceFactory instanceFactory14, InstanceFactory instanceFactory15, InstanceFactory instanceFactory16, InstanceFactory instanceFactory17, InstanceFactory instanceFactory18, InstanceFactory instanceFactory19, InstanceFactory instanceFactory20, InstanceFactory instanceFactory21, Provider provider2, InstanceFactory instanceFactory22, InstanceFactory instanceFactory23, InstanceFactory instanceFactory24, InstanceFactory instanceFactory25, InstanceFactory instanceFactory26, InstanceFactory instanceFactory27, InstanceFactory instanceFactory28, InstanceFactory instanceFactory29, InstanceFactory instanceFactory30, InstanceFactory instanceFactory31) {
            this.investingFilterCategories = instanceFactory;
            this.investingCustomSharePricePresenter = instanceFactory2;
            this.settingsPresenter = instanceFactory3;
            this.investingPeriodSelectionPresenter = instanceFactory4;
            this.filterSubFiltersPresenter = instanceFactory5;
            this.orderTypeSelectionPresenter = instanceFactory6;
            this.newsPresenter = provider;
            this.transferStockPresenter = instanceFactory7;
            this.customOrderPresenter = instanceFactory8;
            this.frequencyPickerFullScreenPresenter = instanceFactory9;
            this.cancelOrderPresenter = instanceFactory10;
            this.investingKeyStatsDetailsPresenter = instanceFactory11;
            this.stockMetricTypePickerPresenter = instanceFactory12;
            this.sectionMoreInfoPresenter = instanceFactory13;
            this.performancePresenter = instanceFactory14;
            this.stockDetailsPresenter = instanceFactory15;
            this.cancelRecurringEquityPurchasePresenter = instanceFactory16;
            this.cancelRecurringBitcoinPurchasePresenter = instanceFactory17;
            this.investingHomePresenter = instanceFactory18;
            this.recurringPurchaseReceiptPresenter = instanceFactory19;
            this.categoryDetailPresenter = instanceFactory20;
            this.investingCategoryFilterPresenter = instanceFactory21;
            this.searchPresenter = provider2;
            this.dependentWelcomePresenterFactory = instanceFactory22;
            this.stockSelectionBlocker = instanceFactory23;
            this.dividendReinvestmentWelcomePresenter = instanceFactory24;
            this.dividendReinvestmentLearnMorePresenter = instanceFactory25;
            this.dividendReinvestmentSettingPresenter = instanceFactory26;
            this.stocksTransferEtaFullScreen = instanceFactory27;
            this.stocksTransferEtaSheet = instanceFactory28;
            this.dependentAutoInvestInfoBottomSheetPresenter = instanceFactory29;
            this.investmentActivityHistoryPresenter = instanceFactory30;
            this.investingEtfHoldingDetailsPresenter = instanceFactory31;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            InvestingFilterCategoriesPresenter$Factory$Impl investingFilterCategoriesPresenter$Factory$Impl = (InvestingFilterCategoriesPresenter$Factory$Impl) this.investingFilterCategories.value;
            InvestingCustomSharePricePresenter$Factory$Impl investingCustomSharePricePresenter$Factory$Impl = (InvestingCustomSharePricePresenter$Factory$Impl) this.investingCustomSharePricePresenter.value;
            InvestingSettingsPresenter$Factory$Impl investingSettingsPresenter$Factory$Impl = (InvestingSettingsPresenter$Factory$Impl) this.settingsPresenter.value;
            InvestingPeriodSelectionPresenter$Factory$Impl investingPeriodSelectionPresenter$Factory$Impl = (InvestingPeriodSelectionPresenter$Factory$Impl) this.investingPeriodSelectionPresenter.value;
            InvestingFilterSubFiltersPresenter$Factory$Impl investingFilterSubFiltersPresenter$Factory$Impl = (InvestingFilterSubFiltersPresenter$Factory$Impl) this.filterSubFiltersPresenter.value;
            InvestingOrderTypeSelectionPresenter$Factory$Impl investingOrderTypeSelectionPresenter$Factory$Impl = (InvestingOrderTypeSelectionPresenter$Factory$Impl) this.orderTypeSelectionPresenter.value;
            InvestingCryptoNewsPresenter$Factory$Impl investingCryptoNewsPresenter$Factory$Impl = (InvestingCryptoNewsPresenter$Factory$Impl) this.newsPresenter.invoke();
            TransferStockPresenter$Factory$Impl transferStockPresenter$Factory$Impl = (TransferStockPresenter$Factory$Impl) this.transferStockPresenter.value;
            InvestingCustomOrderPresenter$Factory$Impl investingCustomOrderPresenter$Factory$Impl = (InvestingCustomOrderPresenter$Factory$Impl) this.customOrderPresenter.value;
            InvestingRecurringFrequencyPickerFullPresenter$Factory$Impl investingRecurringFrequencyPickerFullPresenter$Factory$Impl = (InvestingRecurringFrequencyPickerFullPresenter$Factory$Impl) this.frequencyPickerFullScreenPresenter.value;
            CancelOrderPresenter$Factory$Impl cancelOrderPresenter$Factory$Impl = (CancelOrderPresenter$Factory$Impl) this.cancelOrderPresenter.value;
            InvestingKeyStatsDetailsPresenter$Factory$Impl investingKeyStatsDetailsPresenter$Factory$Impl = (InvestingKeyStatsDetailsPresenter$Factory$Impl) this.investingKeyStatsDetailsPresenter.value;
            StockMetricTypePickerPresenter$Factory$Impl stockMetricTypePickerPresenter$Factory$Impl = (StockMetricTypePickerPresenter$Factory$Impl) this.stockMetricTypePickerPresenter.value;
            SectionMoreInfoPresenter$Factory$Impl sectionMoreInfoPresenter$Factory$Impl = (SectionMoreInfoPresenter$Factory$Impl) this.sectionMoreInfoPresenter.value;
            PerformancePresenter$Factory$Impl performancePresenter$Factory$Impl = (PerformancePresenter$Factory$Impl) this.performancePresenter.value;
            InvestingStockDetailsPresenter$Factory$Impl investingStockDetailsPresenter$Factory$Impl = (InvestingStockDetailsPresenter$Factory$Impl) this.stockDetailsPresenter.value;
            CancelRecurringEquityPurchasePresenter$Factory$Impl cancelRecurringEquityPurchasePresenter$Factory$Impl = (CancelRecurringEquityPurchasePresenter$Factory$Impl) this.cancelRecurringEquityPurchasePresenter.value;
            CancelRecurringBitcoinPurchasePresenter$Factory$Impl cancelRecurringBitcoinPurchasePresenter$Factory$Impl = (CancelRecurringBitcoinPurchasePresenter$Factory$Impl) this.cancelRecurringBitcoinPurchasePresenter.value;
            InvestingHomePresenter$Factory$Impl investingHomePresenter$Factory$Impl = (InvestingHomePresenter$Factory$Impl) this.investingHomePresenter.value;
            InvestingRecurringPurchaseReceiptPresenter$Factory$Impl investingRecurringPurchaseReceiptPresenter$Factory$Impl = (InvestingRecurringPurchaseReceiptPresenter$Factory$Impl) this.recurringPurchaseReceiptPresenter.value;
            InvestingCategoryDetailPresenter$Factory$Impl investingCategoryDetailPresenter$Factory$Impl = (InvestingCategoryDetailPresenter$Factory$Impl) this.categoryDetailPresenter.value;
            InvestingCategoryFilterPresenter$Factory$Impl investingCategoryFilterPresenter$Factory$Impl = (InvestingCategoryFilterPresenter$Factory$Impl) this.investingCategoryFilterPresenter.value;
            InvestingSearchPresenter$Factory$Impl investingSearchPresenter$Factory$Impl = (InvestingSearchPresenter$Factory$Impl) this.searchPresenter.invoke();
            DependentWelcomePresenter$Factory$Impl dependentWelcomePresenter$Factory$Impl = (DependentWelcomePresenter$Factory$Impl) this.dependentWelcomePresenterFactory.value;
            InvestingStockSelectionBlockerPresenter$Factory$Impl investingStockSelectionBlockerPresenter$Factory$Impl = (InvestingStockSelectionBlockerPresenter$Factory$Impl) this.stockSelectionBlocker.value;
            DividendReinvestmentWelcomePresenter$Factory$Impl dividendReinvestmentWelcomePresenter$Factory$Impl = (DividendReinvestmentWelcomePresenter$Factory$Impl) this.dividendReinvestmentWelcomePresenter.value;
            DividendReinvestmentLearnMorePresenter$Factory$Impl dividendReinvestmentLearnMorePresenter$Factory$Impl = (DividendReinvestmentLearnMorePresenter$Factory$Impl) this.dividendReinvestmentLearnMorePresenter.value;
            DividendReinvestmentSettingPresenter$Factory$Impl dividendReinvestmentSettingPresenter$Factory$Impl = (DividendReinvestmentSettingPresenter$Factory$Impl) this.dividendReinvestmentSettingPresenter.value;
            StocksTransferEtaFullScreenPresenter$Factory$Impl stocksTransferEtaFullScreenPresenter$Factory$Impl = (StocksTransferEtaFullScreenPresenter$Factory$Impl) this.stocksTransferEtaFullScreen.value;
            StocksTransferEtaSheetPresenter$Factory$Impl stocksTransferEtaSheetPresenter$Factory$Impl = (StocksTransferEtaSheetPresenter$Factory$Impl) this.stocksTransferEtaSheet.value;
            DependentAutoInvestInfoBottomSheetPresenter$Factory$Impl dependentAutoInvestInfoBottomSheetPresenter$Factory$Impl = (DependentAutoInvestInfoBottomSheetPresenter$Factory$Impl) this.dependentAutoInvestInfoBottomSheetPresenter.value;
            InvestingActivityHistoryPresenter$Factory$Impl investingActivityHistoryPresenter$Factory$Impl = (InvestingActivityHistoryPresenter$Factory$Impl) this.investmentActivityHistoryPresenter.value;
            InvestingEtfHoldingDetailsPresenter$Factory$Impl investingEtfHoldingDetailsPresenter$Factory$Impl = (InvestingEtfHoldingDetailsPresenter$Factory$Impl) this.investingEtfHoldingDetailsPresenter.value;
            investingFilterCategoriesPresenter$Factory$Impl.getClass();
            investingCustomSharePricePresenter$Factory$Impl.getClass();
            investingSettingsPresenter$Factory$Impl.getClass();
            investingPeriodSelectionPresenter$Factory$Impl.getClass();
            investingFilterSubFiltersPresenter$Factory$Impl.getClass();
            investingOrderTypeSelectionPresenter$Factory$Impl.getClass();
            investingCryptoNewsPresenter$Factory$Impl.getClass();
            transferStockPresenter$Factory$Impl.getClass();
            investingCustomOrderPresenter$Factory$Impl.getClass();
            investingRecurringFrequencyPickerFullPresenter$Factory$Impl.getClass();
            cancelOrderPresenter$Factory$Impl.getClass();
            investingKeyStatsDetailsPresenter$Factory$Impl.getClass();
            stockMetricTypePickerPresenter$Factory$Impl.getClass();
            sectionMoreInfoPresenter$Factory$Impl.getClass();
            performancePresenter$Factory$Impl.getClass();
            investingStockDetailsPresenter$Factory$Impl.getClass();
            cancelRecurringEquityPurchasePresenter$Factory$Impl.getClass();
            cancelRecurringBitcoinPurchasePresenter$Factory$Impl.getClass();
            investingHomePresenter$Factory$Impl.getClass();
            investingRecurringPurchaseReceiptPresenter$Factory$Impl.getClass();
            investingCategoryDetailPresenter$Factory$Impl.getClass();
            investingCategoryFilterPresenter$Factory$Impl.getClass();
            investingSearchPresenter$Factory$Impl.getClass();
            dependentWelcomePresenter$Factory$Impl.getClass();
            investingStockSelectionBlockerPresenter$Factory$Impl.getClass();
            dividendReinvestmentWelcomePresenter$Factory$Impl.getClass();
            dividendReinvestmentLearnMorePresenter$Factory$Impl.getClass();
            dividendReinvestmentSettingPresenter$Factory$Impl.getClass();
            stocksTransferEtaFullScreenPresenter$Factory$Impl.getClass();
            stocksTransferEtaSheetPresenter$Factory$Impl.getClass();
            dependentAutoInvestInfoBottomSheetPresenter$Factory$Impl.getClass();
            investingActivityHistoryPresenter$Factory$Impl.getClass();
            investingEtfHoldingDetailsPresenter$Factory$Impl.getClass();
            return new InvestingPresenterFactory(investingFilterCategoriesPresenter$Factory$Impl, investingCustomSharePricePresenter$Factory$Impl, investingSettingsPresenter$Factory$Impl, investingPeriodSelectionPresenter$Factory$Impl, investingFilterSubFiltersPresenter$Factory$Impl, investingOrderTypeSelectionPresenter$Factory$Impl, investingCryptoNewsPresenter$Factory$Impl, transferStockPresenter$Factory$Impl, investingCustomOrderPresenter$Factory$Impl, investingRecurringFrequencyPickerFullPresenter$Factory$Impl, cancelOrderPresenter$Factory$Impl, investingKeyStatsDetailsPresenter$Factory$Impl, stockMetricTypePickerPresenter$Factory$Impl, sectionMoreInfoPresenter$Factory$Impl, performancePresenter$Factory$Impl, investingStockDetailsPresenter$Factory$Impl, cancelRecurringEquityPurchasePresenter$Factory$Impl, cancelRecurringBitcoinPurchasePresenter$Factory$Impl, investingHomePresenter$Factory$Impl, investingRecurringPurchaseReceiptPresenter$Factory$Impl, investingCategoryDetailPresenter$Factory$Impl, investingCategoryFilterPresenter$Factory$Impl, investingSearchPresenter$Factory$Impl, dependentWelcomePresenter$Factory$Impl, investingStockSelectionBlockerPresenter$Factory$Impl, dividendReinvestmentWelcomePresenter$Factory$Impl, dividendReinvestmentLearnMorePresenter$Factory$Impl, dividendReinvestmentSettingPresenter$Factory$Impl, stocksTransferEtaFullScreenPresenter$Factory$Impl, stocksTransferEtaSheetPresenter$Factory$Impl, dependentAutoInvestInfoBottomSheetPresenter$Factory$Impl, investingActivityHistoryPresenter$Factory$Impl, investingEtfHoldingDetailsPresenter$Factory$Impl);
        }
    }

    public InvestingPresenterFactory(InvestingFilterCategoriesPresenter$Factory$Impl investingFilterCategoriesPresenter$Factory$Impl, InvestingCustomSharePricePresenter$Factory$Impl investingCustomSharePricePresenter$Factory$Impl, InvestingSettingsPresenter$Factory$Impl investingSettingsPresenter$Factory$Impl, InvestingPeriodSelectionPresenter$Factory$Impl investingPeriodSelectionPresenter$Factory$Impl, InvestingFilterSubFiltersPresenter$Factory$Impl investingFilterSubFiltersPresenter$Factory$Impl, InvestingOrderTypeSelectionPresenter$Factory$Impl investingOrderTypeSelectionPresenter$Factory$Impl, InvestingCryptoNewsPresenter$Factory$Impl investingCryptoNewsPresenter$Factory$Impl, TransferStockPresenter$Factory$Impl transferStockPresenter$Factory$Impl, InvestingCustomOrderPresenter$Factory$Impl investingCustomOrderPresenter$Factory$Impl, InvestingRecurringFrequencyPickerFullPresenter$Factory$Impl investingRecurringFrequencyPickerFullPresenter$Factory$Impl, CancelOrderPresenter$Factory$Impl cancelOrderPresenter$Factory$Impl, InvestingKeyStatsDetailsPresenter$Factory$Impl investingKeyStatsDetailsPresenter$Factory$Impl, StockMetricTypePickerPresenter$Factory$Impl stockMetricTypePickerPresenter$Factory$Impl, SectionMoreInfoPresenter$Factory$Impl sectionMoreInfoPresenter$Factory$Impl, PerformancePresenter$Factory$Impl performancePresenter$Factory$Impl, InvestingStockDetailsPresenter$Factory$Impl investingStockDetailsPresenter$Factory$Impl, CancelRecurringEquityPurchasePresenter$Factory$Impl cancelRecurringEquityPurchasePresenter$Factory$Impl, CancelRecurringBitcoinPurchasePresenter$Factory$Impl cancelRecurringBitcoinPurchasePresenter$Factory$Impl, InvestingHomePresenter$Factory$Impl investingHomePresenter$Factory$Impl, InvestingRecurringPurchaseReceiptPresenter$Factory$Impl investingRecurringPurchaseReceiptPresenter$Factory$Impl, InvestingCategoryDetailPresenter$Factory$Impl investingCategoryDetailPresenter$Factory$Impl, InvestingCategoryFilterPresenter$Factory$Impl investingCategoryFilterPresenter$Factory$Impl, InvestingSearchPresenter$Factory$Impl investingSearchPresenter$Factory$Impl, DependentWelcomePresenter$Factory$Impl dependentWelcomePresenter$Factory$Impl, InvestingStockSelectionBlockerPresenter$Factory$Impl investingStockSelectionBlockerPresenter$Factory$Impl, DividendReinvestmentWelcomePresenter$Factory$Impl dividendReinvestmentWelcomePresenter$Factory$Impl, DividendReinvestmentLearnMorePresenter$Factory$Impl dividendReinvestmentLearnMorePresenter$Factory$Impl, DividendReinvestmentSettingPresenter$Factory$Impl dividendReinvestmentSettingPresenter$Factory$Impl, StocksTransferEtaFullScreenPresenter$Factory$Impl stocksTransferEtaFullScreenPresenter$Factory$Impl, StocksTransferEtaSheetPresenter$Factory$Impl stocksTransferEtaSheetPresenter$Factory$Impl, DependentAutoInvestInfoBottomSheetPresenter$Factory$Impl dependentAutoInvestInfoBottomSheetPresenter$Factory$Impl, InvestingActivityHistoryPresenter$Factory$Impl investingActivityHistoryPresenter$Factory$Impl, InvestingEtfHoldingDetailsPresenter$Factory$Impl investingEtfHoldingDetailsPresenter$Factory$Impl) {
        this.investingFilterCategories = investingFilterCategoriesPresenter$Factory$Impl;
        this.investingCustomSharePricePresenter = investingCustomSharePricePresenter$Factory$Impl;
        this.settingsPresenter = investingSettingsPresenter$Factory$Impl;
        this.investingPeriodSelectionPresenter = investingPeriodSelectionPresenter$Factory$Impl;
        this.filterSubFiltersPresenter = investingFilterSubFiltersPresenter$Factory$Impl;
        this.orderTypeSelectionPresenter = investingOrderTypeSelectionPresenter$Factory$Impl;
        this.newsPresenter = investingCryptoNewsPresenter$Factory$Impl;
        this.transferStockPresenter = transferStockPresenter$Factory$Impl;
        this.customOrderPresenter = investingCustomOrderPresenter$Factory$Impl;
        this.frequencyPickerFullScreenPresenter = investingRecurringFrequencyPickerFullPresenter$Factory$Impl;
        this.cancelOrderPresenter = cancelOrderPresenter$Factory$Impl;
        this.investingKeyStatsDetailsPresenter = investingKeyStatsDetailsPresenter$Factory$Impl;
        this.stockMetricTypePickerPresenter = stockMetricTypePickerPresenter$Factory$Impl;
        this.sectionMoreInfoPresenter = sectionMoreInfoPresenter$Factory$Impl;
        this.performancePresenter = performancePresenter$Factory$Impl;
        this.stockDetailsPresenter = investingStockDetailsPresenter$Factory$Impl;
        this.cancelRecurringEquityPurchasePresenter = cancelRecurringEquityPurchasePresenter$Factory$Impl;
        this.cancelRecurringBitcoinPurchasePresenter = cancelRecurringBitcoinPurchasePresenter$Factory$Impl;
        this.investingHomePresenter = investingHomePresenter$Factory$Impl;
        this.recurringPurchaseReceiptPresenter = investingRecurringPurchaseReceiptPresenter$Factory$Impl;
        this.categoryDetailPresenter = investingCategoryDetailPresenter$Factory$Impl;
        this.investingCategoryFilterPresenter = investingCategoryFilterPresenter$Factory$Impl;
        this.searchPresenter = investingSearchPresenter$Factory$Impl;
        this.dependentWelcomePresenterFactory = dependentWelcomePresenter$Factory$Impl;
        this.stockSelectionBlocker = investingStockSelectionBlockerPresenter$Factory$Impl;
        this.dividendReinvestmentWelcomePresenter = dividendReinvestmentWelcomePresenter$Factory$Impl;
        this.dividendReinvestmentLearnMorePresenter = dividendReinvestmentLearnMorePresenter$Factory$Impl;
        this.dividendReinvestmentSettingPresenter = dividendReinvestmentSettingPresenter$Factory$Impl;
        this.stocksTransferEtaFullScreen = stocksTransferEtaFullScreenPresenter$Factory$Impl;
        this.stocksTransferEtaSheet = stocksTransferEtaSheetPresenter$Factory$Impl;
        this.dependentAutoInvestInfoBottomSheetPresenter = dependentAutoInvestInfoBottomSheetPresenter$Factory$Impl;
        this.investmentActivityHistoryPresenter = investingActivityHistoryPresenter$Factory$Impl;
        this.investingEtfHoldingDetailsPresenter = investingEtfHoldingDetailsPresenter$Factory$Impl;
    }

    @Override // app.cash.broadway.presenter.PresenterFactory
    public final Presenter create(Screen screen, BetterNavigator.ScreenNavigator screenNavigator) {
        screen.getClass();
        if (screen instanceof InvestingScreens.DependentWelcomeScreen) {
            BlockerImageUploader$MetroFactory blockerImageUploader$MetroFactory = this.dependentWelcomePresenterFactory.delegateFactory;
            AndroidStringManager androidStringManager = (AndroidStringManager) blockerImageUploader$MetroFactory.stringManager.lambda.invoke();
            FlowStarter flowStarter = (FlowStarter) blockerImageUploader$MetroFactory.analytics.getValue();
            RealClientSyncer realClientSyncer = (RealClientSyncer) blockerImageUploader$MetroFactory.blockersNavigator.invoke();
            RealInvestingStateManager realInvestingStateManager = (RealInvestingStateManager) blockerImageUploader$MetroFactory.multiBlockerFacilitator.invoke();
            CoroutineContext coroutineContext = (CoroutineContext) blockerImageUploader$MetroFactory.ioDispatcher.lambda.invoke();
            androidStringManager.getClass();
            flowStarter.getClass();
            realClientSyncer.getClass();
            realInvestingStateManager.getClass();
            coroutineContext.getClass();
            return MoleculePresenterKt.asPresenter$default(new DisclosurePresenter(androidStringManager, flowStarter, realClientSyncer, realInvestingStateManager, coroutineContext, (InvestingScreens.DependentWelcomeScreen) screen, screenNavigator));
        }
        if (screen instanceof InvestingScreens.FilterCategoriesScreen) {
            TransferInPresenter$MetroFactory transferInPresenter$MetroFactory = this.investingFilterCategories.delegateFactory;
            AndroidStringManager androidStringManager2 = (AndroidStringManager) transferInPresenter$MetroFactory.stringManager.lambda.invoke();
            RealCategoryBackend realCategoryBackend = (RealCategoryBackend) transferInPresenter$MetroFactory.moneyFormatterFactory.invoke();
            Analytics analytics = (Analytics) transferInPresenter$MetroFactory.analytics.getValue();
            androidStringManager2.getClass();
            realCategoryBackend.getClass();
            analytics.getClass();
            return MoleculePresenterKt.asPresenter$default(new LocalPosCheckInPresenter(androidStringManager2, realCategoryBackend, analytics, (InvestingScreens.FilterCategoriesScreen) screen, screenNavigator));
        }
        if (screen instanceof InvestingScreens.CustomSharePriceScreen) {
            Reward$Adapter reward$Adapter = this.investingCustomSharePricePresenter.delegateFactory;
            RealInvestmentEntities realInvestmentEntities = (RealInvestmentEntities) ((Provider) reward$Adapter.avatarsAdapter).invoke();
            RealCryptoValueRepo realCryptoValueRepo = (RealCryptoValueRepo) ((Provider) reward$Adapter.reward_selection_stateAdapter).invoke();
            RealProfileManager realProfileManager = (RealProfileManager) ((DelegateFactory) reward$Adapter.boost_detail_bottom_upsellAdapter).invoke();
            AndroidStringManager androidStringManager3 = (AndroidStringManager) ((LambdaProvider) reward$Adapter.app_linksAdapter).lambda.invoke();
            RealBitcoinInboundNavigator$Factory$Impl realBitcoinInboundNavigator$Factory$Impl = (RealBitcoinInboundNavigator$Factory$Impl) ((Provider) reward$Adapter.program_detail_rowsAdapter).invoke();
            LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) ((Provider) reward$Adapter.boost_detail_rowsAdapter).invoke();
            RealInvestingAnalytics realInvestingAnalytics = (RealInvestingAnalytics) ((Provider) reward$Adapter.boost_attributesAdapter).invoke();
            realInvestmentEntities.getClass();
            realCryptoValueRepo.getClass();
            realProfileManager.getClass();
            androidStringManager3.getClass();
            realBitcoinInboundNavigator$Factory$Impl.getClass();
            factory.getClass();
            realInvestingAnalytics.getClass();
            return MoleculePresenterKt.asPresenter$default(new LocalHomePresenter(realInvestmentEntities, realCryptoValueRepo, realProfileManager, androidStringManager3, realBitcoinInboundNavigator$Factory$Impl, factory, realInvestingAnalytics, (InvestingScreens.CustomSharePriceScreen) screen, screenNavigator));
        }
        if (screen instanceof InvestingScreens.InvestingPeriodSelectionScreen) {
            BlockerImageUploader$MetroFactory blockerImageUploader$MetroFactory2 = this.investingPeriodSelectionPresenter.delegateFactory;
            CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) blockerImageUploader$MetroFactory2.analytics.getValue();
            InvestmentOrderPresenter$Factory$Impl investmentOrderPresenter$Factory$Impl = (InvestmentOrderPresenter$Factory$Impl) blockerImageUploader$MetroFactory2.blockersNavigator.invoke();
            AndroidStringManager androidStringManager4 = (AndroidStringManager) blockerImageUploader$MetroFactory2.stringManager.lambda.invoke();
            RealInvestingAnalytics realInvestingAnalytics2 = (RealInvestingAnalytics) blockerImageUploader$MetroFactory2.multiBlockerFacilitator.invoke();
            CoroutineContext coroutineContext2 = (CoroutineContext) blockerImageUploader$MetroFactory2.ioDispatcher.lambda.invoke();
            cashAccountDatabaseImpl.getClass();
            investmentOrderPresenter$Factory$Impl.getClass();
            androidStringManager4.getClass();
            realInvestingAnalytics2.getClass();
            coroutineContext2.getClass();
            return MoleculePresenterKt.asPresenter$default(new CardStudioPresenter(cashAccountDatabaseImpl, investmentOrderPresenter$Factory$Impl, androidStringManager4, realInvestingAnalytics2, coroutineContext2, (InvestingScreens.InvestingPeriodSelectionScreen) screen, screenNavigator));
        }
        if (screen instanceof InvestingScreens.FilterSubFiltersScreen) {
            TransferInPresenter$MetroFactory transferInPresenter$MetroFactory2 = this.filterSubFiltersPresenter.delegateFactory;
            AndroidStringManager androidStringManager5 = (AndroidStringManager) transferInPresenter$MetroFactory2.stringManager.lambda.invoke();
            RealCategoryBackend realCategoryBackend2 = (RealCategoryBackend) transferInPresenter$MetroFactory2.moneyFormatterFactory.invoke();
            Analytics analytics2 = (Analytics) transferInPresenter$MetroFactory2.analytics.getValue();
            androidStringManager5.getClass();
            realCategoryBackend2.getClass();
            analytics2.getClass();
            return MoleculePresenterKt.asPresenter$default(new LocalPosCheckInPresenter(androidStringManager5, realCategoryBackend2, analytics2, (InvestingScreens.FilterSubFiltersScreen) screen, screenNavigator));
        }
        if (screen instanceof InvestingScreens.OrderTypeSelectionScreen) {
            LinkedAccountsPresenter.MetroFactory metroFactory = this.orderTypeSelectionPresenter.delegateFactory;
            Cache cache = (Cache) metroFactory.analytics.getValue();
            RealInvestmentEntities realInvestmentEntities2 = (RealInvestmentEntities) metroFactory.instrumentManager.invoke();
            AndroidStringManager androidStringManager6 = (AndroidStringManager) metroFactory.stringManager.lambda.invoke();
            Analytics analytics3 = (Analytics) metroFactory.syncValueReader.getValue();
            RealInvestingAnalytics realInvestingAnalytics3 = (RealInvestingAnalytics) metroFactory.instrumentLinkingOptionManager.invoke();
            IntentLauncher intentLauncher = (IntentLauncher) metroFactory.clientSyncer.invoke();
            CashAccountDatabaseImpl cashAccountDatabaseImpl2 = (CashAccountDatabaseImpl) metroFactory.flowStarter.getValue();
            CoroutineContext coroutineContext3 = (CoroutineContext) metroFactory.errorReporter.lambda.invoke();
            FeatureFlagManager featureFlagManager = (FeatureFlagManager) metroFactory.featureFlagManager.getValue();
            cache.getClass();
            realInvestmentEntities2.getClass();
            androidStringManager6.getClass();
            analytics3.getClass();
            realInvestingAnalytics3.getClass();
            intentLauncher.getClass();
            cashAccountDatabaseImpl2.getClass();
            coroutineContext3.getClass();
            featureFlagManager.getClass();
            return MoleculePresenterKt.asPresenter$default(new InvestingOrderTypeSelectionPresenter(cache, realInvestmentEntities2, androidStringManager6, analytics3, realInvestingAnalytics3, intentLauncher, cashAccountDatabaseImpl2, coroutineContext3, featureFlagManager, (InvestingScreens.OrderTypeSelectionScreen) screen, screenNavigator));
        }
        if (screen instanceof InvestingScreens.CustomOrderScreen) {
            PoolDetailsPresenter$MetroFactory poolDetailsPresenter$MetroFactory = this.customOrderPresenter.delegateFactory;
            RealInvestingHistoricalData realInvestingHistoricalData = (RealInvestingHistoricalData) poolDetailsPresenter$MetroFactory.moneyFormatterFactory.invoke();
            Cache cache2 = (Cache) ((DoubleCheck) poolDetailsPresenter$MetroFactory.blockersNavigator).getValue();
            RealInvestmentEntities realInvestmentEntities3 = (RealInvestmentEntities) poolDetailsPresenter$MetroFactory.poolsRepository.invoke();
            AndroidStringManager androidStringManager7 = (AndroidStringManager) ((LambdaProvider) poolDetailsPresenter$MetroFactory.stringManager).lambda.invoke();
            Cache cache3 = (Cache) ((DoubleCheck) poolDetailsPresenter$MetroFactory.analytics).getValue();
            StockMetricFactory stockMetricFactory = (StockMetricFactory) poolDetailsPresenter$MetroFactory.launcher.invoke();
            RealCryptoBalanceRepo realCryptoBalanceRepo = (RealCryptoBalanceRepo) poolDetailsPresenter$MetroFactory.activityEmbeddedPresenterFactory.invoke();
            RealBitcoinInboundNavigator$Factory$Impl realBitcoinInboundNavigator$Factory$Impl2 = (RealBitcoinInboundNavigator$Factory$Impl) poolDetailsPresenter$MetroFactory.defaultActivityItemEventHandlerFactory.invoke();
            RealInvestingAnalytics realInvestingAnalytics4 = (RealInvestingAnalytics) poolDetailsPresenter$MetroFactory.sessionManager.invoke();
            BooleanPreference booleanPreference = (BooleanPreference) ((RealLiteCashInRepo$MetroFactory) poolDetailsPresenter$MetroFactory.dateFormatManager).invoke();
            BooleanPreference booleanPreference2 = (BooleanPreference) ((RealCurrentUserSetter.MetroFactory) poolDetailsPresenter$MetroFactory.clock).invoke();
            RealInvestingGraphCalculator realInvestingGraphCalculator = (RealInvestingGraphCalculator) poolDetailsPresenter$MetroFactory.uuidGenerator.invoke();
            RealCryptoValueRepo realCryptoValueRepo2 = (RealCryptoValueRepo) poolDetailsPresenter$MetroFactory.featureFlagManager.invoke();
            LocalizedMoneyFormatter.Factory factory2 = (LocalizedMoneyFormatter.Factory) poolDetailsPresenter$MetroFactory.activitiesCacheManager.invoke();
            realInvestingHistoricalData.getClass();
            cache2.getClass();
            realInvestmentEntities3.getClass();
            androidStringManager7.getClass();
            cache3.getClass();
            stockMetricFactory.getClass();
            realCryptoBalanceRepo.getClass();
            realBitcoinInboundNavigator$Factory$Impl2.getClass();
            realInvestingAnalytics4.getClass();
            realInvestingGraphCalculator.getClass();
            realCryptoValueRepo2.getClass();
            factory2.getClass();
            return MoleculePresenterKt.asPresenter$default(new InvestingCustomOrderPresenter(realInvestingHistoricalData, cache2, realInvestmentEntities3, androidStringManager7, cache3, stockMetricFactory, realCryptoBalanceRepo, realBitcoinInboundNavigator$Factory$Impl2, realInvestingAnalytics4, booleanPreference, booleanPreference2, realInvestingGraphCalculator, realCryptoValueRepo2, factory2, (InvestingScreens.CustomOrderScreen) screen, screenNavigator));
        }
        if (screen instanceof InvestingScreens.NewsScreen) {
            return MoleculePresenterKt.asPresenter$default(this.newsPresenter.create(screenNavigator, ((InvestingScreens.NewsScreen) screen).kind, null, false));
        }
        if (screen instanceof InvestingScreens.RecurringFrequencyPickerFullScreen) {
            ImageLoader$Builder imageLoader$Builder = this.frequencyPickerFullScreenPresenter.delegateFactory;
            CashAccountDatabaseImpl cashAccountDatabaseImpl3 = (CashAccountDatabaseImpl) ((DoubleCheck) imageLoader$Builder.application).getValue();
            Analytics analytics4 = (Analytics) ((DoubleCheck) imageLoader$Builder.defaults).getValue();
            RealInvestingAnalytics realInvestingAnalytics5 = (RealInvestingAnalytics) ((Provider) imageLoader$Builder.mainCoroutineContextLazy).invoke();
            RealObservabilityManager realObservabilityManager = (RealObservabilityManager) ((LambdaProvider) imageLoader$Builder.memoryCacheLazy).lambda.invoke();
            CoroutineContext coroutineContext4 = (CoroutineContext) ((LambdaProvider) imageLoader$Builder.diskCacheLazy).lambda.invoke();
            AndroidStringManager androidStringManager8 = (AndroidStringManager) ((LambdaProvider) imageLoader$Builder.eventListenerFactory).lambda.invoke();
            FeatureFlagManager featureFlagManager2 = (FeatureFlagManager) ((DoubleCheck) imageLoader$Builder.componentRegistry).getValue();
            LocalizedMoneyFormatter.Factory factory3 = (LocalizedMoneyFormatter.Factory) ((Provider) imageLoader$Builder.extras).invoke();
            cashAccountDatabaseImpl3.getClass();
            analytics4.getClass();
            realInvestingAnalytics5.getClass();
            realObservabilityManager.getClass();
            coroutineContext4.getClass();
            androidStringManager8.getClass();
            featureFlagManager2.getClass();
            factory3.getClass();
            return MoleculePresenterKt.asPresenter$default(new InvestingRecurringFrequencyPickerFullPresenter(cashAccountDatabaseImpl3, analytics4, realInvestingAnalytics5, realObservabilityManager, coroutineContext4, (InvestingScreens.RecurringFrequencyPickerFullScreen) screen, screenNavigator, androidStringManager8, featureFlagManager2, factory3));
        }
        if (screen instanceof InvestingScreens.CancelScheduledOrderScreen) {
            CheckDepositAmountPresenter.MetroFactory metroFactory2 = this.cancelOrderPresenter.delegateFactory;
            PaymentManager paymentManager = (PaymentManager) metroFactory2.analytics.getValue();
            RealInvestingAnalytics realInvestingAnalytics6 = (RealInvestingAnalytics) metroFactory2.blockerFlowAnalytics.invoke();
            paymentManager.getClass();
            realInvestingAnalytics6.getClass();
            return MoleculePresenterKt.asPresenter$default(new MusicPresenter(paymentManager, realInvestingAnalytics6, (InvestingScreens.CancelScheduledOrderScreen) screen, screenNavigator));
        }
        if (screen instanceof InvestingScreens.RecurringPurchaseReceipt) {
            AfterpaySearchPresenter$MetroFactory afterpaySearchPresenter$MetroFactory = this.recurringPurchaseReceiptPresenter.delegateFactory;
            CashAccountDatabaseImpl cashAccountDatabaseImpl4 = (CashAccountDatabaseImpl) afterpaySearchPresenter$MetroFactory.afterpayMerchantRepo.getValue();
            AndroidStringManager androidStringManager9 = (AndroidStringManager) afterpaySearchPresenter$MetroFactory.stringManager.lambda.invoke();
            AndroidClock androidClock = (AndroidClock) afterpaySearchPresenter$MetroFactory.inputFieldTextSaver.lambda.invoke();
            LocalizedMoneyFormatter.Factory factory4 = (LocalizedMoneyFormatter.Factory) afterpaySearchPresenter$MetroFactory.routerFactory.invoke();
            RealDependentCustomerTokenRepository realDependentCustomerTokenRepository = (RealDependentCustomerTokenRepository) afterpaySearchPresenter$MetroFactory.afterpayAnalytics.getValue();
            DependentRecurringPreferenceStore dependentRecurringPreferenceStore = (DependentRecurringPreferenceStore) afterpaySearchPresenter$MetroFactory.oneErrorPerAppSessionStrategy.invoke();
            CoroutineContext coroutineContext5 = (CoroutineContext) afterpaySearchPresenter$MetroFactory.errorReporter.lambda.invoke();
            cashAccountDatabaseImpl4.getClass();
            androidStringManager9.getClass();
            androidClock.getClass();
            factory4.getClass();
            realDependentCustomerTokenRepository.getClass();
            dependentRecurringPreferenceStore.getClass();
            coroutineContext5.getClass();
            return MoleculePresenterKt.asPresenter$default(new InvestingRecurringPurchaseReceiptPresenter(cashAccountDatabaseImpl4, androidStringManager9, androidClock, factory4, realDependentCustomerTokenRepository, dependentRecurringPreferenceStore, coroutineContext5, screenNavigator, (InvestingScreens.RecurringPurchaseReceipt) screen));
        }
        if (screen instanceof InvestingScreens.CategoryDetailScreen) {
            CategoryToken categoryToken = ((InvestingScreens.CategoryDetailScreen) screen).token;
            categoryToken.getClass();
            TapToPayPaymentRequestPresenter$MetroFactory tapToPayPaymentRequestPresenter$MetroFactory = this.categoryDetailPresenter.delegateFactory;
            InvestingSearchPresenter$Factory$Impl investingSearchPresenter$Factory$Impl = (InvestingSearchPresenter$Factory$Impl) tapToPayPaymentRequestPresenter$MetroFactory.routerFactory.invoke();
            RealCategoryBackend realCategoryBackend3 = (RealCategoryBackend) tapToPayPaymentRequestPresenter$MetroFactory.moneyFormatterFactory.invoke();
            FilterConfigurationCacheMap filterConfigurationCacheMap = (FilterConfigurationCacheMap) tapToPayPaymentRequestPresenter$MetroFactory.tapToPayAnalyticsHelper.invoke();
            RealInvestingAnalytics realInvestingAnalytics7 = (RealInvestingAnalytics) tapToPayPaymentRequestPresenter$MetroFactory.tapToPayRepository.invoke();
            Analytics analytics5 = (Analytics) tapToPayPaymentRequestPresenter$MetroFactory.clientRouteParser.getValue();
            investingSearchPresenter$Factory$Impl.getClass();
            realCategoryBackend3.getClass();
            filterConfigurationCacheMap.getClass();
            realInvestingAnalytics7.getClass();
            analytics5.getClass();
            return MoleculePresenterKt.asPresenter$default(new DisclosurePresenter(investingSearchPresenter$Factory$Impl, realCategoryBackend3, filterConfigurationCacheMap, realInvestingAnalytics7, analytics5, categoryToken, screenNavigator));
        }
        if (screen instanceof InvestingScreens.InvestingCategoryFilterScreen) {
            TransferInPresenter$MetroFactory transferInPresenter$MetroFactory3 = this.investingCategoryFilterPresenter.delegateFactory;
            AndroidStringManager androidStringManager10 = (AndroidStringManager) transferInPresenter$MetroFactory3.stringManager.lambda.invoke();
            RealCategoryBackend realCategoryBackend4 = (RealCategoryBackend) transferInPresenter$MetroFactory3.moneyFormatterFactory.invoke();
            Analytics analytics6 = (Analytics) transferInPresenter$MetroFactory3.analytics.getValue();
            androidStringManager10.getClass();
            realCategoryBackend4.getClass();
            analytics6.getClass();
            return MoleculePresenterKt.asPresenter$default(new LocalPosCheckInPresenter(androidStringManager10, realCategoryBackend4, analytics6, (InvestingScreens.InvestingCategoryFilterScreen) screen, screenNavigator));
        }
        if (screen instanceof InvestingScreens.StockMetricTypePicker) {
            LocalEditorialPresenter.MetroFactory metroFactory3 = this.stockMetricTypePickerPresenter.delegateFactory;
            AndroidStringManager androidStringManager11 = (AndroidStringManager) metroFactory3.clock.lambda.invoke();
            KeyValue keyValue = (KeyValue) metroFactory3.launcher.invoke();
            KeyValue keyValue2 = (KeyValue) metroFactory3.installedStore.invoke();
            EnumPreference enumPreference = (EnumPreference) metroFactory3.responseContextHandlerFactory.invoke();
            Analytics analytics7 = (Analytics) metroFactory3.service.getValue();
            CoroutineContext coroutineContext6 = (CoroutineContext) metroFactory3.stringManager.lambda.invoke();
            androidStringManager11.getClass();
            keyValue.getClass();
            keyValue2.getClass();
            enumPreference.getClass();
            analytics7.getClass();
            coroutineContext6.getClass();
            return MoleculePresenterKt.asPresenter$default(new LocalEditorialPresenter(androidStringManager11, keyValue, keyValue2, enumPreference, analytics7, coroutineContext6, (InvestingScreens.StockMetricTypePicker) screen, screenNavigator));
        }
        if (screen instanceof InvestingScreens.TransferStock) {
            RememberEventDispatcher rememberEventDispatcher = this.transferStockPresenter.delegateFactory;
            AndroidStringManager androidStringManager12 = (AndroidStringManager) ((LambdaProvider) rememberEventDispatcher.abandoning).lambda.invoke();
            RealBalanceSnapshotManager realBalanceSnapshotManager = (RealBalanceSnapshotManager) ((Provider) rememberEventDispatcher.traceContext).invoke();
            CoroutineContext coroutineContext7 = (CoroutineContext) ((LambdaProvider) rememberEventDispatcher.remembering).lambda.invoke();
            CoroutineContext coroutineContext8 = (CoroutineContext) ((LambdaProvider) rememberEventDispatcher.currentRememberingList).lambda.invoke();
            CashAccountDatabaseImpl cashAccountDatabaseImpl5 = (CashAccountDatabaseImpl) ((DoubleCheck) rememberEventDispatcher.leaving).getValue();
            AmountSelectorPresenter amountSelectorPresenter = (AmountSelectorPresenter) ((Provider) rememberEventDispatcher.sideEffects).invoke();
            RecurringScheduleBuilder recurringScheduleBuilder = (RecurringScheduleBuilder) ((Provider) rememberEventDispatcher.rememberSet).invoke();
            ProductionAttributionEventEmitter productionAttributionEventEmitter = (ProductionAttributionEventEmitter) ((Provider) rememberEventDispatcher.releasing).invoke();
            InvestmentOrderPresenter$Factory$Impl investmentOrderPresenter$Factory$Impl2 = (InvestmentOrderPresenter$Factory$Impl) ((Provider) rememberEventDispatcher.ignoreLeavingSet).invoke();
            RealInvestingAnalytics realInvestingAnalytics8 = (RealInvestingAnalytics) ((Provider) rememberEventDispatcher.pausedPlaceholders).invoke();
            LocalizedMoneyFormatter.Factory factory5 = (LocalizedMoneyFormatter.Factory) ((Provider) rememberEventDispatcher.nestedRemembersLists).invoke();
            androidStringManager12.getClass();
            realBalanceSnapshotManager.getClass();
            coroutineContext7.getClass();
            coroutineContext8.getClass();
            cashAccountDatabaseImpl5.getClass();
            amountSelectorPresenter.getClass();
            recurringScheduleBuilder.getClass();
            productionAttributionEventEmitter.getClass();
            investmentOrderPresenter$Factory$Impl2.getClass();
            realInvestingAnalytics8.getClass();
            factory5.getClass();
            return MoleculePresenterKt.asPresenter$default(new TransferStockPresenter(androidStringManager12, realBalanceSnapshotManager, coroutineContext7, coroutineContext8, cashAccountDatabaseImpl5, amountSelectorPresenter, recurringScheduleBuilder, productionAttributionEventEmitter, investmentOrderPresenter$Factory$Impl2, realInvestingAnalytics8, factory5, screenNavigator, (InvestingScreens.TransferStock) screen));
        }
        if (screen instanceof InvestingScreens.MoreInfoSheet) {
            TaxTooltipPresenter$MetroFactory taxTooltipPresenter$MetroFactory = this.sectionMoreInfoPresenter.delegateFactory;
            IntentLauncher intentLauncher2 = (IntentLauncher) taxTooltipPresenter$MetroFactory.taxDesktopTooltipPreference.invoke();
            AndroidStringManager androidStringManager13 = (AndroidStringManager) taxTooltipPresenter$MetroFactory.stringManager.lambda.invoke();
            intentLauncher2.getClass();
            androidStringManager13.getClass();
            return MoleculePresenterKt.asPresenter$default(new MusicPresenter(intentLauncher2, androidStringManager13, screenNavigator, (InvestingScreens.MoreInfoSheet) screen));
        }
        if (screen instanceof InvestingScreens.PerformanceScreens) {
            Reward$Adapter reward$Adapter2 = this.performancePresenter.delegateFactory;
            CashAccountDatabaseImpl cashAccountDatabaseImpl6 = (CashAccountDatabaseImpl) ((DoubleCheck) reward$Adapter2.avatarsAdapter).getValue();
            AndroidStringManager androidStringManager14 = (AndroidStringManager) ((LambdaProvider) reward$Adapter2.reward_selection_stateAdapter).lambda.invoke();
            Analytics analytics8 = (Analytics) ((DoubleCheck) reward$Adapter2.boost_detail_bottom_upsellAdapter).getValue();
            RealInvestmentPerformanceSyncer realInvestmentPerformanceSyncer = (RealInvestmentPerformanceSyncer) ((Provider) reward$Adapter2.app_linksAdapter).invoke();
            FeatureFlagManager featureFlagManager3 = (FeatureFlagManager) ((DoubleCheck) reward$Adapter2.program_detail_rowsAdapter).getValue();
            SyncValueReader syncValueReader = (SyncValueReader) ((DoubleCheck) reward$Adapter2.boost_detail_rowsAdapter).getValue();
            CoroutineContext coroutineContext9 = (CoroutineContext) ((LambdaProvider) reward$Adapter2.boost_attributesAdapter).lambda.invoke();
            cashAccountDatabaseImpl6.getClass();
            androidStringManager14.getClass();
            analytics8.getClass();
            realInvestmentPerformanceSyncer.getClass();
            featureFlagManager3.getClass();
            syncValueReader.getClass();
            coroutineContext9.getClass();
            return MoleculePresenterKt.asPresenter$default(new PoolsListPresenter(cashAccountDatabaseImpl6, androidStringManager14, analytics8, realInvestmentPerformanceSyncer, featureFlagManager3, syncValueReader, coroutineContext9, (InvestingScreens.PerformanceScreens) screen, screenNavigator));
        }
        if (screen instanceof InvestingScreens.StockDetails) {
            PaymentConfigurationPresenter.MetroFactory metroFactory4 = this.stockDetailsPresenter.delegateFactory;
            RealInvestmentEntities realInvestmentEntities4 = (RealInvestmentEntities) metroFactory4.recipientRepository.invoke();
            AndroidStringManager androidStringManager15 = (AndroidStringManager) metroFactory4.profileManager.invoke();
            InvestingService investingService = (InvestingService) metroFactory4.stringManager.invoke();
            CashAccountDatabaseImpl cashAccountDatabaseImpl7 = (CashAccountDatabaseImpl) metroFactory4.paymentInitiator.invoke();
            CashAccountDatabaseImpl cashAccountDatabaseImpl8 = (CashAccountDatabaseImpl) metroFactory4.balanceSnapshotManager.invoke();
            CashAccountDatabaseImpl cashAccountDatabaseImpl9 = (CashAccountDatabaseImpl) metroFactory4.intentLauncher.invoke();
            IntentLauncher intentLauncher3 = (IntentLauncher) metroFactory4.featureFlagManager.invoke();
            AndroidClock androidClock2 = (AndroidClock) metroFactory4.featureEligibilityRepository.invoke();
            AndroidDateFormatManager androidDateFormatManager = (AndroidDateFormatManager) metroFactory4.googlePayPaymentsClient.invoke();
            RealInvestingGraphCalculator realInvestingGraphCalculator2 = (RealInvestingGraphCalculator) metroFactory4.instrumentRowLoader.invoke();
            RealInvestingHistoricalData realInvestingHistoricalData2 = (RealInvestingHistoricalData) metroFactory4.instrumentManager.invoke();
            Flow flow = (Flow) metroFactory4.paymentConfigurationRouterFactory.value;
            Analytics analytics9 = (Analytics) metroFactory4.appConfigManager.invoke();
            RealInvestingAnalytics realInvestingAnalytics9 = (RealInvestingAnalytics) metroFactory4.analytics.invoke();
            RealInvestmentActivity realInvestmentActivity = (RealInvestmentActivity) metroFactory4.networkInfo.invoke();
            RealCategoryBackend realCategoryBackend5 = (RealCategoryBackend) metroFactory4.statusAndLimitsManager.invoke();
            InvestingCryptoNewsPresenter$Factory$Impl investingCryptoNewsPresenter$Factory$Impl = (InvestingCryptoNewsPresenter$Factory$Impl) metroFactory4.offlineManager.invoke();
            InvestingFinancialPresenter$Factory$Impl investingFinancialPresenter$Factory$Impl = (InvestingFinancialPresenter$Factory$Impl) ((InstanceFactory) metroFactory4.uuidGenerator).value;
            InvestingKeyStatsPresenter$Factory$Impl investingKeyStatsPresenter$Factory$Impl = (InvestingKeyStatsPresenter$Factory$Impl) ((InstanceFactory) metroFactory4.moneyFormatterFactory).value;
            InvestingEarningsPresenter$Factory$Impl investingEarningsPresenter$Factory$Impl = (InvestingEarningsPresenter$Factory$Impl) ((InstanceFactory) metroFactory4.personalizePaymentManager).value;
            InvestingAnalystOpinionsPresenter$Factory$Impl investingAnalystOpinionsPresenter$Factory$Impl = (InvestingAnalystOpinionsPresenter$Factory$Impl) ((InstanceFactory) metroFactory4.recipientSelectorTooltipSeenCount).value;
            ScrollPerformanceAnalyzer$Factory$Impl scrollPerformanceAnalyzer$Factory$Impl = (ScrollPerformanceAnalyzer$Factory$Impl) metroFactory4.securitySignalsAggregator.invoke();
            LocalizedMoneyFormatter.Factory factory6 = (LocalizedMoneyFormatter.Factory) metroFactory4.stablecoinNetworkRepo.invoke();
            StockMetricFactory stockMetricFactory2 = (StockMetricFactory) metroFactory4.hasSeenStablecoinWithdrawalOnboarding.invoke();
            LastSelectedRange lastSelectedRange = (LastSelectedRange) metroFactory4.flowStarter.invoke();
            RealInvestingStateManager realInvestingStateManager2 = (RealInvestingStateManager) metroFactory4.blockersDataNavigator.invoke();
            SessionManager sessionManager = (SessionManager) metroFactory4.cryptoFlowStarter.invoke();
            RealActivitiesCacheManager realActivitiesCacheManager = (RealActivitiesCacheManager) metroFactory4.clipboardObserver.invoke();
            FeatureFlagManager featureFlagManager4 = (FeatureFlagManager) metroFactory4.askedContactsPaymentPreference.invoke();
            RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl = (RealActivityEmbeddedPresenter$Factory$Impl) metroFactory4.contactsPermission.invoke();
            RealInvestingActivitiesManager$Factory$Impl realInvestingActivitiesManager$Factory$Impl = (RealInvestingActivitiesManager$Factory$Impl) ((InstanceFactory) metroFactory4.draftStore).value;
            InvestingStockDetailsActivityRequestHandler$Factory$Impl investingStockDetailsActivityRequestHandler$Factory$Impl = (InvestingStockDetailsActivityRequestHandler$Factory$Impl) metroFactory4.ioDispatcher.invoke();
            InvestingEtfHoldingsPresenter$Factory$Impl investingEtfHoldingsPresenter$Factory$Impl = (InvestingEtfHoldingsPresenter$Factory$Impl) ((InstanceFactory) metroFactory4.paymentLinkRepository).value;
            CoroutineContext coroutineContext10 = (CoroutineContext) metroFactory4.clock.invoke();
            realInvestmentEntities4.getClass();
            androidStringManager15.getClass();
            investingService.getClass();
            cashAccountDatabaseImpl7.getClass();
            cashAccountDatabaseImpl8.getClass();
            cashAccountDatabaseImpl9.getClass();
            intentLauncher3.getClass();
            androidClock2.getClass();
            androidDateFormatManager.getClass();
            realInvestingGraphCalculator2.getClass();
            realInvestingHistoricalData2.getClass();
            flow.getClass();
            analytics9.getClass();
            realInvestingAnalytics9.getClass();
            realInvestmentActivity.getClass();
            realCategoryBackend5.getClass();
            investingCryptoNewsPresenter$Factory$Impl.getClass();
            investingFinancialPresenter$Factory$Impl.getClass();
            investingKeyStatsPresenter$Factory$Impl.getClass();
            investingEarningsPresenter$Factory$Impl.getClass();
            investingAnalystOpinionsPresenter$Factory$Impl.getClass();
            scrollPerformanceAnalyzer$Factory$Impl.getClass();
            factory6.getClass();
            stockMetricFactory2.getClass();
            lastSelectedRange.getClass();
            realInvestingStateManager2.getClass();
            sessionManager.getClass();
            realActivitiesCacheManager.getClass();
            featureFlagManager4.getClass();
            realActivityEmbeddedPresenter$Factory$Impl.getClass();
            realInvestingActivitiesManager$Factory$Impl.getClass();
            investingStockDetailsActivityRequestHandler$Factory$Impl.getClass();
            investingEtfHoldingsPresenter$Factory$Impl.getClass();
            coroutineContext10.getClass();
            return MoleculePresenterKt.asPresenter$default(new InvestingStockDetailsPresenter(realInvestmentEntities4, androidStringManager15, investingService, cashAccountDatabaseImpl7, cashAccountDatabaseImpl8, cashAccountDatabaseImpl9, intentLauncher3, androidClock2, androidDateFormatManager, realInvestingGraphCalculator2, realInvestingHistoricalData2, flow, analytics9, realInvestingAnalytics9, realInvestmentActivity, realCategoryBackend5, investingCryptoNewsPresenter$Factory$Impl, investingFinancialPresenter$Factory$Impl, investingKeyStatsPresenter$Factory$Impl, investingEarningsPresenter$Factory$Impl, investingAnalystOpinionsPresenter$Factory$Impl, scrollPerformanceAnalyzer$Factory$Impl, factory6, stockMetricFactory2, lastSelectedRange, realInvestingStateManager2, sessionManager, realActivitiesCacheManager, featureFlagManager4, realActivityEmbeddedPresenter$Factory$Impl, realInvestingActivitiesManager$Factory$Impl, investingStockDetailsActivityRequestHandler$Factory$Impl, investingEtfHoldingsPresenter$Factory$Impl, coroutineContext10, (InvestingScreens.StockDetails) screen, screenNavigator));
        }
        if (screen instanceof InvestingScreens.InvestingHome) {
            Profile.Adapter adapter = this.investingHomePresenter.delegateFactory;
            InvestingDiscoveryPresenter$Factory$Impl investingDiscoveryPresenter$Factory$Impl = (InvestingDiscoveryPresenter$Factory$Impl) ((InstanceFactory) adapter.nearby_visibilityAdapter).value;
            InvestingPortfolioPresenter$Factory$Impl investingPortfolioPresenter$Factory$Impl = (InvestingPortfolioPresenter$Factory$Impl) ((InstanceFactory) adapter.rate_planAdapter).value;
            RealInvestingSyncer realInvestingSyncer = (RealInvestingSyncer) ((Provider) adapter.deposit_preferenceAdapter).invoke();
            IntentLauncher intentLauncher4 = (IntentLauncher) ((Provider) adapter.country_codeAdapter).invoke();
            FeatureFlagManager featureFlagManager5 = (FeatureFlagManager) ((DoubleCheck) adapter.default_currencyAdapter).getValue();
            Flow flow2 = (Flow) ((InstanceFactory) adapter.incoming_request_policyAdapter).value;
            Analytics analytics10 = (Analytics) ((DoubleCheck) adapter.regionAdapter).getValue();
            RealInvestingAnalytics realInvestingAnalytics10 = (RealInvestingAnalytics) ((Provider) adapter.bitcoin_display_unitsAdapter).invoke();
            RealInvestingStateManager realInvestingStateManager3 = (RealInvestingStateManager) ((Provider) adapter.bitcoin_amount_entry_currency_preferenceAdapter).invoke();
            Cache cache4 = (Cache) ((Provider) adapter.addressAdapter).invoke();
            Flow flow3 = (Flow) ((DoubleCheck) adapter.deposit_preference_dataAdapter).getValue();
            ScrollPerformanceAnalyzer$Factory$Impl scrollPerformanceAnalyzer$Factory$Impl2 = (ScrollPerformanceAnalyzer$Factory$Impl) ((Provider) adapter.available_p2p_target_regionsAdapter).invoke();
            investingDiscoveryPresenter$Factory$Impl.getClass();
            investingPortfolioPresenter$Factory$Impl.getClass();
            realInvestingSyncer.getClass();
            intentLauncher4.getClass();
            featureFlagManager5.getClass();
            flow2.getClass();
            analytics10.getClass();
            realInvestingAnalytics10.getClass();
            realInvestingStateManager3.getClass();
            cache4.getClass();
            flow3.getClass();
            scrollPerformanceAnalyzer$Factory$Impl2.getClass();
            return MoleculePresenterKt.asPresenter$default(new ProfilePresenter(investingDiscoveryPresenter$Factory$Impl, investingPortfolioPresenter$Factory$Impl, realInvestingSyncer, intentLauncher4, featureFlagManager5, flow2, analytics10, realInvestingAnalytics10, realInvestingStateManager3, cache4, flow3, scrollPerformanceAnalyzer$Factory$Impl2, screenNavigator, (InvestingScreens.InvestingHome) screen));
        }
        if (screen instanceof InvestingScreens.CancelRecurringPurchase) {
            InvestingScreens.CancelRecurringPurchase cancelRecurringPurchase = (InvestingScreens.CancelRecurringPurchase) screen;
            if (cancelRecurringPurchase instanceof InvestingScreens.CancelRecurringPurchase.Bitcoin) {
                SkipPaymentPresenter$MetroFactory skipPaymentPresenter$MetroFactory = this.cancelRecurringBitcoinPurchasePresenter.delegateFactory;
                AppService appService = (AppService) skipPaymentPresenter$MetroFactory.activityEntityManager.getValue();
                FlowStarter flowStarter2 = (FlowStarter) skipPaymentPresenter$MetroFactory.paymentManager.getValue();
                AndroidStringManager androidStringManager16 = (AndroidStringManager) skipPaymentPresenter$MetroFactory.stringManager.lambda.invoke();
                appService.getClass();
                flowStarter2.getClass();
                androidStringManager16.getClass();
                return MoleculePresenterKt.asPresenter$default(new CancelRecurringBitcoinPurchasePresenter(appService, flowStarter2, androidStringManager16, (InvestingScreens.CancelRecurringPurchase.Bitcoin) screen, screenNavigator));
            }
            if (!(cancelRecurringPurchase instanceof InvestingScreens.CancelRecurringPurchase.Equity)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            SkipPaymentPresenter$MetroFactory skipPaymentPresenter$MetroFactory2 = this.cancelRecurringEquityPurchasePresenter.delegateFactory;
            AppService appService2 = (AppService) skipPaymentPresenter$MetroFactory2.activityEntityManager.getValue();
            FlowStarter flowStarter3 = (FlowStarter) skipPaymentPresenter$MetroFactory2.paymentManager.getValue();
            AndroidStringManager androidStringManager17 = (AndroidStringManager) skipPaymentPresenter$MetroFactory2.stringManager.lambda.invoke();
            appService2.getClass();
            flowStarter3.getClass();
            androidStringManager17.getClass();
            return MoleculePresenterKt.asPresenter$default(new LocalPosCheckInPresenter(appService2, flowStarter3, androidStringManager17, (InvestingScreens.CancelRecurringPurchase.Equity) screen, screenNavigator));
        }
        if (screen instanceof InvestingScreens.InvestingExplanatoryDialogScreen) {
            return MoleculePresenterKt.asPresenter$default(new VerifyCheckDialogPresenter((InvestingScreens.InvestingExplanatoryDialogScreen) screen, screenNavigator));
        }
        if (screen instanceof InvestingScreens.InvestingSearch) {
            return MoleculePresenterKt.asPresenter$default(this.searchPresenter.create(null, screenNavigator, ((InvestingScreens.InvestingSearch) screen).getShowKeypad()));
        }
        if (screen instanceof BlockersScreens.StockSelectionBlockerScreen) {
            RememberEventDispatcher rememberEventDispatcher2 = this.stockSelectionBlocker.delegateFactory;
            CoroutineContext coroutineContext11 = (CoroutineContext) ((LambdaProvider) rememberEventDispatcher2.abandoning).lambda.invoke();
            Analytics analytics11 = (Analytics) ((DoubleCheck) rememberEventDispatcher2.traceContext).getValue();
            BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) ((Provider) rememberEventDispatcher2.remembering).invoke();
            CashInvestingOutboundNavigator$Factory$Impl cashInvestingOutboundNavigator$Factory$Impl = (CashInvestingOutboundNavigator$Factory$Impl) ((InstanceFactory) rememberEventDispatcher2.currentRememberingList).value;
            InvestFlowService investFlowService = (InvestFlowService) ((DoubleCheck) rememberEventDispatcher2.leaving).getValue();
            AndroidStringManager androidStringManager18 = (AndroidStringManager) ((LambdaProvider) rememberEventDispatcher2.sideEffects).lambda.invoke();
            CashAccountDatabaseImpl cashAccountDatabaseImpl10 = (CashAccountDatabaseImpl) ((DoubleCheck) rememberEventDispatcher2.rememberSet).getValue();
            RealInvestmentEntities realInvestmentEntities5 = (RealInvestmentEntities) ((Provider) rememberEventDispatcher2.releasing).invoke();
            RealInputFieldTextSaver realInputFieldTextSaver = (RealInputFieldTextSaver) ((LambdaProvider) rememberEventDispatcher2.ignoreLeavingSet).lambda.invoke();
            ErrorReporter errorReporter = (ErrorReporter) ((LambdaProvider) rememberEventDispatcher2.pausedPlaceholders).lambda.invoke();
            SampleStrategy sampleStrategy = (SampleStrategy) ((Provider) rememberEventDispatcher2.nestedRemembersLists).invoke();
            coroutineContext11.getClass();
            analytics11.getClass();
            blockersDataNavigator.getClass();
            cashInvestingOutboundNavigator$Factory$Impl.getClass();
            investFlowService.getClass();
            androidStringManager18.getClass();
            cashAccountDatabaseImpl10.getClass();
            realInvestmentEntities5.getClass();
            realInputFieldTextSaver.getClass();
            errorReporter.getClass();
            sampleStrategy.getClass();
            return MoleculePresenterKt.asPresenter$default(new TapToPayPresenter(screenNavigator, (BlockersScreens.StockSelectionBlockerScreen) screen, coroutineContext11, analytics11, blockersDataNavigator, cashInvestingOutboundNavigator$Factory$Impl, investFlowService, androidStringManager18, cashAccountDatabaseImpl10, realInvestmentEntities5, realInputFieldTextSaver, errorReporter, sampleStrategy));
        }
        if (screen instanceof InvestingScreens.InvestingSettingsScreen) {
            SponsorLedInvitePresenter$MetroFactory sponsorLedInvitePresenter$MetroFactory = this.settingsPresenter.delegateFactory;
            AndroidStringManager androidStringManager19 = (AndroidStringManager) sponsorLedInvitePresenter$MetroFactory.stringManager.lambda.invoke();
            RealInvestingStateManager realInvestingStateManager4 = (RealInvestingStateManager) sponsorLedInvitePresenter$MetroFactory.customerStore.invoke();
            RealInvestingInboundNavigator$Factory$Impl realInvestingInboundNavigator$Factory$Impl = (RealInvestingInboundNavigator$Factory$Impl) sponsorLedInvitePresenter$MetroFactory.oneErrorPerAppSessionStrategy.invoke();
            RealProfileNotificationsRepository realProfileNotificationsRepository = (RealProfileNotificationsRepository) sponsorLedInvitePresenter$MetroFactory.routerFactory.invoke();
            SessionManager sessionManager2 = (SessionManager) sponsorLedInvitePresenter$MetroFactory.errorReporter.lambda.invoke();
            androidStringManager19.getClass();
            realInvestingStateManager4.getClass();
            realInvestingInboundNavigator$Factory$Impl.getClass();
            realProfileNotificationsRepository.getClass();
            sessionManager2.getClass();
            return MoleculePresenterKt.asPresenter$default(new InvestingSettingsPresenter(androidStringManager19, realInvestingStateManager4, realInvestingInboundNavigator$Factory$Impl, realProfileNotificationsRepository, sessionManager2, screenNavigator));
        }
        if (screen instanceof InvestingScreens.DividendReinvestmentSettingScreen) {
            LinkedAccountsPresenter.MetroFactory metroFactory5 = this.dividendReinvestmentSettingPresenter.delegateFactory;
            RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) metroFactory5.instrumentManager.invoke();
            Analytics analytics12 = (Analytics) metroFactory5.analytics.getValue();
            CashAccountDatabaseImpl cashAccountDatabaseImpl11 = (CashAccountDatabaseImpl) metroFactory5.syncValueReader.getValue();
            InvestCustomerDripService investCustomerDripService = (InvestCustomerDripService) metroFactory5.flowStarter.getValue();
            RealInvestingStateManager realInvestingStateManager5 = (RealInvestingStateManager) metroFactory5.instrumentLinkingOptionManager.invoke();
            AndroidStringManager androidStringManager20 = (AndroidStringManager) metroFactory5.stringManager.lambda.invoke();
            FeatureFlagManager featureFlagManager6 = (FeatureFlagManager) metroFactory5.featureFlagManager.getValue();
            KeyValue keyValue3 = (KeyValue) metroFactory5.clientSyncer.invoke();
            CoroutineContext coroutineContext12 = (CoroutineContext) metroFactory5.errorReporter.lambda.invoke();
            realRouter$Factory$Impl.getClass();
            analytics12.getClass();
            cashAccountDatabaseImpl11.getClass();
            investCustomerDripService.getClass();
            realInvestingStateManager5.getClass();
            androidStringManager20.getClass();
            featureFlagManager6.getClass();
            keyValue3.getClass();
            coroutineContext12.getClass();
            return MoleculePresenterKt.asPresenter$default(new LocalCashBalancePresenter(realRouter$Factory$Impl, analytics12, cashAccountDatabaseImpl11, investCustomerDripService, realInvestingStateManager5, androidStringManager20, featureFlagManager6, keyValue3, coroutineContext12, (InvestingScreens.DividendReinvestmentSettingScreen) screen, screenNavigator));
        }
        if ((screen instanceof InvestingScreens.DividendReinvestmentLearnMoreSheet) || screen.equals(InvestingScreens.DividendReinvestmentLearnMoreSheetV2.INSTANCE)) {
            AndroidStringManager androidStringManager21 = (AndroidStringManager) this.dividendReinvestmentLearnMorePresenter.delegateFactory.stringManager.lambda.invoke();
            androidStringManager21.getClass();
            return MoleculePresenterKt.asPresenter$default(new CardStudioUndoDialogPresenter(androidStringManager21, screenNavigator, 2));
        }
        if (screen instanceof InvestingScreens.DividendReinvestmentWelcomeScreen) {
            CardStudioPresenterV2$MetroFactory cardStudioPresenterV2$MetroFactory = this.dividendReinvestmentWelcomePresenter.delegateFactory;
            AndroidStringManager androidStringManager22 = (AndroidStringManager) cardStudioPresenterV2$MetroFactory.ioContext.lambda.invoke();
            RealInvestingStateManager realInvestingStateManager6 = (RealInvestingStateManager) cardStudioPresenterV2$MetroFactory.deviceOrientationProvider.invoke();
            FlowStarter flowStarter4 = (FlowStarter) cardStudioPresenterV2$MetroFactory.cashDatabase.getValue();
            FeatureFlagManager featureFlagManager7 = (FeatureFlagManager) cardStudioPresenterV2$MetroFactory.appConfig.getValue();
            androidStringManager22.getClass();
            realInvestingStateManager6.getClass();
            flowStarter4.getClass();
            featureFlagManager7.getClass();
            return MoleculePresenterKt.asPresenter$default(new CardStudioPresenter(androidStringManager22, realInvestingStateManager6, flowStarter4, featureFlagManager7, (InvestingScreens.DividendReinvestmentWelcomeScreen) screen, screenNavigator));
        }
        if (screen instanceof InvestingScreens.StocksTransferEtaScreen) {
            StocksTransferEtaSheetPresenter.MetroFactory metroFactory6 = this.stocksTransferEtaFullScreen.delegateFactory;
            RealInvestingStateManager realInvestingStateManager7 = (RealInvestingStateManager) metroFactory6.stateManager.invoke();
            AndroidDateFormatManager androidDateFormatManager2 = (AndroidDateFormatManager) metroFactory6.dateFormatter.lambda.invoke();
            AndroidStringManager androidStringManager23 = (AndroidStringManager) metroFactory6.stringManager.lambda.invoke();
            CoroutineContext coroutineContext13 = (CoroutineContext) metroFactory6.ioDispatcher.lambda.invoke();
            realInvestingStateManager7.getClass();
            androidDateFormatManager2.getClass();
            androidStringManager23.getClass();
            coroutineContext13.getClass();
            return MoleculePresenterKt.asPresenter$default(new StocksTransferEtaSheetPresenter(realInvestingStateManager7, androidDateFormatManager2, androidStringManager23, coroutineContext13, screenNavigator, 1));
        }
        if (screen instanceof InvestingScreens.StocksTransferEtaSheet) {
            StocksTransferEtaSheetPresenter.MetroFactory metroFactory7 = this.stocksTransferEtaSheet.delegateFactory;
            RealInvestingStateManager realInvestingStateManager8 = (RealInvestingStateManager) metroFactory7.stateManager.invoke();
            AndroidDateFormatManager androidDateFormatManager3 = (AndroidDateFormatManager) metroFactory7.dateFormatter.lambda.invoke();
            AndroidStringManager androidStringManager24 = (AndroidStringManager) metroFactory7.stringManager.lambda.invoke();
            CoroutineContext coroutineContext14 = (CoroutineContext) metroFactory7.ioDispatcher.lambda.invoke();
            realInvestingStateManager8.getClass();
            androidDateFormatManager3.getClass();
            androidStringManager24.getClass();
            coroutineContext14.getClass();
            return MoleculePresenterKt.asPresenter$default(new StocksTransferEtaSheetPresenter(realInvestingStateManager8, androidDateFormatManager3, androidStringManager24, coroutineContext14, screenNavigator, 0));
        }
        if (screen instanceof InvestingScreens.DependentAutoInvestBottomSheet) {
            AndroidStringManager androidStringManager25 = (AndroidStringManager) this.dependentAutoInvestInfoBottomSheetPresenter.delegateFactory.stringManager.lambda.invoke();
            androidStringManager25.getClass();
            return MoleculePresenterKt.asPresenter$default(new VerifyCheckDialogPresenter(androidStringManager25, (InvestingScreens.DependentAutoInvestBottomSheet) screen));
        }
        if (screen instanceof InvestingScreens.InvestingActivityHistoryScreen) {
            PlaidLinkPresenter.MetroFactory metroFactory8 = this.investmentActivityHistoryPresenter.delegateFactory;
            SessionManager sessionManager3 = (SessionManager) metroFactory8.stringManager.lambda.invoke();
            CashAccountDatabaseImpl cashAccountDatabaseImpl12 = (CashAccountDatabaseImpl) metroFactory8.appService.getValue();
            RealActivitiesCacheManager realActivitiesCacheManager2 = (RealActivitiesCacheManager) metroFactory8.analytics.getValue();
            RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl2 = (RealActivityEmbeddedPresenter$Factory$Impl) metroFactory8.blockersDataNavigator.invoke();
            Analytics analytics13 = (Analytics) metroFactory8.signOutSignal.getValue();
            InvestingStockDetailsActivityRequestHandler$Factory$Impl investingStockDetailsActivityRequestHandler$Factory$Impl2 = (InvestingStockDetailsActivityRequestHandler$Factory$Impl) metroFactory8.blockerFlowAnalytics.invoke();
            CoroutineContext coroutineContext15 = (CoroutineContext) metroFactory8.moshi.lambda.invoke();
            sessionManager3.getClass();
            cashAccountDatabaseImpl12.getClass();
            realActivitiesCacheManager2.getClass();
            realActivityEmbeddedPresenter$Factory$Impl2.getClass();
            analytics13.getClass();
            investingStockDetailsActivityRequestHandler$Factory$Impl2.getClass();
            coroutineContext15.getClass();
            return MoleculePresenterKt.asPresenter$default(new LocalHomePresenter(sessionManager3, cashAccountDatabaseImpl12, realActivitiesCacheManager2, realActivityEmbeddedPresenter$Factory$Impl2, analytics13, investingStockDetailsActivityRequestHandler$Factory$Impl2, coroutineContext15, (InvestingScreens.InvestingActivityHistoryScreen) screen, screenNavigator));
        }
        if (screen instanceof InvestingScreens.KeyStatsDetailsScreen) {
            TransferInPresenter$MetroFactory transferInPresenter$MetroFactory4 = this.investingKeyStatsDetailsPresenter.delegateFactory;
            RealInvestingMetrics realInvestingMetrics = (RealInvestingMetrics) transferInPresenter$MetroFactory4.analytics.getValue();
            RealInvestmentEntities realInvestmentEntities6 = (RealInvestmentEntities) transferInPresenter$MetroFactory4.moneyFormatterFactory.invoke();
            AndroidStringManager androidStringManager26 = (AndroidStringManager) transferInPresenter$MetroFactory4.stringManager.lambda.invoke();
            realInvestingMetrics.getClass();
            realInvestmentEntities6.getClass();
            androidStringManager26.getClass();
            return MoleculePresenterKt.asPresenter$default(new WorkHomePresenter(realInvestingMetrics, realInvestmentEntities6, androidStringManager26, screenNavigator, (InvestingScreens.KeyStatsDetailsScreen) screen));
        }
        if (!(screen instanceof InvestingScreens.EtfHoldingsDetailsScreen)) {
            return null;
        }
        OpenSourcePresenter$MetroFactory openSourcePresenter$MetroFactory = this.investingEtfHoldingDetailsPresenter.delegateFactory;
        RealInvestingMetrics realInvestingMetrics2 = (RealInvestingMetrics) openSourcePresenter$MetroFactory.context.getValue();
        AndroidClock androidClock3 = (AndroidClock) openSourcePresenter$MetroFactory.moshi.lambda.invoke();
        AndroidStringManager androidStringManager27 = (AndroidStringManager) openSourcePresenter$MetroFactory.ioDispatcher.lambda.invoke();
        Analytics analytics14 = (Analytics) openSourcePresenter$MetroFactory.intentFactory.getValue();
        realInvestingMetrics2.getClass();
        androidClock3.getClass();
        androidStringManager27.getClass();
        analytics14.getClass();
        return MoleculePresenterKt.asPresenter$default(new ShareSheetPresenter(realInvestingMetrics2, androidClock3, androidStringManager27, analytics14, (InvestingScreens.EtfHoldingsDetailsScreen) screen, screenNavigator));
    }
}
