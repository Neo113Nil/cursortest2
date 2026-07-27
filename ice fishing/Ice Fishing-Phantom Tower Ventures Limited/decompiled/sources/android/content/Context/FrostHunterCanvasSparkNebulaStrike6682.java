package android.content.Context;

import java.util.Iterator;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterCanvasSparkNebulaStrike6682 implements Iterator, FrostHunterContextBlazePrimeMax4967 {
    public int FrostHunterAlertDialogAuroraDelta3200;
    public final String FrostHunterCameraXPixelTurboCosmos9814;
    public int FrostHunterFlowMaxDragonHero5809;
    public int FrostHunterFragmentBetaMegaVortex6025;
    public int FrostHunterKeyframeGammaGamma1197;

    public FrostHunterCanvasSparkNebulaStrike6682(String str) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.FrostHunterFlowMaxDragonHero5809;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.FrostHunterFragmentBetaMegaVortex6025 < 0) {
            this.FrostHunterFlowMaxDragonHero5809 = 2;
            return false;
        }
        String str = this.FrostHunterCameraXPixelTurboCosmos9814;
        int length = str.length();
        int length2 = str.length();
        for (int i4 = this.FrostHunterAlertDialogAuroraDelta3200; i4 < length2; i4++) {
            char charAt = str.charAt(i4);
            if (charAt == '\n' || charAt == '\r') {
                i = (charAt == '\r' && (i2 = i4 + 1) < str.length() && str.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.FrostHunterFlowMaxDragonHero5809 = 1;
                this.FrostHunterFragmentBetaMegaVortex6025 = i;
                this.FrostHunterKeyframeGammaGamma1197 = length;
                return true;
            }
        }
        i = -1;
        this.FrostHunterFlowMaxDragonHero5809 = 1;
        this.FrostHunterFragmentBetaMegaVortex6025 = i;
        this.FrostHunterKeyframeGammaGamma1197 = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterCameraXPixelTurboCosmos9814();
            return null;
        }
        this.FrostHunterFlowMaxDragonHero5809 = 0;
        int i = this.FrostHunterKeyframeGammaGamma1197;
        int i2 = this.FrostHunterAlertDialogAuroraDelta3200;
        this.FrostHunterAlertDialogAuroraDelta3200 = this.FrostHunterFragmentBetaMegaVortex6025 + i;
        return this.FrostHunterCameraXPixelTurboCosmos9814.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
