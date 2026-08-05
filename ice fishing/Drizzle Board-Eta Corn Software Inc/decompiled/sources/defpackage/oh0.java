package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.kolosta.rejin.jilosa.R;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class oh0 extends AnimatorListenerAdapter implements qd0 {
    public final View MdtA4re8;
    public final View NCTxEWno;
    public final /* synthetic */ ng VgvYg0wo;
    public final ViewGroup qoPGr6Ce;
    public boolean wxUZMvaN = true;

    public oh0(ng ngVar, ViewGroup viewGroup, View view, View view2) {
        this.VgvYg0wo = ngVar;
        this.qoPGr6Ce = viewGroup;
        this.NCTxEWno = view;
        this.MdtA4re8 = view2;
    }

    @Override // defpackage.qd0
    public final void P7K7Inc8(rd0 rd0Var) {
        if (this.wxUZMvaN) {
            b2ZJblxo();
        }
    }

    public final void b2ZJblxo() {
        this.MdtA4re8.setTag(R.id.save_overlay_view, null);
        this.qoPGr6Ce.getOverlay().remove(this.NCTxEWno);
        this.wxUZMvaN = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        b2ZJblxo();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.qoPGr6Ce.getOverlay().remove(this.NCTxEWno);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.NCTxEWno;
        if (view.getParent() == null) {
            this.qoPGr6Ce.getOverlay().add(view);
        } else {
            this.VgvYg0wo.MdtA4re8();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            View view = this.MdtA4re8;
            View view2 = this.NCTxEWno;
            view.setTag(R.id.save_overlay_view, view2);
            this.qoPGr6Ce.getOverlay().add(view2);
            this.wxUZMvaN = true;
        }
    }

    @Override // defpackage.qd0
    public final void wxUZMvaN(rd0 rd0Var) {
        rd0Var.WYNAV5pd(this);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        b2ZJblxo();
    }

    @Override // defpackage.qd0
    public final void qoPGr6Ce(rd0 rd0Var) {
    }

    @Override // defpackage.qd0
    public final void MdtA4re8() {
    }

    @Override // defpackage.qd0
    public final void NCTxEWno() {
    }
}
