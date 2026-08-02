package com.squareup.cash.blockers.views.components;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import com.google.android.gms.dynamite.zzo;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt___StringsKt;

/* loaded from: classes5.dex */
public final class VerificationCodeHyphenationTransformer implements VisualTransformation {
    @Override // androidx.compose.ui.text.input.VisualTransformation
    public final TransformedText filter(AnnotatedString annotatedString) {
        annotatedString.getClass();
        String str = annotatedString.text;
        str.getClass();
        String joinToString$default = CollectionsKt.joinToString$default(StringsKt___StringsKt.chunked(3, str), "-", null, null, 0, null, null, 62);
        if (str.length() % 3 != 0) {
            joinToString$default = StringsKt.removeSuffix(joinToString$default, "-");
        }
        AnnotatedString annotatedString2 = new AnnotatedString(joinToString$default);
        str.getClass();
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == '-') {
                i++;
            }
        }
        return new TransformedText(annotatedString2, new zzo((byte) 0, i));
    }
}
