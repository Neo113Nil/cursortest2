package defpackage;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class my extends yk implements go {
    public Object WdrkLMV3xh;
    public final /* synthetic */ int Y6hRI1cF8 = 1;
    public final m0 cilMamHF;
    public final ro lv06NcmrQ;

    public my(h71 h71Var, m0 m0Var, ro roVar, nn0 nn0Var) {
        this.cilMamHF = m0Var;
        this.lv06NcmrQ = roVar;
        this.WdrkLMV3xh = nn0Var;
        gqMuANyCes(h71Var);
    }

    public static boolean Hc2GqxcqBiX(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int save = canvas.save();
        canvas.rotate(f);
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public static boolean OGdJP42E(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    @Override // defpackage.go
    public final void DmJncFq5(i60 i60Var) {
        boolean z;
        long j;
        char c;
        RecordingCanvas beginRecording;
        boolean z2;
        boolean z3;
        float f;
        float f2;
        int i = this.Y6hRI1cF8;
        m0 m0Var = this.cilMamHF;
        ro roVar = this.lv06NcmrQ;
        switch (i) {
            case 0:
                nn0 nn0Var = (nn0) this.WdrkLMV3xh;
                u9 u9Var = i60Var.OOA6hdeuvCS;
                m0Var.mOu10nynGul(u9Var.xqGvceK5x());
                if (t21.X1lG3V04pd(u9Var.xqGvceK5x())) {
                    i60Var.GWasM1elztuh();
                    return;
                }
                i60Var.GWasM1elztuh();
                m0Var.xqGvceK5x.getValue();
                Canvas GWasM1elztuh = ddkiCTz5mZ.GWasM1elztuh(u9Var.EljAMC1QTz.EljAMC1QTz());
                boolean EljAMC1QTz = ro.EljAMC1QTz(roVar.EljAMC1QTz);
                p50 p50Var = p50.OOA6hdeuvCS;
                if (EljAMC1QTz) {
                    EdgeEffect X1lG3V04pd = roVar.X1lG3V04pd();
                    float f3 = -Float.intBitsToFloat((int) (u9Var.xqGvceK5x() & 4294967295L));
                    z = OGdJP42E(270.0f, (Float.floatToRawIntBits(i60Var.jivtDDk9H(i60Var.getLayoutDirection() == p50Var ? nn0Var.GWasM1elztuh : nn0Var.X1lG3V04pd)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32), X1lG3V04pd, GWasM1elztuh);
                } else {
                    z = false;
                }
                if (ro.EljAMC1QTz(roVar.xqGvceK5x)) {
                    z = OGdJP42E(0.0f, (((long) Float.floatToRawIntBits(i60Var.jivtDDk9H(nn0Var.Yi7zF1RB1))) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32), roVar.OOA6hdeuvCS(), GWasM1elztuh) || z;
                }
                if (ro.EljAMC1QTz(roVar.AvO7iQsrTN)) {
                    z = OGdJP42E(90.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(i60Var.jivtDDk9H(i60Var.getLayoutDirection() == p50Var ? nn0Var.X1lG3V04pd : nn0Var.GWasM1elztuh) + (-((float) vc0.MZhzXH72(Float.intBitsToFloat((int) (u9Var.xqGvceK5x() >> 32))))))) & 4294967295L), roVar.xqGvceK5x(), GWasM1elztuh) || z;
                }
                if (ro.EljAMC1QTz(roVar.OOA6hdeuvCS)) {
                    EdgeEffect Yi7zF1RB1 = roVar.Yi7zF1RB1();
                    z = OGdJP42E(180.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (u9Var.xqGvceK5x() >> 32)))) << 32) | (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (u9Var.xqGvceK5x() & 4294967295L))) + i60Var.jivtDDk9H(nn0Var.xqGvceK5x))) & 4294967295L), Yi7zF1RB1, GWasM1elztuh) || z;
                }
                if (z) {
                    m0Var.xqGvceK5x();
                    return;
                }
                return;
            default:
                u9 u9Var2 = i60Var.OOA6hdeuvCS;
                m0Var.mOu10nynGul(u9Var2.xqGvceK5x());
                Canvas GWasM1elztuh2 = ddkiCTz5mZ.GWasM1elztuh(u9Var2.EljAMC1QTz.EljAMC1QTz());
                m0Var.xqGvceK5x.getValue();
                if (t21.X1lG3V04pd(u9Var2.xqGvceK5x())) {
                    i60Var.GWasM1elztuh();
                    return;
                }
                if (!GWasM1elztuh2.isHardwareAccelerated()) {
                    EdgeEffect edgeEffect = roVar.xqGvceK5x;
                    if (edgeEffect != null) {
                        edgeEffect.finish();
                    }
                    EdgeEffect edgeEffect2 = roVar.OOA6hdeuvCS;
                    if (edgeEffect2 != null) {
                        edgeEffect2.finish();
                    }
                    EdgeEffect edgeEffect3 = roVar.EljAMC1QTz;
                    if (edgeEffect3 != null) {
                        edgeEffect3.finish();
                    }
                    EdgeEffect edgeEffect4 = roVar.AvO7iQsrTN;
                    if (edgeEffect4 != null) {
                        edgeEffect4.finish();
                    }
                    EdgeEffect edgeEffect5 = roVar.encWxUiV2;
                    if (edgeEffect5 != null) {
                        edgeEffect5.finish();
                    }
                    EdgeEffect edgeEffect6 = roVar.mOu10nynGul;
                    if (edgeEffect6 != null) {
                        edgeEffect6.finish();
                    }
                    EdgeEffect edgeEffect7 = roVar.JFJ3QoxA;
                    if (edgeEffect7 != null) {
                        edgeEffect7.finish();
                    }
                    EdgeEffect edgeEffect8 = roVar.rQPn8YBR;
                    if (edgeEffect8 != null) {
                        edgeEffect8.finish();
                    }
                    i60Var.GWasM1elztuh();
                    return;
                }
                float jivtDDk9H = i60Var.jivtDDk9H(30.0f);
                boolean z4 = ro.EljAMC1QTz(roVar.xqGvceK5x) || ro.AvO7iQsrTN(roVar.encWxUiV2) || ro.EljAMC1QTz(roVar.OOA6hdeuvCS) || ro.AvO7iQsrTN(roVar.mOu10nynGul);
                boolean z5 = ro.EljAMC1QTz(roVar.EljAMC1QTz) || ro.AvO7iQsrTN(roVar.JFJ3QoxA) || ro.EljAMC1QTz(roVar.AvO7iQsrTN) || ro.AvO7iQsrTN(roVar.rQPn8YBR);
                if (z4 && z5) {
                    j = 4294967295L;
                    c = ' ';
                    bfDgRvRIg().setPosition(0, 0, GWasM1elztuh2.getWidth(), GWasM1elztuh2.getHeight());
                } else {
                    j = 4294967295L;
                    c = ' ';
                    if (z4) {
                        bfDgRvRIg().setPosition(0, 0, (vc0.MZhzXH72(jivtDDk9H) * 2) + GWasM1elztuh2.getWidth(), GWasM1elztuh2.getHeight());
                    } else {
                        if (!z5) {
                            i60Var.GWasM1elztuh();
                            return;
                        }
                        bfDgRvRIg().setPosition(0, 0, GWasM1elztuh2.getWidth(), (vc0.MZhzXH72(jivtDDk9H) * 2) + GWasM1elztuh2.getHeight());
                    }
                }
                beginRecording = bfDgRvRIg().beginRecording();
                boolean AvO7iQsrTN = ro.AvO7iQsrTN(roVar.JFJ3QoxA);
                xm0 xm0Var = xm0.EljAMC1QTz;
                if (AvO7iQsrTN) {
                    EdgeEffect edgeEffect9 = roVar.JFJ3QoxA;
                    if (edgeEffect9 == null) {
                        edgeEffect9 = roVar.GWasM1elztuh(xm0Var);
                        roVar.JFJ3QoxA = edgeEffect9;
                    }
                    Hc2GqxcqBiX(90.0f, edgeEffect9, beginRecording);
                    edgeEffect9.finish();
                }
                if (ro.EljAMC1QTz(roVar.EljAMC1QTz)) {
                    EdgeEffect X1lG3V04pd2 = roVar.X1lG3V04pd();
                    z3 = Hc2GqxcqBiX(270.0f, X1lG3V04pd2, beginRecording);
                    if (ro.AvO7iQsrTN(roVar.EljAMC1QTz)) {
                        z2 = z5;
                        float intBitsToFloat = Float.intBitsToFloat((int) (m0Var.X1lG3V04pd() & j));
                        EdgeEffect edgeEffect10 = roVar.JFJ3QoxA;
                        if (edgeEffect10 == null) {
                            edgeEffect10 = roVar.GWasM1elztuh(xm0Var);
                            roVar.JFJ3QoxA = edgeEffect10;
                        }
                        int i2 = Build.VERSION.SDK_INT;
                        float X1lG3V04pd3 = i2 >= 31 ? d4.X1lG3V04pd(X1lG3V04pd2) : 0.0f;
                        float f4 = 1.0f - intBitsToFloat;
                        if (i2 >= 31) {
                            d4.xqGvceK5x(edgeEffect10, X1lG3V04pd3, f4);
                        } else {
                            edgeEffect10.onPull(X1lG3V04pd3, f4);
                        }
                    } else {
                        z2 = z5;
                    }
                } else {
                    z2 = z5;
                    z3 = false;
                }
                boolean AvO7iQsrTN2 = ro.AvO7iQsrTN(roVar.encWxUiV2);
                xm0 xm0Var2 = xm0.OOA6hdeuvCS;
                if (AvO7iQsrTN2) {
                    EdgeEffect edgeEffect11 = roVar.encWxUiV2;
                    if (edgeEffect11 == null) {
                        edgeEffect11 = roVar.GWasM1elztuh(xm0Var2);
                        roVar.encWxUiV2 = edgeEffect11;
                    }
                    Hc2GqxcqBiX(180.0f, edgeEffect11, beginRecording);
                    edgeEffect11.finish();
                }
                if (ro.EljAMC1QTz(roVar.xqGvceK5x)) {
                    EdgeEffect OOA6hdeuvCS = roVar.OOA6hdeuvCS();
                    z3 = Hc2GqxcqBiX(0.0f, OOA6hdeuvCS, beginRecording) || z3;
                    if (ro.AvO7iQsrTN(roVar.xqGvceK5x)) {
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (m0Var.X1lG3V04pd() >> c));
                        EdgeEffect edgeEffect12 = roVar.encWxUiV2;
                        if (edgeEffect12 == null) {
                            edgeEffect12 = roVar.GWasM1elztuh(xm0Var2);
                            roVar.encWxUiV2 = edgeEffect12;
                        }
                        int i3 = Build.VERSION.SDK_INT;
                        float X1lG3V04pd4 = i3 >= 31 ? d4.X1lG3V04pd(OOA6hdeuvCS) : 0.0f;
                        if (i3 >= 31) {
                            d4.xqGvceK5x(edgeEffect12, X1lG3V04pd4, intBitsToFloat2);
                        } else {
                            edgeEffect12.onPull(X1lG3V04pd4, intBitsToFloat2);
                        }
                    }
                }
                if (ro.AvO7iQsrTN(roVar.rQPn8YBR)) {
                    EdgeEffect edgeEffect13 = roVar.rQPn8YBR;
                    if (edgeEffect13 == null) {
                        edgeEffect13 = roVar.GWasM1elztuh(xm0Var);
                        roVar.rQPn8YBR = edgeEffect13;
                    }
                    Hc2GqxcqBiX(270.0f, edgeEffect13, beginRecording);
                    edgeEffect13.finish();
                }
                if (ro.EljAMC1QTz(roVar.AvO7iQsrTN)) {
                    EdgeEffect xqGvceK5x = roVar.xqGvceK5x();
                    z3 = Hc2GqxcqBiX(90.0f, xqGvceK5x, beginRecording) || z3;
                    if (ro.AvO7iQsrTN(roVar.AvO7iQsrTN)) {
                        float intBitsToFloat3 = Float.intBitsToFloat((int) (m0Var.X1lG3V04pd() & j));
                        EdgeEffect edgeEffect14 = roVar.rQPn8YBR;
                        if (edgeEffect14 == null) {
                            edgeEffect14 = roVar.GWasM1elztuh(xm0Var);
                            roVar.rQPn8YBR = edgeEffect14;
                        }
                        int i4 = Build.VERSION.SDK_INT;
                        float X1lG3V04pd5 = i4 >= 31 ? d4.X1lG3V04pd(xqGvceK5x) : 0.0f;
                        if (i4 >= 31) {
                            d4.xqGvceK5x(edgeEffect14, X1lG3V04pd5, intBitsToFloat3);
                        } else {
                            edgeEffect14.onPull(X1lG3V04pd5, intBitsToFloat3);
                        }
                    }
                }
                if (ro.AvO7iQsrTN(roVar.mOu10nynGul)) {
                    EdgeEffect edgeEffect15 = roVar.mOu10nynGul;
                    if (edgeEffect15 == null) {
                        edgeEffect15 = roVar.GWasM1elztuh(xm0Var2);
                        roVar.mOu10nynGul = edgeEffect15;
                    }
                    Hc2GqxcqBiX(0.0f, edgeEffect15, beginRecording);
                    edgeEffect15.finish();
                }
                if (ro.EljAMC1QTz(roVar.OOA6hdeuvCS)) {
                    EdgeEffect Yi7zF1RB12 = roVar.Yi7zF1RB1();
                    boolean z6 = Hc2GqxcqBiX(180.0f, Yi7zF1RB12, beginRecording) || z3;
                    if (ro.AvO7iQsrTN(roVar.OOA6hdeuvCS)) {
                        float intBitsToFloat4 = Float.intBitsToFloat((int) (m0Var.X1lG3V04pd() >> c));
                        EdgeEffect edgeEffect16 = roVar.mOu10nynGul;
                        if (edgeEffect16 == null) {
                            edgeEffect16 = roVar.GWasM1elztuh(xm0Var2);
                            roVar.mOu10nynGul = edgeEffect16;
                        }
                        int i5 = Build.VERSION.SDK_INT;
                        float X1lG3V04pd6 = i5 >= 31 ? d4.X1lG3V04pd(Yi7zF1RB12) : 0.0f;
                        float f5 = 1.0f - intBitsToFloat4;
                        if (i5 >= 31) {
                            d4.xqGvceK5x(edgeEffect16, X1lG3V04pd6, f5);
                        } else {
                            edgeEffect16.onPull(X1lG3V04pd6, f5);
                        }
                    }
                    z3 = z6;
                }
                if (z3) {
                    m0Var.xqGvceK5x();
                }
                float f6 = z2 ? 0.0f : jivtDDk9H;
                float f7 = z4 ? 0.0f : jivtDDk9H;
                p50 layoutDirection = i60Var.getLayoutDirection();
                Jz7YUlEP53 jz7YUlEP53 = new Jz7YUlEP53();
                jz7YUlEP53.GWasM1elztuh = beginRecording;
                long xqGvceK5x2 = u9Var2.xqGvceK5x();
                f4 f4Var = u9Var2.EljAMC1QTz;
                t9 t9Var = ((u9) f4Var.xqGvceK5x).OOA6hdeuvCS;
                el elVar = t9Var.GWasM1elztuh;
                p50 p50Var2 = t9Var.Yi7zF1RB1;
                s9 EljAMC1QTz2 = f4Var.EljAMC1QTz();
                long mOu10nynGul = u9Var2.EljAMC1QTz.mOu10nynGul();
                f4 f4Var2 = u9Var2.EljAMC1QTz;
                oy oyVar = (oy) f4Var2.X1lG3V04pd;
                f4Var2.Mjvvu5DE(i60Var);
                f4Var2.mE4lRynR(layoutDirection);
                f4Var2.YmKjaVtbfp5Z(jz7YUlEP53);
                f4Var2.jivtDDk9H(xqGvceK5x2);
                f4Var2.X1lG3V04pd = null;
                jz7YUlEP53.E7jCp8Ls();
                try {
                    ((j6IIN2O8eOU) u9Var2.EljAMC1QTz.Yi7zF1RB1).lv06NcmrQ(f6, f7);
                    try {
                        i60Var.GWasM1elztuh();
                        jz7YUlEP53.JFJ3QoxA();
                        f4 f4Var3 = u9Var2.EljAMC1QTz;
                        f4Var3.Mjvvu5DE(elVar);
                        f4Var3.mE4lRynR(p50Var2);
                        f4Var3.YmKjaVtbfp5Z(EljAMC1QTz2);
                        f4Var3.jivtDDk9H(mOu10nynGul);
                        f4Var3.X1lG3V04pd = oyVar;
                        bfDgRvRIg().endRecording();
                        int save = GWasM1elztuh2.save();
                        GWasM1elztuh2.translate(f, f2);
                        GWasM1elztuh2.drawRenderNode(bfDgRvRIg());
                        GWasM1elztuh2.restoreToCount(save);
                        return;
                    } finally {
                        ((j6IIN2O8eOU) u9Var2.EljAMC1QTz.Yi7zF1RB1).lv06NcmrQ(-f6, -f7);
                    }
                } catch (Throwable th) {
                    jz7YUlEP53.JFJ3QoxA();
                    f4 f4Var4 = u9Var2.EljAMC1QTz;
                    f4Var4.Mjvvu5DE(elVar);
                    f4Var4.mE4lRynR(p50Var2);
                    f4Var4.YmKjaVtbfp5Z(EljAMC1QTz2);
                    f4Var4.jivtDDk9H(mOu10nynGul);
                    f4Var4.X1lG3V04pd = oyVar;
                    throw th;
                }
        }
    }

    public RenderNode bfDgRvRIg() {
        RenderNode renderNode = (RenderNode) this.WdrkLMV3xh;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode EljAMC1QTz = re0.EljAMC1QTz();
        this.WdrkLMV3xh = EljAMC1QTz;
        return EljAMC1QTz;
    }

    public my(h71 h71Var, m0 m0Var, ro roVar) {
        this.cilMamHF = m0Var;
        this.lv06NcmrQ = roVar;
        gqMuANyCes(h71Var);
    }
}
