package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class uy0 extends android.text.style.ReplacementSpan {
    public boolean P05cfTpS5W5L;
    public int QiMR8OkAhezm;
    public android.graphics.Paint.FontMetricsInt WDYagTQQm9ns;
    public int oh71FJcDz6S2;

    public final android.graphics.Paint.FontMetricsInt ZpBGe2uQfcn8() {
        android.graphics.Paint.FontMetricsInt fontMetricsInt = this.WDYagTQQm9ns;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        defpackage.ma0.hH0RRJrNssvh("fontMetrics");
        throw null;
    }

    public final int fWTAfUmVKrZq() {
        if (!this.P05cfTpS5W5L) {
            defpackage.f80.giKS3J6vZuNy("PlaceholderSpan is not laid out yet.");
        }
        return this.oh71FJcDz6S2;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(android.graphics.Paint paint, java.lang.CharSequence charSequence, int i, int i2, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        this.P05cfTpS5W5L = true;
        paint.getTextSize();
        this.WDYagTQQm9ns = paint.getFontMetricsInt();
        if (ZpBGe2uQfcn8().descent <= ZpBGe2uQfcn8().ascent) {
            defpackage.f80.ZpBGe2uQfcn8("Invalid fontMetrics: line height can not be negative.");
        }
        this.oh71FJcDz6S2 = (int) java.lang.Math.ceil(0.0d);
        this.QiMR8OkAhezm = (int) java.lang.Math.ceil(0.0d);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = ZpBGe2uQfcn8().ascent;
            fontMetricsInt.descent = ZpBGe2uQfcn8().descent;
            fontMetricsInt.leading = ZpBGe2uQfcn8().leading;
            if (fontMetricsInt.ascent > (-giKS3J6vZuNy())) {
                fontMetricsInt.ascent = -giKS3J6vZuNy();
            }
            fontMetricsInt.top = java.lang.Math.min(ZpBGe2uQfcn8().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = java.lang.Math.max(ZpBGe2uQfcn8().bottom, fontMetricsInt.descent);
        }
        return fWTAfUmVKrZq();
    }

    public final int giKS3J6vZuNy() {
        if (!this.P05cfTpS5W5L) {
            defpackage.f80.giKS3J6vZuNy("PlaceholderSpan is not laid out yet.");
        }
        return this.QiMR8OkAhezm;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, android.graphics.Paint paint) {
    }
}
