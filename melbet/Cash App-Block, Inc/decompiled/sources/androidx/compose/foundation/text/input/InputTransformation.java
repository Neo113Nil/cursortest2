package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;

/* loaded from: classes.dex */
public interface InputTransformation {

    public final class Companion implements InputTransformation {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @Override // androidx.compose.foundation.text.input.InputTransformation
        public final void transformInput(TextFieldBuffer textFieldBuffer) {
        }
    }

    default void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
    }

    default KeyboardOptions getKeyboardOptions() {
        return null;
    }

    void transformInput(TextFieldBuffer textFieldBuffer);
}
