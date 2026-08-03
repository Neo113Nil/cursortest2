package j2;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a extends MetricAffectingSpan {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3496g;

    /* renamed from: h, reason: collision with root package name */
    public final float f3497h;

    public /* synthetic */ a(int i10, float f10) {
        this.f3496g = i10;
        this.f3497h = f10;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f3496g) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f3497h);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f3497h);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f3496g) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f3497h);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f3497h);
                break;
        }
    }
}
