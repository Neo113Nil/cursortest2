package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.fragment.app.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0469h extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0471j f4950a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f4951b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f4952c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0 f4953d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0467f f4954e;

    public C0469h(C0471j c0471j, View view, boolean z6, a0 a0Var, C0467f c0467f) {
        this.f4950a = c0471j;
        this.f4951b = view;
        this.f4952c = z6;
        this.f4953d = a0Var;
        this.f4954e = c0467f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator anim) {
        kotlin.jvm.internal.h.e(anim, "anim");
        ViewGroup viewGroup = this.f4950a.f4959a;
        View viewToAnimate = this.f4951b;
        viewGroup.endViewTransition(viewToAnimate);
        a0 a0Var = this.f4953d;
        if (this.f4952c) {
            int i = a0Var.f4914a;
            kotlin.jvm.internal.h.d(viewToAnimate, "viewToAnimate");
            D.x.a(i, viewToAnimate);
        }
        this.f4954e.d();
        if (N.E(2)) {
            Log.v("FragmentManager", "Animator from operation " + a0Var + " has ended.");
        }
    }
}
