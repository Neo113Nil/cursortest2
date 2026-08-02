package com.squareup.cash.performance;

import androidx.lifecycle.Lifecycle;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.cdf.performance.PerformanceMeasureScrollPerformance;
import com.squareup.cash.invitations.InviteErrorPresenter$models$1$1;
import com.squareup.cash.payments.views.MainPaymentView$Content$2$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class ScrollPerformanceNode$startObservingLifecycle$1$1 implements FlowCollector {
    public final /* synthetic */ ScrollPerformanceNode this$0;

    public ScrollPerformanceNode$startObservingLifecycle$1$1(ScrollPerformanceNode scrollPerformanceNode) {
        this.this$0 = scrollPerformanceNode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        if (r6.invoke(r8, r0) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005a, code lost:
    
        if (r8 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Lifecycle.State state, Continuation continuation) {
        ScrollPerformanceNode$startObservingLifecycle$1$1$emit$1 scrollPerformanceNode$startObservingLifecycle$1$1$emit$1;
        int i;
        if (continuation instanceof ScrollPerformanceNode$startObservingLifecycle$1$1$emit$1) {
            scrollPerformanceNode$startObservingLifecycle$1$1$emit$1 = (ScrollPerformanceNode$startObservingLifecycle$1$1$emit$1) continuation;
            int i2 = scrollPerformanceNode$startObservingLifecycle$1$1$emit$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                scrollPerformanceNode$startObservingLifecycle$1$1$emit$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = scrollPerformanceNode$startObservingLifecycle$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scrollPerformanceNode$startObservingLifecycle$1$1$emit$1.label;
                Continuation continuation2 = null;
                ScrollPerformanceNode scrollPerformanceNode = this.this$0;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!state.isAtLeast(Lifecycle.State.STARTED)) {
                        AggregatingScrollPerformanceTracker aggregatingScrollPerformanceTracker = scrollPerformanceNode.tracker;
                        scrollPerformanceNode$startObservingLifecycle$1$1$emit$1.label = 1;
                        if (aggregatingScrollPerformanceTracker.isScrolling) {
                            aggregatingScrollPerformanceTracker.stopScrollEvent();
                        }
                        obj = JobKt.withContext(Dispatchers.Default, new InviteErrorPresenter$models$1$1(aggregatingScrollPerformanceTracker, continuation2, 25), scrollPerformanceNode$startObservingLifecycle$1$1$emit$1);
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    if (i == 2) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                PerformanceMeasureScrollPerformance performanceMeasureScrollPerformance = (PerformanceMeasureScrollPerformance) obj;
                if (performanceMeasureScrollPerformance != null) {
                    MainPaymentView$Content$2$1 mainPaymentView$Content$2$1 = scrollPerformanceNode.onLogScrollPerf;
                    scrollPerformanceNode$startObservingLifecycle$1$1$emit$1.label = 2;
                }
                return Unit.INSTANCE;
            }
        }
        scrollPerformanceNode$startObservingLifecycle$1$1$emit$1 = new ScrollPerformanceNode$startObservingLifecycle$1$1$emit$1(this, continuation);
        Object obj2 = scrollPerformanceNode$startObservingLifecycle$1$1$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scrollPerformanceNode$startObservingLifecycle$1$1$emit$1.label;
        Continuation continuation22 = null;
        ScrollPerformanceNode scrollPerformanceNode2 = this.this$0;
        if (i != 0) {
        }
    }
}
