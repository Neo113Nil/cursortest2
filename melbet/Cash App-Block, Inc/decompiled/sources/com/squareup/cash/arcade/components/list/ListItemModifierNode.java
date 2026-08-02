package com.squareup.cash.arcade.components.list;

import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import coil3.compose.ConstraintsSizeResolver$$ExternalSyntheticLambda0;

/* loaded from: classes5.dex */
public final class ListItemModifierNode extends Modifier.Node implements LayoutModifierNode {
    public final int id;
    public final ParcelableSnapshotMutableIntState intrinsicWidth$delegate;
    public SnapshotStateList stateList;

    public ListItemModifierNode(SnapshotStateList snapshotStateList, int i) {
        snapshotStateList.getClass();
        this.stateList = snapshotStateList;
        this.id = i;
        this.intrinsicWidth$delegate = new ParcelableSnapshotMutableIntState(0);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        intrinsicMeasurable.getClass();
        int maxIntrinsicWidth = intrinsicMeasurable.maxIntrinsicWidth(i);
        this.intrinsicWidth$delegate.setIntValue(maxIntrinsicWidth);
        return maxIntrinsicWidth;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo144measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        measurable.getClass();
        Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(j);
        return MeasureScope.layout$default(measureScope, mo833measureBRTryo0.width, mo833measureBRTryo0.height, new ConstraintsSizeResolver$$ExternalSyntheticLambda0(mo833measureBRTryo0, 12));
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        this.stateList.add(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        this.stateList.remove(this);
    }
}
