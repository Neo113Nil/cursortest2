package com.squareup.cash.performance;

import androidx.compose.runtime.Updater;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.cdf.performance.PerformanceMeasureScrollPerformance;
import com.squareup.cash.invitations.InviteErrorPresenter$models$1$1;
import com.squareup.cash.paymentpad.presenters.HomeViewPresenter$models$4$1$2;
import com.squareup.cash.payments.views.MainPaymentView$Content$2$1;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.SafeFlow;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class ScrollPerformanceNode$onDetach$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ ScrollPerformanceNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ScrollPerformanceNode$onDetach$1(ScrollPerformanceNode scrollPerformanceNode, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = scrollPerformanceNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        ScrollPerformanceNode scrollPerformanceNode = this.this$0;
        switch (i) {
            case 0:
                return new ScrollPerformanceNode$onDetach$1(scrollPerformanceNode, continuation, 0);
            default:
                return new ScrollPerformanceNode$onDetach$1(scrollPerformanceNode, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((ScrollPerformanceNode$onDetach$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007d, code lost:
    
        if (r1.invoke(r8, r7) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006e, code lost:
    
        if (r8 == r0) goto L31;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        ScrollPerformanceNode scrollPerformanceNode = this.this$0;
        Continuation continuation = null;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AggregatingScrollPerformanceTracker aggregatingScrollPerformanceTracker = scrollPerformanceNode.tracker;
                    this.label = 1;
                    if (aggregatingScrollPerformanceTracker.isScrolling) {
                        aggregatingScrollPerformanceTracker.stopScrollEvent();
                    }
                    obj = JobKt.withContext(Dispatchers.Default, new InviteErrorPresenter$models$1$1(aggregatingScrollPerformanceTracker, continuation, 25), this);
                    break;
                } else if (i2 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i2 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                PerformanceMeasureScrollPerformance performanceMeasureScrollPerformance = (PerformanceMeasureScrollPerformance) obj;
                if (performanceMeasureScrollPerformance != null) {
                    MainPaymentView$Content$2$1 mainPaymentView$Content$2$1 = scrollPerformanceNode.onLogScrollPerf;
                    this.label = 2;
                    break;
                }
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow snapshotFlow = Updater.snapshotFlow(new BottomSheet$$ExternalSyntheticLambda2(scrollPerformanceNode, 3));
                    HomeViewPresenter$models$4$1$2 homeViewPresenter$models$4$1$2 = new HomeViewPresenter$models$4$1$2(scrollPerformanceNode, 26);
                    this.label = 1;
                    if (snapshotFlow.collect(homeViewPresenter$models$4$1$2, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
