package app.cash.local.views.brand.checkout;

import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.internal.PartialGapBuffer;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt___StringsKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class CheckoutTipSectionKt$$ExternalSyntheticLambda14 implements InputTransformation {
    @Override // androidx.compose.foundation.text.input.InputTransformation
    public final void transformInput(TextFieldBuffer textFieldBuffer) {
        String sb;
        PartialGapBuffer partialGapBuffer = textFieldBuffer.buffer;
        String partialGapBuffer2 = partialGapBuffer.toString();
        if (StringsKt.isBlank(partialGapBuffer2)) {
            sb = partialGapBuffer2;
        } else {
            String substringBefore$default = StringsKt.substringBefore$default(partialGapBuffer2, '.');
            StringBuilder sb2 = new StringBuilder();
            int length = substringBefore$default.length();
            for (int i = 0; i < length; i++) {
                char charAt = substringBefore$default.charAt(i);
                if (Character.isDigit(charAt)) {
                    sb2.append(charAt);
                }
            }
            String trimStart = StringsKt.trimStart(sb2.toString(), '0');
            String substringAfter = StringsKt.substringAfter('.', partialGapBuffer2, "");
            StringBuilder sb3 = new StringBuilder();
            int length2 = substringAfter.length();
            for (int i2 = 0; i2 < length2; i2++) {
                char charAt2 = substringAfter.charAt(i2);
                if (Character.isDigit(charAt2)) {
                    sb3.append(charAt2);
                }
            }
            String take = StringsKt___StringsKt.take(2, sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            if (StringsKt.isBlank(trimStart)) {
                trimStart = "0";
            }
            sb4.append(trimStart);
            if (StringsKt.contains((CharSequence) partialGapBuffer2, '.', false)) {
                sb4.append('.');
            }
            if (take.length() > 0) {
                sb4.append(take);
            }
            sb = sb4.toString();
        }
        if (partialGapBuffer2.equals(sb)) {
            return;
        }
        textFieldBuffer.replace(0, partialGapBuffer.length(), sb);
    }
}
