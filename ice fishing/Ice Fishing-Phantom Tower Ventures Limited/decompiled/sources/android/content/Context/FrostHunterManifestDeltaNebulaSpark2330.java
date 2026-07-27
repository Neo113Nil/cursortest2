package android.content.Context;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterManifestDeltaNebulaSpark2330 implements Map.Entry, FrostHunterContextBlazePrimeMax4967 {
    public final int FrostHunterAlertDialogAuroraDelta3200;
    public final FrostHunterViewTurboHyperion7821 FrostHunterCameraXPixelTurboCosmos9814;
    public final int FrostHunterFlowMaxDragonHero5809;

    public FrostHunterManifestDeltaNebulaSpark2330(FrostHunterViewTurboHyperion7821 frostHunterViewTurboHyperion7821, int i) {
        frostHunterViewTurboHyperion7821.getClass();
        this.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterViewTurboHyperion7821;
        this.FrostHunterFlowMaxDragonHero5809 = i;
        this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterViewTurboHyperion7821.FrostHunterScaleAnimationStrikeSpark5059;
    }

    public final void FrostHunterAlphaAnimationNeoCosmos5761() {
        if (this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterScaleAnimationStrikeSpark5059 != this.FrostHunterAlertDialogAuroraDelta3200) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(entry.getKey(), getKey()) && FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        FrostHunterAlphaAnimationNeoCosmos5761();
        return this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterCameraXPixelTurboCosmos9814[this.FrostHunterFlowMaxDragonHero5809];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        FrostHunterAlphaAnimationNeoCosmos5761();
        Object[] objArr = this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterFlowMaxDragonHero5809;
        objArr.getClass();
        return objArr[this.FrostHunterFlowMaxDragonHero5809];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int hashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return hashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        FrostHunterAlphaAnimationNeoCosmos5761();
        FrostHunterViewTurboHyperion7821 frostHunterViewTurboHyperion7821 = this.FrostHunterCameraXPixelTurboCosmos9814;
        frostHunterViewTurboHyperion7821.FrostHunterConstraintSetCloneMasterUltraRogue2633();
        Object[] objArr = frostHunterViewTurboHyperion7821.FrostHunterFlowMaxDragonHero5809;
        if (objArr == null) {
            int length = frostHunterViewTurboHyperion7821.FrostHunterCameraXPixelTurboCosmos9814.length;
            if (length < 0) {
                FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            frostHunterViewTurboHyperion7821.FrostHunterFlowMaxDragonHero5809 = objArr;
        }
        int i = this.FrostHunterFlowMaxDragonHero5809;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
