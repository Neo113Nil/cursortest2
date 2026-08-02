package defpackage;

import android.animation.Animator;
import kotlin.Pair;

/* loaded from: classes3.dex */
public final class dn8 implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public dn8(pl4 pl4Var, ol4 ol4Var) {
        this.a = 2;
        this.c = pl4Var;
        this.b = ol4Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ((en8) this.b).b.remove((Pair) this.c);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                ((en8) this.b).b.remove((Pair) this.c);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.a) {
            case 0:
            case 1:
                break;
            default:
                pl4 pl4Var = (pl4) this.c;
                ol4 ol4Var = (ol4) this.b;
                pl4Var.a(1.0f, ol4Var, true);
                ol4Var.k = ol4Var.e;
                ol4Var.l = ol4Var.f;
                ol4Var.m = ol4Var.g;
                ol4Var.a((ol4Var.j + 1) % ol4Var.i.length);
                if (!pl4Var.f) {
                    pl4Var.e += 1.0f;
                    break;
                } else {
                    pl4Var.f = false;
                    animator.cancel();
                    animator.setDuration(1332L);
                    animator.start();
                    if (ol4Var.n) {
                        ol4Var.n = false;
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
            case 1:
                break;
            default:
                ((pl4) this.c).e = 0.0f;
                break;
        }
    }

    public /* synthetic */ dn8(en8 en8Var, Pair pair, int i) {
        this.a = i;
        this.b = en8Var;
        this.c = pair;
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

    private final void g(Animator animator) {
    }

    private final void h(Animator animator) {
    }
}
