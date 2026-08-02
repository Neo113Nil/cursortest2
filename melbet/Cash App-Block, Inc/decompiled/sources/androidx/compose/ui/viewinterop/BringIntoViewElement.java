package androidx.compose.ui.viewinterop;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/viewinterop/BringIntoViewElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/viewinterop/BringIntoViewNode;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class BringIntoViewElement extends ModifierNodeElement {
    public final AndroidViewHolder$layoutNode$1$4 onRequesterReady;

    public BringIntoViewElement(AndroidViewHolder$layoutNode$1$4 androidViewHolder$layoutNode$1$4) {
        this.onRequesterReady = androidViewHolder$layoutNode$1$4;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        return new BringIntoViewNode(this.onRequesterReady);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BringIntoViewElement) {
            return this.onRequesterReady == ((BringIntoViewElement) obj).onRequesterReady;
        }
        return false;
    }

    public final int hashCode() {
        return this.onRequesterReady.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("requestRectangleBringIntoViewBridge");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        BringIntoViewNode bringIntoViewNode = (BringIntoViewNode) node;
        AndroidViewHolder$layoutNode$1$4 androidViewHolder$layoutNode$1$4 = this.onRequesterReady;
        bringIntoViewNode.onRequesterReady = androidViewHolder$layoutNode$1$4;
        if (bringIntoViewNode.isAttached()) {
            androidViewHolder$layoutNode$1$4.invoke(bringIntoViewNode.requester);
        }
    }
}
