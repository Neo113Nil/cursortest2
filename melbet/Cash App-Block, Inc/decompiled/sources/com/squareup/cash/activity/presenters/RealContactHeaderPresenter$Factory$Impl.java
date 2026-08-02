package com.squareup.cash.activity.presenters;

import app.cash.broadway.screen.Screen;
import com.squareup.cash.activity.analytics.ActivityAnalyticsService;
import com.squareup.cash.activity.backend.contacts.RealQuickAccessBarStore;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.cashapppay.presenters.GrantPresenter;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.favorites.data.RealFavoritesManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.p2pblocking.presenters.RealAllowlistRepository;

/* loaded from: classes.dex */
public final class RealContactHeaderPresenter$Factory$Impl {
    public final GrantPresenter.MetroFactory delegateFactory;

    public RealContactHeaderPresenter$Factory$Impl(GrantPresenter.MetroFactory metroFactory) {
        this.delegateFactory = metroFactory;
    }

    public final DisclosurePresenter create$1(Screen screen, BetterNavigator.ScreenNavigator screenNavigator) {
        screen.getClass();
        GrantPresenter.MetroFactory metroFactory = this.delegateFactory;
        RealUuidGenerator realUuidGenerator = (RealUuidGenerator) metroFactory.blockersDataNavigator.invoke();
        Analytics analytics = (Analytics) metroFactory.multiBlockerFacilitator.invoke();
        ActivityInviteItemPresenter$Factory$Impl activityInviteItemPresenter$Factory$Impl = (ActivityInviteItemPresenter$Factory$Impl) metroFactory.activityEvents.value;
        RealQuickAccessBarStore realQuickAccessBarStore = (RealQuickAccessBarStore) metroFactory.analytics.invoke();
        ActivityAnalyticsService activityAnalyticsService = (ActivityAnalyticsService) metroFactory.blockerFlowAnalytics.invoke();
        RealFavoritesManager realFavoritesManager = (RealFavoritesManager) metroFactory.blockersHelperFactory.invoke();
        RealAllowlistRepository realAllowlistRepository = (RealAllowlistRepository) metroFactory.blockerActionUriDecoder.invoke();
        realUuidGenerator.getClass();
        analytics.getClass();
        activityInviteItemPresenter$Factory$Impl.getClass();
        realQuickAccessBarStore.getClass();
        activityAnalyticsService.getClass();
        realFavoritesManager.getClass();
        realAllowlistRepository.getClass();
        return new DisclosurePresenter(realUuidGenerator, analytics, activityInviteItemPresenter$Factory$Impl, realQuickAccessBarStore, activityAnalyticsService, realFavoritesManager, realAllowlistRepository, screenNavigator, screen);
    }
}
