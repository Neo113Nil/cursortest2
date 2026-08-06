package defpackage;

/* loaded from: classes.dex */
public final class fe0 implements android.text.style.LineHeightSpan {
    public final float adDC3e2L;

    public fe0(float f) {
        this.adDC3e2L = f;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(java.lang.CharSequence charSequence, int i, int i2, int i3, int i4, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt.descent - fontMetricsInt.ascent <= 0) {
            return;
        }
        int ceil = (int) java.lang.Math.ceil(fontMetricsInt.descent * ((r0 * 1.0f) / r1));
        fontMetricsInt.descent = ceil;
        fontMetricsInt.ascent = ceil - ((int) java.lang.Math.ceil(this.adDC3e2L));
    }
}
