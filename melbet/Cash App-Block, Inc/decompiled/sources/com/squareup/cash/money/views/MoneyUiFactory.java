package com.squareup.cash.money.views;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.Ui;
import app.cash.broadway.ui.UiFactory;
import app.cash.broadway.ui.XmlFactory;
import app.cash.broadway.ui.compose.ComposeUiView;
import app.cash.cdp.backend.android.AndroidSessionIdProvider;
import app.cash.local.views.LocalViewFactory;
import app.cash.local.worker.LocalActivitySetupTeardown;
import coil3.RealImageLoader;
import com.squareup.cash.R;
import com.squareup.cash.activity.backend.ZiplineActivityItemFormatter;
import com.squareup.cash.activity.presenters.PaymentHistoryActivityItemPresenter$Factory$Impl;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletMerchantSheetRepository;
import com.squareup.cash.appmessages.views.RealTooltipTargetLoadedCallbackRegistry;
import com.squareup.cash.bitcoin.capability.RealBitcoinCapabilityProvider;
import com.squareup.cash.bitcoin.presenters.limits.util.RealBitcoinLimitsProvider;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.crypto.backend.balance.RealCryptoBalanceRepo;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.profile.CustomerLimitsManager;
import com.squareup.cash.data.profile.RealAddressManager;
import com.squareup.cash.data.profile.RealCropResultManager;
import com.squareup.cash.data.profile.RealJurisdictionConfigManager;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.downloadmanager.android.AndroidDownloadManager$Factory$Impl;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.family.familyhub.backend.real.RealDependentControlStatusManager;
import com.squareup.cash.family.familyhub.presenters.BaseDependentControlDependencies;
import com.squareup.cash.family.familyhub.presenters.RealPendingRequestActivityManager;
import com.squareup.cash.favorites.data.RealFavoritesRepository;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.history.payments.screens.PaymentHistoryScreens$ProfileCompletePaymentHistory;
import com.squareup.cash.instruments.backend.real.RealInstrumentManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.money.screens.HypeWelcomeScreen;
import com.squareup.cash.money.screens.MoneyTabScreen;
import com.squareup.cash.observability.backend.api.BugsnagClient;
import com.squareup.cash.observability.backend.real.ObservabilitySetupTeardown;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.p2pblocking.views.P2PListView;
import com.squareup.cash.payments.backend.real.RealP2pSettingsManager;
import com.squareup.cash.performance.RealScrollPerformanceTrackerFactory;
import com.squareup.cash.profile.screens.ActivePasswordDialog;
import com.squareup.cash.profile.screens.ArcadeAutofillSettingsScreen;
import com.squareup.cash.profile.screens.CashtagRequiredScreen;
import com.squareup.cash.profile.screens.GenericConfirmDialog;
import com.squareup.cash.profile.screens.InvestingContactScreen;
import com.squareup.cash.profile.screens.PersonalInfoConfirmationDialogScreen;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.profile.screens.SearchVisibilityScreen;
import com.squareup.cash.profile.views.AccountSwitchInfoDialogView;
import com.squareup.cash.profile.views.AddAliasSheet;
import com.squareup.cash.profile.views.AddAliasSheet$Factory$Impl;
import com.squareup.cash.profile.views.AppMessagesOptionsView;
import com.squareup.cash.profile.views.AppMessagesOptionsView$Factory$Impl;
import com.squareup.cash.profile.views.ConfirmReplaceInfoView;
import com.squareup.cash.profile.views.ConfirmSignOutDialog;
import com.squareup.cash.profile.views.ErrorView;
import com.squareup.cash.profile.views.FamilyEligibilityLoadingView;
import com.squareup.cash.profile.views.GenericConfirmDialogView;
import com.squareup.cash.profile.views.IncomingRequestsView;
import com.squareup.cash.profile.views.MooncakeAddressSheet;
import com.squareup.cash.profile.views.MooncakeAddressSheet$Factory$Impl;
import com.squareup.cash.profile.views.PaymentNotificationOptionsView;
import com.squareup.cash.profile.views.PaymentNotificationOptionsView$Factory$Impl;
import com.squareup.cash.profile.views.ProfileCashtagRequiredDialog;
import com.squareup.cash.profile.views.ProfileConfirmRemoveAliasDialog;
import com.squareup.cash.profile.views.ProfileCropView;
import com.squareup.cash.profile.views.ProfileCropView$Factory$Impl;
import com.squareup.cash.profile.views.ProfileHeaderMenuSheet;
import com.squareup.cash.profile.views.ProfileUiView;
import com.squareup.cash.profile.views.ReferralStatusView;
import com.squareup.cash.profile.views.SearchVisibilityView;
import com.squareup.cash.profile.views.SecurityLockView;
import com.squareup.cash.profile.views.TaxesPasswordDialog;
import com.squareup.cash.profile.views.TaxesPasswordView;
import com.squareup.cash.profile.views.UnsupportedSettingView;
import com.squareup.cash.profile.views.notifications.AdjustableThresholdView;
import com.squareup.cash.profile.views.notifications.ContactMethodDetailsView;
import com.squareup.cash.profile.views.personal.AutoFillSettingsDetailView;
import com.squareup.cash.profile.views.personal.PersonalInfoConfirmationDialog;
import com.squareup.cash.profile.views.security.ProfilePrivacyView;
import com.squareup.cash.profile.views.security.ProfileSecurityView;
import com.squareup.cash.profile.views.trustedcontact.InvestingContactView;
import com.squareup.cash.recipients.backend.real.RealSuggestedRecipientsVendor;
import com.squareup.cash.recipients.data.RealCustomerStore;
import com.squareup.cash.resource.AndroidDateFormatManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.transfers.backend.real.RealIcuStringFormatter;
import com.squareup.cash.transfers.backend.real.RealScheduledReloadsManager;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.util.money.CurrencyConverter$Factory;
import com.squareup.cash.wallet.presenters.RealCardCustomizationRepository;
import com.squareup.cash.wallet.views.CardRegistry;
import com.squareup.cash.webview.android.WebViewProvider;
import com.squareup.preferences.BooleanPreference;
import com.squareup.preferences.UriPreference;
import com.squareup.protos.cash.activity.api.v1.ActivityClientService;
import com.squareup.protos.cash.cashfavorites.api.v1.CashFavoritesService;
import com.squareup.protos.cash.cashsuggest.api.CashSuggestClientService;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.util.android.AndroidDeviceInfo;
import com.squareup.util.coroutines.Signal;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.Factory;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class MoneyUiFactory implements UiFactory {
    public final /* synthetic */ int $r8$classId = 0;
    public final Object cardRegistry;
    public final Object elementBoundsRegistry;
    public final Object featureFlagManager;
    public final RealImageLoader imageLoader;
    public final Object scrollPerformanceTrackerFactory;
    public final Object tooltipTargetLoadedCallbackRegistry;

    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final Provider cardRegistry;
        public final Provider elementBoundsRegistry;
        public final Provider featureFlagManager;
        public final Provider imageLoader;
        public final Provider scrollPerformanceTrackerFactory;
        public final Provider tooltipTargetLoadedCallbackRegistry;

        public /* synthetic */ MetroFactory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, int i) {
            this.$r8$classId = i;
            this.imageLoader = provider;
            this.elementBoundsRegistry = provider2;
            this.cardRegistry = provider3;
            this.scrollPerformanceTrackerFactory = provider4;
            this.tooltipTargetLoadedCallbackRegistry = provider5;
            this.featureFlagManager = provider6;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            Provider provider = this.cardRegistry;
            Provider provider2 = this.featureFlagManager;
            Provider provider3 = this.tooltipTargetLoadedCallbackRegistry;
            Provider provider4 = this.scrollPerformanceTrackerFactory;
            Provider provider5 = this.elementBoundsRegistry;
            Provider provider6 = this.imageLoader;
            switch (i) {
                case 0:
                    RealImageLoader realImageLoader = (RealImageLoader) provider6.invoke();
                    ElementBoundsRegistry elementBoundsRegistry = (ElementBoundsRegistry) provider5.invoke();
                    CardRegistry cardRegistry = (CardRegistry) provider.invoke();
                    RealScrollPerformanceTrackerFactory realScrollPerformanceTrackerFactory = (RealScrollPerformanceTrackerFactory) provider4.invoke();
                    RealTooltipTargetLoadedCallbackRegistry realTooltipTargetLoadedCallbackRegistry = (RealTooltipTargetLoadedCallbackRegistry) provider3.invoke();
                    FeatureFlagManager featureFlagManager = (FeatureFlagManager) provider2.invoke();
                    realImageLoader.getClass();
                    elementBoundsRegistry.getClass();
                    cardRegistry.getClass();
                    realScrollPerformanceTrackerFactory.getClass();
                    realTooltipTargetLoadedCallbackRegistry.getClass();
                    featureFlagManager.getClass();
                    return new MoneyUiFactory(realImageLoader, elementBoundsRegistry, cardRegistry, realScrollPerformanceTrackerFactory, realTooltipTargetLoadedCallbackRegistry, featureFlagManager);
                case 1:
                    CashSuggestClientService cashSuggestClientService = (CashSuggestClientService) provider6.invoke();
                    CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) provider5.invoke();
                    AndroidClock androidClock = (AndroidClock) provider.invoke();
                    ErrorReporter errorReporter = (ErrorReporter) provider4.invoke();
                    SampleStrategy sampleStrategy = (SampleStrategy) provider3.invoke();
                    CoroutineContext coroutineContext = (CoroutineContext) provider2.invoke();
                    cashSuggestClientService.getClass();
                    cashAccountDatabaseImpl.getClass();
                    androidClock.getClass();
                    errorReporter.getClass();
                    sampleStrategy.getClass();
                    coroutineContext.getClass();
                    return new RealAfterpayAppletMerchantSheetRepository(cashSuggestClientService, cashAccountDatabaseImpl, androidClock, errorReporter, sampleStrategy, coroutineContext);
                case 2:
                    RealCryptoBalanceRepo realCryptoBalanceRepo = (RealCryptoBalanceRepo) provider6.invoke();
                    CustomerLimitsManager customerLimitsManager = (CustomerLimitsManager) provider5.invoke();
                    CurrencyConverter$Factory currencyConverter$Factory = (CurrencyConverter$Factory) provider.invoke();
                    AppConfigManager appConfigManager = (AppConfigManager) provider4.invoke();
                    RealJurisdictionConfigManager realJurisdictionConfigManager = (RealJurisdictionConfigManager) provider3.invoke();
                    FeatureFlagManager featureFlagManager2 = (FeatureFlagManager) provider2.invoke();
                    realCryptoBalanceRepo.getClass();
                    customerLimitsManager.getClass();
                    currencyConverter$Factory.getClass();
                    appConfigManager.getClass();
                    realJurisdictionConfigManager.getClass();
                    featureFlagManager2.getClass();
                    return new RealBitcoinLimitsProvider(realCryptoBalanceRepo, customerLimitsManager, currencyConverter$Factory, appConfigManager, realJurisdictionConfigManager, featureFlagManager2);
                case 3:
                    RealCustomerStore realCustomerStore = (RealCustomerStore) provider6.invoke();
                    AndroidStringManager androidStringManager = (AndroidStringManager) provider5.invoke();
                    Analytics analytics = (Analytics) provider.invoke();
                    SessionManager sessionManager = (SessionManager) provider4.invoke();
                    RealDependentControlStatusManager.Factory factory = (RealDependentControlStatusManager.Factory) provider3.invoke();
                    RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) provider2.invoke();
                    realCustomerStore.getClass();
                    androidStringManager.getClass();
                    analytics.getClass();
                    sessionManager.getClass();
                    factory.getClass();
                    realRouter$Factory$Impl.getClass();
                    return new BaseDependentControlDependencies(realCustomerStore, androidStringManager, analytics, sessionManager, factory, realRouter$Factory$Impl);
                case 4:
                    ZiplineActivityItemFormatter ziplineActivityItemFormatter = (ZiplineActivityItemFormatter) provider6.invoke();
                    PaymentHistoryActivityItemPresenter$Factory$Impl paymentHistoryActivityItemPresenter$Factory$Impl = (PaymentHistoryActivityItemPresenter$Factory$Impl) provider5.invoke();
                    ActivityClientService activityClientService = (ActivityClientService) provider.invoke();
                    SessionManager sessionManager2 = (SessionManager) provider4.invoke();
                    ErrorReporter errorReporter2 = (ErrorReporter) provider3.invoke();
                    SampleStrategy sampleStrategy2 = (SampleStrategy) provider2.invoke();
                    ziplineActivityItemFormatter.getClass();
                    paymentHistoryActivityItemPresenter$Factory$Impl.getClass();
                    activityClientService.getClass();
                    sessionManager2.getClass();
                    errorReporter2.getClass();
                    sampleStrategy2.getClass();
                    return new RealPendingRequestActivityManager(ziplineActivityItemFormatter, paymentHistoryActivityItemPresenter$Factory$Impl, activityClientService, sessionManager2, errorReporter2, sampleStrategy2);
                case 5:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl2 = (CashAccountDatabaseImpl) provider6.invoke();
                    RealSuggestedRecipientsVendor realSuggestedRecipientsVendor = (RealSuggestedRecipientsVendor) provider5.invoke();
                    AndroidClock androidClock2 = (AndroidClock) provider.invoke();
                    CashFavoritesService cashFavoritesService = (CashFavoritesService) provider4.invoke();
                    SyncValueReader syncValueReader = (SyncValueReader) provider3.invoke();
                    CoroutineContext coroutineContext2 = (CoroutineContext) provider2.invoke();
                    cashAccountDatabaseImpl2.getClass();
                    realSuggestedRecipientsVendor.getClass();
                    androidClock2.getClass();
                    cashFavoritesService.getClass();
                    syncValueReader.getClass();
                    coroutineContext2.getClass();
                    return new RealFavoritesRepository(cashAccountDatabaseImpl2, realSuggestedRecipientsVendor, androidClock2, cashFavoritesService, syncValueReader, coroutineContext2);
                case 6:
                    FeatureFlagManager featureFlagManager3 = (FeatureFlagManager) provider6.invoke();
                    RealObservabilityManager realObservabilityManager = (RealObservabilityManager) provider5.invoke();
                    SessionManager sessionManager3 = (SessionManager) provider.invoke();
                    AndroidSessionIdProvider androidSessionIdProvider = (AndroidSessionIdProvider) provider4.invoke();
                    BugsnagClient bugsnagClient = (BugsnagClient) provider3.invoke();
                    AndroidDeviceInfo androidDeviceInfo = (AndroidDeviceInfo) provider2.invoke();
                    featureFlagManager3.getClass();
                    realObservabilityManager.getClass();
                    sessionManager3.getClass();
                    androidSessionIdProvider.getClass();
                    bugsnagClient.getClass();
                    androidDeviceInfo.getClass();
                    return new ObservabilitySetupTeardown(featureFlagManager3, realObservabilityManager, sessionManager3, androidSessionIdProvider, bugsnagClient, androidDeviceInfo);
                case 7:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl3 = (CashAccountDatabaseImpl) provider6.invoke();
                    AppService appService = (AppService) provider5.invoke();
                    CoroutineContext coroutineContext3 = (CoroutineContext) provider.invoke();
                    FeatureFlagManager featureFlagManager4 = (FeatureFlagManager) provider4.invoke();
                    SyncValueReader syncValueReader2 = (SyncValueReader) provider3.invoke();
                    Signal signal = (Signal) provider2.invoke();
                    cashAccountDatabaseImpl3.getClass();
                    appService.getClass();
                    coroutineContext3.getClass();
                    featureFlagManager4.getClass();
                    syncValueReader2.getClass();
                    signal.getClass();
                    return new RealP2pSettingsManager(cashAccountDatabaseImpl3, appService, coroutineContext3, featureFlagManager4, syncValueReader2, signal);
                case 8:
                    SyncValueReader syncValueReader3 = (SyncValueReader) provider6.invoke();
                    RealProfileManager realProfileManager = (RealProfileManager) provider5.invoke();
                    FeatureFlagManager featureFlagManager5 = (FeatureFlagManager) provider.invoke();
                    AndroidStringManager androidStringManager2 = (AndroidStringManager) provider4.invoke();
                    AndroidDateFormatManager androidDateFormatManager = (AndroidDateFormatManager) provider3.invoke();
                    RealInstrumentManager realInstrumentManager = (RealInstrumentManager) provider2.invoke();
                    RealIcuStringFormatter realIcuStringFormatter = (RealIcuStringFormatter) RealIcuStringFormatter.MetroFactory.INSTANCE.invoke();
                    syncValueReader3.getClass();
                    realProfileManager.getClass();
                    featureFlagManager5.getClass();
                    androidStringManager2.getClass();
                    androidDateFormatManager.getClass();
                    realInstrumentManager.getClass();
                    return new RealScheduledReloadsManager(syncValueReader3, realProfileManager, featureFlagManager5, androidStringManager2, androidDateFormatManager, realInstrumentManager, realIcuStringFormatter);
                case 9:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl4 = (CashAccountDatabaseImpl) provider6.invoke();
                    String str = (String) provider5.invoke();
                    CoroutineContext coroutineContext4 = (CoroutineContext) provider4.invoke();
                    ErrorReporter errorReporter3 = (ErrorReporter) provider3.invoke();
                    SyncValueReader syncValueReader4 = (SyncValueReader) provider2.invoke();
                    cashAccountDatabaseImpl4.getClass();
                    str.getClass();
                    Provider provider7 = this.cardRegistry;
                    provider7.getClass();
                    coroutineContext4.getClass();
                    errorReporter3.getClass();
                    syncValueReader4.getClass();
                    return new RealCardCustomizationRepository(cashAccountDatabaseImpl4, str, provider7, coroutineContext4, errorReporter3, syncValueReader4);
                default:
                    WebViewProvider webViewProvider = (WebViewProvider) provider6.invoke();
                    AndroidDownloadManager$Factory$Impl androidDownloadManager$Factory$Impl = (AndroidDownloadManager$Factory$Impl) provider5.invoke();
                    String str2 = (String) provider.invoke();
                    String str3 = (String) provider4.invoke();
                    String str4 = (String) provider3.invoke();
                    RealImageLoader realImageLoader2 = (RealImageLoader) provider2.invoke();
                    webViewProvider.getClass();
                    androidDownloadManager$Factory$Impl.getClass();
                    str2.getClass();
                    str3.getClass();
                    str4.getClass();
                    realImageLoader2.getClass();
                    return new LocalViewFactory(webViewProvider, androidDownloadManager$Factory$Impl, str2, str3, str4, realImageLoader2);
            }
        }
    }

    public MoneyUiFactory(RealImageLoader realImageLoader, ElementBoundsRegistry elementBoundsRegistry, CardRegistry cardRegistry, RealScrollPerformanceTrackerFactory realScrollPerformanceTrackerFactory, RealTooltipTargetLoadedCallbackRegistry realTooltipTargetLoadedCallbackRegistry, FeatureFlagManager featureFlagManager) {
        this.imageLoader = realImageLoader;
        this.elementBoundsRegistry = elementBoundsRegistry;
        this.cardRegistry = cardRegistry;
        this.scrollPerformanceTrackerFactory = realScrollPerformanceTrackerFactory;
        this.tooltipTargetLoadedCallbackRegistry = realTooltipTargetLoadedCallbackRegistry;
        this.featureFlagManager = featureFlagManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v17, types: [com.squareup.cash.profile.views.ReferralStatusView] */
    /* JADX WARN: Type inference failed for: r10v42, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r10v60, types: [com.squareup.cash.profile.views.ProfileCashtagRequiredDialog] */
    /* JADX WARN: Type inference failed for: r10v62, types: [com.squareup.cash.profile.views.GenericConfirmDialogView] */
    /* JADX WARN: Type inference failed for: r11v18, types: [com.squareup.cash.profile.views.AddAliasSheet] */
    /* JADX WARN: Type inference failed for: r13v10, types: [com.squareup.cash.profile.views.ProfileCropView] */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13, types: [com.squareup.cash.profile.views.MooncakeAddressSheet] */
    /* JADX WARN: Type inference failed for: r13v9, types: [com.squareup.cash.profile.views.AppMessagesOptionsView] */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.squareup.cash.profile.views.PaymentNotificationOptionsView] */
    @Override // app.cash.broadway.ui.UiFactory
    public final UiFactory.ScreenUi createUi(Screen screen, Context context, ViewGroup viewGroup) {
        ComposeUiView paymentNotificationOptionsView;
        ?? appMessagesOptionsView;
        switch (this.$r8$classId) {
            case 0:
                context.getClass();
                if (screen instanceof MoneyTabScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new MoneyUiFactory$$ExternalSyntheticLambda0(this, 0), true, -1287442337));
                }
                if (screen instanceof HypeWelcomeScreen) {
                    return new UiFactory.ComposeUi(HypeWelcomeUIKt.lambda$1803135045);
                }
                return null;
            default:
                RealCashVibrator realCashVibrator = (RealCashVibrator) this.featureFlagManager;
                context.getClass();
                if (screen instanceof ProfileScreens.SecurityLockScreen) {
                    paymentNotificationOptionsView = new SecurityLockView(context);
                } else if (screen instanceof ProfileScreens.IncomingRequestsScreen) {
                    paymentNotificationOptionsView = new IncomingRequestsView(context);
                } else {
                    boolean z = screen instanceof ProfileScreens.ProfileScreen;
                    RealImageLoader realImageLoader = this.imageLoader;
                    if (z) {
                        paymentNotificationOptionsView = new ProfileUiView(realImageLoader, realCashVibrator, context);
                    } else if (screen instanceof PaymentHistoryScreens$ProfileCompletePaymentHistory) {
                        paymentNotificationOptionsView = new ProfileUiView(context, realImageLoader, realCashVibrator, 1);
                    } else if (screen instanceof ProfileScreens.ErrorScreen) {
                        paymentNotificationOptionsView = new ErrorView(context);
                    } else if (screen instanceof ActivePasswordDialog) {
                        paymentNotificationOptionsView = new TaxesPasswordDialog(context);
                    } else if (screen instanceof GenericConfirmDialog) {
                        paymentNotificationOptionsView = new GenericConfirmDialogView(context);
                    } else if (screen instanceof InvestingContactScreen) {
                        paymentNotificationOptionsView = new InvestingContactView(context);
                    } else if (screen instanceof CashtagRequiredScreen) {
                        paymentNotificationOptionsView = new ProfileCashtagRequiredDialog(context);
                    } else if (screen instanceof ProfileScreens.AccountInfoScreen) {
                        paymentNotificationOptionsView = new P2PListView(context, realImageLoader, 27);
                    } else if (screen instanceof PersonalInfoConfirmationDialogScreen) {
                        paymentNotificationOptionsView = new PersonalInfoConfirmationDialog(context);
                    } else if (screen instanceof ArcadeAutofillSettingsScreen) {
                        paymentNotificationOptionsView = new AutoFillSettingsDetailView(context);
                    } else if (screen instanceof ProfileScreens.SecurityScreen) {
                        paymentNotificationOptionsView = new ProfileSecurityView(context);
                    } else if (screen instanceof ProfileScreens.PrivacyScreen) {
                        paymentNotificationOptionsView = new ProfilePrivacyView(context);
                    } else {
                        if (screen instanceof ProfileScreens.ProfileAddressSheet) {
                            MooncakeAddressSheet$Factory$Impl mooncakeAddressSheet$Factory$Impl = (MooncakeAddressSheet$Factory$Impl) this.elementBoundsRegistry;
                            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.Theme_Cash_Profile);
                            ProfileCropView.MetroFactory metroFactory = mooncakeAddressSheet$Factory$Impl.delegateFactory;
                            RealAddressManager realAddressManager = (RealAddressManager) metroFactory.imageLoader.invoke();
                            RealBitcoinCapabilityProvider realBitcoinCapabilityProvider = (RealBitcoinCapabilityProvider) metroFactory.cropResultManager.invoke();
                            realAddressManager.getClass();
                            realBitcoinCapabilityProvider.getClass();
                            appMessagesOptionsView = new MooncakeAddressSheet(realAddressManager, realBitcoinCapabilityProvider, contextThemeWrapper);
                        } else if (screen instanceof ProfileScreens.ConfirmRemoveAliasScreen) {
                            paymentNotificationOptionsView = new ProfileConfirmRemoveAliasDialog(context);
                        } else if (screen instanceof ProfileScreens.ConfirmReplaceInfoSheet) {
                            paymentNotificationOptionsView = new ConfirmReplaceInfoView(context);
                        } else if (screen instanceof ProfileScreens.HeaderMenuScreen) {
                            paymentNotificationOptionsView = new ProfileHeaderMenuSheet(new ContextThemeWrapper(context, R.style.Theme_Cash_Dialog_Bitcoin));
                        } else if (screen instanceof ProfileScreens.AddAliasScreen) {
                            paymentNotificationOptionsView = new AddAliasSheet(new ContextThemeWrapper(context, R.style.Theme_Cash_Profile));
                        } else if (screen instanceof ProfileScreens.RingtoneScreen) {
                            paymentNotificationOptionsView = XmlFactory.inflate(context, R.layout.ringtone_view, viewGroup, Integer.valueOf(R.style.Theme_Cash_Profile));
                        } else if (screen instanceof ProfileScreens.CropScreen) {
                            ProfileCropView$Factory$Impl profileCropView$Factory$Impl = (ProfileCropView$Factory$Impl) this.cardRegistry;
                            ContextThemeWrapper contextThemeWrapper2 = new ContextThemeWrapper(context, R.style.Theme_Cash_Profile);
                            ProfileCropView.MetroFactory metroFactory2 = profileCropView$Factory$Impl.delegateFactory;
                            RealImageLoader realImageLoader2 = (RealImageLoader) metroFactory2.imageLoader.invoke();
                            RealCropResultManager realCropResultManager = (RealCropResultManager) metroFactory2.cropResultManager.invoke();
                            realImageLoader2.getClass();
                            realCropResultManager.getClass();
                            appMessagesOptionsView = new ProfileCropView(realImageLoader2, realCropResultManager, contextThemeWrapper2);
                        } else if (screen instanceof ProfileScreens.ConfirmSignOutScreen) {
                            paymentNotificationOptionsView = new ConfirmSignOutDialog(context);
                        } else if (screen instanceof ProfileScreens.NotificationsScreen) {
                            paymentNotificationOptionsView = new P2PListView(context, realImageLoader, 26);
                        } else if (screen instanceof ProfileScreens.ContactMethodDetailsScreen) {
                            paymentNotificationOptionsView = new ContactMethodDetailsView(context);
                        } else if (screen instanceof ProfileScreens.CategoryListScreen) {
                            paymentNotificationOptionsView = new P2PListView(context, realImageLoader, 24);
                        } else if (screen instanceof ProfileScreens.ChannelListScreen) {
                            paymentNotificationOptionsView = new P2PListView(context, realImageLoader, 25);
                        } else if (screen instanceof ProfileScreens.AppMessagesOptions) {
                            AppMessagesOptionsView$Factory$Impl appMessagesOptionsView$Factory$Impl = (AppMessagesOptionsView$Factory$Impl) this.scrollPerformanceTrackerFactory;
                            ContextThemeWrapper contextThemeWrapper3 = new ContextThemeWrapper(context, R.style.Theme_Cash_Profile);
                            ProfileCropView.MetroFactory metroFactory3 = appMessagesOptionsView$Factory$Impl.delegateFactory;
                            UriPreference uriPreference = (UriPreference) metroFactory3.imageLoader.invoke();
                            CoroutineContext coroutineContext = (CoroutineContext) metroFactory3.cropResultManager.invoke();
                            uriPreference.getClass();
                            coroutineContext.getClass();
                            appMessagesOptionsView = new AppMessagesOptionsView(contextThemeWrapper3, uriPreference, coroutineContext);
                        } else if (screen instanceof ProfileScreens.PaymentNotificationOptions) {
                            PaymentNotificationOptionsView$Factory$Impl paymentNotificationOptionsView$Factory$Impl = (PaymentNotificationOptionsView$Factory$Impl) this.tooltipTargetLoadedCallbackRegistry;
                            ContextThemeWrapper contextThemeWrapper4 = new ContextThemeWrapper(context, R.style.Theme_Cash_Profile);
                            LocalActivitySetupTeardown.MetroFactory metroFactory4 = paymentNotificationOptionsView$Factory$Impl.delegateFactory;
                            UriPreference uriPreference2 = (UriPreference) metroFactory4.appForegroundStateProvider.invoke();
                            UriPreference uriPreference3 = (UriPreference) metroFactory4.sessionManager.invoke();
                            UriPreference uriPreference4 = (UriPreference) metroFactory4.syncValueReader.invoke();
                            BooleanPreference booleanPreference = (BooleanPreference) metroFactory4.shortlinkHandler.invoke();
                            BooleanPreference booleanPreference2 = (BooleanPreference) metroFactory4.ioDispatcher.invoke();
                            uriPreference2.getClass();
                            uriPreference3.getClass();
                            uriPreference4.getClass();
                            booleanPreference.getClass();
                            booleanPreference2.getClass();
                            paymentNotificationOptionsView = new PaymentNotificationOptionsView(contextThemeWrapper4, uriPreference2, uriPreference3, uriPreference4, booleanPreference, booleanPreference2);
                        } else if (screen instanceof ProfileScreens.ReferralStatusScreen) {
                            paymentNotificationOptionsView = new ReferralStatusView(new ContextThemeWrapper(context, R.style.Theme_Cash_Profile));
                        } else if (screen instanceof ProfileScreens.AdjustableThresholdScreen) {
                            paymentNotificationOptionsView = new AdjustableThresholdView(new ContextThemeWrapper(context, R.style.Theme_Cash_Profile));
                        } else if (screen instanceof ProfileScreens.UnsupportedSettingScreen) {
                            paymentNotificationOptionsView = new UnsupportedSettingView(context);
                        } else if (screen instanceof ProfileScreens.FamilyEligibilityLoadingScreen) {
                            paymentNotificationOptionsView = new FamilyEligibilityLoadingView(context);
                        } else if (screen instanceof ProfileScreens.AccountSwitchInfoDialogScreen) {
                            paymentNotificationOptionsView = new AccountSwitchInfoDialogView(context);
                        } else if (screen instanceof SearchVisibilityScreen) {
                            paymentNotificationOptionsView = new SearchVisibilityView(context);
                        } else {
                            if (!(screen instanceof ProfileScreens.TaxesPasswordScreen)) {
                                return null;
                            }
                            paymentNotificationOptionsView = new TaxesPasswordView(context);
                        }
                        paymentNotificationOptionsView = appMessagesOptionsView;
                    }
                }
                return new UiFactory.ViewUi(paymentNotificationOptionsView, paymentNotificationOptionsView instanceof Ui ? paymentNotificationOptionsView : null);
        }
    }

    public MoneyUiFactory(AddAliasSheet$Factory$Impl addAliasSheet$Factory$Impl, MooncakeAddressSheet$Factory$Impl mooncakeAddressSheet$Factory$Impl, ProfileCropView$Factory$Impl profileCropView$Factory$Impl, AppMessagesOptionsView$Factory$Impl appMessagesOptionsView$Factory$Impl, PaymentNotificationOptionsView$Factory$Impl paymentNotificationOptionsView$Factory$Impl, RealImageLoader realImageLoader, RealCashVibrator realCashVibrator) {
        this.elementBoundsRegistry = mooncakeAddressSheet$Factory$Impl;
        this.cardRegistry = profileCropView$Factory$Impl;
        this.scrollPerformanceTrackerFactory = appMessagesOptionsView$Factory$Impl;
        this.tooltipTargetLoadedCallbackRegistry = paymentNotificationOptionsView$Factory$Impl;
        this.imageLoader = realImageLoader;
        this.featureFlagManager = realCashVibrator;
    }
}
