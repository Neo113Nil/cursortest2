package O;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import r.C0338f;

/* loaded from: classes.dex */
public final class Q extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f761a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f762b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f763c;

    public Q(X x2, View view) {
        this.f762b = x2;
        this.f763c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f761a) {
            case 0:
                ((X) this.f762b).f776a.d(1.0f);
                T.e((View) this.f763c);
                break;
            default:
                ((C0338f) this.f762b).remove(animator);
                ((p0.m) this.f763c).f4194n.remove(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f761a) {
            case 1:
                ((p0.m) this.f763c).f4194n.add(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public Q(p0.m mVar, C0338f c0338f) {
        this.f763c = mVar;
        this.f762b = c0338f;
    }
}
