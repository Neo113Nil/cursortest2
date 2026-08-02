package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class BoundsAnimation {
    public final ParcelableSnapshotMutableState animation$delegate;
    public FiniteAnimationSpec animationSpec = BoundsAnimationKt.DefaultBoundsAnimation;
    public final ParcelableSnapshotMutableState animationState$delegate = Updater.mutableStateOf$default(null);
    public final ParcelableSnapshotMutableState boundsTransform$delegate;
    public final Function0 momentumOffset;
    public final Transition transition;
    public final SharedTransitionScope transitionScope;

    public BoundsAnimation(SharedTransitionScope sharedTransitionScope, Transition transition, Transition.DeferredAnimation deferredAnimation, BoundsTransform boundsTransform, Function0 function0) {
        this.transitionScope = sharedTransitionScope;
        this.transition = transition;
        this.momentumOffset = function0;
        this.animation$delegate = Updater.mutableStateOf$default(deferredAnimation);
        this.boundsTransform$delegate = Updater.mutableStateOf$default(boundsTransform);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v8, types: [androidx.compose.animation.BoundsTransform] */
    public final void animate(Rect rect, Rect rect2, SharedBoundsNode$$ExternalSyntheticLambda0 sharedBoundsNode$$ExternalSyntheticLambda0) {
        if (this.transitionScope.isTransitionActive()) {
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.animationState$delegate;
            SharedBoundsNode$$ExternalSyntheticLambda0 sharedBoundsNode$$ExternalSyntheticLambda02 = sharedBoundsNode$$ExternalSyntheticLambda0;
            if (((State) parcelableSnapshotMutableState.getValue()) == null) {
                if (sharedBoundsNode$$ExternalSyntheticLambda0 == null) {
                    sharedBoundsNode$$ExternalSyntheticLambda02 = (BoundsTransform) this.boundsTransform$delegate.getValue();
                }
                this.animationSpec = sharedBoundsNode$$ExternalSyntheticLambda02.createAnimationSpec(rect, rect2);
            }
            int i = 0;
            parcelableSnapshotMutableState.setValue(((Transition.DeferredAnimation) this.animation$delegate.getValue()).animate(new BoundsAnimation$animate$1(this, i), new BoundsAnimation$animate$2(i, this, rect2, rect)));
        }
    }

    public final boolean getTarget() {
        return ((Boolean) this.transition.targetState$delegate.getValue()).booleanValue();
    }

    public final Rect getValue() {
        State state;
        Rect rect;
        if (!this.transitionScope.isTransitionActive() || (state = (State) this.animationState$delegate.getValue()) == null || (rect = (Rect) state.getValue()) == null) {
            return null;
        }
        long j = ((Offset) this.momentumOffset.invoke()).packedValue;
        return !Offset.m622equalsimpl0(j, 0L) ? rect.m637translatek4lQ0M(j) : rect;
    }
}
