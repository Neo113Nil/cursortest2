package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.TraversableNode;

/* loaded from: classes3.dex */
public final class GestureNode extends Modifier.Node implements TraversableNode {
    public static final TraverseKey TraverseKey = new TraverseKey();
    public final GestureConnection gestureConnection;

    public final class TraverseKey {
    }

    public GestureNode(GestureConnection gestureConnection) {
        this.gestureConnection = gestureConnection;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public final Object getTraverseKey() {
        return TraverseKey;
    }
}
