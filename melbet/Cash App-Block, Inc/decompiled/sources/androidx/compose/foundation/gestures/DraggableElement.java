package androidx.compose.foundation.gestures;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.foundation.BorderKt$$ExternalSyntheticLambda1;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.io.LinesSequence;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/DraggableElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/gestures/DraggableNode;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DraggableElement extends ModifierNodeElement {
    public static final BorderKt$$ExternalSyntheticLambda1 CanDrag = new BorderKt$$ExternalSyntheticLambda1(26);
    public final boolean enabled;
    public final MutableInteractionSourceImpl interactionSource;
    public final Function3 onDragStarted;
    public final Function3 onDragStopped;
    public final Orientation orientation;
    public final boolean reverseDirection;
    public final boolean startDragImmediately;
    public final DraggableState state;

    public DraggableElement(DraggableState draggableState, Orientation orientation, boolean z, MutableInteractionSourceImpl mutableInteractionSourceImpl, boolean z2, Function3 function3, Function3 function32, boolean z3) {
        this.state = draggableState;
        this.orientation = orientation;
        this.enabled = z;
        this.interactionSource = mutableInteractionSourceImpl;
        this.startDragImmediately = z2;
        this.onDragStarted = function3;
        this.onDragStopped = function32;
        this.reverseDirection = z3;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        BorderKt$$ExternalSyntheticLambda1 borderKt$$ExternalSyntheticLambda1 = CanDrag;
        boolean z = this.enabled;
        MutableInteractionSourceImpl mutableInteractionSourceImpl = this.interactionSource;
        Orientation orientation = this.orientation;
        DraggableNode draggableNode = new DraggableNode(borderKt$$ExternalSyntheticLambda1, z, mutableInteractionSourceImpl, orientation);
        draggableNode.state = this.state;
        draggableNode.orientation = orientation;
        draggableNode.startDragImmediately = this.startDragImmediately;
        draggableNode.onDragStarted = this.onDragStarted;
        draggableNode.onDragStopped = this.onDragStopped;
        draggableNode.reverseDirection = this.reverseDirection;
        return draggableNode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DraggableElement.class != obj.getClass()) {
            return false;
        }
        DraggableElement draggableElement = (DraggableElement) obj;
        return Intrinsics.areEqual(this.state, draggableElement.state) && this.orientation == draggableElement.orientation && this.enabled == draggableElement.enabled && Intrinsics.areEqual(this.interactionSource, draggableElement.interactionSource) && this.startDragImmediately == draggableElement.startDragImmediately && Intrinsics.areEqual(this.onDragStarted, draggableElement.onDragStarted) && Intrinsics.areEqual(this.onDragStopped, draggableElement.onDragStopped) && this.reverseDirection == draggableElement.reverseDirection;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.orientation.hashCode() + (this.state.hashCode() * 31)) * 31, 31, this.enabled);
        MutableInteractionSourceImpl mutableInteractionSourceImpl = this.interactionSource;
        return Boolean.hashCode(this.reverseDirection) + Recorder$$ExternalSyntheticOutline1.m(this.onDragStopped, Recorder$$ExternalSyntheticOutline1.m(this.onDragStarted, JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (mutableInteractionSourceImpl != null ? mutableInteractionSourceImpl.hashCode() : 0)) * 31, 31, this.startDragImmediately), 31), 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.name = "draggable";
        LinesSequence linesSequence = inspectorInfo.properties;
        linesSequence.set(this.orientation, "orientation");
        linesSequence.set(Boolean.valueOf(this.enabled), "enabled");
        linesSequence.set(Boolean.valueOf(this.reverseDirection), "reverseDirection");
        linesSequence.set(this.interactionSource, "interactionSource");
        linesSequence.set(Boolean.valueOf(this.startDragImmediately), "startDragImmediately");
        linesSequence.set(this.onDragStarted, "onDragStarted");
        linesSequence.set(this.onDragStopped, "onDragStopped");
        linesSequence.set(this.state, "state");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        boolean z;
        boolean z2;
        DraggableNode draggableNode = (DraggableNode) node;
        DraggableState draggableState = draggableNode.state;
        DraggableState draggableState2 = this.state;
        if (Intrinsics.areEqual(draggableState, draggableState2)) {
            z = false;
        } else {
            draggableNode.state = draggableState2;
            z = true;
        }
        Orientation orientation = draggableNode.orientation;
        Orientation orientation2 = this.orientation;
        if (orientation != orientation2) {
            draggableNode.orientation = orientation2;
            z = true;
        }
        boolean z3 = draggableNode.reverseDirection;
        boolean z4 = this.reverseDirection;
        if (z3 != z4) {
            draggableNode.reverseDirection = z4;
            z2 = true;
        } else {
            z2 = z;
        }
        draggableNode.onDragStarted = this.onDragStarted;
        draggableNode.onDragStopped = this.onDragStopped;
        draggableNode.startDragImmediately = this.startDragImmediately;
        draggableNode.update(CanDrag, this.enabled, this.interactionSource, orientation2, z2);
    }
}
