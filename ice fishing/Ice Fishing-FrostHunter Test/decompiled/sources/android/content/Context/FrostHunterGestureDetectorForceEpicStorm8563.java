package android.content.Context;

import java.util.Iterator;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterGestureDetectorForceEpicStorm8563 implements Iterator, FrostHunterContextBlazePrimeMax4967 {
    public boolean FrostHunterAlertDialogAuroraDelta3200;
    public final int FrostHunterCameraXPixelTurboCosmos9814;
    public final int FrostHunterFlowMaxDragonHero5809;
    public int FrostHunterKeyframeGammaGamma1197;

    public FrostHunterGestureDetectorForceEpicStorm8563(int i, int i2, int i3) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i3;
        this.FrostHunterFlowMaxDragonHero5809 = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.FrostHunterAlertDialogAuroraDelta3200 = z;
        this.FrostHunterKeyframeGammaGamma1197 = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.FrostHunterAlertDialogAuroraDelta3200;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.FrostHunterKeyframeGammaGamma1197;
        if (i != this.FrostHunterFlowMaxDragonHero5809) {
            this.FrostHunterKeyframeGammaGamma1197 = this.FrostHunterCameraXPixelTurboCosmos9814 + i;
        } else {
            if (!this.FrostHunterAlertDialogAuroraDelta3200) {
                FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterCameraXPixelTurboCosmos9814();
                return null;
            }
            this.FrostHunterAlertDialogAuroraDelta3200 = false;
        }
        return Integer.valueOf(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
