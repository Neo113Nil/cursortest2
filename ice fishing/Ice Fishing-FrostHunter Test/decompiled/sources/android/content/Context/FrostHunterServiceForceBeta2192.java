package android.content.Context;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterServiceForceBeta2192 extends ClickableSpan {
    public final int FrostHunterAlertDialogAuroraDelta3200;
    public final int FrostHunterCameraXPixelTurboCosmos9814;
    public final FrostHunterMenuUltraHyperion3040 FrostHunterFlowMaxDragonHero5809;

    public FrostHunterServiceForceBeta2192(int i, FrostHunterMenuUltraHyperion3040 frostHunterMenuUltraHyperion3040, int i2) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterMenuUltraHyperion3040;
        this.FrostHunterAlertDialogAuroraDelta3200 = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.FrostHunterCameraXPixelTurboCosmos9814);
        this.FrostHunterFlowMaxDragonHero5809.FrostHunterAlphaAnimationNeoCosmos5761.performAction(this.FrostHunterAlertDialogAuroraDelta3200, bundle);
    }
}
