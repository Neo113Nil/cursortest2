package com.squareup.cash.payments.presenters;

import android.content.Context;
import androidx.compose.ui.node.NodeChain;
import app.cash.broadway.presenter.Presenter;
import app.cash.broadway.presenter.PresenterFactory;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt;
import app.cash.broadway.screen.Screen;
import app.cash.local.presenters.pos.LocalPosLocalCashRedemptionPresenter;
import coil3.RealImageLoader;
import com.squareup.cash.NavigationSideEffects;
import com.squareup.cash.account.presenters.ThemeSwitcherPresenter$MetroFactory;
import com.squareup.cash.appforeground.AppForegroundStateProvider;
import com.squareup.cash.blockers.presenters.SsnPresenter;
import com.squareup.cash.braze.RealBrazeManager;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.card.onboarding.StampSheetPresenter$MetroFactory;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clipboard.RealClipboardObserver;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.backend.balance.RealCryptoBalanceRepo;
import com.squareup.cash.crypto.backend.stablecoin.StablecoinNetworkRepo;
import com.squareup.cash.crypto.navigation.CryptoFlowStarter;
import com.squareup.cash.data.activity.PaymentNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.profile.RealJurisdictionConfigManager;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.google.pay.payments.api.GooglePayPaymentsClient;
import com.squareup.cash.history.navigation.PaymentActionHandler;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.instruments.backend.real.RealInstrumentManager;
import com.squareup.cash.instruments.backend.real.RealInstrumentRowLoader;
import com.squareup.cash.instruments.backend.real.RealInstrumentSelectorManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.invitations.InviteErrorPresenter;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.localization.RealLocaleManager;
import com.squareup.cash.merchant.presenters.MerchantInfoFeedbackPresenter$MetroFactory;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.music.backend.real.RealMusicPlayer;
import com.squareup.cash.music.views.MusicViewFactory$MetroFactory;
import com.squareup.cash.nearby.backend.RealNearbyManager;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.onboarding.presenters.OnboardingLandingPresenter$MetroFactory;
import com.squareup.cash.payments.RealPaymentInitiator;
import com.squareup.cash.payments.backend.api.OfflineManager;
import com.squareup.cash.payments.backend.real.RealStatusAndLimitsManager;
import com.squareup.cash.payments.presenters.PaymentConfigurationPresenter;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.permissions.ModifiablePermissions;
import com.squareup.cash.profile.presenters.AddAliasPresenter;
import com.squareup.cash.profile.presenters.ErrorPresenter;
import com.squareup.cash.profile.presenters.TaxesPasswordPresenter$MetroFactory;
import com.squareup.cash.reactions.real.RealReactionManager;
import com.squareup.cash.recipients.data.RealRecipientRepository;
import com.squareup.cash.resource.AndroidDateFormatManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.savings.presenters.TransferInPresenter$MetroFactory;
import com.squareup.cash.score.views.ScoreUiFactory;
import com.squareup.cash.securitysignals.api.SecuritySignalsAggregator;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.sharesheet.ShareSheetPresenter;
import com.squareup.cash.shopping.presenters.RealShoppingJavascriptPresenter;
import com.squareup.cash.storage.AndroidFileSaver;
import com.squareup.cash.support.presenters.ArticlePresenter;
import com.squareup.cash.tabs.presenters.TabToolbarPresenter;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.cash.tax.presenters.TaxReturnsPresenter;
import com.squareup.cash.tax.presenters.TaxTooltipPresenter$MetroFactory;
import com.squareup.cash.ui.BroadwayModule$ProvideBroadwayMetroFactory;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.util.network.impl.RealNetworkInfo;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.kotterknife.Lazy;
import com.squareup.preferences.BooleanPreference;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.nearby.api.v1.NearbySessionService;
import com.squareup.protos.franklin.app.AppService;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DelegateFactory;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import io.noties.markwon.MarkwonConfiguration;
import kotlin.coroutines.CoroutineContext;
import okhttp3.internal.publicsuffix.AssetPublicSuffixList;
import okio.internal.DefaultSocket;
import retrofit2.Retrofit;

/* loaded from: classes.dex */
public final class PaymentsPresenterFactory implements PresenterFactory {
    public final ConfirmDuplicateDialogPresenter$Factory$Impl confirmDuplicateDialogPresenter;
    public final ConfirmRecipientDialogPresenter$Factory$Impl confirmRecipientDialogPresenterFactory;
    public final DuplicatePaymentPresenter$Factory$Impl duplicatePaymentPresenter;
    public final MainPaymentPresenter$Factory$Impl mainPaymentPresenterFactory;
    public final NearbyPayRequestHelpPresenter$Factory$Impl nearbyPayRequestHelpPresenter;
    public final NearbyPayRequestPresenter$Factory$Impl nearbyPayRequestPresenter;
    public final NearbyPayersSheetPresenter$Factory$Impl nearbyPayersSheetPresenterFactory;
    public final NearbyPaymentKeypadPresenter$Factory$Impl nearbyPaymentKeypadPresenterFactory;
    public final NearbyPaymentsInfoPresenter$Factory$Impl nearbyPaymentsInfoPresenter;
    public final NearbyPeopleOverflowSheetPresenter$Factory$Impl nearbyPeopleOverflowSheetPresenter;
    public final NearbyPermissionsPromptSheetPresenter$Factory$Impl nearbyPermissionsPromptSheetPresenter;
    public final NoteRequiredPresenter$Factory$Impl noteRequiredPresenter;
    public final PaymentClaimPresenter$Factory$Impl paymentClaimPresenterFactory;
    public final PaymentConfigurationPresenter$Factory$Impl paymentConfigurationPresenter;
    public final PaymentLoadingPresenter$Factory$Impl paymentLoadingPresenterFactory;
    public final PersonalizePaymentPresenter$Factory$Impl personalizePaymentPresenterFactory;
    public final PersonalizePaymentRecipientPresenter$Factory$Impl personalizePaymentRecipientPresenter;
    public final PersonalizePaymentStickersPresenter$Factory$Impl personalizePaymentStickersPresenterFactory;
    public final QuickPayDetailsPresenter$Factory$Impl quickPayDetailsPresenterFactory;
    public final QuickPayExitRouterPresenter$Factory$Impl quickPayExitRouter;
    public final QuickPayPresenter$Factory$Impl quickPayPresenterFactory;
    public final RecipientSelectionWarningPresenter$Factory$Impl recipientSelectionWarningPresenterFactory;
    public final SchedulePaymentPresenter$Factory$Impl schedulePaymentPresenter;

    public final class MetroFactory implements Factory {
        public final InstanceFactory confirmDuplicateDialogPresenter;
        public final InstanceFactory confirmRecipientDialogPresenterFactory;
        public final InstanceFactory contactSyncPresenter;
        public final InstanceFactory duplicatePaymentPresenter;
        public final InstanceFactory mainPaymentPresenterFactory;
        public final InstanceFactory nearbyPayRequestHelpPresenter;
        public final InstanceFactory nearbyPayRequestPresenter;
        public final InstanceFactory nearbyPayersSheetPresenterFactory;
        public final InstanceFactory nearbyPaymentKeypadPresenterFactory;
        public final InstanceFactory nearbyPaymentsInfoPresenter;
        public final InstanceFactory nearbyPeopleOverflowSheetPresenter;
        public final InstanceFactory nearbyPermissionsPromptSheetPresenter;
        public final InstanceFactory noteRequiredPresenter;
        public final InstanceFactory paymentClaimPresenterFactory;
        public final InstanceFactory paymentConfigurationPresenter;
        public final InstanceFactory paymentLoadingPresenterFactory;
        public final InstanceFactory personalizePaymentPresenterFactory;
        public final InstanceFactory personalizePaymentRecipientPresenter;
        public final InstanceFactory personalizePaymentStickersPresenterFactory;
        public final InstanceFactory quickPayDetailsPresenterFactory;
        public final InstanceFactory quickPayExitRouter;
        public final InstanceFactory quickPayPresenterFactory;
        public final InstanceFactory recipientSelectionWarningPresenterFactory;
        public final InstanceFactory schedulePaymentPresenter;
        public final InstanceFactory warningDialogPresenterFactory;

        public MetroFactory(InstanceFactory instanceFactory, InstanceFactory instanceFactory2, InstanceFactory instanceFactory3, InstanceFactory instanceFactory4, InstanceFactory instanceFactory5, InstanceFactory instanceFactory6, InstanceFactory instanceFactory7, InstanceFactory instanceFactory8, InstanceFactory instanceFactory9, InstanceFactory instanceFactory10, InstanceFactory instanceFactory11, InstanceFactory instanceFactory12, InstanceFactory instanceFactory13, InstanceFactory instanceFactory14, InstanceFactory instanceFactory15, InstanceFactory instanceFactory16, InstanceFactory instanceFactory17, InstanceFactory instanceFactory18, InstanceFactory instanceFactory19, InstanceFactory instanceFactory20, InstanceFactory instanceFactory21, InstanceFactory instanceFactory22, InstanceFactory instanceFactory23, InstanceFactory instanceFactory24, InstanceFactory instanceFactory25) {
            this.mainPaymentPresenterFactory = instanceFactory;
            this.confirmRecipientDialogPresenterFactory = instanceFactory2;
            this.recipientSelectionWarningPresenterFactory = instanceFactory3;
            this.quickPayPresenterFactory = instanceFactory4;
            this.quickPayDetailsPresenterFactory = instanceFactory5;
            this.paymentClaimPresenterFactory = instanceFactory6;
            this.paymentLoadingPresenterFactory = instanceFactory7;
            this.personalizePaymentPresenterFactory = instanceFactory8;
            this.personalizePaymentRecipientPresenter = instanceFactory9;
            this.warningDialogPresenterFactory = instanceFactory10;
            this.personalizePaymentStickersPresenterFactory = instanceFactory11;
            this.contactSyncPresenter = instanceFactory12;
            this.quickPayExitRouter = instanceFactory13;
            this.confirmDuplicateDialogPresenter = instanceFactory14;
            this.noteRequiredPresenter = instanceFactory15;
            this.paymentConfigurationPresenter = instanceFactory16;
            this.duplicatePaymentPresenter = instanceFactory17;
            this.nearbyPayRequestPresenter = instanceFactory18;
            this.nearbyPermissionsPromptSheetPresenter = instanceFactory19;
            this.nearbyPaymentKeypadPresenterFactory = instanceFactory20;
            this.nearbyPayersSheetPresenterFactory = instanceFactory21;
            this.nearbyPayRequestHelpPresenter = instanceFactory22;
            this.nearbyPaymentsInfoPresenter = instanceFactory23;
            this.nearbyPeopleOverflowSheetPresenter = instanceFactory24;
            this.schedulePaymentPresenter = instanceFactory25;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            MainPaymentPresenter$Factory$Impl mainPaymentPresenter$Factory$Impl = (MainPaymentPresenter$Factory$Impl) this.mainPaymentPresenterFactory.value;
            ConfirmRecipientDialogPresenter$Factory$Impl confirmRecipientDialogPresenter$Factory$Impl = (ConfirmRecipientDialogPresenter$Factory$Impl) this.confirmRecipientDialogPresenterFactory.value;
            RecipientSelectionWarningPresenter$Factory$Impl recipientSelectionWarningPresenter$Factory$Impl = (RecipientSelectionWarningPresenter$Factory$Impl) this.recipientSelectionWarningPresenterFactory.value;
            QuickPayPresenter$Factory$Impl quickPayPresenter$Factory$Impl = (QuickPayPresenter$Factory$Impl) this.quickPayPresenterFactory.value;
            QuickPayDetailsPresenter$Factory$Impl quickPayDetailsPresenter$Factory$Impl = (QuickPayDetailsPresenter$Factory$Impl) this.quickPayDetailsPresenterFactory.value;
            PaymentClaimPresenter$Factory$Impl paymentClaimPresenter$Factory$Impl = (PaymentClaimPresenter$Factory$Impl) this.paymentClaimPresenterFactory.value;
            PaymentLoadingPresenter$Factory$Impl paymentLoadingPresenter$Factory$Impl = (PaymentLoadingPresenter$Factory$Impl) this.paymentLoadingPresenterFactory.value;
            PersonalizePaymentPresenter$Factory$Impl personalizePaymentPresenter$Factory$Impl = (PersonalizePaymentPresenter$Factory$Impl) this.personalizePaymentPresenterFactory.value;
            PersonalizePaymentRecipientPresenter$Factory$Impl personalizePaymentRecipientPresenter$Factory$Impl = (PersonalizePaymentRecipientPresenter$Factory$Impl) this.personalizePaymentRecipientPresenter.value;
            WarningDialogPresenter$Factory$Impl warningDialogPresenter$Factory$Impl = (WarningDialogPresenter$Factory$Impl) this.warningDialogPresenterFactory.value;
            PersonalizePaymentStickersPresenter$Factory$Impl personalizePaymentStickersPresenter$Factory$Impl = (PersonalizePaymentStickersPresenter$Factory$Impl) this.personalizePaymentStickersPresenterFactory.value;
            ContactSyncPresenter$Factory$Impl contactSyncPresenter$Factory$Impl = (ContactSyncPresenter$Factory$Impl) this.contactSyncPresenter.value;
            QuickPayExitRouterPresenter$Factory$Impl quickPayExitRouterPresenter$Factory$Impl = (QuickPayExitRouterPresenter$Factory$Impl) this.quickPayExitRouter.value;
            ConfirmDuplicateDialogPresenter$Factory$Impl confirmDuplicateDialogPresenter$Factory$Impl = (ConfirmDuplicateDialogPresenter$Factory$Impl) this.confirmDuplicateDialogPresenter.value;
            NoteRequiredPresenter$Factory$Impl noteRequiredPresenter$Factory$Impl = (NoteRequiredPresenter$Factory$Impl) this.noteRequiredPresenter.value;
            PaymentConfigurationPresenter$Factory$Impl paymentConfigurationPresenter$Factory$Impl = (PaymentConfigurationPresenter$Factory$Impl) this.paymentConfigurationPresenter.value;
            DuplicatePaymentPresenter$Factory$Impl duplicatePaymentPresenter$Factory$Impl = (DuplicatePaymentPresenter$Factory$Impl) this.duplicatePaymentPresenter.value;
            NearbyPayRequestPresenter$Factory$Impl nearbyPayRequestPresenter$Factory$Impl = (NearbyPayRequestPresenter$Factory$Impl) this.nearbyPayRequestPresenter.value;
            NearbyPermissionsPromptSheetPresenter$Factory$Impl nearbyPermissionsPromptSheetPresenter$Factory$Impl = (NearbyPermissionsPromptSheetPresenter$Factory$Impl) this.nearbyPermissionsPromptSheetPresenter.value;
            NearbyPaymentKeypadPresenter$Factory$Impl nearbyPaymentKeypadPresenter$Factory$Impl = (NearbyPaymentKeypadPresenter$Factory$Impl) this.nearbyPaymentKeypadPresenterFactory.value;
            NearbyPayersSheetPresenter$Factory$Impl nearbyPayersSheetPresenter$Factory$Impl = (NearbyPayersSheetPresenter$Factory$Impl) this.nearbyPayersSheetPresenterFactory.value;
            NearbyPayRequestHelpPresenter$Factory$Impl nearbyPayRequestHelpPresenter$Factory$Impl = (NearbyPayRequestHelpPresenter$Factory$Impl) this.nearbyPayRequestHelpPresenter.value;
            NearbyPaymentsInfoPresenter$Factory$Impl nearbyPaymentsInfoPresenter$Factory$Impl = (NearbyPaymentsInfoPresenter$Factory$Impl) this.nearbyPaymentsInfoPresenter.value;
            NearbyPeopleOverflowSheetPresenter$Factory$Impl nearbyPeopleOverflowSheetPresenter$Factory$Impl = (NearbyPeopleOverflowSheetPresenter$Factory$Impl) this.nearbyPeopleOverflowSheetPresenter.value;
            SchedulePaymentPresenter$Factory$Impl schedulePaymentPresenter$Factory$Impl = (SchedulePaymentPresenter$Factory$Impl) this.schedulePaymentPresenter.value;
            mainPaymentPresenter$Factory$Impl.getClass();
            confirmRecipientDialogPresenter$Factory$Impl.getClass();
            recipientSelectionWarningPresenter$Factory$Impl.getClass();
            quickPayPresenter$Factory$Impl.getClass();
            quickPayDetailsPresenter$Factory$Impl.getClass();
            paymentClaimPresenter$Factory$Impl.getClass();
            paymentLoadingPresenter$Factory$Impl.getClass();
            personalizePaymentPresenter$Factory$Impl.getClass();
            personalizePaymentRecipientPresenter$Factory$Impl.getClass();
            warningDialogPresenter$Factory$Impl.getClass();
            personalizePaymentStickersPresenter$Factory$Impl.getClass();
            contactSyncPresenter$Factory$Impl.getClass();
            quickPayExitRouterPresenter$Factory$Impl.getClass();
            confirmDuplicateDialogPresenter$Factory$Impl.getClass();
            noteRequiredPresenter$Factory$Impl.getClass();
            paymentConfigurationPresenter$Factory$Impl.getClass();
            duplicatePaymentPresenter$Factory$Impl.getClass();
            nearbyPayRequestPresenter$Factory$Impl.getClass();
            nearbyPermissionsPromptSheetPresenter$Factory$Impl.getClass();
            nearbyPaymentKeypadPresenter$Factory$Impl.getClass();
            nearbyPayersSheetPresenter$Factory$Impl.getClass();
            nearbyPayRequestHelpPresenter$Factory$Impl.getClass();
            nearbyPaymentsInfoPresenter$Factory$Impl.getClass();
            nearbyPeopleOverflowSheetPresenter$Factory$Impl.getClass();
            schedulePaymentPresenter$Factory$Impl.getClass();
            return new PaymentsPresenterFactory(mainPaymentPresenter$Factory$Impl, confirmRecipientDialogPresenter$Factory$Impl, recipientSelectionWarningPresenter$Factory$Impl, quickPayPresenter$Factory$Impl, quickPayDetailsPresenter$Factory$Impl, paymentClaimPresenter$Factory$Impl, paymentLoadingPresenter$Factory$Impl, personalizePaymentPresenter$Factory$Impl, personalizePaymentRecipientPresenter$Factory$Impl, warningDialogPresenter$Factory$Impl, personalizePaymentStickersPresenter$Factory$Impl, contactSyncPresenter$Factory$Impl, quickPayExitRouterPresenter$Factory$Impl, confirmDuplicateDialogPresenter$Factory$Impl, noteRequiredPresenter$Factory$Impl, paymentConfigurationPresenter$Factory$Impl, duplicatePaymentPresenter$Factory$Impl, nearbyPayRequestPresenter$Factory$Impl, nearbyPermissionsPromptSheetPresenter$Factory$Impl, nearbyPaymentKeypadPresenter$Factory$Impl, nearbyPayersSheetPresenter$Factory$Impl, nearbyPayRequestHelpPresenter$Factory$Impl, nearbyPaymentsInfoPresenter$Factory$Impl, nearbyPeopleOverflowSheetPresenter$Factory$Impl, schedulePaymentPresenter$Factory$Impl);
        }
    }

    public PaymentsPresenterFactory(MainPaymentPresenter$Factory$Impl mainPaymentPresenter$Factory$Impl, ConfirmRecipientDialogPresenter$Factory$Impl confirmRecipientDialogPresenter$Factory$Impl, RecipientSelectionWarningPresenter$Factory$Impl recipientSelectionWarningPresenter$Factory$Impl, QuickPayPresenter$Factory$Impl quickPayPresenter$Factory$Impl, QuickPayDetailsPresenter$Factory$Impl quickPayDetailsPresenter$Factory$Impl, PaymentClaimPresenter$Factory$Impl paymentClaimPresenter$Factory$Impl, PaymentLoadingPresenter$Factory$Impl paymentLoadingPresenter$Factory$Impl, PersonalizePaymentPresenter$Factory$Impl personalizePaymentPresenter$Factory$Impl, PersonalizePaymentRecipientPresenter$Factory$Impl personalizePaymentRecipientPresenter$Factory$Impl, WarningDialogPresenter$Factory$Impl warningDialogPresenter$Factory$Impl, PersonalizePaymentStickersPresenter$Factory$Impl personalizePaymentStickersPresenter$Factory$Impl, ContactSyncPresenter$Factory$Impl contactSyncPresenter$Factory$Impl, QuickPayExitRouterPresenter$Factory$Impl quickPayExitRouterPresenter$Factory$Impl, ConfirmDuplicateDialogPresenter$Factory$Impl confirmDuplicateDialogPresenter$Factory$Impl, NoteRequiredPresenter$Factory$Impl noteRequiredPresenter$Factory$Impl, PaymentConfigurationPresenter$Factory$Impl paymentConfigurationPresenter$Factory$Impl, DuplicatePaymentPresenter$Factory$Impl duplicatePaymentPresenter$Factory$Impl, NearbyPayRequestPresenter$Factory$Impl nearbyPayRequestPresenter$Factory$Impl, NearbyPermissionsPromptSheetPresenter$Factory$Impl nearbyPermissionsPromptSheetPresenter$Factory$Impl, NearbyPaymentKeypadPresenter$Factory$Impl nearbyPaymentKeypadPresenter$Factory$Impl, NearbyPayersSheetPresenter$Factory$Impl nearbyPayersSheetPresenter$Factory$Impl, NearbyPayRequestHelpPresenter$Factory$Impl nearbyPayRequestHelpPresenter$Factory$Impl, NearbyPaymentsInfoPresenter$Factory$Impl nearbyPaymentsInfoPresenter$Factory$Impl, NearbyPeopleOverflowSheetPresenter$Factory$Impl nearbyPeopleOverflowSheetPresenter$Factory$Impl, SchedulePaymentPresenter$Factory$Impl schedulePaymentPresenter$Factory$Impl) {
        this.mainPaymentPresenterFactory = mainPaymentPresenter$Factory$Impl;
        this.confirmRecipientDialogPresenterFactory = confirmRecipientDialogPresenter$Factory$Impl;
        this.recipientSelectionWarningPresenterFactory = recipientSelectionWarningPresenter$Factory$Impl;
        this.quickPayPresenterFactory = quickPayPresenter$Factory$Impl;
        this.quickPayDetailsPresenterFactory = quickPayDetailsPresenter$Factory$Impl;
        this.paymentClaimPresenterFactory = paymentClaimPresenter$Factory$Impl;
        this.paymentLoadingPresenterFactory = paymentLoadingPresenter$Factory$Impl;
        this.personalizePaymentPresenterFactory = personalizePaymentPresenter$Factory$Impl;
        this.personalizePaymentRecipientPresenter = personalizePaymentRecipientPresenter$Factory$Impl;
        this.personalizePaymentStickersPresenterFactory = personalizePaymentStickersPresenter$Factory$Impl;
        this.quickPayExitRouter = quickPayExitRouterPresenter$Factory$Impl;
        this.confirmDuplicateDialogPresenter = confirmDuplicateDialogPresenter$Factory$Impl;
        this.noteRequiredPresenter = noteRequiredPresenter$Factory$Impl;
        this.paymentConfigurationPresenter = paymentConfigurationPresenter$Factory$Impl;
        this.duplicatePaymentPresenter = duplicatePaymentPresenter$Factory$Impl;
        this.nearbyPayRequestPresenter = nearbyPayRequestPresenter$Factory$Impl;
        this.nearbyPermissionsPromptSheetPresenter = nearbyPermissionsPromptSheetPresenter$Factory$Impl;
        this.nearbyPaymentKeypadPresenterFactory = nearbyPaymentKeypadPresenter$Factory$Impl;
        this.nearbyPayersSheetPresenterFactory = nearbyPayersSheetPresenter$Factory$Impl;
        this.nearbyPayRequestHelpPresenter = nearbyPayRequestHelpPresenter$Factory$Impl;
        this.nearbyPaymentsInfoPresenter = nearbyPaymentsInfoPresenter$Factory$Impl;
        this.nearbyPeopleOverflowSheetPresenter = nearbyPeopleOverflowSheetPresenter$Factory$Impl;
        this.schedulePaymentPresenter = schedulePaymentPresenter$Factory$Impl;
    }

    @Override // app.cash.broadway.presenter.PresenterFactory
    public final Presenter create(Screen screen, BetterNavigator.ScreenNavigator screenNavigator) {
        screen.getClass();
        if (screen instanceof PaymentScreens.MainPayment) {
            PaymentActionHandler.MetroFactory metroFactory = this.mainPaymentPresenterFactory.delegateFactory;
            FlowStarter flowStarter = (FlowStarter) metroFactory.intentFactory.invoke();
            Analytics analytics = (Analytics) metroFactory.activityEntityManager.invoke();
            RealRecipientRepository realRecipientRepository = (RealRecipientRepository) metroFactory.paymentManager.invoke();
            AndroidStringManager androidStringManager = (AndroidStringManager) metroFactory.flowStarter.invoke();
            RealProfileManager realProfileManager = (RealProfileManager) metroFactory.stringManager.invoke();
            RealJurisdictionConfigManager realJurisdictionConfigManager = (RealJurisdictionConfigManager) metroFactory.balanceSnapshotManager.invoke();
            FeatureFlagManager featureFlagManager = (FeatureFlagManager) metroFactory.instrumentManager.invoke();
            AppConfigManager appConfigManager = (AppConfigManager) metroFactory.appConfig.invoke();
            RealStatusAndLimitsManager realStatusAndLimitsManager = (RealStatusAndLimitsManager) metroFactory.clientSyncer.invoke();
            RealBalanceSnapshotManager realBalanceSnapshotManager = (RealBalanceSnapshotManager) metroFactory.profileSyncer.invoke();
            RealInstrumentManager realInstrumentManager = (RealInstrumentManager) metroFactory.appService.invoke();
            AndroidClock androidClock = (AndroidClock) metroFactory.cryptoService.invoke();
            IntentLauncher intentLauncher = (IntentLauncher) metroFactory.tradingService.invoke();
            RealUuidGenerator realUuidGenerator = (RealUuidGenerator) metroFactory.investingService.invoke();
            SessionManager sessionManager = (SessionManager) metroFactory.lendingAppService.invoke();
            BooleanPreference booleanPreference = (BooleanPreference) metroFactory.cashDatabase.invoke();
            RealPaymentInitiator realPaymentInitiator = (RealPaymentInitiator) metroFactory.clientRouteParser.invoke();
            Lazy lazy = (Lazy) ((BroadwayModule$ProvideBroadwayMetroFactory) metroFactory.paymentActionCompletionDispatcher).invoke();
            LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) metroFactory.ioDispatcher.invoke();
            RealNetworkInfo realNetworkInfo = (RealNetworkInfo) metroFactory.attributionEventEmitter.invoke();
            RealPersonalizePaymentManager realPersonalizePaymentManager = (RealPersonalizePaymentManager) metroFactory.supportNavigator.invoke();
            RealInstrumentSelectorManager realInstrumentSelectorManager = (RealInstrumentSelectorManager) metroFactory.customerStore.invoke();
            ToolbarTuckTargets toolbarTuckTargets = (ToolbarTuckTargets) ((MusicViewFactory$MetroFactory) metroFactory.scope).invoke();
            SecuritySignalsAggregator securitySignalsAggregator = (SecuritySignalsAggregator) metroFactory.analytics.invoke();
            ModifiablePermissions modifiablePermissions = (ModifiablePermissions) metroFactory.uuidGenerator.invoke();
            flowStarter.getClass();
            analytics.getClass();
            realRecipientRepository.getClass();
            androidStringManager.getClass();
            realProfileManager.getClass();
            realJurisdictionConfigManager.getClass();
            featureFlagManager.getClass();
            appConfigManager.getClass();
            realStatusAndLimitsManager.getClass();
            realBalanceSnapshotManager.getClass();
            realInstrumentManager.getClass();
            androidClock.getClass();
            intentLauncher.getClass();
            realUuidGenerator.getClass();
            sessionManager.getClass();
            booleanPreference.getClass();
            realPaymentInitiator.getClass();
            factory.getClass();
            realNetworkInfo.getClass();
            realPersonalizePaymentManager.getClass();
            realInstrumentSelectorManager.getClass();
            securitySignalsAggregator.getClass();
            modifiablePermissions.getClass();
            return MoleculePresenterKt.asPresenter$default(new MainPaymentPresenter(flowStarter, analytics, realRecipientRepository, androidStringManager, realProfileManager, realJurisdictionConfigManager, featureFlagManager, appConfigManager, realStatusAndLimitsManager, realBalanceSnapshotManager, realInstrumentManager, androidClock, intentLauncher, realUuidGenerator, sessionManager, booleanPreference, realPaymentInitiator, lazy, factory, realNetworkInfo, realPersonalizePaymentManager, realInstrumentSelectorManager, toolbarTuckTargets, securitySignalsAggregator, modifiablePermissions, (PaymentScreens.MainPayment) screen, screenNavigator));
        }
        if (screen instanceof PaymentScreens.ConfirmRecipient) {
            OnboardingLandingPresenter$MetroFactory onboardingLandingPresenter$MetroFactory = this.confirmRecipientDialogPresenterFactory.delegateFactory;
            AndroidStringManager androidStringManager2 = (AndroidStringManager) onboardingLandingPresenter$MetroFactory.observabilityManager.lambda.invoke();
            Analytics analytics2 = (Analytics) onboardingLandingPresenter$MetroFactory.analytics.getValue();
            RealLocaleManager realLocaleManager = (RealLocaleManager) onboardingLandingPresenter$MetroFactory.stringManager.lambda.invoke();
            androidStringManager2.getClass();
            analytics2.getClass();
            realLocaleManager.getClass();
            return MoleculePresenterKt.asPresenter$default(new SsnPresenter(androidStringManager2, analytics2, (PaymentScreens.ConfirmRecipient) screen, screenNavigator, realLocaleManager));
        }
        if (screen instanceof PaymentScreens.ConfirmDuplicate) {
            TaxTooltipPresenter$MetroFactory taxTooltipPresenter$MetroFactory = this.confirmDuplicateDialogPresenter.delegateFactory;
            AndroidStringManager androidStringManager3 = (AndroidStringManager) taxTooltipPresenter$MetroFactory.stringManager.lambda.invoke();
            LocalizedMoneyFormatter.Factory factory2 = (LocalizedMoneyFormatter.Factory) taxTooltipPresenter$MetroFactory.taxDesktopTooltipPreference.invoke();
            androidStringManager3.getClass();
            factory2.getClass();
            return MoleculePresenterKt.asPresenter$default(new TaxReturnsPresenter((PaymentScreens.ConfirmDuplicate) screen, screenNavigator, androidStringManager3, factory2));
        }
        if (screen instanceof PaymentScreens.RecipientSelectionWarningScreen) {
            AndroidStringManager androidStringManager4 = (AndroidStringManager) this.recipientSelectionWarningPresenterFactory.delegateFactory.stringManager.lambda.invoke();
            androidStringManager4.getClass();
            return MoleculePresenterKt.asPresenter$default(new InviteErrorPresenter(androidStringManager4, (PaymentScreens.RecipientSelectionWarningScreen) screen, screenNavigator));
        }
        if (screen instanceof PaymentScreens.NoteRequired) {
            StampSheetPresenter$MetroFactory stampSheetPresenter$MetroFactory = this.noteRequiredPresenter.delegateFactory;
            AndroidStringManager androidStringManager5 = (AndroidStringManager) stampSheetPresenter$MetroFactory.ioContext.lambda.invoke();
            Analytics analytics3 = (Analytics) stampSheetPresenter$MetroFactory.appConfig.getValue();
            androidStringManager5.getClass();
            analytics3.getClass();
            return MoleculePresenterKt.asPresenter$default(new TaxReturnsPresenter(androidStringManager5, analytics3, (PaymentScreens.NoteRequired) screen, screenNavigator));
        }
        if (screen instanceof PaymentScreens.ContactSyncPermissionScreen) {
            return MoleculePresenterKt.asPresenter$default(new AddAliasPresenter((PaymentScreens.ContactSyncPermissionScreen) screen, screenNavigator));
        }
        if (screen instanceof PaymentScreens.QuickPay) {
            ArticlePresenter.MetroFactory metroFactory2 = this.quickPayPresenterFactory.delegateFactory;
            Analytics analytics4 = (Analytics) ((DoubleCheck) metroFactory2.articlesService).getValue();
            RealPaymentInitiator realPaymentInitiator2 = (RealPaymentInitiator) metroFactory2.contactSupportNavigator.invoke();
            FlowStarter flowStarter2 = (FlowStarter) ((DoubleCheck) metroFactory2.transactionService).getValue();
            AndroidStringManager androidStringManager6 = (AndroidStringManager) ((LambdaProvider) metroFactory2.stringManager).lambda.invoke();
            RealBalanceSnapshotManager realBalanceSnapshotManager2 = (RealBalanceSnapshotManager) metroFactory2.linkNavigator.invoke();
            RealInstrumentManager realInstrumentManager2 = (RealInstrumentManager) metroFactory2.viewedArticlesStore.invoke();
            AppConfigManager appConfigManager2 = (AppConfigManager) ((DoubleCheck) metroFactory2.analytics).getValue();
            Lazy lazy2 = (Lazy) ((AndroidFileSaver.MetroFactory) metroFactory2.incidentsService).invoke();
            RealProfileManager realProfileManager2 = (RealProfileManager) ((DelegateFactory) metroFactory2.activityDataBridge).invoke();
            RealStatusAndLimitsManager realStatusAndLimitsManager2 = (RealStatusAndLimitsManager) metroFactory2.supportStatus.invoke();
            LocalizedMoneyFormatter.Factory factory3 = (LocalizedMoneyFormatter.Factory) metroFactory2.launcher.invoke();
            RealPersonalizePaymentManager realPersonalizePaymentManager2 = (RealPersonalizePaymentManager) ((DoubleCheck) metroFactory2.supportPhoneService).getValue();
            RealNetworkInfo realNetworkInfo2 = (RealNetworkInfo) metroFactory2.routerFactory.invoke();
            Lazy lazy3 = (Lazy) ((ScoreUiFactory.MetroFactory) metroFactory2.viewTokenGenerator).invoke();
            RealInstrumentSelectorManager realInstrumentSelectorManager2 = (RealInstrumentSelectorManager) metroFactory2.clock.invoke();
            SecuritySignalsAggregator securitySignalsAggregator2 = (SecuritySignalsAggregator) metroFactory2.observabilityManager.invoke();
            RealRecipientRepository realRecipientRepository2 = (RealRecipientRepository) metroFactory2.moshi.invoke();
            RealUuidGenerator realUuidGenerator2 = (RealUuidGenerator) ((LambdaProvider) metroFactory2.dateFormatManager).lambda.invoke();
            analytics4.getClass();
            realPaymentInitiator2.getClass();
            flowStarter2.getClass();
            androidStringManager6.getClass();
            realBalanceSnapshotManager2.getClass();
            realInstrumentManager2.getClass();
            appConfigManager2.getClass();
            realProfileManager2.getClass();
            realStatusAndLimitsManager2.getClass();
            factory3.getClass();
            realPersonalizePaymentManager2.getClass();
            realNetworkInfo2.getClass();
            realInstrumentSelectorManager2.getClass();
            securitySignalsAggregator2.getClass();
            realRecipientRepository2.getClass();
            realUuidGenerator2.getClass();
            return MoleculePresenterKt.asPresenter$default(new QuickPayPresenter(analytics4, realPaymentInitiator2, flowStarter2, androidStringManager6, realBalanceSnapshotManager2, realInstrumentManager2, appConfigManager2, lazy2, realProfileManager2, realStatusAndLimitsManager2, factory3, realPersonalizePaymentManager2, realNetworkInfo2, lazy3, realInstrumentSelectorManager2, securitySignalsAggregator2, realRecipientRepository2, realUuidGenerator2, (PaymentScreens.QuickPay) screen, screenNavigator));
        }
        if (screen instanceof PaymentScreens.QuickPayDetails) {
            StampSheetPresenter$MetroFactory stampSheetPresenter$MetroFactory2 = this.quickPayDetailsPresenterFactory.delegateFactory;
            Analytics analytics5 = (Analytics) stampSheetPresenter$MetroFactory2.appConfig.getValue();
            AndroidStringManager androidStringManager7 = (AndroidStringManager) stampSheetPresenter$MetroFactory2.ioContext.lambda.invoke();
            analytics5.getClass();
            androidStringManager7.getClass();
            return MoleculePresenterKt.asPresenter$default(new TaxReturnsPresenter(analytics5, androidStringManager7, (PaymentScreens.QuickPayDetails) screen, screenNavigator));
        }
        if (screen instanceof PaymentScreens.QuickPayExitRouterScreen) {
            RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) this.quickPayExitRouter.delegateFactory.staticImageLoader.invoke();
            realRouter$Factory$Impl.getClass();
            return MoleculePresenterKt.asPresenter$default(new InviteErrorPresenter((PaymentScreens.QuickPayExitRouterScreen) screen, screenNavigator, realRouter$Factory$Impl));
        }
        if (screen instanceof PaymentScreens.PaymentClaim) {
            Retrofit.Builder builder = this.paymentClaimPresenterFactory.delegateFactory;
            FlowStarter flowStarter3 = (FlowStarter) ((DoubleCheck) builder.callFactory).getValue();
            BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) ((Provider) builder.baseUrl).invoke();
            AppService appService = (AppService) ((DoubleCheck) builder.converterFactories).getValue();
            RealProfileManager realProfileManager3 = (RealProfileManager) ((DelegateFactory) builder.callAdapterFactories).invoke();
            AndroidStringManager androidStringManager8 = (AndroidStringManager) ((LambdaProvider) builder.callbackExecutor).lambda.invoke();
            flowStarter3.getClass();
            blockersDataNavigator.getClass();
            appService.getClass();
            realProfileManager3.getClass();
            androidStringManager8.getClass();
            return MoleculePresenterKt.asPresenter$default(new PaymentClaimPresenter(flowStarter3, blockersDataNavigator, appService, realProfileManager3, androidStringManager8, (PaymentScreens.PaymentClaim) screen, screenNavigator));
        }
        if (screen instanceof PaymentScreens.PaymentLoading) {
            ThemeSwitcherPresenter$MetroFactory themeSwitcherPresenter$MetroFactory = this.paymentLoadingPresenterFactory.delegateFactory;
            PaymentNavigator paymentNavigator = (PaymentNavigator) themeSwitcherPresenter$MetroFactory.paymentPadThemeSelection.invoke();
            BlockersDataNavigator blockersDataNavigator2 = (BlockersDataNavigator) themeSwitcherPresenter$MetroFactory.routerFactory.invoke();
            FlowStarter flowStarter4 = (FlowStarter) themeSwitcherPresenter$MetroFactory.analytics.getValue();
            FeatureFlagManager featureFlagManager2 = (FeatureFlagManager) themeSwitcherPresenter$MetroFactory.postcardService.getValue();
            RealObservabilityManager realObservabilityManager = (RealObservabilityManager) themeSwitcherPresenter$MetroFactory.stringManager.lambda.invoke();
            Analytics analytics6 = (Analytics) themeSwitcherPresenter$MetroFactory.featureFlagManager.getValue();
            paymentNavigator.getClass();
            blockersDataNavigator2.getClass();
            flowStarter4.getClass();
            featureFlagManager2.getClass();
            realObservabilityManager.getClass();
            analytics6.getClass();
            return MoleculePresenterKt.asPresenter$default(new PaymentLoadingPresenter(paymentNavigator, blockersDataNavigator2, flowStarter4, featureFlagManager2, realObservabilityManager, analytics6, (PaymentScreens.PaymentLoading) screen, screenNavigator));
        }
        if (screen instanceof PaymentScreens.PersonalizePayment) {
            TabToolbarPresenter.MetroFactory metroFactory3 = this.personalizePaymentPresenterFactory.delegateFactory;
            RealPaymentInitiator realPaymentInitiator3 = (RealPaymentInitiator) metroFactory3.sessionManager.invoke();
            RealCryptoBalanceRepo realCryptoBalanceRepo = (RealCryptoBalanceRepo) metroFactory3.profileManager.invoke();
            RealBalanceSnapshotManager realBalanceSnapshotManager3 = (RealBalanceSnapshotManager) metroFactory3.badges.invoke();
            RealInstrumentManager realInstrumentManager3 = (RealInstrumentManager) metroFactory3.badger2.invoke();
            AndroidStringManager androidStringManager9 = (AndroidStringManager) ((LambdaProvider) metroFactory3.moneybotFlagsHelper).lambda.invoke();
            RealNetworkInfo realNetworkInfo3 = (RealNetworkInfo) metroFactory3.featureFlagManager.invoke();
            Analytics analytics7 = (Analytics) ((DoubleCheck) metroFactory3.moneybotAnalyticsService).getValue();
            RealObservabilityManager realObservabilityManager2 = (RealObservabilityManager) ((LambdaProvider) metroFactory3.sessionFlags).lambda.invoke();
            FeatureFlagManager featureFlagManager3 = (FeatureFlagManager) ((DoubleCheck) metroFactory3.syncValueReader).getValue();
            RealPersonalizePaymentManager realPersonalizePaymentManager3 = (RealPersonalizePaymentManager) ((DoubleCheck) metroFactory3.p2pSettingsManager).getValue();
            SecuritySignalsAggregator securitySignalsAggregator3 = (SecuritySignalsAggregator) metroFactory3.bitcoinCapabilityProvider.invoke();
            RealMusicPlayer realMusicPlayer = (RealMusicPlayer) ((DoubleCheck) metroFactory3.familyNavigatorFactory).getValue();
            LocalizedMoneyFormatter.Factory factory4 = (LocalizedMoneyFormatter.Factory) metroFactory3.badgingStateAccessibilityHelper.invoke();
            KeyValue keyValue = (KeyValue) ((DoubleCheck) metroFactory3.familyProfileManager).getValue();
            RealImageLoader realImageLoader = (RealImageLoader) ((DoubleCheck) metroFactory3.balanceSnapshotManager).getValue();
            PersonalizationDraftStore personalizationDraftStore = (PersonalizationDraftStore) ((DoubleCheck) metroFactory3.moneyFormatterFactory).getValue();
            Context context = (Context) ((DoubleCheck) metroFactory3.tabToolbarOutboundNavigatorFactory).getValue();
            realPaymentInitiator3.getClass();
            realCryptoBalanceRepo.getClass();
            realBalanceSnapshotManager3.getClass();
            realInstrumentManager3.getClass();
            androidStringManager9.getClass();
            realNetworkInfo3.getClass();
            analytics7.getClass();
            realObservabilityManager2.getClass();
            featureFlagManager3.getClass();
            realPersonalizePaymentManager3.getClass();
            securitySignalsAggregator3.getClass();
            realMusicPlayer.getClass();
            factory4.getClass();
            keyValue.getClass();
            realImageLoader.getClass();
            personalizationDraftStore.getClass();
            context.getClass();
            return MoleculePresenterKt.asPresenter$default(new PersonalizePaymentPresenter((PaymentScreens.PersonalizePayment) screen, screenNavigator, realPaymentInitiator3, realCryptoBalanceRepo, realBalanceSnapshotManager3, realInstrumentManager3, androidStringManager9, realNetworkInfo3, analytics7, realObservabilityManager2, featureFlagManager3, realPersonalizePaymentManager3, securitySignalsAggregator3, realMusicPlayer, factory4, keyValue, realImageLoader, personalizationDraftStore, context));
        }
        if (screen instanceof PaymentScreens.PersonalizePaymentRecipient) {
            RealShoppingJavascriptPresenter.MetroFactory metroFactory4 = this.personalizePaymentRecipientPresenter.delegateFactory;
            LocalizedMoneyFormatter.Factory factory5 = (LocalizedMoneyFormatter.Factory) metroFactory4.autofillManagerProvider.invoke();
            CoroutineContext coroutineContext = (CoroutineContext) metroFactory4.ioDispatcher.lambda.invoke();
            RealPersonalizePaymentManager realPersonalizePaymentManager4 = (RealPersonalizePaymentManager) metroFactory4.analytics.getValue();
            RealReactionManager realReactionManager = (RealReactionManager) metroFactory4.cashApProxyService.getValue();
            Analytics analytics8 = (Analytics) metroFactory4.franklinAppService.getValue();
            FeatureFlagManager featureFlagManager4 = (FeatureFlagManager) metroFactory4.shopHubAnalyticsHelper.getValue();
            AndroidStringManager androidStringManager10 = (AndroidStringManager) metroFactory4.stringManager.lambda.invoke();
            RealMusicPlayer realMusicPlayer2 = (RealMusicPlayer) metroFactory4.featureFlagManager.getValue();
            factory5.getClass();
            coroutineContext.getClass();
            realPersonalizePaymentManager4.getClass();
            realReactionManager.getClass();
            analytics8.getClass();
            featureFlagManager4.getClass();
            androidStringManager10.getClass();
            realMusicPlayer2.getClass();
            return MoleculePresenterKt.asPresenter$default(new PersonalizePaymentRecipientPresenter(factory5, (PaymentScreens.PersonalizePaymentRecipient) screen, screenNavigator, coroutineContext, realPersonalizePaymentManager4, realReactionManager, analytics8, featureFlagManager4, androidStringManager10, realMusicPlayer2));
        }
        if (screen instanceof PaymentScreens.WarningDialog) {
            return MoleculePresenterKt.asPresenter$default(new ErrorPresenter((PaymentScreens.WarningDialog) screen, screenNavigator));
        }
        if (screen instanceof PaymentScreens.PersonalizePaymentStickers) {
            TaxesPasswordPresenter$MetroFactory taxesPasswordPresenter$MetroFactory = this.personalizePaymentStickersPresenterFactory.delegateFactory;
            Analytics analytics9 = (Analytics) taxesPasswordPresenter$MetroFactory.syncValueReader.getValue();
            RealPersonalizePaymentManager realPersonalizePaymentManager5 = (RealPersonalizePaymentManager) taxesPasswordPresenter$MetroFactory.flowStarter.getValue();
            analytics9.getClass();
            realPersonalizePaymentManager5.getClass();
            return MoleculePresenterKt.asPresenter$default(new TaxReturnsPresenter((PaymentScreens.PersonalizePaymentStickers) screen, screenNavigator, analytics9, realPersonalizePaymentManager5));
        }
        if (screen instanceof PaymentScreens.PaymentConfiguration) {
            PaymentConfigurationPresenter.MetroFactory metroFactory5 = this.paymentConfigurationPresenter.delegateFactory;
            RealRecipientRepository realRecipientRepository3 = (RealRecipientRepository) metroFactory5.recipientRepository.invoke();
            RealProfileManager realProfileManager4 = (RealProfileManager) metroFactory5.profileManager.invoke();
            AndroidStringManager androidStringManager11 = (AndroidStringManager) metroFactory5.stringManager.invoke();
            RealPaymentInitiator realPaymentInitiator4 = (RealPaymentInitiator) metroFactory5.paymentInitiator.invoke();
            RealBalanceSnapshotManager realBalanceSnapshotManager4 = (RealBalanceSnapshotManager) metroFactory5.balanceSnapshotManager.invoke();
            IntentLauncher intentLauncher2 = (IntentLauncher) metroFactory5.intentLauncher.invoke();
            FeatureFlagManager featureFlagManager5 = (FeatureFlagManager) metroFactory5.featureFlagManager.invoke();
            RealFeatureEligibilityRepository realFeatureEligibilityRepository = (RealFeatureEligibilityRepository) metroFactory5.featureEligibilityRepository.invoke();
            GooglePayPaymentsClient googlePayPaymentsClient = (GooglePayPaymentsClient) metroFactory5.googlePayPaymentsClient.invoke();
            RealInstrumentRowLoader realInstrumentRowLoader = (RealInstrumentRowLoader) metroFactory5.instrumentRowLoader.invoke();
            RealInstrumentManager realInstrumentManager4 = (RealInstrumentManager) metroFactory5.instrumentManager.invoke();
            AppConfigManager appConfigManager3 = (AppConfigManager) metroFactory5.appConfigManager.invoke();
            Analytics analytics10 = (Analytics) metroFactory5.analytics.invoke();
            RealNetworkInfo realNetworkInfo4 = (RealNetworkInfo) metroFactory5.networkInfo.invoke();
            RealStatusAndLimitsManager realStatusAndLimitsManager3 = (RealStatusAndLimitsManager) metroFactory5.statusAndLimitsManager.invoke();
            OfflineManager offlineManager = (OfflineManager) metroFactory5.offlineManager.invoke();
            SecuritySignalsAggregator securitySignalsAggregator4 = (SecuritySignalsAggregator) metroFactory5.securitySignalsAggregator.invoke();
            AssetPublicSuffixList assetPublicSuffixList = (AssetPublicSuffixList) ((NavigationSideEffects.MetroFactory) metroFactory5.paymentLinkRepository).invoke();
            StablecoinNetworkRepo stablecoinNetworkRepo = (StablecoinNetworkRepo) metroFactory5.stablecoinNetworkRepo.invoke();
            KeyValue keyValue2 = (KeyValue) metroFactory5.hasSeenStablecoinWithdrawalOnboarding.invoke();
            FlowStarter flowStarter5 = (FlowStarter) metroFactory5.flowStarter.invoke();
            BlockersDataNavigator blockersDataNavigator3 = (BlockersDataNavigator) metroFactory5.blockersDataNavigator.invoke();
            CryptoFlowStarter cryptoFlowStarter = (CryptoFlowStarter) metroFactory5.cryptoFlowStarter.invoke();
            RealClipboardObserver realClipboardObserver = (RealClipboardObserver) metroFactory5.clipboardObserver.invoke();
            RealPaymentConfigurationRouter$Factory$Impl realPaymentConfigurationRouter$Factory$Impl = (RealPaymentConfigurationRouter$Factory$Impl) metroFactory5.paymentConfigurationRouterFactory.value;
            BooleanPreference booleanPreference2 = (BooleanPreference) metroFactory5.askedContactsPaymentPreference.invoke();
            ModifiablePermissions modifiablePermissions2 = (ModifiablePermissions) metroFactory5.contactsPermission.invoke();
            CoroutineContext coroutineContext2 = (CoroutineContext) metroFactory5.ioDispatcher.invoke();
            AndroidClock androidClock2 = (AndroidClock) metroFactory5.clock.invoke();
            RealUuidGenerator realUuidGenerator3 = (RealUuidGenerator) metroFactory5.uuidGenerator.invoke();
            LocalizedMoneyFormatter.Factory factory6 = (LocalizedMoneyFormatter.Factory) metroFactory5.moneyFormatterFactory.invoke();
            RealPersonalizePaymentManager realPersonalizePaymentManager6 = (RealPersonalizePaymentManager) metroFactory5.personalizePaymentManager.invoke();
            KeyValue keyValue3 = (KeyValue) metroFactory5.recipientSelectorTooltipSeenCount.invoke();
            PersonalizationDraftStore personalizationDraftStore2 = (PersonalizationDraftStore) metroFactory5.draftStore.invoke();
            realRecipientRepository3.getClass();
            realProfileManager4.getClass();
            androidStringManager11.getClass();
            realPaymentInitiator4.getClass();
            realBalanceSnapshotManager4.getClass();
            intentLauncher2.getClass();
            featureFlagManager5.getClass();
            realFeatureEligibilityRepository.getClass();
            googlePayPaymentsClient.getClass();
            realInstrumentRowLoader.getClass();
            realInstrumentManager4.getClass();
            appConfigManager3.getClass();
            analytics10.getClass();
            realNetworkInfo4.getClass();
            realStatusAndLimitsManager3.getClass();
            offlineManager.getClass();
            securitySignalsAggregator4.getClass();
            stablecoinNetworkRepo.getClass();
            keyValue2.getClass();
            flowStarter5.getClass();
            blockersDataNavigator3.getClass();
            cryptoFlowStarter.getClass();
            realClipboardObserver.getClass();
            realPaymentConfigurationRouter$Factory$Impl.getClass();
            booleanPreference2.getClass();
            modifiablePermissions2.getClass();
            coroutineContext2.getClass();
            androidClock2.getClass();
            realUuidGenerator3.getClass();
            factory6.getClass();
            realPersonalizePaymentManager6.getClass();
            keyValue3.getClass();
            personalizationDraftStore2.getClass();
            return MoleculePresenterKt.asPresenter$default(new PaymentConfigurationPresenter((PaymentScreens.PaymentConfiguration) screen, screenNavigator, realRecipientRepository3, realProfileManager4, androidStringManager11, realPaymentInitiator4, realBalanceSnapshotManager4, intentLauncher2, featureFlagManager5, realFeatureEligibilityRepository, googlePayPaymentsClient, realInstrumentRowLoader, realInstrumentManager4, appConfigManager3, analytics10, realNetworkInfo4, realStatusAndLimitsManager3, offlineManager, securitySignalsAggregator4, assetPublicSuffixList, stablecoinNetworkRepo, keyValue2, flowStarter5, blockersDataNavigator3, cryptoFlowStarter, realClipboardObserver, realPaymentConfigurationRouter$Factory$Impl, booleanPreference2, modifiablePermissions2, coroutineContext2, androidClock2, realUuidGenerator3, factory6, realPersonalizePaymentManager6, keyValue3, personalizationDraftStore2));
        }
        if (screen instanceof PaymentScreens.DuplicatePayment) {
            TaxTooltipPresenter$MetroFactory taxTooltipPresenter$MetroFactory2 = this.duplicatePaymentPresenter.delegateFactory;
            AndroidStringManager androidStringManager12 = (AndroidStringManager) taxTooltipPresenter$MetroFactory2.stringManager.lambda.invoke();
            LocalizedMoneyFormatter.Factory factory7 = (LocalizedMoneyFormatter.Factory) taxTooltipPresenter$MetroFactory2.taxDesktopTooltipPreference.invoke();
            androidStringManager12.getClass();
            factory7.getClass();
            return MoleculePresenterKt.asPresenter$default(new TaxReturnsPresenter((PaymentScreens.DuplicatePayment) screen, screenNavigator, androidStringManager12, factory7));
        }
        if (screen instanceof PaymentScreens.NearbyPayRequest) {
            NodeChain nodeChain = this.nearbyPayRequestPresenter.delegateFactory;
            RealNearbyManager realNearbyManager = (RealNearbyManager) ((Provider) nodeChain.layoutNode).invoke();
            AndroidStringManager androidStringManager13 = (AndroidStringManager) ((LambdaProvider) nodeChain.sentinelHead).lambda.invoke();
            RealProfileManager realProfileManager5 = (RealProfileManager) ((DelegateFactory) nodeChain.innerCoordinator).invoke();
            SessionManager sessionManager2 = (SessionManager) ((LambdaProvider) nodeChain.outerCoordinator).lambda.invoke();
            MarkwonConfiguration markwonConfiguration = (MarkwonConfiguration) ((RealBrazeManager.MetroFactory) nodeChain.tail).invoke();
            RealUuidGenerator realUuidGenerator4 = (RealUuidGenerator) ((LambdaProvider) nodeChain.head).lambda.invoke();
            Analytics analytics11 = (Analytics) ((DoubleCheck) nodeChain.current).getValue();
            AppForegroundStateProvider appForegroundStateProvider = (AppForegroundStateProvider) ((LambdaProvider) nodeChain.buffer).lambda.invoke();
            AndroidClock androidClock3 = (AndroidClock) ((LambdaProvider) nodeChain.stack).lambda.invoke();
            LocalizedMoneyFormatter.Factory factory8 = (LocalizedMoneyFormatter.Factory) ((Provider) nodeChain.cachedDiffer).invoke();
            realNearbyManager.getClass();
            androidStringManager13.getClass();
            realProfileManager5.getClass();
            sessionManager2.getClass();
            realUuidGenerator4.getClass();
            analytics11.getClass();
            appForegroundStateProvider.getClass();
            androidClock3.getClass();
            factory8.getClass();
            return MoleculePresenterKt.asPresenter$default(new CardLockPresenter(realNearbyManager, androidStringManager13, realProfileManager5, sessionManager2, markwonConfiguration, realUuidGenerator4, analytics11, appForegroundStateProvider, androidClock3, factory8, (PaymentScreens.NearbyPayRequest) screen, screenNavigator));
        }
        if (screen instanceof PaymentScreens.NearbyPermissionsPromptSheet) {
            TransferInPresenter$MetroFactory transferInPresenter$MetroFactory = this.nearbyPermissionsPromptSheetPresenter.delegateFactory;
            RealNearbyManager realNearbyManager2 = (RealNearbyManager) transferInPresenter$MetroFactory.moneyFormatterFactory.invoke();
            AndroidStringManager androidStringManager14 = (AndroidStringManager) transferInPresenter$MetroFactory.stringManager.lambda.invoke();
            Analytics analytics12 = (Analytics) transferInPresenter$MetroFactory.analytics.getValue();
            realNearbyManager2.getClass();
            androidStringManager14.getClass();
            analytics12.getClass();
            return MoleculePresenterKt.asPresenter$default(new NearbyPermissionsPromptSheetPresenter(realNearbyManager2, androidStringManager14, analytics12, (PaymentScreens.NearbyPermissionsPromptSheet) screen, screenNavigator));
        }
        if (screen instanceof PaymentScreens.NearbyPaymentKeypad) {
            DisclosurePresenter.MetroFactory metroFactory6 = this.nearbyPaymentKeypadPresenterFactory.delegateFactory;
            RealPaymentInitiator realPaymentInitiator5 = (RealPaymentInitiator) metroFactory6.blockersNavigator.invoke();
            RealUuidGenerator realUuidGenerator5 = (RealUuidGenerator) metroFactory6.stringManager.lambda.invoke();
            Analytics analytics13 = (Analytics) metroFactory6.analytics.getValue();
            RealInstrumentRowLoader realInstrumentRowLoader2 = (RealInstrumentRowLoader) metroFactory6.launcher.invoke();
            FeatureFlagManager featureFlagManager6 = (FeatureFlagManager) metroFactory6.appService.getValue();
            realPaymentInitiator5.getClass();
            realUuidGenerator5.getClass();
            analytics13.getClass();
            realInstrumentRowLoader2.getClass();
            featureFlagManager6.getClass();
            return MoleculePresenterKt.asPresenter$default(new LocalPosLocalCashRedemptionPresenter(realPaymentInitiator5, realUuidGenerator5, analytics13, realInstrumentRowLoader2, featureFlagManager6, (PaymentScreens.NearbyPaymentKeypad) screen, screenNavigator));
        }
        if (screen instanceof PaymentScreens.NearbyPayersSheet) {
            StampSheetPresenter$MetroFactory stampSheetPresenter$MetroFactory3 = this.nearbyPayersSheetPresenterFactory.delegateFactory;
            AndroidStringManager androidStringManager15 = (AndroidStringManager) stampSheetPresenter$MetroFactory3.ioContext.lambda.invoke();
            Analytics analytics14 = (Analytics) stampSheetPresenter$MetroFactory3.appConfig.getValue();
            androidStringManager15.getClass();
            analytics14.getClass();
            return MoleculePresenterKt.asPresenter$default(new TaxReturnsPresenter(androidStringManager15, analytics14, (PaymentScreens.NearbyPayersSheet) screen, screenNavigator));
        }
        if (screen instanceof PaymentScreens.NearbyPayRequestHelp) {
            StampSheetPresenter$MetroFactory stampSheetPresenter$MetroFactory4 = this.nearbyPayRequestHelpPresenter.delegateFactory;
            AndroidStringManager androidStringManager16 = (AndroidStringManager) stampSheetPresenter$MetroFactory4.ioContext.lambda.invoke();
            Analytics analytics15 = (Analytics) stampSheetPresenter$MetroFactory4.appConfig.getValue();
            androidStringManager16.getClass();
            analytics15.getClass();
            return MoleculePresenterKt.asPresenter$default(new TaxReturnsPresenter(androidStringManager16, analytics15, (PaymentScreens.NearbyPayRequestHelp) screen, screenNavigator));
        }
        if (screen instanceof PaymentScreens.NearbyPaymentsInfo) {
            StampSheetPresenter$MetroFactory stampSheetPresenter$MetroFactory5 = this.nearbyPaymentsInfoPresenter.delegateFactory;
            AndroidStringManager androidStringManager17 = (AndroidStringManager) stampSheetPresenter$MetroFactory5.ioContext.lambda.invoke();
            Analytics analytics16 = (Analytics) stampSheetPresenter$MetroFactory5.appConfig.getValue();
            androidStringManager17.getClass();
            analytics16.getClass();
            return MoleculePresenterKt.asPresenter$default(new TaxReturnsPresenter(androidStringManager17, analytics16, (PaymentScreens.NearbyPaymentsInfo) screen, screenNavigator));
        }
        if (screen instanceof PaymentScreens.NearbyPeopleOverflowSheet) {
            MerchantInfoFeedbackPresenter$MetroFactory merchantInfoFeedbackPresenter$MetroFactory = this.nearbyPeopleOverflowSheetPresenter.delegateFactory;
            RealNearbyManager realNearbyManager3 = (RealNearbyManager) merchantInfoFeedbackPresenter$MetroFactory.customerStore.invoke();
            NearbySessionService nearbySessionService = (NearbySessionService) merchantInfoFeedbackPresenter$MetroFactory.analytics.getValue();
            AndroidStringManager androidStringManager18 = (AndroidStringManager) merchantInfoFeedbackPresenter$MetroFactory.stringManager.lambda.invoke();
            RealUuidGenerator realUuidGenerator6 = (RealUuidGenerator) merchantInfoFeedbackPresenter$MetroFactory.sessionManager.lambda.invoke();
            realNearbyManager3.getClass();
            nearbySessionService.getClass();
            androidStringManager18.getClass();
            realUuidGenerator6.getClass();
            return MoleculePresenterKt.asPresenter$default(new TaxReturnsPresenter(realNearbyManager3, nearbySessionService, androidStringManager18, realUuidGenerator6, screenNavigator));
        }
        if (!(screen instanceof PaymentScreens.SchedulePayment)) {
            return null;
        }
        DefaultSocket defaultSocket = this.schedulePaymentPresenter.delegateFactory;
        AndroidClock androidClock4 = (AndroidClock) ((LambdaProvider) defaultSocket.socket).lambda.invoke();
        AndroidStringManager androidStringManager19 = (AndroidStringManager) ((LambdaProvider) defaultSocket.closeBits).lambda.invoke();
        AndroidDateFormatManager androidDateFormatManager = (AndroidDateFormatManager) ((LambdaProvider) defaultSocket.source).lambda.invoke();
        Analytics analytics17 = (Analytics) ((DoubleCheck) defaultSocket.sink).getValue();
        androidClock4.getClass();
        androidStringManager19.getClass();
        androidDateFormatManager.getClass();
        analytics17.getClass();
        return MoleculePresenterKt.asPresenter$default(new ShareSheetPresenter(androidClock4, androidStringManager19, androidDateFormatManager, analytics17, (PaymentScreens.SchedulePayment) screen, screenNavigator));
    }
}
