package com.squareup.cash.moneybot.views.shared;

import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.MotionDurationScale;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class BaselineFlowKt$BaselineFlow$7$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ boolean $animate;
    public final /* synthetic */ long $initialDelay;
    public final /* synthetic */ Function0 $onAnimationComplete;
    public final /* synthetic */ Function0 $onLastWordReveal;
    public final /* synthetic */ List $tokens;
    public final /* synthetic */ ParcelableSnapshotMutableIntState $visibleWordCount$delegate;
    public float F$0;
    public int I$0;
    public int I$1;
    public /* synthetic */ Object L$0;
    public ParcelableSnapshotMutableIntState L$2;
    public Iterator L$3;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaselineFlowKt$BaselineFlow$7$1(boolean z, long j, List list, Function0 function0, Function0 function02, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState, Continuation continuation) {
        super(2, continuation);
        this.$animate = z;
        this.$initialDelay = j;
        this.$tokens = list;
        this.$onLastWordReveal = function0;
        this.$onAnimationComplete = function02;
        this.$visibleWordCount$delegate = parcelableSnapshotMutableIntState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BaselineFlowKt$BaselineFlow$7$1 baselineFlowKt$BaselineFlow$7$1 = new BaselineFlowKt$BaselineFlow$7$1(this.$animate, this.$initialDelay, this.$tokens, this.$onLastWordReveal, this.$onAnimationComplete, this.$visibleWordCount$delegate, continuation);
        baselineFlowKt$BaselineFlow$7$1.L$0 = obj;
        return baselineFlowKt$BaselineFlow$7$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BaselineFlowKt$BaselineFlow$7$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cb, code lost:
    
        if (kotlinx.coroutines.JobKt.delay((long) (100.0f * r4), r13) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0069, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(r10, r13) == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x008e -> B:14:0x00b1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00a9 -> B:13:0x00ad). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        float scaleFactor;
        Iterator it;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState;
        float f;
        int i;
        int intValue;
        int i2;
        int i3;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2;
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = this.label;
        Function0 function0 = this.$onLastWordReveal;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState3 = this.$visibleWordCount$delegate;
        if (i4 == 0) {
            SafeTrace.throwOnFailure(obj);
            if (!this.$animate) {
                function0.invoke();
                this.$onAnimationComplete.invoke();
                return Unit.INSTANCE;
            }
            MotionDurationScale motionDurationScale = (MotionDurationScale) coroutineScope.getCoroutineContext().get(Alignment.Companion.$$INSTANCE);
            scaleFactor = motionDurationScale != null ? motionDurationScale.getScaleFactor() : 1.0f;
            parcelableSnapshotMutableIntState3.setIntValue(0);
            long j = (long) (this.$initialDelay * scaleFactor);
            this.L$0 = null;
            this.F$0 = scaleFactor;
            this.label = 1;
        } else if (i4 == 1) {
            scaleFactor = this.F$0;
            SafeTrace.throwOnFailure(obj);
            it = CollectionsKt__CollectionsKt.getIndices(this.$tokens).iterator();
            parcelableSnapshotMutableIntState = parcelableSnapshotMutableIntState3;
            f = scaleFactor;
            i = 0;
        } else {
            if (i4 != 2) {
                if (i4 != 3) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                this.$onAnimationComplete.invoke();
                return Unit.INSTANCE;
            }
            i3 = this.I$1;
            i2 = this.I$0;
            f = this.F$0;
            it = this.L$3;
            parcelableSnapshotMutableIntState2 = this.L$2;
            SafeTrace.throwOnFailure(obj);
            int i5 = i2;
            intValue = i3;
            i = i5;
            parcelableSnapshotMutableIntState = parcelableSnapshotMutableIntState2;
            parcelableSnapshotMutableIntState.setIntValue(intValue + 1);
        }
        if (it.hasNext()) {
            intValue = ((Number) it.next()).intValue();
            if (intValue > 0) {
                this.L$0 = null;
                this.L$2 = parcelableSnapshotMutableIntState;
                this.L$3 = it;
                this.F$0 = f;
                this.I$0 = i;
                this.I$1 = intValue;
                this.label = 2;
                if (JobKt.delay((long) (40.0f * f), this) != coroutineSingletons) {
                    i2 = i;
                    i3 = intValue;
                    parcelableSnapshotMutableIntState2 = parcelableSnapshotMutableIntState;
                    int i52 = i2;
                    intValue = i3;
                    i = i52;
                    parcelableSnapshotMutableIntState = parcelableSnapshotMutableIntState2;
                }
            }
            parcelableSnapshotMutableIntState.setIntValue(intValue + 1);
            if (it.hasNext()) {
            }
        } else {
            function0.invoke();
            this.L$0 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.F$0 = f;
            this.label = 3;
        }
        return coroutineSingletons;
    }
}
