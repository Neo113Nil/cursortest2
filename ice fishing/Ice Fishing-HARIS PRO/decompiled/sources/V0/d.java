package V0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
public final class d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1267a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f1268b;

    public /* synthetic */ d(e eVar, int i) {
        this.f1267a = i;
        this.f1268b = eVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f1267a) {
            case 1:
                this.f1268b.f1319b.h(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f1267a) {
            case 0:
                this.f1268b.f1319b.h(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
