package androidx.compose.foundation.gestures.snapping;

import androidx.appcompat.widget.Toolbar;
import androidx.camera.view.PreviewView;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.DecayAnimationSpecImpl;
import androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2;
import androidx.compose.foundation.gestures.Draggable2DKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.gestures.ScrollableKt$DefaultScrollMotionDurationScale$1;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class SnapFlingBehavior implements FlingBehavior {
    public final DecayAnimationSpecImpl decayAnimationSpec;
    public final ScrollableKt$DefaultScrollMotionDurationScale$1 motionScaleDuration = ScrollableKt.DefaultScrollMotionDurationScale;
    public final AnimationSpec snapAnimationSpec;
    public final SnapLayoutInfoProvider snapLayoutInfoProvider;

    public SnapFlingBehavior(SnapLayoutInfoProvider snapLayoutInfoProvider, DecayAnimationSpecImpl decayAnimationSpecImpl, AnimationSpec animationSpec) {
        this.snapLayoutInfoProvider = snapLayoutInfoProvider;
        this.decayAnimationSpec = decayAnimationSpecImpl;
        this.snapAnimationSpec = animationSpec;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$tryApproach(SnapFlingBehavior snapFlingBehavior, ScrollScope scrollScope, float f, float f2, SnapFlingBehavior$fling$result$1$$ExternalSyntheticLambda0 snapFlingBehavior$fling$result$1$$ExternalSyntheticLambda0, ContinuationImpl continuationImpl) {
        SnapFlingBehavior$tryApproach$1 snapFlingBehavior$tryApproach$1;
        int i;
        if (continuationImpl instanceof SnapFlingBehavior$tryApproach$1) {
            snapFlingBehavior$tryApproach$1 = (SnapFlingBehavior$tryApproach$1) continuationImpl;
            int i2 = snapFlingBehavior$tryApproach$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                snapFlingBehavior$tryApproach$1.label = i2 - PKIFailureInfo.systemUnavail;
                SnapFlingBehavior$tryApproach$1 snapFlingBehavior$tryApproach$12 = snapFlingBehavior$tryApproach$1;
                Object obj = snapFlingBehavior$tryApproach$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = snapFlingBehavior$tryApproach$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (Math.abs(f) == RecyclerView.DECELERATION_RATE || Math.abs(f2) == RecyclerView.DECELERATION_RATE) {
                        return AnimatableKt.AnimationState$default(f, f2, 28);
                    }
                    snapFlingBehavior$tryApproach$12.label = 1;
                    DecayAnimationSpecImpl decayAnimationSpecImpl = snapFlingBehavior.decayAnimationSpec;
                    obj = (Math.abs(AnimatableKt.calculateTargetValue(decayAnimationSpecImpl, RecyclerView.DECELERATION_RATE, f2)) >= Math.abs(f) ? new PreviewView.AnonymousClass1(decayAnimationSpecImpl, false) : new Toolbar.AnonymousClass1(snapFlingBehavior.snapAnimationSpec)).approachAnimation(scrollScope, new Float(f), new Float(f2), snapFlingBehavior$fling$result$1$$ExternalSyntheticLambda0, snapFlingBehavior$tryApproach$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return ((AnimationResult) obj).currentAnimationState;
            }
        }
        snapFlingBehavior$tryApproach$1 = new SnapFlingBehavior$tryApproach$1(snapFlingBehavior, continuationImpl);
        SnapFlingBehavior$tryApproach$1 snapFlingBehavior$tryApproach$122 = snapFlingBehavior$tryApproach$1;
        Object obj2 = snapFlingBehavior$tryApproach$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = snapFlingBehavior$tryApproach$122.label;
        if (i != 0) {
        }
        return ((AnimationResult) obj2).currentAnimationState;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SnapFlingBehavior)) {
            return false;
        }
        SnapFlingBehavior snapFlingBehavior = (SnapFlingBehavior) obj;
        return Intrinsics.areEqual(snapFlingBehavior.snapAnimationSpec, this.snapAnimationSpec) && Intrinsics.areEqual(snapFlingBehavior.decayAnimationSpec, this.decayAnimationSpec) && snapFlingBehavior.snapLayoutInfoProvider.equals(this.snapLayoutInfoProvider);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fling(ScrollScope scrollScope, float f, Function1 function1, ContinuationImpl continuationImpl) {
        SnapFlingBehavior$fling$1 snapFlingBehavior$fling$1;
        int i;
        Function1 function12;
        if (continuationImpl instanceof SnapFlingBehavior$fling$1) {
            snapFlingBehavior$fling$1 = (SnapFlingBehavior$fling$1) continuationImpl;
            int i2 = snapFlingBehavior$fling$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                snapFlingBehavior$fling$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = snapFlingBehavior$fling$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = snapFlingBehavior$fling$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    DefaultFlingBehavior$performFling$2 defaultFlingBehavior$performFling$2 = new DefaultFlingBehavior$performFling$2(this, f, function1, scrollScope, null);
                    snapFlingBehavior$fling$1.L$0 = function1;
                    snapFlingBehavior$fling$1.label = 1;
                    obj = JobKt.withContext(this.motionScaleDuration, defaultFlingBehavior$performFling$2, snapFlingBehavior$fling$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    function12 = function1;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    function12 = snapFlingBehavior$fling$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                AnimationResult animationResult = (AnimationResult) obj;
                function12.invoke(new Float(RecyclerView.DECELERATION_RATE));
                return animationResult;
            }
        }
        snapFlingBehavior$fling$1 = new SnapFlingBehavior$fling$1(this, continuationImpl);
        Object obj2 = snapFlingBehavior$fling$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = snapFlingBehavior$fling$1.label;
        if (i != 0) {
        }
        AnimationResult animationResult2 = (AnimationResult) obj2;
        function12.invoke(new Float(RecyclerView.DECELERATION_RATE));
        return animationResult2;
    }

    public final int hashCode() {
        return this.snapLayoutInfoProvider.hashCode() + ((this.decayAnimationSpec.hashCode() + (this.snapAnimationSpec.hashCode() * 31)) * 31);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object performFling(ScrollScope scrollScope, float f, Function1 function1, ContinuationImpl continuationImpl) {
        SnapFlingBehavior$performFling$1 snapFlingBehavior$performFling$1;
        int i;
        float floatValue;
        if (continuationImpl instanceof SnapFlingBehavior$performFling$1) {
            snapFlingBehavior$performFling$1 = (SnapFlingBehavior$performFling$1) continuationImpl;
            int i2 = snapFlingBehavior$performFling$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                snapFlingBehavior$performFling$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = snapFlingBehavior$performFling$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = snapFlingBehavior$performFling$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    snapFlingBehavior$performFling$1.label = 1;
                    obj = fling(scrollScope, f, function1, snapFlingBehavior$performFling$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                AnimationResult animationResult = (AnimationResult) obj;
                floatValue = animationResult.remainingOffset.floatValue();
                AnimationState animationState = animationResult.currentAnimationState;
                float f2 = RecyclerView.DECELERATION_RATE;
                if (floatValue != RecyclerView.DECELERATION_RATE) {
                    f2 = ((Number) animationState.getVelocity()).floatValue();
                }
                return new Float(f2);
            }
        }
        snapFlingBehavior$performFling$1 = new SnapFlingBehavior$performFling$1(this, continuationImpl);
        Object obj3 = snapFlingBehavior$performFling$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = snapFlingBehavior$performFling$1.label;
        if (i != 0) {
        }
        AnimationResult animationResult2 = (AnimationResult) obj3;
        floatValue = animationResult2.remainingOffset.floatValue();
        AnimationState animationState2 = animationResult2.currentAnimationState;
        float f22 = RecyclerView.DECELERATION_RATE;
        if (floatValue != RecyclerView.DECELERATION_RATE) {
        }
        return new Float(f22);
    }

    @Override // androidx.compose.foundation.gestures.FlingBehavior
    public Object performFling(ScrollScope scrollScope, float f, Continuation continuation) {
        return performFling(scrollScope, f, Draggable2DKt.NoOnReport, (ContinuationImpl) continuation);
    }
}
