package defpackage;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes3.dex */
public final class upc extends MetricAffectingSpan {
    public final /* synthetic */ int a;
    public final String b;

    public /* synthetic */ upc(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.setFontFeatureSettings(this.b);
                break;
            default:
                textPaint.setFontFeatureSettings(this.b);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.setFontFeatureSettings(this.b);
                break;
            default:
                textPaint.setFontFeatureSettings(this.b);
                break;
        }
    }
}
