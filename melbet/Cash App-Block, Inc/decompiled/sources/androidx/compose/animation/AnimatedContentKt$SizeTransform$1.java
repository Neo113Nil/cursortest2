package androidx.compose.animation;

import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.IntSize;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class AnimatedContentKt$SizeTransform$1 extends Lambda implements Function2 {
    public static final AnimatedContentKt$SizeTransform$1 INSTANCE = new AnimatedContentKt$SizeTransform$1(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long j = ((IntSize) obj).packedValue;
        long j2 = ((IntSize) obj2).packedValue;
        Rect rect = VisibilityThresholdsKt.RectVisibilityThreshold;
        return AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 400.0f, new IntSize(4294967297L), 1);
    }
}
