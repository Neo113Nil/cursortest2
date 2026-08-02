package com.squareup.cash.blockers.views;

import android.content.Context;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.R;
import com.squareup.cash.blockers.viewmodels.VerifyErrorViewModel;
import com.squareup.cash.mooncake.components.AlertDialogView;

/* loaded from: classes4.dex */
public final class VerifyErrorView extends AlertDialogView implements Ui {
    public Ui.EventReceiver eventReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyErrorView(Context context) {
        super(context, null, false, 6);
        context.getClass();
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(VerifyErrorViewModel verifyErrorViewModel) {
        verifyErrorViewModel.getClass();
        setMessage(verifyErrorViewModel.message);
        setPositiveButton(R.string.ok, new SsnViewKt$$ExternalSyntheticLambda4(this, 6));
    }
}
