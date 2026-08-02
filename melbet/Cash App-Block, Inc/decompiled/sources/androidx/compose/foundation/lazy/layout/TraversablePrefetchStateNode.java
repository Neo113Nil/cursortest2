package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.TraversableNode;

/* loaded from: classes3.dex */
public final class TraversablePrefetchStateNode extends Modifier.Node implements TraversableNode {
    public LazyLayoutPrefetchState prefetchState;

    @Override // androidx.compose.ui.node.TraversableNode
    public final /* bridge */ /* synthetic */ Object getTraverseKey() {
        return "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode";
    }
}
