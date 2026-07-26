package android.content.Context;

import java.util.Arrays;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterLayoutInflaterEpicForceAurora7762 {
    public long[] FrostHunterAlphaAnimationNeoCosmos5761;
    public int FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterLayoutInflaterEpicForceAurora7762(int i) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = i == 0 ? FrostHunterLocationListenerNebulaBeta4448.FrostHunterAlphaAnimationNeoCosmos5761 : new long[i];
    }

    public final void FrostHunterAlphaAnimationNeoCosmos5761(long j) {
        int i = this.FrostHunterConstraintSetCloneMasterUltraRogue2633 + 1;
        long[] jArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
        if (jArr.length < i) {
            this.FrostHunterAlphaAnimationNeoCosmos5761 = Arrays.copyOf(jArr, Math.max(i, (jArr.length * 3) / 2));
        }
        long[] jArr2 = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int i2 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        jArr2[i2] = j;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i2 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FrostHunterLayoutInflaterEpicForceAurora7762) {
            FrostHunterLayoutInflaterEpicForceAurora7762 frostHunterLayoutInflaterEpicForceAurora7762 = (FrostHunterLayoutInflaterEpicForceAurora7762) obj;
            int i = frostHunterLayoutInflaterEpicForceAurora7762.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            int i2 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            if (i == i2) {
                long[] jArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
                long[] jArr2 = frostHunterLayoutInflaterEpicForceAurora7762.FrostHunterAlphaAnimationNeoCosmos5761;
                FrostHunterFirebaseModelInterpreterOlympianStorm9227 FrostHunterRunnableCosmosCelestial4235 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterRunnableCosmosCelestial4235(0, i2);
                int i3 = FrostHunterRunnableCosmosCelestial4235.FrostHunterCameraXPixelTurboCosmos9814;
                int i4 = FrostHunterRunnableCosmosCelestial4235.FrostHunterFlowMaxDragonHero5809;
                if (i3 > i4) {
                    return true;
                }
                while (jArr[i3] == jArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        long[] jArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int i = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += Long.hashCode(jArr[i3]) * 31;
        }
        return i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        long[] jArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int i = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            long j = jArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(j);
            i2++;
        }
        return sb.toString();
    }
}
