package defpackage;

/* loaded from: classes.dex */
public final class ev0 extends android.text.style.ReplacementSpan {
    public int AARZUJiTa;
    public boolean EXtogiMhuM;
    public android.graphics.Paint.FontMetricsInt adDC3e2L;
    public int xiZrDbcSW0;

    public final android.graphics.Paint.FontMetricsInt IHQe1A4L2xu() {
        android.graphics.Paint.FontMetricsInt fontMetricsInt = this.adDC3e2L;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        defpackage.x70.Ye0N2xE9Hc("fontMetrics");
        throw null;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(android.graphics.Paint paint, java.lang.CharSequence charSequence, int i, int i2, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        this.EXtogiMhuM = true;
        paint.getTextSize();
        this.adDC3e2L = paint.getFontMetricsInt();
        if (IHQe1A4L2xu().descent <= IHQe1A4L2xu().ascent) {
            defpackage.y50.IHQe1A4L2xu("Invalid fontMetrics: line height can not be negative.");
        }
        this.xiZrDbcSW0 = (int) java.lang.Math.ceil(0.0d);
        this.AARZUJiTa = (int) java.lang.Math.ceil(0.0d);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = IHQe1A4L2xu().ascent;
            fontMetricsInt.descent = IHQe1A4L2xu().descent;
            fontMetricsInt.leading = IHQe1A4L2xu().leading;
            if (fontMetricsInt.ascent > (-oh6vYeIP())) {
                fontMetricsInt.ascent = -oh6vYeIP();
            }
            fontMetricsInt.top = java.lang.Math.min(IHQe1A4L2xu().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = java.lang.Math.max(IHQe1A4L2xu().bottom, fontMetricsInt.descent);
        }
        return r1MBDhnF();
    }

    public final int oh6vYeIP() {
        if (!this.EXtogiMhuM) {
            defpackage.y50.oh6vYeIP("PlaceholderSpan is not laid out yet.");
        }
        return this.AARZUJiTa;
    }

    public final int r1MBDhnF() {
        if (!this.EXtogiMhuM) {
            defpackage.y50.oh6vYeIP("PlaceholderSpan is not laid out yet.");
        }
        return this.xiZrDbcSW0;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, android.graphics.Paint paint) {
    }
}
