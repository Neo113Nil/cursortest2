package h3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b0 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f2749a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f2750b;

    public b0(View view, i0 i0Var) {
        this.f2749a = i0Var;
        this.f2750b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        i0 i0Var = this.f2749a;
        i0Var.f2788a.e(1.0f);
        e0.f(this.f2750b, i0Var);
    }
}
