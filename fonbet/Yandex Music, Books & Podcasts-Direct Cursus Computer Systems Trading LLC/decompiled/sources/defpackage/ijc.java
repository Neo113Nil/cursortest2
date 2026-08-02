package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* loaded from: classes3.dex */
public final class ijc extends AnimatorListenerAdapter {
    public boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ pt0 c;
    public final /* synthetic */ mjc d;

    public ijc(mjc mjcVar, boolean z, pt0 pt0Var) {
        this.d = mjcVar;
        this.b = z;
        this.c = pt0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        mjc mjcVar = this.d;
        mjcVar.r = 0;
        mjcVar.m = null;
        if (this.a) {
            return;
        }
        FloatingActionButton floatingActionButton = mjcVar.v;
        boolean z = this.b;
        floatingActionButton.a(z ? 8 : 4, z);
        pt0 pt0Var = this.c;
        if (pt0Var != null) {
            ((fjc) pt0Var.a).a((FloatingActionButton) pt0Var.b);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        mjc mjcVar = this.d;
        mjcVar.v.a(0, this.b);
        mjcVar.r = 1;
        mjcVar.m = animator;
        this.a = false;
    }
}
