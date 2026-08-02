package com.squareup.cash.composeUi.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/squareup/cash/composeUi/foundation/layout/AdaptiveStackLayoutWeightElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lcom/squareup/cash/composeUi/foundation/layout/AdaptiveStackLayoutWeightNode;", "compose-ui-foundation"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AdaptiveStackLayoutWeightElement extends ModifierNodeElement {
    public final float weight;

    public AdaptiveStackLayoutWeightElement(float f) {
        this.weight = f;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        AdaptiveStackLayoutWeightNode adaptiveStackLayoutWeightNode = new AdaptiveStackLayoutWeightNode();
        adaptiveStackLayoutWeightNode.weight = this.weight;
        adaptiveStackLayoutWeightNode.fill = true;
        return adaptiveStackLayoutWeightNode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AdaptiveStackLayoutWeightElement) && Float.compare(this.weight, ((AdaptiveStackLayoutWeightElement) obj).weight) == 0;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (Float.hashCode(this.weight) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("weight");
        float f = this.weight;
        inspectorInfo.setValue(Float.valueOf(f));
        inspectorInfo.getProperties().set(Float.valueOf(f), "weight");
        inspectorInfo.getProperties().set(Boolean.TRUE, "fill");
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.weight, "AdaptiveStackLayoutWeightElement(weight=", ", fill=true)");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        AdaptiveStackLayoutWeightNode adaptiveStackLayoutWeightNode = (AdaptiveStackLayoutWeightNode) node;
        adaptiveStackLayoutWeightNode.getClass();
        adaptiveStackLayoutWeightNode.weight = this.weight;
        adaptiveStackLayoutWeightNode.fill = true;
    }
}
