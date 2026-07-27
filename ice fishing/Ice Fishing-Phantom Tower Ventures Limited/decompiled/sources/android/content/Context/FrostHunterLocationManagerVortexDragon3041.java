package android.content.Context;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterLocationManagerVortexDragon3041 extends MetricAffectingSpan {
    public final float FrostHunterCameraXPixelTurboCosmos9814;

    public FrostHunterLocationManagerVortexDragon3041(float f) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        float textScaleX = textPaint.getTextScaleX() * textPaint.getTextSize();
        if (textScaleX == 0.0f) {
            return;
        }
        textPaint.setLetterSpacing(this.FrostHunterCameraXPixelTurboCosmos9814 / textScaleX);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        float textScaleX = textPaint.getTextScaleX() * textPaint.getTextSize();
        if (textScaleX == 0.0f) {
            return;
        }
        textPaint.setLetterSpacing(this.FrostHunterCameraXPixelTurboCosmos9814 / textScaleX);
    }
}
