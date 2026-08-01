package com.google.android.datatransport;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowHandlerHandler extends ReplacementSpan {
    public TextPaint WinterFlowSyntax;
    public final WinterFlowBackend WinterFlowTransactionManagerStrategy;
    public final Paint.FontMetricsInt WinterFlowVariableVersionControl = new Paint.FontMetricsInt();
    public short WinterFlowUnitTestResponse = -1;
    public float WinterFlowRouterRouter = 1.0f;

    public WinterFlowHandlerHandler(WinterFlowBackend winterFlowBackend) {
        WinterFlowSoftwareException.WinterFlowSerializerStructure(winterFlowBackend, "rasterizer cannot be null");
        this.WinterFlowTransactionManagerStrategy = winterFlowBackend;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i2, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.WinterFlowSyntax;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.WinterFlowSyntax = textPaint2;
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
            canvas.drawRect(f, i3, f + this.WinterFlowUnitTestResponse, i5, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        WinterFlowIDEEngine.WinterFlowRouterStructure().getClass();
        float f2 = i4;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        WinterFlowBackend winterFlowBackend = this.WinterFlowTransactionManagerStrategy;
        WinterFlowStackProvider winterFlowStackProvider = winterFlowBackend.WinterFlowHookDataSource;
        Typeface typeface = (Typeface) winterFlowStackProvider.WinterFlowRouterRouter;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) winterFlowStackProvider.WinterFlowTransactionManagerStrategy, winterFlowBackend.WinterFlowRouterStructure * 2, 2, f, f2, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.WinterFlowVariableVersionControl;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        WinterFlowBackend winterFlowBackend = this.WinterFlowTransactionManagerStrategy;
        this.WinterFlowRouterRouter = abs / (winterFlowBackend.WinterFlowHookDataSource().WinterFlowRouterStructure(14) != 0 ? ((ByteBuffer) r8.WinterFlowRouterRouter).getShort(r1 + r8.WinterFlowVariableVersionControl) : (short) 0);
        WinterFlowSoftwareVersion WinterFlowHookDataSource = winterFlowBackend.WinterFlowHookDataSource();
        int WinterFlowRouterStructure = WinterFlowHookDataSource.WinterFlowRouterStructure(14);
        if (WinterFlowRouterStructure != 0) {
            ((ByteBuffer) WinterFlowHookDataSource.WinterFlowRouterRouter).getShort(WinterFlowRouterStructure + WinterFlowHookDataSource.WinterFlowVariableVersionControl);
        }
        short s = (short) ((winterFlowBackend.WinterFlowHookDataSource().WinterFlowRouterStructure(12) != 0 ? ((ByteBuffer) r5.WinterFlowRouterRouter).getShort(r7 + r5.WinterFlowVariableVersionControl) : (short) 0) * this.WinterFlowRouterRouter);
        this.WinterFlowUnitTestResponse = s;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s;
    }
}
