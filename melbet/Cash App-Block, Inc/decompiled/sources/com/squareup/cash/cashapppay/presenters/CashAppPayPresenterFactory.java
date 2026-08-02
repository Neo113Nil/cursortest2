package com.squareup.cash.cashapppay.presenters;

import app.cash.broadway.presenter.Presenter;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.blockers.actions.util.BlockerActionUriDecoder;
import com.squareup.cash.blockers.flow.RealMultiBlockerFacilitator;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.blockers.presenters.BlockerPresenterFactory;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.cashapppay.presenters.GrantPresenter;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.history.analytics.LoadTimeClock;
import com.squareup.cash.integration.analytics.Analytics;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public final class CashAppPayPresenterFactory implements BlockerPresenterFactory {
    public final GrantPresenter$Factory$Impl grantPresenterFactory;
    public final StatusInterstitialPresenter$Factory$Impl statusInterstitialPresenterFactory;

    public CashAppPayPresenterFactory(GrantPresenter$Factory$Impl grantPresenter$Factory$Impl, StatusInterstitialPresenter$Factory$Impl statusInterstitialPresenter$Factory$Impl) {
        this.grantPresenterFactory = grantPresenter$Factory$Impl;
        this.statusInterstitialPresenterFactory = statusInterstitialPresenter$Factory$Impl;
    }

    @Override // app.cash.broadway.presenter.PresenterFactory
    public final Presenter create(Screen screen, BetterNavigator.ScreenNavigator screenNavigator) {
        screen.getClass();
        if (screen instanceof BlockersScreens.StatusInterstitial) {
            LoadTimeClock.MetroFactory metroFactory = this.statusInterstitialPresenterFactory.delegateFactory;
            BlockerFlowListener blockerFlowListener = (BlockerFlowListener) metroFactory.clock.invoke();
            RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl = (RealBlockersHelper$Factory$Impl) metroFactory.observabilityManager.invoke();
            blockerFlowListener.getClass();
            realBlockersHelper$Factory$Impl.getClass();
            return MoleculePresenterKt.asPresenter$default(new StatusInterstitialPresenter(screenNavigator, (BlockersScreens.StatusInterstitial) screen, blockerFlowListener, realBlockersHelper$Factory$Impl));
        }
        if (!(screen instanceof BlockersScreens.CashAppPayGrant)) {
            return null;
        }
        BlockersScreens.CashAppPayGrant cashAppPayGrant = (BlockersScreens.CashAppPayGrant) screen;
        GrantPresenter.MetroFactory metroFactory2 = this.grantPresenterFactory.delegateFactory;
        BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) metroFactory2.blockersDataNavigator.invoke();
        RealMultiBlockerFacilitator realMultiBlockerFacilitator = (RealMultiBlockerFacilitator) metroFactory2.multiBlockerFacilitator.invoke();
        Analytics analytics = (Analytics) metroFactory2.analytics.invoke();
        BlockerFlowListener blockerFlowListener2 = (BlockerFlowListener) metroFactory2.blockerFlowAnalytics.invoke();
        RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl2 = (RealBlockersHelper$Factory$Impl) metroFactory2.blockersHelperFactory.invoke();
        BlockerActionUriDecoder blockerActionUriDecoder = (BlockerActionUriDecoder) metroFactory2.blockerActionUriDecoder.invoke();
        Flow flow = (Flow) metroFactory2.activityEvents.value;
        blockersDataNavigator.getClass();
        realMultiBlockerFacilitator.getClass();
        analytics.getClass();
        blockerFlowListener2.getClass();
        realBlockersHelper$Factory$Impl2.getClass();
        blockerActionUriDecoder.getClass();
        flow.getClass();
        return MoleculePresenterKt.asPresenter$default(new GrantPresenter(blockersDataNavigator, realMultiBlockerFacilitator, analytics, blockerFlowListener2, screenNavigator, cashAppPayGrant, realBlockersHelper$Factory$Impl2, blockerActionUriDecoder, flow));
    }
}
