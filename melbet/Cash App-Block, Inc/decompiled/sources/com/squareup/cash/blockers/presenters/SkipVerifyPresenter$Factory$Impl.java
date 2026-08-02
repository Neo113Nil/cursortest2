package com.squareup.cash.blockers.presenters;

import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;

/* loaded from: classes.dex */
public final class SkipVerifyPresenter$Factory$Impl {
    public final ErrorPresenter create(BlockersScreens.SkipVerifyScreen skipVerifyScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        return new ErrorPresenter(23, skipVerifyScreen, screenNavigator);
    }
}
