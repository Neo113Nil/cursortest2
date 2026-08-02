package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.transition.Transition;
import androidx.transition.TransitionValues;

/* loaded from: classes6.dex */
public final class ssy0 extends Transition {
    @Override // androidx.transition.Transition
    public final void f(TransitionValues transitionValues) {
        if (transitionValues.b instanceof TextView) {
            transitionValues.a.put("textSizeTransition:textSize", Float.valueOf(((TextView) r1).getHeight()));
        }
    }

    @Override // androidx.transition.Transition
    public final void i(TransitionValues transitionValues) {
        if (transitionValues.b instanceof TextView) {
            transitionValues.a.put("textSizeTransition:textSize", Float.valueOf(((TextView) r1).getHeight()));
        }
    }

    @Override // androidx.transition.Transition
    public final Animator o(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        View view = transitionValues2.b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        float floatValue = ((Float) transitionValues.a.get("textSizeTransition:textSize")).floatValue();
        float floatValue2 = ((Float) transitionValues2.a.get("textSizeTransition:textSize")).floatValue();
        if (floatValue == floatValue2 || floatValue2 == 0.0f) {
            return null;
        }
        float f = floatValue / floatValue2;
        textView.setScaleX(f);
        textView.setScaleY(f);
        textView.setPivotX(0.0f);
        textView.setPivotY(0.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, "scaleX", f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, "scaleY", f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        return animatorSet;
    }
}
