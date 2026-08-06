package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class iv1 implements android.animation.ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int JhCgjQRTAOCT;
    public final /* synthetic */ android.view.View WDYagTQQm9ns;
    public final /* synthetic */ defpackage.qv1 ZpBGe2uQfcn8;
    public final /* synthetic */ defpackage.mw1 fWTAfUmVKrZq;
    public final /* synthetic */ defpackage.mw1 giKS3J6vZuNy;

    public iv1(defpackage.qv1 qv1Var, defpackage.mw1 mw1Var, defpackage.mw1 mw1Var2, int i, android.view.View view) {
        this.ZpBGe2uQfcn8 = qv1Var;
        this.giKS3J6vZuNy = mw1Var;
        this.fWTAfUmVKrZq = mw1Var2;
        this.JhCgjQRTAOCT = i;
        this.WDYagTQQm9ns = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        defpackage.qv1 qv1Var = this.ZpBGe2uQfcn8;
        defpackage.pv1 pv1Var = qv1Var.ZpBGe2uQfcn8;
        pv1Var.WDYagTQQm9ns(animatedFraction);
        float fWTAfUmVKrZq = pv1Var.fWTAfUmVKrZq();
        android.view.animation.PathInterpolator pathInterpolator = defpackage.mv1.WDYagTQQm9ns;
        int i = android.os.Build.VERSION.SDK_INT;
        defpackage.mw1 mw1Var = this.giKS3J6vZuNy;
        defpackage.zv1 yv1Var = i >= 36 ? new defpackage.yv1(mw1Var) : i >= 35 ? new defpackage.xv1(mw1Var) : i >= 34 ? new defpackage.wv1(mw1Var) : i >= 31 ? new defpackage.vv1(mw1Var) : i >= 30 ? new defpackage.uv1(mw1Var) : i >= 29 ? new defpackage.tv1(mw1Var) : new defpackage.rv1(mw1Var);
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int i3 = this.JhCgjQRTAOCT & i2;
            defpackage.jw1 jw1Var = mw1Var.ZpBGe2uQfcn8;
            if (i3 == 0) {
                yv1Var.JhCgjQRTAOCT(i2, jw1Var.P05cfTpS5W5L(i2));
            } else {
                defpackage.v80 P05cfTpS5W5L = jw1Var.P05cfTpS5W5L(i2);
                defpackage.v80 P05cfTpS5W5L2 = this.fWTAfUmVKrZq.ZpBGe2uQfcn8.P05cfTpS5W5L(i2);
                float f = 1.0f - fWTAfUmVKrZq;
                yv1Var.JhCgjQRTAOCT(i2, defpackage.mw1.ZpBGe2uQfcn8(P05cfTpS5W5L, (int) (((P05cfTpS5W5L.ZpBGe2uQfcn8 - P05cfTpS5W5L2.ZpBGe2uQfcn8) * f) + 0.5d), (int) (((P05cfTpS5W5L.giKS3J6vZuNy - P05cfTpS5W5L2.giKS3J6vZuNy) * f) + 0.5d), (int) (((P05cfTpS5W5L.fWTAfUmVKrZq - P05cfTpS5W5L2.fWTAfUmVKrZq) * f) + 0.5d), (int) (((P05cfTpS5W5L.JhCgjQRTAOCT - P05cfTpS5W5L2.JhCgjQRTAOCT) * f) + 0.5d)));
            }
        }
        defpackage.mv1.P05cfTpS5W5L(this.WDYagTQQm9ns, yv1Var.giKS3J6vZuNy(), java.util.Collections.singletonList(qv1Var));
    }
}
