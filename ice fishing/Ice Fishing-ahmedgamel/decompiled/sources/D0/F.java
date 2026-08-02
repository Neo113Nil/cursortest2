package D0;

import a.AbstractC0426a;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class F extends AnimatorListenerAdapter implements m {

    /* renamed from: a, reason: collision with root package name */
    public final View f419a;

    /* renamed from: b, reason: collision with root package name */
    public final int f420b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f421c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f423e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f424f = false;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f422d = true;

    public F(int i, View view) {
        this.f419a = view;
        this.f420b = i;
        this.f421c = (ViewGroup) view.getParent();
        g(true);
    }

    @Override // D0.m
    public final void b() {
        g(false);
        if (this.f424f) {
            return;
        }
        y.b(this.f419a, this.f420b);
    }

    @Override // D0.m
    public final void d(o oVar) {
        oVar.C(this);
    }

    @Override // D0.m
    public final void e() {
        g(true);
        if (this.f424f) {
            return;
        }
        y.b(this.f419a, 0);
    }

    public final void g(boolean z6) {
        ViewGroup viewGroup;
        if (!this.f422d || this.f423e == z6 || (viewGroup = this.f421c) == null) {
            return;
        }
        this.f423e = z6;
        AbstractC0426a.p(viewGroup, z6);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f424f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f424f) {
            y.b(this.f419a, this.f420b);
            ViewGroup viewGroup = this.f421c;
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
    public final void onAnimationStart(Animator animator, boolean z6) {
        if (z6) {
            y.b(this.f419a, 0);
            ViewGroup viewGroup = this.f421c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z6) {
        if (z6) {
            return;
        }
        if (!this.f424f) {
            y.b(this.f419a, this.f420b);
            ViewGroup viewGroup = this.f421c;
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
