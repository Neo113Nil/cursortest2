package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/IndicationModifierElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/IndicationModifierNode;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class IndicationModifierElement extends ModifierNodeElement {
    public final IndicationNodeFactory indication;
    public final MutableInteractionSourceImpl interactionSource;

    public IndicationModifierElement(MutableInteractionSourceImpl mutableInteractionSourceImpl, IndicationNodeFactory indicationNodeFactory) {
        this.interactionSource = mutableInteractionSourceImpl;
        this.indication = indicationNodeFactory;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        DelegatableNode create = this.indication.create(this.interactionSource);
        IndicationModifierNode indicationModifierNode = new IndicationModifierNode();
        indicationModifierNode.indicationNode = create;
        indicationModifierNode.delegate(create);
        return indicationModifierNode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicationModifierElement)) {
            return false;
        }
        IndicationModifierElement indicationModifierElement = (IndicationModifierElement) obj;
        return Intrinsics.areEqual(this.interactionSource, indicationModifierElement.interactionSource) && Intrinsics.areEqual(this.indication, indicationModifierElement.indication);
    }

    public final int hashCode() {
        return this.indication.hashCode() + (this.interactionSource.hashCode() * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("indication");
        inspectorInfo.getProperties().set(this.interactionSource, "interactionSource");
        inspectorInfo.getProperties().set(this.indication, "indication");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        IndicationModifierNode indicationModifierNode = (IndicationModifierNode) node;
        DelegatableNode create = this.indication.create(this.interactionSource);
        indicationModifierNode.undelegate(indicationModifierNode.indicationNode);
        indicationModifierNode.indicationNode = create;
        indicationModifierNode.delegate(create);
    }
}
