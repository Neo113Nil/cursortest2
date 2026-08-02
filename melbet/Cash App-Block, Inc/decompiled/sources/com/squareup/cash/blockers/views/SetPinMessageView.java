package com.squareup.cash.blockers.views;

import android.content.Context;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.blockers.viewmodels.SetPinMessageViewModel;
import com.squareup.cash.mooncake.components.AlertDialogView;
import com.squareup.cash.ui.OutsideTapCloses;

/* loaded from: classes4.dex */
public final class SetPinMessageView extends AlertDialogView implements OutsideTapCloses, Ui {
    public Ui.EventReceiver eventReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetPinMessageView(Context context) {
        super(context, null, true, 2);
        context.getClass();
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(SetPinMessageViewModel setPinMessageViewModel) {
        setPinMessageViewModel.getClass();
        setMessage(setPinMessageViewModel.message);
        setPositiveButton(setPinMessageViewModel.primaryButtonText, new SsnViewKt$$ExternalSyntheticLambda4(this, 4));
    }
}
