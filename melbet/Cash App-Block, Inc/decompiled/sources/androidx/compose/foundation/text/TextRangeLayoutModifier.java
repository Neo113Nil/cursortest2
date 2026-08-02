package androidx.compose.foundation.text;

import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.unit.Density;

/* loaded from: classes3.dex */
public final class TextRangeLayoutModifier implements ParentDataModifier {
    public final CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0 measurePolicy;

    public TextRangeLayoutModifier(CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0 captureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0) {
        this.measurePolicy = captureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0;
    }

    public final CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0 getMeasurePolicy() {
        return this.measurePolicy;
    }

    @Override // androidx.compose.ui.layout.ParentDataModifier
    public final Object modifyParentData(Density density, Object obj) {
        return this;
    }
}
