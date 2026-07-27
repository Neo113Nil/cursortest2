package H3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: H3.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0311d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1109a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0312e f1110b;

    public /* synthetic */ C0311d(C0312e c0312e, int i) {
        this.f1109a = i;
        this.f1110b = c0312e;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f1109a) {
            case 1:
                this.f1110b.f1172b.h(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f1109a) {
            case 0:
                this.f1110b.f1172b.h(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
