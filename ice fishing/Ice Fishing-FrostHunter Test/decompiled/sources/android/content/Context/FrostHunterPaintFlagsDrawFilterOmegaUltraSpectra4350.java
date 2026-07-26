package android.content.Context;

import android.util.Base64;
import java.util.Arrays;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350 {
    public final String FrostHunterAlphaAnimationNeoCosmos5761;
    public final FrostHunterAnimatorPixelNovaSolar6777 FrostHunterBundlePulseFusionHero2475;
    public final byte[] FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350(String str, byte[] bArr, FrostHunterAnimatorPixelNovaSolar6777 frostHunterAnimatorPixelNovaSolar6777) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = str;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = bArr;
        this.FrostHunterBundlePulseFusionHero2475 = frostHunterAnimatorPixelNovaSolar6777;
    }

    public static FrostHunterTraceHyperionAuroraNebula9947 FrostHunterAlphaAnimationNeoCosmos5761() {
        FrostHunterTraceHyperionAuroraNebula9947 frostHunterTraceHyperionAuroraNebula9947 = new FrostHunterTraceHyperionAuroraNebula9947(5, false);
        frostHunterTraceHyperionAuroraNebula9947.FrostHunterKeyframeGammaGamma1197 = FrostHunterAnimatorPixelNovaSolar6777.FrostHunterCameraXPixelTurboCosmos9814;
        return frostHunterTraceHyperionAuroraNebula9947;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FrostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350) {
            FrostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350 frostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350 = (FrostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350) obj;
            if (this.FrostHunterAlphaAnimationNeoCosmos5761.equals(frostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350.FrostHunterAlphaAnimationNeoCosmos5761) && Arrays.equals(this.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350.FrostHunterConstraintSetCloneMasterUltraRogue2633) && this.FrostHunterBundlePulseFusionHero2475.equals(frostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350.FrostHunterBundlePulseFusionHero2475)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.FrostHunterBundlePulseFusionHero2475.hashCode() ^ ((((this.FrostHunterAlphaAnimationNeoCosmos5761.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.FrostHunterConstraintSetCloneMasterUltraRogue2633)) * 1000003);
    }

    public final String toString() {
        byte[] bArr = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        String encodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(this.FrostHunterAlphaAnimationNeoCosmos5761);
        sb.append(", ");
        sb.append(this.FrostHunterBundlePulseFusionHero2475);
        sb.append(", ");
        return FrostHunterKeyEventNovaXAlpha1220.FrostHunterFragmentBetaMegaVortex6025(sb, encodeToString, ")");
    }
}
