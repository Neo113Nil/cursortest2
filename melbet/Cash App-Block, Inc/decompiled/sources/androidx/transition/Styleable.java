package androidx.transition;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public abstract class Styleable {
    public static final int[] TRANSITION = {R.attr.interpolator, R.attr.duration, R.attr.startDelay, R.attr.matchOrder};
    public static final int[] CHANGE_BOUNDS = {R.attr.resizeClip};
    public static final int[] VISIBILITY_TRANSITION = {R.attr.transitionVisibilityMode};
    public static final int[] FADE = {R.attr.fadingMode};
    public static final int[] SLIDE = {R.attr.slideEdge};
    public static final int[] TRANSITION_SET = {R.attr.transitionOrdering};

    public static ObjectAnimator createAnimation(View view, TransitionValues transitionValues, int i, int i2, float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator, Slide slide) {
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        if (((int[]) transitionValues.view.getTag(com.squareup.cash.R.id.transition_position)) != null) {
            f = (r2[0] - i) + translationX;
            f2 = (r2[1] - i2) + translationY;
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
        if (f == f3 && f2 == f4) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f, f3), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f2, f4));
        TranslationAnimationCreator$TransitionPositionListener translationAnimationCreator$TransitionPositionListener = new TranslationAnimationCreator$TransitionPositionListener(view, transitionValues.view, translationX, translationY);
        slide.addListener(translationAnimationCreator$TransitionPositionListener);
        ofPropertyValuesHolder.addListener(translationAnimationCreator$TransitionPositionListener);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }

    public float getGoneX(View view, ViewGroup viewGroup) {
        return view.getTranslationX();
    }

    public float getGoneY(View view, ViewGroup viewGroup) {
        return view.getTranslationY();
    }

    public abstract Rect onGetEpicenter();
}
