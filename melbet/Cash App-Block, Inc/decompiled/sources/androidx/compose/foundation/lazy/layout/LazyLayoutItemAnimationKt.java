package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.IntOffset;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public abstract class LazyLayoutItemAnimationKt {
    public static final SpringSpec InterruptionSpec;

    static {
        Rect rect = VisibilityThresholdsKt.RectVisibilityThreshold;
        InterruptionSpec = AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 400.0f, new IntOffset(4294967297L), 1);
    }
}
