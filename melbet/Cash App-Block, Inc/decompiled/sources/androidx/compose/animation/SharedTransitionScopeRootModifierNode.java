package androidx.compose.animation;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusOwnerImpl$focusSearch$1;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;

/* loaded from: classes.dex */
public final class SharedTransitionScopeRootModifierNode extends Modifier.Node implements LayoutModifierNode, ObserverModifierNode, DrawModifierNode, CompositionLocalConsumerModifierNode {
    public SharedTransitionScopeImpl sharedScope;

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void draw(LayoutNodeDrawScope layoutNodeDrawScope) {
        layoutNodeDrawScope.drawContent();
        SnapshotStateList snapshotStateList = this.sharedScope.renderers;
        if (snapshotStateList.size() > 1) {
            CollectionsKt__MutableCollectionsJVMKt.sortWith(snapshotStateList, new Comparator() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$drawInOverlay$$inlined$sortBy$1
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    LayerRenderer layerRenderer = (LayerRenderer) obj;
                    LayerRenderer layerRenderer2 = (LayerRenderer) obj2;
                    return ComparisonsKt__ComparisonsKt.compareValues(Float.valueOf((layerRenderer.getZIndex() == RecyclerView.DECELERATION_RATE && (layerRenderer instanceof SharedElementEntry) && ((SharedElementEntry) layerRenderer).parentState == null) ? -1.0f : layerRenderer.getZIndex()), Float.valueOf((layerRenderer2.getZIndex() == RecyclerView.DECELERATION_RATE && (layerRenderer2 instanceof SharedElementEntry) && ((SharedElementEntry) layerRenderer2).parentState == null) ? -1.0f : layerRenderer2.getZIndex()));
                }
            });
        }
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            ((LayerRenderer) snapshotStateList.get(i)).drawInOverlay(layoutNodeDrawScope);
        }
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo144measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(j);
        return MeasureScope.layout$default(measureScope, mo833measureBRTryo0.width, mo833measureBRTryo0.height, new FocusOwnerImpl$focusSearch$1(3, measureScope, this, mo833measureBRTryo0));
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        super.onAttach();
        DepthSortedSetKt.observeReads(this, this.sharedScope.observeAnimatingBlock);
        this.sharedScope.invalidateOverlay = new SharedTransitionScopeRootModifierNode$onAttach$1(this, 0);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        this.sharedScope.invalidateOverlay = null;
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void onObservedReadsChanged() {
        this.sharedScope.updateTransitionActiveness$animation();
        DepthSortedSetKt.observeReads(this, this.sharedScope.observeAnimatingBlock);
    }
}
