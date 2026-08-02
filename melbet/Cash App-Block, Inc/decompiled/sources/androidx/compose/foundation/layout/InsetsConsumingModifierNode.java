package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.TraversableNode;

/* loaded from: classes.dex */
public abstract class InsetsConsumingModifierNode extends Modifier.Node implements TraversableNode {
    public WindowInsets ancestorConsumedInsets;
    public WindowInsets consumedInsets;

    public InsetsConsumingModifierNode() {
        FixedIntInsets fixedIntInsets = SpacerKt.EmptyWindowInsets;
        this.ancestorConsumedInsets = fixedIntInsets;
        this.consumedInsets = fixedIntInsets;
    }

    public abstract WindowInsets calculateInsets(WindowInsets windowInsets);

    @Override // androidx.compose.ui.node.TraversableNode
    public final Object getTraverseKey() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }

    public void insetsInvalidated() {
        this.consumedInsets = calculateInsets(this.ancestorConsumedInsets);
        DepthSortedSetKt.traverseDescendants(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new InsetsConsumingModifierNode$$ExternalSyntheticLambda0(this, 0));
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        DepthSortedSetKt.traverseAncestors(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new InsetsConsumingModifierNode$$ExternalSyntheticLambda0(this, 1));
        insetsInvalidated();
        super.onAttach();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.consumedInsets = this.ancestorConsumedInsets;
        DepthSortedSetKt.traverseDescendants(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new InsetsConsumingModifierNode$$ExternalSyntheticLambda0(this, 0));
        super.onDetach();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onReset() {
        super.onReset();
        this.ancestorConsumedInsets = SpacerKt.EmptyWindowInsets;
    }
}
