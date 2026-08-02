package defpackage;

import android.animation.Animator;

/* loaded from: classes3.dex */
public final class lkf implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ mkf b;

    public /* synthetic */ lkf(mkf mkfVar, int i) {
        this.a = i;
        this.b = mkfVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                mkf mkfVar = this.b;
                mkfVar.a = null;
                int ordinal = mkfVar.b.ordinal();
                if (ordinal == 1) {
                    mkfVar.c(true);
                    break;
                } else if (ordinal == 2) {
                    mkfVar.c(false);
                    break;
                }
                break;
            default:
                mkf mkfVar2 = this.b;
                mkfVar2.a = null;
                mkfVar2.setScaleY(1.0f);
                mkfVar2.setScaleX(1.0f);
                mkfVar2.b = kkf.b;
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.a;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    private final void f(Animator animator) {
    }
}
