package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuToolbarHandlerElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuToolbarHandlerNode;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class TextContextMenuToolbarHandlerElement extends ModifierNodeElement {
    public final Function1 computeContentBounds;
    public final Function1 onHide;
    public final Function1 onShow;
    public final ToolbarRequesterImpl requester;

    public TextContextMenuToolbarHandlerElement(ToolbarRequesterImpl toolbarRequesterImpl, Function1 function1, Function1 function12, Function1 function13) {
        this.requester = toolbarRequesterImpl;
        this.onShow = function1;
        this.onHide = function12;
        this.computeContentBounds = function13;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        return new TextContextMenuToolbarHandlerNode(this.requester, this.onShow, this.onHide, this.computeContentBounds);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextContextMenuToolbarHandlerElement)) {
            return false;
        }
        TextContextMenuToolbarHandlerElement textContextMenuToolbarHandlerElement = (TextContextMenuToolbarHandlerElement) obj;
        return this.requester == textContextMenuToolbarHandlerElement.requester && this.onShow == textContextMenuToolbarHandlerElement.onShow && this.onHide == textContextMenuToolbarHandlerElement.onHide && this.computeContentBounds == textContextMenuToolbarHandlerElement.computeContentBounds;
    }

    public final int hashCode() {
        int m = Recorder$$ExternalSyntheticOutline1.m(this.requester.hashCode() * 31, 31, this.onShow);
        Function1 function1 = this.onHide;
        return this.computeContentBounds.hashCode() + ((m + (function1 != null ? function1.hashCode() : 0)) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        TextContextMenuToolbarHandlerNode textContextMenuToolbarHandlerNode = (TextContextMenuToolbarHandlerNode) node;
        textContextMenuToolbarHandlerNode.requester.toolbarHandlerNode = null;
        ToolbarRequesterImpl toolbarRequesterImpl = this.requester;
        textContextMenuToolbarHandlerNode.requester = toolbarRequesterImpl;
        toolbarRequesterImpl.toolbarHandlerNode = textContextMenuToolbarHandlerNode;
        toolbarRequesterImpl.toolbarHandlerState = textContextMenuToolbarHandlerNode.isAttached() ? ToolbarHandlerState.Attached : ToolbarHandlerState.Detached;
        textContextMenuToolbarHandlerNode.onShow = this.onShow;
        textContextMenuToolbarHandlerNode.onHide = this.onHide;
        textContextMenuToolbarHandlerNode.computeContentBounds = this.computeContentBounds;
    }
}
