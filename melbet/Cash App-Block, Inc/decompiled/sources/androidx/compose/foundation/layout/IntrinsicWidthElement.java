package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicWidthElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/IntrinsicWidthNode;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class IntrinsicWidthElement extends ModifierNodeElement {
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        IntrinsicSize intrinsicSize = IntrinsicSize.Max;
        IntrinsicWidthNode intrinsicWidthNode = new IntrinsicWidthNode();
        intrinsicWidthNode.width = intrinsicSize;
        intrinsicWidthNode.enforceIncoming = true;
        return intrinsicWidthNode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof IntrinsicWidthElement ? (IntrinsicWidthElement) obj : null) == null) {
            return false;
        }
        IntrinsicSize intrinsicSize = IntrinsicSize.Min;
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (IntrinsicSize.Max.hashCode() * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        IntrinsicWidthNode intrinsicWidthNode = (IntrinsicWidthNode) node;
        intrinsicWidthNode.width = IntrinsicSize.Max;
        intrinsicWidthNode.enforceIncoming = true;
    }
}
