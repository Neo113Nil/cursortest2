package com.squareup.cash.blockers.presenters;

import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.stripe.real.RealStripeEventListener$MetroFactory;
import com.squareup.protos.cash.api.Error;
import com.squareup.protos.cash.lynx.api.v1_0.StripeBankLinkingService;

/* loaded from: classes.dex */
public final class StripeLinkPresenter$Factory$Impl {
    public final DisclosurePresenter.MetroFactory delegateFactory;

    public StripeLinkPresenter$Factory$Impl(DisclosurePresenter.MetroFactory metroFactory) {
        this.delegateFactory = metroFactory;
    }

    public final DisclosurePresenter create(BlockersScreens.StripeLinkScreen stripeLinkScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        DisclosurePresenter.MetroFactory metroFactory = this.delegateFactory;
        StripeBankLinkingService stripeBankLinkingService = (StripeBankLinkingService) metroFactory.analytics.getValue();
        AndroidStringManager androidStringManager = (AndroidStringManager) metroFactory.stringManager.lambda.invoke();
        BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) metroFactory.blockersNavigator.invoke();
        BlockerFlowListener blockerFlowListener = (BlockerFlowListener) metroFactory.launcher.invoke();
        Analytics analytics = (Analytics) metroFactory.appService.getValue();
        Error.Code.Companion companion = (Error.Code.Companion) RealStripeEventListener$MetroFactory.INSTANCE.invoke();
        stripeBankLinkingService.getClass();
        androidStringManager.getClass();
        blockersDataNavigator.getClass();
        blockerFlowListener.getClass();
        analytics.getClass();
        return new DisclosurePresenter(stripeBankLinkingService, androidStringManager, blockersDataNavigator, blockerFlowListener, analytics, companion, stripeLinkScreen, screenNavigator);
    }
}
