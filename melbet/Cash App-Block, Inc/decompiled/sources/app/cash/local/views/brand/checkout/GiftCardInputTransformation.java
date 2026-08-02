package app.cash.local.views.brand.checkout;

import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.internal.PartialGapBuffer;
import kotlin.text.StringsKt___StringsKt;

/* loaded from: classes3.dex */
public final class GiftCardInputTransformation implements InputTransformation {
    public static final GiftCardInputTransformation INSTANCE = new GiftCardInputTransformation();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof GiftCardInputTransformation);
    }

    public final int hashCode() {
        return 1279658147;
    }

    public final String toString() {
        return "GiftCardInputTransformation";
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public final void transformInput(TextFieldBuffer textFieldBuffer) {
        PartialGapBuffer partialGapBuffer = textFieldBuffer.buffer;
        StringBuilder sb = new StringBuilder();
        int length = partialGapBuffer.length();
        for (int i = 0; i < length; i++) {
            char charAt = partialGapBuffer.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        if (sb.length() <= 16) {
            textFieldBuffer.replace(0, partialGapBuffer.length(), sb.toString());
        } else {
            textFieldBuffer.replace(0, partialGapBuffer.length(), StringsKt___StringsKt.take(16, sb).toString());
        }
    }
}
