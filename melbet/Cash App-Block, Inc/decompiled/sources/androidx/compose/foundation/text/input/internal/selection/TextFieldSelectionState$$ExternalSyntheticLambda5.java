package androidx.compose.foundation.text.input.internal.selection;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref$LongRef;

/* loaded from: classes3.dex */
public final /* synthetic */ class TextFieldSelectionState$$ExternalSyntheticLambda5 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Ref$LongRef f$0;
    public final /* synthetic */ Ref$LongRef f$1;
    public final /* synthetic */ TextFieldSelectionState f$2;

    public /* synthetic */ TextFieldSelectionState$$ExternalSyntheticLambda5(Ref$LongRef ref$LongRef, TextFieldSelectionState textFieldSelectionState, Ref$LongRef ref$LongRef2, int i) {
        this.$r8$classId = i;
        this.f$0 = ref$LongRef;
        this.f$2 = textFieldSelectionState;
        this.f$1 = ref$LongRef2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Ref$LongRef ref$LongRef = this.f$1;
        TextFieldSelectionState textFieldSelectionState = this.f$2;
        Ref$LongRef ref$LongRef2 = this.f$0;
        switch (i) {
            case 0:
                TextFieldSelectionState.detectCursorHandleDragGestures$onDragStop(textFieldSelectionState, ref$LongRef2, ref$LongRef);
                break;
            case 1:
                TextFieldSelectionState.detectSelectionHandleDragGestures$onDragStop(textFieldSelectionState, ref$LongRef2, ref$LongRef);
                break;
            case 2:
                TextFieldSelectionState.detectCursorHandleDragGestures$onDragStop(textFieldSelectionState, ref$LongRef2, ref$LongRef);
                break;
            default:
                TextFieldSelectionState.detectSelectionHandleDragGestures$onDragStop(textFieldSelectionState, ref$LongRef2, ref$LongRef);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ TextFieldSelectionState$$ExternalSyntheticLambda5(Ref$LongRef ref$LongRef, Ref$LongRef ref$LongRef2, TextFieldSelectionState textFieldSelectionState, int i) {
        this.$r8$classId = i;
        this.f$0 = ref$LongRef;
        this.f$1 = ref$LongRef2;
        this.f$2 = textFieldSelectionState;
    }
}
