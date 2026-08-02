package com.squareup.cash.investing.components.dialogs;

import android.content.Context;
import android.util.AttributeSet;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.R;
import com.squareup.cash.google.pay.RealGooglePayer$$ExternalSyntheticLambda0;
import com.squareup.cash.investing.viewmodels.custom.order.CancelOrderViewModel;
import com.squareup.cash.launcher.IntentLauncher$$ExternalSyntheticLambda0;
import com.squareup.cash.mooncake.components.AlertDialogView;
import com.squareup.cash.ui.OutsideTapCloses;

/* loaded from: classes6.dex */
public final class ConfirmCancelScheduledOrderDialog extends AlertDialogView implements Ui, OutsideTapCloses {
    public Ui.EventReceiver eventReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmCancelScheduledOrderDialog(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, false, 4);
        context.getClass();
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(CancelOrderViewModel cancelOrderViewModel) {
        cancelOrderViewModel.getClass();
        setPositiveButton(R.string.investing_components_cancel_scheduled_order_dialog_positive, new IntentLauncher$$ExternalSyntheticLambda0(11, this, cancelOrderViewModel));
        setNegativeButton(R.string.investing_components_cancel_scheduled_order_dialog_negative, new RealGooglePayer$$ExternalSyntheticLambda0(this, 18));
        setMessage(cancelOrderViewModel.message);
    }
}
