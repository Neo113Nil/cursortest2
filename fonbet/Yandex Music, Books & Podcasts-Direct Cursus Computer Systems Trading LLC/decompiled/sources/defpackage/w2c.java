package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: classes3.dex */
public final class w2c extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public w2c(b8t b8tVar, xy0 xy0Var) {
        this.a = 1;
        this.c = b8tVar;
        this.b = xy0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 2:
                ((ygu) this.b).a();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((bm4) this.b).setCircularRevealOverlayDrawable(null);
                break;
            case 1:
                ((xy0) this.b).remove(animator);
                ((b8t) this.c).p.remove(animator);
                break;
            case 2:
                ((ygu) this.b).c();
                break;
            default:
                vpv vpvVar = (vpv) this.b;
                vpvVar.a.e(1.0f);
                rpv.f((View) this.c, vpvVar);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                ((bm4) this.b).setCircularRevealOverlayDrawable((Drawable) this.c);
                break;
            case 1:
                ((b8t) this.c).p.add(animator);
                break;
            case 2:
                ((ygu) this.b).b();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ w2c(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
