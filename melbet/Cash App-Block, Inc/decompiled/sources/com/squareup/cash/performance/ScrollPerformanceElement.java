package com.squareup.cash.performance;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.squareup.cash.cdf.performance.PerformanceMeasureScrollPerformance;
import com.squareup.cash.payments.views.MainPaymentView$Content$2$1;
import com.squareup.cash.util.clock.Clock$Companion;
import kotlin.Metadata;
import kotlin.io.LinesSequence;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.internal.ContextScope;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/squareup/cash/performance/ScrollPerformanceElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lcom/squareup/cash/performance/ScrollPerformanceNode;", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* data */ class ScrollPerformanceElement extends ModifierNodeElement {
    public final PerformanceMeasureScrollPerformance.Element element;
    public final MainPaymentView$Content$2$1 onLogScrollPerf;
    public final float refreshRate;
    public final ContextScope scope;
    public final ScrollableState scrollableState;

    public ScrollPerformanceElement(PerformanceMeasureScrollPerformance.Element element, ScrollableState scrollableState, float f, ContextScope contextScope, MainPaymentView$Content$2$1 mainPaymentView$Content$2$1) {
        scrollableState.getClass();
        this.element = element;
        this.scrollableState = scrollableState;
        this.refreshRate = f;
        this.scope = contextScope;
        this.onLogScrollPerf = mainPaymentView$Content$2$1;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        return new ScrollPerformanceNode(this.element, this.scrollableState, this.refreshRate, this.scope, this.onLogScrollPerf);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ScrollPerformanceElement) {
            ScrollPerformanceElement scrollPerformanceElement = (ScrollPerformanceElement) obj;
            return this.element == scrollPerformanceElement.element && Intrinsics.areEqual(this.scrollableState, scrollPerformanceElement.scrollableState) && Float.compare(this.refreshRate, scrollPerformanceElement.refreshRate) == 0 && this.scope == scrollPerformanceElement.scope && this.onLogScrollPerf == scrollPerformanceElement.onLogScrollPerf;
        }
        return false;
    }

    public final int hashCode() {
        return this.onLogScrollPerf.hashCode() + ((Clock$Companion.REAL.hashCode() + ((this.scope.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.refreshRate, (this.scrollableState.hashCode() + (this.element.hashCode() * 31)) * 31, 31)) * 31)) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.name = "trackScrollPerformance";
        LinesSequence linesSequence = inspectorInfo.properties;
        linesSequence.set(this.element, "element");
        linesSequence.set(this.scrollableState, "scrollableState");
    }

    public final String toString() {
        return "ScrollPerformanceElement(element=" + this.element + ", scrollableState=" + this.scrollableState + ", refreshRate=" + this.refreshRate + ", scope=" + this.scope + ", clock=" + Clock$Companion.REAL + ", onLogScrollPerf=" + this.onLogScrollPerf + ")";
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        ScrollPerformanceNode scrollPerformanceNode = (ScrollPerformanceNode) node;
        scrollPerformanceNode.getClass();
        ScrollableState scrollableState = this.scrollableState;
        scrollableState.getClass();
        if (Intrinsics.areEqual(scrollPerformanceNode.scrollableState, scrollableState)) {
            return;
        }
        scrollPerformanceNode.scrollableState = scrollableState;
        if (scrollPerformanceNode.isAttached()) {
            JobKt.launch$default(scrollPerformanceNode.getCoroutineScope(), null, null, new ScrollPerformanceNode$onDetach$1(scrollPerformanceNode, null, 1), 3);
        }
    }
}
