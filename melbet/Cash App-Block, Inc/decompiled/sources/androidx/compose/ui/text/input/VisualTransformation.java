package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;

/* loaded from: classes3.dex */
public interface VisualTransformation {

    public final class Companion implements OffsetMapping {
        public static final VisualTransformation$Companion$$ExternalSyntheticLambda0 None = new VisualTransformation$Companion$$ExternalSyntheticLambda0(0);

        @Override // androidx.compose.ui.text.input.OffsetMapping
        public int originalToTransformed(int i) {
            return i;
        }

        @Override // androidx.compose.ui.text.input.OffsetMapping
        public int transformedToOriginal(int i) {
            return i;
        }
    }

    TransformedText filter(AnnotatedString annotatedString);
}
