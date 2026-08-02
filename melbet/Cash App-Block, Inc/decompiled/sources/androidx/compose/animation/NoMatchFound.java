package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionStateMachine;

/* loaded from: classes3.dex */
public final class NoMatchFound extends SharedTransitionStateMachine.State {
    public static final NoMatchFound INSTANCE = new NoMatchFound();

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public final SharedTransitionStateMachine.State onMatchFound(SharedBoundsNode sharedBoundsNode) {
        return new ActiveMatchFoundConfigPending(sharedBoundsNode, null);
    }

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public final SharedTransitionStateMachine.State onVisibleContentRemovedDuringTransition() {
        return this;
    }
}
