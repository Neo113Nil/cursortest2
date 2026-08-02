package com.squareup.cash.profile.presenters.trustedcontact;

import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.FlowStarter;

/* loaded from: classes7.dex */
public final class TrustedContactFlowPresenter {
    public final FlowStarter flowStarter;
    public final BetterNavigator.ScreenNavigator navigator;

    public TrustedContactFlowPresenter(FlowStarter flowStarter, BetterNavigator.ScreenNavigator screenNavigator) {
        this.flowStarter = flowStarter;
        this.navigator = screenNavigator;
    }
}
