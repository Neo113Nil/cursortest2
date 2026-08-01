package p0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.lumenpath.harispro.hrnavigator.R;

/* renamed from: p0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0329g extends AnimatorListenerAdapter implements k {

    /* renamed from: a, reason: collision with root package name */
    public final View f4167a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4168b = false;

    public C0329g(View view) {
        this.f4167a = view;
    }

    @Override // p0.k
    public final void a() {
        View view = this.f4167a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? w.f4216a.o(view) : RecyclerView.f2111C0));
    }

    @Override // p0.k
    public final void b(m mVar) {
    }

    @Override // p0.k
    public final void c(m mVar) {
    }

    @Override // p0.k
    public final void d(m mVar) {
    }

    @Override // p0.k
    public final void e() {
        this.f4167a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // p0.k
    public final void f(m mVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        w.f4216a.A(this.f4167a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f4167a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f4168b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z2) {
        boolean z3 = this.f4168b;
        View view = this.f4167a;
        if (z3) {
            view.setLayerType(0, null);
        }
        if (z2) {
            return;
        }
        C0321C c0321c = w.f4216a;
        c0321c.A(view, 1.0f);
        c0321c.getClass();
    }
}
