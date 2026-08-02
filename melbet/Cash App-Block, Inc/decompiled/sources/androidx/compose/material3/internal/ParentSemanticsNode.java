package androidx.compose.material3.internal;

import androidx.compose.material.MenuKt$$ExternalSyntheticLambda0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;

/* loaded from: classes3.dex */
public final class ParentSemanticsNode extends Modifier.Node implements TraversableNode, SemanticsModifierNode {
    public MenuKt$$ExternalSyntheticLambda0 properties;
    public boolean semanticsConsumed;

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (this.semanticsConsumed) {
            return;
        }
        this.properties.invoke(semanticsPropertyReceiver);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final boolean getShouldMergeDescendantSemantics() {
        return true;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public final Object getTraverseKey() {
        return ParentSemanticsNodeKey.INSTANCE;
    }
}
