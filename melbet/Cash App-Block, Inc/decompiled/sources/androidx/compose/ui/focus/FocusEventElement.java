package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusEventElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/focus/FocusEventNode;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class FocusEventElement extends ModifierNodeElement {
    public final Function1 onFocusEvent;

    public FocusEventElement(Function1 function1) {
        this.onFocusEvent = function1;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        FocusEventNode focusEventNode = new FocusEventNode();
        focusEventNode.onFocusEvent = this.onFocusEvent;
        return focusEventNode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FocusEventElement) {
            return this.onFocusEvent == ((FocusEventElement) obj).onFocusEvent;
        }
        return false;
    }

    public final int hashCode() {
        return this.onFocusEvent.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.name = "onFocusEvent";
        inspectorInfo.properties.set(this.onFocusEvent, "onFocusEvent");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        ((FocusEventNode) node).onFocusEvent = this.onFocusEvent;
    }
}
