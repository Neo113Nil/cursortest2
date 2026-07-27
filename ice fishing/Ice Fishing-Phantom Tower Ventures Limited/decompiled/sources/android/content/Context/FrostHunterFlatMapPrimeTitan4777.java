package android.content.Context;

import java.util.Iterator;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public class FrostHunterFlatMapPrimeTitan4777 implements Iterable, FrostHunterContextBlazePrimeMax4967 {
    public final int FrostHunterAlertDialogAuroraDelta3200;
    public final int FrostHunterCameraXPixelTurboCosmos9814;
    public final int FrostHunterFlowMaxDragonHero5809;

    public FrostHunterFlatMapPrimeTitan4777(int i, int i2, int i3) {
        if (i3 == 0) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("Step must be non-zero.");
            throw null;
        }
        if (i3 == Integer.MIN_VALUE) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = FrostHunterVectorDrawableForceMax1351.FrostHunterCameraXTurboCelestialHero5430(i, i2, i3);
        this.FrostHunterAlertDialogAuroraDelta3200 = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FrostHunterFlatMapPrimeTitan4777)) {
            return false;
        }
        if (isEmpty() && ((FrostHunterFlatMapPrimeTitan4777) obj).isEmpty()) {
            return true;
        }
        FrostHunterFlatMapPrimeTitan4777 frostHunterFlatMapPrimeTitan4777 = (FrostHunterFlatMapPrimeTitan4777) obj;
        return this.FrostHunterCameraXPixelTurboCosmos9814 == frostHunterFlatMapPrimeTitan4777.FrostHunterCameraXPixelTurboCosmos9814 && this.FrostHunterFlowMaxDragonHero5809 == frostHunterFlatMapPrimeTitan4777.FrostHunterFlowMaxDragonHero5809 && this.FrostHunterAlertDialogAuroraDelta3200 == frostHunterFlatMapPrimeTitan4777.FrostHunterAlertDialogAuroraDelta3200;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.FrostHunterCameraXPixelTurboCosmos9814 * 31) + this.FrostHunterFlowMaxDragonHero5809) * 31) + this.FrostHunterAlertDialogAuroraDelta3200;
    }

    public boolean isEmpty() {
        int i = this.FrostHunterFlowMaxDragonHero5809;
        int i2 = this.FrostHunterAlertDialogAuroraDelta3200;
        int i3 = this.FrostHunterCameraXPixelTurboCosmos9814;
        return i2 > 0 ? i3 > i : i3 < i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new FrostHunterGestureDetectorForceEpicStorm8563(this.FrostHunterCameraXPixelTurboCosmos9814, this.FrostHunterFlowMaxDragonHero5809, this.FrostHunterAlertDialogAuroraDelta3200);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.FrostHunterFlowMaxDragonHero5809;
        int i2 = this.FrostHunterAlertDialogAuroraDelta3200;
        int i3 = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (i2 > 0) {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i2);
        } else {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i2);
        }
        return sb.toString();
    }
}
