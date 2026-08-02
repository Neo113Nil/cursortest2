package app.cash.inputfieldtext.composeui;

import androidx.compose.foundation.text.input.TextFieldState;
import app.cash.inputfieldtext.InputFieldText;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class TextFieldStateInputFieldText implements InputFieldText {
    public final TextFieldState textFieldState;

    public TextFieldStateInputFieldText(TextFieldState textFieldState) {
        textFieldState.getClass();
        this.textFieldState = textFieldState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TextFieldStateInputFieldText) && Intrinsics.areEqual(this.textFieldState, ((TextFieldStateInputFieldText) obj).textFieldState);
    }

    @Override // app.cash.inputfieldtext.InputFieldText
    public final CharSequence getValue() {
        return this.textFieldState.getValue$foundation().text;
    }

    public final int hashCode() {
        return this.textFieldState.hashCode();
    }

    public final String toString() {
        return "TextFieldStateInputFieldText(textFieldState=" + this.textFieldState + ")";
    }
}
