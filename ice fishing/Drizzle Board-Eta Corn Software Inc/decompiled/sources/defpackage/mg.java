package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.kolosta.rejin.jilosa.R;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class mg extends AnimatorListenerAdapter implements qd0 {
    public boolean NCTxEWno = false;
    public final View qoPGr6Ce;

    public mg(View view) {
        this.qoPGr6Ce = view;
    }

    @Override // defpackage.qd0
    public final void MdtA4re8() {
        this.qoPGr6Ce.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // defpackage.qd0
    public final void NCTxEWno() {
        View view = this.qoPGr6Ce;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? eh0.qoPGr6Ce.P7K7Inc8(view) : 0.0f));
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        eh0.qoPGr6Ce.Qr9iLBAD(this.qoPGr6Ce, 1.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        boolean z2 = this.NCTxEWno;
        View view = this.qoPGr6Ce;
        if (z2) {
            view.setLayerType(0, null);
        }
        if (z) {
            return;
        }
        kh0 kh0Var = eh0.qoPGr6Ce;
        kh0Var.Qr9iLBAD(view, 1.0f);
        kh0Var.getClass();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.qoPGr6Ce;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.NCTxEWno = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // defpackage.qd0
    public final void P7K7Inc8(rd0 rd0Var) {
    }

    @Override // defpackage.qd0
    public final void VgvYg0wo(rd0 rd0Var) {
    }

    @Override // defpackage.qd0
    public final void qoPGr6Ce(rd0 rd0Var) {
    }

    @Override // defpackage.qd0
    public final void wxUZMvaN(rd0 rd0Var) {
    }
}
