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
import androidx.compose.ui.text.android.style.BaselineShiftSpan;
import androidx.compose.ui.text.android.style.LineHeightStyleSpan;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes10.dex */
public final class zqy0 {
    public final TextPaint a;
    public final TextUtils.TruncateAt b;
    public final boolean c;
    public final boolean d;
    public yi6 e;
    public final Layout f;
    public final int g;
    public final int h;
    public final int i;
    public final float j;
    public final float k;
    public final boolean l;
    public final Paint.FontMetricsInt m;
    public final int n;
    public final LineHeightStyleSpan[] o;
    public final Rect p = new Rect();
    public q4g q;

    /* JADX WARN: Multi-variable type inference failed */
    public zqy0(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, o0y o0yVar) {
        int i9;
        TextDirectionHeuristic textDirectionHeuristic;
        Layout a;
        LineHeightStyleSpan[] lineHeightStyleSpanArr;
        int i10;
        int i11;
        int i12;
        char c;
        long j;
        int i13;
        int i14;
        long a2;
        int i15;
        boolean isFallbackLineSpacingEnabled;
        boolean isFallbackLineSpacingEnabled2;
        long j2;
        int i16;
        Paint.FontMetricsInt fontMetricsInt;
        LineHeightStyleSpan lineHeightStyleSpan;
        LineHeightStyleSpan lineHeightStyleSpan2;
        int i17;
        this.a = textPaint;
        this.b = truncateAt;
        this.c = z;
        int length = charSequence.length();
        TextDirectionHeuristic b = fry0.b(i2);
        Layout.Alignment alignment = tjy0.a;
        Layout.Alignment alignment2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? Layout.Alignment.ALIGN_NORMAL : tjy0.b : tjy0.a : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        boolean z2 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, BaselineShiftSpan.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics a3 = o0yVar.a();
            double d = f;
            int ceil = (int) Math.ceil(d);
            if (a3 == null || o0yVar.c() > f || z2) {
                this.l = false;
                n6u0 n6u0Var = p6u0.a;
                i9 = i3;
                textDirectionHeuristic = b;
                a = p6u0.a(charSequence, textPaint, ceil, charSequence.length(), textDirectionHeuristic, alignment2, i9, truncateAt, (int) Math.ceil(d), i8, z, i4, i5, i6, i7);
            } else {
                this.l = true;
                if (ceil < 0) {
                    jxv.a("negative width");
                }
                if (ceil < 0) {
                    jxv.a("negative ellipsized width");
                }
                a = Build.VERSION.SDK_INT >= 33 ? sf.k(charSequence, textPaint, ceil, alignment2, a3, z, truncateAt, ceil) : new BoringLayout(charSequence, textPaint, ceil, alignment2, 1.0f, 0.0f, a3, z, truncateAt, ceil);
                i9 = i3;
                textDirectionHeuristic = b;
            }
            this.f = a;
            Trace.endSection();
            int min = Math.min(a.getLineCount(), i9);
            this.g = min;
            int i18 = min - 1;
            this.d = min >= i9 && (a.getEllipsisCount(i18) > 0 || a.getLineEnd(i18) != charSequence.length());
            if ((a.getText() instanceof Spanned) && (zeb1.b((Spanned) a.getText(), LineHeightStyleSpan.class) || a.getText().length() <= 0)) {
                i10 = 0;
                lineHeightStyleSpanArr = (LineHeightStyleSpan[]) ((Spanned) a.getText()).getSpans(0, a.getText().length(), LineHeightStyleSpan.class);
            } else {
                lineHeightStyleSpanArr = null;
                i10 = 0;
            }
            this.o = lineHeightStyleSpanArr;
            if (lineHeightStyleSpanArr == null || (lineHeightStyleSpan2 = (LineHeightStyleSpan) j73.D(lineHeightStyleSpanArr)) == null) {
                i11 = 2;
                i12 = i10;
            } else {
                if (lineHeightStyleSpan2.getTrimFirstLineTop()) {
                    i11 = 2;
                    if (lineHeightStyleSpan2.getMode() == 2) {
                        i17 = 1;
                        i12 = i17;
                    }
                } else {
                    i11 = 2;
                }
                i17 = i10;
                i12 = i17;
            }
            int i19 = (lineHeightStyleSpanArr == null || (lineHeightStyleSpan = (LineHeightStyleSpan) j73.D(lineHeightStyleSpanArr)) == null || !lineHeightStyleSpan.getTrimLastLineBottom() || lineHeightStyleSpan.getMode() != i11) ? i10 : 1;
            if (i12 == 0 || i19 == 0) {
                long j3 = fry0.b;
                if (z) {
                    c = HexString.CHAR_SPACE;
                    j = _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                    i13 = 1;
                    i14 = 33;
                } else {
                    if (this.l) {
                        BoringLayout boringLayout = (BoringLayout) a;
                        i14 = 33;
                        if (Build.VERSION.SDK_INT >= 33) {
                            isFallbackLineSpacingEnabled2 = boringLayout.isFallbackLineSpacingEnabled();
                            i15 = isFallbackLineSpacingEnabled2;
                        } else {
                            i15 = i10;
                        }
                    } else {
                        i14 = 33;
                        n6u0 n6u0Var2 = p6u0.a;
                        StaticLayout staticLayout = (StaticLayout) a;
                        p6u0.a.getClass();
                        if (Build.VERSION.SDK_INT >= 33) {
                            isFallbackLineSpacingEnabled = staticLayout.isFallbackLineSpacingEnabled();
                            i15 = isFallbackLineSpacingEnabled;
                        } else {
                            i15 = 1;
                        }
                    }
                    if (i15 != 0) {
                        c = HexString.CHAR_SPACE;
                        j = _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        i13 = 1;
                    } else {
                        TextPaint paint = a.getPaint();
                        CharSequence text = a.getText();
                        int lineStart = a.getLineStart(i10);
                        c = HexString.CHAR_SPACE;
                        Rect e = mq61.e(paint, text, lineStart, a.getLineEnd(i10));
                        int lineAscent = a.getLineAscent(i10);
                        j = _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        int i20 = e.top;
                        int topPadding = i20 < lineAscent ? lineAscent - i20 : a.getTopPadding();
                        i13 = 1;
                        e = min != 1 ? mq61.e(paint, text, a.getLineStart(i18), a.getLineEnd(i18)) : e;
                        int lineDescent = a.getLineDescent(i18);
                        int i21 = e.bottom;
                        int bottomPadding = i21 > lineDescent ? i21 - lineDescent : a.getBottomPadding();
                        if (topPadding != 0 || bottomPadding != 0) {
                            j3 = fry0.a(topPadding, bottomPadding);
                        }
                    }
                }
                a2 = fry0.a(i12 != 0 ? i10 : (int) (j3 >> c), i19 != 0 ? i10 : (int) (j3 & j));
            } else {
                a2 = fry0.b;
                c = HexString.CHAR_SPACE;
                j = _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                i13 = 1;
                i14 = 33;
            }
            if (lineHeightStyleSpanArr != null) {
                int length2 = lineHeightStyleSpanArr.length;
                int i22 = i10;
                int i23 = i22;
                for (int i24 = i23; i24 < length2; i24++) {
                    LineHeightStyleSpan lineHeightStyleSpan3 = lineHeightStyleSpanArr[i24];
                    i22 = lineHeightStyleSpan3.getFirstAscentDiff() < 0 ? Math.max(i22, Math.abs(lineHeightStyleSpan3.getFirstAscentDiff())) : i22;
                    if (lineHeightStyleSpan3.getLastDescentDiff() < 0) {
                        i23 = Math.max(i22, Math.abs(lineHeightStyleSpan3.getLastDescentDiff()));
                    }
                }
                j2 = (i22 == 0 && i23 == 0) ? fry0.b : fry0.a(i22, i23);
            } else {
                j2 = fry0.b;
            }
            this.h = Math.max((int) (a2 >> c), (int) (j2 >> c));
            this.i = Math.max((int) (a2 & j), (int) (j2 & j));
            TextPaint textPaint2 = this.a;
            LineHeightStyleSpan[] lineHeightStyleSpanArr2 = this.o;
            int i25 = this.g - i13;
            Layout layout = this.f;
            if (layout.getLineStart(i25) != layout.getLineEnd(i25) || lineHeightStyleSpanArr2 == null || lineHeightStyleSpanArr2.length == 0) {
                i16 = i10;
                fontMetricsInt = null;
            } else {
                SpannableString spannableString = new SpannableString("\u200b");
                LineHeightStyleSpan lineHeightStyleSpan4 = (LineHeightStyleSpan) j73.C(lineHeightStyleSpanArr2);
                spannableString.setSpan(lineHeightStyleSpan4.copy$ui_text(i10, spannableString.length(), (i25 == 0 || !lineHeightStyleSpan4.getTrimLastLineBottom()) ? lineHeightStyleSpan4.getTrimLastLineBottom() : i10), i10, spannableString.length(), i14);
                n6u0 n6u0Var3 = p6u0.a;
                i16 = i10;
                StaticLayout a4 = p6u0.a(spannableString, textPaint2, Integer.MAX_VALUE, spannableString.length(), textDirectionHeuristic, pzx.a, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, this.c, 0, 0, 0, 0);
                fontMetricsInt = new Paint.FontMetricsInt();
                fontMetricsInt.ascent = a4.getLineAscent(i16);
                fontMetricsInt.descent = a4.getLineDescent(i16);
                fontMetricsInt.top = a4.getLineTop(i16);
                fontMetricsInt.bottom = a4.getLineBottom(i16);
            }
            this.n = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (e(i18) - g(i18))) : i16;
            this.m = fontMetricsInt;
            Layout layout2 = this.f;
            this.j = xi5.a(layout2, i18, layout2.getPaint());
            Layout layout3 = this.f;
            this.k = xi5.b(layout3, i18, layout3.getPaint());
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final int a() {
        boolean z = this.d;
        Layout layout = this.f;
        return (z ? layout.getLineBottom(this.g - 1) : layout.getHeight()) + this.h + this.i + this.n;
    }

    public final float b(int i) {
        if (i == this.g - 1) {
            return this.j + this.k;
        }
        return 0.0f;
    }

    public final q4g c() {
        q4g q4gVar = this.q;
        if (q4gVar != null) {
            return q4gVar;
        }
        q4g q4gVar2 = new q4g(this.f);
        this.q = q4gVar2;
        return q4gVar2;
    }

    public final float d(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.h + ((i != this.g + (-1) || (fontMetricsInt = this.m) == null) ? this.f.getLineBaseline(i) : g(i) - fontMetricsInt.ascent);
    }

    public final float e(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        int i2 = this.g;
        int i3 = i2 - 1;
        Layout layout = this.f;
        if (i != i3 || (fontMetricsInt = this.m) == null) {
            return this.h + layout.getLineBottom(i) + (i == i2 + (-1) ? this.i : 0);
        }
        return layout.getLineBottom(i - 1) + fontMetricsInt.bottom;
    }

    public final int f(int i) {
        ThreadLocal threadLocal = fry0.a;
        Layout layout = this.f;
        return (layout.getEllipsisCount(i) <= 0 || this.b != TextUtils.TruncateAt.END) ? layout.getLineEnd(i) : layout.getText().length();
    }

    public final float g(int i) {
        return this.f.getLineTop(i) + (i == 0 ? 0 : this.h);
    }

    public final float h(int i, boolean z) {
        return b(this.f.getLineForOffset(i)) + c().f(i, true, z);
    }

    public final float i(int i, boolean z) {
        return b(this.f.getLineForOffset(i)) + c().f(i, false, z);
    }

    public final yi6 j() {
        yi6 yi6Var = this.e;
        if (yi6Var != null) {
            return yi6Var;
        }
        Layout layout = this.f;
        yi6 yi6Var2 = new yi6(layout.getText(), layout.getText().length(), this.a.getTextLocale());
        this.e = yi6Var2;
        return yi6Var2;
    }
}
