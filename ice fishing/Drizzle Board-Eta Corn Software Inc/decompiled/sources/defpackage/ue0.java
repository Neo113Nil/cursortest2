package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class ue0 extends ReplacementSpan {
    public final te0 MdtA4re8;
    public TextPaint P7K7Inc8;
    public final Paint.FontMetricsInt NCTxEWno = new Paint.FontMetricsInt();
    public short wxUZMvaN = -1;
    public float VgvYg0wo = 1.0f;

    public ue0(te0 te0Var) {
        fn.MdtA4re8(te0Var, "rasterizer cannot be null");
        this.MdtA4re8 = te0Var;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i2, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.P7K7Inc8;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.P7K7Inc8 = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        characterStyle.updateDrawState(textPaint);
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
            canvas.drawRect(f, i3, f + this.wxUZMvaN, i5, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        ze.qoPGr6Ce().getClass();
        float f2 = i4;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        te0 te0Var = this.MdtA4re8;
        VZZbw3BB vZZbw3BB = te0Var.NCTxEWno;
        Typeface typeface = (Typeface) vZZbw3BB.wxUZMvaN;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) vZZbw3BB.NCTxEWno, te0Var.qoPGr6Ce * 2, 2, f, f2, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.NCTxEWno;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        te0 te0Var = this.MdtA4re8;
        this.VgvYg0wo = abs / (te0Var.NCTxEWno().qoPGr6Ce(14) != 0 ? ((ByteBuffer) r8.VgvYg0wo).getShort(r1 + r8.NCTxEWno) : (short) 0);
        ts NCTxEWno = te0Var.NCTxEWno();
        int qoPGr6Ce = NCTxEWno.qoPGr6Ce(14);
        if (qoPGr6Ce != 0) {
            ((ByteBuffer) NCTxEWno.VgvYg0wo).getShort(qoPGr6Ce + NCTxEWno.NCTxEWno);
        }
        short s = (short) ((te0Var.NCTxEWno().qoPGr6Ce(12) != 0 ? ((ByteBuffer) r5.VgvYg0wo).getShort(r7 + r5.NCTxEWno) : (short) 0) * this.VgvYg0wo);
        this.wxUZMvaN = s;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s;
    }
}
