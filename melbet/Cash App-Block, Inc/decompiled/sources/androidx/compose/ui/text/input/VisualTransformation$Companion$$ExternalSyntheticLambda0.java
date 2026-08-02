package androidx.compose.ui.text.input;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.OffsetMapping;
import com.stripe.android.uicore.elements.PhoneNumberFormatter$UnknownRegion$visualTransformation$1$1;
import org.slf4j.Marker;

/* loaded from: classes3.dex */
public final /* synthetic */ class VisualTransformation$Companion$$ExternalSyntheticLambda0 implements VisualTransformation {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ VisualTransformation$Companion$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // androidx.compose.ui.text.input.VisualTransformation
    public final TransformedText filter(AnnotatedString annotatedString) {
        switch (this.$r8$classId) {
            case 0:
                return new TransformedText(annotatedString, OffsetMapping.Companion.Identity);
            default:
                annotatedString.getClass();
                return new TransformedText(new AnnotatedString(Recorder$$ExternalSyntheticOutline2.m(Marker.ANY_NON_NULL_MARKER, annotatedString.text)), new PhoneNumberFormatter$UnknownRegion$visualTransformation$1$1());
        }
    }
}
