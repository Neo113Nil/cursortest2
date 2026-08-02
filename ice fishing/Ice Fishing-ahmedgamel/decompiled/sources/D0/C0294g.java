package D0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.IceFishing.LiveIceFishing.C5248R;

/* renamed from: D0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0294g extends AnimatorListenerAdapter implements m {

    /* renamed from: a, reason: collision with root package name */
    public final View f456a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f457b = false;

    public C0294g(View view) {
        this.f456a = view;
    }

    @Override // D0.m
    public final void b() {
        View view = this.f456a;
        view.setTag(C5248R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? y.f515a.u(view) : 0.0f));
    }

    @Override // D0.m
    public final void e() {
        this.f456a.setTag(C5248R.id.transition_pause_alpha, null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        y.f515a.H(this.f456a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f456a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f457b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z6) {
        boolean z9 = this.f457b;
        View view = this.f456a;
        if (z9) {
            view.setLayerType(0, null);
        }
        if (z6) {
            return;
        }
        D d9 = y.f515a;
        d9.H(view, 1.0f);
        d9.getClass();
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
