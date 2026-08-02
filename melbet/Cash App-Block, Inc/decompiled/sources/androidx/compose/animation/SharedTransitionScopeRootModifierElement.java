package androidx.compose.animation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/SharedTransitionScopeRootModifierElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/animation/SharedTransitionScopeRootModifierNode;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class SharedTransitionScopeRootModifierElement extends ModifierNodeElement {
    public final SharedTransitionScopeImpl sharedTransitionScope;

    public SharedTransitionScopeRootModifierElement(SharedTransitionScopeImpl sharedTransitionScopeImpl) {
        this.sharedTransitionScope = sharedTransitionScopeImpl;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        SharedTransitionScopeRootModifierNode sharedTransitionScopeRootModifierNode = new SharedTransitionScopeRootModifierNode();
        sharedTransitionScopeRootModifierNode.sharedScope = this.sharedTransitionScope;
        return sharedTransitionScopeRootModifierNode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SharedTransitionScopeRootModifierElement) && Intrinsics.areEqual(this.sharedTransitionScope, ((SharedTransitionScopeRootModifierElement) obj).sharedTransitionScope);
    }

    public final int hashCode() {
        return this.sharedTransitionScope.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("SharedTransitionScopeRootModifier");
        inspectorInfo.getProperties().set(this.sharedTransitionScope, "sharedTransitionScope");
    }

    public final String toString() {
        return "SharedTransitionScopeRootModifierElement(sharedTransitionScope=" + this.sharedTransitionScope + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        SharedTransitionScopeRootModifierNode sharedTransitionScopeRootModifierNode = (SharedTransitionScopeRootModifierNode) node;
        SharedTransitionScopeImpl sharedTransitionScopeImpl = sharedTransitionScopeRootModifierNode.sharedScope;
        SharedTransitionScopeImpl sharedTransitionScopeImpl2 = this.sharedTransitionScope;
        if (!Intrinsics.areEqual(sharedTransitionScopeImpl2, sharedTransitionScopeImpl)) {
            DepthSortedSetKt.observeReads(sharedTransitionScopeRootModifierNode, sharedTransitionScopeImpl2.observeAnimatingBlock);
        }
        sharedTransitionScopeRootModifierNode.sharedScope = sharedTransitionScopeImpl2;
    }
}
