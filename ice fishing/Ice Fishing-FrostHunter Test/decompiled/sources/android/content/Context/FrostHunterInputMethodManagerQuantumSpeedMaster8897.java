package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterInputMethodManagerQuantumSpeedMaster8897 {
    public final boolean FrostHunterAlphaAnimationNeoCosmos5761;
    public final boolean FrostHunterBundlePulseFusionHero2475;
    public final boolean FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterInputMethodManagerQuantumSpeedMaster8897(boolean z, boolean z2, boolean z3) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = z;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = z2;
        this.FrostHunterBundlePulseFusionHero2475 = z3;
    }

    public static FrostHunterInputMethodManagerQuantumSpeedMaster8897 FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterInputMethodManagerQuantumSpeedMaster8897 frostHunterInputMethodManagerQuantumSpeedMaster8897, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            z = frostHunterInputMethodManagerQuantumSpeedMaster8897.FrostHunterAlphaAnimationNeoCosmos5761;
        }
        if ((i & 2) != 0) {
            z2 = frostHunterInputMethodManagerQuantumSpeedMaster8897.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        }
        if ((i & 4) != 0) {
            z3 = frostHunterInputMethodManagerQuantumSpeedMaster8897.FrostHunterBundlePulseFusionHero2475;
        }
        return new FrostHunterInputMethodManagerQuantumSpeedMaster8897(z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrostHunterInputMethodManagerQuantumSpeedMaster8897)) {
            return false;
        }
        FrostHunterInputMethodManagerQuantumSpeedMaster8897 frostHunterInputMethodManagerQuantumSpeedMaster8897 = (FrostHunterInputMethodManagerQuantumSpeedMaster8897) obj;
        return this.FrostHunterAlphaAnimationNeoCosmos5761 == frostHunterInputMethodManagerQuantumSpeedMaster8897.FrostHunterAlphaAnimationNeoCosmos5761 && this.FrostHunterConstraintSetCloneMasterUltraRogue2633 == frostHunterInputMethodManagerQuantumSpeedMaster8897.FrostHunterConstraintSetCloneMasterUltraRogue2633 && this.FrostHunterBundlePulseFusionHero2475 == frostHunterInputMethodManagerQuantumSpeedMaster8897.FrostHunterBundlePulseFusionHero2475;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.FrostHunterBundlePulseFusionHero2475) + FrostHunterImageCaptureShadowGammaMax6416.FrostHunterAlphaAnimationNeoCosmos5761(Boolean.hashCode(this.FrostHunterAlphaAnimationNeoCosmos5761) * 31, 31, this.FrostHunterConstraintSetCloneMasterUltraRogue2633);
    }

    public final String toString() {
        return "GameSettings(musicEnabled=" + this.FrostHunterAlphaAnimationNeoCosmos5761 + ", soundEnabled=" + this.FrostHunterConstraintSetCloneMasterUltraRogue2633 + ", vibrationEnabled=" + this.FrostHunterBundlePulseFusionHero2475 + ")";
    }
}
