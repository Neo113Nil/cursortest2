package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class zm1 {
    public final float GE9mJIPrb8gP;
    public final boolean JhCgjQRTAOCT;
    public final float Ns0WNyEWdPsk;
    public final int P05cfTpS5W5L;
    public final int QiMR8OkAhezm;
    public final defpackage.mh0[] T1fB7bDYiVJQ;
    public defpackage.rw0 WDYagTQQm9ns;
    public defpackage.x8 WmetiUbpKU9I;
    public final android.graphics.Rect XntWc4eZSQ8j = new android.graphics.Rect();
    public final android.text.TextPaint ZpBGe2uQfcn8;
    public final int e6mdH7fiFuta;
    public final boolean fNwYGHIYeJcR;
    public final boolean fWTAfUmVKrZq;
    public final int gUjdnLbkVAaA;
    public final android.text.TextUtils.TruncateAt giKS3J6vZuNy;
    public final android.graphics.Paint.FontMetricsInt h3m55N1URyyK;
    public final android.text.Layout oh71FJcDz6S2;

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
    public zm1(java.lang.CharSequence charSequence, float f, android.text.TextPaint textPaint, int i, android.text.TextUtils.TruncateAt truncateAt, int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, defpackage.xc0 xc0Var) {
        int i9;
        android.text.TextDirectionHeuristic textDirectionHeuristic;
        android.text.Layout s0TASMVLSWD5;
        defpackage.mh0[] mh0VarArr;
        int i10;
        int i11;
        int i12;
        int i13;
        char c;
        long j;
        int i14;
        int i15;
        long ZpBGe2uQfcn8;
        int i16;
        boolean isFallbackLineSpacingEnabled;
        boolean isFallbackLineSpacingEnabled2;
        long j2;
        int i17;
        android.text.Layout layout;
        int i18;
        android.graphics.Paint.FontMetricsInt fontMetricsInt;
        int i19;
        this.ZpBGe2uQfcn8 = textPaint;
        this.giKS3J6vZuNy = truncateAt;
        this.fWTAfUmVKrZq = z;
        int length = charSequence.length();
        android.text.TextDirectionHeuristic giKS3J6vZuNy = defpackage.dn1.giKS3J6vZuNy(i2);
        android.text.Layout.Alignment alignment = defpackage.uj1.ZpBGe2uQfcn8;
        android.text.Layout.Alignment alignment2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? android.text.Layout.Alignment.ALIGN_NORMAL : defpackage.uj1.giKS3J6vZuNy : defpackage.uj1.ZpBGe2uQfcn8 : android.text.Layout.Alignment.ALIGN_CENTER : android.text.Layout.Alignment.ALIGN_OPPOSITE : android.text.Layout.Alignment.ALIGN_NORMAL;
        boolean z2 = (charSequence instanceof android.text.Spanned) && ((android.text.Spanned) charSequence).nextSpanTransition(-1, length, defpackage.o9.class) < length;
        android.os.Trace.beginSection("TextLayout:initLayout");
        try {
            android.text.BoringLayout.Metrics ZpBGe2uQfcn82 = xc0Var.ZpBGe2uQfcn8();
            double d = f;
            int ceil = (int) java.lang.Math.ceil(d);
            if (ZpBGe2uQfcn82 == null || xc0Var.fWTAfUmVKrZq() > f || z2) {
                this.fNwYGHIYeJcR = false;
                i9 = i3;
                textDirectionHeuristic = giKS3J6vZuNy;
                s0TASMVLSWD5 = defpackage.wc1.s0TASMVLSWD5(charSequence, textPaint, ceil, charSequence.length(), textDirectionHeuristic, alignment2, i9, truncateAt, (int) java.lang.Math.ceil(d), i8, z, i4, i5, i6, i7);
            } else {
                this.fNwYGHIYeJcR = true;
                if (ceil < 0) {
                    defpackage.f80.ZpBGe2uQfcn8("negative width");
                }
                if (ceil < 0) {
                    defpackage.f80.ZpBGe2uQfcn8("negative ellipsized width");
                }
                s0TASMVLSWD5 = android.os.Build.VERSION.SDK_INT >= 33 ? defpackage.Rl68HURFBtL3.WDYagTQQm9ns(charSequence, textPaint, ceil, alignment2, ZpBGe2uQfcn82, z, truncateAt, ceil) : new android.text.BoringLayout(charSequence, textPaint, ceil, alignment2, 1.0f, 0.0f, ZpBGe2uQfcn82, z, truncateAt, ceil);
                i9 = i3;
                textDirectionHeuristic = giKS3J6vZuNy;
            }
            this.oh71FJcDz6S2 = s0TASMVLSWD5;
            android.os.Trace.endSection();
            int min = java.lang.Math.min(s0TASMVLSWD5.getLineCount(), i9);
            this.QiMR8OkAhezm = min;
            int i20 = min - 1;
            this.JhCgjQRTAOCT = min >= i9 && (s0TASMVLSWD5.getEllipsisCount(i20) > 0 || s0TASMVLSWD5.getLineEnd(i20) != charSequence.length());
            if (s0TASMVLSWD5.getText() instanceof android.text.Spanned) {
                java.lang.CharSequence text = s0TASMVLSWD5.getText();
                text.getClass();
                if (defpackage.t80.VFeft99leXEK((android.text.Spanned) text, defpackage.mh0.class) || s0TASMVLSWD5.getText().length() <= 0) {
                    java.lang.CharSequence text2 = s0TASMVLSWD5.getText();
                    text2.getClass();
                    i10 = 0;
                    mh0VarArr = (defpackage.mh0[]) ((android.text.Spanned) text2).getSpans(0, s0TASMVLSWD5.getText().length(), defpackage.mh0.class);
                    this.T1fB7bDYiVJQ = mh0VarArr;
                    if (mh0VarArr != null) {
                        defpackage.mh0 mh0Var = mh0VarArr.length == 0 ? null : mh0VarArr[i10];
                        if (mh0Var != null) {
                            if (mh0Var.QiMR8OkAhezm) {
                                i11 = 2;
                                if (mh0Var.GE9mJIPrb8gP == 2) {
                                    i19 = 1;
                                    i12 = i19;
                                    if (mh0VarArr != null) {
                                        defpackage.mh0 mh0Var2 = mh0VarArr.length == 0 ? null : mh0VarArr[i10];
                                        if (mh0Var2 != null && mh0Var2.P05cfTpS5W5L && mh0Var2.GE9mJIPrb8gP == i11) {
                                            i13 = 1;
                                            if (i12 != 0 || i13 == 0) {
                                                long j3 = defpackage.dn1.giKS3J6vZuNy;
                                                if (z) {
                                                    c = ' ';
                                                    j = 4294967295L;
                                                    i14 = 1;
                                                    i15 = 33;
                                                } else if (this.fNwYGHIYeJcR) {
                                                    android.text.BoringLayout boringLayout = (android.text.BoringLayout) s0TASMVLSWD5;
                                                    i15 = 33;
                                                    if (android.os.Build.VERSION.SDK_INT >= 33) {
                                                        isFallbackLineSpacingEnabled2 = boringLayout.isFallbackLineSpacingEnabled();
                                                        i16 = isFallbackLineSpacingEnabled2;
                                                        if (i16 != 0) {
                                                            c = ' ';
                                                            j = 4294967295L;
                                                            i14 = 1;
                                                        } else {
                                                            android.text.TextPaint paint = s0TASMVLSWD5.getPaint();
                                                            java.lang.CharSequence text3 = s0TASMVLSWD5.getText();
                                                            c = ' ';
                                                            android.graphics.Rect ZVVdXbWmyCSK = defpackage.m90.ZVVdXbWmyCSK(paint, text3, s0TASMVLSWD5.getLineStart(i10), s0TASMVLSWD5.getLineEnd(i10));
                                                            int lineAscent = s0TASMVLSWD5.getLineAscent(i10);
                                                            j = 4294967295L;
                                                            int i21 = ZVVdXbWmyCSK.top;
                                                            int topPadding = i21 < lineAscent ? lineAscent - i21 : s0TASMVLSWD5.getTopPadding();
                                                            i14 = 1;
                                                            ZVVdXbWmyCSK = min != 1 ? defpackage.m90.ZVVdXbWmyCSK(paint, text3, s0TASMVLSWD5.getLineStart(i20), s0TASMVLSWD5.getLineEnd(i20)) : ZVVdXbWmyCSK;
                                                            int lineDescent = s0TASMVLSWD5.getLineDescent(i20);
                                                            int i22 = ZVVdXbWmyCSK.bottom;
                                                            int bottomPadding = i22 > lineDescent ? i22 - lineDescent : s0TASMVLSWD5.getBottomPadding();
                                                            if (topPadding != 0 || bottomPadding != 0) {
                                                                j3 = defpackage.dn1.ZpBGe2uQfcn8(topPadding, bottomPadding);
                                                            }
                                                        }
                                                    }
                                                    i16 = i10;
                                                    if (i16 != 0) {
                                                    }
                                                } else {
                                                    i15 = 33;
                                                    android.text.StaticLayout staticLayout = (android.text.StaticLayout) s0TASMVLSWD5;
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
                                                ZpBGe2uQfcn8 = defpackage.dn1.ZpBGe2uQfcn8(i12 != 0 ? i10 : (int) (j3 >> c), i13 != 0 ? i10 : (int) (j3 & j));
                                            } else {
                                                ZpBGe2uQfcn8 = defpackage.dn1.giKS3J6vZuNy;
                                                c = ' ';
                                                j = 4294967295L;
                                                i14 = 1;
                                                i15 = 33;
                                            }
                                            if (mh0VarArr != null) {
                                                int length2 = mh0VarArr.length;
                                                int i24 = i10;
                                                int i25 = i24;
                                                for (int i26 = i25; i26 < length2; i26++) {
                                                    defpackage.mh0 mh0Var3 = mh0VarArr[i26];
                                                    int i27 = mh0Var3.T1fB7bDYiVJQ;
                                                    i24 = i27 < 0 ? java.lang.Math.max(i24, java.lang.Math.abs(i27)) : i24;
                                                    int i28 = mh0Var3.XntWc4eZSQ8j;
                                                    if (i28 < 0) {
                                                        i25 = java.lang.Math.max(i24, java.lang.Math.abs(i28));
                                                    }
                                                }
                                                j2 = (i24 == 0 && i25 == 0) ? defpackage.dn1.giKS3J6vZuNy : defpackage.dn1.ZpBGe2uQfcn8(i24, i25);
                                            } else {
                                                j2 = defpackage.dn1.giKS3J6vZuNy;
                                            }
                                            this.P05cfTpS5W5L = java.lang.Math.max((int) (ZpBGe2uQfcn8 >> c), (int) (j2 >> c));
                                            this.e6mdH7fiFuta = java.lang.Math.max((int) (ZpBGe2uQfcn8 & j), (int) (j2 & j));
                                            android.text.TextPaint textPaint2 = this.ZpBGe2uQfcn8;
                                            defpackage.mh0[] mh0VarArr2 = this.T1fB7bDYiVJQ;
                                            i17 = this.QiMR8OkAhezm - i14;
                                            layout = this.oh71FJcDz6S2;
                                            if (layout.getLineStart(i17) == layout.getLineEnd(i17) || mh0VarArr2 == null || mh0VarArr2.length == 0) {
                                                i18 = i10;
                                                fontMetricsInt = null;
                                            } else {
                                                android.text.SpannableString spannableString = new android.text.SpannableString("\u200b");
                                                if (mh0VarArr2.length == 0) {
                                                    throw new java.util.NoSuchElementException("Array is empty.");
                                                }
                                                defpackage.mh0 mh0Var4 = mh0VarArr2[i10];
                                                spannableString.setSpan(new defpackage.mh0(mh0Var4.WDYagTQQm9ns, spannableString.length(), (i17 == 0 || !mh0Var4.P05cfTpS5W5L) ? mh0Var4.P05cfTpS5W5L : i10, mh0Var4.P05cfTpS5W5L, mh0Var4.e6mdH7fiFuta, mh0Var4.GE9mJIPrb8gP), i10, spannableString.length(), i15);
                                                i18 = i10;
                                                android.text.StaticLayout s0TASMVLSWD52 = defpackage.wc1.s0TASMVLSWD5(spannableString, textPaint2, Integer.MAX_VALUE, spannableString.length(), textDirectionHeuristic, defpackage.qc0.ZpBGe2uQfcn8, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, this.fWTAfUmVKrZq, 0, 0, 0, 0);
                                                fontMetricsInt = new android.graphics.Paint.FontMetricsInt();
                                                fontMetricsInt.ascent = s0TASMVLSWD52.getLineAscent(i18);
                                                fontMetricsInt.descent = s0TASMVLSWD52.getLineDescent(i18);
                                                fontMetricsInt.top = s0TASMVLSWD52.getLineTop(i18);
                                                fontMetricsInt.bottom = s0TASMVLSWD52.getLineBottom(i18);
                                            }
                                            this.gUjdnLbkVAaA = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (WDYagTQQm9ns(i20) - P05cfTpS5W5L(i20))) : i18;
                                            this.h3m55N1URyyK = fontMetricsInt;
                                            android.text.Layout layout2 = this.oh71FJcDz6S2;
                                            this.GE9mJIPrb8gP = defpackage.w60.blKFvluuDQOf(layout2, i20, layout2.getPaint());
                                            android.text.Layout layout3 = this.oh71FJcDz6S2;
                                            this.Ns0WNyEWdPsk = defpackage.w60.UmgHb6n58gfG(layout3, i20, layout3.getPaint());
                                        }
                                    }
                                    i13 = i10;
                                    if (i12 != 0) {
                                    }
                                    long j32 = defpackage.dn1.giKS3J6vZuNy;
                                    if (z) {
                                    }
                                    ZpBGe2uQfcn8 = defpackage.dn1.ZpBGe2uQfcn8(i12 != 0 ? i10 : (int) (j32 >> c), i13 != 0 ? i10 : (int) (j32 & j));
                                    if (mh0VarArr != null) {
                                    }
                                    this.P05cfTpS5W5L = java.lang.Math.max((int) (ZpBGe2uQfcn8 >> c), (int) (j2 >> c));
                                    this.e6mdH7fiFuta = java.lang.Math.max((int) (ZpBGe2uQfcn8 & j), (int) (j2 & j));
                                    android.text.TextPaint textPaint22 = this.ZpBGe2uQfcn8;
                                    defpackage.mh0[] mh0VarArr22 = this.T1fB7bDYiVJQ;
                                    i17 = this.QiMR8OkAhezm - i14;
                                    layout = this.oh71FJcDz6S2;
                                    if (layout.getLineStart(i17) == layout.getLineEnd(i17)) {
                                    }
                                    i18 = i10;
                                    fontMetricsInt = null;
                                    this.gUjdnLbkVAaA = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (WDYagTQQm9ns(i20) - P05cfTpS5W5L(i20))) : i18;
                                    this.h3m55N1URyyK = fontMetricsInt;
                                    android.text.Layout layout22 = this.oh71FJcDz6S2;
                                    this.GE9mJIPrb8gP = defpackage.w60.blKFvluuDQOf(layout22, i20, layout22.getPaint());
                                    android.text.Layout layout32 = this.oh71FJcDz6S2;
                                    this.Ns0WNyEWdPsk = defpackage.w60.UmgHb6n58gfG(layout32, i20, layout32.getPaint());
                                }
                            } else {
                                i11 = 2;
                            }
                            i19 = i10;
                            i12 = i19;
                            if (mh0VarArr != null) {
                            }
                            i13 = i10;
                            if (i12 != 0) {
                            }
                            long j322 = defpackage.dn1.giKS3J6vZuNy;
                            if (z) {
                            }
                            ZpBGe2uQfcn8 = defpackage.dn1.ZpBGe2uQfcn8(i12 != 0 ? i10 : (int) (j322 >> c), i13 != 0 ? i10 : (int) (j322 & j));
                            if (mh0VarArr != null) {
                            }
                            this.P05cfTpS5W5L = java.lang.Math.max((int) (ZpBGe2uQfcn8 >> c), (int) (j2 >> c));
                            this.e6mdH7fiFuta = java.lang.Math.max((int) (ZpBGe2uQfcn8 & j), (int) (j2 & j));
                            android.text.TextPaint textPaint222 = this.ZpBGe2uQfcn8;
                            defpackage.mh0[] mh0VarArr222 = this.T1fB7bDYiVJQ;
                            i17 = this.QiMR8OkAhezm - i14;
                            layout = this.oh71FJcDz6S2;
                            if (layout.getLineStart(i17) == layout.getLineEnd(i17)) {
                            }
                            i18 = i10;
                            fontMetricsInt = null;
                            this.gUjdnLbkVAaA = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (WDYagTQQm9ns(i20) - P05cfTpS5W5L(i20))) : i18;
                            this.h3m55N1URyyK = fontMetricsInt;
                            android.text.Layout layout222 = this.oh71FJcDz6S2;
                            this.GE9mJIPrb8gP = defpackage.w60.blKFvluuDQOf(layout222, i20, layout222.getPaint());
                            android.text.Layout layout322 = this.oh71FJcDz6S2;
                            this.Ns0WNyEWdPsk = defpackage.w60.UmgHb6n58gfG(layout322, i20, layout322.getPaint());
                        }
                    }
                    i11 = 2;
                    i12 = i10;
                    if (mh0VarArr != null) {
                    }
                    i13 = i10;
                    if (i12 != 0) {
                    }
                    long j3222 = defpackage.dn1.giKS3J6vZuNy;
                    if (z) {
                    }
                    ZpBGe2uQfcn8 = defpackage.dn1.ZpBGe2uQfcn8(i12 != 0 ? i10 : (int) (j3222 >> c), i13 != 0 ? i10 : (int) (j3222 & j));
                    if (mh0VarArr != null) {
                    }
                    this.P05cfTpS5W5L = java.lang.Math.max((int) (ZpBGe2uQfcn8 >> c), (int) (j2 >> c));
                    this.e6mdH7fiFuta = java.lang.Math.max((int) (ZpBGe2uQfcn8 & j), (int) (j2 & j));
                    android.text.TextPaint textPaint2222 = this.ZpBGe2uQfcn8;
                    defpackage.mh0[] mh0VarArr2222 = this.T1fB7bDYiVJQ;
                    i17 = this.QiMR8OkAhezm - i14;
                    layout = this.oh71FJcDz6S2;
                    if (layout.getLineStart(i17) == layout.getLineEnd(i17)) {
                    }
                    i18 = i10;
                    fontMetricsInt = null;
                    this.gUjdnLbkVAaA = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (WDYagTQQm9ns(i20) - P05cfTpS5W5L(i20))) : i18;
                    this.h3m55N1URyyK = fontMetricsInt;
                    android.text.Layout layout2222 = this.oh71FJcDz6S2;
                    this.GE9mJIPrb8gP = defpackage.w60.blKFvluuDQOf(layout2222, i20, layout2222.getPaint());
                    android.text.Layout layout3222 = this.oh71FJcDz6S2;
                    this.Ns0WNyEWdPsk = defpackage.w60.UmgHb6n58gfG(layout3222, i20, layout3222.getPaint());
                }
            }
            mh0VarArr = null;
            i10 = 0;
            this.T1fB7bDYiVJQ = mh0VarArr;
            if (mh0VarArr != null) {
            }
            i11 = 2;
            i12 = i10;
            if (mh0VarArr != null) {
            }
            i13 = i10;
            if (i12 != 0) {
            }
            long j32222 = defpackage.dn1.giKS3J6vZuNy;
            if (z) {
            }
            ZpBGe2uQfcn8 = defpackage.dn1.ZpBGe2uQfcn8(i12 != 0 ? i10 : (int) (j32222 >> c), i13 != 0 ? i10 : (int) (j32222 & j));
            if (mh0VarArr != null) {
            }
            this.P05cfTpS5W5L = java.lang.Math.max((int) (ZpBGe2uQfcn8 >> c), (int) (j2 >> c));
            this.e6mdH7fiFuta = java.lang.Math.max((int) (ZpBGe2uQfcn8 & j), (int) (j2 & j));
            android.text.TextPaint textPaint22222 = this.ZpBGe2uQfcn8;
            defpackage.mh0[] mh0VarArr22222 = this.T1fB7bDYiVJQ;
            i17 = this.QiMR8OkAhezm - i14;
            layout = this.oh71FJcDz6S2;
            if (layout.getLineStart(i17) == layout.getLineEnd(i17)) {
            }
            i18 = i10;
            fontMetricsInt = null;
            this.gUjdnLbkVAaA = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (WDYagTQQm9ns(i20) - P05cfTpS5W5L(i20))) : i18;
            this.h3m55N1URyyK = fontMetricsInt;
            android.text.Layout layout22222 = this.oh71FJcDz6S2;
            this.GE9mJIPrb8gP = defpackage.w60.blKFvluuDQOf(layout22222, i20, layout22222.getPaint());
            android.text.Layout layout32222 = this.oh71FJcDz6S2;
            this.Ns0WNyEWdPsk = defpackage.w60.UmgHb6n58gfG(layout32222, i20, layout32222.getPaint());
        } catch (java.lang.Throwable th) {
            android.os.Trace.endSection();
            throw th;
        }
    }

    public final float GE9mJIPrb8gP(int i, boolean z) {
        return giKS3J6vZuNy(QiMR8OkAhezm(i)) + fWTAfUmVKrZq().e6mdH7fiFuta(i, false, z);
    }

    public final float JhCgjQRTAOCT(int i) {
        android.graphics.Paint.FontMetricsInt fontMetricsInt;
        return this.P05cfTpS5W5L + ((i != this.QiMR8OkAhezm + (-1) || (fontMetricsInt = this.h3m55N1URyyK) == null) ? this.oh71FJcDz6S2.getLineBaseline(i) : P05cfTpS5W5L(i) - fontMetricsInt.ascent);
    }

    public final defpackage.rw0 Ns0WNyEWdPsk() {
        defpackage.rw0 rw0Var = this.WDYagTQQm9ns;
        if (rw0Var != null) {
            return rw0Var;
        }
        android.text.Layout layout = this.oh71FJcDz6S2;
        defpackage.rw0 rw0Var2 = new defpackage.rw0(layout.getText(), layout.getText().length(), this.ZpBGe2uQfcn8.getTextLocale());
        this.WDYagTQQm9ns = rw0Var2;
        return rw0Var2;
    }

    public final float P05cfTpS5W5L(int i) {
        return this.oh71FJcDz6S2.getLineTop(i) + (i == 0 ? 0 : this.P05cfTpS5W5L);
    }

    public final int QiMR8OkAhezm(int i) {
        int i2 = this.QiMR8OkAhezm;
        if (i2 <= 0) {
            return 0;
        }
        int lineForOffset = this.oh71FJcDz6S2.getLineForOffset(i);
        int i3 = i2 - 1;
        return lineForOffset > i3 ? i3 : lineForOffset;
    }

    public final float WDYagTQQm9ns(int i) {
        android.graphics.Paint.FontMetricsInt fontMetricsInt;
        int i2 = this.QiMR8OkAhezm;
        int i3 = i2 - 1;
        android.text.Layout layout = this.oh71FJcDz6S2;
        if (i != i3 || (fontMetricsInt = this.h3m55N1URyyK) == null) {
            return this.P05cfTpS5W5L + layout.getLineBottom(i) + (i == i2 + (-1) ? this.e6mdH7fiFuta : 0);
        }
        return layout.getLineBottom(i - 1) + fontMetricsInt.bottom;
    }

    public final int ZpBGe2uQfcn8() {
        boolean z = this.JhCgjQRTAOCT;
        android.text.Layout layout = this.oh71FJcDz6S2;
        return (z ? layout.getLineBottom(this.QiMR8OkAhezm - 1) : layout.getHeight()) + this.P05cfTpS5W5L + this.e6mdH7fiFuta + this.gUjdnLbkVAaA;
    }

    public final float e6mdH7fiFuta(int i, boolean z) {
        return giKS3J6vZuNy(QiMR8OkAhezm(i)) + fWTAfUmVKrZq().e6mdH7fiFuta(i, true, z);
    }

    public final defpackage.x8 fWTAfUmVKrZq() {
        defpackage.x8 x8Var = this.WmetiUbpKU9I;
        if (x8Var != null) {
            return x8Var;
        }
        defpackage.x8 x8Var2 = new defpackage.x8(this.oh71FJcDz6S2);
        this.WmetiUbpKU9I = x8Var2;
        return x8Var2;
    }

    public final float giKS3J6vZuNy(int i) {
        if (i == this.QiMR8OkAhezm - 1) {
            return this.GE9mJIPrb8gP + this.Ns0WNyEWdPsk;
        }
        return 0.0f;
    }

    public final int oh71FJcDz6S2(int i) {
        java.lang.ThreadLocal threadLocal = defpackage.dn1.ZpBGe2uQfcn8;
        android.text.Layout layout = this.oh71FJcDz6S2;
        return (layout.getEllipsisCount(i) <= 0 || this.giKS3J6vZuNy != android.text.TextUtils.TruncateAt.END) ? layout.getLineEnd(i) : layout.getText().length();
    }
}
