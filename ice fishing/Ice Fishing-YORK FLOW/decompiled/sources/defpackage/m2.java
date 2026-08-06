package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class m2 {
    public final defpackage.zm1 JhCgjQRTAOCT;
    public final java.lang.CharSequence WDYagTQQm9ns;
    public final defpackage.q2 ZpBGe2uQfcn8;
    public final long fWTAfUmVKrZq;
    public final int giKS3J6vZuNy;
    public final java.util.List oh71FJcDz6S2;

    /* JADX WARN: Removed duplicated region for block: B:102:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x026e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m2(defpackage.q2 q2Var, int i, int i2, long j) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        defpackage.pf1 pf1Var;
        int i10;
        int i11;
        int i12;
        char c;
        defpackage.pf1 pf1Var2;
        android.text.TextUtils.TruncateAt truncateAt;
        android.text.TextUtils.TruncateAt truncateAt2;
        defpackage.zm1 ZpBGe2uQfcn8;
        int i13;
        defpackage.m2 m2Var;
        int i14;
        int i15;
        int i16;
        android.text.Layout layout;
        defpackage.yc1[] yc1VarArr;
        java.lang.CharSequence charSequence;
        java.util.List list;
        defpackage.s31 s31Var;
        float GE9mJIPrb8gP;
        int fWTAfUmVKrZq;
        float e6mdH7fiFuta;
        int fWTAfUmVKrZq2;
        int i17;
        this.ZpBGe2uQfcn8 = q2Var;
        this.giKS3J6vZuNy = i;
        this.fWTAfUmVKrZq = j;
        if (defpackage.mk.e6mdH7fiFuta(j) != 0 || defpackage.mk.GE9mJIPrb8gP(j) != 0) {
            defpackage.f80.ZpBGe2uQfcn8("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i < 1) {
            defpackage.f80.ZpBGe2uQfcn8("maxLines should be greater than 0");
        }
        defpackage.pn1 pn1Var = q2Var.giKS3J6vZuNy;
        java.lang.CharSequence charSequence2 = q2Var.P05cfTpS5W5L;
        if (i2 == 2) {
            i3 = 0;
            if (!defpackage.tn1.ZpBGe2uQfcn8(pn1Var.ZpBGe2uQfcn8.P05cfTpS5W5L, defpackage.m90.oCu53ZX2v4Ju(0)) && !defpackage.tn1.ZpBGe2uQfcn8(pn1Var.ZpBGe2uQfcn8.P05cfTpS5W5L, defpackage.tn1.fWTAfUmVKrZq) && (i17 = pn1Var.giKS3J6vZuNy.ZpBGe2uQfcn8) != 0 && i17 != 5 && i17 != 4 && charSequence2.length() != 0) {
                android.text.Spannable spannable = charSequence2 instanceof android.text.Spannable ? (android.text.Spannable) charSequence2 : null;
                spannable = spannable == null ? new android.text.SpannableString(charSequence2) : spannable;
                if (!defpackage.t80.VFeft99leXEK(spannable, defpackage.u60.class)) {
                    spannable.setSpan(new defpackage.u60(), spannable.length() - 1, spannable.length() - 1, 33);
                }
                charSequence2 = spannable;
            }
        } else {
            i3 = 0;
        }
        java.lang.CharSequence charSequence3 = charSequence2;
        this.WDYagTQQm9ns = charSequence3;
        defpackage.hw0 hw0Var = pn1Var.giKS3J6vZuNy;
        defpackage.pf1 pf1Var3 = pn1Var.ZpBGe2uQfcn8;
        int i18 = hw0Var.ZpBGe2uQfcn8;
        int i19 = 3;
        int i20 = i18 == 1 ? 3 : i18 == 2 ? 4 : i18 == 3 ? 2 : (i18 != 5 && i18 == 6) ? 1 : i3;
        int i21 = i18 == 4 ? 1 : i3;
        int i22 = hw0Var.P05cfTpS5W5L == 2 ? android.os.Build.VERSION.SDK_INT <= 32 ? 2 : 4 : i3;
        int i23 = hw0Var.QiMR8OkAhezm;
        int i24 = i23 & 255;
        if (i24 != 1) {
            if (i24 == 2) {
                i4 = i23;
                i5 = i21;
                i6 = 1;
            } else if (i24 == 3) {
                i4 = i23;
                i5 = i21;
                i6 = 2;
            }
            i7 = (i4 >> 8) & 255;
            if (i7 != 1) {
                if (i7 == 2) {
                    i19 = 1;
                } else if (i7 == 3) {
                    i19 = 2;
                } else if (i7 == 4) {
                }
                i8 = (i4 >> 16) & 255;
                if (i8 == 1) {
                    i9 = 2;
                } else {
                    i9 = 2;
                    if (i8 == 2) {
                        pf1Var = pf1Var3;
                        i10 = i20;
                        i11 = 1;
                        if (i2 != i9) {
                            truncateAt2 = android.text.TextUtils.TruncateAt.END;
                        } else if (i2 == 5) {
                            truncateAt2 = android.text.TextUtils.TruncateAt.MIDDLE;
                        } else {
                            if (i2 != 4) {
                                i12 = i22;
                                c = ' ';
                                pf1Var2 = pf1Var;
                                truncateAt = null;
                                ZpBGe2uQfcn8 = ZpBGe2uQfcn8(i10, i5, truncateAt, i, i12, i6, i19, i11, charSequence3);
                                android.text.Layout layout2 = ZpBGe2uQfcn8.oh71FJcDz6S2;
                                i13 = i10;
                                if (android.os.Build.VERSION.SDK_INT < 35 || q2Var.QiMR8OkAhezm.getLetterSpacing() == 0.0f || (!(i2 == 4 || i2 == 5) || layout2.getEllipsisCount(0) <= 0)) {
                                    m2Var = this;
                                    i14 = i;
                                    i15 = i13;
                                    i16 = 2;
                                } else {
                                    int ellipsisStart = layout2.getEllipsisStart(0);
                                    i16 = 2;
                                    java.lang.CharSequence[] charSequenceArr = {charSequence3.subSequence(0, ellipsisStart), "…", charSequence3.subSequence(layout2.getEllipsisCount(0) + ellipsisStart, charSequence3.length())};
                                    m2Var = this;
                                    i14 = i;
                                    i15 = i13;
                                    ZpBGe2uQfcn8 = m2Var.ZpBGe2uQfcn8(i15, i5, truncateAt, i14, i12, i6, i19, i11, android.text.TextUtils.concat(charSequenceArr));
                                }
                                int i25 = ZpBGe2uQfcn8.QiMR8OkAhezm;
                                if (i2 == i16 || ZpBGe2uQfcn8.ZpBGe2uQfcn8() <= defpackage.mk.QiMR8OkAhezm(j) || i14 <= 1) {
                                    m2Var.JhCgjQRTAOCT = ZpBGe2uQfcn8;
                                } else {
                                    int QiMR8OkAhezm = defpackage.mk.QiMR8OkAhezm(j);
                                    int i26 = 0;
                                    while (true) {
                                        if (i26 >= i25) {
                                            i26 = i25;
                                            break;
                                        } else if (ZpBGe2uQfcn8.WDYagTQQm9ns(i26) > QiMR8OkAhezm) {
                                            break;
                                        } else {
                                            i26++;
                                        }
                                    }
                                    if (i26 >= 0 && i26 != m2Var.giKS3J6vZuNy) {
                                        ZpBGe2uQfcn8 = m2Var.ZpBGe2uQfcn8(i15, i5, truncateAt, i26 < 1 ? 1 : i26, i12, i6, i19, i11, m2Var.WDYagTQQm9ns);
                                    }
                                    m2Var.JhCgjQRTAOCT = ZpBGe2uQfcn8;
                                }
                                m2Var.ZpBGe2uQfcn8.QiMR8OkAhezm.fWTAfUmVKrZq(pf1Var2.ZpBGe2uQfcn8.fWTAfUmVKrZq(), (java.lang.Float.floatToRawIntBits(m2Var.giKS3J6vZuNy()) & 4294967295L) | (java.lang.Float.floatToRawIntBits(m2Var.JhCgjQRTAOCT()) << c), pf1Var2.ZpBGe2uQfcn8.ZpBGe2uQfcn8());
                                layout = m2Var.JhCgjQRTAOCT.oh71FJcDz6S2;
                                if (layout.getText() instanceof android.text.Spanned) {
                                    java.lang.CharSequence text = layout.getText();
                                    text.getClass();
                                    android.text.Spanned spanned = (android.text.Spanned) text;
                                    if (spanned.nextSpanTransition(-1, spanned.length(), defpackage.yc1.class) != spanned.length()) {
                                        java.lang.CharSequence text2 = layout.getText();
                                        text2.getClass();
                                        yc1VarArr = (defpackage.yc1[]) ((android.text.Spanned) text2).getSpans(0, layout.getText().length(), defpackage.yc1.class);
                                        if (yc1VarArr != null) {
                                            for (defpackage.yc1 yc1Var : yc1VarArr) {
                                                yc1Var.QiMR8OkAhezm.setValue(new defpackage.ae1((java.lang.Float.floatToRawIntBits(m2Var.giKS3J6vZuNy()) & 4294967295L) | (java.lang.Float.floatToRawIntBits(m2Var.JhCgjQRTAOCT()) << c)));
                                            }
                                        }
                                        charSequence = m2Var.WDYagTQQm9ns;
                                        if (charSequence instanceof android.text.Spanned) {
                                            list = defpackage.av.WDYagTQQm9ns;
                                        } else {
                                            android.text.Spanned spanned2 = (android.text.Spanned) charSequence;
                                            java.lang.Object[] spans = spanned2.getSpans(0, charSequence.length(), defpackage.uy0.class);
                                            java.util.ArrayList arrayList = new java.util.ArrayList(spans.length);
                                            for (java.lang.Object obj : spans) {
                                                defpackage.uy0 uy0Var = (defpackage.uy0) obj;
                                                int spanStart = spanned2.getSpanStart(uy0Var);
                                                int spanEnd = spanned2.getSpanEnd(uy0Var);
                                                int QiMR8OkAhezm2 = m2Var.JhCgjQRTAOCT.QiMR8OkAhezm(spanStart);
                                                boolean z = QiMR8OkAhezm2 >= m2Var.giKS3J6vZuNy;
                                                boolean z2 = m2Var.JhCgjQRTAOCT.oh71FJcDz6S2.getEllipsisCount(QiMR8OkAhezm2) > 0 && spanEnd > m2Var.JhCgjQRTAOCT.oh71FJcDz6S2.getEllipsisStart(QiMR8OkAhezm2) + m2Var.JhCgjQRTAOCT.oh71FJcDz6S2.getLineStart(QiMR8OkAhezm2);
                                                boolean z3 = spanEnd > m2Var.JhCgjQRTAOCT.oh71FJcDz6S2(QiMR8OkAhezm2);
                                                if (z2 || z3 || z) {
                                                    s31Var = null;
                                                } else {
                                                    boolean z4 = m2Var.JhCgjQRTAOCT.oh71FJcDz6S2.getParagraphDirection(QiMR8OkAhezm2) == 1;
                                                    boolean isRtlCharAt = m2Var.JhCgjQRTAOCT.oh71FJcDz6S2.isRtlCharAt(spanStart);
                                                    if (!z4 || isRtlCharAt) {
                                                        if (z4 && isRtlCharAt) {
                                                            e6mdH7fiFuta = m2Var.JhCgjQRTAOCT.GE9mJIPrb8gP(spanStart, false);
                                                            fWTAfUmVKrZq2 = uy0Var.fWTAfUmVKrZq();
                                                        } else {
                                                            defpackage.zm1 zm1Var = m2Var.JhCgjQRTAOCT;
                                                            if (isRtlCharAt) {
                                                                e6mdH7fiFuta = zm1Var.e6mdH7fiFuta(spanStart, false);
                                                                fWTAfUmVKrZq2 = uy0Var.fWTAfUmVKrZq();
                                                            } else {
                                                                GE9mJIPrb8gP = zm1Var.GE9mJIPrb8gP(spanStart, false);
                                                                fWTAfUmVKrZq = uy0Var.fWTAfUmVKrZq();
                                                            }
                                                        }
                                                        GE9mJIPrb8gP = e6mdH7fiFuta - fWTAfUmVKrZq2;
                                                        defpackage.zm1 zm1Var2 = m2Var.JhCgjQRTAOCT;
                                                        uy0Var.getClass();
                                                        float JhCgjQRTAOCT = zm1Var2.JhCgjQRTAOCT(QiMR8OkAhezm2) - uy0Var.giKS3J6vZuNy();
                                                        s31Var = new defpackage.s31(GE9mJIPrb8gP, JhCgjQRTAOCT, e6mdH7fiFuta, uy0Var.giKS3J6vZuNy() + JhCgjQRTAOCT);
                                                    } else {
                                                        GE9mJIPrb8gP = m2Var.JhCgjQRTAOCT.e6mdH7fiFuta(spanStart, false);
                                                        fWTAfUmVKrZq = uy0Var.fWTAfUmVKrZq();
                                                    }
                                                    e6mdH7fiFuta = fWTAfUmVKrZq + GE9mJIPrb8gP;
                                                    defpackage.zm1 zm1Var22 = m2Var.JhCgjQRTAOCT;
                                                    uy0Var.getClass();
                                                    float JhCgjQRTAOCT2 = zm1Var22.JhCgjQRTAOCT(QiMR8OkAhezm2) - uy0Var.giKS3J6vZuNy();
                                                    s31Var = new defpackage.s31(GE9mJIPrb8gP, JhCgjQRTAOCT2, e6mdH7fiFuta, uy0Var.giKS3J6vZuNy() + JhCgjQRTAOCT2);
                                                }
                                                arrayList.add(s31Var);
                                            }
                                            list = arrayList;
                                        }
                                        m2Var.oh71FJcDz6S2 = list;
                                    }
                                }
                                yc1VarArr = null;
                                if (yc1VarArr != null) {
                                }
                                charSequence = m2Var.WDYagTQQm9ns;
                                if (charSequence instanceof android.text.Spanned) {
                                }
                                m2Var.oh71FJcDz6S2 = list;
                            }
                            truncateAt2 = android.text.TextUtils.TruncateAt.START;
                        }
                        i12 = i22;
                        c = ' ';
                        pf1Var2 = pf1Var;
                        truncateAt = truncateAt2;
                        ZpBGe2uQfcn8 = ZpBGe2uQfcn8(i10, i5, truncateAt, i, i12, i6, i19, i11, charSequence3);
                        android.text.Layout layout22 = ZpBGe2uQfcn8.oh71FJcDz6S2;
                        i13 = i10;
                        if (android.os.Build.VERSION.SDK_INT < 35) {
                        }
                        m2Var = this;
                        i14 = i;
                        i15 = i13;
                        i16 = 2;
                        int i252 = ZpBGe2uQfcn8.QiMR8OkAhezm;
                        if (i2 == i16) {
                        }
                        m2Var.JhCgjQRTAOCT = ZpBGe2uQfcn8;
                        m2Var.ZpBGe2uQfcn8.QiMR8OkAhezm.fWTAfUmVKrZq(pf1Var2.ZpBGe2uQfcn8.fWTAfUmVKrZq(), (java.lang.Float.floatToRawIntBits(m2Var.giKS3J6vZuNy()) & 4294967295L) | (java.lang.Float.floatToRawIntBits(m2Var.JhCgjQRTAOCT()) << c), pf1Var2.ZpBGe2uQfcn8.ZpBGe2uQfcn8());
                        layout = m2Var.JhCgjQRTAOCT.oh71FJcDz6S2;
                        if (layout.getText() instanceof android.text.Spanned) {
                        }
                        yc1VarArr = null;
                        if (yc1VarArr != null) {
                        }
                        charSequence = m2Var.WDYagTQQm9ns;
                        if (charSequence instanceof android.text.Spanned) {
                        }
                        m2Var.oh71FJcDz6S2 = list;
                    }
                }
                pf1Var = pf1Var3;
                i10 = i20;
                i11 = i3;
                if (i2 != i9) {
                }
                i12 = i22;
                c = ' ';
                pf1Var2 = pf1Var;
                truncateAt = truncateAt2;
                ZpBGe2uQfcn8 = ZpBGe2uQfcn8(i10, i5, truncateAt, i, i12, i6, i19, i11, charSequence3);
                android.text.Layout layout222 = ZpBGe2uQfcn8.oh71FJcDz6S2;
                i13 = i10;
                if (android.os.Build.VERSION.SDK_INT < 35) {
                }
                m2Var = this;
                i14 = i;
                i15 = i13;
                i16 = 2;
                int i2522 = ZpBGe2uQfcn8.QiMR8OkAhezm;
                if (i2 == i16) {
                }
                m2Var.JhCgjQRTAOCT = ZpBGe2uQfcn8;
                m2Var.ZpBGe2uQfcn8.QiMR8OkAhezm.fWTAfUmVKrZq(pf1Var2.ZpBGe2uQfcn8.fWTAfUmVKrZq(), (java.lang.Float.floatToRawIntBits(m2Var.giKS3J6vZuNy()) & 4294967295L) | (java.lang.Float.floatToRawIntBits(m2Var.JhCgjQRTAOCT()) << c), pf1Var2.ZpBGe2uQfcn8.ZpBGe2uQfcn8());
                layout = m2Var.JhCgjQRTAOCT.oh71FJcDz6S2;
                if (layout.getText() instanceof android.text.Spanned) {
                }
                yc1VarArr = null;
                if (yc1VarArr != null) {
                }
                charSequence = m2Var.WDYagTQQm9ns;
                if (charSequence instanceof android.text.Spanned) {
                }
                m2Var.oh71FJcDz6S2 = list;
            }
            i19 = i3;
            i8 = (i4 >> 16) & 255;
            if (i8 == 1) {
            }
            pf1Var = pf1Var3;
            i10 = i20;
            i11 = i3;
            if (i2 != i9) {
            }
            i12 = i22;
            c = ' ';
            pf1Var2 = pf1Var;
            truncateAt = truncateAt2;
            ZpBGe2uQfcn8 = ZpBGe2uQfcn8(i10, i5, truncateAt, i, i12, i6, i19, i11, charSequence3);
            android.text.Layout layout2222 = ZpBGe2uQfcn8.oh71FJcDz6S2;
            i13 = i10;
            if (android.os.Build.VERSION.SDK_INT < 35) {
            }
            m2Var = this;
            i14 = i;
            i15 = i13;
            i16 = 2;
            int i25222 = ZpBGe2uQfcn8.QiMR8OkAhezm;
            if (i2 == i16) {
            }
            m2Var.JhCgjQRTAOCT = ZpBGe2uQfcn8;
            m2Var.ZpBGe2uQfcn8.QiMR8OkAhezm.fWTAfUmVKrZq(pf1Var2.ZpBGe2uQfcn8.fWTAfUmVKrZq(), (java.lang.Float.floatToRawIntBits(m2Var.giKS3J6vZuNy()) & 4294967295L) | (java.lang.Float.floatToRawIntBits(m2Var.JhCgjQRTAOCT()) << c), pf1Var2.ZpBGe2uQfcn8.ZpBGe2uQfcn8());
            layout = m2Var.JhCgjQRTAOCT.oh71FJcDz6S2;
            if (layout.getText() instanceof android.text.Spanned) {
            }
            yc1VarArr = null;
            if (yc1VarArr != null) {
            }
            charSequence = m2Var.WDYagTQQm9ns;
            if (charSequence instanceof android.text.Spanned) {
            }
            m2Var.oh71FJcDz6S2 = list;
        }
        i4 = i23;
        i5 = i21;
        i6 = i3;
        i7 = (i4 >> 8) & 255;
        if (i7 != 1) {
        }
        i19 = i3;
        i8 = (i4 >> 16) & 255;
        if (i8 == 1) {
        }
        pf1Var = pf1Var3;
        i10 = i20;
        i11 = i3;
        if (i2 != i9) {
        }
        i12 = i22;
        c = ' ';
        pf1Var2 = pf1Var;
        truncateAt = truncateAt2;
        ZpBGe2uQfcn8 = ZpBGe2uQfcn8(i10, i5, truncateAt, i, i12, i6, i19, i11, charSequence3);
        android.text.Layout layout22222 = ZpBGe2uQfcn8.oh71FJcDz6S2;
        i13 = i10;
        if (android.os.Build.VERSION.SDK_INT < 35) {
        }
        m2Var = this;
        i14 = i;
        i15 = i13;
        i16 = 2;
        int i252222 = ZpBGe2uQfcn8.QiMR8OkAhezm;
        if (i2 == i16) {
        }
        m2Var.JhCgjQRTAOCT = ZpBGe2uQfcn8;
        m2Var.ZpBGe2uQfcn8.QiMR8OkAhezm.fWTAfUmVKrZq(pf1Var2.ZpBGe2uQfcn8.fWTAfUmVKrZq(), (java.lang.Float.floatToRawIntBits(m2Var.giKS3J6vZuNy()) & 4294967295L) | (java.lang.Float.floatToRawIntBits(m2Var.JhCgjQRTAOCT()) << c), pf1Var2.ZpBGe2uQfcn8.ZpBGe2uQfcn8());
        layout = m2Var.JhCgjQRTAOCT.oh71FJcDz6S2;
        if (layout.getText() instanceof android.text.Spanned) {
        }
        yc1VarArr = null;
        if (yc1VarArr != null) {
        }
        charSequence = m2Var.WDYagTQQm9ns;
        if (charSequence instanceof android.text.Spanned) {
        }
        m2Var.oh71FJcDz6S2 = list;
    }

    public final float JhCgjQRTAOCT() {
        return defpackage.mk.P05cfTpS5W5L(this.fWTAfUmVKrZq);
    }

    public final void QiMR8OkAhezm(defpackage.id idVar, defpackage.vb vbVar, float f, defpackage.zc1 zc1Var, defpackage.qk1 qk1Var, defpackage.dt dtVar) {
        defpackage.j4 j4Var = this.ZpBGe2uQfcn8.QiMR8OkAhezm;
        int i = j4Var.fWTAfUmVKrZq;
        float JhCgjQRTAOCT = JhCgjQRTAOCT();
        float giKS3J6vZuNy = giKS3J6vZuNy();
        j4Var.fWTAfUmVKrZq(vbVar, (java.lang.Float.floatToRawIntBits(giKS3J6vZuNy) & 4294967295L) | (java.lang.Float.floatToRawIntBits(JhCgjQRTAOCT) << 32), f);
        j4Var.oh71FJcDz6S2(zc1Var);
        j4Var.QiMR8OkAhezm(qk1Var);
        j4Var.WDYagTQQm9ns(dtVar);
        j4Var.giKS3J6vZuNy(3);
        WDYagTQQm9ns(idVar);
        j4Var.giKS3J6vZuNy(i);
    }

    public final void WDYagTQQm9ns(defpackage.id idVar) {
        android.graphics.Canvas ZpBGe2uQfcn8 = defpackage.a.ZpBGe2uQfcn8(idVar);
        defpackage.zm1 zm1Var = this.JhCgjQRTAOCT;
        if (zm1Var.JhCgjQRTAOCT) {
            ZpBGe2uQfcn8.save();
            ZpBGe2uQfcn8.clipRect(0.0f, 0.0f, JhCgjQRTAOCT(), giKS3J6vZuNy());
        }
        int i = zm1Var.P05cfTpS5W5L;
        if (ZpBGe2uQfcn8.getClipBounds(zm1Var.XntWc4eZSQ8j)) {
            if (i != 0) {
                ZpBGe2uQfcn8.translate(0.0f, i);
            }
            java.lang.ThreadLocal threadLocal = defpackage.dn1.ZpBGe2uQfcn8;
            java.lang.Object obj = threadLocal.get();
            if (obj == null) {
                obj = new defpackage.vj1();
                threadLocal.set(obj);
            }
            defpackage.vj1 vj1Var = (defpackage.vj1) obj;
            vj1Var.ZpBGe2uQfcn8 = ZpBGe2uQfcn8;
            try {
                zm1Var.oh71FJcDz6S2.draw(vj1Var);
                if (i != 0) {
                    ZpBGe2uQfcn8.translate(0.0f, (-1.0f) * i);
                }
            } finally {
                vj1Var.ZpBGe2uQfcn8 = null;
            }
        }
        if (zm1Var.JhCgjQRTAOCT) {
            ZpBGe2uQfcn8.restore();
        }
    }

    public final defpackage.zm1 ZpBGe2uQfcn8(int i, int i2, android.text.TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, java.lang.CharSequence charSequence) {
        defpackage.fz0 fz0Var;
        float JhCgjQRTAOCT = JhCgjQRTAOCT();
        defpackage.q2 q2Var = this.ZpBGe2uQfcn8;
        defpackage.j4 j4Var = q2Var.QiMR8OkAhezm;
        int i8 = q2Var.fNwYGHIYeJcR;
        defpackage.xc0 xc0Var = q2Var.e6mdH7fiFuta;
        defpackage.pn1 pn1Var = q2Var.giKS3J6vZuNy;
        defpackage.n2 n2Var = defpackage.o2.ZpBGe2uQfcn8;
        defpackage.sz0 sz0Var = pn1Var.fWTAfUmVKrZq;
        return new defpackage.zm1(charSequence, JhCgjQRTAOCT, j4Var, i, truncateAt, i8, (sz0Var == null || (fz0Var = sz0Var.giKS3J6vZuNy) == null) ? false : fz0Var.ZpBGe2uQfcn8, i3, i5, i6, i7, i4, i2, xc0Var);
    }

    /* JADX WARN: Type inference failed for: r10v26, types: [z1] */
    public final long fWTAfUmVKrZq(defpackage.s31 s31Var, int i, defpackage.p81 p81Var) {
        defpackage.la1 y30Var;
        int i2;
        int[] iArr;
        android.text.SegmentFinder P05cfTpS5W5L;
        android.graphics.RectF OVwOqzUGHcCU = defpackage.w60.OVwOqzUGHcCU(s31Var);
        int i3 = 0;
        boolean z = i != 0 && i == 1;
        final defpackage.l2 l2Var = new defpackage.l2(i3, p81Var);
        defpackage.zm1 zm1Var = this.JhCgjQRTAOCT;
        android.text.TextPaint textPaint = zm1Var.ZpBGe2uQfcn8;
        android.text.Layout layout = zm1Var.oh71FJcDz6S2;
        int i4 = android.os.Build.VERSION.SDK_INT;
        int i5 = 6;
        if (i4 >= 34) {
            if (z) {
                P05cfTpS5W5L = new defpackage.v6(new defpackage.pd1(i5, layout.getText(), zm1Var.Ns0WNyEWdPsk()));
            } else {
                defpackage.y1.gUjdnLbkVAaA();
                P05cfTpS5W5L = defpackage.y1.P05cfTpS5W5L(defpackage.y1.QiMR8OkAhezm(layout.getText(), textPaint));
            }
            iArr = layout.getRangeForRect(OVwOqzUGHcCU, P05cfTpS5W5L, new android.text.Layout.TextInclusionStrategy() { // from class: z1
                @Override // android.text.Layout.TextInclusionStrategy
                public final boolean isSegmentInside(android.graphics.RectF rectF, android.graphics.RectF rectF2) {
                    return ((java.lang.Boolean) defpackage.l2.this.QiMR8OkAhezm(rectF, rectF2)).booleanValue();
                }
            });
        } else {
            defpackage.x8 fWTAfUmVKrZq = zm1Var.fWTAfUmVKrZq();
            if (z) {
                y30Var = new defpackage.pd1(i5, layout.getText(), zm1Var.Ns0WNyEWdPsk());
            } else {
                java.lang.CharSequence text = layout.getText();
                y30Var = i4 >= 29 ? new defpackage.y30(text, textPaint) : new defpackage.z30(text);
            }
            defpackage.la1 la1Var = y30Var;
            int lineForVertical = layout.getLineForVertical((int) OVwOqzUGHcCU.top);
            if (OVwOqzUGHcCU.top <= zm1Var.WDYagTQQm9ns(lineForVertical) || (lineForVertical = lineForVertical + 1) < zm1Var.QiMR8OkAhezm) {
                int i6 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) OVwOqzUGHcCU.bottom);
                if (lineForVertical2 != 0 || OVwOqzUGHcCU.bottom >= zm1Var.P05cfTpS5W5L(0)) {
                    int maCixPsq4ml2 = defpackage.b80.maCixPsq4ml2(zm1Var, layout, fWTAfUmVKrZq, i6, OVwOqzUGHcCU, la1Var, l2Var, true);
                    while (true) {
                        i2 = i6;
                        if (maCixPsq4ml2 != -1 || i2 >= lineForVertical2) {
                            break;
                        }
                        i6 = i2 + 1;
                        maCixPsq4ml2 = defpackage.b80.maCixPsq4ml2(zm1Var, layout, fWTAfUmVKrZq, i6, OVwOqzUGHcCU, la1Var, l2Var, true);
                    }
                    if (maCixPsq4ml2 != -1) {
                        int i7 = lineForVertical2;
                        int maCixPsq4ml22 = defpackage.b80.maCixPsq4ml2(zm1Var, layout, fWTAfUmVKrZq, i7, OVwOqzUGHcCU, la1Var, l2Var, false);
                        while (maCixPsq4ml22 == -1 && i2 < i7) {
                            i7--;
                            maCixPsq4ml22 = defpackage.b80.maCixPsq4ml2(zm1Var, layout, fWTAfUmVKrZq, i7, OVwOqzUGHcCU, la1Var, l2Var, false);
                        }
                        if (maCixPsq4ml22 != -1) {
                            iArr = new int[]{la1Var.ZpBGe2uQfcn8(maCixPsq4ml2 + 1), la1Var.giKS3J6vZuNy(maCixPsq4ml22 - 1)};
                        }
                    }
                }
            }
            iArr = null;
        }
        return iArr == null ? defpackage.in1.giKS3J6vZuNy : defpackage.j80.JhCgjQRTAOCT(iArr[0], iArr[1]);
    }

    public final float giKS3J6vZuNy() {
        return this.JhCgjQRTAOCT.ZpBGe2uQfcn8();
    }

    public final void oh71FJcDz6S2(defpackage.id idVar, long j, defpackage.zc1 zc1Var, defpackage.qk1 qk1Var, defpackage.dt dtVar) {
        defpackage.j4 j4Var = this.ZpBGe2uQfcn8.QiMR8OkAhezm;
        int i = j4Var.fWTAfUmVKrZq;
        j4Var.JhCgjQRTAOCT(j);
        j4Var.oh71FJcDz6S2(zc1Var);
        j4Var.QiMR8OkAhezm(qk1Var);
        j4Var.WDYagTQQm9ns(dtVar);
        j4Var.giKS3J6vZuNy(3);
        WDYagTQQm9ns(idVar);
        j4Var.giKS3J6vZuNy(i);
    }
}
