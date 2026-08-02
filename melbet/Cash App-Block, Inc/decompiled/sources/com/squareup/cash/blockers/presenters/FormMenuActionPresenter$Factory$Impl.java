package com.squareup.cash.blockers.presenters;

import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;

/* loaded from: classes.dex */
public final class FormMenuActionPresenter$Factory$Impl {
    public final FormMenuActionPresenter create(BlockersScreens.FormMenuActionSheet formMenuActionSheet, BetterNavigator.ScreenNavigator screenNavigator) {
        return new FormMenuActionPresenter(formMenuActionSheet, screenNavigator);
    }
}
