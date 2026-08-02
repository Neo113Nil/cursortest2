package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.paging.HintHandler$$ExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/material/DraggableAnchorsElement;", "T", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/material/DraggableAnchorsNode;", "material"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class DraggableAnchorsElement<T> extends ModifierNodeElement {
    public final HintHandler$$ExternalSyntheticLambda0 anchors;
    public final AnchoredDraggableState state;

    public DraggableAnchorsElement(AnchoredDraggableState anchoredDraggableState, HintHandler$$ExternalSyntheticLambda0 hintHandler$$ExternalSyntheticLambda0) {
        Orientation orientation = Orientation.Vertical;
        this.state = anchoredDraggableState;
        this.anchors = hintHandler$$ExternalSyntheticLambda0;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        Orientation orientation = Orientation.Vertical;
        DraggableAnchorsNode draggableAnchorsNode = new DraggableAnchorsNode();
        draggableAnchorsNode.state = this.state;
        draggableAnchorsNode.anchors = this.anchors;
        draggableAnchorsNode.orientation = orientation;
        return draggableAnchorsNode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraggableAnchorsElement)) {
            return false;
        }
        DraggableAnchorsElement draggableAnchorsElement = (DraggableAnchorsElement) obj;
        if (!Intrinsics.areEqual(this.state, draggableAnchorsElement.state) || this.anchors != draggableAnchorsElement.anchors) {
            return false;
        }
        Orientation orientation = Orientation.Vertical;
        return true;
    }

    public final int hashCode() {
        return Orientation.Vertical.hashCode() + ((this.anchors.hashCode() + (this.state.hashCode() * 31)) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        DraggableAnchorsNode draggableAnchorsNode = (DraggableAnchorsNode) node;
        draggableAnchorsNode.state = this.state;
        draggableAnchorsNode.anchors = this.anchors;
        draggableAnchorsNode.orientation = Orientation.Vertical;
    }
}
