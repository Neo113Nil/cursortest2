package defpackage;

/* loaded from: classes.dex */
public final class rn1 implements android.view.View.OnApplyWindowInsetsListener {
    public final defpackage.od IHQe1A4L2xu;
    public defpackage.ro1 oh6vYeIP;

    public rn1(android.view.View view, defpackage.od odVar) {
        defpackage.ro1 ro1Var;
        this.IHQe1A4L2xu = odVar;
        int i = defpackage.mm1.IHQe1A4L2xu;
        defpackage.ro1 IHQe1A4L2xu = defpackage.im1.IHQe1A4L2xu(view);
        if (IHQe1A4L2xu != null) {
            int i2 = android.os.Build.VERSION.SDK_INT;
            ro1Var = (i2 >= 36 ? new defpackage.do1(IHQe1A4L2xu) : i2 >= 35 ? new defpackage.co1(IHQe1A4L2xu) : i2 >= 34 ? new defpackage.bo1(IHQe1A4L2xu) : i2 >= 31 ? new defpackage.ao1(IHQe1A4L2xu) : i2 >= 30 ? new defpackage.zn1(IHQe1A4L2xu) : i2 >= 29 ? new defpackage.yn1(IHQe1A4L2xu) : new defpackage.xn1(IHQe1A4L2xu)).oh6vYeIP();
        } else {
            ro1Var = null;
        }
        this.oh6vYeIP = ro1Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
        int[] iArr;
        boolean z;
        if (!view.isLaidOut()) {
            this.oh6vYeIP = defpackage.ro1.r1MBDhnF(windowInsets, view);
            return view.getTag(com.combinations.spin.balbi.R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }
        defpackage.ro1 r1MBDhnF = defpackage.ro1.r1MBDhnF(windowInsets, view);
        defpackage.no1 no1Var = r1MBDhnF.IHQe1A4L2xu;
        if (this.oh6vYeIP == null) {
            int i = defpackage.mm1.IHQe1A4L2xu;
            this.oh6vYeIP = defpackage.im1.IHQe1A4L2xu(view);
        }
        if (this.oh6vYeIP == null) {
            this.oh6vYeIP = r1MBDhnF;
            if (view.getTag(com.combinations.spin.balbi.R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        } else {
            defpackage.od SH1y5HwkJhh = defpackage.sn1.SH1y5HwkJhh(view);
            if (SH1y5HwkJhh == null || !java.util.Objects.equals((defpackage.ro1) SH1y5HwkJhh.xiZrDbcSW0, r1MBDhnF)) {
                int[] iArr2 = new int[1];
                int[] iArr3 = new int[1];
                defpackage.ro1 ro1Var = this.oh6vYeIP;
                int i2 = 1;
                while (i2 <= 512) {
                    defpackage.i60 EXtogiMhuM = no1Var.EXtogiMhuM(i2);
                    defpackage.i60 EXtogiMhuM2 = ro1Var.IHQe1A4L2xu.EXtogiMhuM(i2);
                    int i3 = EXtogiMhuM.IHQe1A4L2xu;
                    int i4 = EXtogiMhuM.F7NU4MC0GW;
                    int i5 = EXtogiMhuM.r1MBDhnF;
                    int i6 = EXtogiMhuM.oh6vYeIP;
                    int i7 = EXtogiMhuM2.IHQe1A4L2xu;
                    int i8 = EXtogiMhuM2.F7NU4MC0GW;
                    int[] iArr4 = iArr2;
                    int i9 = EXtogiMhuM2.r1MBDhnF;
                    int i10 = EXtogiMhuM2.oh6vYeIP;
                    if (i3 > i7 || i6 > i10 || i5 > i9 || i4 > i8) {
                        iArr = iArr3;
                        z = true;
                    } else {
                        iArr = iArr3;
                        z = false;
                    }
                    if (z != (i3 < i7 || i6 < i10 || i5 < i9 || i4 < i8)) {
                        if (z) {
                            iArr4[0] = iArr4[0] | i2;
                        } else {
                            iArr[0] = iArr[0] | i2;
                        }
                    }
                    i2 <<= 1;
                    iArr2 = iArr4;
                    iArr3 = iArr;
                }
                int i11 = iArr2[0];
                int i12 = iArr3[0];
                int i13 = i11 | i12;
                if (i13 == 0) {
                    this.oh6vYeIP = r1MBDhnF;
                    if (view.getTag(com.combinations.spin.balbi.R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                } else {
                    defpackage.ro1 ro1Var2 = this.oh6vYeIP;
                    defpackage.wn1 wn1Var = new defpackage.wn1(i13, (i11 & 8) != 0 ? defpackage.sn1.adDC3e2L : (i12 & 8) != 0 ? defpackage.sn1.xiZrDbcSW0 : (i11 & 519) != 0 ? defpackage.sn1.AARZUJiTa : (i12 & 519) != 0 ? defpackage.sn1.EXtogiMhuM : null, (i13 & 8) != 0 ? 160L : 250L);
                    wn1Var.IHQe1A4L2xu.adDC3e2L(0.0f);
                    android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(wn1Var.IHQe1A4L2xu.oh6vYeIP());
                    defpackage.i60 EXtogiMhuM3 = no1Var.EXtogiMhuM(i13);
                    defpackage.i60 EXtogiMhuM4 = ro1Var2.IHQe1A4L2xu.EXtogiMhuM(i13);
                    int min = java.lang.Math.min(EXtogiMhuM3.IHQe1A4L2xu, EXtogiMhuM4.IHQe1A4L2xu);
                    int i14 = EXtogiMhuM3.oh6vYeIP;
                    int i15 = EXtogiMhuM4.oh6vYeIP;
                    int min2 = java.lang.Math.min(i14, i15);
                    int i16 = EXtogiMhuM3.r1MBDhnF;
                    int i17 = EXtogiMhuM4.r1MBDhnF;
                    int min3 = java.lang.Math.min(i16, i17);
                    int i18 = EXtogiMhuM3.F7NU4MC0GW;
                    int i19 = EXtogiMhuM4.F7NU4MC0GW;
                    defpackage.F7NU4MC0GW f7nu4mc0gw = new defpackage.F7NU4MC0GW(29, defpackage.i60.oh6vYeIP(min, min2, min3, java.lang.Math.min(i18, i19)), defpackage.i60.oh6vYeIP(java.lang.Math.max(EXtogiMhuM3.IHQe1A4L2xu, EXtogiMhuM4.IHQe1A4L2xu), java.lang.Math.max(i14, i15), java.lang.Math.max(i16, i17), java.lang.Math.max(i18, i19)));
                    defpackage.sn1.AARZUJiTa(view, wn1Var, r1MBDhnF, false);
                    duration.addUpdateListener(new defpackage.on1(wn1Var, r1MBDhnF, ro1Var2, i13, view));
                    duration.addListener(new defpackage.pn1(wn1Var, view));
                    defpackage.yq0 yq0Var = new defpackage.yq0(view, new defpackage.qn1(view, wn1Var, f7nu4mc0gw, duration));
                    view.getViewTreeObserver().addOnPreDrawListener(yq0Var);
                    view.addOnAttachStateChangeListener(yq0Var);
                    this.oh6vYeIP = r1MBDhnF;
                    if (view.getTag(com.combinations.spin.balbi.R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                }
            } else if (view.getTag(com.combinations.spin.balbi.R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        }
        return windowInsets;
    }
}
