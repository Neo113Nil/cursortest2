package k0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: k0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0193g extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0 f3489a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3490b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f3491c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3492d;
    public final /* synthetic */ ViewPropertyAnimator e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0197k f3493f;

    public C0193g(C0197k c0197k, b0 b0Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f3493f = c0197k;
        this.f3489a = b0Var;
        this.f3490b = i;
        this.f3491c = view;
        this.f3492d = i2;
        this.e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f3490b;
        View view = this.f3491c;
        if (i != 0) {
            view.setTranslationX(RecyclerView.f2111C0);
        }
        if (this.f3492d != 0) {
            view.setTranslationY(RecyclerView.f2111C0);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.e.setListener(null);
        C0197k c0197k = this.f3493f;
        b0 b0Var = this.f3489a;
        c0197k.c(b0Var);
        c0197k.f3532p.remove(b0Var);
        c0197k.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f3493f.getClass();
    }
}
