package com.squareup.cash.blockers.presenters;

import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.invitations.InviteErrorPresenter;

/* loaded from: classes.dex */
public final class ConfirmExitOnboardingFlowPresenter$Factory$Impl {
    public final InviteErrorPresenter.MetroFactory delegateFactory;

    public ConfirmExitOnboardingFlowPresenter$Factory$Impl(InviteErrorPresenter.MetroFactory metroFactory) {
        this.delegateFactory = metroFactory;
    }

    public final ErrorPresenter create(BetterNavigator.ScreenNavigator screenNavigator) {
        FlowStarter flowStarter = (FlowStarter) this.delegateFactory.analytics.getValue();
        flowStarter.getClass();
        return new ErrorPresenter(13, flowStarter, screenNavigator);
    }
}
