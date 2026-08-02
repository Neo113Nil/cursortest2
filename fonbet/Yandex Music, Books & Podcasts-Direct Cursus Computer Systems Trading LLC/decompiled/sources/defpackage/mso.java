package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;
import android.view.View;

/* loaded from: classes3.dex */
public final class mso extends AnimatorListenerAdapter {
    public final View a;
    public final float b;
    public final float c;
    public boolean d;
    public final /* synthetic */ pso e;

    public mso(pso psoVar, View view, float f, float f2) {
        this.e = psoVar;
        this.a = view;
        this.b = f;
        this.c = f2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float f = this.b;
        View view = this.a;
        view.setScaleX(f);
        view.setScaleY(this.c);
        if (this.d) {
            if (Build.VERSION.SDK_INT >= 28) {
                view.resetPivot();
            } else {
                view.setPivotX(view.getWidth() * 0.5f);
                view.setPivotY(view.getHeight() * 0.5f);
            }
        }
        animator.removeListener(this);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.a;
        view.setVisibility(0);
        pso psoVar = this.e;
        float f = psoVar.L;
        float f2 = psoVar.K;
        if (f2 == 0.5f && f == 0.5f) {
            return;
        }
        this.d = true;
        view.setPivotX(view.getWidth() * f2);
        view.setPivotY(view.getHeight() * f);
    }
}
