package defpackage;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import androidx.transition.TransitionValues;
import ru.yandex.taxi.design.DividerWithColorView;

/* loaded from: classes6.dex */
public final class sql extends Transition {
    public static final /* synthetic */ int h0 = 0;

    @Override // androidx.transition.Transition
    public final void f(TransitionValues transitionValues) {
        View view = transitionValues.b;
        if (view instanceof DividerWithColorView) {
            transitionValues.a.put("viewBackgroundColorTransition:color", Integer.valueOf(((DividerWithColorView) view).dividerColor()));
        }
    }

    @Override // androidx.transition.Transition
    public final void i(TransitionValues transitionValues) {
        View view = transitionValues.b;
        if (view instanceof DividerWithColorView) {
            transitionValues.a.put("viewBackgroundColorTransition:color", Integer.valueOf(((DividerWithColorView) view).dividerColor()));
        }
    }

    @Override // androidx.transition.Transition
    public final Animator o(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        View view = transitionValues2 != null ? transitionValues2.b : null;
        if (transitionValues == null || transitionValues2 == null || !(view instanceof DividerWithColorView)) {
            return null;
        }
        Integer num = (Integer) transitionValues.a.get("viewBackgroundColorTransition:color");
        int intValue = num.intValue();
        Integer num2 = (Integer) transitionValues2.a.get("viewBackgroundColorTransition:color");
        if (intValue == num2.intValue()) {
            return null;
        }
        DividerWithColorView dividerWithColorView = (DividerWithColorView) view;
        dividerWithColorView.setBackgroundColor(intValue);
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), num, num2);
        ofObject.addUpdateListener(new yi(22, dividerWithColorView));
        return ofObject;
    }
}
