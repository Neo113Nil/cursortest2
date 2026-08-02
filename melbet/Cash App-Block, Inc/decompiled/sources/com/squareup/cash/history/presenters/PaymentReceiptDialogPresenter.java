package com.squareup.cash.history.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.history.viewmodels.PaymentReceiptDialogViewModel;
import com.squareup.protos.franklin.ui.PaymentHistoryButton;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes6.dex */
public final class PaymentReceiptDialogPresenter implements MoleculePresenter {
    public final PaymentHistoryButton.Dialog dialog;
    public final BetterNavigator.ScreenNavigator navigator;

    public PaymentReceiptDialogPresenter(PaymentHistoryButton.Dialog dialog, BetterNavigator.ScreenNavigator screenNavigator) {
        dialog.getClass();
        this.dialog = dialog;
        this.navigator = screenNavigator;
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1359558967);
        Updater.LaunchedEffect(gapComposer, flow, new PasscodeDialogPresenter$models$1$1(flow, (Continuation) null, this, 12));
        PaymentHistoryButton.Dialog dialog = this.dialog;
        PaymentReceiptDialogViewModel paymentReceiptDialogViewModel = new PaymentReceiptDialogViewModel(dialog.title, dialog.content, dialog.dismiss_button_label);
        gapComposer.end(false);
        return paymentReceiptDialogViewModel;
    }
}
