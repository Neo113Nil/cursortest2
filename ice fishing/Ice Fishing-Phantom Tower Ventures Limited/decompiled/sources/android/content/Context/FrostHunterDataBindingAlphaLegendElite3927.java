package android.content.Context;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterDataBindingAlphaLegendElite3927 extends RippleDrawable {
    public Integer FrostHunterAlertDialogAuroraDelta3200;
    public final boolean FrostHunterCameraXPixelTurboCosmos9814;
    public FrostHunterViewModelScopeLegendAurora8732 FrostHunterFlowMaxDragonHero5809;
    public boolean FrostHunterKeyframeGammaGamma1197;

    public FrostHunterDataBindingAlphaLegendElite3927(boolean z) {
        super(ColorStateList.valueOf(-16777216), null, z ? new ColorDrawable(-1) : null);
        this.FrostHunterCameraXPixelTurboCosmos9814 = z;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.FrostHunterCameraXPixelTurboCosmos9814) {
            this.FrostHunterKeyframeGammaGamma1197 = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.FrostHunterKeyframeGammaGamma1197 = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.FrostHunterKeyframeGammaGamma1197;
    }
}
