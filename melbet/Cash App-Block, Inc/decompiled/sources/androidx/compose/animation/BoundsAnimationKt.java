package androidx.compose.animation;

import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public abstract class BoundsAnimationKt {
    public static final SpringSpec DefaultBoundsAnimation = AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 400.0f, VisibilityThresholdsKt.RectVisibilityThreshold, 1);
}
