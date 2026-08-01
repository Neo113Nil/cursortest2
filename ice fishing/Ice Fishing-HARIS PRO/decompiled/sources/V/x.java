package V;

import a.AbstractC0078a;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class x extends ReplacementSpan {

    /* renamed from: b, reason: collision with root package name */
    public final w f1253b;
    public TextPaint e;

    /* renamed from: a, reason: collision with root package name */
    public final Paint.FontMetricsInt f1252a = new Paint.FontMetricsInt();

    /* renamed from: c, reason: collision with root package name */
    public short f1254c = -1;

    /* renamed from: d, reason: collision with root package name */
    public float f1255d = 1.0f;

    public x(w wVar) {
        AbstractC0078a.g(wVar, "rasterizer cannot be null");
        this.f1253b = wVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f2, int i3, int i4, int i5, Paint paint) {
        Paint paint2 = paint;
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i2, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.e;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.e = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint2);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        characterStyle.updateDrawState(textPaint);
                    }
                }
            }
            if (paint2 instanceof TextPaint) {
                textPaint = (TextPaint) paint2;
            }
        } else if (paint2 instanceof TextPaint) {
            textPaint = (TextPaint) paint2;
        }
        if (textPaint != null && textPaint.bgColor != 0) {
            int color = textPaint.getColor();
            Paint.Style style = textPaint.getStyle();
            textPaint.setColor(textPaint.bgColor);
            textPaint.setStyle(Paint.Style.FILL);
            canvas.drawRect(f2, i3, f2 + this.f1254c, i5, textPaint);
            textPaint.setStyle(style);
            textPaint.setColor(color);
        }
        j.a().getClass();
        float f3 = i4;
        if (textPaint != null) {
            paint2 = textPaint;
        }
        w wVar = this.f1253b;
        B.k kVar = wVar.f1250b;
        Typeface typeface = (Typeface) kVar.f31d;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) kVar.f29b, wVar.f1249a * 2, 2, f2, f3, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f1252a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        w wVar = this.f1253b;
        this.f1255d = abs / (wVar.c().a(14) != 0 ? ((ByteBuffer) r8.f839d).getShort(r1 + r8.f836a) : (short) 0);
        W.a c2 = wVar.c();
        int a2 = c2.a(14);
        if (a2 != 0) {
            ((ByteBuffer) c2.f839d).getShort(a2 + c2.f836a);
        }
        short s2 = (short) ((wVar.c().a(12) != 0 ? ((ByteBuffer) r5.f839d).getShort(r7 + r5.f836a) : (short) 0) * this.f1255d);
        this.f1254c = s2;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s2;
    }
}
