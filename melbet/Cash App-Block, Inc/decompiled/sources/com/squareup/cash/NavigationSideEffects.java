package com.squareup.cash;

import android.content.Context;
import androidx.datastore.core.SimpleActor;
import app.cash.broadway.screen.Screen;
import app.cash.cdp.integration.CdpModule$Companion$$ExternalSyntheticLambda0;
import app.cash.local.views.LocalViewFactory;
import app.cash.passcode.flows.RealPasscodeFlowStarter;
import coil3.RealImageLoader;
import coil3.network.NetworkFetcher$doFetch$2;
import com.google.zxing.Result;
import com.miteksystems.misnap.camera.a.n;
import com.squareup.analytics.cdp.CdpAnalytics;
import com.squareup.cash.account.presenters.settings.PasskeysSetting;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletRepository;
import com.squareup.cash.appforeground.AppForegroundStateProvider;
import com.squareup.cash.appmessages.AppMessageSyncer;
import com.squareup.cash.arcade.ArcadeModule$ProvideHapticVibratorMetroFactory;
import com.squareup.cash.attribution.ConversionListener;
import com.squareup.cash.autofillweb.api.AutofillWebManager;
import com.squareup.cash.autofillweb.real.RealAutofillWebManagerProvider;
import com.squareup.cash.autofillweb.real.RealCashFillJsStore;
import com.squareup.cash.backstack.real.RealBackStackSnapshot;
import com.squareup.cash.beacondetection.real.BeaconDetectionSetupTeardown;
import com.squareup.cash.bitcoin.formatter.RealBitcoinFormatter;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.flow.RealMultiBlockerFacilitator;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.boost.backend.RealBoostRepository;
import com.squareup.cash.borrow.backend.RealBorrowDataManager;
import com.squareup.cash.braze.RealBrazeConfigurator;
import com.squareup.cash.buynowpaylater.screens.AfterPayOrderDetailsScreen;
import com.squareup.cash.buynowpaylater.screens.AfterPayOrderHubScreen;
import com.squareup.cash.buynowpaylater.screens.AfterPayScreen;
import com.squareup.cash.cdf.afterpayhub.AfterpayHubBrowseStart;
import com.squareup.cash.cdf.afterpayhub.AfterpayHubBrowseViewOrderDetails;
import com.squareup.cash.clientroutes.RealClientRouteParser;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.clientsync.syncer.RealClientSyncer;
import com.squareup.cash.clipboard.RealClipboardObserver;
import com.squareup.cash.core.navigationcontainer.navigator.EventListener;
import com.squareup.cash.crypto.address.RealCryptoInvoiceParser;
import com.squareup.cash.crypto.backend.profile.RealBitcoinProfileRepo;
import com.squareup.cash.crypto.navigation.CryptoFlowStarter;
import com.squareup.cash.data.TemporaryStorage;
import com.squareup.cash.data.contacts.RealContactSync;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.data.profile.RealProfileNotificationsRepository;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.e2ee.signature.RealSignatureRepo;
import com.squareup.cash.e2ee.signature.generator.SignatureDeleter;
import com.squareup.cash.e2ee.signature.local.RealLocalSignatureStore;
import com.squareup.cash.e2ee.signature.validator.SignatureValidator;
import com.squareup.cash.e2ee.trifle.RealTrifleLogger;
import com.squareup.cash.e2ee.trifle.RealTrifleService;
import com.squareup.cash.education.stories.backend.real.RealEducationStoryRepository;
import com.squareup.cash.education.stories.service.api.EducationStoryService;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.filament.RealFilamentSupportProvider;
import com.squareup.cash.fileupload.real.RealFileUploadService;
import com.squareup.cash.fileupload.real.RealFileValidator$Factory$Impl;
import com.squareup.cash.fillr.real.FillrInitializer;
import com.squareup.cash.fillr.real.RealFillrWebManager;
import com.squareup.cash.gcl.RealGlobalConfigManager;
import com.squareup.cash.gps.backend.real.AndroidLocationProvider;
import com.squareup.cash.history.views.CancelPaymentView$Factory$Impl;
import com.squareup.cash.history.views.CheckPaymentStatusDialog$Factory$Impl;
import com.squareup.cash.history.views.PaymentPasscodeDialogView$Factory$Impl;
import com.squareup.cash.history.views.receipt.TreehouseReceiptView$Factory$Impl;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.intent.RealDeepLinking;
import com.squareup.cash.interaction.InteractionScreenViewLogger;
import com.squareup.cash.investing.backend.real.PersistentEntityPriceCache;
import com.squareup.cash.investing.backend.real.RealEntityPriceRefresher;
import com.squareup.cash.investing.components.InvestingHomeView$Factory$Impl;
import com.squareup.cash.investing.components.InvestingMetricView$Factory$Impl;
import com.squareup.cash.investing.components.InvestingStockSelectionView$Factory$Impl;
import com.squareup.cash.investing.components.inject.InvestingViewFactory;
import com.squareup.cash.investing.components.search.InvestingSearchView$Factory$Impl;
import com.squareup.cash.investing.components.teengraduation.StocksTransferEtaFullScreenView$Factory$Impl;
import com.squareup.cash.keystore.RealKeyStoreProvider;
import com.squareup.cash.knot.backend.real.RealKnotLauncher;
import com.squareup.cash.music.views.MusicViewFactory$MetroFactory;
import com.squareup.cash.notifications.NotificationSettingsChecker;
import com.squareup.cash.notifications.RealAndroidNotificationSettingsChecker;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.offers.backend.real.RealOffersSheetRepository;
import com.squareup.cash.payments.backend.api.PersonalizationRepository;
import com.squareup.cash.payments.presenters.RealPersonalizePaymentManager;
import com.squareup.cash.permissions.PermissionChecker;
import com.squareup.cash.pools.backend.real.RealPoolsRepository;
import com.squareup.cash.profile.screens.ProfileLauncher;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.recipients.backend.real.RealRecipientFinder;
import com.squareup.cash.recipients.data.RealRecipientRepository;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.retro.views.RetroUiFactory;
import com.squareup.cash.score.views.ScoreUiFactory;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.session.backend.SetupTeardownRunner$run$2;
import com.squareup.cash.storage.AndroidFileProvider;
import com.squareup.cash.storage.RealFileDownloader;
import com.squareup.cash.storage.SandboxJanitor;
import com.squareup.cash.storage.StorageLink;
import com.squareup.cash.storage.StorageLinker;
import com.squareup.cash.support.backend.real.articles.RealArticlesService;
import com.squareup.cash.support.chat.backend.real.RealChatNotificationSuppressor;
import com.squareup.cash.support.chat.backend.real.RealConversationService;
import com.squareup.cash.support.chat.screens.SupportChatScreens;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.cash.tax.presenters.TaxWebAppPresenter$models$1$1;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.userjourneys.tracker.UserJourneyTracker;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.wallet.backend.real.RealWalletAnalyticsHelper;
import com.squareup.cash.wallet.data.IssuedCardManager;
import com.squareup.cash.wallet.screens.CardControlDialogScreen;
import com.squareup.cash.wallet.screens.WalletHomeScreen;
import com.squareup.cash.work.analytics.ShiftsAnalytics;
import com.squareup.cash.work.data.real.RealTeamMemberIdProvider;
import com.squareup.cash.work.service.api.scheduling.SchedulingService;
import com.squareup.cash.work.service.api.timecards.TimecardsService;
import com.squareup.cash.work.service.real.WorkCookieJar;
import com.squareup.cash.work.session.RealSelectedMerchantProvider;
import com.squareup.cash.work.tinygraph.real.RealLocationRepository;
import com.squareup.moshi.Moshi;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.cashsessionrecorder.app.v1.ScreenshotBundleService;
import com.squareup.protos.cash.marketprices.service.MarketPricesAppService;
import com.squareup.protos.cash.notificationsettings.api.v1.NotificationSettingsService;
import com.squareup.protos.cash.paymenttemplate.v1.PaymentTemplateService;
import com.squareup.protos.cash.pools.PoolsService;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.scannerview.SizeMap;
import com.squareup.util.coroutines.Signal;
import com.stripe.hcaptcha.HCaptcha;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DelegateFactory;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExecutorCoroutineDispatcherImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import okhttp3.internal.publicsuffix.AssetPublicSuffixList;
import retrofit2.Retrofit;

/* loaded from: classes.dex */
public final class NavigationSideEffects extends EventListener {
    public final ConversionListener afterPayNavigationAnalyticsHelper;
    public final BlockerFlowListener blockerFlowAnalytics;
    public final CoroutineScope coroutineScope;
    public final RealMultiBlockerFacilitator multiBlockerFacilitator;
    public final LinkedHashMap navigationState = new LinkedHashMap();
    public final Retrofit.Builder supportNavigationSideEffects;
    public final RealWalletAnalyticsHelper walletAnalyticsHelper;

    public NavigationSideEffects(Retrofit.Builder builder, ConversionListener conversionListener, CoroutineScope coroutineScope, RealMultiBlockerFacilitator realMultiBlockerFacilitator, BlockerFlowListener blockerFlowListener, RealWalletAnalyticsHelper realWalletAnalyticsHelper) {
        this.supportNavigationSideEffects = builder;
        this.afterPayNavigationAnalyticsHelper = conversionListener;
        this.coroutineScope = coroutineScope;
        this.multiBlockerFacilitator = realMultiBlockerFacilitator;
        this.blockerFlowAnalytics = blockerFlowListener;
        this.walletAnalyticsHelper = realWalletAnalyticsHelper;
    }

    @Override // com.squareup.cash.core.navigationcontainer.navigator.EventListener
    public final void answerEnd(EventListener.Initiator initiator, EventListener.State state) {
        onNavigation((EventListener.State) this.navigationState.remove(state.identifier), state, true);
    }

    @Override // com.squareup.cash.core.navigationcontainer.navigator.EventListener
    public final void answerStart(EventListener.Initiator initiator, EventListener.State state) {
        this.navigationState.put(state.identifier, state);
    }

    @Override // com.squareup.cash.core.navigationcontainer.navigator.EventListener
    public final void backEnd(EventListener.State state) {
        onNavigation((EventListener.State) this.navigationState.remove(state.identifier), state, true);
    }

    @Override // com.squareup.cash.core.navigationcontainer.navigator.EventListener
    public final void backStart(EventListener.State state) {
        this.navigationState.put(state.identifier, state);
    }

    @Override // com.squareup.cash.core.navigationcontainer.navigator.EventListener
    public final void navigationEnd(Screen screen, EventListener.Initiator initiator, EventListener.State state) {
        EventListener.Location location;
        screen.getClass();
        EventListener.State state2 = (EventListener.State) this.navigationState.remove(state.identifier);
        onNavigation(state2, state, !CollectionsKt.contains(state.backStack.screens(), (state2 == null || (location = state2.fullScreen) == null) ? null : location.screen));
    }

    @Override // com.squareup.cash.core.navigationcontainer.navigator.EventListener
    public final void navigationStart(Screen screen, EventListener.Initiator initiator, EventListener.State state) {
        screen.getClass();
        this.navigationState.put(state.identifier, state);
    }

    public final void onNavigation(EventListener.State state, EventListener.State state2, boolean z) {
        EventListener.Location location;
        Screen screen;
        EventListener.Location location2;
        Screen screen2;
        BlockersData blockersData;
        BlockersData blockersData2;
        if (state == null || (location = state.fullScreen) == null || (screen = location.screen) == null || (location2 = state2.fullScreen) == null || (screen2 = location2.screen) == null || screen.equals(screen2)) {
            return;
        }
        RealBackStackSnapshot realBackStackSnapshot = state2.backStack;
        if (z && (screen instanceof ProfileScreens.ProfileScreen)) {
            LinkedHashMap linkedHashMap = ProfileLauncher.launchedScreens;
            ProfileLauncher.navigatingAwayFrom(screen);
        }
        Retrofit.Builder builder = this.supportNavigationSideEffects;
        int i = 0;
        ((RealChatNotificationSuppressor) builder.callFactory).onChatScreen = (screen2 instanceof SupportChatScreens.FlowScreen.ChatScreen) || (screen2 instanceof SupportScreens.FlowScreens.SupportHomeScreen);
        Continuation continuation = null;
        if ((screen instanceof SupportScreens.FlowScreens) && !(screen2 instanceof SupportScreens) && (z || screen2.equals(((SupportScreens.FlowScreens) screen).getData().getExitScreen()))) {
            JobKt.launch$default((CoroutineScope) builder.callbackExecutor, null, null, new TaxWebAppPresenter$models$1$1(builder, screen, (Continuation) null), 3);
            RealArticlesService realArticlesService = (RealArticlesService) builder.converterFactories;
            realArticlesService.articleCache.clear();
            realArticlesService.linkCache.clear();
            realArticlesService.cssCache = null;
        }
        this.blockerFlowAnalytics.onNavigation(screen, screen2, z);
        if (!z && (screen2 instanceof AfterPayScreen)) {
            AfterPayScreen afterPayScreen = (AfterPayScreen) screen2;
            if (!afterPayScreen.isBlockerExitScreen()) {
                Analytics analytics = this.afterPayNavigationAnalyticsHelper.analytics;
                if (afterPayScreen instanceof AfterPayOrderDetailsScreen) {
                    analytics.track(new AfterpayHubBrowseViewOrderDetails(((AfterPayOrderDetailsScreen) screen2).orderId), null);
                } else if (afterPayScreen instanceof AfterPayOrderHubScreen) {
                    analytics.track(new AfterpayHubBrowseStart(((AfterPayOrderHubScreen) screen2).fromLocation), null);
                }
            }
        }
        if ((screen2 instanceof WalletHomeScreen) && !z) {
            boolean z2 = screen instanceof BlockersScreens;
            RealWalletAnalyticsHelper realWalletAnalyticsHelper = this.walletAnalyticsHelper;
            if (z2) {
                Iterator it = realBackStackSnapshot.screens().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    } else if (((Screen) it.next()) instanceof BlockersScreens) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i > 0) {
                    Screen screen3 = (Screen) realBackStackSnapshot.screens().get(i - 1);
                    if (!(screen3 instanceof WalletHomeScreen) && !(screen3 instanceof CardControlDialogScreen)) {
                        realWalletAnalyticsHelper.resetAnalyticsState();
                    }
                }
            } else if (!(screen instanceof WalletHomeScreen) && !(screen instanceof CardControlDialogScreen)) {
                realWalletAnalyticsHelper.resetAnalyticsState();
            }
        }
        BlockersScreens blockersScreens = screen instanceof BlockersScreens ? (BlockersScreens) screen : null;
        String str = (blockersScreens == null || (blockersData2 = blockersScreens.getBlockersData()) == null) ? null : blockersData2.groupId;
        BlockersScreens blockersScreens2 = screen2 instanceof BlockersScreens ? (BlockersScreens) screen2 : null;
        String str2 = (blockersScreens2 == null || (blockersData = blockersScreens2.getBlockersData()) == null) ? null : blockersData.groupId;
        if (str == null || str.equals(str2)) {
            return;
        }
        JobKt.launch$default(this.coroutineScope, null, null, new NetworkFetcher$doFetch$2(this, str, continuation, 11), 3);
    }

    @Override // com.squareup.cash.core.navigationcontainer.navigator.EventListener
    public final void questionEnd(Screen screen, EventListener.Initiator initiator, EventListener.State state) {
        screen.getClass();
        onNavigation((EventListener.State) this.navigationState.remove(state.identifier), state, false);
    }

    @Override // com.squareup.cash.core.navigationcontainer.navigator.EventListener
    public final void questionStart(Screen screen, EventListener.Initiator initiator, EventListener.State state) {
        screen.getClass();
        this.navigationState.put(state.identifier, state);
    }

    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final Provider afterPayNavigationAnalyticsHelper;
        public final Provider blockerFlowAnalytics;
        public final Provider coroutineScope;
        public final Provider multiBlockerFacilitator;
        public final Provider supportNavigationSideEffects;
        public final Provider walletAnalyticsHelper;

        public MetroFactory(RealSessionFlags.MetroFactory metroFactory, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, RealContactSync.MetroFactory metroFactory2, LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2) {
            this.$r8$classId = 12;
            this.multiBlockerFacilitator = metroFactory;
            this.supportNavigationSideEffects = doubleCheck;
            this.afterPayNavigationAnalyticsHelper = doubleCheck2;
            this.blockerFlowAnalytics = metroFactory2;
            this.coroutineScope = lambdaProvider;
            this.walletAnalyticsHelper = lambdaProvider2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            Provider provider = this.walletAnalyticsHelper;
            Provider provider2 = this.multiBlockerFacilitator;
            Provider provider3 = this.blockerFlowAnalytics;
            Provider provider4 = this.coroutineScope;
            Provider provider5 = this.afterPayNavigationAnalyticsHelper;
            Provider provider6 = this.supportNavigationSideEffects;
            switch (i) {
                case 0:
                    Retrofit.Builder builder = (Retrofit.Builder) ((RealFilamentSupportProvider.MetroFactory) provider6).invoke();
                    ConversionListener conversionListener = (ConversionListener) ((RealBrazeConfigurator.MetroFactory) provider5).invoke();
                    CoroutineScope coroutineScope = (CoroutineScope) ((InstanceFactory) provider4).value;
                    RealMultiBlockerFacilitator realMultiBlockerFacilitator = (RealMultiBlockerFacilitator) provider2.invoke();
                    BlockerFlowListener blockerFlowListener = (BlockerFlowListener) provider3.invoke();
                    RealWalletAnalyticsHelper realWalletAnalyticsHelper = (RealWalletAnalyticsHelper) provider.invoke();
                    coroutineScope.getClass();
                    realMultiBlockerFacilitator.getClass();
                    blockerFlowListener.getClass();
                    realWalletAnalyticsHelper.getClass();
                    return new NavigationSideEffects(builder, conversionListener, coroutineScope, realMultiBlockerFacilitator, blockerFlowListener, realWalletAnalyticsHelper);
                case 1:
                    SessionManager sessionManager = (SessionManager) provider2.invoke();
                    StorageLinker storageLinker = (StorageLinker) ((LambdaProvider) provider5).lambda.invoke();
                    StorageLink storageLink = (StorageLink) ((InstanceFactory) provider4).value;
                    CoroutineScope coroutineScope2 = (CoroutineScope) ((InstanceFactory) provider).value;
                    CoroutineContext coroutineContext = (CoroutineContext) provider3.invoke();
                    sessionManager.getClass();
                    storageLinker.getClass();
                    storageLink.getClass();
                    coroutineScope2.getClass();
                    coroutineContext.getClass();
                    CdpAnalytics cdpAnalytics = new CdpAnalytics((RealPasscodeFlowStarter.MetroFactory) provider6, new CdpModule$Companion$$ExternalSyntheticLambda0(sessionManager, 0));
                    JobKt.launch$default(coroutineScope2, coroutineContext, null, new SetupTeardownRunner$run$2(cdpAnalytics, storageLinker, storageLink, null, 1), 2);
                    return cdpAnalytics;
                case 2:
                    FeatureFlagManager featureFlagManager = (FeatureFlagManager) provider2.invoke();
                    RealFillrWebManager realFillrWebManager = (RealFillrWebManager) ((DoubleCheck) provider6).getValue();
                    AutofillWebManager autofillWebManager = (AutofillWebManager) ((AppMessageSyncer.MetroFactory) provider5).invoke();
                    RealCashFillJsStore realCashFillJsStore = (RealCashFillJsStore) provider3.invoke();
                    SizeMap sizeMap = (SizeMap) ((ArcadeModule$ProvideHapticVibratorMetroFactory) provider).invoke();
                    CoroutineScope coroutineScope3 = (CoroutineScope) ((InstanceFactory) provider4).value;
                    featureFlagManager.getClass();
                    realFillrWebManager.getClass();
                    realCashFillJsStore.getClass();
                    coroutineScope3.getClass();
                    return new RealAutofillWebManagerProvider(featureFlagManager, realFillrWebManager, autofillWebManager, realCashFillJsStore, sizeMap, coroutineScope3);
                case 3:
                    Context context = (Context) provider2.invoke();
                    FeatureFlagManager featureFlagManager2 = (FeatureFlagManager) provider3.invoke();
                    PermissionChecker permissionChecker = (PermissionChecker) ((LambdaProvider) provider6).lambda.invoke();
                    AppForegroundStateProvider appForegroundStateProvider = (AppForegroundStateProvider) ((LambdaProvider) provider5).lambda.invoke();
                    AndroidLocationProvider androidLocationProvider = (AndroidLocationProvider) ((LambdaProvider) provider4).lambda.invoke();
                    ConversionListener conversionListener2 = (ConversionListener) ((ArcadeModule$ProvideHapticVibratorMetroFactory) provider).invoke();
                    context.getClass();
                    featureFlagManager2.getClass();
                    permissionChecker.getClass();
                    appForegroundStateProvider.getClass();
                    androidLocationProvider.getClass();
                    return new BeaconDetectionSetupTeardown(context, featureFlagManager2, permissionChecker, appForegroundStateProvider, androidLocationProvider, conversionListener2);
                case 4:
                    SyncValueReader syncValueReader = (SyncValueReader) provider2.invoke();
                    n nVar = (n) ((RealGlobalConfigManager.MetroFactory) provider6).invoke();
                    Analytics analytics = (Analytics) provider3.invoke();
                    ErrorReporter errorReporter = (ErrorReporter) provider.invoke();
                    FeatureFlagManager featureFlagManager3 = (FeatureFlagManager) provider5.invoke();
                    String str = (String) provider4.invoke();
                    syncValueReader.getClass();
                    analytics.getClass();
                    errorReporter.getClass();
                    featureFlagManager3.getClass();
                    str.getClass();
                    return new RealBorrowDataManager(syncValueReader, nVar, analytics, errorReporter, featureFlagManager3, str);
                case 5:
                    NotificationSettingsService notificationSettingsService = (NotificationSettingsService) provider2.invoke();
                    FeatureFlagManager featureFlagManager4 = (FeatureFlagManager) provider3.invoke();
                    NotificationSettingsChecker notificationSettingsChecker = (NotificationSettingsChecker) ((RealAndroidNotificationSettingsChecker.MetroFactory) provider6).invoke();
                    SyncValueReader syncValueReader2 = (SyncValueReader) provider.invoke();
                    CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) provider5.invoke();
                    CoroutineContext coroutineContext2 = (CoroutineContext) provider4.invoke();
                    notificationSettingsService.getClass();
                    featureFlagManager4.getClass();
                    syncValueReader2.getClass();
                    cashAccountDatabaseImpl.getClass();
                    coroutineContext2.getClass();
                    return new RealProfileNotificationsRepository(notificationSettingsService, featureFlagManager4, notificationSettingsChecker, syncValueReader2, cashAccountDatabaseImpl, coroutineContext2);
                case 6:
                    SimpleActor simpleActor = (SimpleActor) ((RealFileDownloader.MetroFactory) provider6).invoke();
                    SignatureDeleter signatureDeleter = (SignatureDeleter) ((RealKeyStoreProvider.MetroFactory) provider5).invoke();
                    SignatureValidator signatureValidator = (SignatureValidator) ((TemporaryStorage.MetroFactory) provider4).invoke();
                    RealTrifleLogger realTrifleLogger = (RealTrifleLogger) provider2.invoke();
                    RealLocalSignatureStore realLocalSignatureStore = (RealLocalSignatureStore) provider3.invoke();
                    CoroutineContext coroutineContext3 = (CoroutineContext) provider.invoke();
                    realTrifleLogger.getClass();
                    realLocalSignatureStore.getClass();
                    coroutineContext3.getClass();
                    return new RealSignatureRepo(simpleActor, signatureDeleter, signatureValidator, realTrifleLogger, realLocalSignatureStore, coroutineContext3);
                case 7:
                    FeatureFlagManager featureFlagManager5 = (FeatureFlagManager) provider2.invoke();
                    EducationStoryService educationStoryService = (EducationStoryService) ((PasskeysSetting.MetroFactory) provider6).invoke();
                    SizeMap sizeMap2 = new SizeMap(19);
                    AndroidClock androidClock = (AndroidClock) provider3.invoke();
                    ErrorReporter errorReporter2 = (ErrorReporter) provider.invoke();
                    CoroutineContext coroutineContext4 = (CoroutineContext) provider5.invoke();
                    Result result = (Result) ((FillrInitializer.MetroFactory) provider4).invoke();
                    featureFlagManager5.getClass();
                    androidClock.getClass();
                    errorReporter2.getClass();
                    coroutineContext4.getClass();
                    return new RealEducationStoryRepository(featureFlagManager5, educationStoryService, sizeMap2, androidClock, errorReporter2, coroutineContext4, result);
                case 8:
                    CancelPaymentView$Factory$Impl cancelPaymentView$Factory$Impl = (CancelPaymentView$Factory$Impl) ((InstanceFactory) provider4).value;
                    CheckPaymentStatusDialog$Factory$Impl checkPaymentStatusDialog$Factory$Impl = (CheckPaymentStatusDialog$Factory$Impl) ((InstanceFactory) provider6).value;
                    PaymentPasscodeDialogView$Factory$Impl paymentPasscodeDialogView$Factory$Impl = (PaymentPasscodeDialogView$Factory$Impl) ((InstanceFactory) provider5).value;
                    TreehouseReceiptView$Factory$Impl treehouseReceiptView$Factory$Impl = (TreehouseReceiptView$Factory$Impl) ((InstanceFactory) provider).value;
                    RealImageLoader realImageLoader = (RealImageLoader) provider2.invoke();
                    RealCashVibrator realCashVibrator = (RealCashVibrator) provider3.invoke();
                    cancelPaymentView$Factory$Impl.getClass();
                    checkPaymentStatusDialog$Factory$Impl.getClass();
                    paymentPasscodeDialogView$Factory$Impl.getClass();
                    treehouseReceiptView$Factory$Impl.getClass();
                    realImageLoader.getClass();
                    realCashVibrator.getClass();
                    return new LocalViewFactory(cancelPaymentView$Factory$Impl, checkPaymentStatusDialog$Factory$Impl, paymentPasscodeDialogView$Factory$Impl, treehouseReceiptView$Factory$Impl, realImageLoader, realCashVibrator);
                case 9:
                    RealObservabilityManager realObservabilityManager = (RealObservabilityManager) provider2.invoke();
                    AppForegroundStateProvider appForegroundStateProvider2 = (AppForegroundStateProvider) provider3.invoke();
                    Analytics analytics2 = (Analytics) provider.invoke();
                    Moshi moshi = (Moshi) provider6.invoke();
                    UserJourneyTracker userJourneyTracker = (UserJourneyTracker) ((DoubleCheck) provider5).getValue();
                    CoroutineScope coroutineScope4 = (CoroutineScope) provider4.invoke();
                    DefaultScheduler defaultScheduler = Dispatchers.Default;
                    DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
                    realObservabilityManager.getClass();
                    appForegroundStateProvider2.getClass();
                    analytics2.getClass();
                    moshi.getClass();
                    userJourneyTracker.getClass();
                    coroutineScope4.getClass();
                    defaultIoScheduler.getClass();
                    return new InteractionScreenViewLogger(realObservabilityManager, appForegroundStateProvider2, analytics2, moshi, userJourneyTracker, coroutineScope4, defaultIoScheduler);
                case 10:
                    MarketPricesAppService marketPricesAppService = (MarketPricesAppService) ((DoubleCheck) provider6).getValue();
                    PersistentEntityPriceCache persistentEntityPriceCache = (PersistentEntityPriceCache) ((RealTrifleService.MetroFactory) provider5).invoke();
                    AndroidClock androidClock2 = (AndroidClock) provider2.invoke();
                    Signal signal = (Signal) provider3.invoke();
                    CoroutineScope coroutineScope5 = (CoroutineScope) ((InstanceFactory) provider4).value;
                    ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                    newSingleThreadExecutor.getClass();
                    ExecutorCoroutineDispatcherImpl executorCoroutineDispatcherImpl = new ExecutorCoroutineDispatcherImpl(newSingleThreadExecutor);
                    CoroutineContext coroutineContext5 = (CoroutineContext) provider.invoke();
                    marketPricesAppService.getClass();
                    persistentEntityPriceCache.getClass();
                    androidClock2.getClass();
                    signal.getClass();
                    coroutineScope5.getClass();
                    coroutineContext5.getClass();
                    return new RealEntityPriceRefresher(marketPricesAppService, persistentEntityPriceCache, androidClock2, signal, coroutineScope5, executorCoroutineDispatcherImpl, coroutineContext5);
                case 11:
                    InvestingHomeView$Factory$Impl investingHomeView$Factory$Impl = (InvestingHomeView$Factory$Impl) ((InstanceFactory) provider4).value;
                    InvestingStockSelectionView$Factory$Impl investingStockSelectionView$Factory$Impl = (InvestingStockSelectionView$Factory$Impl) ((InstanceFactory) provider6).value;
                    InvestingSearchView$Factory$Impl investingSearchView$Factory$Impl = (InvestingSearchView$Factory$Impl) ((InstanceFactory) provider5).value;
                    InvestingMetricView$Factory$Impl investingMetricView$Factory$Impl = (InvestingMetricView$Factory$Impl) ((InstanceFactory) provider3).value;
                    RealImageLoader realImageLoader2 = (RealImageLoader) provider2.invoke();
                    StocksTransferEtaFullScreenView$Factory$Impl stocksTransferEtaFullScreenView$Factory$Impl = (StocksTransferEtaFullScreenView$Factory$Impl) ((InstanceFactory) provider).value;
                    investingHomeView$Factory$Impl.getClass();
                    investingStockSelectionView$Factory$Impl.getClass();
                    investingSearchView$Factory$Impl.getClass();
                    investingMetricView$Factory$Impl.getClass();
                    realImageLoader2.getClass();
                    stocksTransferEtaFullScreenView$Factory$Impl.getClass();
                    return new InvestingViewFactory(investingHomeView$Factory$Impl, investingStockSelectionView$Factory$Impl, investingSearchView$Factory$Impl, investingMetricView$Factory$Impl, realImageLoader2, stocksTransferEtaFullScreenView$Factory$Impl);
                case 12:
                    RealOffersSheetRepository realOffersSheetRepository = (RealOffersSheetRepository) provider2.invoke();
                    RealBoostRepository realBoostRepository = (RealBoostRepository) ((DoubleCheck) provider6).getValue();
                    IssuedCardManager issuedCardManager = (IssuedCardManager) ((DoubleCheck) provider5).getValue();
                    RealAfterpayAppletRepository realAfterpayAppletRepository = (RealAfterpayAppletRepository) provider3.invoke();
                    AndroidStringManager androidStringManager = (AndroidStringManager) ((LambdaProvider) provider4).lambda.invoke();
                    AndroidClock androidClock3 = (AndroidClock) ((LambdaProvider) provider).lambda.invoke();
                    realOffersSheetRepository.getClass();
                    realBoostRepository.getClass();
                    issuedCardManager.getClass();
                    realAfterpayAppletRepository.getClass();
                    androidStringManager.getClass();
                    androidClock3.getClass();
                    return new AssetPublicSuffixList(realOffersSheetRepository, realBoostRepository, issuedCardManager, realAfterpayAppletRepository, androidStringManager, androidClock3);
                case 13:
                    AppService appService = (AppService) ((DoubleCheck) provider6).getValue();
                    RealClientRouteParser realClientRouteParser = (RealClientRouteParser) ((DoubleCheck) provider5).getValue();
                    PaymentTemplateService paymentTemplateService = (PaymentTemplateService) ((DoubleCheck) provider4).getValue();
                    RealRecipientFinder realRecipientFinder = (RealRecipientFinder) provider2.invoke();
                    SessionManager sessionManager2 = (SessionManager) ((LambdaProvider) provider3).lambda.invoke();
                    CoroutineContext coroutineContext6 = (CoroutineContext) ((LambdaProvider) provider).lambda.invoke();
                    appService.getClass();
                    realClientRouteParser.getClass();
                    paymentTemplateService.getClass();
                    realRecipientFinder.getClass();
                    sessionManager2.getClass();
                    coroutineContext6.getClass();
                    return new AssetPublicSuffixList(appService, realClientRouteParser, paymentTemplateService, realRecipientFinder, sessionManager2, coroutineContext6);
                case 14:
                    KeyValue keyValue = (KeyValue) ((MusicViewFactory$MetroFactory) provider6).invoke();
                    KeyValue keyValue2 = (KeyValue) ((MusicViewFactory$MetroFactory) provider5).invoke();
                    PersonalizationRepository personalizationRepository = (PersonalizationRepository) ((SandboxJanitor.MetroFactory) provider4).invoke();
                    RealRecipientRepository realRecipientRepository = (RealRecipientRepository) ((RealRecipientRepository.MetroFactory) provider).invoke();
                    RealClientSyncer realClientSyncer = (RealClientSyncer) provider2.invoke();
                    Context context2 = (Context) provider3.invoke();
                    realClientSyncer.getClass();
                    context2.getClass();
                    return new RealPersonalizePaymentManager(keyValue, keyValue2, personalizationRepository, realRecipientRepository, realClientSyncer, context2);
                case 15:
                    AndroidStringManager androidStringManager2 = (AndroidStringManager) ((LambdaProvider) provider6).lambda.invoke();
                    CryptoFlowStarter cryptoFlowStarter = (CryptoFlowStarter) provider2.invoke();
                    WorkCookieJar workCookieJar = new WorkCookieJar(5);
                    Analytics analytics3 = (Analytics) ((DoubleCheck) provider5).getValue();
                    RealClipboardObserver realClipboardObserver = (RealClipboardObserver) provider3.invoke();
                    RealBitcoinFormatter realBitcoinFormatter = (RealBitcoinFormatter) provider.invoke();
                    RealBitcoinProfileRepo realBitcoinProfileRepo = (RealBitcoinProfileRepo) provider4.invoke();
                    androidStringManager2.getClass();
                    cryptoFlowStarter.getClass();
                    analytics3.getClass();
                    realClipboardObserver.getClass();
                    realBitcoinFormatter.getClass();
                    realBitcoinProfileRepo.getClass();
                    return new AssetPublicSuffixList(androidStringManager2, cryptoFlowStarter, workCookieJar, analytics3, realClipboardObserver, realBitcoinFormatter, realBitcoinProfileRepo);
                case 16:
                    RealFeatureEligibilityRepository realFeatureEligibilityRepository = (RealFeatureEligibilityRepository) provider2.invoke();
                    KeyValue keyValue3 = (KeyValue) ((RetroUiFactory.MetroFactory) provider6).invoke();
                    PoolsService poolsService = (PoolsService) provider3.invoke();
                    KeyValue keyValue4 = (KeyValue) ((ScoreUiFactory.MetroFactory) provider5).invoke();
                    CoroutineContext coroutineContext7 = (CoroutineContext) provider.invoke();
                    CoroutineScope coroutineScope6 = (CoroutineScope) ((InstanceFactory) provider4).value;
                    realFeatureEligibilityRepository.getClass();
                    poolsService.getClass();
                    coroutineContext7.getClass();
                    coroutineScope6.getClass();
                    return new RealPoolsRepository(realFeatureEligibilityRepository, keyValue3, poolsService, keyValue4, coroutineContext7, coroutineScope6);
                case 17:
                    RealDeepLinking realDeepLinking = (RealDeepLinking) provider2.invoke();
                    RealCryptoInvoiceParser realCryptoInvoiceParser = (RealCryptoInvoiceParser) provider3.invoke();
                    CryptoFlowStarter cryptoFlowStarter2 = (CryptoFlowStarter) provider.invoke();
                    FeatureFlagManager featureFlagManager6 = (FeatureFlagManager) ((DoubleCheck) provider6).getValue();
                    CoroutineContext coroutineContext8 = (CoroutineContext) ((LambdaProvider) provider5).lambda.invoke();
                    Analytics analytics4 = (Analytics) ((DoubleCheck) provider4).getValue();
                    realDeepLinking.getClass();
                    realCryptoInvoiceParser.getClass();
                    cryptoFlowStarter2.getClass();
                    featureFlagManager6.getClass();
                    coroutineContext8.getClass();
                    analytics4.getClass();
                    return new AssetPublicSuffixList(realDeepLinking, realCryptoInvoiceParser, cryptoFlowStarter2, featureFlagManager6, coroutineContext8, analytics4);
                case 18:
                    RealProfileManager realProfileManager = (RealProfileManager) ((DelegateFactory) provider6).invoke();
                    RealFileDownloader realFileDownloader = (RealFileDownloader) provider2.invoke();
                    AndroidFileProvider androidFileProvider = (AndroidFileProvider) ((LambdaProvider) provider5).lambda.invoke();
                    AndroidStringManager androidStringManager3 = (AndroidStringManager) ((LambdaProvider) provider3).lambda.invoke();
                    CoroutineContext coroutineContext9 = (CoroutineContext) ((LambdaProvider) provider).lambda.invoke();
                    CoroutineScope coroutineScope7 = (CoroutineScope) ((InstanceFactory) provider4).value;
                    realProfileManager.getClass();
                    realFileDownloader.getClass();
                    androidFileProvider.getClass();
                    androidStringManager3.getClass();
                    coroutineContext9.getClass();
                    coroutineScope7.getClass();
                    return new HCaptcha(realProfileManager, realFileDownloader, androidFileProvider, androidStringManager3, coroutineContext9, coroutineScope7);
                case 19:
                    RealFileValidator$Factory$Impl realFileValidator$Factory$Impl = (RealFileValidator$Factory$Impl) provider2.invoke();
                    RealFileUploadService realFileUploadService = (RealFileUploadService) ((DoubleCheck) provider6).getValue();
                    RealConversationService realConversationService = (RealConversationService) provider3.invoke();
                    ScreenshotBundleService screenshotBundleService = (ScreenshotBundleService) ((DoubleCheck) provider5).getValue();
                    CoroutineScope coroutineScope8 = (CoroutineScope) ((InstanceFactory) provider4).value;
                    CoroutineContext coroutineContext10 = (CoroutineContext) ((LambdaProvider) provider).lambda.invoke();
                    realFileValidator$Factory$Impl.getClass();
                    realFileUploadService.getClass();
                    realConversationService.getClass();
                    screenshotBundleService.getClass();
                    coroutineScope8.getClass();
                    coroutineContext10.getClass();
                    return new HCaptcha(realFileValidator$Factory$Impl, realFileUploadService, realConversationService, screenshotBundleService, coroutineScope8, coroutineContext10);
                default:
                    AndroidClock androidClock4 = (AndroidClock) ((LambdaProvider) provider6).lambda.invoke();
                    SchedulingService schedulingService = (SchedulingService) ((DoubleCheck) provider5).getValue();
                    TimecardsService timecardsService = (TimecardsService) ((DoubleCheck) provider4).getValue();
                    RealSelectedMerchantProvider realSelectedMerchantProvider = (RealSelectedMerchantProvider) ((DoubleCheck) provider3).getValue();
                    RealTeamMemberIdProvider realTeamMemberIdProvider = (RealTeamMemberIdProvider) provider2.invoke();
                    RealLocationRepository realLocationRepository = (RealLocationRepository) ((DoubleCheck) provider).getValue();
                    androidClock4.getClass();
                    schedulingService.getClass();
                    timecardsService.getClass();
                    realSelectedMerchantProvider.getClass();
                    realTeamMemberIdProvider.getClass();
                    realLocationRepository.getClass();
                    return new AssetPublicSuffixList(androidClock4, schedulingService, timecardsService, realSelectedMerchantProvider, realTeamMemberIdProvider, realLocationRepository);
            }
        }

        public MetroFactory(RealPasscodeFlowStarter.MetroFactory metroFactory, LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2, InstanceFactory instanceFactory, InstanceFactory instanceFactory2, LambdaProvider lambdaProvider3) {
            this.$r8$classId = 1;
            this.supportNavigationSideEffects = metroFactory;
            this.multiBlockerFacilitator = lambdaProvider;
            this.afterPayNavigationAnalyticsHelper = lambdaProvider2;
            this.coroutineScope = instanceFactory;
            this.walletAnalyticsHelper = instanceFactory2;
            this.blockerFlowAnalytics = lambdaProvider3;
        }

        public MetroFactory(MusicViewFactory$MetroFactory musicViewFactory$MetroFactory, MusicViewFactory$MetroFactory musicViewFactory$MetroFactory2, SandboxJanitor.MetroFactory metroFactory, RealRecipientRepository.MetroFactory metroFactory2, RealKnotLauncher.MetroFactory metroFactory3, DoubleCheck doubleCheck) {
            this.$r8$classId = 14;
            this.supportNavigationSideEffects = musicViewFactory$MetroFactory;
            this.afterPayNavigationAnalyticsHelper = musicViewFactory$MetroFactory2;
            this.coroutineScope = metroFactory;
            this.walletAnalyticsHelper = metroFactory2;
            this.multiBlockerFacilitator = metroFactory3;
            this.blockerFlowAnalytics = doubleCheck;
        }

        public MetroFactory(LambdaProvider lambdaProvider, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, ShiftsAnalytics.MetroFactory metroFactory, DoubleCheck doubleCheck4) {
            this.$r8$classId = 20;
            this.supportNavigationSideEffects = lambdaProvider;
            this.afterPayNavigationAnalyticsHelper = doubleCheck;
            this.coroutineScope = doubleCheck2;
            this.blockerFlowAnalytics = doubleCheck3;
            this.multiBlockerFacilitator = metroFactory;
            this.walletAnalyticsHelper = doubleCheck4;
        }

        public /* synthetic */ MetroFactory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, int i) {
            this.$r8$classId = i;
            this.supportNavigationSideEffects = provider;
            this.afterPayNavigationAnalyticsHelper = provider2;
            this.coroutineScope = provider3;
            this.multiBlockerFacilitator = provider4;
            this.blockerFlowAnalytics = provider5;
            this.walletAnalyticsHelper = provider6;
        }

        public /* synthetic */ MetroFactory(Provider provider, Provider provider2, Provider provider3, DoubleCheck doubleCheck, Provider provider4, DoubleCheck doubleCheck2, int i) {
            this.$r8$classId = i;
            this.multiBlockerFacilitator = provider;
            this.blockerFlowAnalytics = provider2;
            this.walletAnalyticsHelper = provider3;
            this.supportNavigationSideEffects = doubleCheck;
            this.afterPayNavigationAnalyticsHelper = provider4;
            this.coroutineScope = doubleCheck2;
        }

        public /* synthetic */ MetroFactory(Provider provider, Factory factory, Provider provider2, Provider provider3, Provider provider4, Factory factory2, int i) {
            this.$r8$classId = i;
            this.supportNavigationSideEffects = provider;
            this.multiBlockerFacilitator = factory;
            this.afterPayNavigationAnalyticsHelper = provider2;
            this.blockerFlowAnalytics = provider3;
            this.walletAnalyticsHelper = provider4;
            this.coroutineScope = factory2;
        }

        public MetroFactory(DoubleCheck doubleCheck, RealTrifleService.MetroFactory metroFactory, LambdaProvider lambdaProvider, DoubleCheck doubleCheck2, InstanceFactory instanceFactory, LambdaProvider lambdaProvider2) {
            this.$r8$classId = 10;
            this.supportNavigationSideEffects = doubleCheck;
            this.afterPayNavigationAnalyticsHelper = metroFactory;
            this.multiBlockerFacilitator = lambdaProvider;
            this.blockerFlowAnalytics = doubleCheck2;
            this.coroutineScope = instanceFactory;
            this.walletAnalyticsHelper = lambdaProvider2;
        }

        public MetroFactory(DoubleCheck doubleCheck, RetroUiFactory.MetroFactory metroFactory, DoubleCheck doubleCheck2, ScoreUiFactory.MetroFactory metroFactory2, LambdaProvider lambdaProvider, InstanceFactory instanceFactory) {
            this.$r8$classId = 16;
            this.multiBlockerFacilitator = doubleCheck;
            this.supportNavigationSideEffects = metroFactory;
            this.blockerFlowAnalytics = doubleCheck2;
            this.afterPayNavigationAnalyticsHelper = metroFactory2;
            this.walletAnalyticsHelper = lambdaProvider;
            this.coroutineScope = instanceFactory;
        }

        public MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, AppMessageSyncer.MetroFactory metroFactory, RealCashFillJsStore.MetroFactory metroFactory2, ArcadeModule$ProvideHapticVibratorMetroFactory arcadeModule$ProvideHapticVibratorMetroFactory, InstanceFactory instanceFactory) {
            this.$r8$classId = 2;
            this.multiBlockerFacilitator = doubleCheck;
            this.supportNavigationSideEffects = doubleCheck2;
            this.afterPayNavigationAnalyticsHelper = metroFactory;
            this.blockerFlowAnalytics = metroFactory2;
            this.walletAnalyticsHelper = arcadeModule$ProvideHapticVibratorMetroFactory;
            this.coroutineScope = instanceFactory;
        }

        public MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, RealAndroidNotificationSettingsChecker.MetroFactory metroFactory, DoubleCheck doubleCheck3, DoubleCheck doubleCheck4, LambdaProvider lambdaProvider) {
            this.$r8$classId = 5;
            this.multiBlockerFacilitator = doubleCheck;
            this.blockerFlowAnalytics = doubleCheck2;
            this.supportNavigationSideEffects = metroFactory;
            this.walletAnalyticsHelper = doubleCheck3;
            this.afterPayNavigationAnalyticsHelper = doubleCheck4;
            this.coroutineScope = lambdaProvider;
        }

        public MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2, LambdaProvider lambdaProvider3, ArcadeModule$ProvideHapticVibratorMetroFactory arcadeModule$ProvideHapticVibratorMetroFactory) {
            this.$r8$classId = 3;
            this.multiBlockerFacilitator = doubleCheck;
            this.blockerFlowAnalytics = doubleCheck2;
            this.supportNavigationSideEffects = lambdaProvider;
            this.afterPayNavigationAnalyticsHelper = lambdaProvider2;
            this.coroutineScope = lambdaProvider3;
            this.walletAnalyticsHelper = arcadeModule$ProvideHapticVibratorMetroFactory;
        }

        public /* synthetic */ MetroFactory(DoubleCheck doubleCheck, Factory factory, Provider provider, LambdaProvider lambdaProvider, Provider provider2, Provider provider3, int i) {
            this.$r8$classId = i;
            this.multiBlockerFacilitator = doubleCheck;
            this.supportNavigationSideEffects = factory;
            this.blockerFlowAnalytics = provider;
            this.walletAnalyticsHelper = lambdaProvider;
            this.afterPayNavigationAnalyticsHelper = provider2;
            this.coroutineScope = provider3;
        }

        public MetroFactory(DoubleCheck doubleCheck, InstanceFactory instanceFactory, InstanceFactory instanceFactory2, InstanceFactory instanceFactory3, InstanceFactory instanceFactory4, InstanceFactory instanceFactory5) {
            this.$r8$classId = 11;
            this.coroutineScope = instanceFactory;
            this.supportNavigationSideEffects = instanceFactory2;
            this.afterPayNavigationAnalyticsHelper = instanceFactory3;
            this.blockerFlowAnalytics = instanceFactory4;
            this.multiBlockerFacilitator = doubleCheck;
            this.walletAnalyticsHelper = instanceFactory5;
        }

        public MetroFactory(InstanceFactory instanceFactory, DoubleCheck doubleCheck, ShiftsAnalytics.MetroFactory metroFactory, DoubleCheck doubleCheck2, InstanceFactory instanceFactory2, LambdaProvider lambdaProvider) {
            this.$r8$classId = 19;
            this.multiBlockerFacilitator = instanceFactory;
            this.supportNavigationSideEffects = doubleCheck;
            this.blockerFlowAnalytics = metroFactory;
            this.afterPayNavigationAnalyticsHelper = doubleCheck2;
            this.coroutineScope = instanceFactory2;
            this.walletAnalyticsHelper = lambdaProvider;
        }

        public MetroFactory(InstanceFactory instanceFactory, InstanceFactory instanceFactory2, InstanceFactory instanceFactory3, InstanceFactory instanceFactory4, DoubleCheck doubleCheck, LambdaProvider lambdaProvider) {
            this.$r8$classId = 8;
            this.coroutineScope = instanceFactory;
            this.supportNavigationSideEffects = instanceFactory2;
            this.afterPayNavigationAnalyticsHelper = instanceFactory3;
            this.walletAnalyticsHelper = instanceFactory4;
            this.multiBlockerFacilitator = doubleCheck;
            this.blockerFlowAnalytics = lambdaProvider;
        }
    }
}
