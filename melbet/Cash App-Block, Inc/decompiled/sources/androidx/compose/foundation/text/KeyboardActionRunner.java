package androidx.compose.foundation.text;

import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class KeyboardActionRunner implements KeyboardActionScope {
    public FocusOwnerImpl focusManager;
    public KeyboardActions keyboardActions;
    public final DelegatingSoftwareKeyboardController keyboardController;

    public KeyboardActionRunner(DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController) {
        this.keyboardController = delegatingSoftwareKeyboardController;
    }

    public final KeyboardActions getKeyboardActions() {
        KeyboardActions keyboardActions = this.keyboardActions;
        if (keyboardActions != null) {
            return keyboardActions;
        }
        Intrinsics.throwUninitializedPropertyAccessException("keyboardActions");
        throw null;
    }

    /* renamed from: runAction-KlQnJC8, reason: not valid java name */
    public final boolean m358runActionKlQnJC8(int i) {
        Function1 function1;
        DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController;
        if (i == 7) {
            function1 = getKeyboardActions().onDone;
        } else if (i == 2) {
            function1 = getKeyboardActions().onGo;
        } else if (i == 6) {
            function1 = getKeyboardActions().onNext;
        } else if (i == 5) {
            function1 = getKeyboardActions().onPrevious;
        } else if (i == 3) {
            function1 = getKeyboardActions().onSearch;
        } else if (i == 4) {
            function1 = getKeyboardActions().onSend;
        } else {
            if (i != 1 && i != 0) {
                a$$ExternalSyntheticBUOutline0.m$1("invalid ImeAction");
                return false;
            }
            function1 = null;
        }
        if (function1 != null) {
            function1.invoke(this);
            return true;
        }
        if (i == 6) {
            FocusOwnerImpl focusOwnerImpl = this.focusManager;
            if (focusOwnerImpl != null) {
                focusOwnerImpl.m597moveFocusaToIllA(1, true);
                return true;
            }
            Intrinsics.throwUninitializedPropertyAccessException("focusManager");
            throw null;
        }
        if (i != 5) {
            if (i != 7 || (delegatingSoftwareKeyboardController = this.keyboardController) == null) {
                return false;
            }
            delegatingSoftwareKeyboardController.hide();
            return true;
        }
        FocusOwnerImpl focusOwnerImpl2 = this.focusManager;
        if (focusOwnerImpl2 != null) {
            focusOwnerImpl2.m597moveFocusaToIllA(2, true);
            return true;
        }
        Intrinsics.throwUninitializedPropertyAccessException("focusManager");
        throw null;
    }
}
