package com.squareup.cash.fidesmo.views;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.wallet.views.Hero3DCardViewKt$InteractiveCard$11$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class ScanningPulseCommonKt$rememberScanningStepAnimation$9$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $currentOnStepTurnAnimationFinished$delegate;
    public final /* synthetic */ MutableState $currentOnStepTurnAnimationStarted$delegate;
    public final /* synthetic */ MutableState $currentOnStepTurnHapticTick$delegate;
    public final /* synthetic */ MutableState $currentParams$delegate;
    public final /* synthetic */ Animatable $orbScale;
    public final /* synthetic */ Animatable $rotationDegrees;
    public final /* synthetic */ MutableFloatState $rotationTargetDegrees$delegate;
    public final /* synthetic */ StepTurnAnimationQueue $stepTurnAnimationQueue;
    public float F$0;
    public int I$0;
    public int I$1;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScanningPulseCommonKt$rememberScanningStepAnimation$9$1$1(StepTurnAnimationQueue stepTurnAnimationQueue, Animatable animatable, Animatable animatable2, MutableState mutableState, MutableState mutableState2, MutableFloatState mutableFloatState, MutableState mutableState3, MutableState mutableState4, Continuation continuation) {
        super(2, continuation);
        this.$stepTurnAnimationQueue = stepTurnAnimationQueue;
        this.$rotationDegrees = animatable;
        this.$orbScale = animatable2;
        this.$currentOnStepTurnAnimationStarted$delegate = mutableState;
        this.$currentParams$delegate = mutableState2;
        this.$rotationTargetDegrees$delegate = mutableFloatState;
        this.$currentOnStepTurnHapticTick$delegate = mutableState3;
        this.$currentOnStepTurnAnimationFinished$delegate = mutableState4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScanningPulseCommonKt$rememberScanningStepAnimation$9$1$1 scanningPulseCommonKt$rememberScanningStepAnimation$9$1$1 = new ScanningPulseCommonKt$rememberScanningStepAnimation$9$1$1(this.$stepTurnAnimationQueue, this.$rotationDegrees, this.$orbScale, this.$currentOnStepTurnAnimationStarted$delegate, this.$currentParams$delegate, this.$rotationTargetDegrees$delegate, this.$currentOnStepTurnHapticTick$delegate, this.$currentOnStepTurnAnimationFinished$delegate, continuation);
        scanningPulseCommonKt$rememberScanningStepAnimation$9$1$1.L$0 = obj;
        return scanningPulseCommonKt$rememberScanningStepAnimation$9$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ScanningPulseCommonKt$rememberScanningStepAnimation$9$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f A[Catch: all -> 0x0029, TryCatch #0 {all -> 0x0029, blocks: (B:7:0x001f, B:10:0x005b, B:12:0x005f, B:15:0x006a, B:17:0x00ac, B:18:0x00b7, B:24:0x0100, B:26:0x0104, B:29:0x011f, B:40:0x0038, B:43:0x0047, B:46:0x0050), top: B:2:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0104 A[Catch: all -> 0x0029, TryCatch #0 {all -> 0x0029, blocks: (B:7:0x001f, B:10:0x005b, B:12:0x005f, B:15:0x006a, B:17:0x00ac, B:18:0x00b7, B:24:0x0100, B:26:0x0104, B:29:0x011f, B:40:0x0038, B:43:0x0047, B:46:0x0050), top: B:2:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x016c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0157 -> B:9:0x0158). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0162 -> B:10:0x005b). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        StepTurnAnimationQueue stepTurnAnimationQueue;
        MutableState mutableState;
        int i;
        int i2;
        float f;
        Animatable animatable;
        Float f2;
        SpringSpec spring$default;
        int i3;
        char c;
        ScanningPulseCommonKt$rememberScanningStepAnimation$9$1$1 scanningPulseCommonKt$rememberScanningStepAnimation$9$1$1 = this;
        MutableFloatState mutableFloatState = scanningPulseCommonKt$rememberScanningStepAnimation$9$1$1.$rotationTargetDegrees$delegate;
        CoroutineScope coroutineScope = (CoroutineScope) scanningPulseCommonKt$rememberScanningStepAnimation$9$1$1.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = scanningPulseCommonKt$rememberScanningStepAnimation$9$1$1.label;
        MutableState mutableState2 = scanningPulseCommonKt$rememberScanningStepAnimation$9$1$1.$currentOnStepTurnAnimationFinished$delegate;
        int i5 = 3;
        int i6 = 1;
        StepTurnAnimationQueue stepTurnAnimationQueue2 = scanningPulseCommonKt$rememberScanningStepAnimation$9$1$1.$stepTurnAnimationQueue;
        MutableState mutableState3 = scanningPulseCommonKt$rememberScanningStepAnimation$9$1$1.$currentParams$delegate;
        try {
            if (i4 == 0) {
                SafeTrace.throwOnFailure(obj);
                ((Function0) scanningPulseCommonKt$rememberScanningStepAnimation$9$1$1.$currentOnStepTurnAnimationStarted$delegate.getValue()).invoke();
                if (stepTurnAnimationQueue2.pendingTurnCount <= 0) {
                }
            } else if (i4 == 1) {
                f = scanningPulseCommonKt$rememberScanningStepAnimation$9$1$1.F$0;
                i2 = scanningPulseCommonKt$rememberScanningStepAnimation$9$1$1.I$1;
                i = scanningPulseCommonKt$rememberScanningStepAnimation$9$1$1.I$0;
                SafeTrace.throwOnFailure(obj);
                mutableState = mutableState3;
                if (stepTurnAnimationQueue2.pendingTurnCount != 0) {
                }
            } else {
                if (i4 == 2) {
                    f = scanningPulseCommonKt$rememberScanningStepAnimation$9$1$1.F$0;
                    i2 = scanningPulseCommonKt$rememberScanningStepAnimation$9$1$1.I$1;
                    i = scanningPulseCommonKt$rememberScanningStepAnimation$9$1$1.I$0;
                    SafeTrace.throwOnFailure(obj);
                    mutableState = mutableState3;
                    stepTurnAnimationQueue = stepTurnAnimationQueue2;
                    CoroutineScope coroutineScope2 = coroutineScope;
                    animatable = scanningPulseCommonKt$rememberScanningStepAnimation$9$1$1.$orbScale;
                    f2 = new Float(1.0f);
                    spring$default = AnimatableKt.spring$default(((ScanningShapePulseParams) mutableState.getValue()).orbReturnDamping, ((ScanningShapePulseParams) mutableState.getValue()).orbReturnStiffness, null, 4);
                    scanningPulseCommonKt$rememberScanningStepAnimation$9$1$1.L$0 = coroutineScope2;
                    scanningPulseCommonKt$rememberScanningStepAnimation$9$1$1.I$0 = i;
                    scanningPulseCommonKt$rememberScanningStepAnimation$9$1$1.I$1 = i2;
                    scanningPulseCommonKt$rememberScanningStepAnimation$9$1$1.F$0 = f;
                    i3 = 3;
                    scanningPulseCommonKt$rememberScanningStepAnimation$9$1$1.label = 3;
                    c = 2;
                    if (Animatable.animateTo$default(animatable, f2, spring$default, null, null, scanningPulseCommonKt$rememberScanningStepAnimation$9$1$1, 12) != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                if (i4 != 3) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                c = 2;
                stepTurnAnimationQueue = stepTurnAnimationQueue2;
                i3 = 3;
                mutableState = mutableState3;
                scanningPulseCommonKt$rememberScanningStepAnimation$9$1$1 = this;
                mutableState3 = mutableState;
                i5 = i3;
                i6 = 1;
                stepTurnAnimationQueue2 = stepTurnAnimationQueue;
                if (stepTurnAnimationQueue2.pendingTurnCount <= 0) {
                    ((Function0) mutableState2.getValue()).invoke();
                    return Unit.INSTANCE;
                }
                int i7 = ((ScanningShapePulseParams) mutableState3.getValue()).stepTurnMaxTurnsPerSpring;
                if (i7 < i6) {
                    i7 = i6;
                }
                int min = Math.min(stepTurnAnimationQueue2.pendingTurnCount, i7);
                stepTurnAnimationQueue2.pendingTurnCount -= min;
                JobKt.launch$default(coroutineScope, null, null, new Hero3DCardViewKt$InteractiveCard$11$1(scanningPulseCommonKt$rememberScanningStepAnimation$9$1$1.$orbScale, mutableState3, null, 5), i5);
                ((ParcelableSnapshotMutableFloatState) mutableFloatState).setFloatValue((((ScanningShapePulseParams) mutableState3.getValue()).stepTurnRotationDegrees * min) + ((ParcelableSnapshotMutableFloatState) mutableFloatState).getFloatValue());
                float floatValue = ((ParcelableSnapshotMutableFloatState) mutableFloatState).getFloatValue();
                if (((ScanningShapePulseParams) mutableState3.getValue()).stepTurnRotationDegrees > RecyclerView.DECELERATION_RATE) {
                    ((Function0) scanningPulseCommonKt$rememberScanningStepAnimation$9$1$1.$currentOnStepTurnHapticTick$delegate.getValue()).invoke();
                }
                Animatable animatable2 = scanningPulseCommonKt$rememberScanningStepAnimation$9$1$1.$rotationDegrees;
                Float f3 = new Float(floatValue);
                SpringSpec spring$default2 = AnimatableKt.spring$default(((ScanningShapePulseParams) mutableState3.getValue()).shapeTurnDamping, ((ScanningShapePulseParams) mutableState3.getValue()).shapeTurnStiffness, null, 4);
                scanningPulseCommonKt$rememberScanningStepAnimation$9$1$1.L$0 = coroutineScope;
                scanningPulseCommonKt$rememberScanningStepAnimation$9$1$1.I$0 = i7;
                scanningPulseCommonKt$rememberScanningStepAnimation$9$1$1.I$1 = min;
                scanningPulseCommonKt$rememberScanningStepAnimation$9$1$1.F$0 = floatValue;
                i6 = 1;
                scanningPulseCommonKt$rememberScanningStepAnimation$9$1$1.label = 1;
                CoroutineScope coroutineScope3 = coroutineScope;
                int i8 = i7;
                mutableState = mutableState3;
                if (Animatable.animateTo$default(animatable2, f3, spring$default2, null, null, scanningPulseCommonKt$rememberScanningStepAnimation$9$1$1, 12) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                f = floatValue;
                i2 = min;
                coroutineScope = coroutineScope3;
                i = i8;
                if (stepTurnAnimationQueue2.pendingTurnCount != 0) {
                    stepTurnAnimationQueue = stepTurnAnimationQueue2;
                    long j = ((ScanningShapePulseParams) mutableState.getValue()).stepTurnHoldMillis;
                    scanningPulseCommonKt$rememberScanningStepAnimation$9$1$1.L$0 = coroutineScope;
                    scanningPulseCommonKt$rememberScanningStepAnimation$9$1$1.I$0 = i;
                    scanningPulseCommonKt$rememberScanningStepAnimation$9$1$1.I$1 = i2;
                    scanningPulseCommonKt$rememberScanningStepAnimation$9$1$1.F$0 = f;
                    scanningPulseCommonKt$rememberScanningStepAnimation$9$1$1.label = 2;
                    if (JobKt.delay(j, scanningPulseCommonKt$rememberScanningStepAnimation$9$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    CoroutineScope coroutineScope22 = coroutineScope;
                    animatable = scanningPulseCommonKt$rememberScanningStepAnimation$9$1$1.$orbScale;
                    f2 = new Float(1.0f);
                    spring$default = AnimatableKt.spring$default(((ScanningShapePulseParams) mutableState.getValue()).orbReturnDamping, ((ScanningShapePulseParams) mutableState.getValue()).orbReturnStiffness, null, 4);
                    scanningPulseCommonKt$rememberScanningStepAnimation$9$1$1.L$0 = coroutineScope22;
                    scanningPulseCommonKt$rememberScanningStepAnimation$9$1$1.I$0 = i;
                    scanningPulseCommonKt$rememberScanningStepAnimation$9$1$1.I$1 = i2;
                    scanningPulseCommonKt$rememberScanningStepAnimation$9$1$1.F$0 = f;
                    i3 = 3;
                    scanningPulseCommonKt$rememberScanningStepAnimation$9$1$1.label = 3;
                    c = 2;
                    if (Animatable.animateTo$default(animatable, f2, spring$default, null, null, scanningPulseCommonKt$rememberScanningStepAnimation$9$1$1, 12) != coroutineSingletons) {
                        coroutineScope = coroutineScope22;
                        scanningPulseCommonKt$rememberScanningStepAnimation$9$1$1 = this;
                        mutableState3 = mutableState;
                        i5 = i3;
                        i6 = 1;
                        stepTurnAnimationQueue2 = stepTurnAnimationQueue;
                        if (stepTurnAnimationQueue2.pendingTurnCount <= 0) {
                        }
                    }
                    return coroutineSingletons;
                }
                scanningPulseCommonKt$rememberScanningStepAnimation$9$1$1 = this;
                mutableState3 = mutableState;
                i5 = 3;
                if (stepTurnAnimationQueue2.pendingTurnCount <= 0) {
                }
            }
        } catch (Throwable th) {
            ((Function0) mutableState2.getValue()).invoke();
            throw th;
        }
    }
}
