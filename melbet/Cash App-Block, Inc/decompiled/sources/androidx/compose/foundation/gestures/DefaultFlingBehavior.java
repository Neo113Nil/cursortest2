package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.DecayAnimationSpecImpl;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.JobKt;

/* loaded from: classes.dex */
public final class DefaultFlingBehavior implements FlingBehavior {
    public DecayAnimationSpecImpl flingDecay;
    public final ScrollableKt$DefaultScrollMotionDurationScale$1 motionDurationScale;

    public DefaultFlingBehavior(DecayAnimationSpecImpl decayAnimationSpecImpl) {
        ScrollableKt$DefaultScrollMotionDurationScale$1 scrollableKt$DefaultScrollMotionDurationScale$1 = ScrollableKt.DefaultScrollMotionDurationScale;
        this.flingDecay = decayAnimationSpecImpl;
        this.motionDurationScale = scrollableKt$DefaultScrollMotionDurationScale$1;
    }

    @Override // androidx.compose.foundation.gestures.FlingBehavior
    public final Object performFling(ScrollScope scrollScope, float f, Continuation continuation) {
        return JobKt.withContext(this.motionDurationScale, new DefaultFlingBehavior$performFling$2(f, this, scrollScope, null), continuation);
    }
}
