package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/LayoutWeightElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/LayoutWeightNode;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LayoutWeightElement extends ModifierNodeElement {
    public final boolean fill;
    public final float weight;

    public LayoutWeightElement(float f, boolean z) {
        this.weight = f;
        this.fill = z;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        LayoutWeightNode layoutWeightNode = new LayoutWeightNode();
        layoutWeightNode.weight = this.weight;
        layoutWeightNode.fill = this.fill;
        return layoutWeightNode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        LayoutWeightElement layoutWeightElement = obj instanceof LayoutWeightElement ? (LayoutWeightElement) obj : null;
        return layoutWeightElement != null && this.weight == layoutWeightElement.weight && this.fill == layoutWeightElement.fill;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.fill) + (Float.hashCode(this.weight) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("weight");
        float f = this.weight;
        inspectorInfo.setValue(Float.valueOf(f));
        inspectorInfo.getProperties().set(Float.valueOf(f), "weight");
        inspectorInfo.getProperties().set(Boolean.valueOf(this.fill), "fill");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        LayoutWeightNode layoutWeightNode = (LayoutWeightNode) node;
        layoutWeightNode.weight = this.weight;
        layoutWeightNode.fill = this.fill;
    }
}
