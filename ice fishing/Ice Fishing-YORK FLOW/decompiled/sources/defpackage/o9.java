package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class o9 extends android.text.style.MetricAffectingSpan {
    public final /* synthetic */ int WDYagTQQm9ns;
    public final float oh71FJcDz6S2;

    public /* synthetic */ o9(float f, int i) {
        this.WDYagTQQm9ns = i;
        this.oh71FJcDz6S2 = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint textPaint) {
        int i = this.WDYagTQQm9ns;
        float f = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                textPaint.baselineShift += (int) java.lang.Math.ceil(textPaint.ascent() * f);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + f);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(android.text.TextPaint textPaint) {
        int i = this.WDYagTQQm9ns;
        float f = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                textPaint.baselineShift += (int) java.lang.Math.ceil(textPaint.ascent() * f);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + f);
                break;
        }
    }
}
