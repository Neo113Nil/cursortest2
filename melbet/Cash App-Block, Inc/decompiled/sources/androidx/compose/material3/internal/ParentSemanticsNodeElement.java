package androidx.compose.material3.internal;

import androidx.compose.material.MenuKt$$ExternalSyntheticLambda0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/material3/internal/ParentSemanticsNodeElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/material3/internal/ParentSemanticsNode;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ParentSemanticsNodeElement extends ModifierNodeElement {
    public final MenuKt$$ExternalSyntheticLambda0 properties;

    public ParentSemanticsNodeElement(MenuKt$$ExternalSyntheticLambda0 menuKt$$ExternalSyntheticLambda0) {
        this.properties = menuKt$$ExternalSyntheticLambda0;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        ParentSemanticsNode parentSemanticsNode = new ParentSemanticsNode();
        parentSemanticsNode.properties = this.properties;
        return parentSemanticsNode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ParentSemanticsNodeElement) {
            return this.properties == ((ParentSemanticsNodeElement) obj).properties;
        }
        return false;
    }

    public final int hashCode() {
        return this.properties.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.name = "parentSemantics";
        inspectorInfo.properties.set(this.properties, "properties");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        ParentSemanticsNode parentSemanticsNode = (ParentSemanticsNode) node;
        parentSemanticsNode.properties = this.properties;
        DepthSortedSetKt.requireLayoutNode(parentSemanticsNode).invalidateSemantics$ui();
    }
}
