package com.squareup.cash.deposits.physical.presenter;

import androidx.compose.runtime.internal.RememberEventDispatcher;
import app.cash.broadway.presenter.Presenter;
import app.cash.broadway.presenter.PresenterFactory;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt;
import app.cash.broadway.screen.Screen;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.passcode.presenters.EndAppLockPresenter;
import coil3.ComponentRegistry;
import com.bugsnag.android.DeviceBuildInfo;
import com.google.mlkit.vision.common.zzb;
import com.google.mlkit.vision.text.internal.zzr;
import com.squareup.address.typeahead.backend.real.RealLocationSearchClient;
import com.squareup.cash.blockers.presenters.BlockerImageUploader$MetroFactory;
import com.squareup.cash.card.onboarding.CardStudioPresenterV2$MetroFactory;
import com.squareup.cash.cashapplite.cashin.RealLiteCashInRepo$MetroFactory;
import com.squareup.cash.checks.CheckDepositAmountPresenter;
import com.squareup.cash.checks.VerifyCheckDialogPresenter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clipboard.RealClipboardManager;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.deposits.physical.backend.real.barcode.RealCashDepositBarcodeManager;
import com.squareup.cash.deposits.physical.presenter.address.PhysicalDepositAddressEntryPresenter$Factory$Impl;
import com.squareup.cash.deposits.physical.presenter.atm.AtmWithdrawalExplainerPresenter;
import com.squareup.cash.deposits.physical.presenter.atm.AtmWithdrawalMapPresenter;
import com.squareup.cash.deposits.physical.presenter.atm.AtmWithdrawalMapPresenter$Factory$Impl;
import com.squareup.cash.deposits.physical.presenter.barcode.PaperMoneyDepositBarcodeExpiredPresenter;
import com.squareup.cash.deposits.physical.presenter.barcode.PaperMoneyDepositBarcodeExpiredPresenter$Factory$Impl;
import com.squareup.cash.deposits.physical.presenter.barcode.PaperMoneyDepositBarcodePresenter$Factory$Impl;
import com.squareup.cash.deposits.physical.presenter.details.AtmLocationDetailsPresenter$Factory$Impl;
import com.squareup.cash.deposits.physical.presenter.details.PaperMoneyDepositMerchantDetailsPresenter;
import com.squareup.cash.deposits.physical.presenter.details.PaperMoneyDepositMerchantDetailsPresenter$Factory$Impl;
import com.squareup.cash.deposits.physical.presenter.error.PhysicalDepositErrorDialogPresenter$Factory$Impl;
import com.squareup.cash.deposits.physical.presenter.location.LocationDeniedDialogPresenter$Factory$Impl;
import com.squareup.cash.deposits.physical.presenter.map.LimitReachedDialogPresenter;
import com.squareup.cash.deposits.physical.presenter.map.LimitReachedDialogPresenter$Factory$Impl;
import com.squareup.cash.deposits.physical.presenter.map.PaperMoneyDepositMapPresenter;
import com.squareup.cash.deposits.physical.presenter.map.PaperMoneyDepositMapPresenter$Factory$Impl;
import com.squareup.cash.deposits.physical.presenter.onboarding.PaperMoneyDepositOnboardingPresenter;
import com.squareup.cash.deposits.physical.presenter.onboarding.PaperMoneyDepositOnboardingPresenter$Factory$Impl;
import com.squareup.cash.deposits.physical.presenter.onboarding.SwipeToLoadOnboardingPresenter;
import com.squareup.cash.deposits.physical.presenter.onboarding.SwipeToLoadOnboardingPresenter$Factory$Impl;
import com.squareup.cash.deposits.physical.screens.AtmLocationDetailsScreen;
import com.squareup.cash.deposits.physical.screens.AtmPmdExplainerScreen;
import com.squareup.cash.deposits.physical.screens.AtmRetailerMapScreen;
import com.squareup.cash.deposits.physical.screens.AtmWithdrawalExplainerScreen;
import com.squareup.cash.deposits.physical.screens.LocationDeniedScreen;
import com.squareup.cash.deposits.physical.screens.PaperMoneyDepositBarcodeFailedScreen;
import com.squareup.cash.deposits.physical.screens.PaperMoneyDepositBarcodeScreen;
import com.squareup.cash.deposits.physical.screens.PaperMoneyDepositMapScreen;
import com.squareup.cash.deposits.physical.screens.PaperMoneyDepositMerchantDetailsScreen;
import com.squareup.cash.deposits.physical.screens.PaperMoneyDepositOnboardingScreen;
import com.squareup.cash.deposits.physical.screens.PhysicalCashDepositAddressEntryScreen;
import com.squareup.cash.deposits.physical.screens.PhysicalCashLimitReachedScreen;
import com.squareup.cash.deposits.physical.screens.PhysicalDepositErrorScreen;
import com.squareup.cash.deposits.physical.screens.SwipeToLoadOnboardingScreen;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.maps.presenter.CashMapPresenter$Factory$Impl;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.p2pblocking.presenters.SelectCustomerPresenter;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.savings.presenters.TransferringPresenter$MetroFactory;
import com.squareup.cash.tax.presenters.TaxTooltipPresenter$MetroFactory;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.preferences.BooleanPreference;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.franklin.api.RetailerMapBlocker;
import com.squareup.scannerview.SizeMap;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class PhysicalDepositPresenterFactory implements PresenterFactory {
    public final AtmLocationDetailsPresenter$Factory$Impl atmLocationDetailsPresenterFactory;
    public final AtmWithdrawalExplainerPresenter.Factory atmWithdrawalExplainerPresenterFactory;
    public final AtmWithdrawalMapPresenter$Factory$Impl atmWithdrawalMapPresenterFactory;
    public final PaperMoneyDepositBarcodeExpiredPresenter$Factory$Impl barcodeExpiredPresenterFactory;
    public final PaperMoneyDepositBarcodePresenter$Factory$Impl barcodeFactory;
    public final AtmPmdExplainerPresenter$Factory$Impl explainerPresenterFactory;
    public final LocationDeniedDialogPresenter$Factory$Impl locationDeniedDialogFactory;
    public final PaperMoneyDepositOnboardingPresenter$Factory$Impl onboardingPresenterFactory;
    public final PaperMoneyDepositMerchantDetailsPresenter$Factory$Impl paperMoneyDepositMerchantDetailsPresenterFactory;
    public final PhysicalDepositAddressEntryPresenter$Factory$Impl physicalDepositAddressEntryPresenterFactory;
    public final PaperMoneyDepositMapPresenter$Factory$Impl pmdMapPresenterFactory;
    public final SwipeToLoadOnboardingPresenter$Factory$Impl swipeToLoadOnboardingPresenter;

    public PhysicalDepositPresenterFactory(PaperMoneyDepositMapPresenter$Factory$Impl paperMoneyDepositMapPresenter$Factory$Impl, PaperMoneyDepositMerchantDetailsPresenter$Factory$Impl paperMoneyDepositMerchantDetailsPresenter$Factory$Impl, PhysicalDepositAddressEntryPresenter$Factory$Impl physicalDepositAddressEntryPresenter$Factory$Impl, PaperMoneyDepositBarcodePresenter$Factory$Impl paperMoneyDepositBarcodePresenter$Factory$Impl, LimitReachedDialogPresenter$Factory$Impl limitReachedDialogPresenter$Factory$Impl, LocationDeniedDialogPresenter$Factory$Impl locationDeniedDialogPresenter$Factory$Impl, PaperMoneyDepositOnboardingPresenter$Factory$Impl paperMoneyDepositOnboardingPresenter$Factory$Impl, SwipeToLoadOnboardingPresenter$Factory$Impl swipeToLoadOnboardingPresenter$Factory$Impl, PhysicalDepositErrorDialogPresenter$Factory$Impl physicalDepositErrorDialogPresenter$Factory$Impl, PaperMoneyDepositBarcodeExpiredPresenter$Factory$Impl paperMoneyDepositBarcodeExpiredPresenter$Factory$Impl, AtmWithdrawalExplainerPresenter.Factory factory, AtmWithdrawalMapPresenter$Factory$Impl atmWithdrawalMapPresenter$Factory$Impl, AtmLocationDetailsPresenter$Factory$Impl atmLocationDetailsPresenter$Factory$Impl, AtmPmdExplainerPresenter$Factory$Impl atmPmdExplainerPresenter$Factory$Impl) {
        this.pmdMapPresenterFactory = paperMoneyDepositMapPresenter$Factory$Impl;
        this.paperMoneyDepositMerchantDetailsPresenterFactory = paperMoneyDepositMerchantDetailsPresenter$Factory$Impl;
        this.physicalDepositAddressEntryPresenterFactory = physicalDepositAddressEntryPresenter$Factory$Impl;
        this.barcodeFactory = paperMoneyDepositBarcodePresenter$Factory$Impl;
        this.locationDeniedDialogFactory = locationDeniedDialogPresenter$Factory$Impl;
        this.onboardingPresenterFactory = paperMoneyDepositOnboardingPresenter$Factory$Impl;
        this.swipeToLoadOnboardingPresenter = swipeToLoadOnboardingPresenter$Factory$Impl;
        this.barcodeExpiredPresenterFactory = paperMoneyDepositBarcodeExpiredPresenter$Factory$Impl;
        this.atmWithdrawalExplainerPresenterFactory = factory;
        this.atmWithdrawalMapPresenterFactory = atmWithdrawalMapPresenter$Factory$Impl;
        this.atmLocationDetailsPresenterFactory = atmLocationDetailsPresenter$Factory$Impl;
        this.explainerPresenterFactory = atmPmdExplainerPresenter$Factory$Impl;
    }

    @Override // app.cash.broadway.presenter.PresenterFactory
    public final Presenter create(Screen screen, BetterNavigator.ScreenNavigator screenNavigator) {
        screen.getClass();
        if (screen instanceof PaperMoneyDepositMapScreen) {
            PaperMoneyDepositMapScreen paperMoneyDepositMapScreen = (PaperMoneyDepositMapScreen) screen;
            RememberEventDispatcher rememberEventDispatcher = this.pmdMapPresenterFactory.delegateFactory;
            CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) ((DoubleCheck) rememberEventDispatcher.abandoning).getValue();
            CoroutineContext coroutineContext = (CoroutineContext) ((LambdaProvider) rememberEventDispatcher.traceContext).lambda.invoke();
            RealCashDepositBarcodeManager realCashDepositBarcodeManager = (RealCashDepositBarcodeManager) ((Provider) rememberEventDispatcher.remembering).invoke();
            zzb zzbVar = (zzb) ((RealLiteCashInRepo$MetroFactory) rememberEventDispatcher.currentRememberingList).invoke();
            RealLocationSearchClient realLocationSearchClient = (RealLocationSearchClient) ((DoubleCheck) rememberEventDispatcher.leaving).getValue();
            AndroidClock androidClock = (AndroidClock) ((LambdaProvider) rememberEventDispatcher.sideEffects).lambda.invoke();
            AndroidStringManager androidStringManager = (AndroidStringManager) ((LambdaProvider) rememberEventDispatcher.rememberSet).lambda.invoke();
            Analytics analytics = (Analytics) ((DoubleCheck) rememberEventDispatcher.releasing).getValue();
            CashMapPresenter$Factory$Impl cashMapPresenter$Factory$Impl = (CashMapPresenter$Factory$Impl) ((Provider) rememberEventDispatcher.ignoreLeavingSet).invoke();
            KeyValue keyValue = (KeyValue) ((DoubleCheck) rememberEventDispatcher.pausedPlaceholders).getValue();
            BooleanPreference booleanPreference = (BooleanPreference) ((Provider) rememberEventDispatcher.nestedRemembersLists).invoke();
            cashAccountDatabaseImpl.getClass();
            coroutineContext.getClass();
            realCashDepositBarcodeManager.getClass();
            realLocationSearchClient.getClass();
            androidClock.getClass();
            androidStringManager.getClass();
            analytics.getClass();
            cashMapPresenter$Factory$Impl.getClass();
            keyValue.getClass();
            booleanPreference.getClass();
            return MoleculePresenterKt.asPresenter$default(new PaperMoneyDepositMapPresenter(cashAccountDatabaseImpl, coroutineContext, realCashDepositBarcodeManager, zzbVar, realLocationSearchClient, androidClock, androidStringManager, analytics, cashMapPresenter$Factory$Impl, keyValue, booleanPreference, paperMoneyDepositMapScreen, screenNavigator));
        }
        if (screen instanceof PaperMoneyDepositMerchantDetailsScreen) {
            PaperMoneyDepositMerchantDetailsScreen paperMoneyDepositMerchantDetailsScreen = (PaperMoneyDepositMerchantDetailsScreen) screen;
            LocalEditorialPresenter.MetroFactory metroFactory = this.paperMoneyDepositMerchantDetailsPresenterFactory.delegateFactory;
            IntentLauncher intentLauncher = (IntentLauncher) metroFactory.launcher.invoke();
            RealClipboardManager realClipboardManager = (RealClipboardManager) metroFactory.clock.lambda.invoke();
            AndroidStringManager androidStringManager2 = (AndroidStringManager) metroFactory.stringManager.lambda.invoke();
            LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) metroFactory.installedStore.invoke();
            RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) metroFactory.responseContextHandlerFactory.invoke();
            Analytics analytics2 = (Analytics) metroFactory.service.getValue();
            intentLauncher.getClass();
            realClipboardManager.getClass();
            androidStringManager2.getClass();
            factory.getClass();
            realRouter$Factory$Impl.getClass();
            analytics2.getClass();
            return MoleculePresenterKt.asPresenter$default(new PaperMoneyDepositMerchantDetailsPresenter(paperMoneyDepositMerchantDetailsScreen, screenNavigator, intentLauncher, realClipboardManager, androidStringManager2, factory, realRouter$Factory$Impl, analytics2));
        }
        if (screen instanceof PaperMoneyDepositBarcodeScreen) {
            PaperMoneyDepositBarcodeScreen paperMoneyDepositBarcodeScreen = (PaperMoneyDepositBarcodeScreen) screen;
            TransferringPresenter$MetroFactory transferringPresenter$MetroFactory = this.barcodeFactory.delegateFactory;
            IntentLauncher intentLauncher2 = (IntentLauncher) transferringPresenter$MetroFactory.blockersDataNavigator.invoke();
            zzr zzrVar = new zzr(20);
            AndroidClock androidClock2 = (AndroidClock) transferringPresenter$MetroFactory.stringManager.lambda.invoke();
            RealCashDepositBarcodeManager realCashDepositBarcodeManager2 = (RealCashDepositBarcodeManager) transferringPresenter$MetroFactory.balanceSnapshotManager.invoke();
            AndroidStringManager androidStringManager3 = (AndroidStringManager) transferringPresenter$MetroFactory.uuidGenerator.lambda.invoke();
            Analytics analytics3 = (Analytics) transferringPresenter$MetroFactory.appService.getValue();
            FeatureFlagManager featureFlagManager = (FeatureFlagManager) transferringPresenter$MetroFactory.flowStarter.getValue();
            RealRouter$Factory$Impl realRouter$Factory$Impl2 = (RealRouter$Factory$Impl) transferringPresenter$MetroFactory.moneyFormatterFactory.invoke();
            intentLauncher2.getClass();
            androidClock2.getClass();
            realCashDepositBarcodeManager2.getClass();
            androidStringManager3.getClass();
            analytics3.getClass();
            featureFlagManager.getClass();
            realRouter$Factory$Impl2.getClass();
            return MoleculePresenterKt.asPresenter$default(new SelectCustomerPresenter(paperMoneyDepositBarcodeScreen, screenNavigator, intentLauncher2, zzrVar, androidClock2, realCashDepositBarcodeManager2, androidStringManager3, analytics3, featureFlagManager, realRouter$Factory$Impl2));
        }
        if (screen instanceof PhysicalCashDepositAddressEntryScreen) {
            PhysicalCashDepositAddressEntryScreen physicalCashDepositAddressEntryScreen = (PhysicalCashDepositAddressEntryScreen) screen;
            ComponentRegistry.Builder builder = this.physicalDepositAddressEntryPresenterFactory.delegateFactory;
            CashAccountDatabaseImpl cashAccountDatabaseImpl2 = (CashAccountDatabaseImpl) ((DoubleCheck) builder.interceptors).getValue();
            CoroutineContext coroutineContext2 = (CoroutineContext) ((LambdaProvider) builder.mappers).lambda.invoke();
            RealLocationSearchClient realLocationSearchClient2 = (RealLocationSearchClient) ((DoubleCheck) builder.keyers).getValue();
            AndroidStringManager androidStringManager4 = (AndroidStringManager) ((LambdaProvider) builder.lazyFetcherFactories).lambda.invoke();
            Analytics analytics4 = (Analytics) ((DoubleCheck) builder.lazyDecoderFactories).getValue();
            cashAccountDatabaseImpl2.getClass();
            coroutineContext2.getClass();
            realLocationSearchClient2.getClass();
            androidStringManager4.getClass();
            analytics4.getClass();
            return MoleculePresenterKt.asPresenter$default(new PoolsListPresenter(cashAccountDatabaseImpl2, physicalCashDepositAddressEntryScreen, screenNavigator, coroutineContext2, realLocationSearchClient2, androidStringManager4, analytics4));
        }
        if (screen instanceof PaperMoneyDepositOnboardingScreen) {
            PaperMoneyDepositOnboardingScreen paperMoneyDepositOnboardingScreen = (PaperMoneyDepositOnboardingScreen) screen;
            CardStudioPresenterV2$MetroFactory cardStudioPresenterV2$MetroFactory = this.onboardingPresenterFactory.delegateFactory;
            Analytics analytics5 = (Analytics) cardStudioPresenterV2$MetroFactory.cashDatabase.getValue();
            AndroidClock androidClock3 = (AndroidClock) cardStudioPresenterV2$MetroFactory.ioContext.lambda.invoke();
            KeyValue keyValue2 = (KeyValue) cardStudioPresenterV2$MetroFactory.appConfig.getValue();
            BooleanPreference booleanPreference2 = (BooleanPreference) cardStudioPresenterV2$MetroFactory.deviceOrientationProvider.invoke();
            analytics5.getClass();
            androidClock3.getClass();
            keyValue2.getClass();
            booleanPreference2.getClass();
            return MoleculePresenterKt.asPresenter$default(new PaperMoneyDepositOnboardingPresenter(analytics5, androidClock3, paperMoneyDepositOnboardingScreen, screenNavigator, keyValue2, booleanPreference2));
        }
        if (screen instanceof SwipeToLoadOnboardingScreen) {
            SwipeToLoadOnboardingScreen swipeToLoadOnboardingScreen = (SwipeToLoadOnboardingScreen) screen;
            CardStudioPresenterV2$MetroFactory cardStudioPresenterV2$MetroFactory2 = this.swipeToLoadOnboardingPresenter.delegateFactory;
            Analytics analytics6 = (Analytics) cardStudioPresenterV2$MetroFactory2.cashDatabase.getValue();
            AndroidClock androidClock4 = (AndroidClock) cardStudioPresenterV2$MetroFactory2.ioContext.lambda.invoke();
            KeyValue keyValue3 = (KeyValue) cardStudioPresenterV2$MetroFactory2.appConfig.getValue();
            BooleanPreference booleanPreference3 = (BooleanPreference) cardStudioPresenterV2$MetroFactory2.deviceOrientationProvider.invoke();
            analytics6.getClass();
            androidClock4.getClass();
            keyValue3.getClass();
            booleanPreference3.getClass();
            return MoleculePresenterKt.asPresenter$default(new SwipeToLoadOnboardingPresenter(swipeToLoadOnboardingScreen, screenNavigator, analytics6, androidClock4, keyValue3, booleanPreference3));
        }
        if (screen instanceof PhysicalCashLimitReachedScreen) {
            return MoleculePresenterKt.asPresenter$default(new LimitReachedDialogPresenter((PhysicalCashLimitReachedScreen) screen, screenNavigator));
        }
        if (screen instanceof LocationDeniedScreen) {
            IntentLauncher intentLauncher3 = (IntentLauncher) this.locationDeniedDialogFactory.delegateFactory.sandboxer.invoke();
            intentLauncher3.getClass();
            return MoleculePresenterKt.asPresenter$default(new EndAppLockPresenter((LocationDeniedScreen) screen, screenNavigator, intentLauncher3));
        }
        if (screen instanceof PhysicalDepositErrorScreen) {
            return MoleculePresenterKt.asPresenter$default(new VerifyCheckDialogPresenter((PhysicalDepositErrorScreen) screen, screenNavigator));
        }
        if (screen instanceof PaperMoneyDepositBarcodeFailedScreen) {
            TaxTooltipPresenter$MetroFactory taxTooltipPresenter$MetroFactory = this.barcodeExpiredPresenterFactory.delegateFactory;
            AndroidStringManager androidStringManager5 = (AndroidStringManager) taxTooltipPresenter$MetroFactory.stringManager.lambda.invoke();
            RealCashDepositBarcodeManager realCashDepositBarcodeManager3 = (RealCashDepositBarcodeManager) taxTooltipPresenter$MetroFactory.taxDesktopTooltipPreference.invoke();
            androidStringManager5.getClass();
            realCashDepositBarcodeManager3.getClass();
            return MoleculePresenterKt.asPresenter$default(new PaperMoneyDepositBarcodeExpiredPresenter((PaperMoneyDepositBarcodeFailedScreen) screen, screenNavigator, androidStringManager5, realCashDepositBarcodeManager3));
        }
        if (screen instanceof AtmWithdrawalExplainerScreen) {
            RetailerMapBlocker.ExplainerScreen explainerScreen = ((AtmWithdrawalExplainerScreen) screen).explainerScreen;
            AtmWithdrawalExplainerPresenter.Factory.Impl impl = (AtmWithdrawalExplainerPresenter.Factory.Impl) this.atmWithdrawalExplainerPresenterFactory;
            explainerScreen.getClass();
            AtmWithdrawalExplainerPresenter.MetroFactory metroFactory2 = impl.delegateFactory;
            Analytics analytics7 = (Analytics) metroFactory2.analytics.getValue();
            RealRouter$Factory$Impl realRouter$Factory$Impl3 = (RealRouter$Factory$Impl) metroFactory2.routerFactory.invoke();
            analytics7.getClass();
            realRouter$Factory$Impl3.getClass();
            return MoleculePresenterKt.asPresenter$default(new AtmWithdrawalExplainerPresenter(explainerScreen, screenNavigator, analytics7, realRouter$Factory$Impl3));
        }
        if (screen instanceof AtmRetailerMapScreen) {
            AtmRetailerMapScreen atmRetailerMapScreen = (AtmRetailerMapScreen) screen;
            DeviceBuildInfo deviceBuildInfo = this.atmWithdrawalMapPresenterFactory.delegateFactory;
            CashAccountDatabaseImpl cashAccountDatabaseImpl3 = (CashAccountDatabaseImpl) ((DoubleCheck) deviceBuildInfo.manufacturer).getValue();
            AndroidClock androidClock5 = (AndroidClock) ((LambdaProvider) deviceBuildInfo.model).lambda.invoke();
            RealLocationSearchClient realLocationSearchClient3 = (RealLocationSearchClient) ((DoubleCheck) deviceBuildInfo.osVersion).getValue();
            AndroidStringManager androidStringManager6 = (AndroidStringManager) ((LambdaProvider) deviceBuildInfo.osBuild).lambda.invoke();
            SizeMap sizeMap = (SizeMap) ((RealLiteCashInRepo$MetroFactory) deviceBuildInfo.fingerprint).invoke();
            Analytics analytics8 = (Analytics) ((DoubleCheck) deviceBuildInfo.tags).getValue();
            FeatureFlagManager featureFlagManager2 = (FeatureFlagManager) ((DoubleCheck) deviceBuildInfo.brand).getValue();
            CashMapPresenter$Factory$Impl cashMapPresenter$Factory$Impl2 = (CashMapPresenter$Factory$Impl) ((Provider) deviceBuildInfo.apiLevel).invoke();
            BooleanPreference booleanPreference4 = (BooleanPreference) ((RealLiteCashInRepo$MetroFactory) deviceBuildInfo.cpuAbis).invoke();
            cashAccountDatabaseImpl3.getClass();
            androidClock5.getClass();
            realLocationSearchClient3.getClass();
            androidStringManager6.getClass();
            analytics8.getClass();
            featureFlagManager2.getClass();
            cashMapPresenter$Factory$Impl2.getClass();
            return MoleculePresenterKt.asPresenter$default(new AtmWithdrawalMapPresenter(cashAccountDatabaseImpl3, androidClock5, realLocationSearchClient3, androidStringManager6, sizeMap, analytics8, featureFlagManager2, cashMapPresenter$Factory$Impl2, booleanPreference4, atmRetailerMapScreen, screenNavigator));
        }
        if (!(screen instanceof AtmLocationDetailsScreen)) {
            if (!(screen instanceof AtmPmdExplainerScreen)) {
                return null;
            }
            CheckDepositAmountPresenter.MetroFactory metroFactory3 = this.explainerPresenterFactory.delegateFactory;
            Analytics analytics9 = (Analytics) metroFactory3.analytics.getValue();
            RealRouter$Factory$Impl realRouter$Factory$Impl4 = (RealRouter$Factory$Impl) metroFactory3.blockerFlowAnalytics.invoke();
            analytics9.getClass();
            realRouter$Factory$Impl4.getClass();
            return MoleculePresenterKt.asPresenter$default(new MusicPresenter((AtmPmdExplainerScreen) screen, screenNavigator, analytics9, realRouter$Factory$Impl4));
        }
        AtmLocationDetailsScreen atmLocationDetailsScreen = (AtmLocationDetailsScreen) screen;
        BlockerImageUploader$MetroFactory blockerImageUploader$MetroFactory = this.atmLocationDetailsPresenterFactory.delegateFactory;
        IntentLauncher intentLauncher4 = (IntentLauncher) blockerImageUploader$MetroFactory.blockersNavigator.invoke();
        Analytics analytics10 = (Analytics) blockerImageUploader$MetroFactory.analytics.getValue();
        AndroidStringManager androidStringManager7 = (AndroidStringManager) blockerImageUploader$MetroFactory.stringManager.lambda.invoke();
        RealClipboardManager realClipboardManager2 = (RealClipboardManager) blockerImageUploader$MetroFactory.ioDispatcher.lambda.invoke();
        RealRouter$Factory$Impl realRouter$Factory$Impl5 = (RealRouter$Factory$Impl) blockerImageUploader$MetroFactory.multiBlockerFacilitator.invoke();
        intentLauncher4.getClass();
        analytics10.getClass();
        androidStringManager7.getClass();
        realClipboardManager2.getClass();
        realRouter$Factory$Impl5.getClass();
        return MoleculePresenterKt.asPresenter$default(new LocalHomePresenter(atmLocationDetailsScreen, screenNavigator, intentLauncher4, analytics10, androidStringManager7, realClipboardManager2, realRouter$Factory$Impl5));
    }
}
