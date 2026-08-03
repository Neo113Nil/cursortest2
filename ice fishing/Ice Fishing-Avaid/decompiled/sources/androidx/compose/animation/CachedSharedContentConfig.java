package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;

/* compiled from: SharedTransitionScope.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/animation/CachedSharedContentConfig;", "Landroidx/compose/animation/SharedTransitionScope$SharedContentConfig;", "<init>", "()V", "animation"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
final class CachedSharedContentConfig implements SharedTransitionScope.SharedContentConfig {
    public static final CachedSharedContentConfig INSTANCE = new CachedSharedContentConfig();

    @Override // androidx.compose.animation.SharedTransitionScope.SharedContentConfig
    /* renamed from: alternativeTargetBoundsInTransitionScopeAfterRemoval-cSwnlzA, reason: not valid java name */
    public /* synthetic */ Rect mo123alternativeTargetBoundsInTransitionScopeAfterRemovalcSwnlzA(SharedTransitionScope.SharedContentState sharedContentState, Rect rect, long j) {
        return SharedTransitionScope.SharedContentConfig.CC.m190xea938c3d(this, sharedContentState, rect, j);
    }

    @Override // androidx.compose.animation.SharedTransitionScope.SharedContentConfig
    public /* synthetic */ boolean getShouldKeepEnabledForOngoingAnimation() {
        return SharedTransitionScope.SharedContentConfig.CC.$default$getShouldKeepEnabledForOngoingAnimation(this);
    }

    @Override // androidx.compose.animation.SharedTransitionScope.SharedContentConfig
    public /* synthetic */ boolean isEnabled(SharedTransitionScope.SharedContentState sharedContentState) {
        return SharedTransitionScope.SharedContentConfig.CC.$default$isEnabled(this, sharedContentState);
    }

    private CachedSharedContentConfig() {
    }
}
