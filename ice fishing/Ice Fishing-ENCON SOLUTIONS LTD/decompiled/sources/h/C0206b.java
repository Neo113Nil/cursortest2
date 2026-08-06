package h;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: h.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0206b extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f3210a;

    public C0206b(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f3210a = actionBarOverlayLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f3210a;
        actionBarOverlayLayout.t = null;
        actionBarOverlayLayout.f2099j = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f3210a;
        actionBarOverlayLayout.t = null;
        actionBarOverlayLayout.f2099j = false;
    }
}
