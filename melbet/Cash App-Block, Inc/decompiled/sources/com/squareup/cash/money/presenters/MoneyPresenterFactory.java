package com.squareup.cash.money.presenters;

import android.app.Activity;
import androidx.compose.runtime.internal.RememberEventDispatcher;
import app.cash.broadway.presenter.Presenter;
import app.cash.broadway.presenter.PresenterFactory;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt;
import app.cash.broadway.screen.Screen;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import com.fillr.e0;
import com.google.android.gms.internal.measurement.zzlj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsc;
import com.squareup.cash.account.presenters.ProfileUpsellPresenter;
import com.squareup.cash.activity.backend.loader.RealActivitiesCacheManager;
import com.squareup.cash.activity.backend.loader.RealActivityTokenFactory;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter$Factory$Impl;
import com.squareup.cash.appintro.presenters.AlternativeNewSponsorAliasPresenter$Factory$Impl;
import com.squareup.cash.appintro.presenters.SponsorshipRequestReferralIntroPresenter;
import com.squareup.cash.appintro.presenters.SponsorshipRequestReferralIntroPresenter$Factory$Impl;
import com.squareup.cash.appintro.screens.AlternativeNewSponsorAliasScreen;
import com.squareup.cash.appintro.screens.SponsorshipRequestReferralIntroScreen;
import com.squareup.cash.appmessages.overlay.RealOverlayAppMessageReader;
import com.squareup.cash.biometrics.AndroidBiometricsStore;
import com.squareup.cash.blockers.scenarioplan.presenters.ScenarioPlanErrorPresenter;
import com.squareup.cash.blockers.scenarioplan.presenters.ScenarioPlanErrorPresenter$Factory$Impl;
import com.squareup.cash.blockers.scenarioplan.presenters.ScenarioPlanLoadingPresenter$Factory$Impl;
import com.squareup.cash.blockers.scenarioplan.screens.ScenarioPlanScreens;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.card.onboarding.PdpNotifiedPreference;
import com.squareup.cash.checks.VerifyCheckDepositPresenter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientrouting.routers.transfers.AddCashRouter;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.backend.roundups.RealBitcoinRoundUpsRepo;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.data.contacts.RealContactRepository;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.db2.Instrument$Adapter;
import com.squareup.cash.db2.OfflineConfig;
import com.squareup.cash.earnings.presenters.EarningsPresenterFactory$MetroFactory;
import com.squareup.cash.education.stories.presenters.EducationStoryPresenter$Factory$Impl;
import com.squareup.cash.education.stories.presenters.EducationStoryViewPagerPresenter$Factory$Impl;
import com.squareup.cash.education.stories.screens.EducationStoryScreen;
import com.squareup.cash.education.stories.screens.EducationStoryViewPagerScreen;
import com.squareup.cash.family.profileselection.real.RealFamilyProfileManager;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.fidesmo.api.FidesmoAnimationDebugOverrides;
import com.squareup.cash.fidesmo.api.FidesmoClient;
import com.squareup.cash.fidesmo.presenters.FidesmoDeprovisioningPresenter;
import com.squareup.cash.fidesmo.presenters.FidesmoDeprovisioningPresenter$Factory$Impl;
import com.squareup.cash.fidesmo.presenters.FidesmoProvisioningFlowContext;
import com.squareup.cash.fidesmo.presenters.FidesmoProvisioningPresenter;
import com.squareup.cash.fidesmo.presenters.FidesmoProvisioningPresenter$Factory$Impl;
import com.squareup.cash.fidesmo.screens.FidesmoDeprovisioningScreen;
import com.squareup.cash.fidesmo.screens.FidesmoProvisioningScreen;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.growtools.presenters.manager.GrowToolsManagerPresenter$Factory$Impl;
import com.squareup.cash.growtools.presenters.manager.activity.GrowToolsActivitySearchRequestHandler$Factory$Impl;
import com.squareup.cash.growtools.presenters.manager.activity.GrowToolsCompleteActivityPresenter$Factory$Impl;
import com.squareup.cash.growtools.presenters.manager.state.RealGrowToolsManagerViewAppearanceTracker;
import com.squareup.cash.growtools.screens.GrowToolsCompleteActivityScreen;
import com.squareup.cash.growtools.screens.GrowToolsManagerScreen;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.invitations.InviteContactsPresenter;
import com.squareup.cash.invitations.InviteContactsPresenter$Factory$Impl;
import com.squareup.cash.invitations.InviteErrorPresenter;
import com.squareup.cash.invitations.InviteErrorPresenter$Factory$Impl;
import com.squareup.cash.invitations.InvitesReferralRulesBottomSheetPresenter$Factory$Impl;
import com.squareup.cash.invitations.screens.InviteReferralsRulesBottomSheet;
import com.squareup.cash.keystore.RealKeyStoreProvider;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.money.analytics.MoneyAnalyticsService;
import com.squareup.cash.money.analytics.RealMoneyAnalyticsContext;
import com.squareup.cash.money.applets.sections.RealMoneyContentSpanTrackingService;
import com.squareup.cash.money.banners.presenters.KybBannerPresenter;
import com.squareup.cash.money.presenters.MoneyTabPresenter;
import com.squareup.cash.money.screens.HypeWelcomeScreen;
import com.squareup.cash.money.screens.MoneyTabScreen;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.paychecks.presenters.HelpSheetPresenter$MetroFactory;
import com.squareup.cash.permissions.ModifiablePermissions;
import com.squareup.cash.prepurchasecashcard.backend.RealPrepurchaseCashCardRepository;
import com.squareup.cash.prepurchasecashcard.presenters.PrepurchaseCashCardFAQPresenter;
import com.squareup.cash.prepurchasecashcard.presenters.PrepurchaseCashCardFAQPresenter$Factory$Impl;
import com.squareup.cash.prepurchasecashcard.presenters.PrepurchaseCashCardPlanningPresenter$Factory$Impl;
import com.squareup.cash.prepurchasecashcard.screens.PrepurchaseCashCardScreen$PrepurchaseCashCardPlanningSheetScreen;
import com.squareup.cash.profile.presenters.ErrorPresenter;
import com.squareup.cash.profile.presenters.TaxesPasswordPresenter$MetroFactory;
import com.squareup.cash.registeralias.presenters.real.RealRegisterAliasResultHandler$Factory$Impl;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.retro.presenters.PaymentPlanDataBlockerPresenter;
import com.squareup.cash.retro.presenters.PaymentPlanDataBlockerPresenter$Factory$Impl;
import com.squareup.cash.retro.presenters.SelectPaymentPlanBlockerPresenter;
import com.squareup.cash.retro.presenters.SelectPaymentPlanBlockerPresenter$Factory$Impl;
import com.squareup.cash.savings.presenters.TransferInPresenter$MetroFactory;
import com.squareup.cash.security.backend.impl.RealPasswordManager;
import com.squareup.cash.security.presenters.PasswordDialogPresenter$Factory$Impl;
import com.squareup.cash.security.presenters.PasswordEntryArgumentsAdapter;
import com.squareup.cash.security.presenters.SetPasswordPresenter;
import com.squareup.cash.security.presenters.SetPasswordPresenter$Factory$Impl;
import com.squareup.cash.security.presenters.VerifyPasswordPresenter;
import com.squareup.cash.security.presenters.VerifyPasswordPresenter$Factory$Impl;
import com.squareup.cash.security.screens.PasswordDialogScreen;
import com.squareup.cash.security.screens.SetPasswordScreen;
import com.squareup.cash.security.screens.VerifyPasswordScreen;
import com.squareup.cash.security.service.SecurityService;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.shopping.autofill.presenters.AutofillPresenter$Factory$Impl;
import com.squareup.cash.shopping.autofill.presenters.EditAutofillPresenter$Factory$Impl;
import com.squareup.cash.shopping.autofill.presenters.RealAutofillNetworkFailureMessageGenerator;
import com.squareup.cash.shopping.autofill.presenters.ShoppingAutofillAnalyticsHandler;
import com.squareup.cash.shopping.autofill.screens.AutofillScreen;
import com.squareup.cash.shopping.autofill.screens.EditAutofillScreen;
import com.squareup.cash.support.navigation.RealSupportNavigator;
import com.squareup.cash.tabs.presenters.TabToolbarPresenter$Factory$Impl;
import com.squareup.cash.ui.overlays.presenter.RealAlertBannerPresenter$Factory$Impl;
import com.squareup.cash.userjourneys.tracker.UserJourneyTracker;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.wallet.data.IssuedCardManager;
import com.squareup.cash.wallet.data.RealCashAppTagManager;
import com.squareup.cash.wallet.presenters.CardAppletTileRepository;
import com.squareup.cash.work.presenters.RealYouPresenter$MetroFactory;
import com.squareup.protos.cash.grantly.app.ShippingAddressService;
import com.squareup.protos.cash.janus.api.JanusService;
import com.squareup.protos.cash.taply.app.v1.PaymentTokenDeviceProvisioningService;
import com.squareup.protos.cash.unicorn.service.UnicornService;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.lending.LendingAppService;
import com.squareup.util.coroutines.Signal;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DelegateFactory;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.MapFactory;
import io.noties.markwon.MarkwonConfiguration;
import java.util.Map;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import retrofit2.Retrofit;

/* loaded from: classes.dex */
public final class MoneyPresenterFactory implements PresenterFactory {
    public final /* synthetic */ int $r8$classId;
    public final Object hypeWelcomePresenterFactory;
    public final Object moneyTabPresenterFactory;

    public MoneyPresenterFactory(SetPasswordPresenter$Factory$Impl setPasswordPresenter$Factory$Impl, VerifyPasswordPresenter$Factory$Impl verifyPasswordPresenter$Factory$Impl, PasswordDialogPresenter$Factory$Impl passwordDialogPresenter$Factory$Impl) {
        this.$r8$classId = 9;
        this.moneyTabPresenterFactory = setPasswordPresenter$Factory$Impl;
        this.hypeWelcomePresenterFactory = verifyPasswordPresenter$Factory$Impl;
    }

    @Override // app.cash.broadway.presenter.PresenterFactory
    public final Presenter create(Screen screen, BetterNavigator.ScreenNavigator screenNavigator) {
        MoleculePresenter scenarioPlanErrorPresenter;
        MoleculePresenter moleculePresenter;
        int i = this.$r8$classId;
        Object obj = this.hypeWelcomePresenterFactory;
        Object obj2 = this.moneyTabPresenterFactory;
        switch (i) {
            case 0:
                screen.getClass();
                if (!(screen instanceof MoneyTabScreen)) {
                    if (!(screen instanceof HypeWelcomeScreen)) {
                        return null;
                    }
                    VerifyCheckDepositPresenter.MetroFactory metroFactory = ((HypeWelcomePresenter$Factory$Impl) obj).delegateFactory;
                    FeatureFlagManager featureFlagManager = (FeatureFlagManager) metroFactory.analytics.getValue();
                    HypeDismissedPreference hypeDismissedPreference = (HypeDismissedPreference) metroFactory.blockerFlowAnalytics.invoke();
                    PdpNotifiedPreference pdpNotifiedPreference = (PdpNotifiedPreference) metroFactory.blockersNavigator.invoke();
                    Analytics analytics = (Analytics) metroFactory.appService.getValue();
                    SessionManager sessionManager = (SessionManager) metroFactory.stringManager.lambda.invoke();
                    RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) metroFactory.moneyFormatterFactory.invoke();
                    featureFlagManager.getClass();
                    hypeDismissedPreference.getClass();
                    pdpNotifiedPreference.getClass();
                    analytics.getClass();
                    sessionManager.getClass();
                    realRouter$Factory$Impl.getClass();
                    return MoleculePresenterKt.asPresenter$default(new LocalHomePresenter(featureFlagManager, hypeDismissedPreference, pdpNotifiedPreference, analytics, sessionManager, (HypeWelcomeScreen) screen, screenNavigator, realRouter$Factory$Impl));
                }
                MoneyTabPresenter.MetroFactory metroFactory2 = ((MoneyTabPresenter$Factory$Impl) obj2).delegateFactory;
                TabToolbarPresenter$Factory$Impl tabToolbarPresenter$Factory$Impl = (TabToolbarPresenter$Factory$Impl) metroFactory2.tabToolbarPresenterFactory.invoke();
                e0 e0Var = (e0) metroFactory2.moneyProfileManager.invoke();
                MoneyTabToolbarConfig moneyTabToolbarConfig = (MoneyTabToolbarConfig) metroFactory2.moneyTabToolbarConfig.invoke();
                UnicornService unicornService = (UnicornService) metroFactory2.appService.invoke();
                IssuedCardManager issuedCardManager = (IssuedCardManager) metroFactory2.issuedCardManager.invoke();
                MoneyAnalyticsService moneyAnalyticsService = (MoneyAnalyticsService) metroFactory2.moneyAnalyticsService.invoke();
                RealMoneyAnalyticsContext realMoneyAnalyticsContext = (RealMoneyAnalyticsContext) metroFactory2.moneyAnalyticsContentCache.invoke();
                RealMoneyContentSpanTrackingService realMoneyContentSpanTrackingService = (RealMoneyContentSpanTrackingService) metroFactory2.moneyContentSpanTrackingService.invoke();
                RealObservabilityManager realObservabilityManager = (RealObservabilityManager) metroFactory2.observabilityManager.invoke();
                AndroidClock androidClock = (AndroidClock) metroFactory2.clock.invoke();
                RealOverlayAppMessageReader realOverlayAppMessageReader = (RealOverlayAppMessageReader) metroFactory2.overlayAppMessageReader.invoke();
                FeatureFlagManager featureFlagManager2 = (FeatureFlagManager) metroFactory2.featureFlagManager.invoke();
                RealFamilyProfileManager realFamilyProfileManager = (RealFamilyProfileManager) metroFactory2.familyProfileManager.invoke();
                MoneyTabLoadedStateHolder moneyTabLoadedStateHolder = (MoneyTabLoadedStateHolder) metroFactory2.moneyTabLoadedStateHolder.invoke();
                RealAlertBannerPresenter$Factory$Impl realAlertBannerPresenter$Factory$Impl = (RealAlertBannerPresenter$Factory$Impl) metroFactory2.alertBannerPresenterFactory.invoke();
                CardAppletTileRepository cardAppletTileRepository = (CardAppletTileRepository) metroFactory2.cardAppletTileRepository.invoke();
                HypeDismissedPreference hypeDismissedPreference2 = (HypeDismissedPreference) metroFactory2.hypeDismissedPreference.invoke();
                HypeEligibilityProvider hypeEligibilityProvider = (HypeEligibilityProvider) metroFactory2.hypeEligibilityProvider.invoke();
                FlowStarter flowStarter = (FlowStarter) metroFactory2.flowStarter.invoke();
                AndroidStringManager androidStringManager = (AndroidStringManager) metroFactory2.stringManager.invoke();
                SyncValueReader syncValueReader = (SyncValueReader) metroFactory2.syncValueReader.invoke();
                Analytics analytics2 = (Analytics) metroFactory2.analytics.invoke();
                SessionManager sessionManager2 = (SessionManager) metroFactory2.sessionManager.invoke();
                CoroutineContext coroutineContext = (CoroutineContext) metroFactory2.computationDispatcher.invoke();
                tabToolbarPresenter$Factory$Impl.getClass();
                unicornService.getClass();
                issuedCardManager.getClass();
                moneyAnalyticsService.getClass();
                realMoneyAnalyticsContext.getClass();
                realMoneyContentSpanTrackingService.getClass();
                realObservabilityManager.getClass();
                androidClock.getClass();
                realOverlayAppMessageReader.getClass();
                featureFlagManager2.getClass();
                realFamilyProfileManager.getClass();
                moneyTabLoadedStateHolder.getClass();
                realAlertBannerPresenter$Factory$Impl.getClass();
                cardAppletTileRepository.getClass();
                hypeDismissedPreference2.getClass();
                hypeEligibilityProvider.getClass();
                flowStarter.getClass();
                androidStringManager.getClass();
                syncValueReader.getClass();
                analytics2.getClass();
                sessionManager2.getClass();
                coroutineContext.getClass();
                return MoleculePresenterKt.asPresenter$default(new MoneyTabPresenter(tabToolbarPresenter$Factory$Impl, e0Var, moneyTabToolbarConfig, unicornService, issuedCardManager, moneyAnalyticsService, realMoneyAnalyticsContext, realMoneyContentSpanTrackingService, realObservabilityManager, androidClock, realOverlayAppMessageReader, featureFlagManager2, realFamilyProfileManager, moneyTabLoadedStateHolder, realAlertBannerPresenter$Factory$Impl, cardAppletTileRepository, hypeDismissedPreference2, hypeEligibilityProvider, flowStarter, androidStringManager, syncValueReader, analytics2, sessionManager2, coroutineContext, (MoneyTabScreen) screen, screenNavigator));
            case 1:
                screen.getClass();
                if (screen instanceof SponsorshipRequestReferralIntroScreen) {
                    ProfileUpsellPresenter.MetroFactory metroFactory3 = ((SponsorshipRequestReferralIntroPresenter$Factory$Impl) obj2).delegateFactory;
                    JanusService janusService = (JanusService) metroFactory3.analytics.getValue();
                    RealRegisterAliasResultHandler$Factory$Impl realRegisterAliasResultHandler$Factory$Impl = (RealRegisterAliasResultHandler$Factory$Impl) metroFactory3.routerFactory.invoke();
                    Analytics analytics3 = (Analytics) metroFactory3.syncValueReader.getValue();
                    janusService.getClass();
                    realRegisterAliasResultHandler$Factory$Impl.getClass();
                    analytics3.getClass();
                    return MoleculePresenterKt.asPresenter$default(new SponsorshipRequestReferralIntroPresenter(janusService, realRegisterAliasResultHandler$Factory$Impl, analytics3, (SponsorshipRequestReferralIntroScreen) screen, screenNavigator));
                }
                if (!(screen instanceof AlternativeNewSponsorAliasScreen)) {
                    return null;
                }
                TaxesPasswordPresenter$MetroFactory taxesPasswordPresenter$MetroFactory = ((AlternativeNewSponsorAliasPresenter$Factory$Impl) obj).delegateFactory;
                FlowStarter flowStarter2 = (FlowStarter) taxesPasswordPresenter$MetroFactory.syncValueReader.getValue();
                Analytics analytics4 = (Analytics) taxesPasswordPresenter$MetroFactory.flowStarter.getValue();
                flowStarter2.getClass();
                analytics4.getClass();
                return MoleculePresenterKt.asPresenter$default(new MusicPresenter(flowStarter2, analytics4, (AlternativeNewSponsorAliasScreen) screen, screenNavigator));
            case 2:
                screen.getClass();
                if (!(screen instanceof ScenarioPlanScreens)) {
                    return null;
                }
                ScenarioPlanScreens scenarioPlanScreens = (ScenarioPlanScreens) screen;
                if (scenarioPlanScreens instanceof ScenarioPlanScreens.ScenarioPlanLoadingScreen) {
                    Instrument$Adapter instrument$Adapter = ((ScenarioPlanLoadingPresenter$Factory$Impl) obj2).delegateFactory;
                    AndroidStringManager androidStringManager2 = (AndroidStringManager) ((LambdaProvider) instrument$Adapter.cash_instrument_typeAdapter).lambda.invoke();
                    BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) ((Provider) instrument$Adapter.card_brandAdapter).invoke();
                    Map map = (Map) ((MapFactory) instrument$Adapter.balance_currencyAdapter).invoke();
                    androidStringManager2.getClass();
                    blockersDataNavigator.getClass();
                    scenarioPlanErrorPresenter = new LocalPosCheckInPresenter(androidStringManager2, blockersDataNavigator, map, (ScenarioPlanScreens.ScenarioPlanLoadingScreen) screen, screenNavigator);
                } else {
                    if (!(scenarioPlanScreens instanceof ScenarioPlanScreens.ScenarioPlanErrorScreen)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    AndroidStringManager androidStringManager3 = (AndroidStringManager) ((ScenarioPlanErrorPresenter$Factory$Impl) obj).delegateFactory.stringManager.lambda.invoke();
                    androidStringManager3.getClass();
                    scenarioPlanErrorPresenter = new ScenarioPlanErrorPresenter((ScenarioPlanScreens.ScenarioPlanErrorScreen) screen, screenNavigator, androidStringManager3);
                }
                return MoleculePresenterKt.asPresenter$default(scenarioPlanErrorPresenter);
            case 3:
                screen.getClass();
                if (screen instanceof EducationStoryScreen) {
                    return zzsc.asPresenter$default(((EducationStoryPresenter$Factory$Impl) obj2).create((EducationStoryScreen) screen, screenNavigator));
                }
                if (!(screen instanceof EducationStoryViewPagerScreen)) {
                    return null;
                }
                EducationStoryPresenter$Factory$Impl educationStoryPresenter$Factory$Impl = (EducationStoryPresenter$Factory$Impl) ((EducationStoryViewPagerPresenter$Factory$Impl) obj).delegateFactory.sandboxer.invoke();
                educationStoryPresenter$Factory$Impl.getClass();
                return MoleculePresenterKt.asPresenter$default(new MusicPresenter(educationStoryPresenter$Factory$Impl, (EducationStoryViewPagerScreen) screen, screenNavigator));
            case 4:
                screen.getClass();
                if (!(screen instanceof FidesmoProvisioningScreen)) {
                    if (!(screen instanceof FidesmoDeprovisioningScreen)) {
                        return null;
                    }
                    RememberEventDispatcher rememberEventDispatcher = ((FidesmoDeprovisioningPresenter$Factory$Impl) obj).delegateFactory;
                    PaymentTokenDeviceProvisioningService paymentTokenDeviceProvisioningService = (PaymentTokenDeviceProvisioningService) ((DoubleCheck) rememberEventDispatcher.abandoning).getValue();
                    FidesmoClient fidesmoClient = (FidesmoClient) ((Provider) rememberEventDispatcher.traceContext).invoke();
                    RealObservabilityManager realObservabilityManager2 = (RealObservabilityManager) ((LambdaProvider) rememberEventDispatcher.remembering).lambda.invoke();
                    AndroidStringManager androidStringManager4 = (AndroidStringManager) ((LambdaProvider) rememberEventDispatcher.currentRememberingList).lambda.invoke();
                    RealRouter$Factory$Impl realRouter$Factory$Impl2 = (RealRouter$Factory$Impl) ((Provider) rememberEventDispatcher.leaving).invoke();
                    RealSupportNavigator realSupportNavigator = (RealSupportNavigator) ((Provider) rememberEventDispatcher.sideEffects).invoke();
                    RealCashAppTagManager realCashAppTagManager = (RealCashAppTagManager) ((DoubleCheck) rememberEventDispatcher.rememberSet).getValue();
                    FidesmoProvisioningFlowContext fidesmoProvisioningFlowContext = (FidesmoProvisioningFlowContext) ((Provider) rememberEventDispatcher.releasing).invoke();
                    UserJourneyTracker userJourneyTracker = (UserJourneyTracker) ((LambdaProvider) rememberEventDispatcher.ignoreLeavingSet).lambda.invoke();
                    FidesmoAnimationDebugOverrides fidesmoAnimationDebugOverrides = (FidesmoAnimationDebugOverrides) ((DoubleCheck) rememberEventDispatcher.pausedPlaceholders).getValue();
                    FeatureFlagManager featureFlagManager3 = (FeatureFlagManager) ((DoubleCheck) rememberEventDispatcher.nestedRemembersLists).getValue();
                    paymentTokenDeviceProvisioningService.getClass();
                    fidesmoClient.getClass();
                    realObservabilityManager2.getClass();
                    androidStringManager4.getClass();
                    realRouter$Factory$Impl2.getClass();
                    realSupportNavigator.getClass();
                    realCashAppTagManager.getClass();
                    fidesmoProvisioningFlowContext.getClass();
                    userJourneyTracker.getClass();
                    fidesmoAnimationDebugOverrides.getClass();
                    featureFlagManager3.getClass();
                    return MoleculePresenterKt.asPresenter$default(new FidesmoDeprovisioningPresenter((FidesmoDeprovisioningScreen) screen, screenNavigator, paymentTokenDeviceProvisioningService, fidesmoClient, realObservabilityManager2, androidStringManager4, realRouter$Factory$Impl2, realSupportNavigator, realCashAppTagManager, fidesmoProvisioningFlowContext, userJourneyTracker, fidesmoAnimationDebugOverrides, featureFlagManager3));
                }
                OfflineConfig.Adapter adapter = ((FidesmoProvisioningPresenter$Factory$Impl) obj2).delegateFactory;
                PaymentTokenDeviceProvisioningService paymentTokenDeviceProvisioningService2 = (PaymentTokenDeviceProvisioningService) ((DoubleCheck) adapter.attempted_payment_status_resultAdapter).getValue();
                FidesmoClient fidesmoClient2 = (FidesmoClient) ((Provider) adapter.offline_payment_status_resultAdapter).invoke();
                RealObservabilityManager realObservabilityManager3 = (RealObservabilityManager) ((LambdaProvider) adapter.attempted_bill_status_resultAdapter).lambda.invoke();
                AndroidStringManager androidStringManager5 = (AndroidStringManager) ((LambdaProvider) adapter.offline_bill_status_resultAdapter).lambda.invoke();
                AppService appService = (AppService) ((DoubleCheck) adapter.attempted_cash_out_status_resultAdapter).getValue();
                RealRouter$Factory$Impl realRouter$Factory$Impl3 = (RealRouter$Factory$Impl) ((Provider) adapter.offline_cash_out_status_resultAdapter).invoke();
                RealSupportNavigator realSupportNavigator2 = (RealSupportNavigator) ((Provider) adapter.attempted_add_cash_status_resultAdapter).invoke();
                RealCashAppTagManager realCashAppTagManager2 = (RealCashAppTagManager) ((DoubleCheck) adapter.offline_add_cash_status_resultAdapter).getValue();
                BlockersDataNavigator blockersDataNavigator2 = (BlockersDataNavigator) ((Provider) adapter.error_cash_out_status_resultAdapter).invoke();
                FidesmoProvisioningFlowContext fidesmoProvisioningFlowContext2 = (FidesmoProvisioningFlowContext) ((Provider) adapter.error_add_cash_status_resultAdapter).invoke();
                UserJourneyTracker userJourneyTracker2 = (UserJourneyTracker) ((LambdaProvider) adapter.offline_transfer_scenario_planAdapter).lambda.invoke();
                FidesmoAnimationDebugOverrides fidesmoAnimationDebugOverrides2 = (FidesmoAnimationDebugOverrides) ((DoubleCheck) adapter.error_transfer_scenario_planAdapter).getValue();
                FeatureFlagManager featureFlagManager4 = (FeatureFlagManager) ((DoubleCheck) adapter.retry_intervalsAdapter).getValue();
                paymentTokenDeviceProvisioningService2.getClass();
                fidesmoClient2.getClass();
                realObservabilityManager3.getClass();
                androidStringManager5.getClass();
                appService.getClass();
                realRouter$Factory$Impl3.getClass();
                realSupportNavigator2.getClass();
                realCashAppTagManager2.getClass();
                blockersDataNavigator2.getClass();
                fidesmoProvisioningFlowContext2.getClass();
                userJourneyTracker2.getClass();
                fidesmoAnimationDebugOverrides2.getClass();
                featureFlagManager4.getClass();
                return MoleculePresenterKt.asPresenter$default(new FidesmoProvisioningPresenter((FidesmoProvisioningScreen) screen, screenNavigator, paymentTokenDeviceProvisioningService2, fidesmoClient2, realObservabilityManager3, androidStringManager5, appService, realRouter$Factory$Impl3, realSupportNavigator2, realCashAppTagManager2, blockersDataNavigator2, fidesmoProvisioningFlowContext2, userJourneyTracker2, fidesmoAnimationDebugOverrides2, featureFlagManager4));
            case 5:
                screen.getClass();
                if (screen instanceof GrowToolsManagerScreen) {
                    Instrument$Adapter instrument$Adapter2 = ((GrowToolsManagerPresenter$Factory$Impl) obj2).delegateFactory;
                    MarkwonConfiguration markwonConfiguration = (MarkwonConfiguration) ((EarningsPresenterFactory$MetroFactory) instrument$Adapter2.cash_instrument_typeAdapter).invoke();
                    Analytics analytics5 = (Analytics) ((DoubleCheck) instrument$Adapter2.card_brandAdapter).getValue();
                    RealGrowToolsManagerViewAppearanceTracker realGrowToolsManagerViewAppearanceTracker = (RealGrowToolsManagerViewAppearanceTracker) ((Provider) instrument$Adapter2.balance_currencyAdapter).invoke();
                    analytics5.getClass();
                    realGrowToolsManagerViewAppearanceTracker.getClass();
                    moleculePresenter = new MusicPresenter(markwonConfiguration, analytics5, realGrowToolsManagerViewAppearanceTracker, (GrowToolsManagerScreen) screen, screenNavigator);
                } else if (screen instanceof GrowToolsCompleteActivityScreen) {
                    AddCashRouter.MetroFactory metroFactory4 = ((GrowToolsCompleteActivityPresenter$Factory$Impl) obj).delegateFactory;
                    SyncValueReader syncValueReader2 = (SyncValueReader) metroFactory4.flowStarter.getValue();
                    GrowToolsActivitySearchRequestHandler$Factory$Impl growToolsActivitySearchRequestHandler$Factory$Impl = (GrowToolsActivitySearchRequestHandler$Factory$Impl) metroFactory4.transferManager.invoke();
                    RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl = (RealActivityEmbeddedPresenter$Factory$Impl) metroFactory4.jurisdictionConfigManager.invoke();
                    LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) metroFactory4.transfersInboundNavigatorFactory.invoke();
                    RealActivityTokenFactory realActivityTokenFactory = (RealActivityTokenFactory) metroFactory4.blockersHelperFactory.invoke();
                    RealActivitiesCacheManager realActivitiesCacheManager = (RealActivitiesCacheManager) metroFactory4.analytics.getValue();
                    AndroidStringManager androidStringManager6 = (AndroidStringManager) metroFactory4.computationContext.lambda.invoke();
                    RealBitcoinRoundUpsRepo realBitcoinRoundUpsRepo = (RealBitcoinRoundUpsRepo) metroFactory4.routerFactory.invoke();
                    syncValueReader2.getClass();
                    growToolsActivitySearchRequestHandler$Factory$Impl.getClass();
                    realActivityEmbeddedPresenter$Factory$Impl.getClass();
                    factory.getClass();
                    realActivityTokenFactory.getClass();
                    realActivitiesCacheManager.getClass();
                    androidStringManager6.getClass();
                    realBitcoinRoundUpsRepo.getClass();
                    moleculePresenter = new DisclosurePresenter(syncValueReader2, growToolsActivitySearchRequestHandler$Factory$Impl, realActivityEmbeddedPresenter$Factory$Impl, factory, realActivityTokenFactory, realActivitiesCacheManager, androidStringManager6, realBitcoinRoundUpsRepo, (GrowToolsCompleteActivityScreen) screen, screenNavigator);
                } else {
                    moleculePresenter = null;
                }
                if (moleculePresenter != null) {
                    return MoleculePresenterKt.asPresenter$default(moleculePresenter);
                }
                return null;
            case 6:
                screen.getClass();
                if (!(screen instanceof BlockersScreens.InviteContactsScreen)) {
                    if (screen instanceof InviteReferralsRulesBottomSheet) {
                        return MoleculePresenterKt.asPresenter$default(new KybBannerPresenter((InviteReferralsRulesBottomSheet) screen));
                    }
                    if (!(screen instanceof BlockersScreens.InviteErrorScreen)) {
                        return null;
                    }
                    Analytics analytics6 = (Analytics) ((InviteErrorPresenter$Factory$Impl) obj).delegateFactory.analytics.getValue();
                    analytics6.getClass();
                    return MoleculePresenterKt.asPresenter$default(new InviteErrorPresenter(analytics6, (BlockersScreens.InviteErrorScreen) screen, screenNavigator));
                }
                InviteContactsPresenter.MetroFactory metroFactory5 = ((InviteContactsPresenter$Factory$Impl) obj2).delegateFactory;
                AppConfigManager appConfigManager = (AppConfigManager) metroFactory5.appConfig.getValue();
                RealContactRepository realContactRepository = (RealContactRepository) metroFactory5.contactRepository.invoke();
                Signal signal = (Signal) metroFactory5.signOut.getValue();
                CoroutineContext coroutineContext2 = (CoroutineContext) metroFactory5.ioDispatcher.lambda.invoke();
                IntentLauncher intentLauncher = (IntentLauncher) metroFactory5.launcher.invoke();
                Analytics analytics7 = (Analytics) metroFactory5.analytics.getValue();
                FeatureFlagManager featureFlagManager5 = (FeatureFlagManager) metroFactory5.featureFlagManager.getValue();
                EglCore eglCore = (EglCore) metroFactory5.invitationsRepository.invoke();
                AndroidStringManager androidStringManager7 = (AndroidStringManager) metroFactory5.stringManager.lambda.invoke();
                StateFlow stateFlow = (StateFlow) metroFactory5.activityLifecycleState.invoke();
                ModifiablePermissions modifiablePermissions = (ModifiablePermissions) metroFactory5.readContactsPermissions.invoke();
                AndroidClock androidClock2 = (AndroidClock) metroFactory5.clock.lambda.invoke();
                BlockersDataNavigator blockersDataNavigator3 = (BlockersDataNavigator) metroFactory5.blockersNavigator.invoke();
                RealObservabilityManager realObservabilityManager4 = (RealObservabilityManager) metroFactory5.observabilityManager.lambda.invoke();
                Flow flow = (Flow) metroFactory5.shareResults.getValue();
                RealRouter$Factory$Impl realRouter$Factory$Impl4 = (RealRouter$Factory$Impl) metroFactory5.routerFactory.invoke();
                CoroutineScope coroutineScope = (CoroutineScope) metroFactory5.scope.value;
                appConfigManager.getClass();
                realContactRepository.getClass();
                signal.getClass();
                coroutineContext2.getClass();
                intentLauncher.getClass();
                analytics7.getClass();
                featureFlagManager5.getClass();
                androidStringManager7.getClass();
                stateFlow.getClass();
                modifiablePermissions.getClass();
                androidClock2.getClass();
                blockersDataNavigator3.getClass();
                realObservabilityManager4.getClass();
                flow.getClass();
                realRouter$Factory$Impl4.getClass();
                coroutineScope.getClass();
                return MoleculePresenterKt.asPresenter$default(new InviteContactsPresenter(appConfigManager, realContactRepository, signal, coroutineContext2, intentLauncher, analytics7, featureFlagManager5, eglCore, androidStringManager7, stateFlow, modifiablePermissions, androidClock2, blockersDataNavigator3, realObservabilityManager4, flow, realRouter$Factory$Impl4, coroutineScope, screenNavigator, (BlockersScreens.InviteContactsScreen) screen));
            case 7:
                screen.getClass();
                if (!(screen instanceof PrepurchaseCashCardScreen$PrepurchaseCashCardPlanningSheetScreen)) {
                    if (!(screen instanceof BlockersScreens.PrepurchaseCashCardFAQBlockerScreen)) {
                        return null;
                    }
                    RealYouPresenter$MetroFactory realYouPresenter$MetroFactory = ((PrepurchaseCashCardFAQPresenter$Factory$Impl) obj).delegateFactory;
                    BlockersDataNavigator blockersDataNavigator4 = (BlockersDataNavigator) realYouPresenter$MetroFactory.assignedJobProvider.invoke();
                    RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl = (RealBlockersHelper$Factory$Impl) realYouPresenter$MetroFactory.assignedLocationProvider.invoke();
                    RealRouter$Factory$Impl realRouter$Factory$Impl5 = (RealRouter$Factory$Impl) realYouPresenter$MetroFactory.passcodeProvider.invoke();
                    blockersDataNavigator4.getClass();
                    realBlockersHelper$Factory$Impl.getClass();
                    realRouter$Factory$Impl5.getClass();
                    return MoleculePresenterKt.asPresenter$default(new PrepurchaseCashCardFAQPresenter(blockersDataNavigator4, realBlockersHelper$Factory$Impl, realRouter$Factory$Impl5, screenNavigator, (BlockersScreens.PrepurchaseCashCardFAQBlockerScreen) screen));
                }
                PrepurchaseCashCardScreen$PrepurchaseCashCardPlanningSheetScreen.Parent parent = ((PrepurchaseCashCardScreen$PrepurchaseCashCardPlanningSheetScreen) screen).parent;
                parent.getClass();
                Retrofit.Builder builder = ((PrepurchaseCashCardPlanningPresenter$Factory$Impl) obj2).delegateFactory;
                RealPrepurchaseCashCardRepository realPrepurchaseCashCardRepository = (RealPrepurchaseCashCardRepository) ((Provider) builder.callFactory).invoke();
                EglCore eglCore2 = (EglCore) ((RealKeyStoreProvider.MetroFactory) builder.baseUrl).invoke();
                AndroidStringManager androidStringManager8 = (AndroidStringManager) ((LambdaProvider) builder.converterFactories).lambda.invoke();
                Analytics analytics8 = (Analytics) ((DoubleCheck) builder.callAdapterFactories).getValue();
                RealRouter$Factory$Impl realRouter$Factory$Impl6 = (RealRouter$Factory$Impl) ((Provider) builder.callbackExecutor).invoke();
                realPrepurchaseCashCardRepository.getClass();
                androidStringManager8.getClass();
                analytics8.getClass();
                realRouter$Factory$Impl6.getClass();
                return MoleculePresenterKt.asPresenter$default(new LocalEditorialPresenter(realPrepurchaseCashCardRepository, eglCore2, androidStringManager8, analytics8, realRouter$Factory$Impl6, parent, screenNavigator));
            case 8:
                screen.getClass();
                if (screen instanceof BlockersScreens.PaymentPlanDataBlockerScreen) {
                    HelpSheetPresenter$MetroFactory helpSheetPresenter$MetroFactory = ((PaymentPlanDataBlockerPresenter$Factory$Impl) obj2).delegateFactory;
                    AppService appService2 = (AppService) helpSheetPresenter$MetroFactory.syncValueReader.getValue();
                    AndroidStringManager androidStringManager9 = (AndroidStringManager) helpSheetPresenter$MetroFactory.errorReporter.lambda.invoke();
                    RealRouter$Factory$Impl realRouter$Factory$Impl7 = (RealRouter$Factory$Impl) helpSheetPresenter$MetroFactory.routerFactory.invoke();
                    BlockersDataNavigator blockersDataNavigator5 = (BlockersDataNavigator) helpSheetPresenter$MetroFactory.oneErrorPerAppSessionStrategy.invoke();
                    appService2.getClass();
                    androidStringManager9.getClass();
                    realRouter$Factory$Impl7.getClass();
                    blockersDataNavigator5.getClass();
                    return MoleculePresenterKt.asPresenter$default(new PaymentPlanDataBlockerPresenter(appService2, androidStringManager9, realRouter$Factory$Impl7, blockersDataNavigator5, screenNavigator, (BlockersScreens.PaymentPlanDataBlockerScreen) screen));
                }
                if (!(screen instanceof BlockersScreens.SelectPaymentPlanBlockerScreen)) {
                    return null;
                }
                TransferInPresenter$MetroFactory transferInPresenter$MetroFactory = ((SelectPaymentPlanBlockerPresenter$Factory$Impl) obj).delegateFactory;
                LendingAppService lendingAppService = (LendingAppService) transferInPresenter$MetroFactory.analytics.getValue();
                BlockersDataNavigator blockersDataNavigator6 = (BlockersDataNavigator) transferInPresenter$MetroFactory.moneyFormatterFactory.invoke();
                AndroidStringManager androidStringManager10 = (AndroidStringManager) transferInPresenter$MetroFactory.stringManager.lambda.invoke();
                lendingAppService.getClass();
                blockersDataNavigator6.getClass();
                androidStringManager10.getClass();
                return MoleculePresenterKt.asPresenter$default(new SelectPaymentPlanBlockerPresenter(lendingAppService, blockersDataNavigator6, androidStringManager10, screenNavigator, (BlockersScreens.SelectPaymentPlanBlockerScreen) screen));
            case 9:
                screen.getClass();
                if (screen instanceof SetPasswordScreen) {
                    PasswordEntryArgumentsAdapter passwordEntryArgumentsAdapter = new PasswordEntryArgumentsAdapter((BlockersScreens) screen, ((SetPasswordScreen) screen).passwordScreenData);
                    SetPasswordPresenter.MetroFactory metroFactory6 = ((SetPasswordPresenter$Factory$Impl) obj2).delegateFactory;
                    Activity activity = (Activity) metroFactory6.activity.value;
                    AndroidStringManager androidStringManager11 = (AndroidStringManager) metroFactory6.stringManager.lambda.invoke();
                    BlockersDataNavigator blockersDataNavigator7 = (BlockersDataNavigator) metroFactory6.blockersDataNavigator.invoke();
                    AndroidBiometricsStore androidBiometricsStore = (AndroidBiometricsStore) metroFactory6.biometricsStore.invoke();
                    CoroutineContext coroutineContext3 = (CoroutineContext) metroFactory6.ioDispatcher.lambda.invoke();
                    AppService appService3 = (AppService) metroFactory6.appService.getValue();
                    IntentLauncher intentLauncher2 = (IntentLauncher) metroFactory6.launcher.invoke();
                    Analytics analytics9 = (Analytics) metroFactory6.analytics.getValue();
                    RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl2 = (RealBlockersHelper$Factory$Impl) metroFactory6.blockersHelperFactory.invoke();
                    RealPasswordManager realPasswordManager = (RealPasswordManager) metroFactory6.passwordManager.invoke();
                    SecurityService securityService = (SecurityService) metroFactory6.securityService.getValue();
                    activity.getClass();
                    androidStringManager11.getClass();
                    blockersDataNavigator7.getClass();
                    androidBiometricsStore.getClass();
                    coroutineContext3.getClass();
                    appService3.getClass();
                    intentLauncher2.getClass();
                    analytics9.getClass();
                    realBlockersHelper$Factory$Impl2.getClass();
                    realPasswordManager.getClass();
                    securityService.getClass();
                    return MoleculePresenterKt.asPresenter$default(new SetPasswordPresenter(activity, androidBiometricsStore, screenNavigator, blockersDataNavigator7, realBlockersHelper$Factory$Impl2, analytics9, intentLauncher2, androidStringManager11, realPasswordManager, passwordEntryArgumentsAdapter, securityService, appService3, coroutineContext3));
                }
                if (!(screen instanceof VerifyPasswordScreen)) {
                    if (screen instanceof PasswordDialogScreen) {
                        return MoleculePresenterKt.asPresenter$default(new ErrorPresenter(screenNavigator, (PasswordDialogScreen) screen));
                    }
                    return null;
                }
                PasswordEntryArgumentsAdapter passwordEntryArgumentsAdapter2 = new PasswordEntryArgumentsAdapter((BlockersScreens) screen, ((VerifyPasswordScreen) screen).passwordScreenData);
                SetPasswordPresenter.MetroFactory metroFactory7 = ((VerifyPasswordPresenter$Factory$Impl) obj).delegateFactory;
                Activity activity2 = (Activity) metroFactory7.activity.value;
                AndroidStringManager androidStringManager12 = (AndroidStringManager) metroFactory7.stringManager.lambda.invoke();
                BlockersDataNavigator blockersDataNavigator8 = (BlockersDataNavigator) metroFactory7.blockersDataNavigator.invoke();
                AndroidBiometricsStore androidBiometricsStore2 = (AndroidBiometricsStore) metroFactory7.biometricsStore.invoke();
                CoroutineContext coroutineContext4 = (CoroutineContext) metroFactory7.ioDispatcher.lambda.invoke();
                AppService appService4 = (AppService) metroFactory7.appService.getValue();
                IntentLauncher intentLauncher3 = (IntentLauncher) metroFactory7.launcher.invoke();
                RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl3 = (RealBlockersHelper$Factory$Impl) metroFactory7.blockersHelperFactory.invoke();
                Analytics analytics10 = (Analytics) metroFactory7.analytics.getValue();
                RealPasswordManager realPasswordManager2 = (RealPasswordManager) metroFactory7.passwordManager.invoke();
                SecurityService securityService2 = (SecurityService) metroFactory7.securityService.getValue();
                activity2.getClass();
                androidStringManager12.getClass();
                blockersDataNavigator8.getClass();
                androidBiometricsStore2.getClass();
                coroutineContext4.getClass();
                appService4.getClass();
                intentLauncher3.getClass();
                realBlockersHelper$Factory$Impl3.getClass();
                analytics10.getClass();
                realPasswordManager2.getClass();
                securityService2.getClass();
                return MoleculePresenterKt.asPresenter$default(new VerifyPasswordPresenter(activity2, androidBiometricsStore2, screenNavigator, blockersDataNavigator8, realBlockersHelper$Factory$Impl3, analytics10, intentLauncher3, androidStringManager12, realPasswordManager2, passwordEntryArgumentsAdapter2, securityService2, appService4, coroutineContext4));
            default:
                screen.getClass();
                if (!(screen instanceof AutofillScreen)) {
                    if (!(screen instanceof EditAutofillScreen)) {
                        return null;
                    }
                    HelpSheetPresenter$MetroFactory helpSheetPresenter$MetroFactory2 = ((EditAutofillPresenter$Factory$Impl) obj).delegateFactory;
                    AndroidStringManager androidStringManager13 = (AndroidStringManager) helpSheetPresenter$MetroFactory2.errorReporter.lambda.invoke();
                    ShippingAddressService shippingAddressService = (ShippingAddressService) helpSheetPresenter$MetroFactory2.syncValueReader.getValue();
                    ShoppingAutofillAnalyticsHandler shoppingAutofillAnalyticsHandler = (ShoppingAutofillAnalyticsHandler) helpSheetPresenter$MetroFactory2.routerFactory.invoke();
                    RealAutofillNetworkFailureMessageGenerator realAutofillNetworkFailureMessageGenerator = (RealAutofillNetworkFailureMessageGenerator) helpSheetPresenter$MetroFactory2.oneErrorPerAppSessionStrategy.invoke();
                    androidStringManager13.getClass();
                    shippingAddressService.getClass();
                    shoppingAutofillAnalyticsHandler.getClass();
                    realAutofillNetworkFailureMessageGenerator.getClass();
                    return MoleculePresenterKt.asPresenter$default(new LocalEditorialPresenter(androidStringManager13, shippingAddressService, shoppingAutofillAnalyticsHandler, realAutofillNetworkFailureMessageGenerator, screenNavigator, (EditAutofillScreen) screen));
                }
                zzlj zzljVar = ((AutofillPresenter$Factory$Impl) obj2).delegateFactory;
                AndroidStringManager androidStringManager14 = (AndroidStringManager) ((LambdaProvider) zzljVar.zza).lambda.invoke();
                ShippingAddressService shippingAddressService2 = (ShippingAddressService) ((DoubleCheck) zzljVar.zzb).getValue();
                ShoppingAutofillAnalyticsHandler shoppingAutofillAnalyticsHandler2 = (ShoppingAutofillAnalyticsHandler) ((Provider) zzljVar.zzc).invoke();
                RealProfileManager realProfileManager = (RealProfileManager) ((DelegateFactory) zzljVar.zze).invoke();
                FeatureFlagManager featureFlagManager6 = (FeatureFlagManager) ((DoubleCheck) zzljVar.zzd).getValue();
                RealAutofillNetworkFailureMessageGenerator realAutofillNetworkFailureMessageGenerator2 = (RealAutofillNetworkFailureMessageGenerator) ((Provider) zzljVar.zzf).invoke();
                androidStringManager14.getClass();
                shippingAddressService2.getClass();
                shoppingAutofillAnalyticsHandler2.getClass();
                realProfileManager.getClass();
                featureFlagManager6.getClass();
                realAutofillNetworkFailureMessageGenerator2.getClass();
                return MoleculePresenterKt.asPresenter$default(new LocalEditorialPresenter((AutofillScreen) screen, screenNavigator, androidStringManager14, shippingAddressService2, shoppingAutofillAnalyticsHandler2, realProfileManager, featureFlagManager6, realAutofillNetworkFailureMessageGenerator2));
        }
    }

    public MoneyPresenterFactory(InviteContactsPresenter$Factory$Impl inviteContactsPresenter$Factory$Impl, InvitesReferralRulesBottomSheetPresenter$Factory$Impl invitesReferralRulesBottomSheetPresenter$Factory$Impl, InviteErrorPresenter$Factory$Impl inviteErrorPresenter$Factory$Impl) {
        this.$r8$classId = 6;
        this.moneyTabPresenterFactory = inviteContactsPresenter$Factory$Impl;
        this.hypeWelcomePresenterFactory = inviteErrorPresenter$Factory$Impl;
    }

    public /* synthetic */ MoneyPresenterFactory(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.moneyTabPresenterFactory = obj;
        this.hypeWelcomePresenterFactory = obj2;
    }
}
