package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class wm0 {
    public final float JhCgjQRTAOCT;
    public final java.util.ArrayList P05cfTpS5W5L;
    public final java.util.ArrayList QiMR8OkAhezm;
    public final float WDYagTQQm9ns;
    public final defpackage.x8 ZpBGe2uQfcn8;
    public final boolean fWTAfUmVKrZq;
    public final int giKS3J6vZuNy;
    public final int oh71FJcDz6S2;

    public wm0(defpackage.x8 x8Var, long j, int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int QiMR8OkAhezm;
        int i5;
        this.ZpBGe2uQfcn8 = x8Var;
        this.giKS3J6vZuNy = i;
        if (defpackage.mk.GE9mJIPrb8gP(j) != 0 || defpackage.mk.e6mdH7fiFuta(j) != 0) {
            defpackage.f80.ZpBGe2uQfcn8("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = (java.util.ArrayList) x8Var.WDYagTQQm9ns;
        int size = arrayList2.size();
        float f = 0.0f;
        int i6 = 0;
        int i7 = 0;
        while (i6 < size) {
            defpackage.ew0 ew0Var = (defpackage.ew0) arrayList2.get(i6);
            defpackage.q2 q2Var = ew0Var.ZpBGe2uQfcn8;
            int P05cfTpS5W5L = defpackage.mk.P05cfTpS5W5L(j);
            if (defpackage.mk.fWTAfUmVKrZq(j)) {
                i4 = i6;
                QiMR8OkAhezm = defpackage.mk.QiMR8OkAhezm(j) - ((int) java.lang.Math.ceil(f));
                if (QiMR8OkAhezm < 0) {
                    QiMR8OkAhezm = 0;
                }
            } else {
                i4 = i6;
                QiMR8OkAhezm = defpackage.mk.QiMR8OkAhezm(j);
            }
            i3 = 0;
            defpackage.m2 m2Var = new defpackage.m2(q2Var, this.giKS3J6vZuNy - i7, i2, defpackage.nk.giKS3J6vZuNy(0, P05cfTpS5W5L, 0, QiMR8OkAhezm, 5));
            float giKS3J6vZuNy = m2Var.giKS3J6vZuNy() + f;
            defpackage.zm1 zm1Var = m2Var.JhCgjQRTAOCT;
            int i8 = i7 + zm1Var.QiMR8OkAhezm;
            arrayList.add(new defpackage.dw0(m2Var, ew0Var.giKS3J6vZuNy, ew0Var.fWTAfUmVKrZq, i7, i8, f, giKS3J6vZuNy));
            if (!zm1Var.JhCgjQRTAOCT) {
                if (i8 == this.giKS3J6vZuNy) {
                    i5 = i4;
                    if (i5 != defpackage.ma0.BHfvd2J71qpO((java.util.ArrayList) this.ZpBGe2uQfcn8.WDYagTQQm9ns)) {
                    }
                } else {
                    i5 = i4;
                }
                i6 = i5 + 1;
                i7 = i8;
                f = giKS3J6vZuNy;
            }
            z = true;
            i7 = i8;
            f = giKS3J6vZuNy;
            break;
        }
        i3 = 0;
        z = false;
        this.WDYagTQQm9ns = f;
        this.oh71FJcDz6S2 = i7;
        this.fWTAfUmVKrZq = z;
        this.P05cfTpS5W5L = arrayList;
        this.JhCgjQRTAOCT = defpackage.mk.P05cfTpS5W5L(j);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i9 = i3; i9 < size2; i9++) {
            defpackage.dw0 dw0Var = (defpackage.dw0) arrayList.get(i9);
            java.util.List list = dw0Var.ZpBGe2uQfcn8.oh71FJcDz6S2;
            java.util.ArrayList arrayList4 = new java.util.ArrayList(list.size());
            int size3 = list.size();
            for (int i10 = i3; i10 < size3; i10++) {
                defpackage.s31 s31Var = (defpackage.s31) list.get(i10);
                arrayList4.add(s31Var != null ? dw0Var.ZpBGe2uQfcn8(s31Var) : null);
            }
            defpackage.nf.Jkfc0NcwyPL8(arrayList3, arrayList4);
        }
        if (arrayList3.size() < ((java.util.List) this.ZpBGe2uQfcn8.giKS3J6vZuNy).size()) {
            int size4 = ((java.util.List) this.ZpBGe2uQfcn8.giKS3J6vZuNy).size() - arrayList3.size();
            java.util.ArrayList arrayList5 = new java.util.ArrayList(size4);
            for (int i11 = i3; i11 < size4; i11++) {
                arrayList5.add(null);
            }
            arrayList3 = defpackage.hf.ULjnV488Y6RO(arrayList3, arrayList5);
        }
        this.QiMR8OkAhezm = arrayList3;
    }

    public static void e6mdH7fiFuta(defpackage.wm0 wm0Var, defpackage.id idVar, defpackage.vb vbVar, float f, defpackage.zc1 zc1Var, defpackage.qk1 qk1Var, defpackage.dt dtVar) {
        idVar.fNwYGHIYeJcR();
        java.util.ArrayList arrayList = wm0Var.P05cfTpS5W5L;
        if (arrayList.size() <= 1) {
            defpackage.ok0.dG7RjM6DqYVL(wm0Var, idVar, vbVar, f, zc1Var, qk1Var, dtVar);
        } else if (vbVar instanceof defpackage.lf1) {
            defpackage.ok0.dG7RjM6DqYVL(wm0Var, idVar, vbVar, f, zc1Var, qk1Var, dtVar);
        } else {
            if (!(vbVar instanceof defpackage.xc1)) {
                defpackage.h7.T1fB7bDYiVJQ();
                return;
            }
            int size = arrayList.size();
            float f2 = 0.0f;
            float f3 = 0.0f;
            for (int i = 0; i < size; i++) {
                defpackage.dw0 dw0Var = (defpackage.dw0) arrayList.get(i);
                f3 += dw0Var.ZpBGe2uQfcn8.giKS3J6vZuNy();
                f2 = java.lang.Math.max(f2, dw0Var.ZpBGe2uQfcn8.JhCgjQRTAOCT());
            }
            android.graphics.Shader giKS3J6vZuNy = ((defpackage.xc1) vbVar).giKS3J6vZuNy((java.lang.Float.floatToRawIntBits(f2) << 32) | (java.lang.Float.floatToRawIntBits(f3) & 4294967295L));
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            giKS3J6vZuNy.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                defpackage.m2 m2Var = ((defpackage.dw0) arrayList.get(i2)).ZpBGe2uQfcn8;
                m2Var.QiMR8OkAhezm(idVar, new defpackage.wb(giKS3J6vZuNy), f, zc1Var, qk1Var, dtVar);
                idVar.oh71FJcDz6S2(0.0f, m2Var.giKS3J6vZuNy());
                matrix.setTranslate(0.0f, -m2Var.giKS3J6vZuNy());
                giKS3J6vZuNy.setLocalMatrix(matrix);
            }
        }
        idVar.e6mdH7fiFuta();
    }

    public final void GE9mJIPrb8gP(int i) {
        defpackage.l6 l6Var = (defpackage.l6) this.ZpBGe2uQfcn8.ZpBGe2uQfcn8;
        if (i < 0 || i >= l6Var.oh71FJcDz6S2.length()) {
            java.lang.StringBuilder h3m55N1URyyK = defpackage.pVQOaWB9QMo4.h3m55N1URyyK(i, "offset(", ") is out of bounds [0, ");
            h3m55N1URyyK.append(l6Var.oh71FJcDz6S2.length());
            h3m55N1URyyK.append(')');
            defpackage.f80.ZpBGe2uQfcn8(h3m55N1URyyK.toString());
        }
    }

    public final int JhCgjQRTAOCT(int i) {
        int length = ((defpackage.l6) this.ZpBGe2uQfcn8.ZpBGe2uQfcn8).oh71FJcDz6S2.length();
        java.util.ArrayList arrayList = this.P05cfTpS5W5L;
        defpackage.dw0 dw0Var = (defpackage.dw0) arrayList.get(i >= length ? defpackage.ma0.BHfvd2J71qpO(arrayList) : i < 0 ? 0 : defpackage.wc1.oCu53ZX2v4Ju(i, arrayList));
        return dw0Var.ZpBGe2uQfcn8.JhCgjQRTAOCT.QiMR8OkAhezm(dw0Var.JhCgjQRTAOCT(i)) + dw0Var.JhCgjQRTAOCT;
    }

    public final void Ns0WNyEWdPsk(int i) {
        defpackage.l6 l6Var = (defpackage.l6) this.ZpBGe2uQfcn8.ZpBGe2uQfcn8;
        if (i < 0 || i > l6Var.oh71FJcDz6S2.length()) {
            java.lang.StringBuilder h3m55N1URyyK = defpackage.pVQOaWB9QMo4.h3m55N1URyyK(i, "offset(", ") is out of bounds [0, ");
            h3m55N1URyyK.append(l6Var.oh71FJcDz6S2.length());
            h3m55N1URyyK.append(']');
            defpackage.f80.ZpBGe2uQfcn8(h3m55N1URyyK.toString());
        }
    }

    public final long P05cfTpS5W5L(defpackage.s31 s31Var, int i, defpackage.p81 p81Var) {
        long j;
        long j2;
        float f = s31Var.giKS3J6vZuNy;
        java.util.ArrayList arrayList = this.P05cfTpS5W5L;
        int OcTWLQzke1i2 = defpackage.wc1.OcTWLQzke1i2(arrayList, f);
        float f2 = ((defpackage.dw0) arrayList.get(OcTWLQzke1i2)).QiMR8OkAhezm;
        float f3 = s31Var.JhCgjQRTAOCT;
        if (f2 >= f3 || OcTWLQzke1i2 == defpackage.ma0.BHfvd2J71qpO(arrayList)) {
            defpackage.dw0 dw0Var = (defpackage.dw0) arrayList.get(OcTWLQzke1i2);
            return dw0Var.giKS3J6vZuNy(dw0Var.ZpBGe2uQfcn8.fWTAfUmVKrZq(dw0Var.fWTAfUmVKrZq(s31Var), i, p81Var), true);
        }
        int OcTWLQzke1i22 = defpackage.wc1.OcTWLQzke1i2(arrayList, f3);
        long j3 = defpackage.in1.giKS3J6vZuNy;
        while (true) {
            j = defpackage.in1.giKS3J6vZuNy;
            if (!defpackage.in1.giKS3J6vZuNy(j3, j) || OcTWLQzke1i2 > OcTWLQzke1i22) {
                break;
            }
            defpackage.dw0 dw0Var2 = (defpackage.dw0) arrayList.get(OcTWLQzke1i2);
            j3 = dw0Var2.giKS3J6vZuNy(dw0Var2.ZpBGe2uQfcn8.fWTAfUmVKrZq(dw0Var2.fWTAfUmVKrZq(s31Var), i, p81Var), true);
            OcTWLQzke1i2++;
        }
        if (defpackage.in1.giKS3J6vZuNy(j3, j)) {
            return j;
        }
        while (true) {
            j2 = defpackage.in1.giKS3J6vZuNy;
            if (!defpackage.in1.giKS3J6vZuNy(j, j2) || OcTWLQzke1i2 > OcTWLQzke1i22) {
                break;
            }
            defpackage.dw0 dw0Var3 = (defpackage.dw0) arrayList.get(OcTWLQzke1i22);
            j = dw0Var3.giKS3J6vZuNy(dw0Var3.ZpBGe2uQfcn8.fWTAfUmVKrZq(dw0Var3.fWTAfUmVKrZq(s31Var), i, p81Var), true);
            OcTWLQzke1i22--;
        }
        return defpackage.in1.giKS3J6vZuNy(j, j2) ? j3 : defpackage.j80.JhCgjQRTAOCT((int) (j3 >> 32), (int) (4294967295L & j));
    }

    public final int QiMR8OkAhezm(long j) {
        int offsetForHorizontal;
        int i = (int) (j & 4294967295L);
        float intBitsToFloat = java.lang.Float.intBitsToFloat(i);
        java.util.ArrayList arrayList = this.P05cfTpS5W5L;
        defpackage.dw0 dw0Var = (defpackage.dw0) arrayList.get(defpackage.wc1.OcTWLQzke1i2(arrayList, intBitsToFloat));
        int i2 = dw0Var.fWTAfUmVKrZq;
        int i3 = dw0Var.giKS3J6vZuNy;
        if (i2 - i3 == 0) {
            return i3;
        }
        defpackage.m2 m2Var = dw0Var.ZpBGe2uQfcn8;
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat3 = java.lang.Float.intBitsToFloat(i) - dw0Var.oh71FJcDz6S2;
        long floatToRawIntBits = (java.lang.Float.floatToRawIntBits(intBitsToFloat2) << 32) | (java.lang.Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L);
        defpackage.zm1 zm1Var = m2Var.JhCgjQRTAOCT;
        int intBitsToFloat4 = (int) java.lang.Float.intBitsToFloat((int) (4294967295L & floatToRawIntBits));
        android.text.Layout layout = zm1Var.oh71FJcDz6S2;
        int lineForVertical = layout.getLineForVertical(intBitsToFloat4 - zm1Var.P05cfTpS5W5L);
        if (lineForVertical >= zm1Var.QiMR8OkAhezm) {
            offsetForHorizontal = layout.getText().length();
        } else {
            offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, (zm1Var.giKS3J6vZuNy(lineForVertical) * (-1.0f)) + java.lang.Float.intBitsToFloat((int) (floatToRawIntBits >> 32)));
        }
        return offsetForHorizontal + i3;
    }

    public final int WDYagTQQm9ns(float f) {
        int lineForVertical;
        java.util.ArrayList arrayList = this.P05cfTpS5W5L;
        defpackage.dw0 dw0Var = (defpackage.dw0) arrayList.get(defpackage.wc1.OcTWLQzke1i2(arrayList, f));
        int i = dw0Var.fWTAfUmVKrZq - dw0Var.giKS3J6vZuNy;
        int i2 = dw0Var.JhCgjQRTAOCT;
        if (i == 0) {
            return i2;
        }
        defpackage.m2 m2Var = dw0Var.ZpBGe2uQfcn8;
        float f2 = f - dw0Var.oh71FJcDz6S2;
        defpackage.zm1 zm1Var = m2Var.JhCgjQRTAOCT;
        int i3 = (int) f2;
        int i4 = zm1Var.QiMR8OkAhezm;
        if (i4 <= 0) {
            lineForVertical = 0;
        } else {
            lineForVertical = zm1Var.oh71FJcDz6S2.getLineForVertical(i3 - zm1Var.P05cfTpS5W5L);
            int i5 = i4 - 1;
            if (lineForVertical > i5) {
                lineForVertical = i5;
            }
        }
        return lineForVertical + i2;
    }

    public final void ZpBGe2uQfcn8(long j, float[] fArr) {
        GE9mJIPrb8gP(defpackage.in1.oh71FJcDz6S2(j));
        Ns0WNyEWdPsk(defpackage.in1.WDYagTQQm9ns(j));
        defpackage.x31 x31Var = new defpackage.x31();
        x31Var.WDYagTQQm9ns = 0;
        defpackage.wc1.blKFvluuDQOf(this.P05cfTpS5W5L, j, new defpackage.sa(j, fArr, x31Var, new defpackage.w31()));
    }

    public final void fNwYGHIYeJcR(int i) {
        boolean z = false;
        int i2 = this.oh71FJcDz6S2;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (z) {
            return;
        }
        defpackage.f80.ZpBGe2uQfcn8("lineIndex(" + i + ") is out of bounds [0, " + i2 + ')');
    }

    public final int fWTAfUmVKrZq(int i, boolean z) {
        int oh71FJcDz6S2;
        fNwYGHIYeJcR(i);
        java.util.ArrayList arrayList = this.P05cfTpS5W5L;
        defpackage.dw0 dw0Var = (defpackage.dw0) arrayList.get(defpackage.wc1.dG7RjM6DqYVL(i, arrayList));
        defpackage.m2 m2Var = dw0Var.ZpBGe2uQfcn8;
        int i2 = i - dw0Var.JhCgjQRTAOCT;
        defpackage.zm1 zm1Var = m2Var.JhCgjQRTAOCT;
        if (z) {
            android.text.Layout layout = zm1Var.oh71FJcDz6S2;
            java.lang.ThreadLocal threadLocal = defpackage.dn1.ZpBGe2uQfcn8;
            if (layout.getEllipsisCount(i2) <= 0 || zm1Var.giKS3J6vZuNy != android.text.TextUtils.TruncateAt.END) {
                defpackage.x8 fWTAfUmVKrZq = zm1Var.fWTAfUmVKrZq();
                android.text.Layout layout2 = (android.text.Layout) fWTAfUmVKrZq.ZpBGe2uQfcn8;
                oh71FJcDz6S2 = fWTAfUmVKrZq.fNwYGHIYeJcR(layout2.getLineEnd(i2), layout2.getLineStart(i2));
            } else {
                oh71FJcDz6S2 = layout.getEllipsisStart(i2) + layout.getLineStart(i2);
            }
        } else {
            oh71FJcDz6S2 = zm1Var.oh71FJcDz6S2(i2);
        }
        return oh71FJcDz6S2 + dw0Var.giKS3J6vZuNy;
    }

    public final float giKS3J6vZuNy(int i) {
        fNwYGHIYeJcR(i);
        java.util.ArrayList arrayList = this.P05cfTpS5W5L;
        defpackage.dw0 dw0Var = (defpackage.dw0) arrayList.get(defpackage.wc1.dG7RjM6DqYVL(i, arrayList));
        defpackage.m2 m2Var = dw0Var.ZpBGe2uQfcn8;
        return m2Var.JhCgjQRTAOCT.WDYagTQQm9ns(i - dw0Var.JhCgjQRTAOCT) + dw0Var.oh71FJcDz6S2;
    }

    public final float oh71FJcDz6S2(int i) {
        fNwYGHIYeJcR(i);
        java.util.ArrayList arrayList = this.P05cfTpS5W5L;
        defpackage.dw0 dw0Var = (defpackage.dw0) arrayList.get(defpackage.wc1.dG7RjM6DqYVL(i, arrayList));
        defpackage.m2 m2Var = dw0Var.ZpBGe2uQfcn8;
        return m2Var.JhCgjQRTAOCT.P05cfTpS5W5L(i - dw0Var.JhCgjQRTAOCT) + dw0Var.oh71FJcDz6S2;
    }
}
