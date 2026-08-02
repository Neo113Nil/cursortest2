package com.squareup.cash.offers.presenters;

import androidx.compose.runtime.internal.RememberEventDispatcher;
import androidx.compose.ui.node.NodeChain;
import app.cash.broadway.presenter.Presenter;
import app.cash.broadway.presenter.PresenterFactory;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt;
import app.cash.broadway.screen.Screen;
import app.cash.local.presenters.LocalCashBalancePresenter;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.passcode.presenters.EndAppLockPresenter;
import com.bugsnag.android.DeviceBuildInfo;
import com.fillr.n;
import com.squareup.cash.NavigationSideEffects;
import com.squareup.cash.account.presenters.ProfileUpsellPresenter;
import com.squareup.cash.account.presenters.ThemeSwitcherPresenter$MetroFactory;
import com.squareup.cash.activity.backend.RealActivityAnalyticsService;
import com.squareup.cash.activity.backend.loader.RealActivitiesCacheManager;
import com.squareup.cash.activity.backend.loader.RealActivityTokenFactory;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter$Factory$Impl;
import com.squareup.cash.aiedge.MLKitTitleGenerator$MetroFactory;
import com.squareup.cash.appforeground.AppForegroundStateProvider;
import com.squareup.cash.banking.backend.real.RealConfirmCashOutVersionCodeProvider;
import com.squareup.cash.banking.navigation.real.RealBankingOutboundNavigator$Factory$Impl;
import com.squareup.cash.banking.presenters.BalanceHomePresenter;
import com.squareup.cash.banking.presenters.BalanceHomePresenter$Factory$Impl;
import com.squareup.cash.banking.presenters.BankingDialogPresenter$Factory$Impl;
import com.squareup.cash.banking.presenters.BankingSectionsPresenter$Factory$Impl;
import com.squareup.cash.banking.presenters.BenefitsLeafletPresenter$Factory$Impl;
import com.squareup.cash.banking.presenters.BetterOverdraftPresenter$Factory$Impl;
import com.squareup.cash.banking.presenters.ConfirmCashOutPresenter$Factory$Impl;
import com.squareup.cash.banking.presenters.DemandDepositAccountFormatter;
import com.squareup.cash.banking.presenters.DemandDepositDialogPresenter$Factory$Impl;
import com.squareup.cash.banking.presenters.OverdraftCoveragePresenter$Factory$Impl;
import com.squareup.cash.banking.presenters.RecurringDepositsFirstTimeUserPresenter$Factory$Impl;
import com.squareup.cash.banking.presenters.RecurringDepositsPresenter$Factory$Impl;
import com.squareup.cash.banking.presenters.TransfersPresenter;
import com.squareup.cash.banking.presenters.TransfersPresenter$Factory$Impl;
import com.squareup.cash.banking.real.RealDisclosureProvider;
import com.squareup.cash.banking.screens.BalanceHomeScreen;
import com.squareup.cash.banking.screens.BankingDialogScreen;
import com.squareup.cash.banking.screens.BenefitsLeafletSheetScreen;
import com.squareup.cash.banking.screens.ConfirmCashOutScreen;
import com.squareup.cash.banking.screens.DemandDepositDialogScreen;
import com.squareup.cash.banking.screens.OverdraftCoverageSheetScreen;
import com.squareup.cash.banking.screens.RecurringDepositsFirstTimeUserScreen;
import com.squareup.cash.banking.screens.RecurringDepositsScreen;
import com.squareup.cash.banking.screens.TransfersScreen;
import com.squareup.cash.blockers.analytics.RealFlowTokenGenerator;
import com.squareup.cash.blockers.presenters.ErrorPresenter;
import com.squareup.cash.blockers.presenters.PlaidLinkPresenter;
import com.squareup.cash.blockers.presenters.SetAddressPresenter$MetroFactory;
import com.squareup.cash.blockers.presenters.SsnPresenter;
import com.squareup.cash.boost.backend.BoostSyncer;
import com.squareup.cash.boost.backend.RealBoostRepository;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.card.onboarding.StampSheetPresenter$MetroFactory;
import com.squareup.cash.checks.CheckDepositAmountPresenter;
import com.squareup.cash.checks.VerifyCheckDialogPresenter;
import com.squareup.cash.clientroutes.RealClientRouteParser;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.clientsync.syncer.RealClientSyncer;
import com.squareup.cash.clipboard.RealClipboardManager;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.backend.balance.RealRestrictedBalanceStore;
import com.squareup.cash.crypto.navigation.CryptoFlowStarter;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.data.profile.RealDemandDepositAccountManager;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.datetimeformatter.real.RealTodayDateTimeFormatter;
import com.squareup.cash.earnings.backend.real.RealEarningsChartRepository$MetroFactory;
import com.squareup.cash.featureflags.AmplitudeExperiments$MobileBankingEvergreenOverdraft;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.fileupload.real.RealAndroidFileParser;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.history.analytics.LoadTimeClock;
import com.squareup.cash.history.navigation.PaymentActionHandler;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.instruments.backend.real.RealInstrumentManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.invitations.InviteErrorPresenter;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.localization.RealLocaleAssetProvider$MetroFactory;
import com.squareup.cash.maps.presenter.CashMapPresenter;
import com.squareup.cash.merchant.backend.real.RealMerchantProfileRepo$MetroFactory;
import com.squareup.cash.merchant.presenters.MerchantInfoFeedbackPresenter$MetroFactory;
import com.squareup.cash.money.navigation.real.RealMoneyInboundNavigator$Factory$Impl;
import com.squareup.cash.moneybot.analytics.RealMoneybotAnalyticsService;
import com.squareup.cash.moneybot.backend.RealMoneybotChatMessagesCache;
import com.squareup.cash.moneybot.backend.RealUserSessionPager;
import com.squareup.cash.moneybot.backend.api.MoneybotFlagsHelper;
import com.squareup.cash.moneybot.backend.api.managers.ChatManager;
import com.squareup.cash.moneybot.backend.api.managers.MoneybotDebugSettingsManager;
import com.squareup.cash.moneybot.backend.real.managers.RealChatSessionManager$Factory$Impl;
import com.squareup.cash.moneybot.backend.real.managers.RealMoneybotDisclosureManager;
import com.squareup.cash.moneybot.backend.real.managers.RealMoneybotPreambleManager;
import com.squareup.cash.moneybot.backend.real.managers.RealMoneybotPromptManager;
import com.squareup.cash.moneybot.backend.real.managers.RealMoneybotWidgetManager;
import com.squareup.cash.moneybot.components.api.ClientRenderablePluginRegistry;
import com.squareup.cash.moneybot.presenters.MoneybotAmountInputPresenter$Factory$Impl;
import com.squareup.cash.moneybot.presenters.MoneybotAutomationsPresenter$Factory$Impl;
import com.squareup.cash.moneybot.presenters.MoneybotChatContentFactory$Factory$Impl;
import com.squareup.cash.moneybot.presenters.MoneybotChatHistoryPresenter$Factory$Impl;
import com.squareup.cash.moneybot.presenters.MoneybotChatHistoryPresenter$MetroFactory;
import com.squareup.cash.moneybot.presenters.MoneybotChatPresenter;
import com.squareup.cash.moneybot.presenters.MoneybotChatPresenter$Factory$Impl;
import com.squareup.cash.moneybot.presenters.MoneybotDebugOverlayPresenter$Factory$Impl;
import com.squareup.cash.moneybot.presenters.MoneybotFeedbackPresenter$Factory$Impl;
import com.squareup.cash.moneybot.presenters.MoneybotHomePresenter;
import com.squareup.cash.moneybot.presenters.MoneybotHomePresenter$Factory$Impl;
import com.squareup.cash.moneybot.presenters.MoneybotOverflowMenuPresenter$Factory$Impl;
import com.squareup.cash.moneybot.presenters.MoneybotPreambleEditorPresenter$Factory$Impl;
import com.squareup.cash.moneybot.presenters.MoneybotStaticPickerPresenter$Factory$Impl;
import com.squareup.cash.moneybot.presenters.MoneybotTextInputPresenter$Factory$Impl;
import com.squareup.cash.moneybot.presenters.RawMessagesPresenter$Factory$Impl;
import com.squareup.cash.moneybot.screens.MoneybotAmountInputScreen;
import com.squareup.cash.moneybot.screens.MoneybotAutomationsScreen;
import com.squareup.cash.moneybot.screens.MoneybotChatHistoryScreen;
import com.squareup.cash.moneybot.screens.MoneybotChatScreen;
import com.squareup.cash.moneybot.screens.MoneybotDebugOverlayScreen;
import com.squareup.cash.moneybot.screens.MoneybotFeedbackScreen;
import com.squareup.cash.moneybot.screens.MoneybotHomeScreen;
import com.squareup.cash.moneybot.screens.MoneybotOverflowMenuScreen;
import com.squareup.cash.moneybot.screens.MoneybotPreambleEditorScreen;
import com.squareup.cash.moneybot.screens.MoneybotScreen;
import com.squareup.cash.moneybot.screens.MoneybotStaticPickerScreen;
import com.squareup.cash.moneybot.screens.MoneybotTextInputScreen;
import com.squareup.cash.moneybot.screens.RawMessagesScreen;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.offers.backend.real.RealOffersAnalyticsHelper;
import com.squareup.cash.offers.backend.real.RealOffersAnalyticsV2;
import com.squareup.cash.offers.backend.real.RealOffersInflightStateManager;
import com.squareup.cash.offers.backend.real.RealOffersSheetRepository;
import com.squareup.cash.offers.backend.real.RealOffersSpanManager;
import com.squareup.cash.offers.backend.real.RealOffersTabRefresher;
import com.squareup.cash.offers.backend.real.RealOffersTabRepository;
import com.squareup.cash.offers.presenters.OffersHomePresenter;
import com.squareup.cash.offers.screens.OffersScreen$OffersDetailsScreen;
import com.squareup.cash.offers.screens.OffersScreen$OffersDetailsScreenV2;
import com.squareup.cash.offers.screens.OffersScreen$OffersFilterGroupSheetScreen;
import com.squareup.cash.offers.screens.OffersScreen$OffersFullscreenCollectionScreen;
import com.squareup.cash.offers.screens.OffersScreen$OffersGreenStatusScreen;
import com.squareup.cash.offers.screens.OffersScreen$OffersHomeScreen;
import com.squareup.cash.offers.screens.OffersScreen$OffersHomeScreenV2;
import com.squareup.cash.offers.screens.OffersScreen$OffersNotificationScreen;
import com.squareup.cash.offers.screens.OffersScreen$OffersRedemptionScreen;
import com.squareup.cash.offers.screens.OffersScreen$OffersTimelineScreen;
import com.squareup.cash.offers.screens.OffersScreen$OffersTimelineScreenV2;
import com.squareup.cash.paychecks.presenters.HelpSheetPresenter$MetroFactory;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.storage.Storage;
import com.squareup.cash.support.chat.presenters.ChatImageDetailPresenter$MetroFactory;
import com.squareup.cash.tabs.presenters.TabToolbarPresenter$Factory$Impl;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.cash.tax.presenters.TaxReturnsPresenter;
import com.squareup.cash.tax.presenters.TaxTooltipPresenter$MetroFactory;
import com.squareup.cash.transfers.backend.real.RealBalanceBasedAddCashManager;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.wallet.data.IssuedCardManager;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.cash.work.presenters.WorkHomePresenter;
import com.squareup.moshi.Moshi;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.bankingbenefits.api.v1_0.BankingBenefitsAppService;
import com.squareup.protos.cash.kgoose.api.v3.cash.CashKgooseService;
import com.squareup.protos.cash.overdraftly.OverdraftlyService;
import com.squareup.protos.cash.unicorn.service.UnicornService;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DelegateFactory;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import okhttp3.internal.publicsuffix.AssetPublicSuffixList;

/* loaded from: classes.dex */
public final class OffersPresenterFactory implements PresenterFactory {
    public final /* synthetic */ int $r8$classId = 1;
    public final Object offersCollectionPresenter;
    public final Object offersDetailsPresenter;
    public final Object offersDetailsSheetPresenterV2;
    public final Object offersFilterGroupSheetPresenter;
    public final Object offersGreenStatusPresenter;
    public final Object offersHomePresenter;
    public final Object offersHomePresenterV2;
    public final Object offersRedemptionPresenter;
    public final Object offersTimelinePresenter;
    public final Object offersTimelinePresenterV2;

    public OffersPresenterFactory(OffersHomePresenterV2$Factory$Impl offersHomePresenterV2$Factory$Impl, OffersHomePresenter$Factory$Impl offersHomePresenter$Factory$Impl, OffersFilterGroupSheetPresenter$Factory$Impl offersFilterGroupSheetPresenter$Factory$Impl, OffersFullscreenCollectionPresenter$Factory$Impl offersFullscreenCollectionPresenter$Factory$Impl, OffersDetailsPresenter$Factory$Impl offersDetailsPresenter$Factory$Impl, OffersDetailsPresenterV2$Factory$Impl offersDetailsPresenterV2$Factory$Impl, OffersTimelinePresenter$Factory$Impl offersTimelinePresenter$Factory$Impl, OffersTimelinePresenterV2$Factory$Impl offersTimelinePresenterV2$Factory$Impl, OffersRedemptionPresenter$Factory$Impl offersRedemptionPresenter$Factory$Impl, OffersNotificationPresenter$Factory$Impl offersNotificationPresenter$Factory$Impl, OffersGreenStatusPresenter$Factory$Impl offersGreenStatusPresenter$Factory$Impl) {
        this.offersHomePresenterV2 = offersHomePresenterV2$Factory$Impl;
        this.offersHomePresenter = offersHomePresenter$Factory$Impl;
        this.offersFilterGroupSheetPresenter = offersFilterGroupSheetPresenter$Factory$Impl;
        this.offersCollectionPresenter = offersFullscreenCollectionPresenter$Factory$Impl;
        this.offersDetailsPresenter = offersDetailsPresenter$Factory$Impl;
        this.offersDetailsSheetPresenterV2 = offersDetailsPresenterV2$Factory$Impl;
        this.offersTimelinePresenter = offersTimelinePresenter$Factory$Impl;
        this.offersTimelinePresenterV2 = offersTimelinePresenterV2$Factory$Impl;
        this.offersRedemptionPresenter = offersRedemptionPresenter$Factory$Impl;
        this.offersGreenStatusPresenter = offersGreenStatusPresenter$Factory$Impl;
    }

    @Override // app.cash.broadway.presenter.PresenterFactory
    public final Presenter create(Screen screen, BetterNavigator.ScreenNavigator screenNavigator) {
        int i = this.$r8$classId;
        Object obj = this.offersGreenStatusPresenter;
        Object obj2 = this.offersTimelinePresenterV2;
        Object obj3 = this.offersTimelinePresenter;
        Object obj4 = this.offersDetailsSheetPresenterV2;
        Object obj5 = this.offersDetailsPresenter;
        Object obj6 = this.offersCollectionPresenter;
        Object obj7 = this.offersFilterGroupSheetPresenter;
        Object obj8 = this.offersRedemptionPresenter;
        Object obj9 = this.offersHomePresenter;
        Object obj10 = this.offersHomePresenterV2;
        switch (i) {
            case 0:
                screen.getClass();
                if (screen instanceof OffersScreen$OffersGreenStatusScreen) {
                    DisclosurePresenter.MetroFactory metroFactory = ((OffersGreenStatusPresenter$Factory$Impl) obj).delegateFactory;
                    AndroidStringManager androidStringManager = (AndroidStringManager) metroFactory.stringManager.lambda.invoke();
                    FeatureFlagManager featureFlagManager = (FeatureFlagManager) metroFactory.analytics.getValue();
                    RealOffersAnalyticsV2 realOffersAnalyticsV2 = (RealOffersAnalyticsV2) metroFactory.blockersNavigator.invoke();
                    Analytics analytics = (Analytics) metroFactory.appService.getValue();
                    RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) metroFactory.launcher.invoke();
                    androidStringManager.getClass();
                    featureFlagManager.getClass();
                    realOffersAnalyticsV2.getClass();
                    analytics.getClass();
                    realRouter$Factory$Impl.getClass();
                    return MoleculePresenterKt.asPresenter$default(new DisclosurePresenter(androidStringManager, featureFlagManager, realOffersAnalyticsV2, analytics, realRouter$Factory$Impl, (OffersScreen$OffersGreenStatusScreen) screen, screenNavigator));
                }
                if (screen instanceof OffersScreen$OffersTimelineScreenV2) {
                    AndroidStringManager androidStringManager2 = (AndroidStringManager) ((OffersTimelinePresenterV2$Factory$Impl) obj2).delegateFactory.stringManager.lambda.invoke();
                    androidStringManager2.getClass();
                    return MoleculePresenterKt.asPresenter$default(new InviteErrorPresenter(androidStringManager2, (OffersScreen$OffersTimelineScreenV2) screen, screenNavigator));
                }
                if (screen instanceof OffersScreen$OffersDetailsScreenV2) {
                    RememberEventDispatcher rememberEventDispatcher = ((OffersDetailsPresenterV2$Factory$Impl) obj4).delegateFactory;
                    AndroidStringManager androidStringManager3 = (AndroidStringManager) ((LambdaProvider) rememberEventDispatcher.abandoning).lambda.invoke();
                    RealBoostRepository realBoostRepository = (RealBoostRepository) ((DoubleCheck) rememberEventDispatcher.traceContext).getValue();
                    SyncValueReader syncValueReader = (SyncValueReader) ((DoubleCheck) rememberEventDispatcher.remembering).getValue();
                    RealProfileManager realProfileManager = (RealProfileManager) ((DelegateFactory) rememberEventDispatcher.currentRememberingList).invoke();
                    RealFlowTokenGenerator realFlowTokenGenerator = (RealFlowTokenGenerator) ((Provider) rememberEventDispatcher.leaving).invoke();
                    FeatureFlagManager featureFlagManager2 = (FeatureFlagManager) ((DoubleCheck) rememberEventDispatcher.sideEffects).getValue();
                    RealOffersAnalyticsV2 realOffersAnalyticsV22 = (RealOffersAnalyticsV2) ((Provider) rememberEventDispatcher.rememberSet).invoke();
                    RealOffersInflightStateManager realOffersInflightStateManager = (RealOffersInflightStateManager) ((DoubleCheck) rememberEventDispatcher.releasing).getValue();
                    SessionManager sessionManager = (SessionManager) ((LambdaProvider) rememberEventDispatcher.ignoreLeavingSet).lambda.invoke();
                    RealRouter$Factory$Impl realRouter$Factory$Impl2 = (RealRouter$Factory$Impl) ((Provider) rememberEventDispatcher.pausedPlaceholders).invoke();
                    IntentLauncher intentLauncher = (IntentLauncher) ((Provider) rememberEventDispatcher.nestedRemembersLists).invoke();
                    androidStringManager3.getClass();
                    realBoostRepository.getClass();
                    syncValueReader.getClass();
                    realProfileManager.getClass();
                    realFlowTokenGenerator.getClass();
                    featureFlagManager2.getClass();
                    realOffersAnalyticsV22.getClass();
                    realOffersInflightStateManager.getClass();
                    sessionManager.getClass();
                    realRouter$Factory$Impl2.getClass();
                    intentLauncher.getClass();
                    return MoleculePresenterKt.asPresenter$default(new CardLockPresenter(androidStringManager3, realBoostRepository, syncValueReader, realProfileManager, realFlowTokenGenerator, featureFlagManager2, realOffersAnalyticsV22, realOffersInflightStateManager, sessionManager, realRouter$Factory$Impl2, intentLauncher, (OffersScreen$OffersDetailsScreenV2) screen, screenNavigator));
                }
                if (screen instanceof OffersScreen$OffersHomeScreenV2) {
                    SetAddressPresenter$MetroFactory setAddressPresenter$MetroFactory = ((OffersHomePresenterV2$Factory$Impl) obj10).delegateFactory;
                    AndroidStringManager androidStringManager4 = (AndroidStringManager) setAddressPresenter$MetroFactory.stringManager.lambda.invoke();
                    RealBoostRepository realBoostRepository2 = (RealBoostRepository) setAddressPresenter$MetroFactory.analytics.getValue();
                    BoostSyncer boostSyncer = (BoostSyncer) setAddressPresenter$MetroFactory.service.getValue();
                    RealFlowTokenGenerator realFlowTokenGenerator2 = (RealFlowTokenGenerator) setAddressPresenter$MetroFactory.blockerFlowAnalytics.invoke();
                    FeatureFlagManager featureFlagManager3 = (FeatureFlagManager) setAddressPresenter$MetroFactory.franklinAppService.getValue();
                    RealOffersAnalyticsV2 realOffersAnalyticsV23 = (RealOffersAnalyticsV2) setAddressPresenter$MetroFactory.blockersNavigator.invoke();
                    RealOffersInflightStateManager realOffersInflightStateManager2 = (RealOffersInflightStateManager) setAddressPresenter$MetroFactory.appConfig.getValue();
                    LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) setAddressPresenter$MetroFactory.idvPresenterFactory.invoke();
                    RealRouter$Factory$Impl realRouter$Factory$Impl3 = (RealRouter$Factory$Impl) setAddressPresenter$MetroFactory.blockersHelperFactory.invoke();
                    androidStringManager4.getClass();
                    realBoostRepository2.getClass();
                    boostSyncer.getClass();
                    realFlowTokenGenerator2.getClass();
                    featureFlagManager3.getClass();
                    realOffersAnalyticsV23.getClass();
                    realOffersInflightStateManager2.getClass();
                    factory.getClass();
                    realRouter$Factory$Impl3.getClass();
                    return MoleculePresenterKt.asPresenter$default(new LocalHomePresenter(androidStringManager4, realBoostRepository2, boostSyncer, realFlowTokenGenerator2, featureFlagManager3, realOffersAnalyticsV23, realOffersInflightStateManager2, factory, realRouter$Factory$Impl3, screenNavigator));
                }
                if (screen instanceof OffersScreen$OffersHomeScreen) {
                    OffersHomePresenter.MetroFactory metroFactory2 = ((OffersHomePresenter$Factory$Impl) obj9).delegateFactory;
                    RealOffersTabRepository realOffersTabRepository = (RealOffersTabRepository) metroFactory2.offersTabRepository.getValue();
                    AndroidStringManager androidStringManager5 = (AndroidStringManager) metroFactory2.stringManager.lambda.invoke();
                    RealOffersAnalyticsHelper realOffersAnalyticsHelper = (RealOffersAnalyticsHelper) metroFactory2.analyticsHelper.getValue();
                    RealClientRouteParser realClientRouteParser = (RealClientRouteParser) ((DoubleCheck) metroFactory2.clientRouteParser).getValue();
                    RealBoostRepository realBoostRepository3 = (RealBoostRepository) ((DoubleCheck) metroFactory2.boostRepository).getValue();
                    AndroidClock androidClock = (AndroidClock) metroFactory2.clock.lambda.invoke();
                    RealOffersTabRefresher realOffersTabRefresher = (RealOffersTabRefresher) metroFactory2.offersTabRefresher.invoke();
                    IntentLauncher intentLauncher2 = (IntentLauncher) metroFactory2.launcher.invoke();
                    Flow flow = (Flow) ((DoubleCheck) metroFactory2.pendingAppMessages).getValue();
                    RealOffersPopupMessageDismisser realOffersPopupMessageDismisser = (RealOffersPopupMessageDismisser) ((DoubleCheck) metroFactory2.offersPopupMessageDismisser).getValue();
                    RealOffersSpanManager realOffersSpanManager = (RealOffersSpanManager) metroFactory2.spanManager.invoke();
                    RealClientSyncer realClientSyncer = (RealClientSyncer) metroFactory2.clientSyncer.invoke();
                    RealRouter$Factory$Impl realRouter$Factory$Impl4 = (RealRouter$Factory$Impl) metroFactory2.routerFactory.invoke();
                    RealOffersAnalytics$Factory$Impl realOffersAnalytics$Factory$Impl = (RealOffersAnalytics$Factory$Impl) metroFactory2.analyticsFactory.invoke();
                    RealOffersSearchPresenter$Factory$Impl realOffersSearchPresenter$Factory$Impl = (RealOffersSearchPresenter$Factory$Impl) ((InstanceFactory) metroFactory2.offersSearchPresenterFactory).value;
                    realOffersTabRepository.getClass();
                    androidStringManager5.getClass();
                    realOffersAnalyticsHelper.getClass();
                    realClientRouteParser.getClass();
                    realBoostRepository3.getClass();
                    androidClock.getClass();
                    realOffersTabRefresher.getClass();
                    intentLauncher2.getClass();
                    flow.getClass();
                    realOffersPopupMessageDismisser.getClass();
                    realOffersSpanManager.getClass();
                    realClientSyncer.getClass();
                    realRouter$Factory$Impl4.getClass();
                    realOffersAnalytics$Factory$Impl.getClass();
                    realOffersSearchPresenter$Factory$Impl.getClass();
                    return MoleculePresenterKt.asPresenter$default(new OffersHomePresenter((OffersScreen$OffersHomeScreen) screen, screenNavigator, realOffersTabRepository, androidStringManager5, realOffersAnalyticsHelper, realClientRouteParser, realBoostRepository3, androidClock, realOffersTabRefresher, intentLauncher2, flow, realOffersPopupMessageDismisser, realOffersSpanManager, realClientSyncer, realRouter$Factory$Impl4, realOffersAnalytics$Factory$Impl, realOffersSearchPresenter$Factory$Impl));
                }
                if (screen instanceof OffersScreen$OffersFilterGroupSheetScreen) {
                    CheckDepositAmountPresenter.MetroFactory metroFactory3 = ((OffersFilterGroupSheetPresenter$Factory$Impl) obj7).delegateFactory;
                    RealOffersTabRepository realOffersTabRepository2 = (RealOffersTabRepository) metroFactory3.analytics.getValue();
                    RealOffersAnalytics$Factory$Impl realOffersAnalytics$Factory$Impl2 = (RealOffersAnalytics$Factory$Impl) metroFactory3.blockerFlowAnalytics.invoke();
                    realOffersTabRepository2.getClass();
                    realOffersAnalytics$Factory$Impl2.getClass();
                    return MoleculePresenterKt.asPresenter$default(new TaxReturnsPresenter((OffersScreen$OffersFilterGroupSheetScreen) screen, screenNavigator, realOffersTabRepository2, realOffersAnalytics$Factory$Impl2));
                }
                if (screen instanceof OffersScreen$OffersFullscreenCollectionScreen) {
                    DeviceBuildInfo deviceBuildInfo = ((OffersFullscreenCollectionPresenter$Factory$Impl) obj6).delegateFactory;
                    RealOffersTabRepository realOffersTabRepository3 = (RealOffersTabRepository) ((DoubleCheck) deviceBuildInfo.manufacturer).getValue();
                    RealBoostRepository realBoostRepository4 = (RealBoostRepository) ((DoubleCheck) deviceBuildInfo.model).getValue();
                    RealOffersAnalyticsHelper realOffersAnalyticsHelper2 = (RealOffersAnalyticsHelper) ((DoubleCheck) deviceBuildInfo.osVersion).getValue();
                    AndroidStringManager androidStringManager6 = (AndroidStringManager) ((LambdaProvider) deviceBuildInfo.osBuild).lambda.invoke();
                    RealOffersTabRefresher realOffersTabRefresher2 = (RealOffersTabRefresher) ((Provider) deviceBuildInfo.fingerprint).invoke();
                    ToolbarTuckTargets toolbarTuckTargets = (ToolbarTuckTargets) ((RealLocaleAssetProvider$MetroFactory) deviceBuildInfo.tags).invoke();
                    AndroidClock androidClock2 = (AndroidClock) ((LambdaProvider) deviceBuildInfo.brand).lambda.invoke();
                    RealRouter$Factory$Impl realRouter$Factory$Impl5 = (RealRouter$Factory$Impl) ((Provider) deviceBuildInfo.apiLevel).invoke();
                    RealOffersAnalytics$Factory$Impl realOffersAnalytics$Factory$Impl3 = (RealOffersAnalytics$Factory$Impl) ((Provider) deviceBuildInfo.cpuAbis).invoke();
                    realOffersTabRepository3.getClass();
                    realBoostRepository4.getClass();
                    realOffersAnalyticsHelper2.getClass();
                    androidStringManager6.getClass();
                    realOffersTabRefresher2.getClass();
                    androidClock2.getClass();
                    realRouter$Factory$Impl5.getClass();
                    realOffersAnalytics$Factory$Impl3.getClass();
                    return MoleculePresenterKt.asPresenter$default(new LocalCashBalancePresenter((OffersScreen$OffersFullscreenCollectionScreen) screen, screenNavigator, realOffersTabRepository3, realBoostRepository4, realOffersAnalyticsHelper2, androidStringManager6, realOffersTabRefresher2, toolbarTuckTargets, androidClock2, realRouter$Factory$Impl5, realOffersAnalytics$Factory$Impl3));
                }
                if (screen instanceof OffersScreen$OffersDetailsScreen) {
                    OffersHomePresenter.MetroFactory metroFactory4 = ((OffersDetailsPresenter$Factory$Impl) obj5).delegateFactory;
                    AssetPublicSuffixList assetPublicSuffixList = (AssetPublicSuffixList) ((NavigationSideEffects.MetroFactory) metroFactory4.pendingAppMessages).invoke();
                    AndroidStringManager androidStringManager7 = (AndroidStringManager) metroFactory4.stringManager.lambda.invoke();
                    RealBoostRepository realBoostRepository5 = (RealBoostRepository) metroFactory4.offersTabRepository.getValue();
                    RealOffersAnalyticsHelper realOffersAnalyticsHelper3 = (RealOffersAnalyticsHelper) metroFactory4.analyticsHelper.getValue();
                    RealUuidGenerator realUuidGenerator = (RealUuidGenerator) metroFactory4.clock.lambda.invoke();
                    RealClientRouteParser realClientRouteParser2 = (RealClientRouteParser) ((DoubleCheck) metroFactory4.clientRouteParser).getValue();
                    RealFlowTokenGenerator realFlowTokenGenerator3 = (RealFlowTokenGenerator) metroFactory4.offersTabRefresher.invoke();
                    RealOffersSheetRepository realOffersSheetRepository = (RealOffersSheetRepository) metroFactory4.launcher.invoke();
                    CoroutineContext coroutineContext = (CoroutineContext) ((LambdaProvider) metroFactory4.offersPopupMessageDismisser).lambda.invoke();
                    RealObservabilityManager realObservabilityManager = (RealObservabilityManager) ((LambdaProvider) metroFactory4.analyticsFactory).lambda.invoke();
                    RealOffersSpanManager realOffersSpanManager2 = (RealOffersSpanManager) metroFactory4.spanManager.invoke();
                    AndroidClock androidClock3 = (AndroidClock) ((LambdaProvider) metroFactory4.offersSearchPresenterFactory).lambda.invoke();
                    FlowStarter flowStarter = (FlowStarter) ((DoubleCheck) metroFactory4.boostRepository).getValue();
                    RealRouter$Factory$Impl realRouter$Factory$Impl6 = (RealRouter$Factory$Impl) metroFactory4.clientSyncer.invoke();
                    RealOffersAnalytics$Factory$Impl realOffersAnalytics$Factory$Impl4 = (RealOffersAnalytics$Factory$Impl) metroFactory4.routerFactory.invoke();
                    androidStringManager7.getClass();
                    realBoostRepository5.getClass();
                    realOffersAnalyticsHelper3.getClass();
                    realUuidGenerator.getClass();
                    realClientRouteParser2.getClass();
                    realFlowTokenGenerator3.getClass();
                    realOffersSheetRepository.getClass();
                    coroutineContext.getClass();
                    realObservabilityManager.getClass();
                    realOffersSpanManager2.getClass();
                    androidClock3.getClass();
                    flowStarter.getClass();
                    realRouter$Factory$Impl6.getClass();
                    realOffersAnalytics$Factory$Impl4.getClass();
                    return MoleculePresenterKt.asPresenter$default(new OffersDetailsPresenter((OffersScreen$OffersDetailsScreen) screen, screenNavigator, assetPublicSuffixList, androidStringManager7, realBoostRepository5, realOffersAnalyticsHelper3, realUuidGenerator, realClientRouteParser2, realFlowTokenGenerator3, realOffersSheetRepository, coroutineContext, realObservabilityManager, realOffersSpanManager2, androidClock3, flowStarter, realRouter$Factory$Impl6, realOffersAnalytics$Factory$Impl4));
                }
                if (!(screen instanceof OffersScreen$OffersTimelineScreen)) {
                    if (!(screen instanceof OffersScreen$OffersRedemptionScreen)) {
                        if (screen instanceof OffersScreen$OffersNotificationScreen) {
                            return MoleculePresenterKt.asPresenter$default(new VerifyCheckDialogPresenter(screenNavigator, (OffersScreen$OffersNotificationScreen) screen));
                        }
                        return null;
                    }
                    StampSheetPresenter$MetroFactory stampSheetPresenter$MetroFactory = ((OffersRedemptionPresenter$Factory$Impl) obj8).delegateFactory;
                    AndroidStringManager androidStringManager8 = (AndroidStringManager) stampSheetPresenter$MetroFactory.ioContext.lambda.invoke();
                    Analytics analytics2 = (Analytics) stampSheetPresenter$MetroFactory.appConfig.getValue();
                    androidStringManager8.getClass();
                    analytics2.getClass();
                    return MoleculePresenterKt.asPresenter$default(new TaxReturnsPresenter(androidStringManager8, analytics2, (OffersScreen$OffersRedemptionScreen) screen, screenNavigator));
                }
                OffersTimelinePresenter$MetroFactory offersTimelinePresenter$MetroFactory = ((OffersTimelinePresenter$Factory$Impl) obj3).delegateFactory;
                RealOffersSheetRepository realOffersSheetRepository2 = (RealOffersSheetRepository) offersTimelinePresenter$MetroFactory.offersSheetRepository.invoke();
                RealOffersAnalyticsHelper realOffersAnalyticsHelper4 = (RealOffersAnalyticsHelper) offersTimelinePresenter$MetroFactory.analyticsHelper.getValue();
                AndroidStringManager androidStringManager9 = (AndroidStringManager) offersTimelinePresenter$MetroFactory.stringManager.lambda.invoke();
                RealFlowTokenGenerator realFlowTokenGenerator4 = (RealFlowTokenGenerator) offersTimelinePresenter$MetroFactory.flowTokenGenerator.invoke();
                RealObservabilityManager realObservabilityManager2 = (RealObservabilityManager) offersTimelinePresenter$MetroFactory.observabilityManager.lambda.invoke();
                RealOffersSpanManager realOffersSpanManager3 = (RealOffersSpanManager) offersTimelinePresenter$MetroFactory.spanManager.invoke();
                AndroidClock androidClock4 = (AndroidClock) offersTimelinePresenter$MetroFactory.clock.lambda.invoke();
                FlowStarter flowStarter2 = (FlowStarter) offersTimelinePresenter$MetroFactory.flowStarter.getValue();
                RealUuidGenerator realUuidGenerator2 = (RealUuidGenerator) offersTimelinePresenter$MetroFactory.uuidGenerator.lambda.invoke();
                RealRouter$Factory$Impl realRouter$Factory$Impl7 = (RealRouter$Factory$Impl) offersTimelinePresenter$MetroFactory.routerFactory.invoke();
                RealOffersAnalytics$Factory$Impl realOffersAnalytics$Factory$Impl5 = (RealOffersAnalytics$Factory$Impl) offersTimelinePresenter$MetroFactory.analyticsFactory.invoke();
                realOffersSheetRepository2.getClass();
                realOffersAnalyticsHelper4.getClass();
                androidStringManager9.getClass();
                realFlowTokenGenerator4.getClass();
                realObservabilityManager2.getClass();
                realOffersSpanManager3.getClass();
                androidClock4.getClass();
                flowStarter2.getClass();
                realUuidGenerator2.getClass();
                realRouter$Factory$Impl7.getClass();
                realOffersAnalytics$Factory$Impl5.getClass();
                return MoleculePresenterKt.asPresenter$default(new PoolsListPresenter((OffersScreen$OffersTimelineScreen) screen, screenNavigator, realOffersSheetRepository2, realOffersAnalyticsHelper4, androidStringManager9, realFlowTokenGenerator4, realObservabilityManager2, realOffersSpanManager3, androidClock4, flowStarter2, realUuidGenerator2, realRouter$Factory$Impl7, realOffersAnalytics$Factory$Impl5));
            case 1:
                screen.getClass();
                if (screen instanceof ConfirmCashOutScreen) {
                    HelpSheetPresenter$MetroFactory helpSheetPresenter$MetroFactory = ((ConfirmCashOutPresenter$Factory$Impl) obj10).delegateFactory;
                    Analytics analytics3 = (Analytics) helpSheetPresenter$MetroFactory.syncValueReader.getValue();
                    RealConfirmCashOutVersionCodeProvider realConfirmCashOutVersionCodeProvider = (RealConfirmCashOutVersionCodeProvider) helpSheetPresenter$MetroFactory.routerFactory.invoke();
                    AndroidStringManager androidStringManager10 = (AndroidStringManager) helpSheetPresenter$MetroFactory.errorReporter.lambda.invoke();
                    LocalizedMoneyFormatter.Factory factory2 = (LocalizedMoneyFormatter.Factory) helpSheetPresenter$MetroFactory.oneErrorPerAppSessionStrategy.invoke();
                    analytics3.getClass();
                    realConfirmCashOutVersionCodeProvider.getClass();
                    androidStringManager10.getClass();
                    factory2.getClass();
                    return MoleculePresenterKt.asPresenter$default(new CardStudioPresenter((ConfirmCashOutScreen) screen, screenNavigator, analytics3, realConfirmCashOutVersionCodeProvider, androidStringManager10, factory2));
                }
                if (screen instanceof RecurringDepositsScreen) {
                    NodeChain nodeChain = ((RecurringDepositsPresenter$Factory$Impl) obj9).delegateFactory;
                    LocalizedMoneyFormatter.Factory factory3 = (LocalizedMoneyFormatter.Factory) ((Provider) nodeChain.layoutNode).invoke();
                    n nVar = (n) ((RealActivityAnalyticsService.MetroFactory) nodeChain.sentinelHead).invoke();
                    RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl = (RealBlockersHelper$Factory$Impl) ((Provider) nodeChain.innerCoordinator).invoke();
                    RealBankingOutboundNavigator$Factory$Impl realBankingOutboundNavigator$Factory$Impl = (RealBankingOutboundNavigator$Factory$Impl) ((Provider) nodeChain.outerCoordinator).invoke();
                    RealBalanceBasedAddCashManager realBalanceBasedAddCashManager = (RealBalanceBasedAddCashManager) ((Provider) nodeChain.tail).invoke();
                    RealInstrumentManager realInstrumentManager = (RealInstrumentManager) ((Provider) nodeChain.head).invoke();
                    RealClientSyncer realClientSyncer2 = (RealClientSyncer) ((Provider) nodeChain.current).invoke();
                    AndroidStringManager androidStringManager11 = (AndroidStringManager) ((LambdaProvider) nodeChain.buffer).lambda.invoke();
                    Analytics analytics4 = (Analytics) ((DoubleCheck) nodeChain.stack).getValue();
                    RealRouter$Factory$Impl realRouter$Factory$Impl8 = (RealRouter$Factory$Impl) ((Provider) nodeChain.cachedDiffer).invoke();
                    factory3.getClass();
                    realBlockersHelper$Factory$Impl.getClass();
                    realBankingOutboundNavigator$Factory$Impl.getClass();
                    realBalanceBasedAddCashManager.getClass();
                    realInstrumentManager.getClass();
                    realClientSyncer2.getClass();
                    androidStringManager11.getClass();
                    analytics4.getClass();
                    realRouter$Factory$Impl8.getClass();
                    return MoleculePresenterKt.asPresenter$default(new CardLockPresenter(factory3, nVar, realBlockersHelper$Factory$Impl, realBankingOutboundNavigator$Factory$Impl, realBalanceBasedAddCashManager, realInstrumentManager, realClientSyncer2, androidStringManager11, analytics4, realRouter$Factory$Impl8, (RecurringDepositsScreen) screen, screenNavigator));
                }
                if (screen instanceof RecurringDepositsFirstTimeUserScreen) {
                    SsnPresenter.MetroFactory metroFactory5 = ((RecurringDepositsFirstTimeUserPresenter$Factory$Impl) obj7).delegateFactory;
                    AndroidStringManager androidStringManager12 = (AndroidStringManager) metroFactory5.stringManager.lambda.invoke();
                    RealMoneyInboundNavigator$Factory$Impl realMoneyInboundNavigator$Factory$Impl = (RealMoneyInboundNavigator$Factory$Impl) metroFactory5.idvPresenterFactory.invoke();
                    KeyValue keyValue = (KeyValue) metroFactory5.blockersHelperFactory.invoke();
                    androidStringManager12.getClass();
                    realMoneyInboundNavigator$Factory$Impl.getClass();
                    keyValue.getClass();
                    return MoleculePresenterKt.asPresenter$default(new LocalPosCheckInPresenter(androidStringManager12, realMoneyInboundNavigator$Factory$Impl, keyValue, (RecurringDepositsFirstTimeUserScreen) screen, screenNavigator));
                }
                if (screen instanceof DemandDepositDialogScreen) {
                    return MoleculePresenterKt.asPresenter$default(new ErrorPresenter((DemandDepositDialogScreen) screen, screenNavigator));
                }
                if (screen instanceof TransfersScreen) {
                    NodeChain nodeChain2 = ((TransfersPresenter$Factory$Impl) obj5).delegateFactory;
                    AndroidStringManager androidStringManager13 = (AndroidStringManager) ((LambdaProvider) nodeChain2.layoutNode).lambda.invoke();
                    RealClipboardManager realClipboardManager = (RealClipboardManager) ((LambdaProvider) nodeChain2.sentinelHead).lambda.invoke();
                    DemandDepositAccountFormatter demandDepositAccountFormatter = (DemandDepositAccountFormatter) ((Provider) nodeChain2.innerCoordinator).invoke();
                    SyncValueReader syncValueReader2 = (SyncValueReader) ((DoubleCheck) nodeChain2.outerCoordinator).getValue();
                    RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl2 = (RealBlockersHelper$Factory$Impl) ((Provider) nodeChain2.tail).invoke();
                    IssuedCardManager issuedCardManager = (IssuedCardManager) ((DoubleCheck) nodeChain2.head).getValue();
                    FeatureFlagManager featureFlagManager4 = (FeatureFlagManager) ((DoubleCheck) nodeChain2.current).getValue();
                    Analytics analytics5 = (Analytics) ((DoubleCheck) nodeChain2.buffer).getValue();
                    RealDemandDepositAccountManager realDemandDepositAccountManager = (RealDemandDepositAccountManager) ((DoubleCheck) nodeChain2.stack).getValue();
                    RealRouter$Factory$Impl realRouter$Factory$Impl9 = (RealRouter$Factory$Impl) ((Provider) nodeChain2.cachedDiffer).invoke();
                    androidStringManager13.getClass();
                    realClipboardManager.getClass();
                    demandDepositAccountFormatter.getClass();
                    syncValueReader2.getClass();
                    realBlockersHelper$Factory$Impl2.getClass();
                    issuedCardManager.getClass();
                    featureFlagManager4.getClass();
                    analytics5.getClass();
                    realDemandDepositAccountManager.getClass();
                    realRouter$Factory$Impl9.getClass();
                    return MoleculePresenterKt.asPresenter$default(new TransfersPresenter(androidStringManager13, realClipboardManager, demandDepositAccountFormatter, syncValueReader2, realBlockersHelper$Factory$Impl2, issuedCardManager, featureFlagManager4, analytics5, realDemandDepositAccountManager, realRouter$Factory$Impl9, (TransfersScreen) screen, screenNavigator));
                }
                if (screen instanceof BankingDialogScreen) {
                    RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl3 = (RealBlockersHelper$Factory$Impl) ((BankingDialogPresenter$Factory$Impl) obj6).delegateFactory.staticImageLoader.invoke();
                    realBlockersHelper$Factory$Impl3.getClass();
                    return MoleculePresenterKt.asPresenter$default(new EndAppLockPresenter(realBlockersHelper$Factory$Impl3, (BankingDialogScreen) screen, screenNavigator));
                }
                if (screen instanceof BalanceHomeScreen) {
                    BalanceHomePresenter.MetroFactory metroFactory6 = ((BalanceHomePresenter$Factory$Impl) obj4).delegateFactory;
                    DemandDepositAccountFormatter demandDepositAccountFormatter2 = (DemandDepositAccountFormatter) metroFactory6.accountFormatter.invoke();
                    AndroidStringManager androidStringManager14 = (AndroidStringManager) metroFactory6.stringManager.invoke();
                    RealBankingOutboundNavigator$Factory$Impl realBankingOutboundNavigator$Factory$Impl2 = (RealBankingOutboundNavigator$Factory$Impl) metroFactory6.bankingOutboundNavigatorFactory.invoke();
                    SyncValueReader syncValueReader3 = (SyncValueReader) metroFactory6.syncValueReader.invoke();
                    RealClipboardManager realClipboardManager2 = (RealClipboardManager) metroFactory6.clipboardManager.invoke();
                    RealDemandDepositAccountManager realDemandDepositAccountManager2 = (RealDemandDepositAccountManager) metroFactory6.demandDepositAccountManager.invoke();
                    RealBalanceSnapshotManager realBalanceSnapshotManager = (RealBalanceSnapshotManager) metroFactory6.balanceSnapshotManager.invoke();
                    RealRestrictedBalanceStore realRestrictedBalanceStore = (RealRestrictedBalanceStore) metroFactory6.restrictedBalanceStore.invoke();
                    CryptoFlowStarter cryptoFlowStarter = (CryptoFlowStarter) metroFactory6.cryptoFlowStarter.invoke();
                    BankingSectionsPresenter$Factory$Impl bankingSectionsPresenter$Factory$Impl = (BankingSectionsPresenter$Factory$Impl) metroFactory6.bankingSectionsPresenterFactory.value;
                    RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl4 = (RealBlockersHelper$Factory$Impl) metroFactory6.blockersHelperFactory.invoke();
                    UnicornService unicornService = (UnicornService) metroFactory6.unicornAppService.invoke();
                    RealDisclosureProvider realDisclosureProvider = (RealDisclosureProvider) metroFactory6.disclosureProvider.invoke();
                    FeatureFlagManager featureFlagManager5 = (FeatureFlagManager) metroFactory6.featureFlagManager.invoke();
                    LocalizedMoneyFormatter.Factory factory4 = (LocalizedMoneyFormatter.Factory) metroFactory6.moneyFormatterFactory.invoke();
                    RealRouter$Factory$Impl realRouter$Factory$Impl10 = (RealRouter$Factory$Impl) metroFactory6.routerFactory.invoke();
                    Analytics analytics6 = (Analytics) metroFactory6.analytics.invoke();
                    RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl = (RealActivityEmbeddedPresenter$Factory$Impl) metroFactory6.activityEmbeddedPresenterFactory.invoke();
                    RealActivityTokenFactory realActivityTokenFactory = (RealActivityTokenFactory) metroFactory6.activityTokenFactory.invoke();
                    RealActivitiesCacheManager realActivitiesCacheManager = (RealActivitiesCacheManager) metroFactory6.activitiesCacheManager.invoke();
                    demandDepositAccountFormatter2.getClass();
                    androidStringManager14.getClass();
                    realBankingOutboundNavigator$Factory$Impl2.getClass();
                    syncValueReader3.getClass();
                    realClipboardManager2.getClass();
                    realDemandDepositAccountManager2.getClass();
                    realBalanceSnapshotManager.getClass();
                    realRestrictedBalanceStore.getClass();
                    cryptoFlowStarter.getClass();
                    bankingSectionsPresenter$Factory$Impl.getClass();
                    realBlockersHelper$Factory$Impl4.getClass();
                    unicornService.getClass();
                    realDisclosureProvider.getClass();
                    featureFlagManager5.getClass();
                    factory4.getClass();
                    realRouter$Factory$Impl10.getClass();
                    analytics6.getClass();
                    realActivityEmbeddedPresenter$Factory$Impl.getClass();
                    realActivityTokenFactory.getClass();
                    realActivitiesCacheManager.getClass();
                    return MoleculePresenterKt.asPresenter$default(new BalanceHomePresenter(demandDepositAccountFormatter2, androidStringManager14, realBankingOutboundNavigator$Factory$Impl2, syncValueReader3, realClipboardManager2, realDemandDepositAccountManager2, realBalanceSnapshotManager, realRestrictedBalanceStore, cryptoFlowStarter, bankingSectionsPresenter$Factory$Impl, realBlockersHelper$Factory$Impl4, unicornService, realDisclosureProvider, featureFlagManager5, factory4, realRouter$Factory$Impl10, (BalanceHomeScreen) screen, screenNavigator, analytics6, realActivityEmbeddedPresenter$Factory$Impl, realActivityTokenFactory, realActivitiesCacheManager));
                }
                if (!(screen instanceof OverdraftCoverageSheetScreen)) {
                    if (!(screen instanceof BenefitsLeafletSheetScreen)) {
                        return null;
                    }
                    ProfileUpsellPresenter.MetroFactory metroFactory7 = ((BenefitsLeafletPresenter$Factory$Impl) obj8).delegateFactory;
                    RealRouter$Factory$Impl realRouter$Factory$Impl11 = (RealRouter$Factory$Impl) metroFactory7.routerFactory.invoke();
                    BankingBenefitsAppService bankingBenefitsAppService = (BankingBenefitsAppService) metroFactory7.analytics.getValue();
                    Analytics analytics7 = (Analytics) metroFactory7.syncValueReader.getValue();
                    realRouter$Factory$Impl11.getClass();
                    bankingBenefitsAppService.getClass();
                    analytics7.getClass();
                    return MoleculePresenterKt.asPresenter$default(new LocalPosCheckInPresenter(realRouter$Factory$Impl11, bankingBenefitsAppService, analytics7, (BenefitsLeafletSheetScreen) screen, screenNavigator));
                }
                if (!((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) obj)).peekCurrentValue(AmplitudeExperiments$MobileBankingEvergreenOverdraft.INSTANCE)).enabled()) {
                    ThemeSwitcherPresenter$MetroFactory themeSwitcherPresenter$MetroFactory = ((OverdraftCoveragePresenter$Factory$Impl) obj3).delegateFactory;
                    SyncValueReader syncValueReader4 = (SyncValueReader) themeSwitcherPresenter$MetroFactory.analytics.getValue();
                    OverdraftlyService overdraftlyService = (OverdraftlyService) themeSwitcherPresenter$MetroFactory.postcardService.getValue();
                    Analytics analytics8 = (Analytics) themeSwitcherPresenter$MetroFactory.featureFlagManager.getValue();
                    AndroidStringManager androidStringManager15 = (AndroidStringManager) themeSwitcherPresenter$MetroFactory.stringManager.lambda.invoke();
                    LocalizedMoneyFormatter.Factory factory5 = (LocalizedMoneyFormatter.Factory) themeSwitcherPresenter$MetroFactory.paymentPadThemeSelection.invoke();
                    RealRouter$Factory$Impl realRouter$Factory$Impl12 = (RealRouter$Factory$Impl) themeSwitcherPresenter$MetroFactory.routerFactory.invoke();
                    syncValueReader4.getClass();
                    overdraftlyService.getClass();
                    analytics8.getClass();
                    androidStringManager15.getClass();
                    factory5.getClass();
                    realRouter$Factory$Impl12.getClass();
                    return MoleculePresenterKt.asPresenter$default(new LocalHomePresenter(syncValueReader4, overdraftlyService, analytics8, androidStringManager15, factory5, realRouter$Factory$Impl12, (OverdraftCoverageSheetScreen) screen, screenNavigator));
                }
                PlaidLinkPresenter.MetroFactory metroFactory8 = ((BetterOverdraftPresenter$Factory$Impl) obj2).delegateFactory;
                RealRouter$Factory$Impl realRouter$Factory$Impl13 = (RealRouter$Factory$Impl) metroFactory8.blockersDataNavigator.invoke();
                LocalizedMoneyFormatter.Factory factory6 = (LocalizedMoneyFormatter.Factory) metroFactory8.blockerFlowAnalytics.invoke();
                OverdraftlyService overdraftlyService2 = (OverdraftlyService) metroFactory8.appService.getValue();
                SyncValueReader syncValueReader5 = (SyncValueReader) metroFactory8.analytics.getValue();
                AndroidStringManager androidStringManager16 = (AndroidStringManager) metroFactory8.stringManager.lambda.invoke();
                ErrorReporter errorReporter = (ErrorReporter) metroFactory8.moshi.lambda.invoke();
                Analytics analytics9 = (Analytics) metroFactory8.signOutSignal.getValue();
                realRouter$Factory$Impl13.getClass();
                factory6.getClass();
                overdraftlyService2.getClass();
                syncValueReader5.getClass();
                androidStringManager16.getClass();
                errorReporter.getClass();
                analytics9.getClass();
                return MoleculePresenterKt.asPresenter$default(new LocalHomePresenter(realRouter$Factory$Impl13, factory6, overdraftlyService2, syncValueReader5, androidStringManager16, errorReporter, analytics9, (OverdraftCoverageSheetScreen) screen, screenNavigator));
            default:
                screen.getClass();
                MoneybotScreen moneybotScreen = screen instanceof MoneybotScreen ? (MoneybotScreen) screen : null;
                if (moneybotScreen instanceof MoneybotChatScreen) {
                    MoneybotChatScreen moneybotChatScreen = (MoneybotChatScreen) moneybotScreen;
                    PaymentActionHandler.MetroFactory metroFactory9 = ((MoneybotChatPresenter$Factory$Impl) obj10).delegateFactory;
                    ErrorReporter errorReporter2 = (ErrorReporter) metroFactory9.intentFactory.invoke();
                    SampleStrategy sampleStrategy = (SampleStrategy) metroFactory9.activityEntityManager.invoke();
                    RealRouter$Factory$Impl realRouter$Factory$Impl14 = (RealRouter$Factory$Impl) metroFactory9.paymentManager.invoke();
                    ChatManager chatManager = (ChatManager) metroFactory9.flowStarter.invoke();
                    CashKgooseService cashKgooseService = (CashKgooseService) metroFactory9.stringManager.invoke();
                    RealMoneybotPreambleManager realMoneybotPreambleManager = (RealMoneybotPreambleManager) metroFactory9.balanceSnapshotManager.invoke();
                    AndroidStringManager androidStringManager17 = (AndroidStringManager) metroFactory9.instrumentManager.invoke();
                    AndroidClock androidClock5 = (AndroidClock) metroFactory9.appConfig.invoke();
                    FeatureFlagManager featureFlagManager6 = (FeatureFlagManager) metroFactory9.clientSyncer.invoke();
                    RealMoneybotAnalyticsService realMoneybotAnalyticsService = (RealMoneybotAnalyticsService) metroFactory9.profileSyncer.invoke();
                    AppForegroundStateProvider appForegroundStateProvider = (AppForegroundStateProvider) metroFactory9.appService.invoke();
                    MoneybotFlagsHelper moneybotFlagsHelper = (MoneybotFlagsHelper) metroFactory9.cryptoService.invoke();
                    RealMoneybotDisclosureManager realMoneybotDisclosureManager = (RealMoneybotDisclosureManager) ((MLKitTitleGenerator$MetroFactory) metroFactory9.customerStore).invoke();
                    RealMoneybotWidgetManager realMoneybotWidgetManager = (RealMoneybotWidgetManager) metroFactory9.tradingService.invoke();
                    RealMoneybotPromptManager realMoneybotPromptManager = (RealMoneybotPromptManager) metroFactory9.investingService.invoke();
                    RealMoneybotChatMessagesCache realMoneybotChatMessagesCache = (RealMoneybotChatMessagesCache) metroFactory9.lendingAppService.invoke();
                    RealAndroidFileParser realAndroidFileParser = (RealAndroidFileParser) metroFactory9.cashDatabase.invoke();
                    EglCore eglCore = (EglCore) ((RealMerchantProfileRepo$MetroFactory) metroFactory9.analytics).invoke();
                    MoneybotDebugSettingsManager moneybotDebugSettingsManager = (MoneybotDebugSettingsManager) metroFactory9.clientRouteParser.invoke();
                    MoneybotChatContentFactory$Factory$Impl moneybotChatContentFactory$Factory$Impl = (MoneybotChatContentFactory$Factory$Impl) ((InstanceFactory) metroFactory9.scope).value;
                    Storage storage = (Storage) metroFactory9.ioDispatcher.invoke();
                    ClientRenderablePluginRegistry clientRenderablePluginRegistry = (ClientRenderablePluginRegistry) metroFactory9.attributionEventEmitter.invoke();
                    RealChatSessionManager$Factory$Impl realChatSessionManager$Factory$Impl = (RealChatSessionManager$Factory$Impl) ((InstanceFactory) metroFactory9.uuidGenerator).value;
                    CoroutineScope coroutineScope = (CoroutineScope) ((InstanceFactory) metroFactory9.paymentActionCompletionDispatcher).value;
                    CoroutineContext coroutineContext2 = (CoroutineContext) metroFactory9.supportNavigator.invoke();
                    errorReporter2.getClass();
                    sampleStrategy.getClass();
                    realRouter$Factory$Impl14.getClass();
                    chatManager.getClass();
                    cashKgooseService.getClass();
                    realMoneybotPreambleManager.getClass();
                    androidStringManager17.getClass();
                    androidClock5.getClass();
                    featureFlagManager6.getClass();
                    realMoneybotAnalyticsService.getClass();
                    appForegroundStateProvider.getClass();
                    moneybotFlagsHelper.getClass();
                    realMoneybotWidgetManager.getClass();
                    realMoneybotPromptManager.getClass();
                    realMoneybotChatMessagesCache.getClass();
                    realAndroidFileParser.getClass();
                    moneybotDebugSettingsManager.getClass();
                    moneybotChatContentFactory$Factory$Impl.getClass();
                    storage.getClass();
                    clientRenderablePluginRegistry.getClass();
                    realChatSessionManager$Factory$Impl.getClass();
                    coroutineScope.getClass();
                    coroutineContext2.getClass();
                    return MoleculePresenterKt.asPresenter$default(new MoneybotChatPresenter(errorReporter2, sampleStrategy, realRouter$Factory$Impl14, chatManager, cashKgooseService, realMoneybotPreambleManager, androidStringManager17, androidClock5, featureFlagManager6, realMoneybotAnalyticsService, appForegroundStateProvider, moneybotFlagsHelper, realMoneybotDisclosureManager, realMoneybotWidgetManager, realMoneybotPromptManager, realMoneybotChatMessagesCache, realAndroidFileParser, eglCore, moneybotDebugSettingsManager, moneybotChatContentFactory$Factory$Impl, storage, clientRenderablePluginRegistry, realChatSessionManager$Factory$Impl, coroutineScope, coroutineContext2, moneybotChatScreen, screenNavigator));
                }
                if (moneybotScreen instanceof MoneybotChatHistoryScreen) {
                    MoneybotChatHistoryPresenter$MetroFactory moneybotChatHistoryPresenter$MetroFactory = ((MoneybotChatHistoryPresenter$Factory$Impl) obj9).delegateFactory;
                    ChatManager chatManager2 = (ChatManager) moneybotChatHistoryPresenter$MetroFactory.chatManager.invoke();
                    RealUserSessionPager realUserSessionPager = (RealUserSessionPager) moneybotChatHistoryPresenter$MetroFactory.userSessionPager.invoke();
                    RealTodayDateTimeFormatter realTodayDateTimeFormatter = (RealTodayDateTimeFormatter) moneybotChatHistoryPresenter$MetroFactory.todayDateTimeFormatter.getValue();
                    RealMoneybotChatMessagesCache realMoneybotChatMessagesCache2 = (RealMoneybotChatMessagesCache) moneybotChatHistoryPresenter$MetroFactory.chatMessagesCache.getValue();
                    chatManager2.getClass();
                    realUserSessionPager.getClass();
                    realTodayDateTimeFormatter.getClass();
                    realMoneybotChatMessagesCache2.getClass();
                    return MoleculePresenterKt.asPresenter$default(new LocalEditorialPresenter(chatManager2, realUserSessionPager, realTodayDateTimeFormatter, realMoneybotChatMessagesCache2, screenNavigator));
                }
                if (moneybotScreen instanceof MoneybotFeedbackScreen) {
                    TaxTooltipPresenter$MetroFactory taxTooltipPresenter$MetroFactory = ((MoneybotFeedbackPresenter$Factory$Impl) obj8).delegateFactory;
                    AndroidStringManager androidStringManager18 = (AndroidStringManager) taxTooltipPresenter$MetroFactory.stringManager.lambda.invoke();
                    RealRouter$Factory$Impl realRouter$Factory$Impl15 = (RealRouter$Factory$Impl) taxTooltipPresenter$MetroFactory.taxDesktopTooltipPreference.invoke();
                    androidStringManager18.getClass();
                    realRouter$Factory$Impl15.getClass();
                    return MoleculePresenterKt.asPresenter$default(new MusicPresenter(androidStringManager18, realRouter$Factory$Impl15, (MoneybotFeedbackScreen) moneybotScreen, screenNavigator));
                }
                if (moneybotScreen instanceof RawMessagesScreen) {
                    TaxTooltipPresenter$MetroFactory taxTooltipPresenter$MetroFactory2 = ((RawMessagesPresenter$Factory$Impl) obj7).delegateFactory;
                    ChatManager chatManager3 = (ChatManager) taxTooltipPresenter$MetroFactory2.taxDesktopTooltipPreference.invoke();
                    Moshi moshi = (Moshi) taxTooltipPresenter$MetroFactory2.stringManager.lambda.invoke();
                    chatManager3.getClass();
                    moshi.getClass();
                    return MoleculePresenterKt.asPresenter$default(new WorkHomePresenter(chatManager3, moshi, (RawMessagesScreen) moneybotScreen, screenNavigator));
                }
                if (Intrinsics.areEqual(moneybotScreen, MoneybotPreambleEditorScreen.INSTANCE)) {
                    LoadTimeClock.MetroFactory metroFactory10 = ((MoneybotPreambleEditorPresenter$Factory$Impl) obj6).delegateFactory;
                    ChatManager chatManager4 = (ChatManager) metroFactory10.clock.invoke();
                    RealMoneybotPreambleManager realMoneybotPreambleManager2 = (RealMoneybotPreambleManager) metroFactory10.observabilityManager.invoke();
                    chatManager4.getClass();
                    realMoneybotPreambleManager2.getClass();
                    return MoleculePresenterKt.asPresenter$default(new MusicPresenter(chatManager4, realMoneybotPreambleManager2, screenNavigator));
                }
                if (Intrinsics.areEqual(moneybotScreen, MoneybotHomeScreen.INSTANCE)) {
                    NodeChain nodeChain3 = ((MoneybotHomePresenter$Factory$Impl) obj5).delegateFactory;
                    RealMoneybotAnalyticsService realMoneybotAnalyticsService2 = (RealMoneybotAnalyticsService) ((Provider) nodeChain3.layoutNode).invoke();
                    EglCore eglCore2 = (EglCore) ((RealEarningsChartRepository$MetroFactory) nodeChain3.sentinelHead).invoke();
                    RealUuidGenerator realUuidGenerator3 = (RealUuidGenerator) ((LambdaProvider) nodeChain3.innerCoordinator).lambda.invoke();
                    RealMoneybotWidgetManager realMoneybotWidgetManager2 = (RealMoneybotWidgetManager) ((Provider) nodeChain3.outerCoordinator).invoke();
                    RealMoneybotPromptManager realMoneybotPromptManager2 = (RealMoneybotPromptManager) ((Provider) nodeChain3.tail).invoke();
                    MoneybotFlagsHelper moneybotFlagsHelper2 = (MoneybotFlagsHelper) ((Provider) nodeChain3.head).invoke();
                    ClientRenderablePluginRegistry clientRenderablePluginRegistry2 = (ClientRenderablePluginRegistry) ((Provider) nodeChain3.current).invoke();
                    ErrorReporter errorReporter3 = (ErrorReporter) ((LambdaProvider) nodeChain3.buffer).lambda.invoke();
                    TabToolbarPresenter$Factory$Impl tabToolbarPresenter$Factory$Impl = (TabToolbarPresenter$Factory$Impl) ((Provider) nodeChain3.stack).invoke();
                    RealRouter$Factory$Impl realRouter$Factory$Impl16 = (RealRouter$Factory$Impl) ((Provider) nodeChain3.cachedDiffer).invoke();
                    realMoneybotAnalyticsService2.getClass();
                    realUuidGenerator3.getClass();
                    realMoneybotWidgetManager2.getClass();
                    realMoneybotPromptManager2.getClass();
                    moneybotFlagsHelper2.getClass();
                    clientRenderablePluginRegistry2.getClass();
                    errorReporter3.getClass();
                    tabToolbarPresenter$Factory$Impl.getClass();
                    realRouter$Factory$Impl16.getClass();
                    return MoleculePresenterKt.asPresenter$default(new MoneybotHomePresenter(screenNavigator, realMoneybotAnalyticsService2, eglCore2, realUuidGenerator3, realMoneybotWidgetManager2, realMoneybotPromptManager2, moneybotFlagsHelper2, clientRenderablePluginRegistry2, errorReporter3, tabToolbarPresenter$Factory$Impl, realRouter$Factory$Impl16));
                }
                if (moneybotScreen instanceof MoneybotOverflowMenuScreen) {
                    MoneybotOverflowMenuScreen moneybotOverflowMenuScreen = (MoneybotOverflowMenuScreen) moneybotScreen;
                    CashMapPresenter.MetroFactory metroFactory11 = ((MoneybotOverflowMenuPresenter$Factory$Impl) obj4).delegateFactory;
                    RealUserSessionPager realUserSessionPager2 = (RealUserSessionPager) metroFactory11.locationProvider.invoke();
                    ChatManager chatManager5 = (ChatManager) metroFactory11.locationSettingsChecker.invoke();
                    RealMoneybotChatMessagesCache realMoneybotChatMessagesCache3 = (RealMoneybotChatMessagesCache) metroFactory11.cameraStateManager.getValue();
                    MoneybotFlagsHelper moneybotFlagsHelper3 = (MoneybotFlagsHelper) metroFactory11.permissionManager.invoke();
                    RealMoneybotAnalyticsService realMoneybotAnalyticsService3 = (RealMoneybotAnalyticsService) metroFactory11.analytics.invoke();
                    RealRouter$Factory$Impl realRouter$Factory$Impl17 = (RealRouter$Factory$Impl) metroFactory11.gpsLocationManager.invoke();
                    realUserSessionPager2.getClass();
                    chatManager5.getClass();
                    realMoneybotChatMessagesCache3.getClass();
                    moneybotFlagsHelper3.getClass();
                    realMoneybotAnalyticsService3.getClass();
                    realRouter$Factory$Impl17.getClass();
                    return MoleculePresenterKt.asPresenter$default(new CardLockPresenter(screenNavigator, moneybotOverflowMenuScreen, realUserSessionPager2, chatManager5, realMoneybotChatMessagesCache3, moneybotFlagsHelper3, realMoneybotAnalyticsService3, realRouter$Factory$Impl17));
                }
                if (Intrinsics.areEqual(moneybotScreen, MoneybotAutomationsScreen.INSTANCE)) {
                    TabToolbarPresenter$Factory$Impl tabToolbarPresenter$Factory$Impl2 = (TabToolbarPresenter$Factory$Impl) ((MoneybotAutomationsPresenter$Factory$Impl) obj3).delegateFactory.sandboxer.invoke();
                    tabToolbarPresenter$Factory$Impl2.getClass();
                    return MoleculePresenterKt.asPresenter$default(new VerifyCheckDialogPresenter(screenNavigator, tabToolbarPresenter$Factory$Impl2));
                }
                if (moneybotScreen instanceof MoneybotDebugOverlayScreen) {
                    MerchantInfoFeedbackPresenter$MetroFactory merchantInfoFeedbackPresenter$MetroFactory = ((MoneybotDebugOverlayPresenter$Factory$Impl) obj2).delegateFactory;
                    ChatManager chatManager6 = (ChatManager) merchantInfoFeedbackPresenter$MetroFactory.customerStore.invoke();
                    MoneybotDebugSettingsManager moneybotDebugSettingsManager2 = (MoneybotDebugSettingsManager) merchantInfoFeedbackPresenter$MetroFactory.analytics.getValue();
                    AndroidStringManager androidStringManager19 = (AndroidStringManager) merchantInfoFeedbackPresenter$MetroFactory.stringManager.lambda.invoke();
                    RealClipboardManager realClipboardManager3 = (RealClipboardManager) merchantInfoFeedbackPresenter$MetroFactory.sessionManager.lambda.invoke();
                    chatManager6.getClass();
                    moneybotDebugSettingsManager2.getClass();
                    androidStringManager19.getClass();
                    realClipboardManager3.getClass();
                    return MoleculePresenterKt.asPresenter$default(new DisclosurePresenter(screenNavigator, (MoneybotDebugOverlayScreen) moneybotScreen, chatManager6, moneybotDebugSettingsManager2, androidStringManager19, realClipboardManager3));
                }
                if (moneybotScreen instanceof MoneybotAmountInputScreen) {
                    return MoleculePresenterKt.asPresenter$default(new VerifyCheckDialogPresenter(22, (MoneybotAmountInputScreen) moneybotScreen, screenNavigator));
                }
                if (moneybotScreen instanceof MoneybotStaticPickerScreen) {
                    ChatImageDetailPresenter$MetroFactory chatImageDetailPresenter$MetroFactory = ((MoneybotStaticPickerPresenter$Factory$Impl) obj).delegateFactory;
                    AndroidStringManager androidStringManager20 = (AndroidStringManager) chatImageDetailPresenter$MetroFactory.accessibilityManager.lambda.invoke();
                    ErrorReporter errorReporter4 = (ErrorReporter) chatImageDetailPresenter$MetroFactory.stringManager.lambda.invoke();
                    androidStringManager20.getClass();
                    errorReporter4.getClass();
                    return MoleculePresenterKt.asPresenter$default(new WorkHomePresenter(androidStringManager20, errorReporter4, (MoneybotStaticPickerScreen) moneybotScreen, screenNavigator));
                }
                if (moneybotScreen instanceof MoneybotTextInputScreen) {
                    return MoleculePresenterKt.asPresenter$default(new VerifyCheckDialogPresenter(24, (MoneybotTextInputScreen) moneybotScreen, screenNavigator));
                }
                if (moneybotScreen == null) {
                    return null;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
    }

    public OffersPresenterFactory(ConfirmCashOutPresenter$Factory$Impl confirmCashOutPresenter$Factory$Impl, RecurringDepositsPresenter$Factory$Impl recurringDepositsPresenter$Factory$Impl, RecurringDepositsFirstTimeUserPresenter$Factory$Impl recurringDepositsFirstTimeUserPresenter$Factory$Impl, DemandDepositDialogPresenter$Factory$Impl demandDepositDialogPresenter$Factory$Impl, BankingDialogPresenter$Factory$Impl bankingDialogPresenter$Factory$Impl, TransfersPresenter$Factory$Impl transfersPresenter$Factory$Impl, BalanceHomePresenter$Factory$Impl balanceHomePresenter$Factory$Impl, OverdraftCoveragePresenter$Factory$Impl overdraftCoveragePresenter$Factory$Impl, BetterOverdraftPresenter$Factory$Impl betterOverdraftPresenter$Factory$Impl, BenefitsLeafletPresenter$Factory$Impl benefitsLeafletPresenter$Factory$Impl, FeatureFlagManager featureFlagManager) {
        this.offersHomePresenterV2 = confirmCashOutPresenter$Factory$Impl;
        this.offersHomePresenter = recurringDepositsPresenter$Factory$Impl;
        this.offersFilterGroupSheetPresenter = recurringDepositsFirstTimeUserPresenter$Factory$Impl;
        this.offersCollectionPresenter = bankingDialogPresenter$Factory$Impl;
        this.offersDetailsPresenter = transfersPresenter$Factory$Impl;
        this.offersDetailsSheetPresenterV2 = balanceHomePresenter$Factory$Impl;
        this.offersTimelinePresenter = overdraftCoveragePresenter$Factory$Impl;
        this.offersTimelinePresenterV2 = betterOverdraftPresenter$Factory$Impl;
        this.offersRedemptionPresenter = benefitsLeafletPresenter$Factory$Impl;
        this.offersGreenStatusPresenter = featureFlagManager;
    }

    public OffersPresenterFactory(MoneybotChatPresenter$Factory$Impl moneybotChatPresenter$Factory$Impl, MoneybotChatHistoryPresenter$Factory$Impl moneybotChatHistoryPresenter$Factory$Impl, RawMessagesPresenter$Factory$Impl rawMessagesPresenter$Factory$Impl, MoneybotPreambleEditorPresenter$Factory$Impl moneybotPreambleEditorPresenter$Factory$Impl, MoneybotHomePresenter$Factory$Impl moneybotHomePresenter$Factory$Impl, MoneybotOverflowMenuPresenter$Factory$Impl moneybotOverflowMenuPresenter$Factory$Impl, MoneybotAutomationsPresenter$Factory$Impl moneybotAutomationsPresenter$Factory$Impl, MoneybotDebugOverlayPresenter$Factory$Impl moneybotDebugOverlayPresenter$Factory$Impl, MoneybotFeedbackPresenter$Factory$Impl moneybotFeedbackPresenter$Factory$Impl, MoneybotAmountInputPresenter$Factory$Impl moneybotAmountInputPresenter$Factory$Impl, MoneybotStaticPickerPresenter$Factory$Impl moneybotStaticPickerPresenter$Factory$Impl, MoneybotTextInputPresenter$Factory$Impl moneybotTextInputPresenter$Factory$Impl) {
        this.offersHomePresenterV2 = moneybotChatPresenter$Factory$Impl;
        this.offersHomePresenter = moneybotChatHistoryPresenter$Factory$Impl;
        this.offersFilterGroupSheetPresenter = rawMessagesPresenter$Factory$Impl;
        this.offersCollectionPresenter = moneybotPreambleEditorPresenter$Factory$Impl;
        this.offersDetailsPresenter = moneybotHomePresenter$Factory$Impl;
        this.offersDetailsSheetPresenterV2 = moneybotOverflowMenuPresenter$Factory$Impl;
        this.offersTimelinePresenter = moneybotAutomationsPresenter$Factory$Impl;
        this.offersTimelinePresenterV2 = moneybotDebugOverlayPresenter$Factory$Impl;
        this.offersRedemptionPresenter = moneybotFeedbackPresenter$Factory$Impl;
        this.offersGreenStatusPresenter = moneybotStaticPickerPresenter$Factory$Impl;
    }
}
