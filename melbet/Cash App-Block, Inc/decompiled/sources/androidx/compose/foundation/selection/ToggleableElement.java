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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/selection/ToggleableElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/selection/ToggleableNode;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ToggleableElement extends ModifierNodeElement {
    public final boolean enabled;
    public final IndicationNodeFactory indicationNodeFactory;
    public final MutableInteractionSourceImpl interactionSource;
    public final Function1 onValueChange;
    public final Role role;
    public final boolean useLocalIndication;
    public final boolean value;

    public ToggleableElement(boolean z, MutableInteractionSourceImpl mutableInteractionSourceImpl, IndicationNodeFactory indicationNodeFactory, boolean z2, boolean z3, Role role, Function1 function1) {
        this.value = z;
        this.interactionSource = mutableInteractionSourceImpl;
        this.indicationNodeFactory = indicationNodeFactory;
        this.useLocalIndication = z2;
        this.enabled = z3;
        this.role = role;
        this.onValueChange = function1;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        return new ToggleableNode(this.value, this.interactionSource, this.indicationNodeFactory, this.useLocalIndication, this.enabled, this.role, this.onValueChange);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ToggleableElement.class != obj.getClass()) {
            return false;
        }
        ToggleableElement toggleableElement = (ToggleableElement) obj;
        return this.value == toggleableElement.value && Intrinsics.areEqual(this.interactionSource, toggleableElement.interactionSource) && Intrinsics.areEqual(this.indicationNodeFactory, toggleableElement.indicationNodeFactory) && this.useLocalIndication == toggleableElement.useLocalIndication && this.enabled == toggleableElement.enabled && Intrinsics.areEqual(this.role, toggleableElement.role) && this.onValueChange == toggleableElement.onValueChange;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.value) * 31;
        MutableInteractionSourceImpl mutableInteractionSourceImpl = this.interactionSource;
        int hashCode2 = (hashCode + (mutableInteractionSourceImpl != null ? mutableInteractionSourceImpl.hashCode() : 0)) * 31;
        IndicationNodeFactory indicationNodeFactory = this.indicationNodeFactory;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (indicationNodeFactory != null ? indicationNodeFactory.hashCode() : 0)) * 31, 31, this.useLocalIndication), 31, this.enabled);
        Role role = this.role;
        return this.onValueChange.hashCode() + ((m + (role != null ? Integer.hashCode(role.value) : 0)) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.name = "toggleable";
        LinesSequence linesSequence = inspectorInfo.properties;
        linesSequence.set(inspectorInfo.value, "value");
        linesSequence.set(this.interactionSource, "interactionSource");
        linesSequence.set(this.indicationNodeFactory, "indicationNodeFactory");
        linesSequence.set(Boolean.valueOf(this.enabled), "enabled");
        linesSequence.set(this.role, "role");
        linesSequence.set(this.onValueChange, "onValueChange");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        ToggleableNode toggleableNode = (ToggleableNode) node;
        boolean z = toggleableNode.value;
        boolean z2 = this.value;
        if (z != z2) {
            toggleableNode.value = z2;
            DepthSortedSetKt.requireLayoutNode(toggleableNode).invalidateSemantics$ui();
        }
        toggleableNode.onValueChange = this.onValueChange;
        toggleableNode.m164updateCommonO2vRcR0(this.interactionSource, this.indicationNodeFactory, this.useLocalIndication, this.enabled, null, this.role, toggleableNode._onClick);
    }
}
