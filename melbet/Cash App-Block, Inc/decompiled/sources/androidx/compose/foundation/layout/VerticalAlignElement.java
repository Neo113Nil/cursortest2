package androidx.compose.foundation.layout;

import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/VerticalAlignElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/VerticalAlignNode;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VerticalAlignElement extends ModifierNodeElement {
    public final BiasAlignment.Vertical alignment;

    public VerticalAlignElement(BiasAlignment.Vertical vertical) {
        this.alignment = vertical;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        VerticalAlignNode verticalAlignNode = new VerticalAlignNode();
        verticalAlignNode.vertical = this.alignment;
        return verticalAlignNode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        VerticalAlignElement verticalAlignElement = obj instanceof VerticalAlignElement ? (VerticalAlignElement) obj : null;
        if (verticalAlignElement == null) {
            return false;
        }
        return Intrinsics.areEqual(this.alignment, verticalAlignElement.alignment);
    }

    public final int hashCode() {
        return Float.hashCode(this.alignment.bias);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("align");
        inspectorInfo.setValue(this.alignment);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        ((VerticalAlignNode) node).vertical = this.alignment;
    }
}
