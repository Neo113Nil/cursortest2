package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class cn {
    public defpackage.nm1 GE9mJIPrb8gP;
    public boolean JhCgjQRTAOCT;
    public defpackage.bn1 Ns0WNyEWdPsk;
    public boolean P05cfTpS5W5L;
    public boolean QiMR8OkAhezm;
    public defpackage.s31 T1fB7bDYiVJQ;
    public boolean WDYagTQQm9ns;
    public final defpackage.u ZpBGe2uQfcn8;
    public boolean e6mdH7fiFuta;
    public defpackage.zs0 fNwYGHIYeJcR;
    public defpackage.s31 gUjdnLbkVAaA;
    public final defpackage.a7 giKS3J6vZuNy;
    public boolean oh71FJcDz6S2;
    public final java.lang.Object fWTAfUmVKrZq = new java.lang.Object();
    public defpackage.y10 h3m55N1URyyK = defpackage.n.w7APNrr0aGRc;
    public final android.view.inputmethod.CursorAnchorInfo.Builder XntWc4eZSQ8j = new android.view.inputmethod.CursorAnchorInfo.Builder();
    public final float[] WmetiUbpKU9I = defpackage.pk0.ZpBGe2uQfcn8();
    public final android.graphics.Matrix s0TASMVLSWD5 = new android.graphics.Matrix();

    public cn(defpackage.u uVar, defpackage.a7 a7Var) {
        this.ZpBGe2uQfcn8 = uVar;
        this.giKS3J6vZuNy = a7Var;
    }

    public final void ZpBGe2uQfcn8() {
        android.view.View view;
        android.view.inputmethod.EditorBoundsInfo.Builder editorBounds;
        android.view.inputmethod.EditorBoundsInfo.Builder handwritingBounds;
        android.view.inputmethod.EditorBoundsInfo build;
        defpackage.a7 a7Var = this.giKS3J6vZuNy;
        defpackage.be0 be0Var = (defpackage.be0) a7Var.fWTAfUmVKrZq;
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) be0Var.getValue();
        android.view.View view2 = (android.view.View) a7Var.giKS3J6vZuNy;
        if (inputMethodManager.isActive(view2)) {
            defpackage.y10 y10Var = this.h3m55N1URyyK;
            float[] fArr = this.WmetiUbpKU9I;
            y10Var.P05cfTpS5W5L(new defpackage.pk0(fArr));
            this.ZpBGe2uQfcn8.ZVVdXbWmyCSK(fArr);
            android.graphics.Matrix matrix = this.s0TASMVLSWD5;
            defpackage.ma0.frSwwKIlbUhK(matrix, fArr);
            defpackage.nm1 nm1Var = this.GE9mJIPrb8gP;
            nm1Var.getClass();
            long j = nm1Var.giKS3J6vZuNy;
            defpackage.zs0 zs0Var = this.fNwYGHIYeJcR;
            zs0Var.getClass();
            defpackage.bn1 bn1Var = this.Ns0WNyEWdPsk;
            bn1Var.getClass();
            defpackage.wm0 wm0Var = bn1Var.giKS3J6vZuNy;
            defpackage.s31 s31Var = this.gUjdnLbkVAaA;
            s31Var.getClass();
            float f = s31Var.JhCgjQRTAOCT;
            float f2 = s31Var.giKS3J6vZuNy;
            defpackage.s31 s31Var2 = this.T1fB7bDYiVJQ;
            s31Var2.getClass();
            boolean z = this.oh71FJcDz6S2;
            boolean z2 = this.QiMR8OkAhezm;
            boolean z3 = this.P05cfTpS5W5L;
            boolean z4 = this.e6mdH7fiFuta;
            android.view.inputmethod.CursorAnchorInfo.Builder builder = this.XntWc4eZSQ8j;
            builder.reset();
            builder.setMatrix(matrix);
            defpackage.in1 in1Var = nm1Var.fWTAfUmVKrZq;
            int oh71FJcDz6S2 = defpackage.in1.oh71FJcDz6S2(j);
            builder.setSelectionRange(oh71FJcDz6S2, defpackage.in1.WDYagTQQm9ns(j));
            defpackage.a51 a51Var = defpackage.a51.oh71FJcDz6S2;
            if (!z || oh71FJcDz6S2 < 0) {
                view = view2;
            } else {
                int QiMR8OkAhezm = zs0Var.QiMR8OkAhezm(oh71FJcDz6S2);
                defpackage.s31 fWTAfUmVKrZq = bn1Var.fWTAfUmVKrZq(QiMR8OkAhezm);
                view = view2;
                float gUjdnLbkVAaA = defpackage.j80.gUjdnLbkVAaA(fWTAfUmVKrZq.ZpBGe2uQfcn8, 0.0f, (int) (bn1Var.fWTAfUmVKrZq >> 32));
                boolean T1fB7bDYiVJQ = defpackage.i61.T1fB7bDYiVJQ(s31Var, gUjdnLbkVAaA, fWTAfUmVKrZq.giKS3J6vZuNy);
                boolean T1fB7bDYiVJQ2 = defpackage.i61.T1fB7bDYiVJQ(s31Var, gUjdnLbkVAaA, fWTAfUmVKrZq.JhCgjQRTAOCT);
                boolean z5 = bn1Var.ZpBGe2uQfcn8(QiMR8OkAhezm) == a51Var;
                int i = (T1fB7bDYiVJQ || T1fB7bDYiVJQ2) ? 1 : 0;
                if (!T1fB7bDYiVJQ || !T1fB7bDYiVJQ2) {
                    i |= 2;
                }
                if (z5) {
                    i |= 4;
                }
                float f3 = fWTAfUmVKrZq.giKS3J6vZuNy;
                float f4 = fWTAfUmVKrZq.JhCgjQRTAOCT;
                builder.setInsertionMarkerLocation(gUjdnLbkVAaA, f3, f4, f4, i);
            }
            android.view.inputmethod.CursorAnchorInfo.Builder builder2 = builder;
            if (z2) {
                int oh71FJcDz6S22 = in1Var != null ? defpackage.in1.oh71FJcDz6S2(in1Var.ZpBGe2uQfcn8) : -1;
                int WDYagTQQm9ns = in1Var != null ? defpackage.in1.WDYagTQQm9ns(in1Var.ZpBGe2uQfcn8) : -1;
                if (oh71FJcDz6S22 >= 0 && oh71FJcDz6S22 < WDYagTQQm9ns) {
                    builder2.setComposingText(oh71FJcDz6S22, nm1Var.ZpBGe2uQfcn8.oh71FJcDz6S2.subSequence(oh71FJcDz6S22, WDYagTQQm9ns));
                    int QiMR8OkAhezm2 = zs0Var.QiMR8OkAhezm(oh71FJcDz6S22);
                    int QiMR8OkAhezm3 = zs0Var.QiMR8OkAhezm(WDYagTQQm9ns);
                    float[] fArr2 = new float[(QiMR8OkAhezm3 - QiMR8OkAhezm2) * 4];
                    wm0Var.ZpBGe2uQfcn8(defpackage.j80.JhCgjQRTAOCT(QiMR8OkAhezm2, QiMR8OkAhezm3), fArr2);
                    while (oh71FJcDz6S22 < WDYagTQQm9ns) {
                        int QiMR8OkAhezm4 = zs0Var.QiMR8OkAhezm(oh71FJcDz6S22);
                        int i2 = (QiMR8OkAhezm4 - QiMR8OkAhezm2) * 4;
                        float f5 = fArr2[i2];
                        android.view.inputmethod.CursorAnchorInfo.Builder builder3 = builder2;
                        float f6 = fArr2[i2 + 1];
                        int i3 = WDYagTQQm9ns;
                        float f7 = fArr2[i2 + 2];
                        float f8 = fArr2[i2 + 3];
                        int i4 = oh71FJcDz6S22;
                        int i5 = (s31Var.ZpBGe2uQfcn8 < f7 ? 1 : 0) & (f5 < s31Var.fWTAfUmVKrZq ? 1 : 0) & (f2 < f8 ? 1 : 0) & (f6 < f ? 1 : 0);
                        if (!defpackage.i61.T1fB7bDYiVJQ(s31Var, f5, f6) || !defpackage.i61.T1fB7bDYiVJQ(s31Var, f7, f8)) {
                            i5 |= 2;
                        }
                        if (bn1Var.ZpBGe2uQfcn8(QiMR8OkAhezm4) == a51Var) {
                            i5 |= 4;
                        }
                        builder3.addCharacterBounds(i4, f5, f6, f7, f8, i5);
                        builder2 = builder3;
                        oh71FJcDz6S22 = i4 + 1;
                        WDYagTQQm9ns = i3;
                    }
                }
            }
            int i6 = android.os.Build.VERSION.SDK_INT;
            if (i6 >= 33 && z3) {
                editorBounds = defpackage.Rl68HURFBtL3.e6mdH7fiFuta().setEditorBounds(defpackage.w60.OVwOqzUGHcCU(s31Var2));
                handwritingBounds = editorBounds.setHandwritingBounds(defpackage.w60.OVwOqzUGHcCU(s31Var2));
                build = handwritingBounds.build();
                builder2.setEditorBoundsInfo(build);
            }
            if (i6 >= 34 && z4 && !s31Var.oh71FJcDz6S2()) {
                int i7 = wm0Var.oh71FJcDz6S2 - 1;
                if (i7 < 0) {
                    i7 = 0;
                }
                int T1fB7bDYiVJQ3 = defpackage.j80.T1fB7bDYiVJQ(wm0Var.WDYagTQQm9ns(f2), 0, i7);
                int T1fB7bDYiVJQ4 = defpackage.j80.T1fB7bDYiVJQ(wm0Var.WDYagTQQm9ns(f), 0, i7);
                if (T1fB7bDYiVJQ3 <= T1fB7bDYiVJQ4) {
                    while (true) {
                        builder2.addVisibleLineBounds(bn1Var.JhCgjQRTAOCT(T1fB7bDYiVJQ3), wm0Var.oh71FJcDz6S2(T1fB7bDYiVJQ3), bn1Var.WDYagTQQm9ns(T1fB7bDYiVJQ3), wm0Var.giKS3J6vZuNy(T1fB7bDYiVJQ3));
                        if (T1fB7bDYiVJQ3 == T1fB7bDYiVJQ4) {
                            break;
                        } else {
                            T1fB7bDYiVJQ3++;
                        }
                    }
                }
            }
            ((android.view.inputmethod.InputMethodManager) be0Var.getValue()).updateCursorAnchorInfo(view, builder2.build());
            this.WDYagTQQm9ns = false;
        }
    }
}
