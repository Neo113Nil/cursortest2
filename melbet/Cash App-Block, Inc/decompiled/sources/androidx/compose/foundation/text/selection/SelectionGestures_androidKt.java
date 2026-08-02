package androidx.compose.foundation.text.selection;

import android.view.MotionEvent;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class SelectionGestures_androidKt {
    public static final SelectionAdjustment$Companion$$ExternalSyntheticLambda0 FirstLongPressSelectionAdjustment = SelectionAdjustment$Companion.Word;

    public static final boolean isMouseOrTouchPad(PointerEvent pointerEvent) {
        MotionEvent motionEvent;
        List list = pointerEvent.changes;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (((PointerInputChange) list.get(i)).f859type == 2) {
                i++;
            } else {
                MotionEvent motionEvent2 = pointerEvent.getMotionEvent();
                if ((motionEvent2 == null || !motionEvent2.isFromSource(8194)) && ((motionEvent = pointerEvent.getMotionEvent()) == null || !motionEvent.isFromSource(1048584))) {
                    return false;
                }
            }
        }
        return true;
    }
}
