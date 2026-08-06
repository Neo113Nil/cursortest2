package defpackage;

/* loaded from: classes.dex */
public final class qn1 implements java.lang.Runnable {
    public final /* synthetic */ defpackage.F7NU4MC0GW AARZUJiTa;
    public final /* synthetic */ android.animation.ValueAnimator EXtogiMhuM;
    public final /* synthetic */ android.view.View adDC3e2L;
    public final /* synthetic */ defpackage.wn1 xiZrDbcSW0;

    public qn1(android.view.View view, defpackage.wn1 wn1Var, defpackage.F7NU4MC0GW f7nu4mc0gw, android.animation.ValueAnimator valueAnimator) {
        this.adDC3e2L = view;
        this.xiZrDbcSW0 = wn1Var;
        this.AARZUJiTa = f7nu4mc0gw;
        this.EXtogiMhuM = valueAnimator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        defpackage.sn1.riuEU0zW4(this.adDC3e2L, this.xiZrDbcSW0, this.AARZUJiTa);
        this.EXtogiMhuM.start();
    }
}
