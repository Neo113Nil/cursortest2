package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class bu extends MetricAffectingSpan {
    public final Object EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS;

    public /* synthetic */ bu(int i, Object obj) {
        this.OOA6hdeuvCS = i;
        this.EljAMC1QTz = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int i = this.OOA6hdeuvCS;
        Object obj = this.EljAMC1QTz;
        switch (i) {
            case 0:
                textPaint.setFontFeatureSettings((String) obj);
                break;
            default:
                textPaint.setTypeface((Typeface) obj);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        int i = this.OOA6hdeuvCS;
        Object obj = this.EljAMC1QTz;
        switch (i) {
            case 0:
                textPaint.setFontFeatureSettings((String) obj);
                break;
            default:
                textPaint.setTypeface((Typeface) obj);
                break;
        }
    }
}
