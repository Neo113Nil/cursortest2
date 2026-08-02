package app.cash.local.presenters.wallet;

import app.cash.local.backend.RefreshMarketingMessages;
import app.cash.local.backend.real.RealLocalBrandSyncer;
import app.cash.local.backend.real.RealLocalOrderRepository;
import app.cash.local.backend.real.RealMarketingMessageRepository;
import app.cash.local.navigation.LocalInstalledStore;
import app.cash.local.navigation.launcher.RealLocalLauncher;
import app.cash.local.presenters.RealBrandFollowPresenter$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.db2.profile.Profile;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.tabs.presenters.TabToolbarPresenter$Factory$Impl;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.local.client.v1.GetNeighborhoodsTabContentResponse;
import dev.zacsweers.metro.Provider;

/* loaded from: classes.dex */
public final class TabContentPresenter$Factory$Impl {
    public final Profile.Adapter delegateFactory;

    public TabContentPresenter$Factory$Impl(Profile.Adapter adapter) {
        this.delegateFactory = adapter;
    }

    public final TabContentPresenter create(GetNeighborhoodsTabContentResponse getNeighborhoodsTabContentResponse, BetterNavigator.ScreenNavigator screenNavigator) {
        Profile.Adapter adapter = this.delegateFactory;
        RealLocalBrandSyncer realLocalBrandSyncer = (RealLocalBrandSyncer) ((Provider) adapter.nearby_visibilityAdapter).invoke();
        RealLocalOrderRepository realLocalOrderRepository = (RealLocalOrderRepository) ((Provider) adapter.rate_planAdapter).invoke();
        AndroidStringManager androidStringManager = (AndroidStringManager) ((Provider) adapter.deposit_preferenceAdapter).invoke();
        AndroidClock androidClock = (AndroidClock) ((Provider) adapter.country_codeAdapter).invoke();
        Analytics analytics = (Analytics) ((Provider) adapter.default_currencyAdapter).invoke();
        RealLocalLauncher realLocalLauncher = (RealLocalLauncher) ((Provider) adapter.incoming_request_policyAdapter).invoke();
        TabToolbarPresenter$Factory$Impl tabToolbarPresenter$Factory$Impl = (TabToolbarPresenter$Factory$Impl) ((Provider) adapter.regionAdapter).invoke();
        LocalInstalledStore localInstalledStore = (LocalInstalledStore) ((Provider) adapter.bitcoin_display_unitsAdapter).invoke();
        FeatureFlagManager featureFlagManager = (FeatureFlagManager) ((Provider) adapter.bitcoin_amount_entry_currency_preferenceAdapter).invoke();
        RealMarketingMessageRepository realMarketingMessageRepository = (RealMarketingMessageRepository) ((Provider) adapter.addressAdapter).invoke();
        RefreshMarketingMessages refreshMarketingMessages = (RefreshMarketingMessages) ((Provider) adapter.deposit_preference_dataAdapter).invoke();
        RealBrandFollowPresenter$Factory$Impl realBrandFollowPresenter$Factory$Impl = (RealBrandFollowPresenter$Factory$Impl) ((Provider) adapter.available_p2p_target_regionsAdapter).invoke();
        realLocalBrandSyncer.getClass();
        realLocalOrderRepository.getClass();
        androidStringManager.getClass();
        androidClock.getClass();
        analytics.getClass();
        realLocalLauncher.getClass();
        tabToolbarPresenter$Factory$Impl.getClass();
        localInstalledStore.getClass();
        featureFlagManager.getClass();
        realMarketingMessageRepository.getClass();
        refreshMarketingMessages.getClass();
        realBrandFollowPresenter$Factory$Impl.getClass();
        return new TabContentPresenter(realLocalBrandSyncer, realLocalOrderRepository, androidStringManager, androidClock, analytics, realLocalLauncher, tabToolbarPresenter$Factory$Impl, localInstalledStore, featureFlagManager, realMarketingMessageRepository, refreshMarketingMessages, realBrandFollowPresenter$Factory$Impl, getNeighborhoodsTabContentResponse, screenNavigator);
    }
}
