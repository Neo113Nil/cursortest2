package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/OnGloballyPositionedElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/layout/OnGloballyPositionedNode;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class OnGloballyPositionedElement extends ModifierNodeElement {
    public final Function1 onGloballyPositioned;

    public OnGloballyPositionedElement(Function1 function1) {
        this.onGloballyPositioned = function1;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        OnGloballyPositionedNode onGloballyPositionedNode = new OnGloballyPositionedNode();
        onGloballyPositionedNode.callback = this.onGloballyPositioned;
        return onGloballyPositionedNode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnGloballyPositionedElement) {
            return this.onGloballyPositioned == ((OnGloballyPositionedElement) obj).onGloballyPositioned;
        }
        return false;
    }

    public final int hashCode() {
        return this.onGloballyPositioned.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("onGloballyPositioned");
        inspectorInfo.getProperties().set(this.onGloballyPositioned, "onGloballyPositioned");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        ((OnGloballyPositionedNode) node).callback = this.onGloballyPositioned;
    }
}
