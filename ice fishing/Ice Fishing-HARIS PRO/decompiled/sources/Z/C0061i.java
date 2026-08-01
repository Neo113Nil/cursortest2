package Z;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: Z.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0061i extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0063k f1551a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f1552b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f1553c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Y f1554d;
    public final /* synthetic */ C0058f e;

    public C0061i(C0063k c0063k, View view, boolean z2, Y y2, C0058f c0058f) {
        this.f1551a = c0063k;
        this.f1552b = view;
        this.f1553c = z2;
        this.f1554d = y2;
        this.e = c0058f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        D1.i.e(animator, "anim");
        ViewGroup viewGroup = this.f1551a.f1559a;
        View view = this.f1552b;
        viewGroup.endViewTransition(view);
        Y y2 = this.f1554d;
        if (this.f1553c) {
            int i = y2.f1503a;
            D1.i.d(view, "viewToAnimate");
            D1.h.a(view, i);
        }
        this.e.d();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + y2 + " has ended.");
        }
    }
}
