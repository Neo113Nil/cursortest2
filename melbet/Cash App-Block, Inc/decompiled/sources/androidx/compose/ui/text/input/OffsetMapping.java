package androidx.compose.ui.text.input;

import androidx.compose.ui.text.input.VisualTransformation;

/* loaded from: classes3.dex */
public interface OffsetMapping {

    public final class Companion {
        public static final VisualTransformation.Companion Identity = new VisualTransformation.Companion();
    }

    int originalToTransformed(int i);

    int transformedToOriginal(int i);
}
