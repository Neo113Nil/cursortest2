package com.squareup.cash.observability.compose;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.node.NodeCoordinator;

/* loaded from: classes6.dex */
public final class PerformanceLoggingNode extends Modifier.Node implements LayoutAwareModifierNode, DrawModifierNode, GlobalPositionAwareModifierNode {
    public boolean drawLogged;
    public boolean globalPositioningLogged;
    public boolean layoutLogged;
    public PerformanceLoggingKt$$ExternalSyntheticLambda0 onDrawFinished;
    public PerformanceLoggingKt$$ExternalSyntheticLambda0 onGlobalPositioningFinished;
    public PerformanceLoggingKt$$ExternalSyntheticLambda0 onLayoutFinished;

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void draw(LayoutNodeDrawScope layoutNodeDrawScope) {
        layoutNodeDrawScope.drawContent();
        PerformanceLoggingKt$$ExternalSyntheticLambda0 performanceLoggingKt$$ExternalSyntheticLambda0 = this.onDrawFinished;
        if (performanceLoggingKt$$ExternalSyntheticLambda0 == null || this.drawLogged) {
            return;
        }
        this.drawLogged = true;
        performanceLoggingKt$$ExternalSyntheticLambda0.invoke();
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public final void onGloballyPositioned(NodeCoordinator nodeCoordinator) {
        PerformanceLoggingKt$$ExternalSyntheticLambda0 performanceLoggingKt$$ExternalSyntheticLambda0 = this.onGlobalPositioningFinished;
        if (performanceLoggingKt$$ExternalSyntheticLambda0 == null || this.globalPositioningLogged) {
            return;
        }
        this.globalPositioningLogged = true;
        performanceLoggingKt$$ExternalSyntheticLambda0.invoke();
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public final void onPlaced(LayoutCoordinates layoutCoordinates) {
        layoutCoordinates.getClass();
        PerformanceLoggingKt$$ExternalSyntheticLambda0 performanceLoggingKt$$ExternalSyntheticLambda0 = this.onLayoutFinished;
        if (performanceLoggingKt$$ExternalSyntheticLambda0 == null || this.layoutLogged) {
            return;
        }
        this.layoutLogged = true;
        performanceLoggingKt$$ExternalSyntheticLambda0.invoke();
    }
}
