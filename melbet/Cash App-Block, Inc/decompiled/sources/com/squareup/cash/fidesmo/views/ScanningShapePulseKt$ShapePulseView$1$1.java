package com.squareup.cash.fidesmo.views;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
public final class ScanningShapePulseKt$ShapePulseView$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $backgroundColor$delegate;
    public final /* synthetic */ MutableState $currentBeatDuration$delegate;
    public final /* synthetic */ MutableState $currentFillDuration$delegate;
    public final /* synthetic */ MutableFloatState $pulseClock$delegate;
    public final /* synthetic */ SnapshotStateList $pulses;
    public float F$0;
    public float F$1;
    public int I$0;
    public int I$1;
    public long J$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScanningShapePulseKt$ShapePulseView$1$1(SnapshotStateList snapshotStateList, MutableState mutableState, MutableState mutableState2, MutableFloatState mutableFloatState, MutableState mutableState3, Continuation continuation) {
        super(2, continuation);
        this.$pulses = snapshotStateList;
        this.$backgroundColor$delegate = mutableState;
        this.$currentFillDuration$delegate = mutableState2;
        this.$pulseClock$delegate = mutableFloatState;
        this.$currentBeatDuration$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScanningShapePulseKt$ShapePulseView$1$1(this.$pulses, this.$backgroundColor$delegate, this.$currentFillDuration$delegate, this.$pulseClock$delegate, this.$currentBeatDuration$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((ScanningShapePulseKt$ShapePulseView$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0061  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0054 -> B:5:0x0057). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.cash.fidesmo.views.ScanningShapePulseKt$ShapePulseView$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
