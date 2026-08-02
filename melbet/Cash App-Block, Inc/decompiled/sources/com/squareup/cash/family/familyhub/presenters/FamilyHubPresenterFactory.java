package com.squareup.cash.family.familyhub.presenters;

import androidx.compose.ui.node.NodeChain;
import androidx.datastore.core.SimpleActor;
import app.cash.broadway.presenter.Presenter;
import app.cash.broadway.presenter.PresenterFactory;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt;
import app.cash.broadway.screen.Screen;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.passcode.presenters.EndAppLockPresenter;
import coil3.ImageLoader$Builder;
import com.bugsnag.android.DeviceBuildInfo;
import com.squareup.cash.account.backend.RealAccountholderAccountRepository;
import com.squareup.cash.account.presenters.AccountPresenterFactory$MetroFactory;
import com.squareup.cash.activity.presenters.BalanceFeedPresenter$MetroFactory;
import com.squareup.cash.activity.presenters.DefaultActivityItemEventHandler$Factory$Impl;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter$Factory$Impl;
import com.squareup.cash.bitcoin.presenters.RealBitcoinAmountPickerPresenter;
import com.squareup.cash.blockers.presenters.FileBlockerPresenter;
import com.squareup.cash.blockers.presenters.FilesetUploadPresenter;
import com.squareup.cash.blockers.presenters.GetFlowLoadingPresenter$MetroFactory;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.StampSheetPresenter$MetroFactory;
import com.squareup.cash.checks.VerifyCheckDialogPresenter;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.cryptonauts.api.CryptoCustomerControlsService;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.family.activity.presenters.FamilySharedActivityCache$Factory$Impl;
import com.squareup.cash.family.familyhub.backend.real.RealDependentAllowanceManager;
import com.squareup.cash.family.familyhub.backend.real.RealDependentBalancesStore;
import com.squareup.cash.family.familyhub.backend.real.RealDependentControlStatusManager;
import com.squareup.cash.family.familyhub.backend.real.RealFamilyAccountsManager;
import com.squareup.cash.family.familyhub.backend.real.RealManagedAccountTransferManager;
import com.squareup.cash.family.familyhub.backend.real.RealTagLockService;
import com.squareup.cash.family.familyhub.presenters.CashCardControlPresenter;
import com.squareup.cash.family.familyhub.screens.ControlDisablingConfirmationScreen;
import com.squareup.cash.family.familyhub.screens.ControlErrorScreen;
import com.squareup.cash.family.familyhub.screens.DependentActivityScreen;
import com.squareup.cash.family.familyhub.screens.DependentControlScreen;
import com.squareup.cash.family.familyhub.screens.DependentControlsAndLimitsScreen;
import com.squareup.cash.family.familyhub.screens.DependentDetailIntroductionDialog;
import com.squareup.cash.family.familyhub.screens.DependentDetailScreen;
import com.squareup.cash.family.familyhub.screens.DependentGeneralSavingsScreen;
import com.squareup.cash.family.familyhub.screens.DependentTeenQrCodeShareSheetScreen;
import com.squareup.cash.family.familyhub.screens.FamilyHome;
import com.squareup.cash.family.familyhub.screens.FamilyPendingRequestsScreen;
import com.squareup.cash.family.familyhub.screens.ManagedAccountTransferLoadingScreen;
import com.squareup.cash.family.familyhub.screens.ManagedAccountTransferScreen;
import com.squareup.cash.family.familyhub.screens.SetDependentCustomLimitErrorScreen;
import com.squareup.cash.family.familyhub.screens.SetDependentCustomLimitScreen;
import com.squareup.cash.family.familyhub.screens.SponsorDetailScreen;
import com.squareup.cash.family.familyhub.screens.SponsorLedInviteScreen;
import com.squareup.cash.family.familyhub.screens.SponsorResourcesScreen;
import com.squareup.cash.family.profileselection.real.RealFamilyProfileManager;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.merchant.backend.real.RealMerchantProfileRepo$MetroFactory;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.offers.presenters.OffersTimelinePresenter$MetroFactory;
import com.squareup.cash.onboarding.presenters.OnboardingLandingPresenter$MetroFactory;
import com.squareup.cash.pools.presenters.PoolDetailsPresenter$MetroFactory;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.profile.presenters.ProfilePresenter;
import com.squareup.cash.recipients.data.RealCustomerStore;
import com.squareup.cash.recurringpayments.backend.RealRecurringPaymentsManager;
import com.squareup.cash.recurringpayments.presenters.RealCreateOrEditRecurringPaymentPresenter;
import com.squareup.cash.recurringpayments.presenters.RealCreateOrEditRecurringPaymentPresenter$Factory$Impl;
import com.squareup.cash.recurringpayments.presenters.RealSelectCadencePresenter;
import com.squareup.cash.recurringpayments.presenters.RealSelectCadencePresenter$Factory$Impl;
import com.squareup.cash.recurringpayments.presenters.RealSelectDayOfCadencePresenter;
import com.squareup.cash.recurringpayments.presenters.RealSelectDayOfCadencePresenter$Factory$Impl;
import com.squareup.cash.recurringpayments.screens.CreateOrEditRecurringPaymentScreen;
import com.squareup.cash.recurringpayments.screens.SelectCadenceScreen;
import com.squareup.cash.recurringpayments.screens.SelectDayOfCadenceScreen;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.savings.backend.real.PersistentActiveGoalStore$Factory$Impl;
import com.squareup.cash.savings.presenters.SavingsActivityItemEventDecorator;
import com.squareup.cash.savings.presenters.SavingsScreenContentFactory$Factory$Impl;
import com.squareup.cash.savings.presenters.SavingsScreenPresenter;
import com.squareup.cash.savings.presenters.TransferringPresenter$MetroFactory;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.shopping.presenters.RealShoppingJavascriptPresenter;
import com.squareup.cash.storage.AndroidFileSaver;
import com.squareup.cash.storage.SandboxJanitor;
import com.squareup.cash.support.presenters.ArticlePresenter;
import com.squareup.cash.tax.presenters.TaxTooltipPresenter$MetroFactory;
import com.squareup.cash.timestampformatter.impl.RealTimestampFormatter$Factory$Impl;
import com.squareup.kotterknife.Lazy;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.activity.api.v1.ActivityClientService;
import com.squareup.protos.cash.aegis.service.AegisService;
import com.squareup.protos.cash.blockly.api.BlocklyService;
import com.squareup.protos.cash.fiatly.api.v1.FiatlyService;
import com.squareup.protos.cash.investcustomer.api.v1.InvestCustomerService;
import com.squareup.protos.cash.p2pencoreedge.RecurringPaymentsService;
import com.squareup.protos.cash.piggybank.appapi.PiggybankAppService;
import com.squareup.scannerview.TextSetter;
import com.squareup.util.android.AndroidPackageManager;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DelegateFactory;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class FamilyHubPresenterFactory implements PresenterFactory {
    public final RealCreateOrEditRecurringPaymentPresenter$Factory$Impl createOrEditRecurringPaymentPresenter;
    public final DependentActivityPresenter$Factory$Impl dependentActivityPresenter;
    public final ImageLoader$Builder dependentControlPresenterFactory;
    public final DependentControlsAndLimitsPresenter$Factory$Impl dependentControlsAndLimitsPresenter;
    public final DependentDetailPresenter$Factory$Impl dependentDetailPresenter;
    public final DependentSavingsScreenPresenter$Factory$Impl dependentSavingsScreenPresenter;
    public final DependentTeenQrCodeShareSheetPresenter$Factory$Impl dependentTeenQrCodeShareSheetPresenter;
    public final FamilyHomePresenter$Factory$Impl familyHomePresenter;
    public final FamilyPendingRequestsPresenter$Factory$Impl familyPendingRequestsPresenter;
    public final ManagedAccountTransferLoadingPresenter$Factory$Impl managedAccountTransferLoadingPresenter;
    public final ManagedAccountTransferPresenter$Factory$Impl managedAccountTransferPresenter;
    public final RealSelectCadencePresenter$Factory$Impl selectCadencePresenter;
    public final RealSelectDayOfCadencePresenter$Factory$Impl selectDayOfCadencePresenter;
    public final SetDependentCustomLimitPresenter$Factory$Impl setDependentCustomLimitPresenter;
    public final SponsorDetailPresenter$Factory$Impl sponsorDetailPresenter;
    public final SponsorLedInvitePresenter$Factory$Impl sponsorLedInvitePresenter;
    public final SponsorResourcesPresenter$Factory$Impl sponsorResourcesPresenter;
    public final U13CelebrationBlockerPresenter$Factory$Impl u13CelebrationBlockerPresenter;

    public final class MetroFactory implements Factory {
        public final InstanceFactory controlDisablingConfirmationPresenter;
        public final InstanceFactory createOrEditRecurringPaymentPresenter;
        public final InstanceFactory dependentActivityPresenter;
        public final AccountPresenterFactory$MetroFactory dependentControlPresenterFactory;
        public final InstanceFactory dependentControlsAndLimitsPresenter;
        public final InstanceFactory dependentDetailPresenter;
        public final InstanceFactory dependentSavingsScreenPresenter;
        public final InstanceFactory dependentTeenQrCodeShareSheetPresenter;
        public final InstanceFactory familyHomePresenter;
        public final InstanceFactory familyPendingRequestsPresenter;
        public final InstanceFactory managedAccountTransferLoadingPresenter;
        public final InstanceFactory managedAccountTransferPresenter;
        public final InstanceFactory selectCadencePresenter;
        public final InstanceFactory selectDayOfCadencePresenter;
        public final InstanceFactory setDependentCustomLimitPresenter;
        public final InstanceFactory sponsorDetailPresenter;
        public final InstanceFactory sponsorLedInvitePresenter;
        public final InstanceFactory sponsorResourcesPresenter;
        public final InstanceFactory u13CelebrationBlockerPresenter;

        public MetroFactory(InstanceFactory instanceFactory, InstanceFactory instanceFactory2, InstanceFactory instanceFactory3, InstanceFactory instanceFactory4, InstanceFactory instanceFactory5, InstanceFactory instanceFactory6, InstanceFactory instanceFactory7, InstanceFactory instanceFactory8, InstanceFactory instanceFactory9, InstanceFactory instanceFactory10, InstanceFactory instanceFactory11, InstanceFactory instanceFactory12, InstanceFactory instanceFactory13, InstanceFactory instanceFactory14, AccountPresenterFactory$MetroFactory accountPresenterFactory$MetroFactory, InstanceFactory instanceFactory15, InstanceFactory instanceFactory16, InstanceFactory instanceFactory17, InstanceFactory instanceFactory18) {
            this.dependentDetailPresenter = instanceFactory;
            this.sponsorDetailPresenter = instanceFactory2;
            this.dependentActivityPresenter = instanceFactory3;
            this.dependentControlsAndLimitsPresenter = instanceFactory4;
            this.createOrEditRecurringPaymentPresenter = instanceFactory5;
            this.selectCadencePresenter = instanceFactory6;
            this.selectDayOfCadencePresenter = instanceFactory7;
            this.setDependentCustomLimitPresenter = instanceFactory8;
            this.familyHomePresenter = instanceFactory9;
            this.familyPendingRequestsPresenter = instanceFactory10;
            this.controlDisablingConfirmationPresenter = instanceFactory11;
            this.sponsorLedInvitePresenter = instanceFactory12;
            this.sponsorResourcesPresenter = instanceFactory13;
            this.dependentSavingsScreenPresenter = instanceFactory14;
            this.dependentControlPresenterFactory = accountPresenterFactory$MetroFactory;
            this.dependentTeenQrCodeShareSheetPresenter = instanceFactory15;
            this.managedAccountTransferPresenter = instanceFactory16;
            this.managedAccountTransferLoadingPresenter = instanceFactory17;
            this.u13CelebrationBlockerPresenter = instanceFactory18;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            DependentDetailPresenter$Factory$Impl dependentDetailPresenter$Factory$Impl = (DependentDetailPresenter$Factory$Impl) this.dependentDetailPresenter.value;
            SponsorDetailPresenter$Factory$Impl sponsorDetailPresenter$Factory$Impl = (SponsorDetailPresenter$Factory$Impl) this.sponsorDetailPresenter.value;
            DependentActivityPresenter$Factory$Impl dependentActivityPresenter$Factory$Impl = (DependentActivityPresenter$Factory$Impl) this.dependentActivityPresenter.value;
            DependentControlsAndLimitsPresenter$Factory$Impl dependentControlsAndLimitsPresenter$Factory$Impl = (DependentControlsAndLimitsPresenter$Factory$Impl) this.dependentControlsAndLimitsPresenter.value;
            RealCreateOrEditRecurringPaymentPresenter$Factory$Impl realCreateOrEditRecurringPaymentPresenter$Factory$Impl = (RealCreateOrEditRecurringPaymentPresenter$Factory$Impl) this.createOrEditRecurringPaymentPresenter.value;
            RealSelectCadencePresenter$Factory$Impl realSelectCadencePresenter$Factory$Impl = (RealSelectCadencePresenter$Factory$Impl) this.selectCadencePresenter.value;
            RealSelectDayOfCadencePresenter$Factory$Impl realSelectDayOfCadencePresenter$Factory$Impl = (RealSelectDayOfCadencePresenter$Factory$Impl) this.selectDayOfCadencePresenter.value;
            SetDependentCustomLimitPresenter$Factory$Impl setDependentCustomLimitPresenter$Factory$Impl = (SetDependentCustomLimitPresenter$Factory$Impl) this.setDependentCustomLimitPresenter.value;
            FamilyHomePresenter$Factory$Impl familyHomePresenter$Factory$Impl = (FamilyHomePresenter$Factory$Impl) this.familyHomePresenter.value;
            FamilyPendingRequestsPresenter$Factory$Impl familyPendingRequestsPresenter$Factory$Impl = (FamilyPendingRequestsPresenter$Factory$Impl) this.familyPendingRequestsPresenter.value;
            ControlDisablingConfirmationPresenter$Factory$Impl controlDisablingConfirmationPresenter$Factory$Impl = (ControlDisablingConfirmationPresenter$Factory$Impl) this.controlDisablingConfirmationPresenter.value;
            SponsorLedInvitePresenter$Factory$Impl sponsorLedInvitePresenter$Factory$Impl = (SponsorLedInvitePresenter$Factory$Impl) this.sponsorLedInvitePresenter.value;
            SponsorResourcesPresenter$Factory$Impl sponsorResourcesPresenter$Factory$Impl = (SponsorResourcesPresenter$Factory$Impl) this.sponsorResourcesPresenter.value;
            DependentSavingsScreenPresenter$Factory$Impl dependentSavingsScreenPresenter$Factory$Impl = (DependentSavingsScreenPresenter$Factory$Impl) this.dependentSavingsScreenPresenter.value;
            ImageLoader$Builder imageLoader$Builder = (ImageLoader$Builder) this.dependentControlPresenterFactory.invoke();
            DependentTeenQrCodeShareSheetPresenter$Factory$Impl dependentTeenQrCodeShareSheetPresenter$Factory$Impl = (DependentTeenQrCodeShareSheetPresenter$Factory$Impl) this.dependentTeenQrCodeShareSheetPresenter.value;
            ManagedAccountTransferPresenter$Factory$Impl managedAccountTransferPresenter$Factory$Impl = (ManagedAccountTransferPresenter$Factory$Impl) this.managedAccountTransferPresenter.value;
            ManagedAccountTransferLoadingPresenter$Factory$Impl managedAccountTransferLoadingPresenter$Factory$Impl = (ManagedAccountTransferLoadingPresenter$Factory$Impl) this.managedAccountTransferLoadingPresenter.value;
            U13CelebrationBlockerPresenter$Factory$Impl u13CelebrationBlockerPresenter$Factory$Impl = (U13CelebrationBlockerPresenter$Factory$Impl) this.u13CelebrationBlockerPresenter.value;
            dependentDetailPresenter$Factory$Impl.getClass();
            sponsorDetailPresenter$Factory$Impl.getClass();
            dependentActivityPresenter$Factory$Impl.getClass();
            dependentControlsAndLimitsPresenter$Factory$Impl.getClass();
            realCreateOrEditRecurringPaymentPresenter$Factory$Impl.getClass();
            realSelectCadencePresenter$Factory$Impl.getClass();
            realSelectDayOfCadencePresenter$Factory$Impl.getClass();
            setDependentCustomLimitPresenter$Factory$Impl.getClass();
            familyHomePresenter$Factory$Impl.getClass();
            familyPendingRequestsPresenter$Factory$Impl.getClass();
            controlDisablingConfirmationPresenter$Factory$Impl.getClass();
            sponsorLedInvitePresenter$Factory$Impl.getClass();
            sponsorResourcesPresenter$Factory$Impl.getClass();
            dependentSavingsScreenPresenter$Factory$Impl.getClass();
            dependentTeenQrCodeShareSheetPresenter$Factory$Impl.getClass();
            managedAccountTransferPresenter$Factory$Impl.getClass();
            managedAccountTransferLoadingPresenter$Factory$Impl.getClass();
            u13CelebrationBlockerPresenter$Factory$Impl.getClass();
            return new FamilyHubPresenterFactory(dependentDetailPresenter$Factory$Impl, sponsorDetailPresenter$Factory$Impl, dependentActivityPresenter$Factory$Impl, dependentControlsAndLimitsPresenter$Factory$Impl, realCreateOrEditRecurringPaymentPresenter$Factory$Impl, realSelectCadencePresenter$Factory$Impl, realSelectDayOfCadencePresenter$Factory$Impl, setDependentCustomLimitPresenter$Factory$Impl, familyHomePresenter$Factory$Impl, familyPendingRequestsPresenter$Factory$Impl, controlDisablingConfirmationPresenter$Factory$Impl, sponsorLedInvitePresenter$Factory$Impl, sponsorResourcesPresenter$Factory$Impl, dependentSavingsScreenPresenter$Factory$Impl, imageLoader$Builder, dependentTeenQrCodeShareSheetPresenter$Factory$Impl, managedAccountTransferPresenter$Factory$Impl, managedAccountTransferLoadingPresenter$Factory$Impl, u13CelebrationBlockerPresenter$Factory$Impl);
        }
    }

    public FamilyHubPresenterFactory(DependentDetailPresenter$Factory$Impl dependentDetailPresenter$Factory$Impl, SponsorDetailPresenter$Factory$Impl sponsorDetailPresenter$Factory$Impl, DependentActivityPresenter$Factory$Impl dependentActivityPresenter$Factory$Impl, DependentControlsAndLimitsPresenter$Factory$Impl dependentControlsAndLimitsPresenter$Factory$Impl, RealCreateOrEditRecurringPaymentPresenter$Factory$Impl realCreateOrEditRecurringPaymentPresenter$Factory$Impl, RealSelectCadencePresenter$Factory$Impl realSelectCadencePresenter$Factory$Impl, RealSelectDayOfCadencePresenter$Factory$Impl realSelectDayOfCadencePresenter$Factory$Impl, SetDependentCustomLimitPresenter$Factory$Impl setDependentCustomLimitPresenter$Factory$Impl, FamilyHomePresenter$Factory$Impl familyHomePresenter$Factory$Impl, FamilyPendingRequestsPresenter$Factory$Impl familyPendingRequestsPresenter$Factory$Impl, ControlDisablingConfirmationPresenter$Factory$Impl controlDisablingConfirmationPresenter$Factory$Impl, SponsorLedInvitePresenter$Factory$Impl sponsorLedInvitePresenter$Factory$Impl, SponsorResourcesPresenter$Factory$Impl sponsorResourcesPresenter$Factory$Impl, DependentSavingsScreenPresenter$Factory$Impl dependentSavingsScreenPresenter$Factory$Impl, ImageLoader$Builder imageLoader$Builder, DependentTeenQrCodeShareSheetPresenter$Factory$Impl dependentTeenQrCodeShareSheetPresenter$Factory$Impl, ManagedAccountTransferPresenter$Factory$Impl managedAccountTransferPresenter$Factory$Impl, ManagedAccountTransferLoadingPresenter$Factory$Impl managedAccountTransferLoadingPresenter$Factory$Impl, U13CelebrationBlockerPresenter$Factory$Impl u13CelebrationBlockerPresenter$Factory$Impl) {
        this.dependentDetailPresenter = dependentDetailPresenter$Factory$Impl;
        this.sponsorDetailPresenter = sponsorDetailPresenter$Factory$Impl;
        this.dependentActivityPresenter = dependentActivityPresenter$Factory$Impl;
        this.dependentControlsAndLimitsPresenter = dependentControlsAndLimitsPresenter$Factory$Impl;
        this.createOrEditRecurringPaymentPresenter = realCreateOrEditRecurringPaymentPresenter$Factory$Impl;
        this.selectCadencePresenter = realSelectCadencePresenter$Factory$Impl;
        this.selectDayOfCadencePresenter = realSelectDayOfCadencePresenter$Factory$Impl;
        this.setDependentCustomLimitPresenter = setDependentCustomLimitPresenter$Factory$Impl;
        this.familyHomePresenter = familyHomePresenter$Factory$Impl;
        this.familyPendingRequestsPresenter = familyPendingRequestsPresenter$Factory$Impl;
        this.sponsorLedInvitePresenter = sponsorLedInvitePresenter$Factory$Impl;
        this.sponsorResourcesPresenter = sponsorResourcesPresenter$Factory$Impl;
        this.dependentSavingsScreenPresenter = dependentSavingsScreenPresenter$Factory$Impl;
        this.dependentControlPresenterFactory = imageLoader$Builder;
        this.dependentTeenQrCodeShareSheetPresenter = dependentTeenQrCodeShareSheetPresenter$Factory$Impl;
        this.managedAccountTransferPresenter = managedAccountTransferPresenter$Factory$Impl;
        this.managedAccountTransferLoadingPresenter = managedAccountTransferLoadingPresenter$Factory$Impl;
        this.u13CelebrationBlockerPresenter = u13CelebrationBlockerPresenter$Factory$Impl;
    }

    @Override // app.cash.broadway.presenter.PresenterFactory
    public final Presenter create(Screen screen, BetterNavigator.ScreenNavigator screenNavigator) {
        MoleculePresenter managedAccountControlPresenter;
        screen.getClass();
        if (screen instanceof ControlErrorScreen) {
            return MoleculePresenterKt.asPresenter$default(new VerifyCheckDialogPresenter((ControlErrorScreen) screen, screenNavigator));
        }
        if (screen instanceof DependentGeneralSavingsScreen) {
            PoolDetailsPresenter$MetroFactory poolDetailsPresenter$MetroFactory = this.dependentSavingsScreenPresenter.delegateFactory;
            Analytics analytics = (Analytics) ((DoubleCheck) poolDetailsPresenter$MetroFactory.blockersNavigator).getValue();
            PiggybankAppService piggybankAppService = (PiggybankAppService) ((DoubleCheck) poolDetailsPresenter$MetroFactory.analytics).getValue();
            RealDependentBalancesStore realDependentBalancesStore = (RealDependentBalancesStore) poolDetailsPresenter$MetroFactory.moneyFormatterFactory.invoke();
            SyncValueReader syncValueReader = (SyncValueReader) ((DoubleCheck) poolDetailsPresenter$MetroFactory.featureFlagManager).getValue();
            ErrorReporter errorReporter = (ErrorReporter) ((LambdaProvider) poolDetailsPresenter$MetroFactory.stringManager).lambda.invoke();
            EglCore eglCore = (EglCore) ((RealMerchantProfileRepo$MetroFactory) poolDetailsPresenter$MetroFactory.clock).invoke();
            FamilySharedActivityCache$Factory$Impl familySharedActivityCache$Factory$Impl = (FamilySharedActivityCache$Factory$Impl) poolDetailsPresenter$MetroFactory.poolsRepository.invoke();
            SampleStrategy sampleStrategy = (SampleStrategy) poolDetailsPresenter$MetroFactory.launcher.invoke();
            SavingsScreenContentFactory$Factory$Impl savingsScreenContentFactory$Factory$Impl = (SavingsScreenContentFactory$Factory$Impl) poolDetailsPresenter$MetroFactory.activityEmbeddedPresenterFactory.invoke();
            RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) poolDetailsPresenter$MetroFactory.defaultActivityItemEventHandlerFactory.invoke();
            CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) ((DoubleCheck) poolDetailsPresenter$MetroFactory.activitiesCacheManager).getValue();
            RealObservabilityManager realObservabilityManager = (RealObservabilityManager) ((LambdaProvider) poolDetailsPresenter$MetroFactory.sessionManager).lambda.invoke();
            PersistentActiveGoalStore$Factory$Impl persistentActiveGoalStore$Factory$Impl = (PersistentActiveGoalStore$Factory$Impl) poolDetailsPresenter$MetroFactory.uuidGenerator.invoke();
            CoroutineContext coroutineContext = (CoroutineContext) ((LambdaProvider) poolDetailsPresenter$MetroFactory.dateFormatManager).lambda.invoke();
            analytics.getClass();
            piggybankAppService.getClass();
            realDependentBalancesStore.getClass();
            syncValueReader.getClass();
            errorReporter.getClass();
            familySharedActivityCache$Factory$Impl.getClass();
            sampleStrategy.getClass();
            savingsScreenContentFactory$Factory$Impl.getClass();
            realRouter$Factory$Impl.getClass();
            cashAccountDatabaseImpl.getClass();
            realObservabilityManager.getClass();
            persistentActiveGoalStore$Factory$Impl.getClass();
            coroutineContext.getClass();
            return MoleculePresenterKt.asPresenter$default(new DependentSavingsScreenPresenter(analytics, piggybankAppService, realDependentBalancesStore, syncValueReader, errorReporter, eglCore, familySharedActivityCache$Factory$Impl, sampleStrategy, savingsScreenContentFactory$Factory$Impl, realRouter$Factory$Impl, cashAccountDatabaseImpl, realObservabilityManager, persistentActiveGoalStore$Factory$Impl, coroutineContext, screenNavigator, (DependentGeneralSavingsScreen) screen));
        }
        if (screen instanceof DependentDetailScreen) {
            FilesetUploadPresenter.MetroFactory metroFactory = this.dependentDetailPresenter.delegateFactory;
            Analytics analytics2 = (Analytics) metroFactory.analytics.getValue();
            RealCustomerStore realCustomerStore = (RealCustomerStore) metroFactory.blockersNavigator.invoke();
            RealFamilyAccountsManager realFamilyAccountsManager = (RealFamilyAccountsManager) metroFactory.fileTypeDescriber.invoke();
            AndroidStringManager androidStringManager = (AndroidStringManager) metroFactory.stringManager.lambda.invoke();
            FeatureFlagManager featureFlagManager = (FeatureFlagManager) metroFactory.fileUploadService.getValue();
            RealDependentAllowanceManager realDependentAllowanceManager = (RealDependentAllowanceManager) metroFactory.fileValidatorFactory.invoke();
            RealRouter$Factory$Impl realRouter$Factory$Impl2 = (RealRouter$Factory$Impl) metroFactory.imageFormatConverterFactory.invoke();
            RealDependentControlStatusManager.Factory factory = (RealDependentControlStatusManager.Factory) metroFactory.service.getValue();
            SessionManager sessionManager = (SessionManager) metroFactory.errorReporter.lambda.invoke();
            LocalizedMoneyFormatter.Factory factory2 = (LocalizedMoneyFormatter.Factory) metroFactory.blockersHelperFactory.invoke();
            RealDependentBalancesStore realDependentBalancesStore2 = (RealDependentBalancesStore) metroFactory.permissionManager.invoke();
            RealUuidGenerator realUuidGenerator = (RealUuidGenerator) metroFactory.fileProvider.lambda.invoke();
            CoroutineScope coroutineScope = (CoroutineScope) ((InstanceFactory) metroFactory.cameraLauncherFactory).value;
            RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl = (RealActivityEmbeddedPresenter$Factory$Impl) metroFactory.franklinAppService.invoke();
            DefaultActivityItemEventHandler$Factory$Impl defaultActivityItemEventHandler$Factory$Impl = (DefaultActivityItemEventHandler$Factory$Impl) metroFactory.storage.invoke();
            FamilySharedActivityCache$Factory$Impl familySharedActivityCache$Factory$Impl2 = (FamilySharedActivityCache$Factory$Impl) metroFactory.featureFlagManager.invoke();
            analytics2.getClass();
            realCustomerStore.getClass();
            realFamilyAccountsManager.getClass();
            androidStringManager.getClass();
            featureFlagManager.getClass();
            realDependentAllowanceManager.getClass();
            realRouter$Factory$Impl2.getClass();
            factory.getClass();
            sessionManager.getClass();
            factory2.getClass();
            realDependentBalancesStore2.getClass();
            realUuidGenerator.getClass();
            coroutineScope.getClass();
            realActivityEmbeddedPresenter$Factory$Impl.getClass();
            defaultActivityItemEventHandler$Factory$Impl.getClass();
            familySharedActivityCache$Factory$Impl2.getClass();
            return MoleculePresenterKt.asPresenter$default(new SavingsScreenPresenter(analytics2, realCustomerStore, realFamilyAccountsManager, androidStringManager, featureFlagManager, realDependentAllowanceManager, realRouter$Factory$Impl2, factory, sessionManager, (DependentDetailScreen) screen, screenNavigator, factory2, realDependentBalancesStore2, realUuidGenerator, coroutineScope, realActivityEmbeddedPresenter$Factory$Impl, defaultActivityItemEventHandler$Factory$Impl, familySharedActivityCache$Factory$Impl2));
        }
        if (screen instanceof SponsorDetailScreen) {
            OffersTimelinePresenter$MetroFactory offersTimelinePresenter$MetroFactory = this.sponsorDetailPresenter.delegateFactory;
            RealCustomerStore realCustomerStore2 = (RealCustomerStore) offersTimelinePresenter$MetroFactory.offersSheetRepository.invoke();
            AndroidStringManager androidStringManager2 = (AndroidStringManager) offersTimelinePresenter$MetroFactory.stringManager.lambda.invoke();
            RealRouter$Factory$Impl realRouter$Factory$Impl3 = (RealRouter$Factory$Impl) offersTimelinePresenter$MetroFactory.flowTokenGenerator.invoke();
            Analytics analytics3 = (Analytics) offersTimelinePresenter$MetroFactory.analyticsHelper.getValue();
            SessionManager sessionManager2 = (SessionManager) offersTimelinePresenter$MetroFactory.observabilityManager.lambda.invoke();
            RealDependentAllowanceManager realDependentAllowanceManager2 = (RealDependentAllowanceManager) offersTimelinePresenter$MetroFactory.spanManager.invoke();
            FlowStarter flowStarter = (FlowStarter) offersTimelinePresenter$MetroFactory.flowStarter.getValue();
            ErrorReporter errorReporter2 = (ErrorReporter) offersTimelinePresenter$MetroFactory.clock.lambda.invoke();
            SampleStrategy sampleStrategy2 = (SampleStrategy) offersTimelinePresenter$MetroFactory.routerFactory.invoke();
            LocalizedMoneyFormatter.Factory factory3 = (LocalizedMoneyFormatter.Factory) offersTimelinePresenter$MetroFactory.analyticsFactory.invoke();
            CoroutineContext coroutineContext2 = (CoroutineContext) offersTimelinePresenter$MetroFactory.uuidGenerator.lambda.invoke();
            realCustomerStore2.getClass();
            androidStringManager2.getClass();
            realRouter$Factory$Impl3.getClass();
            analytics3.getClass();
            sessionManager2.getClass();
            realDependentAllowanceManager2.getClass();
            flowStarter.getClass();
            errorReporter2.getClass();
            sampleStrategy2.getClass();
            factory3.getClass();
            coroutineContext2.getClass();
            return MoleculePresenterKt.asPresenter$default(new ProfilePresenter(realCustomerStore2, androidStringManager2, realRouter$Factory$Impl3, analytics3, sessionManager2, realDependentAllowanceManager2, flowStarter, errorReporter2, sampleStrategy2, screenNavigator, (SponsorDetailScreen) screen, factory3, coroutineContext2));
        }
        if (screen instanceof DependentActivityScreen) {
            BalanceFeedPresenter$MetroFactory balanceFeedPresenter$MetroFactory = this.dependentActivityPresenter.delegateFactory;
            RealCustomerStore realCustomerStore3 = (RealCustomerStore) balanceFeedPresenter$MetroFactory.activityEmbeddedPresenterFactory.invoke();
            AndroidStringManager androidStringManager3 = (AndroidStringManager) balanceFeedPresenter$MetroFactory.stringManager.lambda.invoke();
            ActivityClientService activityClientService = (ActivityClientService) balanceFeedPresenter$MetroFactory.activitiesCacheManager.getValue();
            RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl2 = (RealActivityEmbeddedPresenter$Factory$Impl) balanceFeedPresenter$MetroFactory.activityTokenFactory.invoke();
            DefaultActivityItemEventHandler$Factory$Impl defaultActivityItemEventHandler$Factory$Impl2 = (DefaultActivityItemEventHandler$Factory$Impl) balanceFeedPresenter$MetroFactory.moneyFormatterFactory.invoke();
            SavingsActivityItemEventDecorator savingsActivityItemEventDecorator = (SavingsActivityItemEventDecorator) balanceFeedPresenter$MetroFactory.balanceSnapshotManager.invoke();
            realCustomerStore3.getClass();
            androidStringManager3.getClass();
            activityClientService.getClass();
            realActivityEmbeddedPresenter$Factory$Impl2.getClass();
            defaultActivityItemEventHandler$Factory$Impl2.getClass();
            savingsActivityItemEventDecorator.getClass();
            return MoleculePresenterKt.asPresenter$default(new LocalPosCheckInPresenter(realCustomerStore3, androidStringManager3, activityClientService, realActivityEmbeddedPresenter$Factory$Impl2, defaultActivityItemEventHandler$Factory$Impl2, savingsActivityItemEventDecorator, (DependentActivityScreen) screen, screenNavigator));
        }
        if (screen instanceof DependentControlsAndLimitsScreen) {
            ImageLoader$Builder imageLoader$Builder = this.dependentControlsAndLimitsPresenter.delegateFactory;
            RealRouter$Factory$Impl realRouter$Factory$Impl4 = (RealRouter$Factory$Impl) ((Provider) imageLoader$Builder.application).invoke();
            RealCustomerStore realCustomerStore4 = (RealCustomerStore) ((Provider) imageLoader$Builder.defaults).invoke();
            AndroidStringManager androidStringManager4 = (AndroidStringManager) ((LambdaProvider) imageLoader$Builder.mainCoroutineContextLazy).lambda.invoke();
            FeatureFlagManager featureFlagManager2 = (FeatureFlagManager) ((DoubleCheck) imageLoader$Builder.memoryCacheLazy).getValue();
            RealDependentControlStatusManager.Factory factory4 = (RealDependentControlStatusManager.Factory) ((DoubleCheck) imageLoader$Builder.diskCacheLazy).getValue();
            RealFamilyAccountsManager realFamilyAccountsManager2 = (RealFamilyAccountsManager) ((Provider) imageLoader$Builder.eventListenerFactory).invoke();
            BlocklyService blocklyService = (BlocklyService) ((DoubleCheck) imageLoader$Builder.componentRegistry).getValue();
            Analytics analytics4 = (Analytics) ((DoubleCheck) imageLoader$Builder.extras).getValue();
            realRouter$Factory$Impl4.getClass();
            realCustomerStore4.getClass();
            androidStringManager4.getClass();
            featureFlagManager2.getClass();
            factory4.getClass();
            realFamilyAccountsManager2.getClass();
            blocklyService.getClass();
            analytics4.getClass();
            return MoleculePresenterKt.asPresenter$default(new RealBitcoinAmountPickerPresenter(realRouter$Factory$Impl4, realCustomerStore4, androidStringManager4, featureFlagManager2, (DependentControlsAndLimitsScreen) screen, screenNavigator, factory4, realFamilyAccountsManager2, blocklyService, analytics4));
        }
        if (screen instanceof DependentDetailIntroductionDialog) {
            return MoleculePresenterKt.asPresenter$default(new VerifyCheckDialogPresenter((DependentDetailIntroductionDialog) screen, screenNavigator));
        }
        if (screen instanceof CreateOrEditRecurringPaymentScreen) {
            TransferringPresenter$MetroFactory transferringPresenter$MetroFactory = this.createOrEditRecurringPaymentPresenter.delegateFactory;
            RecurringPaymentsService recurringPaymentsService = (RecurringPaymentsService) transferringPresenter$MetroFactory.appService.getValue();
            RealRecurringPaymentsManager realRecurringPaymentsManager = (RealRecurringPaymentsManager) transferringPresenter$MetroFactory.blockersDataNavigator.invoke();
            BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) transferringPresenter$MetroFactory.balanceSnapshotManager.invoke();
            AndroidStringManager androidStringManager5 = (AndroidStringManager) transferringPresenter$MetroFactory.stringManager.lambda.invoke();
            Analytics analytics5 = (Analytics) transferringPresenter$MetroFactory.flowStarter.getValue();
            LocalizedMoneyFormatter.Factory factory5 = (LocalizedMoneyFormatter.Factory) transferringPresenter$MetroFactory.moneyFormatterFactory.invoke();
            RealObservabilityManager realObservabilityManager2 = (RealObservabilityManager) transferringPresenter$MetroFactory.uuidGenerator.lambda.invoke();
            recurringPaymentsService.getClass();
            realRecurringPaymentsManager.getClass();
            blockersDataNavigator.getClass();
            androidStringManager5.getClass();
            analytics5.getClass();
            factory5.getClass();
            realObservabilityManager2.getClass();
            return MoleculePresenterKt.asPresenter$default(new RealCreateOrEditRecurringPaymentPresenter((CreateOrEditRecurringPaymentScreen) screen, screenNavigator, recurringPaymentsService, realRecurringPaymentsManager, blockersDataNavigator, androidStringManager5, analytics5, factory5, realObservabilityManager2));
        }
        if (screen instanceof SelectCadenceScreen) {
            StampSheetPresenter$MetroFactory stampSheetPresenter$MetroFactory = this.selectCadencePresenter.delegateFactory;
            Analytics analytics6 = (Analytics) stampSheetPresenter$MetroFactory.appConfig.getValue();
            RealObservabilityManager realObservabilityManager3 = (RealObservabilityManager) stampSheetPresenter$MetroFactory.ioContext.lambda.invoke();
            analytics6.getClass();
            realObservabilityManager3.getClass();
            return MoleculePresenterKt.asPresenter$default(new RealSelectCadencePresenter((SelectCadenceScreen) screen, screenNavigator, analytics6, realObservabilityManager3));
        }
        if (screen instanceof SelectDayOfCadenceScreen) {
            OnboardingLandingPresenter$MetroFactory onboardingLandingPresenter$MetroFactory = this.selectDayOfCadencePresenter.delegateFactory;
            AndroidStringManager androidStringManager6 = (AndroidStringManager) onboardingLandingPresenter$MetroFactory.observabilityManager.lambda.invoke();
            Analytics analytics7 = (Analytics) onboardingLandingPresenter$MetroFactory.analytics.getValue();
            RealObservabilityManager realObservabilityManager4 = (RealObservabilityManager) onboardingLandingPresenter$MetroFactory.stringManager.lambda.invoke();
            androidStringManager6.getClass();
            analytics7.getClass();
            realObservabilityManager4.getClass();
            return MoleculePresenterKt.asPresenter$default(new RealSelectDayOfCadencePresenter(androidStringManager6, analytics7, (SelectDayOfCadenceScreen) screen, screenNavigator, realObservabilityManager4));
        }
        if (screen instanceof SetDependentCustomLimitErrorScreen) {
            return MoleculePresenterKt.asPresenter$default(new VerifyCheckDialogPresenter((SetDependentCustomLimitErrorScreen) screen, screenNavigator));
        }
        if (screen instanceof SetDependentCustomLimitScreen) {
            RealShoppingJavascriptPresenter.MetroFactory metroFactory2 = this.setDependentCustomLimitPresenter.delegateFactory;
            LocalizedMoneyFormatter.Factory factory6 = (LocalizedMoneyFormatter.Factory) metroFactory2.autofillManagerProvider.invoke();
            AndroidStringManager androidStringManager7 = (AndroidStringManager) metroFactory2.ioDispatcher.lambda.invoke();
            CryptoCustomerControlsService cryptoCustomerControlsService = (CryptoCustomerControlsService) metroFactory2.analytics.getValue();
            InvestCustomerService investCustomerService = (InvestCustomerService) metroFactory2.cashApProxyService.getValue();
            RealDependentControlStatusManager.Factory factory7 = (RealDependentControlStatusManager.Factory) metroFactory2.franklinAppService.getValue();
            CoroutineContext coroutineContext3 = (CoroutineContext) metroFactory2.stringManager.lambda.invoke();
            FiatlyService fiatlyService = (FiatlyService) metroFactory2.shopHubAnalyticsHelper.getValue();
            AegisService aegisService = (AegisService) metroFactory2.featureFlagManager.getValue();
            factory6.getClass();
            androidStringManager7.getClass();
            cryptoCustomerControlsService.getClass();
            investCustomerService.getClass();
            factory7.getClass();
            coroutineContext3.getClass();
            fiatlyService.getClass();
            aegisService.getClass();
            return MoleculePresenterKt.asPresenter$default(new PoolsListPresenter(factory6, androidStringManager7, cryptoCustomerControlsService, investCustomerService, factory7, coroutineContext3, (SetDependentCustomLimitScreen) screen, screenNavigator, fiatlyService, aegisService));
        }
        if (screen instanceof FamilyHome) {
            ArticlePresenter.MetroFactory metroFactory3 = this.familyHomePresenter.delegateFactory;
            SessionManager sessionManager3 = (SessionManager) ((LambdaProvider) metroFactory3.stringManager).lambda.invoke();
            RealCustomerStore realCustomerStore5 = (RealCustomerStore) metroFactory3.contactSupportNavigator.invoke();
            RealProfileManager realProfileManager = (RealProfileManager) ((DelegateFactory) metroFactory3.supportPhoneService).invoke();
            AndroidStringManager androidStringManager8 = (AndroidStringManager) ((LambdaProvider) metroFactory3.dateFormatManager).lambda.invoke();
            RealDependentBalancesStore realDependentBalancesStore3 = (RealDependentBalancesStore) metroFactory3.linkNavigator.invoke();
            LocalizedMoneyFormatter.Factory factory8 = (LocalizedMoneyFormatter.Factory) metroFactory3.viewedArticlesStore.invoke();
            RealTimestampFormatter$Factory$Impl realTimestampFormatter$Factory$Impl = (RealTimestampFormatter$Factory$Impl) metroFactory3.supportStatus.invoke();
            RealRouter$Factory$Impl realRouter$Factory$Impl5 = (RealRouter$Factory$Impl) metroFactory3.launcher.invoke();
            Analytics analytics8 = (Analytics) ((DoubleCheck) metroFactory3.articlesService).getValue();
            IntentLauncher intentLauncher = (IntentLauncher) metroFactory3.routerFactory.invoke();
            AegisService aegisService2 = (AegisService) ((DoubleCheck) metroFactory3.transactionService).getValue();
            PendingRequestActivityManager pendingRequestActivityManager = (PendingRequestActivityManager) metroFactory3.incidentsService.invoke();
            DefaultActivityItemEventHandler$Factory$Impl defaultActivityItemEventHandler$Factory$Impl3 = (DefaultActivityItemEventHandler$Factory$Impl) metroFactory3.activityDataBridge.invoke();
            FeatureFlagManager featureFlagManager3 = (FeatureFlagManager) ((DoubleCheck) metroFactory3.analytics).getValue();
            RealAccountholderAccountRepository realAccountholderAccountRepository = (RealAccountholderAccountRepository) metroFactory3.viewTokenGenerator.invoke();
            FamilyUpsellAnalytics familyUpsellAnalytics = (FamilyUpsellAnalytics) ((AndroidFileSaver.MetroFactory) metroFactory3.observabilityManager).invoke();
            ErrorReporter errorReporter3 = (ErrorReporter) ((LambdaProvider) metroFactory3.clock).lambda.invoke();
            SampleStrategy sampleStrategy3 = (SampleStrategy) metroFactory3.moshi.invoke();
            sessionManager3.getClass();
            realCustomerStore5.getClass();
            realProfileManager.getClass();
            androidStringManager8.getClass();
            realDependentBalancesStore3.getClass();
            factory8.getClass();
            realTimestampFormatter$Factory$Impl.getClass();
            realRouter$Factory$Impl5.getClass();
            analytics8.getClass();
            intentLauncher.getClass();
            aegisService2.getClass();
            pendingRequestActivityManager.getClass();
            defaultActivityItemEventHandler$Factory$Impl3.getClass();
            featureFlagManager3.getClass();
            realAccountholderAccountRepository.getClass();
            errorReporter3.getClass();
            sampleStrategy3.getClass();
            return MoleculePresenterKt.asPresenter$default(new FamilyHomePresenter((FamilyHome) screen, screenNavigator, sessionManager3, realCustomerStore5, realProfileManager, androidStringManager8, realDependentBalancesStore3, factory8, realTimestampFormatter$Factory$Impl, realRouter$Factory$Impl5, analytics8, intentLauncher, aegisService2, pendingRequestActivityManager, defaultActivityItemEventHandler$Factory$Impl3, featureFlagManager3, realAccountholderAccountRepository, familyUpsellAnalytics, errorReporter3, sampleStrategy3));
        }
        if (screen instanceof FamilyPendingRequestsScreen) {
            DeviceBuildInfo deviceBuildInfo = this.familyPendingRequestsPresenter.delegateFactory;
            RealCustomerStore realCustomerStore6 = (RealCustomerStore) ((Provider) deviceBuildInfo.manufacturer).invoke();
            AndroidStringManager androidStringManager9 = (AndroidStringManager) ((LambdaProvider) deviceBuildInfo.model).lambda.invoke();
            RealRouter$Factory$Impl realRouter$Factory$Impl6 = (RealRouter$Factory$Impl) ((Provider) deviceBuildInfo.osVersion).invoke();
            Analytics analytics9 = (Analytics) ((DoubleCheck) deviceBuildInfo.osBuild).getValue();
            AegisService aegisService3 = (AegisService) ((DoubleCheck) deviceBuildInfo.fingerprint).getValue();
            PendingRequestActivityManager pendingRequestActivityManager2 = (PendingRequestActivityManager) ((Provider) deviceBuildInfo.tags).invoke();
            DefaultActivityItemEventHandler$Factory$Impl defaultActivityItemEventHandler$Factory$Impl4 = (DefaultActivityItemEventHandler$Factory$Impl) ((Provider) deviceBuildInfo.brand).invoke();
            ErrorReporter errorReporter4 = (ErrorReporter) ((LambdaProvider) deviceBuildInfo.apiLevel).lambda.invoke();
            SampleStrategy sampleStrategy4 = (SampleStrategy) ((Provider) deviceBuildInfo.cpuAbis).invoke();
            realCustomerStore6.getClass();
            androidStringManager9.getClass();
            realRouter$Factory$Impl6.getClass();
            analytics9.getClass();
            aegisService3.getClass();
            pendingRequestActivityManager2.getClass();
            defaultActivityItemEventHandler$Factory$Impl4.getClass();
            errorReporter4.getClass();
            sampleStrategy4.getClass();
            return MoleculePresenterKt.asPresenter$default(new FamilyPendingRequestsPresenter(realCustomerStore6, androidStringManager9, realRouter$Factory$Impl6, analytics9, aegisService3, pendingRequestActivityManager2, defaultActivityItemEventHandler$Factory$Impl4, errorReporter4, sampleStrategy4, (FamilyPendingRequestsScreen) screen, screenNavigator));
        }
        if (screen instanceof ControlDisablingConfirmationScreen) {
            return MoleculePresenterKt.asPresenter$default(new VerifyCheckDialogPresenter((ControlDisablingConfirmationScreen) screen, screenNavigator));
        }
        if (screen instanceof SponsorLedInviteScreen) {
            SponsorLedInvitePresenter$MetroFactory sponsorLedInvitePresenter$MetroFactory = this.sponsorLedInvitePresenter.delegateFactory;
            AndroidStringManager androidStringManager10 = (AndroidStringManager) sponsorLedInvitePresenter$MetroFactory.stringManager.lambda.invoke();
            RealCustomerStore realCustomerStore7 = (RealCustomerStore) sponsorLedInvitePresenter$MetroFactory.customerStore.invoke();
            ErrorReporter errorReporter5 = (ErrorReporter) sponsorLedInvitePresenter$MetroFactory.errorReporter.lambda.invoke();
            SampleStrategy sampleStrategy5 = (SampleStrategy) sponsorLedInvitePresenter$MetroFactory.oneErrorPerAppSessionStrategy.invoke();
            RealRouter$Factory$Impl realRouter$Factory$Impl7 = (RealRouter$Factory$Impl) sponsorLedInvitePresenter$MetroFactory.routerFactory.invoke();
            androidStringManager10.getClass();
            realCustomerStore7.getClass();
            errorReporter5.getClass();
            sampleStrategy5.getClass();
            realRouter$Factory$Impl7.getClass();
            return MoleculePresenterKt.asPresenter$default(new LocalEditorialPresenter((SponsorLedInviteScreen) screen, screenNavigator, androidStringManager10, realCustomerStore7, errorReporter5, sampleStrategy5, realRouter$Factory$Impl7));
        }
        if (screen instanceof SponsorResourcesScreen) {
            TaxTooltipPresenter$MetroFactory taxTooltipPresenter$MetroFactory = this.sponsorResourcesPresenter.delegateFactory;
            AndroidStringManager androidStringManager11 = (AndroidStringManager) taxTooltipPresenter$MetroFactory.stringManager.lambda.invoke();
            RealRouter$Factory$Impl realRouter$Factory$Impl8 = (RealRouter$Factory$Impl) taxTooltipPresenter$MetroFactory.taxDesktopTooltipPreference.invoke();
            androidStringManager11.getClass();
            realRouter$Factory$Impl8.getClass();
            return MoleculePresenterKt.asPresenter$default(new MusicPresenter(androidStringManager11, realRouter$Factory$Impl8, (SponsorResourcesScreen) screen, screenNavigator));
        }
        if (!(screen instanceof DependentControlScreen)) {
            if (screen instanceof DependentTeenQrCodeShareSheetScreen) {
                SimpleActor simpleActor = this.dependentTeenQrCodeShareSheetPresenter.delegateFactory;
                AndroidStringManager androidStringManager12 = (AndroidStringManager) ((LambdaProvider) simpleActor.scope).lambda.invoke();
                AndroidPackageManager androidPackageManager = (AndroidPackageManager) ((LambdaProvider) simpleActor.consumeMessage).lambda.invoke();
                TextSetter textSetter = (TextSetter) ((SandboxJanitor.MetroFactory) simpleActor.messageQueue).invoke();
                Analytics analytics10 = (Analytics) ((DoubleCheck) simpleActor.remainingMessages).getValue();
                androidStringManager12.getClass();
                androidPackageManager.getClass();
                analytics10.getClass();
                return MoleculePresenterKt.asPresenter$default(new CardStudioPresenter(androidStringManager12, androidPackageManager, textSetter, analytics10, (DependentTeenQrCodeShareSheetScreen) screen, screenNavigator));
            }
            if (!(screen instanceof ManagedAccountTransferScreen)) {
                if (screen instanceof ManagedAccountTransferLoadingScreen) {
                    GetFlowLoadingPresenter$MetroFactory getFlowLoadingPresenter$MetroFactory = this.managedAccountTransferLoadingPresenter.delegateFactory;
                    RealManagedAccountTransferManager realManagedAccountTransferManager = (RealManagedAccountTransferManager) getFlowLoadingPresenter$MetroFactory.flowNavigationHelper.invoke();
                    FlowStarter flowStarter2 = (FlowStarter) getFlowLoadingPresenter$MetroFactory.appService.getValue();
                    BlockersDataNavigator blockersDataNavigator2 = (BlockersDataNavigator) getFlowLoadingPresenter$MetroFactory.activityFinisher.invoke();
                    realManagedAccountTransferManager.getClass();
                    flowStarter2.getClass();
                    blockersDataNavigator2.getClass();
                    return MoleculePresenterKt.asPresenter$default(new CardStudioPresenter(realManagedAccountTransferManager, flowStarter2, blockersDataNavigator2, (ManagedAccountTransferLoadingScreen) screen, screenNavigator));
                }
                if (!(screen instanceof BlockersScreens.U13CelebrationBlockerScreen)) {
                    return null;
                }
                TaxTooltipPresenter$MetroFactory taxTooltipPresenter$MetroFactory2 = this.u13CelebrationBlockerPresenter.delegateFactory;
                RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl = (RealBlockersHelper$Factory$Impl) taxTooltipPresenter$MetroFactory2.taxDesktopTooltipPreference.invoke();
                AndroidStringManager androidStringManager13 = (AndroidStringManager) taxTooltipPresenter$MetroFactory2.stringManager.lambda.invoke();
                realBlockersHelper$Factory$Impl.getClass();
                androidStringManager13.getClass();
                return MoleculePresenterKt.asPresenter$default(new EndAppLockPresenter(realBlockersHelper$Factory$Impl, androidStringManager13, (BlockersScreens.U13CelebrationBlockerScreen) screen, screenNavigator));
            }
            NodeChain nodeChain = this.managedAccountTransferPresenter.delegateFactory;
            AndroidStringManager androidStringManager14 = (AndroidStringManager) ((LambdaProvider) nodeChain.layoutNode).lambda.invoke();
            RealRouter$Factory$Impl realRouter$Factory$Impl9 = (RealRouter$Factory$Impl) ((Provider) nodeChain.sentinelHead).invoke();
            KeyValue keyValue = (KeyValue) ((Provider) nodeChain.innerCoordinator).invoke();
            RealDependentBalancesStore realDependentBalancesStore4 = (RealDependentBalancesStore) ((Provider) nodeChain.outerCoordinator).invoke();
            RealFamilyAccountsManager realFamilyAccountsManager3 = (RealFamilyAccountsManager) ((Provider) nodeChain.tail).invoke();
            SessionManager sessionManager4 = (SessionManager) ((LambdaProvider) nodeChain.head).lambda.invoke();
            RealCustomerStore realCustomerStore8 = (RealCustomerStore) ((Provider) nodeChain.current).invoke();
            Lazy lazy = (Lazy) ((AndroidFileSaver.MetroFactory) nodeChain.buffer).invoke();
            RealBalanceSnapshotManager realBalanceSnapshotManager = (RealBalanceSnapshotManager) ((Provider) nodeChain.stack).invoke();
            LocalizedMoneyFormatter.Factory factory9 = (LocalizedMoneyFormatter.Factory) ((Provider) nodeChain.cachedDiffer).invoke();
            androidStringManager14.getClass();
            realRouter$Factory$Impl9.getClass();
            keyValue.getClass();
            realDependentBalancesStore4.getClass();
            realFamilyAccountsManager3.getClass();
            sessionManager4.getClass();
            realCustomerStore8.getClass();
            realBalanceSnapshotManager.getClass();
            factory9.getClass();
            return MoleculePresenterKt.asPresenter$default(new ManagedAccountTransferPresenter(androidStringManager14, realRouter$Factory$Impl9, keyValue, realDependentBalancesStore4, realFamilyAccountsManager3, sessionManager4, realCustomerStore8, lazy, realBalanceSnapshotManager, factory9, (ManagedAccountTransferScreen) screen, screenNavigator));
        }
        DependentControlScreen dependentControlScreen = (DependentControlScreen) screen;
        boolean z = dependentControlScreen instanceof DependentControlScreen.Toggle;
        ImageLoader$Builder imageLoader$Builder2 = this.dependentControlPresenterFactory;
        if (z) {
            DependentControlScreen.Toggle toggle = (DependentControlScreen.Toggle) dependentControlScreen;
            int ordinal = toggle.getControlType().ordinal();
            if (ordinal == 0) {
                RealRouter.MetroFactory metroFactory4 = ((NotificationsControlPresenter$Factory$Impl) imageLoader$Builder2.diskCacheLazy).delegateFactory;
                BaseDependentControlDependencies baseDependentControlDependencies = (BaseDependentControlDependencies) metroFactory4.clientRouteRouterFactory.invoke();
                CoroutineScope coroutineScope2 = (CoroutineScope) metroFactory4.urlRouterFactory.value;
                baseDependentControlDependencies.getClass();
                coroutineScope2.getClass();
                managedAccountControlPresenter = new PromotionsControlPresenter(baseDependentControlDependencies, toggle, screenNavigator, coroutineScope2, 1);
            } else if (ordinal == 1) {
                FileBlockerPresenter.MetroFactory metroFactory5 = ((P2PControlPresenter$Factory$Impl) imageLoader$Builder2.memoryCacheLazy).delegateFactory;
                BaseDependentControlDependencies baseDependentControlDependencies2 = (BaseDependentControlDependencies) metroFactory5.blockersNavigator.invoke();
                FeatureFlagManager featureFlagManager4 = (FeatureFlagManager) metroFactory5.analytics.getValue();
                LocalizedMoneyFormatter.Factory factory10 = (LocalizedMoneyFormatter.Factory) metroFactory5.blockersHelperFactory.invoke();
                CoroutineScope coroutineScope3 = (CoroutineScope) metroFactory5.blockerImageUploaderFactory.value;
                baseDependentControlDependencies2.getClass();
                featureFlagManager4.getClass();
                factory10.getClass();
                coroutineScope3.getClass();
                managedAccountControlPresenter = new P2PControlPresenter(baseDependentControlDependencies2, featureFlagManager4, factory10, toggle, screenNavigator, coroutineScope3);
            } else if (ordinal == 2) {
                CashCardControlPresenter.MetroFactory metroFactory6 = ((CashCardControlPresenter$Factory$Impl) imageLoader$Builder2.mainCoroutineContextLazy).delegateFactory;
                BaseDependentControlDependencies baseDependentControlDependencies3 = (BaseDependentControlDependencies) metroFactory6.deps.invoke();
                FeatureFlagManager featureFlagManager5 = (FeatureFlagManager) metroFactory6.featureFlagManager.getValue();
                RealTagLockService realTagLockService = (RealTagLockService) metroFactory6.tagLockService.getValue();
                LocalizedMoneyFormatter.Factory factory11 = (LocalizedMoneyFormatter.Factory) metroFactory6.moneyFormatterFactory.invoke();
                CoroutineScope coroutineScope4 = (CoroutineScope) metroFactory6.sandboxedScope.value;
                baseDependentControlDependencies3.getClass();
                featureFlagManager5.getClass();
                realTagLockService.getClass();
                factory11.getClass();
                coroutineScope4.getClass();
                managedAccountControlPresenter = new CashCardControlPresenter(baseDependentControlDependencies3, featureFlagManager5, realTagLockService, factory11, toggle, screenNavigator, coroutineScope4);
            } else if (ordinal == 3) {
                FileBlockerPresenter.MetroFactory metroFactory7 = ((StocksControlPresenter$Factory$Impl) imageLoader$Builder2.application).delegateFactory;
                BaseDependentControlDependencies baseDependentControlDependencies4 = (BaseDependentControlDependencies) metroFactory7.blockersNavigator.invoke();
                FeatureFlagManager featureFlagManager6 = (FeatureFlagManager) metroFactory7.analytics.getValue();
                LocalizedMoneyFormatter.Factory factory12 = (LocalizedMoneyFormatter.Factory) metroFactory7.blockersHelperFactory.invoke();
                CoroutineScope coroutineScope5 = (CoroutineScope) metroFactory7.blockerImageUploaderFactory.value;
                baseDependentControlDependencies4.getClass();
                featureFlagManager6.getClass();
                factory12.getClass();
                coroutineScope5.getClass();
                managedAccountControlPresenter = new StocksControlPresenter(baseDependentControlDependencies4, featureFlagManager6, factory12, toggle, screenNavigator, coroutineScope5, 0);
            } else if (ordinal == 4) {
                FileBlockerPresenter.MetroFactory metroFactory8 = ((BitcoinControlPresenter$Factory$Impl) imageLoader$Builder2.defaults).delegateFactory;
                BaseDependentControlDependencies baseDependentControlDependencies5 = (BaseDependentControlDependencies) metroFactory8.blockersNavigator.invoke();
                FeatureFlagManager featureFlagManager7 = (FeatureFlagManager) metroFactory8.analytics.getValue();
                LocalizedMoneyFormatter.Factory factory13 = (LocalizedMoneyFormatter.Factory) metroFactory8.blockersHelperFactory.invoke();
                CoroutineScope coroutineScope6 = (CoroutineScope) metroFactory8.blockerImageUploaderFactory.value;
                baseDependentControlDependencies5.getClass();
                featureFlagManager7.getClass();
                factory13.getClass();
                coroutineScope6.getClass();
                managedAccountControlPresenter = new StocksControlPresenter(baseDependentControlDependencies5, featureFlagManager7, factory13, toggle, screenNavigator, coroutineScope6, 1);
            } else {
                if (ordinal != 5) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                RealRouter.MetroFactory metroFactory9 = ((PromotionsControlPresenter$Factory$Impl) imageLoader$Builder2.eventListenerFactory).delegateFactory;
                BaseDependentControlDependencies baseDependentControlDependencies6 = (BaseDependentControlDependencies) metroFactory9.clientRouteRouterFactory.invoke();
                CoroutineScope coroutineScope7 = (CoroutineScope) metroFactory9.urlRouterFactory.value;
                baseDependentControlDependencies6.getClass();
                coroutineScope7.getClass();
                managedAccountControlPresenter = new PromotionsControlPresenter(baseDependentControlDependencies6, toggle, screenNavigator, coroutineScope7, 0);
            }
        } else if (dependentControlScreen instanceof DependentControlScreen.ApprovedContactsControl) {
            DependentControlScreen.ApprovedContactsControl approvedContactsControl = (DependentControlScreen.ApprovedContactsControl) dependentControlScreen;
            CashCardControlPresenter.MetroFactory metroFactory10 = ((ApprovedContactsControlPresenter$Factory$Impl) imageLoader$Builder2.componentRegistry).delegateFactory;
            BaseDependentControlDependencies baseDependentControlDependencies7 = (BaseDependentControlDependencies) metroFactory10.deps.invoke();
            BlocklyService blocklyService2 = (BlocklyService) metroFactory10.featureFlagManager.getValue();
            AegisService aegisService4 = (AegisService) metroFactory10.tagLockService.getValue();
            LocalizedMoneyFormatter.Factory factory14 = (LocalizedMoneyFormatter.Factory) metroFactory10.moneyFormatterFactory.invoke();
            CoroutineScope coroutineScope8 = (CoroutineScope) metroFactory10.sandboxedScope.value;
            baseDependentControlDependencies7.getClass();
            blocklyService2.getClass();
            aegisService4.getClass();
            factory14.getClass();
            coroutineScope8.getClass();
            managedAccountControlPresenter = new ApprovedContactsControlPresenter(baseDependentControlDependencies7, blocklyService2, aegisService4, factory14, approvedContactsControl, screenNavigator, coroutineScope8);
        } else {
            if (!(dependentControlScreen instanceof DependentControlScreen.ManagedAccount)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            DependentControlScreen.ManagedAccount managedAccount = (DependentControlScreen.ManagedAccount) dependentControlScreen;
            LocalHomePresenter.MetroFactory metroFactory11 = ((ManagedAccountControlPresenter$Factory$Impl) imageLoader$Builder2.extras).delegateFactory;
            BaseDependentControlDependencies baseDependentControlDependencies8 = (BaseDependentControlDependencies) metroFactory11.store.invoke();
            BlocklyService blocklyService3 = (BlocklyService) metroFactory11.syncer.getValue();
            AegisService aegisService5 = (AegisService) metroFactory11.featureFlagManager.getValue();
            RealFamilyProfileManager realFamilyProfileManager = (RealFamilyProfileManager) metroFactory11.clearMarketingBadgesIfNeeded.invoke();
            LocalizedMoneyFormatter.Factory factory15 = (LocalizedMoneyFormatter.Factory) metroFactory11.tabContentPresenterFactory.invoke();
            CoroutineScope coroutineScope9 = (CoroutineScope) metroFactory11.localHomeGeoPresenterFactory.value;
            baseDependentControlDependencies8.getClass();
            blocklyService3.getClass();
            aegisService5.getClass();
            realFamilyProfileManager.getClass();
            factory15.getClass();
            coroutineScope9.getClass();
            managedAccountControlPresenter = new ManagedAccountControlPresenter(baseDependentControlDependencies8, blocklyService3, aegisService5, realFamilyProfileManager, factory15, managedAccount, screenNavigator, coroutineScope9);
        }
        return MoleculePresenterKt.asPresenter$default(managedAccountControlPresenter);
    }
}
