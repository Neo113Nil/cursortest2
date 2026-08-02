package com.squareup.cash.blockers.presenters;

import app.cash.passcode.presenters.EndAppLockPresenter;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.invitations.InviteErrorPresenter;

/* loaded from: classes.dex */
public final class UpgradeConfirmationPresenter$Factory$Impl {
    public final InviteErrorPresenter.MetroFactory delegateFactory;

    public UpgradeConfirmationPresenter$Factory$Impl(InviteErrorPresenter.MetroFactory metroFactory) {
        this.delegateFactory = metroFactory;
    }

    public final EndAppLockPresenter create(BlockersScreens.UpgradeConfirmationScreen upgradeConfirmationScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        Analytics analytics = (Analytics) this.delegateFactory.analytics.getValue();
        analytics.getClass();
        return new EndAppLockPresenter(analytics, upgradeConfirmationScreen, screenNavigator, 14);
    }
}
