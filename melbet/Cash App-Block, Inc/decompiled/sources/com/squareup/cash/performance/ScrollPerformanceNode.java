package com.squareup.cash.performance;

import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import com.squareup.cash.cdf.performance.PerformanceMeasureScrollPerformance;
import com.squareup.cash.overlays.OverlayKt$Overlay$1$1$1$1$1;
import com.squareup.cash.payments.views.MainPaymentView$Content$2$1;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes6.dex */
public final class ScrollPerformanceNode extends Modifier.Node implements CompositionLocalConsumerModifierNode {
    public final MainPaymentView$Content$2$1 onLogScrollPerf;
    public final ContextScope scope;
    public ScrollableState scrollableState;
    public final AggregatingScrollPerformanceTracker tracker;

    public ScrollPerformanceNode(PerformanceMeasureScrollPerformance.Element element, ScrollableState scrollableState, float f, ContextScope contextScope, MainPaymentView$Content$2$1 mainPaymentView$Content$2$1) {
        scrollableState.getClass();
        this.scrollableState = scrollableState;
        this.scope = contextScope;
        this.onLogScrollPerf = mainPaymentView$Content$2$1;
        this.tracker = new AggregatingScrollPerformanceTracker(element, f);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        Continuation continuation = null;
        JobKt.launch$default(getCoroutineScope(), null, null, new ScrollPerformanceNode$onDetach$1(this, continuation, 1), 3);
        JobKt.launch$default(getCoroutineScope(), null, null, new OverlayKt$Overlay$1$1$1$1$1(((LifecycleOwner) DepthSortedSetKt.currentValueOf(this, LocalLifecycleOwnerKt.LocalLifecycleOwner)).getLifecycle(), this, continuation, 26), 3);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        JobKt.launch$default(this.scope, null, null, new ScrollPerformanceNode$onDetach$1(this, null, 0), 3);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onReset() {
        this.tracker.stopScrollEvent();
    }
}
