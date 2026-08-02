package app.cash.local.views.brand.checkout;

import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.internal.PartialGapBuffer;

/* loaded from: classes3.dex */
public final class GiftCardOutputTransformation implements OutputTransformation {
    public static final GiftCardOutputTransformation INSTANCE = new GiftCardOutputTransformation();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof GiftCardOutputTransformation);
    }

    public final int hashCode() {
        return 230608186;
    }

    public final String toString() {
        return "GiftCardOutputTransformation";
    }

    @Override // androidx.compose.foundation.text.input.OutputTransformation
    public final void transformOutput(TextFieldBuffer textFieldBuffer) {
        PartialGapBuffer partialGapBuffer = textFieldBuffer.buffer;
        if (partialGapBuffer.length() > 4) {
            textFieldBuffer.replace(4, 4, " ");
        }
        if (partialGapBuffer.length() > 9) {
            textFieldBuffer.replace(9, 9, " ");
        }
        if (partialGapBuffer.length() > 14) {
            textFieldBuffer.replace(14, 14, " ");
        }
    }
}
