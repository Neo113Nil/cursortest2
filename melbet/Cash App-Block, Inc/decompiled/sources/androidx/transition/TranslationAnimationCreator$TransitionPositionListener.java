package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.transition.Transition;
import com.squareup.cash.R;

/* loaded from: classes3.dex */
public final class TranslationAnimationCreator$TransitionPositionListener extends AnimatorListenerAdapter implements Transition.TransitionListener {
    public boolean mIsTransitionCanceled;
    public final View mMovingView;
    public float mPausedX;
    public float mPausedY;
    public final float mTerminalX;
    public final float mTerminalY;
    public int[] mTransitionPosition;
    public final View mViewInHierarchy;

    public TranslationAnimationCreator$TransitionPositionListener(View view, View view2, float f, float f2) {
        this.mMovingView = view;
        this.mViewInHierarchy = view2;
        this.mTerminalX = f;
        this.mTerminalY = f2;
        int[] iArr = (int[]) view2.getTag(R.id.transition_position);
        this.mTransitionPosition = iArr;
        if (iArr != null) {
            view2.setTag(R.id.transition_position, null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.mIsTransitionCanceled = true;
        float f = this.mTerminalX;
        View view = this.mMovingView;
        view.setTranslationX(f);
        view.setTranslationY(this.mTerminalY);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        float f = this.mTerminalX;
        View view = this.mMovingView;
        view.setTranslationX(f);
        view.setTranslationY(this.mTerminalY);
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
        this.mIsTransitionCanceled = true;
        float f = this.mTerminalX;
        View view = this.mMovingView;
        view.setTranslationX(f);
        view.setTranslationY(this.mTerminalY);
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        onTransitionEnd$1(transition);
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionEnd$1(Transition transition) {
        if (this.mIsTransitionCanceled) {
            return;
        }
        this.mViewInHierarchy.setTag(R.id.transition_position, null);
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionPause() {
        if (this.mTransitionPosition == null) {
            this.mTransitionPosition = new int[2];
        }
        int[] iArr = this.mTransitionPosition;
        View view = this.mMovingView;
        view.getLocationOnScreen(iArr);
        this.mViewInHierarchy.setTag(R.id.transition_position, this.mTransitionPosition);
        this.mPausedX = view.getTranslationX();
        this.mPausedY = view.getTranslationY();
        view.setTranslationX(this.mTerminalX);
        view.setTranslationY(this.mTerminalY);
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionResume() {
        float f = this.mPausedX;
        View view = this.mMovingView;
        view.setTranslationX(f);
        view.setTranslationY(this.mPausedY);
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }
}
