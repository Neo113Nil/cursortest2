package com.squareup.cash.sheet;

import android.animation.Animator;
import com.squareup.cash.ui.BottomSheetStateListener;
import java.util.Iterator;

/* loaded from: classes7.dex */
public final class BottomSheet$exitAnimator$lambda$0$$inlined$doOnStart$1 implements Animator.AnimatorListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BottomSheet this$0;

    public BottomSheet$exitAnimator$lambda$0$$inlined$doOnStart$1(BottomSheet bottomSheet, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                this.this$0 = bottomSheet;
                break;
            default:
                BottomSheetState bottomSheetState = BottomSheetState.EXPANDED;
                this.this$0 = bottomSheet;
                break;
        }
    }

    private final void onAnimationCancel$com$squareup$cash$sheet$BottomSheet$exitAnimator$lambda$0$$inlined$doOnStart$1(Animator animator) {
    }

    private final void onAnimationCancel$com$squareup$cash$sheet$BottomSheet$moveSheetToStateAnimator$lambda$0$$inlined$doOnEnd$1(Animator animator) {
    }

    private final void onAnimationEnd$com$squareup$cash$sheet$BottomSheet$exitAnimator$lambda$0$$inlined$doOnStart$1(Animator animator) {
    }

    private final void onAnimationRepeat$com$squareup$cash$sheet$BottomSheet$exitAnimator$lambda$0$$inlined$doOnStart$1(Animator animator) {
    }

    private final void onAnimationRepeat$com$squareup$cash$sheet$BottomSheet$moveSheetToStateAnimator$lambda$0$$inlined$doOnEnd$1(Animator animator) {
    }

    private final void onAnimationStart$com$squareup$cash$sheet$BottomSheet$moveSheetToStateAnimator$lambda$0$$inlined$doOnEnd$1(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.$r8$classId;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$r8$classId) {
            case 0:
                break;
            default:
                BottomSheet bottomSheet = this.this$0;
                if (bottomSheet.stateListenersAreStale) {
                    bottomSheet.stateListenersAreStale = false;
                    Iterator it = bottomSheet.stateListeners.iterator();
                    while (it.hasNext()) {
                        ((BottomSheetStateListener) it.next()).onBottomSheetStateChange(bottomSheet.currentState);
                    }
                    break;
                }
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.$r8$classId;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$r8$classId) {
            case 0:
                this.this$0.setCurrentState(BottomSheetState.SYSTEM_DISMISSED);
                break;
        }
    }
}
