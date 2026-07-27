package D0;

import O.f0;
import O.j0;
import O.n0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes.dex */
public final class j extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f565a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f566b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f567c;

    public /* synthetic */ j(Object obj, View view, int i) {
        this.f565a = i;
        this.f566b = obj;
        this.f567c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f565a) {
            case 1:
                ((f0) this.f566b).a();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f565a) {
            case 0:
                ((s.b) this.f566b).remove(animator);
                ((o) this.f567c).f591G.remove(animator);
                break;
            case 1:
                ((f0) this.f566b).c();
                break;
            default:
                ((n0) this.f566b).f2114a.d(1.0f);
                j0.e((View) this.f567c);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f565a) {
            case 0:
                ((o) this.f567c).f591G.add(animator);
                break;
            case 1:
                ((f0) this.f566b).b();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public j(o oVar, s.b bVar) {
        this.f565a = 0;
        this.f567c = oVar;
        this.f566b = bVar;
    }
}
