package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterCameraViewMaxEliteDelta5870 {
    public final FrostHunterStateNeoCyberShadow9514 FrostHunterAlphaAnimationNeoCosmos5761;
    public final Object[] FrostHunterBundlePulseFusionHero2475;
    public final String FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final int FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterCameraViewMaxEliteDelta5870(FrostHunterSharedFlowTitaniumHeroAurora7367 frostHunterSharedFlowTitaniumHeroAurora7367, String str, Object[] objArr) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterSharedFlowTitaniumHeroAurora7367;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = str;
        this.FrostHunterBundlePulseFusionHero2475 = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.FrostHunterServiceEliteCelestialThunder1757 = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 < 55296) {
                this.FrostHunterServiceEliteCelestialThunder1757 = i | (charAt2 << i2);
                return;
            } else {
                i |= (charAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    public final int FrostHunterAlphaAnimationNeoCosmos5761() {
        int i = this.FrostHunterServiceEliteCelestialThunder1757;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}
