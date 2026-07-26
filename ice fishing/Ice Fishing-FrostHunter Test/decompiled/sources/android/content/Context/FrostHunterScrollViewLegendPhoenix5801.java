package android.content.Context;

import java.util.Iterator;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterScrollViewLegendPhoenix5801 implements Iterator {
    public final /* synthetic */ FrostHunterManifestEclipseGammaTitanium1788 FrostHunterAlertDialogAuroraDelta3200;
    public int FrostHunterCameraXPixelTurboCosmos9814 = 0;
    public final int FrostHunterFlowMaxDragonHero5809;

    public FrostHunterScrollViewLegendPhoenix5801(FrostHunterManifestEclipseGammaTitanium1788 frostHunterManifestEclipseGammaTitanium1788) {
        this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterManifestEclipseGammaTitanium1788;
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterManifestEclipseGammaTitanium1788.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.FrostHunterCameraXPixelTurboCosmos9814 < this.FrostHunterFlowMaxDragonHero5809;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (i < this.FrostHunterFlowMaxDragonHero5809) {
            this.FrostHunterCameraXPixelTurboCosmos9814 = i + 1;
            return Byte.valueOf(this.FrostHunterAlertDialogAuroraDelta3200.FrostHunterRemoteConfigSpeedSpeed8566(i));
        }
        FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterCameraXPixelTurboCosmos9814();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
