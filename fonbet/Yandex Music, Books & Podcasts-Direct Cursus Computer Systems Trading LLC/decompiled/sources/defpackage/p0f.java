package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes.dex */
public final class p0f implements Animator.AnimatorListener {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final opn e;
    public final int f;
    public final ValueAnimator g;
    public boolean h;
    public float i;
    public float j;
    public boolean k = false;
    public boolean l = false;
    public float m;
    public final /* synthetic */ int n;
    public final /* synthetic */ opn o;
    public final /* synthetic */ s0f p;

    public p0f(s0f s0fVar, opn opnVar, int i, float f, float f2, float f3, float f4, int i2, opn opnVar2) {
        this.p = s0fVar;
        this.n = i2;
        this.o = opnVar2;
        this.f = i;
        this.e = opnVar;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.g = ofFloat;
        ofFloat.addUpdateListener(new re3(4, this));
        ofFloat.setTarget(opnVar.a);
        ofFloat.addListener(this);
        this.m = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.l) {
            this.e.q(true);
        }
        this.l = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.m = 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (this.k) {
            return;
        }
        int i = this.n;
        opn opnVar = this.o;
        s0f s0fVar = this.p;
        if (i <= 0) {
            s0fVar.m.d(s0fVar.r, opnVar);
        } else {
            s0fVar.a.add(opnVar.a);
            this.h = true;
            if (i > 0) {
                s0fVar.r.post(new pv7(s0fVar, this, i));
            }
        }
        View view = s0fVar.w;
        View view2 = opnVar.a;
        if (view == view2 && view2 == view) {
            s0fVar.w = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
