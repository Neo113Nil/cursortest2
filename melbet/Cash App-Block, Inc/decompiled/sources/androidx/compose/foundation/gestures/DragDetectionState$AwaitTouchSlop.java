package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerInputChange;

/* loaded from: classes3.dex */
public final class DragDetectionState$AwaitTouchSlop extends Draggable2DKt {
    public PointerInputChange initialDown = null;
    public long pointerId = Long.MAX_VALUE;
    public boolean verifyConsumptionInFinalPass = false;

    public final PointerInputChange getInitialDown() {
        return this.initialDown;
    }

    /* renamed from: getPointerId-J3iCeTQ, reason: not valid java name */
    public final long m201getPointerIdJ3iCeTQ() {
        return this.pointerId;
    }

    public final boolean getVerifyConsumptionInFinalPass() {
        return this.verifyConsumptionInFinalPass;
    }

    public final void setInitialDown(PointerInputChange pointerInputChange) {
        this.initialDown = pointerInputChange;
    }

    /* renamed from: setPointerId-0FcD4WY, reason: not valid java name */
    public final void m202setPointerId0FcD4WY(long j) {
        this.pointerId = j;
    }

    public final void setVerifyConsumptionInFinalPass(boolean z) {
        this.verifyConsumptionInFinalPass = z;
    }
}
