package android.content.Context;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterMotionEventBetaSpark6296 {
    public final FrostHunterFaceDetectionCosmosDelta7141 FrostHunterAlphaAnimationNeoCosmos5761;
    public final List FrostHunterBundlePulseFusionHero2475;
    public final FrostHunterModelInputOutputInfernoBlaze5651 FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final FrostHunterSharedFlowTitaniumBeta1713 FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterMotionEventBetaSpark6296(FrostHunterFaceDetectionCosmosDelta7141 frostHunterFaceDetectionCosmosDelta7141, FrostHunterModelInputOutputInfernoBlaze5651 frostHunterModelInputOutputInfernoBlaze5651, List list, FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix7595) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterFaceDetectionCosmosDelta7141;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterModelInputOutputInfernoBlaze5651;
        this.FrostHunterBundlePulseFusionHero2475 = list;
        this.FrostHunterServiceEliteCelestialThunder1757 = new FrostHunterSharedFlowTitaniumBeta1713(new FrostHunterAnimatorAlphaVortexInferno7431(7, frostHunterNotificationGammaBlazePhoenix7595));
    }

    public final List FrostHunterAlphaAnimationNeoCosmos5761() {
        return (List) this.FrostHunterServiceEliteCelestialThunder1757.getValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FrostHunterMotionEventBetaSpark6296)) {
            return false;
        }
        FrostHunterMotionEventBetaSpark6296 frostHunterMotionEventBetaSpark6296 = (FrostHunterMotionEventBetaSpark6296) obj;
        return frostHunterMotionEventBetaSpark6296.FrostHunterAlphaAnimationNeoCosmos5761 == this.FrostHunterAlphaAnimationNeoCosmos5761 && frostHunterMotionEventBetaSpark6296.FrostHunterConstraintSetCloneMasterUltraRogue2633 == this.FrostHunterConstraintSetCloneMasterUltraRogue2633 && FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterMotionEventBetaSpark6296.FrostHunterAlphaAnimationNeoCosmos5761(), FrostHunterAlphaAnimationNeoCosmos5761()) && frostHunterMotionEventBetaSpark6296.FrostHunterBundlePulseFusionHero2475.equals(this.FrostHunterBundlePulseFusionHero2475);
    }

    public final int hashCode() {
        return this.FrostHunterBundlePulseFusionHero2475.hashCode() + ((FrostHunterAlphaAnimationNeoCosmos5761().hashCode() + ((this.FrostHunterConstraintSetCloneMasterUltraRogue2633.hashCode() + ((this.FrostHunterAlphaAnimationNeoCosmos5761.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterAlphaAnimationNeoCosmos5761();
        ArrayList arrayList = new ArrayList(FrostHunterGroupRogueDeltaMega4192.FrostHunterNestedScrollViewPixelPhantom8605(FrostHunterAlphaAnimationNeoCosmos5761));
        for (Certificate certificate : FrostHunterAlphaAnimationNeoCosmos5761) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                type2.getClass();
            }
            arrayList.add(type2);
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.FrostHunterAlphaAnimationNeoCosmos5761);
        sb.append(" cipherSuite=");
        sb.append(this.FrostHunterConstraintSetCloneMasterUltraRogue2633);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.FrostHunterBundlePulseFusionHero2475;
        ArrayList arrayList2 = new ArrayList(FrostHunterGroupRogueDeltaMega4192.FrostHunterNestedScrollViewPixelPhantom8605(list));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                type.getClass();
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
