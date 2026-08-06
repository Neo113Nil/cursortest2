package defpackage;

/* loaded from: classes.dex */
public final class pn1 extends android.animation.AnimatorListenerAdapter {
    public final /* synthetic */ defpackage.wn1 IHQe1A4L2xu;
    public final /* synthetic */ android.view.View oh6vYeIP;

    public pn1(defpackage.wn1 wn1Var, android.view.View view) {
        this.IHQe1A4L2xu = wn1Var;
        this.oh6vYeIP = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        defpackage.wn1 wn1Var = this.IHQe1A4L2xu;
        wn1Var.IHQe1A4L2xu.adDC3e2L(1.0f);
        defpackage.sn1.xiZrDbcSW0(wn1Var, this.oh6vYeIP);
    }
}
