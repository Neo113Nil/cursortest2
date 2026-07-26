package android.content.Context;

import java.util.ArrayList;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterScrollViewNebulaForcePhoenix7823 implements FrostHunterWithContextVisionPixelCosmos6861 {
    public final ArrayList FrostHunterAlphaAnimationNeoCosmos5761;

    public FrostHunterScrollViewNebulaForcePhoenix7823(ArrayList arrayList) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j = ((FrostHunterJobSchedulerSparkPixelNova3660) arrayList.get(0)).FrostHunterConstraintSetCloneMasterUltraRogue2633;
            int i = 1;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                }
                if (((FrostHunterJobSchedulerSparkPixelNova3660) arrayList.get(i)).FrostHunterAlphaAnimationNeoCosmos5761 < j) {
                    z = true;
                    break;
                } else {
                    j = ((FrostHunterJobSchedulerSparkPixelNova3660) arrayList.get(i)).FrostHunterConstraintSetCloneMasterUltraRogue2633;
                    i++;
                }
            }
        }
        FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(!z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FrostHunterScrollViewNebulaForcePhoenix7823.class != obj.getClass()) {
            return false;
        }
        return this.FrostHunterAlphaAnimationNeoCosmos5761.equals(((FrostHunterScrollViewNebulaForcePhoenix7823) obj).FrostHunterAlphaAnimationNeoCosmos5761);
    }

    public final int hashCode() {
        return this.FrostHunterAlphaAnimationNeoCosmos5761.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.FrostHunterAlphaAnimationNeoCosmos5761;
    }
}
