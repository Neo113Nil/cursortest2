package p0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class E extends AnimatorListenerAdapter implements k {

    /* renamed from: a, reason: collision with root package name */
    public final View f4133a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4134b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f4135c;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4137f = false;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4136d = true;

    public E(View view, int i) {
        this.f4133a = view;
        this.f4134b = i;
        this.f4135c = (ViewGroup) view.getParent();
        g(true);
    }

    @Override // p0.k
    public final void a() {
        g(false);
        if (this.f4137f) {
            return;
        }
        w.b(this.f4133a, this.f4134b);
    }

    @Override // p0.k
    public final void b(m mVar) {
    }

    @Override // p0.k
    public final void c(m mVar) {
        mVar.x(this);
    }

    @Override // p0.k
    public final void e() {
        g(true);
        if (this.f4137f) {
            return;
        }
        w.b(this.f4133a, 0);
    }

    @Override // p0.k
    public final void f(m mVar) {
    }

    public final void g(boolean z2) {
        ViewGroup viewGroup;
        if (!this.f4136d || this.e == z2 || (viewGroup = this.f4135c) == null) {
            return;
        }
        this.e = z2;
        h0.f.C(viewGroup, z2);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f4137f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f4137f) {
            w.b(this.f4133a, this.f4134b);
            ViewGroup viewGroup = this.f4135c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z2) {
        if (z2) {
            w.b(this.f4133a, 0);
            ViewGroup viewGroup = this.f4135c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z2) {
        if (z2) {
            return;
        }
        if (!this.f4137f) {
            w.b(this.f4133a, this.f4134b);
            ViewGroup viewGroup = this.f4135c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }
}
