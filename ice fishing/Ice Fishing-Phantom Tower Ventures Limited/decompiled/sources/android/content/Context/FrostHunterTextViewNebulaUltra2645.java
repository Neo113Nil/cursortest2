package android.content.Context;

import java.util.Map;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterTextViewNebulaUltra2645 implements Map.Entry, Comparable {
    public final /* synthetic */ FrostHunterLifecycleCameraControllerGammaFusionShadow8317 FrostHunterAlertDialogAuroraDelta3200;
    public final Comparable FrostHunterCameraXPixelTurboCosmos9814;
    public Object FrostHunterFlowMaxDragonHero5809;

    public FrostHunterTextViewNebulaUltra2645(FrostHunterLifecycleCameraControllerGammaFusionShadow8317 frostHunterLifecycleCameraControllerGammaFusionShadow8317, Comparable comparable, Object obj) {
        this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterLifecycleCameraControllerGammaFusionShadow8317;
        this.FrostHunterCameraXPixelTurboCosmos9814 = comparable;
        this.FrostHunterFlowMaxDragonHero5809 = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.FrostHunterCameraXPixelTurboCosmos9814.compareTo(((FrostHunterTextViewNebulaUltra2645) obj).FrostHunterCameraXPixelTurboCosmos9814);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.FrostHunterCameraXPixelTurboCosmos9814;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.FrostHunterFlowMaxDragonHero5809;
                    Object value = entry.getValue();
                    if (obj2 == null ? value == null : obj2.equals(value)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.FrostHunterCameraXPixelTurboCosmos9814;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.FrostHunterFlowMaxDragonHero5809;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.FrostHunterCameraXPixelTurboCosmos9814;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.FrostHunterFlowMaxDragonHero5809;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.FrostHunterAlertDialogAuroraDelta3200.FrostHunterConstraintSetCloneMasterUltraRogue2633();
        Object obj2 = this.FrostHunterFlowMaxDragonHero5809;
        this.FrostHunterFlowMaxDragonHero5809 = obj;
        return obj2;
    }

    public final String toString() {
        return this.FrostHunterCameraXPixelTurboCosmos9814 + "=" + this.FrostHunterFlowMaxDragonHero5809;
    }
}
