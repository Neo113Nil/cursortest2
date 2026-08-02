package com.squareup.cash.shopping.presenters;

import app.cash.broadway.presenter.Presenter;
import app.cash.broadway.presenter.PresenterFactory;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt;
import app.cash.broadway.screen.Screen;
import app.cash.inputfieldtext.saver.RealInputFieldTextSaver;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import coil3.ImageLoader$Builder;
import com.bugsnag.android.DeviceBuildInfo;
import com.google.mlkit.vision.text.internal.zzr;
import com.squareup.cash.activity.presenters.ActivityTabPresenter;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletAnalytics;
import com.squareup.cash.afterpayapplet.presenters.AfterpaySearchPresenter$MetroFactory;
import com.squareup.cash.appforeground.AppForegroundStateProvider;
import com.squareup.cash.autofillweb.real.RealAutofillWebManagerProvider;
import com.squareup.cash.autofillweb.real.RealCashFillJsStore;
import com.squareup.cash.banking.backend.real.RealBankingOptionBadgeUpdater;
import com.squareup.cash.bitcoin.presenters.stablecoin.LegacyStablecoinDepositPresenter$MetroFactory;
import com.squareup.cash.blockers.actions.presenters.BlockerActionConfirmDialogPresenter;
import com.squareup.cash.blockers.actions.presenters.BlockerActionConfirmSheetPresenter;
import com.squareup.cash.blockers.actions.presenters.BlockerActionDialogActionPresenter;
import com.squareup.cash.blockers.actions.presenters.BlockerActionFileDownloadFailurePresenter$Factory$Impl;
import com.squareup.cash.blockers.actions.util.BlockerActionUriDecoder;
import com.squareup.cash.blockers.flow.RealMultiBlockerFacilitator;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.blockers.presenters.ErrorPresenter;
import com.squareup.cash.blockers.presenters.VerifyMagicPresenter$MetroFactory;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.boost.backend.RealBoostAnalyticsHelper;
import com.squareup.cash.boost.backend.RealBoostRepository;
import com.squareup.cash.borrow.presenters.util.RealLoanFlowStarter$MetroFactory;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.CardStudioUndoDialogPresenter;
import com.squareup.cash.card.onboarding.StampSheetPresenter$MetroFactory;
import com.squareup.cash.cashapplite.presenters.LiteActivityPresenter;
import com.squareup.cash.cashcommercebrowser.api.v1.AnalyzeCartService;
import com.squareup.cash.checks.VerifyCheckDialogPresenter;
import com.squareup.cash.clientroutes.RealClientRouteParser;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.clientsync.syncer.RealClientSyncer;
import com.squareup.cash.clipboard.RealClipboardManager;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.data.profile.RealDemandDepositAccountManager;
import com.squareup.cash.data.profile.RealJurisdictionConfigManager;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.db2.profile.Profile;
import com.squareup.cash.directdeposit.backend.real.RealFormPdfProvider;
import com.squareup.cash.directdeposit.presenters.DemandDepositAccountFormatter;
import com.squareup.cash.directdeposit.presenters.DirectDepositEditCompanyNamePresenter$Factory$Impl;
import com.squareup.cash.directdeposit.presenters.DirectDepositEditFullNamePresenter$Factory$Impl;
import com.squareup.cash.directdeposit.presenters.DirectDepositEditPaycheckAllocationPresenter$Factory$Impl;
import com.squareup.cash.directdeposit.presenters.DirectDepositEditPaycheckCurrencyAllocationPresenter$Factory$Impl;
import com.squareup.cash.directdeposit.presenters.DirectDepositEditPaycheckPercentagePresenter$Factory$Impl;
import com.squareup.cash.directdeposit.presenters.DirectDepositManualFormCompletionPresenter$Factory$Impl;
import com.squareup.cash.directdeposit.presenters.DirectDepositManualFormDetailsPresenter$Factory$Impl;
import com.squareup.cash.directdeposit.presenters.DirectDepositSetupPresenter;
import com.squareup.cash.directdeposit.presenters.DirectDepositSetupPresenter$Factory$Impl;
import com.squareup.cash.directdeposit.presenters.DirectDepositUpdateManualFormDetailsPresenter$Factory$Impl;
import com.squareup.cash.directdeposit.screens.DirectDepositEditCompanyNameScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositEditFullNameScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositEditPaycheckAllocationScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositEditPaycheckCurrencyAllocationScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositEditPaycheckPercentageScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositManualFormDetailsScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositManualFormSubmissionScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositSetupScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositUpdateManualFormScreen;
import com.squareup.cash.eligibility.backend.real.RealSettingsEligibilityManager;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.fillr.real.RealFillrWebManager;
import com.squareup.cash.formview.presenters.FormPresenter;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.invitations.InviteErrorPresenter;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.money.navigation.real.RealMoneyNavigatorHelper;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.offers.backend.real.RealOffersAnalyticsHelper;
import com.squareup.cash.onboarding.presenters.OnboardingLandingPresenter$MetroFactory;
import com.squareup.cash.profile.presenters.AddAliasPresenter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.shopping.backend.real.RealProductSearchRepository;
import com.squareup.cash.shopping.backend.real.RealRecentSearchManager;
import com.squareup.cash.shopping.backend.real.RealShopHubAnalyticsHelper;
import com.squareup.cash.shopping.backend.real.RealShopHubRepository;
import com.squareup.cash.shopping.screens.CashAppPayIncentiveScreen$IncentivePromptSheetScreen;
import com.squareup.cash.shopping.screens.CashAppPayIncentiveScreen$SilentAuthorizationErrorDialog;
import com.squareup.cash.shopping.screens.ShoppingInfoSheetScreen;
import com.squareup.cash.shopping.screens.ShoppingScreen$BrandsSearchScreen;
import com.squareup.cash.shopping.screens.ShoppingScreen$ProductSearchScreen;
import com.squareup.cash.shopping.screens.ShoppingScreen$RestrictedItemWarningSheetScreen;
import com.squareup.cash.shopping.screens.ShoppingWebScreen;
import com.squareup.cash.shopping.sup.presenters.SingleUsePaymentCancelPlanDialogPresenter$Factory$Impl;
import com.squareup.cash.shopping.sup.screens.SingleUsePaymentScreen$SingleUsePaymentCancelPlanDialogScreen;
import com.squareup.cash.storage.AndroidFileProvider;
import com.squareup.cash.storage.RealFileDownloader;
import com.squareup.cash.support.chat.presenters.ChatImageDetailPresenter$MetroFactory;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.wallet.data.IssuedCardManager;
import com.squareup.cash.work.session.RealCurrentUserSetter;
import com.squareup.kotterknife.Lazy;
import com.squareup.preferences.BooleanPreference;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.grantly.app.ShippingAddressService;
import com.squareup.protos.cash.postbank.api.PostbankAppService;
import com.squareup.protos.cash.sup.api.v1.CheckoutService;
import com.squareup.protos.cash.sup.api.v1.MerchantConfigService;
import com.squareup.scannerview.SizeMap;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class ShoppingPresenterFactory implements PresenterFactory {
    public final /* synthetic */ int $r8$classId = 2;
    public final Object brandsSearchPresenterFactory;
    public final Object cashAppPayIncentiveSheetPresenter;
    public final Object cashAppPayIncentiveSilentAuthErrorDialogPresenter;
    public final Object productSearchPresenterFactory;
    public final Object restrictedItemWarningSheetScreen;
    public final Object shoppingInfoSheetPresenterFactory;
    public final Object shoppingWebPresenterFactory;
    public final Object singleUsePaymentCancelPlanPresenterFactory;

    public ShoppingPresenterFactory(ShoppingWebPresenter$Factory$Impl shoppingWebPresenter$Factory$Impl, ShoppingInfoSheetPresenter$Factory$Impl shoppingInfoSheetPresenter$Factory$Impl, BrandsSearchPresenter$Factory$Impl brandsSearchPresenter$Factory$Impl, ProductSearchPresenter$Factory$Impl productSearchPresenter$Factory$Impl, CashAppPayIncentiveSilentAuthErrorDialogPresenter$Factory$Impl cashAppPayIncentiveSilentAuthErrorDialogPresenter$Factory$Impl, CashAppPayIncentiveSheetPresenter$Factory$Impl cashAppPayIncentiveSheetPresenter$Factory$Impl, RestrictedItemWarningSheetPresenter$Factory$Impl restrictedItemWarningSheetPresenter$Factory$Impl, SingleUsePaymentCancelPlanDialogPresenter$Factory$Impl singleUsePaymentCancelPlanDialogPresenter$Factory$Impl) {
        this.shoppingWebPresenterFactory = shoppingWebPresenter$Factory$Impl;
        this.shoppingInfoSheetPresenterFactory = shoppingInfoSheetPresenter$Factory$Impl;
        this.brandsSearchPresenterFactory = brandsSearchPresenter$Factory$Impl;
        this.productSearchPresenterFactory = productSearchPresenter$Factory$Impl;
        this.cashAppPayIncentiveSilentAuthErrorDialogPresenter = cashAppPayIncentiveSilentAuthErrorDialogPresenter$Factory$Impl;
        this.cashAppPayIncentiveSheetPresenter = cashAppPayIncentiveSheetPresenter$Factory$Impl;
        this.restrictedItemWarningSheetScreen = restrictedItemWarningSheetPresenter$Factory$Impl;
        this.singleUsePaymentCancelPlanPresenterFactory = singleUsePaymentCancelPlanDialogPresenter$Factory$Impl;
    }

    @Override // app.cash.broadway.presenter.PresenterFactory
    public final Presenter create(Screen screen, BetterNavigator.ScreenNavigator screenNavigator) {
        int i = this.$r8$classId;
        Object obj = this.productSearchPresenterFactory;
        Object obj2 = this.singleUsePaymentCancelPlanPresenterFactory;
        Object obj3 = this.restrictedItemWarningSheetScreen;
        Object obj4 = this.cashAppPayIncentiveSheetPresenter;
        Object obj5 = this.cashAppPayIncentiveSilentAuthErrorDialogPresenter;
        Object obj6 = this.brandsSearchPresenterFactory;
        Object obj7 = this.shoppingInfoSheetPresenterFactory;
        Object obj8 = this.shoppingWebPresenterFactory;
        switch (i) {
            case 0:
                screen.getClass();
                if (screen instanceof ShoppingWebScreen) {
                    ActivityTabPresenter.MetroFactory metroFactory = ((ShoppingWebPresenter$Factory$Impl) obj8).delegateFactory;
                    RealProfileManager realProfileManager = (RealProfileManager) metroFactory.tabToolbarPresenterFactory.invoke();
                    MerchantConfigService merchantConfigService = (MerchantConfigService) metroFactory.activitiesManagerFactory.invoke();
                    CheckoutService checkoutService = (CheckoutService) metroFactory.activitiesSearchCache.invoke();
                    AnalyzeCartService analyzeCartService = (AnalyzeCartService) metroFactory.appService.invoke();
                    ShippingAddressService shippingAddressService = (ShippingAddressService) metroFactory.contactHeaderPresenterFactory.invoke();
                    IssuedCardManager issuedCardManager = (IssuedCardManager) metroFactory.permissionManager.invoke();
                    AndroidStringManager androidStringManager = (AndroidStringManager) metroFactory.initialArgumentsSupplier.invoke();
                    RealSettingsEligibilityManager realSettingsEligibilityManager = (RealSettingsEligibilityManager) metroFactory.activityFeedProducer.invoke();
                    FeatureFlagManager featureFlagManager = (FeatureFlagManager) metroFactory.strings.invoke();
                    SyncValueReader syncValueReader = (SyncValueReader) metroFactory.activityItemPresenterFactory.invoke();
                    Analytics analytics = (Analytics) metroFactory.activityUpdatesNotifierRelay.invoke();
                    ShoppingWebAnalytics$Factory$Impl shoppingWebAnalytics$Factory$Impl = (ShoppingWebAnalytics$Factory$Impl) metroFactory.inlineAppMessagePresenterFactory.value;
                    RealBoostAnalyticsHelper realBoostAnalyticsHelper = (RealBoostAnalyticsHelper) metroFactory.offlineActivitiesManager.invoke();
                    RealShopHubAnalyticsHelper realShopHubAnalyticsHelper = (RealShopHubAnalyticsHelper) metroFactory.offlineManager.invoke();
                    RealOffersAnalyticsHelper realOffersAnalyticsHelper = (RealOffersAnalyticsHelper) metroFactory.appConfigManager.invoke();
                    RealAfterpayAppletAnalytics realAfterpayAppletAnalytics = (RealAfterpayAppletAnalytics) metroFactory.flowStarter.invoke();
                    RealBoostRepository realBoostRepository = (RealBoostRepository) metroFactory.analytics.invoke();
                    FlowStarter flowStarter = (FlowStarter) metroFactory.inputFieldTextSaver.invoke();
                    CoroutineContext coroutineContext = (CoroutineContext) metroFactory.pendingPopupAppMessages.invoke();
                    AndroidClock androidClock = (AndroidClock) metroFactory.activityToken.invoke();
                    zzr zzrVar = (zzr) ((RealCurrentUserSetter.MetroFactory) metroFactory.dateTimeFormatterFactory).invoke();
                    CoroutineScope coroutineScope = (CoroutineScope) metroFactory.inlineAppMessageV2PresenterFactory.value;
                    BooleanPreference booleanPreference = (BooleanPreference) metroFactory.activitiesManager.invoke();
                    BooleanPreference booleanPreference2 = (BooleanPreference) metroFactory.activityViewed.invoke();
                    LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) metroFactory.inlineMessageV2TooltipViewed.invoke();
                    RealShoppingJavascriptPresenter$Factory$Impl realShoppingJavascriptPresenter$Factory$Impl = (RealShoppingJavascriptPresenter$Factory$Impl) metroFactory.cardAppMessagePresenterFactory.value;
                    RealAutofillWebManagerProvider realAutofillWebManagerProvider = (RealAutofillWebManagerProvider) metroFactory.activityAnalyticsService.invoke();
                    RealFillrWebManager realFillrWebManager = (RealFillrWebManager) metroFactory.featureFlagManager.invoke();
                    RealCashFillJsStore realCashFillJsStore = (RealCashFillJsStore) metroFactory.defaultActivityItemEventHandlerFactory.invoke();
                    RealFileDownloader realFileDownloader = (RealFileDownloader) metroFactory.alertBannerPresenterFactory.invoke();
                    KeyValue keyValue = (KeyValue) ((RealCurrentUserSetter.MetroFactory) metroFactory.loadTimeClockFactory).invoke();
                    KeyValue keyValue2 = (KeyValue) ((RealCurrentUserSetter.MetroFactory) metroFactory.promoterActivityMessageProvider).invoke();
                    RealUuidGenerator realUuidGenerator = (RealUuidGenerator) metroFactory.routerFactory.invoke();
                    RealClientSyncer realClientSyncer = (RealClientSyncer) metroFactory.moneybotFlagsHelper.invoke();
                    Lazy lazy = (Lazy) ((RealLoanFlowStarter$MetroFactory) metroFactory.activityTabItemEventDecorator).invoke();
                    realProfileManager.getClass();
                    merchantConfigService.getClass();
                    checkoutService.getClass();
                    analyzeCartService.getClass();
                    shippingAddressService.getClass();
                    issuedCardManager.getClass();
                    androidStringManager.getClass();
                    realSettingsEligibilityManager.getClass();
                    featureFlagManager.getClass();
                    syncValueReader.getClass();
                    analytics.getClass();
                    shoppingWebAnalytics$Factory$Impl.getClass();
                    realBoostAnalyticsHelper.getClass();
                    realShopHubAnalyticsHelper.getClass();
                    realOffersAnalyticsHelper.getClass();
                    realAfterpayAppletAnalytics.getClass();
                    realBoostRepository.getClass();
                    flowStarter.getClass();
                    coroutineContext.getClass();
                    androidClock.getClass();
                    coroutineScope.getClass();
                    booleanPreference.getClass();
                    booleanPreference2.getClass();
                    factory.getClass();
                    realShoppingJavascriptPresenter$Factory$Impl.getClass();
                    realAutofillWebManagerProvider.getClass();
                    realFillrWebManager.getClass();
                    realCashFillJsStore.getClass();
                    realFileDownloader.getClass();
                    realUuidGenerator.getClass();
                    realClientSyncer.getClass();
                    return MoleculePresenterKt.asPresenter$default(new ShoppingWebPresenter(screenNavigator, (ShoppingWebScreen) screen, realProfileManager, merchantConfigService, checkoutService, analyzeCartService, shippingAddressService, issuedCardManager, androidStringManager, realSettingsEligibilityManager, featureFlagManager, syncValueReader, analytics, shoppingWebAnalytics$Factory$Impl, realBoostAnalyticsHelper, realShopHubAnalyticsHelper, realOffersAnalyticsHelper, realAfterpayAppletAnalytics, realBoostRepository, flowStarter, coroutineContext, androidClock, zzrVar, coroutineScope, booleanPreference, booleanPreference2, factory, realShoppingJavascriptPresenter$Factory$Impl, realAutofillWebManagerProvider, realFillrWebManager, realCashFillJsStore, realFileDownloader, keyValue, keyValue2, realUuidGenerator, realClientSyncer, lazy));
                }
                if (screen instanceof ShoppingInfoSheetScreen) {
                    VerifyMagicPresenter$MetroFactory verifyMagicPresenter$MetroFactory = ((ShoppingInfoSheetPresenter$Factory$Impl) obj7).delegateFactory;
                    Analytics analytics2 = (Analytics) verifyMagicPresenter$MetroFactory.analytics.getValue();
                    RealShopHubAnalyticsHelper realShopHubAnalyticsHelper2 = (RealShopHubAnalyticsHelper) verifyMagicPresenter$MetroFactory.appService.getValue();
                    RealShopHubRepository realShopHubRepository = (RealShopHubRepository) verifyMagicPresenter$MetroFactory.flowStarter.getValue();
                    IntentLauncher intentLauncher = (IntentLauncher) verifyMagicPresenter$MetroFactory.blockersNavigator.invoke();
                    RealClientRouteParser realClientRouteParser = (RealClientRouteParser) verifyMagicPresenter$MetroFactory.signOut.getValue();
                    RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) verifyMagicPresenter$MetroFactory.blockerFlowAnalytics.invoke();
                    AndroidStringManager androidStringManager2 = (AndroidStringManager) verifyMagicPresenter$MetroFactory.stringManager.lambda.invoke();
                    analytics2.getClass();
                    realShopHubAnalyticsHelper2.getClass();
                    realShopHubRepository.getClass();
                    intentLauncher.getClass();
                    realClientRouteParser.getClass();
                    realRouter$Factory$Impl.getClass();
                    androidStringManager2.getClass();
                    return MoleculePresenterKt.asPresenter$default(new ShoppingInfoSheetPresenter((ShoppingInfoSheetScreen) screen, screenNavigator, analytics2, realShopHubAnalyticsHelper2, realShopHubRepository, intentLauncher, realClientRouteParser, realRouter$Factory$Impl, androidStringManager2));
                }
                if (screen instanceof ShoppingScreen$BrandsSearchScreen) {
                    ImageLoader$Builder imageLoader$Builder = ((BrandsSearchPresenter$Factory$Impl) obj6).delegateFactory;
                    SizeMap sizeMap = (SizeMap) ((RealCurrentUserSetter.MetroFactory) imageLoader$Builder.application).invoke();
                    AndroidStringManager androidStringManager3 = (AndroidStringManager) ((LambdaProvider) imageLoader$Builder.defaults).lambda.invoke();
                    RealRouter$Factory$Impl realRouter$Factory$Impl2 = (RealRouter$Factory$Impl) ((Provider) imageLoader$Builder.mainCoroutineContextLazy).invoke();
                    long longValue = ((Number) ((DoubleCheck) imageLoader$Builder.memoryCacheLazy).getValue()).longValue();
                    AndroidClock androidClock2 = (AndroidClock) ((LambdaProvider) imageLoader$Builder.diskCacheLazy).lambda.invoke();
                    RealRecentSearchManager realRecentSearchManager = (RealRecentSearchManager) ((Provider) imageLoader$Builder.eventListenerFactory).invoke();
                    Analytics analytics3 = (Analytics) ((DoubleCheck) imageLoader$Builder.componentRegistry).getValue();
                    RealShopHubAnalyticsHelper realShopHubAnalyticsHelper3 = (RealShopHubAnalyticsHelper) ((DoubleCheck) imageLoader$Builder.extras).getValue();
                    androidStringManager3.getClass();
                    realRouter$Factory$Impl2.getClass();
                    androidClock2.getClass();
                    realRecentSearchManager.getClass();
                    analytics3.getClass();
                    realShopHubAnalyticsHelper3.getClass();
                    return MoleculePresenterKt.asPresenter$default(new BrandsSearchPresenter((ShoppingScreen$BrandsSearchScreen) screen, sizeMap, androidStringManager3, screenNavigator, realRouter$Factory$Impl2, longValue, androidClock2, realRecentSearchManager, analytics3, realShopHubAnalyticsHelper3));
                }
                if (screen instanceof ShoppingScreen$ProductSearchScreen) {
                    DeviceBuildInfo deviceBuildInfo = ((ProductSearchPresenter$Factory$Impl) obj).delegateFactory;
                    RealProductSearchRepository realProductSearchRepository = (RealProductSearchRepository) ((DoubleCheck) deviceBuildInfo.manufacturer).getValue();
                    AndroidStringManager androidStringManager4 = (AndroidStringManager) ((LambdaProvider) deviceBuildInfo.model).lambda.invoke();
                    long longValue2 = ((Number) ((DoubleCheck) deviceBuildInfo.osVersion).getValue()).longValue();
                    RealClientRouteParser realClientRouteParser2 = (RealClientRouteParser) ((DoubleCheck) deviceBuildInfo.osBuild).getValue();
                    RealRouter$Factory$Impl realRouter$Factory$Impl3 = (RealRouter$Factory$Impl) ((Provider) deviceBuildInfo.fingerprint).invoke();
                    AndroidClock androidClock3 = (AndroidClock) ((LambdaProvider) deviceBuildInfo.tags).lambda.invoke();
                    RealRecentSearchManager realRecentSearchManager2 = (RealRecentSearchManager) ((Provider) deviceBuildInfo.brand).invoke();
                    Analytics analytics4 = (Analytics) ((DoubleCheck) deviceBuildInfo.apiLevel).getValue();
                    RealShopHubAnalyticsHelper realShopHubAnalyticsHelper4 = (RealShopHubAnalyticsHelper) ((DoubleCheck) deviceBuildInfo.cpuAbis).getValue();
                    realProductSearchRepository.getClass();
                    androidStringManager4.getClass();
                    realClientRouteParser2.getClass();
                    realRouter$Factory$Impl3.getClass();
                    androidClock3.getClass();
                    realRecentSearchManager2.getClass();
                    analytics4.getClass();
                    realShopHubAnalyticsHelper4.getClass();
                    return MoleculePresenterKt.asPresenter$default(new ProductSearchPresenter((ShoppingScreen$ProductSearchScreen) screen, realProductSearchRepository, androidStringManager4, longValue2, screenNavigator, realClientRouteParser2, realRouter$Factory$Impl3, androidClock3, realRecentSearchManager2, analytics4, realShopHubAnalyticsHelper4));
                }
                if (screen instanceof CashAppPayIncentiveScreen$SilentAuthorizationErrorDialog) {
                    Analytics analytics5 = (Analytics) ((CashAppPayIncentiveSilentAuthErrorDialogPresenter$Factory$Impl) obj5).delegateFactory.analytics.getValue();
                    analytics5.getClass();
                    return MoleculePresenterKt.asPresenter$default(new InviteErrorPresenter(screenNavigator, (CashAppPayIncentiveScreen$SilentAuthorizationErrorDialog) screen, analytics5));
                }
                if (screen instanceof CashAppPayIncentiveScreen$IncentivePromptSheetScreen) {
                    StampSheetPresenter$MetroFactory stampSheetPresenter$MetroFactory = ((CashAppPayIncentiveSheetPresenter$Factory$Impl) obj4).delegateFactory;
                    AndroidStringManager androidStringManager5 = (AndroidStringManager) stampSheetPresenter$MetroFactory.ioContext.lambda.invoke();
                    Analytics analytics6 = (Analytics) stampSheetPresenter$MetroFactory.appConfig.getValue();
                    androidStringManager5.getClass();
                    analytics6.getClass();
                    return MoleculePresenterKt.asPresenter$default(new CashAppPayIncentiveSheetPresenter(androidStringManager5, analytics6, (CashAppPayIncentiveScreen$IncentivePromptSheetScreen) screen, screenNavigator));
                }
                if (screen instanceof ShoppingScreen$RestrictedItemWarningSheetScreen) {
                    Analytics analytics7 = (Analytics) ((RestrictedItemWarningSheetPresenter$Factory$Impl) obj3).delegateFactory.analytics.getValue();
                    analytics7.getClass();
                    return MoleculePresenterKt.asPresenter$default(new InviteErrorPresenter((ShoppingScreen$RestrictedItemWarningSheetScreen) screen, screenNavigator, analytics7));
                }
                if (!(screen instanceof SingleUsePaymentScreen$SingleUsePaymentCancelPlanDialogScreen)) {
                    return null;
                }
                AndroidStringManager androidStringManager6 = (AndroidStringManager) ((SingleUsePaymentCancelPlanDialogPresenter$Factory$Impl) obj2).delegateFactory.stringManager.lambda.invoke();
                androidStringManager6.getClass();
                return MoleculePresenterKt.asPresenter$default(new CardStudioUndoDialogPresenter((SingleUsePaymentScreen$SingleUsePaymentCancelPlanDialogScreen) screen, screenNavigator, androidStringManager6));
            case 1:
                RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl = (RealBlockersHelper$Factory$Impl) obj4;
                RealMultiBlockerFacilitator realMultiBlockerFacilitator = (RealMultiBlockerFacilitator) obj6;
                Analytics analytics8 = (Analytics) obj8;
                screen.getClass();
                if (screen instanceof BlockersScreens.BlockerActionDialogActionScreen) {
                    return MoleculePresenterKt.asPresenter$default(new BlockerActionDialogActionPresenter(screenNavigator, (BlockersScreens.BlockerActionDialogActionScreen) screen, analytics8, (BlockerFlowListener) obj7, realMultiBlockerFacilitator, (CoroutineScope) obj2));
                }
                if (screen instanceof BlockersScreens.BlockerActionConfirmSheetScreen) {
                    return MoleculePresenterKt.asPresenter$default(new BlockerActionConfirmSheetPresenter(realMultiBlockerFacilitator, (BlockersScreens.BlockerActionConfirmSheetScreen) screen, realBlockersHelper$Factory$Impl, (AppForegroundStateProvider) obj5, screenNavigator, (BlockersDataNavigator) obj, analytics8, (BlockerActionUriDecoder) obj3));
                }
                if (screen instanceof BlockersScreens.BlockerActionFileDownloadDialogScreen) {
                    return MoleculePresenterKt.asPresenter$default(new AddAliasPresenter(screenNavigator, 4));
                }
                if (screen instanceof BlockersScreens.BlockerActionFileDownloadFailureDialogScreen) {
                    return MoleculePresenterKt.asPresenter$default(new ErrorPresenter((BlockersScreens.BlockerActionFileDownloadFailureDialogScreen) screen, screenNavigator));
                }
                if (screen instanceof BlockersScreens.BlockerActionConfirmDialogScreen) {
                    return MoleculePresenterKt.asPresenter$default(new BlockerActionConfirmDialogPresenter(realBlockersHelper$Factory$Impl, (BlockersScreens.BlockerActionConfirmDialogScreen) screen, screenNavigator));
                }
                return null;
            default:
                screen.getClass();
                if (screen instanceof DirectDepositSetupScreen) {
                    Profile.Adapter adapter = ((DirectDepositSetupPresenter$Factory$Impl) obj8).delegateFactory;
                    RealDemandDepositAccountManager realDemandDepositAccountManager = (RealDemandDepositAccountManager) ((DoubleCheck) adapter.nearby_visibilityAdapter).getValue();
                    DemandDepositAccountFormatter demandDepositAccountFormatter = new DemandDepositAccountFormatter();
                    AndroidStringManager androidStringManager7 = (AndroidStringManager) ((LambdaProvider) adapter.rate_planAdapter).lambda.invoke();
                    RealClipboardManager realClipboardManager = (RealClipboardManager) ((LambdaProvider) adapter.deposit_preferenceAdapter).lambda.invoke();
                    RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl2 = (RealBlockersHelper$Factory$Impl) ((Provider) adapter.country_codeAdapter).invoke();
                    Analytics analytics9 = (Analytics) ((DoubleCheck) adapter.default_currencyAdapter).getValue();
                    RealBankingOptionBadgeUpdater realBankingOptionBadgeUpdater = (RealBankingOptionBadgeUpdater) ((Provider) adapter.incoming_request_policyAdapter).invoke();
                    RealMoneyNavigatorHelper realMoneyNavigatorHelper = (RealMoneyNavigatorHelper) ((Provider) adapter.regionAdapter).invoke();
                    ErrorReporter errorReporter = (ErrorReporter) ((LambdaProvider) adapter.bitcoin_display_unitsAdapter).lambda.invoke();
                    PostbankAppService postbankAppService = (PostbankAppService) ((DoubleCheck) adapter.bitcoin_amount_entry_currency_preferenceAdapter).getValue();
                    SyncValueReader syncValueReader2 = (SyncValueReader) ((DoubleCheck) adapter.addressAdapter).getValue();
                    FeatureFlagManager featureFlagManager2 = (FeatureFlagManager) ((DoubleCheck) adapter.deposit_preference_dataAdapter).getValue();
                    RealRouter$Factory$Impl realRouter$Factory$Impl4 = (RealRouter$Factory$Impl) ((Provider) adapter.available_p2p_target_regionsAdapter).invoke();
                    realDemandDepositAccountManager.getClass();
                    androidStringManager7.getClass();
                    realClipboardManager.getClass();
                    realBlockersHelper$Factory$Impl2.getClass();
                    analytics9.getClass();
                    realBankingOptionBadgeUpdater.getClass();
                    realMoneyNavigatorHelper.getClass();
                    errorReporter.getClass();
                    postbankAppService.getClass();
                    syncValueReader2.getClass();
                    featureFlagManager2.getClass();
                    realRouter$Factory$Impl4.getClass();
                    return MoleculePresenterKt.asPresenter$default(new DirectDepositSetupPresenter(realDemandDepositAccountManager, demandDepositAccountFormatter, androidStringManager7, realClipboardManager, realBlockersHelper$Factory$Impl2, analytics9, realBankingOptionBadgeUpdater, realMoneyNavigatorHelper, errorReporter, postbankAppService, syncValueReader2, featureFlagManager2, realRouter$Factory$Impl4, (DirectDepositSetupScreen) screen, screenNavigator));
                }
                if (screen instanceof DirectDepositEditCompanyNameScreen) {
                    OnboardingLandingPresenter$MetroFactory onboardingLandingPresenter$MetroFactory = ((DirectDepositEditCompanyNamePresenter$Factory$Impl) obj7).delegateFactory;
                    AndroidStringManager androidStringManager8 = (AndroidStringManager) onboardingLandingPresenter$MetroFactory.observabilityManager.lambda.invoke();
                    RealInputFieldTextSaver realInputFieldTextSaver = (RealInputFieldTextSaver) onboardingLandingPresenter$MetroFactory.stringManager.lambda.invoke();
                    Analytics analytics10 = (Analytics) onboardingLandingPresenter$MetroFactory.analytics.getValue();
                    androidStringManager8.getClass();
                    realInputFieldTextSaver.getClass();
                    analytics10.getClass();
                    return MoleculePresenterKt.asPresenter$default(new CardStudioPresenter(androidStringManager8, realInputFieldTextSaver, analytics10, (DirectDepositEditCompanyNameScreen) screen, screenNavigator));
                }
                if (screen instanceof DirectDepositManualFormDetailsScreen) {
                    LegacyStablecoinDepositPresenter$MetroFactory legacyStablecoinDepositPresenter$MetroFactory = ((DirectDepositManualFormDetailsPresenter$Factory$Impl) obj6).delegateFactory;
                    AndroidStringManager androidStringManager9 = (AndroidStringManager) legacyStablecoinDepositPresenter$MetroFactory.stringManager.lambda.invoke();
                    LocalizedMoneyFormatter.Factory factory2 = (LocalizedMoneyFormatter.Factory) legacyStablecoinDepositPresenter$MetroFactory.qrCodesPresenter.invoke();
                    RealProfileManager realProfileManager2 = (RealProfileManager) legacyStablecoinDepositPresenter$MetroFactory.profileManager.invoke();
                    Analytics analytics11 = (Analytics) legacyStablecoinDepositPresenter$MetroFactory.blockStableService.getValue();
                    androidStringManager9.getClass();
                    factory2.getClass();
                    realProfileManager2.getClass();
                    analytics11.getClass();
                    return MoleculePresenterKt.asPresenter$default(new CardStudioPresenter(androidStringManager9, factory2, realProfileManager2, analytics11, (DirectDepositManualFormDetailsScreen) screen, screenNavigator));
                }
                if (screen instanceof DirectDepositEditPaycheckAllocationScreen) {
                    return MoleculePresenterKt.asPresenter$default(new VerifyCheckDialogPresenter((DirectDepositEditPaycheckAllocationScreen) screen, screenNavigator));
                }
                if (screen instanceof DirectDepositEditPaycheckCurrencyAllocationScreen) {
                    LiteActivityPresenter.MetroFactory metroFactory2 = ((DirectDepositEditPaycheckCurrencyAllocationPresenter$Factory$Impl) obj5).delegateFactory;
                    AndroidStringManager androidStringManager10 = (AndroidStringManager) metroFactory2.sessionManager.lambda.invoke();
                    RealInputFieldTextSaver realInputFieldTextSaver2 = (RealInputFieldTextSaver) metroFactory2.stringManager.lambda.invoke();
                    RealJurisdictionConfigManager realJurisdictionConfigManager = (RealJurisdictionConfigManager) metroFactory2.activityEmbeddedPresenterFactory.invoke();
                    androidStringManager10.getClass();
                    realInputFieldTextSaver2.getClass();
                    realJurisdictionConfigManager.getClass();
                    return MoleculePresenterKt.asPresenter$default(new CardStudioPresenter(androidStringManager10, realInputFieldTextSaver2, realJurisdictionConfigManager, (DirectDepositEditPaycheckCurrencyAllocationScreen) screen, screenNavigator));
                }
                if (screen instanceof DirectDepositEditPaycheckPercentageScreen) {
                    ChatImageDetailPresenter$MetroFactory chatImageDetailPresenter$MetroFactory = ((DirectDepositEditPaycheckPercentagePresenter$Factory$Impl) obj4).delegateFactory;
                    AndroidStringManager androidStringManager11 = (AndroidStringManager) chatImageDetailPresenter$MetroFactory.accessibilityManager.lambda.invoke();
                    RealInputFieldTextSaver realInputFieldTextSaver3 = (RealInputFieldTextSaver) chatImageDetailPresenter$MetroFactory.stringManager.lambda.invoke();
                    androidStringManager11.getClass();
                    realInputFieldTextSaver3.getClass();
                    return MoleculePresenterKt.asPresenter$default(new LocalPosCheckInPresenter(androidStringManager11, realInputFieldTextSaver3, (DirectDepositEditPaycheckPercentageScreen) screen, screenNavigator));
                }
                if (screen instanceof DirectDepositEditFullNameScreen) {
                    ChatImageDetailPresenter$MetroFactory chatImageDetailPresenter$MetroFactory2 = ((DirectDepositEditFullNamePresenter$Factory$Impl) obj3).delegateFactory;
                    AndroidStringManager androidStringManager12 = (AndroidStringManager) chatImageDetailPresenter$MetroFactory2.accessibilityManager.lambda.invoke();
                    RealInputFieldTextSaver realInputFieldTextSaver4 = (RealInputFieldTextSaver) chatImageDetailPresenter$MetroFactory2.stringManager.lambda.invoke();
                    androidStringManager12.getClass();
                    realInputFieldTextSaver4.getClass();
                    return MoleculePresenterKt.asPresenter$default(new LocalPosCheckInPresenter(androidStringManager12, realInputFieldTextSaver4, (DirectDepositEditFullNameScreen) screen, screenNavigator));
                }
                if (!(screen instanceof DirectDepositManualFormSubmissionScreen)) {
                    if (!(screen instanceof DirectDepositUpdateManualFormScreen)) {
                        return null;
                    }
                    FormPresenter.MetroFactory metroFactory3 = ((DirectDepositUpdateManualFormDetailsPresenter$Factory$Impl) obj).delegateFactory;
                    AndroidStringManager androidStringManager13 = (AndroidStringManager) metroFactory3.clock.lambda.invoke();
                    LocalizedMoneyFormatter.Factory factory3 = (LocalizedMoneyFormatter.Factory) metroFactory3.blockersHelperFactory.invoke();
                    RealFormPdfProvider realFormPdfProvider = (RealFormPdfProvider) metroFactory3.formAnalytics.invoke();
                    PostbankAppService postbankAppService2 = (PostbankAppService) metroFactory3.analytics.getValue();
                    RealJurisdictionConfigManager realJurisdictionConfigManager2 = (RealJurisdictionConfigManager) metroFactory3.blockerActionUriDecoder.invoke();
                    androidStringManager13.getClass();
                    factory3.getClass();
                    realFormPdfProvider.getClass();
                    postbankAppService2.getClass();
                    realJurisdictionConfigManager2.getClass();
                    return MoleculePresenterKt.asPresenter$default(new LocalEditorialPresenter(androidStringManager13, factory3, realFormPdfProvider, postbankAppService2, realJurisdictionConfigManager2, (DirectDepositUpdateManualFormScreen) screen, screenNavigator));
                }
                AfterpaySearchPresenter$MetroFactory afterpaySearchPresenter$MetroFactory = ((DirectDepositManualFormCompletionPresenter$Factory$Impl) obj2).delegateFactory;
                AndroidStringManager androidStringManager14 = (AndroidStringManager) afterpaySearchPresenter$MetroFactory.stringManager.lambda.invoke();
                IntentLauncher intentLauncher2 = (IntentLauncher) afterpaySearchPresenter$MetroFactory.routerFactory.invoke();
                RealFormPdfProvider realFormPdfProvider2 = (RealFormPdfProvider) afterpaySearchPresenter$MetroFactory.oneErrorPerAppSessionStrategy.invoke();
                AndroidFileProvider androidFileProvider = (AndroidFileProvider) afterpaySearchPresenter$MetroFactory.inputFieldTextSaver.lambda.invoke();
                PostbankAppService postbankAppService3 = (PostbankAppService) afterpaySearchPresenter$MetroFactory.afterpayMerchantRepo.getValue();
                Analytics analytics12 = (Analytics) afterpaySearchPresenter$MetroFactory.afterpayAnalytics.getValue();
                CoroutineContext coroutineContext2 = (CoroutineContext) afterpaySearchPresenter$MetroFactory.errorReporter.lambda.invoke();
                androidStringManager14.getClass();
                intentLauncher2.getClass();
                realFormPdfProvider2.getClass();
                androidFileProvider.getClass();
                postbankAppService3.getClass();
                analytics12.getClass();
                coroutineContext2.getClass();
                return MoleculePresenterKt.asPresenter$default(new LocalHomePresenter(androidStringManager14, intentLauncher2, realFormPdfProvider2, androidFileProvider, postbankAppService3, analytics12, coroutineContext2, (DirectDepositManualFormSubmissionScreen) screen, screenNavigator));
        }
    }

    public ShoppingPresenterFactory(Analytics analytics, BlockerFlowListener blockerFlowListener, RealMultiBlockerFacilitator realMultiBlockerFacilitator, BlockersDataNavigator blockersDataNavigator, AppForegroundStateProvider appForegroundStateProvider, RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl, BlockerActionUriDecoder blockerActionUriDecoder, BlockerActionFileDownloadFailurePresenter$Factory$Impl blockerActionFileDownloadFailurePresenter$Factory$Impl, CoroutineScope coroutineScope) {
        this.shoppingWebPresenterFactory = analytics;
        this.shoppingInfoSheetPresenterFactory = blockerFlowListener;
        this.brandsSearchPresenterFactory = realMultiBlockerFacilitator;
        this.productSearchPresenterFactory = blockersDataNavigator;
        this.cashAppPayIncentiveSilentAuthErrorDialogPresenter = appForegroundStateProvider;
        this.cashAppPayIncentiveSheetPresenter = realBlockersHelper$Factory$Impl;
        this.restrictedItemWarningSheetScreen = blockerActionUriDecoder;
        this.singleUsePaymentCancelPlanPresenterFactory = coroutineScope;
    }

    public ShoppingPresenterFactory(DirectDepositSetupPresenter$Factory$Impl directDepositSetupPresenter$Factory$Impl, DirectDepositEditCompanyNamePresenter$Factory$Impl directDepositEditCompanyNamePresenter$Factory$Impl, DirectDepositManualFormDetailsPresenter$Factory$Impl directDepositManualFormDetailsPresenter$Factory$Impl, DirectDepositUpdateManualFormDetailsPresenter$Factory$Impl directDepositUpdateManualFormDetailsPresenter$Factory$Impl, DirectDepositEditPaycheckAllocationPresenter$Factory$Impl directDepositEditPaycheckAllocationPresenter$Factory$Impl, DirectDepositEditPaycheckCurrencyAllocationPresenter$Factory$Impl directDepositEditPaycheckCurrencyAllocationPresenter$Factory$Impl, DirectDepositEditPaycheckPercentagePresenter$Factory$Impl directDepositEditPaycheckPercentagePresenter$Factory$Impl, DirectDepositEditFullNamePresenter$Factory$Impl directDepositEditFullNamePresenter$Factory$Impl, DirectDepositManualFormCompletionPresenter$Factory$Impl directDepositManualFormCompletionPresenter$Factory$Impl) {
        this.shoppingWebPresenterFactory = directDepositSetupPresenter$Factory$Impl;
        this.shoppingInfoSheetPresenterFactory = directDepositEditCompanyNamePresenter$Factory$Impl;
        this.brandsSearchPresenterFactory = directDepositManualFormDetailsPresenter$Factory$Impl;
        this.productSearchPresenterFactory = directDepositUpdateManualFormDetailsPresenter$Factory$Impl;
        this.cashAppPayIncentiveSilentAuthErrorDialogPresenter = directDepositEditPaycheckCurrencyAllocationPresenter$Factory$Impl;
        this.cashAppPayIncentiveSheetPresenter = directDepositEditPaycheckPercentagePresenter$Factory$Impl;
        this.restrictedItemWarningSheetScreen = directDepositEditFullNamePresenter$Factory$Impl;
        this.singleUsePaymentCancelPlanPresenterFactory = directDepositManualFormCompletionPresenter$Factory$Impl;
    }
}
