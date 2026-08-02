package com.squareup.cash.blockers.views;

import android.content.Context;
import android.widget.LinearLayout;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.blockers.viewmodels.RemoteSkipEvent$Retry;
import com.squareup.cash.blockers.viewmodels.RemoteSkipViewModel;
import com.squareup.cash.ui.DialogResultListener;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class RemoteSkipView extends LinearLayout implements DialogResultListener, Ui {
    public Ui.EventReceiver eventReceiverRelay;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteSkipView(Context context) {
        super(context);
        context.getClass();
        setOrientation(1);
        setGravity(17);
    }

    @Override // com.squareup.cash.ui.DialogResultListener
    public final void onDialogCanceled(Screen screen) {
        screen.getClass();
        Ui.EventReceiver eventReceiver = this.eventReceiverRelay;
        if (eventReceiver != null) {
            eventReceiver.sendEvent(RemoteSkipEvent$Retry.INSTANCE);
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("eventReceiverRelay");
            throw null;
        }
    }

    @Override // com.squareup.cash.ui.DialogResultListener
    public final void onDialogResult(Screen screen, Object obj) {
        screen.getClass();
        Ui.EventReceiver eventReceiver = this.eventReceiverRelay;
        if (eventReceiver != null) {
            eventReceiver.sendEvent(RemoteSkipEvent$Retry.INSTANCE);
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("eventReceiverRelay");
            throw null;
        }
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        setEventReceiverRelay(eventReceiver);
    }

    public final void setEventReceiverRelay(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiverRelay = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(RemoteSkipViewModel remoteSkipViewModel) {
        remoteSkipViewModel.getClass();
    }
}
