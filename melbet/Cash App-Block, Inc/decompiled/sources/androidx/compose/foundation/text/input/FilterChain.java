package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class FilterChain implements InputTransformation {
    public final InputTransformation first;
    public final InputTransformation second;

    public FilterChain(InputTransformation inputTransformation, InputTransformation inputTransformation2) {
        this.first = inputTransformation;
        this.second = inputTransformation2;
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public final void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        this.first.applySemantics(semanticsPropertyReceiver);
        this.second.applySemantics(semanticsPropertyReceiver);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FilterChain.class != obj.getClass()) {
            return false;
        }
        FilterChain filterChain = (FilterChain) obj;
        return this.first.equals(filterChain.first) && this.second.equals(filterChain.second) && Intrinsics.areEqual(getKeyboardOptions(), filterChain.getKeyboardOptions());
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public final KeyboardOptions getKeyboardOptions() {
        KeyboardOptions keyboardOptions = this.second.getKeyboardOptions();
        InputTransformation inputTransformation = this.first;
        return keyboardOptions != null ? keyboardOptions.fillUnspecifiedValuesWith$foundation(inputTransformation.getKeyboardOptions()) : inputTransformation.getKeyboardOptions();
    }

    public final int hashCode() {
        int hashCode = (this.second.hashCode() + (this.first.hashCode() * 31)) * 32;
        KeyboardOptions keyboardOptions = getKeyboardOptions();
        return hashCode + (keyboardOptions != null ? keyboardOptions.hashCode() : 0);
    }

    public final String toString() {
        return this.first + ".then(" + this.second + ')';
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public final void transformInput(TextFieldBuffer textFieldBuffer) {
        this.first.transformInput(textFieldBuffer);
        this.second.transformInput(textFieldBuffer);
    }
}
