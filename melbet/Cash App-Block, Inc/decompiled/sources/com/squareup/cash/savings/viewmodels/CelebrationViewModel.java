package com.squareup.cash.savings.viewmodels;

import com.squareup.cash.savings.viewmodels.SavingsScreenViewEvent;
import com.squareup.protos.cash.ui.Animation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CelebrationViewModel {
    public final Animation animation;
    public final SavingsScreenViewEvent.GoalCelebrationSeen onSeenEvent;

    public CelebrationViewModel(Animation animation, SavingsScreenViewEvent.GoalCelebrationSeen goalCelebrationSeen) {
        animation.getClass();
        this.animation = animation;
        this.onSeenEvent = goalCelebrationSeen;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CelebrationViewModel)) {
            return false;
        }
        CelebrationViewModel celebrationViewModel = (CelebrationViewModel) obj;
        return Intrinsics.areEqual(this.animation, celebrationViewModel.animation) && this.onSeenEvent.equals(celebrationViewModel.onSeenEvent);
    }

    public final int hashCode() {
        return this.onSeenEvent.hashCode() + (this.animation.hashCode() * 31);
    }

    public final String toString() {
        return "CelebrationViewModel(animation=" + this.animation + ", onSeenEvent=" + this.onSeenEvent + ")";
    }
}
