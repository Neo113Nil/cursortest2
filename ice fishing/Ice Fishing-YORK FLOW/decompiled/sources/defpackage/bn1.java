package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class bn1 {
    public final float JhCgjQRTAOCT;
    public final float WDYagTQQm9ns;
    public final defpackage.an1 ZpBGe2uQfcn8;
    public final long fWTAfUmVKrZq;
    public final defpackage.wm0 giKS3J6vZuNy;
    public final java.util.ArrayList oh71FJcDz6S2;

    public bn1(defpackage.an1 an1Var, defpackage.wm0 wm0Var, long j) {
        this.ZpBGe2uQfcn8 = an1Var;
        this.giKS3J6vZuNy = wm0Var;
        this.fWTAfUmVKrZq = j;
        java.util.ArrayList arrayList = wm0Var.P05cfTpS5W5L;
        float f = 0.0f;
        this.JhCgjQRTAOCT = arrayList.isEmpty() ? 0.0f : ((defpackage.dw0) arrayList.get(0)).ZpBGe2uQfcn8.JhCgjQRTAOCT.JhCgjQRTAOCT(0);
        if (!arrayList.isEmpty()) {
            defpackage.dw0 dw0Var = (defpackage.dw0) defpackage.hf.EgL5gQQnyJKX(arrayList);
            f = dw0Var.ZpBGe2uQfcn8.JhCgjQRTAOCT.JhCgjQRTAOCT(r4.QiMR8OkAhezm - 1) + dw0Var.oh71FJcDz6S2;
        }
        this.WDYagTQQm9ns = f;
        this.oh71FJcDz6S2 = wm0Var.QiMR8OkAhezm;
    }

    public final float JhCgjQRTAOCT(int i) {
        defpackage.wm0 wm0Var = this.giKS3J6vZuNy;
        wm0Var.fNwYGHIYeJcR(i);
        java.util.ArrayList arrayList = wm0Var.P05cfTpS5W5L;
        defpackage.dw0 dw0Var = (defpackage.dw0) arrayList.get(defpackage.wc1.dG7RjM6DqYVL(i, arrayList));
        defpackage.m2 m2Var = dw0Var.ZpBGe2uQfcn8;
        int i2 = i - dw0Var.JhCgjQRTAOCT;
        defpackage.zm1 zm1Var = m2Var.JhCgjQRTAOCT;
        return zm1Var.oh71FJcDz6S2.getLineLeft(i2) + (i2 == zm1Var.QiMR8OkAhezm + (-1) ? zm1Var.GE9mJIPrb8gP : 0.0f);
    }

    public final defpackage.s2 P05cfTpS5W5L(int i, int i2) {
        defpackage.wm0 wm0Var = this.giKS3J6vZuNy;
        defpackage.l6 l6Var = (defpackage.l6) wm0Var.ZpBGe2uQfcn8.ZpBGe2uQfcn8;
        if (i < 0 || i > i2 || i2 > l6Var.oh71FJcDz6S2.length()) {
            defpackage.f80.ZpBGe2uQfcn8("Start(" + i + ") or End(" + i2 + ") is out of range [0.." + l6Var.oh71FJcDz6S2.length() + "), or start > end!");
        }
        if (i == i2) {
            return defpackage.u2.ZpBGe2uQfcn8();
        }
        defpackage.s2 ZpBGe2uQfcn8 = defpackage.u2.ZpBGe2uQfcn8();
        defpackage.wc1.blKFvluuDQOf(wm0Var.P05cfTpS5W5L, defpackage.j80.JhCgjQRTAOCT(i, i2), new defpackage.pl0(ZpBGe2uQfcn8, i, i2, 2));
        return ZpBGe2uQfcn8;
    }

    public final defpackage.a51 QiMR8OkAhezm(int i) {
        defpackage.wm0 wm0Var = this.giKS3J6vZuNy;
        wm0Var.Ns0WNyEWdPsk(i);
        int length = ((defpackage.l6) wm0Var.ZpBGe2uQfcn8.ZpBGe2uQfcn8).oh71FJcDz6S2.length();
        java.util.ArrayList arrayList = wm0Var.P05cfTpS5W5L;
        defpackage.dw0 dw0Var = (defpackage.dw0) arrayList.get(i == length ? defpackage.ma0.BHfvd2J71qpO(arrayList) : defpackage.wc1.oCu53ZX2v4Ju(i, arrayList));
        defpackage.m2 m2Var = dw0Var.ZpBGe2uQfcn8;
        int JhCgjQRTAOCT = dw0Var.JhCgjQRTAOCT(i);
        defpackage.zm1 zm1Var = m2Var.JhCgjQRTAOCT;
        return zm1Var.oh71FJcDz6S2.getParagraphDirection(zm1Var.QiMR8OkAhezm(JhCgjQRTAOCT)) == 1 ? defpackage.a51.WDYagTQQm9ns : defpackage.a51.oh71FJcDz6S2;
    }

    public final float WDYagTQQm9ns(int i) {
        defpackage.wm0 wm0Var = this.giKS3J6vZuNy;
        wm0Var.fNwYGHIYeJcR(i);
        java.util.ArrayList arrayList = wm0Var.P05cfTpS5W5L;
        defpackage.dw0 dw0Var = (defpackage.dw0) arrayList.get(defpackage.wc1.dG7RjM6DqYVL(i, arrayList));
        defpackage.m2 m2Var = dw0Var.ZpBGe2uQfcn8;
        int i2 = i - dw0Var.JhCgjQRTAOCT;
        defpackage.zm1 zm1Var = m2Var.JhCgjQRTAOCT;
        return zm1Var.oh71FJcDz6S2.getLineRight(i2) + (i2 == zm1Var.QiMR8OkAhezm + (-1) ? zm1Var.Ns0WNyEWdPsk : 0.0f);
    }

    public final defpackage.a51 ZpBGe2uQfcn8(int i) {
        defpackage.wm0 wm0Var = this.giKS3J6vZuNy;
        wm0Var.Ns0WNyEWdPsk(i);
        int length = ((defpackage.l6) wm0Var.ZpBGe2uQfcn8.ZpBGe2uQfcn8).oh71FJcDz6S2.length();
        java.util.ArrayList arrayList = wm0Var.P05cfTpS5W5L;
        defpackage.dw0 dw0Var = (defpackage.dw0) arrayList.get(i == length ? defpackage.ma0.BHfvd2J71qpO(arrayList) : defpackage.wc1.oCu53ZX2v4Ju(i, arrayList));
        return dw0Var.ZpBGe2uQfcn8.JhCgjQRTAOCT.oh71FJcDz6S2.isRtlCharAt(dw0Var.JhCgjQRTAOCT(i)) ? defpackage.a51.oh71FJcDz6S2 : defpackage.a51.WDYagTQQm9ns;
    }

    public final long e6mdH7fiFuta(int i) {
        int GE9mJIPrb8gP;
        int i2;
        int e6mdH7fiFuta;
        defpackage.wm0 wm0Var = this.giKS3J6vZuNy;
        wm0Var.Ns0WNyEWdPsk(i);
        int length = ((defpackage.l6) wm0Var.ZpBGe2uQfcn8.ZpBGe2uQfcn8).oh71FJcDz6S2.length();
        java.util.ArrayList arrayList = wm0Var.P05cfTpS5W5L;
        defpackage.dw0 dw0Var = (defpackage.dw0) arrayList.get(i == length ? defpackage.ma0.BHfvd2J71qpO(arrayList) : defpackage.wc1.oCu53ZX2v4Ju(i, arrayList));
        defpackage.m2 m2Var = dw0Var.ZpBGe2uQfcn8;
        int JhCgjQRTAOCT = dw0Var.JhCgjQRTAOCT(i);
        defpackage.rw0 Ns0WNyEWdPsk = m2Var.JhCgjQRTAOCT.Ns0WNyEWdPsk();
        if (Ns0WNyEWdPsk.P05cfTpS5W5L(Ns0WNyEWdPsk.GE9mJIPrb8gP(JhCgjQRTAOCT))) {
            Ns0WNyEWdPsk.ZpBGe2uQfcn8(JhCgjQRTAOCT);
            GE9mJIPrb8gP = JhCgjQRTAOCT;
            while (GE9mJIPrb8gP != -1 && (!Ns0WNyEWdPsk.P05cfTpS5W5L(GE9mJIPrb8gP) || Ns0WNyEWdPsk.JhCgjQRTAOCT(GE9mJIPrb8gP))) {
                GE9mJIPrb8gP = Ns0WNyEWdPsk.GE9mJIPrb8gP(GE9mJIPrb8gP);
            }
        } else {
            Ns0WNyEWdPsk.ZpBGe2uQfcn8(JhCgjQRTAOCT);
            GE9mJIPrb8gP = Ns0WNyEWdPsk.QiMR8OkAhezm(JhCgjQRTAOCT) ? (!Ns0WNyEWdPsk.WDYagTQQm9ns(JhCgjQRTAOCT) || Ns0WNyEWdPsk.fWTAfUmVKrZq(JhCgjQRTAOCT)) ? Ns0WNyEWdPsk.GE9mJIPrb8gP(JhCgjQRTAOCT) : JhCgjQRTAOCT : Ns0WNyEWdPsk.fWTAfUmVKrZq(JhCgjQRTAOCT) ? Ns0WNyEWdPsk.GE9mJIPrb8gP(JhCgjQRTAOCT) : -1;
        }
        if (GE9mJIPrb8gP == -1) {
            GE9mJIPrb8gP = JhCgjQRTAOCT;
        }
        if (Ns0WNyEWdPsk.JhCgjQRTAOCT(Ns0WNyEWdPsk.e6mdH7fiFuta(JhCgjQRTAOCT))) {
            Ns0WNyEWdPsk.ZpBGe2uQfcn8(JhCgjQRTAOCT);
            i2 = JhCgjQRTAOCT;
            while (i2 != -1 && (Ns0WNyEWdPsk.P05cfTpS5W5L(i2) || !Ns0WNyEWdPsk.JhCgjQRTAOCT(i2))) {
                i2 = Ns0WNyEWdPsk.e6mdH7fiFuta(i2);
            }
        } else {
            Ns0WNyEWdPsk.ZpBGe2uQfcn8(JhCgjQRTAOCT);
            if (Ns0WNyEWdPsk.fWTAfUmVKrZq(JhCgjQRTAOCT)) {
                if (!Ns0WNyEWdPsk.WDYagTQQm9ns(JhCgjQRTAOCT) || Ns0WNyEWdPsk.QiMR8OkAhezm(JhCgjQRTAOCT)) {
                    e6mdH7fiFuta = Ns0WNyEWdPsk.e6mdH7fiFuta(JhCgjQRTAOCT);
                    i2 = e6mdH7fiFuta;
                } else {
                    i2 = JhCgjQRTAOCT;
                }
            } else if (Ns0WNyEWdPsk.QiMR8OkAhezm(JhCgjQRTAOCT)) {
                e6mdH7fiFuta = Ns0WNyEWdPsk.e6mdH7fiFuta(JhCgjQRTAOCT);
                i2 = e6mdH7fiFuta;
            } else {
                i2 = -1;
            }
        }
        if (i2 != -1) {
            JhCgjQRTAOCT = i2;
        }
        return dw0Var.giKS3J6vZuNy(defpackage.j80.JhCgjQRTAOCT(GE9mJIPrb8gP, JhCgjQRTAOCT), false);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.bn1) {
            defpackage.bn1 bn1Var = (defpackage.bn1) obj;
            if (defpackage.ma0.QiMR8OkAhezm(this.ZpBGe2uQfcn8, bn1Var.ZpBGe2uQfcn8) && this.giKS3J6vZuNy == bn1Var.giKS3J6vZuNy && defpackage.u90.ZpBGe2uQfcn8(this.fWTAfUmVKrZq, bn1Var.fWTAfUmVKrZq) && this.JhCgjQRTAOCT == bn1Var.JhCgjQRTAOCT && this.WDYagTQQm9ns == bn1Var.WDYagTQQm9ns && defpackage.ma0.QiMR8OkAhezm(this.oh71FJcDz6S2, bn1Var.oh71FJcDz6S2)) {
                return true;
            }
        }
        return false;
    }

    public final defpackage.s31 fWTAfUmVKrZq(int i) {
        defpackage.wm0 wm0Var = this.giKS3J6vZuNy;
        wm0Var.Ns0WNyEWdPsk(i);
        int length = ((defpackage.l6) wm0Var.ZpBGe2uQfcn8.ZpBGe2uQfcn8).oh71FJcDz6S2.length();
        java.util.ArrayList arrayList = wm0Var.P05cfTpS5W5L;
        defpackage.dw0 dw0Var = (defpackage.dw0) arrayList.get(i == length ? defpackage.ma0.BHfvd2J71qpO(arrayList) : defpackage.wc1.oCu53ZX2v4Ju(i, arrayList));
        defpackage.m2 m2Var = dw0Var.ZpBGe2uQfcn8;
        int JhCgjQRTAOCT = dw0Var.JhCgjQRTAOCT(i);
        java.lang.CharSequence charSequence = m2Var.WDYagTQQm9ns;
        defpackage.zm1 zm1Var = m2Var.JhCgjQRTAOCT;
        if (JhCgjQRTAOCT < 0 || JhCgjQRTAOCT > charSequence.length()) {
            java.lang.StringBuilder h3m55N1URyyK = defpackage.pVQOaWB9QMo4.h3m55N1URyyK(JhCgjQRTAOCT, "offset(", ") is out of bounds [0,");
            h3m55N1URyyK.append(charSequence.length());
            h3m55N1URyyK.append(']');
            defpackage.f80.ZpBGe2uQfcn8(h3m55N1URyyK.toString());
        }
        float e6mdH7fiFuta = zm1Var.e6mdH7fiFuta(JhCgjQRTAOCT, false);
        int QiMR8OkAhezm = zm1Var.QiMR8OkAhezm(JhCgjQRTAOCT);
        return dw0Var.ZpBGe2uQfcn8(new defpackage.s31(e6mdH7fiFuta, zm1Var.P05cfTpS5W5L(QiMR8OkAhezm), e6mdH7fiFuta, zm1Var.WDYagTQQm9ns(QiMR8OkAhezm)));
    }

    public final defpackage.s31 giKS3J6vZuNy(int i) {
        float GE9mJIPrb8gP;
        float GE9mJIPrb8gP2;
        float e6mdH7fiFuta;
        float e6mdH7fiFuta2;
        defpackage.wm0 wm0Var = this.giKS3J6vZuNy;
        wm0Var.GE9mJIPrb8gP(i);
        java.util.ArrayList arrayList = wm0Var.P05cfTpS5W5L;
        defpackage.dw0 dw0Var = (defpackage.dw0) arrayList.get(defpackage.wc1.oCu53ZX2v4Ju(i, arrayList));
        defpackage.m2 m2Var = dw0Var.ZpBGe2uQfcn8;
        int JhCgjQRTAOCT = dw0Var.JhCgjQRTAOCT(i);
        java.lang.CharSequence charSequence = m2Var.WDYagTQQm9ns;
        if (JhCgjQRTAOCT < 0 || JhCgjQRTAOCT >= charSequence.length()) {
            java.lang.StringBuilder h3m55N1URyyK = defpackage.pVQOaWB9QMo4.h3m55N1URyyK(JhCgjQRTAOCT, "offset(", ") is out of bounds [0,");
            h3m55N1URyyK.append(charSequence.length());
            h3m55N1URyyK.append(')');
            defpackage.f80.ZpBGe2uQfcn8(h3m55N1URyyK.toString());
        }
        defpackage.zm1 zm1Var = m2Var.JhCgjQRTAOCT;
        int QiMR8OkAhezm = zm1Var.QiMR8OkAhezm(JhCgjQRTAOCT);
        float P05cfTpS5W5L = zm1Var.P05cfTpS5W5L(QiMR8OkAhezm);
        float WDYagTQQm9ns = zm1Var.WDYagTQQm9ns(QiMR8OkAhezm);
        android.text.Layout layout = zm1Var.oh71FJcDz6S2;
        boolean z = layout.getParagraphDirection(QiMR8OkAhezm) == 1;
        boolean isRtlCharAt = layout.isRtlCharAt(JhCgjQRTAOCT);
        if (!z || isRtlCharAt) {
            if (z && isRtlCharAt) {
                e6mdH7fiFuta = zm1Var.GE9mJIPrb8gP(JhCgjQRTAOCT, false);
                e6mdH7fiFuta2 = zm1Var.GE9mJIPrb8gP(JhCgjQRTAOCT + 1, true);
            } else if (isRtlCharAt) {
                e6mdH7fiFuta = zm1Var.e6mdH7fiFuta(JhCgjQRTAOCT, false);
                e6mdH7fiFuta2 = zm1Var.e6mdH7fiFuta(JhCgjQRTAOCT + 1, true);
            } else {
                GE9mJIPrb8gP = zm1Var.GE9mJIPrb8gP(JhCgjQRTAOCT, false);
                GE9mJIPrb8gP2 = zm1Var.GE9mJIPrb8gP(JhCgjQRTAOCT + 1, true);
            }
            float f = e6mdH7fiFuta;
            GE9mJIPrb8gP = e6mdH7fiFuta2;
            GE9mJIPrb8gP2 = f;
        } else {
            GE9mJIPrb8gP = zm1Var.e6mdH7fiFuta(JhCgjQRTAOCT, false);
            GE9mJIPrb8gP2 = zm1Var.e6mdH7fiFuta(JhCgjQRTAOCT + 1, true);
        }
        android.graphics.RectF rectF = new android.graphics.RectF(GE9mJIPrb8gP, P05cfTpS5W5L, GE9mJIPrb8gP2, WDYagTQQm9ns);
        return dw0Var.ZpBGe2uQfcn8(new defpackage.s31(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    public final int hashCode() {
        return this.oh71FJcDz6S2.hashCode() + defpackage.pVQOaWB9QMo4.ZpBGe2uQfcn8(this.WDYagTQQm9ns, defpackage.pVQOaWB9QMo4.ZpBGe2uQfcn8(this.JhCgjQRTAOCT, defpackage.pVQOaWB9QMo4.fWTAfUmVKrZq((this.giKS3J6vZuNy.hashCode() + (this.ZpBGe2uQfcn8.hashCode() * 31)) * 31, 31, this.fWTAfUmVKrZq), 31), 31);
    }

    public final int oh71FJcDz6S2(int i) {
        defpackage.wm0 wm0Var = this.giKS3J6vZuNy;
        wm0Var.fNwYGHIYeJcR(i);
        java.util.ArrayList arrayList = wm0Var.P05cfTpS5W5L;
        defpackage.dw0 dw0Var = (defpackage.dw0) arrayList.get(defpackage.wc1.dG7RjM6DqYVL(i, arrayList));
        defpackage.m2 m2Var = dw0Var.ZpBGe2uQfcn8;
        return m2Var.JhCgjQRTAOCT.oh71FJcDz6S2.getLineStart(i - dw0Var.JhCgjQRTAOCT) + dw0Var.giKS3J6vZuNy;
    }

    public final java.lang.String toString() {
        return "TextLayoutResult(layoutInput=" + this.ZpBGe2uQfcn8 + ", multiParagraph=" + this.giKS3J6vZuNy + ", size=" + ((java.lang.Object) defpackage.u90.giKS3J6vZuNy(this.fWTAfUmVKrZq)) + ", firstBaseline=" + this.JhCgjQRTAOCT + ", lastBaseline=" + this.WDYagTQQm9ns + ", placeholderRects=" + this.oh71FJcDz6S2 + ')';
    }
}
