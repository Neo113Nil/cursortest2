package com.squareup.cash.common.composeui;

import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class CharacterLimitTransformation implements InputTransformation {
    public final int limit;
    public final Function0 onCharacterLimitReached;

    public CharacterLimitTransformation(int i, Function0 function0) {
        this.limit = i;
        this.onCharacterLimitReached = function0;
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public final void transformInput(TextFieldBuffer textFieldBuffer) {
        if (textFieldBuffer.buffer.length() > this.limit) {
            Function0 function0 = this.onCharacterLimitReached;
            if (function0 != null) {
                function0.invoke();
            }
            textFieldBuffer.revertAllChanges();
        }
    }
}
