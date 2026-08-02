package androidx.compose.material3.internal;

import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/material3/internal/DraggableAnchorsElementV2;", "T", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/material3/internal/DraggableAnchorsNodeV2;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class DraggableAnchorsElementV2<T> extends ModifierNodeElement {
    public final Function2 anchors;
    public final AnchoredDraggableState state;

    public DraggableAnchorsElementV2(AnchoredDraggableState anchoredDraggableState, Function2 function2) {
        Orientation orientation = Orientation.Vertical;
        this.state = anchoredDraggableState;
        this.anchors = function2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        Orientation orientation = Orientation.Horizontal;
        DraggableAnchorsNodeV2 draggableAnchorsNodeV2 = new DraggableAnchorsNodeV2();
        draggableAnchorsNodeV2.state = this.state;
        draggableAnchorsNodeV2.anchors = this.anchors;
        draggableAnchorsNodeV2.orientation = orientation;
        return draggableAnchorsNodeV2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraggableAnchorsElementV2)) {
            return false;
        }
        DraggableAnchorsElementV2 draggableAnchorsElementV2 = (DraggableAnchorsElementV2) obj;
        if (!Intrinsics.areEqual(this.state, draggableAnchorsElementV2.state) || this.anchors != draggableAnchorsElementV2.anchors) {
            return false;
        }
        Orientation orientation = Orientation.Vertical;
        return true;
    }

    public final int hashCode() {
        return Orientation.Horizontal.hashCode() + ((this.anchors.hashCode() + (this.state.hashCode() * 31)) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        DraggableAnchorsNodeV2 draggableAnchorsNodeV2 = (DraggableAnchorsNodeV2) node;
        draggableAnchorsNodeV2.state = this.state;
        draggableAnchorsNodeV2.anchors = this.anchors;
        draggableAnchorsNodeV2.orientation = Orientation.Horizontal;
    }
}
