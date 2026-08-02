package com.squareup.cash.cashapppay.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.card.onboarding.CardStudioPresenter$models$1$1;
import com.squareup.cash.cashapppay.viewmodels.StatusInterstitialViewModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.protos.franklin.api.StatusInterstitialBlocker;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes6.dex */
public final class StatusInterstitialPresenter implements MoleculePresenter {
    public final BlockersScreens.StatusInterstitial args;
    public final BlockerFlowListener blockerFlowAnalytics;
    public final RealBlockersHelper blockersHelper;
    public final BetterNavigator.ScreenNavigator navigator;

    public StatusInterstitialPresenter(BetterNavigator.ScreenNavigator screenNavigator, BlockersScreens.StatusInterstitial statusInterstitial, BlockerFlowListener blockerFlowListener, RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl) {
        statusInterstitial.getClass();
        this.navigator = screenNavigator;
        this.args = statusInterstitial;
        this.blockerFlowAnalytics = blockerFlowListener;
        this.blockersHelper = realBlockersHelper$Factory$Impl.create(screenNavigator);
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1784675091);
        Updater.LaunchedEffect(gapComposer, flow, new CardStudioPresenter$models$1$1(flow, (Continuation) null, this, 25));
        BlockersScreens.StatusInterstitial statusInterstitial = this.args;
        StatusInterstitialBlocker.StatusIcon statusIcon = statusInterstitial.getStatusInterstitialBlocker().status_icon;
        statusIcon.getClass();
        StatusInterstitialViewModel statusInterstitialViewModel = new StatusInterstitialViewModel(statusIcon, statusInterstitial.getStatusInterstitialBlocker().text);
        gapComposer.end(false);
        return statusInterstitialViewModel;
    }
}
