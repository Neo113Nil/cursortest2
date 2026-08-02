package com.squareup.cash.blockers.presenters;

import app.cash.passcode.presenters.EndAppLockPresenter;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.checks.CheckDepositAmountPresenter;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.integration.analytics.Analytics;

/* loaded from: classes.dex */
public final class SuccessMessagePresenter$Factory$Impl {
    public final CheckDepositAmountPresenter.MetroFactory delegateFactory;

    public SuccessMessagePresenter$Factory$Impl(CheckDepositAmountPresenter.MetroFactory metroFactory) {
        this.delegateFactory = metroFactory;
    }

    public final EndAppLockPresenter create(BlockersScreens.SuccessMessageScreen successMessageScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        CheckDepositAmountPresenter.MetroFactory metroFactory = this.delegateFactory;
        Analytics analytics = (Analytics) metroFactory.analytics.getValue();
        BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) metroFactory.blockerFlowAnalytics.invoke();
        analytics.getClass();
        blockersDataNavigator.getClass();
        return new EndAppLockPresenter(analytics, blockersDataNavigator, successMessageScreen, screenNavigator, 13);
    }
}
