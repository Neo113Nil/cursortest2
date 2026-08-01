package k0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: k0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0194h extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3494a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0195i f3495b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f3496c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f3497d;
    public final /* synthetic */ C0197k e;

    public /* synthetic */ C0194h(C0197k c0197k, C0195i c0195i, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.f3494a = i;
        this.e = c0197k;
        this.f3495b = c0195i;
        this.f3496c = viewPropertyAnimator;
        this.f3497d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3494a) {
            case 0:
                this.f3496c.setListener(null);
                View view = this.f3497d;
                view.setAlpha(1.0f);
                view.setTranslationX(RecyclerView.f2111C0);
                view.setTranslationY(RecyclerView.f2111C0);
                C0195i c0195i = this.f3495b;
                b0 b0Var = c0195i.f3502a;
                C0197k c0197k = this.e;
                c0197k.c(b0Var);
                c0197k.f3534r.remove(c0195i.f3502a);
                c0197k.i();
                break;
            default:
                this.f3496c.setListener(null);
                View view2 = this.f3497d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(RecyclerView.f2111C0);
                view2.setTranslationY(RecyclerView.f2111C0);
                C0195i c0195i2 = this.f3495b;
                b0 b0Var2 = c0195i2.f3503b;
                C0197k c0197k2 = this.e;
                c0197k2.c(b0Var2);
                c0197k2.f3534r.remove(c0195i2.f3503b);
                c0197k2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f3494a) {
            case 0:
                b0 b0Var = this.f3495b.f3502a;
                this.e.getClass();
                break;
            default:
                b0 b0Var2 = this.f3495b.f3503b;
                this.e.getClass();
                break;
        }
    }
}
