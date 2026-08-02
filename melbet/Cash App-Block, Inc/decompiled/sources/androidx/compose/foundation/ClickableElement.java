package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/ClickableElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/ClickableNode;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ClickableElement extends ModifierNodeElement {
    public final boolean enabled;
    public final IndicationNodeFactory indicationNodeFactory;
    public final MutableInteractionSourceImpl interactionSource;
    public final Function0 onClick;
    public final String onClickLabel;
    public final Role role;
    public final boolean useLocalIndication;

    public ClickableElement(MutableInteractionSourceImpl mutableInteractionSourceImpl, IndicationNodeFactory indicationNodeFactory, boolean z, boolean z2, String str, Role role, Function0 function0) {
        this.interactionSource = mutableInteractionSourceImpl;
        this.indicationNodeFactory = indicationNodeFactory;
        this.useLocalIndication = z;
        this.enabled = z2;
        this.onClickLabel = str;
        this.role = role;
        this.onClick = function0;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        return new ClickableNode(this.interactionSource, this.indicationNodeFactory, this.useLocalIndication, this.enabled, this.onClickLabel, this.role, this.onClick);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        return Intrinsics.areEqual(this.interactionSource, clickableElement.interactionSource) && Intrinsics.areEqual(this.indicationNodeFactory, clickableElement.indicationNodeFactory) && this.useLocalIndication == clickableElement.useLocalIndication && this.enabled == clickableElement.enabled && Intrinsics.areEqual(this.onClickLabel, clickableElement.onClickLabel) && Intrinsics.areEqual(this.role, clickableElement.role) && this.onClick == clickableElement.onClick;
    }

    public final int hashCode() {
        MutableInteractionSourceImpl mutableInteractionSourceImpl = this.interactionSource;
        int hashCode = (mutableInteractionSourceImpl != null ? mutableInteractionSourceImpl.hashCode() : 0) * 31;
        IndicationNodeFactory indicationNodeFactory = this.indicationNodeFactory;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (indicationNodeFactory != null ? indicationNodeFactory.hashCode() : 0)) * 31, 31, this.useLocalIndication), 31, this.enabled);
        String str = this.onClickLabel;
        int hashCode2 = (m + (str != null ? str.hashCode() : 0)) * 31;
        Role role = this.role;
        return this.onClick.hashCode() + ((hashCode2 + (role != null ? Integer.hashCode(role.value) : 0)) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("clickable");
        inspectorInfo.getProperties().set(Boolean.valueOf(this.enabled), "enabled");
        inspectorInfo.getProperties().set(this.onClick, "onClick");
        inspectorInfo.getProperties().set(this.onClickLabel, "onClickLabel");
        inspectorInfo.getProperties().set(this.role, "role");
        inspectorInfo.getProperties().set(this.interactionSource, "interactionSource");
        inspectorInfo.getProperties().set(this.indicationNodeFactory, "indicationNodeFactory");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        ((ClickableNode) node).m164updateCommonO2vRcR0(this.interactionSource, this.indicationNodeFactory, this.useLocalIndication, this.enabled, this.onClickLabel, this.role, this.onClick);
    }
}
