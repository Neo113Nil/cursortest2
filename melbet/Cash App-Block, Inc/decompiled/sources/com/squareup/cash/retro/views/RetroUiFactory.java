package com.squareup.cash.retro.views;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.ViewGroup;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.room.Room;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.UiFactory;
import app.cash.broadway.ui.compose.ComposeUiView;
import app.cash.cdp.integration.CdpConfigUpdateSetupTeardown;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.google.android.gms.tasks.zzr;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletActivityListEmbeddedScreen;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletHomeScreen;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletInfoSheet;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletMerchantSheetScreen;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletNotificationScreen;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletPurchasesScreen;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletSelectAfterpayPromptSheet;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletUpsellSheetScreen;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayRetroOrderSelectionScreen;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpaySearchScreen;
import com.squareup.cash.afterpayapplet.views.AfterpayAppletHomeView;
import com.squareup.cash.afterpayapplet.views.AfterpayAppletInfoSheetView;
import com.squareup.cash.afterpayapplet.views.AfterpayAppletNotificationView;
import com.squareup.cash.afterpayapplet.views.AfterpayAppletUpsellSheetView;
import com.squareup.cash.afterpayapplet.views.browser.SelectAfterpayPromptSheet;
import com.squareup.cash.api.ExperimentExposureTracker;
import com.squareup.cash.appintro.views.AppIntroViewFactory;
import com.squareup.cash.banking.screens.BalanceHomeScreen;
import com.squareup.cash.banking.screens.BankingDialogScreen;
import com.squareup.cash.banking.screens.BankingDialogs;
import com.squareup.cash.banking.screens.BankingSheets;
import com.squareup.cash.banking.screens.BenefitsLeafletSheetScreen;
import com.squareup.cash.banking.screens.ConfirmCashOutScreen;
import com.squareup.cash.banking.screens.OverdraftCoverageSheetScreen;
import com.squareup.cash.banking.screens.RecurringDepositsFirstTimeUserScreen;
import com.squareup.cash.banking.screens.RecurringDepositsScreen;
import com.squareup.cash.banking.screens.TransfersScreen;
import com.squareup.cash.banking.views.BalanceHomeView;
import com.squareup.cash.banking.views.BankingDialog;
import com.squareup.cash.banking.views.BankingDialogKt;
import com.squareup.cash.banking.views.ConfirmCashOutDialog;
import com.squareup.cash.banking.views.OverdraftCoverageSheetView;
import com.squareup.cash.banking.views.RecurringDepositsFirstTimeUserView;
import com.squareup.cash.banking.views.RecurringDepositsView;
import com.squareup.cash.banking.views.TransfersView;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.borrow.views.BorrowUiFactory;
import com.squareup.cash.clientsync.pipeline.MutableClientSyncCompletionTracker;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.data.contacts.RealContactRepository;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db.db.CashAppDatabaseImpl;
import com.squareup.cash.featureflags.AmplitudeExperiments$AfterpayAppletV3OptimizationExperiment;
import com.squareup.cash.featureflags.AmplitudeExperiments$MobileBankingEvergreenOverdraft;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlag$StringAmplitudeExperiment;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.localization.RealLanguageManager;
import com.squareup.cash.marketcapabilities.RealMarketCapabilitiesDataSource;
import com.squareup.cash.marketcapabilities.RealMarketCapabilitiesManager;
import com.squareup.cash.money.applets.sections.RealMoneyContentSpanTrackingService;
import com.squareup.cash.money.applets.sections.RealPromotedAppletTileStore;
import com.squareup.cash.money.disclosure.DisclosureRepository;
import com.squareup.cash.money.views.MoneyUiFactory$$ExternalSyntheticLambda0;
import com.squareup.cash.moneybot.analytics.RealMoneybotAnalyticsService;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.mosaic.resources.api.v2.MusicService;
import com.squareup.cash.notification.photo.NotificationPhotoLookupKeyRegistry;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.observability.backend.real.network.RealDatadogObservabilityInterceptor;
import com.squareup.cash.observability.backend.real.network.RealNetworkTracingObservabilityInterceptor;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.offers.backend.real.RealOffersAnalyticsHelper;
import com.squareup.cash.offers.backend.real.RealOffersAnalyticsV2;
import com.squareup.cash.onboarding.backend.RealOnboardingFlowTokenManager;
import com.squareup.cash.onboarding.check.checkers.ProfileIntegrityCheck;
import com.squareup.cash.p2pblocking.views.P2PListView;
import com.squareup.cash.permissions.PermissionChecker;
import com.squareup.cash.pools.backend.api.PoolsAppletData;
import com.squareup.cash.pools.backend.real.PoolsDataModule$Companion$providePoolsAppletDataPreference$$inlined$MoshiKeyValue$default$3;
import com.squareup.cash.real.CompositeExposureTracker;
import com.squareup.cash.recipients.backend.real.RealSuggestedRecipientsVendor;
import com.squareup.cash.recipients.data.RealCustomerStore;
import com.squareup.cash.retro.viewmodels.PaymentPlanSummaryViewModel;
import com.squareup.cash.retro.viewmodels.SelectPaymentPlanViewModel;
import com.squareup.cash.session.backend.DoubleWriteExperimentForwarder;
import com.squareup.cash.session.backend.DoubleWriteExperimentSetupTeardown;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.session.backend.SignedInStateSetupTeardown;
import com.squareup.cash.session.backend.TimeToLiveSyncState;
import com.squareup.cash.shopping.backend.real.RealShopHubAnalyticsHelper;
import com.squareup.cash.stablecoin.capability.real.RealStablecoinCapabilityHelper;
import com.squareup.cash.storage.FileDownloaderClientProvider;
import com.squareup.cash.storage.RealSandboxer;
import com.squareup.cash.storage.RealStorageLinker;
import com.squareup.cash.storage.StorageLinkSerdeKt$StorageLinkKeyValue$$inlined$MoshiKeyValue$default$1;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.cash.ui.OutsideTapCloses;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.squareup.preferences.KeyValue;
import com.squareup.util.ForcedLazyKt$forcedLazy$1;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.Factory;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import okio.Path$$ExternalSyntheticBUOutline0;
import retrofit2.OkHttpCall;

/* loaded from: classes.dex */
public final class RetroUiFactory implements UiFactory {
    public final /* synthetic */ int $r8$classId;
    public final FeatureFlagManager featureFlagManager;
    public final RealImageLoader imageLoader;

    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final Provider featureFlagManager;
        public final Provider imageLoader;

        public /* synthetic */ MetroFactory(Provider provider, Provider provider2, int i) {
            this.$r8$classId = i;
            this.imageLoader = provider;
            this.featureFlagManager = provider2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            int i2 = 6;
            int i3 = 5;
            int i4 = 4;
            Provider provider = this.featureFlagManager;
            Provider provider2 = this.imageLoader;
            switch (i) {
                case 0:
                    RealImageLoader realImageLoader = (RealImageLoader) provider2.invoke();
                    FeatureFlagManager featureFlagManager = (FeatureFlagManager) provider.invoke();
                    realImageLoader.getClass();
                    featureFlagManager.getClass();
                    return new RetroUiFactory(realImageLoader, featureFlagManager, 0);
                case 1:
                    FeatureFlagManager featureFlagManager2 = (FeatureFlagManager) provider2.invoke();
                    RealLanguageManager realLanguageManager = (RealLanguageManager) provider.invoke();
                    featureFlagManager2.getClass();
                    realLanguageManager.getClass();
                    return new CdpConfigUpdateSetupTeardown(3, featureFlagManager2, realLanguageManager);
                case 2:
                    Context context = (Context) provider2.invoke();
                    RealLanguageManager realLanguageManager2 = (RealLanguageManager) provider.invoke();
                    context.getClass();
                    realLanguageManager2.getClass();
                    return new CdpConfigUpdateSetupTeardown(i4, context, realLanguageManager2);
                case 3:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) provider2.invoke();
                    CoroutineContext coroutineContext = (CoroutineContext) provider.invoke();
                    cashAccountDatabaseImpl.getClass();
                    coroutineContext.getClass();
                    return new RealMarketCapabilitiesDataSource(cashAccountDatabaseImpl, coroutineContext);
                case 4:
                    FeatureFlagManager featureFlagManager3 = (FeatureFlagManager) provider2.invoke();
                    ErrorReporter errorReporter = (ErrorReporter) provider.invoke();
                    featureFlagManager3.getClass();
                    errorReporter.getClass();
                    return new zzr(featureFlagManager3, errorReporter);
                case 5:
                    RealObservabilityManager realObservabilityManager = (RealObservabilityManager) provider2.invoke();
                    MutableClientSyncCompletionTracker mutableClientSyncCompletionTracker = (MutableClientSyncCompletionTracker) provider.invoke();
                    realObservabilityManager.getClass();
                    mutableClientSyncCompletionTracker.getClass();
                    return new RealMoneyContentSpanTrackingService(realObservabilityManager, mutableClientSyncCompletionTracker);
                case 6:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl2 = (CashAccountDatabaseImpl) provider2.invoke();
                    CoroutineContext coroutineContext2 = (CoroutineContext) provider.invoke();
                    cashAccountDatabaseImpl2.getClass();
                    coroutineContext2.getClass();
                    return new RealPromotedAppletTileStore(cashAccountDatabaseImpl2, coroutineContext2);
                case 7:
                    SyncValueReader syncValueReader = (SyncValueReader) provider2.invoke();
                    FeatureFlagManager featureFlagManager4 = (FeatureFlagManager) provider.invoke();
                    syncValueReader.getClass();
                    featureFlagManager4.getClass();
                    return new DisclosureRepository(syncValueReader, featureFlagManager4);
                case 8:
                    Analytics analytics = (Analytics) provider2.invoke();
                    RealUuidGenerator realUuidGenerator = (RealUuidGenerator) provider.invoke();
                    analytics.getClass();
                    realUuidGenerator.getClass();
                    return new RealMoneybotAnalyticsService(analytics, realUuidGenerator);
                case 9:
                    SessionManager sessionManager = (SessionManager) provider2.invoke();
                    ForcedLazyKt$forcedLazy$1 forcedLazyKt$forcedLazy$1 = (ForcedLazyKt$forcedLazy$1) provider.invoke();
                    sessionManager.getClass();
                    forcedLazyKt$forcedLazy$1.getClass();
                    return new OkHttpCall.AnonymousClass1(i4, sessionManager, forcedLazyKt$forcedLazy$1);
                case 10:
                    MusicService musicService = (MusicService) provider2.invoke();
                    CoroutineContext coroutineContext3 = (CoroutineContext) provider.invoke();
                    musicService.getClass();
                    coroutineContext3.getClass();
                    return new ToolbarTuckTargets(musicService, coroutineContext3);
                case 11:
                    PermissionChecker permissionChecker = (PermissionChecker) provider2.invoke();
                    NotificationPhotoLookupKeyRegistry notificationPhotoLookupKeyRegistry = (NotificationPhotoLookupKeyRegistry) provider.invoke();
                    permissionChecker.getClass();
                    notificationPhotoLookupKeyRegistry.getClass();
                    return new OkHttpCall.AnonymousClass1(i2, permissionChecker, notificationPhotoLookupKeyRegistry);
                case 12:
                    FeatureFlagManager featureFlagManager5 = (FeatureFlagManager) provider2.invoke();
                    List list = (List) provider.invoke();
                    featureFlagManager5.getClass();
                    list.getClass();
                    return new RealDatadogObservabilityInterceptor(featureFlagManager5, list);
                case 13:
                    FeatureFlagManager featureFlagManager6 = (FeatureFlagManager) provider2.invoke();
                    List list2 = (List) provider.invoke();
                    featureFlagManager6.getClass();
                    list2.getClass();
                    return new RealNetworkTracingObservabilityInterceptor(featureFlagManager6, list2);
                case 14:
                    Analytics analytics2 = (Analytics) provider2.invoke();
                    RealOffersAnalyticsHelper realOffersAnalyticsHelper = (RealOffersAnalyticsHelper) provider.invoke();
                    analytics2.getClass();
                    realOffersAnalyticsHelper.getClass();
                    return new RealOffersAnalyticsV2(analytics2, realOffersAnalyticsHelper);
                case 15:
                    SharedPreferences sharedPreferences = (SharedPreferences) provider2.invoke();
                    CoroutineScope coroutineScope = (CoroutineScope) provider.invoke();
                    boolean booleanValue = Boolean.TRUE.booleanValue();
                    sharedPreferences.getClass();
                    coroutineScope.getClass();
                    return new RealOnboardingFlowTokenManager(sharedPreferences, coroutineScope, booleanValue);
                case 16:
                    TimeToLiveSyncState timeToLiveSyncState = (TimeToLiveSyncState) provider2.invoke();
                    CashAccountDatabaseImpl cashAccountDatabaseImpl3 = (CashAccountDatabaseImpl) provider.invoke();
                    timeToLiveSyncState.getClass();
                    cashAccountDatabaseImpl3.getClass();
                    return new ProfileIntegrityCheck(timeToLiveSyncState, cashAccountDatabaseImpl3);
                case 17:
                    SharedPreferences sharedPreferences2 = (SharedPreferences) provider2.invoke();
                    Moshi moshi = (Moshi) provider.invoke();
                    sharedPreferences2.getClass();
                    moshi.getClass();
                    KeyValue.OnDeserializationFailure onDeserializationFailure = KeyValue.OnDeserializationFailure.Delete;
                    JsonAdapter adapter = moshi.adapter(PoolsAppletData.class, Util.NO_ANNOTATIONS, null);
                    return Room.SerDeKeyValue(sharedPreferences2, "pools-applet-data-pref", new StorageLinkSerdeKt$StorageLinkKeyValue$$inlined$MoshiKeyValue$default$1(adapter, i3), new StorageLinkSerdeKt$StorageLinkKeyValue$$inlined$MoshiKeyValue$default$1(adapter, i2), new PoolsDataModule$Companion$providePoolsAppletDataPreference$$inlined$MoshiKeyValue$default$3(), onDeserializationFailure, false);
                case 18:
                    RealImageLoader realImageLoader2 = (RealImageLoader) provider2.invoke();
                    RealCashVibrator realCashVibrator = (RealCashVibrator) provider.invoke();
                    realImageLoader2.getClass();
                    realCashVibrator.getClass();
                    return new BorrowUiFactory(realImageLoader2, realCashVibrator, i4);
                case 19:
                    FeatureFlagManager featureFlagManager7 = (FeatureFlagManager) provider2.invoke();
                    ExperimentExposureTracker experimentExposureTracker = (ExperimentExposureTracker) provider.invoke();
                    featureFlagManager7.getClass();
                    experimentExposureTracker.getClass();
                    return new SignedInStateSetupTeardown(featureFlagManager7, (CompositeExposureTracker) experimentExposureTracker);
                case 20:
                    RealContactRepository realContactRepository = (RealContactRepository) provider2.invoke();
                    AppConfigManager appConfigManager = (AppConfigManager) provider.invoke();
                    realContactRepository.getClass();
                    appConfigManager.getClass();
                    return new RealSuggestedRecipientsVendor(realContactRepository, appConfigManager);
                case 21:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl4 = (CashAccountDatabaseImpl) provider2.invoke();
                    CoroutineContext coroutineContext4 = (CoroutineContext) provider.invoke();
                    cashAccountDatabaseImpl4.getClass();
                    coroutineContext4.getClass();
                    return new RealCustomerStore(cashAccountDatabaseImpl4, coroutineContext4);
                case 22:
                    RealImageLoader realImageLoader3 = (RealImageLoader) provider2.invoke();
                    RealCashVibrator realCashVibrator2 = (RealCashVibrator) provider.invoke();
                    realImageLoader3.getClass();
                    realCashVibrator2.getClass();
                    return new BorrowUiFactory(realImageLoader3, realCashVibrator2, i3);
                case 23:
                    FeatureFlagManager featureFlagManager8 = (FeatureFlagManager) provider2.invoke();
                    DoubleWriteExperimentForwarder doubleWriteExperimentForwarder = (DoubleWriteExperimentForwarder) provider.invoke();
                    featureFlagManager8.getClass();
                    doubleWriteExperimentForwarder.getClass();
                    return new DoubleWriteExperimentSetupTeardown(featureFlagManager8, doubleWriteExperimentForwarder);
                case 24:
                    SessionManager sessionManager2 = (SessionManager) provider2.invoke();
                    sessionManager2.getClass();
                    provider.getClass();
                    return new SignedInStateSetupTeardown(sessionManager2, provider);
                case 25:
                    SharedPreferences sharedPreferences3 = (SharedPreferences) provider2.invoke();
                    RealUuidGenerator realUuidGenerator2 = (RealUuidGenerator) provider.invoke();
                    sharedPreferences3.getClass();
                    realUuidGenerator2.getClass();
                    return new RealShopHubAnalyticsHelper(sharedPreferences3, realUuidGenerator2);
                case 26:
                    RealImageLoader realImageLoader4 = (RealImageLoader) provider2.invoke();
                    LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) provider.invoke();
                    realImageLoader4.getClass();
                    factory.getClass();
                    return new AppIntroViewFactory(realImageLoader4, factory);
                case 27:
                    FeatureFlagManager featureFlagManager9 = (FeatureFlagManager) provider2.invoke();
                    RealMarketCapabilitiesManager realMarketCapabilitiesManager = (RealMarketCapabilitiesManager) provider.invoke();
                    featureFlagManager9.getClass();
                    realMarketCapabilitiesManager.getClass();
                    return new RealStablecoinCapabilityHelper(featureFlagManager9, realMarketCapabilitiesManager);
                case 28:
                    provider2.getClass();
                    provider.getClass();
                    return new FileDownloaderClientProvider(provider2, provider);
                default:
                    CashAppDatabaseImpl cashAppDatabaseImpl = (CashAppDatabaseImpl) provider2.invoke();
                    RealSandboxer realSandboxer = (RealSandboxer) provider.invoke();
                    cashAppDatabaseImpl.getClass();
                    realSandboxer.getClass();
                    return new RealStorageLinker(realSandboxer, cashAppDatabaseImpl);
            }
        }
    }

    public /* synthetic */ RetroUiFactory(RealImageLoader realImageLoader, FeatureFlagManager featureFlagManager, int i) {
        this.$r8$classId = i;
        this.imageLoader = realImageLoader;
        this.featureFlagManager = featureFlagManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v44, types: [com.squareup.cash.banking.views.ConfirmCashOutDialog] */
    @Override // app.cash.broadway.ui.UiFactory
    public final UiFactory.ScreenUi createUi(Screen screen, Context context, ViewGroup viewGroup) {
        ComposeUiView composeUiView;
        int i = this.$r8$classId;
        final int i2 = 0;
        int i3 = 4;
        FeatureFlagManager featureFlagManager = this.featureFlagManager;
        RealImageLoader realImageLoader = this.imageLoader;
        final int i4 = 1;
        context.getClass();
        switch (i) {
            case 0:
                if (screen instanceof BlockersScreens.PaymentPlanDataBlockerScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.retro.views.RetroUiFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ RetroUiFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            int i5 = i2;
                            int i6 = 0;
                            RetroUiFactory retroUiFactory = this.f$0;
                            switch (i5) {
                                case 0:
                                    PaymentPlanSummaryViewModel paymentPlanSummaryViewModel = (PaymentPlanSummaryViewModel) obj;
                                    Function1 function1 = (Function1) obj2;
                                    Composer composer = (Composer) obj3;
                                    ((Integer) obj4).getClass();
                                    paymentPlanSummaryViewModel.getClass();
                                    function1.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(retroUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-1485101898, new RetroUiFactory$$ExternalSyntheticLambda3(i6, retroUiFactory, paymentPlanSummaryViewModel, function1), composer), composer, 56);
                                    break;
                                default:
                                    SelectPaymentPlanViewModel selectPaymentPlanViewModel = (SelectPaymentPlanViewModel) obj;
                                    Function1 function12 = (Function1) obj2;
                                    Composer composer2 = (Composer) obj3;
                                    ((Integer) obj4).getClass();
                                    selectPaymentPlanViewModel.getClass();
                                    function12.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(retroUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-170079193, new RetroUiFactory$$ExternalSyntheticLambda2(selectPaymentPlanViewModel, function12, i6), composer2), composer2, 56);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, 496685046));
                }
                if (screen instanceof BlockersScreens.SelectPaymentPlanBlockerScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.retro.views.RetroUiFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ RetroUiFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            int i5 = i4;
                            int i6 = 0;
                            RetroUiFactory retroUiFactory = this.f$0;
                            switch (i5) {
                                case 0:
                                    PaymentPlanSummaryViewModel paymentPlanSummaryViewModel = (PaymentPlanSummaryViewModel) obj;
                                    Function1 function1 = (Function1) obj2;
                                    Composer composer = (Composer) obj3;
                                    ((Integer) obj4).getClass();
                                    paymentPlanSummaryViewModel.getClass();
                                    function1.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(retroUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-1485101898, new RetroUiFactory$$ExternalSyntheticLambda3(i6, retroUiFactory, paymentPlanSummaryViewModel, function1), composer), composer, 56);
                                    break;
                                default:
                                    SelectPaymentPlanViewModel selectPaymentPlanViewModel = (SelectPaymentPlanViewModel) obj;
                                    Function1 function12 = (Function1) obj2;
                                    Composer composer2 = (Composer) obj3;
                                    ((Integer) obj4).getClass();
                                    selectPaymentPlanViewModel.getClass();
                                    function12.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(retroUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-170079193, new RetroUiFactory$$ExternalSyntheticLambda2(selectPaymentPlanViewModel, function12, i6), composer2), composer2, 56);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, 1135773927));
                }
                return null;
            case 1:
                if (screen instanceof AfterpayAppletScreen$AfterpayAppletHomeScreen) {
                    AfterpayAppletHomeView afterpayAppletHomeView = new AfterpayAppletHomeView(context, realImageLoader, !Intrinsics.areEqual(r6, "control"), Intrinsics.areEqual(((FeatureFlag$StringAmplitudeExperiment.Value) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(AmplitudeExperiments$AfterpayAppletV3OptimizationExperiment.INSTANCE)).getValue(), "treatment-b"));
                    return new UiFactory.ViewUi(afterpayAppletHomeView, afterpayAppletHomeView);
                }
                if (screen instanceof AfterpayAppletScreen$AfterpaySearchScreen) {
                    P2PListView p2PListView = new P2PListView(context, realImageLoader, 4);
                    return new UiFactory.ViewUi(p2PListView, p2PListView);
                }
                if (screen instanceof AfterpayAppletScreen$AfterpayAppletPurchasesScreen) {
                    P2PListView p2PListView2 = new P2PListView(context, realImageLoader, 3);
                    return new UiFactory.ViewUi(p2PListView2, p2PListView2);
                }
                if (screen instanceof AfterpayAppletScreen$AfterpayAppletActivityListEmbeddedScreen) {
                    P2PListView p2PListView3 = new P2PListView(context, realImageLoader, 2);
                    return new UiFactory.ViewUi(p2PListView3, p2PListView3);
                }
                if (screen instanceof AfterpayAppletScreen$AfterpayAppletInfoSheet) {
                    AfterpayAppletInfoSheetView afterpayAppletInfoSheetView = new AfterpayAppletInfoSheetView(context);
                    return new UiFactory.ViewUi(afterpayAppletInfoSheetView, afterpayAppletInfoSheetView);
                }
                if (screen instanceof AfterpayAppletScreen$AfterpayAppletMerchantSheetScreen) {
                    AfterpayAppletUpsellSheetView afterpayAppletUpsellSheetView = new AfterpayAppletUpsellSheetView(context, realImageLoader, 1);
                    return new UiFactory.ViewUi(afterpayAppletUpsellSheetView, afterpayAppletUpsellSheetView);
                }
                if (screen instanceof AfterpayAppletScreen$AfterpayAppletSelectAfterpayPromptSheet) {
                    SelectAfterpayPromptSheet selectAfterpayPromptSheet = new SelectAfterpayPromptSheet(context);
                    return new UiFactory.ViewUi(selectAfterpayPromptSheet, selectAfterpayPromptSheet);
                }
                if (screen instanceof AfterpayAppletScreen$AfterpayAppletNotificationScreen) {
                    AfterpayAppletNotificationView afterpayAppletNotificationView = new AfterpayAppletNotificationView(context);
                    return new UiFactory.ViewUi(afterpayAppletNotificationView, afterpayAppletNotificationView);
                }
                if (screen instanceof AfterpayAppletScreen$AfterpayRetroOrderSelectionScreen) {
                    P2PListView p2PListView4 = new P2PListView(context, realImageLoader, 5);
                    return new UiFactory.ViewUi(p2PListView4, p2PListView4);
                }
                if (!(screen instanceof AfterpayAppletScreen$AfterpayAppletUpsellSheetScreen)) {
                    return null;
                }
                AfterpayAppletUpsellSheetView afterpayAppletUpsellSheetView2 = new AfterpayAppletUpsellSheetView(context, realImageLoader, 0);
                return new UiFactory.ViewUi(afterpayAppletUpsellSheetView2, afterpayAppletUpsellSheetView2);
            default:
                if (screen instanceof ConfirmCashOutScreen) {
                    composeUiView = new ConfirmCashOutDialog(context);
                } else if (screen instanceof RecurringDepositsScreen) {
                    composeUiView = new RecurringDepositsView(context);
                } else if (screen instanceof RecurringDepositsFirstTimeUserScreen) {
                    composeUiView = new RecurringDepositsFirstTimeUserView(context);
                } else if (screen instanceof BankingDialogScreen) {
                    composeUiView = new BankingDialog(context);
                } else if (screen instanceof TransfersScreen) {
                    composeUiView = new TransfersView(context);
                } else if (screen instanceof BalanceHomeScreen) {
                    composeUiView = new BalanceHomeView(context, realImageLoader);
                } else {
                    if (!(screen instanceof OverdraftCoverageSheetScreen)) {
                        if (screen instanceof BenefitsLeafletSheetScreen) {
                            return new UiFactory.ComposeUi(new ComposableLambdaImpl(new MoneyUiFactory$$ExternalSyntheticLambda0(this, i3), true, -1329951787));
                        }
                        return null;
                    }
                    if (((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(AmplitudeExperiments$MobileBankingEvergreenOverdraft.INSTANCE)).enabled()) {
                        return new UiFactory.ComposeUi(BankingDialogKt.lambda$1934143725);
                    }
                    composeUiView = new OverdraftCoverageSheetView(context);
                }
                if ((!(screen instanceof BankingSheets) && !(screen instanceof BankingDialogs)) || (composeUiView instanceof OutsideTapCloses)) {
                    return new UiFactory.ViewUi(composeUiView, composeUiView);
                }
                Path$$ExternalSyntheticBUOutline0.m((Object) Recorder$$ExternalSyntheticOutline2.m$1(Reflection.factory.getOrCreateKotlinClass(composeUiView.getClass()).getSimpleName(), " doesn't implement OutsideTapCloses"));
                return null;
        }
    }
}
