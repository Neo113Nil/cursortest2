package androidx.compose.foundation.relocation;

import androidx.compose.ui.Modifier;

/* loaded from: classes.dex */
public final class BringIntoViewRequesterNode extends Modifier.Node {
    public BringIntoViewRequesterImpl requester;

    public BringIntoViewRequesterNode(BringIntoViewRequesterImpl bringIntoViewRequesterImpl) {
        this.requester = bringIntoViewRequesterImpl;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        updateRequester(this.requester);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        BringIntoViewRequesterImpl bringIntoViewRequesterImpl = this.requester;
        if (bringIntoViewRequesterImpl instanceof BringIntoViewRequesterImpl) {
            bringIntoViewRequesterImpl.nodes.remove(this);
        }
    }

    public final void updateRequester(BringIntoViewRequesterImpl bringIntoViewRequesterImpl) {
        BringIntoViewRequesterImpl bringIntoViewRequesterImpl2 = this.requester;
        if (bringIntoViewRequesterImpl2 instanceof BringIntoViewRequesterImpl) {
            bringIntoViewRequesterImpl2.nodes.remove(this);
        }
        if (bringIntoViewRequesterImpl instanceof BringIntoViewRequesterImpl) {
            bringIntoViewRequesterImpl.nodes.add(this);
        }
        this.requester = bringIntoViewRequesterImpl;
    }
}
