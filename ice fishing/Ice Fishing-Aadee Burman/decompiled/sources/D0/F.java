package D0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class F extends AnimatorListenerAdapter implements m {

    /* renamed from: a, reason: collision with root package name */
    public final View f524a;

    /* renamed from: b, reason: collision with root package name */
    public final int f525b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f526c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f528e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f529f = false;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f527d = true;

    public F(int i, View view) {
        this.f524a = view;
        this.f525b = i;
        this.f526c = (ViewGroup) view.getParent();
        g(true);
    }

    @Override // D0.m
    public final void b() {
        g(false);
        if (this.f529f) {
            return;
        }
        y.b(this.f524a, this.f525b);
    }

    @Override // D0.m
    public final void d(o oVar) {
        oVar.C(this);
    }

    @Override // D0.m
    public final void e() {
        g(true);
        if (this.f529f) {
            return;
        }
        y.b(this.f524a, 0);
    }

    public final void g(boolean z3) {
        ViewGroup viewGroup;
        if (!this.f527d || this.f528e == z3 || (viewGroup = this.f526c) == null) {
            return;
        }
        this.f528e = z3;
        com.bumptech.glide.g.i(viewGroup, z3);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f529f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f529f) {
            y.b(this.f524a, this.f525b);
            ViewGroup viewGroup = this.f526c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z3) {
        if (z3) {
            y.b(this.f524a, 0);
            ViewGroup viewGroup = this.f526c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z3) {
        if (z3) {
            return;
        }
        if (!this.f529f) {
            y.b(this.f524a, this.f525b);
            ViewGroup viewGroup = this.f526c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }

    @Override // D0.m
    public final void a(o oVar) {
    }

    @Override // D0.m
    public final void c(o oVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
