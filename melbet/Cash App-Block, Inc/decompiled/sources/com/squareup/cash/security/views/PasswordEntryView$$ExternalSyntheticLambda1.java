package com.squareup.cash.security.views;

import android.text.method.PasswordTransformationMethod;
import android.widget.CompoundButton;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.mooncake.components.MooncakeEditText;
import com.squareup.cash.security.viewmodels.PasswordEntryViewEvent;
import com.squareup.util.android.Views;
import com.squareup.util.android.Views$SCALE$1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final /* synthetic */ class PasswordEntryView$$ExternalSyntheticLambda1 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ PasswordEntryView f$0;

    public /* synthetic */ PasswordEntryView$$ExternalSyntheticLambda1(PasswordEntryView passwordEntryView, int i) {
        this.$r8$classId = i;
        this.f$0 = passwordEntryView;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.$r8$classId;
        PasswordEntryView passwordEntryView = this.f$0;
        switch (i) {
            case 0:
                int i2 = PasswordEntryView.$r8$clinit;
                compoundButton.getClass();
                MooncakeEditText mooncakeEditText = (MooncakeEditText) passwordEntryView.binding.securityViewPasswordEditText;
                Views$SCALE$1 views$SCALE$1 = Views.SCALE;
                PasswordTransformationMethod passwordTransformationMethod = PasswordTransformationMethod.getInstance();
                passwordTransformationMethod.getClass();
                int selectionStart = mooncakeEditText.getSelectionStart();
                if (z) {
                    passwordTransformationMethod = null;
                }
                mooncakeEditText.setTransformationMethod(passwordTransformationMethod);
                mooncakeEditText.setSelection(selectionStart);
                Ui.EventReceiver eventReceiver = passwordEntryView.eventReceiver;
                if (eventReceiver != null) {
                    eventReceiver.sendEvent(new PasswordEntryViewEvent.PasswordTextVisibilityClick(z));
                    return;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                    throw null;
                }
            default:
                int i3 = PasswordEntryView.$r8$clinit;
                compoundButton.getClass();
                Ui.EventReceiver eventReceiver2 = passwordEntryView.eventReceiver;
                if (eventReceiver2 != null) {
                    eventReceiver2.sendEvent(new PasswordEntryViewEvent.BiometricsCheckboxToggle(z));
                    return;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                    throw null;
                }
        }
    }
}
