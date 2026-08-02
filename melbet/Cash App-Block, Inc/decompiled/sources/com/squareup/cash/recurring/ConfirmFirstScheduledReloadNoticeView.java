package com.squareup.cash.recurring;

import android.content.Context;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.mooncake.components.AlertDialogView;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda2;
import com.squareup.cash.ui.OutsideTapCloses;

/* loaded from: classes7.dex */
public final class ConfirmFirstScheduledReloadNoticeView extends AlertDialogView implements OutsideTapCloses, Ui {
    public Ui.EventReceiver eventReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmFirstScheduledReloadNoticeView(Context context) {
        super(context, null, false, 6);
        context.getClass();
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(ConfirmFirstScheduledReloadNoticeViewModel confirmFirstScheduledReloadNoticeViewModel) {
        confirmFirstScheduledReloadNoticeViewModel.getClass();
        setMessage(confirmFirstScheduledReloadNoticeViewModel.message);
        setPositiveButton(confirmFirstScheduledReloadNoticeViewModel.positiveButtonLabel, new BottomSheet$$ExternalSyntheticLambda2(this, 16));
    }
}
