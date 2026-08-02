package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes3.dex */
public final class v2c extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public v2c(boolean z, View view, View view2) {
        this.b = z;
        this.c = view;
        this.d = view2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                View view = (View) this.d;
                if (!this.b) {
                    ((View) this.c).setVisibility(4);
                    view.setAlpha(1.0f);
                    view.setVisibility(0);
                    break;
                }
                break;
            default:
                mjc mjcVar = (mjc) this.d;
                mjcVar.r = 0;
                mjcVar.m = null;
                pt0 pt0Var = (pt0) this.c;
                if (pt0Var != null) {
                    ((fjc) pt0Var.a).b();
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                View view = (View) this.d;
                if (this.b) {
                    ((View) this.c).setVisibility(0);
                    view.setAlpha(0.0f);
                    view.setVisibility(4);
                    break;
                }
                break;
            default:
                mjc mjcVar = (mjc) this.d;
                mjcVar.v.a(0, this.b);
                mjcVar.r = 2;
                mjcVar.m = animator;
                break;
        }
    }

    public v2c(mjc mjcVar, boolean z, pt0 pt0Var) {
        this.d = mjcVar;
        this.b = z;
        this.c = pt0Var;
    }
}
