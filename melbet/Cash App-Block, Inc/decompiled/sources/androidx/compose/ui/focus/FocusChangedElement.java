package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusChangedElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/focus/FocusChangedNode;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class FocusChangedElement extends ModifierNodeElement {
    public final Function1 onFocusChanged;

    public FocusChangedElement(Function1 function1) {
        this.onFocusChanged = function1;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        FocusChangedNode focusChangedNode = new FocusChangedNode();
        focusChangedNode.onFocusChanged = this.onFocusChanged;
        return focusChangedNode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FocusChangedElement) {
            return this.onFocusChanged == ((FocusChangedElement) obj).onFocusChanged;
        }
        return false;
    }

    public final int hashCode() {
        return this.onFocusChanged.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.name = "onFocusChanged";
        inspectorInfo.properties.set(this.onFocusChanged, "onFocusChanged");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        ((FocusChangedNode) node).onFocusChanged = this.onFocusChanged;
    }
}
