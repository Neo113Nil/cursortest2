package defpackage;

/* loaded from: classes.dex */
public final class on1 implements android.animation.ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int F7NU4MC0GW;
    public final /* synthetic */ defpackage.wn1 IHQe1A4L2xu;
    public final /* synthetic */ android.view.View adDC3e2L;
    public final /* synthetic */ defpackage.ro1 oh6vYeIP;
    public final /* synthetic */ defpackage.ro1 r1MBDhnF;

    public on1(defpackage.wn1 wn1Var, defpackage.ro1 ro1Var, defpackage.ro1 ro1Var2, int i, android.view.View view) {
        this.IHQe1A4L2xu = wn1Var;
        this.oh6vYeIP = ro1Var;
        this.r1MBDhnF = ro1Var2;
        this.F7NU4MC0GW = i;
        this.adDC3e2L = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        defpackage.wn1 wn1Var = this.IHQe1A4L2xu;
        defpackage.vn1 vn1Var = wn1Var.IHQe1A4L2xu;
        vn1Var.adDC3e2L(animatedFraction);
        float r1MBDhnF = vn1Var.r1MBDhnF();
        android.view.animation.PathInterpolator pathInterpolator = defpackage.sn1.adDC3e2L;
        int i = android.os.Build.VERSION.SDK_INT;
        defpackage.ro1 ro1Var = this.oh6vYeIP;
        defpackage.eo1 do1Var = i >= 36 ? new defpackage.do1(ro1Var) : i >= 35 ? new defpackage.co1(ro1Var) : i >= 34 ? new defpackage.bo1(ro1Var) : i >= 31 ? new defpackage.ao1(ro1Var) : i >= 30 ? new defpackage.zn1(ro1Var) : i >= 29 ? new defpackage.yn1(ro1Var) : new defpackage.xn1(ro1Var);
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int i3 = this.F7NU4MC0GW & i2;
            defpackage.no1 no1Var = ro1Var.IHQe1A4L2xu;
            if (i3 == 0) {
                do1Var.F7NU4MC0GW(i2, no1Var.EXtogiMhuM(i2));
            } else {
                defpackage.i60 EXtogiMhuM = no1Var.EXtogiMhuM(i2);
                defpackage.i60 EXtogiMhuM2 = this.r1MBDhnF.IHQe1A4L2xu.EXtogiMhuM(i2);
                float f = 1.0f - r1MBDhnF;
                do1Var.F7NU4MC0GW(i2, defpackage.ro1.IHQe1A4L2xu(EXtogiMhuM, (int) (((EXtogiMhuM.IHQe1A4L2xu - EXtogiMhuM2.IHQe1A4L2xu) * f) + 0.5d), (int) (((EXtogiMhuM.oh6vYeIP - EXtogiMhuM2.oh6vYeIP) * f) + 0.5d), (int) (((EXtogiMhuM.r1MBDhnF - EXtogiMhuM2.r1MBDhnF) * f) + 0.5d), (int) (((EXtogiMhuM.F7NU4MC0GW - EXtogiMhuM2.F7NU4MC0GW) * f) + 0.5d)));
            }
        }
        defpackage.sn1.EXtogiMhuM(this.adDC3e2L, do1Var.oh6vYeIP(), java.util.Collections.singletonList(wn1Var));
    }
}
