package defpackage;

import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.widget.TextView;

/* loaded from: classes3.dex */
public final class b1u extends MetricAffectingSpan {
    public final int a;
    public final int b;
    public final en9 c;
    public final Paint.FontMetricsInt d = new Paint.FontMetricsInt();

    public b1u(int i, int i2, en9 en9Var) {
        this.a = i;
        this.b = i2;
        this.c = en9Var;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Layout layout = ((TextView) this.c.b).getLayout();
        if (layout == null) {
            return;
        }
        CharSequence text = layout.getText();
        Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
        if (spanned == null) {
            return;
        }
        int spanStart = spanned.getSpanStart(this);
        int spanEnd = spanned.getSpanEnd(this);
        if (spanStart < 0 || spanEnd < 0 || spanStart >= spanEnd) {
            return;
        }
        int lineForOffset = layout.getLineForOffset(spanStart);
        int lineTop = layout.getLineTop(lineForOffset);
        int lineBottom = layout.getLineBottom(lineForOffset);
        int lineBaseline = layout.getLineBaseline(lineForOffset);
        int i = lineTop - lineBaseline;
        int b = (lineBottom - lineBaseline) - (lineForOffset == layout.getLineCount() - 1 ? 0 : eeh.b(layout.getSpacingAdd()));
        int i2 = this.a;
        if (i2 > 0) {
            textPaint.setTextSize(i2);
        }
        Paint.FontMetricsInt fontMetricsInt = this.d;
        textPaint.getFontMetricsInt(fontMetricsInt);
        int D = ouj.D(this.b);
        if (D == 0) {
            textPaint.baselineShift = (i - fontMetricsInt.ascent) + textPaint.baselineShift;
        } else if (D == 1) {
            textPaint.baselineShift = (((i + b) / 2) - ((fontMetricsInt.ascent + fontMetricsInt.descent) / 2)) + textPaint.baselineShift;
        } else {
            if (D != 3) {
                return;
            }
            textPaint.baselineShift = (b - fontMetricsInt.descent) + textPaint.baselineShift;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        updateDrawState(textPaint);
    }
}
