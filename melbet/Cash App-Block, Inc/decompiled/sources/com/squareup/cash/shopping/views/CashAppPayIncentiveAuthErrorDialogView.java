package com.squareup.cash.shopping.views;

import android.content.Context;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.R;
import com.squareup.cash.mooncake.components.AlertDialogView;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda2;
import com.squareup.cash.shopping.screens.CashAppPayIncentiveScreen$SilentAuthorizationErrorDialog;
import com.squareup.cash.ui.OutsideTapCloses;
import kotlin.Unit;

/* loaded from: classes7.dex */
public final class CashAppPayIncentiveAuthErrorDialogView extends AlertDialogView implements OutsideTapCloses, Ui {
    public Ui.EventReceiver eventReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashAppPayIncentiveAuthErrorDialogView(Context context, CashAppPayIncentiveScreen$SilentAuthorizationErrorDialog cashAppPayIncentiveScreen$SilentAuthorizationErrorDialog) {
        super(context, null, false, 4);
        context.getClass();
        setTitle(cashAppPayIncentiveScreen$SilentAuthorizationErrorDialog.title);
        setMessage(cashAppPayIncentiveScreen$SilentAuthorizationErrorDialog.message);
        setPositiveButton(R.string.close, new BottomSheet$$ExternalSyntheticLambda2(this, 21));
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(Unit unit) {
        unit.getClass();
    }
}
