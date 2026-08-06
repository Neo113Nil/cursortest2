package defpackage;

import android.graphics.Canvas;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class c1 {
    public final List EljAMC1QTz;
    public final f1 GWasM1elztuh;
    public final CharSequence OOA6hdeuvCS;
    public final long X1lG3V04pd;
    public final int Yi7zF1RB1;
    public final k81 xqGvceK5x;

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
    public c1(f1 f1Var, int i, int i2, long j) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        w41 w41Var;
        int i10;
        int i11;
        int i12;
        char c;
        w41 w41Var2;
        TextUtils.TruncateAt truncateAt;
        TextUtils.TruncateAt truncateAt2;
        k81 GWasM1elztuh;
        int i13;
        c1 c1Var;
        int i14;
        int i15;
        int i16;
        Layout layout;
        w11[] w11VarArr;
        CharSequence charSequence;
        List list;
        kt0 kt0Var;
        float mOu10nynGul;
        int X1lG3V04pd;
        float encWxUiV2;
        int X1lG3V04pd2;
        int i17;
        this.GWasM1elztuh = f1Var;
        this.Yi7zF1RB1 = i;
        this.X1lG3V04pd = j;
        if (eg.mOu10nynGul(j) != 0 || eg.JFJ3QoxA(j) != 0) {
            u10.GWasM1elztuh("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i < 1) {
            u10.GWasM1elztuh("maxLines should be greater than 0");
        }
        y81 y81Var = f1Var.Yi7zF1RB1;
        CharSequence charSequence2 = f1Var.encWxUiV2;
        if (i2 == 2) {
            i3 = 0;
            if (!a91.GWasM1elztuh(y81Var.GWasM1elztuh.encWxUiV2, o50.WRKkgoJXwDn(0)) && !a91.GWasM1elztuh(y81Var.GWasM1elztuh.encWxUiV2, a91.X1lG3V04pd) && (i17 = y81Var.Yi7zF1RB1.GWasM1elztuh) != 0 && i17 != 5 && i17 != 4 && charSequence2.length() != 0) {
                Spannable spannable = charSequence2 instanceof Spannable ? (Spannable) charSequence2 : null;
                spannable = spannable == null ? new SpannableString(charSequence2) : spannable;
                if (!q70.jivtDDk9H(spannable, r00.class)) {
                    spannable.setSpan(new r00(), spannable.length() - 1, spannable.length() - 1, 33);
                }
                charSequence2 = spannable;
            }
        } else {
            i3 = 0;
        }
        CharSequence charSequence3 = charSequence2;
        this.OOA6hdeuvCS = charSequence3;
        yn0 yn0Var = y81Var.Yi7zF1RB1;
        w41 w41Var3 = y81Var.GWasM1elztuh;
        int i18 = yn0Var.GWasM1elztuh;
        int i19 = 3;
        int i20 = i18 == 1 ? 3 : i18 == 2 ? 4 : i18 == 3 ? 2 : (i18 != 5 && i18 == 6) ? 1 : i3;
        int i21 = i18 == 4 ? 1 : i3;
        int i22 = yn0Var.encWxUiV2 == 2 ? Build.VERSION.SDK_INT <= 32 ? 2 : 4 : i3;
        int i23 = yn0Var.AvO7iQsrTN;
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
                        w41Var = w41Var3;
                        i10 = i20;
                        i11 = 1;
                        if (i2 != i9) {
                            truncateAt2 = TextUtils.TruncateAt.END;
                        } else if (i2 == 5) {
                            truncateAt2 = TextUtils.TruncateAt.MIDDLE;
                        } else {
                            if (i2 != 4) {
                                i12 = i22;
                                c = ' ';
                                w41Var2 = w41Var;
                                truncateAt = null;
                                GWasM1elztuh = GWasM1elztuh(i10, i5, truncateAt, i, i12, i6, i19, i11, charSequence3);
                                Layout layout2 = GWasM1elztuh.OOA6hdeuvCS;
                                i13 = i10;
                                if (Build.VERSION.SDK_INT < 35 || f1Var.AvO7iQsrTN.getLetterSpacing() == 0.0f || (!(i2 == 4 || i2 == 5) || layout2.getEllipsisCount(0) <= 0)) {
                                    c1Var = this;
                                    i14 = i;
                                    i15 = i13;
                                    i16 = 2;
                                } else {
                                    int ellipsisStart = layout2.getEllipsisStart(0);
                                    i16 = 2;
                                    CharSequence[] charSequenceArr = {charSequence3.subSequence(0, ellipsisStart), "…", charSequence3.subSequence(layout2.getEllipsisCount(0) + ellipsisStart, charSequence3.length())};
                                    c1Var = this;
                                    i14 = i;
                                    i15 = i13;
                                    GWasM1elztuh = c1Var.GWasM1elztuh(i15, i5, truncateAt, i14, i12, i6, i19, i11, TextUtils.concat(charSequenceArr));
                                }
                                int i25 = GWasM1elztuh.EljAMC1QTz;
                                if (i2 == i16 || GWasM1elztuh.GWasM1elztuh() <= eg.AvO7iQsrTN(j) || i14 <= 1) {
                                    c1Var.xqGvceK5x = GWasM1elztuh;
                                } else {
                                    int AvO7iQsrTN = eg.AvO7iQsrTN(j);
                                    int i26 = 0;
                                    while (true) {
                                        if (i26 >= i25) {
                                            i26 = i25;
                                            break;
                                        } else if (GWasM1elztuh.xqGvceK5x(i26) > AvO7iQsrTN) {
                                            break;
                                        } else {
                                            i26++;
                                        }
                                    }
                                    if (i26 >= 0 && i26 != c1Var.Yi7zF1RB1) {
                                        GWasM1elztuh = c1Var.GWasM1elztuh(i15, i5, truncateAt, i26 < 1 ? 1 : i26, i12, i6, i19, i11, c1Var.OOA6hdeuvCS);
                                    }
                                    c1Var.xqGvceK5x = GWasM1elztuh;
                                }
                                c1Var.GWasM1elztuh.AvO7iQsrTN.X1lG3V04pd(w41Var2.GWasM1elztuh.AvO7iQsrTN(), (Float.floatToRawIntBits(c1Var.Yi7zF1RB1()) & 4294967295L) | (Float.floatToRawIntBits(c1Var.X1lG3V04pd()) << c), w41Var2.GWasM1elztuh.Yi7zF1RB1());
                                layout = c1Var.xqGvceK5x.OOA6hdeuvCS;
                                if (layout.getText() instanceof Spanned) {
                                    CharSequence text = layout.getText();
                                    text.getClass();
                                    Spanned spanned = (Spanned) text;
                                    if (spanned.nextSpanTransition(-1, spanned.length(), w11.class) != spanned.length()) {
                                        CharSequence text2 = layout.getText();
                                        text2.getClass();
                                        w11VarArr = (w11[]) ((Spanned) text2).getSpans(0, layout.getText().length(), w11.class);
                                        if (w11VarArr != null) {
                                            for (w11 w11Var : w11VarArr) {
                                                w11Var.AvO7iQsrTN.setValue(new t21((Float.floatToRawIntBits(c1Var.Yi7zF1RB1()) & 4294967295L) | (Float.floatToRawIntBits(c1Var.X1lG3V04pd()) << c)));
                                            }
                                        }
                                        charSequence = c1Var.OOA6hdeuvCS;
                                        if (charSequence instanceof Spanned) {
                                            list = xp.OOA6hdeuvCS;
                                        } else {
                                            Spanned spanned2 = (Spanned) charSequence;
                                            Object[] spans = spanned2.getSpans(0, charSequence.length(), xp0.class);
                                            ArrayList arrayList = new ArrayList(spans.length);
                                            for (Object obj : spans) {
                                                xp0 xp0Var = (xp0) obj;
                                                int spanStart = spanned2.getSpanStart(xp0Var);
                                                int spanEnd = spanned2.getSpanEnd(xp0Var);
                                                int EljAMC1QTz = c1Var.xqGvceK5x.EljAMC1QTz(spanStart);
                                                boolean z = EljAMC1QTz >= c1Var.Yi7zF1RB1;
                                                boolean z2 = c1Var.xqGvceK5x.OOA6hdeuvCS.getEllipsisCount(EljAMC1QTz) > 0 && spanEnd > c1Var.xqGvceK5x.OOA6hdeuvCS.getEllipsisStart(EljAMC1QTz) + c1Var.xqGvceK5x.OOA6hdeuvCS.getLineStart(EljAMC1QTz);
                                                boolean z3 = spanEnd > c1Var.xqGvceK5x.OOA6hdeuvCS(EljAMC1QTz);
                                                if (z2 || z3 || z) {
                                                    kt0Var = null;
                                                } else {
                                                    boolean z4 = c1Var.xqGvceK5x.OOA6hdeuvCS.getParagraphDirection(EljAMC1QTz) == 1;
                                                    boolean isRtlCharAt = c1Var.xqGvceK5x.OOA6hdeuvCS.isRtlCharAt(spanStart);
                                                    if (!z4 || isRtlCharAt) {
                                                        if (z4 && isRtlCharAt) {
                                                            encWxUiV2 = c1Var.xqGvceK5x.mOu10nynGul(spanStart, false);
                                                            X1lG3V04pd2 = xp0Var.X1lG3V04pd();
                                                        } else {
                                                            k81 k81Var = c1Var.xqGvceK5x;
                                                            if (isRtlCharAt) {
                                                                encWxUiV2 = k81Var.encWxUiV2(spanStart, false);
                                                                X1lG3V04pd2 = xp0Var.X1lG3V04pd();
                                                            } else {
                                                                mOu10nynGul = k81Var.mOu10nynGul(spanStart, false);
                                                                X1lG3V04pd = xp0Var.X1lG3V04pd();
                                                            }
                                                        }
                                                        mOu10nynGul = encWxUiV2 - X1lG3V04pd2;
                                                        k81 k81Var2 = c1Var.xqGvceK5x;
                                                        xp0Var.getClass();
                                                        float X1lG3V04pd3 = k81Var2.X1lG3V04pd(EljAMC1QTz) - xp0Var.Yi7zF1RB1();
                                                        kt0Var = new kt0(mOu10nynGul, X1lG3V04pd3, encWxUiV2, xp0Var.Yi7zF1RB1() + X1lG3V04pd3);
                                                    } else {
                                                        mOu10nynGul = c1Var.xqGvceK5x.encWxUiV2(spanStart, false);
                                                        X1lG3V04pd = xp0Var.X1lG3V04pd();
                                                    }
                                                    encWxUiV2 = X1lG3V04pd + mOu10nynGul;
                                                    k81 k81Var22 = c1Var.xqGvceK5x;
                                                    xp0Var.getClass();
                                                    float X1lG3V04pd32 = k81Var22.X1lG3V04pd(EljAMC1QTz) - xp0Var.Yi7zF1RB1();
                                                    kt0Var = new kt0(mOu10nynGul, X1lG3V04pd32, encWxUiV2, xp0Var.Yi7zF1RB1() + X1lG3V04pd32);
                                                }
                                                arrayList.add(kt0Var);
                                            }
                                            list = arrayList;
                                        }
                                        c1Var.EljAMC1QTz = list;
                                    }
                                }
                                w11VarArr = null;
                                if (w11VarArr != null) {
                                }
                                charSequence = c1Var.OOA6hdeuvCS;
                                if (charSequence instanceof Spanned) {
                                }
                                c1Var.EljAMC1QTz = list;
                            }
                            truncateAt2 = TextUtils.TruncateAt.START;
                        }
                        i12 = i22;
                        c = ' ';
                        w41Var2 = w41Var;
                        truncateAt = truncateAt2;
                        GWasM1elztuh = GWasM1elztuh(i10, i5, truncateAt, i, i12, i6, i19, i11, charSequence3);
                        Layout layout22 = GWasM1elztuh.OOA6hdeuvCS;
                        i13 = i10;
                        if (Build.VERSION.SDK_INT < 35) {
                        }
                        c1Var = this;
                        i14 = i;
                        i15 = i13;
                        i16 = 2;
                        int i252 = GWasM1elztuh.EljAMC1QTz;
                        if (i2 == i16) {
                        }
                        c1Var.xqGvceK5x = GWasM1elztuh;
                        c1Var.GWasM1elztuh.AvO7iQsrTN.X1lG3V04pd(w41Var2.GWasM1elztuh.AvO7iQsrTN(), (Float.floatToRawIntBits(c1Var.Yi7zF1RB1()) & 4294967295L) | (Float.floatToRawIntBits(c1Var.X1lG3V04pd()) << c), w41Var2.GWasM1elztuh.Yi7zF1RB1());
                        layout = c1Var.xqGvceK5x.OOA6hdeuvCS;
                        if (layout.getText() instanceof Spanned) {
                        }
                        w11VarArr = null;
                        if (w11VarArr != null) {
                        }
                        charSequence = c1Var.OOA6hdeuvCS;
                        if (charSequence instanceof Spanned) {
                        }
                        c1Var.EljAMC1QTz = list;
                    }
                }
                w41Var = w41Var3;
                i10 = i20;
                i11 = i3;
                if (i2 != i9) {
                }
                i12 = i22;
                c = ' ';
                w41Var2 = w41Var;
                truncateAt = truncateAt2;
                GWasM1elztuh = GWasM1elztuh(i10, i5, truncateAt, i, i12, i6, i19, i11, charSequence3);
                Layout layout222 = GWasM1elztuh.OOA6hdeuvCS;
                i13 = i10;
                if (Build.VERSION.SDK_INT < 35) {
                }
                c1Var = this;
                i14 = i;
                i15 = i13;
                i16 = 2;
                int i2522 = GWasM1elztuh.EljAMC1QTz;
                if (i2 == i16) {
                }
                c1Var.xqGvceK5x = GWasM1elztuh;
                c1Var.GWasM1elztuh.AvO7iQsrTN.X1lG3V04pd(w41Var2.GWasM1elztuh.AvO7iQsrTN(), (Float.floatToRawIntBits(c1Var.Yi7zF1RB1()) & 4294967295L) | (Float.floatToRawIntBits(c1Var.X1lG3V04pd()) << c), w41Var2.GWasM1elztuh.Yi7zF1RB1());
                layout = c1Var.xqGvceK5x.OOA6hdeuvCS;
                if (layout.getText() instanceof Spanned) {
                }
                w11VarArr = null;
                if (w11VarArr != null) {
                }
                charSequence = c1Var.OOA6hdeuvCS;
                if (charSequence instanceof Spanned) {
                }
                c1Var.EljAMC1QTz = list;
            }
            i19 = i3;
            i8 = (i4 >> 16) & 255;
            if (i8 == 1) {
            }
            w41Var = w41Var3;
            i10 = i20;
            i11 = i3;
            if (i2 != i9) {
            }
            i12 = i22;
            c = ' ';
            w41Var2 = w41Var;
            truncateAt = truncateAt2;
            GWasM1elztuh = GWasM1elztuh(i10, i5, truncateAt, i, i12, i6, i19, i11, charSequence3);
            Layout layout2222 = GWasM1elztuh.OOA6hdeuvCS;
            i13 = i10;
            if (Build.VERSION.SDK_INT < 35) {
            }
            c1Var = this;
            i14 = i;
            i15 = i13;
            i16 = 2;
            int i25222 = GWasM1elztuh.EljAMC1QTz;
            if (i2 == i16) {
            }
            c1Var.xqGvceK5x = GWasM1elztuh;
            c1Var.GWasM1elztuh.AvO7iQsrTN.X1lG3V04pd(w41Var2.GWasM1elztuh.AvO7iQsrTN(), (Float.floatToRawIntBits(c1Var.Yi7zF1RB1()) & 4294967295L) | (Float.floatToRawIntBits(c1Var.X1lG3V04pd()) << c), w41Var2.GWasM1elztuh.Yi7zF1RB1());
            layout = c1Var.xqGvceK5x.OOA6hdeuvCS;
            if (layout.getText() instanceof Spanned) {
            }
            w11VarArr = null;
            if (w11VarArr != null) {
            }
            charSequence = c1Var.OOA6hdeuvCS;
            if (charSequence instanceof Spanned) {
            }
            c1Var.EljAMC1QTz = list;
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
        w41Var = w41Var3;
        i10 = i20;
        i11 = i3;
        if (i2 != i9) {
        }
        i12 = i22;
        c = ' ';
        w41Var2 = w41Var;
        truncateAt = truncateAt2;
        GWasM1elztuh = GWasM1elztuh(i10, i5, truncateAt, i, i12, i6, i19, i11, charSequence3);
        Layout layout22222 = GWasM1elztuh.OOA6hdeuvCS;
        i13 = i10;
        if (Build.VERSION.SDK_INT < 35) {
        }
        c1Var = this;
        i14 = i;
        i15 = i13;
        i16 = 2;
        int i252222 = GWasM1elztuh.EljAMC1QTz;
        if (i2 == i16) {
        }
        c1Var.xqGvceK5x = GWasM1elztuh;
        c1Var.GWasM1elztuh.AvO7iQsrTN.X1lG3V04pd(w41Var2.GWasM1elztuh.AvO7iQsrTN(), (Float.floatToRawIntBits(c1Var.Yi7zF1RB1()) & 4294967295L) | (Float.floatToRawIntBits(c1Var.X1lG3V04pd()) << c), w41Var2.GWasM1elztuh.Yi7zF1RB1());
        layout = c1Var.xqGvceK5x.OOA6hdeuvCS;
        if (layout.getText() instanceof Spanned) {
        }
        w11VarArr = null;
        if (w11VarArr != null) {
        }
        charSequence = c1Var.OOA6hdeuvCS;
        if (charSequence instanceof Spanned) {
        }
        c1Var.EljAMC1QTz = list;
    }

    public final k81 GWasM1elztuh(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        bq0 bq0Var;
        float X1lG3V04pd = X1lG3V04pd();
        f1 f1Var = this.GWasM1elztuh;
        r1 r1Var = f1Var.AvO7iQsrTN;
        int i8 = f1Var.E7jCp8Ls;
        u50 u50Var = f1Var.mOu10nynGul;
        y81 y81Var = f1Var.Yi7zF1RB1;
        d1 d1Var = e1.GWasM1elztuh;
        eq0 eq0Var = y81Var.X1lG3V04pd;
        return new k81(charSequence, X1lG3V04pd, r1Var, i, truncateAt, i8, (eq0Var == null || (bq0Var = eq0Var.GWasM1elztuh) == null) ? false : bq0Var.GWasM1elztuh, i3, i5, i6, i7, i4, i2, u50Var);
    }

    public final float X1lG3V04pd() {
        return eg.encWxUiV2(this.X1lG3V04pd);
    }

    public final float Yi7zF1RB1() {
        return this.xqGvceK5x.GWasM1elztuh();
    }

    public final void xqGvceK5x(s9 s9Var) {
        Canvas GWasM1elztuh = ddkiCTz5mZ.GWasM1elztuh(s9Var);
        k81 k81Var = this.xqGvceK5x;
        if (k81Var.xqGvceK5x) {
            GWasM1elztuh.save();
            GWasM1elztuh.clipRect(0.0f, 0.0f, X1lG3V04pd(), Yi7zF1RB1());
        }
        int i = k81Var.AvO7iQsrTN;
        if (GWasM1elztuh.getClipBounds(k81Var.iwATDS1i01k)) {
            if (i != 0) {
                GWasM1elztuh.translate(0.0f, i);
            }
            ThreadLocal threadLocal = n81.GWasM1elztuh;
            Object obj = threadLocal.get();
            if (obj == null) {
                obj = new z71();
                threadLocal.set(obj);
            }
            z71 z71Var = (z71) obj;
            z71Var.GWasM1elztuh = GWasM1elztuh;
            try {
                k81Var.OOA6hdeuvCS.draw(z71Var);
                if (i != 0) {
                    GWasM1elztuh.translate(0.0f, (-1.0f) * i);
                }
            } finally {
                z71Var.GWasM1elztuh = null;
            }
        }
        if (k81Var.xqGvceK5x) {
            GWasM1elztuh.restore();
        }
    }
}
