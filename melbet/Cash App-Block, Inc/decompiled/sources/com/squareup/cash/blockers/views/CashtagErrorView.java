package com.squareup.cash.blockers.views;

import android.content.Context;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.R;
import com.squareup.cash.blockers.viewmodels.CashtagErrorViewModel;
import com.squareup.cash.mooncake.components.AlertDialogView;

/* loaded from: classes4.dex */
public final class CashtagErrorView extends AlertDialogView implements Ui {
    public Ui.EventReceiver eventReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashtagErrorView(Context context) {
        super(context, null, false, 6);
        context.getClass();
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(CashtagErrorViewModel cashtagErrorViewModel) {
        cashtagErrorViewModel.getClass();
        setMessage(cashtagErrorViewModel.message);
        setNegativeButton(R.string.blockers_cashtag_error_negative, new ErrorView$$ExternalSyntheticLambda0(this, 24));
    }
}
