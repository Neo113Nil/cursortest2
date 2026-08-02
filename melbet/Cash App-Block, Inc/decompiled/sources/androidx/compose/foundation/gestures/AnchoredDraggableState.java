package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecImpl;
import androidx.compose.foundation.BorderKt$$ExternalSyntheticLambda1;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.glance.session.SessionWorker$doWork$2$2;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.intercept.EngineInterceptor$intercept$2;
import com.squareup.cash.offers.views.sup.OffersNotificationKt$$ExternalSyntheticLambda3;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.sync.MutexImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class AnchoredDraggableState {
    public final AnchoredDraggableState$anchoredDragScope$1 anchoredDragScope;
    public final ParcelableSnapshotMutableState anchors$delegate;
    public final Function1 confirmValueChange;
    public final ParcelableSnapshotMutableState currentValue$delegate;
    public DecayAnimationSpecImpl decayAnimationSpec;
    public final MutatorMutex dragMutex;
    public final ParcelableSnapshotMutableState dragTarget$delegate;
    public final ParcelableSnapshotMutableFloatState lastVelocity$delegate;
    public final ParcelableSnapshotMutableFloatState offset$delegate;
    public Function1 positionalThreshold;
    public final ParcelableSnapshotMutableState settledValue$delegate;
    public AnimationSpec snapAnimationSpec;
    public final DerivedSnapshotState targetValue$delegate;
    public Function0 velocityThreshold;

    public AnchoredDraggableState(Object obj) {
        this.confirmValueChange = new BorderKt$$ExternalSyntheticLambda1(18);
        this.dragMutex = new MutatorMutex();
        this.currentValue$delegate = Updater.mutableStateOf$default(obj);
        this.settledValue$delegate = Updater.mutableStateOf$default(obj);
        this.targetValue$delegate = Updater.derivedStateOf(new OffersNotificationKt$$ExternalSyntheticLambda3(this, 1));
        this.offset$delegate = new ParcelableSnapshotMutableFloatState(Float.NaN);
        Updater.derivedStateOf(NeverEqualPolicy.INSTANCE$3, new OffersNotificationKt$$ExternalSyntheticLambda3(this, 2));
        this.lastVelocity$delegate = new ParcelableSnapshotMutableFloatState(RecyclerView.DECELERATION_RATE);
        this.dragTarget$delegate = Updater.mutableStateOf$default(null);
        this.anchors$delegate = Updater.mutableStateOf$default(new DefaultDraggableAnchors(EmptyList.INSTANCE, new float[0]));
        this.anchoredDragScope = new AnchoredDraggableState$anchoredDragScope$1(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object anchoredDrag(Object obj, MutatePriority mutatePriority, Function4 function4, ContinuationImpl continuationImpl) {
        AnchoredDraggableState$anchoredDrag$3 anchoredDraggableState$anchoredDrag$3;
        int i;
        try {
            if (continuationImpl instanceof AnchoredDraggableState$anchoredDrag$3) {
                anchoredDraggableState$anchoredDrag$3 = (AnchoredDraggableState$anchoredDrag$3) continuationImpl;
                int i2 = anchoredDraggableState$anchoredDrag$3.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    anchoredDraggableState$anchoredDrag$3.label = i2 - PKIFailureInfo.systemUnavail;
                    AnchoredDraggableState$anchoredDrag$3 anchoredDraggableState$anchoredDrag$32 = anchoredDraggableState$anchoredDrag$3;
                    Object obj2 = anchoredDraggableState$anchoredDrag$32.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = anchoredDraggableState$anchoredDrag$32.label;
                    ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.dragTarget$delegate;
                    Continuation continuation = null;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj2);
                        if (!getAnchors().hasPositionFor(obj)) {
                            if (((Boolean) this.confirmValueChange.invoke(obj)).booleanValue()) {
                                this.settledValue$delegate.setValue(obj);
                                setCurrentValue(obj);
                            }
                            return Unit.INSTANCE;
                        }
                        MutatorMutex mutatorMutex = this.dragMutex;
                        try {
                            SessionWorker$doWork$2$2 sessionWorker$doWork$2$2 = new SessionWorker$doWork$2$2(this, obj, function4, false, continuation, 4);
                            anchoredDraggableState$anchoredDrag$32.label = 1;
                            mutatorMutex.getClass();
                            if (JobKt.coroutineScope(new EngineInterceptor$intercept$2(mutatePriority, mutatorMutex, sessionWorker$doWork$2$2, continuation, 3), anchoredDraggableState$anchoredDrag$32) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } catch (Throwable th) {
                            th = th;
                            continuation = null;
                            parcelableSnapshotMutableState.setValue(continuation);
                            throw th;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj2);
                    }
                    parcelableSnapshotMutableState.setValue(null);
                    return Unit.INSTANCE;
                }
            }
            if (i != 0) {
            }
            parcelableSnapshotMutableState.setValue(null);
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            th = th2;
        }
        anchoredDraggableState$anchoredDrag$3 = new AnchoredDraggableState$anchoredDrag$3(this, continuationImpl);
        AnchoredDraggableState$anchoredDrag$3 anchoredDraggableState$anchoredDrag$322 = anchoredDraggableState$anchoredDrag$3;
        Object obj22 = anchoredDraggableState$anchoredDrag$322.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = anchoredDraggableState$anchoredDrag$322.label;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = this.dragTarget$delegate;
        Continuation continuation2 = null;
    }

    public final float dispatchRawDelta(float f) {
        float newOffsetForDelta$foundation = newOffsetForDelta$foundation(f);
        float requireOffset = newOffsetForDelta$foundation - requireOffset();
        this.anchoredDragScope.dragTo(newOffsetForDelta$foundation, RecyclerView.DECELERATION_RATE);
        return requireOffset;
    }

    public final DefaultDraggableAnchors getAnchors() {
        return (DefaultDraggableAnchors) this.anchors$delegate.getValue();
    }

    public final boolean getUsePreModifierChangeBehavior$foundation() {
        return (this.positionalThreshold == null || this.velocityThreshold == null || this.snapAnimationSpec == null || this.decayAnimationSpec == null) ? false : true;
    }

    public final boolean isAnimationRunning() {
        return this.dragTarget$delegate.getValue() != null;
    }

    public final float newOffsetForDelta$foundation(float f) {
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = this.offset$delegate;
        return RangesKt___RangesKt.coerceIn((Float.isNaN(parcelableSnapshotMutableFloatState.getFloatValue()) ? RecyclerView.DECELERATION_RATE : parcelableSnapshotMutableFloatState.getFloatValue()) + f, getAnchors().minPosition(), getAnchors().maxPosition());
    }

    public final float progress(Enum r3, Enum r4) {
        float positionOf = getAnchors().positionOf(r3);
        float positionOf2 = getAnchors().positionOf(r4);
        float coerceIn = (RangesKt___RangesKt.coerceIn(this.offset$delegate.getFloatValue(), Math.min(positionOf, positionOf2), Math.max(positionOf, positionOf2)) - positionOf) / (positionOf2 - positionOf);
        if (Float.isNaN(coerceIn)) {
            return 1.0f;
        }
        if (coerceIn < 1.0E-6f) {
            return RecyclerView.DECELERATION_RATE;
        }
        if (coerceIn > 0.999999f) {
            return 1.0f;
        }
        return Math.abs(coerceIn);
    }

    public final float requireOffset() {
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = this.offset$delegate;
        if (Float.isNaN(parcelableSnapshotMutableFloatState.getFloatValue())) {
            InlineClassHelperKt.throwIllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return parcelableSnapshotMutableFloatState.getFloatValue();
    }

    public final void setCurrentValue(Object obj) {
        this.currentValue$delegate.setValue(obj);
    }

    public final Object settle(float f, Continuation continuation) {
        if (!getUsePreModifierChangeBehavior$foundation()) {
            InlineClassHelperKt.throwIllegalArgumentException("AnchoredDraggableState was configured through a constructor without providing positional and velocity threshold. This overload of settle has been deprecated. Please refer to AnchoredDraggableState#settle(animationSpec) for more information.");
        }
        Object value = this.currentValue$delegate.getValue();
        DefaultDraggableAnchors anchors = getAnchors();
        float requireOffset = requireOffset();
        Function1 function1 = this.positionalThreshold;
        if (function1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("positionalThreshold");
            throw null;
        }
        Function0 function0 = this.velocityThreshold;
        if (function0 != null) {
            Object access$computeTarget = Draggable2DKt.access$computeTarget(anchors, requireOffset, f, function1, function0);
            return ((Boolean) this.confirmValueChange.invoke(access$computeTarget)).booleanValue() ? Draggable2DKt.animateToWithDecay$default(this, access$computeTarget, f, continuation) : Draggable2DKt.animateToWithDecay$default(this, value, f, continuation);
        }
        Intrinsics.throwUninitializedPropertyAccessException("velocityThreshold");
        throw null;
    }

    public final boolean trySnapTo(Object obj) {
        MutatorMutex mutatorMutex = this.dragMutex;
        MutexImpl mutexImpl = mutatorMutex.mutex;
        MutexImpl mutexImpl2 = mutatorMutex.mutex;
        boolean tryLock = mutexImpl.tryLock(null);
        if (!tryLock) {
            return tryLock;
        }
        try {
            AnchoredDraggableState$anchoredDragScope$1 anchoredDraggableState$anchoredDragScope$1 = this.anchoredDragScope;
            float positionOf = getAnchors().positionOf(obj);
            if (!Float.isNaN(positionOf)) {
                anchoredDraggableState$anchoredDragScope$1.dragTo(positionOf, RecyclerView.DECELERATION_RATE);
                this.dragTarget$delegate.setValue(null);
            }
            setCurrentValue(obj);
            this.settledValue$delegate.setValue(obj);
            mutexImpl2.unlock(null);
            return tryLock;
        } catch (Throwable th) {
            mutexImpl2.unlock(null);
            throw th;
        }
    }

    public final void updateAnchors(DefaultDraggableAnchors defaultDraggableAnchors, Object obj) {
        if (Intrinsics.areEqual(getAnchors(), defaultDraggableAnchors)) {
            return;
        }
        this.anchors$delegate.setValue(defaultDraggableAnchors);
        if (trySnapTo(obj)) {
            return;
        }
        this.dragTarget$delegate.setValue(obj);
    }

    public AnchoredDraggableState(Function1 function1, Object obj) {
        this(obj);
        this.confirmValueChange = function1;
    }
}
