package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class LazyLayoutSemanticsModifier extends ModifierNodeElement {
    public final Function0 itemProviderLambda;
    public final Orientation orientation;
    public final LazyLayoutSemanticState state;
    public final boolean userScrollEnabled;

    public LazyLayoutSemanticsModifier(Function0 function0, LazyLayoutSemanticState lazyLayoutSemanticState, Orientation orientation, boolean z) {
        this.itemProviderLambda = function0;
        this.state = lazyLayoutSemanticState;
        this.orientation = orientation;
        this.userScrollEnabled = z;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        return new LazyLayoutSemanticsModifierNode(this.itemProviderLambda, this.state, this.orientation, this.userScrollEnabled);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutSemanticsModifier)) {
            return false;
        }
        LazyLayoutSemanticsModifier lazyLayoutSemanticsModifier = (LazyLayoutSemanticsModifier) obj;
        return this.itemProviderLambda == lazyLayoutSemanticsModifier.itemProviderLambda && Intrinsics.areEqual(this.state, lazyLayoutSemanticsModifier.state) && this.orientation == lazyLayoutSemanticsModifier.orientation && this.userScrollEnabled == lazyLayoutSemanticsModifier.userScrollEnabled;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.orientation.hashCode() + ((this.state.hashCode() + (this.itemProviderLambda.hashCode() * 31)) * 31)) * 31, 31, this.userScrollEnabled);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        LazyLayoutSemanticsModifierNode lazyLayoutSemanticsModifierNode = (LazyLayoutSemanticsModifierNode) node;
        lazyLayoutSemanticsModifierNode.itemProviderLambda = this.itemProviderLambda;
        lazyLayoutSemanticsModifierNode.state = this.state;
        Orientation orientation = lazyLayoutSemanticsModifierNode.orientation;
        Orientation orientation2 = this.orientation;
        if (orientation != orientation2) {
            lazyLayoutSemanticsModifierNode.orientation = orientation2;
            DepthSortedSetKt.requireLayoutNode(lazyLayoutSemanticsModifierNode).invalidateSemantics$ui();
        }
        boolean z = lazyLayoutSemanticsModifierNode.userScrollEnabled;
        boolean z2 = this.userScrollEnabled;
        if (z == z2) {
            return;
        }
        lazyLayoutSemanticsModifierNode.userScrollEnabled = z2;
        lazyLayoutSemanticsModifierNode.updateCachedSemanticsValues();
        DepthSortedSetKt.requireLayoutNode(lazyLayoutSemanticsModifierNode).invalidateSemantics$ui();
    }
}
