package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.material.SliderDraggableState$drag$2;
import com.squareup.cash.arcade.components.ToastKt$Toast$8$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;

/* loaded from: classes3.dex */
public final class DraggableNode extends DragGestureNode {
    public Function3 onDragStarted;
    public Function3 onDragStopped;
    public Orientation orientation;
    public boolean reverseDirection;
    public boolean startDragImmediately;
    public DraggableState state;

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final Object drag(DragGestureNode$startListeningForEvents$1 dragGestureNode$startListeningForEvents$1, DragGestureNode$startListeningForEvents$1 dragGestureNode$startListeningForEvents$12) {
        Object drag = this.state.drag(MutatePriority.UserInput, new SliderDraggableState$drag$2(dragGestureNode$startListeningForEvents$1, this, (Continuation) null, 19), dragGestureNode$startListeningForEvents$12);
        return drag == CoroutineSingletons.COROUTINE_SUSPENDED ? drag : Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: onDragStarted-k-4lQ0M */
    public final void mo192onDragStartedk4lQ0M(long j) {
        if (!isAttached() || Intrinsics.areEqual(this.onDragStarted, DraggableKt.NoOpOnDragStarted)) {
            return;
        }
        JobKt.launch$default(getCoroutineScope(), null, CoroutineStart.UNDISPATCHED, new ToastKt$Toast$8$1(this, j, (Continuation) null, 4), 1);
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final void onDragStopped(DragEvent.DragStopped dragStopped) {
        if (!isAttached() || Intrinsics.areEqual(this.onDragStopped, DraggableKt.NoOpOnDragStopped)) {
            return;
        }
        JobKt.launch$default(getCoroutineScope(), null, CoroutineStart.UNDISPATCHED, new SliderDraggableState$drag$2(this, dragStopped, (Continuation) null, 20), 1);
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final boolean startDragImmediately() {
        return this.startDragImmediately;
    }
}
