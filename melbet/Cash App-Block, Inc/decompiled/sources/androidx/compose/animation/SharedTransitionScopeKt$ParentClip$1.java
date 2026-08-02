package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes.dex */
public final class SharedTransitionScopeKt$ParentClip$1 implements SharedTransitionScope.OverlayClip {
    @Override // androidx.compose.animation.SharedTransitionScope.OverlayClip
    public final AndroidPath getClipPath(SharedTransitionScope.SharedContentState sharedContentState, Rect rect, LayoutDirection layoutDirection, Density density) {
        SharedTransitionScope.SharedContentState parentSharedContentState = sharedContentState.getParentSharedContentState();
        if (parentSharedContentState != null) {
            return parentSharedContentState.getClipPathInOverlay();
        }
        return null;
    }
}
