package i2;

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
import d8.t;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f3133a;

    /* renamed from: b, reason: collision with root package name */
    public final TextUtils.TruncateAt f3134b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3135c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3136d;

    /* renamed from: e, reason: collision with root package name */
    public final Layout f3137e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3138f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3139g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3140h;

    /* renamed from: i, reason: collision with root package name */
    public final float f3141i;

    /* renamed from: j, reason: collision with root package name */
    public final float f3142j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f3143k;

    /* renamed from: l, reason: collision with root package name */
    public final Paint.FontMetricsInt f3144l;

    /* renamed from: m, reason: collision with root package name */
    public final int f3145m;

    /* renamed from: n, reason: collision with root package name */
    public final j2.h[] f3146n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f3147o = new Rect();

    /* renamed from: p, reason: collision with root package name */
    public t f3148p;

    /* JADX WARN: Removed duplicated region for block: B:103:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x023c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k(CharSequence charSequence, float f10, TextPaint textPaint, int i10, TextUtils.TruncateAt truncateAt, int i11, boolean z10, int i12, int i13, int i14, int i15, int i16, int i17, f fVar) {
        int i18;
        TextDirectionHeuristic textDirectionHeuristic;
        int i19;
        Layout a6;
        long j3;
        j2.h[] hVarArr;
        char c3;
        int i20;
        Layout layout;
        int i21;
        boolean z11;
        this.f3133a = textPaint;
        this.f3134b = truncateAt;
        this.f3135c = z10;
        int length = charSequence.length();
        TextDirectionHeuristic a8 = l.a(i11);
        Layout.Alignment alignment = i.f3130a;
        Layout.Alignment alignment2 = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? Layout.Alignment.ALIGN_NORMAL : i.f3131b : i.f3130a : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        boolean z12 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, j2.a.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics a10 = fVar.a();
            double d10 = f10;
            int ceil = (int) Math.ceil(d10);
            if (a10 == null || fVar.c() > f10 || z12) {
                this.f3143k = false;
                i18 = i12;
                textDirectionHeuristic = a8;
                i19 = 33;
                a6 = h.a(charSequence, textPaint, ceil, charSequence.length(), textDirectionHeuristic, alignment2, i18, truncateAt, (int) Math.ceil(d10), i17, z10, i13, i14, i15, i16);
            } else {
                this.f3143k = true;
                if (ceil < 0) {
                    m2.a.a("negative width");
                }
                if (ceil < 0) {
                    m2.a.a("negative ellipsized width");
                }
                a6 = Build.VERSION.SDK_INT >= 33 ? a.e(charSequence, textPaint, ceil, alignment2, a10, z10, truncateAt, ceil) : new BoringLayout(charSequence, textPaint, ceil, alignment2, 1.0f, 0.0f, a10, z10, truncateAt, ceil);
                i18 = i12;
                textDirectionHeuristic = a8;
                i19 = 33;
            }
            this.f3137e = a6;
            Trace.endSection();
            int min = Math.min(a6.getLineCount(), i18);
            this.f3138f = min;
            int i22 = min - 1;
            this.f3136d = min >= i18 && (a6.getEllipsisCount(i22) > 0 || a6.getLineEnd(i22) != charSequence.length());
            long j6 = l.f3150b;
            char c7 = ' ';
            if (!z10) {
                if (this.f3143k) {
                    BoringLayout boringLayout = (BoringLayout) a6;
                    if (Build.VERSION.SDK_INT >= i19) {
                        z11 = boringLayout.isFallbackLineSpacingEnabled();
                        if (!z11) {
                            TextPaint paint = a6.getPaint();
                            CharSequence text = a6.getText();
                            Rect b2 = h.b(paint, text, a6.getLineStart(0), a6.getLineEnd(0));
                            int lineAscent = a6.getLineAscent(0);
                            int i23 = b2.top;
                            int topPadding = i23 < lineAscent ? lineAscent - i23 : a6.getTopPadding();
                            b2 = min != 1 ? h.b(paint, text, a6.getLineStart(i22), a6.getLineEnd(i22)) : b2;
                            int lineDescent = a6.getLineDescent(i22);
                            int i24 = b2.bottom;
                            int bottomPadding = i24 > lineDescent ? i24 - lineDescent : a6.getBottomPadding();
                            j3 = (topPadding == 0 && bottomPadding == 0) ? j3 : (topPadding << 32) | (bottomPadding & 4294967295L);
                        }
                    }
                    z11 = false;
                    if (!z11) {
                    }
                } else {
                    StaticLayout staticLayout = (StaticLayout) a6;
                    int i25 = Build.VERSION.SDK_INT;
                    if (i25 >= i19) {
                        z11 = staticLayout.isFallbackLineSpacingEnabled();
                    } else {
                        if (i25 >= 28) {
                            z11 = true;
                        }
                        z11 = false;
                    }
                    if (!z11) {
                    }
                }
                Paint.FontMetricsInt fontMetricsInt = null;
                if (a6.getText() instanceof Spanned) {
                    CharSequence text2 = a6.getText();
                    pc.j.c(text2, "null cannot be cast to non-null type android.text.Spanned");
                    if (h.c((Spanned) text2, j2.h.class) || a6.getText().length() <= 0) {
                        CharSequence text3 = a6.getText();
                        pc.j.c(text3, "null cannot be cast to non-null type android.text.Spanned");
                        hVarArr = (j2.h[]) ((Spanned) text3).getSpans(0, a6.getText().length(), j2.h.class);
                        this.f3146n = hVarArr;
                        if (hVarArr != null) {
                            int length2 = hVarArr.length;
                            int i26 = 0;
                            int i27 = 0;
                            int i28 = 0;
                            while (i28 < length2) {
                                j2.h hVar = hVarArr[i28];
                                char c10 = c7;
                                int i29 = hVar.f3514q;
                                i26 = i29 < 0 ? Math.max(i26, Math.abs(i29)) : i26;
                                int i30 = hVar.f3515r;
                                if (i30 < 0) {
                                    i27 = Math.max(i26, Math.abs(i30));
                                }
                                i28++;
                                c7 = c10;
                            }
                            c3 = c7;
                            j6 = (i26 == 0 && i27 == 0) ? l.f3150b : (i26 << c3) | (i27 & 4294967295L);
                        } else {
                            c3 = ' ';
                        }
                        this.f3139g = Math.max((int) (j3 >> c3), (int) (j6 >> c3));
                        this.f3140h = Math.max((int) (j3 & 4294967295L), (int) (j6 & 4294967295L));
                        TextPaint textPaint2 = this.f3133a;
                        j2.h[] hVarArr2 = this.f3146n;
                        i20 = this.f3138f - 1;
                        layout = this.f3137e;
                        if (layout.getLineStart(i20) == layout.getLineEnd(i20) || hVarArr2 == null || hVarArr2.length == 0) {
                            i21 = 0;
                        } else {
                            TextDirectionHeuristic textDirectionHeuristic2 = textDirectionHeuristic;
                            SpannableString spannableString = new SpannableString("\u200b");
                            j2.h hVar2 = (j2.h) bc.l.X(hVarArr2);
                            spannableString.setSpan(new j2.h(hVar2.f3504g, spannableString.length(), (i20 == 0 || !hVar2.f3507j) ? hVar2.f3507j : false, hVar2.f3507j, hVar2.f3508k, hVar2.f3509l), 0, spannableString.length(), i19);
                            StaticLayout a11 = h.a(spannableString, textPaint2, Integer.MAX_VALUE, spannableString.length(), textDirectionHeuristic2, d.f3118a, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, this.f3135c, 0, 0, 0, 0);
                            fontMetricsInt = new Paint.FontMetricsInt();
                            i21 = 0;
                            fontMetricsInt.ascent = a11.getLineAscent(0);
                            fontMetricsInt.descent = a11.getLineDescent(0);
                            fontMetricsInt.top = a11.getLineTop(0);
                            fontMetricsInt.bottom = a11.getLineBottom(0);
                        }
                        this.f3145m = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (d(i22) - f(i22))) : i21;
                        this.f3144l = fontMetricsInt;
                        Layout layout2 = this.f3137e;
                        this.f3141i = a.a.x(layout2, i22, layout2.getPaint());
                        Layout layout3 = this.f3137e;
                        this.f3142j = a.a.y(layout3, i22, layout3.getPaint());
                    }
                }
                hVarArr = null;
                this.f3146n = hVarArr;
                if (hVarArr != null) {
                }
                this.f3139g = Math.max((int) (j3 >> c3), (int) (j6 >> c3));
                this.f3140h = Math.max((int) (j3 & 4294967295L), (int) (j6 & 4294967295L));
                TextPaint textPaint22 = this.f3133a;
                j2.h[] hVarArr22 = this.f3146n;
                i20 = this.f3138f - 1;
                layout = this.f3137e;
                if (layout.getLineStart(i20) == layout.getLineEnd(i20)) {
                }
                i21 = 0;
                this.f3145m = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (d(i22) - f(i22))) : i21;
                this.f3144l = fontMetricsInt;
                Layout layout22 = this.f3137e;
                this.f3141i = a.a.x(layout22, i22, layout22.getPaint());
                Layout layout32 = this.f3137e;
                this.f3142j = a.a.y(layout32, i22, layout32.getPaint());
            }
            j3 = j6;
            Paint.FontMetricsInt fontMetricsInt2 = null;
            if (a6.getText() instanceof Spanned) {
            }
            hVarArr = null;
            this.f3146n = hVarArr;
            if (hVarArr != null) {
            }
            this.f3139g = Math.max((int) (j3 >> c3), (int) (j6 >> c3));
            this.f3140h = Math.max((int) (j3 & 4294967295L), (int) (j6 & 4294967295L));
            TextPaint textPaint222 = this.f3133a;
            j2.h[] hVarArr222 = this.f3146n;
            i20 = this.f3138f - 1;
            layout = this.f3137e;
            if (layout.getLineStart(i20) == layout.getLineEnd(i20)) {
            }
            i21 = 0;
            this.f3145m = fontMetricsInt2 != null ? fontMetricsInt2.bottom - ((int) (d(i22) - f(i22))) : i21;
            this.f3144l = fontMetricsInt2;
            Layout layout222 = this.f3137e;
            this.f3141i = a.a.x(layout222, i22, layout222.getPaint());
            Layout layout322 = this.f3137e;
            this.f3142j = a.a.y(layout322, i22, layout322.getPaint());
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final int a() {
        boolean z10 = this.f3136d;
        Layout layout = this.f3137e;
        return (z10 ? layout.getLineBottom(this.f3138f - 1) : layout.getHeight()) + this.f3139g + this.f3140h + this.f3145m;
    }

    public final t b() {
        t tVar = this.f3148p;
        if (tVar != null) {
            return tVar;
        }
        t tVar2 = new t(this.f3137e);
        this.f3148p = tVar2;
        return tVar2;
    }

    public final float c(int i10) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.f3139g + ((i10 != this.f3138f + (-1) || (fontMetricsInt = this.f3144l) == null) ? this.f3137e.getLineBaseline(i10) : f(i10) - fontMetricsInt.ascent);
    }

    public final float d(int i10) {
        Paint.FontMetricsInt fontMetricsInt;
        int i11 = this.f3138f;
        int i12 = i11 - 1;
        Layout layout = this.f3137e;
        if (i10 != i12 || (fontMetricsInt = this.f3144l) == null) {
            return this.f3139g + layout.getLineBottom(i10) + (i10 == i11 + (-1) ? this.f3140h : 0);
        }
        return layout.getLineBottom(i10 - 1) + fontMetricsInt.bottom;
    }

    public final int e(int i10) {
        j jVar = l.f3149a;
        Layout layout = this.f3137e;
        return (layout.getEllipsisCount(i10) <= 0 || this.f3134b != TextUtils.TruncateAt.END) ? layout.getLineEnd(i10) : layout.getText().length();
    }

    public final float f(int i10) {
        return this.f3137e.getLineTop(i10) + (i10 == 0 ? 0 : this.f3139g);
    }

    public final float g(int i10, boolean z10) {
        return (this.f3137e.getLineForOffset(i10) == this.f3138f - 1 ? this.f3141i + this.f3142j : 0.0f) + b().l(i10, true, z10);
    }

    public final float h(int i10, boolean z10) {
        return (this.f3137e.getLineForOffset(i10) == this.f3138f + (-1) ? this.f3141i + this.f3142j : 0.0f) + b().l(i10, false, z10);
    }
}
