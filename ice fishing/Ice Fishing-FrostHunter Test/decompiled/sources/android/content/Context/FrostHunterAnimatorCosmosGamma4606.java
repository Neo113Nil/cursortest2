package android.content.Context;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterAnimatorCosmosGamma4606 extends MetricAffectingSpan {
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final Object FrostHunterFlowMaxDragonHero5809;

    public /* synthetic */ FrostHunterAnimatorCosmosGamma4606(int i, Object obj) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        Object obj = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                textPaint.setFontFeatureSettings((String) obj);
                break;
            default:
                textPaint.setTypeface((Typeface) obj);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        Object obj = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                textPaint.setFontFeatureSettings((String) obj);
                break;
            default:
                textPaint.setTypeface((Typeface) obj);
                break;
        }
    }
}
