package androidx.compose.foundation.text.input.internal.selection;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class TextFieldSelectionState$cursorHandleGestures$2$3$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TextFieldSelectionState f$0;

    public /* synthetic */ TextFieldSelectionState$cursorHandleGestures$2$3$$ExternalSyntheticLambda0(TextFieldSelectionState textFieldSelectionState, int i) {
        this.$r8$classId = i;
        this.f$0 = textFieldSelectionState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        TextFieldSelectionState textFieldSelectionState = this.f$0;
        switch (i) {
            case 0:
                TextToolbarState textToolbarState = (TextToolbarState) textFieldSelectionState.textToolbarState$delegate.getValue();
                TextToolbarState textToolbarState2 = TextToolbarState.Cursor;
                if (textToolbarState == textToolbarState2) {
                    textToolbarState2 = TextToolbarState.None;
                }
                textFieldSelectionState.setTextToolbarState(textToolbarState2);
                break;
            default:
                textFieldSelectionState.clearHandleDragging();
                break;
        }
        return Unit.INSTANCE;
    }
}
