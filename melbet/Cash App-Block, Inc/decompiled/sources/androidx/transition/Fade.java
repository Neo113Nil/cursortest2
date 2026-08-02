package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.Transition;
import androidx.transition.ViewUtils;
import coil3.size.DimensionKt;
import com.squareup.cash.R;

/* loaded from: classes3.dex */
public class Fade extends Visibility {
    public Fade(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Styleable.FADE);
        setMode(DimensionKt.getNamedInt(obtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, this.mMode));
        obtainStyledAttributes.recycle();
    }

    public static float getStartAlpha(TransitionValues transitionValues, float f) {
        Float f2;
        return (transitionValues == null || (f2 = (Float) transitionValues.values.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
        Visibility.captureValues$2(transitionValues);
        View view = transitionValues.view;
        Float f = (Float) view.getTag(R.id.transition_pause_alpha);
        if (f == null) {
            if (view.getVisibility() == 0) {
                ViewUtils.AnonymousClass1 anonymousClass1 = ViewUtils.TRANSITION_ALPHA;
                f = Float.valueOf(view.getTransitionAlpha());
            } else {
                f = Float.valueOf(RecyclerView.DECELERATION_RATE);
            }
        }
        transitionValues.values.put("android:fade:transitionAlpha", f);
    }

    public final ObjectAnimator createAnimation(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        ViewUtils.AnonymousClass1 anonymousClass1 = ViewUtils.TRANSITION_ALPHA;
        view.setTransitionAlpha(f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, ViewUtils.TRANSITION_ALPHA, f2);
        FadeAnimatorListener fadeAnimatorListener = new FadeAnimatorListener(view);
        ofFloat.addListener(fadeAnimatorListener);
        getRootTransition().addListener(fadeAnimatorListener);
        return ofFloat;
    }

    @Override // androidx.transition.Transition
    public final boolean isSeekingSupported() {
        return true;
    }

    @Override // androidx.transition.Visibility
    public final Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        ViewUtils.AnonymousClass1 anonymousClass1 = ViewUtils.TRANSITION_ALPHA;
        return createAnimation(view, getStartAlpha(transitionValues, RecyclerView.DECELERATION_RATE), 1.0f);
    }

    @Override // androidx.transition.Visibility
    public final Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        ViewUtils.AnonymousClass1 anonymousClass1 = ViewUtils.TRANSITION_ALPHA;
        ObjectAnimator createAnimation = createAnimation(view, getStartAlpha(transitionValues, 1.0f), RecyclerView.DECELERATION_RATE);
        if (createAnimation == null) {
            view.setTransitionAlpha(getStartAlpha(transitionValues2, 1.0f));
        }
        return createAnimation;
    }

    public final class FadeAnimatorListener extends AnimatorListenerAdapter implements Transition.TransitionListener {
        public boolean mLayerTypeChanged = false;
        public final View mView;

        public FadeAnimatorListener(View view) {
            this.mView = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            ViewUtils.AnonymousClass1 anonymousClass1 = ViewUtils.TRANSITION_ALPHA;
            this.mView.setTransitionAlpha(1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z) {
            boolean z2 = this.mLayerTypeChanged;
            View view = this.mView;
            if (z2) {
                view.setLayerType(0, null);
            }
            if (z) {
                return;
            }
            ViewUtils.AnonymousClass1 anonymousClass1 = ViewUtils.TRANSITION_ALPHA;
            view.setTransitionAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            View view = this.mView;
            if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
                this.mLayerTypeChanged = true;
                view.setLayerType(2, null);
            }
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionCancel(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionEnd(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionPause() {
            float f;
            View view = this.mView;
            if (view.getVisibility() == 0) {
                ViewUtils.AnonymousClass1 anonymousClass1 = ViewUtils.TRANSITION_ALPHA;
                f = view.getTransitionAlpha();
            } else {
                f = RecyclerView.DECELERATION_RATE;
            }
            view.setTag(R.id.transition_pause_alpha, Float.valueOf(f));
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionResume() {
            this.mView.setTag(R.id.transition_pause_alpha, null);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionStart(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionStart$1(Transition transition) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }
    }

    public Fade(int i) {
        setMode(i);
    }
}
