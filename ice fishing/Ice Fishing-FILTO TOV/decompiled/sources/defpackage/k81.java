package defpackage;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class k81 {
    public final int AvO7iQsrTN;
    public final Paint.FontMetricsInt E7jCp8Ls;
    public final int EljAMC1QTz;
    public final TextPaint GWasM1elztuh;
    public final float JFJ3QoxA;
    public final Layout OOA6hdeuvCS;
    public v5 WIEu4Ya2g8;
    public final boolean X1lG3V04pd;
    public final int XnEVoBF0td1l;
    public final TextUtils.TruncateAt Yi7zF1RB1;
    public final int encWxUiV2;
    public final Rect iwATDS1i01k = new Rect();
    public final float mOu10nynGul;
    public final boolean rQPn8YBR;
    public final ka0[] uFEq9NpZ;
    public final boolean xqGvceK5x;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0295 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0326  */
    /* JADX WARN: Type inference failed for: r15v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r25v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18, types: [android.graphics.Paint$FontMetricsInt] */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r8v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v18, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k81(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, u50 u50Var) {
        int i9;
        TextDirectionHeuristic textDirectionHeuristic;
        Layout JFJ3QoxA;
        ka0[] ka0VarArr;
        int i10;
        int i11;
        int i12;
        int i13;
        Throwable th;
        char c;
        long j;
        int i14;
        int i15;
        long GWasM1elztuh;
        int i16;
        ?? isFallbackLineSpacingEnabled;
        ?? isFallbackLineSpacingEnabled2;
        long j2;
        int i17;
        Layout layout;
        int i18;
        ?? r6;
        int i19;
        this.GWasM1elztuh = textPaint;
        this.Yi7zF1RB1 = truncateAt;
        this.X1lG3V04pd = z;
        int length = charSequence.length();
        TextDirectionHeuristic Yi7zF1RB1 = n81.Yi7zF1RB1(i2);
        Layout.Alignment alignment = y71.GWasM1elztuh;
        Layout.Alignment alignment2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? Layout.Alignment.ALIGN_NORMAL : y71.Yi7zF1RB1 : y71.GWasM1elztuh : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        boolean z2 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, j6.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics GWasM1elztuh2 = u50Var.GWasM1elztuh();
            double d = f;
            int ceil = (int) Math.ceil(d);
            if (GWasM1elztuh2 == null || u50Var.X1lG3V04pd() > f || z2) {
                this.rQPn8YBR = false;
                i9 = i3;
                textDirectionHeuristic = Yi7zF1RB1;
                JFJ3QoxA = l60.JFJ3QoxA(charSequence, textPaint, ceil, charSequence.length(), textDirectionHeuristic, alignment2, i9, truncateAt, (int) Math.ceil(d), i8, z, i4, i5, i6, i7);
            } else {
                this.rQPn8YBR = true;
                if (ceil < 0) {
                    u10.GWasM1elztuh("negative width");
                }
                if (ceil < 0) {
                    u10.GWasM1elztuh("negative ellipsized width");
                }
                JFJ3QoxA = Build.VERSION.SDK_INT >= 33 ? NyNgffpi.OOA6hdeuvCS(charSequence, textPaint, ceil, alignment2, GWasM1elztuh2, z, truncateAt, ceil) : new BoringLayout(charSequence, textPaint, ceil, alignment2, 1.0f, 0.0f, GWasM1elztuh2, z, truncateAt, ceil);
                i9 = i3;
                textDirectionHeuristic = Yi7zF1RB1;
            }
            this.OOA6hdeuvCS = JFJ3QoxA;
            Trace.endSection();
            int min = Math.min(JFJ3QoxA.getLineCount(), i9);
            this.EljAMC1QTz = min;
            int i20 = min - 1;
            this.xqGvceK5x = min >= i9 && (JFJ3QoxA.getEllipsisCount(i20) > 0 || JFJ3QoxA.getLineEnd(i20) != charSequence.length());
            if (JFJ3QoxA.getText() instanceof Spanned) {
                CharSequence text = JFJ3QoxA.getText();
                text.getClass();
                if (q70.jivtDDk9H((Spanned) text, ka0.class) || JFJ3QoxA.getText().length() <= 0) {
                    CharSequence text2 = JFJ3QoxA.getText();
                    text2.getClass();
                    i10 = 0;
                    ka0VarArr = (ka0[]) ((Spanned) text2).getSpans(0, JFJ3QoxA.getText().length(), ka0.class);
                    this.uFEq9NpZ = ka0VarArr;
                    if (ka0VarArr != null) {
                        ka0 ka0Var = ka0VarArr.length == 0 ? null : ka0VarArr[i10];
                        if (ka0Var != null) {
                            if (ka0Var.AvO7iQsrTN) {
                                i11 = 2;
                                if (ka0Var.JFJ3QoxA == 2) {
                                    i19 = 1;
                                    i12 = i19;
                                    if (ka0VarArr != null) {
                                        ka0 ka0Var2 = ka0VarArr.length == 0 ? null : ka0VarArr[i10];
                                        if (ka0Var2 != null && ka0Var2.encWxUiV2 && ka0Var2.JFJ3QoxA == i11) {
                                            i13 = 1;
                                            if (i12 != 0 || i13 == 0) {
                                                long j3 = n81.Yi7zF1RB1;
                                                if (z) {
                                                    th = null;
                                                    c = ' ';
                                                    j = 4294967295L;
                                                    i14 = 1;
                                                    i15 = 33;
                                                } else if (this.rQPn8YBR) {
                                                    BoringLayout boringLayout = (BoringLayout) JFJ3QoxA;
                                                    i15 = 33;
                                                    if (Build.VERSION.SDK_INT >= 33) {
                                                        isFallbackLineSpacingEnabled2 = boringLayout.isFallbackLineSpacingEnabled();
                                                        i16 = isFallbackLineSpacingEnabled2;
                                                        if (i16 != 0) {
                                                            th = null;
                                                            c = ' ';
                                                            j = 4294967295L;
                                                            i14 = 1;
                                                        } else {
                                                            TextPaint paint = JFJ3QoxA.getPaint();
                                                            CharSequence text3 = JFJ3QoxA.getText();
                                                            th = null;
                                                            c = ' ';
                                                            Rect iwATDS1i01k = l60.iwATDS1i01k(paint, text3, JFJ3QoxA.getLineStart(i10), JFJ3QoxA.getLineEnd(i10));
                                                            int lineAscent = JFJ3QoxA.getLineAscent(i10);
                                                            j = 4294967295L;
                                                            int i21 = iwATDS1i01k.top;
                                                            int topPadding = i21 < lineAscent ? lineAscent - i21 : JFJ3QoxA.getTopPadding();
                                                            i14 = 1;
                                                            iwATDS1i01k = min != 1 ? l60.iwATDS1i01k(paint, text3, JFJ3QoxA.getLineStart(i20), JFJ3QoxA.getLineEnd(i20)) : iwATDS1i01k;
                                                            int lineDescent = JFJ3QoxA.getLineDescent(i20);
                                                            int i22 = iwATDS1i01k.bottom;
                                                            int bottomPadding = i22 > lineDescent ? i22 - lineDescent : JFJ3QoxA.getBottomPadding();
                                                            if (topPadding != 0 || bottomPadding != 0) {
                                                                j3 = n81.GWasM1elztuh(topPadding, bottomPadding);
                                                            }
                                                        }
                                                    }
                                                    i16 = i10;
                                                    if (i16 != 0) {
                                                    }
                                                } else {
                                                    i15 = 33;
                                                    StaticLayout staticLayout = (StaticLayout) JFJ3QoxA;
                                                    int i23 = Build.VERSION.SDK_INT;
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
                                                GWasM1elztuh = n81.GWasM1elztuh(i12 != 0 ? i10 : (int) (j3 >> c), i13 != 0 ? i10 : (int) (j3 & j));
                                            } else {
                                                GWasM1elztuh = n81.Yi7zF1RB1;
                                                th = null;
                                                c = ' ';
                                                j = 4294967295L;
                                                i14 = 1;
                                                i15 = 33;
                                            }
                                            if (ka0VarArr != null) {
                                                int length2 = ka0VarArr.length;
                                                int i24 = i10;
                                                int i25 = i24;
                                                for (int i26 = i25; i26 < length2; i26++) {
                                                    ka0 ka0Var3 = ka0VarArr[i26];
                                                    int i27 = ka0Var3.iwATDS1i01k;
                                                    i24 = i27 < 0 ? Math.max(i24, Math.abs(i27)) : i24;
                                                    int i28 = ka0Var3.WIEu4Ya2g8;
                                                    if (i28 < 0) {
                                                        i25 = Math.max(i24, Math.abs(i28));
                                                    }
                                                }
                                                j2 = (i24 == 0 && i25 == 0) ? n81.Yi7zF1RB1 : n81.GWasM1elztuh(i24, i25);
                                            } else {
                                                j2 = n81.Yi7zF1RB1;
                                            }
                                            this.AvO7iQsrTN = Math.max((int) (GWasM1elztuh >> c), (int) (j2 >> c));
                                            this.encWxUiV2 = Math.max((int) (GWasM1elztuh & j), (int) (j2 & j));
                                            TextPaint textPaint2 = this.GWasM1elztuh;
                                            ka0[] ka0VarArr2 = this.uFEq9NpZ;
                                            i17 = this.EljAMC1QTz - i14;
                                            layout = this.OOA6hdeuvCS;
                                            if (layout.getLineStart(i17) == layout.getLineEnd(i17) || ka0VarArr2 == null || ka0VarArr2.length == 0) {
                                                i18 = i10;
                                                r6 = th;
                                            } else {
                                                SpannableString spannableString = new SpannableString("\u200b");
                                                if (ka0VarArr2.length == 0) {
                                                    o4.AvO7iQsrTN("Array is empty.");
                                                    throw th;
                                                }
                                                ka0 ka0Var4 = ka0VarArr2[i10];
                                                spannableString.setSpan(new ka0(ka0Var4.OOA6hdeuvCS, spannableString.length(), (i17 == 0 || !ka0Var4.encWxUiV2) ? ka0Var4.encWxUiV2 : i10, ka0Var4.encWxUiV2, ka0Var4.mOu10nynGul, ka0Var4.JFJ3QoxA), i10, spannableString.length(), i15);
                                                i18 = i10;
                                                StaticLayout JFJ3QoxA2 = l60.JFJ3QoxA(spannableString, textPaint2, Integer.MAX_VALUE, spannableString.length(), textDirectionHeuristic, m50.GWasM1elztuh, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, this.X1lG3V04pd, 0, 0, 0, 0);
                                                Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
                                                fontMetricsInt.ascent = JFJ3QoxA2.getLineAscent(i18);
                                                fontMetricsInt.descent = JFJ3QoxA2.getLineDescent(i18);
                                                fontMetricsInt.top = JFJ3QoxA2.getLineTop(i18);
                                                fontMetricsInt.bottom = JFJ3QoxA2.getLineBottom(i18);
                                                r6 = fontMetricsInt;
                                            }
                                            this.XnEVoBF0td1l = r6 != 0 ? ((Paint.FontMetricsInt) r6).bottom - ((int) (xqGvceK5x(i20) - AvO7iQsrTN(i20))) : i18;
                                            this.E7jCp8Ls = r6;
                                            Layout layout2 = this.OOA6hdeuvCS;
                                            this.mOu10nynGul = vc0.Y6hRI1cF8(layout2, i20, layout2.getPaint());
                                            Layout layout3 = this.OOA6hdeuvCS;
                                            this.JFJ3QoxA = vc0.cilMamHF(layout3, i20, layout3.getPaint());
                                        }
                                    }
                                    i13 = i10;
                                    if (i12 != 0) {
                                    }
                                    long j32 = n81.Yi7zF1RB1;
                                    if (z) {
                                    }
                                    GWasM1elztuh = n81.GWasM1elztuh(i12 != 0 ? i10 : (int) (j32 >> c), i13 != 0 ? i10 : (int) (j32 & j));
                                    if (ka0VarArr != null) {
                                    }
                                    this.AvO7iQsrTN = Math.max((int) (GWasM1elztuh >> c), (int) (j2 >> c));
                                    this.encWxUiV2 = Math.max((int) (GWasM1elztuh & j), (int) (j2 & j));
                                    TextPaint textPaint22 = this.GWasM1elztuh;
                                    ka0[] ka0VarArr22 = this.uFEq9NpZ;
                                    i17 = this.EljAMC1QTz - i14;
                                    layout = this.OOA6hdeuvCS;
                                    if (layout.getLineStart(i17) == layout.getLineEnd(i17)) {
                                    }
                                    i18 = i10;
                                    r6 = th;
                                    this.XnEVoBF0td1l = r6 != 0 ? ((Paint.FontMetricsInt) r6).bottom - ((int) (xqGvceK5x(i20) - AvO7iQsrTN(i20))) : i18;
                                    this.E7jCp8Ls = r6;
                                    Layout layout22 = this.OOA6hdeuvCS;
                                    this.mOu10nynGul = vc0.Y6hRI1cF8(layout22, i20, layout22.getPaint());
                                    Layout layout32 = this.OOA6hdeuvCS;
                                    this.JFJ3QoxA = vc0.cilMamHF(layout32, i20, layout32.getPaint());
                                }
                            } else {
                                i11 = 2;
                            }
                            i19 = i10;
                            i12 = i19;
                            if (ka0VarArr != null) {
                            }
                            i13 = i10;
                            if (i12 != 0) {
                            }
                            long j322 = n81.Yi7zF1RB1;
                            if (z) {
                            }
                            GWasM1elztuh = n81.GWasM1elztuh(i12 != 0 ? i10 : (int) (j322 >> c), i13 != 0 ? i10 : (int) (j322 & j));
                            if (ka0VarArr != null) {
                            }
                            this.AvO7iQsrTN = Math.max((int) (GWasM1elztuh >> c), (int) (j2 >> c));
                            this.encWxUiV2 = Math.max((int) (GWasM1elztuh & j), (int) (j2 & j));
                            TextPaint textPaint222 = this.GWasM1elztuh;
                            ka0[] ka0VarArr222 = this.uFEq9NpZ;
                            i17 = this.EljAMC1QTz - i14;
                            layout = this.OOA6hdeuvCS;
                            if (layout.getLineStart(i17) == layout.getLineEnd(i17)) {
                            }
                            i18 = i10;
                            r6 = th;
                            this.XnEVoBF0td1l = r6 != 0 ? ((Paint.FontMetricsInt) r6).bottom - ((int) (xqGvceK5x(i20) - AvO7iQsrTN(i20))) : i18;
                            this.E7jCp8Ls = r6;
                            Layout layout222 = this.OOA6hdeuvCS;
                            this.mOu10nynGul = vc0.Y6hRI1cF8(layout222, i20, layout222.getPaint());
                            Layout layout322 = this.OOA6hdeuvCS;
                            this.JFJ3QoxA = vc0.cilMamHF(layout322, i20, layout322.getPaint());
                        }
                    }
                    i11 = 2;
                    i12 = i10;
                    if (ka0VarArr != null) {
                    }
                    i13 = i10;
                    if (i12 != 0) {
                    }
                    long j3222 = n81.Yi7zF1RB1;
                    if (z) {
                    }
                    GWasM1elztuh = n81.GWasM1elztuh(i12 != 0 ? i10 : (int) (j3222 >> c), i13 != 0 ? i10 : (int) (j3222 & j));
                    if (ka0VarArr != null) {
                    }
                    this.AvO7iQsrTN = Math.max((int) (GWasM1elztuh >> c), (int) (j2 >> c));
                    this.encWxUiV2 = Math.max((int) (GWasM1elztuh & j), (int) (j2 & j));
                    TextPaint textPaint2222 = this.GWasM1elztuh;
                    ka0[] ka0VarArr2222 = this.uFEq9NpZ;
                    i17 = this.EljAMC1QTz - i14;
                    layout = this.OOA6hdeuvCS;
                    if (layout.getLineStart(i17) == layout.getLineEnd(i17)) {
                    }
                    i18 = i10;
                    r6 = th;
                    this.XnEVoBF0td1l = r6 != 0 ? ((Paint.FontMetricsInt) r6).bottom - ((int) (xqGvceK5x(i20) - AvO7iQsrTN(i20))) : i18;
                    this.E7jCp8Ls = r6;
                    Layout layout2222 = this.OOA6hdeuvCS;
                    this.mOu10nynGul = vc0.Y6hRI1cF8(layout2222, i20, layout2222.getPaint());
                    Layout layout3222 = this.OOA6hdeuvCS;
                    this.JFJ3QoxA = vc0.cilMamHF(layout3222, i20, layout3222.getPaint());
                }
            }
            ka0VarArr = null;
            i10 = 0;
            this.uFEq9NpZ = ka0VarArr;
            if (ka0VarArr != null) {
            }
            i11 = 2;
            i12 = i10;
            if (ka0VarArr != null) {
            }
            i13 = i10;
            if (i12 != 0) {
            }
            long j32222 = n81.Yi7zF1RB1;
            if (z) {
            }
            GWasM1elztuh = n81.GWasM1elztuh(i12 != 0 ? i10 : (int) (j32222 >> c), i13 != 0 ? i10 : (int) (j32222 & j));
            if (ka0VarArr != null) {
            }
            this.AvO7iQsrTN = Math.max((int) (GWasM1elztuh >> c), (int) (j2 >> c));
            this.encWxUiV2 = Math.max((int) (GWasM1elztuh & j), (int) (j2 & j));
            TextPaint textPaint22222 = this.GWasM1elztuh;
            ka0[] ka0VarArr22222 = this.uFEq9NpZ;
            i17 = this.EljAMC1QTz - i14;
            layout = this.OOA6hdeuvCS;
            if (layout.getLineStart(i17) == layout.getLineEnd(i17)) {
            }
            i18 = i10;
            r6 = th;
            this.XnEVoBF0td1l = r6 != 0 ? ((Paint.FontMetricsInt) r6).bottom - ((int) (xqGvceK5x(i20) - AvO7iQsrTN(i20))) : i18;
            this.E7jCp8Ls = r6;
            Layout layout22222 = this.OOA6hdeuvCS;
            this.mOu10nynGul = vc0.Y6hRI1cF8(layout22222, i20, layout22222.getPaint());
            Layout layout32222 = this.OOA6hdeuvCS;
            this.JFJ3QoxA = vc0.cilMamHF(layout32222, i20, layout32222.getPaint());
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final float AvO7iQsrTN(int i) {
        return this.OOA6hdeuvCS.getLineTop(i) + (i == 0 ? 0 : this.AvO7iQsrTN);
    }

    public final int EljAMC1QTz(int i) {
        int i2 = this.EljAMC1QTz;
        if (i2 <= 0) {
            return 0;
        }
        int lineForOffset = this.OOA6hdeuvCS.getLineForOffset(i);
        int i3 = i2 - 1;
        return lineForOffset > i3 ? i3 : lineForOffset;
    }

    public final int GWasM1elztuh() {
        boolean z = this.xqGvceK5x;
        Layout layout = this.OOA6hdeuvCS;
        return (z ? layout.getLineBottom(this.EljAMC1QTz - 1) : layout.getHeight()) + this.AvO7iQsrTN + this.encWxUiV2 + this.XnEVoBF0td1l;
    }

    public final int OOA6hdeuvCS(int i) {
        ThreadLocal threadLocal = n81.GWasM1elztuh;
        Layout layout = this.OOA6hdeuvCS;
        return (layout.getEllipsisCount(i) <= 0 || this.Yi7zF1RB1 != TextUtils.TruncateAt.END) ? layout.getLineEnd(i) : layout.getText().length();
    }

    public final float X1lG3V04pd(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.AvO7iQsrTN + ((i != this.EljAMC1QTz + (-1) || (fontMetricsInt = this.E7jCp8Ls) == null) ? this.OOA6hdeuvCS.getLineBaseline(i) : AvO7iQsrTN(i) - fontMetricsInt.ascent);
    }

    public final v5 Yi7zF1RB1() {
        v5 v5Var = this.WIEu4Ya2g8;
        if (v5Var != null) {
            return v5Var;
        }
        v5 v5Var2 = new v5(this.OOA6hdeuvCS);
        this.WIEu4Ya2g8 = v5Var2;
        return v5Var2;
    }

    public final float encWxUiV2(int i, boolean z) {
        return (EljAMC1QTz(i) == this.EljAMC1QTz - 1 ? this.mOu10nynGul + this.JFJ3QoxA : 0.0f) + Yi7zF1RB1().encWxUiV2(i, true, z);
    }

    public final float mOu10nynGul(int i, boolean z) {
        return (EljAMC1QTz(i) == this.EljAMC1QTz + (-1) ? this.mOu10nynGul + this.JFJ3QoxA : 0.0f) + Yi7zF1RB1().encWxUiV2(i, false, z);
    }

    public final float xqGvceK5x(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        int i2 = this.EljAMC1QTz;
        int i3 = i2 - 1;
        Layout layout = this.OOA6hdeuvCS;
        if (i != i3 || (fontMetricsInt = this.E7jCp8Ls) == null) {
            return this.AvO7iQsrTN + layout.getLineBottom(i) + (i == i2 + (-1) ? this.encWxUiV2 : 0);
        }
        return layout.getLineBottom(i - 1) + fontMetricsInt.bottom;
    }
}
