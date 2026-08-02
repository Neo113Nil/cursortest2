package ru.yandex.taxi.plaque.animation.transitions;

import android.animation.ObjectAnimator;
import android.content.res.ColorStateList;
import android.widget.TextView;
import androidx.transition.Transition;
import androidx.transition.TransitionListenerAdapter;
import defpackage.m810;
import defpackage.rsy0;
import ru.yandex.taxi.plaque.animation.transitions.TextSizeTransition;

/* loaded from: classes6.dex */
public final class a extends TransitionListenerAdapter {
    public final /* synthetic */ TextView a;
    public final /* synthetic */ TextSizeTransition.SwitchBitmapDrawable b;
    public final /* synthetic */ ColorStateList c;
    public final /* synthetic */ ObjectAnimator w;
    public final /* synthetic */ rsy0 x;
    public final /* synthetic */ rsy0 y;
    public final /* synthetic */ float z;

    public a(TextView textView, TextSizeTransition.SwitchBitmapDrawable switchBitmapDrawable, ColorStateList colorStateList, ObjectAnimator objectAnimator, rsy0 rsy0Var, rsy0 rsy0Var2, float f) {
        this.a = textView;
        this.b = switchBitmapDrawable;
        this.c = colorStateList;
        this.w = objectAnimator;
        this.x = rsy0Var;
        this.y = rsy0Var2;
        this.z = f;
    }

    @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        TextView textView = this.a;
        textView.getOverlay().remove(this.b);
        textView.setTextColor(this.c);
    }

    @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
        TextSizeTransition.SwitchBitmapDrawable switchBitmapDrawable = this.b;
        float fontSize = switchBitmapDrawable.getFontSize();
        TextView textView = this.a;
        textView.setTextSize(0, fontSize);
        int b = m810.b(switchBitmapDrawable.getLeft());
        int b2 = m810.b(switchBitmapDrawable.getTop());
        float animatedFraction = this.w.getAnimatedFraction();
        String[] strArr = TextSizeTransition.h0;
        rsy0 rsy0Var = this.x;
        float f = rsy0Var.c;
        rsy0 rsy0Var2 = this.y;
        int b3 = m810.b(((rsy0Var2.c - f) * animatedFraction) + f);
        float f2 = rsy0Var.d;
        textView.setPadding(b, b2, b3, m810.b(((rsy0Var2.d - f2) * animatedFraction) + f2));
    }

    @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
        float f = this.z;
        TextView textView = this.a;
        textView.setTextSize(0, f);
        rsy0 rsy0Var = this.y;
        textView.setPadding(rsy0Var.a, rsy0Var.b, rsy0Var.c, rsy0Var.d);
    }
}
