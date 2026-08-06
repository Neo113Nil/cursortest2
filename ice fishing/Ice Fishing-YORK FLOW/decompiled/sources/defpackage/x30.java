package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class x30 extends defpackage.xo implements defpackage.bt {
    public final defpackage.rt IJ0hOnjhPOri;
    public java.lang.Object VFeft99leXEK;
    public final defpackage.l1 maCixPsq4ml2;
    public final /* synthetic */ int w7APNrr0aGRc = 1;

    public x30(defpackage.si1 si1Var, defpackage.l1 l1Var, defpackage.rt rtVar, defpackage.wv0 wv0Var) {
        this.maCixPsq4ml2 = l1Var;
        this.IJ0hOnjhPOri = rtVar;
        this.VFeft99leXEK = wv0Var;
        YZh1E3mnTFwf(si1Var);
    }

    public static boolean KN4muQto0Nd5(float f, long j, android.widget.EdgeEffect edgeEffect, android.graphics.Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(f);
        canvas.translate(java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public static boolean jVUAPb5NnIYW(float f, android.widget.EdgeEffect edgeEffect, android.graphics.Canvas canvas) {
        if (f == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int save = canvas.save();
        canvas.rotate(f);
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public android.graphics.RenderNode iYH9ueRbBBFm() {
        android.graphics.RenderNode renderNode = (android.graphics.RenderNode) this.VFeft99leXEK;
        if (renderNode != null) {
            return renderNode;
        }
        android.graphics.RenderNode oh71FJcDz6S2 = defpackage.u80.oh71FJcDz6S2();
        this.VFeft99leXEK = oh71FJcDz6S2;
        return oh71FJcDz6S2;
    }

    @Override // defpackage.bt
    public final void w6IV1lieBIux(defpackage.ld0 ld0Var) {
        boolean z;
        long j;
        char c;
        android.graphics.RecordingCanvas beginRecording;
        boolean z2;
        boolean z3;
        float f;
        float f2;
        int i = this.w7APNrr0aGRc;
        defpackage.l1 l1Var = this.maCixPsq4ml2;
        defpackage.rt rtVar = this.IJ0hOnjhPOri;
        switch (i) {
            case 0:
                defpackage.wv0 wv0Var = (defpackage.wv0) this.VFeft99leXEK;
                defpackage.ld ldVar = ld0Var.WDYagTQQm9ns;
                l1Var.e6mdH7fiFuta(ldVar.JhCgjQRTAOCT());
                if (defpackage.ae1.fWTAfUmVKrZq(ldVar.JhCgjQRTAOCT())) {
                    ld0Var.ZpBGe2uQfcn8();
                    return;
                }
                ld0Var.ZpBGe2uQfcn8();
                l1Var.JhCgjQRTAOCT.getValue();
                android.graphics.Canvas ZpBGe2uQfcn8 = defpackage.a.ZpBGe2uQfcn8(ldVar.oh71FJcDz6S2.oh71FJcDz6S2());
                if (defpackage.rt.oh71FJcDz6S2(rtVar.oh71FJcDz6S2)) {
                    z = KN4muQto0Nd5(270.0f, (java.lang.Float.floatToRawIntBits(-java.lang.Float.intBitsToFloat((int) (ldVar.JhCgjQRTAOCT() & 4294967295L))) << 32) | (java.lang.Float.floatToRawIntBits(ld0Var.dG7RjM6DqYVL(wv0Var.giKS3J6vZuNy(ld0Var.getLayoutDirection()))) & 4294967295L), rtVar.fWTAfUmVKrZq(), ZpBGe2uQfcn8);
                } else {
                    z = false;
                }
                if (defpackage.rt.oh71FJcDz6S2(rtVar.JhCgjQRTAOCT)) {
                    z = KN4muQto0Nd5(0.0f, (((long) java.lang.Float.floatToRawIntBits(0.0f)) << 32) | (((long) java.lang.Float.floatToRawIntBits(ld0Var.dG7RjM6DqYVL(wv0Var.JhCgjQRTAOCT()))) & 4294967295L), rtVar.WDYagTQQm9ns(), ZpBGe2uQfcn8) || z;
                }
                if (defpackage.rt.oh71FJcDz6S2(rtVar.QiMR8OkAhezm)) {
                    z = KN4muQto0Nd5(90.0f, (((long) java.lang.Float.floatToRawIntBits(0.0f)) << 32) | (((long) java.lang.Float.floatToRawIntBits(ld0Var.dG7RjM6DqYVL(wv0Var.fWTAfUmVKrZq(ld0Var.getLayoutDirection())) + (-((float) defpackage.ok0.CZa7MwI9IzLd(java.lang.Float.intBitsToFloat((int) (ldVar.JhCgjQRTAOCT() >> 32))))))) & 4294967295L), rtVar.JhCgjQRTAOCT(), ZpBGe2uQfcn8) || z;
                }
                if (defpackage.rt.oh71FJcDz6S2(rtVar.WDYagTQQm9ns)) {
                    android.widget.EdgeEffect giKS3J6vZuNy = rtVar.giKS3J6vZuNy();
                    z = KN4muQto0Nd5(180.0f, (((long) java.lang.Float.floatToRawIntBits(-java.lang.Float.intBitsToFloat((int) (ldVar.JhCgjQRTAOCT() >> 32)))) << 32) | (((long) java.lang.Float.floatToRawIntBits((-java.lang.Float.intBitsToFloat((int) (ldVar.JhCgjQRTAOCT() & 4294967295L))) + ld0Var.dG7RjM6DqYVL(wv0Var.ZpBGe2uQfcn8()))) & 4294967295L), giKS3J6vZuNy, ZpBGe2uQfcn8) || z;
                }
                if (z) {
                    l1Var.JhCgjQRTAOCT();
                    return;
                }
                return;
            default:
                defpackage.ld ldVar2 = ld0Var.WDYagTQQm9ns;
                l1Var.e6mdH7fiFuta(ldVar2.JhCgjQRTAOCT());
                android.graphics.Canvas ZpBGe2uQfcn82 = defpackage.a.ZpBGe2uQfcn8(ldVar2.oh71FJcDz6S2.oh71FJcDz6S2());
                l1Var.JhCgjQRTAOCT.getValue();
                if (defpackage.ae1.fWTAfUmVKrZq(ldVar2.JhCgjQRTAOCT())) {
                    ld0Var.ZpBGe2uQfcn8();
                    return;
                }
                if (!ZpBGe2uQfcn82.isHardwareAccelerated()) {
                    android.widget.EdgeEffect edgeEffect = rtVar.JhCgjQRTAOCT;
                    if (edgeEffect != null) {
                        edgeEffect.finish();
                    }
                    android.widget.EdgeEffect edgeEffect2 = rtVar.WDYagTQQm9ns;
                    if (edgeEffect2 != null) {
                        edgeEffect2.finish();
                    }
                    android.widget.EdgeEffect edgeEffect3 = rtVar.oh71FJcDz6S2;
                    if (edgeEffect3 != null) {
                        edgeEffect3.finish();
                    }
                    android.widget.EdgeEffect edgeEffect4 = rtVar.QiMR8OkAhezm;
                    if (edgeEffect4 != null) {
                        edgeEffect4.finish();
                    }
                    android.widget.EdgeEffect edgeEffect5 = rtVar.P05cfTpS5W5L;
                    if (edgeEffect5 != null) {
                        edgeEffect5.finish();
                    }
                    android.widget.EdgeEffect edgeEffect6 = rtVar.e6mdH7fiFuta;
                    if (edgeEffect6 != null) {
                        edgeEffect6.finish();
                    }
                    android.widget.EdgeEffect edgeEffect7 = rtVar.GE9mJIPrb8gP;
                    if (edgeEffect7 != null) {
                        edgeEffect7.finish();
                    }
                    android.widget.EdgeEffect edgeEffect8 = rtVar.Ns0WNyEWdPsk;
                    if (edgeEffect8 != null) {
                        edgeEffect8.finish();
                    }
                    ld0Var.ZpBGe2uQfcn8();
                    return;
                }
                float dG7RjM6DqYVL = ld0Var.dG7RjM6DqYVL(30.0f);
                boolean z4 = defpackage.rt.oh71FJcDz6S2(rtVar.JhCgjQRTAOCT) || defpackage.rt.QiMR8OkAhezm(rtVar.P05cfTpS5W5L) || defpackage.rt.oh71FJcDz6S2(rtVar.WDYagTQQm9ns) || defpackage.rt.QiMR8OkAhezm(rtVar.e6mdH7fiFuta);
                boolean z5 = defpackage.rt.oh71FJcDz6S2(rtVar.oh71FJcDz6S2) || defpackage.rt.QiMR8OkAhezm(rtVar.GE9mJIPrb8gP) || defpackage.rt.oh71FJcDz6S2(rtVar.QiMR8OkAhezm) || defpackage.rt.QiMR8OkAhezm(rtVar.Ns0WNyEWdPsk);
                if (z4 && z5) {
                    j = 4294967295L;
                    c = ' ';
                    iYH9ueRbBBFm().setPosition(0, 0, ZpBGe2uQfcn82.getWidth(), ZpBGe2uQfcn82.getHeight());
                } else {
                    j = 4294967295L;
                    c = ' ';
                    if (z4) {
                        iYH9ueRbBBFm().setPosition(0, 0, (defpackage.ok0.CZa7MwI9IzLd(dG7RjM6DqYVL) * 2) + ZpBGe2uQfcn82.getWidth(), ZpBGe2uQfcn82.getHeight());
                    } else {
                        if (!z5) {
                            ld0Var.ZpBGe2uQfcn8();
                            return;
                        }
                        iYH9ueRbBBFm().setPosition(0, 0, ZpBGe2uQfcn82.getWidth(), (defpackage.ok0.CZa7MwI9IzLd(dG7RjM6DqYVL) * 2) + ZpBGe2uQfcn82.getHeight());
                    }
                }
                beginRecording = iYH9ueRbBBFm().beginRecording();
                boolean QiMR8OkAhezm = defpackage.rt.QiMR8OkAhezm(rtVar.GE9mJIPrb8gP);
                defpackage.fv0 fv0Var = defpackage.fv0.oh71FJcDz6S2;
                if (QiMR8OkAhezm) {
                    android.widget.EdgeEffect edgeEffect9 = rtVar.GE9mJIPrb8gP;
                    if (edgeEffect9 == null) {
                        edgeEffect9 = rtVar.ZpBGe2uQfcn8(fv0Var);
                        rtVar.GE9mJIPrb8gP = edgeEffect9;
                    }
                    jVUAPb5NnIYW(90.0f, edgeEffect9, beginRecording);
                    edgeEffect9.finish();
                }
                if (defpackage.rt.oh71FJcDz6S2(rtVar.oh71FJcDz6S2)) {
                    android.widget.EdgeEffect fWTAfUmVKrZq = rtVar.fWTAfUmVKrZq();
                    z3 = jVUAPb5NnIYW(270.0f, fWTAfUmVKrZq, beginRecording);
                    if (defpackage.rt.QiMR8OkAhezm(rtVar.oh71FJcDz6S2)) {
                        z2 = z5;
                        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (l1Var.fWTAfUmVKrZq() & j));
                        android.widget.EdgeEffect edgeEffect10 = rtVar.GE9mJIPrb8gP;
                        if (edgeEffect10 == null) {
                            edgeEffect10 = rtVar.ZpBGe2uQfcn8(fv0Var);
                            rtVar.GE9mJIPrb8gP = edgeEffect10;
                        }
                        int i2 = android.os.Build.VERSION.SDK_INT;
                        float fWTAfUmVKrZq2 = i2 >= 31 ? defpackage.s6.fWTAfUmVKrZq(fWTAfUmVKrZq) : 0.0f;
                        float f3 = 1.0f - intBitsToFloat;
                        if (i2 >= 31) {
                            defpackage.s6.JhCgjQRTAOCT(edgeEffect10, fWTAfUmVKrZq2, f3);
                        } else {
                            edgeEffect10.onPull(fWTAfUmVKrZq2, f3);
                        }
                    } else {
                        z2 = z5;
                    }
                } else {
                    z2 = z5;
                    z3 = false;
                }
                boolean QiMR8OkAhezm2 = defpackage.rt.QiMR8OkAhezm(rtVar.P05cfTpS5W5L);
                defpackage.fv0 fv0Var2 = defpackage.fv0.WDYagTQQm9ns;
                if (QiMR8OkAhezm2) {
                    android.widget.EdgeEffect edgeEffect11 = rtVar.P05cfTpS5W5L;
                    if (edgeEffect11 == null) {
                        edgeEffect11 = rtVar.ZpBGe2uQfcn8(fv0Var2);
                        rtVar.P05cfTpS5W5L = edgeEffect11;
                    }
                    jVUAPb5NnIYW(180.0f, edgeEffect11, beginRecording);
                    edgeEffect11.finish();
                }
                if (defpackage.rt.oh71FJcDz6S2(rtVar.JhCgjQRTAOCT)) {
                    android.widget.EdgeEffect WDYagTQQm9ns = rtVar.WDYagTQQm9ns();
                    z3 = jVUAPb5NnIYW(0.0f, WDYagTQQm9ns, beginRecording) || z3;
                    if (defpackage.rt.QiMR8OkAhezm(rtVar.JhCgjQRTAOCT)) {
                        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (l1Var.fWTAfUmVKrZq() >> c));
                        android.widget.EdgeEffect edgeEffect12 = rtVar.P05cfTpS5W5L;
                        if (edgeEffect12 == null) {
                            edgeEffect12 = rtVar.ZpBGe2uQfcn8(fv0Var2);
                            rtVar.P05cfTpS5W5L = edgeEffect12;
                        }
                        int i3 = android.os.Build.VERSION.SDK_INT;
                        float fWTAfUmVKrZq3 = i3 >= 31 ? defpackage.s6.fWTAfUmVKrZq(WDYagTQQm9ns) : 0.0f;
                        if (i3 >= 31) {
                            defpackage.s6.JhCgjQRTAOCT(edgeEffect12, fWTAfUmVKrZq3, intBitsToFloat2);
                        } else {
                            edgeEffect12.onPull(fWTAfUmVKrZq3, intBitsToFloat2);
                        }
                    }
                }
                if (defpackage.rt.QiMR8OkAhezm(rtVar.Ns0WNyEWdPsk)) {
                    android.widget.EdgeEffect edgeEffect13 = rtVar.Ns0WNyEWdPsk;
                    if (edgeEffect13 == null) {
                        edgeEffect13 = rtVar.ZpBGe2uQfcn8(fv0Var);
                        rtVar.Ns0WNyEWdPsk = edgeEffect13;
                    }
                    jVUAPb5NnIYW(270.0f, edgeEffect13, beginRecording);
                    edgeEffect13.finish();
                }
                if (defpackage.rt.oh71FJcDz6S2(rtVar.QiMR8OkAhezm)) {
                    android.widget.EdgeEffect JhCgjQRTAOCT = rtVar.JhCgjQRTAOCT();
                    z3 = jVUAPb5NnIYW(90.0f, JhCgjQRTAOCT, beginRecording) || z3;
                    if (defpackage.rt.QiMR8OkAhezm(rtVar.QiMR8OkAhezm)) {
                        float intBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (l1Var.fWTAfUmVKrZq() & j));
                        android.widget.EdgeEffect edgeEffect14 = rtVar.Ns0WNyEWdPsk;
                        if (edgeEffect14 == null) {
                            edgeEffect14 = rtVar.ZpBGe2uQfcn8(fv0Var);
                            rtVar.Ns0WNyEWdPsk = edgeEffect14;
                        }
                        int i4 = android.os.Build.VERSION.SDK_INT;
                        float fWTAfUmVKrZq4 = i4 >= 31 ? defpackage.s6.fWTAfUmVKrZq(JhCgjQRTAOCT) : 0.0f;
                        if (i4 >= 31) {
                            defpackage.s6.JhCgjQRTAOCT(edgeEffect14, fWTAfUmVKrZq4, intBitsToFloat3);
                        } else {
                            edgeEffect14.onPull(fWTAfUmVKrZq4, intBitsToFloat3);
                        }
                    }
                }
                if (defpackage.rt.QiMR8OkAhezm(rtVar.e6mdH7fiFuta)) {
                    android.widget.EdgeEffect edgeEffect15 = rtVar.e6mdH7fiFuta;
                    if (edgeEffect15 == null) {
                        edgeEffect15 = rtVar.ZpBGe2uQfcn8(fv0Var2);
                        rtVar.e6mdH7fiFuta = edgeEffect15;
                    }
                    jVUAPb5NnIYW(0.0f, edgeEffect15, beginRecording);
                    edgeEffect15.finish();
                }
                if (defpackage.rt.oh71FJcDz6S2(rtVar.WDYagTQQm9ns)) {
                    android.widget.EdgeEffect giKS3J6vZuNy2 = rtVar.giKS3J6vZuNy();
                    boolean z6 = jVUAPb5NnIYW(180.0f, giKS3J6vZuNy2, beginRecording) || z3;
                    if (defpackage.rt.QiMR8OkAhezm(rtVar.WDYagTQQm9ns)) {
                        float intBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (l1Var.fWTAfUmVKrZq() >> c));
                        android.widget.EdgeEffect edgeEffect16 = rtVar.e6mdH7fiFuta;
                        if (edgeEffect16 == null) {
                            edgeEffect16 = rtVar.ZpBGe2uQfcn8(fv0Var2);
                            rtVar.e6mdH7fiFuta = edgeEffect16;
                        }
                        int i5 = android.os.Build.VERSION.SDK_INT;
                        float fWTAfUmVKrZq5 = i5 >= 31 ? defpackage.s6.fWTAfUmVKrZq(giKS3J6vZuNy2) : 0.0f;
                        float f4 = 1.0f - intBitsToFloat4;
                        if (i5 >= 31) {
                            defpackage.s6.JhCgjQRTAOCT(edgeEffect16, fWTAfUmVKrZq5, f4);
                        } else {
                            edgeEffect16.onPull(fWTAfUmVKrZq5, f4);
                        }
                    }
                    z3 = z6;
                }
                if (z3) {
                    l1Var.JhCgjQRTAOCT();
                }
                float f5 = z2 ? 0.0f : dG7RjM6DqYVL;
                float f6 = z4 ? 0.0f : dG7RjM6DqYVL;
                defpackage.sc0 layoutDirection = ld0Var.getLayoutDirection();
                defpackage.DR1ov5IJDbR8 dR1ov5IJDbR8 = new defpackage.DR1ov5IJDbR8();
                dR1ov5IJDbR8.ZpBGe2uQfcn8 = beginRecording;
                long JhCgjQRTAOCT2 = ldVar2.JhCgjQRTAOCT();
                defpackage.a7 a7Var = ldVar2.oh71FJcDz6S2;
                defpackage.kd kdVar = ((defpackage.ld) a7Var.JhCgjQRTAOCT).WDYagTQQm9ns;
                defpackage.hp hpVar = kdVar.ZpBGe2uQfcn8;
                defpackage.sc0 sc0Var = kdVar.giKS3J6vZuNy;
                defpackage.id oh71FJcDz6S2 = a7Var.oh71FJcDz6S2();
                long Ns0WNyEWdPsk = ldVar2.oh71FJcDz6S2.Ns0WNyEWdPsk();
                defpackage.a7 a7Var2 = ldVar2.oh71FJcDz6S2;
                defpackage.b40 b40Var = (defpackage.b40) a7Var2.fWTAfUmVKrZq;
                a7Var2.w7APNrr0aGRc(ld0Var);
                a7Var2.maCixPsq4ml2(layoutDirection);
                a7Var2.ZVVdXbWmyCSK(dR1ov5IJDbR8);
                a7Var2.IJ0hOnjhPOri(JhCgjQRTAOCT2);
                a7Var2.fWTAfUmVKrZq = null;
                dR1ov5IJDbR8.fNwYGHIYeJcR();
                try {
                    ((defpackage.k0) ldVar2.oh71FJcDz6S2.giKS3J6vZuNy).OcTWLQzke1i2(f5, f6);
                    try {
                        ld0Var.ZpBGe2uQfcn8();
                        dR1ov5IJDbR8.e6mdH7fiFuta();
                        defpackage.a7 a7Var3 = ldVar2.oh71FJcDz6S2;
                        a7Var3.w7APNrr0aGRc(hpVar);
                        a7Var3.maCixPsq4ml2(sc0Var);
                        a7Var3.ZVVdXbWmyCSK(oh71FJcDz6S2);
                        a7Var3.IJ0hOnjhPOri(Ns0WNyEWdPsk);
                        a7Var3.fWTAfUmVKrZq = b40Var;
                        iYH9ueRbBBFm().endRecording();
                        int save = ZpBGe2uQfcn82.save();
                        ZpBGe2uQfcn82.translate(f, f2);
                        ZpBGe2uQfcn82.drawRenderNode(iYH9ueRbBBFm());
                        ZpBGe2uQfcn82.restoreToCount(save);
                        return;
                    } finally {
                        ((defpackage.k0) ldVar2.oh71FJcDz6S2.giKS3J6vZuNy).OcTWLQzke1i2(-f5, -f6);
                    }
                } catch (java.lang.Throwable th) {
                    dR1ov5IJDbR8.e6mdH7fiFuta();
                    defpackage.a7 a7Var4 = ldVar2.oh71FJcDz6S2;
                    a7Var4.w7APNrr0aGRc(hpVar);
                    a7Var4.maCixPsq4ml2(sc0Var);
                    a7Var4.ZVVdXbWmyCSK(oh71FJcDz6S2);
                    a7Var4.IJ0hOnjhPOri(Ns0WNyEWdPsk);
                    a7Var4.fWTAfUmVKrZq = b40Var;
                    throw th;
                }
        }
    }

    public x30(defpackage.si1 si1Var, defpackage.l1 l1Var, defpackage.rt rtVar) {
        this.maCixPsq4ml2 = l1Var;
        this.IJ0hOnjhPOri = rtVar;
        YZh1E3mnTFwf(si1Var);
    }
}
