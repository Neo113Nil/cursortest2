package androidx.compose.ui.text.input;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class TextInputSession {
    public final PlatformTextInputService platformTextInputService;
    public final TextInputService textInputService;

    public TextInputSession(TextInputService textInputService, PlatformTextInputService platformTextInputService) {
        this.textInputService = textInputService;
        this.platformTextInputService = platformTextInputService;
    }

    public final void updateState(TextFieldValue textFieldValue, TextFieldValue textFieldValue2) {
        if (Intrinsics.areEqual((TextInputSession) this.textInputService._currentInputSession.get(), this)) {
            this.platformTextInputService.updateState(textFieldValue, textFieldValue2);
        }
    }
}
