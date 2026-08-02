package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.SiblingsAlignedNode;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/WithAlignmentLineBlockElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/SiblingsAlignedNode$WithAlignmentLineBlockNode;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WithAlignmentLineBlockElement extends ModifierNodeElement {
    public final RowScopeInstance$$ExternalSyntheticLambda0 block;

    public WithAlignmentLineBlockElement(RowScopeInstance$$ExternalSyntheticLambda0 rowScopeInstance$$ExternalSyntheticLambda0) {
        this.block = rowScopeInstance$$ExternalSyntheticLambda0;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        SiblingsAlignedNode.WithAlignmentLineBlockNode withAlignmentLineBlockNode = new SiblingsAlignedNode.WithAlignmentLineBlockNode();
        withAlignmentLineBlockNode.block = this.block;
        return withAlignmentLineBlockNode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        WithAlignmentLineBlockElement withAlignmentLineBlockElement = obj instanceof WithAlignmentLineBlockElement ? (WithAlignmentLineBlockElement) obj : null;
        return withAlignmentLineBlockElement != null && this.block == withAlignmentLineBlockElement.block;
    }

    public final int hashCode() {
        return this.block.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.name = "alignBy";
        inspectorInfo.value = this.block;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        ((SiblingsAlignedNode.WithAlignmentLineBlockNode) node).block = this.block;
    }
}
