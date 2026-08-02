package androidx.compose.animation;

import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.ui.geometry.Rect;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final /* synthetic */ class SharedBoundsNode$$ExternalSyntheticLambda0 implements BoundsTransform {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ SharedBoundsNode$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // androidx.compose.animation.BoundsTransform
    public final FiniteAnimationSpec createAnimationSpec(Rect rect, Rect rect2) {
        switch (this.$r8$classId) {
            case 0:
                return AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, VisibilityThresholdsKt.RectVisibilityThreshold, 3);
            case 1:
                return SharedTransitionScopeKt.DefaultSpring;
            case 2:
                return AnimatableKt.spring$default(0.75f, 120.0f, null, 4);
            case 3:
                return AnimatableKt.spring$default(0.75f, 120.0f, null, 4);
            case 4:
                return AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 200.0f, null, 5);
            case 5:
                return AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 200.0f, null, 5);
            case 6:
                return AnimatableKt.tween$default(700, 0, null, 6);
            case 7:
                return AnimatableKt.tween$default(700, 0, null, 6);
            default:
                return AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 200.0f, null, 5);
        }
    }
}
