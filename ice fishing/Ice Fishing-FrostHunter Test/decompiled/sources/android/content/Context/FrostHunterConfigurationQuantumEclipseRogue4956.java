package android.content.Context;

import java.util.Objects;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterConfigurationQuantumEclipseRogue4956 extends FrostHunterExecutorBetaPhoenix5827 {
    public final String FrostHunterBundlePulseFusionHero2475;
    public final String FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final String FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterConfigurationQuantumEclipseRogue4956(String str, String str2, String str3) {
        super("COMM");
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = str;
        this.FrostHunterBundlePulseFusionHero2475 = str2;
        this.FrostHunterServiceEliteCelestialThunder1757 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FrostHunterConfigurationQuantumEclipseRogue4956.class != obj.getClass()) {
            return false;
        }
        FrostHunterConfigurationQuantumEclipseRogue4956 frostHunterConfigurationQuantumEclipseRogue4956 = (FrostHunterConfigurationQuantumEclipseRogue4956) obj;
        return this.FrostHunterBundlePulseFusionHero2475.equals(frostHunterConfigurationQuantumEclipseRogue4956.FrostHunterBundlePulseFusionHero2475) && this.FrostHunterConstraintSetCloneMasterUltraRogue2633.equals(frostHunterConfigurationQuantumEclipseRogue4956.FrostHunterConstraintSetCloneMasterUltraRogue2633) && Objects.equals(this.FrostHunterServiceEliteCelestialThunder1757, frostHunterConfigurationQuantumEclipseRogue4956.FrostHunterServiceEliteCelestialThunder1757);
    }

    public final int hashCode() {
        int FrostHunterLifecycleBlazeGammaElite2889 = FrostHunterKeyEventNovaXAlpha1220.FrostHunterLifecycleBlazeGammaElite2889(this.FrostHunterBundlePulseFusionHero2475, FrostHunterKeyEventNovaXAlpha1220.FrostHunterLifecycleBlazeGammaElite2889(this.FrostHunterConstraintSetCloneMasterUltraRogue2633, 527, 31), 31);
        String str = this.FrostHunterServiceEliteCelestialThunder1757;
        return FrostHunterLifecycleBlazeGammaElite2889 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.content.Context.FrostHunterExecutorBetaPhoenix5827
    public final String toString() {
        return this.FrostHunterAlphaAnimationNeoCosmos5761 + ": language=" + this.FrostHunterConstraintSetCloneMasterUltraRogue2633 + ", description=" + this.FrostHunterBundlePulseFusionHero2475 + ", text=" + this.FrostHunterServiceEliteCelestialThunder1757;
    }
}
