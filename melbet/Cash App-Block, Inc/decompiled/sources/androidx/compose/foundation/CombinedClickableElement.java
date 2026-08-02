package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/CombinedClickableElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/CombinedClickableNode;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CombinedClickableElement extends ModifierNodeElement {
    public final boolean enabled;
    public final IndicationNodeFactory indicationNodeFactory;
    public final MutableInteractionSourceImpl interactionSource;
    public final Function0 onClick;
    public final String onClickLabel;
    public final Function0 onLongClick;
    public final String onLongClickLabel;
    public final Role role;
    public final boolean useLocalIndication;

    public CombinedClickableElement(IndicationNodeFactory indicationNodeFactory, MutableInteractionSourceImpl mutableInteractionSourceImpl, Role role, String str, String str2, Function0 function0, Function0 function02, boolean z, boolean z2) {
        this.interactionSource = mutableInteractionSourceImpl;
        this.indicationNodeFactory = indicationNodeFactory;
        this.useLocalIndication = z;
        this.enabled = z2;
        this.onClickLabel = str;
        this.role = role;
        this.onClick = function0;
        this.onLongClickLabel = str2;
        this.onLongClick = function02;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        String str = this.onClickLabel;
        return new CombinedClickableNode(this.indicationNodeFactory, this.interactionSource, this.role, this.onLongClickLabel, str, this.onClick, this.onLongClick, this.useLocalIndication, this.enabled);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CombinedClickableElement.class != obj.getClass()) {
            return false;
        }
        CombinedClickableElement combinedClickableElement = (CombinedClickableElement) obj;
        return Intrinsics.areEqual(this.interactionSource, combinedClickableElement.interactionSource) && Intrinsics.areEqual(this.indicationNodeFactory, combinedClickableElement.indicationNodeFactory) && this.useLocalIndication == combinedClickableElement.useLocalIndication && this.enabled == combinedClickableElement.enabled && Intrinsics.areEqual(this.onClickLabel, combinedClickableElement.onClickLabel) && Intrinsics.areEqual(this.role, combinedClickableElement.role) && this.onClick == combinedClickableElement.onClick && Intrinsics.areEqual(this.onLongClickLabel, combinedClickableElement.onLongClickLabel) && this.onLongClick == combinedClickableElement.onLongClick;
    }

    public final int hashCode() {
        MutableInteractionSourceImpl mutableInteractionSourceImpl = this.interactionSource;
        int hashCode = (mutableInteractionSourceImpl != null ? mutableInteractionSourceImpl.hashCode() : 0) * 31;
        IndicationNodeFactory indicationNodeFactory = this.indicationNodeFactory;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (indicationNodeFactory != null ? indicationNodeFactory.hashCode() : 0)) * 31, 31, this.useLocalIndication), 31, this.enabled);
        String str = this.onClickLabel;
        int hashCode2 = (m + (str != null ? str.hashCode() : 0)) * 31;
        Role role = this.role;
        int hashCode3 = (this.onClick.hashCode() + ((hashCode2 + (role != null ? Integer.hashCode(role.value) : 0)) * 31)) * 31;
        String str2 = this.onLongClickLabel;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Function0 function0 = this.onLongClick;
        return Boolean.hashCode(true) + ((hashCode4 + (function0 != null ? function0.hashCode() : 0)) * 961);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("combinedClickable");
        inspectorInfo.getProperties().set(this.indicationNodeFactory, "indicationNodeFactory");
        inspectorInfo.getProperties().set(this.interactionSource, "interactionSource");
        inspectorInfo.getProperties().set(Boolean.valueOf(this.enabled), "enabled");
        inspectorInfo.getProperties().set(this.onClickLabel, "onClickLabel");
        inspectorInfo.getProperties().set(this.role, "role");
        inspectorInfo.getProperties().set(this.onClick, "onClick");
        inspectorInfo.getProperties().set(null, "onDoubleClick");
        inspectorInfo.getProperties().set(this.onLongClick, "onLongClick");
        inspectorInfo.getProperties().set(this.onLongClickLabel, "onLongClickLabel");
        inspectorInfo.getProperties().set(Boolean.TRUE, "hapticFeedbackEnabled");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        boolean z;
        CombinedClickableNode combinedClickableNode = (CombinedClickableNode) node;
        combinedClickableNode.hapticFeedbackEnabled = true;
        String str = combinedClickableNode.onLongClickLabel;
        String str2 = this.onLongClickLabel;
        if (!Intrinsics.areEqual(str, str2)) {
            combinedClickableNode.onLongClickLabel = str2;
            DepthSortedSetKt.requireLayoutNode(combinedClickableNode).invalidateSemantics$ui();
        }
        boolean z2 = combinedClickableNode.onLongClick == null;
        Function0 function0 = this.onLongClick;
        if (z2 != (function0 == null)) {
            combinedClickableNode.disposeInteractions();
            DepthSortedSetKt.requireLayoutNode(combinedClickableNode).invalidateSemantics$ui();
            z = true;
        } else {
            z = false;
        }
        combinedClickableNode.onLongClick = function0;
        boolean z3 = combinedClickableNode.enabled;
        boolean z4 = this.enabled;
        boolean z5 = z3 != z4 ? true : z;
        combinedClickableNode.m164updateCommonO2vRcR0(this.interactionSource, this.indicationNodeFactory, this.useLocalIndication, z4, this.onClickLabel, this.role, this.onClick);
        if (z5) {
            combinedClickableNode.cancelInput$1(false);
            combinedClickableNode.cancelInput$1(true);
        }
    }
}
