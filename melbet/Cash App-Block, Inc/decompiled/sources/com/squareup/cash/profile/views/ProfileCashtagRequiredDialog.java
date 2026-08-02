package com.squareup.cash.profile.views;

import android.content.Context;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.account.settings.viewmodels.ProfileCashtagRequiredViewModel;
import com.squareup.cash.mooncake.components.AlertDialogView;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda2;
import com.squareup.cash.ui.OutsideTapCloses;

/* loaded from: classes7.dex */
public final class ProfileCashtagRequiredDialog extends AlertDialogView implements Ui, OutsideTapCloses {
    public Ui.EventReceiver eventReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileCashtagRequiredDialog(Context context) {
        super(context, null, true);
        context.getClass();
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(ProfileCashtagRequiredViewModel profileCashtagRequiredViewModel) {
        profileCashtagRequiredViewModel.getClass();
        setMessage(profileCashtagRequiredViewModel.message);
        setPositiveButton(profileCashtagRequiredViewModel.positiveButtonText, new BottomSheet$$ExternalSyntheticLambda2(this, 12));
    }
}
