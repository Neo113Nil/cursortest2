package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import com.squareup.cash.R;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class ChangeClipBounds extends Transition {
    public static final String[] sTransitionProperties = {"android:clipBounds:clip"};
    public static final Rect NULL_SENTINEL = new Rect();

    public ChangeClipBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static void captureValues(TransitionValues transitionValues, boolean z) {
        View view = transitionValues.view;
        HashMap hashMap = transitionValues.values;
        if (view.getVisibility() == 8) {
            return;
        }
        Rect rect = z ? (Rect) view.getTag(R.id.transition_clip) : null;
        if (rect == null) {
            rect = view.getClipBounds();
        }
        Rect rect2 = rect != NULL_SENTINEL ? rect : null;
        hashMap.put("android:clipBounds:clip", rect2);
        if (rect2 == null) {
            hashMap.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
        }
    }

    @Override // androidx.transition.Transition
    public final void captureEndValues(TransitionValues transitionValues) {
        captureValues(transitionValues, false);
    }

    @Override // androidx.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
        captureValues(transitionValues, true);
    }

    @Override // androidx.transition.Transition
    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null) {
            return null;
        }
        HashMap hashMap = transitionValues.values;
        if (transitionValues2 == null) {
            return null;
        }
        View view = transitionValues2.view;
        HashMap hashMap2 = transitionValues2.values;
        if (!hashMap.containsKey("android:clipBounds:clip") || !hashMap2.containsKey("android:clipBounds:clip")) {
            return null;
        }
        Rect rect = (Rect) hashMap.get("android:clipBounds:clip");
        Rect rect2 = (Rect) hashMap2.get("android:clipBounds:clip");
        if (rect == null && rect2 == null) {
            return null;
        }
        Rect rect3 = rect == null ? (Rect) hashMap.get("android:clipBounds:bounds") : rect;
        Rect rect4 = rect2 == null ? (Rect) hashMap2.get("android:clipBounds:bounds") : rect2;
        if (rect3.equals(rect4)) {
            return null;
        }
        view.setClipBounds(rect);
        Rect rect5 = new Rect();
        RectEvaluator rectEvaluator = new RectEvaluator();
        rectEvaluator.mRect = rect5;
        ObjectAnimator ofObject = ObjectAnimator.ofObject(view, ViewUtils.CLIP_BOUNDS, rectEvaluator, rect3, rect4);
        Listener listener = new Listener(view, rect, rect2);
        ofObject.addListener(listener);
        addListener(listener);
        return ofObject;
    }

    @Override // androidx.transition.Transition
    public final String[] getTransitionProperties() {
        return sTransitionProperties;
    }

    @Override // androidx.transition.Transition
    public final boolean isSeekingSupported() {
        return true;
    }

    public final class Listener extends AnimatorListenerAdapter implements Transition.TransitionListener {
        public final Rect mEnd;
        public final Rect mStart;
        public final View mView;

        public Listener(View view, Rect rect, Rect rect2) {
            this.mView = view;
            this.mStart = rect;
            this.mEnd = rect2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z) {
            View view = this.mView;
            if (z) {
                view.setClipBounds(this.mStart);
            } else {
                view.setClipBounds(this.mEnd);
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
            View view = this.mView;
            Rect clipBounds = view.getClipBounds();
            if (clipBounds == null) {
                clipBounds = ChangeClipBounds.NULL_SENTINEL;
            }
            view.setTag(R.id.transition_clip, clipBounds);
            view.setClipBounds(this.mEnd);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionResume() {
            View view = this.mView;
            view.setClipBounds((Rect) view.getTag(R.id.transition_clip));
            view.setTag(R.id.transition_clip, null);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionStart(Transition transition) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }
    }
}
