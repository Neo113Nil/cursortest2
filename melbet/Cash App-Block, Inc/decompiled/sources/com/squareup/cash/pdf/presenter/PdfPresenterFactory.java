package com.squareup.cash.pdf.presenter;

import android.app.Activity;
import androidx.media3.common.util.StuckPlayerDetector;
import app.cash.broadway.presenter.Presenter;
import app.cash.broadway.presenter.PresenterFactory;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt;
import app.cash.broadway.screen.Screen;
import app.cash.cdp.integration.CashCdpConfigProvider;
import app.cash.history.screens.HistoryScreens;
import app.cash.inputfieldtext.saver.RealInputFieldTextSaver;
import app.cash.local.presenters.LocalCashBalancePresenter;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.home.LocalHomeGeoPresenter;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.passcode.backend.RealAppLockState;
import app.cash.passcode.presenters.EndAppLockPresenter;
import app.cash.passcode.presenters.EndAppLockPresenter$Factory$Impl;
import app.cash.passcode.screens.EndAppLock;
import coil3.ComponentRegistry;
import com.bugsnag.android.DeviceBuildInfo;
import com.fillr.featuretoggle.UnleashContext;
import com.google.android.gms.internal.measurement.zzlj;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.Result;
import com.squareup.cash.RealBugReportSenderFactory;
import com.squareup.cash.account.navigation.RealAccountOutboundNavigator$Factory$Impl;
import com.squareup.cash.activity.backend.loader.RealActivitiesCacheManager;
import com.squareup.cash.activity.backend.loader.RealActivityTokenFactory;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter$Factory$Impl;
import com.squareup.cash.activity.presenters.RealActivityScreenInitialArgumentsSupplier;
import com.squareup.cash.advertising.backend.real.RealFullscreenAdStore;
import com.squareup.cash.advertising.presenters.FullscreenAdPresenter;
import com.squareup.cash.advertising.presenters.FullscreenAdPresenter$Factory$Impl;
import com.squareup.cash.advertising.screens.FullscreenAdScreen;
import com.squareup.cash.agents.applets.presenters.AgentsHomePresenter$Factory$Impl;
import com.squareup.cash.agents.applets.presenters.RealAgentsRepository;
import com.squareup.cash.agents.applets.screens.AgentsHomeScreen;
import com.squareup.cash.aiedge.MLKitTitleGenerator$MetroFactory;
import com.squareup.cash.appmessages.RealAppMessageManager;
import com.squareup.cash.appmessages.presenters.RealAppMessageActionPerformer$Factory$Impl;
import com.squareup.cash.appupdate.presenters.AppUpdateDialogPresenter$Factory$Impl;
import com.squareup.cash.appupdate.screen.AppUpdateDialogScreen;
import com.squareup.cash.autofillweb.real.RealAutofillWebManagerProvider;
import com.squareup.cash.blockers.flow.RealMultiBlockerFacilitator;
import com.squareup.cash.blockers.presenters.SetAddressPresenter$MetroFactory;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.treehouse.presenters.TreehouseBlockerPresenter$Factory$Impl;
import com.squareup.cash.blockers.web.delegates.WebViewBlockerCookieManager;
import com.squareup.cash.blockers.web.presenters.WebViewBlockerPresenter;
import com.squareup.cash.blockers.web.presenters.WebViewBlockerPresenter$Factory$Impl;
import com.squareup.cash.boost.db.Reward$Adapter;
import com.squareup.cash.bugreporting.presenters.BugReportingPresenter$Factory$Impl;
import com.squareup.cash.bugreporting.screens.BugReportingScreen;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.cashapplite.cashin.RealLiteCashInRepo$MetroFactory;
import com.squareup.cash.cashapplite.presenters.LiteActivityPresenter;
import com.squareup.cash.checks.VerifyCheckDialogPresenter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.profile.RealProfileAliasRepository;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.data.profile.RealReferralManager;
import com.squareup.cash.datetimeformatter.real.RealTodayDateTimeFormatter;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.deviceintegrity.RealDeviceIntegrityAttester;
import com.squareup.cash.discover.promotiondetails.backend.real.RealPromotionDetailsAnalyticsService$Factory$Impl;
import com.squareup.cash.discover.promotiondetails.presenters.PromotionDetailsPresenter$Factory$Impl;
import com.squareup.cash.discover.promotiondetails.screens.PromotionDetails;
import com.squareup.cash.family.safetyhub.presenters.SafetyHubPresenter$Factory$Impl;
import com.squareup.cash.family.safetyhub.screens.SafetyHubScreens;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.fileupload.real.RealFileValidator$Factory$Impl;
import com.squareup.cash.formview.presenters.FormPresenter;
import com.squareup.cash.globalsearch.analytics.real.RealGlobalSearchAnalyticsHelper;
import com.squareup.cash.globalsearch.presenters.GlobalSearchFeedPresenter$Factory$Impl;
import com.squareup.cash.globalsearch.presenters.GlobalSearchPresenter$Factory$Impl;
import com.squareup.cash.globalsearch.presenters.GlobalSearchQueryPresenter$Factory$Impl;
import com.squareup.cash.globalsearch.screens.GlobalSearchScreen;
import com.squareup.cash.history.analytics.LoadTimeClock;
import com.squareup.cash.history.backend.api.PendingInvestingActivityPageHandler;
import com.squareup.cash.history.presenters.InvestingPendingTransactionsPresenter$Factory$Impl;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.invitations.InviteErrorPresenter;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.limits.backend.real.RealLimitsStore;
import com.squareup.cash.limits.presenters.LimitsInlineMessagePresenter$AssistedInjectionFactory$Impl;
import com.squareup.cash.limits.presenters.LimitsPresenter$Factory$Impl;
import com.squareup.cash.limits.presenters.LimitsSectionPresenter$Factory$Impl;
import com.squareup.cash.limits.screens.LimitsScreen;
import com.squareup.cash.limits.screens.LimitsSectionScreen;
import com.squareup.cash.localization.RealLocaleManager;
import com.squareup.cash.localization.presenters.LanguageDisclosurePresenter$Factory$Impl;
import com.squareup.cash.localization.presenters.LanguageDisclosurePresenter$MetroFactory;
import com.squareup.cash.localization.screens.LanguageDisclosureScreen;
import com.squareup.cash.marketcapabilities.screens.MarketCapabilitiesErrorScreen;
import com.squareup.cash.money.booklet.MoneyTabBookletPresenter$Factory$Impl;
import com.squareup.cash.money.booklet.MoneyTabBookletScreen;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.mri.android.RealMRIFactory;
import com.squareup.cash.music.backend.real.RealMusicPlayer;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.music.presenters.MusicPresenter$Factory$Impl;
import com.squareup.cash.music.screens.MusicScreen;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.onboarding.backend.OnboardableCountries;
import com.squareup.cash.onboarding.presenters.CountrySelectorPresenter$Factory$Impl;
import com.squareup.cash.onboarding.presenters.OnboardingLandingPresenter$Factory$Impl;
import com.squareup.cash.onboarding.presenters.OnboardingLandingPresenter$MetroFactory;
import com.squareup.cash.onboarding.screens.CountrySelectorScreen;
import com.squareup.cash.onboarding.screens.OnboardingLandingScreen;
import com.squareup.cash.passkeys.backend.RealPasskeyAnalytics;
import com.squareup.cash.passkeys.backend.RealPasskeyRepository;
import com.squareup.cash.passkeys.presenters.PasskeyManagementPresenter$Factory$Impl;
import com.squareup.cash.passkeys.screens.PasskeyManagementScreen;
import com.squareup.cash.payments.backend.real.RealP2pSettingsManager;
import com.squareup.cash.pdf.screen.PdfScreen;
import com.squareup.cash.persona.backend.PersonaDidvInquiryLauncher;
import com.squareup.cash.persona.presenters.PersonaDidvPresenter$Factory$Impl;
import com.squareup.cash.profile.devicemanager.navigation.RealDeviceManagerInboundNavigator$Factory$Impl;
import com.squareup.cash.profile.presenters.AddAliasPresenter;
import com.squareup.cash.profile.screens.ProfileUnavailableScreen;
import com.squareup.cash.promotionsreferrals.presenters.PromotionsReferralsHomePresenter$Factory$Impl;
import com.squareup.cash.promotionsreferrals.screens.PromotionsReferralsScreen$PromotionsReferralsHomeScreen;
import com.squareup.cash.recurring.ConfirmFirstScheduledReloadNoticePresenter$Factory$Impl;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.retro.views.RetroUiFactory;
import com.squareup.cash.savings.presenters.TransferInPresenter$MetroFactory;
import com.squareup.cash.score.backend.RealScoreRepository;
import com.squareup.cash.score.presenters.ScoreHomePresenter$Factory$Impl;
import com.squareup.cash.score.screens.ScoreHomeScreen;
import com.squareup.cash.score.views.ScoreUiFactory;
import com.squareup.cash.session.backend.RealUrlAuthenticator;
import com.squareup.cash.sharesheet.ShareSheetPresenter;
import com.squareup.cash.sharesheet.ShareSheetPresenter$Factory$Impl;
import com.squareup.cash.sharesheet.ShareSheetScreen;
import com.squareup.cash.stablecoin.presenters.StablecoinHomePresenter;
import com.squareup.cash.stablecoin.presenters.StablecoinHomePresenter$Factory$Impl;
import com.squareup.cash.stablecoin.presenters.nullstate.RealStablecoinNullStateCarouselPresenter;
import com.squareup.cash.stablecoin.presenters.widgets.factory.RealStablecoinHomeWidgetPresenterFactory$Factory$Impl;
import com.squareup.cash.stablecoin.screens.StablecoinScreens$StablecoinHome;
import com.squareup.cash.storage.AndroidFileProvider;
import com.squareup.cash.storage.AndroidFileSaver;
import com.squareup.cash.storage.RealFileDownloader;
import com.squareup.cash.storage.SandboxJanitor;
import com.squareup.cash.support.presenters.SupportActivityItemPresenter$Factory$Impl;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.cash.threedsdataonly.backend.real.RealThreeDsAuthenticationManager;
import com.squareup.cash.threedsdataonly.backend.real.RealThreeDsService;
import com.squareup.cash.threedsdataonly.backend.real.RealThreeDsSpanTrackingService;
import com.squareup.cash.threedsdataonly.presenters.ThreeDsPresenter;
import com.squareup.cash.threedsdataonly.presenters.ThreeDsPresenter$Factory$Impl;
import com.squareup.cash.transactionpicker.blocker.presenters.UnifiedActivityPickerBlockerPresenter;
import com.squareup.cash.transactionpicker.blocker.presenters.UnifiedActivityPickerBlockerPresenter$Factory$Impl;
import com.squareup.cash.ui.MainActivity$navigatorSwitcher$1;
import com.squareup.cash.wallet.data.IssuedCardManager;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.cash.wallet.presenters.RealCardCustomizationRepository;
import com.squareup.cash.work.presenters.WorkHomePresenter;
import com.squareup.cropview.Edge;
import com.squareup.moshi.Moshi;
import com.squareup.protos.cash.aegis.service.AegisService;
import com.squareup.protos.cash.cash3dsauthentication.api.v1.ThreeDsAuthenticationService;
import com.squareup.protos.cash.cashcustomerprofile.api.v1.CustomerProfileClientService;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageClientService;
import com.squareup.protos.cash.referly.api.incentives.client.IncentivesClientService;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.util.android.AndroidActivityFinisher;
import com.squareup.util.android.AndroidAudioManager;
import com.squareup.util.android.RealIntentFactory;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DelegateFactory;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import okio.internal.DefaultSocket;
import retrofit2.OkHttpCall;

/* loaded from: classes.dex */
public final class PdfPresenterFactory implements PresenterFactory {
    public final /* synthetic */ int $r8$classId;
    public final Object pdfPreviewPresenterFactory;

    public /* synthetic */ PdfPresenterFactory(Object obj, int i) {
        this.$r8$classId = i;
        this.pdfPreviewPresenterFactory = obj;
    }

    @Override // app.cash.broadway.presenter.PresenterFactory
    public final Presenter create(Screen screen, BetterNavigator.ScreenNavigator screenNavigator) {
        InviteErrorPresenter inviteErrorPresenter;
        WorkHomePresenter workHomePresenter;
        int i = this.$r8$classId;
        Object obj = this.pdfPreviewPresenterFactory;
        switch (i) {
            case 0:
                screen.getClass();
                if (!(screen instanceof PdfScreen)) {
                    return null;
                }
                DefaultSocket defaultSocket = ((PdfPreviewPresenter$Factory$Impl) obj).delegateFactory;
                IntentLauncher intentLauncher = (IntentLauncher) ((Provider) defaultSocket.socket).invoke();
                AndroidFileProvider androidFileProvider = (AndroidFileProvider) ((LambdaProvider) defaultSocket.closeBits).lambda.invoke();
                AndroidFileSaver androidFileSaver = (AndroidFileSaver) ((AndroidFileSaver.MetroFactory) defaultSocket.source).invoke();
                Edge.Companion companion = new Edge.Companion(8);
                AndroidStringManager androidStringManager = (AndroidStringManager) ((LambdaProvider) defaultSocket.sink).lambda.invoke();
                intentLauncher.getClass();
                androidFileProvider.getClass();
                androidStringManager.getClass();
                return MoleculePresenterKt.asPresenter$default(new PdfPreviewPresenter((PdfScreen) screen, screenNavigator, intentLauncher, androidFileProvider, androidFileSaver, companion, androidStringManager));
            case 1:
                screen.getClass();
                if (!(screen instanceof EndAppLock)) {
                    return null;
                }
                EndAppLockPresenter.MetroFactory metroFactory = ((EndAppLockPresenter$Factory$Impl) obj).delegateFactory;
                MainActivity$navigatorSwitcher$1 mainActivity$navigatorSwitcher$1 = (MainActivity$navigatorSwitcher$1) metroFactory.navigatorSwitcher.value;
                RealAppLockState realAppLockState = (RealAppLockState) metroFactory.appLockState.getValue();
                RealAccountOutboundNavigator$Factory$Impl realAccountOutboundNavigator$Factory$Impl = (RealAccountOutboundNavigator$Factory$Impl) metroFactory.accountOutboundNavigatorFactory.invoke();
                mainActivity$navigatorSwitcher$1.getClass();
                realAppLockState.getClass();
                realAccountOutboundNavigator$Factory$Impl.getClass();
                return MoleculePresenterKt.asPresenter$default(new EndAppLockPresenter(mainActivity$navigatorSwitcher$1, realAppLockState, realAccountOutboundNavigator$Factory$Impl, screenNavigator));
            case 2:
                screen.getClass();
                if (!(screen instanceof FullscreenAdScreen)) {
                    return null;
                }
                Reward$Adapter reward$Adapter = ((FullscreenAdPresenter$Factory$Impl) obj).delegateFactory;
                RealFullscreenAdStore realFullscreenAdStore = (RealFullscreenAdStore) ((Provider) reward$Adapter.avatarsAdapter).invoke();
                Analytics analytics = (Analytics) ((DoubleCheck) reward$Adapter.reward_selection_stateAdapter).getValue();
                AndroidAudioManager androidAudioManager = (AndroidAudioManager) ((LambdaProvider) reward$Adapter.boost_detail_bottom_upsellAdapter).lambda.invoke();
                AppMessageClientService appMessageClientService = (AppMessageClientService) ((DoubleCheck) reward$Adapter.app_linksAdapter).getValue();
                RealAppMessageActionPerformer$Factory$Impl realAppMessageActionPerformer$Factory$Impl = (RealAppMessageActionPerformer$Factory$Impl) ((Provider) reward$Adapter.program_detail_rowsAdapter).invoke();
                CoroutineContext coroutineContext = (CoroutineContext) ((LambdaProvider) reward$Adapter.boost_detail_rowsAdapter).lambda.invoke();
                CoroutineScope coroutineScope = (CoroutineScope) ((InstanceFactory) reward$Adapter.boost_attributesAdapter).value;
                realFullscreenAdStore.getClass();
                analytics.getClass();
                androidAudioManager.getClass();
                appMessageClientService.getClass();
                realAppMessageActionPerformer$Factory$Impl.getClass();
                coroutineContext.getClass();
                coroutineScope.getClass();
                return MoleculePresenterKt.asPresenter$default(new FullscreenAdPresenter(realFullscreenAdStore, analytics, androidAudioManager, appMessageClientService, realAppMessageActionPerformer$Factory$Impl, coroutineContext, (FullscreenAdScreen) screen, screenNavigator, coroutineScope));
            case 3:
                screen.getClass();
                if (!(screen instanceof AgentsHomeScreen)) {
                    return null;
                }
                TransferInPresenter$MetroFactory transferInPresenter$MetroFactory = ((AgentsHomePresenter$Factory$Impl) obj).delegateFactory;
                RealAgentsRepository realAgentsRepository = (RealAgentsRepository) transferInPresenter$MetroFactory.moneyFormatterFactory.invoke();
                AndroidStringManager androidStringManager2 = (AndroidStringManager) transferInPresenter$MetroFactory.stringManager.lambda.invoke();
                FlowStarter flowStarter = (FlowStarter) transferInPresenter$MetroFactory.analytics.getValue();
                realAgentsRepository.getClass();
                androidStringManager2.getClass();
                flowStarter.getClass();
                return MoleculePresenterKt.asPresenter$default(new LocalPosCheckInPresenter((AgentsHomeScreen) screen, realAgentsRepository, androidStringManager2, flowStarter, screenNavigator));
            case 4:
                screen.getClass();
                if (!(screen instanceof AppUpdateDialogScreen)) {
                    return null;
                }
                LiteActivityPresenter.MetroFactory metroFactory2 = ((AppUpdateDialogPresenter$Factory$Impl) obj).delegateFactory;
                String str = (String) metroFactory2.sessionManager.lambda.invoke();
                AndroidStringManager androidStringManager3 = (AndroidStringManager) metroFactory2.stringManager.lambda.invoke();
                IntentLauncher intentLauncher2 = (IntentLauncher) metroFactory2.activityEmbeddedPresenterFactory.invoke();
                str.getClass();
                androidStringManager3.getClass();
                intentLauncher2.getClass();
                return MoleculePresenterKt.asPresenter$default(new MusicPresenter(str, androidStringManager3, intentLauncher2, screenNavigator));
            case 5:
                screen.getClass();
                if (!(screen instanceof BlockersScreens.TreehouseBlockerScreen)) {
                    return null;
                }
                BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) ((TreehouseBlockerPresenter$Factory$Impl) obj).delegateFactory.staticImageLoader.invoke();
                blockersDataNavigator.getClass();
                return MoleculePresenterKt.asPresenter$default(new EndAppLockPresenter(blockersDataNavigator, (BlockersScreens.TreehouseBlockerScreen) screen, screenNavigator));
            case 6:
                screen.getClass();
                if (!(screen instanceof BlockersScreens.WebViewBlockerScreen)) {
                    return null;
                }
                Reward$Adapter reward$Adapter2 = ((WebViewBlockerPresenter$Factory$Impl) obj).delegateFactory;
                Result result = (Result) ((AndroidFileSaver.MetroFactory) reward$Adapter2.avatarsAdapter).invoke();
                BlockersDataNavigator blockersDataNavigator2 = (BlockersDataNavigator) ((Provider) reward$Adapter2.reward_selection_stateAdapter).invoke();
                Analytics analytics2 = (Analytics) ((DoubleCheck) reward$Adapter2.boost_detail_bottom_upsellAdapter).getValue();
                WebViewBlockerCookieManager webViewBlockerCookieManager = (WebViewBlockerCookieManager) ((Provider) reward$Adapter2.app_linksAdapter).invoke();
                IntentLauncher intentLauncher3 = (IntentLauncher) ((Provider) reward$Adapter2.program_detail_rowsAdapter).invoke();
                RealUrlAuthenticator realUrlAuthenticator = (RealUrlAuthenticator) ((DoubleCheck) reward$Adapter2.boost_detail_rowsAdapter).getValue();
                RealAutofillWebManagerProvider realAutofillWebManagerProvider = (RealAutofillWebManagerProvider) ((Provider) reward$Adapter2.boost_attributesAdapter).invoke();
                blockersDataNavigator2.getClass();
                analytics2.getClass();
                webViewBlockerCookieManager.getClass();
                intentLauncher3.getClass();
                realUrlAuthenticator.getClass();
                realAutofillWebManagerProvider.getClass();
                return MoleculePresenterKt.asPresenter$default(new WebViewBlockerPresenter(result, blockersDataNavigator2, analytics2, webViewBlockerCookieManager, intentLauncher3, realUrlAuthenticator, realAutofillWebManagerProvider, (BlockersScreens.WebViewBlockerScreen) screen, screenNavigator));
            case 7:
                screen.getClass();
                if (!(screen instanceof BugReportingScreen)) {
                    return null;
                }
                Reward$Adapter reward$Adapter3 = ((BugReportingPresenter$Factory$Impl) obj).delegateFactory;
                RealProfileAliasRepository realProfileAliasRepository = (RealProfileAliasRepository) ((Provider) reward$Adapter3.avatarsAdapter).invoke();
                RealFileValidator$Factory$Impl realFileValidator$Factory$Impl = (RealFileValidator$Factory$Impl) ((Provider) reward$Adapter3.reward_selection_stateAdapter).invoke();
                RealBugReportSenderFactory realBugReportSenderFactory = (RealBugReportSenderFactory) ((RealBugReportSenderFactory.MetroFactory) reward$Adapter3.boost_detail_bottom_upsellAdapter).invoke();
                AndroidStringManager androidStringManager4 = (AndroidStringManager) ((LambdaProvider) reward$Adapter3.app_linksAdapter).lambda.invoke();
                BinaryBitmap binaryBitmap = (BinaryBitmap) ((MLKitTitleGenerator$MetroFactory) reward$Adapter3.program_detail_rowsAdapter).invoke();
                RealIntentFactory realIntentFactory = (RealIntentFactory) ((DoubleCheck) reward$Adapter3.boost_detail_rowsAdapter).getValue();
                Activity activity = (Activity) ((InstanceFactory) reward$Adapter3.boost_attributesAdapter).value;
                realProfileAliasRepository.getClass();
                realFileValidator$Factory$Impl.getClass();
                androidStringManager4.getClass();
                realIntentFactory.getClass();
                activity.getClass();
                return MoleculePresenterKt.asPresenter$default(new LocalHomePresenter((BugReportingScreen) screen, screenNavigator, realProfileAliasRepository, realFileValidator$Factory$Impl, realBugReportSenderFactory, androidStringManager4, binaryBitmap, realIntentFactory, activity));
            case 8:
                screen.getClass();
                if (!(screen instanceof PromotionDetails)) {
                    return null;
                }
                ComponentRegistry.Builder builder = ((PromotionDetailsPresenter$Factory$Impl) obj).delegateFactory;
                Flow flow = (Flow) ((DoubleCheck) builder.interceptors).getValue();
                IntentLauncher intentLauncher4 = (IntentLauncher) ((Provider) builder.mappers).invoke();
                UnleashContext unleashContext = (UnleashContext) ((RealFileDownloader.MetroFactory) builder.keyers).invoke();
                RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) ((Provider) builder.lazyFetcherFactories).invoke();
                RealPromotionDetailsAnalyticsService$Factory$Impl realPromotionDetailsAnalyticsService$Factory$Impl = (RealPromotionDetailsAnalyticsService$Factory$Impl) ((InstanceFactory) builder.lazyDecoderFactories).value;
                flow.getClass();
                intentLauncher4.getClass();
                realRouter$Factory$Impl.getClass();
                realPromotionDetailsAnalyticsService$Factory$Impl.getClass();
                return MoleculePresenterKt.asPresenter$default(new DisclosurePresenter((PromotionDetails) screen, screenNavigator, flow, intentLauncher4, unleashContext, realRouter$Factory$Impl, realPromotionDetailsAnalyticsService$Factory$Impl));
            case 9:
                screen.getClass();
                if (screen.equals(SafetyHubScreens.SafetyHubScreen.INSTANCE)) {
                    AegisService aegisService = (AegisService) ((SafetyHubPresenter$Factory$Impl) obj).delegateFactory.analytics.getValue();
                    aegisService.getClass();
                    return MoleculePresenterKt.asPresenter$default(new VerifyCheckDialogPresenter(13, aegisService, screenNavigator));
                }
                if (screen instanceof SafetyHubScreens.SafetyEducationPageScreen) {
                    return MoleculePresenterKt.asPresenter$default(new VerifyCheckDialogPresenter((SafetyHubScreens.SafetyEducationPageScreen) screen, screenNavigator));
                }
                return null;
            case 10:
                screen.getClass();
                if (!(screen instanceof GlobalSearchScreen)) {
                    return null;
                }
                zzlj zzljVar = ((GlobalSearchPresenter$Factory$Impl) obj).delegateFactory;
                GlobalSearchFeedPresenter$Factory$Impl globalSearchFeedPresenter$Factory$Impl = (GlobalSearchFeedPresenter$Factory$Impl) ((InstanceFactory) zzljVar.zza).value;
                GlobalSearchQueryPresenter$Factory$Impl globalSearchQueryPresenter$Factory$Impl = (GlobalSearchQueryPresenter$Factory$Impl) ((InstanceFactory) zzljVar.zzb).value;
                RealGlobalSearchAnalyticsHelper realGlobalSearchAnalyticsHelper = (RealGlobalSearchAnalyticsHelper) ((DoubleCheck) zzljVar.zzc).getValue();
                Analytics analytics3 = (Analytics) ((DoubleCheck) zzljVar.zze).getValue();
                RealInputFieldTextSaver realInputFieldTextSaver = (RealInputFieldTextSaver) ((LambdaProvider) zzljVar.zzd).lambda.invoke();
                RealActivityScreenInitialArgumentsSupplier realActivityScreenInitialArgumentsSupplier = (RealActivityScreenInitialArgumentsSupplier) ((DoubleCheck) zzljVar.zzf).getValue();
                globalSearchFeedPresenter$Factory$Impl.getClass();
                globalSearchQueryPresenter$Factory$Impl.getClass();
                realGlobalSearchAnalyticsHelper.getClass();
                analytics3.getClass();
                realInputFieldTextSaver.getClass();
                realActivityScreenInitialArgumentsSupplier.getClass();
                return MoleculePresenterKt.asPresenter$default(new LocalEditorialPresenter(globalSearchFeedPresenter$Factory$Impl, globalSearchQueryPresenter$Factory$Impl, screenNavigator, (GlobalSearchScreen) screen, realGlobalSearchAnalyticsHelper, analytics3, realInputFieldTextSaver, realActivityScreenInitialArgumentsSupplier));
            case 11:
                screen.getClass();
                if (screen instanceof HistoryScreens.InvestingRoundUpsSkippedConfirmationScreen) {
                    return MoleculePresenterKt.asPresenter$default(new AddAliasPresenter(screenNavigator, 12));
                }
                if (!(screen instanceof HistoryScreens.InvestingPendingTransactionsScreen)) {
                    if (screen instanceof HistoryScreens.InvestingRoundUpsFailedConfirmationScreen) {
                        return MoleculePresenterKt.asPresenter$default(new AddAliasPresenter(screenNavigator, 11));
                    }
                    return null;
                }
                ComponentRegistry.Builder builder2 = ((InvestingPendingTransactionsPresenter$Factory$Impl) obj).delegateFactory;
                AndroidStringManager androidStringManager5 = (AndroidStringManager) ((LambdaProvider) builder2.interceptors).lambda.invoke();
                RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl = (RealActivityEmbeddedPresenter$Factory$Impl) ((Provider) builder2.mappers).invoke();
                RealActivityTokenFactory realActivityTokenFactory = (RealActivityTokenFactory) ((Provider) builder2.keyers).invoke();
                RealActivitiesCacheManager realActivitiesCacheManager = (RealActivitiesCacheManager) ((DoubleCheck) builder2.lazyFetcherFactories).getValue();
                PendingInvestingActivityPageHandler pendingInvestingActivityPageHandler = (PendingInvestingActivityPageHandler) ((RealLiteCashInRepo$MetroFactory) builder2.lazyDecoderFactories).invoke();
                androidStringManager5.getClass();
                realActivityEmbeddedPresenter$Factory$Impl.getClass();
                realActivityTokenFactory.getClass();
                realActivitiesCacheManager.getClass();
                return MoleculePresenterKt.asPresenter$default(new LiteActivityPresenter(androidStringManager5, screenNavigator, realActivityEmbeddedPresenter$Factory$Impl, realActivityTokenFactory, realActivitiesCacheManager, pendingInvestingActivityPageHandler));
            case 12:
                screen.getClass();
                if (!(screen instanceof LimitsScreen)) {
                    return null;
                }
                EndAppLockPresenter.MetroFactory metroFactory3 = ((LimitsPresenter$Factory$Impl) obj).delegateFactory;
                RealLimitsStore realLimitsStore = (RealLimitsStore) metroFactory3.accountOutboundNavigatorFactory.invoke();
                Analytics analytics4 = (Analytics) metroFactory3.appLockState.getValue();
                LimitsInlineMessagePresenter$AssistedInjectionFactory$Impl limitsInlineMessagePresenter$AssistedInjectionFactory$Impl = (LimitsInlineMessagePresenter$AssistedInjectionFactory$Impl) metroFactory3.navigatorSwitcher.value;
                realLimitsStore.getClass();
                analytics4.getClass();
                limitsInlineMessagePresenter$AssistedInjectionFactory$Impl.getClass();
                return MoleculePresenterKt.asPresenter$default(new MusicPresenter(realLimitsStore, analytics4, limitsInlineMessagePresenter$AssistedInjectionFactory$Impl, screenNavigator));
            case 13:
                screen.getClass();
                if (!(screen instanceof LimitsSectionScreen)) {
                    return null;
                }
                Analytics analytics5 = (Analytics) ((LimitsSectionPresenter$Factory$Impl) obj).delegateFactory.analytics.getValue();
                analytics5.getClass();
                return MoleculePresenterKt.asPresenter$default(new InviteErrorPresenter(analytics5, (LimitsSectionScreen) screen, screenNavigator));
            case 14:
                screen.getClass();
                if (!(screen instanceof LanguageDisclosureScreen)) {
                    return null;
                }
                LanguageDisclosurePresenter$MetroFactory languageDisclosurePresenter$MetroFactory = ((LanguageDisclosurePresenter$Factory$Impl) obj).delegateFactory;
                AndroidActivityFinisher androidActivityFinisher = (AndroidActivityFinisher) languageDisclosurePresenter$MetroFactory.activityFinisher.invoke();
                Analytics analytics6 = (Analytics) languageDisclosurePresenter$MetroFactory.analytics.getValue();
                AppConfigManager appConfigManager = (AppConfigManager) languageDisclosurePresenter$MetroFactory.appConfigManager.getValue();
                CustomerProfileClientService customerProfileClientService = (CustomerProfileClientService) languageDisclosurePresenter$MetroFactory.appService.getValue();
                CoroutineContext coroutineContext2 = (CoroutineContext) languageDisclosurePresenter$MetroFactory.ioDispatcher.lambda.invoke();
                IntentLauncher intentLauncher5 = (IntentLauncher) languageDisclosurePresenter$MetroFactory.launcher.invoke();
                RealLocaleManager realLocaleManager = (RealLocaleManager) languageDisclosurePresenter$MetroFactory.localeManager.lambda.invoke();
                CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) languageDisclosurePresenter$MetroFactory.localizationDatabase.getValue();
                AndroidStringManager androidStringManager6 = (AndroidStringManager) languageDisclosurePresenter$MetroFactory.stringManager.lambda.invoke();
                androidActivityFinisher.getClass();
                analytics6.getClass();
                appConfigManager.getClass();
                customerProfileClientService.getClass();
                coroutineContext2.getClass();
                intentLauncher5.getClass();
                realLocaleManager.getClass();
                cashAccountDatabaseImpl.getClass();
                androidStringManager6.getClass();
                return MoleculePresenterKt.asPresenter$default(new LocalCashBalancePresenter(androidActivityFinisher, analytics6, appConfigManager, customerProfileClientService, coroutineContext2, intentLauncher5, realLocaleManager, cashAccountDatabaseImpl, androidStringManager6, (LanguageDisclosureScreen) screen, screenNavigator));
            case 15:
                screen.getClass();
                if (screen instanceof MarketCapabilitiesErrorScreen) {
                    return MoleculePresenterKt.asPresenter$default((MoleculePresenter) ((CashCdpConfigProvider.MetroFactory) obj).invoke());
                }
                return null;
            case 16:
                screen.getClass();
                if (!(screen instanceof MoneyTabBookletScreen)) {
                    return null;
                }
                LoadTimeClock.MetroFactory metroFactory4 = ((MoneyTabBookletPresenter$Factory$Impl) obj).delegateFactory;
                RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl = (RealBlockersHelper$Factory$Impl) metroFactory4.clock.invoke();
                RealRouter$Factory$Impl realRouter$Factory$Impl2 = (RealRouter$Factory$Impl) metroFactory4.observabilityManager.invoke();
                realBlockersHelper$Factory$Impl.getClass();
                realRouter$Factory$Impl2.getClass();
                return MoleculePresenterKt.asPresenter$default(new MusicPresenter(realBlockersHelper$Factory$Impl, realRouter$Factory$Impl2, (MoneyTabBookletScreen) screen, screenNavigator));
            case 17:
                screen.getClass();
                if (!(screen instanceof MusicScreen)) {
                    return null;
                }
                OkHttpCall.AnonymousClass1 anonymousClass1 = ((MusicPresenter$Factory$Impl) obj).delegateFactory;
                ToolbarTuckTargets toolbarTuckTargets = (ToolbarTuckTargets) ((RetroUiFactory.MetroFactory) anonymousClass1.val$callback).invoke();
                RealMusicPlayer realMusicPlayer = (RealMusicPlayer) ((DoubleCheck) anonymousClass1.this$0).getValue();
                realMusicPlayer.getClass();
                return MoleculePresenterKt.asPresenter$default(new MusicPresenter(toolbarTuckTargets, realMusicPlayer, (MusicScreen) screen, screenNavigator));
            case 18:
                screen.getClass();
                if (screen instanceof CountrySelectorScreen) {
                    OnboardableCountries onboardableCountries = (OnboardableCountries) ((CountrySelectorPresenter$Factory$Impl) obj).delegateFactory.analytics.getValue();
                    onboardableCountries.getClass();
                    inviteErrorPresenter = new InviteErrorPresenter(onboardableCountries, (CountrySelectorScreen) screen, screenNavigator);
                } else {
                    inviteErrorPresenter = null;
                }
                if (inviteErrorPresenter != null) {
                    return MoleculePresenterKt.asPresenter$default(inviteErrorPresenter);
                }
                return null;
            case 19:
                screen.getClass();
                if (screen instanceof OnboardingLandingScreen) {
                    OnboardingLandingPresenter$MetroFactory onboardingLandingPresenter$MetroFactory = ((OnboardingLandingPresenter$Factory$Impl) obj).delegateFactory;
                    Analytics analytics7 = (Analytics) onboardingLandingPresenter$MetroFactory.analytics.getValue();
                    RealObservabilityManager realObservabilityManager = (RealObservabilityManager) onboardingLandingPresenter$MetroFactory.observabilityManager.lambda.invoke();
                    AndroidStringManager androidStringManager7 = (AndroidStringManager) onboardingLandingPresenter$MetroFactory.stringManager.lambda.invoke();
                    analytics7.getClass();
                    realObservabilityManager.getClass();
                    androidStringManager7.getClass();
                    workHomePresenter = new WorkHomePresenter((OnboardingLandingScreen) screen, screenNavigator, analytics7, realObservabilityManager, androidStringManager7);
                } else {
                    workHomePresenter = null;
                }
                if (workHomePresenter != null) {
                    return MoleculePresenterKt.asPresenter$default(workHomePresenter);
                }
                return null;
            case 20:
                screen.getClass();
                if (!(screen instanceof PasskeyManagementScreen)) {
                    return null;
                }
                FormPresenter.MetroFactory metroFactory5 = ((PasskeyManagementPresenter$Factory$Impl) obj).delegateFactory;
                RealPasskeyRepository realPasskeyRepository = (RealPasskeyRepository) metroFactory5.blockersHelperFactory.invoke();
                RealTodayDateTimeFormatter realTodayDateTimeFormatter = (RealTodayDateTimeFormatter) metroFactory5.analytics.getValue();
                AndroidStringManager androidStringManager8 = (AndroidStringManager) metroFactory5.clock.lambda.invoke();
                RealPasskeyAnalytics realPasskeyAnalytics = (RealPasskeyAnalytics) metroFactory5.formAnalytics.invoke();
                RealDeviceManagerInboundNavigator$Factory$Impl realDeviceManagerInboundNavigator$Factory$Impl = (RealDeviceManagerInboundNavigator$Factory$Impl) metroFactory5.blockerActionUriDecoder.invoke();
                realPasskeyRepository.getClass();
                realTodayDateTimeFormatter.getClass();
                androidStringManager8.getClass();
                realPasskeyAnalytics.getClass();
                realDeviceManagerInboundNavigator$Factory$Impl.getClass();
                return MoleculePresenterKt.asPresenter$default(new WorkHomePresenter(realPasskeyRepository, realTodayDateTimeFormatter, androidStringManager8, realPasskeyAnalytics, realDeviceManagerInboundNavigator$Factory$Impl, screenNavigator));
            case 21:
                screen.getClass();
                if (!(screen instanceof BlockersScreens.PersonaDidvScreen)) {
                    return null;
                }
                LocalHomeGeoPresenter.MetroFactory metroFactory6 = ((PersonaDidvPresenter$Factory$Impl) obj).delegateFactory;
                PersonaDidvInquiryLauncher personaDidvInquiryLauncher = (PersonaDidvInquiryLauncher) metroFactory6.store.invoke();
                BlockersDataNavigator blockersDataNavigator3 = (BlockersDataNavigator) metroFactory6.cashMapPresenterFactory.invoke();
                RealMultiBlockerFacilitator realMultiBlockerFacilitator = (RealMultiBlockerFacilitator) metroFactory6.tabContentPresenterFactory.invoke();
                AndroidStringManager androidStringManager9 = (AndroidStringManager) metroFactory6.clock.lambda.invoke();
                RealDeviceIntegrityAttester realDeviceIntegrityAttester = (RealDeviceIntegrityAttester) metroFactory6.brandProfilePresenterFactory.invoke();
                FeatureFlagManager featureFlagManager = (FeatureFlagManager) metroFactory6.syncer.getValue();
                RealUuidGenerator realUuidGenerator = (RealUuidGenerator) metroFactory6.stringManager.lambda.invoke();
                RealMRIFactory realMRIFactory = (RealMRIFactory) metroFactory6.featureFlagManager.getValue();
                personaDidvInquiryLauncher.getClass();
                blockersDataNavigator3.getClass();
                realMultiBlockerFacilitator.getClass();
                androidStringManager9.getClass();
                realDeviceIntegrityAttester.getClass();
                featureFlagManager.getClass();
                realUuidGenerator.getClass();
                realMRIFactory.getClass();
                return MoleculePresenterKt.asPresenter$default(new LocalHomePresenter(personaDidvInquiryLauncher, blockersDataNavigator3, realMultiBlockerFacilitator, androidStringManager9, (BlockersScreens.PersonaDidvScreen) screen, screenNavigator, realDeviceIntegrityAttester, featureFlagManager, realUuidGenerator, realMRIFactory));
            case 22:
                screen.getClass();
                if (screen instanceof ProfileUnavailableScreen) {
                    return MoleculePresenterKt.asPresenter$default((MoleculePresenter) ((ScoreUiFactory.MetroFactory) obj).invoke());
                }
                return null;
            case 23:
                screen.getClass();
                if (!(screen instanceof PromotionsReferralsScreen$PromotionsReferralsHomeScreen)) {
                    return null;
                }
                SetAddressPresenter$MetroFactory setAddressPresenter$MetroFactory = ((PromotionsReferralsHomePresenter$Factory$Impl) obj).delegateFactory;
                RealP2pSettingsManager realP2pSettingsManager = (RealP2pSettingsManager) setAddressPresenter$MetroFactory.blockerFlowAnalytics.invoke();
                AppConfigManager appConfigManager2 = (AppConfigManager) setAddressPresenter$MetroFactory.analytics.getValue();
                AndroidStringManager androidStringManager10 = (AndroidStringManager) setAddressPresenter$MetroFactory.stringManager.lambda.invoke();
                FlowStarter flowStarter2 = (FlowStarter) setAddressPresenter$MetroFactory.service.getValue();
                LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) setAddressPresenter$MetroFactory.blockersNavigator.invoke();
                Analytics analytics8 = (Analytics) setAddressPresenter$MetroFactory.franklinAppService.getValue();
                RealReferralManager realReferralManager = (RealReferralManager) setAddressPresenter$MetroFactory.idvPresenterFactory.invoke();
                RealRouter$Factory$Impl realRouter$Factory$Impl3 = (RealRouter$Factory$Impl) setAddressPresenter$MetroFactory.blockersHelperFactory.invoke();
                IncentivesClientService incentivesClientService = (IncentivesClientService) setAddressPresenter$MetroFactory.appConfig.getValue();
                realP2pSettingsManager.getClass();
                appConfigManager2.getClass();
                androidStringManager10.getClass();
                flowStarter2.getClass();
                factory.getClass();
                analytics8.getClass();
                realReferralManager.getClass();
                realRouter$Factory$Impl3.getClass();
                incentivesClientService.getClass();
                return MoleculePresenterKt.asPresenter$default(new CardLockPresenter(screenNavigator, (PromotionsReferralsScreen$PromotionsReferralsHomeScreen) screen, realP2pSettingsManager, appConfigManager2, androidStringManager10, flowStarter2, factory, analytics8, realReferralManager, realRouter$Factory$Impl3, incentivesClientService));
            case 24:
                screen.getClass();
                if (!(screen instanceof BlockersScreens.ConfirmFirstScheduledReloadNoticeScreen)) {
                    return null;
                }
                AndroidStringManager androidStringManager11 = (AndroidStringManager) ((ConfirmFirstScheduledReloadNoticePresenter$Factory$Impl) obj).delegateFactory.stringManager.lambda.invoke();
                androidStringManager11.getClass();
                return MoleculePresenterKt.asPresenter$default(new InviteErrorPresenter(androidStringManager11, (BlockersScreens.ConfirmFirstScheduledReloadNoticeScreen) screen, screenNavigator));
            case 25:
                screen.getClass();
                if (!(screen instanceof ScoreHomeScreen)) {
                    return null;
                }
                zzlj zzljVar2 = ((ScoreHomePresenter$Factory$Impl) obj).delegateFactory;
                RealScoreRepository realScoreRepository = (RealScoreRepository) ((Provider) zzljVar2.zza).invoke();
                RealProfileManager realProfileManager = (RealProfileManager) ((DelegateFactory) zzljVar2.zzb).invoke();
                IssuedCardManager issuedCardManager = (IssuedCardManager) ((DoubleCheck) zzljVar2.zzc).getValue();
                RealCardCustomizationRepository realCardCustomizationRepository = (RealCardCustomizationRepository) ((Provider) zzljVar2.zze).invoke();
                Analytics analytics9 = (Analytics) ((DoubleCheck) zzljVar2.zzd).getValue();
                RealRouter$Factory$Impl realRouter$Factory$Impl4 = (RealRouter$Factory$Impl) ((Provider) zzljVar2.zzf).invoke();
                realScoreRepository.getClass();
                realProfileManager.getClass();
                issuedCardManager.getClass();
                realCardCustomizationRepository.getClass();
                analytics9.getClass();
                realRouter$Factory$Impl4.getClass();
                return MoleculePresenterKt.asPresenter$default(new LocalEditorialPresenter((ScoreHomeScreen) screen, realScoreRepository, realProfileManager, issuedCardManager, realCardCustomizationRepository, analytics9, screenNavigator, realRouter$Factory$Impl4));
            case 26:
                screen.getClass();
                if (!screen.equals(ShareSheetScreen.INSTANCE)) {
                    return null;
                }
                DefaultSocket defaultSocket2 = ((ShareSheetPresenter$Factory$Impl) obj).delegateFactory;
                StuckPlayerDetector stuckPlayerDetector = (StuckPlayerDetector) ((RealAppMessageManager.MetroFactory) defaultSocket2.socket).invoke();
                RealProfileManager realProfileManager2 = (RealProfileManager) ((DelegateFactory) defaultSocket2.closeBits).invoke();
                AndroidStringManager androidStringManager12 = (AndroidStringManager) ((LambdaProvider) defaultSocket2.source).lambda.invoke();
                Analytics analytics10 = (Analytics) ((DoubleCheck) defaultSocket2.sink).getValue();
                realProfileManager2.getClass();
                androidStringManager12.getClass();
                analytics10.getClass();
                return MoleculePresenterKt.asPresenter$default(new ShareSheetPresenter(stuckPlayerDetector, realProfileManager2, androidStringManager12, analytics10, screenNavigator));
            case 27:
                screen.getClass();
                if (!(screen instanceof StablecoinScreens$StablecoinHome)) {
                    return null;
                }
                if (!((StablecoinScreens$StablecoinHome) screen).equals(StablecoinScreens$StablecoinHome.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                OkHttpCall.AnonymousClass1 anonymousClass12 = ((StablecoinHomePresenter$Factory$Impl) obj).delegateFactory;
                RealStablecoinNullStateCarouselPresenter realStablecoinNullStateCarouselPresenter = (RealStablecoinNullStateCarouselPresenter) ((SandboxJanitor.MetroFactory) anonymousClass12.val$callback).invoke();
                RealStablecoinHomeWidgetPresenterFactory$Factory$Impl realStablecoinHomeWidgetPresenterFactory$Factory$Impl = (RealStablecoinHomeWidgetPresenterFactory$Factory$Impl) ((InstanceFactory) anonymousClass12.this$0).value;
                realStablecoinHomeWidgetPresenterFactory$Factory$Impl.getClass();
                return MoleculePresenterKt.asPresenter$default(new StablecoinHomePresenter(realStablecoinNullStateCarouselPresenter, realStablecoinHomeWidgetPresenterFactory$Factory$Impl, screenNavigator));
            case 28:
                screen.getClass();
                if (!(screen instanceof BlockersScreens.ThreeDsAuthenticationScreen)) {
                    return null;
                }
                ThreeDsPresenter.MetroFactory metroFactory7 = ((ThreeDsPresenter$Factory$Impl) obj).delegateFactory;
                RealThreeDsService realThreeDsService = (RealThreeDsService) metroFactory7.threeDsService.getValue();
                RealThreeDsAuthenticationManager realThreeDsAuthenticationManager = (RealThreeDsAuthenticationManager) metroFactory7.threeDsAuthenticationManager.getValue();
                BlockersDataNavigator blockersDataNavigator4 = (BlockersDataNavigator) metroFactory7.blockersDataNavigator.invoke();
                ThreeDsAuthenticationService threeDsAuthenticationService = (ThreeDsAuthenticationService) metroFactory7.appService.getValue();
                RealThreeDsSpanTrackingService realThreeDsSpanTrackingService = (RealThreeDsSpanTrackingService) metroFactory7.spanTrackingService.invoke();
                FeatureFlagManager featureFlagManager2 = (FeatureFlagManager) metroFactory7.featureFlagManager.getValue();
                Analytics analytics11 = (Analytics) metroFactory7.analytics.getValue();
                AndroidStringManager androidStringManager13 = (AndroidStringManager) metroFactory7.stringManager.lambda.invoke();
                boolean booleanValue = ((Boolean) metroFactory7.isDebug.lambda.invoke()).booleanValue();
                CoroutineContext coroutineContext3 = (CoroutineContext) metroFactory7.ioDispatcher.lambda.invoke();
                RealRouter$Factory$Impl realRouter$Factory$Impl5 = (RealRouter$Factory$Impl) metroFactory7.routerFactory.invoke();
                realThreeDsService.getClass();
                realThreeDsAuthenticationManager.getClass();
                blockersDataNavigator4.getClass();
                threeDsAuthenticationService.getClass();
                realThreeDsSpanTrackingService.getClass();
                featureFlagManager2.getClass();
                analytics11.getClass();
                androidStringManager13.getClass();
                coroutineContext3.getClass();
                realRouter$Factory$Impl5.getClass();
                return MoleculePresenterKt.asPresenter$default(new ThreeDsPresenter(realThreeDsService, realThreeDsAuthenticationManager, blockersDataNavigator4, threeDsAuthenticationService, realThreeDsSpanTrackingService, featureFlagManager2, analytics11, androidStringManager13, booleanValue, coroutineContext3, realRouter$Factory$Impl5, (BlockersScreens.ThreeDsAuthenticationScreen) screen, screenNavigator));
            default:
                screen.getClass();
                if (!(screen instanceof BlockersScreens.ActivityPickerScreen)) {
                    return null;
                }
                DeviceBuildInfo deviceBuildInfo = ((UnifiedActivityPickerBlockerPresenter$Factory$Impl) obj).delegateFactory;
                RealActivitiesCacheManager realActivitiesCacheManager2 = (RealActivitiesCacheManager) ((DoubleCheck) deviceBuildInfo.manufacturer).getValue();
                RealActivityTokenFactory realActivityTokenFactory2 = (RealActivityTokenFactory) ((Provider) deviceBuildInfo.model).invoke();
                RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl2 = (RealActivityEmbeddedPresenter$Factory$Impl) ((Provider) deviceBuildInfo.osVersion).invoke();
                SupportActivityItemPresenter$Factory$Impl supportActivityItemPresenter$Factory$Impl = (SupportActivityItemPresenter$Factory$Impl) ((Provider) deviceBuildInfo.osBuild).invoke();
                AndroidStringManager androidStringManager14 = (AndroidStringManager) ((LambdaProvider) deviceBuildInfo.fingerprint).lambda.invoke();
                AppService appService = (AppService) ((DoubleCheck) deviceBuildInfo.tags).getValue();
                BlockersDataNavigator blockersDataNavigator5 = (BlockersDataNavigator) ((Provider) deviceBuildInfo.brand).invoke();
                Analytics analytics12 = (Analytics) ((DoubleCheck) deviceBuildInfo.apiLevel).getValue();
                Moshi moshi = (Moshi) ((LambdaProvider) deviceBuildInfo.cpuAbis).lambda.invoke();
                realActivitiesCacheManager2.getClass();
                realActivityTokenFactory2.getClass();
                realActivityEmbeddedPresenter$Factory$Impl2.getClass();
                supportActivityItemPresenter$Factory$Impl.getClass();
                androidStringManager14.getClass();
                appService.getClass();
                blockersDataNavigator5.getClass();
                analytics12.getClass();
                moshi.getClass();
                return MoleculePresenterKt.asPresenter$default(new UnifiedActivityPickerBlockerPresenter(realActivitiesCacheManager2, realActivityTokenFactory2, realActivityEmbeddedPresenter$Factory$Impl2, supportActivityItemPresenter$Factory$Impl, androidStringManager14, appService, blockersDataNavigator5, analytics12, moshi, screenNavigator, (BlockersScreens.ActivityPickerScreen) screen));
        }
    }
}
