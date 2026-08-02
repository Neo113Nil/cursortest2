package com.squareup.cash.blockers.views;

import android.content.Context;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.R;
import com.squareup.cash.blockers.viewmodels.InvalidInputViewModel;
import com.squareup.cash.mooncake.components.AlertDialogView;
import com.squareup.cash.ui.OutsideTapCloses;

/* loaded from: classes4.dex */
public final class InvalidInputDialog extends AlertDialogView implements OutsideTapCloses, Ui {
    public Ui.EventReceiver eventReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidInputDialog(Context context) {
        super(context, null, true, 2);
        context.getClass();
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(InvalidInputViewModel invalidInputViewModel) {
        invalidInputViewModel.getClass();
        setMessage(invalidInputViewModel.message);
        String str = invalidInputViewModel.title;
        if (str != null) {
            setTitle(str);
        }
        setPositiveButton(R.string.ok, new ErrorView$$ExternalSyntheticLambda0(this, 29));
    }
}
