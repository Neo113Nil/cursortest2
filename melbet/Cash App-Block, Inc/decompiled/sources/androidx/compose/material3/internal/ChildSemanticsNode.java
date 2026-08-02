package androidx.compose.material3.internal;

import androidx.compose.foundation.selection.ToggleableNode$$ExternalSyntheticLambda0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.navigation.Navigation$$ExternalSyntheticLambda1;

/* loaded from: classes3.dex */
public final class ChildSemanticsNode extends Modifier.Node implements SemanticsModifierNode {
    public Navigation$$ExternalSyntheticLambda1 properties;

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        DepthSortedSetKt.traverseAncestors(this, ParentSemanticsNodeKey.INSTANCE, new ToggleableNode$$ExternalSyntheticLambda0(semanticsPropertyReceiver, 1));
        this.properties.getClass();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        super.onDetach();
        DepthSortedSetKt.traverseAncestors(this, ParentSemanticsNodeKey.INSTANCE, new Navigation$$ExternalSyntheticLambda1(4));
    }
}
