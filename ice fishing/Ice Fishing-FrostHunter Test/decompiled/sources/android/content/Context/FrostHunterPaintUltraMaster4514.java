package android.content.Context;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterPaintUltraMaster4514 extends MetricAffectingSpan {
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final float FrostHunterFlowMaxDragonHero5809;

    public /* synthetic */ FrostHunterPaintUltraMaster4514(float f, int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        float f = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * f);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + f);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        float f = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * f);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + f);
                break;
        }
    }
}
