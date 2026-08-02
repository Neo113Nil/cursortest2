package com.squareup.cash.profile.views;

import android.content.Context;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.R;
import com.squareup.cash.mooncake.components.AlertDialogView;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda2;
import kotlin.Unit;

/* loaded from: classes7.dex */
public final class ProfileUnavailableDialog extends AlertDialogView implements Ui {
    public Ui.EventReceiver eventReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileUnavailableDialog(Context context) {
        super(context, null, false, 6);
        context.getClass();
        setTitle(R.string.profile_unavailable_title);
        setMessage(R.string.profile_unavailable_message);
        setPositiveButton(R.string.profile_unavailable_button, new BottomSheet$$ExternalSyntheticLambda2(this, 13));
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
