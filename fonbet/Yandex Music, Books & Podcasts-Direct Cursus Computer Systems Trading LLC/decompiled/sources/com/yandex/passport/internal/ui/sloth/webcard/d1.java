package com.yandex.passport.internal.ui.sloth.webcard;

import android.animation.Animator;

/* loaded from: classes4.dex */
public final class d1 implements Animator.AnimatorListener {
    public final /* synthetic */ Integer a;
    public final /* synthetic */ e1 b;

    public d1(Integer num, e1 e1Var) {
        this.a = num;
        this.b = e1Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Integer num = this.a;
        if (num != null && num.intValue() == 0) {
            this.b.g.d = -1;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
