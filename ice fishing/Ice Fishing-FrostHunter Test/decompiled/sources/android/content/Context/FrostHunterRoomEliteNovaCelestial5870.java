package android.content.Context;

import java.util.HashMap;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterRoomEliteNovaCelestial5870 {
    public final FrostHunterActivityInfoStrikeCelestial6878 FrostHunterAlphaAnimationNeoCosmos5761;
    public final HashMap FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterRoomEliteNovaCelestial5870(FrostHunterActivityInfoStrikeCelestial6878 frostHunterActivityInfoStrikeCelestial6878, HashMap hashMap) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterActivityInfoStrikeCelestial6878;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = hashMap;
    }

    public final long FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterAnimatorPixelNovaSolar6777 frostHunterAnimatorPixelNovaSolar6777, long j, int i) {
        long FrostHunterAlphaAnimationNeoCosmos5761 = j - this.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlphaAnimationNeoCosmos5761();
        FrostHunterLifecycleCameraControllerSpeedPrimeQuantum1318 frostHunterLifecycleCameraControllerSpeedPrimeQuantum1318 = (FrostHunterLifecycleCameraControllerSpeedPrimeQuantum1318) this.FrostHunterConstraintSetCloneMasterUltraRogue2633.get(frostHunterAnimatorPixelNovaSolar6777);
        long j2 = frostHunterLifecycleCameraControllerSpeedPrimeQuantum1318.FrostHunterAlphaAnimationNeoCosmos5761;
        return Math.min(Math.max((long) (Math.pow(3.0d, i - 1) * j2 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j2 > 1 ? j2 : 2L) * r12))), FrostHunterAlphaAnimationNeoCosmos5761), frostHunterLifecycleCameraControllerSpeedPrimeQuantum1318.FrostHunterConstraintSetCloneMasterUltraRogue2633);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FrostHunterRoomEliteNovaCelestial5870)) {
            return false;
        }
        FrostHunterRoomEliteNovaCelestial5870 frostHunterRoomEliteNovaCelestial5870 = (FrostHunterRoomEliteNovaCelestial5870) obj;
        return this.FrostHunterAlphaAnimationNeoCosmos5761.equals(frostHunterRoomEliteNovaCelestial5870.FrostHunterAlphaAnimationNeoCosmos5761) && this.FrostHunterConstraintSetCloneMasterUltraRogue2633.equals(frostHunterRoomEliteNovaCelestial5870.FrostHunterConstraintSetCloneMasterUltraRogue2633);
    }

    public final int hashCode() {
        return this.FrostHunterConstraintSetCloneMasterUltraRogue2633.hashCode() ^ ((this.FrostHunterAlphaAnimationNeoCosmos5761.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.FrostHunterAlphaAnimationNeoCosmos5761 + ", values=" + this.FrostHunterConstraintSetCloneMasterUltraRogue2633 + "}";
    }
}
