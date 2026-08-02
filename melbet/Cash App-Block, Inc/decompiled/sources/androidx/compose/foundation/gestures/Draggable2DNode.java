package androidx.compose.foundation.gestures;

import androidx.camera.camera2.pipe.compat.VirtualCameraState$connect$2$1;
import androidx.camera.video.Recorder;
import androidx.compose.foundation.BorderKt$$ExternalSyntheticLambda1;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.material.SliderDraggableState$drag$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.JobKt;

/* loaded from: classes3.dex */
public final class Draggable2DNode extends DragGestureNode {
    public BorderKt$$ExternalSyntheticLambda1 onDragStarted;
    public BorderKt$$ExternalSyntheticLambda1 onDragStopped;
    public Recorder.AnonymousClass3 state;

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final Object drag(DragGestureNode$startListeningForEvents$1 dragGestureNode$startListeningForEvents$1, DragGestureNode$startListeningForEvents$1 dragGestureNode$startListeningForEvents$12) {
        Recorder.AnonymousClass3 anonymousClass3 = this.state;
        MutatePriority mutatePriority = MutatePriority.Default;
        SliderDraggableState$drag$2 sliderDraggableState$drag$2 = new SliderDraggableState$drag$2(dragGestureNode$startListeningForEvents$1, this, (Continuation) null, 18);
        anonymousClass3.getClass();
        Object coroutineScope = JobKt.coroutineScope(new VirtualCameraState$connect$2$1(anonymousClass3, sliderDraggableState$drag$2, (Continuation) null), dragGestureNode$startListeningForEvents$12);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (coroutineScope != coroutineSingletons) {
            coroutineScope = Unit.INSTANCE;
        }
        return coroutineScope == coroutineSingletons ? coroutineScope : Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: onDragStarted-k-4lQ0M */
    public final void mo192onDragStartedk4lQ0M(long j) {
        this.onDragStarted.getClass();
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final void onDragStopped(DragEvent.DragStopped dragStopped) {
        BorderKt$$ExternalSyntheticLambda1 borderKt$$ExternalSyntheticLambda1 = this.onDragStopped;
        long j = dragStopped.velocity;
        borderKt$$ExternalSyntheticLambda1.getClass();
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final boolean startDragImmediately() {
        return false;
    }
}
