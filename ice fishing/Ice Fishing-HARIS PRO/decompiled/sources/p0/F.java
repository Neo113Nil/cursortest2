package p0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.lumenpath.harispro.hrnavigator.R;

/* loaded from: classes.dex */
public final class F extends AnimatorListenerAdapter implements k {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f4138a;

    /* renamed from: b, reason: collision with root package name */
    public final View f4139b;

    /* renamed from: c, reason: collision with root package name */
    public final View f4140c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4141d = true;
    public final /* synthetic */ h e;

    public F(h hVar, ViewGroup viewGroup, View view, View view2) {
        this.e = hVar;
        this.f4138a = viewGroup;
        this.f4139b = view;
        this.f4140c = view2;
    }

    @Override // p0.k
    public final void a() {
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
    }

    @Override // p0.k
    public final void f(m mVar) {
        if (this.f4141d) {
            g();
        }
    }

    public final void g() {
        this.f4140c.setTag(R.id.save_overlay_view, null);
        this.f4138a.getOverlay().remove(this.f4139b);
        this.f4141d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f4138a.getOverlay().remove(this.f4139b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f4139b;
        if (view.getParent() == null) {
            this.f4138a.getOverlay().add(view);
        } else {
            this.e.c();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z2) {
        if (z2) {
            View view = this.f4140c;
            View view2 = this.f4139b;
            view.setTag(R.id.save_overlay_view, view2);
            this.f4138a.getOverlay().add(view2);
            this.f4141d = true;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z2) {
        if (z2) {
            return;
        }
        g();
    }
}
