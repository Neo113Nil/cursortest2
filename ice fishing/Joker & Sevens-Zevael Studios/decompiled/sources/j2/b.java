package j2;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b extends MetricAffectingSpan {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3498g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f3499h;

    public /* synthetic */ b(int i10, Object obj) {
        this.f3498g = i10;
        this.f3499h = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f3498g) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f3499h);
                break;
            default:
                textPaint.setTypeface((Typeface) this.f3499h);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f3498g) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f3499h);
                break;
            default:
                textPaint.setTypeface((Typeface) this.f3499h);
                break;
        }
    }
}
