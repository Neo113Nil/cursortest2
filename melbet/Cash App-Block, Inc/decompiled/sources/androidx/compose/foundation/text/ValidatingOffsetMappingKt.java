package androidx.compose.foundation.text;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.OffsetApplier;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;

/* loaded from: classes3.dex */
public abstract class ValidatingOffsetMappingKt {
    public static final OffsetApplier ValidatingEmptyOffsetMappingIdentity = new OffsetApplier(OffsetMapping.Companion.Identity, 0, 0, 2);

    public static final TransformedText filterWithValidation(VisualTransformation visualTransformation, AnnotatedString annotatedString) {
        TransformedText filter = visualTransformation.filter(annotatedString);
        int length = annotatedString.text.length();
        AnnotatedString annotatedString2 = filter.text;
        OffsetMapping offsetMapping = filter.offsetMapping;
        int length2 = annotatedString2.text.length();
        int min = Math.min(length, 100);
        for (int i = 0; i < min; i++) {
            validateOriginalToTransformed(offsetMapping.originalToTransformed(i), length2, i);
        }
        validateOriginalToTransformed(offsetMapping.originalToTransformed(length), length2, length);
        int min2 = Math.min(length2, 100);
        for (int i2 = 0; i2 < min2; i2++) {
            validateTransformedToOriginal(offsetMapping.transformedToOriginal(i2), length, i2);
        }
        validateTransformedToOriginal(offsetMapping.transformedToOriginal(length2), length, length2);
        return new TransformedText(annotatedString2, new OffsetApplier(offsetMapping, annotatedString.text.length(), annotatedString2.text.length(), 2));
    }

    public static final void validateOriginalToTransformed(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(i3, i, "OffsetMapping.originalToTransformed returned invalid mapping: ", " -> ", " is not in range of transformed text [0, ");
        m107m.append(i2);
        m107m.append(']');
        InlineClassHelperKt.throwIllegalStateException(m107m.toString());
    }

    public static final void validateTransformedToOriginal(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(i3, i, "OffsetMapping.transformedToOriginal returned invalid mapping: ", " -> ", " is not in range of original text [0, ");
        m107m.append(i2);
        m107m.append(']');
        InlineClassHelperKt.throwIllegalStateException(m107m.toString());
    }
}
