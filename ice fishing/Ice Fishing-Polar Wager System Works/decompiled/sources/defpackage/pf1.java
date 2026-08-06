package defpackage;

/* loaded from: classes.dex */
public final class pf1 {
    public final int AARZUJiTa;
    public final int DFo87pBq1E5;
    public final int EXtogiMhuM;
    public final boolean F7NU4MC0GW;
    public final android.text.TextPaint IHQe1A4L2xu;
    public final android.graphics.Paint.FontMetricsInt JlrlGoKF;
    public defpackage.m7 QoRHpC4k;
    public final float SH1y5HwkJhh;
    public final defpackage.ke0[] SyNS6RMn;
    public final android.text.Layout adDC3e2L;
    public final android.graphics.Rect cnag84Bm = new android.graphics.Rect();
    public final boolean ez2rX8ReCYw;
    public final android.text.TextUtils.TruncateAt oh6vYeIP;
    public final boolean r1MBDhnF;
    public final float riuEU0zW4;
    public final int xiZrDbcSW0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x028d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x031f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public pf1(java.lang.CharSequence charSequence, float f, android.text.TextPaint textPaint, int i, android.text.TextUtils.TruncateAt truncateAt, int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, defpackage.ba0 ba0Var) {
        int i9;
        android.text.TextDirectionHeuristic textDirectionHeuristic;
        android.text.Layout JlrlGoKF;
        defpackage.ke0[] ke0VarArr;
        int i10;
        int i11;
        int i12;
        int i13;
        char c;
        long j;
        int i14;
        int i15;
        long IHQe1A4L2xu;
        int i16;
        boolean isFallbackLineSpacingEnabled;
        boolean isFallbackLineSpacingEnabled2;
        long j2;
        int i17;
        android.text.Layout layout;
        int i18;
        android.graphics.Paint.FontMetricsInt fontMetricsInt;
        int i19;
        this.IHQe1A4L2xu = textPaint;
        this.oh6vYeIP = truncateAt;
        this.r1MBDhnF = z;
        int length = charSequence.length();
        android.text.TextDirectionHeuristic oh6vYeIP = defpackage.sf1.oh6vYeIP(i2);
        android.text.Layout.Alignment alignment = defpackage.df1.IHQe1A4L2xu;
        android.text.Layout.Alignment alignment2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? android.text.Layout.Alignment.ALIGN_NORMAL : defpackage.df1.oh6vYeIP : defpackage.df1.IHQe1A4L2xu : android.text.Layout.Alignment.ALIGN_CENTER : android.text.Layout.Alignment.ALIGN_OPPOSITE : android.text.Layout.Alignment.ALIGN_NORMAL;
        boolean z2 = (charSequence instanceof android.text.Spanned) && ((android.text.Spanned) charSequence).nextSpanTransition(-1, length, defpackage.x7.class) < length;
        android.os.Trace.beginSection("TextLayout:initLayout");
        try {
            android.text.BoringLayout.Metrics IHQe1A4L2xu2 = ba0Var.IHQe1A4L2xu();
            double d = f;
            int ceil = (int) java.lang.Math.ceil(d);
            if (IHQe1A4L2xu2 == null || ba0Var.r1MBDhnF() > f || z2) {
                this.ez2rX8ReCYw = false;
                i9 = i3;
                textDirectionHeuristic = oh6vYeIP;
                JlrlGoKF = defpackage.j70.JlrlGoKF(charSequence, textPaint, ceil, charSequence.length(), textDirectionHeuristic, alignment2, i9, truncateAt, (int) java.lang.Math.ceil(d), i8, z, i4, i5, i6, i7);
            } else {
                this.ez2rX8ReCYw = true;
                if (ceil < 0) {
                    defpackage.y50.IHQe1A4L2xu("negative width");
                }
                if (ceil < 0) {
                    defpackage.y50.IHQe1A4L2xu("negative ellipsized width");
                }
                JlrlGoKF = android.os.Build.VERSION.SDK_INT >= 33 ? defpackage.sJNB7mCer5.adDC3e2L(charSequence, textPaint, ceil, alignment2, IHQe1A4L2xu2, z, truncateAt, ceil) : new android.text.BoringLayout(charSequence, textPaint, ceil, alignment2, 1.0f, 0.0f, IHQe1A4L2xu2, z, truncateAt, ceil);
                i9 = i3;
                textDirectionHeuristic = oh6vYeIP;
            }
            this.adDC3e2L = JlrlGoKF;
            android.os.Trace.endSection();
            int min = java.lang.Math.min(JlrlGoKF.getLineCount(), i9);
            this.xiZrDbcSW0 = min;
            int i20 = min - 1;
            this.F7NU4MC0GW = min >= i9 && (JlrlGoKF.getEllipsisCount(i20) > 0 || JlrlGoKF.getLineEnd(i20) != charSequence.length());
            if (JlrlGoKF.getText() instanceof android.text.Spanned) {
                java.lang.CharSequence text = JlrlGoKF.getText();
                text.getClass();
                if (defpackage.f70.G3OKOH3wZRC((android.text.Spanned) text, defpackage.ke0.class) || JlrlGoKF.getText().length() <= 0) {
                    java.lang.CharSequence text2 = JlrlGoKF.getText();
                    text2.getClass();
                    i10 = 0;
                    ke0VarArr = (defpackage.ke0[]) ((android.text.Spanned) text2).getSpans(0, JlrlGoKF.getText().length(), defpackage.ke0.class);
                    this.SyNS6RMn = ke0VarArr;
                    if (ke0VarArr != null) {
                        defpackage.ke0 ke0Var = ke0VarArr.length == 0 ? null : ke0VarArr[i10];
                        if (ke0Var != null) {
                            if (ke0Var.AARZUJiTa) {
                                i11 = 2;
                                if (ke0Var.SH1y5HwkJhh == 2) {
                                    i19 = 1;
                                    i12 = i19;
                                    if (ke0VarArr != null) {
                                        defpackage.ke0 ke0Var2 = ke0VarArr.length == 0 ? null : ke0VarArr[i10];
                                        if (ke0Var2 != null && ke0Var2.EXtogiMhuM && ke0Var2.SH1y5HwkJhh == i11) {
                                            i13 = 1;
                                            if (i12 != 0 || i13 == 0) {
                                                long j3 = defpackage.sf1.oh6vYeIP;
                                                if (z) {
                                                    c = ' ';
                                                    j = 4294967295L;
                                                    i14 = 1;
                                                    i15 = 33;
                                                } else if (this.ez2rX8ReCYw) {
                                                    android.text.BoringLayout boringLayout = (android.text.BoringLayout) JlrlGoKF;
                                                    i15 = 33;
                                                    if (android.os.Build.VERSION.SDK_INT >= 33) {
                                                        isFallbackLineSpacingEnabled2 = boringLayout.isFallbackLineSpacingEnabled();
                                                        i16 = isFallbackLineSpacingEnabled2;
                                                        if (i16 != 0) {
                                                            c = ' ';
                                                            j = 4294967295L;
                                                            i14 = 1;
                                                        } else {
                                                            android.text.TextPaint paint = JlrlGoKF.getPaint();
                                                            java.lang.CharSequence text3 = JlrlGoKF.getText();
                                                            c = ' ';
                                                            android.graphics.Rect SyNS6RMn = defpackage.f70.SyNS6RMn(paint, text3, JlrlGoKF.getLineStart(i10), JlrlGoKF.getLineEnd(i10));
                                                            int lineAscent = JlrlGoKF.getLineAscent(i10);
                                                            j = 4294967295L;
                                                            int i21 = SyNS6RMn.top;
                                                            int topPadding = i21 < lineAscent ? lineAscent - i21 : JlrlGoKF.getTopPadding();
                                                            i14 = 1;
                                                            SyNS6RMn = min != 1 ? defpackage.f70.SyNS6RMn(paint, text3, JlrlGoKF.getLineStart(i20), JlrlGoKF.getLineEnd(i20)) : SyNS6RMn;
                                                            int lineDescent = JlrlGoKF.getLineDescent(i20);
                                                            int i22 = SyNS6RMn.bottom;
                                                            int bottomPadding = i22 > lineDescent ? i22 - lineDescent : JlrlGoKF.getBottomPadding();
                                                            if (topPadding != 0 || bottomPadding != 0) {
                                                                j3 = defpackage.sf1.IHQe1A4L2xu(topPadding, bottomPadding);
                                                            }
                                                        }
                                                    }
                                                    i16 = i10;
                                                    if (i16 != 0) {
                                                    }
                                                } else {
                                                    i15 = 33;
                                                    android.text.StaticLayout staticLayout = (android.text.StaticLayout) JlrlGoKF;
                                                    int i23 = android.os.Build.VERSION.SDK_INT;
                                                    if (i23 >= 33) {
                                                        isFallbackLineSpacingEnabled = staticLayout.isFallbackLineSpacingEnabled();
                                                        i16 = isFallbackLineSpacingEnabled;
                                                    } else {
                                                        if (i23 >= 28) {
                                                            i16 = 1;
                                                        }
                                                        i16 = i10;
                                                    }
                                                    if (i16 != 0) {
                                                    }
                                                }
                                                IHQe1A4L2xu = defpackage.sf1.IHQe1A4L2xu(i12 != 0 ? i10 : (int) (j3 >> c), i13 != 0 ? i10 : (int) (j3 & j));
                                            } else {
                                                IHQe1A4L2xu = defpackage.sf1.oh6vYeIP;
                                                c = ' ';
                                                j = 4294967295L;
                                                i14 = 1;
                                                i15 = 33;
                                            }
                                            if (ke0VarArr != null) {
                                                int length2 = ke0VarArr.length;
                                                int i24 = i10;
                                                int i25 = i24;
                                                for (int i26 = i25; i26 < length2; i26++) {
                                                    defpackage.ke0 ke0Var3 = ke0VarArr[i26];
                                                    int i27 = ke0Var3.cnag84Bm;
                                                    i24 = i27 < 0 ? java.lang.Math.max(i24, java.lang.Math.abs(i27)) : i24;
                                                    int i28 = ke0Var3.QoRHpC4k;
                                                    if (i28 < 0) {
                                                        i25 = java.lang.Math.max(i24, java.lang.Math.abs(i28));
                                                    }
                                                }
                                                j2 = (i24 == 0 && i25 == 0) ? defpackage.sf1.oh6vYeIP : defpackage.sf1.IHQe1A4L2xu(i24, i25);
                                            } else {
                                                j2 = defpackage.sf1.oh6vYeIP;
                                            }
                                            this.AARZUJiTa = java.lang.Math.max((int) (IHQe1A4L2xu >> c), (int) (j2 >> c));
                                            this.EXtogiMhuM = java.lang.Math.max((int) (IHQe1A4L2xu & j), (int) (j2 & j));
                                            android.text.TextPaint textPaint2 = this.IHQe1A4L2xu;
                                            defpackage.ke0[] ke0VarArr2 = this.SyNS6RMn;
                                            i17 = this.xiZrDbcSW0 - i14;
                                            layout = this.adDC3e2L;
                                            if (layout.getLineStart(i17) == layout.getLineEnd(i17) || ke0VarArr2 == null || ke0VarArr2.length == 0) {
                                                i18 = i10;
                                                fontMetricsInt = null;
                                            } else {
                                                android.text.SpannableString spannableString = new android.text.SpannableString("\u200b");
                                                if (ke0VarArr2.length == 0) {
                                                    throw new java.util.NoSuchElementException("Array is empty.");
                                                }
                                                defpackage.ke0 ke0Var4 = ke0VarArr2[i10];
                                                spannableString.setSpan(new defpackage.ke0(ke0Var4.adDC3e2L, spannableString.length(), (i17 == 0 || !ke0Var4.EXtogiMhuM) ? ke0Var4.EXtogiMhuM : i10, ke0Var4.EXtogiMhuM, ke0Var4.riuEU0zW4, ke0Var4.SH1y5HwkJhh), i10, spannableString.length(), i15);
                                                i18 = i10;
                                                android.text.StaticLayout JlrlGoKF2 = defpackage.j70.JlrlGoKF(spannableString, textPaint2, Integer.MAX_VALUE, spannableString.length(), textDirectionHeuristic, defpackage.u90.IHQe1A4L2xu, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, this.r1MBDhnF, 0, 0, 0, 0);
                                                fontMetricsInt = new android.graphics.Paint.FontMetricsInt();
                                                fontMetricsInt.ascent = JlrlGoKF2.getLineAscent(i18);
                                                fontMetricsInt.descent = JlrlGoKF2.getLineDescent(i18);
                                                fontMetricsInt.top = JlrlGoKF2.getLineTop(i18);
                                                fontMetricsInt.bottom = JlrlGoKF2.getLineBottom(i18);
                                            }
                                            this.DFo87pBq1E5 = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (F7NU4MC0GW(i20) - xiZrDbcSW0(i20))) : i18;
                                            this.JlrlGoKF = fontMetricsInt;
                                            android.text.Layout layout2 = this.adDC3e2L;
                                            this.riuEU0zW4 = defpackage.ci0.C0U8sNJm(layout2, i20, layout2.getPaint());
                                            android.text.Layout layout3 = this.adDC3e2L;
                                            this.SH1y5HwkJhh = defpackage.ci0.UsuH8pd5P(layout3, i20, layout3.getPaint());
                                        }
                                    }
                                    i13 = i10;
                                    if (i12 != 0) {
                                    }
                                    long j32 = defpackage.sf1.oh6vYeIP;
                                    if (z) {
                                    }
                                    IHQe1A4L2xu = defpackage.sf1.IHQe1A4L2xu(i12 != 0 ? i10 : (int) (j32 >> c), i13 != 0 ? i10 : (int) (j32 & j));
                                    if (ke0VarArr != null) {
                                    }
                                    this.AARZUJiTa = java.lang.Math.max((int) (IHQe1A4L2xu >> c), (int) (j2 >> c));
                                    this.EXtogiMhuM = java.lang.Math.max((int) (IHQe1A4L2xu & j), (int) (j2 & j));
                                    android.text.TextPaint textPaint22 = this.IHQe1A4L2xu;
                                    defpackage.ke0[] ke0VarArr22 = this.SyNS6RMn;
                                    i17 = this.xiZrDbcSW0 - i14;
                                    layout = this.adDC3e2L;
                                    if (layout.getLineStart(i17) == layout.getLineEnd(i17)) {
                                    }
                                    i18 = i10;
                                    fontMetricsInt = null;
                                    this.DFo87pBq1E5 = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (F7NU4MC0GW(i20) - xiZrDbcSW0(i20))) : i18;
                                    this.JlrlGoKF = fontMetricsInt;
                                    android.text.Layout layout22 = this.adDC3e2L;
                                    this.riuEU0zW4 = defpackage.ci0.C0U8sNJm(layout22, i20, layout22.getPaint());
                                    android.text.Layout layout32 = this.adDC3e2L;
                                    this.SH1y5HwkJhh = defpackage.ci0.UsuH8pd5P(layout32, i20, layout32.getPaint());
                                }
                            } else {
                                i11 = 2;
                            }
                            i19 = i10;
                            i12 = i19;
                            if (ke0VarArr != null) {
                            }
                            i13 = i10;
                            if (i12 != 0) {
                            }
                            long j322 = defpackage.sf1.oh6vYeIP;
                            if (z) {
                            }
                            IHQe1A4L2xu = defpackage.sf1.IHQe1A4L2xu(i12 != 0 ? i10 : (int) (j322 >> c), i13 != 0 ? i10 : (int) (j322 & j));
                            if (ke0VarArr != null) {
                            }
                            this.AARZUJiTa = java.lang.Math.max((int) (IHQe1A4L2xu >> c), (int) (j2 >> c));
                            this.EXtogiMhuM = java.lang.Math.max((int) (IHQe1A4L2xu & j), (int) (j2 & j));
                            android.text.TextPaint textPaint222 = this.IHQe1A4L2xu;
                            defpackage.ke0[] ke0VarArr222 = this.SyNS6RMn;
                            i17 = this.xiZrDbcSW0 - i14;
                            layout = this.adDC3e2L;
                            if (layout.getLineStart(i17) == layout.getLineEnd(i17)) {
                            }
                            i18 = i10;
                            fontMetricsInt = null;
                            this.DFo87pBq1E5 = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (F7NU4MC0GW(i20) - xiZrDbcSW0(i20))) : i18;
                            this.JlrlGoKF = fontMetricsInt;
                            android.text.Layout layout222 = this.adDC3e2L;
                            this.riuEU0zW4 = defpackage.ci0.C0U8sNJm(layout222, i20, layout222.getPaint());
                            android.text.Layout layout322 = this.adDC3e2L;
                            this.SH1y5HwkJhh = defpackage.ci0.UsuH8pd5P(layout322, i20, layout322.getPaint());
                        }
                    }
                    i11 = 2;
                    i12 = i10;
                    if (ke0VarArr != null) {
                    }
                    i13 = i10;
                    if (i12 != 0) {
                    }
                    long j3222 = defpackage.sf1.oh6vYeIP;
                    if (z) {
                    }
                    IHQe1A4L2xu = defpackage.sf1.IHQe1A4L2xu(i12 != 0 ? i10 : (int) (j3222 >> c), i13 != 0 ? i10 : (int) (j3222 & j));
                    if (ke0VarArr != null) {
                    }
                    this.AARZUJiTa = java.lang.Math.max((int) (IHQe1A4L2xu >> c), (int) (j2 >> c));
                    this.EXtogiMhuM = java.lang.Math.max((int) (IHQe1A4L2xu & j), (int) (j2 & j));
                    android.text.TextPaint textPaint2222 = this.IHQe1A4L2xu;
                    defpackage.ke0[] ke0VarArr2222 = this.SyNS6RMn;
                    i17 = this.xiZrDbcSW0 - i14;
                    layout = this.adDC3e2L;
                    if (layout.getLineStart(i17) == layout.getLineEnd(i17)) {
                    }
                    i18 = i10;
                    fontMetricsInt = null;
                    this.DFo87pBq1E5 = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (F7NU4MC0GW(i20) - xiZrDbcSW0(i20))) : i18;
                    this.JlrlGoKF = fontMetricsInt;
                    android.text.Layout layout2222 = this.adDC3e2L;
                    this.riuEU0zW4 = defpackage.ci0.C0U8sNJm(layout2222, i20, layout2222.getPaint());
                    android.text.Layout layout3222 = this.adDC3e2L;
                    this.SH1y5HwkJhh = defpackage.ci0.UsuH8pd5P(layout3222, i20, layout3222.getPaint());
                }
            }
            ke0VarArr = null;
            i10 = 0;
            this.SyNS6RMn = ke0VarArr;
            if (ke0VarArr != null) {
            }
            i11 = 2;
            i12 = i10;
            if (ke0VarArr != null) {
            }
            i13 = i10;
            if (i12 != 0) {
            }
            long j32222 = defpackage.sf1.oh6vYeIP;
            if (z) {
            }
            IHQe1A4L2xu = defpackage.sf1.IHQe1A4L2xu(i12 != 0 ? i10 : (int) (j32222 >> c), i13 != 0 ? i10 : (int) (j32222 & j));
            if (ke0VarArr != null) {
            }
            this.AARZUJiTa = java.lang.Math.max((int) (IHQe1A4L2xu >> c), (int) (j2 >> c));
            this.EXtogiMhuM = java.lang.Math.max((int) (IHQe1A4L2xu & j), (int) (j2 & j));
            android.text.TextPaint textPaint22222 = this.IHQe1A4L2xu;
            defpackage.ke0[] ke0VarArr22222 = this.SyNS6RMn;
            i17 = this.xiZrDbcSW0 - i14;
            layout = this.adDC3e2L;
            if (layout.getLineStart(i17) == layout.getLineEnd(i17)) {
            }
            i18 = i10;
            fontMetricsInt = null;
            this.DFo87pBq1E5 = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (F7NU4MC0GW(i20) - xiZrDbcSW0(i20))) : i18;
            this.JlrlGoKF = fontMetricsInt;
            android.text.Layout layout22222 = this.adDC3e2L;
            this.riuEU0zW4 = defpackage.ci0.C0U8sNJm(layout22222, i20, layout22222.getPaint());
            android.text.Layout layout32222 = this.adDC3e2L;
            this.SH1y5HwkJhh = defpackage.ci0.UsuH8pd5P(layout32222, i20, layout32222.getPaint());
        } catch (java.lang.Throwable th) {
            android.os.Trace.endSection();
            throw th;
        }
    }

    public final float AARZUJiTa(int i, boolean z) {
        return (this.adDC3e2L.getLineForOffset(i) == this.xiZrDbcSW0 - 1 ? this.riuEU0zW4 + this.SH1y5HwkJhh : 0.0f) + oh6vYeIP().AARZUJiTa(i, true, z);
    }

    public final float EXtogiMhuM(int i, boolean z) {
        return (this.adDC3e2L.getLineForOffset(i) == this.xiZrDbcSW0 + (-1) ? this.riuEU0zW4 + this.SH1y5HwkJhh : 0.0f) + oh6vYeIP().AARZUJiTa(i, false, z);
    }

    public final float F7NU4MC0GW(int i) {
        android.graphics.Paint.FontMetricsInt fontMetricsInt;
        int i2 = this.xiZrDbcSW0;
        int i3 = i2 - 1;
        android.text.Layout layout = this.adDC3e2L;
        if (i != i3 || (fontMetricsInt = this.JlrlGoKF) == null) {
            return this.AARZUJiTa + layout.getLineBottom(i) + (i == i2 + (-1) ? this.EXtogiMhuM : 0);
        }
        return layout.getLineBottom(i - 1) + fontMetricsInt.bottom;
    }

    public final int IHQe1A4L2xu() {
        boolean z = this.F7NU4MC0GW;
        android.text.Layout layout = this.adDC3e2L;
        return (z ? layout.getLineBottom(this.xiZrDbcSW0 - 1) : layout.getHeight()) + this.AARZUJiTa + this.EXtogiMhuM + this.DFo87pBq1E5;
    }

    public final int adDC3e2L(int i) {
        java.lang.ThreadLocal threadLocal = defpackage.sf1.IHQe1A4L2xu;
        android.text.Layout layout = this.adDC3e2L;
        return (layout.getEllipsisCount(i) <= 0 || this.oh6vYeIP != android.text.TextUtils.TruncateAt.END) ? layout.getLineEnd(i) : layout.getText().length();
    }

    public final defpackage.m7 oh6vYeIP() {
        defpackage.m7 m7Var = this.QoRHpC4k;
        if (m7Var != null) {
            return m7Var;
        }
        defpackage.m7 m7Var2 = new defpackage.m7(this.adDC3e2L);
        this.QoRHpC4k = m7Var2;
        return m7Var2;
    }

    public final float r1MBDhnF(int i) {
        android.graphics.Paint.FontMetricsInt fontMetricsInt;
        return this.AARZUJiTa + ((i != this.xiZrDbcSW0 + (-1) || (fontMetricsInt = this.JlrlGoKF) == null) ? this.adDC3e2L.getLineBaseline(i) : xiZrDbcSW0(i) - fontMetricsInt.ascent);
    }

    public final float xiZrDbcSW0(int i) {
        return this.adDC3e2L.getLineTop(i) + (i == 0 ? 0 : this.AARZUJiTa);
    }
}
