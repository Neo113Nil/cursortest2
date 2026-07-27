package D0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.FrameLayout;
import com.icefishing.icefishingliveapp.C5284R;

/* loaded from: classes.dex */
public final class G extends AnimatorListenerAdapter implements m {

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f585a;

    /* renamed from: b, reason: collision with root package name */
    public final View f586b;

    /* renamed from: c, reason: collision with root package name */
    public final View f587c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f588d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0306h f589e;

    public G(C0306h c0306h, FrameLayout frameLayout, View view, View view2) {
        this.f589e = c0306h;
        this.f585a = frameLayout;
        this.f586b = view;
        this.f587c = view2;
    }

    @Override // D0.m
    public final void c(o oVar) {
        if (this.f588d) {
            g();
        }
    }

    @Override // D0.m
    public final void d(o oVar) {
        oVar.C(this);
    }

    public final void g() {
        this.f587c.setTag(C5284R.id.save_overlay_view, null);
        this.f585a.getOverlay().remove(this.f586b);
        this.f588d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f585a.getOverlay().remove(this.f586b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f586b;
        if (view.getParent() == null) {
            this.f585a.getOverlay().add(view);
        } else {
            this.f589e.h();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z8) {
        if (z8) {
            View view = this.f587c;
            View view2 = this.f586b;
            view.setTag(C5284R.id.save_overlay_view, view2);
            this.f585a.getOverlay().add(view2);
            this.f588d = true;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z8) {
        if (z8) {
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
