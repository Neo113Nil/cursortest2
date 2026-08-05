package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class bb extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewPropertyAnimator MdtA4re8;
    public final /* synthetic */ cb NCTxEWno;
    public final /* synthetic */ eb VgvYg0wo;
    public final /* synthetic */ int qoPGr6Ce;
    public final /* synthetic */ View wxUZMvaN;

    public /* synthetic */ bb(eb ebVar, cb cbVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.qoPGr6Ce = i;
        this.VgvYg0wo = ebVar;
        this.NCTxEWno = cbVar;
        this.MdtA4re8 = viewPropertyAnimator;
        this.wxUZMvaN = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.qoPGr6Ce;
        cb cbVar = this.NCTxEWno;
        eb ebVar = this.VgvYg0wo;
        View view = this.wxUZMvaN;
        ViewPropertyAnimator viewPropertyAnimator = this.MdtA4re8;
        switch (i) {
            case 0:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                ebVar.MdtA4re8(cbVar.qoPGr6Ce);
                ebVar.amk52bBQ.remove(cbVar.qoPGr6Ce);
                ebVar.jb9XjC4I();
                break;
            default:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                ebVar.MdtA4re8(cbVar.NCTxEWno);
                ebVar.amk52bBQ.remove(cbVar.NCTxEWno);
                ebVar.jb9XjC4I();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.qoPGr6Ce) {
            case 0:
                this.VgvYg0wo.getClass();
                break;
            default:
                this.VgvYg0wo.getClass();
                break;
        }
    }
}
