package q3;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class u extends ReplacementSpan {

    /* renamed from: h, reason: collision with root package name */
    public final t f5797h;

    /* renamed from: k, reason: collision with root package name */
    public TextPaint f5800k;

    /* renamed from: g, reason: collision with root package name */
    public final Paint.FontMetricsInt f5796g = new Paint.FontMetricsInt();

    /* renamed from: i, reason: collision with root package name */
    public short f5798i = -1;

    /* renamed from: j, reason: collision with root package name */
    public float f5799j = 1.0f;

    public u(t tVar) {
        a.a.m(tVar, "rasterizer cannot be null");
        this.f5797h = tVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i10, i11, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f5800k;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f5800k = textPaint2;
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
            canvas.drawRect(f10, i12, f10 + this.f5798i, i14, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        i.a().getClass();
        float f11 = i13;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        t tVar = this.f5797h;
        x4.n nVar = tVar.f5794b;
        Typeface typeface = (Typeface) nVar.f8319d;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) nVar.f8317b, tVar.f5793a * 2, 2, f10, f11, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f5796g;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        t tVar = this.f5797h;
        this.f5799j = abs / (tVar.b().a(14) != 0 ? ((ByteBuffer) r8.f1313j).getShort(r1 + r8.f1310g) : (short) 0);
        r3.a b2 = tVar.b();
        int a6 = b2.a(14);
        if (a6 != 0) {
            ((ByteBuffer) b2.f1313j).getShort(a6 + b2.f1310g);
        }
        short s10 = (short) ((tVar.b().a(12) != 0 ? ((ByteBuffer) r5.f1313j).getShort(r7 + r5.f1310g) : (short) 0) * this.f5799j);
        this.f5798i = s10;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s10;
    }
}
