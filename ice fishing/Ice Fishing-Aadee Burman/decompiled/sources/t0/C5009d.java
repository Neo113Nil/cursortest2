package t0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: t0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5009d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC5003S f40653a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f40654b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f40655c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f40656d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f40657e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C5013h f40658f;

    public C5009d(C5013h c5013h, AbstractC5003S abstractC5003S, int i, View view, int i6, ViewPropertyAnimator viewPropertyAnimator) {
        this.f40658f = c5013h;
        this.f40653a = abstractC5003S;
        this.f40654b = i;
        this.f40655c = view;
        this.f40656d = i6;
        this.f40657e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f40654b;
        View view = this.f40655c;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f40656d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f40657e.setListener(null);
        C5013h c5013h = this.f40658f;
        AbstractC5003S abstractC5003S = this.f40653a;
        c5013h.c(abstractC5003S);
        c5013h.f40684p.remove(abstractC5003S);
        c5013h.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f40658f.getClass();
    }
}
