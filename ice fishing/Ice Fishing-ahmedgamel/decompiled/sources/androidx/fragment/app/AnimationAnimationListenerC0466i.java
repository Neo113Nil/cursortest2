package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.animation.Animation;

/* renamed from: androidx.fragment.app.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC0466i implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f4987a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0467j f4988b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f4989c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0463f f4990d;

    public AnimationAnimationListenerC0466i(View view, C0463f c0463f, C0467j c0467j, a0 a0Var) {
        this.f4987a = a0Var;
        this.f4988b = c0467j;
        this.f4989c = view;
        this.f4990d = c0463f;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        kotlin.jvm.internal.h.e(animation, "animation");
        C0467j c0467j = this.f4988b;
        c0467j.f4991a.post(new androidx.emoji2.text.k(2, c0467j, this.f4989c, this.f4990d));
        if (N.E(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f4987a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        kotlin.jvm.internal.h.e(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        kotlin.jvm.internal.h.e(animation, "animation");
        if (N.E(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f4987a + " has reached onAnimationStart.");
        }
    }
}
