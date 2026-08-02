package androidx.compose.material3.internal;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.navigation.Navigation$$ExternalSyntheticLambda1;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/material3/internal/ChildSemanticsNodeElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/material3/internal/ChildSemanticsNode;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChildSemanticsNodeElement extends ModifierNodeElement {
    public final Navigation$$ExternalSyntheticLambda1 properties;

    public ChildSemanticsNodeElement(Navigation$$ExternalSyntheticLambda1 navigation$$ExternalSyntheticLambda1) {
        this.properties = navigation$$ExternalSyntheticLambda1;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        ChildSemanticsNode childSemanticsNode = new ChildSemanticsNode();
        childSemanticsNode.properties = this.properties;
        return childSemanticsNode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChildSemanticsNodeElement) {
            return this.properties == ((ChildSemanticsNodeElement) obj).properties;
        }
        return false;
    }

    public final int hashCode() {
        return this.properties.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.name = "childSemantics";
        inspectorInfo.properties.set(this.properties, "properties");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        ChildSemanticsNode childSemanticsNode = (ChildSemanticsNode) node;
        childSemanticsNode.properties = this.properties;
        DepthSortedSetKt.requireLayoutNode(childSemanticsNode).invalidateSemantics$ui();
    }
}
