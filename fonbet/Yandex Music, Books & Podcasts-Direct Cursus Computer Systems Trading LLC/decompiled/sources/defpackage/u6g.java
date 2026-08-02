package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes3.dex */
public final class u6g extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ v6g b;

    public /* synthetic */ u6g(v6g v6gVar, int i) {
        this.a = i;
        this.b = v6gVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                super.onAnimationEnd(animator);
                v6g v6gVar = this.b;
                v6gVar.h();
                ek0 ek0Var = v6gVar.k;
                if (ek0Var != null) {
                    ek0Var.a((qie) v6gVar.b);
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationRepeat(animator);
                v6g v6gVar = this.b;
                v6gVar.h = (v6gVar.h + 1) % v6gVar.g.e.length;
                v6gVar.i = true;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }
}
