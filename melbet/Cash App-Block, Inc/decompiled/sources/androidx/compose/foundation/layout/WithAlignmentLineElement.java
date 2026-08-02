package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.SiblingsAlignedNode;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/WithAlignmentLineElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/SiblingsAlignedNode$WithAlignmentLineNode;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WithAlignmentLineElement extends ModifierNodeElement {
    public final AlignmentLine alignmentLine;

    public WithAlignmentLineElement(AlignmentLine alignmentLine) {
        this.alignmentLine = alignmentLine;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        SiblingsAlignedNode.WithAlignmentLineNode withAlignmentLineNode = new SiblingsAlignedNode.WithAlignmentLineNode();
        withAlignmentLineNode.alignmentLine = this.alignmentLine;
        return withAlignmentLineNode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        WithAlignmentLineElement withAlignmentLineElement = obj instanceof WithAlignmentLineElement ? (WithAlignmentLineElement) obj : null;
        if (withAlignmentLineElement == null) {
            return false;
        }
        return Intrinsics.areEqual(this.alignmentLine, withAlignmentLineElement.alignmentLine);
    }

    public final int hashCode() {
        return this.alignmentLine.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.name = "alignBy";
        inspectorInfo.value = this.alignmentLine;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        ((SiblingsAlignedNode.WithAlignmentLineNode) node).alignmentLine = this.alignmentLine;
    }
}
