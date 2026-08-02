package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i4a implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ i4a(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                animator.getClass();
                Animator.AnimatorListener animatorListener = ((asa) this.b).a;
                if (animatorListener != null) {
                    animatorListener.onAnimationCancel(animator);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((Function0) this.b).invoke();
                return;
            case 1:
                animator.getClass();
                asa asaVar = (asa) this.b;
                Animator.AnimatorListener animatorListener = asaVar.a;
                if (animatorListener != null) {
                    animatorListener.onAnimationEnd(animator);
                }
                gn0[] gn0VarArr = asaVar.c;
                if (gn0VarArr == null) {
                    Intrinsics.j("animationActors");
                    throw null;
                }
                for (gn0 gn0Var : gn0VarArr) {
                    gn0Var.getClass();
                }
                return;
            case 2:
                ((ValueAnimator) this.b).start();
                return;
            case 3:
                Iterator it = ((pyg) this.b).l.iterator();
                while (true) {
                    akj akjVar = (akj) it;
                    if (!akjVar.hasNext()) {
                        return;
                    } else {
                        ((Function0) akjVar.next()).invoke();
                    }
                }
            default:
                n nVar = (n) this.b;
                if (nVar != null) {
                    nVar.mo33b(animator);
                    return;
                }
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.a) {
            case 1:
                animator.getClass();
                Animator.AnimatorListener animatorListener = ((asa) this.b).a;
                if (animatorListener != null) {
                    animatorListener.onAnimationRepeat(animator);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                return;
            case 1:
                animator.getClass();
                asa asaVar = (asa) this.b;
                Animator.AnimatorListener animatorListener = asaVar.a;
                if (animatorListener != null) {
                    animatorListener.onAnimationStart(animator);
                }
                gn0[] gn0VarArr = asaVar.c;
                if (gn0VarArr == null) {
                    Intrinsics.j("animationActors");
                    throw null;
                }
                for (gn0 gn0Var : gn0VarArr) {
                    gn0Var.getClass();
                }
                return;
            case 2:
            case 3:
            default:
                return;
        }
    }

    public /* synthetic */ i4a() {
        this.a = 4;
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

    private final void i(Animator animator) {
    }

    private final void j(Animator animator) {
    }

    private final void k(Animator animator) {
    }

    private final void l(Animator animator) {
    }
}
