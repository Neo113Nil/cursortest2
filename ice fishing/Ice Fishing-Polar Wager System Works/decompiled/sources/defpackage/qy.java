package defpackage;

/* loaded from: classes.dex */
public final class qy extends android.text.style.MetricAffectingSpan {
    public final /* synthetic */ int adDC3e2L;
    public final java.lang.Object xiZrDbcSW0;

    public /* synthetic */ qy(int i, java.lang.Object obj) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint textPaint) {
        int i = this.adDC3e2L;
        java.lang.Object obj = this.xiZrDbcSW0;
        switch (i) {
            case 0:
                textPaint.setFontFeatureSettings((java.lang.String) obj);
                break;
            default:
                textPaint.setTypeface((android.graphics.Typeface) obj);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(android.text.TextPaint textPaint) {
        int i = this.adDC3e2L;
        java.lang.Object obj = this.xiZrDbcSW0;
        switch (i) {
            case 0:
                textPaint.setFontFeatureSettings((java.lang.String) obj);
                break;
            default:
                textPaint.setTypeface((android.graphics.Typeface) obj);
                break;
        }
    }
}
