package androidx.transition;

import androidx.dynamicanimation.animation.DynamicAnimation$OnAnimationEndListener;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.transition.Transition;
import com.google.android.material.progressindicator.BaseProgressIndicator;

/* loaded from: classes3.dex */
public final /* synthetic */ class Transition$SeekController$$ExternalSyntheticLambda0 implements DynamicAnimation$OnAnimationEndListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ Transition$SeekController$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation$OnAnimationEndListener
    public final void onAnimationEnd(SpringAnimation springAnimation, boolean z, float f, float f2) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                Transition.SeekController seekController = (Transition.SeekController) obj;
                TransitionSet transitionSet = seekController.this$0;
                if (!z) {
                    Transition.TransitionNotification transitionNotification = Transition.TransitionNotification.ON_END;
                    if (f >= 1.0f) {
                        transitionSet.notifyFromTransition(transitionSet, transitionNotification, false);
                        break;
                    } else {
                        long j = transitionSet.mTotalDuration;
                        Transition transitionAt = transitionSet.getTransitionAt(0);
                        Transition transition = transitionAt.mCloneParent;
                        transitionAt.mCloneParent = null;
                        transitionSet.setCurrentPlayTimeMillis(-1L, seekController.mCurrentPlayTime);
                        transitionSet.setCurrentPlayTimeMillis(j, -1L);
                        seekController.mCurrentPlayTime = j;
                        Runnable runnable = seekController.mResetToStartState;
                        if (runnable != null) {
                            runnable.run();
                        }
                        transitionSet.mAnimators.clear();
                        if (transition != null) {
                            transition.notifyFromTransition(transition, transitionNotification, true);
                            break;
                        }
                    }
                }
                break;
            default:
                BaseProgressIndicator.$r8$lambda$9LFVkjgCbQazReD7AnEDM8_FfLk((BaseProgressIndicator) obj);
                break;
        }
    }
}
