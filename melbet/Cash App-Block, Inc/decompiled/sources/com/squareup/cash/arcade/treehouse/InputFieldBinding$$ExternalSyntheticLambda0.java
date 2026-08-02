package com.squareup.cash.arcade.treehouse;

import androidx.camera.camera2.pipe.graph.GraphLoop$processingQueue$1;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import bo.app.q2$$ExternalSyntheticLambda8;

/* loaded from: classes5.dex */
public final /* synthetic */ class InputFieldBinding$$ExternalSyntheticLambda0 implements KeyboardActionHandler {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ InputFieldBinding$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // androidx.compose.foundation.text.input.KeyboardActionHandler
    public final void onKeyboardAction(q2$$ExternalSyntheticLambda8 q2__externalsyntheticlambda8) {
        int i = this.$r8$classId;
        Object obj = this.f$1;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                ((GraphLoop$processingQueue$1) obj2).invoke(((InputFieldBinding) obj).treehouseTextFieldState);
                break;
            default:
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) obj;
                ((FocusRequester) obj2).freeFocus();
                if (delegatingSoftwareKeyboardController != null) {
                    delegatingSoftwareKeyboardController.hide();
                    break;
                }
                break;
        }
    }
}
