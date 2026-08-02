package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicHeightElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/IntrinsicHeightNode;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class IntrinsicHeightElement extends ModifierNodeElement {
    public final IntrinsicSize height;

    public IntrinsicHeightElement(IntrinsicSize intrinsicSize) {
        this.height = intrinsicSize;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        IntrinsicHeightNode intrinsicHeightNode = new IntrinsicHeightNode();
        intrinsicHeightNode.height = this.height;
        intrinsicHeightNode.enforceIncoming = true;
        return intrinsicHeightNode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        IntrinsicHeightElement intrinsicHeightElement = obj instanceof IntrinsicHeightElement ? (IntrinsicHeightElement) obj : null;
        return intrinsicHeightElement != null && this.height == intrinsicHeightElement.height;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.height.hashCode() * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        IntrinsicHeightNode intrinsicHeightNode = (IntrinsicHeightNode) node;
        intrinsicHeightNode.height = this.height;
        intrinsicHeightNode.enforceIncoming = true;
    }
}
