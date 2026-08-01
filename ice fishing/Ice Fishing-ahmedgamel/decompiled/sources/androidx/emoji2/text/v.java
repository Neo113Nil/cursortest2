package androidx.emoji2.text;

import L3.F;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;
import b0.C0511a;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class v extends ReplacementSpan {

    /* renamed from: b, reason: collision with root package name */
    public final u f4807b;

    /* renamed from: e, reason: collision with root package name */
    public TextPaint f4810e;

    /* renamed from: a, reason: collision with root package name */
    public final Paint.FontMetricsInt f4806a = new Paint.FontMetricsInt();

    /* renamed from: c, reason: collision with root package name */
    public short f4808c = -1;

    /* renamed from: d, reason: collision with root package name */
    public float f4809d = 1.0f;

    public v(u uVar) {
        F.f(uVar, "rasterizer cannot be null");
        this.f4807b = uVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i6, float f3, int i9, int i10, int i11, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i6, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f4810e;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f4810e = textPaint2;
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
            canvas.drawRect(f3, i9, f3 + this.f4808c, i11, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        j.a().getClass();
        float f9 = i10;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        u uVar = this.f4807b;
        S0.i iVar = uVar.f4804b;
        Typeface typeface = (Typeface) iVar.f2791x;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) iVar.f2789v, uVar.f4803a * 2, 2, f3, f9, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i6, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f4806a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        u uVar = this.f4807b;
        this.f4809d = abs / (uVar.b().a(14) != 0 ? ((ByteBuffer) r8.f2045w).getShort(r1 + r8.f2042n) : (short) 0);
        C0511a b9 = uVar.b();
        int a9 = b9.a(14);
        if (a9 != 0) {
            ((ByteBuffer) b9.f2045w).getShort(a9 + b9.f2042n);
        }
        short s9 = (short) ((uVar.b().a(12) != 0 ? ((ByteBuffer) r5.f2045w).getShort(r7 + r5.f2042n) : (short) 0) * this.f4809d);
        this.f4808c = s9;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s9;
    }
}
