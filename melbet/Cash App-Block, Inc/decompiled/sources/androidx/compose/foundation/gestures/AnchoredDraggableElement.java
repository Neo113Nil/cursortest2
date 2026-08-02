package androidx.compose.foundation.gestures;

import androidx.compose.foundation.BorderKt$$ExternalSyntheticLambda1;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.io.LinesSequence;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/gestures/AnchoredDraggableElement;", "T", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/gestures/AnchoredDraggableNode;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AnchoredDraggableElement<T> extends ModifierNodeElement {
    public final boolean enabled;
    public final FlingBehavior flingBehavior;
    public final MutableInteractionSourceImpl interactionSource;
    public final Orientation orientation;
    public final Boolean startDragImmediately;
    public final AnchoredDraggableState state;

    public AnchoredDraggableElement(AnchoredDraggableState anchoredDraggableState, Orientation orientation, boolean z, MutableInteractionSourceImpl mutableInteractionSourceImpl, Boolean bool, FlingBehavior flingBehavior) {
        this.state = anchoredDraggableState;
        this.orientation = orientation;
        this.enabled = z;
        this.interactionSource = mutableInteractionSourceImpl;
        this.startDragImmediately = bool;
        this.flingBehavior = flingBehavior;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        BorderKt$$ExternalSyntheticLambda1 borderKt$$ExternalSyntheticLambda1 = Draggable2DKt.AlwaysDrag;
        boolean z = this.enabled;
        MutableInteractionSourceImpl mutableInteractionSourceImpl = this.interactionSource;
        Orientation orientation = this.orientation;
        AnchoredDraggableNode anchoredDraggableNode = new AnchoredDraggableNode(borderKt$$ExternalSyntheticLambda1, z, mutableInteractionSourceImpl, orientation);
        anchoredDraggableNode.state = this.state;
        anchoredDraggableNode.orientation = orientation;
        anchoredDraggableNode.startDragImmediately = this.startDragImmediately;
        anchoredDraggableNode.flingBehavior = this.flingBehavior;
        return anchoredDraggableNode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnchoredDraggableElement)) {
            return false;
        }
        AnchoredDraggableElement anchoredDraggableElement = (AnchoredDraggableElement) obj;
        return Intrinsics.areEqual(this.state, anchoredDraggableElement.state) && this.orientation == anchoredDraggableElement.orientation && this.enabled == anchoredDraggableElement.enabled && Intrinsics.areEqual(this.interactionSource, anchoredDraggableElement.interactionSource) && Intrinsics.areEqual(this.startDragImmediately, anchoredDraggableElement.startDragImmediately) && Intrinsics.areEqual(this.flingBehavior, anchoredDraggableElement.flingBehavior);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.orientation.hashCode() + (this.state.hashCode() * 31)) * 31, 961, this.enabled);
        MutableInteractionSourceImpl mutableInteractionSourceImpl = this.interactionSource;
        int hashCode = (m + (mutableInteractionSourceImpl != null ? mutableInteractionSourceImpl.hashCode() : 0)) * 31;
        Boolean bool = this.startDragImmediately;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 961;
        FlingBehavior flingBehavior = this.flingBehavior;
        return hashCode2 + (flingBehavior != null ? flingBehavior.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.name = "anchoredDraggable";
        LinesSequence linesSequence = inspectorInfo.properties;
        linesSequence.set(this.state, "state");
        linesSequence.set(this.orientation, "orientation");
        linesSequence.set(Boolean.valueOf(this.enabled), "enabled");
        linesSequence.set(null, "reverseDirection");
        linesSequence.set(this.interactionSource, "interactionSource");
        linesSequence.set(this.startDragImmediately, "startDragImmediately");
        linesSequence.set(null, "overscrollEffect");
        linesSequence.set(this.flingBehavior, "flingBehavior");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        boolean z;
        boolean z2;
        AnchoredDraggableNode anchoredDraggableNode = (AnchoredDraggableNode) node;
        FlingBehavior flingBehavior = this.flingBehavior;
        anchoredDraggableNode.flingBehavior = flingBehavior;
        AnchoredDraggableState anchoredDraggableState = anchoredDraggableNode.state;
        AnchoredDraggableState anchoredDraggableState2 = this.state;
        if (Intrinsics.areEqual(anchoredDraggableState, anchoredDraggableState2)) {
            z = false;
        } else {
            anchoredDraggableNode.state = anchoredDraggableState2;
            anchoredDraggableNode.updateFlingBehavior(flingBehavior);
            z = true;
        }
        Orientation orientation = anchoredDraggableNode.orientation;
        Orientation orientation2 = this.orientation;
        if (orientation != orientation2) {
            anchoredDraggableNode.orientation = orientation2;
            z2 = true;
        } else {
            z2 = z;
        }
        anchoredDraggableNode.startDragImmediately = this.startDragImmediately;
        anchoredDraggableNode.update(anchoredDraggableNode.canDrag, this.enabled, this.interactionSource, orientation2, z2);
    }
}
