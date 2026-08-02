package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuGestureElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuGestureNode;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class TextContextMenuGestureElement extends ModifierNodeElement {
    public final Function2 onPreShowContextMenu;

    public TextContextMenuGestureElement(Function2 function2) {
        this.onPreShowContextMenu = function2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        return new TextContextMenuGestureNode(this.onPreShowContextMenu);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TextContextMenuGestureElement) {
            return this.onPreShowContextMenu == ((TextContextMenuGestureElement) obj).onPreShowContextMenu;
        }
        return false;
    }

    public final int hashCode() {
        Function2 function2 = this.onPreShowContextMenu;
        if (function2 != null) {
            return function2.hashCode();
        }
        return 0;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("TextContextMenuGestures");
        inspectorInfo.getProperties().set(this.onPreShowContextMenu, "onPreShowContextMenu");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        ((TextContextMenuGestureNode) node).onPreShowContextMenu = this.onPreShowContextMenu;
    }
}
