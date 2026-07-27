package android.content.Context;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterLooperThreadTitanGamma7336 {
    public final FrostHunterDialogFragmentMasterSpectra2557 FrostHunterAlphaAnimationNeoCosmos5761;
    public final InetSocketAddress FrostHunterBundlePulseFusionHero2475;
    public final Proxy FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterLooperThreadTitanGamma7336(FrostHunterDialogFragmentMasterSpectra2557 frostHunterDialogFragmentMasterSpectra2557, Proxy proxy, InetSocketAddress inetSocketAddress) {
        inetSocketAddress.getClass();
        this.FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterDialogFragmentMasterSpectra2557;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = proxy;
        this.FrostHunterBundlePulseFusionHero2475 = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FrostHunterLooperThreadTitanGamma7336)) {
            return false;
        }
        FrostHunterLooperThreadTitanGamma7336 frostHunterLooperThreadTitanGamma7336 = (FrostHunterLooperThreadTitanGamma7336) obj;
        return frostHunterLooperThreadTitanGamma7336.FrostHunterAlphaAnimationNeoCosmos5761.equals(this.FrostHunterAlphaAnimationNeoCosmos5761) && frostHunterLooperThreadTitanGamma7336.FrostHunterConstraintSetCloneMasterUltraRogue2633.equals(this.FrostHunterConstraintSetCloneMasterUltraRogue2633) && FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterLooperThreadTitanGamma7336.FrostHunterBundlePulseFusionHero2475, this.FrostHunterBundlePulseFusionHero2475);
    }

    public final int hashCode() {
        return this.FrostHunterBundlePulseFusionHero2475.hashCode() + ((this.FrostHunterConstraintSetCloneMasterUltraRogue2633.hashCode() + ((this.FrostHunterAlphaAnimationNeoCosmos5761.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        String hostAddress;
        StringBuilder sb = new StringBuilder();
        FrostHunterAdMobSpeedMasterSpark5250 frostHunterAdMobSpeedMasterSpark5250 = this.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterCameraXPixelTurboCosmos9814;
        String str = frostHunterAdMobSpeedMasterSpark5250.FrostHunterServiceEliteCelestialThunder1757;
        InetSocketAddress inetSocketAddress = this.FrostHunterBundlePulseFusionHero2475;
        InetAddress address = inetSocketAddress.getAddress();
        String FrostHunterConstraintSetCloneMasterUltraRogue2633 = (address == null || (hostAddress = address.getHostAddress()) == null) ? null : FrostHunterJobIntentServiceCelestialHero6012.FrostHunterConstraintSetCloneMasterUltraRogue2633(hostAddress);
        if (FrostHunterOnTouchListenerCelestialTitanNova9943.FrostHunterTextViewDragonStormMega4297(str, ':')) {
            sb.append("[");
            sb.append(str);
            sb.append("]");
        } else {
            sb.append(str);
        }
        if (frostHunterAdMobSpeedMasterSpark5250.FrostHunterLifecycleBlazeGammaElite2889 != inetSocketAddress.getPort() || str.equals(FrostHunterConstraintSetCloneMasterUltraRogue2633)) {
            sb.append(":");
            sb.append(frostHunterAdMobSpeedMasterSpark5250.FrostHunterLifecycleBlazeGammaElite2889);
        }
        if (!str.equals(FrostHunterConstraintSetCloneMasterUltraRogue2633)) {
            if (this.FrostHunterConstraintSetCloneMasterUltraRogue2633.equals(Proxy.NO_PROXY)) {
                sb.append(" at ");
            } else {
                sb.append(" via proxy ");
            }
            if (FrostHunterConstraintSetCloneMasterUltraRogue2633 == null) {
                sb.append("<unresolved>");
            } else if (FrostHunterOnTouchListenerCelestialTitanNova9943.FrostHunterTextViewDragonStormMega4297(FrostHunterConstraintSetCloneMasterUltraRogue2633, ':')) {
                sb.append("[");
                sb.append(FrostHunterConstraintSetCloneMasterUltraRogue2633);
                sb.append("]");
            } else {
                sb.append(FrostHunterConstraintSetCloneMasterUltraRogue2633);
            }
            sb.append(":");
            sb.append(inetSocketAddress.getPort());
        }
        return sb.toString();
    }
}
