package defpackage;

import android.animation.Animator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class az9 implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ gc8 c;
    public final /* synthetic */ xzb d;

    public /* synthetic */ az9(List list, gc8 gc8Var, xzb xzbVar, int i) {
        this.a = i;
        this.b = list;
        this.c = gc8Var;
        this.d = xzbVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                break;
            default:
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    this.c.E((bd8) it.next(), "animation_cancel", this.d);
                }
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    this.c.E((bd8) it.next(), "animation_end", this.d);
                }
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
