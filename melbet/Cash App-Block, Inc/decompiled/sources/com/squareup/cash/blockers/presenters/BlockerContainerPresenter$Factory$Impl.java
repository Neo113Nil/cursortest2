package com.squareup.cash.blockers.presenters;

import app.cash.broadway.presenter.Presenter;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.history.analytics.LoadTimeClock;

/* loaded from: classes.dex */
public final class BlockerContainerPresenter$Factory$Impl {
    public final LoadTimeClock.MetroFactory delegateFactory;

    public BlockerContainerPresenter$Factory$Impl(LoadTimeClock.MetroFactory metroFactory) {
        this.delegateFactory = metroFactory;
    }

    public final BlockerContainerPresenter create(Presenter presenter, BetterNavigator.ScreenNavigator screenNavigator, BlockersScreens.BlockerContainerScreen blockerContainerScreen) {
        LoadTimeClock.MetroFactory metroFactory = this.delegateFactory;
        RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl = (RealBlockersHelper$Factory$Impl) metroFactory.clock.invoke();
        BlockerFlowListener blockerFlowListener = (BlockerFlowListener) metroFactory.observabilityManager.invoke();
        realBlockersHelper$Factory$Impl.getClass();
        blockerFlowListener.getClass();
        return new BlockerContainerPresenter(realBlockersHelper$Factory$Impl, blockerFlowListener, presenter, screenNavigator, blockerContainerScreen);
    }
}
