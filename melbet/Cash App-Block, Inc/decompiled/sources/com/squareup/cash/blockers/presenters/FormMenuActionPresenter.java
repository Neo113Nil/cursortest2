package com.squareup.cash.blockers.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.FormMenuActionViewModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes4.dex */
public final class FormMenuActionPresenter implements MoleculePresenter {
    public final BlockersScreens.FormMenuActionSheet args;
    public final BetterNavigator.ScreenNavigator navigator;

    public FormMenuActionPresenter(BlockersScreens.FormMenuActionSheet formMenuActionSheet, BetterNavigator.ScreenNavigator screenNavigator) {
        this.args = formMenuActionSheet;
        this.navigator = screenNavigator;
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1779481683);
        Updater.LaunchedEffect(gapComposer, flow, new CashtagPresenter$models$2$1(flow, (Continuation) null, this, 25));
        FormMenuActionViewModel formMenuActionViewModel = new FormMenuActionViewModel(this.args.menuAction.actions);
        gapComposer.end(false);
        return formMenuActionViewModel;
    }
}
