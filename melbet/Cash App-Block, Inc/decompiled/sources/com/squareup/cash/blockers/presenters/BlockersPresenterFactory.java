package com.squareup.cash.blockers.presenters;

import android.app.Activity;
import app.cash.broadway.presenter.Presenter;
import app.cash.broadway.presenter.PresenterFactory;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt$asPresenter$1;
import app.cash.broadway.screen.Screen;
import app.cash.local.backend.MarkMarketingMessageAsViewed$MetroFactory;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.onboarding.global.countries.RealCountryOnboardingConfigRepo;
import app.cash.passcode.presenters.EndAppLockPresenter;
import com.bugsnag.android.DeviceBuildInfo;
import com.google.zxing.Result;
import com.miteksystems.misnap.camera.a.n;
import com.squareup.cash.account.types.SignedInStateManager;
import com.squareup.cash.attribution.ProductionAttributionEventEmitter;
import com.squareup.cash.biometrics.AndroidBiometricsStore;
import com.squareup.cash.bitcoin.presenters.RealBitcoinAmountPickerPresenter$Factory$Impl;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.flow.RealMultiBlockerFacilitator;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.blockers.presenters.FileBlockerPresenter;
import com.squareup.cash.blockers.presenters.FilesetUploadPresenter;
import com.squareup.cash.blockers.presenters.FormBlockerPresenter;
import com.squareup.cash.blockers.presenters.GpsLocationConsentBlockerPresenter;
import com.squareup.cash.blockers.presenters.PasscodePresenter;
import com.squareup.cash.blockers.presenters.PlaidLinkPresenter;
import com.squareup.cash.blockers.presenters.SetPinPresenter;
import com.squareup.cash.blockers.presenters.onboarding.WelcomePresenter$Factory$Impl;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.borrow.presenters.BorrowHomePresenter;
import com.squareup.cash.cameralauncher.RealCameraLauncher$Factory$Impl;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.cashapplite.cashin.RealLiteCashInRepo$MetroFactory;
import com.squareup.cash.cashapplite.presenters.LiteActivityPresenter;
import com.squareup.cash.checks.CaptureCheckFacePresenter;
import com.squareup.cash.checks.CheckDepositAmountPresenter;
import com.squareup.cash.checks.VerifyCheckDepositPresenter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.data.blockers.RealClientScenarioCompleter;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.data.profile.RealReferralManager;
import com.squareup.cash.family.navigation.RealFamilyNavigator$MetroFactory;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.fileupload.real.AndroidFileTypeDescriber;
import com.squareup.cash.fileupload.real.RealFileUploadService;
import com.squareup.cash.fileupload.real.RealFileValidator$Factory$Impl;
import com.squareup.cash.fileupload.real.RealImageFormatConverter$Factory$Impl;
import com.squareup.cash.formview.presenters.FormPresenter$Factory$Impl;
import com.squareup.cash.formview.viewevents.real.RealFormAnalytics;
import com.squareup.cash.gcl.RealGlobalConfigManager;
import com.squareup.cash.gps.backend.real.RealGpsLocationManager;
import com.squareup.cash.history.navigation.PaymentActionHandler;
import com.squareup.cash.instruments.backend.real.RealInstrumentManager;
import com.squareup.cash.instruments.backend.real.RealInstrumentVerifier;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.contacts.RealContactBook;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.localization.RealLocaleManager;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.notifications.Op;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.onboarding.util.AndroidAliasNormalizer;
import com.squareup.cash.onboarding.util.RealAliasRegistrar;
import com.squareup.cash.passkeys.backend.RealPasskeyFeatureManager;
import com.squareup.cash.passkeys.backend.RealPasskeyRepository;
import com.squareup.cash.paychecks.presenters.HelpSheetPresenter$MetroFactory;
import com.squareup.cash.permissions.AndroidPermissionManager;
import com.squareup.cash.permissions.AndroidPermissionManager$create$1;
import com.squareup.cash.permissions.ModifiablePermissions;
import com.squareup.cash.permissions.PermissionChecker;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.profile.presenters.AddAliasPresenter;
import com.squareup.cash.registeralias.presenters.real.RealRegisterAliasResultHandler$Factory$Impl;
import com.squareup.cash.resource.AndroidDateFormatManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.securitysignals.api.SecuritySignalsAggregator;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.session.backend.TimeToLiveSyncState;
import com.squareup.cash.storage.AndroidFileProvider;
import com.squareup.cash.storage.Storage;
import com.squareup.cash.tax.presenters.TaxTooltipPresenter$MetroFactory;
import com.squareup.cash.userjourneys.tracker.UserJourneyTracker;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.moshi.Moshi;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.cashfileuploads.app.FileUploadsClientService;
import com.squareup.protos.cash.grantly.app.ShippingAddressService;
import com.squareup.protos.cash.usher.api.UsherService;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.scannerview.SizeMap;
import com.squareup.util.android.AndroidToaster;
import com.squareup.util.coroutines.Signal;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DelegateFactory;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import dev.zacsweers.metro.internal.SetFactory;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes.dex */
public final class BlockersPresenterFactory implements PresenterFactory {
    public final AddMoneyBlockerPresenter$Factory$Impl addMoneyBlockerPresenter;
    public final AmountBlockerPresenter$Factory$Impl amountBlockerPresenter;
    public final AtmPickerAmountBlockerPresenter$Factory$Impl atmPickerAmountBlockerPresenter;
    public final AuthorizeGooglePayPresenter$Factory$Impl authorizeGooglePayPresenter;
    public final BalanceTransferLoadingPresenter$Factory$Impl balanceTransferLoadingPresenter;
    public final BankAccountLinkingPresenter$Factory$Impl bankAccountLinkingPresenter;
    public final BirthdayPresenter$Factory$Impl birthdayPresenter;
    public final BitcoinAmountBlockerPresenter$Factory$Impl bitcoinAmountBlockerPresenter;
    public final BlockerContainerPresenter$Factory$Impl blockerContainerPresenter;
    public final CalendarBlockerPresenter$Factory$Impl calendarBlockerPresenter;
    public final CameraPermissionPresenter$Factory$Impl cameraPermissionPresenter;
    public final CardActivationPresenter$Factory$Impl cardActivationPresenter;
    public final CardActivationQrScannerPresenter$Factory$Impl cardActivationQrScannerPresenter;
    public final CashtagPresenter$Factory$Impl cashtagPresenter;
    public final CheckmarkPresenter$Factory$Impl checkmarkPresenter;
    public final ClientScenarioLauncherPresenter$Factory$Impl clientScenarioLauncherPresenter;
    public final ConfirmCvvPresenter$Factory$Impl confirmCvvPresenter;
    public final ConfirmExitOnboardingFlowPresenter$Factory$Impl confirmExitOnboardingFlowPresenter;
    public final ConfirmHelpPresenter$Factory$Impl confirmHelpPresenter;
    public final ConfirmPaymentPresenter$Factory$Impl confirmPaymentPresenter;
    public final ContactsPermissionExplanationSheetPresenter$Factory$Impl contactsPermissionExplanationSheetPresenter;
    public final EarnerEnrollmentBlockerPresenter$Factory$Impl earnerEnrollmentBlockerPresenter;
    public final EarnerEnrollmentSuccessBlockerPresenter$Factory$Impl earnerEnrollmentSuccessBlockerPresenter;
    public final EarnerUpsellBlockerPresenter$Factory$Impl earnerUpsellBlockerPresenter;
    public final FileBlockerExplanationPresenter$Factory$Impl fileBlockerExplanationPresenter;
    public final FileBlockerPresenter$Factory$Impl fileBlockerPresenter;
    public final FilesetUploadOptionsPresenter$Factory$Impl filesetUploadOptionsPresenter;
    public final FilesetUploadPresenter$Factory$Impl filesetUploadPresenter;
    public final FormBlockerPresenter$Factory$Impl formBlockerPresenter;
    public final FormMenuActionPresenter$Factory$Impl formMenuActionPresenter;
    public final GetFlowLoadingPresenter$Factory$Impl getFlowLoadingPresenter;
    public final GpsExplainerSheetPresenter$Factory$Impl gpsExplainerSheetPresenter;
    public final GpsLocationConsentBlockerPresenter$Factory$Impl gpsLocationConsentBlockerPresenter;
    public final InputCardInfoPresenter$Factory$Impl inputCardInfoPresenter;
    public final InstrumentSelectionBlockerPresenter$Factory$Impl instrumentSelectionBlockerPresenter;
    public final InstrumentSelectionListSheetPresenter$Factory$Impl instrumentSelectionListSheetPresenter;
    public final InviteFriendsPresenter$Factory$Impl inviteFriendsPresenter;
    public final OnboardingInternalRoutePresenter$Factory$Impl onboardingInternalRoutePresenter;
    public final PasscodePresenter$Factory$Impl passcodePresenter;
    public final AndroidPermissionManager permissionManager;
    public final PlaidLinkPresenter$Factory$Impl plaidLinkPresenter;
    public final Set presenterFactories;
    public final ReadContactsPermissionPresenter$Factory$Impl readContactsPermissionPresenter;
    public final ReferralCodePresenter$Factory$Impl referralCodePresenter;
    public final RegisterAliasPresenter$Factory$Impl registerAliasPresenter;
    public final RemoteSkipPresenter$Factory$Impl remoteSkipPresenter;
    public final RequestPushNotificationsBlockerPresenter$Factory$Impl requestPushNotificationsBlockerPresenter;
    public final SavingsTransferOptionSelectionPresenter$Factory$Impl savingsTransferOptionSelectionPresenter;
    public final SelectionPresenter$Factory$Impl selectionPresenter;
    public final SetAddressPresenter$Factory$Impl setAddressPresenter;
    public final SetNamePresenter$Factory$Impl setNamePresenter;
    public final SetPinMessagePresenter$Factory$Impl setPinMessagePresenter;
    public final SetPinPresenter$Factory$Impl setPinPresenter;
    public final SignaturePresenter$Factory$Impl signaturePresenter;
    public final SkipVerifyPresenter$Factory$Impl skipVerifyPresenter;
    public final SsnPresenter$Factory$Impl ssnPresenter;
    public final StatusResultPresenter$Factory$Impl statusResultPresenter;
    public final AndroidStringManager stringManager;
    public final StripeLinkPresenter$Factory$Impl stripeLinkPresenter;
    public final SuccessMessagePresenter$Factory$Impl successMessagePresenter;
    public final UpgradeConfirmationPresenter$Factory$Impl upgradeConfirmationPresenter;
    public final VerifyAliasPresenter$Factory$Impl verifyAliasPresenter;
    public final VerifyContactsPresenter$Factory$Impl verifyContactsPresenter;
    public final VerifyInstrumentPresenter$Factory$Impl verifyInstrumentPresenter;
    public final VerifyMagicPresenter$Factory$Impl verifyMagicPresenter;
    public final WelcomePresenter$Factory$Impl welcomePresenter;

    public final class MetroFactory implements Factory {
        public final InstanceFactory addMoneyBlockerPresenter;
        public final InstanceFactory amountBlockerPresenter;
        public final InstanceFactory atmPickerAmountBlockerPresenter;
        public final InstanceFactory authorizeGooglePayPresenter;
        public final InstanceFactory balanceTransferLoadingPresenter;
        public final InstanceFactory bankAccountLinkingPresenter;
        public final InstanceFactory birthdayPresenter;
        public final InstanceFactory bitcoinAmountBlockerPresenter;
        public final InstanceFactory blockerContainerPresenter;
        public final InstanceFactory calendarBlockerPresenter;
        public final InstanceFactory cameraPermissionPresenter;
        public final InstanceFactory cardActivationPresenter;
        public final InstanceFactory cardActivationQrScannerPresenter;
        public final InstanceFactory cashtagErrorPresenter;
        public final InstanceFactory cashtagPresenter;
        public final InstanceFactory checkmarkPresenter;
        public final InstanceFactory clientScenarioLauncherPresenter;
        public final InstanceFactory confirmCvvPresenter;
        public final InstanceFactory confirmExitOnboardingFlowPresenter;
        public final InstanceFactory confirmHelpPresenter;
        public final InstanceFactory confirmPaymentPresenter;
        public final InstanceFactory contactsPermissionExplanationSheetPresenter;
        public final InstanceFactory earnerEnrollmentBlockerPresenter;
        public final InstanceFactory earnerEnrollmentSuccessBlockerPresenter;
        public final InstanceFactory earnerUpsellBlockerPresenter;
        public final InstanceFactory fileBlockerExplanationPresenter;
        public final InstanceFactory fileBlockerPresenter;
        public final InstanceFactory filesetUploadOptionsPresenter;
        public final InstanceFactory filesetUploadPresenter;
        public final InstanceFactory formBlockerPresenter;
        public final InstanceFactory formMenuActionPresenter;
        public final InstanceFactory getFlowLoadingPresenter;
        public final InstanceFactory gpsExplainerSheetPresenter;
        public final InstanceFactory gpsLocationConsentBlockerPresenter;
        public final InstanceFactory ineligibleMergePresenter;
        public final InstanceFactory inputCardInfoPresenter;
        public final InstanceFactory instrumentSelectionBlockerPresenter;
        public final InstanceFactory instrumentSelectionDetailsPresenter;
        public final InstanceFactory instrumentSelectionListSheetPresenter;
        public final InstanceFactory inviteFriendsPresenter;
        public final InstanceFactory onboardingInternalRoutePresenter;
        public final InstanceFactory passcodeHelpPresenter;
        public final InstanceFactory passcodePresenter;
        public final Provider permissionManager;
        public final InstanceFactory plaidLinkPresenter;
        public final SetFactory presenterFactories;
        public final InstanceFactory readContactsPermissionPresenter;
        public final InstanceFactory referralCodePresenter;
        public final InstanceFactory registerAliasPresenter;
        public final InstanceFactory remoteSkipPresenter;
        public final InstanceFactory requestPushNotificationsBlockerPresenter;
        public final InstanceFactory savingsTransferOptionSelectionPresenter;
        public final InstanceFactory selectionPresenter;
        public final InstanceFactory setAddressPresenter;
        public final InstanceFactory setNamePresenter;
        public final InstanceFactory setPinMessagePresenter;
        public final InstanceFactory setPinPresenter;
        public final InstanceFactory signaturePresenter;
        public final InstanceFactory skipVerifyPresenter;
        public final InstanceFactory ssnPresenter;
        public final InstanceFactory statusResultPresenter;
        public final Provider stringManager;
        public final InstanceFactory stripeLinkPresenter;
        public final InstanceFactory successMessagePresenter;
        public final InstanceFactory upgradeConfirmationPresenter;
        public final InstanceFactory verifyAliasPresenter;
        public final InstanceFactory verifyContactsPresenter;
        public final InstanceFactory verifyHelpPresenter;
        public final InstanceFactory verifyInstrumentPresenter;
        public final InstanceFactory verifyMagicPresenter;
        public final InstanceFactory welcomePresenter;

        public MetroFactory(SetFactory setFactory, Provider provider, InstanceFactory instanceFactory, InstanceFactory instanceFactory2, InstanceFactory instanceFactory3, InstanceFactory instanceFactory4, InstanceFactory instanceFactory5, InstanceFactory instanceFactory6, InstanceFactory instanceFactory7, InstanceFactory instanceFactory8, InstanceFactory instanceFactory9, InstanceFactory instanceFactory10, InstanceFactory instanceFactory11, InstanceFactory instanceFactory12, InstanceFactory instanceFactory13, InstanceFactory instanceFactory14, InstanceFactory instanceFactory15, InstanceFactory instanceFactory16, InstanceFactory instanceFactory17, InstanceFactory instanceFactory18, InstanceFactory instanceFactory19, InstanceFactory instanceFactory20, InstanceFactory instanceFactory21, InstanceFactory instanceFactory22, InstanceFactory instanceFactory23, InstanceFactory instanceFactory24, InstanceFactory instanceFactory25, InstanceFactory instanceFactory26, InstanceFactory instanceFactory27, InstanceFactory instanceFactory28, InstanceFactory instanceFactory29, InstanceFactory instanceFactory30, InstanceFactory instanceFactory31, InstanceFactory instanceFactory32, InstanceFactory instanceFactory33, InstanceFactory instanceFactory34, InstanceFactory instanceFactory35, InstanceFactory instanceFactory36, InstanceFactory instanceFactory37, InstanceFactory instanceFactory38, InstanceFactory instanceFactory39, InstanceFactory instanceFactory40, InstanceFactory instanceFactory41, InstanceFactory instanceFactory42, InstanceFactory instanceFactory43, InstanceFactory instanceFactory44, InstanceFactory instanceFactory45, InstanceFactory instanceFactory46, InstanceFactory instanceFactory47, InstanceFactory instanceFactory48, InstanceFactory instanceFactory49, InstanceFactory instanceFactory50, InstanceFactory instanceFactory51, InstanceFactory instanceFactory52, InstanceFactory instanceFactory53, InstanceFactory instanceFactory54, InstanceFactory instanceFactory55, InstanceFactory instanceFactory56, InstanceFactory instanceFactory57, InstanceFactory instanceFactory58, Provider provider2, InstanceFactory instanceFactory59, InstanceFactory instanceFactory60, InstanceFactory instanceFactory61, InstanceFactory instanceFactory62, InstanceFactory instanceFactory63, InstanceFactory instanceFactory64, InstanceFactory instanceFactory65, InstanceFactory instanceFactory66, InstanceFactory instanceFactory67, InstanceFactory instanceFactory68) {
            this.presenterFactories = setFactory;
            this.permissionManager = provider;
            this.bankAccountLinkingPresenter = instanceFactory;
            this.amountBlockerPresenter = instanceFactory2;
            this.bitcoinAmountBlockerPresenter = instanceFactory3;
            this.birthdayPresenter = instanceFactory4;
            this.cardActivationPresenter = instanceFactory5;
            this.cardActivationQrScannerPresenter = instanceFactory6;
            this.cashtagPresenter = instanceFactory7;
            this.checkmarkPresenter = instanceFactory8;
            this.clientScenarioLauncherPresenter = instanceFactory9;
            this.confirmCvvPresenter = instanceFactory10;
            this.fileBlockerPresenter = instanceFactory11;
            this.filesetUploadPresenter = instanceFactory12;
            this.formBlockerPresenter = instanceFactory13;
            this.getFlowLoadingPresenter = instanceFactory14;
            this.inputCardInfoPresenter = instanceFactory15;
            this.instrumentSelectionBlockerPresenter = instanceFactory16;
            this.instrumentSelectionDetailsPresenter = instanceFactory17;
            this.instrumentSelectionListSheetPresenter = instanceFactory18;
            this.inviteFriendsPresenter = instanceFactory19;
            this.ineligibleMergePresenter = instanceFactory20;
            this.onboardingInternalRoutePresenter = instanceFactory21;
            this.passcodePresenter = instanceFactory22;
            this.passcodeHelpPresenter = instanceFactory23;
            this.referralCodePresenter = instanceFactory24;
            this.registerAliasPresenter = instanceFactory25;
            this.remoteSkipPresenter = instanceFactory26;
            this.setAddressPresenter = instanceFactory27;
            this.selectionPresenter = instanceFactory28;
            this.setNamePresenter = instanceFactory29;
            this.setPinPresenter = instanceFactory30;
            this.setPinMessagePresenter = instanceFactory31;
            this.signaturePresenter = instanceFactory32;
            this.ssnPresenter = instanceFactory33;
            this.statusResultPresenter = instanceFactory34;
            this.successMessagePresenter = instanceFactory35;
            this.verifyAliasPresenter = instanceFactory36;
            this.verifyContactsPresenter = instanceFactory37;
            this.verifyInstrumentPresenter = instanceFactory38;
            this.verifyMagicPresenter = instanceFactory39;
            this.plaidLinkPresenter = instanceFactory40;
            this.stripeLinkPresenter = instanceFactory41;
            this.welcomePresenter = instanceFactory42;
            this.blockerContainerPresenter = instanceFactory43;
            this.balanceTransferLoadingPresenter = instanceFactory44;
            this.cashtagErrorPresenter = instanceFactory45;
            this.confirmHelpPresenter = instanceFactory46;
            this.confirmExitOnboardingFlowPresenter = instanceFactory47;
            this.confirmPaymentPresenter = instanceFactory48;
            this.formMenuActionPresenter = instanceFactory49;
            this.cameraPermissionPresenter = instanceFactory50;
            this.readContactsPermissionPresenter = instanceFactory51;
            this.upgradeConfirmationPresenter = instanceFactory52;
            this.skipVerifyPresenter = instanceFactory53;
            this.verifyHelpPresenter = instanceFactory54;
            this.fileBlockerExplanationPresenter = instanceFactory55;
            this.gpsLocationConsentBlockerPresenter = instanceFactory56;
            this.gpsExplainerSheetPresenter = instanceFactory57;
            this.contactsPermissionExplanationSheetPresenter = instanceFactory58;
            this.stringManager = provider2;
            this.filesetUploadOptionsPresenter = instanceFactory59;
            this.savingsTransferOptionSelectionPresenter = instanceFactory60;
            this.atmPickerAmountBlockerPresenter = instanceFactory61;
            this.calendarBlockerPresenter = instanceFactory62;
            this.authorizeGooglePayPresenter = instanceFactory63;
            this.requestPushNotificationsBlockerPresenter = instanceFactory64;
            this.earnerEnrollmentBlockerPresenter = instanceFactory65;
            this.earnerEnrollmentSuccessBlockerPresenter = instanceFactory66;
            this.earnerUpsellBlockerPresenter = instanceFactory67;
            this.addMoneyBlockerPresenter = instanceFactory68;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Set set = (Set) this.presenterFactories.invoke();
            AndroidPermissionManager androidPermissionManager = (AndroidPermissionManager) this.permissionManager.invoke();
            BankAccountLinkingPresenter$Factory$Impl bankAccountLinkingPresenter$Factory$Impl = (BankAccountLinkingPresenter$Factory$Impl) this.bankAccountLinkingPresenter.value;
            AmountBlockerPresenter$Factory$Impl amountBlockerPresenter$Factory$Impl = (AmountBlockerPresenter$Factory$Impl) this.amountBlockerPresenter.value;
            BitcoinAmountBlockerPresenter$Factory$Impl bitcoinAmountBlockerPresenter$Factory$Impl = (BitcoinAmountBlockerPresenter$Factory$Impl) this.bitcoinAmountBlockerPresenter.value;
            BirthdayPresenter$Factory$Impl birthdayPresenter$Factory$Impl = (BirthdayPresenter$Factory$Impl) this.birthdayPresenter.value;
            CardActivationPresenter$Factory$Impl cardActivationPresenter$Factory$Impl = (CardActivationPresenter$Factory$Impl) this.cardActivationPresenter.value;
            CardActivationQrScannerPresenter$Factory$Impl cardActivationQrScannerPresenter$Factory$Impl = (CardActivationQrScannerPresenter$Factory$Impl) this.cardActivationQrScannerPresenter.value;
            CashtagPresenter$Factory$Impl cashtagPresenter$Factory$Impl = (CashtagPresenter$Factory$Impl) this.cashtagPresenter.value;
            CheckmarkPresenter$Factory$Impl checkmarkPresenter$Factory$Impl = (CheckmarkPresenter$Factory$Impl) this.checkmarkPresenter.value;
            ClientScenarioLauncherPresenter$Factory$Impl clientScenarioLauncherPresenter$Factory$Impl = (ClientScenarioLauncherPresenter$Factory$Impl) this.clientScenarioLauncherPresenter.value;
            ConfirmCvvPresenter$Factory$Impl confirmCvvPresenter$Factory$Impl = (ConfirmCvvPresenter$Factory$Impl) this.confirmCvvPresenter.value;
            FileBlockerPresenter$Factory$Impl fileBlockerPresenter$Factory$Impl = (FileBlockerPresenter$Factory$Impl) this.fileBlockerPresenter.value;
            FilesetUploadPresenter$Factory$Impl filesetUploadPresenter$Factory$Impl = (FilesetUploadPresenter$Factory$Impl) this.filesetUploadPresenter.value;
            FormBlockerPresenter$Factory$Impl formBlockerPresenter$Factory$Impl = (FormBlockerPresenter$Factory$Impl) this.formBlockerPresenter.value;
            GetFlowLoadingPresenter$Factory$Impl getFlowLoadingPresenter$Factory$Impl = (GetFlowLoadingPresenter$Factory$Impl) this.getFlowLoadingPresenter.value;
            InputCardInfoPresenter$Factory$Impl inputCardInfoPresenter$Factory$Impl = (InputCardInfoPresenter$Factory$Impl) this.inputCardInfoPresenter.value;
            InstrumentSelectionBlockerPresenter$Factory$Impl instrumentSelectionBlockerPresenter$Factory$Impl = (InstrumentSelectionBlockerPresenter$Factory$Impl) this.instrumentSelectionBlockerPresenter.value;
            InstrumentSelectionDetailsSheetPresenter$Factory$Impl instrumentSelectionDetailsSheetPresenter$Factory$Impl = (InstrumentSelectionDetailsSheetPresenter$Factory$Impl) this.instrumentSelectionDetailsPresenter.value;
            InstrumentSelectionListSheetPresenter$Factory$Impl instrumentSelectionListSheetPresenter$Factory$Impl = (InstrumentSelectionListSheetPresenter$Factory$Impl) this.instrumentSelectionListSheetPresenter.value;
            InviteFriendsPresenter$Factory$Impl inviteFriendsPresenter$Factory$Impl = (InviteFriendsPresenter$Factory$Impl) this.inviteFriendsPresenter.value;
            IneligibleMergePresenter$Factory$Impl ineligibleMergePresenter$Factory$Impl = (IneligibleMergePresenter$Factory$Impl) this.ineligibleMergePresenter.value;
            OnboardingInternalRoutePresenter$Factory$Impl onboardingInternalRoutePresenter$Factory$Impl = (OnboardingInternalRoutePresenter$Factory$Impl) this.onboardingInternalRoutePresenter.value;
            PasscodePresenter$Factory$Impl passcodePresenter$Factory$Impl = (PasscodePresenter$Factory$Impl) this.passcodePresenter.value;
            PasscodeHelpPresenter$Factory$Impl passcodeHelpPresenter$Factory$Impl = (PasscodeHelpPresenter$Factory$Impl) this.passcodeHelpPresenter.value;
            ReferralCodePresenter$Factory$Impl referralCodePresenter$Factory$Impl = (ReferralCodePresenter$Factory$Impl) this.referralCodePresenter.value;
            RegisterAliasPresenter$Factory$Impl registerAliasPresenter$Factory$Impl = (RegisterAliasPresenter$Factory$Impl) this.registerAliasPresenter.value;
            RemoteSkipPresenter$Factory$Impl remoteSkipPresenter$Factory$Impl = (RemoteSkipPresenter$Factory$Impl) this.remoteSkipPresenter.value;
            SetAddressPresenter$Factory$Impl setAddressPresenter$Factory$Impl = (SetAddressPresenter$Factory$Impl) this.setAddressPresenter.value;
            SelectionPresenter$Factory$Impl selectionPresenter$Factory$Impl = (SelectionPresenter$Factory$Impl) this.selectionPresenter.value;
            SetNamePresenter$Factory$Impl setNamePresenter$Factory$Impl = (SetNamePresenter$Factory$Impl) this.setNamePresenter.value;
            SetPinPresenter$Factory$Impl setPinPresenter$Factory$Impl = (SetPinPresenter$Factory$Impl) this.setPinPresenter.value;
            SetPinMessagePresenter$Factory$Impl setPinMessagePresenter$Factory$Impl = (SetPinMessagePresenter$Factory$Impl) this.setPinMessagePresenter.value;
            SignaturePresenter$Factory$Impl signaturePresenter$Factory$Impl = (SignaturePresenter$Factory$Impl) this.signaturePresenter.value;
            SsnPresenter$Factory$Impl ssnPresenter$Factory$Impl = (SsnPresenter$Factory$Impl) this.ssnPresenter.value;
            StatusResultPresenter$Factory$Impl statusResultPresenter$Factory$Impl = (StatusResultPresenter$Factory$Impl) this.statusResultPresenter.value;
            SuccessMessagePresenter$Factory$Impl successMessagePresenter$Factory$Impl = (SuccessMessagePresenter$Factory$Impl) this.successMessagePresenter.value;
            VerifyAliasPresenter$Factory$Impl verifyAliasPresenter$Factory$Impl = (VerifyAliasPresenter$Factory$Impl) this.verifyAliasPresenter.value;
            VerifyContactsPresenter$Factory$Impl verifyContactsPresenter$Factory$Impl = (VerifyContactsPresenter$Factory$Impl) this.verifyContactsPresenter.value;
            VerifyInstrumentPresenter$Factory$Impl verifyInstrumentPresenter$Factory$Impl = (VerifyInstrumentPresenter$Factory$Impl) this.verifyInstrumentPresenter.value;
            VerifyMagicPresenter$Factory$Impl verifyMagicPresenter$Factory$Impl = (VerifyMagicPresenter$Factory$Impl) this.verifyMagicPresenter.value;
            PlaidLinkPresenter$Factory$Impl plaidLinkPresenter$Factory$Impl = (PlaidLinkPresenter$Factory$Impl) this.plaidLinkPresenter.value;
            StripeLinkPresenter$Factory$Impl stripeLinkPresenter$Factory$Impl = (StripeLinkPresenter$Factory$Impl) this.stripeLinkPresenter.value;
            WelcomePresenter$Factory$Impl welcomePresenter$Factory$Impl = (WelcomePresenter$Factory$Impl) this.welcomePresenter.value;
            BlockerContainerPresenter$Factory$Impl blockerContainerPresenter$Factory$Impl = (BlockerContainerPresenter$Factory$Impl) this.blockerContainerPresenter.value;
            BalanceTransferLoadingPresenter$Factory$Impl balanceTransferLoadingPresenter$Factory$Impl = (BalanceTransferLoadingPresenter$Factory$Impl) this.balanceTransferLoadingPresenter.value;
            CashtagErrorPresenter$Factory$Impl cashtagErrorPresenter$Factory$Impl = (CashtagErrorPresenter$Factory$Impl) this.cashtagErrorPresenter.value;
            ConfirmHelpPresenter$Factory$Impl confirmHelpPresenter$Factory$Impl = (ConfirmHelpPresenter$Factory$Impl) this.confirmHelpPresenter.value;
            ConfirmExitOnboardingFlowPresenter$Factory$Impl confirmExitOnboardingFlowPresenter$Factory$Impl = (ConfirmExitOnboardingFlowPresenter$Factory$Impl) this.confirmExitOnboardingFlowPresenter.value;
            ConfirmPaymentPresenter$Factory$Impl confirmPaymentPresenter$Factory$Impl = (ConfirmPaymentPresenter$Factory$Impl) this.confirmPaymentPresenter.value;
            FormMenuActionPresenter$Factory$Impl formMenuActionPresenter$Factory$Impl = (FormMenuActionPresenter$Factory$Impl) this.formMenuActionPresenter.value;
            CameraPermissionPresenter$Factory$Impl cameraPermissionPresenter$Factory$Impl = (CameraPermissionPresenter$Factory$Impl) this.cameraPermissionPresenter.value;
            ReadContactsPermissionPresenter$Factory$Impl readContactsPermissionPresenter$Factory$Impl = (ReadContactsPermissionPresenter$Factory$Impl) this.readContactsPermissionPresenter.value;
            UpgradeConfirmationPresenter$Factory$Impl upgradeConfirmationPresenter$Factory$Impl = (UpgradeConfirmationPresenter$Factory$Impl) this.upgradeConfirmationPresenter.value;
            SkipVerifyPresenter$Factory$Impl skipVerifyPresenter$Factory$Impl = (SkipVerifyPresenter$Factory$Impl) this.skipVerifyPresenter.value;
            VerifyHelpPresenter$Factory$Impl verifyHelpPresenter$Factory$Impl = (VerifyHelpPresenter$Factory$Impl) this.verifyHelpPresenter.value;
            FileBlockerExplanationPresenter$Factory$Impl fileBlockerExplanationPresenter$Factory$Impl = (FileBlockerExplanationPresenter$Factory$Impl) this.fileBlockerExplanationPresenter.value;
            GpsLocationConsentBlockerPresenter$Factory$Impl gpsLocationConsentBlockerPresenter$Factory$Impl = (GpsLocationConsentBlockerPresenter$Factory$Impl) this.gpsLocationConsentBlockerPresenter.value;
            GpsExplainerSheetPresenter$Factory$Impl gpsExplainerSheetPresenter$Factory$Impl = (GpsExplainerSheetPresenter$Factory$Impl) this.gpsExplainerSheetPresenter.value;
            ContactsPermissionExplanationSheetPresenter$Factory$Impl contactsPermissionExplanationSheetPresenter$Factory$Impl = (ContactsPermissionExplanationSheetPresenter$Factory$Impl) this.contactsPermissionExplanationSheetPresenter.value;
            AndroidStringManager androidStringManager = (AndroidStringManager) this.stringManager.invoke();
            FilesetUploadOptionsPresenter$Factory$Impl filesetUploadOptionsPresenter$Factory$Impl = (FilesetUploadOptionsPresenter$Factory$Impl) this.filesetUploadOptionsPresenter.value;
            SavingsTransferOptionSelectionPresenter$Factory$Impl savingsTransferOptionSelectionPresenter$Factory$Impl = (SavingsTransferOptionSelectionPresenter$Factory$Impl) this.savingsTransferOptionSelectionPresenter.value;
            AtmPickerAmountBlockerPresenter$Factory$Impl atmPickerAmountBlockerPresenter$Factory$Impl = (AtmPickerAmountBlockerPresenter$Factory$Impl) this.atmPickerAmountBlockerPresenter.value;
            CalendarBlockerPresenter$Factory$Impl calendarBlockerPresenter$Factory$Impl = (CalendarBlockerPresenter$Factory$Impl) this.calendarBlockerPresenter.value;
            AuthorizeGooglePayPresenter$Factory$Impl authorizeGooglePayPresenter$Factory$Impl = (AuthorizeGooglePayPresenter$Factory$Impl) this.authorizeGooglePayPresenter.value;
            RequestPushNotificationsBlockerPresenter$Factory$Impl requestPushNotificationsBlockerPresenter$Factory$Impl = (RequestPushNotificationsBlockerPresenter$Factory$Impl) this.requestPushNotificationsBlockerPresenter.value;
            EarnerEnrollmentBlockerPresenter$Factory$Impl earnerEnrollmentBlockerPresenter$Factory$Impl = (EarnerEnrollmentBlockerPresenter$Factory$Impl) this.earnerEnrollmentBlockerPresenter.value;
            EarnerEnrollmentSuccessBlockerPresenter$Factory$Impl earnerEnrollmentSuccessBlockerPresenter$Factory$Impl = (EarnerEnrollmentSuccessBlockerPresenter$Factory$Impl) this.earnerEnrollmentSuccessBlockerPresenter.value;
            EarnerUpsellBlockerPresenter$Factory$Impl earnerUpsellBlockerPresenter$Factory$Impl = (EarnerUpsellBlockerPresenter$Factory$Impl) this.earnerUpsellBlockerPresenter.value;
            AddMoneyBlockerPresenter$Factory$Impl addMoneyBlockerPresenter$Factory$Impl = (AddMoneyBlockerPresenter$Factory$Impl) this.addMoneyBlockerPresenter.value;
            set.getClass();
            androidPermissionManager.getClass();
            bankAccountLinkingPresenter$Factory$Impl.getClass();
            amountBlockerPresenter$Factory$Impl.getClass();
            bitcoinAmountBlockerPresenter$Factory$Impl.getClass();
            birthdayPresenter$Factory$Impl.getClass();
            cardActivationPresenter$Factory$Impl.getClass();
            cardActivationQrScannerPresenter$Factory$Impl.getClass();
            cashtagPresenter$Factory$Impl.getClass();
            checkmarkPresenter$Factory$Impl.getClass();
            clientScenarioLauncherPresenter$Factory$Impl.getClass();
            confirmCvvPresenter$Factory$Impl.getClass();
            fileBlockerPresenter$Factory$Impl.getClass();
            filesetUploadPresenter$Factory$Impl.getClass();
            formBlockerPresenter$Factory$Impl.getClass();
            getFlowLoadingPresenter$Factory$Impl.getClass();
            inputCardInfoPresenter$Factory$Impl.getClass();
            instrumentSelectionBlockerPresenter$Factory$Impl.getClass();
            instrumentSelectionDetailsSheetPresenter$Factory$Impl.getClass();
            instrumentSelectionListSheetPresenter$Factory$Impl.getClass();
            inviteFriendsPresenter$Factory$Impl.getClass();
            ineligibleMergePresenter$Factory$Impl.getClass();
            onboardingInternalRoutePresenter$Factory$Impl.getClass();
            passcodePresenter$Factory$Impl.getClass();
            passcodeHelpPresenter$Factory$Impl.getClass();
            referralCodePresenter$Factory$Impl.getClass();
            registerAliasPresenter$Factory$Impl.getClass();
            remoteSkipPresenter$Factory$Impl.getClass();
            setAddressPresenter$Factory$Impl.getClass();
            selectionPresenter$Factory$Impl.getClass();
            setNamePresenter$Factory$Impl.getClass();
            setPinPresenter$Factory$Impl.getClass();
            setPinMessagePresenter$Factory$Impl.getClass();
            signaturePresenter$Factory$Impl.getClass();
            ssnPresenter$Factory$Impl.getClass();
            statusResultPresenter$Factory$Impl.getClass();
            successMessagePresenter$Factory$Impl.getClass();
            verifyAliasPresenter$Factory$Impl.getClass();
            verifyContactsPresenter$Factory$Impl.getClass();
            verifyInstrumentPresenter$Factory$Impl.getClass();
            verifyMagicPresenter$Factory$Impl.getClass();
            plaidLinkPresenter$Factory$Impl.getClass();
            stripeLinkPresenter$Factory$Impl.getClass();
            welcomePresenter$Factory$Impl.getClass();
            blockerContainerPresenter$Factory$Impl.getClass();
            balanceTransferLoadingPresenter$Factory$Impl.getClass();
            cashtagErrorPresenter$Factory$Impl.getClass();
            confirmHelpPresenter$Factory$Impl.getClass();
            confirmExitOnboardingFlowPresenter$Factory$Impl.getClass();
            confirmPaymentPresenter$Factory$Impl.getClass();
            formMenuActionPresenter$Factory$Impl.getClass();
            cameraPermissionPresenter$Factory$Impl.getClass();
            readContactsPermissionPresenter$Factory$Impl.getClass();
            upgradeConfirmationPresenter$Factory$Impl.getClass();
            skipVerifyPresenter$Factory$Impl.getClass();
            verifyHelpPresenter$Factory$Impl.getClass();
            fileBlockerExplanationPresenter$Factory$Impl.getClass();
            gpsLocationConsentBlockerPresenter$Factory$Impl.getClass();
            gpsExplainerSheetPresenter$Factory$Impl.getClass();
            contactsPermissionExplanationSheetPresenter$Factory$Impl.getClass();
            androidStringManager.getClass();
            filesetUploadOptionsPresenter$Factory$Impl.getClass();
            savingsTransferOptionSelectionPresenter$Factory$Impl.getClass();
            atmPickerAmountBlockerPresenter$Factory$Impl.getClass();
            calendarBlockerPresenter$Factory$Impl.getClass();
            authorizeGooglePayPresenter$Factory$Impl.getClass();
            requestPushNotificationsBlockerPresenter$Factory$Impl.getClass();
            earnerEnrollmentBlockerPresenter$Factory$Impl.getClass();
            earnerEnrollmentSuccessBlockerPresenter$Factory$Impl.getClass();
            earnerUpsellBlockerPresenter$Factory$Impl.getClass();
            addMoneyBlockerPresenter$Factory$Impl.getClass();
            return new BlockersPresenterFactory(set, androidPermissionManager, bankAccountLinkingPresenter$Factory$Impl, amountBlockerPresenter$Factory$Impl, bitcoinAmountBlockerPresenter$Factory$Impl, birthdayPresenter$Factory$Impl, cardActivationPresenter$Factory$Impl, cardActivationQrScannerPresenter$Factory$Impl, cashtagPresenter$Factory$Impl, checkmarkPresenter$Factory$Impl, clientScenarioLauncherPresenter$Factory$Impl, confirmCvvPresenter$Factory$Impl, fileBlockerPresenter$Factory$Impl, filesetUploadPresenter$Factory$Impl, formBlockerPresenter$Factory$Impl, getFlowLoadingPresenter$Factory$Impl, inputCardInfoPresenter$Factory$Impl, instrumentSelectionBlockerPresenter$Factory$Impl, instrumentSelectionDetailsSheetPresenter$Factory$Impl, instrumentSelectionListSheetPresenter$Factory$Impl, inviteFriendsPresenter$Factory$Impl, ineligibleMergePresenter$Factory$Impl, onboardingInternalRoutePresenter$Factory$Impl, passcodePresenter$Factory$Impl, passcodeHelpPresenter$Factory$Impl, referralCodePresenter$Factory$Impl, registerAliasPresenter$Factory$Impl, remoteSkipPresenter$Factory$Impl, setAddressPresenter$Factory$Impl, selectionPresenter$Factory$Impl, setNamePresenter$Factory$Impl, setPinPresenter$Factory$Impl, setPinMessagePresenter$Factory$Impl, signaturePresenter$Factory$Impl, ssnPresenter$Factory$Impl, statusResultPresenter$Factory$Impl, successMessagePresenter$Factory$Impl, verifyAliasPresenter$Factory$Impl, verifyContactsPresenter$Factory$Impl, verifyInstrumentPresenter$Factory$Impl, verifyMagicPresenter$Factory$Impl, plaidLinkPresenter$Factory$Impl, stripeLinkPresenter$Factory$Impl, welcomePresenter$Factory$Impl, blockerContainerPresenter$Factory$Impl, balanceTransferLoadingPresenter$Factory$Impl, cashtagErrorPresenter$Factory$Impl, confirmHelpPresenter$Factory$Impl, confirmExitOnboardingFlowPresenter$Factory$Impl, confirmPaymentPresenter$Factory$Impl, formMenuActionPresenter$Factory$Impl, cameraPermissionPresenter$Factory$Impl, readContactsPermissionPresenter$Factory$Impl, upgradeConfirmationPresenter$Factory$Impl, skipVerifyPresenter$Factory$Impl, verifyHelpPresenter$Factory$Impl, fileBlockerExplanationPresenter$Factory$Impl, gpsLocationConsentBlockerPresenter$Factory$Impl, gpsExplainerSheetPresenter$Factory$Impl, contactsPermissionExplanationSheetPresenter$Factory$Impl, androidStringManager, filesetUploadOptionsPresenter$Factory$Impl, savingsTransferOptionSelectionPresenter$Factory$Impl, atmPickerAmountBlockerPresenter$Factory$Impl, calendarBlockerPresenter$Factory$Impl, authorizeGooglePayPresenter$Factory$Impl, requestPushNotificationsBlockerPresenter$Factory$Impl, earnerEnrollmentBlockerPresenter$Factory$Impl, earnerEnrollmentSuccessBlockerPresenter$Factory$Impl, earnerUpsellBlockerPresenter$Factory$Impl, addMoneyBlockerPresenter$Factory$Impl);
        }
    }

    public BlockersPresenterFactory(Set set, AndroidPermissionManager androidPermissionManager, BankAccountLinkingPresenter$Factory$Impl bankAccountLinkingPresenter$Factory$Impl, AmountBlockerPresenter$Factory$Impl amountBlockerPresenter$Factory$Impl, BitcoinAmountBlockerPresenter$Factory$Impl bitcoinAmountBlockerPresenter$Factory$Impl, BirthdayPresenter$Factory$Impl birthdayPresenter$Factory$Impl, CardActivationPresenter$Factory$Impl cardActivationPresenter$Factory$Impl, CardActivationQrScannerPresenter$Factory$Impl cardActivationQrScannerPresenter$Factory$Impl, CashtagPresenter$Factory$Impl cashtagPresenter$Factory$Impl, CheckmarkPresenter$Factory$Impl checkmarkPresenter$Factory$Impl, ClientScenarioLauncherPresenter$Factory$Impl clientScenarioLauncherPresenter$Factory$Impl, ConfirmCvvPresenter$Factory$Impl confirmCvvPresenter$Factory$Impl, FileBlockerPresenter$Factory$Impl fileBlockerPresenter$Factory$Impl, FilesetUploadPresenter$Factory$Impl filesetUploadPresenter$Factory$Impl, FormBlockerPresenter$Factory$Impl formBlockerPresenter$Factory$Impl, GetFlowLoadingPresenter$Factory$Impl getFlowLoadingPresenter$Factory$Impl, InputCardInfoPresenter$Factory$Impl inputCardInfoPresenter$Factory$Impl, InstrumentSelectionBlockerPresenter$Factory$Impl instrumentSelectionBlockerPresenter$Factory$Impl, InstrumentSelectionDetailsSheetPresenter$Factory$Impl instrumentSelectionDetailsSheetPresenter$Factory$Impl, InstrumentSelectionListSheetPresenter$Factory$Impl instrumentSelectionListSheetPresenter$Factory$Impl, InviteFriendsPresenter$Factory$Impl inviteFriendsPresenter$Factory$Impl, IneligibleMergePresenter$Factory$Impl ineligibleMergePresenter$Factory$Impl, OnboardingInternalRoutePresenter$Factory$Impl onboardingInternalRoutePresenter$Factory$Impl, PasscodePresenter$Factory$Impl passcodePresenter$Factory$Impl, PasscodeHelpPresenter$Factory$Impl passcodeHelpPresenter$Factory$Impl, ReferralCodePresenter$Factory$Impl referralCodePresenter$Factory$Impl, RegisterAliasPresenter$Factory$Impl registerAliasPresenter$Factory$Impl, RemoteSkipPresenter$Factory$Impl remoteSkipPresenter$Factory$Impl, SetAddressPresenter$Factory$Impl setAddressPresenter$Factory$Impl, SelectionPresenter$Factory$Impl selectionPresenter$Factory$Impl, SetNamePresenter$Factory$Impl setNamePresenter$Factory$Impl, SetPinPresenter$Factory$Impl setPinPresenter$Factory$Impl, SetPinMessagePresenter$Factory$Impl setPinMessagePresenter$Factory$Impl, SignaturePresenter$Factory$Impl signaturePresenter$Factory$Impl, SsnPresenter$Factory$Impl ssnPresenter$Factory$Impl, StatusResultPresenter$Factory$Impl statusResultPresenter$Factory$Impl, SuccessMessagePresenter$Factory$Impl successMessagePresenter$Factory$Impl, VerifyAliasPresenter$Factory$Impl verifyAliasPresenter$Factory$Impl, VerifyContactsPresenter$Factory$Impl verifyContactsPresenter$Factory$Impl, VerifyInstrumentPresenter$Factory$Impl verifyInstrumentPresenter$Factory$Impl, VerifyMagicPresenter$Factory$Impl verifyMagicPresenter$Factory$Impl, PlaidLinkPresenter$Factory$Impl plaidLinkPresenter$Factory$Impl, StripeLinkPresenter$Factory$Impl stripeLinkPresenter$Factory$Impl, WelcomePresenter$Factory$Impl welcomePresenter$Factory$Impl, BlockerContainerPresenter$Factory$Impl blockerContainerPresenter$Factory$Impl, BalanceTransferLoadingPresenter$Factory$Impl balanceTransferLoadingPresenter$Factory$Impl, CashtagErrorPresenter$Factory$Impl cashtagErrorPresenter$Factory$Impl, ConfirmHelpPresenter$Factory$Impl confirmHelpPresenter$Factory$Impl, ConfirmExitOnboardingFlowPresenter$Factory$Impl confirmExitOnboardingFlowPresenter$Factory$Impl, ConfirmPaymentPresenter$Factory$Impl confirmPaymentPresenter$Factory$Impl, FormMenuActionPresenter$Factory$Impl formMenuActionPresenter$Factory$Impl, CameraPermissionPresenter$Factory$Impl cameraPermissionPresenter$Factory$Impl, ReadContactsPermissionPresenter$Factory$Impl readContactsPermissionPresenter$Factory$Impl, UpgradeConfirmationPresenter$Factory$Impl upgradeConfirmationPresenter$Factory$Impl, SkipVerifyPresenter$Factory$Impl skipVerifyPresenter$Factory$Impl, VerifyHelpPresenter$Factory$Impl verifyHelpPresenter$Factory$Impl, FileBlockerExplanationPresenter$Factory$Impl fileBlockerExplanationPresenter$Factory$Impl, GpsLocationConsentBlockerPresenter$Factory$Impl gpsLocationConsentBlockerPresenter$Factory$Impl, GpsExplainerSheetPresenter$Factory$Impl gpsExplainerSheetPresenter$Factory$Impl, ContactsPermissionExplanationSheetPresenter$Factory$Impl contactsPermissionExplanationSheetPresenter$Factory$Impl, AndroidStringManager androidStringManager, FilesetUploadOptionsPresenter$Factory$Impl filesetUploadOptionsPresenter$Factory$Impl, SavingsTransferOptionSelectionPresenter$Factory$Impl savingsTransferOptionSelectionPresenter$Factory$Impl, AtmPickerAmountBlockerPresenter$Factory$Impl atmPickerAmountBlockerPresenter$Factory$Impl, CalendarBlockerPresenter$Factory$Impl calendarBlockerPresenter$Factory$Impl, AuthorizeGooglePayPresenter$Factory$Impl authorizeGooglePayPresenter$Factory$Impl, RequestPushNotificationsBlockerPresenter$Factory$Impl requestPushNotificationsBlockerPresenter$Factory$Impl, EarnerEnrollmentBlockerPresenter$Factory$Impl earnerEnrollmentBlockerPresenter$Factory$Impl, EarnerEnrollmentSuccessBlockerPresenter$Factory$Impl earnerEnrollmentSuccessBlockerPresenter$Factory$Impl, EarnerUpsellBlockerPresenter$Factory$Impl earnerUpsellBlockerPresenter$Factory$Impl, AddMoneyBlockerPresenter$Factory$Impl addMoneyBlockerPresenter$Factory$Impl) {
        this.presenterFactories = set;
        this.permissionManager = androidPermissionManager;
        this.bankAccountLinkingPresenter = bankAccountLinkingPresenter$Factory$Impl;
        this.amountBlockerPresenter = amountBlockerPresenter$Factory$Impl;
        this.bitcoinAmountBlockerPresenter = bitcoinAmountBlockerPresenter$Factory$Impl;
        this.birthdayPresenter = birthdayPresenter$Factory$Impl;
        this.cardActivationPresenter = cardActivationPresenter$Factory$Impl;
        this.cardActivationQrScannerPresenter = cardActivationQrScannerPresenter$Factory$Impl;
        this.cashtagPresenter = cashtagPresenter$Factory$Impl;
        this.checkmarkPresenter = checkmarkPresenter$Factory$Impl;
        this.clientScenarioLauncherPresenter = clientScenarioLauncherPresenter$Factory$Impl;
        this.confirmCvvPresenter = confirmCvvPresenter$Factory$Impl;
        this.fileBlockerPresenter = fileBlockerPresenter$Factory$Impl;
        this.filesetUploadPresenter = filesetUploadPresenter$Factory$Impl;
        this.formBlockerPresenter = formBlockerPresenter$Factory$Impl;
        this.getFlowLoadingPresenter = getFlowLoadingPresenter$Factory$Impl;
        this.inputCardInfoPresenter = inputCardInfoPresenter$Factory$Impl;
        this.instrumentSelectionBlockerPresenter = instrumentSelectionBlockerPresenter$Factory$Impl;
        this.instrumentSelectionListSheetPresenter = instrumentSelectionListSheetPresenter$Factory$Impl;
        this.inviteFriendsPresenter = inviteFriendsPresenter$Factory$Impl;
        this.onboardingInternalRoutePresenter = onboardingInternalRoutePresenter$Factory$Impl;
        this.passcodePresenter = passcodePresenter$Factory$Impl;
        this.referralCodePresenter = referralCodePresenter$Factory$Impl;
        this.registerAliasPresenter = registerAliasPresenter$Factory$Impl;
        this.remoteSkipPresenter = remoteSkipPresenter$Factory$Impl;
        this.setAddressPresenter = setAddressPresenter$Factory$Impl;
        this.selectionPresenter = selectionPresenter$Factory$Impl;
        this.setNamePresenter = setNamePresenter$Factory$Impl;
        this.setPinPresenter = setPinPresenter$Factory$Impl;
        this.setPinMessagePresenter = setPinMessagePresenter$Factory$Impl;
        this.signaturePresenter = signaturePresenter$Factory$Impl;
        this.ssnPresenter = ssnPresenter$Factory$Impl;
        this.statusResultPresenter = statusResultPresenter$Factory$Impl;
        this.successMessagePresenter = successMessagePresenter$Factory$Impl;
        this.verifyAliasPresenter = verifyAliasPresenter$Factory$Impl;
        this.verifyContactsPresenter = verifyContactsPresenter$Factory$Impl;
        this.verifyInstrumentPresenter = verifyInstrumentPresenter$Factory$Impl;
        this.verifyMagicPresenter = verifyMagicPresenter$Factory$Impl;
        this.plaidLinkPresenter = plaidLinkPresenter$Factory$Impl;
        this.stripeLinkPresenter = stripeLinkPresenter$Factory$Impl;
        this.welcomePresenter = welcomePresenter$Factory$Impl;
        this.blockerContainerPresenter = blockerContainerPresenter$Factory$Impl;
        this.balanceTransferLoadingPresenter = balanceTransferLoadingPresenter$Factory$Impl;
        this.confirmHelpPresenter = confirmHelpPresenter$Factory$Impl;
        this.confirmExitOnboardingFlowPresenter = confirmExitOnboardingFlowPresenter$Factory$Impl;
        this.confirmPaymentPresenter = confirmPaymentPresenter$Factory$Impl;
        this.formMenuActionPresenter = formMenuActionPresenter$Factory$Impl;
        this.cameraPermissionPresenter = cameraPermissionPresenter$Factory$Impl;
        this.readContactsPermissionPresenter = readContactsPermissionPresenter$Factory$Impl;
        this.upgradeConfirmationPresenter = upgradeConfirmationPresenter$Factory$Impl;
        this.skipVerifyPresenter = skipVerifyPresenter$Factory$Impl;
        this.fileBlockerExplanationPresenter = fileBlockerExplanationPresenter$Factory$Impl;
        this.gpsLocationConsentBlockerPresenter = gpsLocationConsentBlockerPresenter$Factory$Impl;
        this.gpsExplainerSheetPresenter = gpsExplainerSheetPresenter$Factory$Impl;
        this.contactsPermissionExplanationSheetPresenter = contactsPermissionExplanationSheetPresenter$Factory$Impl;
        this.stringManager = androidStringManager;
        this.filesetUploadOptionsPresenter = filesetUploadOptionsPresenter$Factory$Impl;
        this.savingsTransferOptionSelectionPresenter = savingsTransferOptionSelectionPresenter$Factory$Impl;
        this.atmPickerAmountBlockerPresenter = atmPickerAmountBlockerPresenter$Factory$Impl;
        this.calendarBlockerPresenter = calendarBlockerPresenter$Factory$Impl;
        this.authorizeGooglePayPresenter = authorizeGooglePayPresenter$Factory$Impl;
        this.requestPushNotificationsBlockerPresenter = requestPushNotificationsBlockerPresenter$Factory$Impl;
        this.earnerEnrollmentBlockerPresenter = earnerEnrollmentBlockerPresenter$Factory$Impl;
        this.earnerEnrollmentSuccessBlockerPresenter = earnerEnrollmentSuccessBlockerPresenter$Factory$Impl;
        this.earnerUpsellBlockerPresenter = earnerUpsellBlockerPresenter$Factory$Impl;
        this.addMoneyBlockerPresenter = addMoneyBlockerPresenter$Factory$Impl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0fdc  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0ffe  */
    /* JADX WARN: Type inference failed for: r2v172, types: [app.cash.broadway.presenter.Presenter] */
    /* JADX WARN: Type inference failed for: r7v2, types: [boolean] */
    @Override // app.cash.broadway.presenter.PresenterFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Presenter create(Screen screen, BetterNavigator.ScreenNavigator screenNavigator) {
        BetterNavigator.ScreenNavigator screenNavigator2;
        BlockersScreens.BlockerContainerScreen blockerContainerScreen;
        Screen screen2;
        BlockersPresenterFactory blockersPresenterFactory;
        BlockersPresenterFactory blockersPresenterFactory2;
        BlockersPresenterFactory blockersPresenterFactory3;
        MoleculePresenterKt$asPresenter$1 asPresenter$default;
        BlockersScreens.BlockerContainerScreen blockerContainerScreen2;
        Screen screen3 = screen;
        screen3.getClass();
        boolean z = screen3 instanceof BlockersScreens.BlockerContainerScreen;
        BlockersScreens.BlockerContainerScreen blockerContainerScreen3 = z ? (BlockersScreens.BlockerContainerScreen) screen3 : null;
        if (z) {
            screen3 = ((BlockersScreens.BlockerContainerScreen) screen3).getScreen();
        }
        Screen screen4 = screen3;
        if (!(screen4 instanceof BlockersScreens.BankAccountLinkingScreen)) {
            if (screen4 instanceof BlockersScreens.AmountScreen) {
                VerifyCheckDepositPresenter.MetroFactory metroFactory = this.amountBlockerPresenter.delegateFactory;
                AndroidStringManager androidStringManager = (AndroidStringManager) metroFactory.stringManager.lambda.invoke();
                AppService appService = (AppService) metroFactory.analytics.getValue();
                Analytics analytics = (Analytics) metroFactory.appService.getValue();
                BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) metroFactory.blockerFlowAnalytics.invoke();
                RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl = (RealBlockersHelper$Factory$Impl) metroFactory.blockersNavigator.invoke();
                LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) metroFactory.moneyFormatterFactory.invoke();
                androidStringManager.getClass();
                appService.getClass();
                analytics.getClass();
                blockersDataNavigator.getClass();
                realBlockersHelper$Factory$Impl.getClass();
                factory.getClass();
                screenNavigator2 = screenNavigator;
                asPresenter$default = MoleculePresenterKt.asPresenter$default(new AmountBlockerPresenter((BlockersScreens.AmountScreen) screen4, screenNavigator2, androidStringManager, appService, analytics, blockersDataNavigator, realBlockersHelper$Factory$Impl, factory));
            } else if (screen4 instanceof BlockersScreens.BitcoinAmountScreen) {
                BorrowHomePresenter.MetroFactory metroFactory2 = this.bitcoinAmountBlockerPresenter.delegateFactory;
                Analytics analytics2 = (Analytics) metroFactory2.lendingAppService.getValue();
                RealBitcoinAmountPickerPresenter$Factory$Impl realBitcoinAmountPickerPresenter$Factory$Impl = (RealBitcoinAmountPickerPresenter$Factory$Impl) metroFactory2.borrowDataManager.invoke();
                RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl2 = (RealBlockersHelper$Factory$Impl) metroFactory2.moneyFormatterFactory.invoke();
                AppService appService2 = (AppService) metroFactory2.analytics.getValue();
                AndroidStringManager androidStringManager2 = (AndroidStringManager) metroFactory2.errorReporter.lambda.invoke();
                BlockersDataNavigator blockersDataNavigator2 = (BlockersDataNavigator) metroFactory2.routerFactory.invoke();
                CoroutineScope coroutineScope = (CoroutineScope) metroFactory2.activityScope.value;
                CoroutineContext coroutineContext = (CoroutineContext) metroFactory2.stringManager.lambda.invoke();
                analytics2.getClass();
                realBitcoinAmountPickerPresenter$Factory$Impl.getClass();
                realBlockersHelper$Factory$Impl2.getClass();
                appService2.getClass();
                androidStringManager2.getClass();
                blockersDataNavigator2.getClass();
                coroutineScope.getClass();
                coroutineContext.getClass();
                asPresenter$default = MoleculePresenterKt.asPresenter$default(new CardLockPresenter(analytics2, realBitcoinAmountPickerPresenter$Factory$Impl, realBlockersHelper$Factory$Impl2, appService2, androidStringManager2, blockersDataNavigator2, coroutineScope, coroutineContext, (BlockersScreens.BitcoinAmountScreen) screen4, screenNavigator));
            } else if (screen4 instanceof BlockersScreens.BirthdayScreen) {
                CaptureCheckFacePresenter.MetroFactory metroFactory3 = this.birthdayPresenter.delegateFactory;
                AndroidStringManager androidStringManager3 = (AndroidStringManager) metroFactory3.errorReporter.lambda.invoke();
                BlockersDataNavigator blockersDataNavigator3 = (BlockersDataNavigator) metroFactory3.intentLauncher.invoke();
                SecuritySignalsAggregator securitySignalsAggregator = (SecuritySignalsAggregator) metroFactory3.permissionManager.invoke();
                AndroidDateFormatManager androidDateFormatManager = (AndroidDateFormatManager) metroFactory3.stringManager.lambda.invoke();
                androidStringManager3.getClass();
                blockersDataNavigator3.getClass();
                securitySignalsAggregator.getClass();
                androidDateFormatManager.getClass();
                BirthdayPresenter birthdayPresenter = new BirthdayPresenter(androidStringManager3, blockersDataNavigator3, securitySignalsAggregator, (BlockersScreens.BirthdayScreen) screen4, screenNavigator, androidDateFormatManager);
                screenNavigator2 = screenNavigator;
                asPresenter$default = MoleculePresenterKt.asPresenter$default(birthdayPresenter);
            } else {
                screenNavigator2 = screenNavigator;
                if (screen4 instanceof BlockersScreens.BusinessBackConfirmationScreen) {
                    asPresenter$default = MoleculePresenterKt.asPresenter$default(new AddAliasPresenter(screenNavigator2, 5));
                } else if (screen4 instanceof BlockersScreens.CardActivationScreen) {
                    HelpSheetPresenter$MetroFactory helpSheetPresenter$MetroFactory = this.cardActivationPresenter.delegateFactory;
                    AppService appService3 = (AppService) helpSheetPresenter$MetroFactory.syncValueReader.getValue();
                    BlockersDataNavigator blockersDataNavigator4 = (BlockersDataNavigator) helpSheetPresenter$MetroFactory.routerFactory.invoke();
                    AndroidStringManager androidStringManager4 = (AndroidStringManager) helpSheetPresenter$MetroFactory.errorReporter.lambda.invoke();
                    BlockerFlowListener blockerFlowListener = (BlockerFlowListener) helpSheetPresenter$MetroFactory.oneErrorPerAppSessionStrategy.invoke();
                    appService3.getClass();
                    blockersDataNavigator4.getClass();
                    androidStringManager4.getClass();
                    blockerFlowListener.getClass();
                    asPresenter$default = MoleculePresenterKt.asPresenter$default(new CardStudioPresenter(appService3, blockersDataNavigator4, androidStringManager4, blockerFlowListener, (BlockersScreens.CardActivationScreen) screen4, screenNavigator));
                } else if (screen4 instanceof BlockersScreens.CardActivationQrScreen) {
                    LiteActivityPresenter.MetroFactory metroFactory4 = this.cardActivationQrScannerPresenter.delegateFactory;
                    PermissionChecker permissionChecker = (PermissionChecker) metroFactory4.sessionManager.lambda.invoke();
                    AndroidStringManager androidStringManager5 = (AndroidStringManager) metroFactory4.stringManager.lambda.invoke();
                    BlockerFlowListener blockerFlowListener2 = (BlockerFlowListener) metroFactory4.activityEmbeddedPresenterFactory.invoke();
                    permissionChecker.getClass();
                    androidStringManager5.getClass();
                    blockerFlowListener2.getClass();
                    asPresenter$default = MoleculePresenterKt.asPresenter$default(new LocalPosCheckInPresenter(permissionChecker, androidStringManager5, blockerFlowListener2, screenNavigator, (BlockersScreens.CardActivationQrScreen) screen4));
                } else if (screen4 instanceof BlockersScreens.CashtagScreen) {
                    DeviceBuildInfo deviceBuildInfo = this.cashtagPresenter.delegateFactory;
                    TimeToLiveSyncState timeToLiveSyncState = (TimeToLiveSyncState) ((DoubleCheck) deviceBuildInfo.manufacturer).getValue();
                    BlockersDataNavigator blockersDataNavigator5 = (BlockersDataNavigator) ((Provider) deviceBuildInfo.model).invoke();
                    AppService appService4 = (AppService) ((DoubleCheck) deviceBuildInfo.osVersion).getValue();
                    Signal signal = (Signal) ((DoubleCheck) deviceBuildInfo.osBuild).getValue();
                    Analytics analytics3 = (Analytics) ((DoubleCheck) deviceBuildInfo.fingerprint).getValue();
                    AndroidStringManager androidStringManager6 = (AndroidStringManager) ((LambdaProvider) deviceBuildInfo.tags).lambda.invoke();
                    RealProfileManager realProfileManager = (RealProfileManager) ((DelegateFactory) deviceBuildInfo.brand).invoke();
                    ProductionAttributionEventEmitter productionAttributionEventEmitter = (ProductionAttributionEventEmitter) ((Provider) deviceBuildInfo.apiLevel).invoke();
                    RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl3 = (RealBlockersHelper$Factory$Impl) ((Provider) deviceBuildInfo.cpuAbis).invoke();
                    timeToLiveSyncState.getClass();
                    blockersDataNavigator5.getClass();
                    appService4.getClass();
                    signal.getClass();
                    analytics3.getClass();
                    androidStringManager6.getClass();
                    realProfileManager.getClass();
                    productionAttributionEventEmitter.getClass();
                    realBlockersHelper$Factory$Impl3.getClass();
                    CashtagPresenter cashtagPresenter = new CashtagPresenter(timeToLiveSyncState, blockersDataNavigator5, appService4, signal, analytics3, androidStringManager6, realProfileManager, productionAttributionEventEmitter, realBlockersHelper$Factory$Impl3, (BlockersScreens.CashtagScreen) screen4, screenNavigator);
                    screenNavigator2 = screenNavigator;
                    asPresenter$default = MoleculePresenterKt.asPresenter$default(cashtagPresenter);
                } else {
                    screenNavigator2 = screenNavigator;
                    if (screen4 instanceof BlockersScreens.CashtagConfirmationScreen) {
                        asPresenter$default = MoleculePresenterKt.asPresenter$default(new ErrorPresenter(11, (BlockersScreens.CashtagConfirmationScreen) screen4, screenNavigator2));
                    } else if (screen4 instanceof BlockersScreens.CheckmarkScreen) {
                        CheckDepositAmountPresenter.MetroFactory metroFactory5 = this.checkmarkPresenter.delegateFactory;
                        Analytics analytics4 = (Analytics) metroFactory5.analytics.getValue();
                        BlockersDataNavigator blockersDataNavigator6 = (BlockersDataNavigator) metroFactory5.blockerFlowAnalytics.invoke();
                        analytics4.getClass();
                        blockersDataNavigator6.getClass();
                        asPresenter$default = MoleculePresenterKt.asPresenter$default(new EndAppLockPresenter(analytics4, blockersDataNavigator6, (BlockersScreens.CheckmarkScreen) screen4, screenNavigator, 8));
                    } else if (screen4 instanceof BlockersScreens.ClientScenarioLauncher) {
                        ClientScenarioLauncherPresenter$MetroFactory clientScenarioLauncherPresenter$MetroFactory = this.clientScenarioLauncherPresenter.delegateFactory;
                        RealClientScenarioCompleter realClientScenarioCompleter = (RealClientScenarioCompleter) clientScenarioLauncherPresenter$MetroFactory.clientScenarioCompleter.getValue();
                        BlockerFlowListener blockerFlowListener3 = (BlockerFlowListener) clientScenarioLauncherPresenter$MetroFactory.blockerFlowAnalytics.invoke();
                        AndroidToaster androidToaster = (AndroidToaster) clientScenarioLauncherPresenter$MetroFactory.toaster.lambda.invoke();
                        AndroidStringManager androidStringManager7 = (AndroidStringManager) clientScenarioLauncherPresenter$MetroFactory.stringManager.lambda.invoke();
                        CoroutineContext coroutineContext2 = (CoroutineContext) clientScenarioLauncherPresenter$MetroFactory.ioDispatcher.lambda.invoke();
                        realClientScenarioCompleter.getClass();
                        blockerFlowListener3.getClass();
                        androidToaster.getClass();
                        androidStringManager7.getClass();
                        coroutineContext2.getClass();
                        DisclosurePresenter disclosurePresenter = new DisclosurePresenter(realClientScenarioCompleter, blockerFlowListener3, androidToaster, androidStringManager7, coroutineContext2, (BlockersScreens.ClientScenarioLauncher) screen4, screenNavigator);
                        screenNavigator2 = screenNavigator;
                        asPresenter$default = MoleculePresenterKt.asPresenter$default(disclosurePresenter);
                    } else {
                        screenNavigator2 = screenNavigator;
                        if (screen4 instanceof BlockersScreens.ConfirmCvvScreen) {
                            TaxTooltipPresenter$MetroFactory taxTooltipPresenter$MetroFactory = this.confirmCvvPresenter.delegateFactory;
                            AndroidStringManager androidStringManager8 = (AndroidStringManager) taxTooltipPresenter$MetroFactory.stringManager.lambda.invoke();
                            RealInstrumentManager realInstrumentManager = (RealInstrumentManager) taxTooltipPresenter$MetroFactory.taxDesktopTooltipPreference.invoke();
                            androidStringManager8.getClass();
                            realInstrumentManager.getClass();
                            asPresenter$default = MoleculePresenterKt.asPresenter$default(new MusicPresenter(androidStringManager8, realInstrumentManager, (BlockersScreens.ConfirmCvvScreen) screen4, screenNavigator2));
                        } else if (screen4 instanceof BlockersScreens.InstrumentSelectionDetailsDialogScreen) {
                            asPresenter$default = MoleculePresenterKt.asPresenter$default(new ErrorPresenter(18, (BlockersScreens.InstrumentSelectionDetailsDialogScreen) screen4, screenNavigator2));
                        } else {
                            if (screen4 instanceof BlockersScreens.Error) {
                                asPresenter$default = MoleculePresenterKt.asPresenter$default(new ErrorPresenter(r2, (BlockersScreens.Error) screen4, screenNavigator2));
                            } else if (screen4 instanceof BlockersScreens.ContactVerificationScreen) {
                                AndroidPermissionManager$create$1 create = this.permissionManager.create("android.permission.READ_CONTACTS");
                                DeviceBuildInfo deviceBuildInfo2 = this.verifyContactsPresenter.delegateFactory;
                                AndroidStringManager androidStringManager9 = (AndroidStringManager) ((LambdaProvider) deviceBuildInfo2.manufacturer).lambda.invoke();
                                Analytics analytics5 = (Analytics) ((DoubleCheck) deviceBuildInfo2.model).getValue();
                                BlockersDataNavigator blockersDataNavigator7 = (BlockersDataNavigator) ((Provider) deviceBuildInfo2.osVersion).invoke();
                                Result result = (Result) ((MarkMarketingMessageAsViewed$MetroFactory) deviceBuildInfo2.osBuild).invoke();
                                Signal signal2 = (Signal) ((DoubleCheck) deviceBuildInfo2.fingerprint).getValue();
                                RealContactBook realContactBook = (RealContactBook) ((DoubleCheck) deviceBuildInfo2.tags).getValue();
                                RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl4 = (RealBlockersHelper$Factory$Impl) ((Provider) deviceBuildInfo2.brand).invoke();
                                CoroutineContext coroutineContext3 = (CoroutineContext) ((LambdaProvider) deviceBuildInfo2.apiLevel).lambda.invoke();
                                AppService appService5 = (AppService) ((DoubleCheck) deviceBuildInfo2.cpuAbis).getValue();
                                androidStringManager9.getClass();
                                analytics5.getClass();
                                blockersDataNavigator7.getClass();
                                signal2.getClass();
                                realContactBook.getClass();
                                realBlockersHelper$Factory$Impl4.getClass();
                                coroutineContext3.getClass();
                                appService5.getClass();
                                asPresenter$default = MoleculePresenterKt.asPresenter$default(new VerifyContactsPresenter(androidStringManager9, analytics5, blockersDataNavigator7, result, signal2, realContactBook, realBlockersHelper$Factory$Impl4, coroutineContext3, (BlockersScreens.ContactVerificationScreen) screen4, screenNavigator2, create, appService5));
                            } else if (screen4 instanceof BlockersScreens.FileBlockerScreen) {
                                FileBlockerPresenter.MetroFactory metroFactory6 = this.fileBlockerPresenter.delegateFactory;
                                Analytics analytics6 = (Analytics) metroFactory6.analytics.getValue();
                                BlockersDataNavigator blockersDataNavigator8 = (BlockersDataNavigator) metroFactory6.blockersNavigator.invoke();
                                BlockerImageUploader$Factory$Impl blockerImageUploader$Factory$Impl = (BlockerImageUploader$Factory$Impl) metroFactory6.blockerImageUploaderFactory.value;
                                RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl5 = (RealBlockersHelper$Factory$Impl) metroFactory6.blockersHelperFactory.invoke();
                                analytics6.getClass();
                                blockersDataNavigator8.getClass();
                                blockerImageUploader$Factory$Impl.getClass();
                                realBlockersHelper$Factory$Impl5.getClass();
                                FileBlockerPresenter fileBlockerPresenter = new FileBlockerPresenter(analytics6, blockersDataNavigator8, blockerImageUploader$Factory$Impl, realBlockersHelper$Factory$Impl5, (BlockersScreens.FileBlockerScreen) screen4, screenNavigator);
                                screenNavigator2 = screenNavigator;
                                asPresenter$default = MoleculePresenterKt.asPresenter$default(fileBlockerPresenter);
                            } else {
                                screenNavigator2 = screenNavigator;
                                if (screen4 instanceof BlockersScreens.FilesetUploadLoadingDialog) {
                                    asPresenter$default = MoleculePresenterKt.asPresenter$default(new AddAliasPresenter(screenNavigator2, 7));
                                } else if (screen4 instanceof BlockersScreens.FormScreen) {
                                    FormBlockerPresenter.MetroFactory metroFactory7 = this.formBlockerPresenter.delegateFactory;
                                    FormPresenter$Factory$Impl formPresenter$Factory$Impl = (FormPresenter$Factory$Impl) metroFactory7.formPresenterFactory.value;
                                    Flow flow = (Flow) metroFactory7.signOut.getValue();
                                    SignedInStateManager signedInStateManager = (SignedInStateManager) metroFactory7.signedInStateManager.getValue();
                                    BlockersDataNavigator blockersDataNavigator9 = (BlockersDataNavigator) metroFactory7.blockersNavigator.invoke();
                                    Analytics analytics7 = (Analytics) metroFactory7.analytics.getValue();
                                    RealFormAnalytics realFormAnalytics = (RealFormAnalytics) metroFactory7.formAnalytics.invoke();
                                    RealMultiBlockerFacilitator realMultiBlockerFacilitator = (RealMultiBlockerFacilitator) metroFactory7.multiBlockerFacilitator.invoke();
                                    AndroidStringManager androidStringManager10 = (AndroidStringManager) metroFactory7.stringManager.lambda.invoke();
                                    AndroidClock androidClock = (AndroidClock) metroFactory7.clock.lambda.invoke();
                                    RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl6 = (RealBlockersHelper$Factory$Impl) metroFactory7.blockersHelperFactory.invoke();
                                    formPresenter$Factory$Impl.getClass();
                                    flow.getClass();
                                    signedInStateManager.getClass();
                                    blockersDataNavigator9.getClass();
                                    analytics7.getClass();
                                    realFormAnalytics.getClass();
                                    realMultiBlockerFacilitator.getClass();
                                    androidStringManager10.getClass();
                                    androidClock.getClass();
                                    realBlockersHelper$Factory$Impl6.getClass();
                                    screenNavigator2 = screenNavigator;
                                    asPresenter$default = MoleculePresenterKt.asPresenter$default(new FormBlockerPresenter(formPresenter$Factory$Impl, flow, signedInStateManager, blockersDataNavigator9, analytics7, realFormAnalytics, realMultiBlockerFacilitator, androidStringManager10, androidClock, realBlockersHelper$Factory$Impl6, (BlockersScreens.FormScreen) screen4, screenNavigator));
                                } else if (screen4 instanceof BlockersScreens.HelpItemMessage) {
                                    asPresenter$default = MoleculePresenterKt.asPresenter$default(new ErrorPresenter(16, (BlockersScreens.HelpItemMessage) screen4, screenNavigator2));
                                } else if (screen4 instanceof BlockersScreens.InstrumentSelectionScreen) {
                                    DisclosurePresenter.MetroFactory metroFactory8 = this.instrumentSelectionBlockerPresenter.delegateFactory;
                                    com.squareup.cash.cashlynxflow.service.v2.AppService appService6 = (com.squareup.cash.cashlynxflow.service.v2.AppService) metroFactory8.analytics.getValue();
                                    AndroidStringManager androidStringManager11 = (AndroidStringManager) metroFactory8.stringManager.lambda.invoke();
                                    BlockersDataNavigator blockersDataNavigator10 = (BlockersDataNavigator) metroFactory8.blockersNavigator.invoke();
                                    Analytics analytics8 = (Analytics) metroFactory8.appService.getValue();
                                    RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl7 = (RealBlockersHelper$Factory$Impl) metroFactory8.launcher.invoke();
                                    appService6.getClass();
                                    androidStringManager11.getClass();
                                    blockersDataNavigator10.getClass();
                                    analytics8.getClass();
                                    realBlockersHelper$Factory$Impl7.getClass();
                                    asPresenter$default = MoleculePresenterKt.asPresenter$default(new DisclosurePresenter((BlockersScreens.InstrumentSelectionScreen) screen4, screenNavigator2, appService6, androidStringManager11, blockersDataNavigator10, analytics8, realBlockersHelper$Factory$Impl7));
                                } else if (screen4 instanceof BlockersScreens.InstrumentSelectionDetailsScreen) {
                                    asPresenter$default = MoleculePresenterKt.asPresenter$default(new ErrorPresenter(19, (BlockersScreens.InstrumentSelectionDetailsScreen) screen4, screenNavigator2));
                                } else if (screen4 instanceof BlockersScreens.InstrumentSelectionListScreen) {
                                    Analytics analytics9 = (Analytics) this.instrumentSelectionListSheetPresenter.delegateFactory.analytics.getValue();
                                    analytics9.getClass();
                                    asPresenter$default = MoleculePresenterKt.asPresenter$default(new InstrumentSelectionListSheetPresenter((BlockersScreens.InstrumentSelectionListScreen) screen4, screenNavigator2, analytics9));
                                } else if (screen4 instanceof BlockersScreens.InvalidInputScreen) {
                                    asPresenter$default = MoleculePresenterKt.asPresenter$default(new ErrorPresenter(20, (BlockersScreens.InvalidInputScreen) screen4, screenNavigator2));
                                } else if (screen4 instanceof BlockersScreens.InviteFriendsScreen) {
                                    SignaturePresenter$MetroFactory signaturePresenter$MetroFactory = this.inviteFriendsPresenter.delegateFactory;
                                    BlockersDataNavigator blockersDataNavigator11 = (BlockersDataNavigator) signaturePresenter$MetroFactory.blockersNavigator.invoke();
                                    AppConfigManager appConfigManager = (AppConfigManager) signaturePresenter$MetroFactory.analytics.getValue();
                                    Analytics analytics10 = (Analytics) signaturePresenter$MetroFactory.appService.getValue();
                                    CoroutineContext coroutineContext4 = (CoroutineContext) signaturePresenter$MetroFactory.ioDispatcher.lambda.invoke();
                                    ModifiablePermissions modifiablePermissions = (ModifiablePermissions) signaturePresenter$MetroFactory.blockersHelperFactory.invoke();
                                    AndroidClock androidClock2 = (AndroidClock) signaturePresenter$MetroFactory.stringManager.lambda.invoke();
                                    blockersDataNavigator11.getClass();
                                    appConfigManager.getClass();
                                    analytics10.getClass();
                                    coroutineContext4.getClass();
                                    modifiablePermissions.getClass();
                                    androidClock2.getClass();
                                    PoolsListPresenter poolsListPresenter = new PoolsListPresenter(blockersDataNavigator11, appConfigManager, analytics10, coroutineContext4, (BlockersScreens.InviteFriendsScreen) screen4, screenNavigator2, modifiablePermissions, androidClock2);
                                    screenNavigator2 = screenNavigator2;
                                    asPresenter$default = MoleculePresenterKt.asPresenter$default(poolsListPresenter);
                                } else {
                                    if (!(screen4 instanceof BlockersScreens.IneligibleMergeScreen)) {
                                        if (!(screen4 instanceof BlockersScreens.FilesetUploadScreen)) {
                                            blockerContainerScreen = blockerContainerScreen3;
                                            screen2 = screen4;
                                            int i = 9;
                                            if (screen2 instanceof BlockersScreens.FileBlockerExplanation) {
                                                blockersPresenterFactory = this;
                                                AndroidStringManager androidStringManager12 = (AndroidStringManager) blockersPresenterFactory.fileBlockerExplanationPresenter.delegateFactory.stringManager.lambda.invoke();
                                                androidStringManager12.getClass();
                                                asPresenter$default = MoleculePresenterKt.asPresenter$default(new EndAppLockPresenter(androidStringManager12, (BlockersScreens.FileBlockerExplanation) screen2, screenNavigator2, 9));
                                            } else {
                                                blockersPresenterFactory = this;
                                                if (screen2 instanceof BlockersScreens.GpsLocationConsentBlockerScreen) {
                                                    GpsLocationConsentBlockerPresenter.MetroFactory metroFactory9 = blockersPresenterFactory.gpsLocationConsentBlockerPresenter.delegateFactory;
                                                    PermissionChecker permissionChecker2 = (PermissionChecker) metroFactory9.permissionChecker.lambda.invoke();
                                                    StateFlow stateFlow = (StateFlow) metroFactory9.activityLifecycleStates.invoke();
                                                    Analytics analytics11 = (Analytics) metroFactory9.analytics.getValue();
                                                    AppService appService7 = (AppService) metroFactory9.appService.getValue();
                                                    BlockersDataNavigator blockersDataNavigator12 = (BlockersDataNavigator) metroFactory9.blockersDataNavigator.invoke();
                                                    RealGpsLocationManager realGpsLocationManager = (RealGpsLocationManager) metroFactory9.gpsLocationManager.invoke();
                                                    RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl8 = (RealBlockersHelper$Factory$Impl) metroFactory9.blockersHelperFactory.invoke();
                                                    CoroutineScope coroutineScope2 = (CoroutineScope) metroFactory9.scope.value;
                                                    permissionChecker2.getClass();
                                                    stateFlow.getClass();
                                                    analytics11.getClass();
                                                    appService7.getClass();
                                                    blockersDataNavigator12.getClass();
                                                    realGpsLocationManager.getClass();
                                                    realBlockersHelper$Factory$Impl8.getClass();
                                                    coroutineScope2.getClass();
                                                    screenNavigator2 = screenNavigator;
                                                    asPresenter$default = MoleculePresenterKt.asPresenter$default(new GpsLocationConsentBlockerPresenter(permissionChecker2, stateFlow, analytics11, appService7, blockersDataNavigator12, realGpsLocationManager, realBlockersHelper$Factory$Impl8, coroutineScope2, (BlockersScreens.GpsLocationConsentBlockerScreen) screen2, screenNavigator));
                                                } else if (screen2 instanceof BlockersScreens.GpsExplainerSheetScreen) {
                                                    RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) blockersPresenterFactory.gpsExplainerSheetPresenter.delegateFactory.sandboxer.invoke();
                                                    realRouter$Factory$Impl.getClass();
                                                    asPresenter$default = MoleculePresenterKt.asPresenter$default(new GpsExplainerSheetPresenter((BlockersScreens.GpsExplainerSheetScreen) screen2, screenNavigator2, realRouter$Factory$Impl));
                                                } else {
                                                    if (screen2 instanceof BlockersScreens.OnboardingInternalRouteScreen) {
                                                        HelpSheetPresenter$MetroFactory helpSheetPresenter$MetroFactory2 = blockersPresenterFactory.onboardingInternalRoutePresenter.delegateFactory;
                                                        UsherService usherService = (UsherService) helpSheetPresenter$MetroFactory2.syncValueReader.getValue();
                                                        BlockersDataNavigator blockersDataNavigator13 = (BlockersDataNavigator) helpSheetPresenter$MetroFactory2.routerFactory.invoke();
                                                        RealRouter$Factory$Impl realRouter$Factory$Impl2 = (RealRouter$Factory$Impl) helpSheetPresenter$MetroFactory2.oneErrorPerAppSessionStrategy.invoke();
                                                        AndroidStringManager androidStringManager13 = (AndroidStringManager) helpSheetPresenter$MetroFactory2.errorReporter.lambda.invoke();
                                                        usherService.getClass();
                                                        blockersDataNavigator13.getClass();
                                                        realRouter$Factory$Impl2.getClass();
                                                        androidStringManager13.getClass();
                                                        asPresenter$default = MoleculePresenterKt.asPresenter$default(new LocalEditorialPresenter(screenNavigator2, (BlockersScreens.OnboardingInternalRouteScreen) screen2, usherService, blockersDataNavigator13, realRouter$Factory$Impl2, androidStringManager13));
                                                    } else {
                                                        if (!(screen2 instanceof BlockersScreens.PlaidLinkScreen)) {
                                                            if (screen2 instanceof BlockersScreens.PasscodeScreen) {
                                                                PasscodePresenter.MetroFactory metroFactory10 = blockersPresenterFactory.passcodePresenter.delegateFactory;
                                                                Activity activity = (Activity) metroFactory10.activity.value;
                                                                AppService appService8 = (AppService) metroFactory10.appService.getValue();
                                                                StateFlow stateFlow2 = (StateFlow) metroFactory10.lifecycleState.invoke();
                                                                Signal signal3 = (Signal) metroFactory10.signOutSignal.getValue();
                                                                FlowStarter flowStarter = (FlowStarter) metroFactory10.flowStarter.getValue();
                                                                n nVar = (n) metroFactory10.typedPresenterFactory.invoke();
                                                                RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl9 = (RealBlockersHelper$Factory$Impl) metroFactory10.blockersHelperFactory.invoke();
                                                                AndroidStringManager androidStringManager14 = (AndroidStringManager) metroFactory10.stringManager.lambda.invoke();
                                                                BlockerFlowListener blockerFlowListener4 = (BlockerFlowListener) metroFactory10.blockerFlowAnalytics.invoke();
                                                                AndroidBiometricsStore androidBiometricsStore = (AndroidBiometricsStore) metroFactory10.biometricsStore.invoke();
                                                                RealPinScreensTitleGenerator$Factory$Impl realPinScreensTitleGenerator$Factory$Impl = (RealPinScreensTitleGenerator$Factory$Impl) metroFactory10.pinScreensTitleGeneratorFactory.invoke();
                                                                activity.getClass();
                                                                appService8.getClass();
                                                                stateFlow2.getClass();
                                                                signal3.getClass();
                                                                flowStarter.getClass();
                                                                realBlockersHelper$Factory$Impl9.getClass();
                                                                androidStringManager14.getClass();
                                                                blockerFlowListener4.getClass();
                                                                androidBiometricsStore.getClass();
                                                                realPinScreensTitleGenerator$Factory$Impl.getClass();
                                                                blockersPresenterFactory2 = this;
                                                                PasscodePresenter passcodePresenter = new PasscodePresenter(activity, appService8, stateFlow2, signal3, flowStarter, nVar, realBlockersHelper$Factory$Impl9, androidStringManager14, blockerFlowListener4, androidBiometricsStore, realPinScreensTitleGenerator$Factory$Impl, (BlockersScreens.PasscodeScreen) screen2, screenNavigator);
                                                                screenNavigator2 = screenNavigator;
                                                                asPresenter$default = MoleculePresenterKt.asPresenter$default(passcodePresenter);
                                                            } else {
                                                                screenNavigator2 = screenNavigator;
                                                                blockersPresenterFactory2 = blockersPresenterFactory;
                                                                if (screen2 instanceof BlockersScreens.PasscodeHelpScreen) {
                                                                    asPresenter$default = MoleculePresenterKt.asPresenter$default(new AddAliasPresenter(screenNavigator2, i));
                                                                } else if (screen2 instanceof BlockersScreens.ReferralCodeScreen) {
                                                                    PlaidLinkPresenter.MetroFactory metroFactory11 = blockersPresenterFactory2.referralCodePresenter.delegateFactory;
                                                                    RealReferralManager realReferralManager = (RealReferralManager) metroFactory11.blockersDataNavigator.invoke();
                                                                    AndroidStringManager androidStringManager15 = (AndroidStringManager) metroFactory11.stringManager.lambda.invoke();
                                                                    Analytics analytics12 = (Analytics) metroFactory11.appService.getValue();
                                                                    AppService appService9 = (AppService) metroFactory11.analytics.getValue();
                                                                    BlockersDataNavigator blockersDataNavigator14 = (BlockersDataNavigator) metroFactory11.blockerFlowAnalytics.invoke();
                                                                    AndroidClock androidClock3 = (AndroidClock) metroFactory11.moshi.lambda.invoke();
                                                                    TimeToLiveSyncState timeToLiveSyncState2 = (TimeToLiveSyncState) metroFactory11.signOutSignal.getValue();
                                                                    realReferralManager.getClass();
                                                                    androidStringManager15.getClass();
                                                                    analytics12.getClass();
                                                                    appService9.getClass();
                                                                    blockersDataNavigator14.getClass();
                                                                    androidClock3.getClass();
                                                                    timeToLiveSyncState2.getClass();
                                                                    asPresenter$default = MoleculePresenterKt.asPresenter$default(new ReferralCodePresenter(realReferralManager, androidStringManager15, analytics12, appService9, blockersDataNavigator14, androidClock3, timeToLiveSyncState2, (BlockersScreens.ReferralCodeScreen) screen2, screenNavigator));
                                                                    screenNavigator2 = screenNavigator;
                                                                } else if (screen2 instanceof BlockersScreens.RegisterAliasScreen) {
                                                                    PaymentActionHandler.MetroFactory metroFactory12 = blockersPresenterFactory2.registerAliasPresenter.delegateFactory;
                                                                    AndroidStringManager androidStringManager16 = (AndroidStringManager) metroFactory12.intentFactory.invoke();
                                                                    RealLocaleManager realLocaleManager = (RealLocaleManager) metroFactory12.activityEntityManager.invoke();
                                                                    KeyValue keyValue = (KeyValue) metroFactory12.paymentManager.invoke();
                                                                    BlockersDataNavigator blockersDataNavigator15 = (BlockersDataNavigator) metroFactory12.flowStarter.invoke();
                                                                    RealAliasRegistrar realAliasRegistrar = (RealAliasRegistrar) metroFactory12.stringManager.invoke();
                                                                    RealPasskeyRepository realPasskeyRepository = (RealPasskeyRepository) metroFactory12.balanceSnapshotManager.invoke();
                                                                    RealPasskeyFeatureManager realPasskeyFeatureManager = (RealPasskeyFeatureManager) metroFactory12.instrumentManager.invoke();
                                                                    Analytics analytics13 = (Analytics) metroFactory12.appConfig.invoke();
                                                                    IntentLauncher intentLauncher = (IntentLauncher) metroFactory12.clientSyncer.invoke();
                                                                    SessionManager sessionManager = (SessionManager) metroFactory12.profileSyncer.invoke();
                                                                    ShippingAddressService shippingAddressService = (ShippingAddressService) metroFactory12.appService.invoke();
                                                                    AppService appService10 = (AppService) metroFactory12.cryptoService.invoke();
                                                                    FlowStarter flowStarter2 = (FlowStarter) metroFactory12.tradingService.invoke();
                                                                    BlockerFlowListener blockerFlowListener5 = (BlockerFlowListener) metroFactory12.investingService.invoke();
                                                                    AndroidAliasNormalizer androidAliasNormalizer = (AndroidAliasNormalizer) metroFactory12.lendingAppService.invoke();
                                                                    RealCountryOnboardingConfigRepo realCountryOnboardingConfigRepo = (RealCountryOnboardingConfigRepo) metroFactory12.cashDatabase.invoke();
                                                                    RegisterAliasHelper registerAliasHelper = (RegisterAliasHelper) ((RealGlobalConfigManager.MetroFactory) metroFactory12.scope).invoke();
                                                                    SecuritySignalsAggregator securitySignalsAggregator2 = (SecuritySignalsAggregator) metroFactory12.clientRouteParser.invoke();
                                                                    UserJourneyTracker userJourneyTracker = (UserJourneyTracker) metroFactory12.ioDispatcher.invoke();
                                                                    RealRegisterAliasResultHandler$Factory$Impl realRegisterAliasResultHandler$Factory$Impl = (RealRegisterAliasResultHandler$Factory$Impl) metroFactory12.attributionEventEmitter.invoke();
                                                                    RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl10 = (RealBlockersHelper$Factory$Impl) metroFactory12.supportNavigator.invoke();
                                                                    CoroutineContext coroutineContext5 = (CoroutineContext) metroFactory12.customerStore.invoke();
                                                                    Signal signal4 = (Signal) metroFactory12.analytics.invoke();
                                                                    ErrorReporter errorReporter = (ErrorReporter) metroFactory12.uuidGenerator.invoke();
                                                                    SampleStrategy sampleStrategy = (SampleStrategy) metroFactory12.paymentActionCompletionDispatcher.invoke();
                                                                    androidStringManager16.getClass();
                                                                    realLocaleManager.getClass();
                                                                    keyValue.getClass();
                                                                    blockersDataNavigator15.getClass();
                                                                    realAliasRegistrar.getClass();
                                                                    realPasskeyRepository.getClass();
                                                                    realPasskeyFeatureManager.getClass();
                                                                    analytics13.getClass();
                                                                    intentLauncher.getClass();
                                                                    sessionManager.getClass();
                                                                    shippingAddressService.getClass();
                                                                    appService10.getClass();
                                                                    flowStarter2.getClass();
                                                                    blockerFlowListener5.getClass();
                                                                    androidAliasNormalizer.getClass();
                                                                    realCountryOnboardingConfigRepo.getClass();
                                                                    securitySignalsAggregator2.getClass();
                                                                    userJourneyTracker.getClass();
                                                                    realRegisterAliasResultHandler$Factory$Impl.getClass();
                                                                    realBlockersHelper$Factory$Impl10.getClass();
                                                                    coroutineContext5.getClass();
                                                                    signal4.getClass();
                                                                    errorReporter.getClass();
                                                                    sampleStrategy.getClass();
                                                                    RegisterAliasPresenter registerAliasPresenter = new RegisterAliasPresenter(androidStringManager16, realLocaleManager, keyValue, blockersDataNavigator15, realAliasRegistrar, realPasskeyRepository, realPasskeyFeatureManager, analytics13, intentLauncher, sessionManager, shippingAddressService, appService10, flowStarter2, blockerFlowListener5, androidAliasNormalizer, realCountryOnboardingConfigRepo, registerAliasHelper, securitySignalsAggregator2, userJourneyTracker, realRegisterAliasResultHandler$Factory$Impl, realBlockersHelper$Factory$Impl10, coroutineContext5, signal4, errorReporter, sampleStrategy, (BlockersScreens.RegisterAliasScreen) screen2, screenNavigator);
                                                                    screenNavigator2 = screenNavigator;
                                                                    asPresenter$default = MoleculePresenterKt.asPresenter$default(registerAliasPresenter);
                                                                } else {
                                                                    screenNavigator2 = screenNavigator;
                                                                    if (!(screen2 instanceof BlockersScreens.RegisterErrorScreen)) {
                                                                        if (screen2 instanceof BlockersScreens.RemoteSkipScreen) {
                                                                            blockersPresenterFactory3 = this;
                                                                            RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl11 = (RealBlockersHelper$Factory$Impl) blockersPresenterFactory3.remoteSkipPresenter.delegateFactory.sandboxer.invoke();
                                                                            realBlockersHelper$Factory$Impl11.getClass();
                                                                            asPresenter$default = MoleculePresenterKt.asPresenter$default(new EndAppLockPresenter(realBlockersHelper$Factory$Impl11, (BlockersScreens.RemoteSkipScreen) screen2, screenNavigator2));
                                                                        } else {
                                                                            blockersPresenterFactory3 = this;
                                                                            if (screen2 instanceof BlockersScreens.RemoteSkipErrorScreen) {
                                                                                asPresenter$default = MoleculePresenterKt.asPresenter$default(new ErrorPresenter(22, (BlockersScreens.RemoteSkipErrorScreen) screen2, screenNavigator2));
                                                                            } else if (screen2 instanceof BlockersScreens.SelectionScreen) {
                                                                                BlockersScreens.SelectionScreen selectionScreen = (BlockersScreens.SelectionScreen) screen2;
                                                                                ?? r7 = ((BlockersScreens.SelectionFullScreen) selectionScreen).blockersData.style != BlockersData.Style.DIALOG ? 1 : 0;
                                                                                RealFamilyNavigator$MetroFactory realFamilyNavigator$MetroFactory = blockersPresenterFactory3.selectionPresenter.delegateFactory;
                                                                                BlockersDataNavigator blockersDataNavigator16 = (BlockersDataNavigator) realFamilyNavigator$MetroFactory.analytics.invoke();
                                                                                RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl12 = (RealBlockersHelper$Factory$Impl) realFamilyNavigator$MetroFactory.sessionManager.invoke();
                                                                                IntentLauncher intentLauncher2 = (IntentLauncher) realFamilyNavigator$MetroFactory.supportNavigator.invoke();
                                                                                LocalizedMoneyFormatter.Factory factory2 = (LocalizedMoneyFormatter.Factory) realFamilyNavigator$MetroFactory.stringManager.invoke();
                                                                                blockersDataNavigator16.getClass();
                                                                                realBlockersHelper$Factory$Impl12.getClass();
                                                                                intentLauncher2.getClass();
                                                                                factory2.getClass();
                                                                                asPresenter$default = MoleculePresenterKt.asPresenter$default(new SelectionPresenter(blockersDataNavigator16, realBlockersHelper$Factory$Impl12, intentLauncher2, factory2, selectionScreen, r7, screenNavigator));
                                                                                screenNavigator2 = screenNavigator;
                                                                            } else if (screen2 instanceof BlockersScreens.SetNameScreen) {
                                                                                SetPinPresenter.MetroFactory metroFactory13 = blockersPresenterFactory3.setNamePresenter.delegateFactory;
                                                                                BlockersDataNavigator blockersDataNavigator17 = (BlockersDataNavigator) metroFactory13.blockersNavigator.invoke();
                                                                                ShippingAddressService shippingAddressService2 = (ShippingAddressService) metroFactory13.analytics.getValue();
                                                                                AppService appService11 = (AppService) metroFactory13.appService.getValue();
                                                                                Analytics analytics14 = (Analytics) metroFactory13.flowStarter.getValue();
                                                                                TimeToLiveSyncState timeToLiveSyncState3 = (TimeToLiveSyncState) metroFactory13.signOutSignal.getValue();
                                                                                SecuritySignalsAggregator securitySignalsAggregator3 = (SecuritySignalsAggregator) metroFactory13.biometricsStore.invoke();
                                                                                AndroidStringManager androidStringManager17 = (AndroidStringManager) metroFactory13.stringManager.lambda.invoke();
                                                                                RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl13 = (RealBlockersHelper$Factory$Impl) metroFactory13.blockerFlowAnalytics.invoke();
                                                                                Signal signal5 = (Signal) metroFactory13.featureFlagManager.getValue();
                                                                                IntentLauncher intentLauncher3 = (IntentLauncher) metroFactory13.pinScreensTitleGeneratorFactory.invoke();
                                                                                blockersDataNavigator17.getClass();
                                                                                shippingAddressService2.getClass();
                                                                                appService11.getClass();
                                                                                analytics14.getClass();
                                                                                timeToLiveSyncState3.getClass();
                                                                                securitySignalsAggregator3.getClass();
                                                                                androidStringManager17.getClass();
                                                                                realBlockersHelper$Factory$Impl13.getClass();
                                                                                signal5.getClass();
                                                                                intentLauncher3.getClass();
                                                                                screenNavigator2 = screenNavigator;
                                                                                asPresenter$default = MoleculePresenterKt.asPresenter$default(new CardLockPresenter((BlockersScreens.SetNameScreen) screen2, screenNavigator2, blockersDataNavigator17, shippingAddressService2, appService11, analytics14, timeToLiveSyncState3, securitySignalsAggregator3, androidStringManager17, realBlockersHelper$Factory$Impl13, signal5, intentLauncher3));
                                                                            } else {
                                                                                screenNavigator2 = screenNavigator;
                                                                                int i2 = 12;
                                                                                if (screen2 instanceof BlockersScreens.SetPinMessageScreen) {
                                                                                    AndroidStringManager androidStringManager18 = (AndroidStringManager) blockersPresenterFactory3.setPinMessagePresenter.delegateFactory.stringManager.lambda.invoke();
                                                                                    androidStringManager18.getClass();
                                                                                    asPresenter$default = MoleculePresenterKt.asPresenter$default(new EndAppLockPresenter(androidStringManager18, (BlockersScreens.SetPinMessageScreen) screen2, screenNavigator2, 12));
                                                                                } else {
                                                                                    asPresenter$default = screen2 instanceof BlockersScreens.SetPinScreen ? MoleculePresenterKt.asPresenter$default(blockersPresenterFactory3.setPinPresenter.create((BlockersScreens.SetPinScreen) screen2, screenNavigator2)) : screen2 instanceof BlockersScreens.SignatureScreen ? MoleculePresenterKt.asPresenter$default(blockersPresenterFactory3.signaturePresenter.create((BlockersScreens.SignatureScreen) screen2, screenNavigator2)) : screen2 instanceof BlockersScreens.SsnScreen ? MoleculePresenterKt.asPresenter$default(blockersPresenterFactory3.ssnPresenter.create((BlockersScreens.SsnScreen) screen2, screenNavigator2)) : screen2 instanceof BlockersScreens.StartFlowEntryPoint ? MoleculePresenterKt.asPresenter$default(blockersPresenterFactory3.getFlowLoadingPresenter.create((BlockersScreens.StartFlowEntryPoint) screen2, screenNavigator2)) : screen2 instanceof BlockersScreens.StatusResultScreen ? MoleculePresenterKt.asPresenter$default(blockersPresenterFactory3.statusResultPresenter.create((BlockersScreens.StatusResultScreen) screen2, screenNavigator2)) : screen2 instanceof BlockersScreens.StreetAddressScreen ? MoleculePresenterKt.asPresenter$default(blockersPresenterFactory3.setAddressPresenter.create((BlockersScreens.StreetAddressScreen) screen2, screenNavigator2)) : screen2 instanceof BlockersScreens.StripeLinkScreen ? MoleculePresenterKt.asPresenter$default(blockersPresenterFactory3.stripeLinkPresenter.create((BlockersScreens.StripeLinkScreen) screen2, screenNavigator2)) : screen2 instanceof BlockersScreens.SuccessMessageScreen ? MoleculePresenterKt.asPresenter$default(blockersPresenterFactory3.successMessagePresenter.create((BlockersScreens.SuccessMessageScreen) screen2, screenNavigator2)) : screen2 instanceof BlockersScreens.UnselectableOptionDialog ? MoleculePresenterKt.asPresenter$default(new ErrorPresenter(screenNavigator2, (BlockersScreens.UnselectableOptionDialog) screen2, 24)) : screen2 instanceof BlockersScreens.ConfirmableOptionDialog ? MoleculePresenterKt.asPresenter$default(new ErrorPresenter(screenNavigator2, (BlockersScreens.ConfirmableOptionDialog) screen2, 14)) : screen2 instanceof BlockersScreens.VerifyAliasScreen ? MoleculePresenterKt.asPresenter$default(blockersPresenterFactory3.verifyAliasPresenter.create((BlockersScreens.VerifyAliasScreen) screen2, screenNavigator2)) : screen2 instanceof BlockersScreens.InputCardInfoScreen ? MoleculePresenterKt.asPresenter$default(blockersPresenterFactory3.inputCardInfoPresenter.create((BlockersScreens.InputCardInfoScreen) screen2, screenNavigator2)) : screen2 instanceof BlockersScreens.VerifyCardScreen ? MoleculePresenterKt.asPresenter$default(blockersPresenterFactory3.verifyInstrumentPresenter.create((BlockersScreens.VerifyCardScreen) screen2, screenNavigator2)) : screen2 instanceof BlockersScreens.VerifyErrorScreen ? MoleculePresenterKt.asPresenter$default(new ErrorPresenter(25, (BlockersScreens.VerifyErrorScreen) screen2, screenNavigator2)) : screen2 instanceof BlockersScreens.VerifyHelpScreen ? MoleculePresenterKt.asPresenter$default(new ErrorPresenter(26, (BlockersScreens.VerifyHelpScreen) screen2, screenNavigator2)) : screen2 instanceof BlockersScreens.VerifyMagic ? MoleculePresenterKt.asPresenter$default(blockersPresenterFactory3.verifyMagicPresenter.create((BlockersScreens.VerifyMagic) screen2, screenNavigator2)) : screen2 instanceof BlockersScreens.WelcomeScreen ? MoleculePresenterKt.asPresenter$default(blockersPresenterFactory3.welcomePresenter.create((BlockersScreens.WelcomeScreen) screen2, screenNavigator2)) : screen2 instanceof BlockersScreens.BalanceTransferLoading ? MoleculePresenterKt.asPresenter$default(blockersPresenterFactory3.balanceTransferLoadingPresenter.create((BlockersScreens.BalanceTransferLoading) screen2, screenNavigator2)) : screen2 instanceof BlockersScreens.CameraError ? MoleculePresenterKt.asPresenter$default(new AddAliasPresenter(screenNavigator2, 6)) : screen2 instanceof BlockersScreens.CashtagErrorScreen ? MoleculePresenterKt.asPresenter$default(new ErrorPresenter(i2, (BlockersScreens.CashtagErrorScreen) screen2, screenNavigator2)) : screen2 instanceof BlockersScreens.ConfirmHelp ? MoleculePresenterKt.asPresenter$default(blockersPresenterFactory3.confirmHelpPresenter.create((BlockersScreens.ConfirmHelp) screen2, screenNavigator2)) : screen2 instanceof BlockersScreens.ConfirmExitOnboardingFlowScreen ? MoleculePresenterKt.asPresenter$default(blockersPresenterFactory3.confirmExitOnboardingFlowPresenter.create(screenNavigator2)) : screen2 instanceof BlockersScreens.ConfirmPaymentScreen ? MoleculePresenterKt.asPresenter$default(blockersPresenterFactory3.confirmPaymentPresenter.create((BlockersScreens.ConfirmPaymentScreen) screen2, screenNavigator2)) : screen2 instanceof BlockersScreens.FormMenuActionSheet ? MoleculePresenterKt.asPresenter$default(blockersPresenterFactory3.formMenuActionPresenter.create((BlockersScreens.FormMenuActionSheet) screen2, screenNavigator2)) : screen2 instanceof BlockersScreens.CameraPermissionScreen ? MoleculePresenterKt.asPresenter$default(blockersPresenterFactory3.cameraPermissionPresenter.create(screenNavigator2)) : screen2 instanceof BlockersScreens.ReadContactsPermissionScreen ? MoleculePresenterKt.asPresenter$default(blockersPresenterFactory3.readContactsPermissionPresenter.create(screenNavigator2)) : screen2 instanceof BlockersScreens.UpgradeConfirmationScreen ? MoleculePresenterKt.asPresenter$default(blockersPresenterFactory3.upgradeConfirmationPresenter.create((BlockersScreens.UpgradeConfirmationScreen) screen2, screenNavigator2)) : screen2 instanceof BlockersScreens.SkipVerifyScreen ? MoleculePresenterKt.asPresenter$default(blockersPresenterFactory3.skipVerifyPresenter.create((BlockersScreens.SkipVerifyScreen) screen2, screenNavigator2)) : screen2 instanceof BlockersScreens.HelpOptions.Impl ? MoleculePresenterKt.asPresenter$default(new EndAppLockPresenter((BlockersScreens.HelpOptions.Impl) screen2, screenNavigator2, blockersPresenterFactory3.stringManager)) : screen2 instanceof BlockersScreens.FilesetUploadErrorDialog ? MoleculePresenterKt.asPresenter$default(new ErrorPresenter(15, (BlockersScreens.FilesetUploadErrorDialog) screen2, screenNavigator2)) : screen2 instanceof BlockersScreens.FilesetUploadOptionsBottomSheet ? MoleculePresenterKt.asPresenter$default(blockersPresenterFactory3.filesetUploadOptionsPresenter.create((BlockersScreens.FilesetUploadOptionsBottomSheet) screen2, screenNavigator2)) : screen2 instanceof BlockersScreens.ContactsPermissionExplanationSheet ? MoleculePresenterKt.asPresenter$default(blockersPresenterFactory3.contactsPermissionExplanationSheetPresenter.create((BlockersScreens.ContactsPermissionExplanationSheet) screen2, screenNavigator2)) : screen2 instanceof BlockersScreens.SavingsTransferOptionSelectionScreen ? MoleculePresenterKt.asPresenter$default(blockersPresenterFactory3.savingsTransferOptionSelectionPresenter.create((BlockersScreens.SavingsTransferOptionSelectionScreen) screen2, screenNavigator2)) : screen2 instanceof BlockersScreens.AtmPickerAmountBlockerScreen ? MoleculePresenterKt.asPresenter$default(blockersPresenterFactory3.atmPickerAmountBlockerPresenter.create((BlockersScreens.AtmPickerAmountBlockerScreen) screen2, screenNavigator2)) : screen2 instanceof BlockersScreens.CalendarBlockerScreen ? MoleculePresenterKt.asPresenter$default(blockersPresenterFactory3.calendarBlockerPresenter.create((BlockersScreens.CalendarBlockerScreen) screen2, screenNavigator2)) : screen2 instanceof BlockersScreens.AuthorizeGooglePayScreen ? MoleculePresenterKt.asPresenter$default(blockersPresenterFactory3.authorizeGooglePayPresenter.create((BlockersScreens.AuthorizeGooglePayScreen) screen2, screenNavigator2)) : screen2 instanceof BlockersScreens.RequestPushNotificationsBlockerScreen ? MoleculePresenterKt.asPresenter$default(blockersPresenterFactory3.requestPushNotificationsBlockerPresenter.create((BlockersScreens.RequestPushNotificationsBlockerScreen) screen2, screenNavigator2)) : screen2 instanceof BlockersScreens.EarnerEnrollmentBlockerScreenArgs ? MoleculePresenterKt.asPresenter$default(blockersPresenterFactory3.earnerEnrollmentBlockerPresenter.create((BlockersScreens.EarnerEnrollmentBlockerScreenArgs) screen2, screenNavigator2)) : screen2 instanceof BlockersScreens.EarnerEnrollmentSuccessBlockerScreenArgs ? MoleculePresenterKt.asPresenter$default(blockersPresenterFactory3.earnerEnrollmentSuccessBlockerPresenter.create((BlockersScreens.EarnerEnrollmentSuccessBlockerScreenArgs) screen2, screenNavigator2)) : screen2 instanceof BlockersScreens.EarnerUpsellBlockerScreenArgs ? MoleculePresenterKt.asPresenter$default(blockersPresenterFactory3.earnerUpsellBlockerPresenter.create((BlockersScreens.EarnerUpsellBlockerScreenArgs) screen2, screenNavigator2)) : screen2 instanceof BlockersScreens.AddMoneyBlockerScreen ? MoleculePresenterKt.asPresenter$default(blockersPresenterFactory3.addMoneyBlockerPresenter.create((BlockersScreens.AddMoneyBlockerScreen) screen2, screenNavigator2)) : null;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (asPresenter$default == null) {
                                                                            Iterator it = blockersPresenterFactory3.presenterFactories.iterator();
                                                                            while (true) {
                                                                                if (!it.hasNext()) {
                                                                                    asPresenter$default = null;
                                                                                    break;
                                                                                }
                                                                                ?? create2 = ((BlockerPresenterFactory) it.next()).create(screen2, screenNavigator2);
                                                                                if (create2 != 0) {
                                                                                    asPresenter$default = create2;
                                                                                    break;
                                                                                }
                                                                            }
                                                                        }
                                                                        return ((screen2 instanceof BlockersScreens) || ((BlockersScreens) screen2).getDismissAction() != null || (blockerContainerScreen2 = blockerContainerScreen) == null || asPresenter$default == null) ? asPresenter$default : blockersPresenterFactory3.blockerContainerPresenter.create(asPresenter$default, screenNavigator2, blockerContainerScreen2);
                                                                    }
                                                                    asPresenter$default = MoleculePresenterKt.asPresenter$default(new ErrorPresenter(21, (BlockersScreens.RegisterErrorScreen) screen2, screenNavigator2));
                                                                }
                                                            }
                                                            blockersPresenterFactory3 = blockersPresenterFactory2;
                                                            if (asPresenter$default == null) {
                                                            }
                                                            if (screen2 instanceof BlockersScreens) {
                                                            }
                                                        }
                                                        PlaidLinkPresenter.MetroFactory metroFactory14 = blockersPresenterFactory.plaidLinkPresenter.delegateFactory;
                                                        AppService appService12 = (AppService) metroFactory14.appService.getValue();
                                                        AndroidStringManager androidStringManager19 = (AndroidStringManager) metroFactory14.stringManager.lambda.invoke();
                                                        BlockersDataNavigator blockersDataNavigator18 = (BlockersDataNavigator) metroFactory14.blockersDataNavigator.invoke();
                                                        BlockerFlowListener blockerFlowListener6 = (BlockerFlowListener) metroFactory14.blockerFlowAnalytics.invoke();
                                                        Analytics analytics15 = (Analytics) metroFactory14.analytics.getValue();
                                                        Moshi moshi = (Moshi) metroFactory14.moshi.lambda.invoke();
                                                        Op.Companion companion = new Op.Companion();
                                                        Signal signal6 = (Signal) metroFactory14.signOutSignal.getValue();
                                                        appService12.getClass();
                                                        androidStringManager19.getClass();
                                                        blockersDataNavigator18.getClass();
                                                        blockerFlowListener6.getClass();
                                                        analytics15.getClass();
                                                        moshi.getClass();
                                                        signal6.getClass();
                                                        asPresenter$default = MoleculePresenterKt.asPresenter$default(new PlaidLinkPresenter(appService12, androidStringManager19, blockersDataNavigator18, blockerFlowListener6, analytics15, moshi, companion, signal6, (BlockersScreens.PlaidLinkScreen) screen2, screenNavigator));
                                                    }
                                                    screenNavigator2 = screenNavigator;
                                                }
                                            }
                                            blockersPresenterFactory3 = blockersPresenterFactory;
                                            if (asPresenter$default == null) {
                                            }
                                            if (screen2 instanceof BlockersScreens) {
                                            }
                                        }
                                        FilesetUploadPresenter.MetroFactory metroFactory15 = this.filesetUploadPresenter.delegateFactory;
                                        Analytics analytics16 = (Analytics) metroFactory15.analytics.getValue();
                                        RealFileUploadService realFileUploadService = (RealFileUploadService) metroFactory15.fileUploadService.getValue();
                                        FileUploadsClientService fileUploadsClientService = (FileUploadsClientService) metroFactory15.service.getValue();
                                        AppService appService13 = (AppService) ((DoubleCheck) metroFactory15.franklinAppService).getValue();
                                        BlockersDataNavigator blockersDataNavigator19 = (BlockersDataNavigator) metroFactory15.blockersNavigator.invoke();
                                        AndroidFileTypeDescriber androidFileTypeDescriber = (AndroidFileTypeDescriber) metroFactory15.fileTypeDescriber.invoke();
                                        RealFileValidator$Factory$Impl realFileValidator$Factory$Impl = (RealFileValidator$Factory$Impl) metroFactory15.fileValidatorFactory.invoke();
                                        RealImageFormatConverter$Factory$Impl realImageFormatConverter$Factory$Impl = (RealImageFormatConverter$Factory$Impl) metroFactory15.imageFormatConverterFactory.invoke();
                                        AndroidStringManager androidStringManager20 = (AndroidStringManager) metroFactory15.stringManager.lambda.invoke();
                                        RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl14 = (RealBlockersHelper$Factory$Impl) metroFactory15.blockersHelperFactory.invoke();
                                        ErrorReporter errorReporter2 = (ErrorReporter) metroFactory15.errorReporter.lambda.invoke();
                                        AndroidPermissionManager androidPermissionManager = (AndroidPermissionManager) metroFactory15.permissionManager.invoke();
                                        AndroidFileProvider androidFileProvider = (AndroidFileProvider) metroFactory15.fileProvider.lambda.invoke();
                                        Storage storage = (Storage) ((DoubleCheck) metroFactory15.storage).getValue();
                                        RealCameraLauncher$Factory$Impl realCameraLauncher$Factory$Impl = (RealCameraLauncher$Factory$Impl) ((InstanceFactory) metroFactory15.cameraLauncherFactory).value;
                                        FeatureFlagManager featureFlagManager = (FeatureFlagManager) ((DoubleCheck) metroFactory15.featureFlagManager).getValue();
                                        analytics16.getClass();
                                        realFileUploadService.getClass();
                                        fileUploadsClientService.getClass();
                                        appService13.getClass();
                                        blockersDataNavigator19.getClass();
                                        androidFileTypeDescriber.getClass();
                                        realFileValidator$Factory$Impl.getClass();
                                        realImageFormatConverter$Factory$Impl.getClass();
                                        androidStringManager20.getClass();
                                        realBlockersHelper$Factory$Impl14.getClass();
                                        errorReporter2.getClass();
                                        androidPermissionManager.getClass();
                                        androidFileProvider.getClass();
                                        storage.getClass();
                                        realCameraLauncher$Factory$Impl.getClass();
                                        featureFlagManager.getClass();
                                        blockerContainerScreen = blockerContainerScreen3;
                                        screen2 = screen4;
                                        asPresenter$default = MoleculePresenterKt.asPresenter$default(new FilesetUploadPresenter((BlockersScreens.FilesetUploadScreen) screen4, screenNavigator2, analytics16, realFileUploadService, fileUploadsClientService, appService13, blockersDataNavigator19, androidFileTypeDescriber, realFileValidator$Factory$Impl, realImageFormatConverter$Factory$Impl, androidStringManager20, realBlockersHelper$Factory$Impl14, errorReporter2, androidPermissionManager, androidFileProvider, storage, realCameraLauncher$Factory$Impl, featureFlagManager));
                                        blockersPresenterFactory3 = this;
                                        if (asPresenter$default == null) {
                                        }
                                        if (screen2 instanceof BlockersScreens) {
                                        }
                                    }
                                    asPresenter$default = MoleculePresenterKt.asPresenter$default(new ErrorPresenter(17, (BlockersScreens.IneligibleMergeScreen) screen4, screenNavigator2));
                                }
                            }
                        }
                    }
                }
            }
            blockerContainerScreen = blockerContainerScreen3;
            blockersPresenterFactory3 = this;
            screen2 = screen4;
            if (asPresenter$default == null) {
            }
            if (screen2 instanceof BlockersScreens) {
            }
        }
        DeviceBuildInfo deviceBuildInfo3 = this.bankAccountLinkingPresenter.delegateFactory;
        AndroidStringManager androidStringManager21 = (AndroidStringManager) ((LambdaProvider) deviceBuildInfo3.manufacturer).lambda.invoke();
        Analytics analytics17 = (Analytics) ((DoubleCheck) deviceBuildInfo3.model).getValue();
        BlockerFlowListener blockerFlowListener7 = (BlockerFlowListener) ((Provider) deviceBuildInfo3.osVersion).invoke();
        BlockersDataNavigator blockersDataNavigator20 = (BlockersDataNavigator) ((Provider) deviceBuildInfo3.osBuild).invoke();
        SizeMap sizeMap = (SizeMap) ((RealLiteCashInRepo$MetroFactory) deviceBuildInfo3.fingerprint).invoke();
        RealInstrumentVerifier realInstrumentVerifier = (RealInstrumentVerifier) ((Provider) deviceBuildInfo3.tags).invoke();
        CoroutineScope coroutineScope3 = (CoroutineScope) ((InstanceFactory) deviceBuildInfo3.brand).value;
        TimeToLiveSyncState timeToLiveSyncState4 = (TimeToLiveSyncState) ((DoubleCheck) deviceBuildInfo3.apiLevel).getValue();
        RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl15 = (RealBlockersHelper$Factory$Impl) ((Provider) deviceBuildInfo3.cpuAbis).invoke();
        androidStringManager21.getClass();
        analytics17.getClass();
        blockerFlowListener7.getClass();
        blockersDataNavigator20.getClass();
        realInstrumentVerifier.getClass();
        coroutineScope3.getClass();
        timeToLiveSyncState4.getClass();
        realBlockersHelper$Factory$Impl15.getClass();
        asPresenter$default = MoleculePresenterKt.asPresenter$default(new BankAccountLinkingPresenter(androidStringManager21, analytics17, blockerFlowListener7, blockersDataNavigator20, sizeMap, realInstrumentVerifier, coroutineScope3, timeToLiveSyncState4, realBlockersHelper$Factory$Impl15, (BlockersScreens.BankAccountLinkingScreen) screen4, screenNavigator));
        screenNavigator2 = screenNavigator;
        blockerContainerScreen = blockerContainerScreen3;
        blockersPresenterFactory3 = this;
        screen2 = screen4;
        if (asPresenter$default == null) {
        }
        if (screen2 instanceof BlockersScreens) {
        }
    }
}
