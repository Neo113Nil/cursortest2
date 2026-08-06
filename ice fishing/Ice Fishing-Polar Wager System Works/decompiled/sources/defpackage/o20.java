package defpackage;

/* loaded from: classes.dex */
public final class o20 extends defpackage.ln implements defpackage.wr {
    public final defpackage.gs PAEGRtP0bX;
    public final defpackage.e2 V7bD7b8KA;
    public java.lang.Object abhbClRa;
    public final /* synthetic */ int kNAkVymC = 1;

    public o20(defpackage.ge1 ge1Var, defpackage.e2 e2Var, defpackage.gs gsVar, defpackage.at0 at0Var) {
        this.V7bD7b8KA = e2Var;
        this.PAEGRtP0bX = gsVar;
        this.abhbClRa = at0Var;
        UVjEelCZ(ge1Var);
    }

    public static boolean WnQbjbWuMR(float f, android.widget.EdgeEffect edgeEffect, android.graphics.Canvas canvas) {
        if (f == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int save = canvas.save();
        canvas.rotate(f);
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public static boolean uLnPvzwk(float f, long j, android.widget.EdgeEffect edgeEffect, android.graphics.Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(f);
        canvas.translate(java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    @Override // defpackage.wr
    public final void D2vUnMij(defpackage.oa0 oa0Var) {
        boolean z;
        long j;
        char c;
        android.graphics.RecordingCanvas beginRecording;
        boolean z2;
        boolean z3;
        float f;
        float f2;
        int i = this.kNAkVymC;
        defpackage.e2 e2Var = this.V7bD7b8KA;
        defpackage.gs gsVar = this.PAEGRtP0bX;
        switch (i) {
            case 0:
                defpackage.at0 at0Var = (defpackage.at0) this.abhbClRa;
                defpackage.jb jbVar = oa0Var.adDC3e2L;
                e2Var.riuEU0zW4(jbVar.r1MBDhnF());
                if (defpackage.z91.r1MBDhnF(jbVar.r1MBDhnF())) {
                    oa0Var.IHQe1A4L2xu();
                    return;
                }
                oa0Var.IHQe1A4L2xu();
                e2Var.F7NU4MC0GW.getValue();
                android.graphics.Canvas IHQe1A4L2xu = defpackage.d0.IHQe1A4L2xu(jbVar.xiZrDbcSW0.xiZrDbcSW0());
                if (defpackage.gs.xiZrDbcSW0(gsVar.xiZrDbcSW0)) {
                    z = uLnPvzwk(270.0f, (java.lang.Float.floatToRawIntBits(-java.lang.Float.intBitsToFloat((int) (jbVar.r1MBDhnF() & 4294967295L))) << 32) | (java.lang.Float.floatToRawIntBits(oa0Var.EgCjBq0SZwJ(at0Var.IHQe1A4L2xu(oa0Var.getLayoutDirection()))) & 4294967295L), gsVar.r1MBDhnF(), IHQe1A4L2xu);
                } else {
                    z = false;
                }
                if (defpackage.gs.xiZrDbcSW0(gsVar.F7NU4MC0GW)) {
                    z = uLnPvzwk(0.0f, (((long) java.lang.Float.floatToRawIntBits(0.0f)) << 32) | (((long) java.lang.Float.floatToRawIntBits(oa0Var.EgCjBq0SZwJ(at0Var.F7NU4MC0GW()))) & 4294967295L), gsVar.adDC3e2L(), IHQe1A4L2xu) || z;
                }
                if (defpackage.gs.xiZrDbcSW0(gsVar.AARZUJiTa)) {
                    z = uLnPvzwk(90.0f, (((long) java.lang.Float.floatToRawIntBits(0.0f)) << 32) | (((long) java.lang.Float.floatToRawIntBits(oa0Var.EgCjBq0SZwJ(at0Var.oh6vYeIP(oa0Var.getLayoutDirection())) + (-((float) defpackage.ci0.TFRaUu83X3E(java.lang.Float.intBitsToFloat((int) (jbVar.r1MBDhnF() >> 32))))))) & 4294967295L), gsVar.F7NU4MC0GW(), IHQe1A4L2xu) || z;
                }
                if (defpackage.gs.xiZrDbcSW0(gsVar.adDC3e2L)) {
                    android.widget.EdgeEffect oh6vYeIP = gsVar.oh6vYeIP();
                    z = uLnPvzwk(180.0f, (((long) java.lang.Float.floatToRawIntBits(-java.lang.Float.intBitsToFloat((int) (jbVar.r1MBDhnF() >> 32)))) << 32) | (((long) java.lang.Float.floatToRawIntBits((-java.lang.Float.intBitsToFloat((int) (jbVar.r1MBDhnF() & 4294967295L))) + oa0Var.EgCjBq0SZwJ(at0Var.r1MBDhnF()))) & 4294967295L), oh6vYeIP, IHQe1A4L2xu) || z;
                }
                if (z) {
                    e2Var.F7NU4MC0GW();
                    return;
                }
                return;
            default:
                defpackage.jb jbVar2 = oa0Var.adDC3e2L;
                e2Var.riuEU0zW4(jbVar2.r1MBDhnF());
                android.graphics.Canvas IHQe1A4L2xu2 = defpackage.d0.IHQe1A4L2xu(jbVar2.xiZrDbcSW0.xiZrDbcSW0());
                e2Var.F7NU4MC0GW.getValue();
                if (defpackage.z91.r1MBDhnF(jbVar2.r1MBDhnF())) {
                    oa0Var.IHQe1A4L2xu();
                    return;
                }
                if (!IHQe1A4L2xu2.isHardwareAccelerated()) {
                    android.widget.EdgeEffect edgeEffect = gsVar.F7NU4MC0GW;
                    if (edgeEffect != null) {
                        edgeEffect.finish();
                    }
                    android.widget.EdgeEffect edgeEffect2 = gsVar.adDC3e2L;
                    if (edgeEffect2 != null) {
                        edgeEffect2.finish();
                    }
                    android.widget.EdgeEffect edgeEffect3 = gsVar.xiZrDbcSW0;
                    if (edgeEffect3 != null) {
                        edgeEffect3.finish();
                    }
                    android.widget.EdgeEffect edgeEffect4 = gsVar.AARZUJiTa;
                    if (edgeEffect4 != null) {
                        edgeEffect4.finish();
                    }
                    android.widget.EdgeEffect edgeEffect5 = gsVar.EXtogiMhuM;
                    if (edgeEffect5 != null) {
                        edgeEffect5.finish();
                    }
                    android.widget.EdgeEffect edgeEffect6 = gsVar.riuEU0zW4;
                    if (edgeEffect6 != null) {
                        edgeEffect6.finish();
                    }
                    android.widget.EdgeEffect edgeEffect7 = gsVar.SH1y5HwkJhh;
                    if (edgeEffect7 != null) {
                        edgeEffect7.finish();
                    }
                    android.widget.EdgeEffect edgeEffect8 = gsVar.ez2rX8ReCYw;
                    if (edgeEffect8 != null) {
                        edgeEffect8.finish();
                    }
                    oa0Var.IHQe1A4L2xu();
                    return;
                }
                float EgCjBq0SZwJ = oa0Var.EgCjBq0SZwJ(30.0f);
                boolean z4 = defpackage.gs.xiZrDbcSW0(gsVar.F7NU4MC0GW) || defpackage.gs.AARZUJiTa(gsVar.EXtogiMhuM) || defpackage.gs.xiZrDbcSW0(gsVar.adDC3e2L) || defpackage.gs.AARZUJiTa(gsVar.riuEU0zW4);
                boolean z5 = defpackage.gs.xiZrDbcSW0(gsVar.xiZrDbcSW0) || defpackage.gs.AARZUJiTa(gsVar.SH1y5HwkJhh) || defpackage.gs.xiZrDbcSW0(gsVar.AARZUJiTa) || defpackage.gs.AARZUJiTa(gsVar.ez2rX8ReCYw);
                if (z4 && z5) {
                    j = 4294967295L;
                    c = ' ';
                    fzubgBFo().setPosition(0, 0, IHQe1A4L2xu2.getWidth(), IHQe1A4L2xu2.getHeight());
                } else {
                    j = 4294967295L;
                    c = ' ';
                    if (z4) {
                        fzubgBFo().setPosition(0, 0, (defpackage.ci0.TFRaUu83X3E(EgCjBq0SZwJ) * 2) + IHQe1A4L2xu2.getWidth(), IHQe1A4L2xu2.getHeight());
                    } else {
                        if (!z5) {
                            oa0Var.IHQe1A4L2xu();
                            return;
                        }
                        fzubgBFo().setPosition(0, 0, IHQe1A4L2xu2.getWidth(), (defpackage.ci0.TFRaUu83X3E(EgCjBq0SZwJ) * 2) + IHQe1A4L2xu2.getHeight());
                    }
                }
                beginRecording = fzubgBFo().beginRecording();
                boolean AARZUJiTa = defpackage.gs.AARZUJiTa(gsVar.SH1y5HwkJhh);
                defpackage.ks0 ks0Var = defpackage.ks0.xiZrDbcSW0;
                if (AARZUJiTa) {
                    android.widget.EdgeEffect edgeEffect9 = gsVar.SH1y5HwkJhh;
                    if (edgeEffect9 == null) {
                        edgeEffect9 = gsVar.IHQe1A4L2xu(ks0Var);
                        gsVar.SH1y5HwkJhh = edgeEffect9;
                    }
                    WnQbjbWuMR(90.0f, edgeEffect9, beginRecording);
                    edgeEffect9.finish();
                }
                if (defpackage.gs.xiZrDbcSW0(gsVar.xiZrDbcSW0)) {
                    android.widget.EdgeEffect r1MBDhnF = gsVar.r1MBDhnF();
                    z3 = WnQbjbWuMR(270.0f, r1MBDhnF, beginRecording);
                    if (defpackage.gs.AARZUJiTa(gsVar.xiZrDbcSW0)) {
                        z2 = z5;
                        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (e2Var.r1MBDhnF() & j));
                        android.widget.EdgeEffect edgeEffect10 = gsVar.SH1y5HwkJhh;
                        if (edgeEffect10 == null) {
                            edgeEffect10 = gsVar.IHQe1A4L2xu(ks0Var);
                            gsVar.SH1y5HwkJhh = edgeEffect10;
                        }
                        int i2 = android.os.Build.VERSION.SDK_INT;
                        float r1MBDhnF2 = i2 >= 31 ? defpackage.t5.r1MBDhnF(r1MBDhnF) : 0.0f;
                        float f3 = 1.0f - intBitsToFloat;
                        if (i2 >= 31) {
                            defpackage.t5.F7NU4MC0GW(edgeEffect10, r1MBDhnF2, f3);
                        } else {
                            edgeEffect10.onPull(r1MBDhnF2, f3);
                        }
                    } else {
                        z2 = z5;
                    }
                } else {
                    z2 = z5;
                    z3 = false;
                }
                boolean AARZUJiTa2 = defpackage.gs.AARZUJiTa(gsVar.EXtogiMhuM);
                defpackage.ks0 ks0Var2 = defpackage.ks0.adDC3e2L;
                if (AARZUJiTa2) {
                    android.widget.EdgeEffect edgeEffect11 = gsVar.EXtogiMhuM;
                    if (edgeEffect11 == null) {
                        edgeEffect11 = gsVar.IHQe1A4L2xu(ks0Var2);
                        gsVar.EXtogiMhuM = edgeEffect11;
                    }
                    WnQbjbWuMR(180.0f, edgeEffect11, beginRecording);
                    edgeEffect11.finish();
                }
                if (defpackage.gs.xiZrDbcSW0(gsVar.F7NU4MC0GW)) {
                    android.widget.EdgeEffect adDC3e2L = gsVar.adDC3e2L();
                    z3 = WnQbjbWuMR(0.0f, adDC3e2L, beginRecording) || z3;
                    if (defpackage.gs.AARZUJiTa(gsVar.F7NU4MC0GW)) {
                        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (e2Var.r1MBDhnF() >> c));
                        android.widget.EdgeEffect edgeEffect12 = gsVar.EXtogiMhuM;
                        if (edgeEffect12 == null) {
                            edgeEffect12 = gsVar.IHQe1A4L2xu(ks0Var2);
                            gsVar.EXtogiMhuM = edgeEffect12;
                        }
                        int i3 = android.os.Build.VERSION.SDK_INT;
                        float r1MBDhnF3 = i3 >= 31 ? defpackage.t5.r1MBDhnF(adDC3e2L) : 0.0f;
                        if (i3 >= 31) {
                            defpackage.t5.F7NU4MC0GW(edgeEffect12, r1MBDhnF3, intBitsToFloat2);
                        } else {
                            edgeEffect12.onPull(r1MBDhnF3, intBitsToFloat2);
                        }
                    }
                }
                if (defpackage.gs.AARZUJiTa(gsVar.ez2rX8ReCYw)) {
                    android.widget.EdgeEffect edgeEffect13 = gsVar.ez2rX8ReCYw;
                    if (edgeEffect13 == null) {
                        edgeEffect13 = gsVar.IHQe1A4L2xu(ks0Var);
                        gsVar.ez2rX8ReCYw = edgeEffect13;
                    }
                    WnQbjbWuMR(270.0f, edgeEffect13, beginRecording);
                    edgeEffect13.finish();
                }
                if (defpackage.gs.xiZrDbcSW0(gsVar.AARZUJiTa)) {
                    android.widget.EdgeEffect F7NU4MC0GW = gsVar.F7NU4MC0GW();
                    z3 = WnQbjbWuMR(90.0f, F7NU4MC0GW, beginRecording) || z3;
                    if (defpackage.gs.AARZUJiTa(gsVar.AARZUJiTa)) {
                        float intBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (e2Var.r1MBDhnF() & j));
                        android.widget.EdgeEffect edgeEffect14 = gsVar.ez2rX8ReCYw;
                        if (edgeEffect14 == null) {
                            edgeEffect14 = gsVar.IHQe1A4L2xu(ks0Var);
                            gsVar.ez2rX8ReCYw = edgeEffect14;
                        }
                        int i4 = android.os.Build.VERSION.SDK_INT;
                        float r1MBDhnF4 = i4 >= 31 ? defpackage.t5.r1MBDhnF(F7NU4MC0GW) : 0.0f;
                        if (i4 >= 31) {
                            defpackage.t5.F7NU4MC0GW(edgeEffect14, r1MBDhnF4, intBitsToFloat3);
                        } else {
                            edgeEffect14.onPull(r1MBDhnF4, intBitsToFloat3);
                        }
                    }
                }
                if (defpackage.gs.AARZUJiTa(gsVar.riuEU0zW4)) {
                    android.widget.EdgeEffect edgeEffect15 = gsVar.riuEU0zW4;
                    if (edgeEffect15 == null) {
                        edgeEffect15 = gsVar.IHQe1A4L2xu(ks0Var2);
                        gsVar.riuEU0zW4 = edgeEffect15;
                    }
                    WnQbjbWuMR(0.0f, edgeEffect15, beginRecording);
                    edgeEffect15.finish();
                }
                if (defpackage.gs.xiZrDbcSW0(gsVar.adDC3e2L)) {
                    android.widget.EdgeEffect oh6vYeIP2 = gsVar.oh6vYeIP();
                    boolean z6 = WnQbjbWuMR(180.0f, oh6vYeIP2, beginRecording) || z3;
                    if (defpackage.gs.AARZUJiTa(gsVar.adDC3e2L)) {
                        float intBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (e2Var.r1MBDhnF() >> c));
                        android.widget.EdgeEffect edgeEffect16 = gsVar.riuEU0zW4;
                        if (edgeEffect16 == null) {
                            edgeEffect16 = gsVar.IHQe1A4L2xu(ks0Var2);
                            gsVar.riuEU0zW4 = edgeEffect16;
                        }
                        int i5 = android.os.Build.VERSION.SDK_INT;
                        float r1MBDhnF5 = i5 >= 31 ? defpackage.t5.r1MBDhnF(oh6vYeIP2) : 0.0f;
                        float f4 = 1.0f - intBitsToFloat4;
                        if (i5 >= 31) {
                            defpackage.t5.F7NU4MC0GW(edgeEffect16, r1MBDhnF5, f4);
                        } else {
                            edgeEffect16.onPull(r1MBDhnF5, f4);
                        }
                    }
                    z3 = z6;
                }
                if (z3) {
                    e2Var.F7NU4MC0GW();
                }
                float f5 = z2 ? 0.0f : EgCjBq0SZwJ;
                float f6 = z4 ? 0.0f : EgCjBq0SZwJ;
                defpackage.w90 layoutDirection = oa0Var.getLayoutDirection();
                defpackage.c0 c0Var = new defpackage.c0();
                c0Var.IHQe1A4L2xu = beginRecording;
                long r1MBDhnF6 = jbVar2.r1MBDhnF();
                defpackage.v5 v5Var = jbVar2.xiZrDbcSW0;
                defpackage.ib ibVar = ((defpackage.jb) v5Var.F7NU4MC0GW).adDC3e2L;
                defpackage.qn qnVar = ibVar.IHQe1A4L2xu;
                defpackage.w90 w90Var = ibVar.oh6vYeIP;
                defpackage.hb xiZrDbcSW0 = v5Var.xiZrDbcSW0();
                long riuEU0zW4 = jbVar2.xiZrDbcSW0.riuEU0zW4();
                defpackage.v5 v5Var2 = jbVar2.xiZrDbcSW0;
                defpackage.q20 q20Var = (defpackage.q20) v5Var2.r1MBDhnF;
                v5Var2.G3OKOH3wZRC(oa0Var);
                v5Var2.kd6TUFXn(layoutDirection);
                v5Var2.QoRHpC4k(c0Var);
                v5Var2.EgCjBq0SZwJ(r1MBDhnF6);
                v5Var2.r1MBDhnF = null;
                c0Var.riuEU0zW4();
                try {
                    ((defpackage.c1NqjJifC7) jbVar2.xiZrDbcSW0.oh6vYeIP).SyNS6RMn(f5, f6);
                    try {
                        oa0Var.IHQe1A4L2xu();
                        c0Var.AARZUJiTa();
                        defpackage.v5 v5Var3 = jbVar2.xiZrDbcSW0;
                        v5Var3.G3OKOH3wZRC(qnVar);
                        v5Var3.kd6TUFXn(w90Var);
                        v5Var3.QoRHpC4k(xiZrDbcSW0);
                        v5Var3.EgCjBq0SZwJ(riuEU0zW4);
                        v5Var3.r1MBDhnF = q20Var;
                        fzubgBFo().endRecording();
                        int save = IHQe1A4L2xu2.save();
                        IHQe1A4L2xu2.translate(f, f2);
                        IHQe1A4L2xu2.drawRenderNode(fzubgBFo());
                        IHQe1A4L2xu2.restoreToCount(save);
                        return;
                    } finally {
                        ((defpackage.c1NqjJifC7) jbVar2.xiZrDbcSW0.oh6vYeIP).SyNS6RMn(-f5, -f6);
                    }
                } catch (java.lang.Throwable th) {
                    c0Var.AARZUJiTa();
                    defpackage.v5 v5Var4 = jbVar2.xiZrDbcSW0;
                    v5Var4.G3OKOH3wZRC(qnVar);
                    v5Var4.kd6TUFXn(w90Var);
                    v5Var4.QoRHpC4k(xiZrDbcSW0);
                    v5Var4.EgCjBq0SZwJ(riuEU0zW4);
                    v5Var4.r1MBDhnF = q20Var;
                    throw th;
                }
        }
    }

    public android.graphics.RenderNode fzubgBFo() {
        android.graphics.RenderNode renderNode = (android.graphics.RenderNode) this.abhbClRa;
        if (renderNode != null) {
            return renderNode;
        }
        android.graphics.RenderNode xiZrDbcSW0 = defpackage.uj0.xiZrDbcSW0();
        this.abhbClRa = xiZrDbcSW0;
        return xiZrDbcSW0;
    }

    public o20(defpackage.ge1 ge1Var, defpackage.e2 e2Var, defpackage.gs gsVar) {
        this.V7bD7b8KA = e2Var;
        this.PAEGRtP0bX = gsVar;
        UVjEelCZ(ge1Var);
    }
}
