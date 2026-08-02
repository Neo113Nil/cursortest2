package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionAdjustment$Companion;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class LongPressTextDragObserverKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TextDragObserver f$0;

    public /* synthetic */ LongPressTextDragObserverKt$$ExternalSyntheticLambda0(TextDragObserver textDragObserver, int i) {
        this.$r8$classId = i;
        this.f$0 = textDragObserver;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        TextDragObserver textDragObserver = this.f$0;
        switch (i) {
            case 0:
                textDragObserver.mo367onStart3MmeM6k(((Offset) obj).packedValue, SelectionAdjustment$Companion.None);
                break;
            case 1:
                PointerInputChange pointerInputChange = (PointerInputChange) obj;
                textDragObserver.mo366onDragk4lQ0M(PointerEventKt.positionChangeInternal(pointerInputChange, false));
                pointerInputChange.consume();
                break;
            default:
                PointerInputChange pointerInputChange2 = (PointerInputChange) obj;
                textDragObserver.mo366onDragk4lQ0M(PointerEventKt.positionChangeInternal(pointerInputChange2, false));
                pointerInputChange2.consume();
                break;
        }
        return Unit.INSTANCE;
    }
}
