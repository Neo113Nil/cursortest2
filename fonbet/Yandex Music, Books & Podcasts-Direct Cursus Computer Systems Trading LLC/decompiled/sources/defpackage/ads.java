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
import java.util.ArrayList;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class ads {
    public final TextPaint a;
    public final TextUtils.TruncateAt b;
    public final boolean c;
    public final boolean d;
    public ah3 e;
    public final Layout f;
    public final int g;
    public final int h;
    public final int i;
    public final float j;
    public final float k;
    public final boolean l;
    public final Paint.FontMetricsInt m;
    public final int n;
    public final i6g[] o;
    public final Rect p = new Rect();
    public gs4 q;

    /* JADX WARN: Removed duplicated region for block: B:103:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x023a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ads(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, bpf bpfVar) {
        int i9;
        TextDirectionHeuristic textDirectionHeuristic;
        int i10;
        Layout u;
        long j;
        i6g[] i6gVarArr;
        char c;
        int i11;
        Layout layout;
        int i12;
        boolean z2;
        this.a = textPaint;
        this.b = truncateAt;
        this.c = z;
        int length = charSequence.length();
        TextDirectionHeuristic a = eds.a(i2);
        Layout.Alignment alignment = p9s.a;
        Layout.Alignment alignment2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? Layout.Alignment.ALIGN_NORMAL : p9s.b : p9s.a : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        boolean z3 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, yu2.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics a2 = bpfVar.a();
            double d = f;
            int ceil = (int) Math.ceil(d);
            if (a2 == null || bpfVar.c() > f || z3) {
                this.l = false;
                i9 = i3;
                textDirectionHeuristic = a;
                i10 = 33;
                u = y7g.u(charSequence, textPaint, ceil, charSequence.length(), textDirectionHeuristic, alignment2, i9, truncateAt, (int) Math.ceil(d), i8, z, i4, i5, i6, i7);
            } else {
                this.l = true;
                if (ceil < 0) {
                    tme.a("negative width");
                }
                if (ceil < 0) {
                    tme.a("negative ellipsized width");
                }
                u = Build.VERSION.SDK_INT >= 33 ? gd3.a(charSequence, textPaint, ceil, alignment2, a2, z, truncateAt, ceil) : new BoringLayout(charSequence, textPaint, ceil, alignment2, 1.0f, 0.0f, a2, z, truncateAt, ceil);
                i9 = i3;
                textDirectionHeuristic = a;
                i10 = 33;
            }
            this.f = u;
            Trace.endSection();
            int min = Math.min(u.getLineCount(), i9);
            this.g = min;
            int i13 = min - 1;
            this.d = min >= i9 && (u.getEllipsisCount(i13) > 0 || u.getLineEnd(i13) != charSequence.length());
            long j2 = eds.b;
            char c2 = ' ';
            if (!z) {
                if (this.l) {
                    BoringLayout boringLayout = (BoringLayout) u;
                    if (Build.VERSION.SDK_INT >= i10) {
                        z2 = rb.D(boringLayout);
                        if (!z2) {
                            TextPaint paint = u.getPaint();
                            CharSequence text = u.getText();
                            Rect X = szf.X(paint, text, u.getLineStart(0), u.getLineEnd(0));
                            int lineAscent = u.getLineAscent(0);
                            int i14 = X.top;
                            int topPadding = i14 < lineAscent ? lineAscent - i14 : u.getTopPadding();
                            X = min != 1 ? szf.X(paint, text, u.getLineStart(i13), u.getLineEnd(i13)) : X;
                            int lineDescent = u.getLineDescent(i13);
                            int i15 = X.bottom;
                            int bottomPadding = i15 > lineDescent ? i15 - lineDescent : u.getBottomPadding();
                            j = (topPadding == 0 && bottomPadding == 0) ? j : (topPadding << 32) | (bottomPadding & 4294967295L);
                        }
                    }
                    z2 = false;
                    if (!z2) {
                    }
                } else {
                    StaticLayout staticLayout = (StaticLayout) u;
                    int i16 = Build.VERSION.SDK_INT;
                    if (i16 >= i10) {
                        z2 = rb.E(staticLayout);
                    } else {
                        if (i16 >= 28) {
                            z2 = true;
                        }
                        z2 = false;
                    }
                    if (!z2) {
                    }
                }
                Paint.FontMetricsInt fontMetricsInt = null;
                if (u.getText() instanceof Spanned) {
                    CharSequence text2 = u.getText();
                    text2.getClass();
                    if (o2g.e0((Spanned) text2, i6g.class) || u.getText().length() <= 0) {
                        CharSequence text3 = u.getText();
                        text3.getClass();
                        i6gVarArr = (i6g[]) ((Spanned) text3).getSpans(0, u.getText().length(), i6g.class);
                        this.o = i6gVarArr;
                        if (i6gVarArr != null) {
                            int length2 = i6gVarArr.length;
                            int i17 = 0;
                            int i18 = 0;
                            int i19 = 0;
                            while (i19 < length2) {
                                i6g i6gVar = i6gVarArr[i19];
                                char c3 = c2;
                                int i20 = i6gVar.k;
                                i17 = i20 < 0 ? Math.max(i17, Math.abs(i20)) : i17;
                                int i21 = i6gVar.l;
                                if (i21 < 0) {
                                    i18 = Math.max(i17, Math.abs(i21));
                                }
                                i19++;
                                c2 = c3;
                            }
                            c = c2;
                            j2 = (i17 == 0 && i18 == 0) ? eds.b : (i17 << c) | (i18 & 4294967295L);
                        } else {
                            c = ' ';
                        }
                        this.h = Math.max((int) (j >> c), (int) (j2 >> c));
                        this.i = Math.max((int) (j & 4294967295L), (int) (j2 & 4294967295L));
                        TextPaint textPaint2 = this.a;
                        i6g[] i6gVarArr2 = this.o;
                        i11 = this.g - 1;
                        layout = this.f;
                        if (layout.getLineStart(i11) == layout.getLineEnd(i11) || i6gVarArr2 == null || i6gVarArr2.length == 0) {
                            i12 = 0;
                        } else {
                            TextDirectionHeuristic textDirectionHeuristic2 = textDirectionHeuristic;
                            SpannableString spannableString = new SpannableString("\u200b");
                            i6g i6gVar2 = (i6g) xz0.y(i6gVarArr2);
                            spannableString.setSpan(new i6g(i6gVar2.a, spannableString.length(), (i11 == 0 || !i6gVar2.d) ? i6gVar2.d : false, i6gVar2.d, i6gVar2.e, i6gVar2.f), 0, spannableString.length(), i10);
                            StaticLayout u2 = y7g.u(spannableString, textPaint2, Integer.MAX_VALUE, spannableString.length(), textDirectionHeuristic2, tof.a, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, this.c, 0, 0, 0, 0);
                            fontMetricsInt = new Paint.FontMetricsInt();
                            i12 = 0;
                            fontMetricsInt.ascent = u2.getLineAscent(0);
                            fontMetricsInt.descent = u2.getLineDescent(0);
                            fontMetricsInt.top = u2.getLineTop(0);
                            fontMetricsInt.bottom = u2.getLineBottom(0);
                        }
                        this.n = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (e(i13) - g(i13))) : i12;
                        this.m = fontMetricsInt;
                        Layout layout2 = this.f;
                        this.j = men.z(layout2, i13, layout2.getPaint());
                        Layout layout3 = this.f;
                        this.k = men.A(layout3, i13, layout3.getPaint());
                    }
                }
                i6gVarArr = null;
                this.o = i6gVarArr;
                if (i6gVarArr != null) {
                }
                this.h = Math.max((int) (j >> c), (int) (j2 >> c));
                this.i = Math.max((int) (j & 4294967295L), (int) (j2 & 4294967295L));
                TextPaint textPaint22 = this.a;
                i6g[] i6gVarArr22 = this.o;
                i11 = this.g - 1;
                layout = this.f;
                if (layout.getLineStart(i11) == layout.getLineEnd(i11)) {
                }
                i12 = 0;
                this.n = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (e(i13) - g(i13))) : i12;
                this.m = fontMetricsInt;
                Layout layout22 = this.f;
                this.j = men.z(layout22, i13, layout22.getPaint());
                Layout layout32 = this.f;
                this.k = men.A(layout32, i13, layout32.getPaint());
            }
            j = j2;
            Paint.FontMetricsInt fontMetricsInt2 = null;
            if (u.getText() instanceof Spanned) {
            }
            i6gVarArr = null;
            this.o = i6gVarArr;
            if (i6gVarArr != null) {
            }
            this.h = Math.max((int) (j >> c), (int) (j2 >> c));
            this.i = Math.max((int) (j & 4294967295L), (int) (j2 & 4294967295L));
            TextPaint textPaint222 = this.a;
            i6g[] i6gVarArr222 = this.o;
            i11 = this.g - 1;
            layout = this.f;
            if (layout.getLineStart(i11) == layout.getLineEnd(i11)) {
            }
            i12 = 0;
            this.n = fontMetricsInt2 != null ? fontMetricsInt2.bottom - ((int) (e(i13) - g(i13))) : i12;
            this.m = fontMetricsInt2;
            Layout layout222 = this.f;
            this.j = men.z(layout222, i13, layout222.getPaint());
            Layout layout322 = this.f;
            this.k = men.A(layout322, i13, layout322.getPaint());
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

    public final gs4 c() {
        gs4 gs4Var = this.q;
        if (gs4Var != null) {
            return gs4Var;
        }
        gs4 gs4Var2 = new gs4();
        gs4Var2.a = this.f;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            int S = StringsKt.S(((Layout) gs4Var2.a).getText(), '\n', i, 4);
            i = S < 0 ? ((Layout) gs4Var2.a).getText().length() : S + 1;
            arrayList.add(Integer.valueOf(i));
        } while (i < ((Layout) gs4Var2.a).getText().length());
        gs4Var2.b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(null);
        }
        gs4Var2.c = arrayList2;
        gs4Var2.d = new boolean[((ArrayList) gs4Var2.b).size()];
        ((ArrayList) gs4Var2.b).size();
        this.q = gs4Var2;
        return gs4Var2;
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
        q9s q9sVar = eds.a;
        Layout layout = this.f;
        return (layout.getEllipsisCount(i) <= 0 || this.b != TextUtils.TruncateAt.END) ? layout.getLineEnd(i) : layout.getText().length();
    }

    public final float g(int i) {
        return this.f.getLineTop(i) + (i == 0 ? 0 : this.h);
    }

    public final float h(int i, boolean z) {
        return b(this.f.getLineForOffset(i)) + c().u(i, true, z);
    }

    public final float i(int i, boolean z) {
        return b(this.f.getLineForOffset(i)) + c().u(i, false, z);
    }

    public final ah3 j() {
        ah3 ah3Var = this.e;
        if (ah3Var != null) {
            return ah3Var;
        }
        Layout layout = this.f;
        ah3 ah3Var2 = new ah3(layout.getText(), layout.getText().length(), this.a.getTextLocale());
        this.e = ah3Var2;
        return ah3Var2;
    }
}
