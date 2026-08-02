package com.squareup.cash.composeUi.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class AdaptiveStackLayoutWeightNode extends Modifier.Node implements ParentDataModifierNode {
    public boolean fill;
    public float weight;

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    public final Object modifyParentData(Density density, Object obj) {
        density.getClass();
        AdaptiveStackParentData adaptiveStackParentData = obj instanceof AdaptiveStackParentData ? (AdaptiveStackParentData) obj : null;
        if (adaptiveStackParentData == null) {
            adaptiveStackParentData = new AdaptiveStackParentData();
            adaptiveStackParentData.weight = RecyclerView.DECELERATION_RATE;
            adaptiveStackParentData.fill = true;
        }
        adaptiveStackParentData.weight = this.weight;
        adaptiveStackParentData.fill = this.fill;
        return adaptiveStackParentData;
    }
}
