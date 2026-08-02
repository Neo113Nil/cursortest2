package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes3.dex */
public final class lr2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b = false;
    public final /* synthetic */ mr2 c;

    public /* synthetic */ lr2(mr2 mr2Var, int i) {
        this.a = i;
        this.c = mr2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                this.b = true;
                break;
            default:
                this.b = true;
                this.c.t = 1.0f;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                if (!this.b) {
                    mr2 mr2Var = this.c;
                    mr2Var.d = mr2Var.u;
                    mr2Var.e = 0.0f;
                    break;
                }
                break;
            default:
                if (!this.b) {
                    mr2 mr2Var2 = this.c;
                    mr2Var2.d = mr2Var2.u;
                    mr2Var2.e = 0.0f;
                    break;
                }
                break;
        }
    }
}
