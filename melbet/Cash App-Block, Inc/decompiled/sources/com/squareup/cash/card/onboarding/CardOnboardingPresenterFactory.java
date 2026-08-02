package com.squareup.cash.card.onboarding;

import app.cash.broadway.presenter.Presenter;
import app.cash.broadway.presenter.PresenterFactory;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt;
import app.cash.broadway.screen.Screen;
import app.cash.passcode.presenters.EndAppLockPresenter;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.blockers.presenters.ErrorPresenter;
import com.squareup.cash.boost.db.Reward$Adapter;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.card.onboarding.screens.CardPreviewScreen;
import com.squareup.cash.card.onboarding.screens.CardStudioExitDialogScreen;
import com.squareup.cash.card.onboarding.screens.CardStudioMoreSheetScreen;
import com.squareup.cash.card.onboarding.screens.CardStudioScreen;
import com.squareup.cash.card.onboarding.screens.CardStudioUndoDialogScreen;
import com.squareup.cash.card.onboarding.screens.CardStyleScreen;
import com.squareup.cash.card.onboarding.screens.DisclosureExitConfirmationScreen;
import com.squareup.cash.card.onboarding.screens.DisclosureScreen;
import com.squareup.cash.card.onboarding.screens.PatternSignatureStamps;
import com.squareup.cash.card.onboarding.screens.PatternSignatureStampsV2;
import com.squareup.cash.card.onboarding.screens.PaymentDeviceCustomizationScreen;
import com.squareup.cash.card.onboarding.screens.TagOrderConfirmationScreen;
import com.squareup.cash.cashapplite.cashin.RealLiteCashInRepo$MetroFactory;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.profile.Profile;
import com.squareup.cash.device.RealDeviceOrientationProvider;
import com.squareup.cash.featureflags.AmplitudeExperiments$CardStudioPortraitMode;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.filament.RealFilamentSupportProvider;
import com.squareup.cash.graphics.swampgl.RealGraphicsSupportProvider;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.nfc.backend.real.RealNfcPaymentsManager;
import com.squareup.cash.offers.presenters.OffersHomePresenter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.protos.franklin.app.AppService;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DelegateFactory;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class CardOnboardingPresenterFactory implements PresenterFactory {
    public final CardPreviewPresenter$Factory$Impl cardPreview;
    public final CardStudioPresenter$Factory$Impl cardStudio;
    public final CardStudioExitDialogPresenter$Factory$Impl cardStudioExitDialog;
    public final CardStudioUndoDialogPresenter$Factory$Impl cardStudioUndoDialog;
    public final CardStudioPresenterV2$Factory$Impl cardStudioV2;
    public final CardStylePickerPresenter$Factory$Impl cardStyle;
    public final DisclosurePresenter$Factory$Impl disclosure;
    public final FeatureFlagManager featureFlagManager;
    public final PaymentDeviceCustomizationPresenter$Factory$Impl paymentDeviceCustomization;
    public final StampSheetPresenter$Factory$Impl stampSheet;
    public final StampSheetPresenterV2$Factory$Impl stampSheetV2;
    public final TagOrderConfirmationPresenter$Factory$Impl tagOrderConfirmation;

    public CardOnboardingPresenterFactory(StampSheetPresenter$Factory$Impl stampSheetPresenter$Factory$Impl, StampSheetPresenterV2$Factory$Impl stampSheetPresenterV2$Factory$Impl, CardStylePickerPresenter$Factory$Impl cardStylePickerPresenter$Factory$Impl, DisclosurePresenter$Factory$Impl disclosurePresenter$Factory$Impl, CardPreviewPresenter$Factory$Impl cardPreviewPresenter$Factory$Impl, CardStudioExitDialogPresenter$Factory$Impl cardStudioExitDialogPresenter$Factory$Impl, CardStudioMoreSheetPresenter$Factory$Impl cardStudioMoreSheetPresenter$Factory$Impl, CardStudioUndoDialogPresenter$Factory$Impl cardStudioUndoDialogPresenter$Factory$Impl, CardStudioPresenter$Factory$Impl cardStudioPresenter$Factory$Impl, CardStudioPresenterV2$Factory$Impl cardStudioPresenterV2$Factory$Impl, ConfirmExitDisclosurePresenter$Factory$Impl confirmExitDisclosurePresenter$Factory$Impl, TagOrderConfirmationPresenter$Factory$Impl tagOrderConfirmationPresenter$Factory$Impl, PaymentDeviceCustomizationPresenter$Factory$Impl paymentDeviceCustomizationPresenter$Factory$Impl, FeatureFlagManager featureFlagManager) {
        this.stampSheet = stampSheetPresenter$Factory$Impl;
        this.stampSheetV2 = stampSheetPresenterV2$Factory$Impl;
        this.cardStyle = cardStylePickerPresenter$Factory$Impl;
        this.disclosure = disclosurePresenter$Factory$Impl;
        this.cardPreview = cardPreviewPresenter$Factory$Impl;
        this.cardStudioExitDialog = cardStudioExitDialogPresenter$Factory$Impl;
        this.cardStudioUndoDialog = cardStudioUndoDialogPresenter$Factory$Impl;
        this.cardStudio = cardStudioPresenter$Factory$Impl;
        this.cardStudioV2 = cardStudioPresenterV2$Factory$Impl;
        this.tagOrderConfirmation = tagOrderConfirmationPresenter$Factory$Impl;
        this.paymentDeviceCustomization = paymentDeviceCustomizationPresenter$Factory$Impl;
        this.featureFlagManager = featureFlagManager;
    }

    @Override // app.cash.broadway.presenter.PresenterFactory
    public final Presenter create(Screen screen, BetterNavigator.ScreenNavigator screenNavigator) {
        screen.getClass();
        if (screen instanceof PatternSignatureStamps) {
            StampSheetPresenter$MetroFactory stampSheetPresenter$MetroFactory = this.stampSheet.delegateFactory;
            AppConfigManager appConfigManager = (AppConfigManager) stampSheetPresenter$MetroFactory.appConfig.getValue();
            CoroutineContext coroutineContext = (CoroutineContext) stampSheetPresenter$MetroFactory.ioContext.lambda.invoke();
            appConfigManager.getClass();
            coroutineContext.getClass();
            return MoleculePresenterKt.asPresenter$default(new MusicPresenter(appConfigManager, (PatternSignatureStamps) screen, screenNavigator, coroutineContext));
        }
        if (screen instanceof PatternSignatureStampsV2) {
            StampSheetPresenter$MetroFactory stampSheetPresenter$MetroFactory2 = this.stampSheetV2.delegateFactory;
            AppConfigManager appConfigManager2 = (AppConfigManager) stampSheetPresenter$MetroFactory2.appConfig.getValue();
            CoroutineContext coroutineContext2 = (CoroutineContext) stampSheetPresenter$MetroFactory2.ioContext.lambda.invoke();
            appConfigManager2.getClass();
            coroutineContext2.getClass();
            return MoleculePresenterKt.asPresenter$default(new MusicPresenter(appConfigManager2, (PatternSignatureStampsV2) screen, screenNavigator, coroutineContext2));
        }
        if (screen instanceof CardStyleScreen) {
            Reward$Adapter reward$Adapter = this.cardStyle.delegateFactory;
            RealProfileManager realProfileManager = (RealProfileManager) ((DelegateFactory) reward$Adapter.avatarsAdapter).invoke();
            Analytics analytics = (Analytics) ((DoubleCheck) reward$Adapter.reward_selection_stateAdapter).getValue();
            BlockerFlowListener blockerFlowListener = (BlockerFlowListener) ((Provider) reward$Adapter.boost_detail_bottom_upsellAdapter).invoke();
            AppConfigManager appConfigManager3 = (AppConfigManager) ((DoubleCheck) reward$Adapter.app_linksAdapter).getValue();
            CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) ((DoubleCheck) reward$Adapter.program_detail_rowsAdapter).getValue();
            RealFilamentSupportProvider realFilamentSupportProvider = (RealFilamentSupportProvider) ((Provider) reward$Adapter.boost_detail_rowsAdapter).invoke();
            CoroutineContext coroutineContext3 = (CoroutineContext) ((LambdaProvider) reward$Adapter.boost_attributesAdapter).lambda.invoke();
            realProfileManager.getClass();
            analytics.getClass();
            blockerFlowListener.getClass();
            appConfigManager3.getClass();
            cashAccountDatabaseImpl.getClass();
            realFilamentSupportProvider.getClass();
            coroutineContext3.getClass();
            return MoleculePresenterKt.asPresenter$default(new CardStylePickerPresenter((CardStyleScreen) screen, screenNavigator, realProfileManager, analytics, blockerFlowListener, appConfigManager3, cashAccountDatabaseImpl, realFilamentSupportProvider, coroutineContext3));
        }
        if (screen instanceof DisclosureScreen) {
            DisclosurePresenter.MetroFactory metroFactory = this.disclosure.delegateFactory;
            Analytics analytics2 = (Analytics) metroFactory.analytics.getValue();
            AppService appService = (AppService) metroFactory.appService.getValue();
            BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) metroFactory.blockersNavigator.invoke();
            AndroidStringManager androidStringManager = (AndroidStringManager) metroFactory.stringManager.lambda.invoke();
            IntentLauncher intentLauncher = (IntentLauncher) metroFactory.launcher.invoke();
            analytics2.getClass();
            appService.getClass();
            blockersDataNavigator.getClass();
            androidStringManager.getClass();
            intentLauncher.getClass();
            return MoleculePresenterKt.asPresenter$default(new DisclosurePresenter(analytics2, appService, blockersDataNavigator, androidStringManager, intentLauncher, (DisclosureScreen) screen, screenNavigator));
        }
        if (screen instanceof CardPreviewScreen) {
            Profile.Adapter adapter = this.cardPreview.delegateFactory;
            CoroutineContext coroutineContext4 = (CoroutineContext) ((LambdaProvider) adapter.nearby_visibilityAdapter).lambda.invoke();
            RealProfileManager realProfileManager2 = (RealProfileManager) ((DelegateFactory) adapter.rate_planAdapter).invoke();
            AppConfigManager appConfigManager4 = (AppConfigManager) ((DoubleCheck) adapter.deposit_preferenceAdapter).getValue();
            AppService appService2 = (AppService) ((DoubleCheck) adapter.country_codeAdapter).getValue();
            Analytics analytics3 = (Analytics) ((DoubleCheck) adapter.default_currencyAdapter).getValue();
            BlockerFlowListener blockerFlowListener2 = (BlockerFlowListener) ((Provider) adapter.incoming_request_policyAdapter).invoke();
            AndroidStringManager androidStringManager2 = (AndroidStringManager) ((LambdaProvider) adapter.regionAdapter).lambda.invoke();
            BlockersDataNavigator blockersDataNavigator2 = (BlockersDataNavigator) ((Provider) adapter.bitcoin_display_unitsAdapter).invoke();
            RealCardDetailsCreator realCardDetailsCreator = (RealCardDetailsCreator) ((Provider) adapter.bitcoin_amount_entry_currency_preferenceAdapter).invoke();
            FeatureFlagManager featureFlagManager = (FeatureFlagManager) ((DoubleCheck) adapter.addressAdapter).getValue();
            RealFilamentSupportProvider realFilamentSupportProvider2 = (RealFilamentSupportProvider) ((Provider) adapter.deposit_preference_dataAdapter).invoke();
            CashAccountDatabaseImpl cashAccountDatabaseImpl2 = (CashAccountDatabaseImpl) ((DoubleCheck) adapter.available_p2p_target_regionsAdapter).getValue();
            coroutineContext4.getClass();
            realProfileManager2.getClass();
            appConfigManager4.getClass();
            appService2.getClass();
            analytics3.getClass();
            blockerFlowListener2.getClass();
            androidStringManager2.getClass();
            blockersDataNavigator2.getClass();
            realCardDetailsCreator.getClass();
            featureFlagManager.getClass();
            realFilamentSupportProvider2.getClass();
            cashAccountDatabaseImpl2.getClass();
            return MoleculePresenterKt.asPresenter$default(new CardPreviewPresenter((CardPreviewScreen) screen, screenNavigator, coroutineContext4, realProfileManager2, appConfigManager4, appService2, analytics3, blockerFlowListener2, androidStringManager2, blockersDataNavigator2, realCardDetailsCreator, featureFlagManager, realFilamentSupportProvider2, cashAccountDatabaseImpl2));
        }
        if (screen instanceof CardStudioScreen) {
            if (((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) this.featureFlagManager).currentValue(AmplitudeExperiments$CardStudioPortraitMode.INSTANCE)).enabled()) {
                CardStudioPresenterV2$MetroFactory cardStudioPresenterV2$MetroFactory = this.cardStudioV2.delegateFactory;
                CoroutineContext coroutineContext5 = (CoroutineContext) cardStudioPresenterV2$MetroFactory.ioContext.lambda.invoke();
                CashAccountDatabaseImpl cashAccountDatabaseImpl3 = (CashAccountDatabaseImpl) cardStudioPresenterV2$MetroFactory.cashDatabase.getValue();
                RealDeviceOrientationProvider realDeviceOrientationProvider = (RealDeviceOrientationProvider) cardStudioPresenterV2$MetroFactory.deviceOrientationProvider.invoke();
                AppConfigManager appConfigManager5 = (AppConfigManager) cardStudioPresenterV2$MetroFactory.appConfig.getValue();
                coroutineContext5.getClass();
                cashAccountDatabaseImpl3.getClass();
                realDeviceOrientationProvider.getClass();
                appConfigManager5.getClass();
                return MoleculePresenterKt.asPresenter$default(new CardStudioPresenter((CardStudioScreen) screen, screenNavigator, coroutineContext5, cashAccountDatabaseImpl3, realDeviceOrientationProvider, appConfigManager5));
            }
            CardStudioPresenter.MetroFactory metroFactory2 = this.cardStudio.delegateFactory;
            CoroutineContext coroutineContext6 = (CoroutineContext) metroFactory2.ioContext.lambda.invoke();
            Analytics analytics4 = (Analytics) metroFactory2.analytics.getValue();
            AppConfigManager appConfigManager6 = (AppConfigManager) metroFactory2.appConfig.getValue();
            CashAccountDatabaseImpl cashAccountDatabaseImpl4 = (CashAccountDatabaseImpl) metroFactory2.cashDatabase.getValue();
            coroutineContext6.getClass();
            analytics4.getClass();
            appConfigManager6.getClass();
            cashAccountDatabaseImpl4.getClass();
            return MoleculePresenterKt.asPresenter$default(new CardStudioPresenter((CardStudioScreen) screen, screenNavigator, coroutineContext6, analytics4, appConfigManager6, cashAccountDatabaseImpl4));
        }
        if (screen instanceof CardStudioExitDialogScreen) {
            AndroidStringManager androidStringManager3 = (AndroidStringManager) this.cardStudioExitDialog.delegateFactory.stringManager.lambda.invoke();
            androidStringManager3.getClass();
            return MoleculePresenterKt.asPresenter$default(new EndAppLockPresenter(androidStringManager3, (CardStudioExitDialogScreen) screen, screenNavigator));
        }
        if (screen instanceof CardStudioMoreSheetScreen) {
            return MoleculePresenterKt.asPresenter$default(new ErrorPresenter((CardStudioMoreSheetScreen) screen, screenNavigator));
        }
        if (screen instanceof CardStudioUndoDialogScreen) {
            AndroidStringManager androidStringManager4 = (AndroidStringManager) this.cardStudioUndoDialog.delegateFactory.stringManager.lambda.invoke();
            androidStringManager4.getClass();
            return MoleculePresenterKt.asPresenter$default(new CardStudioUndoDialogPresenter(androidStringManager4, screenNavigator, 0));
        }
        if (screen instanceof DisclosureExitConfirmationScreen) {
            return MoleculePresenterKt.asPresenter$default(new ErrorPresenter((DisclosureExitConfirmationScreen) screen, screenNavigator));
        }
        if (screen instanceof TagOrderConfirmationScreen) {
            CardStudioPresenter.MetroFactory metroFactory3 = this.tagOrderConfirmation.delegateFactory;
            AppService appService3 = (AppService) metroFactory3.analytics.getValue();
            Analytics analytics5 = (Analytics) metroFactory3.appConfig.getValue();
            AndroidStringManager androidStringManager5 = (AndroidStringManager) metroFactory3.ioContext.lambda.invoke();
            SyncValueReader syncValueReader = (SyncValueReader) metroFactory3.cashDatabase.getValue();
            appService3.getClass();
            analytics5.getClass();
            androidStringManager5.getClass();
            syncValueReader.getClass();
            return MoleculePresenterKt.asPresenter$default(new TagOrderConfirmationPresenter((TagOrderConfirmationScreen) screen, screenNavigator, appService3, analytics5, androidStringManager5, syncValueReader));
        }
        if (!(screen instanceof PaymentDeviceCustomizationScreen)) {
            return null;
        }
        OffersHomePresenter.MetroFactory metroFactory4 = this.paymentDeviceCustomization.delegateFactory;
        AppService appService4 = (AppService) metroFactory4.offersTabRepository.getValue();
        Analytics analytics6 = (Analytics) metroFactory4.analyticsHelper.getValue();
        BlockersDataNavigator blockersDataNavigator3 = (BlockersDataNavigator) metroFactory4.offersTabRefresher.invoke();
        SyncValueReader syncValueReader2 = (SyncValueReader) ((DoubleCheck) metroFactory4.clientRouteParser).getValue();
        AndroidStringManager androidStringManager6 = (AndroidStringManager) metroFactory4.stringManager.lambda.invoke();
        CashAccountDatabaseImpl cashAccountDatabaseImpl5 = (CashAccountDatabaseImpl) ((DoubleCheck) metroFactory4.boostRepository).getValue();
        AppConfigManager appConfigManager7 = (AppConfigManager) ((DoubleCheck) metroFactory4.pendingAppMessages).getValue();
        RealCardDetailsCreator realCardDetailsCreator2 = (RealCardDetailsCreator) metroFactory4.launcher.invoke();
        RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) metroFactory4.spanManager.invoke();
        RealGraphicsSupportProvider realGraphicsSupportProvider = (RealGraphicsSupportProvider) ((RealLiteCashInRepo$MetroFactory) metroFactory4.offersPopupMessageDismisser).invoke();
        SessionManager sessionManager = (SessionManager) metroFactory4.clock.lambda.invoke();
        PdpNotifiedPreference pdpNotifiedPreference = (PdpNotifiedPreference) metroFactory4.clientSyncer.invoke();
        RealNfcPaymentsManager realNfcPaymentsManager = (RealNfcPaymentsManager) metroFactory4.routerFactory.invoke();
        CoroutineContext coroutineContext7 = (CoroutineContext) ((LambdaProvider) metroFactory4.analyticsFactory).lambda.invoke();
        CoroutineScope coroutineScope = (CoroutineScope) ((InstanceFactory) metroFactory4.offersSearchPresenterFactory).value;
        appService4.getClass();
        analytics6.getClass();
        blockersDataNavigator3.getClass();
        syncValueReader2.getClass();
        androidStringManager6.getClass();
        cashAccountDatabaseImpl5.getClass();
        appConfigManager7.getClass();
        realCardDetailsCreator2.getClass();
        realRouter$Factory$Impl.getClass();
        sessionManager.getClass();
        pdpNotifiedPreference.getClass();
        realNfcPaymentsManager.getClass();
        coroutineContext7.getClass();
        coroutineScope.getClass();
        return MoleculePresenterKt.asPresenter$default(new PaymentDeviceCustomizationPresenter((PaymentDeviceCustomizationScreen) screen, screenNavigator, appService4, analytics6, blockersDataNavigator3, syncValueReader2, androidStringManager6, cashAccountDatabaseImpl5, appConfigManager7, realCardDetailsCreator2, realRouter$Factory$Impl, realGraphicsSupportProvider, sessionManager, pdpNotifiedPreference, realNfcPaymentsManager, coroutineContext7, coroutineScope));
    }
}
