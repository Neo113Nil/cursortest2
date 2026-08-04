package com.gamericefishpro.space.t2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends ReplacementSpan {
    public Paint.FontMetricsInt d;
    public int e;
    public int i;
    public boolean v;

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.d;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        Intrinsics.h("fontMetrics");
        throw null;
    }

    public final int b() {
        if (!this.v) {
            com.gamericefishpro.space.w2.a.b("PlaceholderSpan is not laid out yet.");
        }
        return this.i;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        this.v = true;
        paint.getTextSize();
        this.d = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            com.gamericefishpro.space.w2.a.a("Invalid fontMetrics: line height can not be negative.");
        }
        this.e = (int) Math.ceil(0.0f);
        this.i = (int) Math.ceil(0.0f);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = a().ascent;
            fontMetricsInt.descent = a().descent;
            fontMetricsInt.leading = a().leading;
            if (fontMetricsInt.ascent > (-b())) {
                fontMetricsInt.ascent = -b();
            }
            fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
        }
        if (!this.v) {
            com.gamericefishpro.space.w2.a.b("PlaceholderSpan is not laid out yet.");
        }
        return this.e;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }
}
