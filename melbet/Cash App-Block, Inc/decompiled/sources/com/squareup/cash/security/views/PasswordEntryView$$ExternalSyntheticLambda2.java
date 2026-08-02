package com.squareup.cash.security.views;

import android.view.View;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.security.viewmodels.PasswordEntryViewEvent;
import com.squareup.util.android.Keyboards;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final /* synthetic */ class PasswordEntryView$$ExternalSyntheticLambda2 implements View.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ PasswordEntryView f$0;

    public /* synthetic */ PasswordEntryView$$ExternalSyntheticLambda2(PasswordEntryView passwordEntryView, int i) {
        this.$r8$classId = i;
        this.f$0 = passwordEntryView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.$r8$classId;
        PasswordEntryView passwordEntryView = this.f$0;
        switch (i) {
            case 0:
                int i2 = PasswordEntryView.$r8$clinit;
                view.getClass();
                Keyboards.hideKeyboard(view);
                Ui.EventReceiver eventReceiver = passwordEntryView.eventReceiver;
                if (eventReceiver != null) {
                    eventReceiver.sendEvent(PasswordEntryViewEvent.CloseScreen.INSTANCE);
                    return;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                    throw null;
                }
            case 1:
                Ui.EventReceiver eventReceiver2 = passwordEntryView.eventReceiver;
                if (eventReceiver2 != null) {
                    eventReceiver2.sendEvent(PasswordEntryViewEvent.HelpMenuClick.INSTANCE);
                    return;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                    throw null;
                }
            case 2:
                Ui.EventReceiver eventReceiver3 = passwordEntryView.eventReceiver;
                if (eventReceiver3 != null) {
                    eventReceiver3.sendEvent(PasswordEntryViewEvent.ForgotPasswordClick.INSTANCE);
                    return;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                    throw null;
                }
            default:
                Ui.EventReceiver eventReceiver4 = passwordEntryView.eventReceiver;
                if (eventReceiver4 != null) {
                    eventReceiver4.sendEvent(PasswordEntryViewEvent.UseBiometrics.INSTANCE);
                    return;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                    throw null;
                }
        }
    }
}
