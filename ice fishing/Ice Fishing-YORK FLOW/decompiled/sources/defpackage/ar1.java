package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ar1 extends android.text.style.ReplacementSpan {
    public android.text.TextPaint e6mdH7fiFuta;
    public final defpackage.zq1 oh71FJcDz6S2;
    public final android.graphics.Paint.FontMetricsInt WDYagTQQm9ns = new android.graphics.Paint.FontMetricsInt();
    public short QiMR8OkAhezm = -1;
    public float P05cfTpS5W5L = 1.0f;

    public ar1(defpackage.zq1 zq1Var) {
        defpackage.w60.GE9mJIPrb8gP(zq1Var, "rasterizer cannot be null");
        this.oh71FJcDz6S2 = zq1Var;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, android.graphics.Paint paint) {
        android.text.TextPaint textPaint = null;
        if (charSequence instanceof android.text.Spanned) {
            android.text.style.CharacterStyle[] characterStyleArr = (android.text.style.CharacterStyle[]) ((android.text.Spanned) charSequence).getSpans(i, i2, android.text.style.CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    android.text.TextPaint textPaint2 = this.e6mdH7fiFuta;
                    if (textPaint2 == null) {
                        textPaint2 = new android.text.TextPaint();
                        this.e6mdH7fiFuta = textPaint2;
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
            canvas.drawRect(f, i3, f + this.QiMR8OkAhezm, i5, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        defpackage.ju.ZpBGe2uQfcn8().getClass();
        float f2 = i4;
        android.graphics.Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        defpackage.zq1 zq1Var = this.oh71FJcDz6S2;
        defpackage.s81 s81Var = zq1Var.giKS3J6vZuNy;
        android.graphics.Typeface typeface = (android.graphics.Typeface) s81Var.P05cfTpS5W5L;
        android.graphics.Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) s81Var.oh71FJcDz6S2, zq1Var.ZpBGe2uQfcn8 * 2, 2, f, f2, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(android.graphics.Paint paint, java.lang.CharSequence charSequence, int i, int i2, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        android.graphics.Paint.FontMetricsInt fontMetricsInt2 = this.WDYagTQQm9ns;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = java.lang.Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        defpackage.zq1 zq1Var = this.oh71FJcDz6S2;
        this.P05cfTpS5W5L = abs / (zq1Var.giKS3J6vZuNy().ZpBGe2uQfcn8(14) != 0 ? ((java.nio.ByteBuffer) r8.P05cfTpS5W5L).getShort(r1 + r8.WDYagTQQm9ns) : (short) 0);
        defpackage.jl0 giKS3J6vZuNy = zq1Var.giKS3J6vZuNy();
        int ZpBGe2uQfcn8 = giKS3J6vZuNy.ZpBGe2uQfcn8(14);
        if (ZpBGe2uQfcn8 != 0) {
            ((java.nio.ByteBuffer) giKS3J6vZuNy.P05cfTpS5W5L).getShort(ZpBGe2uQfcn8 + giKS3J6vZuNy.WDYagTQQm9ns);
        }
        short s = (short) ((zq1Var.giKS3J6vZuNy().ZpBGe2uQfcn8(12) != 0 ? ((java.nio.ByteBuffer) r5.P05cfTpS5W5L).getShort(r7 + r5.WDYagTQQm9ns) : (short) 0) * this.P05cfTpS5W5L);
        this.QiMR8OkAhezm = s;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s;
    }
}
