package com.squareup.cash.bitcoin.navigation;

import app.cash.broadway.navigation.Navigator;
import com.squareup.cash.arcade.ArcadeModule$ProvideHapticVibratorMetroFactory;
import com.squareup.cash.bitcoin.capability.RealBitcoinCapabilityProvider;
import com.squareup.cash.boost.db.Reward$Adapter;
import com.squareup.cash.crypto.backend.autoinvest.CryptoAutoInvestRepo;
import com.squareup.cash.e2ee.trifle.RealTrifleService;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.growtools.presenters.manager.state.RealGrowToolsManagerViewAppearanceTracker;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.marketcapabilities.RealMarketCapabilitiesManager;
import com.squareup.preferences.KeyValue;
import dev.zacsweers.metro.Provider;

/* loaded from: classes.dex */
public final class RealBitcoinInboundNavigator$Factory$Impl {
    public final Reward$Adapter delegateFactory;

    public RealBitcoinInboundNavigator$Factory$Impl(Reward$Adapter reward$Adapter) {
        this.delegateFactory = reward$Adapter;
    }

    public final RealBitcoinInboundNavigator create(Navigator navigator) {
        navigator.getClass();
        Reward$Adapter reward$Adapter = this.delegateFactory;
        Analytics analytics = (Analytics) ((Provider) reward$Adapter.avatarsAdapter).invoke();
        FeatureFlagManager featureFlagManager = (FeatureFlagManager) ((Provider) reward$Adapter.reward_selection_stateAdapter).invoke();
        RealBitcoinCapabilityProvider realBitcoinCapabilityProvider = (RealBitcoinCapabilityProvider) ((Provider) reward$Adapter.boost_detail_bottom_upsellAdapter).invoke();
        RealMarketCapabilitiesManager realMarketCapabilitiesManager = (RealMarketCapabilitiesManager) ((Provider) reward$Adapter.app_linksAdapter).invoke();
        CryptoAutoInvestRepo cryptoAutoInvestRepo = (CryptoAutoInvestRepo) ((Provider) reward$Adapter.program_detail_rowsAdapter).invoke();
        RealGrowToolsManagerViewAppearanceTracker realGrowToolsManagerViewAppearanceTracker = (RealGrowToolsManagerViewAppearanceTracker) ((RealTrifleService.MetroFactory) reward$Adapter.boost_detail_rowsAdapter).invoke();
        KeyValue keyValue = (KeyValue) ((ArcadeModule$ProvideHapticVibratorMetroFactory) reward$Adapter.boost_attributesAdapter).invoke();
        analytics.getClass();
        featureFlagManager.getClass();
        realBitcoinCapabilityProvider.getClass();
        realMarketCapabilitiesManager.getClass();
        cryptoAutoInvestRepo.getClass();
        return new RealBitcoinInboundNavigator(analytics, featureFlagManager, realBitcoinCapabilityProvider, realMarketCapabilitiesManager, cryptoAutoInvestRepo, realGrowToolsManagerViewAppearanceTracker, keyValue, navigator);
    }
}
