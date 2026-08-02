package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes3.dex */
public final class odh extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ pdh c;

    public odh(pdh pdhVar, boolean z, int i) {
        this.c = pdhVar;
        this.a = z;
        this.b = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        pdh pdhVar = this.c;
        ((View) pdhVar.e).setTranslationX(0.0f);
        pdhVar.f(0.0f, this.b, this.a);
    }
}
