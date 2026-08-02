package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/PaddingValuesConsumingModifierElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/PaddingValuesConsumingModifierNode;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class PaddingValuesConsumingModifierElement extends ModifierNodeElement {
    public final PaddingValues paddingValues;

    public PaddingValuesConsumingModifierElement(PaddingValues paddingValues) {
        this.paddingValues = paddingValues;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        PaddingValuesConsumingModifierNode paddingValuesConsumingModifierNode = new PaddingValuesConsumingModifierNode();
        paddingValuesConsumingModifierNode.paddingValues = this.paddingValues;
        return paddingValuesConsumingModifierNode;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PaddingValuesConsumingModifierElement) {
            return Intrinsics.areEqual(((PaddingValuesConsumingModifierElement) obj).paddingValues, this.paddingValues);
        }
        return false;
    }

    public final int hashCode() {
        return this.paddingValues.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        PaddingValuesConsumingModifierNode paddingValuesConsumingModifierNode = (PaddingValuesConsumingModifierNode) node;
        PaddingValues paddingValues = paddingValuesConsumingModifierNode.paddingValues;
        PaddingValues paddingValues2 = this.paddingValues;
        if (Intrinsics.areEqual(paddingValues2, paddingValues)) {
            return;
        }
        paddingValuesConsumingModifierNode.paddingValues = paddingValues2;
        paddingValuesConsumingModifierNode.insetsInvalidated();
    }
}
