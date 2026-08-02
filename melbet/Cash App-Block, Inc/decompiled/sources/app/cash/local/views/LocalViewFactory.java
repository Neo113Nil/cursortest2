package app.cash.local.views;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.compose.material.MenuKt$$ExternalSyntheticLambda1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.tracing.Trace;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.Ui;
import app.cash.broadway.ui.UiFactory;
import app.cash.broadway.ui.compose.ComposeUiView;
import app.cash.history.screens.HistoryScreens;
import app.cash.local.navigation.api.RealCashLocalShortlinkHandler;
import app.cash.local.presenters.brand.profile.LocalBrandProfileContentFactory;
import app.cash.local.presenters.internal.FulfillmentTimeUtils;
import app.cash.local.screens.app.LocalAddBrandsScreen;
import app.cash.local.screens.app.LocalBrandLocationCartScreen;
import app.cash.local.screens.app.LocalBrandLocationCheckoutScreen;
import app.cash.local.screens.app.LocalBrandLocationMenuScreen;
import app.cash.local.screens.app.LocalBrandLocationOpenTabCheckoutScreen;
import app.cash.local.screens.app.LocalBrandLocationOpenTabScreen;
import app.cash.local.screens.app.LocalBrandProfileScreen;
import app.cash.local.screens.app.LocalCashAllActivityScreen;
import app.cash.local.screens.app.LocalCashBalanceScreen;
import app.cash.local.screens.app.LocalCheckoutDeeplinkScreen;
import app.cash.local.screens.app.LocalCurbsidePickupCarScreen;
import app.cash.local.screens.app.LocalEditorialScreen;
import app.cash.local.screens.app.LocalEducationalSheet;
import app.cash.local.screens.app.LocalExplanatoryDialog;
import app.cash.local.screens.app.LocalFulfillmentPickerScreen;
import app.cash.local.screens.app.LocalLoyaltySheet;
import app.cash.local.screens.app.LocalMarketingMessageScreen;
import app.cash.local.screens.app.LocalMarketingMessagesScreen;
import app.cash.local.screens.app.LocalMenuComboDetailsScreen;
import app.cash.local.screens.app.LocalMenuItemDetailsScreen;
import app.cash.local.screens.app.LocalMenuPickerScreen;
import app.cash.local.screens.app.LocalNeighborhoodsMapScreen;
import app.cash.local.screens.app.LocalOrderStatusScreen;
import app.cash.local.screens.app.LocalOrdersScreen;
import app.cash.local.screens.app.LocalPosBrandOnboardingScreen;
import app.cash.local.screens.app.LocalPosCheckInScreen;
import app.cash.local.screens.app.LocalPosLocalCashRedemptionScreen;
import app.cash.local.screens.app.LocalSchedulingDayTimePickerScreen;
import app.cash.local.screens.app.LocalScreen;
import app.cash.local.screens.app.LocalShortlinkSheet;
import app.cash.local.screens.app.LocalTabScreen;
import app.cash.local.screens.app.TableQrCodeScannerScreen;
import app.cash.local.service.LocalService;
import app.cash.local.sharedui.LocalComposeUiKt;
import app.cash.local.viewmodels.fulfillment.FulfillmentPickerViewModel;
import app.cash.local.viewmodels.map.BrandCollectionMapViewModel;
import app.cash.local.viewmodels.wallet.LocalHomeViewModel;
import app.cash.local.views.LocalViewFactory;
import app.cash.local.views.dialog.LocalExplanatoryDialogView;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.address.typeahead.backend.real.PlacesAddressSearcher;
import com.squareup.address.typeahead.views.AddressTypeaheadKt;
import com.squareup.cash.R;
import com.squareup.cash.activity.backend.offline.RealOfflineActivitiesManager;
import com.squareup.cash.activity.screens.ActivityScreen;
import com.squareup.cash.activity.screens.BalanceFeedScreen;
import com.squareup.cash.activity.viewmodels.ActivityTabViewModel;
import com.squareup.cash.activity.viewmodels.BalanceFeedViewModel;
import com.squareup.cash.activity.viewmodels.ReceiptViewModel;
import com.squareup.cash.activity.views.receipts.ReceiptUiKt;
import com.squareup.cash.amountslider.presenters.RealAmountSelectorPresenter;
import com.squareup.cash.appmessages.RealAppMessageManager;
import com.squareup.cash.appmessages.RealAppMessageRepositoryWriter;
import com.squareup.cash.appmessages.badging.CardTabBadgeCounter;
import com.squareup.cash.bitcoin.capability.RealBitcoinCapabilityProvider;
import com.squareup.cash.bitcoin.formatter.RealBitcoinFormatter;
import com.squareup.cash.bitcoin.navigation.RealBitcoinInboundNavigator$Factory$Impl;
import com.squareup.cash.bitcoin.presenters.send.SendBitcoinNavigator;
import com.squareup.cash.blockers.flow.RealMultiBlockerFacilitator;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.blockers.navigation.FlowNavigationHelper;
import com.squareup.cash.blockers.views.FormBlockerView$Factory$Impl;
import com.squareup.cash.boost.backend.RealBoostProvider;
import com.squareup.cash.braze.BrazeManager;
import com.squareup.cash.braze.BrazeSetupTeardownActivityWorker;
import com.squareup.cash.cashapplite.screens.LiteCashOutScreen;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientsync.errors.RealClientSyncErrorReporter;
import com.squareup.cash.clientsync.persistence.SqlComponentMigrationStore;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.crypto.address.RealCryptoInvoiceParser;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.profile.RealAddressManager;
import com.squareup.cash.data.profile.RealContactAliasFetcher;
import com.squareup.cash.data.profile.RealJurisdictionConfigManager;
import com.squareup.cash.data.profile.RealProfileAliasRepository;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.Instrument$Adapter;
import com.squareup.cash.deposits.physical.backend.real.barcode.RealCashDepositBarcodeManager;
import com.squareup.cash.deposits.physical.screens.AtmLocationDetailsScreen;
import com.squareup.cash.deposits.physical.screens.AtmPmdExplainerScreen;
import com.squareup.cash.deposits.physical.screens.AtmRetailerMapScreen;
import com.squareup.cash.deposits.physical.screens.AtmWithdrawalExplainerScreen;
import com.squareup.cash.deposits.physical.screens.LocationDeniedScreen;
import com.squareup.cash.deposits.physical.screens.PaperMoneyDepositBarcodeFailedScreen;
import com.squareup.cash.deposits.physical.screens.PaperMoneyDepositBarcodeScreen;
import com.squareup.cash.deposits.physical.screens.PaperMoneyDepositMapScreen;
import com.squareup.cash.deposits.physical.screens.PaperMoneyDepositMerchantDetailsScreen;
import com.squareup.cash.deposits.physical.screens.PaperMoneyDepositOnboardingScreen;
import com.squareup.cash.deposits.physical.screens.PhysicalCashDepositAddressEntryScreen;
import com.squareup.cash.deposits.physical.screens.PhysicalCashLimitReachedScreen;
import com.squareup.cash.deposits.physical.screens.PhysicalDepositErrorScreen;
import com.squareup.cash.deposits.physical.screens.SwipeToLoadOnboardingScreen;
import com.squareup.cash.deposits.physical.view.ComposableSingletons$PhysicalDepositViewFactoryKt;
import com.squareup.cash.deposits.physical.view.barcode.PaperMoneyDepositExpiredBarcodeView;
import com.squareup.cash.deposits.physical.viewmodels.barcode.PaperMoneyDepositBarcodeViewModel;
import com.squareup.cash.deposits.physical.viewmodels.map.AtmWithdrawalMapViewModel;
import com.squareup.cash.deposits.physical.viewmodels.map.PaperMoneyDepositMapViewModel;
import com.squareup.cash.deposits.physical.viewmodels.onboarding.PaperMoneyDepositOnboardingViewModel;
import com.squareup.cash.downloadmanager.android.AndroidDownloadManager$Factory$Impl;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository;
import com.squareup.cash.family.applets.backend.real.RealFamilyAppletConfigProvider;
import com.squareup.cash.family.familyhub.backend.real.RealFamilyAccountsManager;
import com.squareup.cash.favorites.data.RealFavoritesManager;
import com.squareup.cash.favorites.data.RealFavoritesRepository;
import com.squareup.cash.favorites.presenters.FavoriteUpsellRefresher;
import com.squareup.cash.featureflags.AmplitudeExperiments$BitcoinStablecoinMvp;
import com.squareup.cash.featureflags.AmplitudeExperiments$MoneybotTopControlsTransition;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$NativeEnrichedReceipts;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.formview.components.FormView$Factory$Impl;
import com.squareup.cash.formview.viewmodels.FormViewModel;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.history.analytics.LoadTimeClock;
import com.squareup.cash.history.treehouse.RealTreehouseActivity;
import com.squareup.cash.history.views.CancelPaymentView;
import com.squareup.cash.history.views.CancelPaymentView$Factory$Impl;
import com.squareup.cash.history.views.CancelPendingSupPaymentBottomSheet;
import com.squareup.cash.history.views.CheckPaymentStatusDialog;
import com.squareup.cash.history.views.CheckPaymentStatusDialog$Factory$Impl;
import com.squareup.cash.history.views.ErrorView;
import com.squareup.cash.history.views.InvestingRoundUpsFailedDialog;
import com.squareup.cash.history.views.InvestingRoundUpsSkippedDialog;
import com.squareup.cash.history.views.LegacyReportAbuseView;
import com.squareup.cash.history.views.PaymentPasscodeDialogView;
import com.squareup.cash.history.views.PaymentPasscodeDialogView$Factory$Impl;
import com.squareup.cash.history.views.PaymentReceiptDialogView;
import com.squareup.cash.history.views.RefundPaymentView;
import com.squareup.cash.history.views.ReportAbuseDialogView;
import com.squareup.cash.history.views.ReportAbuseView;
import com.squareup.cash.history.views.SkipPaymentView;
import com.squareup.cash.history.views.receipt.TreehouseReceiptView;
import com.squareup.cash.history.views.receipt.TreehouseReceiptView$Factory$Impl;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.maps.engine.providers.GoogleMapEngineProvider;
import com.squareup.cash.maps.engine.providers.MapEngineProviderKt;
import com.squareup.cash.merchant.views.SquareLoyaltySheetView;
import com.squareup.cash.money.views.MoneyUiFactory$$ExternalSyntheticLambda0;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.multiplatform.bitcoin.parsers.RealBitcoinAddressParser;
import com.squareup.cash.multiplatform.bitcoin.parsers.RealLightningInvoiceParser;
import com.squareup.cash.multiplatform.bitcoin.parsers.ethereum.RealEthereumAddressParser;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.payments.backend.api.PaymentManager;
import com.squareup.cash.payments.backend.real.RealStatusAndLimitsManager;
import com.squareup.cash.performance.RealScrollPerformanceTrackerFactory;
import com.squareup.cash.profile.views.ProfileUiView;
import com.squareup.cash.recipients.data.RealRecipientRepository;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.shopping.views.ProductSearchView;
import com.squareup.cash.support.backend.api.SupportActivityItemLoader;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.cash.support.screens.SupportScreens$SupportDialogs$SupportFlowCheckConnectionScreen;
import com.squareup.cash.support.views.ContactSupportEmailInputView;
import com.squareup.cash.support.views.ContactSupportEmailMessageView;
import com.squareup.cash.support.views.ScreenshotConfirmView;
import com.squareup.cash.support.views.SupportArticleIncidentsSheetView;
import com.squareup.cash.support.views.SupportFlowCheckConnectionView;
import com.squareup.cash.support.views.SupportHomeContactOptionsSheet;
import com.squareup.cash.support.views.SupportIncidentDetailsView;
import com.squareup.cash.support.views.SupportLoadClientScenarioView;
import com.squareup.cash.support.views.SupportPhoneStatusView;
import com.squareup.cash.support.views.SupportPhoneVerificationView;
import com.squareup.cash.support.views.SupportTransactionConfirmationView;
import com.squareup.cash.support.views.search.SupportSearchView;
import com.squareup.cash.transfers.screens.AddMoneyScreen;
import com.squareup.cash.transfers.screens.BalanceBasedAddCashDisabledDialogScreen;
import com.squareup.cash.transfers.screens.BalanceBasedAutoReloadConfirmationScreen;
import com.squareup.cash.transfers.screens.InstrumentDetailsFullscreenScreen;
import com.squareup.cash.transfers.screens.InstrumentDetailsSheetScreen;
import com.squareup.cash.transfers.screens.InstrumentLinkingOptionsScreen;
import com.squareup.cash.transfers.screens.InstrumentNotLinkedScreen;
import com.squareup.cash.transfers.screens.LinkedAccountsNuxScreen;
import com.squareup.cash.transfers.screens.LinkedAccountsScreen;
import com.squareup.cash.transfers.screens.PendingTransfersConfirmationDialog;
import com.squareup.cash.transfers.screens.RecurringReloadConfigurationScreen;
import com.squareup.cash.transfers.screens.RecurringReloadOptionScreen;
import com.squareup.cash.transfers.screens.RecurringReloadsChangeInstrumentScreen;
import com.squareup.cash.transfers.screens.RecurringReloadsDismissDialogScreen;
import com.squareup.cash.transfers.screens.ScheduledReloadConfirmationScreen;
import com.squareup.cash.transfers.screens.SetDefaultInstrumentScreen;
import com.squareup.cash.transfers.screens.TransfersRouterScreen;
import com.squareup.cash.transfers.screens.WithdrawScreen;
import com.squareup.cash.transfers.viewmodels.InstrumentDetailsViewModel;
import com.squareup.cash.transfers.viewmodels.InstrumentLinkingOptionsViewModel;
import com.squareup.cash.transfers.viewmodels.LinkedAccountsViewModel;
import com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel;
import com.squareup.cash.transfers.viewmodels.RecurringReloadOptionViewModel;
import com.squareup.cash.transfers.viewmodels.ScheduledReloadConfirmationViewModel;
import com.squareup.cash.transfers.views.AddMoneyView;
import com.squareup.cash.transfers.views.AddMoneyViewKt;
import com.squareup.cash.transfers.views.BalanceBasedAddCashDisabledDialogView;
import com.squareup.cash.transfers.views.BalanceBasedAutoReloadConfirmationView;
import com.squareup.cash.transfers.views.PendingTransfersConfirmationDialogView;
import com.squareup.cash.transfers.views.WithdrawView;
import com.squareup.cash.treehouse.android.platform.CashTreehouseLayout;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.util.network.impl.RealNetworkInfo;
import com.squareup.cash.wallet.screens.CardControlDialogScreen;
import com.squareup.cash.wallet.screens.CardLockHalfSheetScreen;
import com.squareup.cash.wallet.screens.PresentationTimelineScreen;
import com.squareup.cash.wallet.screens.WalletHomeScreen;
import com.squareup.cash.wallet.views.ArcadeCardControlDialog;
import com.squareup.cash.wallet.views.CardRegistry;
import com.squareup.cash.wallet.views.UtilsKt;
import com.squareup.cash.webview.android.WebViewProvider;
import com.squareup.cash.work.screens.ClockInBottomSheetScreen;
import com.squareup.cash.work.screens.ClockInOverlayScreen;
import com.squareup.cash.work.screens.DeclareCashTipBottomSheetScreen;
import com.squareup.cash.work.screens.MerchantPickerBottomSheetScreen;
import com.squareup.cash.work.screens.ShiftDetailScreen;
import com.squareup.cash.work.screens.ShiftListScreen;
import com.squareup.cash.work.screens.ShiftNotStartedDialogScreen;
import com.squareup.cash.work.screens.ShiftNoteScreen;
import com.squareup.cash.work.screens.TakeBreakBottomSheetScreen;
import com.squareup.cash.work.screens.TimecardDetailScreen;
import com.squareup.cash.work.screens.WorkHomeScreen;
import com.squareup.cash.work.screens.WorkPayHistoryListScreen;
import com.squareup.cash.work.screens.WorkPayHomeScreen;
import com.squareup.cash.work.screens.WorkTaxFormDownloaderScreen;
import com.squareup.cash.work.screens.WorkTaxFormsListScreen;
import com.squareup.cash.work.service.real.WorkCookieJar;
import com.squareup.cash.work.viewmodels.ClockInOverlayViewModel;
import com.squareup.cash.work.viewmodels.MerchantPickerViewModel;
import com.squareup.cash.work.viewmodels.PayHistoryListViewModel;
import com.squareup.cash.work.viewmodels.PayHomeViewModel;
import com.squareup.cash.work.viewmodels.ShiftDetailViewModel;
import com.squareup.cash.work.viewmodels.ShiftListViewModel;
import com.squareup.cash.work.viewmodels.WorkHomeViewModel;
import com.squareup.cash.work.views.SellerCardKt;
import com.squareup.cash.work.webview.screens.WorkWebScreen;
import com.squareup.cash.work.webview.viewmodels.WorkWebViewModel;
import com.squareup.cash.work.webview.views.WorkWebViewKt;
import com.squareup.protos.cash.janus.api.JanusService;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageClientService;
import com.squareup.protos.franklin.app.AppService;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import kotlin.Lazy;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import okhttp3.ConnectionPool;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import squareup.cash.papermate.app.PapermateClientService;

/* loaded from: classes.dex */
public final class LocalViewFactory implements UiFactory {
    public final /* synthetic */ int $r8$classId;
    public final Object addressSearcher;
    public final Object featureFlagManager;
    public final RealImageLoader imageLoader;
    public final Object mapEngineProvider;

    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final Provider addressSearcher;
        public final Provider featureFlagManager;
        public final Provider imageLoader;
        public final Provider mapEngineProvider;

        public /* synthetic */ MetroFactory(Provider provider, Provider provider2, Provider provider3, Provider provider4, int i) {
            this.$r8$classId = i;
            this.addressSearcher = provider;
            this.imageLoader = provider2;
            this.mapEngineProvider = provider3;
            this.featureFlagManager = provider4;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            Provider provider = this.featureFlagManager;
            Provider provider2 = this.mapEngineProvider;
            Provider provider3 = this.imageLoader;
            Provider provider4 = this.addressSearcher;
            switch (i) {
                case 0:
                    PlacesAddressSearcher placesAddressSearcher = (PlacesAddressSearcher) provider4.invoke();
                    RealImageLoader realImageLoader = (RealImageLoader) provider3.invoke();
                    GoogleMapEngineProvider googleMapEngineProvider = (GoogleMapEngineProvider) provider2.invoke();
                    FeatureFlagManager featureFlagManager = (FeatureFlagManager) provider.invoke();
                    placesAddressSearcher.getClass();
                    realImageLoader.getClass();
                    googleMapEngineProvider.getClass();
                    featureFlagManager.getClass();
                    return new LocalViewFactory(placesAddressSearcher, realImageLoader, googleMapEngineProvider, featureFlagManager, 0);
                case 1:
                    FlowStarter flowStarter = (FlowStarter) provider4.invoke();
                    BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) provider3.invoke();
                    RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) provider2.invoke();
                    LocalService localService = (LocalService) provider.invoke();
                    flowStarter.getClass();
                    blockersDataNavigator.getClass();
                    realRouter$Factory$Impl.getClass();
                    localService.getClass();
                    return new RealCashLocalShortlinkHandler(flowStarter, blockersDataNavigator, realRouter$Factory$Impl, localService);
                case 2:
                    AndroidStringManager androidStringManager = (AndroidStringManager) provider4.invoke();
                    AndroidClock androidClock = (AndroidClock) provider3.invoke();
                    FulfillmentTimeUtils fulfillmentTimeUtils = (FulfillmentTimeUtils) provider2.invoke();
                    String str = (String) provider.invoke();
                    androidStringManager.getClass();
                    androidClock.getClass();
                    fulfillmentTimeUtils.getClass();
                    str.getClass();
                    return new LocalBrandProfileContentFactory(androidStringManager, androidClock, fulfillmentTimeUtils, str);
                case 3:
                    Flow flow = (Flow) provider4.invoke();
                    CoroutineContext coroutineContext = (CoroutineContext) provider3.invoke();
                    CoroutineContext coroutineContext2 = (CoroutineContext) provider2.invoke();
                    CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) provider.invoke();
                    flow.getClass();
                    coroutineContext.getClass();
                    coroutineContext2.getClass();
                    cashAccountDatabaseImpl.getClass();
                    return new RealOfflineActivitiesManager(flow, coroutineContext, coroutineContext2, cashAccountDatabaseImpl);
                case 4:
                    RealCashVibrator realCashVibrator = (RealCashVibrator) provider4.invoke();
                    RealImageLoader realImageLoader2 = (RealImageLoader) provider3.invoke();
                    RealScrollPerformanceTrackerFactory realScrollPerformanceTrackerFactory = (RealScrollPerformanceTrackerFactory) provider2.invoke();
                    FeatureFlagManager featureFlagManager2 = (FeatureFlagManager) provider.invoke();
                    realCashVibrator.getClass();
                    realImageLoader2.getClass();
                    realScrollPerformanceTrackerFactory.getClass();
                    featureFlagManager2.getClass();
                    return new LocalViewFactory(realCashVibrator, realImageLoader2, realScrollPerformanceTrackerFactory, featureFlagManager2, 1);
                case 5:
                    AndroidStringManager androidStringManager2 = (AndroidStringManager) provider4.invoke();
                    RealBitcoinCapabilityProvider realBitcoinCapabilityProvider = (RealBitcoinCapabilityProvider) provider3.invoke();
                    SyncValueReader syncValueReader = (SyncValueReader) provider2.invoke();
                    LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) provider.invoke();
                    androidStringManager2.getClass();
                    realBitcoinCapabilityProvider.getClass();
                    syncValueReader.getClass();
                    factory.getClass();
                    return new RealAmountSelectorPresenter(androidStringManager2, realBitcoinCapabilityProvider, syncValueReader, factory);
                case 6:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl2 = (CashAccountDatabaseImpl) provider4.invoke();
                    CoroutineContext coroutineContext3 = (CoroutineContext) provider3.invoke();
                    FeatureFlagManager featureFlagManager3 = (FeatureFlagManager) provider2.invoke();
                    RealAppMessageManager realAppMessageManager = (RealAppMessageManager) provider.invoke();
                    cashAccountDatabaseImpl2.getClass();
                    coroutineContext3.getClass();
                    featureFlagManager3.getClass();
                    realAppMessageManager.getClass();
                    return new CardTabBadgeCounter(cashAccountDatabaseImpl2, coroutineContext3, featureFlagManager3, realAppMessageManager, 1);
                case 7:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl3 = (CashAccountDatabaseImpl) provider4.invoke();
                    CoroutineContext coroutineContext4 = (CoroutineContext) provider3.invoke();
                    FeatureFlagManager featureFlagManager4 = (FeatureFlagManager) provider2.invoke();
                    RealAppMessageManager realAppMessageManager2 = (RealAppMessageManager) provider.invoke();
                    cashAccountDatabaseImpl3.getClass();
                    coroutineContext4.getClass();
                    featureFlagManager4.getClass();
                    realAppMessageManager2.getClass();
                    return new CardTabBadgeCounter(cashAccountDatabaseImpl3, coroutineContext4, featureFlagManager4, realAppMessageManager2, 2);
                case 8:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl4 = (CashAccountDatabaseImpl) provider4.invoke();
                    CoroutineContext coroutineContext5 = (CoroutineContext) provider3.invoke();
                    FeatureFlagManager featureFlagManager5 = (FeatureFlagManager) provider2.invoke();
                    RealAppMessageManager realAppMessageManager3 = (RealAppMessageManager) provider.invoke();
                    cashAccountDatabaseImpl4.getClass();
                    coroutineContext5.getClass();
                    featureFlagManager5.getClass();
                    realAppMessageManager3.getClass();
                    return new CardTabBadgeCounter(cashAccountDatabaseImpl4, coroutineContext5, featureFlagManager5, realAppMessageManager3, 3);
                case 9:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl5 = (CashAccountDatabaseImpl) provider4.invoke();
                    CoroutineContext coroutineContext6 = (CoroutineContext) provider3.invoke();
                    FeatureFlagManager featureFlagManager6 = (FeatureFlagManager) provider2.invoke();
                    RealAppMessageManager realAppMessageManager4 = (RealAppMessageManager) provider.invoke();
                    cashAccountDatabaseImpl5.getClass();
                    coroutineContext6.getClass();
                    featureFlagManager6.getClass();
                    realAppMessageManager4.getClass();
                    return new CardTabBadgeCounter(cashAccountDatabaseImpl5, coroutineContext6, featureFlagManager6, realAppMessageManager4, 0);
                case 10:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl6 = (CashAccountDatabaseImpl) provider4.invoke();
                    CoroutineContext coroutineContext7 = (CoroutineContext) provider3.invoke();
                    FeatureFlagManager featureFlagManager7 = (FeatureFlagManager) provider2.invoke();
                    RealAppMessageManager realAppMessageManager5 = (RealAppMessageManager) provider.invoke();
                    cashAccountDatabaseImpl6.getClass();
                    coroutineContext7.getClass();
                    featureFlagManager7.getClass();
                    realAppMessageManager5.getClass();
                    return new CardTabBadgeCounter(cashAccountDatabaseImpl6, coroutineContext7, featureFlagManager7, realAppMessageManager5, 4);
                case 11:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl7 = (CashAccountDatabaseImpl) provider4.invoke();
                    CoroutineContext coroutineContext8 = (CoroutineContext) provider3.invoke();
                    FeatureFlagManager featureFlagManager8 = (FeatureFlagManager) provider2.invoke();
                    RealAppMessageManager realAppMessageManager6 = (RealAppMessageManager) provider.invoke();
                    cashAccountDatabaseImpl7.getClass();
                    coroutineContext8.getClass();
                    featureFlagManager8.getClass();
                    realAppMessageManager6.getClass();
                    return new CardTabBadgeCounter(cashAccountDatabaseImpl7, coroutineContext8, featureFlagManager8, realAppMessageManager6, 5);
                case 12:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl8 = (CashAccountDatabaseImpl) provider4.invoke();
                    CoroutineContext coroutineContext9 = (CoroutineContext) provider3.invoke();
                    FeatureFlagManager featureFlagManager9 = (FeatureFlagManager) provider2.invoke();
                    RealAppMessageManager realAppMessageManager7 = (RealAppMessageManager) provider.invoke();
                    cashAccountDatabaseImpl8.getClass();
                    coroutineContext9.getClass();
                    featureFlagManager9.getClass();
                    realAppMessageManager7.getClass();
                    return new CardTabBadgeCounter(cashAccountDatabaseImpl8, coroutineContext9, featureFlagManager9, realAppMessageManager7, 6);
                case 13:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl9 = (CashAccountDatabaseImpl) provider4.invoke();
                    CoroutineContext coroutineContext10 = (CoroutineContext) provider3.invoke();
                    FeatureFlagManager featureFlagManager10 = (FeatureFlagManager) provider2.invoke();
                    RealAppMessageManager realAppMessageManager8 = (RealAppMessageManager) provider.invoke();
                    cashAccountDatabaseImpl9.getClass();
                    coroutineContext10.getClass();
                    featureFlagManager10.getClass();
                    realAppMessageManager8.getClass();
                    return new CardTabBadgeCounter(cashAccountDatabaseImpl9, coroutineContext10, featureFlagManager10, realAppMessageManager8, 7);
                case 14:
                    RealBitcoinInboundNavigator$Factory$Impl realBitcoinInboundNavigator$Factory$Impl = (RealBitcoinInboundNavigator$Factory$Impl) provider4.invoke();
                    Analytics analytics = (Analytics) provider3.invoke();
                    AndroidStringManager androidStringManager3 = (AndroidStringManager) provider2.invoke();
                    RealBitcoinFormatter realBitcoinFormatter = (RealBitcoinFormatter) provider.invoke();
                    realBitcoinInboundNavigator$Factory$Impl.getClass();
                    analytics.getClass();
                    androidStringManager3.getClass();
                    realBitcoinFormatter.getClass();
                    return new SendBitcoinNavigator(realBitcoinInboundNavigator$Factory$Impl, analytics, androidStringManager3, realBitcoinFormatter);
                case 15:
                    AppService appService = (AppService) provider4.invoke();
                    AppService appService2 = (AppService) provider4.invoke();
                    BlockersDataNavigator blockersDataNavigator2 = (BlockersDataNavigator) provider3.invoke();
                    CashAccountDatabaseImpl cashAccountDatabaseImpl10 = (CashAccountDatabaseImpl) provider2.invoke();
                    CoroutineContext coroutineContext11 = (CoroutineContext) provider.invoke();
                    appService.getClass();
                    appService2.getClass();
                    blockersDataNavigator2.getClass();
                    cashAccountDatabaseImpl10.getClass();
                    coroutineContext11.getClass();
                    return new RealMultiBlockerFacilitator(appService, appService2, blockersDataNavigator2, cashAccountDatabaseImpl10, coroutineContext11);
                case 16:
                    BlockersDataNavigator blockersDataNavigator3 = (BlockersDataNavigator) provider4.invoke();
                    BlockerFlowListener blockerFlowListener = (BlockerFlowListener) provider3.invoke();
                    AndroidStringManager androidStringManager4 = (AndroidStringManager) provider2.invoke();
                    FeatureFlagManager featureFlagManager11 = (FeatureFlagManager) provider.invoke();
                    blockersDataNavigator3.getClass();
                    blockerFlowListener.getClass();
                    androidStringManager4.getClass();
                    featureFlagManager11.getClass();
                    return new FlowNavigationHelper(blockersDataNavigator3, blockerFlowListener, androidStringManager4, featureFlagManager11);
                case 17:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl11 = (CashAccountDatabaseImpl) provider4.invoke();
                    AndroidClock androidClock2 = (AndroidClock) provider3.invoke();
                    RealNetworkInfo realNetworkInfo = (RealNetworkInfo) provider2.invoke();
                    CoroutineContext coroutineContext12 = (CoroutineContext) provider.invoke();
                    cashAccountDatabaseImpl11.getClass();
                    androidClock2.getClass();
                    realNetworkInfo.getClass();
                    coroutineContext12.getClass();
                    return new RealBoostProvider(cashAccountDatabaseImpl11, androidClock2, realNetworkInfo, coroutineContext12);
                case 18:
                    FeatureFlagManager featureFlagManager12 = (FeatureFlagManager) provider4.invoke();
                    BrazeManager brazeManager = (BrazeManager) provider3.invoke();
                    SessionManager sessionManager = (SessionManager) provider2.invoke();
                    Flow flow2 = (Flow) provider.invoke();
                    featureFlagManager12.getClass();
                    brazeManager.getClass();
                    sessionManager.getClass();
                    flow2.getClass();
                    return new BrazeSetupTeardownActivityWorker(featureFlagManager12, brazeManager, sessionManager, flow2);
                case 19:
                    ErrorReporter errorReporter = (ErrorReporter) provider4.invoke();
                    SqlComponentMigrationStore sqlComponentMigrationStore = (SqlComponentMigrationStore) provider3.invoke();
                    FeatureFlagManager featureFlagManager13 = (FeatureFlagManager) provider2.invoke();
                    provider.getClass();
                    Lazy doubleCheck = provider instanceof Lazy ? (Lazy) provider : new DoubleCheck(provider);
                    errorReporter.getClass();
                    sqlComponentMigrationStore.getClass();
                    featureFlagManager13.getClass();
                    return new RealClientSyncErrorReporter(errorReporter, sqlComponentMigrationStore, featureFlagManager13, doubleCheck);
                case 20:
                    FeatureFlagManager featureFlagManager14 = (FeatureFlagManager) provider4.invoke();
                    Analytics analytics2 = (Analytics) provider3.invoke();
                    RealLightningInvoiceParser realLightningInvoiceParser = (RealLightningInvoiceParser) provider2.invoke();
                    RealBitcoinAddressParser realBitcoinAddressParser = (RealBitcoinAddressParser) provider.invoke();
                    featureFlagManager14.getClass();
                    analytics2.getClass();
                    realLightningInvoiceParser.getClass();
                    realBitcoinAddressParser.getClass();
                    RealFeatureFlagManager realFeatureFlagManager = (RealFeatureFlagManager) featureFlagManager14;
                    boolean enabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) realFeatureFlagManager.peekCurrentValue(AmplitudeExperiments$BitcoinStablecoinMvp.INSTANCE)).enabled();
                    return new RealCryptoInvoiceParser(new Instrument$Adapter(realLightningInvoiceParser, new ConnectionPool(realBitcoinAddressParser, realLightningInvoiceParser), enabled ? new WorkCookieJar(5) : null, enabled ? new RealEthereumAddressParser() : null), realFeatureFlagManager, analytics2);
                case 21:
                    SyncValueReader syncValueReader2 = (SyncValueReader) provider4.invoke();
                    CashAccountDatabaseImpl cashAccountDatabaseImpl12 = (CashAccountDatabaseImpl) provider3.invoke();
                    FeatureFlagManager featureFlagManager15 = (FeatureFlagManager) provider2.invoke();
                    CoroutineContext coroutineContext13 = (CoroutineContext) provider.invoke();
                    syncValueReader2.getClass();
                    cashAccountDatabaseImpl12.getClass();
                    featureFlagManager15.getClass();
                    coroutineContext13.getClass();
                    return new RealAddressManager(syncValueReader2, cashAccountDatabaseImpl12, featureFlagManager15, coroutineContext13);
                case 22:
                    JanusService janusService = (JanusService) provider4.invoke();
                    FeatureFlagManager featureFlagManager16 = (FeatureFlagManager) provider3.invoke();
                    CashAccountDatabaseImpl cashAccountDatabaseImpl13 = (CashAccountDatabaseImpl) provider2.invoke();
                    CoroutineContext coroutineContext14 = (CoroutineContext) provider.invoke();
                    janusService.getClass();
                    featureFlagManager16.getClass();
                    cashAccountDatabaseImpl13.getClass();
                    coroutineContext14.getClass();
                    return new RealContactAliasFetcher(janusService, featureFlagManager16, cashAccountDatabaseImpl13, coroutineContext14);
                case 23:
                    SyncValueReader syncValueReader3 = (SyncValueReader) provider4.invoke();
                    FeatureFlagManager featureFlagManager17 = (FeatureFlagManager) provider3.invoke();
                    CashAccountDatabaseImpl cashAccountDatabaseImpl14 = (CashAccountDatabaseImpl) provider2.invoke();
                    CoroutineContext coroutineContext15 = (CoroutineContext) provider.invoke();
                    syncValueReader3.getClass();
                    featureFlagManager17.getClass();
                    cashAccountDatabaseImpl14.getClass();
                    coroutineContext15.getClass();
                    return new RealJurisdictionConfigManager(syncValueReader3, cashAccountDatabaseImpl14, featureFlagManager17, coroutineContext15);
                case 24:
                    FeatureFlagManager featureFlagManager18 = (FeatureFlagManager) provider4.invoke();
                    SyncValueReader syncValueReader4 = (SyncValueReader) provider3.invoke();
                    CashAccountDatabaseImpl cashAccountDatabaseImpl15 = (CashAccountDatabaseImpl) provider2.invoke();
                    CoroutineContext coroutineContext16 = (CoroutineContext) provider.invoke();
                    featureFlagManager18.getClass();
                    syncValueReader4.getClass();
                    cashAccountDatabaseImpl15.getClass();
                    coroutineContext16.getClass();
                    return new RealProfileAliasRepository(syncValueReader4, cashAccountDatabaseImpl15, featureFlagManager18, coroutineContext16);
                case 25:
                    PapermateClientService papermateClientService = (PapermateClientService) provider4.invoke();
                    CashAccountDatabaseImpl cashAccountDatabaseImpl16 = (CashAccountDatabaseImpl) provider3.invoke();
                    AndroidClock androidClock3 = (AndroidClock) provider2.invoke();
                    CoroutineContext coroutineContext17 = (CoroutineContext) provider.invoke();
                    papermateClientService.getClass();
                    cashAccountDatabaseImpl16.getClass();
                    androidClock3.getClass();
                    coroutineContext17.getClass();
                    return new RealCashDepositBarcodeManager(papermateClientService, cashAccountDatabaseImpl16, androidClock3, coroutineContext17);
                case 26:
                    FormBlockerView$Factory$Impl formBlockerView$Factory$Impl = (FormBlockerView$Factory$Impl) provider4.invoke();
                    FormView$Factory$Impl formView$Factory$Impl = (FormView$Factory$Impl) provider3.invoke();
                    RealImageLoader realImageLoader3 = (RealImageLoader) provider2.invoke();
                    GoogleMapEngineProvider googleMapEngineProvider2 = (GoogleMapEngineProvider) provider.invoke();
                    formBlockerView$Factory$Impl.getClass();
                    formView$Factory$Impl.getClass();
                    realImageLoader3.getClass();
                    googleMapEngineProvider2.getClass();
                    return new LocalViewFactory(formBlockerView$Factory$Impl, formView$Factory$Impl, realImageLoader3, googleMapEngineProvider2);
                case 27:
                    SyncValueReader syncValueReader5 = (SyncValueReader) provider4.invoke();
                    RealFeatureEligibilityRepository realFeatureEligibilityRepository = (RealFeatureEligibilityRepository) provider3.invoke();
                    RealStatusAndLimitsManager realStatusAndLimitsManager = (RealStatusAndLimitsManager) provider2.invoke();
                    RealFamilyAccountsManager realFamilyAccountsManager = (RealFamilyAccountsManager) provider.invoke();
                    syncValueReader5.getClass();
                    realFeatureEligibilityRepository.getClass();
                    realStatusAndLimitsManager.getClass();
                    realFamilyAccountsManager.getClass();
                    return new RealFamilyAppletConfigProvider(syncValueReader5, realFeatureEligibilityRepository, realStatusAndLimitsManager, realFamilyAccountsManager);
                case 28:
                    RealFavoritesRepository realFavoritesRepository = (RealFavoritesRepository) provider4.invoke();
                    RealRecipientRepository realRecipientRepository = (RealRecipientRepository) provider3.invoke();
                    RealNetworkInfo realNetworkInfo2 = (RealNetworkInfo) provider2.invoke();
                    Analytics analytics3 = (Analytics) provider.invoke();
                    realFavoritesRepository.getClass();
                    realRecipientRepository.getClass();
                    realNetworkInfo2.getClass();
                    analytics3.getClass();
                    return new RealFavoritesManager(realFavoritesRepository, realRecipientRepository, realNetworkInfo2, analytics3);
                default:
                    PaymentManager paymentManager = (PaymentManager) provider4.invoke();
                    FeatureFlagManager featureFlagManager19 = (FeatureFlagManager) provider3.invoke();
                    RealAppMessageRepositoryWriter realAppMessageRepositoryWriter = (RealAppMessageRepositoryWriter) provider2.invoke();
                    AppMessageClientService appMessageClientService = (AppMessageClientService) provider.invoke();
                    paymentManager.getClass();
                    featureFlagManager19.getClass();
                    realAppMessageRepositoryWriter.getClass();
                    appMessageClientService.getClass();
                    return new FavoriteUpsellRefresher(paymentManager, featureFlagManager19, realAppMessageRepositoryWriter, appMessageClientService);
            }
        }
    }

    public LocalViewFactory(WebViewProvider webViewProvider, AndroidDownloadManager$Factory$Impl androidDownloadManager$Factory$Impl, String str, String str2, String str3, RealImageLoader realImageLoader) {
        this.$r8$classId = 7;
        this.addressSearcher = webViewProvider;
        this.mapEngineProvider = androidDownloadManager$Factory$Impl;
        this.imageLoader = realImageLoader;
        this.featureFlagManager = str + " CashAppStaff/" + str2 + " " + str3 + " NativeView";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04c3  */
    /* JADX WARN: Type inference failed for: r0v39, types: [com.squareup.cash.history.views.LegacyReportAbuseView] */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41, types: [com.squareup.cash.history.views.ReportAbuseView] */
    /* JADX WARN: Type inference failed for: r1v54, types: [com.squareup.cash.treehouse.android.platform.CashTreehouseLayout] */
    /* JADX WARN: Type inference failed for: r1v65, types: [com.squareup.cash.history.views.CheckPaymentStatusDialog] */
    /* JADX WARN: Type inference failed for: r2v30, types: [com.squareup.cash.history.views.PaymentPasscodeDialogView] */
    @Override // app.cash.broadway.ui.UiFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final UiFactory.ScreenUi createUi(Screen screen, Context context, ViewGroup viewGroup) {
        ComposeUiView reportAbuseView;
        Ui ui;
        ComposeUiView composeUiView;
        ComposeUiView addMoneyView;
        ComposeUiView withdrawView;
        int i = this.$r8$classId;
        RealImageLoader realImageLoader = this.imageLoader;
        final int i2 = 6;
        final int i3 = 5;
        Object obj = this.addressSearcher;
        Object obj2 = this.mapEngineProvider;
        Object obj3 = this.featureFlagManager;
        final int i4 = 4;
        final int i5 = 3;
        final int i6 = 0;
        final int i7 = 2;
        final int i8 = 1;
        switch (i) {
            case 0:
                context.getClass();
                if (!(screen instanceof LocalScreen)) {
                    return null;
                }
                LocalScreen localScreen = (LocalScreen) screen;
                if (localScreen instanceof LocalBrandProfileScreen) {
                    return provideLocalComposeUi(ComposableSingletons$LocalViewFactoryKt.lambda$618962239);
                }
                if (localScreen instanceof LocalEditorialScreen) {
                    return provideLocalComposeUi(ComposableSingletons$LocalViewFactoryKt.f22lambda$404122821);
                }
                if (localScreen instanceof LocalBrandLocationCartScreen) {
                    return provideLocalComposeUi(ComposableSingletons$LocalViewFactoryKt.f17lambda$1577703087);
                }
                if (localScreen instanceof LocalBrandLocationOpenTabScreen) {
                    return provideLocalComposeUi(ComposableSingletons$LocalViewFactoryKt.lambda$275242565);
                }
                if (localScreen instanceof LocalBrandLocationCheckoutScreen) {
                    return provideLocalComposeUi(ComposableSingletons$LocalViewFactoryKt.f21lambda$313788935);
                }
                if (localScreen instanceof LocalBrandLocationOpenTabCheckoutScreen) {
                    return provideLocalComposeUi(ComposableSingletons$LocalViewFactoryKt.lambda$260662217);
                }
                if (localScreen instanceof LocalBrandLocationMenuScreen) {
                    return provideLocalComposeUi(ComposableSingletons$LocalViewFactoryKt.lambda$1534089620);
                }
                if (localScreen instanceof LocalMenuItemDetailsScreen) {
                    return provideLocalComposeUi(ComposableSingletons$LocalViewFactoryKt.f20lambda$222006);
                }
                if (localScreen instanceof LocalMenuComboDetailsScreen) {
                    return provideLocalComposeUi(ComposableSingletons$LocalViewFactoryKt.lambda$1344804206);
                }
                if (localScreen instanceof LocalPosBrandOnboardingScreen) {
                    return provideLocalComposeUi(ComposableSingletons$LocalViewFactoryKt.f18lambda$1797216790);
                }
                if (localScreen instanceof LocalNeighborhoodsMapScreen) {
                    return provideLocalComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: app.cash.local.views.LocalViewFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ LocalViewFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                            int i9 = i6;
                            LocalViewFactory localViewFactory = this.f$0;
                            switch (i9) {
                                case 0:
                                    BrandCollectionMapViewModel brandCollectionMapViewModel = (BrandCollectionMapViewModel) obj4;
                                    Function1 function1 = (Function1) obj5;
                                    Composer composer = (Composer) obj6;
                                    int intValue = ((Integer) obj7).intValue();
                                    brandCollectionMapViewModel.getClass();
                                    function1.getClass();
                                    LocalComposeUiKt.LocalComposeUi(brandCollectionMapViewModel, true, false, false, Expect_jvmKt.rememberComposableLambda(224188275, new LocalViewFactory$$ExternalSyntheticLambda6(0, localViewFactory, brandCollectionMapViewModel, function1), composer), composer, (intValue & 14) | 25008, 8);
                                    break;
                                case 1:
                                    FulfillmentPickerViewModel fulfillmentPickerViewModel = (FulfillmentPickerViewModel) obj4;
                                    Function1 function12 = (Function1) obj5;
                                    Composer composer2 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    fulfillmentPickerViewModel.getClass();
                                    function12.getClass();
                                    Updater.CompositionLocalProvider(AddressTypeaheadKt.getLocalAddressSearcher().defaultProvidedValue$runtime((PlacesAddressSearcher) localViewFactory.addressSearcher), Expect_jvmKt.rememberComposableLambda(1269098728, new LocalViewFactory$$ExternalSyntheticLambda5(fulfillmentPickerViewModel, function12), composer2), composer2, 56);
                                    break;
                                default:
                                    LocalHomeViewModel localHomeViewModel = (LocalHomeViewModel) obj4;
                                    Function1 function13 = (Function1) obj5;
                                    ((Integer) obj7).getClass();
                                    localHomeViewModel.getClass();
                                    function13.getClass();
                                    GapComposer gapComposer = (GapComposer) ((Composer) obj6);
                                    Object rememberedValue = gapComposer.rememberedValue();
                                    if (rememberedValue == Composer.Companion.Empty) {
                                        rememberedValue = Trace.valuesState((FeatureFlagManager) localViewFactory.featureFlagManager, AmplitudeExperiments$MoneybotTopControlsTransition.INSTANCE);
                                        gapComposer.updateRememberedValue(rememberedValue);
                                    }
                                    Updater.CompositionLocalProvider(MapEngineProviderKt.getLocalMapEngineProvider().defaultProvidedValue$runtime((GoogleMapEngineProvider) localViewFactory.mapEngineProvider), Expect_jvmKt.rememberComposableLambda(2035461537, new MenuKt$$ExternalSyntheticLambda1(14, localHomeViewModel, function13, Updater.collectAsState((StateFlow) rememberedValue, null, gapComposer, 1)), gapComposer), gapComposer, 56);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, 289611934));
                }
                if (localScreen instanceof TableQrCodeScannerScreen) {
                    return provideLocalComposeUi(ComposableSingletons$LocalViewFactoryKt.lambda$803267732);
                }
                if (localScreen instanceof LocalPosCheckInScreen) {
                    return provideLocalComposeUi(ComposableSingletons$LocalViewFactoryKt.lambda$1780162441);
                }
                if (localScreen instanceof LocalPosLocalCashRedemptionScreen) {
                    return provideLocalComposeUi(ComposableSingletons$LocalViewFactoryKt.lambda$853308046);
                }
                if (localScreen instanceof LocalOrderStatusScreen) {
                    return provideLocalComposeUi(ComposableSingletons$LocalViewFactoryKt.lambda$29679044);
                }
                boolean z = localScreen instanceof LocalCheckoutDeeplinkScreen;
                if (z) {
                    return provideLocalComposeUi(ComposableSingletons$LocalViewFactoryKt.f16lambda$1418327803);
                }
                if (localScreen instanceof LocalExplanatoryDialog) {
                    LocalExplanatoryDialogView localExplanatoryDialogView = new LocalExplanatoryDialogView(context);
                    return new UiFactory.ViewUi(localExplanatoryDialogView, localExplanatoryDialogView);
                }
                if (localScreen instanceof LocalEducationalSheet) {
                    return provideLocalComposeUi(ComposableSingletons$LocalViewFactoryKt.f24lambda$931397967);
                }
                if (localScreen instanceof LocalShortlinkSheet) {
                    return provideLocalComposeUi(ComposableSingletons$LocalViewFactoryKt.lambda$1915562482);
                }
                if (localScreen instanceof LocalFulfillmentPickerScreen) {
                    return provideLocalComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: app.cash.local.views.LocalViewFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ LocalViewFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                            int i9 = i8;
                            LocalViewFactory localViewFactory = this.f$0;
                            switch (i9) {
                                case 0:
                                    BrandCollectionMapViewModel brandCollectionMapViewModel = (BrandCollectionMapViewModel) obj4;
                                    Function1 function1 = (Function1) obj5;
                                    Composer composer = (Composer) obj6;
                                    int intValue = ((Integer) obj7).intValue();
                                    brandCollectionMapViewModel.getClass();
                                    function1.getClass();
                                    LocalComposeUiKt.LocalComposeUi(brandCollectionMapViewModel, true, false, false, Expect_jvmKt.rememberComposableLambda(224188275, new LocalViewFactory$$ExternalSyntheticLambda6(0, localViewFactory, brandCollectionMapViewModel, function1), composer), composer, (intValue & 14) | 25008, 8);
                                    break;
                                case 1:
                                    FulfillmentPickerViewModel fulfillmentPickerViewModel = (FulfillmentPickerViewModel) obj4;
                                    Function1 function12 = (Function1) obj5;
                                    Composer composer2 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    fulfillmentPickerViewModel.getClass();
                                    function12.getClass();
                                    Updater.CompositionLocalProvider(AddressTypeaheadKt.getLocalAddressSearcher().defaultProvidedValue$runtime((PlacesAddressSearcher) localViewFactory.addressSearcher), Expect_jvmKt.rememberComposableLambda(1269098728, new LocalViewFactory$$ExternalSyntheticLambda5(fulfillmentPickerViewModel, function12), composer2), composer2, 56);
                                    break;
                                default:
                                    LocalHomeViewModel localHomeViewModel = (LocalHomeViewModel) obj4;
                                    Function1 function13 = (Function1) obj5;
                                    ((Integer) obj7).getClass();
                                    localHomeViewModel.getClass();
                                    function13.getClass();
                                    GapComposer gapComposer = (GapComposer) ((Composer) obj6);
                                    Object rememberedValue = gapComposer.rememberedValue();
                                    if (rememberedValue == Composer.Companion.Empty) {
                                        rememberedValue = Trace.valuesState((FeatureFlagManager) localViewFactory.featureFlagManager, AmplitudeExperiments$MoneybotTopControlsTransition.INSTANCE);
                                        gapComposer.updateRememberedValue(rememberedValue);
                                    }
                                    Updater.CompositionLocalProvider(MapEngineProviderKt.getLocalMapEngineProvider().defaultProvidedValue$runtime((GoogleMapEngineProvider) localViewFactory.mapEngineProvider), Expect_jvmKt.rememberComposableLambda(2035461537, new MenuKt$$ExternalSyntheticLambda1(14, localHomeViewModel, function13, Updater.collectAsState((StateFlow) rememberedValue, null, gapComposer, 1)), gapComposer), gapComposer, 56);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, 603768232));
                }
                if (localScreen instanceof LocalLoyaltySheet) {
                    return provideLocalComposeUi(ComposableSingletons$LocalViewFactoryKt.lambda$565711360);
                }
                if (localScreen instanceof LocalTabScreen) {
                    return provideLocalComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: app.cash.local.views.LocalViewFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ LocalViewFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                            int i9 = i7;
                            LocalViewFactory localViewFactory = this.f$0;
                            switch (i9) {
                                case 0:
                                    BrandCollectionMapViewModel brandCollectionMapViewModel = (BrandCollectionMapViewModel) obj4;
                                    Function1 function1 = (Function1) obj5;
                                    Composer composer = (Composer) obj6;
                                    int intValue = ((Integer) obj7).intValue();
                                    brandCollectionMapViewModel.getClass();
                                    function1.getClass();
                                    LocalComposeUiKt.LocalComposeUi(brandCollectionMapViewModel, true, false, false, Expect_jvmKt.rememberComposableLambda(224188275, new LocalViewFactory$$ExternalSyntheticLambda6(0, localViewFactory, brandCollectionMapViewModel, function1), composer), composer, (intValue & 14) | 25008, 8);
                                    break;
                                case 1:
                                    FulfillmentPickerViewModel fulfillmentPickerViewModel = (FulfillmentPickerViewModel) obj4;
                                    Function1 function12 = (Function1) obj5;
                                    Composer composer2 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    fulfillmentPickerViewModel.getClass();
                                    function12.getClass();
                                    Updater.CompositionLocalProvider(AddressTypeaheadKt.getLocalAddressSearcher().defaultProvidedValue$runtime((PlacesAddressSearcher) localViewFactory.addressSearcher), Expect_jvmKt.rememberComposableLambda(1269098728, new LocalViewFactory$$ExternalSyntheticLambda5(fulfillmentPickerViewModel, function12), composer2), composer2, 56);
                                    break;
                                default:
                                    LocalHomeViewModel localHomeViewModel = (LocalHomeViewModel) obj4;
                                    Function1 function13 = (Function1) obj5;
                                    ((Integer) obj7).getClass();
                                    localHomeViewModel.getClass();
                                    function13.getClass();
                                    GapComposer gapComposer = (GapComposer) ((Composer) obj6);
                                    Object rememberedValue = gapComposer.rememberedValue();
                                    if (rememberedValue == Composer.Companion.Empty) {
                                        rememberedValue = Trace.valuesState((FeatureFlagManager) localViewFactory.featureFlagManager, AmplitudeExperiments$MoneybotTopControlsTransition.INSTANCE);
                                        gapComposer.updateRememberedValue(rememberedValue);
                                    }
                                    Updater.CompositionLocalProvider(MapEngineProviderKt.getLocalMapEngineProvider().defaultProvidedValue$runtime((GoogleMapEngineProvider) localViewFactory.mapEngineProvider), Expect_jvmKt.rememberComposableLambda(2035461537, new MenuKt$$ExternalSyntheticLambda1(14, localHomeViewModel, function13, Updater.collectAsState((StateFlow) rememberedValue, null, gapComposer, 1)), gapComposer), gapComposer, 56);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, -894219679));
                }
                if (localScreen instanceof LocalCashBalanceScreen) {
                    return provideLocalComposeUi(ComposableSingletons$LocalViewFactoryKt.lambda$2022224632);
                }
                if (localScreen instanceof LocalCashAllActivityScreen) {
                    return provideLocalComposeUi(ComposableSingletons$LocalViewFactoryKt.lambda$767043141);
                }
                if (localScreen instanceof LocalAddBrandsScreen) {
                    return provideLocalComposeUi(ComposableSingletons$LocalViewFactoryKt.f25lambda$994542506);
                }
                if (localScreen instanceof LocalSchedulingDayTimePickerScreen) {
                    return provideLocalComposeUi(ComposableSingletons$LocalViewFactoryKt.f19lambda$2217492);
                }
                if (localScreen instanceof LocalOrdersScreen) {
                    return provideLocalComposeUi(ComposableSingletons$LocalViewFactoryKt.f23lambda$820816032);
                }
                if (localScreen instanceof LocalMarketingMessageScreen) {
                    return provideLocalComposeUi(ComposableSingletons$LocalViewFactoryKt.lambda$2037234522);
                }
                if (localScreen instanceof LocalMarketingMessagesScreen) {
                    return provideLocalComposeUi(ComposableSingletons$LocalViewFactoryKt.lambda$308673664);
                }
                if (localScreen instanceof LocalMenuPickerScreen) {
                    return provideLocalComposeUi(ComposableSingletons$LocalViewFactoryKt.lambda$1432581542);
                }
                if (localScreen instanceof LocalCurbsidePickupCarScreen) {
                    return provideLocalComposeUi(ComposableSingletons$LocalViewFactoryKt.f15lambda$1056284086);
                }
                if (z) {
                    throw new NotImplementedError(null, 1, null);
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 1:
                context.getClass();
                if (screen instanceof ActivityScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.activity.views.ActivityUiFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ LocalViewFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                            int i9 = i6;
                            LocalViewFactory localViewFactory = this.f$0;
                            switch (i9) {
                                case 0:
                                    ActivityTabViewModel activityTabViewModel = (ActivityTabViewModel) obj4;
                                    Function1 function1 = (Function1) obj5;
                                    int intValue = ((Integer) obj7).intValue();
                                    activityTabViewModel.getClass();
                                    function1.getClass();
                                    GapComposer gapComposer = (GapComposer) ((Composer) obj6);
                                    Object rememberedValue = gapComposer.rememberedValue();
                                    if (rememberedValue == Composer.Companion.Empty) {
                                        rememberedValue = Trace.valuesState((FeatureFlagManager) localViewFactory.featureFlagManager, AmplitudeExperiments$MoneybotTopControlsTransition.INSTANCE);
                                        gapComposer.updateRememberedValue(rememberedValue);
                                    }
                                    ActivityTabViewKt.ActivityTab(activityTabViewModel, function1, (RealCashVibrator) localViewFactory.addressSearcher, localViewFactory.imageLoader, (RealScrollPerformanceTrackerFactory) localViewFactory.mapEngineProvider, ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) Updater.collectAsState((StateFlow) rememberedValue, null, gapComposer, 1).getValue()).enabled(), gapComposer, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 0);
                                    break;
                                case 1:
                                    BalanceFeedViewModel balanceFeedViewModel = (BalanceFeedViewModel) obj4;
                                    Function1 function12 = (Function1) obj5;
                                    int intValue2 = ((Integer) obj7).intValue();
                                    balanceFeedViewModel.getClass();
                                    function12.getClass();
                                    AvatarsKt.BalanceFeed(localViewFactory.imageLoader, balanceFeedViewModel, function12, (Composer) obj6, (intValue2 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    break;
                                default:
                                    ReceiptViewModel receiptViewModel = (ReceiptViewModel) obj4;
                                    Function1 function13 = (Function1) obj5;
                                    int intValue3 = ((Integer) obj7).intValue();
                                    receiptViewModel.getClass();
                                    function13.getClass();
                                    ReceiptUiKt.ReceiptUi(localViewFactory.imageLoader, (RealCashVibrator) localViewFactory.addressSearcher, receiptViewModel, function13, (Composer) obj6, (intValue3 << 6) & 8064);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, 2124860520));
                }
                if (screen instanceof BalanceFeedScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.activity.views.ActivityUiFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ LocalViewFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                            int i9 = i8;
                            LocalViewFactory localViewFactory = this.f$0;
                            switch (i9) {
                                case 0:
                                    ActivityTabViewModel activityTabViewModel = (ActivityTabViewModel) obj4;
                                    Function1 function1 = (Function1) obj5;
                                    int intValue = ((Integer) obj7).intValue();
                                    activityTabViewModel.getClass();
                                    function1.getClass();
                                    GapComposer gapComposer = (GapComposer) ((Composer) obj6);
                                    Object rememberedValue = gapComposer.rememberedValue();
                                    if (rememberedValue == Composer.Companion.Empty) {
                                        rememberedValue = Trace.valuesState((FeatureFlagManager) localViewFactory.featureFlagManager, AmplitudeExperiments$MoneybotTopControlsTransition.INSTANCE);
                                        gapComposer.updateRememberedValue(rememberedValue);
                                    }
                                    ActivityTabViewKt.ActivityTab(activityTabViewModel, function1, (RealCashVibrator) localViewFactory.addressSearcher, localViewFactory.imageLoader, (RealScrollPerformanceTrackerFactory) localViewFactory.mapEngineProvider, ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) Updater.collectAsState((StateFlow) rememberedValue, null, gapComposer, 1).getValue()).enabled(), gapComposer, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 0);
                                    break;
                                case 1:
                                    BalanceFeedViewModel balanceFeedViewModel = (BalanceFeedViewModel) obj4;
                                    Function1 function12 = (Function1) obj5;
                                    int intValue2 = ((Integer) obj7).intValue();
                                    balanceFeedViewModel.getClass();
                                    function12.getClass();
                                    AvatarsKt.BalanceFeed(localViewFactory.imageLoader, balanceFeedViewModel, function12, (Composer) obj6, (intValue2 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    break;
                                default:
                                    ReceiptViewModel receiptViewModel = (ReceiptViewModel) obj4;
                                    Function1 function13 = (Function1) obj5;
                                    int intValue3 = ((Integer) obj7).intValue();
                                    receiptViewModel.getClass();
                                    function13.getClass();
                                    ReceiptUiKt.ReceiptUi(localViewFactory.imageLoader, (RealCashVibrator) localViewFactory.addressSearcher, receiptViewModel, function13, (Composer) obj6, (intValue3 << 6) & 8064);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, 754277));
                }
                if (!(screen instanceof HistoryScreens.PaymentReceipt)) {
                    return null;
                }
                if (((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) obj3)).peekCurrentValue(LaunchDarklyFeatureFlags$NativeEnrichedReceipts.INSTANCE)).enabled()) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.activity.views.ActivityUiFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ LocalViewFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                            int i9 = i7;
                            LocalViewFactory localViewFactory = this.f$0;
                            switch (i9) {
                                case 0:
                                    ActivityTabViewModel activityTabViewModel = (ActivityTabViewModel) obj4;
                                    Function1 function1 = (Function1) obj5;
                                    int intValue = ((Integer) obj7).intValue();
                                    activityTabViewModel.getClass();
                                    function1.getClass();
                                    GapComposer gapComposer = (GapComposer) ((Composer) obj6);
                                    Object rememberedValue = gapComposer.rememberedValue();
                                    if (rememberedValue == Composer.Companion.Empty) {
                                        rememberedValue = Trace.valuesState((FeatureFlagManager) localViewFactory.featureFlagManager, AmplitudeExperiments$MoneybotTopControlsTransition.INSTANCE);
                                        gapComposer.updateRememberedValue(rememberedValue);
                                    }
                                    ActivityTabViewKt.ActivityTab(activityTabViewModel, function1, (RealCashVibrator) localViewFactory.addressSearcher, localViewFactory.imageLoader, (RealScrollPerformanceTrackerFactory) localViewFactory.mapEngineProvider, ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) Updater.collectAsState((StateFlow) rememberedValue, null, gapComposer, 1).getValue()).enabled(), gapComposer, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 0);
                                    break;
                                case 1:
                                    BalanceFeedViewModel balanceFeedViewModel = (BalanceFeedViewModel) obj4;
                                    Function1 function12 = (Function1) obj5;
                                    int intValue2 = ((Integer) obj7).intValue();
                                    balanceFeedViewModel.getClass();
                                    function12.getClass();
                                    AvatarsKt.BalanceFeed(localViewFactory.imageLoader, balanceFeedViewModel, function12, (Composer) obj6, (intValue2 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    break;
                                default:
                                    ReceiptViewModel receiptViewModel = (ReceiptViewModel) obj4;
                                    Function1 function13 = (Function1) obj5;
                                    int intValue3 = ((Integer) obj7).intValue();
                                    receiptViewModel.getClass();
                                    function13.getClass();
                                    ReceiptUiKt.ReceiptUi(localViewFactory.imageLoader, (RealCashVibrator) localViewFactory.addressSearcher, receiptViewModel, function13, (Composer) obj6, (intValue3 << 6) & 8064);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, 1223416701));
                }
                return null;
            case 2:
                context.getClass();
                if (screen instanceof SwipeToLoadOnboardingScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.deposits.physical.view.PhysicalDepositViewFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ LocalViewFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                            int i9 = i6;
                            LocalViewFactory localViewFactory = this.f$0;
                            switch (i9) {
                                case 0:
                                    FormViewModel formViewModel = (FormViewModel) obj4;
                                    Function1 function1 = (Function1) obj5;
                                    int intValue = ((Integer) obj7).intValue();
                                    formViewModel.getClass();
                                    function1.getClass();
                                    GapComposer gapComposer = (GapComposer) ((Composer) obj6);
                                    boolean changedInstance = gapComposer.changedInstance(localViewFactory) | gapComposer.changedInstance(formViewModel) | ((((intValue & 112) ^ 48) > 32 && gapComposer.changed(function1)) || (intValue & 48) == 32);
                                    Object rememberedValue = gapComposer.rememberedValue();
                                    if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                                        rememberedValue = new GpsConfigQueries$$ExternalSyntheticLambda3(2, localViewFactory, formViewModel, function1);
                                        gapComposer.updateRememberedValue(rememberedValue);
                                    }
                                    AndroidView_androidKt.AndroidView((Function1) rememberedValue, null, null, gapComposer, 0, 6);
                                    break;
                                case 1:
                                    PaperMoneyDepositOnboardingViewModel paperMoneyDepositOnboardingViewModel = (PaperMoneyDepositOnboardingViewModel) obj4;
                                    Function1 function12 = (Function1) obj5;
                                    Composer composer = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    paperMoneyDepositOnboardingViewModel.getClass();
                                    function12.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-545554177, new PhysicalDepositViewFactory$$ExternalSyntheticLambda8(paperMoneyDepositOnboardingViewModel, function12), composer), composer, 56);
                                    break;
                                case 2:
                                    PaperMoneyDepositBarcodeViewModel paperMoneyDepositBarcodeViewModel = (PaperMoneyDepositBarcodeViewModel) obj4;
                                    Function1 function13 = (Function1) obj5;
                                    Composer composer2 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    paperMoneyDepositBarcodeViewModel.getClass();
                                    function13.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-6945841, new PhysicalDepositViewFactory$$ExternalSyntheticLambda9(paperMoneyDepositBarcodeViewModel, function13, 0), composer2), composer2, 56);
                                    break;
                                case 3:
                                    PaperMoneyDepositMapViewModel paperMoneyDepositMapViewModel = (PaperMoneyDepositMapViewModel) obj4;
                                    Function1 function14 = (Function1) obj5;
                                    Composer composer3 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    paperMoneyDepositMapViewModel.getClass();
                                    function14.getClass();
                                    Updater.CompositionLocalProvider(new ProvidedValue[]{LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), MapEngineProviderKt.getLocalMapEngineProvider().defaultProvidedValue$runtime((GoogleMapEngineProvider) localViewFactory.mapEngineProvider)}, Expect_jvmKt.rememberComposableLambda(663228106, new PhysicalDepositViewFactory$$ExternalSyntheticLambda7(paperMoneyDepositMapViewModel, function14), composer3), composer3, 56);
                                    break;
                                default:
                                    AtmWithdrawalMapViewModel atmWithdrawalMapViewModel = (AtmWithdrawalMapViewModel) obj4;
                                    Function1 function15 = (Function1) obj5;
                                    Composer composer4 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    atmWithdrawalMapViewModel.getClass();
                                    function15.getClass();
                                    Updater.CompositionLocalProvider(new ProvidedValue[]{LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), MapEngineProviderKt.getLocalMapEngineProvider().defaultProvidedValue$runtime((GoogleMapEngineProvider) localViewFactory.mapEngineProvider)}, Expect_jvmKt.rememberComposableLambda(-585758528, new PhysicalDepositViewFactory$$ExternalSyntheticLambda6(atmWithdrawalMapViewModel, function15), composer4), composer4, 56);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, -1190155021));
                }
                if (screen instanceof PaperMoneyDepositOnboardingScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.deposits.physical.view.PhysicalDepositViewFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ LocalViewFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                            int i9 = i8;
                            LocalViewFactory localViewFactory = this.f$0;
                            switch (i9) {
                                case 0:
                                    FormViewModel formViewModel = (FormViewModel) obj4;
                                    Function1 function1 = (Function1) obj5;
                                    int intValue = ((Integer) obj7).intValue();
                                    formViewModel.getClass();
                                    function1.getClass();
                                    GapComposer gapComposer = (GapComposer) ((Composer) obj6);
                                    boolean changedInstance = gapComposer.changedInstance(localViewFactory) | gapComposer.changedInstance(formViewModel) | ((((intValue & 112) ^ 48) > 32 && gapComposer.changed(function1)) || (intValue & 48) == 32);
                                    Object rememberedValue = gapComposer.rememberedValue();
                                    if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                                        rememberedValue = new GpsConfigQueries$$ExternalSyntheticLambda3(2, localViewFactory, formViewModel, function1);
                                        gapComposer.updateRememberedValue(rememberedValue);
                                    }
                                    AndroidView_androidKt.AndroidView((Function1) rememberedValue, null, null, gapComposer, 0, 6);
                                    break;
                                case 1:
                                    PaperMoneyDepositOnboardingViewModel paperMoneyDepositOnboardingViewModel = (PaperMoneyDepositOnboardingViewModel) obj4;
                                    Function1 function12 = (Function1) obj5;
                                    Composer composer = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    paperMoneyDepositOnboardingViewModel.getClass();
                                    function12.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-545554177, new PhysicalDepositViewFactory$$ExternalSyntheticLambda8(paperMoneyDepositOnboardingViewModel, function12), composer), composer, 56);
                                    break;
                                case 2:
                                    PaperMoneyDepositBarcodeViewModel paperMoneyDepositBarcodeViewModel = (PaperMoneyDepositBarcodeViewModel) obj4;
                                    Function1 function13 = (Function1) obj5;
                                    Composer composer2 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    paperMoneyDepositBarcodeViewModel.getClass();
                                    function13.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-6945841, new PhysicalDepositViewFactory$$ExternalSyntheticLambda9(paperMoneyDepositBarcodeViewModel, function13, 0), composer2), composer2, 56);
                                    break;
                                case 3:
                                    PaperMoneyDepositMapViewModel paperMoneyDepositMapViewModel = (PaperMoneyDepositMapViewModel) obj4;
                                    Function1 function14 = (Function1) obj5;
                                    Composer composer3 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    paperMoneyDepositMapViewModel.getClass();
                                    function14.getClass();
                                    Updater.CompositionLocalProvider(new ProvidedValue[]{LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), MapEngineProviderKt.getLocalMapEngineProvider().defaultProvidedValue$runtime((GoogleMapEngineProvider) localViewFactory.mapEngineProvider)}, Expect_jvmKt.rememberComposableLambda(663228106, new PhysicalDepositViewFactory$$ExternalSyntheticLambda7(paperMoneyDepositMapViewModel, function14), composer3), composer3, 56);
                                    break;
                                default:
                                    AtmWithdrawalMapViewModel atmWithdrawalMapViewModel = (AtmWithdrawalMapViewModel) obj4;
                                    Function1 function15 = (Function1) obj5;
                                    Composer composer4 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    atmWithdrawalMapViewModel.getClass();
                                    function15.getClass();
                                    Updater.CompositionLocalProvider(new ProvidedValue[]{LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), MapEngineProviderKt.getLocalMapEngineProvider().defaultProvidedValue$runtime((GoogleMapEngineProvider) localViewFactory.mapEngineProvider)}, Expect_jvmKt.rememberComposableLambda(-585758528, new PhysicalDepositViewFactory$$ExternalSyntheticLambda6(atmWithdrawalMapViewModel, function15), composer4), composer4, 56);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, 1465388095));
                }
                if (screen instanceof PaperMoneyDepositBarcodeScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.deposits.physical.view.PhysicalDepositViewFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ LocalViewFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                            int i9 = i7;
                            LocalViewFactory localViewFactory = this.f$0;
                            switch (i9) {
                                case 0:
                                    FormViewModel formViewModel = (FormViewModel) obj4;
                                    Function1 function1 = (Function1) obj5;
                                    int intValue = ((Integer) obj7).intValue();
                                    formViewModel.getClass();
                                    function1.getClass();
                                    GapComposer gapComposer = (GapComposer) ((Composer) obj6);
                                    boolean changedInstance = gapComposer.changedInstance(localViewFactory) | gapComposer.changedInstance(formViewModel) | ((((intValue & 112) ^ 48) > 32 && gapComposer.changed(function1)) || (intValue & 48) == 32);
                                    Object rememberedValue = gapComposer.rememberedValue();
                                    if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                                        rememberedValue = new GpsConfigQueries$$ExternalSyntheticLambda3(2, localViewFactory, formViewModel, function1);
                                        gapComposer.updateRememberedValue(rememberedValue);
                                    }
                                    AndroidView_androidKt.AndroidView((Function1) rememberedValue, null, null, gapComposer, 0, 6);
                                    break;
                                case 1:
                                    PaperMoneyDepositOnboardingViewModel paperMoneyDepositOnboardingViewModel = (PaperMoneyDepositOnboardingViewModel) obj4;
                                    Function1 function12 = (Function1) obj5;
                                    Composer composer = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    paperMoneyDepositOnboardingViewModel.getClass();
                                    function12.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-545554177, new PhysicalDepositViewFactory$$ExternalSyntheticLambda8(paperMoneyDepositOnboardingViewModel, function12), composer), composer, 56);
                                    break;
                                case 2:
                                    PaperMoneyDepositBarcodeViewModel paperMoneyDepositBarcodeViewModel = (PaperMoneyDepositBarcodeViewModel) obj4;
                                    Function1 function13 = (Function1) obj5;
                                    Composer composer2 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    paperMoneyDepositBarcodeViewModel.getClass();
                                    function13.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-6945841, new PhysicalDepositViewFactory$$ExternalSyntheticLambda9(paperMoneyDepositBarcodeViewModel, function13, 0), composer2), composer2, 56);
                                    break;
                                case 3:
                                    PaperMoneyDepositMapViewModel paperMoneyDepositMapViewModel = (PaperMoneyDepositMapViewModel) obj4;
                                    Function1 function14 = (Function1) obj5;
                                    Composer composer3 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    paperMoneyDepositMapViewModel.getClass();
                                    function14.getClass();
                                    Updater.CompositionLocalProvider(new ProvidedValue[]{LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), MapEngineProviderKt.getLocalMapEngineProvider().defaultProvidedValue$runtime((GoogleMapEngineProvider) localViewFactory.mapEngineProvider)}, Expect_jvmKt.rememberComposableLambda(663228106, new PhysicalDepositViewFactory$$ExternalSyntheticLambda7(paperMoneyDepositMapViewModel, function14), composer3), composer3, 56);
                                    break;
                                default:
                                    AtmWithdrawalMapViewModel atmWithdrawalMapViewModel = (AtmWithdrawalMapViewModel) obj4;
                                    Function1 function15 = (Function1) obj5;
                                    Composer composer4 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    atmWithdrawalMapViewModel.getClass();
                                    function15.getClass();
                                    Updater.CompositionLocalProvider(new ProvidedValue[]{LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), MapEngineProviderKt.getLocalMapEngineProvider().defaultProvidedValue$runtime((GoogleMapEngineProvider) localViewFactory.mapEngineProvider)}, Expect_jvmKt.rememberComposableLambda(-585758528, new PhysicalDepositViewFactory$$ExternalSyntheticLambda6(atmWithdrawalMapViewModel, function15), composer4), composer4, 56);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, -1604644721));
                }
                if (screen instanceof PaperMoneyDepositMapScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.deposits.physical.view.PhysicalDepositViewFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ LocalViewFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                            int i9 = i5;
                            LocalViewFactory localViewFactory = this.f$0;
                            switch (i9) {
                                case 0:
                                    FormViewModel formViewModel = (FormViewModel) obj4;
                                    Function1 function1 = (Function1) obj5;
                                    int intValue = ((Integer) obj7).intValue();
                                    formViewModel.getClass();
                                    function1.getClass();
                                    GapComposer gapComposer = (GapComposer) ((Composer) obj6);
                                    boolean changedInstance = gapComposer.changedInstance(localViewFactory) | gapComposer.changedInstance(formViewModel) | ((((intValue & 112) ^ 48) > 32 && gapComposer.changed(function1)) || (intValue & 48) == 32);
                                    Object rememberedValue = gapComposer.rememberedValue();
                                    if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                                        rememberedValue = new GpsConfigQueries$$ExternalSyntheticLambda3(2, localViewFactory, formViewModel, function1);
                                        gapComposer.updateRememberedValue(rememberedValue);
                                    }
                                    AndroidView_androidKt.AndroidView((Function1) rememberedValue, null, null, gapComposer, 0, 6);
                                    break;
                                case 1:
                                    PaperMoneyDepositOnboardingViewModel paperMoneyDepositOnboardingViewModel = (PaperMoneyDepositOnboardingViewModel) obj4;
                                    Function1 function12 = (Function1) obj5;
                                    Composer composer = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    paperMoneyDepositOnboardingViewModel.getClass();
                                    function12.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-545554177, new PhysicalDepositViewFactory$$ExternalSyntheticLambda8(paperMoneyDepositOnboardingViewModel, function12), composer), composer, 56);
                                    break;
                                case 2:
                                    PaperMoneyDepositBarcodeViewModel paperMoneyDepositBarcodeViewModel = (PaperMoneyDepositBarcodeViewModel) obj4;
                                    Function1 function13 = (Function1) obj5;
                                    Composer composer2 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    paperMoneyDepositBarcodeViewModel.getClass();
                                    function13.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-6945841, new PhysicalDepositViewFactory$$ExternalSyntheticLambda9(paperMoneyDepositBarcodeViewModel, function13, 0), composer2), composer2, 56);
                                    break;
                                case 3:
                                    PaperMoneyDepositMapViewModel paperMoneyDepositMapViewModel = (PaperMoneyDepositMapViewModel) obj4;
                                    Function1 function14 = (Function1) obj5;
                                    Composer composer3 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    paperMoneyDepositMapViewModel.getClass();
                                    function14.getClass();
                                    Updater.CompositionLocalProvider(new ProvidedValue[]{LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), MapEngineProviderKt.getLocalMapEngineProvider().defaultProvidedValue$runtime((GoogleMapEngineProvider) localViewFactory.mapEngineProvider)}, Expect_jvmKt.rememberComposableLambda(663228106, new PhysicalDepositViewFactory$$ExternalSyntheticLambda7(paperMoneyDepositMapViewModel, function14), composer3), composer3, 56);
                                    break;
                                default:
                                    AtmWithdrawalMapViewModel atmWithdrawalMapViewModel = (AtmWithdrawalMapViewModel) obj4;
                                    Function1 function15 = (Function1) obj5;
                                    Composer composer4 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    atmWithdrawalMapViewModel.getClass();
                                    function15.getClass();
                                    Updater.CompositionLocalProvider(new ProvidedValue[]{LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), MapEngineProviderKt.getLocalMapEngineProvider().defaultProvidedValue$runtime((GoogleMapEngineProvider) localViewFactory.mapEngineProvider)}, Expect_jvmKt.rememberComposableLambda(-585758528, new PhysicalDepositViewFactory$$ExternalSyntheticLambda6(atmWithdrawalMapViewModel, function15), composer4), composer4, 56);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, 1481735050));
                }
                if (screen instanceof PaperMoneyDepositBarcodeFailedScreen) {
                    PaperMoneyDepositExpiredBarcodeView paperMoneyDepositExpiredBarcodeView = new PaperMoneyDepositExpiredBarcodeView(context, (FormView$Factory$Impl) obj3);
                    return new UiFactory.ViewUi(paperMoneyDepositExpiredBarcodeView, paperMoneyDepositExpiredBarcodeView);
                }
                if ((screen instanceof PaperMoneyDepositMerchantDetailsScreen) || (screen instanceof AtmLocationDetailsScreen)) {
                    SquareLoyaltySheetView squareLoyaltySheetView = new SquareLoyaltySheetView(context, realImageLoader, 2);
                    return new UiFactory.ViewUi(squareLoyaltySheetView, squareLoyaltySheetView);
                }
                if (screen instanceof PhysicalCashDepositAddressEntryScreen) {
                    return new UiFactory.ComposeUi(ComposableSingletons$PhysicalDepositViewFactoryKt.lambda$551415364);
                }
                if (screen instanceof AtmWithdrawalExplainerScreen) {
                    return new UiFactory.ComposeUi(ComposableSingletons$PhysicalDepositViewFactoryKt.f365lambda$1397945378);
                }
                if (screen instanceof AtmRetailerMapScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.deposits.physical.view.PhysicalDepositViewFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ LocalViewFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                            int i9 = i4;
                            LocalViewFactory localViewFactory = this.f$0;
                            switch (i9) {
                                case 0:
                                    FormViewModel formViewModel = (FormViewModel) obj4;
                                    Function1 function1 = (Function1) obj5;
                                    int intValue = ((Integer) obj7).intValue();
                                    formViewModel.getClass();
                                    function1.getClass();
                                    GapComposer gapComposer = (GapComposer) ((Composer) obj6);
                                    boolean changedInstance = gapComposer.changedInstance(localViewFactory) | gapComposer.changedInstance(formViewModel) | ((((intValue & 112) ^ 48) > 32 && gapComposer.changed(function1)) || (intValue & 48) == 32);
                                    Object rememberedValue = gapComposer.rememberedValue();
                                    if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                                        rememberedValue = new GpsConfigQueries$$ExternalSyntheticLambda3(2, localViewFactory, formViewModel, function1);
                                        gapComposer.updateRememberedValue(rememberedValue);
                                    }
                                    AndroidView_androidKt.AndroidView((Function1) rememberedValue, null, null, gapComposer, 0, 6);
                                    break;
                                case 1:
                                    PaperMoneyDepositOnboardingViewModel paperMoneyDepositOnboardingViewModel = (PaperMoneyDepositOnboardingViewModel) obj4;
                                    Function1 function12 = (Function1) obj5;
                                    Composer composer = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    paperMoneyDepositOnboardingViewModel.getClass();
                                    function12.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-545554177, new PhysicalDepositViewFactory$$ExternalSyntheticLambda8(paperMoneyDepositOnboardingViewModel, function12), composer), composer, 56);
                                    break;
                                case 2:
                                    PaperMoneyDepositBarcodeViewModel paperMoneyDepositBarcodeViewModel = (PaperMoneyDepositBarcodeViewModel) obj4;
                                    Function1 function13 = (Function1) obj5;
                                    Composer composer2 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    paperMoneyDepositBarcodeViewModel.getClass();
                                    function13.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-6945841, new PhysicalDepositViewFactory$$ExternalSyntheticLambda9(paperMoneyDepositBarcodeViewModel, function13, 0), composer2), composer2, 56);
                                    break;
                                case 3:
                                    PaperMoneyDepositMapViewModel paperMoneyDepositMapViewModel = (PaperMoneyDepositMapViewModel) obj4;
                                    Function1 function14 = (Function1) obj5;
                                    Composer composer3 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    paperMoneyDepositMapViewModel.getClass();
                                    function14.getClass();
                                    Updater.CompositionLocalProvider(new ProvidedValue[]{LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), MapEngineProviderKt.getLocalMapEngineProvider().defaultProvidedValue$runtime((GoogleMapEngineProvider) localViewFactory.mapEngineProvider)}, Expect_jvmKt.rememberComposableLambda(663228106, new PhysicalDepositViewFactory$$ExternalSyntheticLambda7(paperMoneyDepositMapViewModel, function14), composer3), composer3, 56);
                                    break;
                                default:
                                    AtmWithdrawalMapViewModel atmWithdrawalMapViewModel = (AtmWithdrawalMapViewModel) obj4;
                                    Function1 function15 = (Function1) obj5;
                                    Composer composer4 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    atmWithdrawalMapViewModel.getClass();
                                    function15.getClass();
                                    Updater.CompositionLocalProvider(new ProvidedValue[]{LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), MapEngineProviderKt.getLocalMapEngineProvider().defaultProvidedValue$runtime((GoogleMapEngineProvider) localViewFactory.mapEngineProvider)}, Expect_jvmKt.rememberComposableLambda(-585758528, new PhysicalDepositViewFactory$$ExternalSyntheticLambda6(atmWithdrawalMapViewModel, function15), composer4), composer4, 56);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, 252958080));
                }
                if (screen instanceof LocationDeniedScreen) {
                    return new UiFactory.ComposeUi(ComposableSingletons$PhysicalDepositViewFactoryKt.f368lambda$223112956);
                }
                if (screen instanceof PhysicalDepositErrorScreen) {
                    return new UiFactory.ComposeUi(ComposableSingletons$PhysicalDepositViewFactoryKt.lambda$1653160914);
                }
                if (screen instanceof PhysicalCashLimitReachedScreen) {
                    return new UiFactory.ComposeUi(ComposableSingletons$PhysicalDepositViewFactoryKt.f367lambda$1770239208);
                }
                if (screen instanceof AtmPmdExplainerScreen) {
                    return new UiFactory.ComposeUi(ComposableSingletons$PhysicalDepositViewFactoryKt.f366lambda$1537968395);
                }
                return null;
            case 3:
                context.getClass();
                UiFactory.ComposeUi composeUi = screen instanceof HistoryScreens.InvestingPendingTransactionsScreen ? new UiFactory.ComposeUi(new ComposableLambdaImpl(new MoneyUiFactory$$ExternalSyntheticLambda0(this, 12), true, 1753751504)) : null;
                if (composeUi != null) {
                    return composeUi;
                }
                if (screen instanceof HistoryScreens.CancelPayment) {
                    reportAbuseView = new CancelPaymentView(new ContextThemeWrapper(context, R.style.Theme_Cash_Default_Accent));
                } else if (screen instanceof HistoryScreens.CheckPaymentStatus) {
                    reportAbuseView = new CheckPaymentStatusDialog(new ContextThemeWrapper(context, R.style.Theme_Cash_Default_Accent));
                } else if (screen instanceof HistoryScreens.Error) {
                    reportAbuseView = new ErrorView(new ContextThemeWrapper(context, R.style.Theme_Cash_Default_Accent));
                } else if (screen instanceof HistoryScreens.PaymentPasscodeDialog) {
                    ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.Theme_Cash_Default_Accent);
                    RealCashVibrator realCashVibrator = (RealCashVibrator) ((PaymentPasscodeDialogView$Factory$Impl) obj).delegateFactory.sandboxer.invoke();
                    realCashVibrator.getClass();
                    reportAbuseView = new PaymentPasscodeDialogView(realCashVibrator, contextThemeWrapper);
                } else if (screen instanceof HistoryScreens.PaymentReceiptDialogScreen) {
                    reportAbuseView = new PaymentReceiptDialogView(context);
                } else if (screen instanceof HistoryScreens.InvestingRoundUpsSkippedConfirmationScreen) {
                    reportAbuseView = new InvestingRoundUpsSkippedDialog(context);
                } else if (screen instanceof HistoryScreens.InvestingRoundUpsFailedConfirmationScreen) {
                    reportAbuseView = new InvestingRoundUpsFailedDialog(context);
                } else if (screen instanceof HistoryScreens.SkipPayment) {
                    reportAbuseView = new SkipPaymentView(context);
                } else {
                    if (screen instanceof HistoryScreens.PaymentReceipt) {
                        OnBackPressedDispatcherOwner onBackPressedDispatcherOwner = Trace.get(viewGroup);
                        onBackPressedDispatcherOwner.getClass();
                        OnBackPressedDispatcher onBackPressedDispatcher = onBackPressedDispatcherOwner.getOnBackPressedDispatcher();
                        onBackPressedDispatcher.getClass();
                        LoadTimeClock.MetroFactory metroFactory = ((TreehouseReceiptView$Factory$Impl) obj2).delegateFactory;
                        RealTreehouseActivity realTreehouseActivity = (RealTreehouseActivity) metroFactory.clock.invoke();
                        CashTreehouseLayout.Factory factory = (CashTreehouseLayout.Factory) metroFactory.observabilityManager.invoke();
                        realTreehouseActivity.getClass();
                        factory.getClass();
                        TreehouseReceiptView treehouseReceiptView = new TreehouseReceiptView(context, realTreehouseActivity, factory, onBackPressedDispatcher);
                        composeUiView = treehouseReceiptView.getTreehouseView();
                        ui = treehouseReceiptView;
                        if (ui == null) {
                            ui = composeUiView instanceof Ui ? composeUiView : null;
                        }
                        return new UiFactory.ViewUi(composeUiView, ui);
                    }
                    if (screen instanceof HistoryScreens.ReportAbuse) {
                        reportAbuseView = ((HistoryScreens.ReportAbuse) screen).isArcadeEnabled ? new ReportAbuseView(context) : new LegacyReportAbuseView(context);
                    } else if (screen instanceof HistoryScreens.ReportAbuseDialogScreen) {
                        reportAbuseView = new ReportAbuseDialogView(context);
                    } else if (screen instanceof HistoryScreens.RefundPayment) {
                        reportAbuseView = new RefundPaymentView(context);
                    } else {
                        if (!(screen instanceof HistoryScreens.CancelPendingSupPaymentScreen)) {
                            return null;
                        }
                        reportAbuseView = new CancelPendingSupPaymentBottomSheet(context);
                    }
                }
                ui = null;
                composeUiView = reportAbuseView;
                if (ui == null) {
                }
                return new UiFactory.ViewUi(composeUiView, ui);
            case 4:
                context.getClass();
                ContextThemeWrapper contextThemeWrapper2 = new ContextThemeWrapper(context, R.style.Theme_Cash_Default_Accent_Support);
                if (screen instanceof SupportScreens$SupportDialogs$SupportFlowCheckConnectionScreen) {
                    addMoneyView = new SupportFlowCheckConnectionView(contextThemeWrapper2);
                } else if (screen instanceof SupportScreens.FlowScreens.SupportHomeScreen) {
                    addMoneyView = new ProductSearchView((Context) contextThemeWrapper2, realImageLoader, 4);
                } else if ((screen instanceof SupportScreens.FlowScreens.ArticleScreen) || (screen instanceof SupportScreens.UnauthenticatedArticleScreen)) {
                    addMoneyView = new AddMoneyView(contextThemeWrapper2, realImageLoader, (WebViewProvider) obj, (SupportActivityItemLoader) obj3);
                } else if (screen instanceof SupportScreens.ContactScreens.ContactSupportEmailInputScreen) {
                    addMoneyView = new ContactSupportEmailInputView(contextThemeWrapper2);
                } else if (screen instanceof SupportScreens.ContactScreens.ContactSupportMessageScreen) {
                    addMoneyView = new ContactSupportEmailMessageView(contextThemeWrapper2);
                } else if (screen instanceof SupportScreens.SupportLoadClientScenarioScreen) {
                    addMoneyView = new SupportLoadClientScenarioView(contextThemeWrapper2);
                } else if (screen instanceof SupportScreens.FlowScreens.SupportSearchScreen) {
                    addMoneyView = new SupportSearchView(contextThemeWrapper2);
                } else if (screen instanceof SupportScreens.FlowScreens.SupportIncidentDetailsScreen) {
                    addMoneyView = new SupportIncidentDetailsView(contextThemeWrapper2);
                } else if (screen instanceof SupportScreens.SupportPhoneStatusScreen) {
                    addMoneyView = new SupportPhoneStatusView(contextThemeWrapper2);
                } else if (screen instanceof SupportScreens.PhoneVerificationScreen) {
                    addMoneyView = new SupportPhoneVerificationView(contextThemeWrapper2);
                } else if (screen instanceof SupportScreens.FlowScreens.SupportDisputeTrackerScreen) {
                    addMoneyView = new ProductSearchView(contextThemeWrapper2, realImageLoader, i5);
                } else if (screen instanceof SupportScreens.FlowScreens.SupportArticleIncidentsSheetScreen) {
                    addMoneyView = new SupportArticleIncidentsSheetView(contextThemeWrapper2);
                } else if (screen instanceof SupportScreens.ScreenshotScreen.ScreenshotConfirmScreen) {
                    addMoneyView = new ScreenshotConfirmView(contextThemeWrapper2);
                } else {
                    if (screen instanceof SupportScreens.ScreenshotScreen.ScreenshotReviewScreen) {
                        return new UiFactory.ComposeUi(new ComposableLambdaImpl(new MoneyUiFactory$$ExternalSyntheticLambda0(this, 21), true, -1860623912));
                    }
                    addMoneyView = screen instanceof SupportScreens.FlowScreens.SupportActivityPickerFullScreen ? new ProfileUiView(context, realImageLoader, (RealCashVibrator) obj2, 2) : screen instanceof SupportScreens.SupportSheets.SupportTransactionConfirmationSheet ? new SupportTransactionConfirmationView(contextThemeWrapper2) : screen instanceof SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen ? new SupportHomeContactOptionsSheet(contextThemeWrapper2) : null;
                }
                if (addMoneyView != null) {
                    return new UiFactory.ViewUi(addMoneyView, addMoneyView);
                }
                return null;
            case 5:
                FeatureFlagManager featureFlagManager = (FeatureFlagManager) obj3;
                RealCashVibrator realCashVibrator2 = (RealCashVibrator) obj2;
                LocalizedMoneyFormatter.Factory factory2 = (LocalizedMoneyFormatter.Factory) obj;
                context.getClass();
                UiFactory.ComposeUi composeUi2 = screen instanceof InstrumentLinkingOptionsScreen ? new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.transfers.views.TransfersUiFactory$$ExternalSyntheticLambda0
                    public final /* synthetic */ LocalViewFactory f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                        int i9 = i6;
                        LocalViewFactory localViewFactory = this.f$0;
                        switch (i9) {
                            case 0:
                                InstrumentLinkingOptionsViewModel instrumentLinkingOptionsViewModel = (InstrumentLinkingOptionsViewModel) obj4;
                                Function1 function1 = (Function1) obj5;
                                int intValue = ((Integer) obj7).intValue();
                                instrumentLinkingOptionsViewModel.getClass();
                                function1.getClass();
                                AddMoneyViewKt.InstrumentLinkingOptionsSheetView(instrumentLinkingOptionsViewModel, function1, localViewFactory.imageLoader, (Composer) obj6, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                break;
                            case 1:
                                InstrumentDetailsViewModel instrumentDetailsViewModel = (InstrumentDetailsViewModel) obj4;
                                Function1 function12 = (Function1) obj5;
                                int intValue2 = ((Integer) obj7).intValue();
                                instrumentDetailsViewModel.getClass();
                                function12.getClass();
                                AddMoneyViewKt.InstrumentDetailsSheet(instrumentDetailsViewModel, function12, localViewFactory.imageLoader, (Composer) obj6, intValue2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                break;
                            case 2:
                                InstrumentDetailsViewModel instrumentDetailsViewModel2 = (InstrumentDetailsViewModel) obj4;
                                Function1 function13 = (Function1) obj5;
                                int intValue3 = ((Integer) obj7).intValue();
                                instrumentDetailsViewModel2.getClass();
                                function13.getClass();
                                AddMoneyViewKt.InstrumentDetailsFullscreenView(instrumentDetailsViewModel2, function13, localViewFactory.imageLoader, (Composer) obj6, intValue3 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                break;
                            case 3:
                                LinkedAccountsViewModel linkedAccountsViewModel = (LinkedAccountsViewModel) obj4;
                                Function1 function14 = (Function1) obj5;
                                int intValue4 = ((Integer) obj7).intValue();
                                linkedAccountsViewModel.getClass();
                                function14.getClass();
                                AddMoneyViewKt.LinkedAccountsContent(linkedAccountsViewModel, function14, localViewFactory.imageLoader, (Composer) obj6, intValue4 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                break;
                            case 4:
                                RecurringReloadOptionViewModel recurringReloadOptionViewModel = (RecurringReloadOptionViewModel) obj4;
                                Function1 function15 = (Function1) obj5;
                                int intValue5 = ((Integer) obj7).intValue();
                                recurringReloadOptionViewModel.getClass();
                                function15.getClass();
                                AddMoneyViewKt.RecurringReloadOptionContent(recurringReloadOptionViewModel, function15, localViewFactory.imageLoader, (Composer) obj6, intValue5 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                break;
                            case 5:
                                RecurringReloadConfigurationViewModel recurringReloadConfigurationViewModel = (RecurringReloadConfigurationViewModel) obj4;
                                Function1 function16 = (Function1) obj5;
                                int intValue6 = ((Integer) obj7).intValue();
                                recurringReloadConfigurationViewModel.getClass();
                                function16.getClass();
                                AddMoneyViewKt.RecurringReloadConfigurationContent(recurringReloadConfigurationViewModel, function16, (LocalizedMoneyFormatter.Factory) localViewFactory.addressSearcher, (RealCashVibrator) localViewFactory.mapEngineProvider, (Composer) obj6, intValue6 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                break;
                            default:
                                ScheduledReloadConfirmationViewModel scheduledReloadConfirmationViewModel = (ScheduledReloadConfirmationViewModel) obj4;
                                Function1 function17 = (Function1) obj5;
                                int intValue7 = ((Integer) obj7).intValue();
                                scheduledReloadConfirmationViewModel.getClass();
                                function17.getClass();
                                AddMoneyViewKt.ScheduledReloadConfirmationContent(scheduledReloadConfirmationViewModel, function17, localViewFactory.imageLoader, (Composer) obj6, intValue7 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, true, 728143951)) : screen instanceof LinkedAccountsNuxScreen ? new UiFactory.ComposeUi(AddMoneyViewKt.lambda$52735271) : screen instanceof InstrumentNotLinkedScreen ? new UiFactory.ComposeUi(AddMoneyViewKt.f732lambda$1936656939) : screen instanceof InstrumentDetailsSheetScreen ? new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.transfers.views.TransfersUiFactory$$ExternalSyntheticLambda0
                    public final /* synthetic */ LocalViewFactory f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                        int i9 = i8;
                        LocalViewFactory localViewFactory = this.f$0;
                        switch (i9) {
                            case 0:
                                InstrumentLinkingOptionsViewModel instrumentLinkingOptionsViewModel = (InstrumentLinkingOptionsViewModel) obj4;
                                Function1 function1 = (Function1) obj5;
                                int intValue = ((Integer) obj7).intValue();
                                instrumentLinkingOptionsViewModel.getClass();
                                function1.getClass();
                                AddMoneyViewKt.InstrumentLinkingOptionsSheetView(instrumentLinkingOptionsViewModel, function1, localViewFactory.imageLoader, (Composer) obj6, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                break;
                            case 1:
                                InstrumentDetailsViewModel instrumentDetailsViewModel = (InstrumentDetailsViewModel) obj4;
                                Function1 function12 = (Function1) obj5;
                                int intValue2 = ((Integer) obj7).intValue();
                                instrumentDetailsViewModel.getClass();
                                function12.getClass();
                                AddMoneyViewKt.InstrumentDetailsSheet(instrumentDetailsViewModel, function12, localViewFactory.imageLoader, (Composer) obj6, intValue2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                break;
                            case 2:
                                InstrumentDetailsViewModel instrumentDetailsViewModel2 = (InstrumentDetailsViewModel) obj4;
                                Function1 function13 = (Function1) obj5;
                                int intValue3 = ((Integer) obj7).intValue();
                                instrumentDetailsViewModel2.getClass();
                                function13.getClass();
                                AddMoneyViewKt.InstrumentDetailsFullscreenView(instrumentDetailsViewModel2, function13, localViewFactory.imageLoader, (Composer) obj6, intValue3 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                break;
                            case 3:
                                LinkedAccountsViewModel linkedAccountsViewModel = (LinkedAccountsViewModel) obj4;
                                Function1 function14 = (Function1) obj5;
                                int intValue4 = ((Integer) obj7).intValue();
                                linkedAccountsViewModel.getClass();
                                function14.getClass();
                                AddMoneyViewKt.LinkedAccountsContent(linkedAccountsViewModel, function14, localViewFactory.imageLoader, (Composer) obj6, intValue4 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                break;
                            case 4:
                                RecurringReloadOptionViewModel recurringReloadOptionViewModel = (RecurringReloadOptionViewModel) obj4;
                                Function1 function15 = (Function1) obj5;
                                int intValue5 = ((Integer) obj7).intValue();
                                recurringReloadOptionViewModel.getClass();
                                function15.getClass();
                                AddMoneyViewKt.RecurringReloadOptionContent(recurringReloadOptionViewModel, function15, localViewFactory.imageLoader, (Composer) obj6, intValue5 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                break;
                            case 5:
                                RecurringReloadConfigurationViewModel recurringReloadConfigurationViewModel = (RecurringReloadConfigurationViewModel) obj4;
                                Function1 function16 = (Function1) obj5;
                                int intValue6 = ((Integer) obj7).intValue();
                                recurringReloadConfigurationViewModel.getClass();
                                function16.getClass();
                                AddMoneyViewKt.RecurringReloadConfigurationContent(recurringReloadConfigurationViewModel, function16, (LocalizedMoneyFormatter.Factory) localViewFactory.addressSearcher, (RealCashVibrator) localViewFactory.mapEngineProvider, (Composer) obj6, intValue6 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                break;
                            default:
                                ScheduledReloadConfirmationViewModel scheduledReloadConfirmationViewModel = (ScheduledReloadConfirmationViewModel) obj4;
                                Function1 function17 = (Function1) obj5;
                                int intValue7 = ((Integer) obj7).intValue();
                                scheduledReloadConfirmationViewModel.getClass();
                                function17.getClass();
                                AddMoneyViewKt.ScheduledReloadConfirmationContent(scheduledReloadConfirmationViewModel, function17, localViewFactory.imageLoader, (Composer) obj6, intValue7 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, true, -661768032)) : screen instanceof InstrumentDetailsFullscreenScreen ? new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.transfers.views.TransfersUiFactory$$ExternalSyntheticLambda0
                    public final /* synthetic */ LocalViewFactory f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                        int i9 = i7;
                        LocalViewFactory localViewFactory = this.f$0;
                        switch (i9) {
                            case 0:
                                InstrumentLinkingOptionsViewModel instrumentLinkingOptionsViewModel = (InstrumentLinkingOptionsViewModel) obj4;
                                Function1 function1 = (Function1) obj5;
                                int intValue = ((Integer) obj7).intValue();
                                instrumentLinkingOptionsViewModel.getClass();
                                function1.getClass();
                                AddMoneyViewKt.InstrumentLinkingOptionsSheetView(instrumentLinkingOptionsViewModel, function1, localViewFactory.imageLoader, (Composer) obj6, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                break;
                            case 1:
                                InstrumentDetailsViewModel instrumentDetailsViewModel = (InstrumentDetailsViewModel) obj4;
                                Function1 function12 = (Function1) obj5;
                                int intValue2 = ((Integer) obj7).intValue();
                                instrumentDetailsViewModel.getClass();
                                function12.getClass();
                                AddMoneyViewKt.InstrumentDetailsSheet(instrumentDetailsViewModel, function12, localViewFactory.imageLoader, (Composer) obj6, intValue2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                break;
                            case 2:
                                InstrumentDetailsViewModel instrumentDetailsViewModel2 = (InstrumentDetailsViewModel) obj4;
                                Function1 function13 = (Function1) obj5;
                                int intValue3 = ((Integer) obj7).intValue();
                                instrumentDetailsViewModel2.getClass();
                                function13.getClass();
                                AddMoneyViewKt.InstrumentDetailsFullscreenView(instrumentDetailsViewModel2, function13, localViewFactory.imageLoader, (Composer) obj6, intValue3 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                break;
                            case 3:
                                LinkedAccountsViewModel linkedAccountsViewModel = (LinkedAccountsViewModel) obj4;
                                Function1 function14 = (Function1) obj5;
                                int intValue4 = ((Integer) obj7).intValue();
                                linkedAccountsViewModel.getClass();
                                function14.getClass();
                                AddMoneyViewKt.LinkedAccountsContent(linkedAccountsViewModel, function14, localViewFactory.imageLoader, (Composer) obj6, intValue4 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                break;
                            case 4:
                                RecurringReloadOptionViewModel recurringReloadOptionViewModel = (RecurringReloadOptionViewModel) obj4;
                                Function1 function15 = (Function1) obj5;
                                int intValue5 = ((Integer) obj7).intValue();
                                recurringReloadOptionViewModel.getClass();
                                function15.getClass();
                                AddMoneyViewKt.RecurringReloadOptionContent(recurringReloadOptionViewModel, function15, localViewFactory.imageLoader, (Composer) obj6, intValue5 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                break;
                            case 5:
                                RecurringReloadConfigurationViewModel recurringReloadConfigurationViewModel = (RecurringReloadConfigurationViewModel) obj4;
                                Function1 function16 = (Function1) obj5;
                                int intValue6 = ((Integer) obj7).intValue();
                                recurringReloadConfigurationViewModel.getClass();
                                function16.getClass();
                                AddMoneyViewKt.RecurringReloadConfigurationContent(recurringReloadConfigurationViewModel, function16, (LocalizedMoneyFormatter.Factory) localViewFactory.addressSearcher, (RealCashVibrator) localViewFactory.mapEngineProvider, (Composer) obj6, intValue6 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                break;
                            default:
                                ScheduledReloadConfirmationViewModel scheduledReloadConfirmationViewModel = (ScheduledReloadConfirmationViewModel) obj4;
                                Function1 function17 = (Function1) obj5;
                                int intValue7 = ((Integer) obj7).intValue();
                                scheduledReloadConfirmationViewModel.getClass();
                                function17.getClass();
                                AddMoneyViewKt.ScheduledReloadConfirmationContent(scheduledReloadConfirmationViewModel, function17, localViewFactory.imageLoader, (Composer) obj6, intValue7 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, true, -489353951)) : screen instanceof TransfersRouterScreen ? new UiFactory.ComposeUi(AddMoneyViewKt.f736lambda$328994883) : screen instanceof SetDefaultInstrumentScreen ? new UiFactory.ComposeUi(AddMoneyViewKt.f731lambda$156580802) : screen instanceof LinkedAccountsScreen ? new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.transfers.views.TransfersUiFactory$$ExternalSyntheticLambda0
                    public final /* synthetic */ LocalViewFactory f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                        int i9 = i5;
                        LocalViewFactory localViewFactory = this.f$0;
                        switch (i9) {
                            case 0:
                                InstrumentLinkingOptionsViewModel instrumentLinkingOptionsViewModel = (InstrumentLinkingOptionsViewModel) obj4;
                                Function1 function1 = (Function1) obj5;
                                int intValue = ((Integer) obj7).intValue();
                                instrumentLinkingOptionsViewModel.getClass();
                                function1.getClass();
                                AddMoneyViewKt.InstrumentLinkingOptionsSheetView(instrumentLinkingOptionsViewModel, function1, localViewFactory.imageLoader, (Composer) obj6, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                break;
                            case 1:
                                InstrumentDetailsViewModel instrumentDetailsViewModel = (InstrumentDetailsViewModel) obj4;
                                Function1 function12 = (Function1) obj5;
                                int intValue2 = ((Integer) obj7).intValue();
                                instrumentDetailsViewModel.getClass();
                                function12.getClass();
                                AddMoneyViewKt.InstrumentDetailsSheet(instrumentDetailsViewModel, function12, localViewFactory.imageLoader, (Composer) obj6, intValue2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                break;
                            case 2:
                                InstrumentDetailsViewModel instrumentDetailsViewModel2 = (InstrumentDetailsViewModel) obj4;
                                Function1 function13 = (Function1) obj5;
                                int intValue3 = ((Integer) obj7).intValue();
                                instrumentDetailsViewModel2.getClass();
                                function13.getClass();
                                AddMoneyViewKt.InstrumentDetailsFullscreenView(instrumentDetailsViewModel2, function13, localViewFactory.imageLoader, (Composer) obj6, intValue3 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                break;
                            case 3:
                                LinkedAccountsViewModel linkedAccountsViewModel = (LinkedAccountsViewModel) obj4;
                                Function1 function14 = (Function1) obj5;
                                int intValue4 = ((Integer) obj7).intValue();
                                linkedAccountsViewModel.getClass();
                                function14.getClass();
                                AddMoneyViewKt.LinkedAccountsContent(linkedAccountsViewModel, function14, localViewFactory.imageLoader, (Composer) obj6, intValue4 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                break;
                            case 4:
                                RecurringReloadOptionViewModel recurringReloadOptionViewModel = (RecurringReloadOptionViewModel) obj4;
                                Function1 function15 = (Function1) obj5;
                                int intValue5 = ((Integer) obj7).intValue();
                                recurringReloadOptionViewModel.getClass();
                                function15.getClass();
                                AddMoneyViewKt.RecurringReloadOptionContent(recurringReloadOptionViewModel, function15, localViewFactory.imageLoader, (Composer) obj6, intValue5 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                break;
                            case 5:
                                RecurringReloadConfigurationViewModel recurringReloadConfigurationViewModel = (RecurringReloadConfigurationViewModel) obj4;
                                Function1 function16 = (Function1) obj5;
                                int intValue6 = ((Integer) obj7).intValue();
                                recurringReloadConfigurationViewModel.getClass();
                                function16.getClass();
                                AddMoneyViewKt.RecurringReloadConfigurationContent(recurringReloadConfigurationViewModel, function16, (LocalizedMoneyFormatter.Factory) localViewFactory.addressSearcher, (RealCashVibrator) localViewFactory.mapEngineProvider, (Composer) obj6, intValue6 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                break;
                            default:
                                ScheduledReloadConfirmationViewModel scheduledReloadConfirmationViewModel = (ScheduledReloadConfirmationViewModel) obj4;
                                Function1 function17 = (Function1) obj5;
                                int intValue7 = ((Integer) obj7).intValue();
                                scheduledReloadConfirmationViewModel.getClass();
                                function17.getClass();
                                AddMoneyViewKt.ScheduledReloadConfirmationContent(scheduledReloadConfirmationViewModel, function17, localViewFactory.imageLoader, (Composer) obj6, intValue7 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, true, -1026367030)) : screen instanceof RecurringReloadOptionScreen ? new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.transfers.views.TransfersUiFactory$$ExternalSyntheticLambda0
                    public final /* synthetic */ LocalViewFactory f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                        int i9 = i4;
                        LocalViewFactory localViewFactory = this.f$0;
                        switch (i9) {
                            case 0:
                                InstrumentLinkingOptionsViewModel instrumentLinkingOptionsViewModel = (InstrumentLinkingOptionsViewModel) obj4;
                                Function1 function1 = (Function1) obj5;
                                int intValue = ((Integer) obj7).intValue();
                                instrumentLinkingOptionsViewModel.getClass();
                                function1.getClass();
                                AddMoneyViewKt.InstrumentLinkingOptionsSheetView(instrumentLinkingOptionsViewModel, function1, localViewFactory.imageLoader, (Composer) obj6, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                break;
                            case 1:
                                InstrumentDetailsViewModel instrumentDetailsViewModel = (InstrumentDetailsViewModel) obj4;
                                Function1 function12 = (Function1) obj5;
                                int intValue2 = ((Integer) obj7).intValue();
                                instrumentDetailsViewModel.getClass();
                                function12.getClass();
                                AddMoneyViewKt.InstrumentDetailsSheet(instrumentDetailsViewModel, function12, localViewFactory.imageLoader, (Composer) obj6, intValue2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                break;
                            case 2:
                                InstrumentDetailsViewModel instrumentDetailsViewModel2 = (InstrumentDetailsViewModel) obj4;
                                Function1 function13 = (Function1) obj5;
                                int intValue3 = ((Integer) obj7).intValue();
                                instrumentDetailsViewModel2.getClass();
                                function13.getClass();
                                AddMoneyViewKt.InstrumentDetailsFullscreenView(instrumentDetailsViewModel2, function13, localViewFactory.imageLoader, (Composer) obj6, intValue3 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                break;
                            case 3:
                                LinkedAccountsViewModel linkedAccountsViewModel = (LinkedAccountsViewModel) obj4;
                                Function1 function14 = (Function1) obj5;
                                int intValue4 = ((Integer) obj7).intValue();
                                linkedAccountsViewModel.getClass();
                                function14.getClass();
                                AddMoneyViewKt.LinkedAccountsContent(linkedAccountsViewModel, function14, localViewFactory.imageLoader, (Composer) obj6, intValue4 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                break;
                            case 4:
                                RecurringReloadOptionViewModel recurringReloadOptionViewModel = (RecurringReloadOptionViewModel) obj4;
                                Function1 function15 = (Function1) obj5;
                                int intValue5 = ((Integer) obj7).intValue();
                                recurringReloadOptionViewModel.getClass();
                                function15.getClass();
                                AddMoneyViewKt.RecurringReloadOptionContent(recurringReloadOptionViewModel, function15, localViewFactory.imageLoader, (Composer) obj6, intValue5 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                break;
                            case 5:
                                RecurringReloadConfigurationViewModel recurringReloadConfigurationViewModel = (RecurringReloadConfigurationViewModel) obj4;
                                Function1 function16 = (Function1) obj5;
                                int intValue6 = ((Integer) obj7).intValue();
                                recurringReloadConfigurationViewModel.getClass();
                                function16.getClass();
                                AddMoneyViewKt.RecurringReloadConfigurationContent(recurringReloadConfigurationViewModel, function16, (LocalizedMoneyFormatter.Factory) localViewFactory.addressSearcher, (RealCashVibrator) localViewFactory.mapEngineProvider, (Composer) obj6, intValue6 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                break;
                            default:
                                ScheduledReloadConfirmationViewModel scheduledReloadConfirmationViewModel = (ScheduledReloadConfirmationViewModel) obj4;
                                Function1 function17 = (Function1) obj5;
                                int intValue7 = ((Integer) obj7).intValue();
                                scheduledReloadConfirmationViewModel.getClass();
                                function17.getClass();
                                AddMoneyViewKt.ScheduledReloadConfirmationContent(scheduledReloadConfirmationViewModel, function17, localViewFactory.imageLoader, (Composer) obj6, intValue7 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, true, -1976345323)) : screen instanceof RecurringReloadConfigurationScreen ? new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.transfers.views.TransfersUiFactory$$ExternalSyntheticLambda0
                    public final /* synthetic */ LocalViewFactory f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                        int i9 = i3;
                        LocalViewFactory localViewFactory = this.f$0;
                        switch (i9) {
                            case 0:
                                InstrumentLinkingOptionsViewModel instrumentLinkingOptionsViewModel = (InstrumentLinkingOptionsViewModel) obj4;
                                Function1 function1 = (Function1) obj5;
                                int intValue = ((Integer) obj7).intValue();
                                instrumentLinkingOptionsViewModel.getClass();
                                function1.getClass();
                                AddMoneyViewKt.InstrumentLinkingOptionsSheetView(instrumentLinkingOptionsViewModel, function1, localViewFactory.imageLoader, (Composer) obj6, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                break;
                            case 1:
                                InstrumentDetailsViewModel instrumentDetailsViewModel = (InstrumentDetailsViewModel) obj4;
                                Function1 function12 = (Function1) obj5;
                                int intValue2 = ((Integer) obj7).intValue();
                                instrumentDetailsViewModel.getClass();
                                function12.getClass();
                                AddMoneyViewKt.InstrumentDetailsSheet(instrumentDetailsViewModel, function12, localViewFactory.imageLoader, (Composer) obj6, intValue2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                break;
                            case 2:
                                InstrumentDetailsViewModel instrumentDetailsViewModel2 = (InstrumentDetailsViewModel) obj4;
                                Function1 function13 = (Function1) obj5;
                                int intValue3 = ((Integer) obj7).intValue();
                                instrumentDetailsViewModel2.getClass();
                                function13.getClass();
                                AddMoneyViewKt.InstrumentDetailsFullscreenView(instrumentDetailsViewModel2, function13, localViewFactory.imageLoader, (Composer) obj6, intValue3 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                break;
                            case 3:
                                LinkedAccountsViewModel linkedAccountsViewModel = (LinkedAccountsViewModel) obj4;
                                Function1 function14 = (Function1) obj5;
                                int intValue4 = ((Integer) obj7).intValue();
                                linkedAccountsViewModel.getClass();
                                function14.getClass();
                                AddMoneyViewKt.LinkedAccountsContent(linkedAccountsViewModel, function14, localViewFactory.imageLoader, (Composer) obj6, intValue4 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                break;
                            case 4:
                                RecurringReloadOptionViewModel recurringReloadOptionViewModel = (RecurringReloadOptionViewModel) obj4;
                                Function1 function15 = (Function1) obj5;
                                int intValue5 = ((Integer) obj7).intValue();
                                recurringReloadOptionViewModel.getClass();
                                function15.getClass();
                                AddMoneyViewKt.RecurringReloadOptionContent(recurringReloadOptionViewModel, function15, localViewFactory.imageLoader, (Composer) obj6, intValue5 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                break;
                            case 5:
                                RecurringReloadConfigurationViewModel recurringReloadConfigurationViewModel = (RecurringReloadConfigurationViewModel) obj4;
                                Function1 function16 = (Function1) obj5;
                                int intValue6 = ((Integer) obj7).intValue();
                                recurringReloadConfigurationViewModel.getClass();
                                function16.getClass();
                                AddMoneyViewKt.RecurringReloadConfigurationContent(recurringReloadConfigurationViewModel, function16, (LocalizedMoneyFormatter.Factory) localViewFactory.addressSearcher, (RealCashVibrator) localViewFactory.mapEngineProvider, (Composer) obj6, intValue6 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                break;
                            default:
                                ScheduledReloadConfirmationViewModel scheduledReloadConfirmationViewModel = (ScheduledReloadConfirmationViewModel) obj4;
                                Function1 function17 = (Function1) obj5;
                                int intValue7 = ((Integer) obj7).intValue();
                                scheduledReloadConfirmationViewModel.getClass();
                                function17.getClass();
                                AddMoneyViewKt.ScheduledReloadConfirmationContent(scheduledReloadConfirmationViewModel, function17, localViewFactory.imageLoader, (Composer) obj6, intValue7 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, true, -1625786549)) : screen instanceof RecurringReloadsChangeInstrumentScreen ? new UiFactory.ComposeUi(AddMoneyViewKt.f738lambda$974023911) : screen instanceof RecurringReloadsDismissDialogScreen ? new UiFactory.ComposeUi(AddMoneyViewKt.lambda$745845477) : screen instanceof ScheduledReloadConfirmationScreen ? new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.transfers.views.TransfersUiFactory$$ExternalSyntheticLambda0
                    public final /* synthetic */ LocalViewFactory f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                        int i9 = i2;
                        LocalViewFactory localViewFactory = this.f$0;
                        switch (i9) {
                            case 0:
                                InstrumentLinkingOptionsViewModel instrumentLinkingOptionsViewModel = (InstrumentLinkingOptionsViewModel) obj4;
                                Function1 function1 = (Function1) obj5;
                                int intValue = ((Integer) obj7).intValue();
                                instrumentLinkingOptionsViewModel.getClass();
                                function1.getClass();
                                AddMoneyViewKt.InstrumentLinkingOptionsSheetView(instrumentLinkingOptionsViewModel, function1, localViewFactory.imageLoader, (Composer) obj6, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                break;
                            case 1:
                                InstrumentDetailsViewModel instrumentDetailsViewModel = (InstrumentDetailsViewModel) obj4;
                                Function1 function12 = (Function1) obj5;
                                int intValue2 = ((Integer) obj7).intValue();
                                instrumentDetailsViewModel.getClass();
                                function12.getClass();
                                AddMoneyViewKt.InstrumentDetailsSheet(instrumentDetailsViewModel, function12, localViewFactory.imageLoader, (Composer) obj6, intValue2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                break;
                            case 2:
                                InstrumentDetailsViewModel instrumentDetailsViewModel2 = (InstrumentDetailsViewModel) obj4;
                                Function1 function13 = (Function1) obj5;
                                int intValue3 = ((Integer) obj7).intValue();
                                instrumentDetailsViewModel2.getClass();
                                function13.getClass();
                                AddMoneyViewKt.InstrumentDetailsFullscreenView(instrumentDetailsViewModel2, function13, localViewFactory.imageLoader, (Composer) obj6, intValue3 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                break;
                            case 3:
                                LinkedAccountsViewModel linkedAccountsViewModel = (LinkedAccountsViewModel) obj4;
                                Function1 function14 = (Function1) obj5;
                                int intValue4 = ((Integer) obj7).intValue();
                                linkedAccountsViewModel.getClass();
                                function14.getClass();
                                AddMoneyViewKt.LinkedAccountsContent(linkedAccountsViewModel, function14, localViewFactory.imageLoader, (Composer) obj6, intValue4 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                break;
                            case 4:
                                RecurringReloadOptionViewModel recurringReloadOptionViewModel = (RecurringReloadOptionViewModel) obj4;
                                Function1 function15 = (Function1) obj5;
                                int intValue5 = ((Integer) obj7).intValue();
                                recurringReloadOptionViewModel.getClass();
                                function15.getClass();
                                AddMoneyViewKt.RecurringReloadOptionContent(recurringReloadOptionViewModel, function15, localViewFactory.imageLoader, (Composer) obj6, intValue5 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                break;
                            case 5:
                                RecurringReloadConfigurationViewModel recurringReloadConfigurationViewModel = (RecurringReloadConfigurationViewModel) obj4;
                                Function1 function16 = (Function1) obj5;
                                int intValue6 = ((Integer) obj7).intValue();
                                recurringReloadConfigurationViewModel.getClass();
                                function16.getClass();
                                AddMoneyViewKt.RecurringReloadConfigurationContent(recurringReloadConfigurationViewModel, function16, (LocalizedMoneyFormatter.Factory) localViewFactory.addressSearcher, (RealCashVibrator) localViewFactory.mapEngineProvider, (Composer) obj6, intValue6 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                break;
                            default:
                                ScheduledReloadConfirmationViewModel scheduledReloadConfirmationViewModel = (ScheduledReloadConfirmationViewModel) obj4;
                                Function1 function17 = (Function1) obj5;
                                int intValue7 = ((Integer) obj7).intValue();
                                scheduledReloadConfirmationViewModel.getClass();
                                function17.getClass();
                                AddMoneyViewKt.ScheduledReloadConfirmationContent(scheduledReloadConfirmationViewModel, function17, localViewFactory.imageLoader, (Composer) obj6, intValue7 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, true, 1603673484)) : null;
                if (composeUi2 != null) {
                    return composeUi2;
                }
                if (screen instanceof BalanceBasedAutoReloadConfirmationScreen) {
                    withdrawView = new BalanceBasedAutoReloadConfirmationView(context);
                } else if (screen instanceof BalanceBasedAddCashDisabledDialogScreen) {
                    withdrawView = new BalanceBasedAddCashDisabledDialogView(context);
                } else if (screen instanceof PendingTransfersConfirmationDialog) {
                    withdrawView = new PendingTransfersConfirmationDialogView(context);
                } else {
                    boolean z2 = screen instanceof WithdrawScreen;
                    RealImageLoader realImageLoader2 = this.imageLoader;
                    withdrawView = z2 ? new WithdrawView(context, factory2, realCashVibrator2, featureFlagManager, realImageLoader2) : screen instanceof LiteCashOutScreen ? new WithdrawView(context, factory2, realCashVibrator2, featureFlagManager, realImageLoader2) : screen instanceof AddMoneyScreen ? new AddMoneyView(context, factory2, realImageLoader2, realCashVibrator2) : null;
                }
                if (withdrawView != null) {
                    return new UiFactory.ViewUi(withdrawView, withdrawView);
                }
                return null;
            case 6:
                context.getClass();
                if (screen instanceof WalletHomeScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new MoneyUiFactory$$ExternalSyntheticLambda0(this, 24), true, 55422830));
                }
                if (screen instanceof CardLockHalfSheetScreen) {
                    return new UiFactory.ComposeUi(UtilsKt.lambda$1752536149);
                }
                if (screen instanceof CardControlDialogScreen) {
                    ArcadeCardControlDialog arcadeCardControlDialog = new ArcadeCardControlDialog(context);
                    return new UiFactory.ViewUi(arcadeCardControlDialog, arcadeCardControlDialog);
                }
                if (screen instanceof PresentationTimelineScreen) {
                    return new UiFactory.ComposeUi(UtilsKt.f744lambda$1362378728);
                }
                return null;
            default:
                context.getClass();
                if (screen instanceof WorkHomeScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.work.views.WorkViewFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ LocalViewFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                            int i9 = i6;
                            int i10 = 0;
                            LocalViewFactory localViewFactory = this.f$0;
                            switch (i9) {
                                case 0:
                                    WorkHomeViewModel workHomeViewModel = (WorkHomeViewModel) obj4;
                                    Function1 function1 = (Function1) obj5;
                                    Composer composer = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    workHomeViewModel.getClass();
                                    function1.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(502105712, new WorkHomeViewKt$$ExternalSyntheticLambda0(workHomeViewModel, function1, 1), composer), composer, 56);
                                    break;
                                case 1:
                                    WorkWebViewModel workWebViewModel = (WorkWebViewModel) obj4;
                                    Function1 function12 = (Function1) obj5;
                                    int intValue = ((Integer) obj7).intValue();
                                    workWebViewModel.getClass();
                                    function12.getClass();
                                    WorkWebViewKt.WorkWebView(workWebViewModel, function12, (WebViewProvider) localViewFactory.addressSearcher, (String) localViewFactory.featureFlagManager, (AndroidDownloadManager$Factory$Impl) localViewFactory.mapEngineProvider, (Composer) obj6, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 2:
                                    MerchantPickerViewModel merchantPickerViewModel = (MerchantPickerViewModel) obj4;
                                    Function1 function13 = (Function1) obj5;
                                    Composer composer2 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    merchantPickerViewModel.getClass();
                                    function13.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(487149662, new WorkViewFactory$$ExternalSyntheticLambda14(merchantPickerViewModel, function13), composer2), composer2, 56);
                                    break;
                                case 3:
                                    ClockInOverlayViewModel clockInOverlayViewModel = (ClockInOverlayViewModel) obj4;
                                    Function1 function14 = (Function1) obj5;
                                    Composer composer3 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    clockInOverlayViewModel.getClass();
                                    function14.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(4830307, new WorkViewFactory$$ExternalSyntheticLambda12(0, clockInOverlayViewModel, function14), composer3), composer3, 56);
                                    break;
                                case 4:
                                    ShiftDetailViewModel shiftDetailViewModel = (ShiftDetailViewModel) obj4;
                                    Function1 function15 = (Function1) obj5;
                                    Composer composer4 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    shiftDetailViewModel.getClass();
                                    function15.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-1285083414, new WorkViewFactory$$ExternalSyntheticLambda10(shiftDetailViewModel, function15, 0, (byte) 0), composer4), composer4, 56);
                                    break;
                                case 5:
                                    ShiftListViewModel shiftListViewModel = (ShiftListViewModel) obj4;
                                    Function1 function16 = (Function1) obj5;
                                    Composer composer5 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    shiftListViewModel.getClass();
                                    function16.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-777913700, new WorkViewFactory$$ExternalSyntheticLambda9(shiftListViewModel, function16), composer5), composer5, 56);
                                    break;
                                case 6:
                                    PayHomeViewModel payHomeViewModel = (PayHomeViewModel) obj4;
                                    Function1 function17 = (Function1) obj5;
                                    Composer composer6 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    payHomeViewModel.getClass();
                                    function17.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(251159668, new WorkViewFactory$$ExternalSyntheticLambda13(payHomeViewModel, function17, i10), composer6), composer6, 56);
                                    break;
                                default:
                                    PayHistoryListViewModel payHistoryListViewModel = (PayHistoryListViewModel) obj4;
                                    Function1 function18 = (Function1) obj5;
                                    Composer composer7 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    payHistoryListViewModel.getClass();
                                    function18.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(1669439418, new WorkViewFactory$$ExternalSyntheticLambda11(payHistoryListViewModel, function18), composer7), composer7, 56);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, 1134834480));
                }
                if (screen instanceof WorkWebScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.work.views.WorkViewFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ LocalViewFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                            int i9 = i8;
                            int i10 = 0;
                            LocalViewFactory localViewFactory = this.f$0;
                            switch (i9) {
                                case 0:
                                    WorkHomeViewModel workHomeViewModel = (WorkHomeViewModel) obj4;
                                    Function1 function1 = (Function1) obj5;
                                    Composer composer = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    workHomeViewModel.getClass();
                                    function1.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(502105712, new WorkHomeViewKt$$ExternalSyntheticLambda0(workHomeViewModel, function1, 1), composer), composer, 56);
                                    break;
                                case 1:
                                    WorkWebViewModel workWebViewModel = (WorkWebViewModel) obj4;
                                    Function1 function12 = (Function1) obj5;
                                    int intValue = ((Integer) obj7).intValue();
                                    workWebViewModel.getClass();
                                    function12.getClass();
                                    WorkWebViewKt.WorkWebView(workWebViewModel, function12, (WebViewProvider) localViewFactory.addressSearcher, (String) localViewFactory.featureFlagManager, (AndroidDownloadManager$Factory$Impl) localViewFactory.mapEngineProvider, (Composer) obj6, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 2:
                                    MerchantPickerViewModel merchantPickerViewModel = (MerchantPickerViewModel) obj4;
                                    Function1 function13 = (Function1) obj5;
                                    Composer composer2 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    merchantPickerViewModel.getClass();
                                    function13.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(487149662, new WorkViewFactory$$ExternalSyntheticLambda14(merchantPickerViewModel, function13), composer2), composer2, 56);
                                    break;
                                case 3:
                                    ClockInOverlayViewModel clockInOverlayViewModel = (ClockInOverlayViewModel) obj4;
                                    Function1 function14 = (Function1) obj5;
                                    Composer composer3 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    clockInOverlayViewModel.getClass();
                                    function14.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(4830307, new WorkViewFactory$$ExternalSyntheticLambda12(0, clockInOverlayViewModel, function14), composer3), composer3, 56);
                                    break;
                                case 4:
                                    ShiftDetailViewModel shiftDetailViewModel = (ShiftDetailViewModel) obj4;
                                    Function1 function15 = (Function1) obj5;
                                    Composer composer4 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    shiftDetailViewModel.getClass();
                                    function15.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-1285083414, new WorkViewFactory$$ExternalSyntheticLambda10(shiftDetailViewModel, function15, 0, (byte) 0), composer4), composer4, 56);
                                    break;
                                case 5:
                                    ShiftListViewModel shiftListViewModel = (ShiftListViewModel) obj4;
                                    Function1 function16 = (Function1) obj5;
                                    Composer composer5 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    shiftListViewModel.getClass();
                                    function16.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-777913700, new WorkViewFactory$$ExternalSyntheticLambda9(shiftListViewModel, function16), composer5), composer5, 56);
                                    break;
                                case 6:
                                    PayHomeViewModel payHomeViewModel = (PayHomeViewModel) obj4;
                                    Function1 function17 = (Function1) obj5;
                                    Composer composer6 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    payHomeViewModel.getClass();
                                    function17.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(251159668, new WorkViewFactory$$ExternalSyntheticLambda13(payHomeViewModel, function17, i10), composer6), composer6, 56);
                                    break;
                                default:
                                    PayHistoryListViewModel payHistoryListViewModel = (PayHistoryListViewModel) obj4;
                                    Function1 function18 = (Function1) obj5;
                                    Composer composer7 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    payHistoryListViewModel.getClass();
                                    function18.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(1669439418, new WorkViewFactory$$ExternalSyntheticLambda11(payHistoryListViewModel, function18), composer7), composer7, 56);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, 1346029814));
                }
                if (screen instanceof MerchantPickerBottomSheetScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.work.views.WorkViewFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ LocalViewFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                            int i9 = i7;
                            int i10 = 0;
                            LocalViewFactory localViewFactory = this.f$0;
                            switch (i9) {
                                case 0:
                                    WorkHomeViewModel workHomeViewModel = (WorkHomeViewModel) obj4;
                                    Function1 function1 = (Function1) obj5;
                                    Composer composer = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    workHomeViewModel.getClass();
                                    function1.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(502105712, new WorkHomeViewKt$$ExternalSyntheticLambda0(workHomeViewModel, function1, 1), composer), composer, 56);
                                    break;
                                case 1:
                                    WorkWebViewModel workWebViewModel = (WorkWebViewModel) obj4;
                                    Function1 function12 = (Function1) obj5;
                                    int intValue = ((Integer) obj7).intValue();
                                    workWebViewModel.getClass();
                                    function12.getClass();
                                    WorkWebViewKt.WorkWebView(workWebViewModel, function12, (WebViewProvider) localViewFactory.addressSearcher, (String) localViewFactory.featureFlagManager, (AndroidDownloadManager$Factory$Impl) localViewFactory.mapEngineProvider, (Composer) obj6, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 2:
                                    MerchantPickerViewModel merchantPickerViewModel = (MerchantPickerViewModel) obj4;
                                    Function1 function13 = (Function1) obj5;
                                    Composer composer2 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    merchantPickerViewModel.getClass();
                                    function13.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(487149662, new WorkViewFactory$$ExternalSyntheticLambda14(merchantPickerViewModel, function13), composer2), composer2, 56);
                                    break;
                                case 3:
                                    ClockInOverlayViewModel clockInOverlayViewModel = (ClockInOverlayViewModel) obj4;
                                    Function1 function14 = (Function1) obj5;
                                    Composer composer3 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    clockInOverlayViewModel.getClass();
                                    function14.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(4830307, new WorkViewFactory$$ExternalSyntheticLambda12(0, clockInOverlayViewModel, function14), composer3), composer3, 56);
                                    break;
                                case 4:
                                    ShiftDetailViewModel shiftDetailViewModel = (ShiftDetailViewModel) obj4;
                                    Function1 function15 = (Function1) obj5;
                                    Composer composer4 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    shiftDetailViewModel.getClass();
                                    function15.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-1285083414, new WorkViewFactory$$ExternalSyntheticLambda10(shiftDetailViewModel, function15, 0, (byte) 0), composer4), composer4, 56);
                                    break;
                                case 5:
                                    ShiftListViewModel shiftListViewModel = (ShiftListViewModel) obj4;
                                    Function1 function16 = (Function1) obj5;
                                    Composer composer5 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    shiftListViewModel.getClass();
                                    function16.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-777913700, new WorkViewFactory$$ExternalSyntheticLambda9(shiftListViewModel, function16), composer5), composer5, 56);
                                    break;
                                case 6:
                                    PayHomeViewModel payHomeViewModel = (PayHomeViewModel) obj4;
                                    Function1 function17 = (Function1) obj5;
                                    Composer composer6 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    payHomeViewModel.getClass();
                                    function17.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(251159668, new WorkViewFactory$$ExternalSyntheticLambda13(payHomeViewModel, function17, i10), composer6), composer6, 56);
                                    break;
                                default:
                                    PayHistoryListViewModel payHistoryListViewModel = (PayHistoryListViewModel) obj4;
                                    Function1 function18 = (Function1) obj5;
                                    Composer composer7 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    payHistoryListViewModel.getClass();
                                    function18.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(1669439418, new WorkViewFactory$$ExternalSyntheticLambda11(payHistoryListViewModel, function18), composer7), composer7, 56);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, 1520909598));
                }
                if (screen instanceof ClockInBottomSheetScreen) {
                    return new UiFactory.ComposeUi(SellerCardKt.lambda$1396414312);
                }
                if (screen instanceof ClockInOverlayScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.work.views.WorkViewFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ LocalViewFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                            int i9 = i5;
                            int i10 = 0;
                            LocalViewFactory localViewFactory = this.f$0;
                            switch (i9) {
                                case 0:
                                    WorkHomeViewModel workHomeViewModel = (WorkHomeViewModel) obj4;
                                    Function1 function1 = (Function1) obj5;
                                    Composer composer = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    workHomeViewModel.getClass();
                                    function1.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(502105712, new WorkHomeViewKt$$ExternalSyntheticLambda0(workHomeViewModel, function1, 1), composer), composer, 56);
                                    break;
                                case 1:
                                    WorkWebViewModel workWebViewModel = (WorkWebViewModel) obj4;
                                    Function1 function12 = (Function1) obj5;
                                    int intValue = ((Integer) obj7).intValue();
                                    workWebViewModel.getClass();
                                    function12.getClass();
                                    WorkWebViewKt.WorkWebView(workWebViewModel, function12, (WebViewProvider) localViewFactory.addressSearcher, (String) localViewFactory.featureFlagManager, (AndroidDownloadManager$Factory$Impl) localViewFactory.mapEngineProvider, (Composer) obj6, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 2:
                                    MerchantPickerViewModel merchantPickerViewModel = (MerchantPickerViewModel) obj4;
                                    Function1 function13 = (Function1) obj5;
                                    Composer composer2 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    merchantPickerViewModel.getClass();
                                    function13.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(487149662, new WorkViewFactory$$ExternalSyntheticLambda14(merchantPickerViewModel, function13), composer2), composer2, 56);
                                    break;
                                case 3:
                                    ClockInOverlayViewModel clockInOverlayViewModel = (ClockInOverlayViewModel) obj4;
                                    Function1 function14 = (Function1) obj5;
                                    Composer composer3 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    clockInOverlayViewModel.getClass();
                                    function14.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(4830307, new WorkViewFactory$$ExternalSyntheticLambda12(0, clockInOverlayViewModel, function14), composer3), composer3, 56);
                                    break;
                                case 4:
                                    ShiftDetailViewModel shiftDetailViewModel = (ShiftDetailViewModel) obj4;
                                    Function1 function15 = (Function1) obj5;
                                    Composer composer4 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    shiftDetailViewModel.getClass();
                                    function15.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-1285083414, new WorkViewFactory$$ExternalSyntheticLambda10(shiftDetailViewModel, function15, 0, (byte) 0), composer4), composer4, 56);
                                    break;
                                case 5:
                                    ShiftListViewModel shiftListViewModel = (ShiftListViewModel) obj4;
                                    Function1 function16 = (Function1) obj5;
                                    Composer composer5 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    shiftListViewModel.getClass();
                                    function16.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-777913700, new WorkViewFactory$$ExternalSyntheticLambda9(shiftListViewModel, function16), composer5), composer5, 56);
                                    break;
                                case 6:
                                    PayHomeViewModel payHomeViewModel = (PayHomeViewModel) obj4;
                                    Function1 function17 = (Function1) obj5;
                                    Composer composer6 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    payHomeViewModel.getClass();
                                    function17.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(251159668, new WorkViewFactory$$ExternalSyntheticLambda13(payHomeViewModel, function17, i10), composer6), composer6, 56);
                                    break;
                                default:
                                    PayHistoryListViewModel payHistoryListViewModel = (PayHistoryListViewModel) obj4;
                                    Function1 function18 = (Function1) obj5;
                                    Composer composer7 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    payHistoryListViewModel.getClass();
                                    function18.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(1669439418, new WorkViewFactory$$ExternalSyntheticLambda11(payHistoryListViewModel, function18), composer7), composer7, 56);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, 1038590243));
                }
                if (screen instanceof TakeBreakBottomSheetScreen) {
                    return new UiFactory.ComposeUi(SellerCardKt.f750lambda$1909908703);
                }
                if (screen instanceof DeclareCashTipBottomSheetScreen) {
                    return new UiFactory.ComposeUi(SellerCardKt.f755lambda$973799356);
                }
                if (screen instanceof ShiftNotStartedDialogScreen) {
                    return new UiFactory.ComposeUi(SellerCardKt.lambda$417272805);
                }
                if (screen instanceof ShiftNoteScreen) {
                    return new UiFactory.ComposeUi(SellerCardKt.f753lambda$537779040);
                }
                if (screen instanceof TimecardDetailScreen) {
                    return new UiFactory.ComposeUi(SellerCardKt.lambda$528145231);
                }
                if (screen instanceof ShiftDetailScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.work.views.WorkViewFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ LocalViewFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                            int i9 = i4;
                            int i10 = 0;
                            LocalViewFactory localViewFactory = this.f$0;
                            switch (i9) {
                                case 0:
                                    WorkHomeViewModel workHomeViewModel = (WorkHomeViewModel) obj4;
                                    Function1 function1 = (Function1) obj5;
                                    Composer composer = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    workHomeViewModel.getClass();
                                    function1.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(502105712, new WorkHomeViewKt$$ExternalSyntheticLambda0(workHomeViewModel, function1, 1), composer), composer, 56);
                                    break;
                                case 1:
                                    WorkWebViewModel workWebViewModel = (WorkWebViewModel) obj4;
                                    Function1 function12 = (Function1) obj5;
                                    int intValue = ((Integer) obj7).intValue();
                                    workWebViewModel.getClass();
                                    function12.getClass();
                                    WorkWebViewKt.WorkWebView(workWebViewModel, function12, (WebViewProvider) localViewFactory.addressSearcher, (String) localViewFactory.featureFlagManager, (AndroidDownloadManager$Factory$Impl) localViewFactory.mapEngineProvider, (Composer) obj6, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 2:
                                    MerchantPickerViewModel merchantPickerViewModel = (MerchantPickerViewModel) obj4;
                                    Function1 function13 = (Function1) obj5;
                                    Composer composer2 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    merchantPickerViewModel.getClass();
                                    function13.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(487149662, new WorkViewFactory$$ExternalSyntheticLambda14(merchantPickerViewModel, function13), composer2), composer2, 56);
                                    break;
                                case 3:
                                    ClockInOverlayViewModel clockInOverlayViewModel = (ClockInOverlayViewModel) obj4;
                                    Function1 function14 = (Function1) obj5;
                                    Composer composer3 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    clockInOverlayViewModel.getClass();
                                    function14.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(4830307, new WorkViewFactory$$ExternalSyntheticLambda12(0, clockInOverlayViewModel, function14), composer3), composer3, 56);
                                    break;
                                case 4:
                                    ShiftDetailViewModel shiftDetailViewModel = (ShiftDetailViewModel) obj4;
                                    Function1 function15 = (Function1) obj5;
                                    Composer composer4 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    shiftDetailViewModel.getClass();
                                    function15.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-1285083414, new WorkViewFactory$$ExternalSyntheticLambda10(shiftDetailViewModel, function15, 0, (byte) 0), composer4), composer4, 56);
                                    break;
                                case 5:
                                    ShiftListViewModel shiftListViewModel = (ShiftListViewModel) obj4;
                                    Function1 function16 = (Function1) obj5;
                                    Composer composer5 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    shiftListViewModel.getClass();
                                    function16.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-777913700, new WorkViewFactory$$ExternalSyntheticLambda9(shiftListViewModel, function16), composer5), composer5, 56);
                                    break;
                                case 6:
                                    PayHomeViewModel payHomeViewModel = (PayHomeViewModel) obj4;
                                    Function1 function17 = (Function1) obj5;
                                    Composer composer6 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    payHomeViewModel.getClass();
                                    function17.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(251159668, new WorkViewFactory$$ExternalSyntheticLambda13(payHomeViewModel, function17, i10), composer6), composer6, 56);
                                    break;
                                default:
                                    PayHistoryListViewModel payHistoryListViewModel = (PayHistoryListViewModel) obj4;
                                    Function1 function18 = (Function1) obj5;
                                    Composer composer7 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    payHistoryListViewModel.getClass();
                                    function18.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(1669439418, new WorkViewFactory$$ExternalSyntheticLambda11(payHistoryListViewModel, function18), composer7), composer7, 56);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, -1793504342));
                }
                if (screen instanceof ShiftListScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.work.views.WorkViewFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ LocalViewFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                            int i9 = i3;
                            int i10 = 0;
                            LocalViewFactory localViewFactory = this.f$0;
                            switch (i9) {
                                case 0:
                                    WorkHomeViewModel workHomeViewModel = (WorkHomeViewModel) obj4;
                                    Function1 function1 = (Function1) obj5;
                                    Composer composer = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    workHomeViewModel.getClass();
                                    function1.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(502105712, new WorkHomeViewKt$$ExternalSyntheticLambda0(workHomeViewModel, function1, 1), composer), composer, 56);
                                    break;
                                case 1:
                                    WorkWebViewModel workWebViewModel = (WorkWebViewModel) obj4;
                                    Function1 function12 = (Function1) obj5;
                                    int intValue = ((Integer) obj7).intValue();
                                    workWebViewModel.getClass();
                                    function12.getClass();
                                    WorkWebViewKt.WorkWebView(workWebViewModel, function12, (WebViewProvider) localViewFactory.addressSearcher, (String) localViewFactory.featureFlagManager, (AndroidDownloadManager$Factory$Impl) localViewFactory.mapEngineProvider, (Composer) obj6, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 2:
                                    MerchantPickerViewModel merchantPickerViewModel = (MerchantPickerViewModel) obj4;
                                    Function1 function13 = (Function1) obj5;
                                    Composer composer2 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    merchantPickerViewModel.getClass();
                                    function13.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(487149662, new WorkViewFactory$$ExternalSyntheticLambda14(merchantPickerViewModel, function13), composer2), composer2, 56);
                                    break;
                                case 3:
                                    ClockInOverlayViewModel clockInOverlayViewModel = (ClockInOverlayViewModel) obj4;
                                    Function1 function14 = (Function1) obj5;
                                    Composer composer3 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    clockInOverlayViewModel.getClass();
                                    function14.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(4830307, new WorkViewFactory$$ExternalSyntheticLambda12(0, clockInOverlayViewModel, function14), composer3), composer3, 56);
                                    break;
                                case 4:
                                    ShiftDetailViewModel shiftDetailViewModel = (ShiftDetailViewModel) obj4;
                                    Function1 function15 = (Function1) obj5;
                                    Composer composer4 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    shiftDetailViewModel.getClass();
                                    function15.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-1285083414, new WorkViewFactory$$ExternalSyntheticLambda10(shiftDetailViewModel, function15, 0, (byte) 0), composer4), composer4, 56);
                                    break;
                                case 5:
                                    ShiftListViewModel shiftListViewModel = (ShiftListViewModel) obj4;
                                    Function1 function16 = (Function1) obj5;
                                    Composer composer5 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    shiftListViewModel.getClass();
                                    function16.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-777913700, new WorkViewFactory$$ExternalSyntheticLambda9(shiftListViewModel, function16), composer5), composer5, 56);
                                    break;
                                case 6:
                                    PayHomeViewModel payHomeViewModel = (PayHomeViewModel) obj4;
                                    Function1 function17 = (Function1) obj5;
                                    Composer composer6 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    payHomeViewModel.getClass();
                                    function17.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(251159668, new WorkViewFactory$$ExternalSyntheticLambda13(payHomeViewModel, function17, i10), composer6), composer6, 56);
                                    break;
                                default:
                                    PayHistoryListViewModel payHistoryListViewModel = (PayHistoryListViewModel) obj4;
                                    Function1 function18 = (Function1) obj5;
                                    Composer composer7 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    payHistoryListViewModel.getClass();
                                    function18.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(1669439418, new WorkViewFactory$$ExternalSyntheticLambda11(payHistoryListViewModel, function18), composer7), composer7, 56);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, -1363916964));
                }
                if (screen instanceof WorkPayHomeScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.work.views.WorkViewFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ LocalViewFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                            int i9 = i2;
                            int i10 = 0;
                            LocalViewFactory localViewFactory = this.f$0;
                            switch (i9) {
                                case 0:
                                    WorkHomeViewModel workHomeViewModel = (WorkHomeViewModel) obj4;
                                    Function1 function1 = (Function1) obj5;
                                    Composer composer = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    workHomeViewModel.getClass();
                                    function1.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(502105712, new WorkHomeViewKt$$ExternalSyntheticLambda0(workHomeViewModel, function1, 1), composer), composer, 56);
                                    break;
                                case 1:
                                    WorkWebViewModel workWebViewModel = (WorkWebViewModel) obj4;
                                    Function1 function12 = (Function1) obj5;
                                    int intValue = ((Integer) obj7).intValue();
                                    workWebViewModel.getClass();
                                    function12.getClass();
                                    WorkWebViewKt.WorkWebView(workWebViewModel, function12, (WebViewProvider) localViewFactory.addressSearcher, (String) localViewFactory.featureFlagManager, (AndroidDownloadManager$Factory$Impl) localViewFactory.mapEngineProvider, (Composer) obj6, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 2:
                                    MerchantPickerViewModel merchantPickerViewModel = (MerchantPickerViewModel) obj4;
                                    Function1 function13 = (Function1) obj5;
                                    Composer composer2 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    merchantPickerViewModel.getClass();
                                    function13.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(487149662, new WorkViewFactory$$ExternalSyntheticLambda14(merchantPickerViewModel, function13), composer2), composer2, 56);
                                    break;
                                case 3:
                                    ClockInOverlayViewModel clockInOverlayViewModel = (ClockInOverlayViewModel) obj4;
                                    Function1 function14 = (Function1) obj5;
                                    Composer composer3 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    clockInOverlayViewModel.getClass();
                                    function14.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(4830307, new WorkViewFactory$$ExternalSyntheticLambda12(0, clockInOverlayViewModel, function14), composer3), composer3, 56);
                                    break;
                                case 4:
                                    ShiftDetailViewModel shiftDetailViewModel = (ShiftDetailViewModel) obj4;
                                    Function1 function15 = (Function1) obj5;
                                    Composer composer4 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    shiftDetailViewModel.getClass();
                                    function15.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-1285083414, new WorkViewFactory$$ExternalSyntheticLambda10(shiftDetailViewModel, function15, 0, (byte) 0), composer4), composer4, 56);
                                    break;
                                case 5:
                                    ShiftListViewModel shiftListViewModel = (ShiftListViewModel) obj4;
                                    Function1 function16 = (Function1) obj5;
                                    Composer composer5 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    shiftListViewModel.getClass();
                                    function16.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-777913700, new WorkViewFactory$$ExternalSyntheticLambda9(shiftListViewModel, function16), composer5), composer5, 56);
                                    break;
                                case 6:
                                    PayHomeViewModel payHomeViewModel = (PayHomeViewModel) obj4;
                                    Function1 function17 = (Function1) obj5;
                                    Composer composer6 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    payHomeViewModel.getClass();
                                    function17.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(251159668, new WorkViewFactory$$ExternalSyntheticLambda13(payHomeViewModel, function17, i10), composer6), composer6, 56);
                                    break;
                                default:
                                    PayHistoryListViewModel payHistoryListViewModel = (PayHistoryListViewModel) obj4;
                                    Function1 function18 = (Function1) obj5;
                                    Composer composer7 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    payHistoryListViewModel.getClass();
                                    function18.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(1669439418, new WorkViewFactory$$ExternalSyntheticLambda11(payHistoryListViewModel, function18), composer7), composer7, 56);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, -1581850316));
                }
                if (screen instanceof WorkPayHistoryListScreen) {
                    final int i9 = 7;
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.work.views.WorkViewFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ LocalViewFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                            int i92 = i9;
                            int i10 = 0;
                            LocalViewFactory localViewFactory = this.f$0;
                            switch (i92) {
                                case 0:
                                    WorkHomeViewModel workHomeViewModel = (WorkHomeViewModel) obj4;
                                    Function1 function1 = (Function1) obj5;
                                    Composer composer = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    workHomeViewModel.getClass();
                                    function1.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(502105712, new WorkHomeViewKt$$ExternalSyntheticLambda0(workHomeViewModel, function1, 1), composer), composer, 56);
                                    break;
                                case 1:
                                    WorkWebViewModel workWebViewModel = (WorkWebViewModel) obj4;
                                    Function1 function12 = (Function1) obj5;
                                    int intValue = ((Integer) obj7).intValue();
                                    workWebViewModel.getClass();
                                    function12.getClass();
                                    WorkWebViewKt.WorkWebView(workWebViewModel, function12, (WebViewProvider) localViewFactory.addressSearcher, (String) localViewFactory.featureFlagManager, (AndroidDownloadManager$Factory$Impl) localViewFactory.mapEngineProvider, (Composer) obj6, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 2:
                                    MerchantPickerViewModel merchantPickerViewModel = (MerchantPickerViewModel) obj4;
                                    Function1 function13 = (Function1) obj5;
                                    Composer composer2 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    merchantPickerViewModel.getClass();
                                    function13.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(487149662, new WorkViewFactory$$ExternalSyntheticLambda14(merchantPickerViewModel, function13), composer2), composer2, 56);
                                    break;
                                case 3:
                                    ClockInOverlayViewModel clockInOverlayViewModel = (ClockInOverlayViewModel) obj4;
                                    Function1 function14 = (Function1) obj5;
                                    Composer composer3 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    clockInOverlayViewModel.getClass();
                                    function14.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(4830307, new WorkViewFactory$$ExternalSyntheticLambda12(0, clockInOverlayViewModel, function14), composer3), composer3, 56);
                                    break;
                                case 4:
                                    ShiftDetailViewModel shiftDetailViewModel = (ShiftDetailViewModel) obj4;
                                    Function1 function15 = (Function1) obj5;
                                    Composer composer4 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    shiftDetailViewModel.getClass();
                                    function15.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-1285083414, new WorkViewFactory$$ExternalSyntheticLambda10(shiftDetailViewModel, function15, 0, (byte) 0), composer4), composer4, 56);
                                    break;
                                case 5:
                                    ShiftListViewModel shiftListViewModel = (ShiftListViewModel) obj4;
                                    Function1 function16 = (Function1) obj5;
                                    Composer composer5 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    shiftListViewModel.getClass();
                                    function16.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-777913700, new WorkViewFactory$$ExternalSyntheticLambda9(shiftListViewModel, function16), composer5), composer5, 56);
                                    break;
                                case 6:
                                    PayHomeViewModel payHomeViewModel = (PayHomeViewModel) obj4;
                                    Function1 function17 = (Function1) obj5;
                                    Composer composer6 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    payHomeViewModel.getClass();
                                    function17.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(251159668, new WorkViewFactory$$ExternalSyntheticLambda13(payHomeViewModel, function17, i10), composer6), composer6, 56);
                                    break;
                                default:
                                    PayHistoryListViewModel payHistoryListViewModel = (PayHistoryListViewModel) obj4;
                                    Function1 function18 = (Function1) obj5;
                                    Composer composer7 = (Composer) obj6;
                                    ((Integer) obj7).getClass();
                                    payHistoryListViewModel.getClass();
                                    function18.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(1669439418, new WorkViewFactory$$ExternalSyntheticLambda11(payHistoryListViewModel, function18), composer7), composer7, 56);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, -643740934));
                }
                if (screen instanceof WorkTaxFormsListScreen) {
                    return new UiFactory.ComposeUi(SellerCardKt.f754lambda$624248543);
                }
                if (screen instanceof WorkTaxFormDownloaderScreen) {
                    return new UiFactory.ComposeUi(SellerCardKt.f751lambda$2133175820);
                }
                return null;
        }
    }

    public UiFactory.ComposeUi provideLocalComposeUi(Function4 function4) {
        return new UiFactory.ComposeUi(new ComposableLambdaImpl(new LocalViewFactory$$ExternalSyntheticLambda4(0, this, function4), true, 191388071));
    }

    public LocalViewFactory(RealImageLoader realImageLoader, RealImageLoader realImageLoader2, ElementBoundsRegistry elementBoundsRegistry, CardRegistry cardRegistry) {
        this.$r8$classId = 6;
        this.imageLoader = realImageLoader;
        this.addressSearcher = realImageLoader2;
        this.mapEngineProvider = elementBoundsRegistry;
        this.featureFlagManager = cardRegistry;
    }

    public LocalViewFactory(CancelPaymentView$Factory$Impl cancelPaymentView$Factory$Impl, CheckPaymentStatusDialog$Factory$Impl checkPaymentStatusDialog$Factory$Impl, PaymentPasscodeDialogView$Factory$Impl paymentPasscodeDialogView$Factory$Impl, TreehouseReceiptView$Factory$Impl treehouseReceiptView$Factory$Impl, RealImageLoader realImageLoader, RealCashVibrator realCashVibrator) {
        this.$r8$classId = 3;
        this.addressSearcher = paymentPasscodeDialogView$Factory$Impl;
        this.mapEngineProvider = treehouseReceiptView$Factory$Impl;
        this.imageLoader = realImageLoader;
        this.featureFlagManager = realCashVibrator;
    }

    public LocalViewFactory(FormBlockerView$Factory$Impl formBlockerView$Factory$Impl, FormView$Factory$Impl formView$Factory$Impl, RealImageLoader realImageLoader, GoogleMapEngineProvider googleMapEngineProvider) {
        this.$r8$classId = 2;
        this.addressSearcher = formBlockerView$Factory$Impl;
        this.featureFlagManager = formView$Factory$Impl;
        this.imageLoader = realImageLoader;
        this.mapEngineProvider = googleMapEngineProvider;
    }

    public /* synthetic */ LocalViewFactory(Object obj, RealImageLoader realImageLoader, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.addressSearcher = obj;
        this.imageLoader = realImageLoader;
        this.mapEngineProvider = obj2;
        this.featureFlagManager = obj3;
    }
}
