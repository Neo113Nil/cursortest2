package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class nh0 extends AnimatorListenerAdapter implements qd0 {
    public final ViewGroup MdtA4re8;
    public final int NCTxEWno;
    public boolean VgvYg0wo;
    public final View qoPGr6Ce;
    public boolean P7K7Inc8 = false;
    public final boolean wxUZMvaN = true;

    public nh0(View view, int i) {
        this.qoPGr6Ce = view;
        this.NCTxEWno = i;
        this.MdtA4re8 = (ViewGroup) view.getParent();
        b2ZJblxo(true);
    }

    @Override // defpackage.qd0
    public final void MdtA4re8() {
        b2ZJblxo(true);
        if (this.P7K7Inc8) {
            return;
        }
        eh0.NCTxEWno(this.qoPGr6Ce, 0);
    }

    @Override // defpackage.qd0
    public final void NCTxEWno() {
        b2ZJblxo(false);
        if (this.P7K7Inc8) {
            return;
        }
        eh0.NCTxEWno(this.qoPGr6Ce, this.NCTxEWno);
    }

    public final void b2ZJblxo(boolean z) {
        ViewGroup viewGroup;
        if (!this.wxUZMvaN || this.VgvYg0wo == z || (viewGroup = this.MdtA4re8) == null) {
            return;
        }
        this.VgvYg0wo = z;
        e50.lDXGDhIF(viewGroup, z);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.P7K7Inc8 = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        if (!this.P7K7Inc8) {
            eh0.NCTxEWno(this.qoPGr6Ce, this.NCTxEWno);
            ViewGroup viewGroup = this.MdtA4re8;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        b2ZJblxo(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            eh0.NCTxEWno(this.qoPGr6Ce, 0);
            ViewGroup viewGroup = this.MdtA4re8;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // defpackage.qd0
    public final void wxUZMvaN(rd0 rd0Var) {
        rd0Var.WYNAV5pd(this);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.P7K7Inc8) {
            eh0.NCTxEWno(this.qoPGr6Ce, this.NCTxEWno);
            ViewGroup viewGroup = this.MdtA4re8;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        b2ZJblxo(false);
    }

    @Override // defpackage.qd0
    public final void P7K7Inc8(rd0 rd0Var) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // defpackage.qd0
    public final void qoPGr6Ce(rd0 rd0Var) {
    }
}
