package com.squareup.cash.blockers.views;

import android.content.Context;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.R;
import com.squareup.cash.blockers.viewmodels.RemoteSkipErrorViewModel;
import com.squareup.cash.mooncake.components.AlertDialogView;

/* loaded from: classes4.dex */
public final class RemoteSkipErrorDialog extends AlertDialogView implements Ui {
    public Ui.EventReceiver eventReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteSkipErrorDialog(Context context) {
        super(context, null, true, 2);
        context.getClass();
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(RemoteSkipErrorViewModel remoteSkipErrorViewModel) {
        remoteSkipErrorViewModel.getClass();
        setMessage(remoteSkipErrorViewModel.message);
        setPositiveButton(R.string.blockers_remote_skip_retry, new SsnViewKt$$ExternalSyntheticLambda4(this, 2));
    }
}
