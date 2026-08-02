package com.squareup.cash.appmessages.views;

import android.content.Context;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.R;
import com.squareup.cash.appmessages.AppMessageErrorViewModel;
import com.squareup.cash.blockers.views.ErrorView$$ExternalSyntheticLambda0;
import com.squareup.cash.mooncake.components.AlertDialogView;
import com.squareup.cash.ui.OutsideTapCloses;

/* loaded from: classes5.dex */
public final class AppMessageErrorDialog extends AlertDialogView implements OutsideTapCloses, Ui {
    public Ui.EventReceiver eventReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppMessageErrorDialog(Context context) {
        super(context, null, false, 4);
        context.getClass();
        setNegativeButton(R.string.blockers_retrofit_error_negative, new ErrorView$$ExternalSyntheticLambda0(this, 4));
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(AppMessageErrorViewModel appMessageErrorViewModel) {
        appMessageErrorViewModel.getClass();
        setMessage(appMessageErrorViewModel.messageRes);
    }
}
