package com.squareup.cash.invitations;

import app.cash.broadway.presenter.Presenter;
import app.cash.broadway.presenter.PresenterFactory;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt;
import app.cash.broadway.screen.Screen;
import com.google.android.gms.internal.measurement.zzlj;
import com.miteksystems.misnap.camera.a.n;
import com.squareup.cash.account.presenters.documents.AccountDocumentsDownloadOptionsPresenter$Factory$Impl;
import com.squareup.cash.account.presenters.documents.AccountDocumentsDownloaderPresenter$Factory$Impl;
import com.squareup.cash.account.presenters.documents.AccountDocumentsPresenter$Factory$Impl;
import com.squareup.cash.appmessages.views.PopupAppMessageView$Factory$Impl;
import com.squareup.cash.appmessages.views.sheet.RealEmbeddedTreehouseContent$Factory$Impl;
import com.squareup.cash.appmessages.views.sheet.SheetAppMessageView$Factory$Impl;
import com.squareup.cash.blockers.presenters.PasscodeConfirmTypeTransformer$Factory$Impl;
import com.squareup.cash.blockers.presenters.PasscodeGenericGatedEndpointTypeTransformer$Factory$Impl;
import com.squareup.cash.blockers.presenters.PasscodeVerifyTypeTransformer$Factory$Impl;
import com.squareup.cash.cashcommercebrowser.api.v1.CustomerPreferencesService;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.common.messaging.presenters.FailureMessageBlockerFullScreenPresenter$Factory$Impl;
import com.squareup.cash.common.messaging.presenters.FailureMessageBlockerPresenter$Factory$Impl;
import com.squareup.cash.common.messaging.presenters.FailureMessagePresenter$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.common.presenters.BitcoinP2pConversionCustomPercentagePresenter$Factory$Impl;
import com.squareup.cash.crypto.common.presenters.BitcoinP2pConversionPercentagePresenter$Factory$Impl;
import com.squareup.cash.crypto.common.presenters.CryptoCommonInsufficientFundsPresenter$Factory$Impl;
import com.squareup.cash.earningstracker.presenters.EarningsTimeframeSelectorSheetPresenter$Factory$Impl;
import com.squareup.cash.earningstracker.presenters.EarningsTrackerPresenter$Factory$Impl;
import com.squareup.cash.earningstracker.presenters.NetEarningsInfoSheetPresenter$Factory$Impl;
import com.squareup.cash.family.requestsponsorship.presenters.SelectContactMethodPresenter$Factory$Impl;
import com.squareup.cash.family.requestsponsorship.presenters.SelectSponsorPresenter$Factory$Impl;
import com.squareup.cash.family.requestsponsorship.presenters.SponsorSelectionDetailsPresenter$Factory$Impl;
import com.squareup.cash.initialscreenloader.presenters.AppUpgradePresenter$Factory$Impl;
import com.squareup.cash.initialscreenloader.presenters.GenericErrorPresenter$Factory$Impl;
import com.squareup.cash.initialscreenloader.presenters.InitialScreenLoaderPresenter$Factory$Impl;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.invitations.InviteErrorPresenter;
import com.squareup.cash.money.presenters.MoneyPresenterFactory;
import com.squareup.cash.paymentpad.presenters.HomeViewPresenter$Factory$Impl;
import com.squareup.cash.paymentpad.presenters.LitePaymentPadPresenter$Factory$Impl;
import com.squareup.cash.paymentpad.presenters.LowDiskSpaceAlertPresenter$Factory$Impl;
import com.squareup.cash.payments.views.PaymentsViewFactory;
import com.squareup.cash.profile.presenters.ErrorPresenter;
import com.squareup.cash.profile.presenters.TaxesPasswordPresenter$MetroFactory;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.security.presenters.PasswordDialogPresenter$Factory$Impl;
import com.squareup.cash.security.presenters.SetPasswordPresenter$Factory$Impl;
import com.squareup.cash.security.presenters.VerifyPasswordPresenter$Factory$Impl;
import com.squareup.cash.securityhub.presenters.BookletPresenter$Factory$Impl;
import com.squareup.cash.securityhub.presenters.RecoveryGuidePresenter$Factory$Impl;
import com.squareup.cash.securityhub.presenters.SecurityHubPresenter$Factory$Impl;
import com.squareup.cash.shopping.backend.real.RealShippingAddressRepository;
import com.squareup.cash.shopping.settings.presenters.ErrorPresenter$Factory$Impl;
import com.squareup.cash.shopping.settings.presenters.ShoppingSettingsAutofillPresenter$Factory$Impl;
import com.squareup.cash.shopping.settings.presenters.ShoppingSettingsPresenter$Factory$Impl;
import com.squareup.cash.shopping.settings.screens.ErrorScreen;
import com.squareup.cash.shopping.settings.screens.ShoppingSettingsAutofillScreen;
import com.squareup.cash.shopping.settings.screens.ShoppingSettingsScreen;
import com.squareup.cash.wallet.presenters.WalletPresenterFactory;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class InvitationsPresenterFactory$MetroFactory implements Factory {
    public final /* synthetic */ int $r8$classId;
    public final InstanceFactory inviteContactsPresenterFactory;
    public final InstanceFactory inviteErrorPresenter;
    public final InstanceFactory invitesReferralRulesBottomSheetPresenterFactory;

    public /* synthetic */ InvitationsPresenterFactory$MetroFactory(InstanceFactory instanceFactory, InstanceFactory instanceFactory2, InstanceFactory instanceFactory3, int i) {
        this.$r8$classId = i;
        this.inviteContactsPresenterFactory = instanceFactory;
        this.invitesReferralRulesBottomSheetPresenterFactory = instanceFactory2;
        this.inviteErrorPresenter = instanceFactory3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        int i2 = 1;
        InstanceFactory instanceFactory = this.inviteErrorPresenter;
        InstanceFactory instanceFactory2 = this.invitesReferralRulesBottomSheetPresenterFactory;
        InstanceFactory instanceFactory3 = this.inviteContactsPresenterFactory;
        switch (i) {
            case 0:
                InviteContactsPresenter$Factory$Impl inviteContactsPresenter$Factory$Impl = (InviteContactsPresenter$Factory$Impl) instanceFactory3.value;
                InvitesReferralRulesBottomSheetPresenter$Factory$Impl invitesReferralRulesBottomSheetPresenter$Factory$Impl = (InvitesReferralRulesBottomSheetPresenter$Factory$Impl) instanceFactory2.value;
                InviteErrorPresenter$Factory$Impl inviteErrorPresenter$Factory$Impl = (InviteErrorPresenter$Factory$Impl) instanceFactory.value;
                inviteContactsPresenter$Factory$Impl.getClass();
                invitesReferralRulesBottomSheetPresenter$Factory$Impl.getClass();
                inviteErrorPresenter$Factory$Impl.getClass();
                return new MoneyPresenterFactory(inviteContactsPresenter$Factory$Impl, invitesReferralRulesBottomSheetPresenter$Factory$Impl, inviteErrorPresenter$Factory$Impl);
            case 1:
                AccountDocumentsDownloaderPresenter$Factory$Impl accountDocumentsDownloaderPresenter$Factory$Impl = (AccountDocumentsDownloaderPresenter$Factory$Impl) instanceFactory3.value;
                AccountDocumentsDownloadOptionsPresenter$Factory$Impl accountDocumentsDownloadOptionsPresenter$Factory$Impl = (AccountDocumentsDownloadOptionsPresenter$Factory$Impl) instanceFactory2.value;
                AccountDocumentsPresenter$Factory$Impl accountDocumentsPresenter$Factory$Impl = (AccountDocumentsPresenter$Factory$Impl) instanceFactory.value;
                accountDocumentsDownloaderPresenter$Factory$Impl.getClass();
                accountDocumentsDownloadOptionsPresenter$Factory$Impl.getClass();
                accountDocumentsPresenter$Factory$Impl.getClass();
                return new WalletPresenterFactory(i2, accountDocumentsDownloaderPresenter$Factory$Impl, accountDocumentsDownloadOptionsPresenter$Factory$Impl, accountDocumentsPresenter$Factory$Impl);
            case 2:
                PopupAppMessageView$Factory$Impl popupAppMessageView$Factory$Impl = (PopupAppMessageView$Factory$Impl) instanceFactory3.value;
                SheetAppMessageView$Factory$Impl sheetAppMessageView$Factory$Impl = (SheetAppMessageView$Factory$Impl) instanceFactory2.value;
                RealEmbeddedTreehouseContent$Factory$Impl realEmbeddedTreehouseContent$Factory$Impl = (RealEmbeddedTreehouseContent$Factory$Impl) instanceFactory.value;
                popupAppMessageView$Factory$Impl.getClass();
                sheetAppMessageView$Factory$Impl.getClass();
                realEmbeddedTreehouseContent$Factory$Impl.getClass();
                return new PaymentsViewFactory(i2, popupAppMessageView$Factory$Impl, sheetAppMessageView$Factory$Impl, realEmbeddedTreehouseContent$Factory$Impl);
            case 3:
                PasscodeVerifyTypeTransformer$Factory$Impl passcodeVerifyTypeTransformer$Factory$Impl = (PasscodeVerifyTypeTransformer$Factory$Impl) instanceFactory3.value;
                PasscodeConfirmTypeTransformer$Factory$Impl passcodeConfirmTypeTransformer$Factory$Impl = (PasscodeConfirmTypeTransformer$Factory$Impl) instanceFactory2.value;
                PasscodeGenericGatedEndpointTypeTransformer$Factory$Impl passcodeGenericGatedEndpointTypeTransformer$Factory$Impl = (PasscodeGenericGatedEndpointTypeTransformer$Factory$Impl) instanceFactory.value;
                passcodeVerifyTypeTransformer$Factory$Impl.getClass();
                passcodeConfirmTypeTransformer$Factory$Impl.getClass();
                passcodeGenericGatedEndpointTypeTransformer$Factory$Impl.getClass();
                return new n(25, passcodeVerifyTypeTransformer$Factory$Impl, passcodeConfirmTypeTransformer$Factory$Impl, passcodeGenericGatedEndpointTypeTransformer$Factory$Impl);
            case 4:
                FailureMessagePresenter$Factory$Impl failureMessagePresenter$Factory$Impl = (FailureMessagePresenter$Factory$Impl) instanceFactory3.value;
                FailureMessageBlockerPresenter$Factory$Impl failureMessageBlockerPresenter$Factory$Impl = (FailureMessageBlockerPresenter$Factory$Impl) instanceFactory2.value;
                FailureMessageBlockerFullScreenPresenter$Factory$Impl failureMessageBlockerFullScreenPresenter$Factory$Impl = (FailureMessageBlockerFullScreenPresenter$Factory$Impl) instanceFactory.value;
                failureMessagePresenter$Factory$Impl.getClass();
                failureMessageBlockerPresenter$Factory$Impl.getClass();
                failureMessageBlockerFullScreenPresenter$Factory$Impl.getClass();
                return new WalletPresenterFactory(3, failureMessagePresenter$Factory$Impl, failureMessageBlockerPresenter$Factory$Impl, failureMessageBlockerFullScreenPresenter$Factory$Impl);
            case 5:
                CryptoCommonInsufficientFundsPresenter$Factory$Impl cryptoCommonInsufficientFundsPresenter$Factory$Impl = (CryptoCommonInsufficientFundsPresenter$Factory$Impl) instanceFactory3.value;
                BitcoinP2pConversionPercentagePresenter$Factory$Impl bitcoinP2pConversionPercentagePresenter$Factory$Impl = (BitcoinP2pConversionPercentagePresenter$Factory$Impl) instanceFactory2.value;
                BitcoinP2pConversionCustomPercentagePresenter$Factory$Impl bitcoinP2pConversionCustomPercentagePresenter$Factory$Impl = (BitcoinP2pConversionCustomPercentagePresenter$Factory$Impl) instanceFactory.value;
                cryptoCommonInsufficientFundsPresenter$Factory$Impl.getClass();
                bitcoinP2pConversionPercentagePresenter$Factory$Impl.getClass();
                bitcoinP2pConversionCustomPercentagePresenter$Factory$Impl.getClass();
                return new WalletPresenterFactory(4, cryptoCommonInsufficientFundsPresenter$Factory$Impl, bitcoinP2pConversionPercentagePresenter$Factory$Impl, bitcoinP2pConversionCustomPercentagePresenter$Factory$Impl);
            case 6:
                EarningsTrackerPresenter$Factory$Impl earningsTrackerPresenter$Factory$Impl = (EarningsTrackerPresenter$Factory$Impl) instanceFactory3.value;
                NetEarningsInfoSheetPresenter$Factory$Impl netEarningsInfoSheetPresenter$Factory$Impl = (NetEarningsInfoSheetPresenter$Factory$Impl) instanceFactory2.value;
                EarningsTimeframeSelectorSheetPresenter$Factory$Impl earningsTimeframeSelectorSheetPresenter$Factory$Impl = (EarningsTimeframeSelectorSheetPresenter$Factory$Impl) instanceFactory.value;
                earningsTrackerPresenter$Factory$Impl.getClass();
                netEarningsInfoSheetPresenter$Factory$Impl.getClass();
                earningsTimeframeSelectorSheetPresenter$Factory$Impl.getClass();
                return new WalletPresenterFactory(5, earningsTrackerPresenter$Factory$Impl, netEarningsInfoSheetPresenter$Factory$Impl, earningsTimeframeSelectorSheetPresenter$Factory$Impl);
            case 7:
                SponsorSelectionDetailsPresenter$Factory$Impl sponsorSelectionDetailsPresenter$Factory$Impl = (SponsorSelectionDetailsPresenter$Factory$Impl) instanceFactory3.value;
                SelectContactMethodPresenter$Factory$Impl selectContactMethodPresenter$Factory$Impl = (SelectContactMethodPresenter$Factory$Impl) instanceFactory2.value;
                SelectSponsorPresenter$Factory$Impl selectSponsorPresenter$Factory$Impl = (SelectSponsorPresenter$Factory$Impl) instanceFactory.value;
                sponsorSelectionDetailsPresenter$Factory$Impl.getClass();
                selectContactMethodPresenter$Factory$Impl.getClass();
                selectSponsorPresenter$Factory$Impl.getClass();
                return new WalletPresenterFactory(6, sponsorSelectionDetailsPresenter$Factory$Impl, selectContactMethodPresenter$Factory$Impl, selectSponsorPresenter$Factory$Impl);
            case 8:
                AppUpgradePresenter$Factory$Impl appUpgradePresenter$Factory$Impl = (AppUpgradePresenter$Factory$Impl) instanceFactory3.value;
                InitialScreenLoaderPresenter$Factory$Impl initialScreenLoaderPresenter$Factory$Impl = (InitialScreenLoaderPresenter$Factory$Impl) instanceFactory2.value;
                GenericErrorPresenter$Factory$Impl genericErrorPresenter$Factory$Impl = (GenericErrorPresenter$Factory$Impl) instanceFactory.value;
                appUpgradePresenter$Factory$Impl.getClass();
                initialScreenLoaderPresenter$Factory$Impl.getClass();
                genericErrorPresenter$Factory$Impl.getClass();
                return new WalletPresenterFactory(8, appUpgradePresenter$Factory$Impl, initialScreenLoaderPresenter$Factory$Impl, genericErrorPresenter$Factory$Impl);
            case 9:
                HomeViewPresenter$Factory$Impl homeViewPresenter$Factory$Impl = (HomeViewPresenter$Factory$Impl) instanceFactory3.value;
                LitePaymentPadPresenter$Factory$Impl litePaymentPadPresenter$Factory$Impl = (LitePaymentPadPresenter$Factory$Impl) instanceFactory2.value;
                LowDiskSpaceAlertPresenter$Factory$Impl lowDiskSpaceAlertPresenter$Factory$Impl = (LowDiskSpaceAlertPresenter$Factory$Impl) instanceFactory.value;
                homeViewPresenter$Factory$Impl.getClass();
                litePaymentPadPresenter$Factory$Impl.getClass();
                lowDiskSpaceAlertPresenter$Factory$Impl.getClass();
                return new WalletPresenterFactory(10, homeViewPresenter$Factory$Impl, litePaymentPadPresenter$Factory$Impl, lowDiskSpaceAlertPresenter$Factory$Impl);
            case 10:
                SetPasswordPresenter$Factory$Impl setPasswordPresenter$Factory$Impl = (SetPasswordPresenter$Factory$Impl) instanceFactory3.value;
                VerifyPasswordPresenter$Factory$Impl verifyPasswordPresenter$Factory$Impl = (VerifyPasswordPresenter$Factory$Impl) instanceFactory2.value;
                PasswordDialogPresenter$Factory$Impl passwordDialogPresenter$Factory$Impl = (PasswordDialogPresenter$Factory$Impl) instanceFactory.value;
                setPasswordPresenter$Factory$Impl.getClass();
                verifyPasswordPresenter$Factory$Impl.getClass();
                passwordDialogPresenter$Factory$Impl.getClass();
                return new MoneyPresenterFactory(setPasswordPresenter$Factory$Impl, verifyPasswordPresenter$Factory$Impl, passwordDialogPresenter$Factory$Impl);
            case 11:
                SecurityHubPresenter$Factory$Impl securityHubPresenter$Factory$Impl = (SecurityHubPresenter$Factory$Impl) instanceFactory3.value;
                BookletPresenter$Factory$Impl bookletPresenter$Factory$Impl = (BookletPresenter$Factory$Impl) instanceFactory2.value;
                RecoveryGuidePresenter$Factory$Impl recoveryGuidePresenter$Factory$Impl = (RecoveryGuidePresenter$Factory$Impl) instanceFactory.value;
                securityHubPresenter$Factory$Impl.getClass();
                bookletPresenter$Factory$Impl.getClass();
                recoveryGuidePresenter$Factory$Impl.getClass();
                return new WalletPresenterFactory(11, securityHubPresenter$Factory$Impl, bookletPresenter$Factory$Impl, recoveryGuidePresenter$Factory$Impl);
            default:
                final ShoppingSettingsPresenter$Factory$Impl shoppingSettingsPresenter$Factory$Impl = (ShoppingSettingsPresenter$Factory$Impl) instanceFactory3.value;
                final ShoppingSettingsAutofillPresenter$Factory$Impl shoppingSettingsAutofillPresenter$Factory$Impl = (ShoppingSettingsAutofillPresenter$Factory$Impl) instanceFactory2.value;
                final ErrorPresenter$Factory$Impl errorPresenter$Factory$Impl = (ErrorPresenter$Factory$Impl) instanceFactory.value;
                shoppingSettingsPresenter$Factory$Impl.getClass();
                shoppingSettingsAutofillPresenter$Factory$Impl.getClass();
                errorPresenter$Factory$Impl.getClass();
                return new PresenterFactory(shoppingSettingsAutofillPresenter$Factory$Impl, errorPresenter$Factory$Impl) { // from class: com.squareup.cash.shopping.settings.presenters.ShoppingSettingsPresenterModule$Companion$$ExternalSyntheticLambda0
                    public final /* synthetic */ ShoppingSettingsAutofillPresenter$Factory$Impl f$1;

                    @Override // app.cash.broadway.presenter.PresenterFactory
                    public final Presenter create(Screen screen, BetterNavigator.ScreenNavigator screenNavigator) {
                        screen.getClass();
                        if (screen.equals(ShoppingSettingsScreen.INSTANCE)) {
                            TaxesPasswordPresenter$MetroFactory taxesPasswordPresenter$MetroFactory = ShoppingSettingsPresenter$Factory$Impl.this.delegateFactory;
                            SyncValueReader syncValueReader = (SyncValueReader) taxesPasswordPresenter$MetroFactory.syncValueReader.getValue();
                            Analytics analytics = (Analytics) taxesPasswordPresenter$MetroFactory.flowStarter.getValue();
                            syncValueReader.getClass();
                            analytics.getClass();
                            return MoleculePresenterKt.asPresenter$default(new InviteErrorPresenter((Object) syncValueReader, analytics, screenNavigator, 19));
                        }
                        if (!screen.equals(ShoppingSettingsAutofillScreen.INSTANCE)) {
                            if (screen instanceof ErrorScreen) {
                                return MoleculePresenterKt.asPresenter$default(new ErrorPresenter((ErrorScreen) screen, screenNavigator));
                            }
                            return null;
                        }
                        zzlj zzljVar = this.f$1.delegateFactory;
                        SyncValueReader syncValueReader2 = (SyncValueReader) ((DoubleCheck) zzljVar.zza).getValue();
                        CustomerPreferencesService customerPreferencesService = (CustomerPreferencesService) ((DoubleCheck) zzljVar.zzb).getValue();
                        RealShippingAddressRepository realShippingAddressRepository = (RealShippingAddressRepository) ((DoubleCheck) zzljVar.zzc).getValue();
                        Analytics analytics2 = (Analytics) ((DoubleCheck) zzljVar.zze).getValue();
                        AndroidStringManager androidStringManager = (AndroidStringManager) ((LambdaProvider) zzljVar.zzd).lambda.invoke();
                        CoroutineContext coroutineContext = (CoroutineContext) ((LambdaProvider) zzljVar.zzf).lambda.invoke();
                        syncValueReader2.getClass();
                        customerPreferencesService.getClass();
                        realShippingAddressRepository.getClass();
                        analytics2.getClass();
                        androidStringManager.getClass();
                        coroutineContext.getClass();
                        return MoleculePresenterKt.asPresenter$default(new ShoppingSettingsAutofillPresenter(syncValueReader2, customerPreferencesService, realShippingAddressRepository, analytics2, androidStringManager, coroutineContext, screenNavigator));
                    }
                };
        }
    }
}
