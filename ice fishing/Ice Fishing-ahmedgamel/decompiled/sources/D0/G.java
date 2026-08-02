package D0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.FrameLayout;
import com.IceFishing.LiveIceFishing.C5248R;

/* loaded from: classes.dex */
public final class G extends AnimatorListenerAdapter implements m {

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f425a;

    /* renamed from: b, reason: collision with root package name */
    public final View f426b;

    /* renamed from: c, reason: collision with root package name */
    public final View f427c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f428d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0295h f429e;

    public G(C0295h c0295h, FrameLayout frameLayout, View view, View view2) {
        this.f429e = c0295h;
        this.f425a = frameLayout;
        this.f426b = view;
        this.f427c = view2;
    }

    @Override // D0.m
    public final void c(o oVar) {
        if (this.f428d) {
            g();
        }
    }

    @Override // D0.m
    public final void d(o oVar) {
        oVar.C(this);
    }

    public final void g() {
        this.f427c.setTag(C5248R.id.save_overlay_view, null);
        this.f425a.getOverlay().remove(this.f426b);
        this.f428d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f425a.getOverlay().remove(this.f426b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f426b;
        if (view.getParent() == null) {
            this.f425a.getOverlay().add(view);
        } else {
            this.f429e.h();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z6) {
        if (z6) {
            View view = this.f427c;
            View view2 = this.f426b;
            view.setTag(C5248R.id.save_overlay_view, view2);
            this.f425a.getOverlay().add(view2);
            this.f428d = true;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z6) {
        if (z6) {
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
