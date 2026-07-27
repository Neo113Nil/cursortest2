package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.fragment.app.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0465h extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0467j f4982a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f4983b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f4984c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0 f4985d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0463f f4986e;

    public C0465h(C0467j c0467j, View view, boolean z3, a0 a0Var, C0463f c0463f) {
        this.f4982a = c0467j;
        this.f4983b = view;
        this.f4984c = z3;
        this.f4985d = a0Var;
        this.f4986e = c0463f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator anim) {
        kotlin.jvm.internal.h.e(anim, "anim");
        ViewGroup viewGroup = this.f4982a.f4991a;
        View viewToAnimate = this.f4983b;
        viewGroup.endViewTransition(viewToAnimate);
        a0 a0Var = this.f4985d;
        if (this.f4984c) {
            int i = a0Var.f4946a;
            kotlin.jvm.internal.h.d(viewToAnimate, "viewToAnimate");
            D.y.a(i, viewToAnimate);
        }
        this.f4986e.d();
        if (N.E(2)) {
            Log.v("FragmentManager", "Animator from operation " + a0Var + " has ended.");
        }
    }
}
