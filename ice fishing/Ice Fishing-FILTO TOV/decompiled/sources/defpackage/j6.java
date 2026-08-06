package defpackage;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class j6 extends MetricAffectingSpan {
    public final float EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS;

    public /* synthetic */ j6(float f, int i) {
        this.OOA6hdeuvCS = i;
        this.EljAMC1QTz = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int i = this.OOA6hdeuvCS;
        float f = this.EljAMC1QTz;
        switch (i) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * f);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + f);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        int i = this.OOA6hdeuvCS;
        float f = this.EljAMC1QTz;
        switch (i) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * f);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + f);
                break;
        }
    }
}
