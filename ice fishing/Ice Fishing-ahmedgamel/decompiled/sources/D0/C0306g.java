package D0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.icefishinggame.icefishinggamemultigames.C5275R;

/* renamed from: D0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0306g extends AnimatorListenerAdapter implements m {

    /* renamed from: a, reason: collision with root package name */
    public final View f561a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f562b = false;

    public C0306g(View view) {
        this.f561a = view;
    }

    @Override // D0.m
    public final void b() {
        View view = this.f561a;
        view.setTag(C5275R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? y.f619a.h(view) : 0.0f));
    }

    @Override // D0.m
    public final void e() {
        this.f561a.setTag(C5275R.id.transition_pause_alpha, null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        y.f619a.l(this.f561a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f561a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f562b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z3) {
        boolean z6 = this.f562b;
        View view = this.f561a;
        if (z6) {
            view.setLayerType(0, null);
        }
        if (z3) {
            return;
        }
        D d2 = y.f619a;
        d2.l(view, 1.0f);
        d2.getClass();
    }

    @Override // D0.m
    public final void a(o oVar) {
    }

    @Override // D0.m
    public final void c(o oVar) {
    }

    @Override // D0.m
    public final void d(o oVar) {
    }

    @Override // D0.m
    public final void f(o oVar) {
    }
}
