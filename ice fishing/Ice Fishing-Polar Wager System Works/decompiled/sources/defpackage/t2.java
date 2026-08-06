package defpackage;

/* loaded from: classes.dex */
public final class t2 {
    public final defpackage.pf1 F7NU4MC0GW;
    public final defpackage.x2 IHQe1A4L2xu;
    public final java.lang.CharSequence adDC3e2L;
    public final int oh6vYeIP;
    public final long r1MBDhnF;
    public final java.util.List xiZrDbcSW0;

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
    public t2(defpackage.x2 x2Var, int i, int i2, long j) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        defpackage.ob1 ob1Var;
        int i10;
        int i11;
        int i12;
        char c;
        defpackage.ob1 ob1Var2;
        android.text.TextUtils.TruncateAt truncateAt;
        android.text.TextUtils.TruncateAt truncateAt2;
        defpackage.pf1 IHQe1A4L2xu;
        int i13;
        defpackage.t2 t2Var;
        int i14;
        int i15;
        int i16;
        android.text.Layout layout;
        defpackage.b91[] b91VarArr;
        java.lang.CharSequence charSequence;
        java.util.List list;
        defpackage.kz0 kz0Var;
        float EXtogiMhuM;
        int r1MBDhnF;
        float AARZUJiTa;
        int r1MBDhnF2;
        int i17;
        this.IHQe1A4L2xu = x2Var;
        this.oh6vYeIP = i;
        this.r1MBDhnF = j;
        if (defpackage.ki.riuEU0zW4(j) != 0 || defpackage.ki.SH1y5HwkJhh(j) != 0) {
            defpackage.y50.IHQe1A4L2xu("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i < 1) {
            defpackage.y50.IHQe1A4L2xu("maxLines should be greater than 0");
        }
        defpackage.dg1 dg1Var = x2Var.oh6vYeIP;
        java.lang.CharSequence charSequence2 = x2Var.EXtogiMhuM;
        if (i2 == 2) {
            i3 = 0;
            if (!defpackage.fg1.IHQe1A4L2xu(dg1Var.IHQe1A4L2xu.EXtogiMhuM, defpackage.e90.kNAkVymC(0)) && !defpackage.fg1.IHQe1A4L2xu(dg1Var.IHQe1A4L2xu.EXtogiMhuM, defpackage.fg1.r1MBDhnF) && (i17 = dg1Var.oh6vYeIP.IHQe1A4L2xu) != 0 && i17 != 5 && i17 != 4 && charSequence2.length() != 0) {
                android.text.Spannable spannable = charSequence2 instanceof android.text.Spannable ? (android.text.Spannable) charSequence2 : null;
                spannable = spannable == null ? new android.text.SpannableString(charSequence2) : spannable;
                if (!defpackage.f70.G3OKOH3wZRC(spannable, defpackage.z40.class)) {
                    spannable.setSpan(new defpackage.z40(), spannable.length() - 1, spannable.length() - 1, 33);
                }
                charSequence2 = spannable;
            }
        } else {
            i3 = 0;
        }
        java.lang.CharSequence charSequence3 = charSequence2;
        this.adDC3e2L = charSequence3;
        defpackage.kt0 kt0Var = dg1Var.oh6vYeIP;
        defpackage.ob1 ob1Var3 = dg1Var.IHQe1A4L2xu;
        int i18 = kt0Var.IHQe1A4L2xu;
        int i19 = 3;
        int i20 = i18 == 1 ? 3 : i18 == 2 ? 4 : i18 == 3 ? 2 : (i18 != 5 && i18 == 6) ? 1 : i3;
        int i21 = i18 == 4 ? 1 : i3;
        int i22 = kt0Var.EXtogiMhuM == 2 ? android.os.Build.VERSION.SDK_INT <= 32 ? 2 : 4 : i3;
        int i23 = kt0Var.AARZUJiTa;
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
                        ob1Var = ob1Var3;
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
                                ob1Var2 = ob1Var;
                                truncateAt = null;
                                IHQe1A4L2xu = IHQe1A4L2xu(i10, i5, truncateAt, i, i12, i6, i19, i11, charSequence3);
                                android.text.Layout layout2 = IHQe1A4L2xu.adDC3e2L;
                                i13 = i10;
                                if (android.os.Build.VERSION.SDK_INT < 35 || x2Var.AARZUJiTa.getLetterSpacing() == 0.0f || (!(i2 == 4 || i2 == 5) || layout2.getEllipsisCount(0) <= 0)) {
                                    t2Var = this;
                                    i14 = i;
                                    i15 = i13;
                                    i16 = 2;
                                } else {
                                    int ellipsisStart = layout2.getEllipsisStart(0);
                                    i16 = 2;
                                    java.lang.CharSequence[] charSequenceArr = {charSequence3.subSequence(0, ellipsisStart), "…", charSequence3.subSequence(layout2.getEllipsisCount(0) + ellipsisStart, charSequence3.length())};
                                    t2Var = this;
                                    i14 = i;
                                    i15 = i13;
                                    IHQe1A4L2xu = t2Var.IHQe1A4L2xu(i15, i5, truncateAt, i14, i12, i6, i19, i11, android.text.TextUtils.concat(charSequenceArr));
                                }
                                int i25 = IHQe1A4L2xu.xiZrDbcSW0;
                                if (i2 == i16 || IHQe1A4L2xu.IHQe1A4L2xu() <= defpackage.ki.AARZUJiTa(j) || i14 <= 1) {
                                    t2Var.F7NU4MC0GW = IHQe1A4L2xu;
                                } else {
                                    int AARZUJiTa2 = defpackage.ki.AARZUJiTa(j);
                                    int i26 = 0;
                                    while (true) {
                                        if (i26 >= i25) {
                                            i26 = i25;
                                            break;
                                        } else if (IHQe1A4L2xu.F7NU4MC0GW(i26) > AARZUJiTa2) {
                                            break;
                                        } else {
                                            i26++;
                                        }
                                    }
                                    if (i26 >= 0 && i26 != t2Var.oh6vYeIP) {
                                        IHQe1A4L2xu = t2Var.IHQe1A4L2xu(i15, i5, truncateAt, i26 < 1 ? 1 : i26, i12, i6, i19, i11, t2Var.adDC3e2L);
                                    }
                                    t2Var.F7NU4MC0GW = IHQe1A4L2xu;
                                }
                                t2Var.IHQe1A4L2xu.AARZUJiTa.r1MBDhnF(ob1Var2.IHQe1A4L2xu.xiZrDbcSW0(), (java.lang.Float.floatToRawIntBits(t2Var.oh6vYeIP()) & 4294967295L) | (java.lang.Float.floatToRawIntBits(t2Var.r1MBDhnF()) << c), ob1Var2.IHQe1A4L2xu.oh6vYeIP());
                                layout = t2Var.F7NU4MC0GW.adDC3e2L;
                                if (layout.getText() instanceof android.text.Spanned) {
                                    java.lang.CharSequence text = layout.getText();
                                    text.getClass();
                                    android.text.Spanned spanned = (android.text.Spanned) text;
                                    if (spanned.nextSpanTransition(-1, spanned.length(), defpackage.b91.class) != spanned.length()) {
                                        java.lang.CharSequence text2 = layout.getText();
                                        text2.getClass();
                                        b91VarArr = (defpackage.b91[]) ((android.text.Spanned) text2).getSpans(0, layout.getText().length(), defpackage.b91.class);
                                        if (b91VarArr != null) {
                                            for (defpackage.b91 b91Var : b91VarArr) {
                                                b91Var.AARZUJiTa.setValue(new defpackage.z91((java.lang.Float.floatToRawIntBits(t2Var.oh6vYeIP()) & 4294967295L) | (java.lang.Float.floatToRawIntBits(t2Var.r1MBDhnF()) << c)));
                                            }
                                        }
                                        charSequence = t2Var.adDC3e2L;
                                        if (charSequence instanceof android.text.Spanned) {
                                            list = defpackage.nt.adDC3e2L;
                                        } else {
                                            android.text.Spanned spanned2 = (android.text.Spanned) charSequence;
                                            java.lang.Object[] spans = spanned2.getSpans(0, charSequence.length(), defpackage.ev0.class);
                                            java.util.ArrayList arrayList = new java.util.ArrayList(spans.length);
                                            for (java.lang.Object obj : spans) {
                                                defpackage.ev0 ev0Var = (defpackage.ev0) obj;
                                                int spanStart = spanned2.getSpanStart(ev0Var);
                                                int spanEnd = spanned2.getSpanEnd(ev0Var);
                                                int lineForOffset = t2Var.F7NU4MC0GW.adDC3e2L.getLineForOffset(spanStart);
                                                boolean z = lineForOffset >= t2Var.oh6vYeIP;
                                                boolean z2 = t2Var.F7NU4MC0GW.adDC3e2L.getEllipsisCount(lineForOffset) > 0 && spanEnd > t2Var.F7NU4MC0GW.adDC3e2L.getEllipsisStart(lineForOffset) + t2Var.F7NU4MC0GW.adDC3e2L.getLineStart(lineForOffset);
                                                boolean z3 = spanEnd > t2Var.F7NU4MC0GW.adDC3e2L(lineForOffset);
                                                if (z2 || z3 || z) {
                                                    kz0Var = null;
                                                } else {
                                                    boolean z4 = t2Var.F7NU4MC0GW.adDC3e2L.getParagraphDirection(lineForOffset) == 1;
                                                    boolean isRtlCharAt = t2Var.F7NU4MC0GW.adDC3e2L.isRtlCharAt(spanStart);
                                                    if (!z4 || isRtlCharAt) {
                                                        if (z4 && isRtlCharAt) {
                                                            AARZUJiTa = t2Var.F7NU4MC0GW.EXtogiMhuM(spanStart, false);
                                                            r1MBDhnF2 = ev0Var.r1MBDhnF();
                                                        } else {
                                                            defpackage.pf1 pf1Var = t2Var.F7NU4MC0GW;
                                                            if (isRtlCharAt) {
                                                                AARZUJiTa = pf1Var.AARZUJiTa(spanStart, false);
                                                                r1MBDhnF2 = ev0Var.r1MBDhnF();
                                                            } else {
                                                                EXtogiMhuM = pf1Var.EXtogiMhuM(spanStart, false);
                                                                r1MBDhnF = ev0Var.r1MBDhnF();
                                                            }
                                                        }
                                                        EXtogiMhuM = AARZUJiTa - r1MBDhnF2;
                                                        defpackage.pf1 pf1Var2 = t2Var.F7NU4MC0GW;
                                                        ev0Var.getClass();
                                                        float r1MBDhnF3 = pf1Var2.r1MBDhnF(lineForOffset) - ev0Var.oh6vYeIP();
                                                        kz0Var = new defpackage.kz0(EXtogiMhuM, r1MBDhnF3, AARZUJiTa, ev0Var.oh6vYeIP() + r1MBDhnF3);
                                                    } else {
                                                        EXtogiMhuM = t2Var.F7NU4MC0GW.AARZUJiTa(spanStart, false);
                                                        r1MBDhnF = ev0Var.r1MBDhnF();
                                                    }
                                                    AARZUJiTa = r1MBDhnF + EXtogiMhuM;
                                                    defpackage.pf1 pf1Var22 = t2Var.F7NU4MC0GW;
                                                    ev0Var.getClass();
                                                    float r1MBDhnF32 = pf1Var22.r1MBDhnF(lineForOffset) - ev0Var.oh6vYeIP();
                                                    kz0Var = new defpackage.kz0(EXtogiMhuM, r1MBDhnF32, AARZUJiTa, ev0Var.oh6vYeIP() + r1MBDhnF32);
                                                }
                                                arrayList.add(kz0Var);
                                            }
                                            list = arrayList;
                                        }
                                        t2Var.xiZrDbcSW0 = list;
                                    }
                                }
                                b91VarArr = null;
                                if (b91VarArr != null) {
                                }
                                charSequence = t2Var.adDC3e2L;
                                if (charSequence instanceof android.text.Spanned) {
                                }
                                t2Var.xiZrDbcSW0 = list;
                            }
                            truncateAt2 = android.text.TextUtils.TruncateAt.START;
                        }
                        i12 = i22;
                        c = ' ';
                        ob1Var2 = ob1Var;
                        truncateAt = truncateAt2;
                        IHQe1A4L2xu = IHQe1A4L2xu(i10, i5, truncateAt, i, i12, i6, i19, i11, charSequence3);
                        android.text.Layout layout22 = IHQe1A4L2xu.adDC3e2L;
                        i13 = i10;
                        if (android.os.Build.VERSION.SDK_INT < 35) {
                        }
                        t2Var = this;
                        i14 = i;
                        i15 = i13;
                        i16 = 2;
                        int i252 = IHQe1A4L2xu.xiZrDbcSW0;
                        if (i2 == i16) {
                        }
                        t2Var.F7NU4MC0GW = IHQe1A4L2xu;
                        t2Var.IHQe1A4L2xu.AARZUJiTa.r1MBDhnF(ob1Var2.IHQe1A4L2xu.xiZrDbcSW0(), (java.lang.Float.floatToRawIntBits(t2Var.oh6vYeIP()) & 4294967295L) | (java.lang.Float.floatToRawIntBits(t2Var.r1MBDhnF()) << c), ob1Var2.IHQe1A4L2xu.oh6vYeIP());
                        layout = t2Var.F7NU4MC0GW.adDC3e2L;
                        if (layout.getText() instanceof android.text.Spanned) {
                        }
                        b91VarArr = null;
                        if (b91VarArr != null) {
                        }
                        charSequence = t2Var.adDC3e2L;
                        if (charSequence instanceof android.text.Spanned) {
                        }
                        t2Var.xiZrDbcSW0 = list;
                    }
                }
                ob1Var = ob1Var3;
                i10 = i20;
                i11 = i3;
                if (i2 != i9) {
                }
                i12 = i22;
                c = ' ';
                ob1Var2 = ob1Var;
                truncateAt = truncateAt2;
                IHQe1A4L2xu = IHQe1A4L2xu(i10, i5, truncateAt, i, i12, i6, i19, i11, charSequence3);
                android.text.Layout layout222 = IHQe1A4L2xu.adDC3e2L;
                i13 = i10;
                if (android.os.Build.VERSION.SDK_INT < 35) {
                }
                t2Var = this;
                i14 = i;
                i15 = i13;
                i16 = 2;
                int i2522 = IHQe1A4L2xu.xiZrDbcSW0;
                if (i2 == i16) {
                }
                t2Var.F7NU4MC0GW = IHQe1A4L2xu;
                t2Var.IHQe1A4L2xu.AARZUJiTa.r1MBDhnF(ob1Var2.IHQe1A4L2xu.xiZrDbcSW0(), (java.lang.Float.floatToRawIntBits(t2Var.oh6vYeIP()) & 4294967295L) | (java.lang.Float.floatToRawIntBits(t2Var.r1MBDhnF()) << c), ob1Var2.IHQe1A4L2xu.oh6vYeIP());
                layout = t2Var.F7NU4MC0GW.adDC3e2L;
                if (layout.getText() instanceof android.text.Spanned) {
                }
                b91VarArr = null;
                if (b91VarArr != null) {
                }
                charSequence = t2Var.adDC3e2L;
                if (charSequence instanceof android.text.Spanned) {
                }
                t2Var.xiZrDbcSW0 = list;
            }
            i19 = i3;
            i8 = (i4 >> 16) & 255;
            if (i8 == 1) {
            }
            ob1Var = ob1Var3;
            i10 = i20;
            i11 = i3;
            if (i2 != i9) {
            }
            i12 = i22;
            c = ' ';
            ob1Var2 = ob1Var;
            truncateAt = truncateAt2;
            IHQe1A4L2xu = IHQe1A4L2xu(i10, i5, truncateAt, i, i12, i6, i19, i11, charSequence3);
            android.text.Layout layout2222 = IHQe1A4L2xu.adDC3e2L;
            i13 = i10;
            if (android.os.Build.VERSION.SDK_INT < 35) {
            }
            t2Var = this;
            i14 = i;
            i15 = i13;
            i16 = 2;
            int i25222 = IHQe1A4L2xu.xiZrDbcSW0;
            if (i2 == i16) {
            }
            t2Var.F7NU4MC0GW = IHQe1A4L2xu;
            t2Var.IHQe1A4L2xu.AARZUJiTa.r1MBDhnF(ob1Var2.IHQe1A4L2xu.xiZrDbcSW0(), (java.lang.Float.floatToRawIntBits(t2Var.oh6vYeIP()) & 4294967295L) | (java.lang.Float.floatToRawIntBits(t2Var.r1MBDhnF()) << c), ob1Var2.IHQe1A4L2xu.oh6vYeIP());
            layout = t2Var.F7NU4MC0GW.adDC3e2L;
            if (layout.getText() instanceof android.text.Spanned) {
            }
            b91VarArr = null;
            if (b91VarArr != null) {
            }
            charSequence = t2Var.adDC3e2L;
            if (charSequence instanceof android.text.Spanned) {
            }
            t2Var.xiZrDbcSW0 = list;
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
        ob1Var = ob1Var3;
        i10 = i20;
        i11 = i3;
        if (i2 != i9) {
        }
        i12 = i22;
        c = ' ';
        ob1Var2 = ob1Var;
        truncateAt = truncateAt2;
        IHQe1A4L2xu = IHQe1A4L2xu(i10, i5, truncateAt, i, i12, i6, i19, i11, charSequence3);
        android.text.Layout layout22222 = IHQe1A4L2xu.adDC3e2L;
        i13 = i10;
        if (android.os.Build.VERSION.SDK_INT < 35) {
        }
        t2Var = this;
        i14 = i;
        i15 = i13;
        i16 = 2;
        int i252222 = IHQe1A4L2xu.xiZrDbcSW0;
        if (i2 == i16) {
        }
        t2Var.F7NU4MC0GW = IHQe1A4L2xu;
        t2Var.IHQe1A4L2xu.AARZUJiTa.r1MBDhnF(ob1Var2.IHQe1A4L2xu.xiZrDbcSW0(), (java.lang.Float.floatToRawIntBits(t2Var.oh6vYeIP()) & 4294967295L) | (java.lang.Float.floatToRawIntBits(t2Var.r1MBDhnF()) << c), ob1Var2.IHQe1A4L2xu.oh6vYeIP());
        layout = t2Var.F7NU4MC0GW.adDC3e2L;
        if (layout.getText() instanceof android.text.Spanned) {
        }
        b91VarArr = null;
        if (b91VarArr != null) {
        }
        charSequence = t2Var.adDC3e2L;
        if (charSequence instanceof android.text.Spanned) {
        }
        t2Var.xiZrDbcSW0 = list;
    }

    public final void F7NU4MC0GW(defpackage.hb hbVar) {
        android.graphics.Canvas IHQe1A4L2xu = defpackage.d0.IHQe1A4L2xu(hbVar);
        defpackage.pf1 pf1Var = this.F7NU4MC0GW;
        if (pf1Var.F7NU4MC0GW) {
            IHQe1A4L2xu.save();
            IHQe1A4L2xu.clipRect(0.0f, 0.0f, r1MBDhnF(), oh6vYeIP());
        }
        int i = pf1Var.AARZUJiTa;
        if (IHQe1A4L2xu.getClipBounds(pf1Var.cnag84Bm)) {
            if (i != 0) {
                IHQe1A4L2xu.translate(0.0f, i);
            }
            java.lang.ThreadLocal threadLocal = defpackage.sf1.IHQe1A4L2xu;
            java.lang.Object obj = threadLocal.get();
            if (obj == null) {
                obj = new defpackage.ef1();
                threadLocal.set(obj);
            }
            defpackage.ef1 ef1Var = (defpackage.ef1) obj;
            ef1Var.IHQe1A4L2xu = IHQe1A4L2xu;
            try {
                pf1Var.adDC3e2L.draw(ef1Var);
                if (i != 0) {
                    IHQe1A4L2xu.translate(0.0f, (-1.0f) * i);
                }
            } finally {
                ef1Var.IHQe1A4L2xu = null;
            }
        }
        if (pf1Var.F7NU4MC0GW) {
            IHQe1A4L2xu.restore();
        }
    }

    public final defpackage.pf1 IHQe1A4L2xu(int i, int i2, android.text.TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, java.lang.CharSequence charSequence) {
        defpackage.iv0 iv0Var;
        float r1MBDhnF = r1MBDhnF();
        defpackage.x2 x2Var = this.IHQe1A4L2xu;
        defpackage.h3 h3Var = x2Var.AARZUJiTa;
        int i8 = x2Var.JlrlGoKF;
        defpackage.ba0 ba0Var = x2Var.riuEU0zW4;
        defpackage.dg1 dg1Var = x2Var.oh6vYeIP;
        defpackage.u2 u2Var = defpackage.v2.IHQe1A4L2xu;
        defpackage.lv0 lv0Var = dg1Var.r1MBDhnF;
        return new defpackage.pf1(charSequence, r1MBDhnF, h3Var, i, truncateAt, i8, (lv0Var == null || (iv0Var = lv0Var.IHQe1A4L2xu) == null) ? false : iv0Var.IHQe1A4L2xu, i3, i5, i6, i7, i4, i2, ba0Var);
    }

    public final float oh6vYeIP() {
        return this.F7NU4MC0GW.IHQe1A4L2xu();
    }

    public final float r1MBDhnF() {
        return defpackage.ki.EXtogiMhuM(this.r1MBDhnF);
    }
}
