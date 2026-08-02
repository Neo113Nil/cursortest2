package com.yandex.plus.plaquesdk.utils;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes5.dex */
public final class b extends MetricAffectingSpan {
    public final Typeface a;
    public final int b;

    public b(Typeface typeface, int i) {
        typeface.getClass();
        this.a = typeface;
        this.b = i;
    }

    public final void a(TextPaint textPaint) {
        Typeface typeface = this.a;
        int i = (~typeface.getStyle()) & this.b;
        if ((i & 1) != 0) {
            textPaint.setFakeBoldText(true);
        }
        if ((i & 2) != 0) {
            textPaint.setTextSkewX(-0.25f);
        }
        textPaint.setTypeface(typeface);
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.getClass();
        a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.getClass();
        a(textPaint);
    }
}
