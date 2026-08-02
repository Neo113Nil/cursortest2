package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerInputChange;

/* loaded from: classes3.dex */
public final class DragDetectionState$AwaitGesturePickup extends Draggable2DKt {
    public PointerInputChange initialDown = null;
    public long pointerId = Long.MAX_VALUE;

    public final PointerInputChange getInitialDown() {
        return this.initialDown;
    }

    /* renamed from: getPointerId-J3iCeTQ, reason: not valid java name */
    public final long m199getPointerIdJ3iCeTQ() {
        return this.pointerId;
    }

    public final void setInitialDown(PointerInputChange pointerInputChange) {
        this.initialDown = pointerInputChange;
    }

    /* renamed from: setPointerId-0FcD4WY, reason: not valid java name */
    public final void m200setPointerId0FcD4WY(long j) {
        this.pointerId = j;
    }
}
