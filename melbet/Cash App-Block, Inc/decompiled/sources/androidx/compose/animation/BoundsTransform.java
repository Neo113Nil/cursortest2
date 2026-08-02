package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.geometry.Rect;

/* loaded from: classes3.dex */
public interface BoundsTransform {
    FiniteAnimationSpec createAnimationSpec(Rect rect, Rect rect2);
}
