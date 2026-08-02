package com.squareup.cash.account.presenters;

import app.cash.broadway.presenter.Presenter;
import app.cash.broadway.presenter.PresenterFactory;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt;
import app.cash.broadway.screen.Screen;
import app.cash.local.presenters.LocalEditorialPresenter;
import coil3.ImageLoader$Builder;
import com.bugsnag.android.DeviceBuildInfo;
import com.google.android.gms.maps.zzai;
import com.squareup.cash.account.presenters.accountswitcher.AccountSwitcherPresenter$Factory$Impl;
import com.squareup.cash.account.presenters.accountswitcher.AccountsLoadingFailedPresenter$Factory$Impl;
import com.squareup.cash.account.presenters.accountswitcher.AddAccountOptionsPresenter$Factory$Impl;
import com.squareup.cash.account.presenters.accountswitcher.SwitchFullAccountLoadingPresenter$Factory$Impl;
import com.squareup.cash.account.presenters.business.BusinessInfoPresenter$Factory$Impl;
import com.squareup.cash.braze.RealBrazeManager;
import com.squareup.cash.clientroutes.RealClientRouteParser;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.device.RealDeviceOrientationProvider;
import com.squareup.cash.deviceintegrity.RealDeviceIntegrityAttester;
import com.squareup.cash.family.familyhub.presenters.ApprovedContactsControlPresenter$Factory$Impl;
import com.squareup.cash.family.familyhub.presenters.BitcoinControlPresenter$Factory$Impl;
import com.squareup.cash.family.familyhub.presenters.CashCardControlPresenter$Factory$Impl;
import com.squareup.cash.family.familyhub.presenters.ManagedAccountControlPresenter$Factory$Impl;
import com.squareup.cash.family.familyhub.presenters.NotificationsControlPresenter$Factory$Impl;
import com.squareup.cash.family.familyhub.presenters.P2PControlPresenter$Factory$Impl;
import com.squareup.cash.family.familyhub.presenters.PromotionsControlPresenter$Factory$Impl;
import com.squareup.cash.family.familyhub.presenters.StocksControlPresenter$Factory$Impl;
import com.squareup.cash.family.navigation.RealFamilyNavigator$MetroFactory;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.invitations.InviteErrorPresenter;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.mri.android.RealMRIFactory;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.offers.presenters.OffersHomePresenter;
import com.squareup.cash.pools.presenters.PoolsPresenterFactory;
import com.squareup.cash.profile.presenters.ErrorPresenter;
import com.squareup.cash.profile.views.ProfileCropView;
import com.squareup.cash.securitysignals.backend.RealScreenRecordingDetector;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.shopping.presenters.BrandsSearchPresenter$Factory$Impl;
import com.squareup.cash.shopping.presenters.CashAppPayIncentiveSheetPresenter$Factory$Impl;
import com.squareup.cash.shopping.presenters.CashAppPayIncentiveSilentAuthErrorDialogPresenter$Factory$Impl;
import com.squareup.cash.shopping.presenters.ProductSearchPresenter$Factory$Impl;
import com.squareup.cash.shopping.presenters.RestrictedItemWarningSheetPresenter$Factory$Impl;
import com.squareup.cash.shopping.presenters.ShoppingInfoSheetPresenter$Factory$Impl;
import com.squareup.cash.shopping.presenters.ShoppingPresenterFactory;
import com.squareup.cash.shopping.presenters.ShoppingWebPresenter$Factory$Impl;
import com.squareup.cash.shopping.sup.presenters.SingleUsePaymentCancelPlanDialogPresenter$Factory$Impl;
import com.squareup.cash.support.navigation.RealSupportNavigator;
import com.squareup.cash.taptopay.backend.real.RealTagCommunication$Factory$Impl;
import com.squareup.cash.taptopay.backend.real.RealTapToPayActionManager;
import com.squareup.cash.taptopay.backend.real.RealTapToPayAnalyticsHelper;
import com.squareup.cash.taptopay.backend.real.RealTapToPayEligibilityProvider;
import com.squareup.cash.taptopay.backend.real.RealTapToPayErrorReporter;
import com.squareup.cash.taptopay.backend.real.RealTapToPayRepository;
import com.squareup.cash.taptopay.backend.real.RealTapToPaySessionManager;
import com.squareup.cash.taptopay.encryption.real.RealHieroglyphKeyProvider;
import com.squareup.cash.taptopay.presenters.TapToPayErrorDialogPresenter$Factory$Impl;
import com.squareup.cash.taptopay.presenters.TapToPayErrorPresenter$Factory$Impl;
import com.squareup.cash.taptopay.presenters.TapToPayFirstTimeScreenPresenter$Factory$Impl;
import com.squareup.cash.taptopay.presenters.TapToPayInitiatorNotesPresenter$Factory$Impl;
import com.squareup.cash.taptopay.presenters.TapToPayOnboardingCompletePresenter$Factory$Impl;
import com.squareup.cash.taptopay.presenters.TapToPayPaymentPresenter$Factory$Impl;
import com.squareup.cash.taptopay.presenters.TapToPayPaymentRequestPresenter$Factory$Impl;
import com.squareup.cash.taptopay.presenters.TapToPayPresenter$Factory$Impl;
import com.squareup.cash.taptopay.screens.TapToPayErrorDialogScreen;
import com.squareup.cash.taptopay.screens.TapToPayErrorScreen;
import com.squareup.cash.taptopay.screens.TapToPayFirstTimeScreen;
import com.squareup.cash.taptopay.screens.TapToPayInitiatorNotesScreen;
import com.squareup.cash.taptopay.screens.TapToPayOnboardingCompleteScreen;
import com.squareup.cash.taptopay.screens.TapToPayPaymentRequestScreen;
import com.squareup.cash.taptopay.screens.TapToPayPaymentScreen;
import com.squareup.cash.taptopay.screens.TapToPayScreen;
import com.squareup.cash.tax.presenters.TaxReturnsPresenter;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.cash.work.presenters.RealYouPresenter$MetroFactory;
import com.squareup.cash.work.presenters.WorkHomePresenter;
import com.squareup.preferences.KeyValue;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DelegateFactory;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;

/* loaded from: classes.dex */
public final class AccountPresenterFactory$MetroFactory implements Factory {
    public final /* synthetic */ int $r8$classId;
    public final InstanceFactory accountPresenterFactory;
    public final InstanceFactory accountSwitcherPresenter;
    public final InstanceFactory accountsLoadingFailedPresenter;
    public final InstanceFactory addAccountPresenterFactory;
    public final InstanceFactory businessInfoPresenterFactory;
    public final InstanceFactory editProfilePresenterFactory;
    public final InstanceFactory switchFullAccountLoadingPresenter;
    public final InstanceFactory themeSwitcherPresenter;

    public /* synthetic */ AccountPresenterFactory$MetroFactory(InstanceFactory instanceFactory, InstanceFactory instanceFactory2, InstanceFactory instanceFactory3, InstanceFactory instanceFactory4, InstanceFactory instanceFactory5, InstanceFactory instanceFactory6, InstanceFactory instanceFactory7, InstanceFactory instanceFactory8, int i) {
        this.$r8$classId = i;
        this.accountPresenterFactory = instanceFactory;
        this.editProfilePresenterFactory = instanceFactory2;
        this.businessInfoPresenterFactory = instanceFactory3;
        this.accountSwitcherPresenter = instanceFactory4;
        this.addAccountPresenterFactory = instanceFactory5;
        this.switchFullAccountLoadingPresenter = instanceFactory6;
        this.accountsLoadingFailedPresenter = instanceFactory7;
        this.themeSwitcherPresenter = instanceFactory8;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        InstanceFactory instanceFactory = this.themeSwitcherPresenter;
        InstanceFactory instanceFactory2 = this.accountsLoadingFailedPresenter;
        InstanceFactory instanceFactory3 = this.switchFullAccountLoadingPresenter;
        InstanceFactory instanceFactory4 = this.addAccountPresenterFactory;
        InstanceFactory instanceFactory5 = this.accountSwitcherPresenter;
        InstanceFactory instanceFactory6 = this.businessInfoPresenterFactory;
        InstanceFactory instanceFactory7 = this.editProfilePresenterFactory;
        InstanceFactory instanceFactory8 = this.accountPresenterFactory;
        switch (i) {
            case 0:
                AccountPresenter$Factory$Impl accountPresenter$Factory$Impl = (AccountPresenter$Factory$Impl) instanceFactory8.value;
                EditProfilePresenter$Factory$Impl editProfilePresenter$Factory$Impl = (EditProfilePresenter$Factory$Impl) instanceFactory7.value;
                BusinessInfoPresenter$Factory$Impl businessInfoPresenter$Factory$Impl = (BusinessInfoPresenter$Factory$Impl) instanceFactory6.value;
                AccountSwitcherPresenter$Factory$Impl accountSwitcherPresenter$Factory$Impl = (AccountSwitcherPresenter$Factory$Impl) instanceFactory5.value;
                AddAccountOptionsPresenter$Factory$Impl addAccountOptionsPresenter$Factory$Impl = (AddAccountOptionsPresenter$Factory$Impl) instanceFactory4.value;
                SwitchFullAccountLoadingPresenter$Factory$Impl switchFullAccountLoadingPresenter$Factory$Impl = (SwitchFullAccountLoadingPresenter$Factory$Impl) instanceFactory3.value;
                AccountsLoadingFailedPresenter$Factory$Impl accountsLoadingFailedPresenter$Factory$Impl = (AccountsLoadingFailedPresenter$Factory$Impl) instanceFactory2.value;
                ThemeSwitcherPresenter$Factory$Impl themeSwitcherPresenter$Factory$Impl = (ThemeSwitcherPresenter$Factory$Impl) instanceFactory.value;
                accountPresenter$Factory$Impl.getClass();
                editProfilePresenter$Factory$Impl.getClass();
                businessInfoPresenter$Factory$Impl.getClass();
                accountSwitcherPresenter$Factory$Impl.getClass();
                addAccountOptionsPresenter$Factory$Impl.getClass();
                switchFullAccountLoadingPresenter$Factory$Impl.getClass();
                accountsLoadingFailedPresenter$Factory$Impl.getClass();
                themeSwitcherPresenter$Factory$Impl.getClass();
                return new PoolsPresenterFactory(accountPresenter$Factory$Impl, editProfilePresenter$Factory$Impl, businessInfoPresenter$Factory$Impl, accountSwitcherPresenter$Factory$Impl, addAccountOptionsPresenter$Factory$Impl, switchFullAccountLoadingPresenter$Factory$Impl, accountsLoadingFailedPresenter$Factory$Impl, themeSwitcherPresenter$Factory$Impl);
            case 1:
                StocksControlPresenter$Factory$Impl stocksControlPresenter$Factory$Impl = (StocksControlPresenter$Factory$Impl) instanceFactory8.value;
                BitcoinControlPresenter$Factory$Impl bitcoinControlPresenter$Factory$Impl = (BitcoinControlPresenter$Factory$Impl) instanceFactory7.value;
                CashCardControlPresenter$Factory$Impl cashCardControlPresenter$Factory$Impl = (CashCardControlPresenter$Factory$Impl) instanceFactory6.value;
                P2PControlPresenter$Factory$Impl p2PControlPresenter$Factory$Impl = (P2PControlPresenter$Factory$Impl) instanceFactory5.value;
                NotificationsControlPresenter$Factory$Impl notificationsControlPresenter$Factory$Impl = (NotificationsControlPresenter$Factory$Impl) instanceFactory4.value;
                PromotionsControlPresenter$Factory$Impl promotionsControlPresenter$Factory$Impl = (PromotionsControlPresenter$Factory$Impl) instanceFactory3.value;
                ApprovedContactsControlPresenter$Factory$Impl approvedContactsControlPresenter$Factory$Impl = (ApprovedContactsControlPresenter$Factory$Impl) instanceFactory2.value;
                ManagedAccountControlPresenter$Factory$Impl managedAccountControlPresenter$Factory$Impl = (ManagedAccountControlPresenter$Factory$Impl) instanceFactory.value;
                stocksControlPresenter$Factory$Impl.getClass();
                bitcoinControlPresenter$Factory$Impl.getClass();
                cashCardControlPresenter$Factory$Impl.getClass();
                p2PControlPresenter$Factory$Impl.getClass();
                notificationsControlPresenter$Factory$Impl.getClass();
                promotionsControlPresenter$Factory$Impl.getClass();
                approvedContactsControlPresenter$Factory$Impl.getClass();
                managedAccountControlPresenter$Factory$Impl.getClass();
                return new ImageLoader$Builder(stocksControlPresenter$Factory$Impl, bitcoinControlPresenter$Factory$Impl, cashCardControlPresenter$Factory$Impl, p2PControlPresenter$Factory$Impl, notificationsControlPresenter$Factory$Impl, promotionsControlPresenter$Factory$Impl, approvedContactsControlPresenter$Factory$Impl, managedAccountControlPresenter$Factory$Impl);
            case 2:
                ShoppingWebPresenter$Factory$Impl shoppingWebPresenter$Factory$Impl = (ShoppingWebPresenter$Factory$Impl) instanceFactory8.value;
                ShoppingInfoSheetPresenter$Factory$Impl shoppingInfoSheetPresenter$Factory$Impl = (ShoppingInfoSheetPresenter$Factory$Impl) instanceFactory7.value;
                BrandsSearchPresenter$Factory$Impl brandsSearchPresenter$Factory$Impl = (BrandsSearchPresenter$Factory$Impl) instanceFactory6.value;
                ProductSearchPresenter$Factory$Impl productSearchPresenter$Factory$Impl = (ProductSearchPresenter$Factory$Impl) instanceFactory5.value;
                CashAppPayIncentiveSilentAuthErrorDialogPresenter$Factory$Impl cashAppPayIncentiveSilentAuthErrorDialogPresenter$Factory$Impl = (CashAppPayIncentiveSilentAuthErrorDialogPresenter$Factory$Impl) instanceFactory4.value;
                CashAppPayIncentiveSheetPresenter$Factory$Impl cashAppPayIncentiveSheetPresenter$Factory$Impl = (CashAppPayIncentiveSheetPresenter$Factory$Impl) instanceFactory3.value;
                RestrictedItemWarningSheetPresenter$Factory$Impl restrictedItemWarningSheetPresenter$Factory$Impl = (RestrictedItemWarningSheetPresenter$Factory$Impl) instanceFactory2.value;
                SingleUsePaymentCancelPlanDialogPresenter$Factory$Impl singleUsePaymentCancelPlanDialogPresenter$Factory$Impl = (SingleUsePaymentCancelPlanDialogPresenter$Factory$Impl) instanceFactory.value;
                shoppingWebPresenter$Factory$Impl.getClass();
                shoppingInfoSheetPresenter$Factory$Impl.getClass();
                brandsSearchPresenter$Factory$Impl.getClass();
                productSearchPresenter$Factory$Impl.getClass();
                cashAppPayIncentiveSilentAuthErrorDialogPresenter$Factory$Impl.getClass();
                cashAppPayIncentiveSheetPresenter$Factory$Impl.getClass();
                restrictedItemWarningSheetPresenter$Factory$Impl.getClass();
                singleUsePaymentCancelPlanDialogPresenter$Factory$Impl.getClass();
                return new ShoppingPresenterFactory(shoppingWebPresenter$Factory$Impl, shoppingInfoSheetPresenter$Factory$Impl, brandsSearchPresenter$Factory$Impl, productSearchPresenter$Factory$Impl, cashAppPayIncentiveSilentAuthErrorDialogPresenter$Factory$Impl, cashAppPayIncentiveSheetPresenter$Factory$Impl, restrictedItemWarningSheetPresenter$Factory$Impl, singleUsePaymentCancelPlanDialogPresenter$Factory$Impl);
            default:
                final TapToPayPaymentPresenter$Factory$Impl tapToPayPaymentPresenter$Factory$Impl = (TapToPayPaymentPresenter$Factory$Impl) instanceFactory8.value;
                final TapToPayPaymentRequestPresenter$Factory$Impl tapToPayPaymentRequestPresenter$Factory$Impl = (TapToPayPaymentRequestPresenter$Factory$Impl) instanceFactory7.value;
                final TapToPayPresenter$Factory$Impl tapToPayPresenter$Factory$Impl = (TapToPayPresenter$Factory$Impl) instanceFactory6.value;
                final TapToPayInitiatorNotesPresenter$Factory$Impl tapToPayInitiatorNotesPresenter$Factory$Impl = (TapToPayInitiatorNotesPresenter$Factory$Impl) instanceFactory5.value;
                final TapToPayErrorPresenter$Factory$Impl tapToPayErrorPresenter$Factory$Impl = (TapToPayErrorPresenter$Factory$Impl) instanceFactory4.value;
                final TapToPayErrorDialogPresenter$Factory$Impl tapToPayErrorDialogPresenter$Factory$Impl = (TapToPayErrorDialogPresenter$Factory$Impl) instanceFactory3.value;
                final TapToPayFirstTimeScreenPresenter$Factory$Impl tapToPayFirstTimeScreenPresenter$Factory$Impl = (TapToPayFirstTimeScreenPresenter$Factory$Impl) instanceFactory2.value;
                final TapToPayOnboardingCompletePresenter$Factory$Impl tapToPayOnboardingCompletePresenter$Factory$Impl = (TapToPayOnboardingCompletePresenter$Factory$Impl) instanceFactory.value;
                tapToPayPaymentPresenter$Factory$Impl.getClass();
                tapToPayPaymentRequestPresenter$Factory$Impl.getClass();
                tapToPayPresenter$Factory$Impl.getClass();
                tapToPayInitiatorNotesPresenter$Factory$Impl.getClass();
                tapToPayErrorPresenter$Factory$Impl.getClass();
                tapToPayErrorDialogPresenter$Factory$Impl.getClass();
                tapToPayFirstTimeScreenPresenter$Factory$Impl.getClass();
                tapToPayOnboardingCompletePresenter$Factory$Impl.getClass();
                return new PresenterFactory() { // from class: com.squareup.cash.taptopay.presenters.TapToPayPresenterModule$Companion$$ExternalSyntheticLambda0
                    @Override // app.cash.broadway.presenter.PresenterFactory
                    public final Presenter create(Screen screen, BetterNavigator.ScreenNavigator screenNavigator) {
                        screen.getClass();
                        if (screen instanceof TapToPayScreen) {
                            OffersHomePresenter.MetroFactory metroFactory = TapToPayPresenter$Factory$Impl.this.delegateFactory;
                            RealDeviceIntegrityAttester realDeviceIntegrityAttester = (RealDeviceIntegrityAttester) metroFactory.offersTabRefresher.invoke();
                            ErrorReporter errorReporter = (ErrorReporter) metroFactory.stringManager.lambda.invoke();
                            FlowStarter flowStarter = (FlowStarter) metroFactory.offersTabRepository.getValue();
                            RealHieroglyphKeyProvider realHieroglyphKeyProvider = (RealHieroglyphKeyProvider) metroFactory.launcher.invoke();
                            RealProfileManager realProfileManager = (RealProfileManager) ((DelegateFactory) metroFactory.clientRouteParser).invoke();
                            SessionManager sessionManager = (SessionManager) metroFactory.clock.lambda.invoke();
                            RealTapToPayActionManager realTapToPayActionManager = (RealTapToPayActionManager) metroFactory.spanManager.invoke();
                            RealTapToPayAnalyticsHelper realTapToPayAnalyticsHelper = (RealTapToPayAnalyticsHelper) metroFactory.clientSyncer.invoke();
                            RealTapToPayErrorReporter realTapToPayErrorReporter = (RealTapToPayErrorReporter) metroFactory.routerFactory.invoke();
                            RealTapToPayRepository realTapToPayRepository = (RealTapToPayRepository) metroFactory.analyticsFactory.invoke();
                            RealTapToPayEligibilityProvider realTapToPayEligibilityProvider = (RealTapToPayEligibilityProvider) metroFactory.boostRepository.invoke();
                            RealTapToPaySessionManager realTapToPaySessionManager = (RealTapToPaySessionManager) metroFactory.pendingAppMessages.invoke();
                            RealUuidGenerator realUuidGenerator = (RealUuidGenerator) ((LambdaProvider) metroFactory.offersPopupMessageDismisser).lambda.invoke();
                            RealMRIFactory realMRIFactory = (RealMRIFactory) metroFactory.analyticsHelper.getValue();
                            RealScreenRecordingDetector realScreenRecordingDetector = (RealScreenRecordingDetector) ((InstanceFactory) metroFactory.offersSearchPresenterFactory).value;
                            realDeviceIntegrityAttester.getClass();
                            errorReporter.getClass();
                            flowStarter.getClass();
                            realHieroglyphKeyProvider.getClass();
                            realProfileManager.getClass();
                            sessionManager.getClass();
                            realTapToPayActionManager.getClass();
                            realTapToPayAnalyticsHelper.getClass();
                            realTapToPayErrorReporter.getClass();
                            realTapToPayRepository.getClass();
                            realTapToPayEligibilityProvider.getClass();
                            realTapToPaySessionManager.getClass();
                            realUuidGenerator.getClass();
                            realMRIFactory.getClass();
                            realScreenRecordingDetector.getClass();
                            return MoleculePresenterKt.asPresenter$default(new TapToPayPresenter(realDeviceIntegrityAttester, errorReporter, flowStarter, realHieroglyphKeyProvider, realProfileManager, sessionManager, realTapToPayActionManager, realTapToPayAnalyticsHelper, realTapToPayErrorReporter, realTapToPayRepository, realTapToPayEligibilityProvider, realTapToPaySessionManager, realUuidGenerator, realMRIFactory, screenNavigator, (TapToPayScreen) screen, realScreenRecordingDetector));
                        }
                        if (screen instanceof TapToPayPaymentScreen) {
                            DeviceBuildInfo deviceBuildInfo = tapToPayPaymentPresenter$Factory$Impl.delegateFactory;
                            zzai zzaiVar = (zzai) ((RealBrazeManager.MetroFactory) deviceBuildInfo.manufacturer).invoke();
                            RealCashVibrator realCashVibrator = (RealCashVibrator) ((LambdaProvider) deviceBuildInfo.model).lambda.invoke();
                            RealDeviceOrientationProvider realDeviceOrientationProvider = (RealDeviceOrientationProvider) ((Provider) deviceBuildInfo.osVersion).invoke();
                            LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) ((Provider) deviceBuildInfo.osBuild).invoke();
                            SessionManager sessionManager2 = (SessionManager) ((LambdaProvider) deviceBuildInfo.fingerprint).lambda.invoke();
                            RealTagCommunication$Factory$Impl realTagCommunication$Factory$Impl = (RealTagCommunication$Factory$Impl) ((InstanceFactory) deviceBuildInfo.tags).value;
                            RealTapToPayAnalyticsHelper realTapToPayAnalyticsHelper2 = (RealTapToPayAnalyticsHelper) ((Provider) deviceBuildInfo.brand).invoke();
                            RealTapToPayErrorReporter realTapToPayErrorReporter2 = (RealTapToPayErrorReporter) ((Provider) deviceBuildInfo.apiLevel).invoke();
                            RealTapToPaySessionManager realTapToPaySessionManager2 = (RealTapToPaySessionManager) ((Provider) deviceBuildInfo.cpuAbis).invoke();
                            realCashVibrator.getClass();
                            realDeviceOrientationProvider.getClass();
                            factory.getClass();
                            sessionManager2.getClass();
                            realTagCommunication$Factory$Impl.getClass();
                            realTapToPayAnalyticsHelper2.getClass();
                            realTapToPayErrorReporter2.getClass();
                            realTapToPaySessionManager2.getClass();
                            return MoleculePresenterKt.asPresenter$default(new CardLockPresenter(zzaiVar, realCashVibrator, realDeviceOrientationProvider, factory, sessionManager2, realTagCommunication$Factory$Impl, realTapToPayAnalyticsHelper2, realTapToPayErrorReporter2, realTapToPaySessionManager2, screenNavigator, (TapToPayPaymentScreen) screen));
                        }
                        if (screen instanceof TapToPayPaymentRequestScreen) {
                            TapToPayPaymentRequestPresenter$MetroFactory tapToPayPaymentRequestPresenter$MetroFactory = tapToPayPaymentRequestPresenter$Factory$Impl.delegateFactory;
                            RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) tapToPayPaymentRequestPresenter$MetroFactory.routerFactory.invoke();
                            RealClientRouteParser realClientRouteParser = (RealClientRouteParser) tapToPayPaymentRequestPresenter$MetroFactory.clientRouteParser.getValue();
                            LocalizedMoneyFormatter.Factory factory2 = (LocalizedMoneyFormatter.Factory) tapToPayPaymentRequestPresenter$MetroFactory.moneyFormatterFactory.invoke();
                            RealTapToPayAnalyticsHelper realTapToPayAnalyticsHelper3 = (RealTapToPayAnalyticsHelper) tapToPayPaymentRequestPresenter$MetroFactory.tapToPayAnalyticsHelper.invoke();
                            RealTapToPayRepository realTapToPayRepository2 = (RealTapToPayRepository) tapToPayPaymentRequestPresenter$MetroFactory.tapToPayRepository.invoke();
                            realRouter$Factory$Impl.getClass();
                            realClientRouteParser.getClass();
                            factory2.getClass();
                            realTapToPayAnalyticsHelper3.getClass();
                            realTapToPayRepository2.getClass();
                            return MoleculePresenterKt.asPresenter$default(new LocalEditorialPresenter(realRouter$Factory$Impl, realClientRouteParser, factory2, realTapToPayAnalyticsHelper3, realTapToPayRepository2, screenNavigator, (TapToPayPaymentRequestScreen) screen));
                        }
                        if (screen instanceof TapToPayInitiatorNotesScreen) {
                            RealFamilyNavigator$MetroFactory realFamilyNavigator$MetroFactory = tapToPayInitiatorNotesPresenter$Factory$Impl.delegateFactory;
                            RealTapToPayAnalyticsHelper realTapToPayAnalyticsHelper4 = (RealTapToPayAnalyticsHelper) realFamilyNavigator$MetroFactory.analytics.invoke();
                            RealTapToPayRepository realTapToPayRepository3 = (RealTapToPayRepository) realFamilyNavigator$MetroFactory.sessionManager.invoke();
                            RealTapToPaySessionManager realTapToPaySessionManager3 = (RealTapToPaySessionManager) realFamilyNavigator$MetroFactory.supportNavigator.invoke();
                            KeyValue keyValue = (KeyValue) realFamilyNavigator$MetroFactory.stringManager.invoke();
                            realTapToPayAnalyticsHelper4.getClass();
                            realTapToPayRepository3.getClass();
                            realTapToPaySessionManager3.getClass();
                            keyValue.getClass();
                            return MoleculePresenterKt.asPresenter$default(new WorkHomePresenter(realTapToPayAnalyticsHelper4, realTapToPayRepository3, realTapToPaySessionManager3, keyValue, screenNavigator, 22));
                        }
                        if (screen instanceof TapToPayErrorScreen) {
                            RealTapToPayAnalyticsHelper realTapToPayAnalyticsHelper5 = (RealTapToPayAnalyticsHelper) tapToPayErrorPresenter$Factory$Impl.delegateFactory.analyticsHelper.invoke();
                            realTapToPayAnalyticsHelper5.getClass();
                            return MoleculePresenterKt.asPresenter$default(new InviteErrorPresenter(realTapToPayAnalyticsHelper5, screenNavigator, (TapToPayErrorScreen) screen));
                        }
                        if (screen instanceof TapToPayErrorDialogScreen) {
                            RealYouPresenter$MetroFactory realYouPresenter$MetroFactory = tapToPayErrorDialogPresenter$Factory$Impl.delegateFactory;
                            RealTapToPayAnalyticsHelper realTapToPayAnalyticsHelper6 = (RealTapToPayAnalyticsHelper) realYouPresenter$MetroFactory.assignedJobProvider.invoke();
                            IntentLauncher intentLauncher = (IntentLauncher) realYouPresenter$MetroFactory.assignedLocationProvider.invoke();
                            RealSupportNavigator realSupportNavigator = (RealSupportNavigator) realYouPresenter$MetroFactory.passcodeProvider.invoke();
                            realTapToPayAnalyticsHelper6.getClass();
                            intentLauncher.getClass();
                            realSupportNavigator.getClass();
                            return MoleculePresenterKt.asPresenter$default(new WorkHomePresenter(realTapToPayAnalyticsHelper6, intentLauncher, realSupportNavigator, screenNavigator, (TapToPayErrorDialogScreen) screen));
                        }
                        if (!(screen instanceof TapToPayFirstTimeScreen)) {
                            if (!(screen instanceof TapToPayOnboardingCompleteScreen)) {
                                return null;
                            }
                            RealTapToPaySessionManager realTapToPaySessionManager4 = (RealTapToPaySessionManager) tapToPayOnboardingCompletePresenter$Factory$Impl.delegateFactory.sandboxer.invoke();
                            realTapToPaySessionManager4.getClass();
                            return MoleculePresenterKt.asPresenter$default(new ErrorPresenter(realTapToPaySessionManager4, screenNavigator, 17));
                        }
                        ProfileCropView.MetroFactory metroFactory2 = tapToPayFirstTimeScreenPresenter$Factory$Impl.delegateFactory;
                        RealTapToPayAnalyticsHelper realTapToPayAnalyticsHelper7 = (RealTapToPayAnalyticsHelper) metroFactory2.imageLoader.invoke();
                        KeyValue keyValue2 = (KeyValue) metroFactory2.cropResultManager.invoke();
                        realTapToPayAnalyticsHelper7.getClass();
                        keyValue2.getClass();
                        return MoleculePresenterKt.asPresenter$default(new TaxReturnsPresenter(realTapToPayAnalyticsHelper7, keyValue2, screenNavigator, (TapToPayFirstTimeScreen) screen));
                    }
                };
        }
    }
}
