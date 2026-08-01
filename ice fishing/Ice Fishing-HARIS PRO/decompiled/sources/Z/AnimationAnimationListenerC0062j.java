package Z;

import android.util.Log;
import android.view.View;
import android.view.animation.Animation;

/* renamed from: Z.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC0062j implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y f1555a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0063k f1556b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f1557c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0058f f1558d;

    public AnimationAnimationListenerC0062j(C0058f c0058f, C0063k c0063k, Y y2, View view) {
        this.f1555a = y2;
        this.f1556b = c0063k;
        this.f1557c = view;
        this.f1558d = c0058f;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        D1.i.e(animation, "animation");
        C0063k c0063k = this.f1556b;
        c0063k.f1559a.post(new V.l(c0063k, this.f1557c, this.f1558d, 2));
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f1555a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        D1.i.e(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        D1.i.e(animation, "animation");
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f1555a + " has reached onAnimationStart.");
        }
    }
}
