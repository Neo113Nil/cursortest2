package android.content.Context;

import java.math.RoundingMode;
import java.util.Arrays;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterPreviewInfernoNeoDragon1742 {
    public final String FrostHunterAlphaAnimationNeoCosmos5761;
    public final int FrostHunterBundlePulseFusionHero2475;
    public final boolean FrostHunterCameraXPixelTurboCosmos9814;
    public final char[] FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final int FrostHunterLevelListDrawableFusionDragonHero2232;
    public final int FrostHunterLifecycleBlazeGammaElite2889;
    public final byte[] FrostHunterRemoteConfigSpeedSpeed8566;
    public final int FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterPreviewInfernoNeoDragon1742(String str, char[] cArr, byte[] bArr, boolean z) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = str;
        cArr.getClass();
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            int FrostHunterPagingSourceEclipseDelta8255 = FrostHunterCanvasInfernoVortex4700.FrostHunterPagingSourceEclipseDelta8255(length);
            this.FrostHunterServiceEliteCelestialThunder1757 = FrostHunterPagingSourceEclipseDelta8255;
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(FrostHunterPagingSourceEclipseDelta8255);
            int i = 1 << (3 - numberOfTrailingZeros);
            this.FrostHunterLifecycleBlazeGammaElite2889 = i;
            this.FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterPagingSourceEclipseDelta8255 >> numberOfTrailingZeros;
            this.FrostHunterBundlePulseFusionHero2475 = cArr.length - 1;
            this.FrostHunterRemoteConfigSpeedSpeed8566 = bArr;
            boolean[] zArr = new boolean[i];
            for (int i2 = 0; i2 < this.FrostHunterLevelListDrawableFusionDragonHero2232; i2++) {
                int i3 = this.FrostHunterServiceEliteCelestialThunder1757;
                RoundingMode roundingMode2 = RoundingMode.CEILING;
                zArr[FrostHunterCanvasInfernoVortex4700.FrostHunterMagnetometerFusionTitanium8202(i2 * 8, i3)] = true;
            }
            this.FrostHunterCameraXPixelTurboCosmos9814 = z;
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FrostHunterPreviewInfernoNeoDragon1742)) {
            return false;
        }
        FrostHunterPreviewInfernoNeoDragon1742 frostHunterPreviewInfernoNeoDragon1742 = (FrostHunterPreviewInfernoNeoDragon1742) obj;
        return this.FrostHunterCameraXPixelTurboCosmos9814 == frostHunterPreviewInfernoNeoDragon1742.FrostHunterCameraXPixelTurboCosmos9814 && Arrays.equals(this.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterPreviewInfernoNeoDragon1742.FrostHunterConstraintSetCloneMasterUltraRogue2633);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.FrostHunterConstraintSetCloneMasterUltraRogue2633) + (this.FrostHunterCameraXPixelTurboCosmos9814 ? 1231 : 1237);
    }

    public final String toString() {
        return this.FrostHunterAlphaAnimationNeoCosmos5761;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FrostHunterPreviewInfernoNeoDragon1742(String str, char[] cArr) {
        this(str, cArr, r1, false);
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i];
            if (c < 128) {
                if (bArr[c] == -1) {
                    bArr[c] = (byte) i;
                } else {
                    FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809(FrostHunterLiveDataScopeOmegaBeta9836.FrostHunterRemoteConfigSpeedSpeed8566("Duplicate character: %s", Character.valueOf(c)));
                    throw null;
                }
            } else {
                FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809(FrostHunterLiveDataScopeOmegaBeta9836.FrostHunterRemoteConfigSpeedSpeed8566("Non-ASCII character: %s", Character.valueOf(c)));
                throw null;
            }
        }
    }
}
