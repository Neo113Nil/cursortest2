package com.squareup.cash.bitcoin.presenters.transfer;

import com.google.zxing.BinaryBitmap;
import com.squareup.cash.amountslider.presenters.AmountSelectorPresenter;
import com.squareup.cash.attribution.ProductionAttributionEventEmitter;
import com.squareup.cash.bitcoin.capability.RealBitcoinCapabilityProvider;
import com.squareup.cash.bitcoin.presenters.featureavailability.BitcoinFeatureAvailabilityProvider;
import com.squareup.cash.bitcoin.presenters.limits.util.BitcoinLimitsProvider;
import com.squareup.cash.bitcoin.screens.BitcoinTransferScreen;
import com.squareup.cash.blockers.treehouse.TreehouseFlows;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.backend.balance.RealCryptoBalanceRepo;
import com.squareup.cash.crypto.backend.balance.RealRestrictedBalanceStore;
import com.squareup.cash.crypto.backend.settings.RealBitcoinConfigRepo;
import com.squareup.cash.crypto.backend.value.RealCryptoValueRepo;
import com.squareup.cash.crypto.navigation.CryptoFlowStarter;
import com.squareup.cash.data.profile.RealJurisdictionConfigManager;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.instruments.backend.real.RealInstrumentManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.backend.real.RecurringScheduleBuilder;
import com.squareup.cash.paymentpad.presenters.HomeViewPresenter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.transfers.backend.real.RealTransferRequirementHandler;
import dev.zacsweers.metro.internal.InstanceFactory;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class BitcoinTransferPresenter$Factory$Impl {
    public final HomeViewPresenter.MetroFactory delegateFactory;

    public BitcoinTransferPresenter$Factory$Impl(HomeViewPresenter.MetroFactory metroFactory) {
        this.delegateFactory = metroFactory;
    }

    public final BitcoinTransferPresenter create(BitcoinTransferScreen bitcoinTransferScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        bitcoinTransferScreen.getClass();
        HomeViewPresenter.MetroFactory metroFactory = this.delegateFactory;
        AndroidStringManager androidStringManager = (AndroidStringManager) metroFactory.analytics.invoke();
        RealBitcoinCapabilityProvider realBitcoinCapabilityProvider = (RealBitcoinCapabilityProvider) metroFactory.profileManager.invoke();
        AmountSelectorPresenter amountSelectorPresenter = (AmountSelectorPresenter) metroFactory.overlayAppMessageReader.invoke();
        BitcoinLimitsProvider bitcoinLimitsProvider = (BitcoinLimitsProvider) metroFactory.requestReviewFlagWrapper.invoke();
        RealCryptoBalanceRepo realCryptoBalanceRepo = (RealCryptoBalanceRepo) metroFactory.paymentPadOutboundNavigatorFactory.invoke();
        RealCryptoValueRepo realCryptoValueRepo = (RealCryptoValueRepo) metroFactory.tabToolbarPresenterFactory.invoke();
        CryptoFlowStarter cryptoFlowStarter = (CryptoFlowStarter) metroFactory.alertBannerPresenterFactory.invoke();
        RealBalanceSnapshotManager realBalanceSnapshotManager = (RealBalanceSnapshotManager) metroFactory.featureFlagManager.invoke();
        RealRestrictedBalanceStore realRestrictedBalanceStore = (RealRestrictedBalanceStore) metroFactory.p2pSettingsManager.invoke();
        RealInstrumentManager realInstrumentManager = (RealInstrumentManager) metroFactory.paymentTabSettings.invoke();
        RecurringScheduleBuilder recurringScheduleBuilder = (RecurringScheduleBuilder) metroFactory.sessionFlags.invoke();
        Analytics analytics = (Analytics) metroFactory.uuidGenerator.invoke();
        ProductionAttributionEventEmitter productionAttributionEventEmitter = (ProductionAttributionEventEmitter) metroFactory.nearbyPermissionStateProvider.invoke();
        BinaryBitmap binaryBitmap = (BinaryBitmap) ((TreehouseFlows.MetroFactory) metroFactory.inAppReviewLauncher).invoke();
        BitcoinTransferTitleSubtitleProvider$Factory$Impl bitcoinTransferTitleSubtitleProvider$Factory$Impl = (BitcoinTransferTitleSubtitleProvider$Factory$Impl) ((InstanceFactory) metroFactory.mainPaymentPadPresenterFactory).value;
        RealJurisdictionConfigManager realJurisdictionConfigManager = (RealJurisdictionConfigManager) metroFactory.hasSeenQrShortcutsOnboarding.invoke();
        RealBitcoinConfigRepo realBitcoinConfigRepo = (RealBitcoinConfigRepo) metroFactory.qrShortcutsOnboardingAppStarts.invoke();
        FeatureFlagManager featureFlagManager = (FeatureFlagManager) metroFactory.qrShortcutInstaller.invoke();
        RealTransferRequirementHandler realTransferRequirementHandler = (RealTransferRequirementHandler) metroFactory.badgingState.invoke();
        BitcoinFeatureAvailabilityProvider bitcoinFeatureAvailabilityProvider = (BitcoinFeatureAvailabilityProvider) metroFactory.moneybotFlagsHelper.invoke();
        CoroutineContext coroutineContext = (CoroutineContext) metroFactory.lowDiskSpaceAlertManager.invoke();
        androidStringManager.getClass();
        realBitcoinCapabilityProvider.getClass();
        amountSelectorPresenter.getClass();
        bitcoinLimitsProvider.getClass();
        realCryptoBalanceRepo.getClass();
        realCryptoValueRepo.getClass();
        cryptoFlowStarter.getClass();
        realBalanceSnapshotManager.getClass();
        realRestrictedBalanceStore.getClass();
        realInstrumentManager.getClass();
        recurringScheduleBuilder.getClass();
        analytics.getClass();
        productionAttributionEventEmitter.getClass();
        bitcoinTransferTitleSubtitleProvider$Factory$Impl.getClass();
        realJurisdictionConfigManager.getClass();
        realBitcoinConfigRepo.getClass();
        featureFlagManager.getClass();
        realTransferRequirementHandler.getClass();
        bitcoinFeatureAvailabilityProvider.getClass();
        coroutineContext.getClass();
        return new BitcoinTransferPresenter(androidStringManager, realBitcoinCapabilityProvider, amountSelectorPresenter, bitcoinLimitsProvider, realCryptoBalanceRepo, realCryptoValueRepo, cryptoFlowStarter, realBalanceSnapshotManager, realRestrictedBalanceStore, realInstrumentManager, recurringScheduleBuilder, analytics, productionAttributionEventEmitter, binaryBitmap, bitcoinTransferTitleSubtitleProvider$Factory$Impl, realJurisdictionConfigManager, realBitcoinConfigRepo, featureFlagManager, realTransferRequirementHandler, bitcoinFeatureAvailabilityProvider, coroutineContext, bitcoinTransferScreen, screenNavigator);
    }
}
