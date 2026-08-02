package com.squareup.cash.deposits.physical.presenter.map;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.profile.RealProfileManager$setPhoto$2;
import com.squareup.cash.deposits.physical.screens.PhysicalCashLimitReachedScreen;
import com.squareup.cash.deposits.physical.viewmodels.map.LimitReachedDialogViewModel;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes6.dex */
public final class LimitReachedDialogPresenter implements MoleculePresenter {
    public final PhysicalCashLimitReachedScreen args;
    public final BetterNavigator.ScreenNavigator navigator;

    public LimitReachedDialogPresenter(PhysicalCashLimitReachedScreen physicalCashLimitReachedScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        physicalCashLimitReachedScreen.getClass();
        this.args = physicalCashLimitReachedScreen;
        this.navigator = screenNavigator;
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-365172859);
        Updater.LaunchedEffect(gapComposer, flow, new RealProfileManager$setPhoto$2(flow, (Continuation) null, this, 27));
        LimitReachedDialogViewModel limitReachedDialogViewModel = new LimitReachedDialogViewModel(this.args.limitReachedDialog);
        gapComposer.end(false);
        return limitReachedDialogViewModel;
    }
}
