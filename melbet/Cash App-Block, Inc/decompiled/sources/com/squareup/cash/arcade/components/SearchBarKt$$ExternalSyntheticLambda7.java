package com.squareup.cash.arcade.components;

import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.ui.focus.FocusOwnerImpl;
import bo.app.q2$$ExternalSyntheticLambda8;

/* loaded from: classes5.dex */
public final /* synthetic */ class SearchBarKt$$ExternalSyntheticLambda7 implements KeyboardActionHandler {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FocusOwnerImpl f$0;

    public /* synthetic */ SearchBarKt$$ExternalSyntheticLambda7(FocusOwnerImpl focusOwnerImpl, int i) {
        this.$r8$classId = i;
        this.f$0 = focusOwnerImpl;
    }

    @Override // androidx.compose.foundation.text.input.KeyboardActionHandler
    public final void onKeyboardAction(q2$$ExternalSyntheticLambda8 q2__externalsyntheticlambda8) {
        int i = this.$r8$classId;
        FocusOwnerImpl focusOwnerImpl = this.f$0;
        switch (i) {
            case 0:
                focusOwnerImpl.clearFocus(false);
                break;
            default:
                focusOwnerImpl.clearFocus(false);
                break;
        }
    }
}
