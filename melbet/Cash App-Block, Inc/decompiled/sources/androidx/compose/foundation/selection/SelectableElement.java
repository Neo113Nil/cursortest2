package androidx.compose.foundation.selection;

import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.io.LinesSequence;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/selection/SelectableElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/selection/SelectableNode;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SelectableElement extends ModifierNodeElement {
    public final boolean enabled;
    public final IndicationNodeFactory indicationNodeFactory;
    public final MutableInteractionSourceImpl interactionSource;
    public final Function0 onClick;
    public final Role role;
    public final boolean selected;
    public final boolean useLocalIndication;

    public SelectableElement(boolean z, MutableInteractionSourceImpl mutableInteractionSourceImpl, IndicationNodeFactory indicationNodeFactory, boolean z2, boolean z3, Role role, Function0 function0) {
        this.selected = z;
        this.interactionSource = mutableInteractionSourceImpl;
        this.indicationNodeFactory = indicationNodeFactory;
        this.useLocalIndication = z2;
        this.enabled = z3;
        this.role = role;
        this.onClick = function0;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        SelectableNode selectableNode = new SelectableNode(this.interactionSource, this.indicationNodeFactory, this.useLocalIndication, this.enabled, null, this.role, this.onClick);
        selectableNode.selected = this.selected;
        return selectableNode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SelectableElement.class != obj.getClass()) {
            return false;
        }
        SelectableElement selectableElement = (SelectableElement) obj;
        return this.selected == selectableElement.selected && Intrinsics.areEqual(this.interactionSource, selectableElement.interactionSource) && Intrinsics.areEqual(this.indicationNodeFactory, selectableElement.indicationNodeFactory) && this.useLocalIndication == selectableElement.useLocalIndication && this.enabled == selectableElement.enabled && Intrinsics.areEqual(this.role, selectableElement.role) && this.onClick == selectableElement.onClick;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.selected) * 31;
        MutableInteractionSourceImpl mutableInteractionSourceImpl = this.interactionSource;
        int hashCode2 = (hashCode + (mutableInteractionSourceImpl != null ? mutableInteractionSourceImpl.hashCode() : 0)) * 31;
        IndicationNodeFactory indicationNodeFactory = this.indicationNodeFactory;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (indicationNodeFactory != null ? indicationNodeFactory.hashCode() : 0)) * 31, 31, this.useLocalIndication), 31, this.enabled);
        Role role = this.role;
        return this.onClick.hashCode() + ((m + (role != null ? Integer.hashCode(role.value) : 0)) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.name = "selectable";
        LinesSequence linesSequence = inspectorInfo.properties;
        linesSequence.set(Boolean.valueOf(this.selected), "selected");
        linesSequence.set(this.interactionSource, "interactionSource");
        linesSequence.set(this.indicationNodeFactory, "indicationNodeFactory");
        linesSequence.set(Boolean.valueOf(this.enabled), "enabled");
        linesSequence.set(this.role, "role");
        linesSequence.set(this.onClick, "onClick");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        SelectableNode selectableNode = (SelectableNode) node;
        boolean z = selectableNode.selected;
        boolean z2 = this.selected;
        if (z != z2) {
            selectableNode.selected = z2;
            DepthSortedSetKt.requireLayoutNode(selectableNode).invalidateSemantics$ui();
        }
        selectableNode.m164updateCommonO2vRcR0(this.interactionSource, this.indicationNodeFactory, this.useLocalIndication, this.enabled, null, this.role, this.onClick);
    }
}
