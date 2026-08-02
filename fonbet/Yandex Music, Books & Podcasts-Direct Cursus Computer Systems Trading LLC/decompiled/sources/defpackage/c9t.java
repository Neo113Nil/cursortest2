package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public final class c9t extends Visibility {
    public final hu9 a;
    public final Float b;

    public c9t(hu9 hu9Var, Float f) {
        this.a = hu9Var;
        this.b = f;
    }

    @Override // android.transition.Visibility
    public final Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        hu9 hu9Var = this.a;
        float K = pd.K(hu9Var);
        float L = pd.L(hu9Var);
        Float f = this.b;
        view.setTranslationX(K * (f != null ? f.floatValue() * view.getWidth() : pd.G(view)));
        view.setTranslationY(L * (f != null ? f.floatValue() * view.getHeight() : pd.G(view)));
        return ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, view.getTranslationX(), 0.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, view.getTranslationY(), 0.0f));
    }

    @Override // android.transition.Visibility
    public final Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        hu9 hu9Var = this.a;
        float K = pd.K(hu9Var);
        float L = pd.L(hu9Var);
        Property property = View.TRANSLATION_X;
        Float f = this.b;
        return ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) property, 0.0f, K * (f != null ? f.floatValue() * view.getWidth() : pd.G(view))), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, 0.0f, L * (f != null ? f.floatValue() * view.getHeight() : pd.G(view))));
    }
}
