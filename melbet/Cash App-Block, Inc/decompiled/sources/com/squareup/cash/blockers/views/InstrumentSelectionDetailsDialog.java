package com.squareup.cash.blockers.views;

import android.content.Context;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.blockers.viewmodels.InstrumentSelectionDetailsViewModel;
import com.squareup.cash.mooncake.components.AlertDialogView;
import com.squareup.cash.ui.OutsideTapCloses;

/* loaded from: classes4.dex */
public final class InstrumentSelectionDetailsDialog extends AlertDialogView implements OutsideTapCloses, Ui {
    public Ui.EventReceiver eventReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentSelectionDetailsDialog(Context context) {
        super(context, null, false, 6);
        context.getClass();
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(InstrumentSelectionDetailsViewModel instrumentSelectionDetailsViewModel) {
        instrumentSelectionDetailsViewModel.getClass();
        setMessage(instrumentSelectionDetailsViewModel.title);
        setPositiveButton(instrumentSelectionDetailsViewModel.buttonText, new ErrorView$$ExternalSyntheticLambda0(this, 28));
    }
}
