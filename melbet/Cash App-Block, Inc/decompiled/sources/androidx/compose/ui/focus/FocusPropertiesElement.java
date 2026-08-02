package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusPropertiesElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/focus/FocusPropertiesNode;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* data */ class FocusPropertiesElement extends ModifierNodeElement {
    public final FocusPropertiesKt$sam$androidx_compose_ui_focus_FocusPropertiesScope$0 scope;

    public FocusPropertiesElement(FocusPropertiesKt$sam$androidx_compose_ui_focus_FocusPropertiesScope$0 focusPropertiesKt$sam$androidx_compose_ui_focus_FocusPropertiesScope$0) {
        this.scope = focusPropertiesKt$sam$androidx_compose_ui_focus_FocusPropertiesScope$0;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        FocusPropertiesNode focusPropertiesNode = new FocusPropertiesNode();
        focusPropertiesNode.focusPropertiesScope = this.scope;
        return focusPropertiesNode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusPropertiesElement) && this.scope.equals(((FocusPropertiesElement) obj).scope);
    }

    public final int hashCode() {
        return this.scope.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.name = "focusProperties";
        inspectorInfo.properties.set(this.scope, "scope");
    }

    public final String toString() {
        return "FocusPropertiesElement(scope=" + this.scope + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        ((FocusPropertiesNode) node).focusPropertiesScope = this.scope;
    }
}
