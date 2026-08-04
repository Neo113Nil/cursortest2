package com.gamericefishpro.space.s2;

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
import com.appsflyer.internal.k;
import com.gamericefishpro.space.ph.v;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    public final TextPaint a;
    public final TextUtils.TruncateAt b;
    public final boolean c;
    public final boolean d;
    public final Layout e;
    public final int f;
    public final int g;
    public final int h;
    public final float i;
    public final float j;
    public final boolean k;
    public final Paint.FontMetricsInt l;
    public final int m;
    public final com.gamericefishpro.space.t2.h[] n;
    public final Rect o = new Rect();
    public com.gamericefishpro.space.b1.d p;

    /* JADX WARN: Code duplicated, block: B:122:0x0228  */
    /* JADX WARN: Code duplicated, block: B:123:0x022a  */
    /* JADX WARN: Code duplicated, block: B:125:0x022f  */
    /* JADX WARN: Code duplicated, block: B:126:0x0231  */
    /* JADX WARN: Code duplicated, block: B:60:0x0137  */
    /* JADX WARN: Code duplicated, block: B:94:0x01aa A[PHI: r7
      0x01aa: PHI (r7v7 int) = (r7v6 int), (r7v9 int) binds: [B:99:0x01bc, B:92:0x01a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r25v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v8 */
    public i(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, d dVar) {
        int i9;
        int i10;
        TextDirectionHeuristic textDirectionHeuristic;
        Layout layoutA;
        com.gamericefishpro.space.t2.h[] hVarArr;
        int i11;
        int i12;
        char c;
        long j;
        int i13;
        int i14;
        int i15;
        int i16;
        long jA;
        ?? r9;
        boolean zIsFallbackLineSpacingEnabled;
        int topPadding;
        boolean zIsFallbackLineSpacingEnabled2;
        long jA2;
        Paint.FontMetricsInt fontMetricsInt;
        com.gamericefishpro.space.t2.h hVar;
        com.gamericefishpro.space.t2.h hVar2;
        int i17;
        this.a = textPaint;
        this.b = truncateAt;
        this.c = z;
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristicB = j.b(i2);
        Layout.Alignment alignment = g.a;
        Layout.Alignment alignment2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? Layout.Alignment.ALIGN_NORMAL : g.b : g.a : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        boolean z2 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, com.gamericefishpro.space.t2.a.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics metricsA = dVar.a();
            double d = f;
            int iCeil = (int) Math.ceil(d);
            if (metricsA == null || dVar.c() > f || z2) {
                i9 = 0;
                this.k = false;
                i10 = i3;
                textDirectionHeuristic = textDirectionHeuristicB;
                layoutA = f.a(charSequence, textPaint, iCeil, charSequence.length(), textDirectionHeuristic, alignment2, i10, truncateAt, (int) Math.ceil(d), i8, z, i4, i5, i6, i7);
            } else {
                this.k = true;
                if (iCeil < 0) {
                    com.gamericefishpro.space.w2.a.a("negative width");
                }
                if (iCeil < 0) {
                    com.gamericefishpro.space.w2.a.a("negative ellipsized width");
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    layoutA = k.j(charSequence, textPaint, iCeil, alignment2, metricsA, z, truncateAt, iCeil);
                    i9 = 0;
                } else {
                    i9 = 0;
                    layoutA = new BoringLayout(charSequence, textPaint, iCeil, alignment2, 1.0f, 0.0f, metricsA, z, truncateAt, iCeil);
                }
                i10 = i3;
                textDirectionHeuristic = textDirectionHeuristicB;
            }
            this.e = layoutA;
            Trace.endSection();
            int iMin = Math.min(layoutA.getLineCount(), i10);
            this.f = iMin;
            int i18 = iMin - 1;
            this.d = (iMin >= i10 && (layoutA.getEllipsisCount(i18) > 0 || layoutA.getLineEnd(i18) != charSequence.length())) ? 1 : i9;
            if (layoutA.getText() instanceof Spanned) {
                CharSequence text = layoutA.getText();
                Intrinsics.c(text, "null cannot be cast to non-null type android.text.Spanned");
                if (f.c((Spanned) text, com.gamericefishpro.space.t2.h.class) || layoutA.getText().length() <= 0) {
                    CharSequence text2 = layoutA.getText();
                    Intrinsics.c(text2, "null cannot be cast to non-null type android.text.Spanned");
                    hVarArr = (com.gamericefishpro.space.t2.h[]) ((Spanned) text2).getSpans(i9, layoutA.getText().length(), com.gamericefishpro.space.t2.h.class);
                } else {
                    hVarArr = null;
                }
            } else {
                hVarArr = null;
            }
            this.n = hVarArr;
            if (hVarArr == null || (hVar2 = (com.gamericefishpro.space.t2.h) v.q(hVarArr)) == null) {
                i11 = 2;
                i12 = i9;
            } else {
                if (hVar2.i) {
                    i11 = 2;
                    i17 = hVar2.y == 2 ? 1 : i17;
                    i12 = i17;
                } else {
                    i11 = 2;
                }
                i17 = i9;
                i12 = i17;
            }
            int i19 = (hVarArr == null || (hVar = (com.gamericefishpro.space.t2.h) v.q(hVarArr)) == null || !hVar.v || hVar.y != i11) ? i9 : 1;
            if (i12 == 0 || i19 == 0) {
                long jA3 = j.b;
                if (z) {
                    c = ' ';
                    j = 4294967295L;
                    i13 = 33;
                } else {
                    if (this.k) {
                        BoringLayout boringLayout = (BoringLayout) layoutA;
                        i13 = 33;
                        if (Build.VERSION.SDK_INT >= 33) {
                            zIsFallbackLineSpacingEnabled2 = boringLayout.isFallbackLineSpacingEnabled();
                        } else {
                            r9 = i9;
                        }
                    } else {
                        i13 = 33;
                        StaticLayout staticLayout = (StaticLayout) layoutA;
                        int i20 = Build.VERSION.SDK_INT;
                        if (i20 >= 33) {
                            zIsFallbackLineSpacingEnabled = staticLayout.isFallbackLineSpacingEnabled();
                        } else if (i20 >= 28) {
                            r9 = 1;
                        } else {
                            r9 = i9;
                        }
                    }
                    if (r9 != 0) {
                        r9 = zIsFallbackLineSpacingEnabled;
                        r9 = zIsFallbackLineSpacingEnabled2;
                        c = ' ';
                        j = 4294967295L;
                    } else {
                        r9 = zIsFallbackLineSpacingEnabled;
                        TextPaint paint = layoutA.getPaint();
                        CharSequence text3 = layoutA.getText();
                        c = ' ';
                        j = 4294967295L;
                        Rect rectB = f.b(paint, text3, layoutA.getLineStart(i9), layoutA.getLineEnd(i9));
                        int lineAscent = layoutA.getLineAscent(i9);
                        int i21 = rectB.top;
                        if (i21 < lineAscent) {
                            r9 = zIsFallbackLineSpacingEnabled2;
                            topPadding = lineAscent - i21;
                        } else {
                            r9 = zIsFallbackLineSpacingEnabled2;
                            topPadding = layoutA.getTopPadding();
                        }
                        i14 = 1;
                        rectB = iMin != 1 ? f.b(paint, text3, layoutA.getLineStart(i18), layoutA.getLineEnd(i18)) : rectB;
                        int lineDescent = layoutA.getLineDescent(i18);
                        int i22 = rectB.bottom;
                        int bottomPadding = i22 > lineDescent ? i22 - lineDescent : layoutA.getBottomPadding();
                        if (topPadding != 0 || bottomPadding != 0) {
                            jA3 = j.a(topPadding, bottomPadding);
                        }
                    }
                    if (i12 != 0) {
                        i15 = i9;
                    } else {
                        i15 = (int) (jA3 >> c);
                    }
                    if (i19 != 0) {
                        i16 = i9;
                    } else {
                        i16 = (int) (jA3 & j);
                    }
                    jA = j.a(i15, i16);
                }
                i14 = 1;
                if (i12 != 0) {
                    i15 = i9;
                } else {
                    i15 = (int) (jA3 >> c);
                }
                if (i19 != 0) {
                    i16 = i9;
                } else {
                    i16 = (int) (jA3 & j);
                }
                jA = j.a(i15, i16);
            } else {
                jA = j.b;
                c = ' ';
                j = 4294967295L;
                i13 = 33;
                i14 = 1;
            }
            if (hVarArr != null) {
                int length2 = hVarArr.length;
                int iMax = i9;
                int i23 = iMax;
                int iMax2 = i23;
                while (i23 < length2) {
                    com.gamericefishpro.space.t2.h hVar3 = hVarArr[i23];
                    int i24 = hVar3.D;
                    iMax = i24 < 0 ? Math.max(iMax, Math.abs(i24)) : iMax;
                    int i25 = hVar3.E;
                    if (i25 < 0) {
                        iMax2 = Math.max(iMax, Math.abs(i25));
                    }
                    i23++;
                }
                jA2 = (iMax == 0 && iMax2 == 0) ? j.b : j.a(iMax, iMax2);
            } else {
                jA2 = j.b;
            }
            this.g = Math.max((int) (jA >> c), (int) (jA2 >> c));
            this.h = Math.max((int) (jA & j), (int) (jA2 & j));
            TextPaint textPaint2 = this.a;
            com.gamericefishpro.space.t2.h[] hVarArr2 = this.n;
            int i26 = this.f - i14;
            Layout layout = this.e;
            if (layout.getLineStart(i26) != layout.getLineEnd(i26) || hVarArr2 == null || hVarArr2.length == 0) {
                fontMetricsInt = null;
            } else {
                TextDirectionHeuristic textDirectionHeuristic2 = textDirectionHeuristic;
                SpannableString spannableString = new SpannableString("\u200b");
                com.gamericefishpro.space.t2.h hVar4 = (com.gamericefishpro.space.t2.h) v.p(hVarArr2);
                spannableString.setSpan(new com.gamericefishpro.space.t2.h(hVar4.d, spannableString.length(), (i26 == 0 || !hVar4.v) ? hVar4.v : i9, hVar4.v, hVar4.w, hVar4.y), i9, spannableString.length(), i13);
                StaticLayout staticLayoutA = f.a(spannableString, textPaint2, Integer.MAX_VALUE, spannableString.length(), textDirectionHeuristic2, b.a, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, this.c, 0, 0, 0, 0);
                fontMetricsInt = new Paint.FontMetricsInt();
                fontMetricsInt.ascent = staticLayoutA.getLineAscent(i9);
                fontMetricsInt.descent = staticLayoutA.getLineDescent(i9);
                fontMetricsInt.top = staticLayoutA.getLineTop(i9);
                fontMetricsInt.bottom = staticLayoutA.getLineBottom(i9);
            }
            this.m = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (d(i18) - f(i18))) : i9;
            this.l = fontMetricsInt;
            Layout layout2 = this.e;
            this.i = com.gamericefishpro.space.hj.c.z(layout2, i18, layout2.getPaint());
            Layout layout3 = this.e;
            this.j = com.gamericefishpro.space.hj.c.A(layout3, i18, layout3.getPaint());
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final int a() {
        boolean z = this.d;
        Layout layout = this.e;
        return (z ? layout.getLineBottom(this.f - 1) : layout.getHeight()) + this.g + this.h + this.m;
    }

    public final com.gamericefishpro.space.b1.d b() {
        com.gamericefishpro.space.b1.d dVar = this.p;
        if (dVar != null) {
            return dVar;
        }
        com.gamericefishpro.space.b1.d dVar2 = new com.gamericefishpro.space.b1.d(this.e);
        this.p = dVar2;
        return dVar2;
    }

    public final float c(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.g + ((i != this.f + (-1) || (fontMetricsInt = this.l) == null) ? this.e.getLineBaseline(i) : f(i) - fontMetricsInt.ascent);
    }

    public final float d(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        int i2 = this.f;
        int i3 = i2 - 1;
        Layout layout = this.e;
        if (i != i3 || (fontMetricsInt = this.l) == null) {
            return this.g + layout.getLineBottom(i) + (i == i2 + (-1) ? this.h : 0);
        }
        return layout.getLineBottom(i - 1) + fontMetricsInt.bottom;
    }

    public final int e(int i) {
        ThreadLocal threadLocal = j.a;
        Layout layout = this.e;
        return (layout.getEllipsisCount(i) <= 0 || this.b != TextUtils.TruncateAt.END) ? layout.getLineEnd(i) : layout.getText().length();
    }

    public final float f(int i) {
        return this.e.getLineTop(i) + (i == 0 ? 0 : this.g);
    }

    public final float g(int i, boolean z) {
        return (this.e.getLineForOffset(i) == this.f - 1 ? this.i + this.j : 0.0f) + b().o(i, true, z);
    }

    public final float h(int i, boolean z) {
        return (this.e.getLineForOffset(i) == this.f + (-1) ? this.i + this.j : 0.0f) + b().o(i, false, z);
    }
}
