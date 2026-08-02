package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/DerivedHeightModifierElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/DerivedHeightModifierNode;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class DerivedHeightModifierElement extends ModifierNodeElement {
    public final WindowInsets insets;

    public DerivedHeightModifierElement(WindowInsets windowInsets) {
        this.insets = windowInsets;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        Drop$$ExternalSyntheticBUOutline0 drop$$ExternalSyntheticBUOutline0 = OffsetKt.bottomCalc;
        DerivedHeightModifierNode derivedHeightModifierNode = new DerivedHeightModifierNode();
        derivedHeightModifierNode.insets = this.insets;
        derivedHeightModifierNode.heightCalc = drop$$ExternalSyntheticBUOutline0;
        derivedHeightModifierNode.heightInsets = SpacerKt.EmptyWindowInsets;
        return derivedHeightModifierNode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DerivedHeightModifierElement) {
            return Intrinsics.areEqual(this.insets, ((DerivedHeightModifierElement) obj).insets);
        }
        return false;
    }

    public final int hashCode() {
        return OffsetKt.bottomCalc.hashCode() + (this.insets.hashCode() * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        DerivedHeightModifierNode derivedHeightModifierNode = (DerivedHeightModifierNode) node;
        Drop$$ExternalSyntheticBUOutline0 drop$$ExternalSyntheticBUOutline0 = OffsetKt.bottomCalc;
        WindowInsets windowInsets = derivedHeightModifierNode.insets;
        WindowInsets windowInsets2 = this.insets;
        if (Intrinsics.areEqual(windowInsets, windowInsets2) && drop$$ExternalSyntheticBUOutline0 == derivedHeightModifierNode.heightCalc) {
            return;
        }
        derivedHeightModifierNode.insets = windowInsets2;
        derivedHeightModifierNode.heightCalc = drop$$ExternalSyntheticBUOutline0;
        derivedHeightModifierNode.heightInsets = new ExcludeInsets(windowInsets2, derivedHeightModifierNode.ancestorConsumedInsets);
        DepthSortedSetKt.requireLayoutNode(derivedHeightModifierNode).invalidateMeasurements$ui();
    }
}
