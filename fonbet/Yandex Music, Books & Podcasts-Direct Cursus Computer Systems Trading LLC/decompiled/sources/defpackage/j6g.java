package defpackage;

import android.graphics.Paint;
import android.text.Spanned;
import android.text.style.LineHeightSpan;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class j6g implements LineHeightSpan {
    public final int a;
    public final int b;
    public final int c;
    public boolean d;
    public int e = Integer.MAX_VALUE;
    public int f = Integer.MAX_VALUE;
    public int g = Integer.MAX_VALUE;
    public int h = Integer.MAX_VALUE;

    public j6g(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int i5;
        Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
        if (spanned == null) {
            return;
        }
        int spanStart = spanned.getSpanStart(this);
        if (i > spanned.getSpanEnd(this) || spanStart > i2) {
            return;
        }
        if (this.d) {
            fontMetricsInt.top = this.e;
            fontMetricsInt.ascent = this.f;
            fontMetricsInt.descent = this.g;
            fontMetricsInt.bottom = this.h;
        } else {
            this.d = true;
            this.e = fontMetricsInt.top;
            this.f = fontMetricsInt.ascent;
            this.g = fontMetricsInt.descent;
            this.h = fontMetricsInt.bottom;
        }
        Object[] spans = spanned.getSpans(i, i2, j6g.class);
        int i6 = this.b;
        for (Object obj : spans) {
            i6 = Math.max(i6, ((j6g) obj).b);
        }
        if (i6 > 0) {
            int i7 = fontMetricsInt.descent;
            int i8 = fontMetricsInt.ascent;
            int i9 = i7 - i8;
            int i10 = fontMetricsInt.top - i8;
            int i11 = fontMetricsInt.bottom - i7;
            if (i9 >= 0) {
                int i12 = i6 - i9;
                if (i12 < 0) {
                    int i13 = i8 - (i12 / 2);
                    if (i13 > 0) {
                        i13 = 0;
                    }
                    fontMetricsInt.ascent = i13;
                    int i14 = i13 + i6;
                    if (i14 < 0) {
                        i14 = 0;
                    }
                    fontMetricsInt.descent = i14;
                } else {
                    int i15 = (i12 / 2) + i7;
                    if (i15 < 0) {
                        i15 = 0;
                    }
                    fontMetricsInt.descent = i15;
                    int i16 = i15 - i6;
                    if (i16 > 0) {
                        i16 = 0;
                    }
                    fontMetricsInt.ascent = i16;
                }
                fontMetricsInt.top = fontMetricsInt.ascent + i10;
                fontMetricsInt.bottom = fontMetricsInt.descent + i11;
            }
        }
        int i17 = this.c;
        if (i17 == spanStart && i <= i17 && i17 <= i2 && (i5 = this.a) > 0) {
            fontMetricsInt.top -= i5;
            fontMetricsInt.ascent -= i5;
        }
        if (StringsKt.M(charSequence.subSequence(i, i2).toString(), StringUtil.LF, false)) {
            this.d = false;
        }
    }
}
