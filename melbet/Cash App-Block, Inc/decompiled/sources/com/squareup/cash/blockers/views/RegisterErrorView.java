package com.squareup.cash.blockers.views;

import android.content.Context;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.R;
import com.squareup.cash.blockers.viewmodels.RegisterErrorViewModel;
import com.squareup.cash.mooncake.components.AlertDialogView;

/* loaded from: classes4.dex */
public final class RegisterErrorView extends AlertDialogView implements Ui {
    public Ui.EventReceiver eventReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegisterErrorView(Context context) {
        super(context, null, false, 6);
        context.getClass();
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(RegisterErrorViewModel registerErrorViewModel) {
        registerErrorViewModel.getClass();
        setMessage(registerErrorViewModel.message);
        setPositiveButton(R.string.ok, new SsnViewKt$$ExternalSyntheticLambda4(this, 1));
    }
}
