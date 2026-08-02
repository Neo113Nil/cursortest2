package com.squareup.cash.blockers.actions.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.squareup.cash.blockers.actions.viewevents.BlockerActionConfirmDialogViewModel;
import com.squareup.cash.blockers.presenters.AmountBlockerPresenter$models$1$2;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.protos.franklin.api.BlockerAction;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes4.dex */
public final class BlockerActionConfirmDialogPresenter implements MoleculePresenter {
    public final BlockersScreens.BlockerActionConfirmDialogScreen args;
    public final RealBlockersHelper blockersHelper;
    public final BetterNavigator.ScreenNavigator navigator;

    public BlockerActionConfirmDialogPresenter(RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl, BlockersScreens.BlockerActionConfirmDialogScreen blockerActionConfirmDialogScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        blockerActionConfirmDialogScreen.getClass();
        this.args = blockerActionConfirmDialogScreen;
        this.navigator = screenNavigator;
        this.blockersHelper = realBlockersHelper$Factory$Impl.create(screenNavigator);
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(840669701);
        Updater.LaunchedEffect(gapComposer, flow, new AmountBlockerPresenter$models$1$2(flow, (Continuation) null, this, 23));
        BlockerAction.ConfirmationDialog confirmationDialog = this.args.confirmationDialog;
        BlockerActionConfirmDialogViewModel blockerActionConfirmDialogViewModel = new BlockerActionConfirmDialogViewModel(confirmationDialog.title, confirmationDialog.message, confirmationDialog.confirm_button_text, confirmationDialog.cancel_button_text);
        gapComposer.end(false);
        return blockerActionConfirmDialogViewModel;
    }
}
