package androidx.compose.foundation.layout;

import androidx.compose.foundation.GestureNodeKt$$ExternalSyntheticLambda0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/OffsetPxElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/OffsetPxNode;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class OffsetPxElement extends ModifierNodeElement {
    public final GestureNodeKt$$ExternalSyntheticLambda0 inspectorInfo;
    public final Function1 offset;

    public OffsetPxElement(Function1 function1, GestureNodeKt$$ExternalSyntheticLambda0 gestureNodeKt$$ExternalSyntheticLambda0) {
        this.offset = function1;
        this.inspectorInfo = gestureNodeKt$$ExternalSyntheticLambda0;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        OffsetPxNode offsetPxNode = new OffsetPxNode();
        offsetPxNode.offset = this.offset;
        offsetPxNode.rtlAware = true;
        return offsetPxNode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetPxElement offsetPxElement = obj instanceof OffsetPxElement ? (OffsetPxElement) obj : null;
        return offsetPxElement != null && this.offset == offsetPxElement.offset;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.offset.hashCode() * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    public final String toString() {
        return "OffsetPxModifier(offset=" + this.offset + ", rtlAware=true)";
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        OffsetPxNode offsetPxNode = (OffsetPxNode) node;
        Function1 function1 = offsetPxNode.offset;
        Function1 function12 = this.offset;
        if (function1 != function12 || !offsetPxNode.rtlAware) {
            DepthSortedSetKt.requireLayoutNode(offsetPxNode).requestRelayout$ui(false);
        }
        offsetPxNode.offset = function12;
        offsetPxNode.rtlAware = true;
    }
}
