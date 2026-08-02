package androidx.compose.foundation;

import androidx.compose.foundation.FocusableNode;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.TraversableNode;

/* loaded from: classes.dex */
public abstract class FocusedBoundsObserverNode extends Modifier.Node implements TraversableNode {
    public static final FocusableNode.TraverseKey TraverseKey = new FocusableNode.TraverseKey();
}
