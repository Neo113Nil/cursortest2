package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
public final class rbl extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ nbl b;
    public final /* synthetic */ sbl c;

    public /* synthetic */ rbl(sbl sblVar, nbl nblVar, int i) {
        this.a = i;
        this.c = sblVar;
        this.b = nblVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                sbl sblVar = this.c;
                sblVar.i(1);
                if (sblVar.B) {
                    this.b.post(sblVar.s);
                    sblVar.B = false;
                    break;
                }
                break;
            case 1:
                sbl sblVar2 = this.c;
                sblVar2.i(2);
                if (sblVar2.B) {
                    this.b.post(sblVar2.s);
                    sblVar2.B = false;
                    break;
                }
                break;
            default:
                sbl sblVar3 = this.c;
                sblVar3.i(2);
                if (sblVar3.B) {
                    this.b.post(sblVar3.s);
                    sblVar3.B = false;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.c.i(3);
                break;
            case 1:
                this.c.i(3);
                break;
            default:
                this.c.i(3);
                break;
        }
    }
}
