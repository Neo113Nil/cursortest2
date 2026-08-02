package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.OffsetProvider;

/* loaded from: classes3.dex */
public final class BasicTextFieldKt$TextFieldCursorHandle$1$1 implements OffsetProvider {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TextFieldSelectionState $selectionState;

    public /* synthetic */ BasicTextFieldKt$TextFieldCursorHandle$1$1(TextFieldSelectionState textFieldSelectionState, int i) {
        this.$r8$classId = i;
        this.$selectionState = textFieldSelectionState;
    }

    @Override // androidx.compose.foundation.text.selection.OffsetProvider
    /* renamed from: provide-F1C5BW0, reason: not valid java name */
    public final long mo345provideF1C5BW0() {
        switch (this.$r8$classId) {
            case 0:
                return this.$selectionState.getCursorHandleState$foundation(true).position;
            case 1:
                return this.$selectionState.getSelectionHandleState$foundation(true, true).position;
            default:
                return this.$selectionState.getSelectionHandleState$foundation(false, true).position;
        }
    }
}
