package androidx.compose.foundation.text;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextToolbarState;
import androidx.compose.foundation.text.selection.SimpleLayoutKt;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextRange;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final /* synthetic */ class BasicTextFieldKt$$ExternalSyntheticLambda15 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TextFieldSelectionState f$0;

    public /* synthetic */ BasicTextFieldKt$$ExternalSyntheticLambda15(TextFieldSelectionState textFieldSelectionState, int i) {
        this.$r8$classId = i;
        this.f$0 = textFieldSelectionState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        LayoutCoordinates textLayoutCoordinates;
        Rect rect;
        int i = this.$r8$classId;
        TextFieldSelectionState textFieldSelectionState = this.f$0;
        switch (i) {
            case 0:
                return textFieldSelectionState.getSelectionHandleState$foundation(true, false);
            case 1:
                return textFieldSelectionState.getSelectionHandleState$foundation(false, false);
            case 2:
                return Boolean.valueOf(textFieldSelectionState.getCursorHandleState$foundation(false).visible);
            case 3:
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = textFieldSelectionState.textToolbarState$delegate;
                TransformedTextFieldState transformedTextFieldState = textFieldSelectionState.textFieldState;
                boolean m987getCollapsedimpl = TextRange.m987getCollapsedimpl(transformedTextFieldState.getVisualText().selection);
                if (((m987getCollapsedimpl && ((TextToolbarState) parcelableSnapshotMutableState.getValue()) == TextToolbarState.Cursor) || (!m987getCollapsedimpl && ((TextToolbarState) parcelableSnapshotMutableState.getValue()) == TextToolbarState.Selection)) && textFieldSelectionState.getDraggingHandle() == null && ((Boolean) textFieldSelectionState.isInTouchMode$delegate.getValue()).booleanValue() && (textLayoutCoordinates = textFieldSelectionState.getTextLayoutCoordinates()) != null) {
                    Rect visibleBounds = SimpleLayoutKt.visibleBounds(textLayoutCoordinates);
                    Rect m1180Recttz77jQw = DBUtil.m1180Recttz77jQw(textLayoutCoordinates.mo841localToRootMKHz9U(visibleBounds.m636getTopLeftF1C5BW0()), visibleBounds.m634getSizeNHjbRc());
                    LayoutCoordinates textLayoutCoordinates2 = textFieldSelectionState.getTextLayoutCoordinates();
                    if (textLayoutCoordinates2 != null) {
                        if (TextRange.m987getCollapsedimpl(transformedTextFieldState.getVisualText().selection)) {
                            Rect cursorRect = textFieldSelectionState.getCursorRect();
                            rect = DBUtil.m1180Recttz77jQw(textLayoutCoordinates2.mo841localToRootMKHz9U(cursorRect.m636getTopLeftF1C5BW0()), cursorRect.m634getSizeNHjbRc());
                        } else {
                            long mo841localToRootMKHz9U = textLayoutCoordinates2.mo841localToRootMKHz9U(textFieldSelectionState.m420getHandlePositiontuRUvjQ(true));
                            long mo841localToRootMKHz9U2 = textLayoutCoordinates2.mo841localToRootMKHz9U(textFieldSelectionState.m420getHandlePositiontuRUvjQ(false));
                            if (textFieldSelectionState.textLayoutState.getLayoutResult() == null) {
                                rect = Rect.Zero;
                            } else {
                                float intBitsToFloat = Float.intBitsToFloat((int) (textLayoutCoordinates2.mo841localToRootMKHz9U((Float.floatToRawIntBits(r0.getCursorRect((int) (r7 >> 32)).top) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32)) & BodyPartID.bodyIdMax));
                                float intBitsToFloat2 = Float.intBitsToFloat((int) (textLayoutCoordinates2.mo841localToRootMKHz9U((Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(r0.getCursorRect((int) (r7 & BodyPartID.bodyIdMax)).top) & BodyPartID.bodyIdMax)) & BodyPartID.bodyIdMax));
                                int i2 = (int) (mo841localToRootMKHz9U >> 32);
                                int i3 = (int) (mo841localToRootMKHz9U2 >> 32);
                                rect = new Rect(Math.min(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3)), Math.min(intBitsToFloat, intBitsToFloat2), Math.max(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3)), Math.max(Float.intBitsToFloat((int) (mo841localToRootMKHz9U & BodyPartID.bodyIdMax)), Float.intBitsToFloat((int) (mo841localToRootMKHz9U2 & BodyPartID.bodyIdMax))));
                            }
                        }
                        if (rect.overlaps(m1180Recttz77jQw)) {
                            return rect.intersect(m1180Recttz77jQw);
                        }
                    } else {
                        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("textLayoutCoordinates should not be null.");
                        OptionalProvider$$ExternalSyntheticLambda0.m$1();
                    }
                }
                return null;
            case 4:
                return (Rect) textFieldSelectionState.derivedVisibleContentBounds$delegate.getValue();
            default:
                return textFieldSelectionState.textFieldState.getVisualText();
        }
    }
}
