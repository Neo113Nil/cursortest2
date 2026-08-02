package androidx.compose.foundation.gestures;

import androidx.camera.camera2.pipe.compat.VirtualCameraState$connect$2$1;
import androidx.camera.video.Recorder;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BorderKt$$ExternalSyntheticLambda1;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import androidx.compose.material.ModalBottomSheetState$$ExternalSyntheticLambda1;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.paging.PagingDataPresenter$collectFrom$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.intercept.EngineInterceptor$intercept$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class AnchoredDraggableNode extends DragGestureNode {
    public Density density;
    public FlingBehavior flingBehavior;
    public Orientation orientation;
    public FlingBehavior resolvedFlingBehavior;
    public Boolean startDragImmediately;
    public AnchoredDraggableState state;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$fling(AnchoredDraggableNode anchoredDraggableNode, float f, ContinuationImpl continuationImpl) {
        AnchoredDraggableNode$fling$1 anchoredDraggableNode$fling$1;
        int i;
        Ref$FloatRef ref$FloatRef;
        if (continuationImpl instanceof AnchoredDraggableNode$fling$1) {
            anchoredDraggableNode$fling$1 = (AnchoredDraggableNode$fling$1) continuationImpl;
            int i2 = anchoredDraggableNode$fling$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                anchoredDraggableNode$fling$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = anchoredDraggableNode$fling$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = anchoredDraggableNode$fling$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (anchoredDraggableNode.state.getUsePreModifierChangeBehavior$foundation()) {
                        AnchoredDraggableState anchoredDraggableState = anchoredDraggableNode.state;
                        anchoredDraggableNode$fling$1.label = 1;
                        Object obj3 = anchoredDraggableState.settle(f, anchoredDraggableNode$fling$1);
                        if (obj3 != obj2) {
                            return obj3;
                        }
                    } else {
                        Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
                        ref$FloatRef2.element = f;
                        AnchoredDraggableState anchoredDraggableState2 = anchoredDraggableNode.state;
                        Continuation continuation = null;
                        AnchoredDraggableNode$fling$2 anchoredDraggableNode$fling$2 = new AnchoredDraggableNode$fling$2(anchoredDraggableNode, ref$FloatRef2, f, null);
                        anchoredDraggableNode$fling$1.L$0 = ref$FloatRef2;
                        anchoredDraggableNode$fling$1.label = 2;
                        MutatePriority mutatePriority = MutatePriority.Default;
                        MutatorMutex mutatorMutex = anchoredDraggableState2.dragMutex;
                        PagingDataPresenter$collectFrom$2 pagingDataPresenter$collectFrom$2 = new PagingDataPresenter$collectFrom$2(anchoredDraggableState2, anchoredDraggableNode$fling$2, continuation, 3);
                        mutatorMutex.getClass();
                        Object coroutineScope = JobKt.coroutineScope(new EngineInterceptor$intercept$2(mutatePriority, mutatorMutex, pagingDataPresenter$collectFrom$2, continuation, 3), anchoredDraggableNode$fling$1);
                        if (coroutineScope != obj2) {
                            coroutineScope = Unit.INSTANCE;
                        }
                        if (coroutineScope != obj2) {
                            ref$FloatRef = ref$FloatRef2;
                        }
                    }
                    return obj2;
                }
                if (i == 1) {
                    SafeTrace.throwOnFailure(obj);
                    return obj;
                }
                if (i != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ref$FloatRef = anchoredDraggableNode$fling$1.L$0;
                SafeTrace.throwOnFailure(obj);
                return new Float(ref$FloatRef.element);
            }
        }
        anchoredDraggableNode$fling$1 = new AnchoredDraggableNode$fling$1(anchoredDraggableNode, continuationImpl);
        Object obj4 = anchoredDraggableNode$fling$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = anchoredDraggableNode$fling$1.label;
        if (i != 0) {
        }
        return new Float(ref$FloatRef.element);
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final Object drag(DragGestureNode$startListeningForEvents$1 dragGestureNode$startListeningForEvents$1, DragGestureNode$startListeningForEvents$1 dragGestureNode$startListeningForEvents$12) {
        AnchoredDraggableState anchoredDraggableState = this.state;
        Continuation continuation = null;
        AnchoredDraggableNode$drag$2 anchoredDraggableNode$drag$2 = new AnchoredDraggableNode$drag$2(dragGestureNode$startListeningForEvents$1, this, continuation, 0);
        MutatePriority mutatePriority = MutatePriority.Default;
        MutatorMutex mutatorMutex = anchoredDraggableState.dragMutex;
        PagingDataPresenter$collectFrom$2 pagingDataPresenter$collectFrom$2 = new PagingDataPresenter$collectFrom$2(anchoredDraggableState, anchoredDraggableNode$drag$2, continuation, 3);
        mutatorMutex.getClass();
        Object coroutineScope = JobKt.coroutineScope(new EngineInterceptor$intercept$2(mutatePriority, mutatorMutex, pagingDataPresenter$collectFrom$2, continuation, 3), dragGestureNode$startListeningForEvents$12);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (coroutineScope != coroutineSingletons) {
            coroutineScope = Unit.INSTANCE;
        }
        return coroutineScope == coroutineSingletons ? coroutineScope : Unit.INSTANCE;
    }

    public final boolean isReverseDirection$1() {
        return DepthSortedSetKt.requireLayoutNode(this).layoutDirection == LayoutDirection.Rtl && this.orientation == Orientation.Horizontal;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        updateFlingBehavior(this.flingBehavior);
    }

    @Override // androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public final void onDensityChange() {
        onCancelPointerInput();
        if (isAttached()) {
            Density density = DepthSortedSetKt.requireLayoutNode(this).density;
            Density density2 = this.density;
            if (density2 == null || !Intrinsics.areEqual(density2, density)) {
                this.density = density;
                updateFlingBehavior(this.flingBehavior);
            }
        }
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: onDragStarted-k-4lQ0M, reason: not valid java name */
    public final void mo192onDragStartedk4lQ0M(long j) {
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final void onDragStopped(DragEvent.DragStopped dragStopped) {
        if (isAttached()) {
            JobKt.launch$default(getCoroutineScope(), null, null, new VirtualCameraState$connect$2$1(this, dragStopped, null, 17), 3);
        }
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final boolean startDragImmediately() {
        Boolean bool = this.startDragImmediately;
        return bool != null ? bool.booleanValue() : this.state.isAnimationRunning();
    }

    public final void updateFlingBehavior(FlingBehavior flingBehavior) {
        if (flingBehavior == null) {
            TweenSpec tweenSpec = AnchoredDraggableDefaults.SnapAnimationSpec;
            BorderKt$$ExternalSyntheticLambda1 borderKt$$ExternalSyntheticLambda1 = AnchoredDraggableDefaults.PositionalThreshold;
            Density density = DepthSortedSetKt.requireLayoutNode(this).density;
            this.density = density;
            AnchoredDraggableState anchoredDraggableState = this.state;
            flingBehavior = new SnapFlingBehavior(new Recorder.AnonymousClass3(12, anchoredDraggableState, borderKt$$ExternalSyntheticLambda1, new ModalBottomSheetState$$ExternalSyntheticLambda1(density, 1)), Draggable2DKt.NoOpDecayAnimationSpec, tweenSpec);
        }
        this.resolvedFlingBehavior = flingBehavior;
    }
}
