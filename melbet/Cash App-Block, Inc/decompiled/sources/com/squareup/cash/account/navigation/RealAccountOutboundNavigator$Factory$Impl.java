package com.squareup.cash.account.navigation;

import android.app.Activity;
import com.squareup.cash.account.types.SignedInStateManager;
import com.squareup.cash.bitcoin.capability.RealBitcoinCapabilityProvider;
import com.squareup.cash.bitcoin.navigation.RealBitcoinInboundNavigator$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealClientScenarioCompleter;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.favorites.presenters.RealFavoritesInboundNavigator$Factory$Impl;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.profile.devicemanager.navigation.RealDeviceManagerInboundNavigator$Factory$Impl;
import com.squareup.cash.qrcodes.navigation.RealQrCodesInboundNavigator$Factory$Impl;
import com.squareup.cash.support.navigation.RealSupportNavigator;
import com.squareup.cash.tabs.presenters.TabToolbarPresenter;
import com.squareup.cash.transfers.navigation.real.RealTransfersInboundNavigator$Factory$Impl;
import com.squareup.util.android.RealIntentFactory;
import dev.zacsweers.metro.internal.InstanceFactory;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class RealAccountOutboundNavigator$Factory$Impl {
    public final TabToolbarPresenter.MetroFactory delegateFactory;

    public RealAccountOutboundNavigator$Factory$Impl(TabToolbarPresenter.MetroFactory metroFactory) {
        this.delegateFactory = metroFactory;
    }

    public final RealAccountOutboundNavigator create$1(BetterNavigator.ScreenNavigator screenNavigator) {
        TabToolbarPresenter.MetroFactory metroFactory = this.delegateFactory;
        RealSupportNavigator realSupportNavigator = (RealSupportNavigator) metroFactory.sessionManager.invoke();
        FlowStarter flowStarter = (FlowStarter) metroFactory.profileManager.invoke();
        RealAccountInboundNavigator$Factory$Impl realAccountInboundNavigator$Factory$Impl = (RealAccountInboundNavigator$Factory$Impl) metroFactory.badges.invoke();
        RealQrCodesInboundNavigator$Factory$Impl realQrCodesInboundNavigator$Factory$Impl = (RealQrCodesInboundNavigator$Factory$Impl) ((InstanceFactory) metroFactory.tabToolbarOutboundNavigatorFactory).value;
        RealDeviceManagerInboundNavigator$Factory$Impl realDeviceManagerInboundNavigator$Factory$Impl = (RealDeviceManagerInboundNavigator$Factory$Impl) metroFactory.badger2.invoke();
        RealFavoritesInboundNavigator$Factory$Impl realFavoritesInboundNavigator$Factory$Impl = (RealFavoritesInboundNavigator$Factory$Impl) metroFactory.featureFlagManager.invoke();
        Analytics analytics = (Analytics) metroFactory.bitcoinCapabilityProvider.invoke();
        RealIntentFactory realIntentFactory = (RealIntentFactory) metroFactory.badgingStateAccessibilityHelper.invoke();
        Activity activity = (Activity) ((InstanceFactory) metroFactory.moneyFormatterFactory).value;
        AppConfigManager appConfigManager = (AppConfigManager) metroFactory.moneybotFlagsHelper.invoke();
        SignedInStateManager signedInStateManager = (SignedInStateManager) metroFactory.moneybotAnalyticsService.invoke();
        RealClientScenarioCompleter realClientScenarioCompleter = (RealClientScenarioCompleter) metroFactory.sessionFlags.invoke();
        RealBitcoinCapabilityProvider realBitcoinCapabilityProvider = (RealBitcoinCapabilityProvider) metroFactory.syncValueReader.invoke();
        RealBitcoinInboundNavigator$Factory$Impl realBitcoinInboundNavigator$Factory$Impl = (RealBitcoinInboundNavigator$Factory$Impl) metroFactory.p2pSettingsManager.invoke();
        RealTransfersInboundNavigator$Factory$Impl realTransfersInboundNavigator$Factory$Impl = (RealTransfersInboundNavigator$Factory$Impl) metroFactory.familyNavigatorFactory.invoke();
        FeatureFlagManager featureFlagManager = (FeatureFlagManager) metroFactory.familyProfileManager.invoke();
        CoroutineContext coroutineContext = (CoroutineContext) metroFactory.balanceSnapshotManager.invoke();
        realSupportNavigator.getClass();
        flowStarter.getClass();
        realAccountInboundNavigator$Factory$Impl.getClass();
        realQrCodesInboundNavigator$Factory$Impl.getClass();
        realDeviceManagerInboundNavigator$Factory$Impl.getClass();
        realFavoritesInboundNavigator$Factory$Impl.getClass();
        analytics.getClass();
        realIntentFactory.getClass();
        activity.getClass();
        appConfigManager.getClass();
        signedInStateManager.getClass();
        realClientScenarioCompleter.getClass();
        realBitcoinCapabilityProvider.getClass();
        realBitcoinInboundNavigator$Factory$Impl.getClass();
        realTransfersInboundNavigator$Factory$Impl.getClass();
        featureFlagManager.getClass();
        coroutineContext.getClass();
        return new RealAccountOutboundNavigator(screenNavigator, realSupportNavigator, flowStarter, realAccountInboundNavigator$Factory$Impl, realQrCodesInboundNavigator$Factory$Impl, realDeviceManagerInboundNavigator$Factory$Impl, realFavoritesInboundNavigator$Factory$Impl, analytics, realIntentFactory, activity, appConfigManager, signedInStateManager, realClientScenarioCompleter, realBitcoinCapabilityProvider, realBitcoinInboundNavigator$Factory$Impl, realTransfersInboundNavigator$Factory$Impl, featureFlagManager, coroutineContext);
    }
}
