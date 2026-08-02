package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.animation.Animation;

/* renamed from: androidx.fragment.app.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC0470i implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f4955a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0471j f4956b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f4957c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0467f f4958d;

    public AnimationAnimationListenerC0470i(View view, C0467f c0467f, C0471j c0471j, a0 a0Var) {
        this.f4955a = a0Var;
        this.f4956b = c0471j;
        this.f4957c = view;
        this.f4958d = c0467f;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        kotlin.jvm.internal.h.e(animation, "animation");
        C0471j c0471j = this.f4956b;
        c0471j.f4959a.post(new androidx.emoji2.text.k(2, c0471j, this.f4957c, this.f4958d));
        if (N.E(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f4955a + " has ended.");
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
            Log.v("FragmentManager", "Animation from operation " + this.f4955a + " has reached onAnimationStart.");
        }
    }
}
