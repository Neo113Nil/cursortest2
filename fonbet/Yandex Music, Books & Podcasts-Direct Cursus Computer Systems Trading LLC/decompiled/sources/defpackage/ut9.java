package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.TextPaint;
import com.yandex.div.core.util.text.DivBackgroundSpan;

/* loaded from: classes3.dex */
public abstract class ut9 {
    public final TextPaint a = new TextPaint();

    public abstract void a(Canvas canvas, Layout layout, int i, int i2, int i3, int i4, DivBackgroundSpan divBackgroundSpan);

    public final tt9 b(Layout layout, int i, DivBackgroundSpan divBackgroundSpan, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int lineBaseline = layout.getLineBaseline(i);
        int lineAscent = layout.getLineAscent(i);
        int lineDescent = layout.getLineDescent(i);
        Integer num = divBackgroundSpan.f;
        if (num != null) {
            float intValue = num.intValue();
            TextPaint textPaint = this.a;
            textPaint.setTextSize(intValue);
            textPaint.setTypeface(divBackgroundSpan.h);
            textPaint.setFontFeatureSettings(divBackgroundSpan.i);
            if (woe.m()) {
                textPaint.setFontVariationSettings(null);
            }
            Paint.FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
            i3 = fontMetricsInt.ascent;
            i2 = fontMetricsInt.descent;
        } else {
            i2 = lineDescent;
            i3 = lineAscent;
        }
        Integer num2 = divBackgroundSpan.e;
        if (num2 != null) {
            int intValue2 = num2.intValue() - (i2 - i3);
            int i7 = intValue2 / 2;
            int i8 = intValue2 - i7;
            i5 = i3 - i7;
            i4 = i8 + i2;
        } else {
            i4 = i2;
            i5 = i3;
        }
        int i9 = divBackgroundSpan.c;
        if (i9 != 0) {
            i6 = -i9;
        } else {
            yq9 yq9Var = divBackgroundSpan.d;
            if (yq9Var != yq9.TOP) {
                if (yq9Var == yq9.CENTER) {
                    lineAscent = (lineAscent + lineDescent) / 2;
                    i3 = (i3 + i2) / 2;
                } else {
                    i6 = yq9Var == yq9.BOTTOM ? lineDescent - i2 : 0;
                }
            }
            i6 = lineAscent - i3;
        }
        if (z) {
            Integer num3 = divBackgroundSpan.g;
            r6 = -(num3 != null ? num3.intValue() : 0);
        }
        return new tt9(i5 + lineBaseline + i6 + r6, lineBaseline + i4 + i6);
    }
}
