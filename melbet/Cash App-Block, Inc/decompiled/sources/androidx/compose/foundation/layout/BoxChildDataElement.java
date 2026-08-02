package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/BoxChildDataElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/BoxChildDataNode;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class BoxChildDataElement extends ModifierNodeElement {
    public final Alignment alignment;
    public final boolean matchParentSize;

    public BoxChildDataElement(Alignment alignment, boolean z) {
        this.alignment = alignment;
        this.matchParentSize = z;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        BoxChildDataNode boxChildDataNode = new BoxChildDataNode();
        boxChildDataNode.alignment = this.alignment;
        boxChildDataNode.matchParentSize = this.matchParentSize;
        return boxChildDataNode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        BoxChildDataElement boxChildDataElement = obj instanceof BoxChildDataElement ? (BoxChildDataElement) obj : null;
        return boxChildDataElement != null && Intrinsics.areEqual(this.alignment, boxChildDataElement.alignment) && this.matchParentSize == boxChildDataElement.matchParentSize;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.matchParentSize) + (this.alignment.hashCode() * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        BoxChildDataNode boxChildDataNode = (BoxChildDataNode) node;
        boxChildDataNode.alignment = this.alignment;
        boxChildDataNode.matchParentSize = this.matchParentSize;
    }
}
