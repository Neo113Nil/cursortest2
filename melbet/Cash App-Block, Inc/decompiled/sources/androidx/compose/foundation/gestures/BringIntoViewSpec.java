package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public interface BringIntoViewSpec {
    public static final Companion Companion = Companion.$$INSTANCE;

    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final SpringSpec DefaultScrollAnimationSpec = AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, null, 7);
        public static final BringIntoViewSpec$Companion$DefaultBringIntoViewSpec$1 DefaultBringIntoViewSpec = new BringIntoViewSpec$Companion$DefaultBringIntoViewSpec$1();
    }

    default float calculateScrollDistance(float f, float f2, float f3) {
        Companion.getClass();
        float f4 = f2 + f;
        if ((f >= RecyclerView.DECELERATION_RATE && f4 <= f3) || (f < RecyclerView.DECELERATION_RATE && f4 > f3)) {
            return RecyclerView.DECELERATION_RATE;
        }
        float f5 = f4 - f3;
        return Math.abs(f) < Math.abs(f5) ? f : f5;
    }
}
