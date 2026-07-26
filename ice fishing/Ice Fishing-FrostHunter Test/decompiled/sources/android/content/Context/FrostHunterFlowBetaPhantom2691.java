package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterFlowBetaPhantom2691 {
    public final int FrostHunterAlphaAnimationNeoCosmos5761;
    public final long FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterFlowBetaPhantom2691(int i, long j) {
        if (i == 0) {
            FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterCameraXPixelTurboCosmos9814("Null status");
            throw null;
        }
        this.FrostHunterAlphaAnimationNeoCosmos5761 = i;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FrostHunterFlowBetaPhantom2691)) {
            return false;
        }
        FrostHunterFlowBetaPhantom2691 frostHunterFlowBetaPhantom2691 = (FrostHunterFlowBetaPhantom2691) obj;
        return FrostHunterKeyEventNovaXAlpha1220.FrostHunterAlphaAnimationNeoCosmos5761(this.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterFlowBetaPhantom2691.FrostHunterAlphaAnimationNeoCosmos5761) && this.FrostHunterConstraintSetCloneMasterUltraRogue2633 == frostHunterFlowBetaPhantom2691.FrostHunterConstraintSetCloneMasterUltraRogue2633;
    }

    public final int hashCode() {
        int FrostHunterLooperHyperionForce4133 = (FrostHunterKeyEventNovaXAlpha1220.FrostHunterLooperHyperionForce4133(this.FrostHunterAlphaAnimationNeoCosmos5761) ^ 1000003) * 1000003;
        long j = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        return ((int) ((j >>> 32) ^ j)) ^ FrostHunterLooperHyperionForce4133;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i = this.FrostHunterAlphaAnimationNeoCosmos5761;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVALID_PAYLOAD" : "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK");
        sb.append(", nextRequestWaitMillis=");
        sb.append(this.FrostHunterConstraintSetCloneMasterUltraRogue2633);
        sb.append("}");
        return sb.toString();
    }
}
