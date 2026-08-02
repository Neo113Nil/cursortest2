package androidx.compose.animation.core;

import androidx.camera.camera2.pipe.core.Threads$$ExternalSyntheticLambda1;
import androidx.collection.MutableObjectList;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.sync.MutexImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.InteractionResult;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class SeekableTransitionState extends InteractionResult {
    public final SeekableTransitionState$$ExternalSyntheticLambda1 animateOneFrameLambda;
    public Object composedTargetState;
    public CancellableContinuationImpl compositionContinuation;
    public final MutexImpl compositionContinuationMutex;
    public SeekingAnimationState currentAnimation;
    public final ParcelableSnapshotMutableState currentState$delegate;
    public float durationScale;
    public final SeekableTransitionState$$ExternalSyntheticLambda1 firstFrameLambda;
    public final ParcelableSnapshotMutableFloatState fraction$delegate;
    public final MutableObjectList initialValueAnimations;
    public long lastFrameTimeNanos;
    public final MutatorMutex mutatorMutex;
    public final Threads$$ExternalSyntheticLambda1 recalculateTotalDurationNanos;
    public SnapshotStateObserver snapshotStateObserver;
    public final ParcelableSnapshotMutableState targetState$delegate;
    public long totalDurationNanos;
    public Transition transition;
    public static final AnimationVector1D ZeroVelocity = new AnimationVector1D(RecyclerView.DECELERATION_RATE);
    public static final AnimationVector1D Target1 = new AnimationVector1D(1.0f);

    public final class SeekingAnimationState {
        public VectorizedFiniteAnimationSpec animationSpec;
        public long animationSpecDuration;
        public long durationNanos;
        public AnimationVector1D initialVelocity;
        public boolean isComplete;
        public long progressNanos;
        public final AnimationVector1D start = new AnimationVector1D(RecyclerView.DECELERATION_RATE);
        public float value;

        public final long getDurationNanos() {
            return this.durationNanos;
        }

        public final float getValue() {
            return this.value;
        }

        public final void setComplete() {
            this.isComplete = false;
        }

        public final String toString() {
            return "progress nanos: " + this.progressNanos + ", animationSpec: " + this.animationSpec + ", isComplete: " + this.isComplete + ", value: " + this.value + ", start: " + this.start + ", initialVelocity: " + this.initialVelocity + ", durationNanos: " + this.durationNanos + ", animationSpecDuration: " + this.animationSpecDuration;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.animation.core.SeekableTransitionState$$ExternalSyntheticLambda1] */
    /* JADX WARN: Type inference failed for: r5v7, types: [androidx.compose.animation.core.SeekableTransitionState$$ExternalSyntheticLambda1] */
    public SeekableTransitionState(Object obj) {
        super((byte) 0, 1);
        final int i = 0;
        final int i2 = 1;
        this.targetState$delegate = Updater.mutableStateOf$default(obj);
        this.currentState$delegate = Updater.mutableStateOf$default(obj);
        this.composedTargetState = obj;
        this.recalculateTotalDurationNanos = new Threads$$ExternalSyntheticLambda1(this, 14);
        this.fraction$delegate = new ParcelableSnapshotMutableFloatState(RecyclerView.DECELERATION_RATE);
        this.compositionContinuationMutex = new MutexImpl();
        this.mutatorMutex = new MutatorMutex();
        this.lastFrameTimeNanos = Long.MIN_VALUE;
        this.initialValueAnimations = new MutableObjectList();
        this.firstFrameLambda = new Function1(this) { // from class: androidx.compose.animation.core.SeekableTransitionState$$ExternalSyntheticLambda1
            public final /* synthetic */ SeekableTransitionState f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i3 = i;
                SeekableTransitionState seekableTransitionState = this.f$0;
                Long l = (Long) obj2;
                switch (i3) {
                    case 0:
                        seekableTransitionState.lastFrameTimeNanos = l.longValue();
                        break;
                    default:
                        long longValue = l.longValue();
                        long j = longValue - seekableTransitionState.lastFrameTimeNanos;
                        seekableTransitionState.lastFrameTimeNanos = longValue;
                        long roundToLong = MathKt__MathJVMKt.roundToLong(j / seekableTransitionState.durationScale);
                        MutableObjectList mutableObjectList = seekableTransitionState.initialValueAnimations;
                        if (mutableObjectList.isNotEmpty()) {
                            Object[] objArr = mutableObjectList.content;
                            int i4 = mutableObjectList._size;
                            int i5 = 0;
                            for (int i6 = 0; i6 < i4; i6++) {
                                SeekableTransitionState.SeekingAnimationState seekingAnimationState = (SeekableTransitionState.SeekingAnimationState) objArr[i6];
                                SeekableTransitionState.recalculateAnimationValue(seekingAnimationState, roundToLong);
                                seekingAnimationState.isComplete = true;
                            }
                            Transition transition = seekableTransitionState.transition;
                            if (transition != null) {
                                transition.updateInitialValues$animation_core();
                            }
                            int i7 = mutableObjectList._size;
                            Object[] objArr2 = mutableObjectList.content;
                            IntRange until = RangesKt___RangesKt.until(0, i7);
                            int i8 = until.first;
                            int i9 = until.last;
                            if (i8 <= i9) {
                                while (true) {
                                    objArr2[i8 - i5] = objArr2[i8];
                                    if (((SeekableTransitionState.SeekingAnimationState) objArr2[i8]).isComplete) {
                                        i5++;
                                    }
                                    if (i8 != i9) {
                                        i8++;
                                    }
                                }
                            }
                            ArraysKt___ArraysJvmKt.fill(objArr2, i7 - i5, i7, null);
                            mutableObjectList._size -= i5;
                        }
                        SeekableTransitionState.SeekingAnimationState seekingAnimationState2 = seekableTransitionState.currentAnimation;
                        if (seekingAnimationState2 != null) {
                            seekingAnimationState2.durationNanos = seekableTransitionState.totalDurationNanos;
                            SeekableTransitionState.recalculateAnimationValue(seekingAnimationState2, roundToLong);
                            seekableTransitionState.setFraction(seekingAnimationState2.value);
                            if (seekingAnimationState2.value == 1.0f) {
                                seekableTransitionState.currentAnimation = null;
                            }
                            seekableTransitionState.seekToFraction();
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        this.animateOneFrameLambda = new Function1(this) { // from class: androidx.compose.animation.core.SeekableTransitionState$$ExternalSyntheticLambda1
            public final /* synthetic */ SeekableTransitionState f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i3 = i2;
                SeekableTransitionState seekableTransitionState = this.f$0;
                Long l = (Long) obj2;
                switch (i3) {
                    case 0:
                        seekableTransitionState.lastFrameTimeNanos = l.longValue();
                        break;
                    default:
                        long longValue = l.longValue();
                        long j = longValue - seekableTransitionState.lastFrameTimeNanos;
                        seekableTransitionState.lastFrameTimeNanos = longValue;
                        long roundToLong = MathKt__MathJVMKt.roundToLong(j / seekableTransitionState.durationScale);
                        MutableObjectList mutableObjectList = seekableTransitionState.initialValueAnimations;
                        if (mutableObjectList.isNotEmpty()) {
                            Object[] objArr = mutableObjectList.content;
                            int i4 = mutableObjectList._size;
                            int i5 = 0;
                            for (int i6 = 0; i6 < i4; i6++) {
                                SeekableTransitionState.SeekingAnimationState seekingAnimationState = (SeekableTransitionState.SeekingAnimationState) objArr[i6];
                                SeekableTransitionState.recalculateAnimationValue(seekingAnimationState, roundToLong);
                                seekingAnimationState.isComplete = true;
                            }
                            Transition transition = seekableTransitionState.transition;
                            if (transition != null) {
                                transition.updateInitialValues$animation_core();
                            }
                            int i7 = mutableObjectList._size;
                            Object[] objArr2 = mutableObjectList.content;
                            IntRange until = RangesKt___RangesKt.until(0, i7);
                            int i8 = until.first;
                            int i9 = until.last;
                            if (i8 <= i9) {
                                while (true) {
                                    objArr2[i8 - i5] = objArr2[i8];
                                    if (((SeekableTransitionState.SeekingAnimationState) objArr2[i8]).isComplete) {
                                        i5++;
                                    }
                                    if (i8 != i9) {
                                        i8++;
                                    }
                                }
                            }
                            ArraysKt___ArraysJvmKt.fill(objArr2, i7 - i5, i7, null);
                            mutableObjectList._size -= i5;
                        }
                        SeekableTransitionState.SeekingAnimationState seekingAnimationState2 = seekableTransitionState.currentAnimation;
                        if (seekingAnimationState2 != null) {
                            seekingAnimationState2.durationNanos = seekableTransitionState.totalDurationNanos;
                            SeekableTransitionState.recalculateAnimationValue(seekingAnimationState2, roundToLong);
                            seekableTransitionState.setFraction(seekingAnimationState2.value);
                            if (seekingAnimationState2.value == 1.0f) {
                                seekableTransitionState.currentAnimation = null;
                            }
                            seekableTransitionState.seekToFraction();
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        };
    }

    public static final void access$moveAnimationToInitialState(SeekableTransitionState seekableTransitionState) {
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = seekableTransitionState.fraction$delegate;
        Transition transition = seekableTransitionState.transition;
        if (transition == null) {
            return;
        }
        SeekingAnimationState seekingAnimationState = seekableTransitionState.currentAnimation;
        if (seekingAnimationState == null) {
            if (seekableTransitionState.totalDurationNanos <= 0 || parcelableSnapshotMutableFloatState.getFloatValue() == 1.0f || Intrinsics.areEqual(seekableTransitionState.currentState$delegate.getValue(), seekableTransitionState.targetState$delegate.getValue())) {
                seekingAnimationState = null;
            } else {
                seekingAnimationState = new SeekingAnimationState();
                seekingAnimationState.value = parcelableSnapshotMutableFloatState.getFloatValue();
                long j = seekableTransitionState.totalDurationNanos;
                seekingAnimationState.durationNanos = j;
                seekingAnimationState.animationSpecDuration = MathKt__MathJVMKt.roundToLong((1.0d - parcelableSnapshotMutableFloatState.getFloatValue()) * j);
                seekingAnimationState.start.set$animation_core(parcelableSnapshotMutableFloatState.getFloatValue(), 0);
            }
        }
        if (seekingAnimationState != null) {
            seekingAnimationState.durationNanos = seekableTransitionState.totalDurationNanos;
            seekableTransitionState.initialValueAnimations.add(seekingAnimationState);
            transition.setInitialAnimations$animation_core(seekingAnimationState);
        }
        seekableTransitionState.currentAnimation = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0071, code lost:
    
        if (androidx.compose.runtime.Updater.getMonotonicFrameClock(r1.getContext()).withFrameNanos(r1, r11) == r2) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$runAnimations(SeekableTransitionState seekableTransitionState, ContinuationImpl continuationImpl) {
        SeekableTransitionState$runAnimations$1 seekableTransitionState$runAnimations$1;
        Object obj;
        int i;
        MutableObjectList mutableObjectList = seekableTransitionState.initialValueAnimations;
        if (continuationImpl instanceof SeekableTransitionState$runAnimations$1) {
            seekableTransitionState$runAnimations$1 = (SeekableTransitionState$runAnimations$1) continuationImpl;
            int i2 = seekableTransitionState$runAnimations$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                seekableTransitionState$runAnimations$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = seekableTransitionState$runAnimations$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = seekableTransitionState$runAnimations$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    if (mutableObjectList.isEmpty() && seekableTransitionState.currentAnimation == null) {
                        return Unit.INSTANCE;
                    }
                    if (AnimatableKt.getDurationScale(seekableTransitionState$runAnimations$1.getContext()) == RecyclerView.DECELERATION_RATE) {
                        seekableTransitionState.endAllAnimations();
                        seekableTransitionState.lastFrameTimeNanos = Long.MIN_VALUE;
                        return Unit.INSTANCE;
                    }
                    if (seekableTransitionState.lastFrameTimeNanos == Long.MIN_VALUE) {
                        SeekableTransitionState$$ExternalSyntheticLambda1 seekableTransitionState$$ExternalSyntheticLambda1 = seekableTransitionState.firstFrameLambda;
                        seekableTransitionState$runAnimations$1.label = 1;
                    }
                } else {
                    if (i != 1 && i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj2);
                }
                do {
                    if (mutableObjectList.isNotEmpty() && seekableTransitionState.currentAnimation == null) {
                        seekableTransitionState.lastFrameTimeNanos = Long.MIN_VALUE;
                        return Unit.INSTANCE;
                    }
                    seekableTransitionState$runAnimations$1.label = 2;
                } while (seekableTransitionState.animateOneFrame(seekableTransitionState$runAnimations$1) != obj);
                return obj;
            }
        }
        seekableTransitionState$runAnimations$1 = new SeekableTransitionState$runAnimations$1(seekableTransitionState, continuationImpl);
        Object obj22 = seekableTransitionState$runAnimations$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = seekableTransitionState$runAnimations$1.label;
        if (i != 0) {
        }
        do {
            if (mutableObjectList.isNotEmpty()) {
            }
            seekableTransitionState$runAnimations$1.label = 2;
        } while (seekableTransitionState.animateOneFrame(seekableTransitionState$runAnimations$1) != obj);
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004d, code lost:
    
        if (r0.lock(r1) == r2) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$waitForComposition(SeekableTransitionState seekableTransitionState, ContinuationImpl continuationImpl) {
        SeekableTransitionState$waitForComposition$1 seekableTransitionState$waitForComposition$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object value;
        Object result;
        Object obj;
        MutexImpl mutexImpl = seekableTransitionState.compositionContinuationMutex;
        if (continuationImpl instanceof SeekableTransitionState$waitForComposition$1) {
            seekableTransitionState$waitForComposition$1 = (SeekableTransitionState$waitForComposition$1) continuationImpl;
            int i2 = seekableTransitionState$waitForComposition$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                seekableTransitionState$waitForComposition$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = seekableTransitionState$waitForComposition$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = seekableTransitionState$waitForComposition$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    value = seekableTransitionState.targetState$delegate.getValue();
                    seekableTransitionState$waitForComposition$1.L$0 = value;
                    seekableTransitionState$waitForComposition$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj = seekableTransitionState$waitForComposition$1.L$0;
                        SafeTrace.throwOnFailure(obj2);
                        if (!Intrinsics.areEqual(obj2, obj)) {
                            return Unit.INSTANCE;
                        }
                        seekableTransitionState.lastFrameTimeNanos = Long.MIN_VALUE;
                        throw new CancellationException("targetState while waiting for composition");
                    }
                    Object obj3 = seekableTransitionState$waitForComposition$1.L$0;
                    SafeTrace.throwOnFailure(obj2);
                    value = obj3;
                }
                seekableTransitionState$waitForComposition$1.L$0 = value;
                seekableTransitionState$waitForComposition$1.label = 2;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(seekableTransitionState$waitForComposition$1));
                cancellableContinuationImpl.initCancellability();
                seekableTransitionState.compositionContinuation = cancellableContinuationImpl;
                mutexImpl.unlock(null);
                result = cancellableContinuationImpl.getResult();
                if (result != coroutineSingletons) {
                    obj = value;
                    obj2 = result;
                    if (!Intrinsics.areEqual(obj2, obj)) {
                    }
                }
                return coroutineSingletons;
            }
        }
        seekableTransitionState$waitForComposition$1 = new SeekableTransitionState$waitForComposition$1(seekableTransitionState, continuationImpl);
        Object obj22 = seekableTransitionState$waitForComposition$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = seekableTransitionState$waitForComposition$1.label;
        if (i != 0) {
        }
        seekableTransitionState$waitForComposition$1.L$0 = value;
        seekableTransitionState$waitForComposition$1.label = 2;
        CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(seekableTransitionState$waitForComposition$1));
        cancellableContinuationImpl2.initCancellability();
        seekableTransitionState.compositionContinuation = cancellableContinuationImpl2;
        mutexImpl.unlock(null);
        result = cancellableContinuationImpl2.getResult();
        if (result != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004d, code lost:
    
        if (r0.lock(r1) == r2) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$waitForCompositionAfterTargetStateChange(SeekableTransitionState seekableTransitionState, ContinuationImpl continuationImpl) {
        SeekableTransitionState$waitForCompositionAfterTargetStateChange$1 seekableTransitionState$waitForCompositionAfterTargetStateChange$1;
        int i;
        Object value;
        Object obj;
        MutexImpl mutexImpl = seekableTransitionState.compositionContinuationMutex;
        if (continuationImpl instanceof SeekableTransitionState$waitForCompositionAfterTargetStateChange$1) {
            seekableTransitionState$waitForCompositionAfterTargetStateChange$1 = (SeekableTransitionState$waitForCompositionAfterTargetStateChange$1) continuationImpl;
            int i2 = seekableTransitionState$waitForCompositionAfterTargetStateChange$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                seekableTransitionState$waitForCompositionAfterTargetStateChange$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = seekableTransitionState$waitForCompositionAfterTargetStateChange$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = seekableTransitionState$waitForCompositionAfterTargetStateChange$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    value = seekableTransitionState.targetState$delegate.getValue();
                    seekableTransitionState$waitForCompositionAfterTargetStateChange$1.L$0 = value;
                    seekableTransitionState$waitForCompositionAfterTargetStateChange$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj = seekableTransitionState$waitForCompositionAfterTargetStateChange$1.L$0;
                        SafeTrace.throwOnFailure(obj2);
                        if (!Intrinsics.areEqual(obj2, obj)) {
                            seekableTransitionState.lastFrameTimeNanos = Long.MIN_VALUE;
                            throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
                        }
                        return Unit.INSTANCE;
                    }
                    Object obj3 = seekableTransitionState$waitForCompositionAfterTargetStateChange$1.L$0;
                    SafeTrace.throwOnFailure(obj2);
                    value = obj3;
                }
                if (!Intrinsics.areEqual(value, seekableTransitionState.composedTargetState)) {
                    mutexImpl.unlock(null);
                    return Unit.INSTANCE;
                }
                seekableTransitionState$waitForCompositionAfterTargetStateChange$1.L$0 = value;
                seekableTransitionState$waitForCompositionAfterTargetStateChange$1.label = 2;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(seekableTransitionState$waitForCompositionAfterTargetStateChange$1));
                cancellableContinuationImpl.initCancellability();
                seekableTransitionState.compositionContinuation = cancellableContinuationImpl;
                mutexImpl.unlock(null);
                Object result = cancellableContinuationImpl.getResult();
                if (result != coroutineSingletons) {
                    obj = value;
                    obj2 = result;
                    if (!Intrinsics.areEqual(obj2, obj)) {
                    }
                    return Unit.INSTANCE;
                }
                return coroutineSingletons;
            }
        }
        seekableTransitionState$waitForCompositionAfterTargetStateChange$1 = new SeekableTransitionState$waitForCompositionAfterTargetStateChange$1(seekableTransitionState, continuationImpl);
        Object obj22 = seekableTransitionState$waitForCompositionAfterTargetStateChange$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = seekableTransitionState$waitForCompositionAfterTargetStateChange$1.label;
        if (i != 0) {
        }
        if (!Intrinsics.areEqual(value, seekableTransitionState.composedTargetState)) {
        }
    }

    public static void recalculateAnimationValue(SeekingAnimationState seekingAnimationState, long j) {
        long j2 = seekingAnimationState.progressNanos + j;
        seekingAnimationState.progressNanos = j2;
        long j3 = seekingAnimationState.animationSpecDuration;
        if (j2 >= j3) {
            seekingAnimationState.value = 1.0f;
            return;
        }
        VectorizedFiniteAnimationSpec vectorizedFiniteAnimationSpec = seekingAnimationState.animationSpec;
        AnimationVector1D animationVector1D = seekingAnimationState.start;
        if (vectorizedFiniteAnimationSpec == null) {
            float f = j2 / j3;
            seekingAnimationState.value = (f * 1.0f) + ((1.0f - f) * animationVector1D.get$animation_core(0));
            return;
        }
        AnimationVector1D animationVector1D2 = seekingAnimationState.initialVelocity;
        if (animationVector1D2 == null) {
            animationVector1D2 = ZeroVelocity;
        }
        seekingAnimationState.value = RangesKt___RangesKt.coerceIn(((AnimationVector1D) vectorizedFiniteAnimationSpec.getValueFromNanos(j2, animationVector1D, Target1, animationVector1D2)).get$animation_core(0), RecyclerView.DECELERATION_RATE, 1.0f);
    }

    public final Object animateOneFrame(ContinuationImpl continuationImpl) {
        float durationScale = AnimatableKt.getDurationScale(continuationImpl.getContext());
        if (durationScale <= RecyclerView.DECELERATION_RATE) {
            endAllAnimations();
            return Unit.INSTANCE;
        }
        this.durationScale = durationScale;
        Object withFrameNanos = Updater.getMonotonicFrameClock(continuationImpl.getContext()).withFrameNanos(continuationImpl, this.animateOneFrameLambda);
        return withFrameNanos == CoroutineSingletons.COROUTINE_SUSPENDED ? withFrameNanos : Unit.INSTANCE;
    }

    public final void endAllAnimations() {
        Transition transition = this.transition;
        if (transition != null) {
            transition.clearInitialAnimations$animation_core();
        }
        this.initialValueAnimations.clear();
        if (this.currentAnimation != null) {
            this.currentAnimation = null;
            setFraction(1.0f);
            seekToFraction();
        }
    }

    @Override // papa.InteractionResult
    public final Object getCurrentState() {
        return this.currentState$delegate.getValue();
    }

    @Override // papa.InteractionResult
    public final Object getTargetState() {
        return this.targetState$delegate.getValue();
    }

    public final void onTotalDurationChanged$animation_core() {
        long j = this.totalDurationNanos;
        SnapshotStateObserver snapshotStateObserver = this.snapshotStateObserver;
        if (snapshotStateObserver != null) {
            snapshotStateObserver.observeReads(this, AnimatableKt.SeekableTransitionStateTotalDurationChanged, this.recalculateTotalDurationNanos);
        }
        long j2 = this.totalDurationNanos;
        if (j != j2) {
            SeekingAnimationState seekingAnimationState = this.currentAnimation;
            if (seekingAnimationState == null) {
                if (j2 != 0) {
                    seekToFraction();
                }
            } else {
                if (seekingAnimationState.progressNanos > j2) {
                    endAllAnimations();
                    return;
                }
                seekingAnimationState.durationNanos = j2;
                if (seekingAnimationState.animationSpec == null) {
                    seekingAnimationState.animationSpecDuration = MathKt__MathJVMKt.roundToLong((1.0d - seekingAnimationState.start.get$animation_core(0)) * this.totalDurationNanos);
                }
            }
        }
    }

    public final Object seekTo(float f, Object obj, SuspendLambda suspendLambda) {
        if (RecyclerView.DECELERATION_RATE > f || f > 1.0f) {
            PreconditionsKt.throwIllegalArgumentException("Expecting fraction between 0 and 1. Got " + f);
        }
        Transition transition = this.transition;
        if (transition == null) {
            return Unit.INSTANCE;
        }
        Object mutate$default = MutatorMutex.mutate$default(this.mutatorMutex, new SeekableTransitionState$seekTo$3(obj, this.targetState$delegate.getValue(), this, transition, f, null), suspendLambda);
        return mutate$default == CoroutineSingletons.COROUTINE_SUSPENDED ? mutate$default : Unit.INSTANCE;
    }

    public final void seekToFraction() {
        Transition transition = this.transition;
        if (transition == null) {
            return;
        }
        transition.seekAnimations$animation_core(MathKt__MathJVMKt.roundToLong(this.fraction$delegate.getFloatValue() * ((Number) transition.totalDurationNanos$delegate.getValue()).longValue()));
    }

    @Override // papa.InteractionResult
    public final void setCurrentState$animation_core(Object obj) {
        this.currentState$delegate.setValue(obj);
    }

    public final void setFraction(float f) {
        this.fraction$delegate.setFloatValue(f);
    }

    public final void setSnapshotStateObserver$animation_core(SnapshotStateObserver snapshotStateObserver) {
        if (Intrinsics.areEqual(this.snapshotStateObserver, snapshotStateObserver)) {
            return;
        }
        SnapshotStateObserver snapshotStateObserver2 = this.snapshotStateObserver;
        if (snapshotStateObserver2 != null) {
            snapshotStateObserver2.clear(this);
        }
        SnapshotStateObserver snapshotStateObserver3 = this.snapshotStateObserver;
        if (snapshotStateObserver3 != null) {
            snapshotStateObserver3.stop();
        }
        this.snapshotStateObserver = snapshotStateObserver;
        if (snapshotStateObserver != null) {
            snapshotStateObserver.start();
        }
        SnapshotStateObserver snapshotStateObserver4 = this.snapshotStateObserver;
        if (snapshotStateObserver4 != null) {
            snapshotStateObserver4.observeReads(this, AnimatableKt.SeekableTransitionStateTotalDurationChanged, this.recalculateTotalDurationNanos);
        }
    }

    @Override // papa.InteractionResult
    public final void transitionConfigured$animation_core(Transition transition) {
        Transition transition2 = this.transition;
        if (transition2 != null && transition != transition2) {
            PreconditionsKt.throwIllegalStateException("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.transition + ", new instance: " + transition);
        }
        this.transition = transition;
    }

    @Override // papa.InteractionResult
    public final void transitionRemoved$animation_core() {
        this.transition = null;
        SnapshotStateObserver snapshotStateObserver = this.snapshotStateObserver;
        if (snapshotStateObserver != null) {
            snapshotStateObserver.clear(this);
        }
    }
}
