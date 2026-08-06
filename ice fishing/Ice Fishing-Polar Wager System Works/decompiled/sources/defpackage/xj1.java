package defpackage;

/* loaded from: classes.dex */
public final class xj1 extends android.text.style.ReplacementSpan {
    public android.text.TextPaint riuEU0zW4;
    public final defpackage.wj1 xiZrDbcSW0;
    public final android.graphics.Paint.FontMetricsInt adDC3e2L = new android.graphics.Paint.FontMetricsInt();
    public short AARZUJiTa = -1;
    public float EXtogiMhuM = 1.0f;

    public xj1(defpackage.wj1 wj1Var) {
        defpackage.a70.xiZrDbcSW0(wj1Var, "rasterizer cannot be null");
        this.xiZrDbcSW0 = wj1Var;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, android.graphics.Paint paint) {
        android.text.TextPaint textPaint = null;
        if (charSequence instanceof android.text.Spanned) {
            android.text.style.CharacterStyle[] characterStyleArr = (android.text.style.CharacterStyle[]) ((android.text.Spanned) charSequence).getSpans(i, i2, android.text.style.CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    android.text.TextPaint textPaint2 = this.riuEU0zW4;
                    if (textPaint2 == null) {
                        textPaint2 = new android.text.TextPaint();
                        this.riuEU0zW4 = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint);
                    for (android.text.style.CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof android.text.style.MetricAffectingSpan)) {
                            characterStyle.updateDrawState(textPaint);
                        }
                    }
                }
            }
            if (paint instanceof android.text.TextPaint) {
                textPaint = (android.text.TextPaint) paint;
            }
        } else if (paint instanceof android.text.TextPaint) {
            textPaint = (android.text.TextPaint) paint;
        }
        android.text.TextPaint textPaint3 = textPaint;
        if (textPaint3 != null && textPaint3.bgColor != 0) {
            int color = textPaint3.getColor();
            android.graphics.Paint.Style style = textPaint3.getStyle();
            textPaint3.setColor(textPaint3.bgColor);
            textPaint3.setStyle(android.graphics.Paint.Style.FILL);
            canvas.drawRect(f, i3, f + this.AARZUJiTa, i5, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        defpackage.ws.IHQe1A4L2xu().getClass();
        float f2 = i4;
        android.graphics.Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        defpackage.wj1 wj1Var = this.xiZrDbcSW0;
        defpackage.y yVar = wj1Var.oh6vYeIP;
        android.graphics.Typeface typeface = (android.graphics.Typeface) yVar.EXtogiMhuM;
        android.graphics.Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) yVar.xiZrDbcSW0, wj1Var.IHQe1A4L2xu * 2, 2, f, f2, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(android.graphics.Paint paint, java.lang.CharSequence charSequence, int i, int i2, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        android.graphics.Paint.FontMetricsInt fontMetricsInt2 = this.adDC3e2L;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = java.lang.Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        defpackage.wj1 wj1Var = this.xiZrDbcSW0;
        this.EXtogiMhuM = abs / (wj1Var.oh6vYeIP().IHQe1A4L2xu(14) != 0 ? ((java.nio.ByteBuffer) r8.EXtogiMhuM).getShort(r1 + r8.adDC3e2L) : (short) 0);
        defpackage.cj0 oh6vYeIP = wj1Var.oh6vYeIP();
        int IHQe1A4L2xu = oh6vYeIP.IHQe1A4L2xu(14);
        if (IHQe1A4L2xu != 0) {
            ((java.nio.ByteBuffer) oh6vYeIP.EXtogiMhuM).getShort(IHQe1A4L2xu + oh6vYeIP.adDC3e2L);
        }
        short s = (short) ((wj1Var.oh6vYeIP().IHQe1A4L2xu(12) != 0 ? ((java.nio.ByteBuffer) r5.EXtogiMhuM).getShort(r7 + r5.adDC3e2L) : (short) 0) * this.EXtogiMhuM);
        this.AARZUJiTa = s;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s;
    }
}
