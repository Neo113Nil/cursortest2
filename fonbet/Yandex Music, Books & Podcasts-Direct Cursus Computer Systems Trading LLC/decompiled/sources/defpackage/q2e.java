package defpackage;

import android.animation.Animator;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class q2e implements Animator.AnimatorListener {
    public final /* synthetic */ int a = 1;
    public boolean b;
    public final Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public q2e(Function1 function1) {
        this.c = (uif) function1;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                animator.getClass();
                this.b = true;
                hdq hdqVar = (hdq) this.c;
                hdqVar.e = null;
                hdqVar.d();
                hdqVar.invalidateSelf();
                break;
            default:
                this.b = true;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [kotlin.jvm.functions.Function1, uif] */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((s2e) this.c).f().setVisibility(this.b ? 0 : 8);
                break;
            case 1:
                animator.getClass();
                if (!this.b) {
                    animator.setStartDelay(75L);
                    animator.start();
                    break;
                }
                break;
            default:
                ((uif) this.c).invoke(Boolean.valueOf(this.b));
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.a) {
            case 1:
                animator.getClass();
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                animator.getClass();
                this.b = false;
                break;
            default:
                this.b = false;
                break;
        }
    }

    public q2e(s2e s2eVar, boolean z) {
        this.c = s2eVar;
        this.b = z;
    }

    public q2e(hdq hdqVar) {
        this.c = hdqVar;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }
}
