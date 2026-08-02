package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.unit.IntSize;

/* loaded from: classes.dex */
public final class AnimatedVisibilityScopeImpl implements AnimatedVisibilityScope {
    public final ParcelableSnapshotMutableState targetSize = Updater.mutableStateOf$default(new IntSize(0));
    public final Transition transition;

    public AnimatedVisibilityScopeImpl(Transition transition) {
        this.transition = transition;
    }

    @Override // androidx.compose.animation.AnimatedVisibilityScope
    public final Transition getTransition() {
        return this.transition;
    }
}
