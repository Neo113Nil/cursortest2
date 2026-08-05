package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class i5 extends AnimatorListenerAdapter {
    public final /* synthetic */ j5 NCTxEWno;
    public final /* synthetic */ int qoPGr6Ce;

    public /* synthetic */ i5(j5 j5Var, int i) {
        this.qoPGr6Ce = i;
        this.NCTxEWno = j5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.qoPGr6Ce) {
            case 1:
                super.onAnimationEnd(animator);
                j5 j5Var = this.NCTxEWno;
                j5Var.MdtA4re8();
                b2 b2Var = j5Var.eVhOlqcC;
                if (b2Var != null) {
                    b2Var.qoPGr6Ce((sm) j5Var.qoPGr6Ce);
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.qoPGr6Ce) {
            case 0:
                super.onAnimationRepeat(animator);
                j5 j5Var = this.NCTxEWno;
                j5Var.b2ZJblxo = (j5Var.b2ZJblxo + 4) % j5Var.P7K7Inc8.VgvYg0wo.length;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }
}
