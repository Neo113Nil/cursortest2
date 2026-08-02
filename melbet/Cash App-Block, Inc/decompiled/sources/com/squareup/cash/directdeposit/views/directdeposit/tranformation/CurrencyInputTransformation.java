package com.squareup.cash.directdeposit.views.directdeposit.tranformation;

import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.internal.PartialGapBuffer;

/* loaded from: classes6.dex */
public final class CurrencyInputTransformation implements InputTransformation {
    public static final CurrencyInputTransformation INSTANCE = new CurrencyInputTransformation();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof CurrencyInputTransformation);
    }

    public final int hashCode() {
        return 27862678;
    }

    public final String toString() {
        return "CurrencyInputTransformation";
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public final void transformInput(TextFieldBuffer textFieldBuffer) {
        PartialGapBuffer partialGapBuffer = textFieldBuffer.buffer;
        if (partialGapBuffer.length() < textFieldBuffer.originalValue.text.length()) {
            return;
        }
        String partialGapBuffer2 = partialGapBuffer.toString();
        int i = 0;
        for (int i2 = 0; i2 < partialGapBuffer2.length(); i2++) {
            if (partialGapBuffer2.charAt(i2) == '.') {
                i++;
            }
        }
        if (i > 1) {
            textFieldBuffer.revertAllChanges();
        }
    }
}
