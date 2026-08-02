package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;
import b0.C0515a;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class v extends ReplacementSpan {

    /* renamed from: b, reason: collision with root package name */
    public final u f4775b;

    /* renamed from: e, reason: collision with root package name */
    public TextPaint f4778e;

    /* renamed from: a, reason: collision with root package name */
    public final Paint.FontMetricsInt f4774a = new Paint.FontMetricsInt();

    /* renamed from: c, reason: collision with root package name */
    public short f4776c = -1;

    /* renamed from: d, reason: collision with root package name */
    public float f4777d = 1.0f;

    public v(u uVar) {
        A8.b.e(uVar, "rasterizer cannot be null");
        this.f4775b = uVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i4, float f2, int i6, int i9, int i10, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i4, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f4778e;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f4778e = textPaint2;
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
            canvas.drawRect(f2, i6, f2 + this.f4776c, i10, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        j.a().getClass();
        float f9 = i9;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        u uVar = this.f4775b;
        S0.n nVar = uVar.f4772b;
        Typeface typeface = (Typeface) nVar.f2934x;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) nVar.f2932v, uVar.f4771a * 2, 2, f2, f9, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i4, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f4774a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        u uVar = this.f4775b;
        this.f4777d = abs / (uVar.b().a(14) != 0 ? ((ByteBuffer) r8.f2133w).getShort(r1 + r8.f2130n) : (short) 0);
        C0515a b9 = uVar.b();
        int a9 = b9.a(14);
        if (a9 != 0) {
            ((ByteBuffer) b9.f2133w).getShort(a9 + b9.f2130n);
        }
        short s9 = (short) ((uVar.b().a(12) != 0 ? ((ByteBuffer) r5.f2133w).getShort(r7 + r5.f2130n) : (short) 0) * this.f4777d);
        this.f4776c = s9;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s9;
    }
}
