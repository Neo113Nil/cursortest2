package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import androidx.transition.TransitionValues;
import java.util.HashMap;

/* loaded from: classes11.dex */
public final class tqx extends Transition {
    @Override // androidx.transition.Transition
    public final void f(TransitionValues transitionValues) {
        transitionValues.a.put("NavigationRailLabelVisibility", Integer.valueOf(transitionValues.b.getVisibility()));
    }

    @Override // androidx.transition.Transition
    public final void i(TransitionValues transitionValues) {
        transitionValues.a.put("NavigationRailLabelVisibility", Integer.valueOf(transitionValues.b.getVisibility()));
    }

    @Override // androidx.transition.Transition
    public final Animator o(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null) {
            return null;
        }
        HashMap hashMap = transitionValues.a;
        if (transitionValues2 == null) {
            return null;
        }
        HashMap hashMap2 = transitionValues2.a;
        if (hashMap.get("NavigationRailLabelVisibility") == null || hashMap2.get("NavigationRailLabelVisibility") == null || ((Integer) hashMap.get("NavigationRailLabelVisibility")).intValue() != 8 || ((Integer) hashMap2.get("NavigationRailLabelVisibility")).intValue() != 0) {
            return null;
        }
        View view = transitionValues2.b;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new wd2(view, 6));
        return ofFloat;
    }
}
