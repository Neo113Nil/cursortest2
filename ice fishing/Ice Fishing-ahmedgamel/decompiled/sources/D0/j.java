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
    public final /* synthetic */ int f460a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f461b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f462c;

    public /* synthetic */ j(Object obj, View view, int i) {
        this.f460a = i;
        this.f461b = obj;
        this.f462c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f460a) {
            case 1:
                ((f0) this.f461b).a();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f460a) {
            case 0:
                ((s.b) this.f461b).remove(animator);
                ((o) this.f462c).f487G.remove(animator);
                break;
            case 1:
                ((f0) this.f461b).c();
                break;
            default:
                ((n0) this.f461b).f2202a.d(1.0f);
                j0.e((View) this.f462c);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f460a) {
            case 0:
                ((o) this.f462c).f487G.add(animator);
                break;
            case 1:
                ((f0) this.f461b).b();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public j(o oVar, s.b bVar) {
        this.f460a = 0;
        this.f462c = oVar;
        this.f461b = bVar;
    }
}
