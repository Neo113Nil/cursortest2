package android.content.Context;

import java.io.Serializable;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterPreviewStormLegendSpark8860 implements Serializable {
    public static final FrostHunterPreviewStormLegendSpark8860 FrostHunterAlertDialogAuroraDelta3200 = new FrostHunterPreviewStormLegendSpark8860(new int[0]);
    public final int[] FrostHunterCameraXPixelTurboCosmos9814;
    public final int FrostHunterFlowMaxDragonHero5809;

    public FrostHunterPreviewStormLegendSpark8860(int[] iArr) {
        int length = iArr.length;
        this.FrostHunterCameraXPixelTurboCosmos9814 = iArr;
        this.FrostHunterFlowMaxDragonHero5809 = length;
    }

    public final boolean equals(Object obj) {
        FrostHunterPreviewStormLegendSpark8860 frostHunterPreviewStormLegendSpark8860;
        int i;
        int i2;
        if (obj == this) {
            return true;
        }
        if ((obj instanceof FrostHunterPreviewStormLegendSpark8860) && (i2 = this.FrostHunterFlowMaxDragonHero5809) == (i = (frostHunterPreviewStormLegendSpark8860 = (FrostHunterPreviewStormLegendSpark8860) obj).FrostHunterFlowMaxDragonHero5809)) {
            for (int i3 = 0; i3 < i2; i3++) {
                FrostHunterCanvasInfernoVortex4700.FrostHunterDialogFragmentTurboPhoenixDragon7627(i3, i2);
                int i4 = this.FrostHunterCameraXPixelTurboCosmos9814[i3];
                FrostHunterCanvasInfernoVortex4700.FrostHunterDialogFragmentTurboPhoenixDragon7627(i3, i);
                if (i4 == frostHunterPreviewStormLegendSpark8860.FrostHunterCameraXPixelTurboCosmos9814[i3]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.FrostHunterFlowMaxDragonHero5809; i2++) {
            i = (i * 31) + this.FrostHunterCameraXPixelTurboCosmos9814[i2];
        }
        return i;
    }

    public final String toString() {
        int i = this.FrostHunterFlowMaxDragonHero5809;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        int[] iArr = this.FrostHunterCameraXPixelTurboCosmos9814;
        sb.append(iArr[0]);
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(", ");
            sb.append(iArr[i2]);
        }
        sb.append(']');
        return sb.toString();
    }
}
