package com.squareup.cash.blockers.treehouse.viewmodels;

import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.treehouse.flows.BlockerScreenSpec;

/* loaded from: classes7.dex */
public final class TreehouseBlockerViewModel {
    public final BlockersData blockersData;
    public final BetterNavigator.ScreenNavigator navigator;
    public final BlockerScreenSpec spec;

    public TreehouseBlockerViewModel(BlockersData blockersData, BlockerScreenSpec blockerScreenSpec, BetterNavigator.ScreenNavigator screenNavigator) {
        blockersData.getClass();
        this.blockersData = blockersData;
        this.spec = blockerScreenSpec;
        this.navigator = screenNavigator;
    }
}
