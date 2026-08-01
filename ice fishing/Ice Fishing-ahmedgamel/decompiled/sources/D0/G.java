package D0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.FrameLayout;
import com.icefishing.icefishingbigwin.C5275R;

/* loaded from: classes.dex */
public final class G extends AnimatorListenerAdapter implements m {

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f530a;

    /* renamed from: b, reason: collision with root package name */
    public final View f531b;

    /* renamed from: c, reason: collision with root package name */
    public final View f532c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f533d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0307h f534e;

    public G(C0307h c0307h, FrameLayout frameLayout, View view, View view2) {
        this.f534e = c0307h;
        this.f530a = frameLayout;
        this.f531b = view;
        this.f532c = view2;
    }

    @Override // D0.m
    public final void c(o oVar) {
        if (this.f533d) {
            g();
        }
    }

    @Override // D0.m
    public final void d(o oVar) {
        oVar.C(this);
    }

    public final void g() {
        this.f532c.setTag(C5275R.id.save_overlay_view, null);
        this.f530a.getOverlay().remove(this.f531b);
        this.f533d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f530a.getOverlay().remove(this.f531b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f531b;
        if (view.getParent() == null) {
            this.f530a.getOverlay().add(view);
        } else {
            this.f534e.h();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z3) {
        if (z3) {
            View view = this.f532c;
            View view2 = this.f531b;
            view.setTag(C5275R.id.save_overlay_view, view2);
            this.f530a.getOverlay().add(view2);
            this.f533d = true;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z3) {
        if (z3) {
            return;
        }
        g();
    }

    @Override // D0.m
    public final void b() {
    }

    @Override // D0.m
    public final void e() {
    }

    @Override // D0.m
    public final void a(o oVar) {
    }
}
