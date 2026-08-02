package com.squareup.cash.pools.presenters;

import android.app.Activity;
import androidx.datastore.core.SimpleActor;
import app.cash.broadway.presenter.Presenter;
import app.cash.broadway.presenter.PresenterFactory;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt;
import app.cash.broadway.screen.Screen;
import app.cash.local.presenters.LocalCashBalancePresenter;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.passcode.presenters.EndAppLockPresenter;
import coil3.ComponentRegistry;
import coil3.ImageLoader$Builder;
import com.bugsnag.android.DeviceBuildInfo;
import com.google.mlkit.vision.common.zzb;
import com.miteksystems.misnap.camera.a.n;
import com.nimbusds.jose.jca.JCAContext;
import com.squareup.cash.VariantAppComponent;
import com.squareup.cash.account.backend.AccountSwitchScreenStateRelay;
import com.squareup.cash.account.backend.RealAccountSwitcher;
import com.squareup.cash.account.backend.RealAccountholderAccountRepository;
import com.squareup.cash.account.manager.backend.real.RealAccountRatePlanManager;
import com.squareup.cash.account.navigation.RealAccountOutboundNavigator$Factory$Impl;
import com.squareup.cash.account.presenters.AccountPresenter;
import com.squareup.cash.account.presenters.AccountPresenter$Factory$Impl;
import com.squareup.cash.account.presenters.EditProfilePresenter$Factory$Impl;
import com.squareup.cash.account.presenters.ProfileUpsellPresenter$Factory$Impl;
import com.squareup.cash.account.presenters.ThemeSwitcherPresenter$Factory$Impl;
import com.squareup.cash.account.presenters.ThemeSwitcherPresenter$MetroFactory;
import com.squareup.cash.account.presenters.accountswitcher.AccountSwitcherPresenter$Factory$Impl;
import com.squareup.cash.account.presenters.accountswitcher.AccountsLoadingFailedPresenter$Factory$Impl;
import com.squareup.cash.account.presenters.accountswitcher.AddAccountOptionsPresenter$Factory$Impl;
import com.squareup.cash.account.presenters.accountswitcher.SwitchFullAccountLoadingPresenter$Factory$Impl;
import com.squareup.cash.account.presenters.business.BusinessInfoPresenter$Factory$Impl;
import com.squareup.cash.account.presenters.settings.AccountSettingsCapabilityProvider;
import com.squareup.cash.account.screens.Account;
import com.squareup.cash.account.screens.AccountSwitcherScreen;
import com.squareup.cash.account.screens.AccountsLoadingFailedScreen;
import com.squareup.cash.account.screens.AddAccountScreen;
import com.squareup.cash.account.screens.BusinessInfoScreen;
import com.squareup.cash.account.screens.EditProfile;
import com.squareup.cash.account.screens.SwitchFullAccountLoadingScreen;
import com.squareup.cash.account.screens.ThemeSwitcherScreen;
import com.squareup.cash.account.settings.backend.RealProfilePhotoManager$Factory$Impl;
import com.squareup.cash.activity.backend.loader.RealActivitiesCacheManager;
import com.squareup.cash.activity.presenters.DefaultActivityItemEventHandler$Factory$Impl;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter$Factory$Impl;
import com.squareup.cash.appmessages.ActivityTabPopupAppMessage;
import com.squareup.cash.appmessages.BalanceTabPopupAppMessage;
import com.squareup.cash.appmessages.CardTabPopupAppMessage;
import com.squareup.cash.appmessages.InvestingTabPopupAppMessage;
import com.squareup.cash.appmessages.OffersTabPopupAppMessage;
import com.squareup.cash.appmessages.PaymentPadTabPopupAppMessage;
import com.squareup.cash.appmessages.SheetAppMessage;
import com.squareup.cash.appmessages.presenters.ActivityPopupAppMessagePresenter$Factory$Impl;
import com.squareup.cash.appmessages.presenters.BalancePopupAppMessagePresenter;
import com.squareup.cash.appmessages.presenters.BalancePopupAppMessagePresenter$Factory$Impl;
import com.squareup.cash.appmessages.presenters.CardTabPopupAppMessagePresenter$Factory$Impl;
import com.squareup.cash.appmessages.presenters.InvestingPopupAppMessagePresenter$Factory$Impl;
import com.squareup.cash.appmessages.presenters.OffersTabPopupAppMessagePresenter$Factory$Impl;
import com.squareup.cash.appmessages.presenters.PaymentPadPopupAppMessagePresenter$Factory$Impl;
import com.squareup.cash.appmessages.presenters.PopupAppMessagePresenterHelper$Factory$Impl;
import com.squareup.cash.appmessages.presenters.RealAppMessageActionPerformer$Factory$Impl;
import com.squareup.cash.appmessages.presenters.sheet.SheetAppMessagePresenter$Factory$Impl;
import com.squareup.cash.banking.real.RealDisclosureProvider;
import com.squareup.cash.benefits.components.presenters.BenefitsComparisonTablePresenter$Factory$Impl;
import com.squareup.cash.benefits.navigation.real.RealBenefitsOutboundNavigator$Factory$Impl;
import com.squareup.cash.benefits.presenters.BankingBenefitsBookletPresenter;
import com.squareup.cash.benefits.presenters.BankingBenefitsBookletPresenter$Factory$Impl;
import com.squareup.cash.benefits.presenters.BenefitDetailsPresenter$Factory$Impl;
import com.squareup.cash.benefits.presenters.BenefitsExplanationPresenter$Factory$Impl;
import com.squareup.cash.benefits.presenters.BenefitsHomePresenter;
import com.squareup.cash.benefits.presenters.BenefitsHomePresenter$Factory$Impl;
import com.squareup.cash.benefits.presenters.BenefitsHubPresenter$Factory$Impl;
import com.squareup.cash.benefits.presenters.GreenEligibleTransactionsPresenter$Factory$Impl;
import com.squareup.cash.benefits.presenters.PdsaBenefitsExplainerPresenter$Factory$Impl;
import com.squareup.cash.benefits.screens.BankingBenefitsBookletScreen;
import com.squareup.cash.benefits.screens.BenefitDetailScreen;
import com.squareup.cash.benefits.screens.BenefitsExplanationScreen;
import com.squareup.cash.benefits.screens.BenefitsHomeScreen;
import com.squareup.cash.benefits.screens.BenefitsHubScreen;
import com.squareup.cash.benefits.screens.GreenEligibleTransactionsScreen;
import com.squareup.cash.benefits.screens.PdsaBenefitsExplainerScreen;
import com.squareup.cash.bitcoin.capability.RealBitcoinCapabilityProvider;
import com.squareup.cash.blockers.presenters.ErrorPresenter;
import com.squareup.cash.businessaccount.backend.real.RealBusinessProfileManager;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.CardStudioPresenterV2$MetroFactory;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.checks.CheckDepositAmountPresenter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.clipboard.RealClipboardManager;
import com.squareup.cash.core.navigationcontainer.AcceptableScrim;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.data.profile.RealProfileSyncer;
import com.squareup.cash.data.profile.RealReferralManager;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.OfflineConfig;
import com.squareup.cash.db2.profile.Profile;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository;
import com.squareup.cash.eligibility.backend.real.RealSettingsEligibilityManager;
import com.squareup.cash.family.familyhub.backend.real.RealFamilyAccountsManager;
import com.squareup.cash.family.profileselection.real.RealFamilyProfileManager;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.history.presenters.SkipPaymentPresenter$MetroFactory;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.instruments.backend.real.RealInstrumentRowLoader;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.investing.presenters.InvestingDiscoveryPresenter$MetroFactory;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.localization.RealLocaleAssetProvider$MetroFactory;
import com.squareup.cash.localization.presenters.LanguageDisclosurePresenter$MetroFactory;
import com.squareup.cash.merchant.backend.real.RealMerchantProfileRepo$MetroFactory;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.offers.presenters.OffersDetailsPresenter;
import com.squareup.cash.offers.presenters.OffersHomePresenter;
import com.squareup.cash.payments.RealPaymentInitiator;
import com.squareup.cash.payments.backend.real.RealP2pSettingsManager;
import com.squareup.cash.payments.presenters.PaymentLoadingPresenter;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$AppMessageErrorScreen;
import com.squareup.cash.pdf.presenter.PdfPreviewPresenter;
import com.squareup.cash.permissions.ModifiablePermissions;
import com.squareup.cash.pools.backend.real.RealPoolActionManager;
import com.squareup.cash.pools.backend.real.RealPoolsRepository;
import com.squareup.cash.pools.presenters.StartPoolPresenter;
import com.squareup.cash.pools.screens.PoolContributeScreen;
import com.squareup.cash.pools.screens.PoolDetailsScreen;
import com.squareup.cash.pools.screens.PoolInvitePeopleListScreen;
import com.squareup.cash.pools.screens.PoolMemberListScreen;
import com.squareup.cash.pools.screens.PoolMoreOptionsBottomSheet;
import com.squareup.cash.pools.screens.PoolsListScreen;
import com.squareup.cash.pools.screens.StartPoolScreen;
import com.squareup.cash.profile.presenters.AddAliasPresenter;
import com.squareup.cash.profile.presenters.ProfilePresenter;
import com.squareup.cash.profile.presenters.RealProfilePreviewPresenter$Factory$Impl;
import com.squareup.cash.qrcodes.QrShortcutInstaller;
import com.squareup.cash.qrcodes.presenters.RealQrCodesPresenter;
import com.squareup.cash.recipients.data.RealRecipientRepository;
import com.squareup.cash.resource.AndroidDateFormatManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.savings.backend.api.model.SavingsScreen;
import com.squareup.cash.savings.backend.real.PersistentActiveGoalStore$Factory$Impl;
import com.squareup.cash.savings.backend.real.SyncValuesBasedSavingsBalanceStore;
import com.squareup.cash.savings.presenters.SavingsActivityItemEventDecorator;
import com.squareup.cash.savings.presenters.SavingsFullScreenActivityPresenter$Factory$Impl;
import com.squareup.cash.savings.presenters.SavingsRouteInterstitialPresenter$Factory$Impl;
import com.squareup.cash.savings.presenters.SavingsScreenContentFactory$Factory$Impl;
import com.squareup.cash.savings.presenters.SavingsScreenPresenter;
import com.squareup.cash.savings.presenters.SavingsScreenPresenter$Factory$Impl;
import com.squareup.cash.savings.presenters.SavingsUpsellCardPresenter$Factory$Impl;
import com.squareup.cash.savings.presenters.TransferInPresenter$Factory$Impl;
import com.squareup.cash.savings.presenters.TransferInPresenter$MetroFactory;
import com.squareup.cash.savings.presenters.TransferOutPresenter$Factory$Impl;
import com.squareup.cash.savings.presenters.TransferringPresenter$Factory$Impl;
import com.squareup.cash.savings.presenters.TransferringPresenter$MetroFactory;
import com.squareup.cash.savings.screens.GeneralSavingsScreen;
import com.squareup.cash.savings.screens.SavingsCardSheet;
import com.squareup.cash.savings.screens.SavingsFullActivityScreen;
import com.squareup.cash.savings.screens.SavingsRouteInterstitialScreen;
import com.squareup.cash.savings.screens.SavingsScreen;
import com.squareup.cash.savings.screens.TransferInScreen;
import com.squareup.cash.savings.screens.TransferOutScreen$Full;
import com.squareup.cash.savings.screens.TransferProcessingScreen;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.session.backend.TimeToLiveSyncState;
import com.squareup.cash.sharesheet.ShareSheetPresenter;
import com.squareup.cash.shopping.presenters.RealShoppingJavascriptPresenter;
import com.squareup.cash.support.navigation.RealSupportNavigator;
import com.squareup.cash.tabs.presenters.TabToolbarPresenter;
import com.squareup.cash.taptopay.presenters.TapToPayPresenter;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.work.presenters.WorkHomePresenter;
import com.squareup.preferences.BooleanPreference;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.activity.api.v1.ActivityClientService;
import com.squareup.protos.cash.balancemover.api.v1.BalanceMoverAppService;
import com.squareup.protos.cash.bankingbenefits.api.v1_0.BankingBenefitsAppService;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageClientService;
import com.squareup.protos.cash.piggybank.appapi.PiggybankAppService;
import com.squareup.protos.cash.postcard.app.PostcardClientService;
import com.squareup.util.android.RealIntentFactory;
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
public final class PoolsPresenterFactory implements PresenterFactory {
    public final /* synthetic */ int $r8$classId;
    public final Object poolContributeWithNotePresenterFactory;
    public final Object poolDetailsPresenterFactory;
    public final Object poolInvitePeopleListPresenterFactory;
    public final Object poolMemberListPresenterFactory;
    public final Object poolMoreOptionsBottomSheetPresenterFactory;
    public final Object poolsListPresenterFactory;
    public final Object startPoolPresenterFactory;

    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final InstanceFactory poolContributeWithNotePresenterFactory;
        public final InstanceFactory poolDetailsPresenterFactory;
        public final InstanceFactory poolInvitePeopleListPresenterFactory;
        public final InstanceFactory poolMemberListPresenterFactory;
        public final InstanceFactory poolMoreOptionsBottomSheetPresenterFactory;
        public final InstanceFactory poolsListPresenterFactory;
        public final InstanceFactory startPoolPresenterFactory;

        public /* synthetic */ MetroFactory(InstanceFactory instanceFactory, InstanceFactory instanceFactory2, InstanceFactory instanceFactory3, InstanceFactory instanceFactory4, InstanceFactory instanceFactory5, InstanceFactory instanceFactory6, InstanceFactory instanceFactory7, int i) {
            this.$r8$classId = i;
            this.poolsListPresenterFactory = instanceFactory;
            this.startPoolPresenterFactory = instanceFactory2;
            this.poolDetailsPresenterFactory = instanceFactory3;
            this.poolContributeWithNotePresenterFactory = instanceFactory4;
            this.poolInvitePeopleListPresenterFactory = instanceFactory5;
            this.poolMoreOptionsBottomSheetPresenterFactory = instanceFactory6;
            this.poolMemberListPresenterFactory = instanceFactory7;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            InstanceFactory instanceFactory = this.poolMemberListPresenterFactory;
            InstanceFactory instanceFactory2 = this.poolMoreOptionsBottomSheetPresenterFactory;
            InstanceFactory instanceFactory3 = this.poolInvitePeopleListPresenterFactory;
            InstanceFactory instanceFactory4 = this.poolContributeWithNotePresenterFactory;
            InstanceFactory instanceFactory5 = this.poolDetailsPresenterFactory;
            InstanceFactory instanceFactory6 = this.startPoolPresenterFactory;
            InstanceFactory instanceFactory7 = this.poolsListPresenterFactory;
            switch (i) {
                case 0:
                    PoolsListPresenter$Factory$Impl poolsListPresenter$Factory$Impl = (PoolsListPresenter$Factory$Impl) instanceFactory7.value;
                    StartPoolPresenter$Factory$Impl startPoolPresenter$Factory$Impl = (StartPoolPresenter$Factory$Impl) instanceFactory6.value;
                    PoolDetailsPresenter$Factory$Impl poolDetailsPresenter$Factory$Impl = (PoolDetailsPresenter$Factory$Impl) instanceFactory5.value;
                    PoolContributeWithNotePresenter$Factory$Impl poolContributeWithNotePresenter$Factory$Impl = (PoolContributeWithNotePresenter$Factory$Impl) instanceFactory4.value;
                    PoolInvitePeopleListPresenter$Factory$Impl poolInvitePeopleListPresenter$Factory$Impl = (PoolInvitePeopleListPresenter$Factory$Impl) instanceFactory3.value;
                    PoolMoreOptionsBottomSheetPresenter$Factory$Impl poolMoreOptionsBottomSheetPresenter$Factory$Impl = (PoolMoreOptionsBottomSheetPresenter$Factory$Impl) instanceFactory2.value;
                    PoolMemberListPresenter$Factory$Impl poolMemberListPresenter$Factory$Impl = (PoolMemberListPresenter$Factory$Impl) instanceFactory.value;
                    poolsListPresenter$Factory$Impl.getClass();
                    startPoolPresenter$Factory$Impl.getClass();
                    poolDetailsPresenter$Factory$Impl.getClass();
                    poolContributeWithNotePresenter$Factory$Impl.getClass();
                    poolInvitePeopleListPresenter$Factory$Impl.getClass();
                    poolMoreOptionsBottomSheetPresenter$Factory$Impl.getClass();
                    poolMemberListPresenter$Factory$Impl.getClass();
                    return new PoolsPresenterFactory(poolsListPresenter$Factory$Impl, startPoolPresenter$Factory$Impl, poolDetailsPresenter$Factory$Impl, poolContributeWithNotePresenter$Factory$Impl, poolInvitePeopleListPresenter$Factory$Impl, poolMoreOptionsBottomSheetPresenter$Factory$Impl, poolMemberListPresenter$Factory$Impl, 0);
                case 1:
                    PaymentPadPopupAppMessagePresenter$Factory$Impl paymentPadPopupAppMessagePresenter$Factory$Impl = (PaymentPadPopupAppMessagePresenter$Factory$Impl) instanceFactory7.value;
                    ActivityPopupAppMessagePresenter$Factory$Impl activityPopupAppMessagePresenter$Factory$Impl = (ActivityPopupAppMessagePresenter$Factory$Impl) instanceFactory6.value;
                    InvestingPopupAppMessagePresenter$Factory$Impl investingPopupAppMessagePresenter$Factory$Impl = (InvestingPopupAppMessagePresenter$Factory$Impl) instanceFactory5.value;
                    BalancePopupAppMessagePresenter$Factory$Impl balancePopupAppMessagePresenter$Factory$Impl = (BalancePopupAppMessagePresenter$Factory$Impl) instanceFactory4.value;
                    CardTabPopupAppMessagePresenter$Factory$Impl cardTabPopupAppMessagePresenter$Factory$Impl = (CardTabPopupAppMessagePresenter$Factory$Impl) instanceFactory3.value;
                    OffersTabPopupAppMessagePresenter$Factory$Impl offersTabPopupAppMessagePresenter$Factory$Impl = (OffersTabPopupAppMessagePresenter$Factory$Impl) instanceFactory2.value;
                    SheetAppMessagePresenter$Factory$Impl sheetAppMessagePresenter$Factory$Impl = (SheetAppMessagePresenter$Factory$Impl) instanceFactory.value;
                    paymentPadPopupAppMessagePresenter$Factory$Impl.getClass();
                    activityPopupAppMessagePresenter$Factory$Impl.getClass();
                    investingPopupAppMessagePresenter$Factory$Impl.getClass();
                    balancePopupAppMessagePresenter$Factory$Impl.getClass();
                    cardTabPopupAppMessagePresenter$Factory$Impl.getClass();
                    offersTabPopupAppMessagePresenter$Factory$Impl.getClass();
                    sheetAppMessagePresenter$Factory$Impl.getClass();
                    return new PoolsPresenterFactory(paymentPadPopupAppMessagePresenter$Factory$Impl, activityPopupAppMessagePresenter$Factory$Impl, investingPopupAppMessagePresenter$Factory$Impl, balancePopupAppMessagePresenter$Factory$Impl, cardTabPopupAppMessagePresenter$Factory$Impl, offersTabPopupAppMessagePresenter$Factory$Impl, sheetAppMessagePresenter$Factory$Impl, 2);
                default:
                    BenefitsHomePresenter$Factory$Impl benefitsHomePresenter$Factory$Impl = (BenefitsHomePresenter$Factory$Impl) instanceFactory7.value;
                    BankingBenefitsBookletPresenter$Factory$Impl bankingBenefitsBookletPresenter$Factory$Impl = (BankingBenefitsBookletPresenter$Factory$Impl) instanceFactory6.value;
                    GreenEligibleTransactionsPresenter$Factory$Impl greenEligibleTransactionsPresenter$Factory$Impl = (GreenEligibleTransactionsPresenter$Factory$Impl) instanceFactory5.value;
                    PdsaBenefitsExplainerPresenter$Factory$Impl pdsaBenefitsExplainerPresenter$Factory$Impl = (PdsaBenefitsExplainerPresenter$Factory$Impl) instanceFactory4.value;
                    BenefitDetailsPresenter$Factory$Impl benefitDetailsPresenter$Factory$Impl = (BenefitDetailsPresenter$Factory$Impl) instanceFactory3.value;
                    BenefitsExplanationPresenter$Factory$Impl benefitsExplanationPresenter$Factory$Impl = (BenefitsExplanationPresenter$Factory$Impl) instanceFactory2.value;
                    BenefitsHubPresenter$Factory$Impl benefitsHubPresenter$Factory$Impl = (BenefitsHubPresenter$Factory$Impl) instanceFactory.value;
                    benefitsHomePresenter$Factory$Impl.getClass();
                    bankingBenefitsBookletPresenter$Factory$Impl.getClass();
                    greenEligibleTransactionsPresenter$Factory$Impl.getClass();
                    pdsaBenefitsExplainerPresenter$Factory$Impl.getClass();
                    benefitDetailsPresenter$Factory$Impl.getClass();
                    benefitsExplanationPresenter$Factory$Impl.getClass();
                    benefitsHubPresenter$Factory$Impl.getClass();
                    return new PoolsPresenterFactory(benefitsHomePresenter$Factory$Impl, bankingBenefitsBookletPresenter$Factory$Impl, greenEligibleTransactionsPresenter$Factory$Impl, pdsaBenefitsExplainerPresenter$Factory$Impl, benefitDetailsPresenter$Factory$Impl, benefitsExplanationPresenter$Factory$Impl, benefitsHubPresenter$Factory$Impl, 3);
            }
        }
    }

    public PoolsPresenterFactory(AccountPresenter$Factory$Impl accountPresenter$Factory$Impl, EditProfilePresenter$Factory$Impl editProfilePresenter$Factory$Impl, BusinessInfoPresenter$Factory$Impl businessInfoPresenter$Factory$Impl, AccountSwitcherPresenter$Factory$Impl accountSwitcherPresenter$Factory$Impl, AddAccountOptionsPresenter$Factory$Impl addAccountOptionsPresenter$Factory$Impl, SwitchFullAccountLoadingPresenter$Factory$Impl switchFullAccountLoadingPresenter$Factory$Impl, AccountsLoadingFailedPresenter$Factory$Impl accountsLoadingFailedPresenter$Factory$Impl, ThemeSwitcherPresenter$Factory$Impl themeSwitcherPresenter$Factory$Impl) {
        this.$r8$classId = 1;
        this.poolsListPresenterFactory = accountPresenter$Factory$Impl;
        this.startPoolPresenterFactory = editProfilePresenter$Factory$Impl;
        this.poolDetailsPresenterFactory = businessInfoPresenter$Factory$Impl;
        this.poolContributeWithNotePresenterFactory = accountSwitcherPresenter$Factory$Impl;
        this.poolInvitePeopleListPresenterFactory = addAccountOptionsPresenter$Factory$Impl;
        this.poolMoreOptionsBottomSheetPresenterFactory = switchFullAccountLoadingPresenter$Factory$Impl;
        this.poolMemberListPresenterFactory = themeSwitcherPresenter$Factory$Impl;
    }

    @Override // app.cash.broadway.presenter.PresenterFactory
    public final Presenter create(Screen screen, BetterNavigator.ScreenNavigator screenNavigator) {
        int i = this.$r8$classId;
        int i2 = 1;
        Object obj = this.poolMemberListPresenterFactory;
        Object obj2 = this.poolMoreOptionsBottomSheetPresenterFactory;
        Object obj3 = this.poolInvitePeopleListPresenterFactory;
        Object obj4 = this.startPoolPresenterFactory;
        Object obj5 = this.poolContributeWithNotePresenterFactory;
        Object obj6 = this.poolsListPresenterFactory;
        Object obj7 = this.poolDetailsPresenterFactory;
        switch (i) {
            case 0:
                screen.getClass();
                if (screen instanceof PoolsListScreen) {
                    ImageLoader$Builder imageLoader$Builder = ((PoolsListPresenter$Factory$Impl) obj6).delegateFactory;
                    SessionManager sessionManager = (SessionManager) ((LambdaProvider) imageLoader$Builder.application).lambda.invoke();
                    AndroidStringManager androidStringManager = (AndroidStringManager) ((LambdaProvider) imageLoader$Builder.defaults).lambda.invoke();
                    RealPoolsRepository realPoolsRepository = (RealPoolsRepository) ((Provider) imageLoader$Builder.mainCoroutineContextLazy).invoke();
                    AndroidDateFormatManager androidDateFormatManager = (AndroidDateFormatManager) ((LambdaProvider) imageLoader$Builder.memoryCacheLazy).lambda.invoke();
                    RealUuidGenerator realUuidGenerator = (RealUuidGenerator) ((LambdaProvider) imageLoader$Builder.diskCacheLazy).lambda.invoke();
                    LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) ((Provider) imageLoader$Builder.eventListenerFactory).invoke();
                    Analytics analytics = (Analytics) ((DoubleCheck) imageLoader$Builder.componentRegistry).getValue();
                    zzb zzbVar = (zzb) ((RealLocaleAssetProvider$MetroFactory) imageLoader$Builder.extras).invoke();
                    sessionManager.getClass();
                    androidStringManager.getClass();
                    realPoolsRepository.getClass();
                    androidDateFormatManager.getClass();
                    realUuidGenerator.getClass();
                    factory.getClass();
                    analytics.getClass();
                    return MoleculePresenterKt.asPresenter$default(new PoolsListPresenter(sessionManager, androidStringManager, realPoolsRepository, androidDateFormatManager, realUuidGenerator, factory, analytics, zzbVar, (PoolsListScreen) screen, screenNavigator));
                }
                if (screen instanceof StartPoolScreen) {
                    StartPoolPresenter.MetroFactory metroFactory = ((StartPoolPresenter$Factory$Impl) obj4).delegateFactory;
                    LocalizedMoneyFormatter.Factory factory2 = (LocalizedMoneyFormatter.Factory) metroFactory.moneyFormatterFactory.invoke();
                    AndroidStringManager androidStringManager2 = (AndroidStringManager) metroFactory.stringManager.lambda.invoke();
                    Analytics analytics2 = (Analytics) metroFactory.analytics.getValue();
                    RealPoolsRepository realPoolsRepository2 = (RealPoolsRepository) metroFactory.poolsRepository.invoke();
                    RealPoolActionManager realPoolActionManager = (RealPoolActionManager) metroFactory.poolActionManager.invoke();
                    FlowStarter flowStarter = (FlowStarter) metroFactory.blockersNavigator.getValue();
                    Activity activity = (Activity) metroFactory.activity.value;
                    AppConfigManager appConfigManager = (AppConfigManager) metroFactory.appConfig.getValue();
                    RealIntentFactory realIntentFactory = (RealIntentFactory) metroFactory.intentFactory.getValue();
                    RealUuidGenerator realUuidGenerator2 = (RealUuidGenerator) metroFactory.uuidGenerator.lambda.invoke();
                    RealFamilyAccountsManager realFamilyAccountsManager = (RealFamilyAccountsManager) metroFactory.sponsorshipStateProvider.invoke();
                    CoroutineContext coroutineContext = (CoroutineContext) metroFactory.ioDispatcher.lambda.invoke();
                    factory2.getClass();
                    androidStringManager2.getClass();
                    analytics2.getClass();
                    realPoolsRepository2.getClass();
                    realPoolActionManager.getClass();
                    flowStarter.getClass();
                    activity.getClass();
                    appConfigManager.getClass();
                    realIntentFactory.getClass();
                    realUuidGenerator2.getClass();
                    realFamilyAccountsManager.getClass();
                    coroutineContext.getClass();
                    return MoleculePresenterKt.asPresenter$default(new StartPoolPresenter((StartPoolScreen) screen, screenNavigator, factory2, androidStringManager2, analytics2, realPoolsRepository2, realPoolActionManager, flowStarter, activity, appConfigManager, realIntentFactory, realUuidGenerator2, realFamilyAccountsManager, coroutineContext));
                }
                if (screen instanceof PoolDetailsScreen) {
                    PoolDetailsPresenter$MetroFactory poolDetailsPresenter$MetroFactory = ((PoolDetailsPresenter$Factory$Impl) obj7).delegateFactory;
                    LocalizedMoneyFormatter.Factory factory3 = (LocalizedMoneyFormatter.Factory) poolDetailsPresenter$MetroFactory.moneyFormatterFactory.invoke();
                    RealPoolsRepository realPoolsRepository3 = (RealPoolsRepository) poolDetailsPresenter$MetroFactory.poolsRepository.invoke();
                    AndroidStringManager androidStringManager3 = (AndroidStringManager) ((LambdaProvider) poolDetailsPresenter$MetroFactory.stringManager).lambda.invoke();
                    SessionManager sessionManager2 = (SessionManager) ((LambdaProvider) poolDetailsPresenter$MetroFactory.sessionManager).lambda.invoke();
                    IntentLauncher intentLauncher = (IntentLauncher) poolDetailsPresenter$MetroFactory.launcher.invoke();
                    FlowStarter flowStarter2 = (FlowStarter) ((DoubleCheck) poolDetailsPresenter$MetroFactory.blockersNavigator).getValue();
                    AndroidDateFormatManager androidDateFormatManager2 = (AndroidDateFormatManager) ((LambdaProvider) poolDetailsPresenter$MetroFactory.dateFormatManager).lambda.invoke();
                    AndroidClock androidClock = (AndroidClock) ((LambdaProvider) poolDetailsPresenter$MetroFactory.clock).lambda.invoke();
                    Analytics analytics3 = (Analytics) ((DoubleCheck) poolDetailsPresenter$MetroFactory.analytics).getValue();
                    FeatureFlagManager featureFlagManager = (FeatureFlagManager) ((DoubleCheck) poolDetailsPresenter$MetroFactory.featureFlagManager).getValue();
                    RealUuidGenerator realUuidGenerator3 = (RealUuidGenerator) ((LambdaProvider) poolDetailsPresenter$MetroFactory.uuidGenerator).lambda.invoke();
                    RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl = (RealActivityEmbeddedPresenter$Factory$Impl) poolDetailsPresenter$MetroFactory.activityEmbeddedPresenterFactory.invoke();
                    RealActivitiesCacheManager realActivitiesCacheManager = (RealActivitiesCacheManager) ((DoubleCheck) poolDetailsPresenter$MetroFactory.activitiesCacheManager).getValue();
                    DefaultActivityItemEventHandler$Factory$Impl defaultActivityItemEventHandler$Factory$Impl = (DefaultActivityItemEventHandler$Factory$Impl) poolDetailsPresenter$MetroFactory.defaultActivityItemEventHandlerFactory.invoke();
                    factory3.getClass();
                    realPoolsRepository3.getClass();
                    androidStringManager3.getClass();
                    sessionManager2.getClass();
                    intentLauncher.getClass();
                    flowStarter2.getClass();
                    androidDateFormatManager2.getClass();
                    androidClock.getClass();
                    analytics3.getClass();
                    featureFlagManager.getClass();
                    realUuidGenerator3.getClass();
                    realActivityEmbeddedPresenter$Factory$Impl.getClass();
                    realActivitiesCacheManager.getClass();
                    defaultActivityItemEventHandler$Factory$Impl.getClass();
                    return MoleculePresenterKt.asPresenter$default(new ProfilePresenter(factory3, realPoolsRepository3, androidStringManager3, sessionManager2, intentLauncher, flowStarter2, androidDateFormatManager2, androidClock, analytics3, featureFlagManager, realUuidGenerator3, realActivityEmbeddedPresenter$Factory$Impl, realActivitiesCacheManager, defaultActivityItemEventHandler$Factory$Impl, (PoolDetailsScreen) screen, screenNavigator));
                }
                if (screen instanceof PoolContributeScreen) {
                    ImageLoader$Builder imageLoader$Builder2 = ((PoolContributeWithNotePresenter$Factory$Impl) obj5).delegateFactory;
                    RealUuidGenerator realUuidGenerator4 = (RealUuidGenerator) ((LambdaProvider) imageLoader$Builder2.application).lambda.invoke();
                    AndroidStringManager androidStringManager4 = (AndroidStringManager) ((LambdaProvider) imageLoader$Builder2.defaults).lambda.invoke();
                    RealInstrumentRowLoader realInstrumentRowLoader = (RealInstrumentRowLoader) ((Provider) imageLoader$Builder2.mainCoroutineContextLazy).invoke();
                    Analytics analytics4 = (Analytics) ((DoubleCheck) imageLoader$Builder2.memoryCacheLazy).getValue();
                    FlowStarter flowStarter3 = (FlowStarter) ((DoubleCheck) imageLoader$Builder2.diskCacheLazy).getValue();
                    RealPaymentInitiator realPaymentInitiator = (RealPaymentInitiator) ((Provider) imageLoader$Builder2.eventListenerFactory).invoke();
                    LocalizedMoneyFormatter.Factory factory4 = (LocalizedMoneyFormatter.Factory) ((Provider) imageLoader$Builder2.componentRegistry).invoke();
                    SessionManager sessionManager3 = (SessionManager) ((LambdaProvider) imageLoader$Builder2.extras).lambda.invoke();
                    realUuidGenerator4.getClass();
                    androidStringManager4.getClass();
                    realInstrumentRowLoader.getClass();
                    analytics4.getClass();
                    flowStarter3.getClass();
                    realPaymentInitiator.getClass();
                    factory4.getClass();
                    sessionManager3.getClass();
                    return MoleculePresenterKt.asPresenter$default(new PoolContributeWithNotePresenter((PoolContributeScreen) screen, screenNavigator, realUuidGenerator4, androidStringManager4, realInstrumentRowLoader, analytics4, flowStarter3, realPaymentInitiator, factory4, sessionManager3));
                }
                if (screen instanceof PoolInvitePeopleListScreen) {
                    DeviceBuildInfo deviceBuildInfo = ((PoolInvitePeopleListPresenter$Factory$Impl) obj3).delegateFactory;
                    AndroidStringManager androidStringManager5 = (AndroidStringManager) ((LambdaProvider) deviceBuildInfo.manufacturer).lambda.invoke();
                    RealPoolsRepository realPoolsRepository4 = (RealPoolsRepository) ((Provider) deviceBuildInfo.model).invoke();
                    RealRecipientRepository realRecipientRepository = (RealRecipientRepository) ((Provider) deviceBuildInfo.osVersion).invoke();
                    IntentLauncher intentLauncher2 = (IntentLauncher) ((Provider) deviceBuildInfo.osBuild).invoke();
                    RealClipboardManager realClipboardManager = (RealClipboardManager) ((LambdaProvider) deviceBuildInfo.fingerprint).lambda.invoke();
                    Analytics analytics5 = (Analytics) ((DoubleCheck) deviceBuildInfo.tags).getValue();
                    RealUuidGenerator realUuidGenerator5 = (RealUuidGenerator) ((LambdaProvider) deviceBuildInfo.brand).lambda.invoke();
                    CoroutineContext coroutineContext2 = (CoroutineContext) ((LambdaProvider) deviceBuildInfo.apiLevel).lambda.invoke();
                    ModifiablePermissions modifiablePermissions = (ModifiablePermissions) ((Provider) deviceBuildInfo.cpuAbis).invoke();
                    androidStringManager5.getClass();
                    realPoolsRepository4.getClass();
                    realRecipientRepository.getClass();
                    intentLauncher2.getClass();
                    realClipboardManager.getClass();
                    analytics5.getClass();
                    realUuidGenerator5.getClass();
                    coroutineContext2.getClass();
                    modifiablePermissions.getClass();
                    return MoleculePresenterKt.asPresenter$default(new PoolsListPresenter(androidStringManager5, realPoolsRepository4, realRecipientRepository, intentLauncher2, realClipboardManager, analytics5, realUuidGenerator5, coroutineContext2, modifiablePermissions, (PoolInvitePeopleListScreen) screen, screenNavigator));
                }
                if (screen instanceof PoolMoreOptionsBottomSheet) {
                    SkipPaymentPresenter$MetroFactory skipPaymentPresenter$MetroFactory = ((PoolMoreOptionsBottomSheetPresenter$Factory$Impl) obj2).delegateFactory;
                    FlowStarter flowStarter4 = (FlowStarter) skipPaymentPresenter$MetroFactory.activityEntityManager.getValue();
                    SessionManager sessionManager4 = (SessionManager) skipPaymentPresenter$MetroFactory.stringManager.lambda.invoke();
                    Analytics analytics6 = (Analytics) skipPaymentPresenter$MetroFactory.paymentManager.getValue();
                    flowStarter4.getClass();
                    sessionManager4.getClass();
                    analytics6.getClass();
                    return MoleculePresenterKt.asPresenter$default(new WorkHomePresenter(flowStarter4, sessionManager4, analytics6, (PoolMoreOptionsBottomSheet) screen, screenNavigator));
                }
                if (!(screen instanceof PoolMemberListScreen)) {
                    return null;
                }
                ImageLoader$Builder imageLoader$Builder3 = ((PoolMemberListPresenter$Factory$Impl) obj).delegateFactory;
                AndroidStringManager androidStringManager6 = (AndroidStringManager) ((LambdaProvider) imageLoader$Builder3.application).lambda.invoke();
                RealPoolsRepository realPoolsRepository5 = (RealPoolsRepository) ((Provider) imageLoader$Builder3.defaults).invoke();
                SessionManager sessionManager5 = (SessionManager) ((LambdaProvider) imageLoader$Builder3.mainCoroutineContextLazy).lambda.invoke();
                FlowStarter flowStarter5 = (FlowStarter) ((DoubleCheck) imageLoader$Builder3.memoryCacheLazy).getValue();
                RealUuidGenerator realUuidGenerator6 = (RealUuidGenerator) ((LambdaProvider) imageLoader$Builder3.diskCacheLazy).lambda.invoke();
                Analytics analytics7 = (Analytics) ((DoubleCheck) imageLoader$Builder3.eventListenerFactory).getValue();
                FeatureFlagManager featureFlagManager2 = (FeatureFlagManager) ((DoubleCheck) imageLoader$Builder3.componentRegistry).getValue();
                CoroutineContext coroutineContext3 = (CoroutineContext) ((LambdaProvider) imageLoader$Builder3.extras).lambda.invoke();
                androidStringManager6.getClass();
                realPoolsRepository5.getClass();
                sessionManager5.getClass();
                flowStarter5.getClass();
                realUuidGenerator6.getClass();
                analytics7.getClass();
                featureFlagManager2.getClass();
                coroutineContext3.getClass();
                return MoleculePresenterKt.asPresenter$default(new PoolMemberListPresenter(androidStringManager6, realPoolsRepository5, sessionManager5, flowStarter5, realUuidGenerator6, analytics7, featureFlagManager2, coroutineContext3, (PoolMemberListScreen) screen, screenNavigator));
            case 1:
                screen.getClass();
                if (screen instanceof Account) {
                    AccountPresenter.MetroFactory metroFactory2 = ((AccountPresenter$Factory$Impl) obj6).delegateFactory;
                    Flow flow = (Flow) metroFactory2.badges.invoke();
                    Analytics analytics8 = (Analytics) metroFactory2.analytics.invoke();
                    FeatureFlagManager featureFlagManager3 = (FeatureFlagManager) metroFactory2.featureFlagManager.invoke();
                    JCAContext jCAContext = (JCAContext) metroFactory2.settingsFeatureManager.invoke();
                    BooleanPreference booleanPreference = (BooleanPreference) metroFactory2.linkedBanksViewedPreference.invoke();
                    RealAccountOutboundNavigator$Factory$Impl realAccountOutboundNavigator$Factory$Impl = (RealAccountOutboundNavigator$Factory$Impl) metroFactory2.accountOutboundNavigatorFactory.invoke();
                    AppConfigManager appConfigManager2 = (AppConfigManager) metroFactory2.appConfig.invoke();
                    RealBusinessProfileManager realBusinessProfileManager = (RealBusinessProfileManager) metroFactory2.businessProfileManager.invoke();
                    RealProfileManager realProfileManager = (RealProfileManager) metroFactory2.profileManager.invoke();
                    RealP2pSettingsManager realP2pSettingsManager = (RealP2pSettingsManager) metroFactory2.p2pSettingsManager.invoke();
                    RealSettingsEligibilityManager realSettingsEligibilityManager = (RealSettingsEligibilityManager) metroFactory2.settingsManager.invoke();
                    AndroidStringManager androidStringManager7 = (AndroidStringManager) metroFactory2.stringManager.invoke();
                    RealReferralManager realReferralManager = (RealReferralManager) metroFactory2.referralManager.invoke();
                    RealProfileSyncer realProfileSyncer = (RealProfileSyncer) metroFactory2.profileSyncer.invoke();
                    RealProfilePhotoManager$Factory$Impl realProfilePhotoManager$Factory$Impl = (RealProfilePhotoManager$Factory$Impl) metroFactory2.profilePhotoManagerFactory.invoke();
                    ProfileUpsellPresenter$Factory$Impl profileUpsellPresenter$Factory$Impl = (ProfileUpsellPresenter$Factory$Impl) metroFactory2.profileUpsellPresenterFactory.value;
                    String str = (String) metroFactory2.versionName.invoke();
                    int intValue = ((Number) metroFactory2.versionCode.invoke()).intValue();
                    AccountSettingsCapabilityProvider accountSettingsCapabilityProvider = (AccountSettingsCapabilityProvider) metroFactory2.accountSettingsCapabilityProvider.invoke();
                    RealBitcoinCapabilityProvider realBitcoinCapabilityProvider = (RealBitcoinCapabilityProvider) metroFactory2.bitcoinCapabilityProvider.invoke();
                    RealQrCodesPresenter realQrCodesPresenter = (RealQrCodesPresenter) metroFactory2.qrCodesPresenter.invoke();
                    QrShortcutInstaller qrShortcutInstaller = (QrShortcutInstaller) metroFactory2.qrShortcutInstaller.invoke();
                    KeyValue keyValue = (KeyValue) metroFactory2.paymentPadThemeSelection.invoke();
                    RealFamilyProfileManager realFamilyProfileManager = (RealFamilyProfileManager) metroFactory2.familyProfileManager.invoke();
                    LocalizedMoneyFormatter.Factory factory5 = (LocalizedMoneyFormatter.Factory) metroFactory2.moneyFormatterFactory.invoke();
                    RealDisclosureProvider realDisclosureProvider = (RealDisclosureProvider) metroFactory2.disclosureProvider.invoke();
                    RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) metroFactory2.routerFactory.invoke();
                    flow.getClass();
                    analytics8.getClass();
                    featureFlagManager3.getClass();
                    booleanPreference.getClass();
                    realAccountOutboundNavigator$Factory$Impl.getClass();
                    appConfigManager2.getClass();
                    realBusinessProfileManager.getClass();
                    realProfileManager.getClass();
                    realP2pSettingsManager.getClass();
                    realSettingsEligibilityManager.getClass();
                    androidStringManager7.getClass();
                    realReferralManager.getClass();
                    realProfileSyncer.getClass();
                    realProfilePhotoManager$Factory$Impl.getClass();
                    profileUpsellPresenter$Factory$Impl.getClass();
                    str.getClass();
                    realBitcoinCapabilityProvider.getClass();
                    realQrCodesPresenter.getClass();
                    qrShortcutInstaller.getClass();
                    keyValue.getClass();
                    realFamilyProfileManager.getClass();
                    factory5.getClass();
                    realDisclosureProvider.getClass();
                    realRouter$Factory$Impl.getClass();
                    return MoleculePresenterKt.asPresenter$default(new AccountPresenter(flow, analytics8, featureFlagManager3, jCAContext, booleanPreference, realAccountOutboundNavigator$Factory$Impl, appConfigManager2, realBusinessProfileManager, realProfileManager, realP2pSettingsManager, realSettingsEligibilityManager, androidStringManager7, realReferralManager, realProfileSyncer, realProfilePhotoManager$Factory$Impl, profileUpsellPresenter$Factory$Impl, str, intValue, accountSettingsCapabilityProvider, realBitcoinCapabilityProvider, realQrCodesPresenter, qrShortcutInstaller, keyValue, realFamilyProfileManager, (Account) screen, screenNavigator, factory5, realDisclosureProvider, realRouter$Factory$Impl));
                }
                if (screen instanceof EditProfile) {
                    OfflineConfig.Adapter adapter = ((EditProfilePresenter$Factory$Impl) obj4).delegateFactory;
                    AndroidStringManager androidStringManager8 = (AndroidStringManager) ((LambdaProvider) adapter.attempted_payment_status_resultAdapter).lambda.invoke();
                    RealProfilePreviewPresenter$Factory$Impl realProfilePreviewPresenter$Factory$Impl = (RealProfilePreviewPresenter$Factory$Impl) ((Provider) adapter.offline_payment_status_resultAdapter).invoke();
                    RealAccountOutboundNavigator$Factory$Impl realAccountOutboundNavigator$Factory$Impl2 = (RealAccountOutboundNavigator$Factory$Impl) ((Provider) adapter.attempted_bill_status_resultAdapter).invoke();
                    RealProfileManager realProfileManager2 = (RealProfileManager) ((DelegateFactory) adapter.offline_bill_status_resultAdapter).invoke();
                    RealP2pSettingsManager realP2pSettingsManager2 = (RealP2pSettingsManager) ((Provider) adapter.attempted_cash_out_status_resultAdapter).invoke();
                    Analytics analytics9 = (Analytics) ((DoubleCheck) adapter.offline_cash_out_status_resultAdapter).getValue();
                    RealAccountRatePlanManager realAccountRatePlanManager = (RealAccountRatePlanManager) ((Provider) adapter.attempted_add_cash_status_resultAdapter).invoke();
                    RealFamilyProfileManager realFamilyProfileManager2 = (RealFamilyProfileManager) ((Provider) adapter.offline_add_cash_status_resultAdapter).invoke();
                    FeatureFlagManager featureFlagManager4 = (FeatureFlagManager) ((DoubleCheck) adapter.error_cash_out_status_resultAdapter).getValue();
                    RealProfilePhotoManager$Factory$Impl realProfilePhotoManager$Factory$Impl2 = (RealProfilePhotoManager$Factory$Impl) ((Provider) adapter.error_add_cash_status_resultAdapter).invoke();
                    FlowStarter flowStarter6 = (FlowStarter) ((DoubleCheck) adapter.offline_transfer_scenario_planAdapter).getValue();
                    n nVar = (n) ((RealMerchantProfileRepo$MetroFactory) adapter.error_transfer_scenario_planAdapter).invoke();
                    TimeToLiveSyncState timeToLiveSyncState = (TimeToLiveSyncState) ((DoubleCheck) adapter.retry_intervalsAdapter).getValue();
                    androidStringManager8.getClass();
                    realProfilePreviewPresenter$Factory$Impl.getClass();
                    realAccountOutboundNavigator$Factory$Impl2.getClass();
                    realProfileManager2.getClass();
                    realP2pSettingsManager2.getClass();
                    analytics9.getClass();
                    realAccountRatePlanManager.getClass();
                    realFamilyProfileManager2.getClass();
                    featureFlagManager4.getClass();
                    realProfilePhotoManager$Factory$Impl2.getClass();
                    flowStarter6.getClass();
                    timeToLiveSyncState.getClass();
                    return MoleculePresenterKt.asPresenter$default(new TapToPayPresenter(androidStringManager8, realProfilePreviewPresenter$Factory$Impl, realAccountOutboundNavigator$Factory$Impl2, realProfileManager2, realP2pSettingsManager2, analytics9, realAccountRatePlanManager, realFamilyProfileManager2, featureFlagManager4, realProfilePhotoManager$Factory$Impl2, flowStarter6, nVar, (EditProfile) screen, screenNavigator, timeToLiveSyncState));
                }
                if (screen instanceof BusinessInfoScreen) {
                    ComponentRegistry.Builder builder = ((BusinessInfoPresenter$Factory$Impl) obj7).delegateFactory;
                    RealBusinessProfileManager realBusinessProfileManager2 = (RealBusinessProfileManager) ((Provider) builder.interceptors).invoke();
                    FlowStarter flowStarter7 = (FlowStarter) ((DoubleCheck) builder.mappers).getValue();
                    Analytics analytics10 = (Analytics) ((DoubleCheck) builder.keyers).getValue();
                    FeatureFlagManager featureFlagManager5 = (FeatureFlagManager) ((DoubleCheck) builder.lazyFetcherFactories).getValue();
                    RealAccountRatePlanManager realAccountRatePlanManager2 = (RealAccountRatePlanManager) ((Provider) builder.lazyDecoderFactories).invoke();
                    realBusinessProfileManager2.getClass();
                    flowStarter7.getClass();
                    analytics10.getClass();
                    featureFlagManager5.getClass();
                    realAccountRatePlanManager2.getClass();
                    return MoleculePresenterKt.asPresenter$default(new DisclosurePresenter(realBusinessProfileManager2, flowStarter7, analytics10, featureFlagManager5, realAccountRatePlanManager2, (BusinessInfoScreen) screen, screenNavigator));
                }
                if (screen instanceof AccountSwitcherScreen) {
                    RealShoppingJavascriptPresenter.MetroFactory metroFactory3 = ((AccountSwitcherPresenter$Factory$Impl) obj5).delegateFactory;
                    RealAccountholderAccountRepository realAccountholderAccountRepository = (RealAccountholderAccountRepository) metroFactory3.autofillManagerProvider.invoke();
                    FeatureFlagManager featureFlagManager6 = (FeatureFlagManager) metroFactory3.analytics.getValue();
                    FlowStarter flowStarter8 = (FlowStarter) metroFactory3.cashApProxyService.getValue();
                    SessionManager sessionManager6 = (SessionManager) metroFactory3.ioDispatcher.lambda.invoke();
                    RealSettingsEligibilityManager realSettingsEligibilityManager2 = (RealSettingsEligibilityManager) metroFactory3.franklinAppService.getValue();
                    RealFeatureEligibilityRepository realFeatureEligibilityRepository = (RealFeatureEligibilityRepository) metroFactory3.shopHubAnalyticsHelper.getValue();
                    AndroidStringManager androidStringManager9 = (AndroidStringManager) metroFactory3.stringManager.lambda.invoke();
                    Analytics analytics11 = (Analytics) metroFactory3.featureFlagManager.getValue();
                    realAccountholderAccountRepository.getClass();
                    featureFlagManager6.getClass();
                    flowStarter8.getClass();
                    sessionManager6.getClass();
                    realSettingsEligibilityManager2.getClass();
                    realFeatureEligibilityRepository.getClass();
                    androidStringManager9.getClass();
                    analytics11.getClass();
                    return MoleculePresenterKt.asPresenter$default(new PaymentLoadingPresenter(realAccountholderAccountRepository, featureFlagManager6, flowStarter8, sessionManager6, realSettingsEligibilityManager2, realFeatureEligibilityRepository, androidStringManager9, analytics11, (AccountSwitcherScreen) screen, screenNavigator));
                }
                if (screen instanceof AddAccountScreen) {
                    VariantAppComponent.Impl.ZombieLegacyGraphExtensionImpl zombieLegacyGraphExtensionImpl = ((AddAccountOptionsPresenter$Factory$Impl) obj3).delegateFactory;
                    RealSettingsEligibilityManager realSettingsEligibilityManager3 = (RealSettingsEligibilityManager) zombieLegacyGraphExtensionImpl.provideSandboxedContextProvider.getValue();
                    FlowStarter flowStarter9 = (FlowStarter) zombieLegacyGraphExtensionImpl.provideAccountDatabaseHelperProvider.getValue();
                    Analytics analytics12 = (Analytics) zombieLegacyGraphExtensionImpl.provideSharedPreferencesProvider.getValue();
                    realSettingsEligibilityManager3.getClass();
                    flowStarter9.getClass();
                    analytics12.getClass();
                    return MoleculePresenterKt.asPresenter$default(new LocalPosCheckInPresenter(realSettingsEligibilityManager3, flowStarter9, analytics12, (AddAccountScreen) screen, screenNavigator));
                }
                if (screen instanceof SwitchFullAccountLoadingScreen) {
                    SimpleActor simpleActor = ((SwitchFullAccountLoadingPresenter$Factory$Impl) obj2).delegateFactory;
                    RealAccountSwitcher realAccountSwitcher = (RealAccountSwitcher) ((Provider) simpleActor.scope).invoke();
                    FlowStarter flowStarter10 = (FlowStarter) ((DoubleCheck) simpleActor.consumeMessage).getValue();
                    AcceptableScrim acceptableScrim = (AcceptableScrim) ((InstanceFactory) simpleActor.messageQueue).value;
                    AccountSwitchScreenStateRelay accountSwitchScreenStateRelay = (AccountSwitchScreenStateRelay) ((InstanceFactory) simpleActor.remainingMessages).value;
                    realAccountSwitcher.getClass();
                    flowStarter10.getClass();
                    acceptableScrim.getClass();
                    accountSwitchScreenStateRelay.getClass();
                    return MoleculePresenterKt.asPresenter$default(new CardStudioPresenter(realAccountSwitcher, flowStarter10, acceptableScrim, accountSwitchScreenStateRelay, (SwitchFullAccountLoadingScreen) screen, screenNavigator));
                }
                if (screen instanceof AccountsLoadingFailedScreen) {
                    return MoleculePresenterKt.asPresenter$default(new AddAliasPresenter(screenNavigator, i2));
                }
                if (!(screen instanceof ThemeSwitcherScreen)) {
                    return null;
                }
                ThemeSwitcherPresenter$MetroFactory themeSwitcherPresenter$MetroFactory = ((ThemeSwitcherPresenter$Factory$Impl) obj).delegateFactory;
                KeyValue keyValue2 = (KeyValue) themeSwitcherPresenter$MetroFactory.paymentPadThemeSelection.invoke();
                Analytics analytics13 = (Analytics) themeSwitcherPresenter$MetroFactory.analytics.getValue();
                PostcardClientService postcardClientService = (PostcardClientService) themeSwitcherPresenter$MetroFactory.postcardService.getValue();
                AndroidStringManager androidStringManager10 = (AndroidStringManager) themeSwitcherPresenter$MetroFactory.stringManager.lambda.invoke();
                FeatureFlagManager featureFlagManager7 = (FeatureFlagManager) themeSwitcherPresenter$MetroFactory.featureFlagManager.getValue();
                RealRouter$Factory$Impl realRouter$Factory$Impl2 = (RealRouter$Factory$Impl) themeSwitcherPresenter$MetroFactory.routerFactory.invoke();
                keyValue2.getClass();
                analytics13.getClass();
                postcardClientService.getClass();
                androidStringManager10.getClass();
                featureFlagManager7.getClass();
                realRouter$Factory$Impl2.getClass();
                return MoleculePresenterKt.asPresenter$default(new LocalEditorialPresenter(keyValue2, screenNavigator, (ThemeSwitcherScreen) screen, analytics13, postcardClientService, androidStringManager10, featureFlagManager7, realRouter$Factory$Impl2));
            case 2:
                screen.getClass();
                if (screen instanceof PaymentPadTabPopupAppMessage) {
                    CheckDepositAmountPresenter.MetroFactory metroFactory4 = ((PaymentPadPopupAppMessagePresenter$Factory$Impl) obj6).delegateFactory;
                    Flow flow2 = (Flow) metroFactory4.analytics.getValue();
                    PopupAppMessagePresenterHelper$Factory$Impl popupAppMessagePresenterHelper$Factory$Impl = (PopupAppMessagePresenterHelper$Factory$Impl) metroFactory4.blockerFlowAnalytics.invoke();
                    flow2.getClass();
                    popupAppMessagePresenterHelper$Factory$Impl.getClass();
                    return MoleculePresenterKt.asPresenter$default(new BalancePopupAppMessagePresenter(flow2, popupAppMessagePresenterHelper$Factory$Impl, screenNavigator, 5));
                }
                if (screen instanceof ActivityTabPopupAppMessage) {
                    CheckDepositAmountPresenter.MetroFactory metroFactory5 = ((ActivityPopupAppMessagePresenter$Factory$Impl) obj4).delegateFactory;
                    Flow flow3 = (Flow) metroFactory5.analytics.getValue();
                    PopupAppMessagePresenterHelper$Factory$Impl popupAppMessagePresenterHelper$Factory$Impl2 = (PopupAppMessagePresenterHelper$Factory$Impl) metroFactory5.blockerFlowAnalytics.invoke();
                    flow3.getClass();
                    popupAppMessagePresenterHelper$Factory$Impl2.getClass();
                    return MoleculePresenterKt.asPresenter$default(new BalancePopupAppMessagePresenter(flow3, popupAppMessagePresenterHelper$Factory$Impl2, screenNavigator, 1));
                }
                if (screen instanceof InvestingTabPopupAppMessage) {
                    CheckDepositAmountPresenter.MetroFactory metroFactory6 = ((InvestingPopupAppMessagePresenter$Factory$Impl) obj7).delegateFactory;
                    Flow flow4 = (Flow) metroFactory6.analytics.getValue();
                    PopupAppMessagePresenterHelper$Factory$Impl popupAppMessagePresenterHelper$Factory$Impl3 = (PopupAppMessagePresenterHelper$Factory$Impl) metroFactory6.blockerFlowAnalytics.invoke();
                    flow4.getClass();
                    popupAppMessagePresenterHelper$Factory$Impl3.getClass();
                    return MoleculePresenterKt.asPresenter$default(new BalancePopupAppMessagePresenter(flow4, popupAppMessagePresenterHelper$Factory$Impl3, screenNavigator, 3));
                }
                if (screen instanceof BalanceTabPopupAppMessage) {
                    CheckDepositAmountPresenter.MetroFactory metroFactory7 = ((BalancePopupAppMessagePresenter$Factory$Impl) obj5).delegateFactory;
                    Flow flow5 = (Flow) metroFactory7.analytics.getValue();
                    PopupAppMessagePresenterHelper$Factory$Impl popupAppMessagePresenterHelper$Factory$Impl4 = (PopupAppMessagePresenterHelper$Factory$Impl) metroFactory7.blockerFlowAnalytics.invoke();
                    flow5.getClass();
                    popupAppMessagePresenterHelper$Factory$Impl4.getClass();
                    return MoleculePresenterKt.asPresenter$default(new BalancePopupAppMessagePresenter(flow5, popupAppMessagePresenterHelper$Factory$Impl4, screenNavigator, 0));
                }
                if (screen instanceof CardTabPopupAppMessage) {
                    CheckDepositAmountPresenter.MetroFactory metroFactory8 = ((CardTabPopupAppMessagePresenter$Factory$Impl) obj3).delegateFactory;
                    Flow flow6 = (Flow) metroFactory8.analytics.getValue();
                    PopupAppMessagePresenterHelper$Factory$Impl popupAppMessagePresenterHelper$Factory$Impl5 = (PopupAppMessagePresenterHelper$Factory$Impl) metroFactory8.blockerFlowAnalytics.invoke();
                    flow6.getClass();
                    popupAppMessagePresenterHelper$Factory$Impl5.getClass();
                    return MoleculePresenterKt.asPresenter$default(new BalancePopupAppMessagePresenter(flow6, popupAppMessagePresenterHelper$Factory$Impl5, screenNavigator, 2));
                }
                if (screen instanceof OffersTabPopupAppMessage) {
                    CheckDepositAmountPresenter.MetroFactory metroFactory9 = ((OffersTabPopupAppMessagePresenter$Factory$Impl) obj2).delegateFactory;
                    Flow flow7 = (Flow) metroFactory9.analytics.getValue();
                    PopupAppMessagePresenterHelper$Factory$Impl popupAppMessagePresenterHelper$Factory$Impl6 = (PopupAppMessagePresenterHelper$Factory$Impl) metroFactory9.blockerFlowAnalytics.invoke();
                    flow7.getClass();
                    popupAppMessagePresenterHelper$Factory$Impl6.getClass();
                    return MoleculePresenterKt.asPresenter$default(new BalancePopupAppMessagePresenter(flow7, popupAppMessagePresenterHelper$Factory$Impl6, screenNavigator, 4));
                }
                if (screen instanceof PaymentScreens$HomeScreens$AppMessageErrorScreen) {
                    return MoleculePresenterKt.asPresenter$default(new ErrorPresenter((PaymentScreens$HomeScreens$AppMessageErrorScreen) screen, screenNavigator));
                }
                if (!(screen instanceof SheetAppMessage)) {
                    return null;
                }
                LanguageDisclosurePresenter$MetroFactory languageDisclosurePresenter$MetroFactory = ((SheetAppMessagePresenter$Factory$Impl) obj).delegateFactory;
                CoroutineContext coroutineContext4 = (CoroutineContext) languageDisclosurePresenter$MetroFactory.ioDispatcher.lambda.invoke();
                CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) languageDisclosurePresenter$MetroFactory.analytics.getValue();
                AppMessageClientService appMessageClientService = (AppMessageClientService) languageDisclosurePresenter$MetroFactory.appConfigManager.getValue();
                Analytics analytics14 = (Analytics) languageDisclosurePresenter$MetroFactory.appService.getValue();
                AndroidClock androidClock2 = (AndroidClock) languageDisclosurePresenter$MetroFactory.localeManager.lambda.invoke();
                IntentLauncher intentLauncher3 = (IntentLauncher) languageDisclosurePresenter$MetroFactory.activityFinisher.invoke();
                Flow flow8 = (Flow) languageDisclosurePresenter$MetroFactory.localizationDatabase.getValue();
                RealAppMessageActionPerformer$Factory$Impl realAppMessageActionPerformer$Factory$Impl = (RealAppMessageActionPerformer$Factory$Impl) languageDisclosurePresenter$MetroFactory.launcher.invoke();
                RealUuidGenerator realUuidGenerator7 = (RealUuidGenerator) languageDisclosurePresenter$MetroFactory.stringManager.lambda.invoke();
                coroutineContext4.getClass();
                cashAccountDatabaseImpl.getClass();
                appMessageClientService.getClass();
                analytics14.getClass();
                androidClock2.getClass();
                intentLauncher3.getClass();
                flow8.getClass();
                realAppMessageActionPerformer$Factory$Impl.getClass();
                realUuidGenerator7.getClass();
                return MoleculePresenterKt.asPresenter$default(new LocalCashBalancePresenter((SheetAppMessage) screen, screenNavigator, coroutineContext4, cashAccountDatabaseImpl, appMessageClientService, analytics14, androidClock2, intentLauncher3, flow8, realAppMessageActionPerformer$Factory$Impl, realUuidGenerator7));
            case 3:
                screen.getClass();
                if (screen instanceof BenefitsHomeScreen) {
                    TabToolbarPresenter.MetroFactory metroFactory10 = ((BenefitsHomePresenter$Factory$Impl) obj6).delegateFactory;
                    RealBenefitsOutboundNavigator$Factory$Impl realBenefitsOutboundNavigator$Factory$Impl = (RealBenefitsOutboundNavigator$Factory$Impl) ((InstanceFactory) metroFactory10.tabToolbarOutboundNavigatorFactory).value;
                    LocalizedMoneyFormatter.Factory factory6 = (LocalizedMoneyFormatter.Factory) metroFactory10.sessionManager.invoke();
                    RealRouter$Factory$Impl realRouter$Factory$Impl3 = (RealRouter$Factory$Impl) metroFactory10.profileManager.invoke();
                    BenefitsComparisonTablePresenter$Factory$Impl benefitsComparisonTablePresenter$Factory$Impl = (BenefitsComparisonTablePresenter$Factory$Impl) metroFactory10.badges.invoke();
                    ErrorReporter errorReporter = (ErrorReporter) ((LambdaProvider) metroFactory10.badgingStateAccessibilityHelper).lambda.invoke();
                    SampleStrategy sampleStrategy = (SampleStrategy) metroFactory10.badger2.invoke();
                    RealActivitiesCacheManager realActivitiesCacheManager2 = (RealActivitiesCacheManager) ((DoubleCheck) metroFactory10.moneybotFlagsHelper).getValue();
                    ActivityClientService activityClientService = (ActivityClientService) ((DoubleCheck) metroFactory10.moneybotAnalyticsService).getValue();
                    RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl2 = (RealActivityEmbeddedPresenter$Factory$Impl) metroFactory10.featureFlagManager.invoke();
                    Analytics analytics15 = (Analytics) ((DoubleCheck) metroFactory10.sessionFlags).getValue();
                    BankingBenefitsAppService bankingBenefitsAppService = (BankingBenefitsAppService) ((DoubleCheck) metroFactory10.syncValueReader).getValue();
                    AndroidDateFormatManager androidDateFormatManager3 = (AndroidDateFormatManager) ((LambdaProvider) metroFactory10.p2pSettingsManager).lambda.invoke();
                    RealDisclosureProvider realDisclosureProvider2 = (RealDisclosureProvider) metroFactory10.bitcoinCapabilityProvider.invoke();
                    FeatureFlagManager featureFlagManager8 = (FeatureFlagManager) ((DoubleCheck) metroFactory10.familyNavigatorFactory).getValue();
                    SessionManager sessionManager7 = (SessionManager) ((LambdaProvider) metroFactory10.familyProfileManager).lambda.invoke();
                    AndroidStringManager androidStringManager11 = (AndroidStringManager) ((LambdaProvider) metroFactory10.balanceSnapshotManager).lambda.invoke();
                    SyncValueReader syncValueReader = (SyncValueReader) ((DoubleCheck) metroFactory10.moneyFormatterFactory).getValue();
                    realBenefitsOutboundNavigator$Factory$Impl.getClass();
                    factory6.getClass();
                    realRouter$Factory$Impl3.getClass();
                    benefitsComparisonTablePresenter$Factory$Impl.getClass();
                    errorReporter.getClass();
                    sampleStrategy.getClass();
                    realActivitiesCacheManager2.getClass();
                    activityClientService.getClass();
                    realActivityEmbeddedPresenter$Factory$Impl2.getClass();
                    analytics15.getClass();
                    bankingBenefitsAppService.getClass();
                    androidDateFormatManager3.getClass();
                    realDisclosureProvider2.getClass();
                    featureFlagManager8.getClass();
                    sessionManager7.getClass();
                    androidStringManager11.getClass();
                    syncValueReader.getClass();
                    return MoleculePresenterKt.asPresenter$default(new BenefitsHomePresenter(realBenefitsOutboundNavigator$Factory$Impl, factory6, realRouter$Factory$Impl3, benefitsComparisonTablePresenter$Factory$Impl, errorReporter, sampleStrategy, realActivitiesCacheManager2, activityClientService, realActivityEmbeddedPresenter$Factory$Impl2, analytics15, bankingBenefitsAppService, androidDateFormatManager3, realDisclosureProvider2, featureFlagManager8, sessionManager7, androidStringManager11, syncValueReader, screenNavigator));
                }
                if (screen instanceof BankingBenefitsBookletScreen) {
                    InvestingDiscoveryPresenter$MetroFactory investingDiscoveryPresenter$MetroFactory = ((BankingBenefitsBookletPresenter$Factory$Impl) obj4).delegateFactory;
                    ErrorReporter errorReporter2 = (ErrorReporter) investingDiscoveryPresenter$MetroFactory.stringManager.lambda.invoke();
                    SampleStrategy sampleStrategy2 = (SampleStrategy) investingDiscoveryPresenter$MetroFactory.newsPresenterFactory.invoke();
                    Analytics analytics16 = (Analytics) investingDiscoveryPresenter$MetroFactory.database.getValue();
                    BankingBenefitsAppService bankingBenefitsAppService2 = (BankingBenefitsAppService) investingDiscoveryPresenter$MetroFactory.featureFlagManager.getValue();
                    BenefitsComparisonTablePresenter$Factory$Impl benefitsComparisonTablePresenter$Factory$Impl2 = (BenefitsComparisonTablePresenter$Factory$Impl) investingDiscoveryPresenter$MetroFactory.discoverySectionsPresenterFactory.invoke();
                    RealDisclosureProvider realDisclosureProvider3 = (RealDisclosureProvider) investingDiscoveryPresenter$MetroFactory.investingStateManager.invoke();
                    AndroidStringManager androidStringManager12 = (AndroidStringManager) investingDiscoveryPresenter$MetroFactory.ioDispatcher.lambda.invoke();
                    SyncValueReader syncValueReader2 = (SyncValueReader) investingDiscoveryPresenter$MetroFactory.rangeSelectionCache.getValue();
                    LocalizedMoneyFormatter.Factory factory7 = (LocalizedMoneyFormatter.Factory) investingDiscoveryPresenter$MetroFactory.investingActivity.invoke();
                    RealRouter$Factory$Impl realRouter$Factory$Impl4 = (RealRouter$Factory$Impl) investingDiscoveryPresenter$MetroFactory.kybRestrictionBannerFactory.invoke();
                    errorReporter2.getClass();
                    sampleStrategy2.getClass();
                    analytics16.getClass();
                    bankingBenefitsAppService2.getClass();
                    benefitsComparisonTablePresenter$Factory$Impl2.getClass();
                    realDisclosureProvider3.getClass();
                    androidStringManager12.getClass();
                    syncValueReader2.getClass();
                    factory7.getClass();
                    realRouter$Factory$Impl4.getClass();
                    return MoleculePresenterKt.asPresenter$default(new BankingBenefitsBookletPresenter(screenNavigator, errorReporter2, sampleStrategy2, analytics16, bankingBenefitsAppService2, benefitsComparisonTablePresenter$Factory$Impl2, realDisclosureProvider3, androidStringManager12, syncValueReader2, factory7, realRouter$Factory$Impl4));
                }
                if (screen instanceof GreenEligibleTransactionsScreen) {
                    Profile.Adapter adapter2 = ((GreenEligibleTransactionsPresenter$Factory$Impl) obj7).delegateFactory;
                    LocalizedMoneyFormatter.Factory factory8 = (LocalizedMoneyFormatter.Factory) ((Provider) adapter2.nearby_visibilityAdapter).invoke();
                    RealActivitiesCacheManager realActivitiesCacheManager3 = (RealActivitiesCacheManager) ((DoubleCheck) adapter2.rate_planAdapter).getValue();
                    ActivityClientService activityClientService2 = (ActivityClientService) ((DoubleCheck) adapter2.deposit_preferenceAdapter).getValue();
                    RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl3 = (RealActivityEmbeddedPresenter$Factory$Impl) ((Provider) adapter2.country_codeAdapter).invoke();
                    Analytics analytics17 = (Analytics) ((DoubleCheck) adapter2.default_currencyAdapter).getValue();
                    ErrorReporter errorReporter3 = (ErrorReporter) ((LambdaProvider) adapter2.incoming_request_policyAdapter).lambda.invoke();
                    SampleStrategy sampleStrategy3 = (SampleStrategy) ((Provider) adapter2.regionAdapter).invoke();
                    AndroidDateFormatManager androidDateFormatManager4 = (AndroidDateFormatManager) ((LambdaProvider) adapter2.bitcoin_display_unitsAdapter).lambda.invoke();
                    SessionManager sessionManager8 = (SessionManager) ((LambdaProvider) adapter2.bitcoin_amount_entry_currency_preferenceAdapter).lambda.invoke();
                    AndroidStringManager androidStringManager13 = (AndroidStringManager) ((LambdaProvider) adapter2.addressAdapter).lambda.invoke();
                    RealSupportNavigator realSupportNavigator = (RealSupportNavigator) ((Provider) adapter2.deposit_preference_dataAdapter).invoke();
                    SyncValueReader syncValueReader3 = (SyncValueReader) ((DoubleCheck) adapter2.available_p2p_target_regionsAdapter).getValue();
                    factory8.getClass();
                    realActivitiesCacheManager3.getClass();
                    activityClientService2.getClass();
                    realActivityEmbeddedPresenter$Factory$Impl3.getClass();
                    analytics17.getClass();
                    errorReporter3.getClass();
                    sampleStrategy3.getClass();
                    androidDateFormatManager4.getClass();
                    sessionManager8.getClass();
                    androidStringManager13.getClass();
                    realSupportNavigator.getClass();
                    syncValueReader3.getClass();
                    return MoleculePresenterKt.asPresenter$default(new OffersDetailsPresenter(factory8, realActivitiesCacheManager3, activityClientService2, realActivityEmbeddedPresenter$Factory$Impl3, analytics17, errorReporter3, sampleStrategy3, androidDateFormatManager4, sessionManager8, androidStringManager13, realSupportNavigator, syncValueReader3, (GreenEligibleTransactionsScreen) screen, screenNavigator));
                }
                if (screen instanceof PdsaBenefitsExplainerScreen) {
                    CardStudioPresenterV2$MetroFactory cardStudioPresenterV2$MetroFactory = ((PdsaBenefitsExplainerPresenter$Factory$Impl) obj5).delegateFactory;
                    RealRouter$Factory$Impl realRouter$Factory$Impl5 = (RealRouter$Factory$Impl) cardStudioPresenterV2$MetroFactory.deviceOrientationProvider.invoke();
                    Analytics analytics18 = (Analytics) cardStudioPresenterV2$MetroFactory.cashDatabase.getValue();
                    AndroidStringManager androidStringManager14 = (AndroidStringManager) cardStudioPresenterV2$MetroFactory.ioContext.lambda.invoke();
                    SyncValueReader syncValueReader4 = (SyncValueReader) cardStudioPresenterV2$MetroFactory.appConfig.getValue();
                    realRouter$Factory$Impl5.getClass();
                    analytics18.getClass();
                    androidStringManager14.getClass();
                    syncValueReader4.getClass();
                    return MoleculePresenterKt.asPresenter$default(new LocalPosCheckInPresenter(realRouter$Factory$Impl5, analytics18, androidStringManager14, syncValueReader4, screenNavigator));
                }
                if (screen instanceof BenefitDetailScreen) {
                    RealRouter$Factory$Impl realRouter$Factory$Impl6 = (RealRouter$Factory$Impl) ((BenefitDetailsPresenter$Factory$Impl) obj3).delegateFactory.sandboxer.invoke();
                    realRouter$Factory$Impl6.getClass();
                    return MoleculePresenterKt.asPresenter$default(new EndAppLockPresenter(realRouter$Factory$Impl6, (BenefitDetailScreen) screen, screenNavigator));
                }
                if (screen instanceof BenefitsExplanationScreen) {
                    RealRouter$Factory$Impl realRouter$Factory$Impl7 = (RealRouter$Factory$Impl) ((BenefitsExplanationPresenter$Factory$Impl) obj2).delegateFactory.staticImageLoader.invoke();
                    realRouter$Factory$Impl7.getClass();
                    return MoleculePresenterKt.asPresenter$default(new EndAppLockPresenter(realRouter$Factory$Impl7, (BenefitsExplanationScreen) screen, screenNavigator));
                }
                if (!(screen instanceof BenefitsHubScreen)) {
                    return null;
                }
                CardStudioPresenterV2$MetroFactory cardStudioPresenterV2$MetroFactory2 = ((BenefitsHubPresenter$Factory$Impl) obj).delegateFactory;
                RealRouter$Factory$Impl realRouter$Factory$Impl8 = (RealRouter$Factory$Impl) cardStudioPresenterV2$MetroFactory2.deviceOrientationProvider.invoke();
                BankingBenefitsAppService bankingBenefitsAppService3 = (BankingBenefitsAppService) cardStudioPresenterV2$MetroFactory2.cashDatabase.getValue();
                AndroidStringManager androidStringManager15 = (AndroidStringManager) cardStudioPresenterV2$MetroFactory2.ioContext.lambda.invoke();
                Analytics analytics19 = (Analytics) cardStudioPresenterV2$MetroFactory2.appConfig.getValue();
                realRouter$Factory$Impl8.getClass();
                bankingBenefitsAppService3.getClass();
                androidStringManager15.getClass();
                analytics19.getClass();
                return MoleculePresenterKt.asPresenter$default(new LocalPosCheckInPresenter(realRouter$Factory$Impl8, bankingBenefitsAppService3, androidStringManager15, analytics19, (BenefitsHubScreen) screen, screenNavigator));
            default:
                TransferInPresenter$Factory$Impl transferInPresenter$Factory$Impl = (TransferInPresenter$Factory$Impl) obj7;
                screen.getClass();
                SavingsScreen savingsScreen = screen instanceof SavingsScreen ? (SavingsScreen) screen : null;
                if (savingsScreen instanceof GeneralSavingsScreen) {
                    SavingsScreen.ScreenType screenType = ((GeneralSavingsScreen) savingsScreen).f1197type;
                    screenType.getClass();
                    OffersHomePresenter.MetroFactory metroFactory11 = ((SavingsScreenPresenter$Factory$Impl) obj6).delegateFactory;
                    SyncValueReader syncValueReader5 = (SyncValueReader) metroFactory11.offersTabRepository.getValue();
                    SyncValuesBasedSavingsBalanceStore syncValuesBasedSavingsBalanceStore = (SyncValuesBasedSavingsBalanceStore) metroFactory11.offersTabRefresher.invoke();
                    PersistentActiveGoalStore$Factory$Impl persistentActiveGoalStore$Factory$Impl = (PersistentActiveGoalStore$Factory$Impl) metroFactory11.launcher.invoke();
                    AndroidStringManager androidStringManager16 = (AndroidStringManager) metroFactory11.stringManager.lambda.invoke();
                    ErrorReporter errorReporter4 = (ErrorReporter) metroFactory11.clock.lambda.invoke();
                    SampleStrategy sampleStrategy4 = (SampleStrategy) metroFactory11.spanManager.invoke();
                    PiggybankAppService piggybankAppService = (PiggybankAppService) metroFactory11.analyticsHelper.getValue();
                    Analytics analytics20 = (Analytics) ((DoubleCheck) metroFactory11.clientRouteParser).getValue();
                    SavingsScreenContentFactory$Factory$Impl savingsScreenContentFactory$Factory$Impl = (SavingsScreenContentFactory$Factory$Impl) metroFactory11.clientSyncer.invoke();
                    RealActivitiesCacheManager realActivitiesCacheManager4 = (RealActivitiesCacheManager) ((DoubleCheck) metroFactory11.boostRepository).getValue();
                    RealObservabilityManager realObservabilityManager = (RealObservabilityManager) ((LambdaProvider) metroFactory11.offersPopupMessageDismisser).lambda.invoke();
                    SessionManager sessionManager9 = (SessionManager) ((LambdaProvider) metroFactory11.analyticsFactory).lambda.invoke();
                    CashAccountDatabaseImpl cashAccountDatabaseImpl2 = (CashAccountDatabaseImpl) ((DoubleCheck) metroFactory11.pendingAppMessages).getValue();
                    RealRouter$Factory$Impl realRouter$Factory$Impl9 = (RealRouter$Factory$Impl) metroFactory11.routerFactory.invoke();
                    CoroutineContext coroutineContext5 = (CoroutineContext) ((LambdaProvider) metroFactory11.offersSearchPresenterFactory).lambda.invoke();
                    syncValueReader5.getClass();
                    syncValuesBasedSavingsBalanceStore.getClass();
                    persistentActiveGoalStore$Factory$Impl.getClass();
                    androidStringManager16.getClass();
                    errorReporter4.getClass();
                    sampleStrategy4.getClass();
                    piggybankAppService.getClass();
                    analytics20.getClass();
                    savingsScreenContentFactory$Factory$Impl.getClass();
                    realActivitiesCacheManager4.getClass();
                    realObservabilityManager.getClass();
                    sessionManager9.getClass();
                    cashAccountDatabaseImpl2.getClass();
                    realRouter$Factory$Impl9.getClass();
                    coroutineContext5.getClass();
                    return MoleculePresenterKt.asPresenter$default(new SavingsScreenPresenter(syncValueReader5, syncValuesBasedSavingsBalanceStore, persistentActiveGoalStore$Factory$Impl, androidStringManager16, errorReporter4, sampleStrategy4, piggybankAppService, analytics20, savingsScreenContentFactory$Factory$Impl, realActivitiesCacheManager4, realObservabilityManager, sessionManager9, cashAccountDatabaseImpl2, realRouter$Factory$Impl9, coroutineContext5, screenNavigator, screenType));
                }
                if (!(savingsScreen instanceof TransferInScreen.Condensed) && !(savingsScreen instanceof TransferInScreen.Full)) {
                    if (savingsScreen instanceof TransferOutScreen$Full) {
                        TransferInPresenter$MetroFactory transferInPresenter$MetroFactory = ((TransferOutPresenter$Factory$Impl) obj5).delegateFactory;
                        AndroidStringManager androidStringManager17 = (AndroidStringManager) transferInPresenter$MetroFactory.stringManager.lambda.invoke();
                        Analytics analytics21 = (Analytics) transferInPresenter$MetroFactory.analytics.getValue();
                        LocalizedMoneyFormatter.Factory factory9 = (LocalizedMoneyFormatter.Factory) transferInPresenter$MetroFactory.moneyFormatterFactory.invoke();
                        androidStringManager17.getClass();
                        analytics21.getClass();
                        factory9.getClass();
                        return MoleculePresenterKt.asPresenter$default(new com.squareup.cash.profile.presenters.ErrorPresenter(new ShareSheetPresenter((TransferOutScreen$Full) savingsScreen, screenNavigator, androidStringManager17, analytics21, factory9), screenNavigator, 9));
                    }
                    if (savingsScreen instanceof SavingsFullActivityScreen) {
                        SavingsFullActivityScreen savingsFullActivityScreen = (SavingsFullActivityScreen) savingsScreen;
                        LocalEditorialPresenter.MetroFactory metroFactory12 = ((SavingsFullScreenActivityPresenter$Factory$Impl) obj4).delegateFactory;
                        RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl4 = (RealActivityEmbeddedPresenter$Factory$Impl) metroFactory12.launcher.invoke();
                        DefaultActivityItemEventHandler$Factory$Impl defaultActivityItemEventHandler$Factory$Impl2 = (DefaultActivityItemEventHandler$Factory$Impl) metroFactory12.installedStore.invoke();
                        SavingsActivityItemEventDecorator savingsActivityItemEventDecorator = (SavingsActivityItemEventDecorator) metroFactory12.responseContextHandlerFactory.invoke();
                        SessionManager sessionManager10 = (SessionManager) metroFactory12.clock.lambda.invoke();
                        RealActivitiesCacheManager realActivitiesCacheManager5 = (RealActivitiesCacheManager) metroFactory12.service.getValue();
                        AndroidStringManager androidStringManager18 = (AndroidStringManager) metroFactory12.stringManager.lambda.invoke();
                        realActivityEmbeddedPresenter$Factory$Impl4.getClass();
                        defaultActivityItemEventHandler$Factory$Impl2.getClass();
                        savingsActivityItemEventDecorator.getClass();
                        sessionManager10.getClass();
                        realActivitiesCacheManager5.getClass();
                        androidStringManager18.getClass();
                        return MoleculePresenterKt.asPresenter$default(new WorkHomePresenter(realActivityEmbeddedPresenter$Factory$Impl4, defaultActivityItemEventHandler$Factory$Impl2, savingsActivityItemEventDecorator, sessionManager10, realActivitiesCacheManager5, androidStringManager18, screenNavigator, savingsFullActivityScreen));
                    }
                    if (savingsScreen instanceof TransferProcessingScreen) {
                        TransferProcessingScreen transferProcessingScreen = (TransferProcessingScreen) savingsScreen;
                        TransferringPresenter$MetroFactory transferringPresenter$MetroFactory = ((TransferringPresenter$Factory$Impl) obj3).delegateFactory;
                        BalanceMoverAppService balanceMoverAppService = (BalanceMoverAppService) transferringPresenter$MetroFactory.appService.getValue();
                        FlowStarter flowStarter11 = (FlowStarter) transferringPresenter$MetroFactory.flowStarter.getValue();
                        BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) transferringPresenter$MetroFactory.blockersDataNavigator.invoke();
                        AndroidStringManager androidStringManager19 = (AndroidStringManager) transferringPresenter$MetroFactory.stringManager.lambda.invoke();
                        RealBalanceSnapshotManager realBalanceSnapshotManager = (RealBalanceSnapshotManager) transferringPresenter$MetroFactory.balanceSnapshotManager.invoke();
                        RealUuidGenerator realUuidGenerator8 = (RealUuidGenerator) transferringPresenter$MetroFactory.uuidGenerator.lambda.invoke();
                        LocalizedMoneyFormatter.Factory factory10 = (LocalizedMoneyFormatter.Factory) transferringPresenter$MetroFactory.moneyFormatterFactory.invoke();
                        balanceMoverAppService.getClass();
                        flowStarter11.getClass();
                        blockersDataNavigator.getClass();
                        androidStringManager19.getClass();
                        realBalanceSnapshotManager.getClass();
                        realUuidGenerator8.getClass();
                        factory10.getClass();
                        return MoleculePresenterKt.asPresenter$default(new LocalEditorialPresenter(balanceMoverAppService, flowStarter11, blockersDataNavigator, androidStringManager19, realBalanceSnapshotManager, realUuidGenerator8, factory10, transferProcessingScreen, screenNavigator));
                    }
                    if (savingsScreen instanceof SavingsCardSheet) {
                        return MoleculePresenterKt.asPresenter$default(((SavingsUpsellCardPresenter$Factory$Impl) obj2).create((SavingsCardSheet) savingsScreen, screenNavigator));
                    }
                    if (!(savingsScreen instanceof SavingsRouteInterstitialScreen)) {
                        if (savingsScreen == null) {
                            return null;
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    SavingsRouteInterstitialScreen savingsRouteInterstitialScreen = (SavingsRouteInterstitialScreen) savingsScreen;
                    CardStudioPresenterV2$MetroFactory cardStudioPresenterV2$MetroFactory3 = ((SavingsRouteInterstitialPresenter$Factory$Impl) obj).delegateFactory;
                    PiggybankAppService piggybankAppService2 = (PiggybankAppService) cardStudioPresenterV2$MetroFactory3.cashDatabase.getValue();
                    RealRouter$Factory$Impl realRouter$Factory$Impl10 = (RealRouter$Factory$Impl) cardStudioPresenterV2$MetroFactory3.deviceOrientationProvider.invoke();
                    AndroidStringManager androidStringManager20 = (AndroidStringManager) cardStudioPresenterV2$MetroFactory3.ioContext.lambda.invoke();
                    SyncValueReader syncValueReader6 = (SyncValueReader) cardStudioPresenterV2$MetroFactory3.appConfig.getValue();
                    piggybankAppService2.getClass();
                    realRouter$Factory$Impl10.getClass();
                    androidStringManager20.getClass();
                    syncValueReader6.getClass();
                    return MoleculePresenterKt.asPresenter$default(new PdfPreviewPresenter(piggybankAppService2, realRouter$Factory$Impl10, androidStringManager20, syncValueReader6, savingsRouteInterstitialScreen, screenNavigator));
                }
                return MoleculePresenterKt.asPresenter$default(transferInPresenter$Factory$Impl.create((TransferInScreen) savingsScreen, screenNavigator));
        }
    }

    public /* synthetic */ PoolsPresenterFactory(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        this.$r8$classId = i;
        this.poolsListPresenterFactory = obj;
        this.startPoolPresenterFactory = obj2;
        this.poolDetailsPresenterFactory = obj3;
        this.poolContributeWithNotePresenterFactory = obj4;
        this.poolInvitePeopleListPresenterFactory = obj5;
        this.poolMoreOptionsBottomSheetPresenterFactory = obj6;
        this.poolMemberListPresenterFactory = obj7;
    }
}
