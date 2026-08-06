package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class rb1 extends ReplacementSpan {
    public final qb1 EljAMC1QTz;
    public TextPaint mOu10nynGul;
    public final Paint.FontMetricsInt OOA6hdeuvCS = new Paint.FontMetricsInt();
    public short AvO7iQsrTN = -1;
    public float encWxUiV2 = 1.0f;

    public rb1(qb1 qb1Var) {
        n4.AvO7iQsrTN(qb1Var, "rasterizer cannot be null");
        this.EljAMC1QTz = qb1Var;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i2, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.mOu10nynGul;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.mOu10nynGul = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            characterStyle.updateDrawState(textPaint);
                        }
                    }
                }
            }
            if (paint instanceof TextPaint) {
                textPaint = (TextPaint) paint;
            }
        } else if (paint instanceof TextPaint) {
            textPaint = (TextPaint) paint;
        }
        TextPaint textPaint3 = textPaint;
        if (textPaint3 != null && textPaint3.bgColor != 0) {
            int color = textPaint3.getColor();
            Paint.Style style = textPaint3.getStyle();
            textPaint3.setColor(textPaint3.bgColor);
            textPaint3.setStyle(Paint.Style.FILL);
            canvas.drawRect(f, i3, f + this.AvO7iQsrTN, i5, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        gp.GWasM1elztuh().getClass();
        float f2 = i4;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        qb1 qb1Var = this.EljAMC1QTz;
        rx0 rx0Var = qb1Var.Yi7zF1RB1;
        Typeface typeface = (Typeface) rx0Var.encWxUiV2;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) rx0Var.EljAMC1QTz, qb1Var.GWasM1elztuh * 2, 2, f, f2, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.OOA6hdeuvCS;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        qb1 qb1Var = this.EljAMC1QTz;
        this.encWxUiV2 = abs / (qb1Var.Yi7zF1RB1().GWasM1elztuh(14) != 0 ? ((ByteBuffer) r8.encWxUiV2).getShort(r1 + r8.OOA6hdeuvCS) : (short) 0);
        xd0 Yi7zF1RB1 = qb1Var.Yi7zF1RB1();
        int GWasM1elztuh = Yi7zF1RB1.GWasM1elztuh(14);
        if (GWasM1elztuh != 0) {
            ((ByteBuffer) Yi7zF1RB1.encWxUiV2).getShort(GWasM1elztuh + Yi7zF1RB1.OOA6hdeuvCS);
        }
        short s = (short) ((qb1Var.Yi7zF1RB1().GWasM1elztuh(12) != 0 ? ((ByteBuffer) r5.encWxUiV2).getShort(r7 + r5.OOA6hdeuvCS) : (short) 0) * this.encWxUiV2);
        this.AvO7iQsrTN = s;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s;
    }
}
