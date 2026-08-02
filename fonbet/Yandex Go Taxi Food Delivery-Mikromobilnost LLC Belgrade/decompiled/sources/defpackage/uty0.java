package defpackage;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.transition.Transition;
import androidx.transition.TransitionValues;

/* loaded from: classes6.dex */
public final class uty0 extends Transition {
    public static final /* synthetic */ int h0 = 0;

    @Override // androidx.transition.Transition
    public final void f(TransitionValues transitionValues) {
        View view = transitionValues.b;
        if (view instanceof TextView) {
            transitionValues.a.put("textColorTransition:textColor", Integer.valueOf(((TextView) view).getCurrentTextColor()));
        }
    }

    @Override // androidx.transition.Transition
    public final void i(TransitionValues transitionValues) {
        View view = transitionValues.b;
        if (view instanceof TextView) {
            transitionValues.a.put("textColorTransition:textColor", Integer.valueOf(((TextView) view).getCurrentTextColor()));
        }
    }

    @Override // androidx.transition.Transition
    public final Animator o(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        View view = transitionValues2 != null ? transitionValues2.b : null;
        if (transitionValues == null || transitionValues2 == null || !(view instanceof TextView)) {
            return null;
        }
        Integer num = (Integer) transitionValues.a.get("textColorTransition:textColor");
        Integer num2 = (Integer) transitionValues2.a.get("textColorTransition:textColor");
        if (num == null || num2 == null || num.equals(num2)) {
            return null;
        }
        TextView textView = (TextView) view;
        textView.setTextColor(num.intValue());
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), num, num2);
        ofObject.addUpdateListener(new sh2(textView, 2));
        return ofObject;
    }
}
