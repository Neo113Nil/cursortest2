package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class lv1 implements android.view.View.OnApplyWindowInsetsListener {
    public final defpackage.hv1 ZpBGe2uQfcn8;
    public defpackage.mw1 giKS3J6vZuNy;

    public lv1(android.view.View view, defpackage.hv1 hv1Var) {
        defpackage.mw1 mw1Var;
        this.ZpBGe2uQfcn8 = hv1Var;
        int i = defpackage.zt1.ZpBGe2uQfcn8;
        defpackage.mw1 ZpBGe2uQfcn8 = defpackage.vt1.ZpBGe2uQfcn8(view);
        if (ZpBGe2uQfcn8 != null) {
            int i2 = android.os.Build.VERSION.SDK_INT;
            mw1Var = (i2 >= 36 ? new defpackage.yv1(ZpBGe2uQfcn8) : i2 >= 35 ? new defpackage.xv1(ZpBGe2uQfcn8) : i2 >= 34 ? new defpackage.wv1(ZpBGe2uQfcn8) : i2 >= 31 ? new defpackage.vv1(ZpBGe2uQfcn8) : i2 >= 30 ? new defpackage.uv1(ZpBGe2uQfcn8) : i2 >= 29 ? new defpackage.tv1(ZpBGe2uQfcn8) : new defpackage.rv1(ZpBGe2uQfcn8)).giKS3J6vZuNy();
        } else {
            mw1Var = null;
        }
        this.giKS3J6vZuNy = mw1Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
        int[] iArr;
        boolean z;
        if (!view.isLaidOut()) {
            this.giKS3J6vZuNy = defpackage.mw1.fWTAfUmVKrZq(windowInsets, view);
            return view.getTag(com.ice.fishing.wolberta.R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }
        defpackage.mw1 fWTAfUmVKrZq = defpackage.mw1.fWTAfUmVKrZq(windowInsets, view);
        defpackage.jw1 jw1Var = fWTAfUmVKrZq.ZpBGe2uQfcn8;
        if (this.giKS3J6vZuNy == null) {
            int i = defpackage.zt1.ZpBGe2uQfcn8;
            this.giKS3J6vZuNy = defpackage.vt1.ZpBGe2uQfcn8(view);
        }
        if (this.giKS3J6vZuNy == null) {
            this.giKS3J6vZuNy = fWTAfUmVKrZq;
            if (view.getTag(com.ice.fishing.wolberta.R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        } else {
            defpackage.hv1 GE9mJIPrb8gP = defpackage.mv1.GE9mJIPrb8gP(view);
            if (GE9mJIPrb8gP == null || !java.util.Objects.equals(GE9mJIPrb8gP.WDYagTQQm9ns, fWTAfUmVKrZq)) {
                int[] iArr2 = new int[1];
                int[] iArr3 = new int[1];
                defpackage.mw1 mw1Var = this.giKS3J6vZuNy;
                int i2 = 1;
                while (i2 <= 512) {
                    defpackage.v80 P05cfTpS5W5L = jw1Var.P05cfTpS5W5L(i2);
                    defpackage.v80 P05cfTpS5W5L2 = mw1Var.ZpBGe2uQfcn8.P05cfTpS5W5L(i2);
                    int i3 = P05cfTpS5W5L.ZpBGe2uQfcn8;
                    int i4 = P05cfTpS5W5L.JhCgjQRTAOCT;
                    int i5 = P05cfTpS5W5L.fWTAfUmVKrZq;
                    int i6 = P05cfTpS5W5L.giKS3J6vZuNy;
                    int i7 = P05cfTpS5W5L2.ZpBGe2uQfcn8;
                    int i8 = P05cfTpS5W5L2.JhCgjQRTAOCT;
                    int[] iArr4 = iArr2;
                    int i9 = P05cfTpS5W5L2.fWTAfUmVKrZq;
                    int i10 = P05cfTpS5W5L2.giKS3J6vZuNy;
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
                    this.giKS3J6vZuNy = fWTAfUmVKrZq;
                    if (view.getTag(com.ice.fishing.wolberta.R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                } else {
                    defpackage.mw1 mw1Var2 = this.giKS3J6vZuNy;
                    defpackage.qv1 qv1Var = new defpackage.qv1(i13, (i11 & 8) != 0 ? defpackage.mv1.WDYagTQQm9ns : (i12 & 8) != 0 ? defpackage.mv1.oh71FJcDz6S2 : (i11 & 519) != 0 ? defpackage.mv1.QiMR8OkAhezm : (i12 & 519) != 0 ? defpackage.mv1.P05cfTpS5W5L : null, (i13 & 8) != 0 ? 160L : 250L);
                    qv1Var.ZpBGe2uQfcn8.WDYagTQQm9ns(0.0f);
                    android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(qv1Var.ZpBGe2uQfcn8.giKS3J6vZuNy());
                    defpackage.v80 P05cfTpS5W5L3 = jw1Var.P05cfTpS5W5L(i13);
                    defpackage.v80 P05cfTpS5W5L4 = mw1Var2.ZpBGe2uQfcn8.P05cfTpS5W5L(i13);
                    int min = java.lang.Math.min(P05cfTpS5W5L3.ZpBGe2uQfcn8, P05cfTpS5W5L4.ZpBGe2uQfcn8);
                    int i14 = P05cfTpS5W5L3.giKS3J6vZuNy;
                    int i15 = P05cfTpS5W5L4.giKS3J6vZuNy;
                    int min2 = java.lang.Math.min(i14, i15);
                    int i16 = P05cfTpS5W5L3.fWTAfUmVKrZq;
                    int i17 = P05cfTpS5W5L4.fWTAfUmVKrZq;
                    int min3 = java.lang.Math.min(i16, i17);
                    int i18 = P05cfTpS5W5L3.JhCgjQRTAOCT;
                    int i19 = P05cfTpS5W5L4.JhCgjQRTAOCT;
                    defpackage.pd1 pd1Var = new defpackage.pd1(5, defpackage.v80.giKS3J6vZuNy(min, min2, min3, java.lang.Math.min(i18, i19)), defpackage.v80.giKS3J6vZuNy(java.lang.Math.max(P05cfTpS5W5L3.ZpBGe2uQfcn8, P05cfTpS5W5L4.ZpBGe2uQfcn8), java.lang.Math.max(i14, i15), java.lang.Math.max(i16, i17), java.lang.Math.max(i18, i19)));
                    defpackage.mv1.QiMR8OkAhezm(view, qv1Var, fWTAfUmVKrZq, false);
                    duration.addUpdateListener(new defpackage.iv1(qv1Var, fWTAfUmVKrZq, mw1Var2, i13, view));
                    duration.addListener(new defpackage.jv1(qv1Var, view));
                    defpackage.tt0 tt0Var = new defpackage.tt0(view, new defpackage.kv1(view, qv1Var, pd1Var, duration));
                    view.getViewTreeObserver().addOnPreDrawListener(tt0Var);
                    view.addOnAttachStateChangeListener(tt0Var);
                    this.giKS3J6vZuNy = fWTAfUmVKrZq;
                    if (view.getTag(com.ice.fishing.wolberta.R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                }
            } else if (view.getTag(com.ice.fishing.wolberta.R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        }
        return windowInsets;
    }
}
