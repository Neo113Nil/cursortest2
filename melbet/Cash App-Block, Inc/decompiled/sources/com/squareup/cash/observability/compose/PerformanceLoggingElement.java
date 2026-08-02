package com.squareup.cash.observability.compose;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.io.LinesSequence;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/squareup/cash/observability/compose/PerformanceLoggingElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lcom/squareup/cash/observability/compose/PerformanceLoggingNode;", "compose"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* data */ class PerformanceLoggingElement extends ModifierNodeElement {
    public final PerformanceLoggingKt$$ExternalSyntheticLambda0 onDrawFinished;
    public final PerformanceLoggingKt$$ExternalSyntheticLambda0 onGlobalPositioningFinished;
    public final PerformanceLoggingKt$$ExternalSyntheticLambda0 onLayoutFinished;

    public PerformanceLoggingElement(PerformanceLoggingKt$$ExternalSyntheticLambda0 performanceLoggingKt$$ExternalSyntheticLambda0, PerformanceLoggingKt$$ExternalSyntheticLambda0 performanceLoggingKt$$ExternalSyntheticLambda02, PerformanceLoggingKt$$ExternalSyntheticLambda0 performanceLoggingKt$$ExternalSyntheticLambda03) {
        this.onLayoutFinished = performanceLoggingKt$$ExternalSyntheticLambda0;
        this.onGlobalPositioningFinished = performanceLoggingKt$$ExternalSyntheticLambda02;
        this.onDrawFinished = performanceLoggingKt$$ExternalSyntheticLambda03;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        PerformanceLoggingNode performanceLoggingNode = new PerformanceLoggingNode();
        performanceLoggingNode.onLayoutFinished = this.onLayoutFinished;
        performanceLoggingNode.onGlobalPositioningFinished = this.onGlobalPositioningFinished;
        performanceLoggingNode.onDrawFinished = this.onDrawFinished;
        return performanceLoggingNode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PerformanceLoggingElement)) {
            return false;
        }
        PerformanceLoggingElement performanceLoggingElement = (PerformanceLoggingElement) obj;
        return this.onLayoutFinished == performanceLoggingElement.onLayoutFinished && this.onGlobalPositioningFinished == performanceLoggingElement.onGlobalPositioningFinished && this.onDrawFinished == performanceLoggingElement.onDrawFinished;
    }

    public final int hashCode() {
        return this.onDrawFinished.hashCode() + ((this.onGlobalPositioningFinished.hashCode() + (this.onLayoutFinished.hashCode() * 31)) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.name = "performanceLogging";
        LinesSequence linesSequence = inspectorInfo.properties;
        linesSequence.set(this.onLayoutFinished, "onLayoutFinished");
        linesSequence.set(this.onGlobalPositioningFinished, "onGlobalPositioningFinished");
        linesSequence.set(this.onDrawFinished, "onDrawFinished");
    }

    public final String toString() {
        return "PerformanceLoggingElement(onLayoutFinished=" + this.onLayoutFinished + ", onGlobalPositioningFinished=" + this.onGlobalPositioningFinished + ", onDrawFinished=" + this.onDrawFinished + ")";
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        PerformanceLoggingNode performanceLoggingNode = (PerformanceLoggingNode) node;
        performanceLoggingNode.getClass();
        performanceLoggingNode.onLayoutFinished = this.onLayoutFinished;
        performanceLoggingNode.onGlobalPositioningFinished = this.onGlobalPositioningFinished;
        performanceLoggingNode.onDrawFinished = this.onDrawFinished;
    }
}
