package com.squareup.cash.profile.views;

import android.content.Context;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.account.settings.viewmodels.GenericConfirmDialogViewModel;
import com.squareup.cash.mooncake.components.AlertDialogView;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda2;
import com.squareup.cash.ui.OutsideTapCloses;

/* loaded from: classes7.dex */
public final class GenericConfirmDialogView extends AlertDialogView implements OutsideTapCloses, Ui {
    public Ui.EventReceiver eventReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenericConfirmDialogView(Context context) {
        super(context, null, true);
        context.getClass();
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(GenericConfirmDialogViewModel genericConfirmDialogViewModel) {
        genericConfirmDialogViewModel.getClass();
        setTitle(genericConfirmDialogViewModel.title);
        setMessage(genericConfirmDialogViewModel.message);
        setPositiveButton(genericConfirmDialogViewModel.confirmButtonText, new BottomSheet$$ExternalSyntheticLambda2(this, 11));
    }
}
