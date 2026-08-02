package J3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: J3.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0320d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1465a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0321e f1466b;

    public /* synthetic */ C0320d(C0321e c0321e, int i) {
        this.f1465a = i;
        this.f1466b = c0321e;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f1465a) {
            case 1:
                this.f1466b.f1528b.h(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f1465a) {
            case 0:
                this.f1466b.f1528b.h(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
